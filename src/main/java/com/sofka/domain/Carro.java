package com.sofka.domain;

import java.util.Objects;

public class Carro {
    private final Colores color;
    private final String placa;
    private Conductor conductor;
    private Integer metros;

    public Carro(Colores color, String placa, Integer metros){
        this.color = Objects.requireNonNull(color);
        this.metros = Objects.requireNonNull(metros);
        this.placa = Objects.requireNonNull(placa);
        if (metros < 0){
            throw new IllegalArgumentException("No se pueden tener metros negativos");
        }
    }

    public Carro(Colores color, String placa){
        this(color, placa, 0);
    }

    public void agregarConductor(Conductor conductor){
        this.conductor = Objects.requireNonNull(conductor);
    }

    public void aumentarMetro(){
        this.metros = metros + 1;
    }

    public double kilometros(){
        return Math.ceil((double) metros/1000);
    }

    public double metros(){
        return metros;
    }

    public Conductor conductor(){
        return conductor;
    }

    public Colores color(){
        return color;
    }

    public String placa() {
        return placa;
    }

    public enum Colores{
        ROJO, BLANCO, NEGRO, AZUL
    }

    @Override
    public String toString() {
        return "Carro{" +
                "color=" + color +
                ", placa='" + placa + '\'' +
                ", conductor=" + conductor +
                ", metros=" + metros +
                '}';
    }
}
