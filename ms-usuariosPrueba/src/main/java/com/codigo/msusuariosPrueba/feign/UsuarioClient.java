package com.codigo.msusuariosPrueba.feign;

import com.codigo.msusuariosPrueba.response.Usuario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "MS-USUARIOS")
public interface UsuarioClient {

    @GetMapping("/ms-usuario/v1/usuarios/todos")
    List<Usuario> getUsuariios();

}
