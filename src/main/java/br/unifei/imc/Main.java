package br.unifei.imc;


import java.io.IOException;
import java.util.List;

import br.unifei.imc.Models.Game;

import br.unifei.imc.Utils.CSVReaderService;
import br.unifei.imc.Utils.FilteringData;

import static br.unifei.imc.Models.Plataform.*;
import static br.unifei.imc.Models.Publisher.*;


public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Initialization...");
        List<Game> allData = CSVReaderService.readAllData();

        FilteringData.main(allData, PC, null);
        FilteringData.main(allData, PS4, null);
        FilteringData.main(allData, null, Activision);
        FilteringData.main(allData, null, Sony_Computer_Entertainment);



    }
}