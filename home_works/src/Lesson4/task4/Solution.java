package Lesson4.task4;

import Lesson4.task4.bryophytes.Anthocerotophyta;
import Lesson4.task4.bryophytes.Bryophyta;
import Lesson4.task4.bryophytes.Marchantiophyta;
import Lesson4.task4.greenAlgae.Charophyta;
import Lesson4.task4.greenAlgae.Chlorophyta;
import Lesson4.task4.seedPlants.*;
import Lesson4.task4.vascularSpore.Equisetophyta;
import Lesson4.task4.vascularSpore.Lycopodiophyta;
import Lesson4.task4.vascularSpore.Pteridophyta;

public class Solution {

    public static void main(String[] args) {

        Anthocerotophyta ex1 = new Anthocerotophyta("Anthocerotophyta", 200);
        Bryophyta ex2 = new Bryophyta("Bryophyta", 10000);
        Marchantiophyta ex3 = new Marchantiophyta("Marchantiophyta", 6000);

        Charophyta ex4 = new Charophyta("Charophyta", 6000);
        Chlorophyta ex5 = new Chlorophyta("Chlorophyta", 20000);

        Cycadophyta ex6 = new Cycadophyta("Cycadophyta", 160);
        Ginkgophyta ex7 = new Ginkgophyta("Ginkgophyta", 1);
        Gnetophyta ex8 = new Gnetophyta("Gnetophyta", 70);
        Magnoliophyta ex9 = new Magnoliophyta("Magnoliophyta", 281821);
        Pinophyta ex10 = new Pinophyta("Pinophyta", 630);

        Equisetophyta ex11 = new Equisetophyta("Equisetophyta", 15);
        Lycopodiophyta ex12 = new Lycopodiophyta("Lycopodiophyta", 1200);
        Pteridophyta ex13 = new Pteridophyta("Pteridophyta", 11000);

        System.out.println(ex1.toString());
        System.out.println(ex2.toString());
        System.out.println(ex3.toString());
        System.out.println(ex4.toString());
        System.out.println(ex5.toString());
        System.out.println(ex6.toString());
        System.out.println(ex7.toString());
        System.out.println(ex8.toString());
        System.out.println(ex9.toString());
        System.out.println(ex10.toString());
        System.out.println(ex11.toString());
        System.out.println(ex12.toString());
        System.out.println(ex13.toString());

    }

}
