package br.ufpb.dcx.aps.atividades.a01;


/**
 * Universidade Federal da Paraíba
 * Departamento de Ciências Exatas
 * <p>
 * Professor: Rodrigo Rebouças de Almeida (http://rodrigor.dcx.ufpb.br)
 */


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Atenção: estes testes são utilizados para avaliar a submissão da sua atividade.
 * Você não deve REMOVER testes desta classe.
 * Você pode acrescentar novos testes, se achar necessário.
 */

class ProdutoTest {


    private Produto p;

    @BeforeEach
    void setUp() {
        p = new Produto();
    }

    @Test
    @DisplayName("Testando o construtor")
    void testConstrutor() {
        p = new Produto("p1", "desc", 10.0);
        assertEquals("p1", p.getNome());
        assertEquals("desc", p.getDescricao());
        assertEquals(10.0, p.getValor());
    }

    @Test
    void testDescricao() {
        //me assegure que parametro 1 é igual ao parametro 2
        assertEquals("", p.getDescricao());
        p.setDescricao("desc");
        assertEquals("desc", p.getDescricao());
    }

    @Test
    void testNome() {
        assertEquals("", p.getNome());
        p.setNome("nome");
        assertEquals("nome", p.getNome());
    }

    @Test
    void testValor() {
        assertEquals(0.0, p.getValor());
        p.setValor(1000.0);
        assertEquals(1000.0, p.getValor());
    }
}
