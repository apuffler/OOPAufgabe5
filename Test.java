import java.util.Iterator;

public class Test {

    public static void main(String[] args) {

        // 1)

        System.out.println("Test 1) \n");

        // Sets erstellen
        BasicSet<Integer> ibs = new BasicSet<Integer>();
        SortedSet<MyInteger> miss = new SortedSet<MyInteger>();
        SortedSet<Baurundholz> brhss = new SortedSet<Baurundholz>();
        SortedSet<Baukantholz> bkhss = new SortedSet<Baukantholz>();

        // Elemente in Sets einfügen
        for(int i = 10; i > 0; i--){
            ibs.add(i);
            miss.add(new MyInteger(i));
            brhss.add(new Baurundholz((i*i),i));
            bkhss.add(new Baukantholz((i*i), i, i));
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
        while (iit.hasNext())
            iit.remove();
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
            miss.add(new MyInteger(i));
            brhss.add(new Baurundholz(i*i, i));
            bkhss.add(new Baukantholz(i*i,i,i));
        }

        // Elemente erneut ausgeben
        System.out.println("\nErneute Ausgabe von BasicSet<Integer>: \n");
        for(Integer i : ibs){
            System.out.println(i);
        }
        System.out.println("\nErneute Ausgabe von SortedSet<MyInteger>: \n");
        for(MyInteger mi : miss){
            System.out.println(mi.x);
        }
        System.out.println("\nErneute Ausgabe von SortedSet<Baurundholz>: \n");
        for(Baurundholz brh : brhss){
            System.out.println("Laenge: " + brh.length + ", Durchmesser: " + brh.diameter);
        }
        System.out.println("\nErneute Ausgabe von SortedSet<Baukantholz>:  \n");
        for(Baukantholz bkh : bkhss){
            System.out.println("Laenge: " + bkh.length + ", Breite: " + bkh.breadth + ", Hoehe: " + bkh.height);
        }


        // 2)

        System.out.println("\n\n Test 2) \n");

        // Set erstellen
        SortedSet<Bauholz> bhss = new SortedSet<Bauholz>();

        brhit = brhss.iterator();
        bkhit = bkhss.iterator();
        // Elemente aus den alten Sets einlesen
        while (brhit.hasNext())
            bhss.add(brhit.next());
        while (bkhit.hasNext())
            bhss.add(bkhit.next());

        // Ausgabe
        System.out.println("\nErneute Ausgabe von SortedSet<Bauholz>:");
        for (Bauholz bh : bhss)
            System.out.println("Laenge: " + bh.length);


        // Löschen & Einfügen von Elementen
        Iterator<Bauholz> bhit = bhss.iterator();
        while (bhit.hasNext())
            bhit.remove();

        for(int i = 21; i > 0; i--){
            bhss.add(new Baurundholz(i*i,i));
            bhss.add(new Baukantholz(i*i,i,i));
        }

        // Ausgabe von SortedSet<Bauholz>
        System.out.println("\nErneute Ausgabe von SortedSet<Bauholz>:");
        for (Bauholz bh : bhss)
            System.out.println("Laenge: " + bh.length);

        // 3)

        System.out.println("\n\n Test 3) \n");

        BasicSet<Bauholz> bhbs = bhss;

        System.out.println("\nAusgabe von BasicSet<Bauholz>:");
        for (Bauholz bh : bhbs)
            System.out.println("Laenge: " + bh.length);

        // Einfügen und Löschen
        Iterator<Bauholz> bhit2 = bhbs.iterator();
        while (bhit2.hasNext())
            bhit2.remove();

        for(int i = 21; i > 0; i--){
            bhbs.add(new Baurundholz(i*i,i));
            bhbs.add(new Baukantholz(i*i,i,i));
        }

        System.out.println("\nErneute Ausgabe von BasicSet<Bauholz>:");
        for (Bauholz bh : bhbs)
            System.out.println("Laenge: " + bh.length);


    }

}
