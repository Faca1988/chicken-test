/**
 *
 * @author facundo.campos
 */

package com.accenture.chickentest.business;


public class Farm {
    
    private final int idFarm;
    private static int farmCounter;
    private final Location location;
    private final int worldId;
    private Egg[] eggs;
    private int eggsHave;
    private int chickensHave;
    private Chicken[] chickens;
    private double money;
    
    private final static int MAX_EGGS = 100;
    private final static int MAX_CHICKENS = 10;
    
    public Farm(int idWorld, Location location) {
        this.idFarm = farmCounter++;
        this.worldId = idWorld; 
        this.location =  location;
        this.eggs = new Egg[MAX_EGGS];
        this.chickens = new Chicken[MAX_CHICKENS];
        this.money = 100;
    }
    
    public void sell(Animal cattle) throws Exception{
        System.out.println("you sell a " + cattle.getSpecie());
        if (cattle instanceof Egg){ 
            for (int i = 0; i < this.eggsHave; i++) {
                if (cattle.equals( this.eggs[i] ) ){
                    this.eggs[i] = null;
                    System.out.println("Huevo Eliminado");
                    // reordenamiento del array eggs
                    this.eggsHave--;
                }
            }
            // sumar dinero
        }
        else if (cattle instanceof Chicken){
            for (int i = 0; i < this.chickensHave; i++) {
                if (cattle.equals( this.chickens[i] ) ){
                    this.chickens[i] = null;
                    System.out.println("Pollo Eliminado");
                    // reordenamiento del array chickens
                    this.chickensHave--;
                }
            }
            //sumar dinero
        }
        else{
            // sumar dinero
            System.out.println("Now you have a new pet but no more cattle");
        }
    }
    
    public void buy(Animal cattle) throws Exception{
        System.out.println("you buy a " + cattle.getSpecie());
        if (cattle instanceof Egg){ 
            this.eggs[this.eggsHave++] = (Egg)cattle;
            // restar dinero
        }
        else if (cattle instanceof Chicken){
            this.chickens[this.chickensHave++] = (Chicken)cattle;
            //restar dinero
        }
        else{
            // restar dinero
            System.out.println("Now you have a new pet but no more cattle");
        }
    }
    
    public void getReport(){
        System.out.println("Eggs: " + this.eggsHave);
        System.out.println("Chickens: " + this.chickensHave);
        System.out.println("Money: " + this.money);
    }
    
    
}
