import java.util.Iterator;

public class Test {

    public static void main(String[] args) {

        // 1)
        // Sets erstellen
        BasicSet<Integer> ibs = new BasicSet<Integer>();
        SortedSet<MyInteger> miss = new SortedSet<MyInteger>();
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
        System.out.println("Ausgabe von BasicSet<Integer>:");
        for(Integer i : ibs){
            System.out.println(i);
        }
        System.out.println("\nAusgabe von SortedSet<MyInteger>:");
        for(MyInteger mi : miss){
            System.out.println(mi.x);
        }
        System.out.println("\nAusgabe von SortedSet<Baurundholz>:");
        for(Baurundholz brh : brhss){
            System.out.println("Laenge: " + brh.length + ", Durchmesser: " + brh.diameter);
        }
        System.out.println("\nAusgabe von SortedSet<Baukantholz>:");
        for(Baukantholz bkh : bkhss){
            System.out.println("Laenge: " + bkh.length + ", Breite: " + bkh.breadth + ", Hoehe: " + bkh.height);
        }

        // Elemente löschen & neue einfügen

        Iterator<Integer> iit = ibs.iterator();
        while (iit.hasNext()){
            iit.remove();
        }
        Iterator<MyInteger> mit = miss.iterator();
        while (mit.hasNext())
            mit.remove();
        Iterator<Baurundholz> brhit = brhss.iterator();
        while (brhit.hasNext())
            brhit.remove();
        Iterator<Baukantholz> bkhit = bkhss.iterator();
        while (bkhit.hasNext())
            bkhit.remove();

        for(int i = 20; i > 10; i--){
            ibs.add(i);
            MyInteger mi = new MyInteger(i);
            miss.add(mi);
            Baurundholz brh = new Baurundholz((i*i),i);
            brhss.add(brh);
            Baukantholz bkh = new Baukantholz((i*i), i, i);
            bkhss.add(bkh);
        }


        // Elemente erneut ausgeben
        System.out.println("\nAusgabe von BasicSet<Integer>: \n");
        for(Integer i : ibs){
            System.out.println(i);
        }
        System.out.println("\nAusgabe von SortedSet<MyInteger>: \n");
        for(MyInteger mi : miss){
            System.out.println(mi.x);
        }
        System.out.println("\nAusgabe von SortedSet<Baurundholz>: \n");
        for(Baurundholz brh : brhss){
            System.out.println("Laenge: " + brh.length + ", Durchmesser: " + brh.diameter);
        }
        System.out.println("\nAusgabe von SortedSet<Baukantholz>:  \n");
        for(Baukantholz bkh : bkhss){
            System.out.println("Laenge: " + bkh.length + ", Breite: " + bkh.breadth + ", Hoehe: " + bkh.height);
        }


        // 2)

        // Set erstellen
        SortedSet<Bauholz> bhss = new SortedSet<Bauholz>();

        // Elemente aus den alten Sets einlesen
        while (brhit.hasNext())
            bhss.add(brhit.next());
        while (bkhit.hasNext())
            bhss.add(bkhit.next());

        // Löschen & Einfügen von Elementen

        // Ausgabe von SortedSet<Bauholz>
        System.out.println("\nAusgabe von SortedSet<Bauholz>:");
        for (Bauholz bh : bhss)
            System.out.println("Laenge: " + bh.length);

        // 3)




    }

}
