/**
 *
 * @author facundo.campos
 */

package com.accenture.chickentest.business;

public class Egg extends Animal{
    private final int idEgg;
    
    // variables para testear id. reemplazar luego por id de la db
    private static int eggCounter;
    
    public Egg(){
        super();
        this.idEgg = eggCounter++;//change it for a db call that assign the id
    }
    
    public Chicken hatch(){
        this.die();
        return new Chicken();
    }
    
    @Override
    public int getId() { return this.idEgg; }

    @Override
    public double getQuality() { return super.quality; }

    @Override
    public String getSpecie() { return super.specie; }

    @Override
    public String getSubSpecie() { return super.subSpecie; }

    @Override
    public int getAge() { return super.age; }

    @Override
    public double getLifeHope() { return super.lifeHope; }

    @Override
    public boolean isAlive() { return super.alive; }
    
    @Override
    public void addYearOfAge() {  ++super.age;  }

    @Override
    public void setAge(int age) { super.age = age; }

    @Override
    public void setSubSpecie(String sub) { super.subSpecie = sub; }
    
    @Override
    public void die() { 
        super.alive = false;
        // otras acciones de muerte
    }    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Egg{");
        sb.append("idEgg: ").append(getId());
        sb.append(", Quality: ").append(getQuality());
        sb.append(", Age: ").append(getAge());
        sb.append(", Life Hope: ").append(getLifeHope());
        sb.append(", Specie: ").append(getSpecie());
        sb.append(", subspecie: ").append(getSubSpecie());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.idEgg;
        return hash;
    }

    @Override
    public boolean equals(Object obj) { // compara el contenido de dos obj
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Egg other = (Egg) obj;
        return this.idEgg == other.idEgg;
    }
    
    
}
