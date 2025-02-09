package br.com.matheus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> grupoPessoas = new ArrayList<>();

        System.out.println("Digite os nomes e sexos separados por vírgula (ex: Maria-F,João-M,Ana-F):");
        String entrada = scanner.nextLine();

        String[] pessoas = entrada.split(",");

        for (String pessoa : pessoas) {
            if (!pessoa.contains("-")) {
                System.out.println("Formato inválido: " + pessoa + ". Use o formato 'nome-sexo'.");
                continue;
            }
            grupoPessoas.add(pessoa);
        }


        List<String> listaMulheres = grupoPessoas.stream()
                .filter(s -> s.split("-")[1].equalsIgnoreCase("F"))
                .collect(Collectors.toList());


        System.out.println("Mulheres: ");
        listaMulheres.forEach(s -> System.out.println(s.split("-")[0]));

    }
}

