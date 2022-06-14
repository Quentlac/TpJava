package TP6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArticleTest {

    @org.junit.jupiter.api.Test
    void getIntitule() throws IntituleException, PriceException {
        Article a = new Article("minuscule", 2.0, 10);
        assertEquals("Minuscule", a.getIntitule(), "Un intitulé doit avoir la première lettre en Majuscule et le reste en minuscule");

        Article b = new Article("MAJUSCULE", 2.0, 10);
        assertEquals("Majuscule", b.getIntitule(), "Un intitulé doit avoir la première lettre en Majuscule et le reste en minuscule");
    }

    @org.junit.jupiter.api.Test
    void setIntitule() {
        assertThrows(IntituleException.class, () -> {
            new Article(null, 2.0, 10);
        }, "Un intitulé ne peut pas être null.");

        assertThrows(IntituleException.class, () -> {
            new Article("", 2.0, 10);
        }, "Un intitulé ne peut pas être vide.");
    }

    @Test
    void getPrix() throws PriceException, IntituleException {
        assertTrue(new Article("a", 25.0, 6).getPrix() > 0, "d");
    }

    @Test
    void existQuantite() throws PriceException, IntituleException {
        Article a = new Article("a", 25.0, 18);
        assertTrue(a.existQuantite(15));
        assertFalse(a.existQuantite(20));
    }

    @Test
    void removeQuantite() {
    }
}