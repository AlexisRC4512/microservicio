package com.codigo.msusuariosPrueba.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@RequiredArgsConstructor
public class Usuario  {
    private Long id;
    private String nombres;
    private String apellidos;
    private String email;
    private String password;
    private Role role;

}
