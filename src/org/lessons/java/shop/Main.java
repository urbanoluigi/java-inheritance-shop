package org.lessons.java.shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Test della classe Prodotto
            System.out.println("Inserisci nome del prodotto:");
            String nomeProdotto = scanner.nextLine();

            System.out.println("Inserisci descrizione del prodotto:");
            String descrizioneProdotto = scanner.nextLine();

            System.out.println("Inserisci prezzo del prodotto:");
            double prezzoProdotto = scanner.nextDouble();

            System.out.println("Inserisci iva del prodotto:");
            double ivaProdotto = scanner.nextDouble();

            Prodotto prodotto = new Prodotto(nomeProdotto, descrizioneProdotto, prezzoProdotto, ivaProdotto);

            System.out.println("Prodotto creato:");
            System.out.println("Codice: " + prodotto.getCodice());
            System.out.println("Nome: " + prodotto.getNome());
            System.out.println("Descrizione: " + prodotto.getDescrizione());
            System.out.println("Prezzo: " + prodotto.getPrezzo());
            System.out.println("IVA: " + prodotto.getIva() + "%");
            System.out.println("Prezzo con IVA: " + prodotto.getPrezzoConIva());
            System.out.println("Nome esteso: " + prodotto.getNomeEsteso());

            // Test della classe Categoria
            System.out.println("\nInserisci nome della categoria:");
            String nomeCategoria = scanner.next();

            System.out.println("Inserisci descrizione della categoria:");
            String descrizioneCategoria = scanner.next();

            Categoria categoria = new Categoria(nomeCategoria, descrizioneCategoria);

            System.out.println("Categoria creata:");
            System.out.println("Nome: " + categoria.getNome());
            System.out.println("Descrizione: " + categoria.getDescrizione());
        } catch (IllegalArgumentException e) {
            // Gestione delle eccezioni di tipo IllegalArgumentException
            System.err.println("Errore: " + e.getMessage());
        } finally {
            // Chiudi lo scanner nel blocco finally per garantire la chiusura anche in caso di eccezione
            scanner.close();
        }
    }
}