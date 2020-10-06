package com.example.mylista;

public class Modelo {

    private String nombre;
    private String apellido;
    private String edad;

    private int image;

    public Modelo(String nombre, String apellido, String edad, int image) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.image = image;
    }

    public  Modelo (){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }


}