package TP4.collection;

import java.util.Collection;
import java.util.Iterator;

public class CollectionUtilitaire {

    /**
     * Affiche une collection
     * @param msg Message à afficher juste avant les éléments de la collection
     * @param c Collection
     */
    public static void afficheCollection(String msg, Collection<Integer> c) {
        System.out.println(msg);

        Iterator i = c.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
