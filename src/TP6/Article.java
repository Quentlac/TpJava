package TP6;

import java.util.Locale;

public class Article {

    public final static int SEUIL = 100;

    private String intitule;
    private double prix;
    private int stock;

    public Article(String intitule, double prix, int stock) throws IntituleException, PriceException {
        setIntitule(intitule);
        setPrix(prix);
        setStock(stock);
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) throws IntituleException {

        // On vérifie que l'intitulé n'est pas vide ni null
        if(intitule == null || intitule.isEmpty())
            throw new IntituleException();

        this.intitule = intitule.substring(0, 1).toUpperCase(Locale.ROOT) + intitule.substring(1).toLowerCase(Locale.ROOT);
    }

    public void setPrix(double prix) throws PriceException{
        if(prix <= 0) throw new PriceException();
        this.prix = prix;
    }

    public double getPrix(int stock) {
        if(stock < SEUIL) {
            return prix*stock;
        }
        else {
            return 0.9 * (prix * stock);
        }
    }

    public double getPrix() {
        return prix;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean existQuantite(int quantite) {
        return getStock() >= quantite;
    }

    public void removeQuantite(int quantite) throws StockException{
        if(!existQuantite(quantite)) throw new StockException();

        setStock(getStock() - quantite);
    }



}
