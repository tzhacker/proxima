package com.yrml.proxima.server.client;

import com.yrml.proxima.base.grpc.qrcode.QrCodeData;
import lombok.extern.slf4j.Slf4j;

/**
 * WebServiceClient webservice client configuration
 *
 * @author tzh42
 * @version 2023/4/13 16:48
 */
@Slf4j
public final class WebServiceClient {

    public static Object executeForward(QrCodeData qrCodeData) {

        log.info("【-->  Server receive you data  <--】 {}", qrCodeData);
        String reponse = "{\"code\":\"210\",\"info\":\"你是最棒的，服务端的数据给你啦啦啦啦啦！\"}";
        return reponse;

    }
}
