/**
 * @(#)Person.java
 *
 * This is Person class it is an Instantiable Class
 * @author Alexander Nagel 
 * @version 1.00 2016/11/17
 */

import java.io.*;

public class Person implements Serializable{
	
	private String name;
	private int age;
	private String gender;

	/** no argument constructor method
	 @param  This is the no arguement constructor, 
	 it assigns the person variables default values*/
	 
    public Person()
    {	
    	this.name=name;
    	this.age=age;
    	this.gender=gender;
    	//this("no",0,'n');
    }
    
	/** Multiple argument constructor method
	 @param sets name to the Person name
	 @param sets agel to the Person age
	 @param sets gender to the Person gender */
	 
    public Person(String name,int age,String gender)
    {	
    	setName(name);
    	setAge(age);
    	setGender(gender);
    }
    
    /** Mutator method
	 @param name the name of the Person object*/
	 
    public void setName(String name)
    {
    	this.name=name;
    }
    
    /** Mutator method
	 @param age the age of the Person object*/
	 
    public void setAge(int age)
    {
    	this.age=age;
    }
    
    /** Mutator method
	 @param gender the gender of the Person object*/
	 
    public void setGender(String gender)
    {
    	this.gender=gender;
    }
    
    /** acessor method to return the Person object name
	 *@return the name of the Person object */
    public String getName()
    {
    	return name;
    }
    
    /** acessor method to return the Person object age
	 *@return the age of the Person object */
    public int getAge()
    {
    	return age;
    }
    /** acessor method to return the Person object gender
	 *@return the gender of the Person object */
    public String getGender()
    {
    	return gender;
    }
    
    /** toString method to return the Person object details
	 *@return the Person object details as a string */
    public String toString()
    {    		
    	return name + ", " + age + ", " + gender;		
    }   
    
}