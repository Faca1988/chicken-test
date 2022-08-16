/**
 *
 * @author facundo.campos
 */
package com.accenture.chickentest.business;

import java.util.Objects;

public class Phone {
    private final int idPhone;
    private Long number;
    private int countryCode;
    private int stateCode;

    public Phone() {
        this.idPhone = 1111;//set from DB
    }

    public Long getNumber() { return this.number; }

    public void setNumber(Long number) { this.number = number; }

    public int getCountryCode() { return this.countryCode; }

    public void setCountryCode(int countryCode) { this.countryCode = countryCode; }

    public int getStateCode() { return this.stateCode; }

    public void setStateCode(int stateCode) { this.stateCode = stateCode; }

    public int getIdPhone() { return this.idPhone; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Phone{");
        sb.append("idPhone=").append(idPhone);
        sb.append(", number=").append(number);
        sb.append(", countryCode=").append(countryCode);
        sb.append(", stateCode=").append(stateCode);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + this.idPhone;
        hash = 83 * hash + Objects.hashCode(this.number);
        hash = 83 * hash + this.countryCode;
        hash = 83 * hash + this.stateCode;
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
        final Phone other = (Phone) obj;
        if (this.idPhone != other.idPhone) {
            return false;
        }
        if (this.countryCode != other.countryCode) {
            return false;
        }
        if (this.stateCode != other.stateCode) {
            return false;
        }
        return Objects.equals(this.number, other.number);
    }
    
}
