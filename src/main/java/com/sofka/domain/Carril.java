package com.sofka.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Carril {

    private final Integer numero;
    private final Integer kilometros;
    private List<Carro> carros;

    public Carril(Integer numero, Integer kilometros) {
        this.kilometros = Objects.requireNonNull(kilometros);
        this.numero = Objects.requireNonNull(numero);
        this.carros = new ArrayList<>();
        if(kilometros <= 0){
            throw new IllegalArgumentException("No es un kilometro permitido");
        }
    }

    public void agregarCarro(Carro carro){
        carros.add(carro);
    }

    public Integer kilometros() {
        return kilometros;
    }

    public Integer numero() {
        return numero;
    }
}
