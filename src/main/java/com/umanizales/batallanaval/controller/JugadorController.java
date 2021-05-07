package com.umanizales.batallanaval.controller;

import com.umanizales.batallanaval.model.Jugador;
import com.umanizales.batallanaval.service.ListaSEService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/jugador")
@Validated
public class JugadorController {

    private ListaSEService listaSEService;
    @Autowired
    public JugadorController(ListaSEService listaSEService) {
        this.listaSEService = listaSEService;
    }
    @GetMapping
    public Jugador getJugador(){
        Jugador Oscar = new Jugador("Oscar", "oscar@gmail.com", "123XD", 22);
        return Oscar;


    }
    @PostMapping
    public Jugador crearJugador(@RequestBody Jugador player)
    {
        //simular que recibo un empleado y lo mando a guardar
        //en bds y además le recalcular bonificacion del 15%
        //Guarda en bds
        player.setPuntaje(player.getPuntaje()*1.15);
        return player;


    }
    @GetMapping(path="/count")
    public int getCountPlayers()
    {
        return listaSEService.contarNodos();
    }

    @GetMapping(path="/listar")
    public String getTotalPlayers()
    {
        return listaSEService.listarNodos();
    }
}
