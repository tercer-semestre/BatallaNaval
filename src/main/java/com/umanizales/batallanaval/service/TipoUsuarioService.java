package com.umanizales.batallanaval.service;

import com.umanizales.batallanaval.repository.TipoUsuarioRepository;
import com.umanizales.batallanaval.model.entities.TipoUsuarioEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoUsuarioService {
    private TipoUsuarioRepository tipoUsuarioRepository;
    @Autowired
    public TipoUsuarioService(TipoUsuarioRepository tipoUsuarioRepository) {
        this.tipoUsuarioRepository = tipoUsuarioRepository;
    }

    public Iterable<TipoUsuarioEntity> getAllTipoUsuarios()
    {
        return tipoUsuarioRepository.findAll();
    }

    public TipoUsuarioEntity createTipoUsuario(TipoUsuarioEntity tipoUsuario)
    {
        return tipoUsuarioRepository.save(tipoUsuario);
    }
}

