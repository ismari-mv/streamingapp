package com.ismari.streammusic;

public class Podcast extends Audio {
    private String autor;
    private String clasificacion;

    public Podcast() {
    }

    public String getAutor(String laCotorrisa) {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public void podcastEnReproduccion() {
        imprimeDatosAudio();
        System.out.println("Estas escuchando a: " + autor);
        System.out.println("El genero de este podcast es: " + clasificacion);
    }


}
