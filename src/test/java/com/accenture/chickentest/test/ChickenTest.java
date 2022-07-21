/**
 *
 * @author facundo.campos
 */
package com.accenture.chickentest.test;

import com.accenture.chickentest.*;
import com.accenture.chickentest.cattle.*;
import com.accenture.chickentest.db.*;
import com.accenture.chickentest.exceptions.LocationException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChickenTest {

    public static void main(String[] args) {

        IDatabaseConnection db = new PostgreSQL(); // creates an obj of database type
        db.connect(); // connects to the db

        World world;
        Location location;
        Farm granjaA;

        Animal egg;
        Animal chicken;

        try {
            world = new World("MundoA", 3);
            location = new Location(world.getIdWorld(), -1, 0); // Contructor: verif. como construir condicionalmente Long<=World.with && Lat<=World.high
            granjaA = new Farm(world.getIdWorld(), location);

            egg = new Egg();
            chicken = new Chicken();

            granjaA.buy(egg);
            System.out.println("Report: ");
            granjaA.getReport();
            System.out.println("\n\n");

            granjaA.buy(chicken);
            System.out.println("Report:");
            granjaA.getReport();
            System.out.println("\n\n");

            granjaA.sell(egg);
            System.out.println("Report:");
            granjaA.getReport();
            System.out.println("\n\n");
        } catch (Exception ex) {
            // Logger.getLogger(ChickenTest.class.getName()).log(Level.SEVERE, null, ex);
            //ex.printStackTrace(System.out);
        }

        db.disconnect();// disconnect the db
    }
}
