/**
 *
 * @author facundo.campos
 *
 */
package com.accenture.chickentest.business;

import com.accenture.chickentest.business.Farm;
import java.time.LocalDateTime;

public class World {
  private final int idWorld;
  private String name;
  private Farm[] farms;
  private final static double highSize = 100; // const q debe reemplazarse por llamada a db
  private final static double withSize = 100; // const q debe reemplazarse por llamada a db
  private LocalDateTime dateTime;
  
  private static int worldCounter;
  
  private World(){
      this.idWorld = worldCounter++;
      this.dateTime = LocalDateTime.now();// modificar cambio de tiempo (Chrone)
  }
  
  public World(String name, int farmsAllowed){
      this();
      
  }

    public Farm[] getFarms() { return this.farms; }

    public void setFarms(Farm[] farms) { this.farms = farms; }

    public LocalDateTime getDateTime() { return this.dateTime; }

    public void setDateTime(LocalDateTime dateTime) { this.dateTime = dateTime; }

    public int getIdWorld() { return this.idWorld; }

    public String getName() { return this.name; }

    public double getHighSize() { return this.highSize; }

    public double getWithSize() { return this.withSize; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("World{");
        sb.append("idWorld: ").append(this.idWorld);
        sb.append(", name: ").append(this.name);
        sb.append(", farms:").append(this.farms);
        sb.append(", highSize: ").append(this.highSize);
        sb.append(", withSize: ").append(this.withSize);
        sb.append(", dateTime: ").append(this.dateTime);
        sb.append("}");
        return sb.toString();
    }
    
    
  
}
