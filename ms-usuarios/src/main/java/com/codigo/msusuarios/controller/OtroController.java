package com.codigo.msusuarios.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/ms-usuario/v1/otro")
@RequiredArgsConstructor
@RefreshScope
public class OtroController {

    @Value("${valor.propiedad}")
    private String valorProp;

    @GetMapping("")
    public ResponseEntity<String> getValor(){
        return ResponseEntity.ok(valorProp);
    }
}
