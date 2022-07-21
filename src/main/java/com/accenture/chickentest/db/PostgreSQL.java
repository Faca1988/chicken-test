/**
 *
 * @author facundo.campos
 */

package com.accenture.chickentest.db;

public class PostgreSQL implements IDatabaseConnection{

    @Override
    public void post(Object obj) throws Exception {
        System.out.println("creating the obj in the db");
    }

    @Override
    public void put(Object obj) {
        System.out.println("Updated/Replace the object in the db");
    }

    @Override
    public void patch(Object obj) {
        System.out.println("Update/modify an obj");
    }

    @Override
    public void delete(Object obj) {
        System.out.println("Obj deleted from the db");
    }

    @Override
    public Object get() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void connect() {
        // throw new UnsupportedOperationException("Not supported yet.");
        System.out.println("Connected to the database");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected to the database");
    }
    
}
