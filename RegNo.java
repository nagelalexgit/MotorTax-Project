/**
 * @(#)RegNo.java
 *
 *
 * @author Alexand
 * @version 1.00 2016/11/24
 */

import java.io.*;

public class RegNo implements Serializable{
	
	private int day,month;
	private String year, location, registration, regCode;
		
		
    public RegNo() 
    {
    	this.day = day;
    	this.month = month;
    	this.year = year;
    	this.location = location;
    }
    public RegNo(int day,int month,String year,String location)
    {	
    	setDay(day);
    	setMonth(month);
    	setYear(year);
    	setLocation(location);
    }
    //===================================================================
    public void setDay(int day)
    {
    	this.day=day;
    }
    public void setMonth(int month)
    {
    	this.month=month;
    }
    public void setYear(String year)
    {
    	this.year=year;
    }
    public void setLocation(String location)
    {
    	this.location=location;
    }
    
    
    //===================================================================
    public int getDay()
    {
    	return day;
    }
    public int getMonth()
    {
    	return month;
    }
    public String getYear()
    {
    	return year;
    }
    public String getLocation()
    {
    	return location;
    }
    //===================================================================
    public String toString()
    {
    
    	switch(location){
    		
    		case "Kerry" : regCode ="-KY-";
    		break;
    	    case "Dublin" : regCode ="-D-";
    		break;
    		case "Cork" : regCode ="-C-";
    		break;
    		case "Clare" : regCode ="-CE-";
    		break;
    		case "Galway" : regCode ="-G-";
    		break;
    		case "Waterford" : regCode ="-W-";
    		break;
    		case "Mayo" : regCode ="-MO-";
    		break;
    		case "Donegal" : regCode ="-DL-";
    		break;
    		default: regCode = "Invalid";
                     break;	
    
    	}
    	
    	
      return year.substring(2)+regCode+(day+month)+String.format("%3d",((int)(Math.random()*1000+1)));
    }
    
}