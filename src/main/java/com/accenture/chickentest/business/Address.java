/**
 *
 * @author facundo.campos
 */
package com.accenture.chickentest.business;

import java.util.*;

public class Address {
    private final int idAddress;
    private String street;
    private int streetNbr;
    private String city;
    private String state;
    private String country;
    private String zipCode;
    private double lat;
    private double lng;

    public Address() {
        this.idAddress = 1111;//set from DB
    }

    public String getStreet() { return this.street; }

    public void setStreet(String street) { this.street = street; }

    public int getStreetNbr() { return this.streetNbr; }

    public void setStreetNbr(int streetNbr) { this.streetNbr = streetNbr; }

    public String getCity() { return this.city; }

    public void setCity(String city) { this.city = city; }

    public String getState() { return this.state; }

    public void setState(String state) { this.state = state; }

    public String getCountry() { return this.country; }

    public void setCountry(String country) { this.country = country; }

    public String getZipCode() { return this.zipCode; }

    public void setZipCode(String zipCode) { this.zipCode = zipCode; }

    public double getLat() { return this.lat; }

    public void setLat(double lat) { this.lat = lat; }

    public double getLng() { return this.lng; }

    public void setLng(double lng) { this.lng = lng; }

    public int getIdAddress() { return this.idAddress; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append("idAddress=").append(idAddress);
        sb.append(", street=").append(street);
        sb.append(", streetNbr=").append(streetNbr);
        sb.append(", city=").append(city);
        sb.append(", state=").append(state);
        sb.append(", country=").append(country);
        sb.append(", zipCode=").append(zipCode);
        sb.append(", lat=").append(lat);
        sb.append(", lng=").append(lng);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.idAddress;
        hash = 23 * hash + Objects.hashCode(this.street);
        hash = 23 * hash + this.streetNbr;
        hash = 23 * hash + Objects.hashCode(this.city);
        hash = 23 * hash + Objects.hashCode(this.state);
        hash = 23 * hash + Objects.hashCode(this.country);
        hash = 23 * hash + Objects.hashCode(this.zipCode);
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.lat) ^ (Double.doubleToLongBits(this.lat) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.lng) ^ (Double.doubleToLongBits(this.lng) >>> 32));
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
        final Address other = (Address) obj;
        if (this.idAddress != other.idAddress) {
            return false;
        }
        if (this.streetNbr != other.streetNbr) {
            return false;
        }
        if (Double.doubleToLongBits(this.lat) != Double.doubleToLongBits(other.lat)) {
            return false;
        }
        if (Double.doubleToLongBits(this.lng) != Double.doubleToLongBits(other.lng)) {
            return false;
        }
        if (!Objects.equals(this.street, other.street)) {
            return false;
        }
        if (!Objects.equals(this.city, other.city)) {
            return false;
        }
        if (!Objects.equals(this.state, other.state)) {
            return false;
        }
        if (!Objects.equals(this.country, other.country)) {
            return false;
        }
        return Objects.equals(this.zipCode, other.zipCode);
    }
    
    
}
