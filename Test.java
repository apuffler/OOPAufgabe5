import java.util.Iterator;

public class Test {

    public static void main(String[] args) {

        // 1)
        // Sets erstellen
        BasicSet<Integer> ibs = new BasicSet<Integer>();
        BasicSet<MyInteger> miss = new BasicSet<MyInteger>();
        SortedSet<Baurundholz> brhss = new SortedSet<Baurundholz>();
        SortedSet<Baukantholz> bkhss = new SortedSet<Baukantholz>();

        // Elemente in Sets einfügen
        for(int i = 10; i > 0; i--){
            ibs.add(i);
            MyInteger mi = new MyInteger(i);
            miss.add(mi);
            Baurundholz brh = new Baurundholz((i*i),i);
            brhss.add(brh);
            Baukantholz bkh = new Baukantholz((i*i), i, i);
            bkhss.add(bkh);
        }

        // Elemente ausgeben
        System.out.println("Ausgabe von BasicSet<Integer>: \n");
        for(Integer i : ibs){
            System.out.println(i);
        }
        System.out.println("Ausgabe von SortedSet<MyInteger>: \n");
        for(MyInteger mi : miss){
            System.out.println(mi.x);
        }
        System.out.println("Ausgabe von SortedSet<Baurundholz>: \n");
        for(Baurundholz brh : brhss){
            System.out.println("Laenge: " + brh.length + ", Durchmesser: " + brh.diameter);
        }
        System.out.println("Ausgabe von SortedSet<Baukantholz>:  \n");
        for(Baukantholz bkh : bkhss){
            System.out.println("Laenge: " + bkh.length + ", Breite: " + bkh.breadth + ", Hoehe: " + bkh.height);
        }

        // Elemente löschen & neue einfügen


        // Elemente erneut ausgeben



        // 2)
        // Set erstellen
        SortedSet<Bauholz> bhss = new SortedSet<Bauholz>();
        // Elemente aus den alten Sets einlesen
        Iterator<Baurundholz> brhit = brhss.iterator();
        while (brhit.hasNext())
            bhss.add(brhit.next());
        Iterator<Baukantholz> bkhit = bkhss.iterator();
        while (bkhit.hasNext())
            bhss.add(bkhit.next());
        // Löschen & Einfügen von Elementen


        // 3)




    }

}
