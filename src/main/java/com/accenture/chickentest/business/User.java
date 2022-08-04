/**
 *
 * @author facundo.campos
 */
package com.accenture.chickentest.business;

import com.accenture.chickentest.data.*;
import java.util.*;

public class User extends Person {
    private final int idUser;
    private String email;
    private String userName;
    private String password;
    private int personId;

    private User() {
        super();
        IDataManagement db = new PostgreSQL();
        this.idUser = 1111; //db call for set it 
    }
    
    public User(String email, String username, String psw){
        this();
        this.email = email;
        this.userName = username;
        this.password = psw;
        this.personId = super.getIdPerson();
    }

    @Override
    public String getName() { return super.getName(); }

    @Override
    public void setName(String name) { super.setName(name); }

    @Override
    public String getLastname() { return super.getLastname(); }

    @Override
    public void setLastname(String lastname) { super.setLastname(lastname); }

    @Override
    public Date getBirthday() { return super.getBirthday(); }

    @Override
    public void setBirthday(Date birthday) { super.setBirthday(birthday); }

    @Override
    public String getUnqDocNbr() { return super.getUnqDocNbr(); }

    @Override
    public void setUnqDocNbr(String unqDocNbr) { super.setUnqDocNbr(unqDocNbr); }

    @Override
    public boolean isAlive(){ return super.isAlive(); }

    @Override
    public void die(){ super.die(); }

    @Override
    public void setAddress(Address address){ super.setAddress(address); }

    @Override
    public Address getAddress(){ return super.getAddress(); }

    @Override
    public void setPhone(Phone phone){ super.setPhone(phone); }

    @Override
    public Phone getPhone(){ return super.getPhone(); }

    public String getEmail() { return this.email; }

    public void setEmail(String email) { this.email = email; }

    public String getUserName() { return this.userName; }

    public void setUserName(String userName) { this.userName = userName; }

    public String getPassword() { return this.password; }

    public void setPassword(String password) { this.password = password; }

    public int getPersonId() { return this.personId; }

    public void setPersonId(int personId) { this.personId = personId; }

    public int getIdUser() { return this.idUser; }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + this.idUser;
        hash = 61 * hash + Objects.hashCode(this.email);
        hash = 61 * hash + Objects.hashCode(this.userName);
        hash = 61 * hash + Objects.hashCode(this.password);
        hash = 61 * hash + this.personId;
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
        final User other = (User) obj;
        if (this.idUser != other.idUser) {
            return false;
        }
        if (this.personId != other.personId) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.userName, other.userName)) {
            return false;
        }
        return Objects.equals(this.password, other.password);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("User{");
        sb.append("idUser=").append(this.idUser);
        sb.append(", email=").append(this.email);
        sb.append(", userName=").append(this.userName);
        sb.append(", password=").append(this.password);
        sb.append(", personId=").append(this.personId);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
