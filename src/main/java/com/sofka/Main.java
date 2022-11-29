package com.sofka;

import com.sofka.domain.Carro;
import com.sofka.domain.Conductor;
import com.sofka.domain.Juego;
import com.sofka.domain.Podium;

public class Main {
    public static void main(String[] args) {

        int numCarriles = 4;
        int kilometros = 200;
        Juego juego = new Juego(numCarriles, kilometros, "Pista#Los Andes");

        Carro rojo = new Carro(Carro.Colores.ROJO, "XX1" );
        rojo.agregarConductor(new Conductor("C1", "Cristian", "cristian@correo.com", "cristian"));
        Carro azul = new Carro(Carro.Colores.AZUL, "XX2");
        azul.agregarConductor(new Conductor("C2", "Matias", "matias@correo.com", "matias"));
        Carro negro = new Carro(Carro.Colores.NEGRO, "XX3");
        negro.agregarConductor(new Conductor("C3", "Adrian", "adrian@correo.com", "adrian"));
        Carro blanco = new Carro(Carro.Colores.BLANCO, "C4");
        blanco.agregarConductor(new Conductor("C4", "Raul", "raul@correo.com", "raul"));

        juego.agregarCarroACarril(1, rojo);
        juego.agregarCarroACarril(2, azul);
        juego.agregarCarroACarril(3, negro);
        juego.agregarCarroACarril(4, blanco);

        Podium podium = juego.iniciarJuego();
        System.out.println(podium);

    }
}