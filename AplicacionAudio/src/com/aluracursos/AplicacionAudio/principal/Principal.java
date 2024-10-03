package com.aluracursos.AplicacionAudio.principal;

import com.aluracursos.AplicacionAudio.modelos.Cancion;
import com.aluracursos.AplicacionAudio.modelos.MisFavoritos;
import com.aluracursos.AplicacionAudio.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Dando y Dando");
        miCancion.setCantante("Natanael Cano");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Roberto Mtz");
        miPodcast.setTitulo("Creativo");

        // Me gusta y reproducción de una canción.
        for (int i = 0; i < 100; i++) {
            miCancion.agregarMeGusta();
        }
        for (int i = 0; i < 2000; i++) {
            miCancion.reproduce();
        }

        // Me gusta y reproducción de un podcast.
        for (int i = 0; i < 100; i++) {
            miPodcast.agregarMeGusta();
        }
        for (int i = 0; i < 8000; i++) {
            miPodcast.reproduce();
        }

        System.out.println("El total de reproducciones de " + miCancion.getTitulo()
                + " son: " + miCancion.getTotalDeReproducciones());
        System.out.println("El total de Me Gusta de " + miCancion.getTitulo()
                + " son: " + miCancion.getTotalDeMeGusta());

        System.out.println("El total de reproducciones de " + miPodcast.getTitulo()
                + " son: " + miPodcast.getTotalDeReproducciones());
        System.out.println("El total de Me Gusta de " + miPodcast.getTitulo()
                + " son: " + miPodcast.getTotalDeMeGusta());

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adicionar(miPodcast);
        favoritos.adicionar(miCancion);
    }
}
