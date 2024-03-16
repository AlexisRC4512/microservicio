package com.codigo.msusuariosPrueba.controller;

import com.codigo.msusuariosPrueba.feign.UsuarioClient;
import com.codigo.msusuariosPrueba.response.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ms-prueba/v1/usuarios")
@RequiredArgsConstructor
public class UsuarioPruebaController {
    private final UsuarioClient usuarioClient;

    @GetMapping("/all")
    public ResponseEntity<List<Usuario>> getUsuarios(){
        return ResponseEntity.ok(usuarioClient.getUsuariios());
    }
}
