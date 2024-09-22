package com.ismari.streammusic;

public class Musica extends  Audio{
    private String album;
    private String artista;
    private String genero;
    private int fechaDeLanzamiento;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void cancionEnReproduccion(){
        imprimeDatosAudio();
        System.out.println("Estas escuchando a: " + artista);
        System.out.println("El genero de esta cancion es: "+ obtenerGeneroDeCancion(artista));
        System.out.println("Descripción del artista: " + obtenerDescripcionArtista(artista));

    }

    public String obtenerGeneroDeCancion(String generoCancion){
        return switch (generoCancion) {
            case "Bad bunny" -> "Regueton";
            case "Artic monkeys" -> "Indie Rock";
            default -> "No se encontro el género del artista";
        };
    }

    public String obtenerDescripcionArtista(String name){
        return switch (name){
            case "Bad bunny" ->"""
                    Bad Bunny hoy día es uno de los exponentes de rap más famosos y sus colabraciones con grandes de la música como 
                    Daddy Yankee, J Balvin y Yandel lo han dado a conocer por el mundo.
                    """ ;
            case "Artic monkeys"-> """
                    es una banda británica de indie rock, formada en Sheffield, Reino Unido.
                    El grupo está compuesto por el guitarrista principal y vocalista Alex Turner, 
                    el guitarrista Jamie Cook, el baterista Matt Helders y el bajista Nick O'Malley
                    """;
            default -> "No se encontró la descripción del artista";
        };

    }
}
