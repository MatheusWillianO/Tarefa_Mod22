package br.com.matheus;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Teste {

    @Test
    public void teste() {
        List<String> grupoPessoas = new ArrayList<>();
        grupoPessoas.add("Mariana-F");
        grupoPessoas.add("Marcia-F");
        grupoPessoas.add("Marcos-M");
        grupoPessoas.add("Flavio-M");

        List<String> listaMulheres = grupoPessoas.stream()
                .filter(s -> s.split("-")[1].equalsIgnoreCase("F"))
                .collect(Collectors.toList());

        listaMulheres.forEach(s -> System.out.println(s.split("-")[0]));

        Assert.assertTrue(listaMulheres.stream().allMatch(s -> s.endsWith("-F")));
    }

}
