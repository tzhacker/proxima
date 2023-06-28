package com.yrml.proxima.server.service;

import cn.hutool.json.JSONUtil;
import com.yrml.proxima.base.grpc.qrcode.QrCodeData;
import com.yrml.proxima.base.grpc.qrcode.QrCodeResponse;
import com.yrml.proxima.base.grpc.qrcode.QrCodeServiceGrpc;
import com.yrml.proxima.server.client.WebServiceClient;
import com.yrml.proxima.server.consts.CommonConst;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.Optional;

/**
 * QrCodeServiceGrpcImpl
 *
 * @author tzh42
 * @version 2023/05/20 19:26
 **/
@GrpcService
public class QrCodeServiceGrpcImpl extends QrCodeServiceGrpc.QrCodeServiceImplBase {

    @Override
    public void executeQrCode(QrCodeData request, StreamObserver<QrCodeResponse> responseObserver) {

        Object response = WebServiceClient.executeForward(request);

        QrCodeResponse qrCodeResponse = Optional.ofNullable(response)
                .map(Object::toString)
                .filter(JSONUtil::isTypeJSON)
                .map(json -> {
                    QrCodeResponse res = JSONUtil.toBean(json, QrCodeResponse.class);
                    return QrCodeResponse.newBuilder()
                            .setCode(res.getCode())
                            .setInfo(res.getInfo())
                            .build();
                })
                .orElse(QrCodeResponse.newBuilder()
                        .setCode(CommonConst.INVALID_CODE)
                        .setInfo(CommonConst.INVALID_INFO)
                        .build());

        responseObserver.onNext(qrCodeResponse);
        responseObserver.onCompleted();
    }
}
