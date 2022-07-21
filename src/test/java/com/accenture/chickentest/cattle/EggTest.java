/**
 *
 * @author facundo.campos
 */
package com.accenture.chickentest.cattle;

public class EggTest {

    public static void main(String[] args) {

        try {
            Animal eggTest = new Egg();
            Animal eggTest1 = new Egg();
            Animal eggTest2 = new Egg();
            Animal chicken = new Chicken();
            chicken.setSubSpecie("Marron");// throws ERR
            eggTest = ((Egg) eggTest).hatch();
            System.out.println(eggTest);
            System.out.println(eggTest1);
            System.out.println(eggTest2);
            System.out.println(chicken);
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }

    }
}
