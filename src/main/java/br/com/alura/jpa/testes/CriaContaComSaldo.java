package br.com.alura.jpa.testes;

import br.com.alura.jpa.modelo.Conta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CriaContaComSaldo {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("alura");
        EntityManager em = emf.createEntityManager();

        Conta conta = new Conta();
        conta.setTitular("Juliano");
        conta.setNumero(12345);
        conta.setAgencia(54321);
        conta.setSaldo(500.0);

        em.getTransaction().begin();

        em.persist(conta);

        em.getTransaction().commit();

    }
}


