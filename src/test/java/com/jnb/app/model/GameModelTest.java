package com.jnb.app.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameModelTest {

    GameModel game = new GameModel();

    @Test
    void acrostico() {
        assertEquals("Transfiguração\nEpiskey\nSectumsempra\nTrasgo\nExpecto\n", game.acrostico("Teste"));
    }

    @Test
    void compor() {
        assertEquals("\nT\nTe\nTes\nTest\nTeste", game.compor("Teste"));
    }

    @Test
    void decompor() {
        assertEquals("\nTeste\nTest\nTes\nTe\nT", game.decompor("Teste"));
    }

    @Test
    void desmembrando() {
        assertEquals("Teste\neste\nste\nte\ne\n", game.desmembrando("Teste"));
    }

    @Test
    void espelho() {
        assertEquals("etseT", game.espelho("Teste"));
    }

    @Test
    void geminio() {
        assertEquals("TTeessttee", game.geminio("Teste"));
    }

    @Test
    void malditoTeto() {
        assertEquals("TESTE\nTEST\nTES\nTE\nT\n", game.malditoTeto("Teste"));
    }

    @Test
    void pontilhado() {
        assertEquals("T.e.s.t.e.", game.pontilhado("Teste"));
    }

    @Test
    void separador() {
        assertEquals("T e s t e ", game.separador("Teste"));
    }

    @Test
    void tNove() {
        assertEquals("83883", game.tNove("Teste"));
    }

    @Test
    void torreDupla() {
        assertEquals("TT\nEE\nSS\nTT\nEE\n",game.torreDupla("Teste"));
    }

    @Test
    void zigZag() {
        assertEquals("T\n e\ns\n t\ne\n ", game.zigZag("Teste"));
    }
}