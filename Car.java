import java.io.*;

/**
 * @(#)Car.java
 *
 *
 * @author 
 * @version 1.00 2016/11/17
 */


public class Car implements Serializable{
	private RegNo regNo;
	private String brand;
	private String model;
	private int engSize;
	private String fuel;
	private int co2;
	private double value;
	private Person owner;
	String motorTax;
	String euro = "\u20ac";

    public Car() {
    	regNo = new RegNo();
	    brand = "No Brand Specified";
	    model = "No Model Specified";
	    engSize = 0;
	    fuel = "No Fuel Type Specified";
	    co2 = 0;
	    value = 0.0f;
	    owner = new Person();
	    
    }
    public Car(int day,int month,String year,String location,String brand,String model,int engSize,String fuel,int co2,double value,String name,int age,String gender) {
    	regNo = new RegNo(day,month,year,location);
    	setBrand(brand);
    	setModel(model);
    	setEngSize(engSize);
    	setFuel(fuel);
    	setCo2(co2);
    	setValue(value);
    	owner = new Person(name,age,gender);
    	
    }
    public Car(String brand,String model,int engSize,String fuel,int co2,double value,Person owner,RegNo regNo) {
    	setBrand(brand);
    	setModel(model);
    	setEngSize(engSize);
    	setFuel(fuel);
    	setCo2(co2);
    	setValue(value);
    	setOwner(owner);
    	setRegNo(regNo);
    	
    }
    
    //--------------------------------------------------------
    public void setRegNo(int day,int month,String year,String location)
    {
    	regNo.setDay(day);
  	    regNo.setMonth(month);
  	    regNo.setYear(year);
  	    regNo.setLocation(location);
   	
    }
    public void setRegNo(RegNo regNo)
    {
  	    this.regNo=regNo;
  	}
    public void setBrand(String brand)
    {
    	this.brand=brand;
    }
    public void setModel(String model)
    {
    	this.model=model;
    }
    public void setEngSize(int engSize)
    {
    	this.engSize=engSize;
    }
    public void setFuel(String fuel)
    {
    	this.fuel=fuel;
    }
    public void setCo2(int co2)
    {
    	this.co2=co2;
    }
    public void setValue(double value)
    {
    	this.value=value;
    }
    public void setOwner(Person owner)
    {
  	    this.owner=owner;
  	}
  	
  	public void setOwner(String name,int age,String gender)
    {
  	    owner.setName(name);
  	    owner.setAge(age);
  	    owner.setGender(gender);
  	}
  	
    //---------------------------------------------------------
    public String getBrand()
    {
    	return brand;
    }
    public String getModel()
    {
    	return model;
    }
    public float getEngSize()
    {
    	return engSize;
    }
    public String getFuel()
    {
    	return fuel;
    }
    public int  getCo2()
    {
    	return co2;
    }
    public double getValue()
    {
    	return value;
    }
    public Person getOwner()
    {
	     return owner;
    } 
    public RegNo getRegNo()
    {
	     return regNo;
    } 
    //----------------------------------------------------------
    public String toString()
    {
    	
    		
    	    return "\n********************************************\n" + regNo + "\nCar Brand: " + brand + "\nCar Model: " + model + "\nEngine Size: " + engSize + "CC" +
    			"\nFuel Type: " + fuel + "\nCar Value: " + euro + value + "\nCo2 Emission : " + co2 + " g/km" +
    				"\nOwner: " + owner.toString() + "\n" + motorTaxRate();

    }
    
    public String motorTaxRate()
    {
    	int year = Integer.parseInt(regNo.getYear());
    	float engineSize = getEngSize();
    	int co2 = getCo2();
    	String motorTax = "";
    	
    	
    	
    	if (year <= 2008)
    	{
    		if(engineSize>=0 && engineSize <=1000)
    		{
    			motorTax = ("Your anual Motor Tax is: " + euro + 199);
    		}
    		else if(engineSize<=1100)
    		{
    			motorTax = ("Your anual Motor Tax is: " + euro + 299);
    		}
    		else if(engineSize<=1200)
    		{
    			motorTax = ("Your anual Motor Tax is: " + euro + 330);
    		}
    		else if(engineSize<=1300)
    		{
    			motorTax = ("Your anual Motor Tax is: " + euro + 358);
    		}
    		else if(engineSize<=1400)
    		{
    			motorTax = ("Your anual Motor Tax is: " + euro + 385);
    		}
    		else if(engineSize<=1500)
    		{
    			motorTax = ("Your anual Motor Tax is: " + euro + 413);
    		}
    		else if(engineSize<=1600)
    		{
    			motorTax = ("Your anual Motor Tax is: " + euro + 330);
    		}
    		else if(engineSize<=1700)
    		{
    			motorTax = ("Your anual Motor Tax is: " + euro + 544);
    		}
    		else if(engineSize<=1800)
    		{
    			motorTax = ("Your anual Motor Tax is: " + euro + 636);
    		}
    		else if(engineSize<=1900)
    		{
    			motorTax = ("Your anual Motor Tax is: " + euro + 673);
    		}
    		else if(engineSize<=2000)
    		{
    			motorTax = ("Your anual Motor Tax is: " + euro + 710);
    		}
    		else if(engineSize<=2100)
    		{
    			motorTax = ("Your anual Motor Tax is: " + euro + 906);
    		}
    		else if(engineSize<=2200)
    		{
    			motorTax = ("Your anual Motor Tax is: " + euro + 951);
    		}
    		else if(engineSize<=2300)
    		{
    			motorTax = ("Your anual Motor Tax is: " + euro + 994);
    		}
    		else if(engineSize<=2400)
    		{
    			motorTax = ("Your anual Motor Tax is: " + euro + 1034);
    		}
    		else if(engineSize<=2500)
    		{
    			motorTax = ("Your anual Motor Tax is: " + euro + 1080);
    		}
    		else if(engineSize<=2600)
    		{
    			motorTax = ("Your anual Motor Tax is: " + euro + 1294);
    		}
    		else if(engineSize<=2700)
    		{
    			motorTax = ("Your anual Motor Tax is: " + euro + 1345);
    		}
    		else if(engineSize<=2800)
    		{
    			motorTax = ("Your anual Motor Tax is: " + euro + 1391);
    		}
    		else if(engineSize<=2900)
    		{
    			motorTax = ("Your anual Motor Tax is: " + euro + 1443);
    		}
    		else if(engineSize<=3000)
    		{
    			motorTax = ("Your anual Motor Tax is: " + euro + 1494);
    		}
    		else
    		{
    			motorTax = ("Your anual Motor Tax is: " + euro + 1809);
    		}
    		
    	}
    	else 
    	{
    		if(co2<=0)
    		{
    				motorTax = ("Your anual Motor Tax is: " + euro + 120);
    		}
    		else if(co2<=80)
    		{
    				motorTax = ("Your anual Motor Tax is: " + euro + 170);
    		}
    		else if(co2<=100)
    		{
    				motorTax = ("Your anual Motor Tax is: " + euro + 180);
    		}
    		else if(co2<=110)
    		{
    				motorTax = ("Your anual Motor Tax is: " + euro + 190);
    		}
    		else if(co2<=120)
    		{
    				motorTax = ("Your anual Motor Tax is: " + euro + 200);
    		}
    		else if(co2<=130)
    		{
    				motorTax = ("Your anual Motor Tax is: " + euro + 270);
    		}
    		else if(co2<=140)
    		{
    				motorTax = ("Your anual Motor Tax is: " + euro + 280);
    		}
    		else if(co2<=155)
    		{
    				motorTax = ("Your anual Motor Tax is: " + euro + 390);
    		}
    		else if(co2<=170)
    		{
    				motorTax = ("Your anual Motor Tax is: " + euro + 570);
    		}
    		else if(co2<=190)
    		{
    				motorTax = ("Your anual Motor Tax is: " + euro + 750);
    		}
    		else if(co2<=225)
    		{
    				motorTax = ("Your anual Motor Tax is: " + euro + 1200);
    		}
    		else
    		{
    				motorTax = ("Your anual Motor Tax is: " + euro + 2350);
    		}
    	}
    	return motorTax;
    }
    
}