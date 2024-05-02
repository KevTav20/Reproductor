package com.aluracursos.reproductor.principal;

import com.aluracursos.reproductor.modelos.Cancion;
import com.aluracursos.reproductor.modelos.MisFavoritos;
import com.aluracursos.reproductor.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Forever");
        miCancion.setCantante("Kiss");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Gabriela Aguilar");
        miPodcast.setTitulo("Cafe.Tech");

        //Canciones
        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }

        for (int i = 0; i < 2000; i++) {
            miCancion.reproducir();
        }
        //Podcast
        for (int i = 0; i < 100; i++) {
            miPodcast.meGusta();
        }

        for (int i = 0; i < 8000; i++) {
            miPodcast.reproducir();
        }

        System.out.println(miCancion.getTotalDeMeGusta());
        System.out.println(miCancion.getTotalDeReproducciones());

        MisFavoritos misFavoritos = new MisFavoritos();
        misFavoritos.adicione(miPodcast);
        misFavoritos.adicione(miCancion);
    }

}
