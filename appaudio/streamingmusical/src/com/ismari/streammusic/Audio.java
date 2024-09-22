package com.ismari.streammusic;

public class Audio {
    private String titulo;
    private double duracion;
    private int totalDeReproducciones;
    private int totalDeMeGustas;
    private int totalDeNoMeGusta;



    public void meGustas(){
        this.totalDeMeGustas++;
    }
    public void reproduccion(){
        this.totalDeReproducciones++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public int getTotalDeReproducciones() {
        return totalDeReproducciones;
    }

    public void setTotalDeReproducciones(int totalDeReproducciones) {
        this.totalDeReproducciones = totalDeReproducciones;
    }

    public int getTotalDeMeGustas() {
        return totalDeMeGustas;
    }

    public void setTotalDeMeGustas(int totalDeMeGustas) {
        this.totalDeMeGustas = totalDeMeGustas;
    }

    public int getTotalDeNoMeGusta() {
        return totalDeNoMeGusta;
    }

    public void setTotalDeNoMeGusta(int totalDeNoMeGusta) {
        this.totalDeNoMeGusta = totalDeNoMeGusta;
    }

    public void imprimeDatosAudio(){
        System.out.println("El nombre del tema que escuchas es: " + getTitulo());
        System.out.println("Este audio tiene " + getTotalDeMeGustas() + " me gustas");
        System.out.println("Su duración es de: "+ getDuracion() + " minutos");
        System.out.println("Al " + porcentajeDeAprobacion() + "% de la gente le gustó este audio");
        System.out.println("Al " + porcentajeDeDesaprobacion() + "% de la gente no le gustó este audio");
        System.out.println("El total de reproducciones es: " + getTotalDeReproducciones());
    }
    public void agregarMeGusta(){
        totalDeMeGustas++;
    }
    public void agregarNoMeGusta(){
        totalDeNoMeGusta++;
    }
    public void agregarNumeroDeReproducciones(){
        totalDeReproducciones++;
    }
    public double porcentajeDeAprobacion(){
        return ((double) totalDeMeGustas /totalDeReproducciones) * 100;
    }

    public double porcentajeDeDesaprobacion(){
        return ((double) totalDeNoMeGusta /totalDeReproducciones) * 100;
    }

}
