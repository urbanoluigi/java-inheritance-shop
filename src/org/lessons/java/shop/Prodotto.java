package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    private final int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private double iva;

    // Costruttore che valorizza il codice con un numero random
    public Prodotto(String nome, String descrizione, double prezzo, double iva) {
        this.codice = generateRandomCode();
        setNome(nome);
        setDescrizione(descrizione);
        setPrezzo(prezzo);
        setIva(iva);
    }

    // Metodo privato per generare un codice random
    private int generateRandomCode() {
        Random random = new Random();
        return random.nextInt(1000); // Modificare il range a seconda delle vostre esigenze
    }

    // Getter per il codice (solo lettura)
    public int getCodice() {
        return codice;
    }

    // Getter e setter per il nome con controllo di non vuoto
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Il nome non può essere vuoto");
        }
        this.nome = nome;
    }

    // Getter e setter per la descrizione
    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    // Getter e setter per il prezzo con controllo di non negatività
    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        if (prezzo < 0) {
            throw new IllegalArgumentException("Il prezzo non può essere negativo");
        }
        this.prezzo = prezzo;
    }

    // Getter e setter per l'IVA con controllo di non negatività
    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        if (iva < 0) {
            throw new IllegalArgumentException("L'IVA non può essere negativa");
        }
        this.iva = iva;
    }

    // Metodo per ottenere il prezzo comprensivo di IVA
    public double getPrezzoConIva() {
        return prezzo + (prezzo * iva / 100);
    }

    // Metodo per ottenere il nome esteso (codice-nome)
    public String getNomeEsteso() {
        return codice + "-" + nome;
    }
}
