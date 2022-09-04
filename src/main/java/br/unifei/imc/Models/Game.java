package br.unifei.imc.Models;

import lombok.Data;

@Data
public class Game {
    private String name;
    private String platform;
    private String year;
    private String genre;
    private String publisher;
    private String naSales;
    private String euSales;
    private String jpSales;
    private String otherSales;
    private String globalSales;
}
