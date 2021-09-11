package br.ufpb.dcx.aps.atividades.a01;

/**
 * Universidade Federal da Paraíba
 * Departamento de Ciências Exatas
 * <p>
 * Professor: Rodrigo Rebouças de Almeida (http://rodrigor.dcx.ufpb.br)
 */


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Atenção: estes testes são utilizados para avaliar a submissão da sua atividade.
 * Você não deve REMOVER testes desta classe.
 * Você pode acrescentar novos testes, se achar necessário.
 */

public class PedidoTest {

    static Produto p1, p2, p3;

    @BeforeAll
    static void beforeAll() {
        p1 = new Produto("sapato", "um sapato", 100.0);
        p2 = new Produto("camisa", "uma camisa", 200.0);
        p3 = new Produto("tenis", "um tenis", 300.0);
    }

    @Test
    void testPedidoSimples() {
        Pedido pedido = new Pedido();

        assertEquals(0.0, pedido.getTotal());
        assertEquals(0, pedido.quantProdutos());

        pedido.addProduto(p1);
        assertEquals(1, pedido.quantProdutos());
        assertEquals(100.0, pedido.getTotal());

        pedido.addProduto(p2);
        assertEquals(2, pedido.quantProdutos());
        assertEquals(300.0, pedido.getTotal());

        pedido.addProduto(p3);
        assertEquals(3, pedido.quantProdutos());
        assertEquals(600.0, pedido.getTotal());
    }

    @Test
    void testPedidoQuantidade() {

        Pedido pedido = new Pedido();

        // p1: 100 * 2 = 200
        pedido.addProduto(p1, 2);
        assertEquals(2, pedido.quantProdutos());
        assertEquals(200.0, pedido.getTotal());

        // p1: 200 * 3 = 600 + 200 (caso anterior) 
        pedido.addProduto(p2, 3);
        assertEquals(5, pedido.quantProdutos());
        assertEquals(800, pedido.getTotal());
    }

    @Test
    void testAddProdutoInvalido() {

        Pedido pedido = new Pedido();

        Exception exception = assertThrows(RuntimeException.class, () ->
                pedido.addProduto(p1, 0));
        assertEquals("a quantidade deve ser maior que zero", exception.getMessage());
    }

    @Test
    void testItensPedido() {
        Pedido pedido = new Pedido();
        assertTrue(pedido.getItens().isEmpty());

        pedido.addProduto(p1, 1);
        assertFalse(pedido.getItens().isEmpty());
        assertEquals(1, pedido.getItens().size());
        pedido.addProduto(p1, 1);
    }
}
