package br.unifei.imc.Utils;

import br.unifei.imc.Models.Game;
import br.unifei.imc.Models.Plataform;
import br.unifei.imc.Models.Publisher;

import java.util.List;

public class FilteringData {
    public static void main(List<Game> allData , Plataform plataform, Publisher publisher) {

        if (plataform != null) {
            String name = plataform.toString().replace("_", " ");
            System.out.println("All games for " + name + ":");
            allData.stream().filter(game -> game.getPlatform().equals(name))
                    .forEach(game -> System.out.println(game.getName()));
        }

        if (publisher != null) {
            String name = publisher.toString().replace("_", " ");
            System.out.println("All games from " + name + ":");
            allData.stream().filter(game -> game.getPublisher().equals(name))
                    .forEach(game -> System.out.println(game.getName()));
        }

        System.out.println("\n");
    }
}
