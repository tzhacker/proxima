package com.yrml.proxima.client.controller;

import com.yrml.proxima.client.service.QrCodeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * QrCodeController
 *
 * @author tzh42
 * @version 2023/06/28 16:42
 **/
@RestController
@RequestMapping("/qr-code")
@RequiredArgsConstructor
public class QrCodeController {

    private final QrCodeService qrCodeService;

    @GetMapping("/test")
    public Object getQrCodeService() {
        return qrCodeService.getQrCode();
    }
}
