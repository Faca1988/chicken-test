/**
 *
 * @author facundo.campos
 */

package com.accenture.chickentest.db;

public interface IDatabaseConnection {
    public final static int MAX_REGS = 100;
    
    
    public abstract void connect(); // connect to the db
    public abstract void disconnect(); // disconnect to the db
    public abstract void post(Object obj) throws Exception; // create an obj in the db
    public abstract void put(Object obj) throws Exception; // update/replace an obj
    public abstract void patch(Object obj) throws Exception; //Update/modify an obj
    public abstract void delete(Object obj) throws Exception; //delete an obj
    public abstract Object get() throws Exception; // read and get an obj
    
}
