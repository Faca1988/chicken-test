/**
 *
 * @author facundo.campos
 */

package com.accenture.chickentest.data;

import com.accenture.chickentest.exceptions.*;
import java.util.List;

public interface IDataManagement {
    public final static int MAX_REGS = 100;
    
    public abstract Object openResource(String resourceName); // connect to the db
    public abstract void closeResource(Object resource); // disconnect to the db
    public abstract void create(Object resource, Object obj) throws DataAccessException; // create an obj in the db
    public abstract void replace(Object resource, Object obj) throws WriteDataException; // update/replace an obj
    public abstract void modify(Object resource, Object obj) throws WriteDataException; //Update/modify an obj
    public abstract void delete(Object resource, Object obj) throws DataAccessException; //delete an obj
    public abstract Object get() throws Exception; // read and get an obj
    public abstract String search(String fileName, String search) throws ReadDataException;
    public abstract List<Object> list(Object resource) throws ReadDataException;
    
}
