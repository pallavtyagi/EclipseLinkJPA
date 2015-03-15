package com.pallav.jpa_work;

import javax.persistence.Persistence;

import org.eclipse.persistence.jpa.JpaHelper;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println(Persistence.createEntityManagerFactory("jpa_work").isOpen());
        
        JpaQueryBuilder jb = new JpaQueryBuilder();
        jb.executeQuery();
        
        
    }
    
    
    
}
