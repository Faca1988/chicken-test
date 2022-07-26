/**
 *
 * @author facundo.campos
 */
package com.accenture.chickentest.test;

import com.accenture.chickentest.business.World;
import com.accenture.chickentest.business.Farm;
import com.accenture.chickentest.business.Location;
import com.accenture.chickentest.business.Egg;
import com.accenture.chickentest.business.Chicken;
import com.accenture.chickentest.business.Animal;
import com.accenture.chickentest.data.PostgreSQL;
import com.accenture.chickentest.data.IDataManagement;

public class ChickenTest {

    public static void main(String[] args) {
        
        final String resourceName = "ChickenTestData";
        IDataManagement db = new PostgreSQL(); // creates an obj of database type
        db = (PostgreSQL) db.openResource(resourceName); // connects to the db

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

        db.closeResource(resourceName);// disconnect the db
    }
}
