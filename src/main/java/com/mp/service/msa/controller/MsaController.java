package com.mp.service.msa.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsaController implements IMsaController {

    @Override
    public ResponseEntity<String> getAppStatus() {
        String status = "Up and Running!!!";
        ResponseEntity<String> responseEntity = new ResponseEntity<String>(status,HttpStatus.OK);
        return responseEntity;
    }
}
