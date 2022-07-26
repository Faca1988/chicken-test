/**
 *
 * @author facundo.campos
 */

package com.accenture.chickentest.business;

public abstract class Animal {
        
    protected final double quality;
    protected int age;
    protected boolean alive;
    protected final String specie;
    protected String subSpecie;
    protected final double lifeHope;
    
    protected Animal(){
        this.quality = Math.random();
        this.alive = true;
        this.specie = this.getClass().getSimpleName();
        this.lifeHope = Math.random();
    } 
    
    public abstract int getId() throws Exception;    
    public abstract double getQuality() throws Exception;    
    public abstract String getSpecie() throws Exception;
    public abstract String getSubSpecie() throws Exception;
    public abstract void setSubSpecie(String sub) throws Exception;
    public abstract void addYearOfAge() throws Exception;
    public abstract void setAge(int age) throws Exception;
    public abstract int getAge() throws Exception;
    public abstract double getLifeHope() throws Exception;
    public abstract boolean isAlive() throws Exception;
    public abstract void die() throws Exception;    

}
