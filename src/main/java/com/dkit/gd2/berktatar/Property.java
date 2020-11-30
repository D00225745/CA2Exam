package com.dkit.gd2.berktatar;

import java.util.ArrayList;
import java.util.Objects;

public class Property
{
    private int propertyID;
    private String owner;
    private String postcode;
    private double sellingPrice;
    private double area;
    private String facilities;

    //Constructor
    public Property(int propertyID, String owner, String postcode, double sellingPrice, double area, String facilities)
    {
        this.propertyID = propertyID;
        this.owner = owner;
        this.postcode = postcode;
        this.sellingPrice = sellingPrice;
        this.area = area;
        this.facilities = facilities;
    }

    //Overload Constructor
    //Property()
    //{
    //  this.propertyID = propertyCode;
    //  this.owner = name;
    //  this.postcode = postnum;
    //  this.sellingPrice = num1;
    //  this.area = place;
    // }

    public int getPropertyID()
    {
        return propertyID;
    }

    public void setPropertyID(int propertyID)
    {
        this.propertyID = propertyID;
    }

    public String getOwner()
    {
        return owner;
    }

    public void setOwner(String owner)
    {
        this.owner = owner;
    }

    public String getPostcode()
    {
        return postcode;
    }

    public void setPostcode(String postcode)
    {
        this.postcode = postcode;
    }

    public double getSellingPrice()
    {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice)
    {
        this.sellingPrice = sellingPrice;
    }

    public double getArea()
    {
        return area;
    }

    public void setArea(double area)
    {
        this.area = area;
    }

    public String getFacilities()
    {
        return facilities;
    }

    public void setFacilities(String facilities)
    {
        this.facilities = facilities;
    }



    //addFacility()
   // {

   // }

   // removeFacility()
   // {

  //  }


    //Overload the Constructor
    //public static void main(String args[])
    //{
    //    Property p1 = new Property(1, "Mary Smith", "A91AB12", "unknown",130);
    //    System.out.println("Property code is: "+propertyCode.getPropertyID());
    //    System.out.println("Owner name is: "+ name.getOwner());
    //    System.out.println("Post code is: "+ postnum.getPostcode());
    //    System.out.println("Selling price is is: "+ num1.getSellingPrice());
    //    System.out.println("Selling price is is: "+ place.getArea());
    // }

}
