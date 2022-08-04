/**
 *
 * @author facundo.campos
 */
package com.accenture.chickentest.domain;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Chicken extends Animal {

    private final int idChicken;

    // variables para testear id. reemplazar luego por id de la db
    private static int chickenCounter;

    public Chicken() {
        super();
        this.idChicken = chickenCounter++;//change it for a db call that assign the id
    }

    public Egg lay() {
        return new Egg();
    }

    @Override
    public int getId() throws Exception {
        int idChk = -1;
        try {
            idChk = this.idChicken;
        } catch (Exception e) {
            System.out.println("Error: \n" + e);
        }
        return idChk;
    }

    @Override
    public double getQuality() {
        return super.quality;
    }

    @Override
    public String getSpecie() {
        return super.specie;
    }

    @Override
    public String getSubSpecie() {
        return super.subSpecie;
    }

    @Override
    public int getAge() {
        return super.age;
    }

    @Override
    public double getLifeHope() {
        return super.lifeHope;
    }

    @Override
    public boolean isAlive() {
        return super.alive;
    }

    @Override
    public void addYearOfAge() {
        ++super.age;
    }

    @Override
    public void setAge(int age) {
        super.age = age;
    }

    @Override
    public void setSubSpecie(String sub) {
        super.subSpecie = sub;
    }

    @Override
    public void die() {
        super.alive = false;
        // otras acciones de muerte
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("Chicken{");
            sb.append("idChicken: ").append(getId());
            sb.append(", Quality: ").append(getQuality());
            sb.append(", Age: ").append(getAge());
            sb.append(", Life Hope: ").append(getLifeHope());
            sb.append(", Specie: ").append(getSpecie());
            sb.append(", subspecie: ").append(getSubSpecie());
            sb.append("}");
        } catch (Exception ex) {
            Logger.getLogger(Chicken.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + this.idChicken;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Chicken other = (Chicken) obj;
        return this.idChicken == other.idChicken;
    }

}
