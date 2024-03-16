package com.codigo.msusuarios.service.impl;

import com.codigo.msusuarios.entity.Usuario;
import com.codigo.msusuarios.repository.UsuarioRepository;
import com.codigo.msusuarios.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {
    private final UsuarioRepository usuarioRepository;
    @Override
    public List<Usuario> getUsuarios() {
        return usuarioRepository.findAll();
    }
}
