package TP2.contrainte;

/**
 * Classe d'exception si une contrainte n'est pas respectée
 */
public class ContrainteException extends Exception{

    public ContrainteException(){
        super();
    }

    public ContrainteException(String msg) {
        super(msg);
    }
}
