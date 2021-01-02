package br.com.alura.jpa.testes;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestaCriaTabelaConta {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("alura");
        emf.close();
    }
}