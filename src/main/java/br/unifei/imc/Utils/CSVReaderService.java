package br.unifei.imc.Utils;

import br.unifei.imc.Models.Game;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CSVReaderService {
    private static String csvFilePath = "src/main/resources/vendas-games.csv";

    public static List<Game> readAllData() throws IOException {
        try{
            Reader reader = Files.newBufferedReader(Path.of(csvFilePath));
            CsvToBean csvToBean = new CsvToBeanBuilder(reader)
                    .withType(Game.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
            return (List<Game>) csvToBean.parse();
        } catch (IOException | IllegalStateException e) {
            throw new RuntimeException(e);
        }
    }
}

