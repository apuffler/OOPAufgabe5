
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
        for(Integer i : ibs){
            System.out.println(i);
        }

        // Elemente löschen & neue einfügen

        // Elemente erneut ausgeben



        // 2)
        // Set erstellen
        SortedSet<Bauholz> bhss = new SortedSet<Bauholz>();
        // Elemente aus den alten Sets einlesen
        for(Baurundholz brh : brhss)
            bhss.add(brh);
        for(Baukantholz bkh : bkhss)
            bhss.add(bkh);



    }

}
