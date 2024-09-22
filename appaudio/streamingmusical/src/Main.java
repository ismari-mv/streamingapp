import com.ismari.streammusic.Musica;
import com.ismari.streammusic.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica miMusica = new Musica();
        miMusica.setTitulo("Me porto bonito");
        miMusica.setArtista("Bad bunny");
        miMusica.setAlbum("Un verano sin ti");
        miMusica.setDuracion(5.35);
        miMusica.setFechaDeLanzamiento(2022);

        miMusica.agregarMeGusta();
        miMusica.agregarMeGusta();
        miMusica.agregarNoMeGusta();
        miMusica.agregarNumeroDeReproducciones();
        miMusica.agregarNumeroDeReproducciones();
        miMusica.agregarNumeroDeReproducciones();
        miMusica.agregarNumeroDeReproducciones();
        miMusica.agregarMeGusta();
        miMusica.agregarMeGusta();
        miMusica.agregarNumeroDeReproducciones();
        miMusica.agregarNumeroDeReproducciones();
        miMusica.agregarNumeroDeReproducciones();
        miMusica.agregarNumeroDeReproducciones();
        miMusica.agregarNumeroDeReproducciones();
        miMusica.agregarMeGusta();
        miMusica.agregarNoMeGusta();
        miMusica.agregarMeGusta();
        miMusica.agregarNumeroDeReproducciones();
        miMusica.agregarNumeroDeReproducciones();
        miMusica.agregarMeGusta();
        miMusica.agregarMeGusta();
        miMusica.agregarNumeroDeReproducciones();
        miMusica.agregarNumeroDeReproducciones();
        miMusica.agregarNumeroDeReproducciones();
        miMusica.agregarMeGusta();
        miMusica.agregarNoMeGusta();
        miMusica.agregarMeGusta();
        miMusica.agregarNumeroDeReproducciones();

        miMusica.cancionEnReproduccion();

        System.out.println("***********************************************");

        Musica miOtraMusica = new Musica();
        miOtraMusica.setTitulo("I wanna be yours");
        miOtraMusica.setArtista("Artic monkeys");
        miOtraMusica.setAlbum("AM");
        miOtraMusica.setDuracion(3.10);
        miOtraMusica.setFechaDeLanzamiento(2013);

        miOtraMusica.agregarMeGusta();
        miOtraMusica.agregarMeGusta();
        miOtraMusica.agregarNumeroDeReproducciones();
        miOtraMusica.agregarNumeroDeReproducciones();
        miOtraMusica.agregarNumeroDeReproducciones();
        miOtraMusica.agregarNumeroDeReproducciones();
        miOtraMusica.agregarMeGusta();
        miOtraMusica.agregarMeGusta();
        miOtraMusica.agregarNumeroDeReproducciones();
        miOtraMusica.agregarNumeroDeReproducciones();
        miOtraMusica.agregarNumeroDeReproducciones();
        miOtraMusica.agregarMeGusta();
        miOtraMusica.agregarNoMeGusta();
        miOtraMusica.agregarMeGusta();

        miOtraMusica.cancionEnReproduccion();

        System.out.println("*************************************");

        Podcast miPodcast = new Podcast();
        miPodcast.setTitulo("Nos arrestó la policia");
        miPodcast.setAutor("La cotorrisa");
        miPodcast.setClasificacion("Comedia");
        miPodcast.setDuracion(5.12);

        miPodcast.agregarMeGusta();
        miPodcast.agregarMeGusta();
        miPodcast.agregarMeGusta();
        miPodcast.agregarNumeroDeReproducciones();
        miPodcast.agregarNumeroDeReproducciones();
        miPodcast.agregarNumeroDeReproducciones();
        miPodcast.agregarNoMeGusta();
        miPodcast.agregarNoMeGusta();
        miPodcast.agregarNoMeGusta();
        miPodcast.agregarNoMeGusta();
        miPodcast.agregarNumeroDeReproducciones();
        miPodcast.agregarNumeroDeReproducciones();
        miPodcast.agregarNumeroDeReproducciones();
        miPodcast.agregarNumeroDeReproducciones();
        miPodcast.agregarNumeroDeReproducciones();
        miPodcast.agregarNumeroDeReproducciones();
        miPodcast.agregarMeGusta();
        miPodcast.agregarMeGusta();

        miPodcast.podcastEnReproduccion();

        System.out.println("**************************************+");

        Podcast miOtroPodcast = new Podcast();
        miOtroPodcast.setTitulo("La niña del hospital");
        miOtroPodcast.setAutor("Jaime Mausan");
        miOtroPodcast.setClasificacion("Terror");
        miOtroPodcast.setDuracion(4.62);

        miOtroPodcast.agregarMeGusta();
        miOtroPodcast.agregarMeGusta();
        miOtroPodcast.agregarMeGusta();
        miOtroPodcast.agregarMeGusta();
        miOtroPodcast.agregarNoMeGusta();
        miOtroPodcast.agregarNumeroDeReproducciones();
        miOtroPodcast.agregarNumeroDeReproducciones();
        miOtroPodcast.agregarNumeroDeReproducciones();
        miOtroPodcast.agregarNumeroDeReproducciones();
        miOtroPodcast.agregarMeGusta();
        miOtroPodcast.agregarMeGusta();
        miOtroPodcast.agregarMeGusta();
        miOtroPodcast.agregarNumeroDeReproducciones();
        miOtroPodcast.agregarNumeroDeReproducciones();
        miOtroPodcast.agregarNumeroDeReproducciones();
        miOtroPodcast.agregarNumeroDeReproducciones();
        miOtroPodcast.agregarNumeroDeReproducciones();
        miOtroPodcast.agregarMeGusta();
        miOtroPodcast.agregarMeGusta();
        miOtroPodcast.agregarMeGusta();
        miOtroPodcast.agregarNumeroDeReproducciones();
        miOtroPodcast.agregarNumeroDeReproducciones();

        miOtroPodcast.podcastEnReproduccion();

    }
}
