package com.yrml.proxima.client.service.impl;

import com.yrml.proxima.base.grpc.qrcode.QrCodeData;
import com.yrml.proxima.base.grpc.qrcode.QrCodeResponse;
import com.yrml.proxima.base.grpc.qrcode.QrCodeServiceGrpc;
import com.yrml.proxima.client.service.QrCodeService;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;

/**
 * QrCodeServiceImpl
 *
 * @author tzh42
 * @version 2023/05/20 20:02
 **/
@Slf4j
@Service
public class QrCodeServiceImpl implements QrCodeService {

    @GrpcClient("proxima-server")
    QrCodeServiceGrpc.QrCodeServiceFutureStub qrCodeServiceStub;

    @Override
    public Object getQrCode(){
        try {
            QrCodeResponse response = qrCodeServiceStub.executeQrCode(
                    QrCodeData.newBuilder()
                            .setKey("qrCodeKey")
                            .setUrl("qrCodeOriginUrl")
                            .setEncryptHex("encryptData")
                            .setMethod("method")
                            .build()
            ).get();

            log.info(response.toString());
            return Boolean.TRUE;

        } catch (InterruptedException | ExecutionException e) {
            log.error("Call the remote server caught some error", e);
            return Boolean.FALSE;
        }
    }
}
