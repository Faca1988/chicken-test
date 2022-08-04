/**
 *
 * @author facundo.campos
 */
package com.accenture.chickentest.domain;

import com.accenture.chickentest.exceptions.LocationException;

public class Location {

    private int idLocation;
    private double lat;
    private final int worldId;
    private double lng;
    private static int locationCounter;

    // Simulan llamada a la propiedad de World
    private final double max_lat;
    private final double max_lng;

    public Location(int idWorld, double lat, double lng) throws LocationException {

        // Simulan llamada a la propiedad de World
        final double DBCALL_GET_WORLD_MAX_LAT = 100;
        final double DBCALL_GET_WORLD_MAX_LNG = 100;
        boolean checkLat = lat < 0 || lat > DBCALL_GET_WORLD_MAX_LAT;
        boolean checkLng = lng < 0 || lng > DBCALL_GET_WORLD_MAX_LNG;
        if (checkLat && checkLng) {
            System.out.println("Error ocurred:");
            throw new LocationException("\nLng is out of range.Use a Nbr. between 0 and " + DBCALL_GET_WORLD_MAX_LNG + 
                                        "\nLat is out of range.Use a Nbr. between 0 and " + DBCALL_GET_WORLD_MAX_LAT);
        } else if (checkLng) {
            System.out.println("Error ocurred:");
            throw new LocationException("\nLng is out of range.Use a Nbr. between 0 and " + DBCALL_GET_WORLD_MAX_LNG);
        } else if (checkLat){
            System.out.println("Error ocurred:");
            throw new LocationException("\nLat is out of range.Use a Nbr. between 0 and " + DBCALL_GET_WORLD_MAX_LAT);
        } 
        else {
            this.max_lat = lat;
            this.max_lng = lng;
        }
            this.idLocation = locationCounter++;
            this.worldId = idWorld;
    }

    public double getLat() {
        return this.lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public int getWorldId() {
        return this.worldId;
    }

    public double getLng() {
        return this.lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public int getIdLocation() {
        return this.idLocation;
    }

}
