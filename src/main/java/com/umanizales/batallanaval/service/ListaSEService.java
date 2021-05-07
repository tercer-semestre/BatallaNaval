package com.umanizales.batallanaval.service;

import com.umanizales.batallanaval.model.Jugador;
import com.umanizales.batallanaval.model.ListaSE;
import org.springframework.stereotype.Service;

@Service
public class ListaSEService {
    private ListaSE listaSE;

    public ListaSEService() {
        this.listaSE= new ListaSE();
        ///Bds llenara la lista
        listaSE.adicionarNodo(new Jugador("Pedro Pérez",
                    "12345646"
                    , "4000000",55));
        listaSE.adicionarNodo(new Jugador("Juan Juarez",
                "4546464"
                , "4500000",666));
    }

    public int contarNodos()
    {
        return listaSE.getCont();
    }

    public String listarNodos()
    {
        return listaSE.listadoNodos();
    }

}
