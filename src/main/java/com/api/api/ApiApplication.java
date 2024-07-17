package com.api.api;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.api.api.Lista2.UnidadeFederativa;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);

		Scanner scanner = new Scanner(System.in);

		// Exercicio 1
		System.out.println("Escolha uma UF:");
		for (UnidadeFederativa uf : UnidadeFederativa.values()) {
			System.out.print(uf.name() + " " );
		}

		String escolha = scanner.nextLine().toUpperCase();

		try {
			UnidadeFederativa ufEscolhida = UnidadeFederativa.valueOf(escolha);
			System.out.println("Nome por extenso: " + ufEscolhida.getNome());
		}

		catch (IllegalArgumentException e) {
			System.out.println("UF inválida.");
		}

		// Exercicio 2
		System.out.print("\nInforme uma região:");

		String regiao = scanner.nextLine();

		System.out.print("Estados da região " + regiao + ":");

		for (UnidadeFederativa uf : UnidadeFederativa.values()) {
			if (uf.getRegiao().equalsIgnoreCase(regiao)) {
				System.out.println(uf.getNome());
			}
		}

		scanner.close();
	}
}
