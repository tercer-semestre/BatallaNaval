package com.umanizales.batallanaval.controller;
import com.umanizales.batallanaval.model.entities.TipoUsurioEntity;
import com.umanizales.batallanaval.service.TipoUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/tipousuario")
@Validated
public class TipoUsuarioController {

    private TipoUsuarioService tipoUsuarioService;

    @Autowired
    public TipoUsuarioController(TipoUsuarioService tipoUsuarioService) {
        this.tipoUsuarioService = tipoUsuarioService;
    }

    @GetMapping
    public Iterable<TipoUsurioEntity> getAllTipoUsuarios()
    {
        return tipoUsuarioService.getAllTipoUsuarios();
    }

    @PostMapping
    public TipoUsurioEntity createTipoUsuario(@RequestBody TipoUsurioEntity tipoUsuario)
    {
        return tipoUsuarioService.createTipoUsuario(tipoUsuario);
    }
}
