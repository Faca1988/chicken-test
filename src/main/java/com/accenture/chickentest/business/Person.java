/**
 *
 * @author facundo.campos
 */
package com.accenture.chickentest.business;

import java.util.*;

public class Person {
    private final int idPerson;
    private String name;
    private String lastname;
    private Date birthday;
    private String unqDocNbr;
    private boolean alive;
    private Address address;
    private Phone phone;
    
    protected Person(){
        this.idPerson = 1111; // insertar valor desde la BD
    }

    public Address getAddress() { return this.address; }

    public void setAddress(Address address) { this.address = address; }

    public Phone getPhone() { return this.phone; }

    public void setPhone(Phone phone) { this.phone = phone; }

    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }

    public String getLastname() { return this.lastname; }

    public void setLastname(String lastname) { this.lastname = lastname; }

    public Date getBirthday() { return this.birthday; }

    public void setBirthday(Date birthday) { this.birthday = birthday; }

    public String getUnqDocNbr() { return this.unqDocNbr; }

    public void setUnqDocNbr(String unqDocNbr) { this.unqDocNbr = unqDocNbr; }

    public boolean isAlive() { return this.alive; }

    public void setAlive(boolean alive) { this.alive = alive; }

    public int getIdPerson() { return this.idPerson; }
    
    public void die(){ this.alive = false; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person{");
        sb.append("id=").append(idPerson);
        sb.append(", name=").append(name);
        sb.append(", lastname=").append(lastname);
        sb.append(", birthday=").append(birthday);
        sb.append(", unqDocNbr=").append(unqDocNbr);
        sb.append(", alive=").append(alive);
        sb.append(", address=").append(address);
        sb.append(", phone=").append(phone);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.idPerson;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.lastname);
        hash = 89 * hash + Objects.hashCode(this.birthday);
        hash = 89 * hash + Objects.hashCode(this.unqDocNbr);
        hash = 89 * hash + (this.alive ? 1 : 0);
        hash = 89 * hash + Objects.hashCode(this.address);
        hash = 89 * hash + Objects.hashCode(this.phone);
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
        final Person other = (Person) obj;
        if (this.idPerson != other.idPerson) {
            return false;
        }
        if (this.alive != other.alive) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.lastname, other.lastname)) {
            return false;
        }
        if (!Objects.equals(this.unqDocNbr, other.unqDocNbr)) {
            return false;
        }
        if (!Objects.equals(this.birthday, other.birthday)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        return Objects.equals(this.phone, other.phone);
    }
    
    
    
    
    
}
