package com.dkit.gd2.berktatar;


import java.util.Objects;

public class PrivateProperty extends Property
{
    public int numBed;
    public String propertyType;

    public PrivateProperty(int propertyID, String owner, String postcode, double sellingPrice, double area, String facilities, int numBed, String propertyType)
    {
        super(propertyID, owner, postcode, sellingPrice, area, facilities);
        this.numBed = numBed;
        this.propertyType = propertyType;
    }

    @Override
    public String toString() {

        return  "PrivateProperty{" +
                "propertyID='" + super.getPropertyID() + '\'' +
                ", owner=" + super.getOwner() +
                ", postcode=" + super.getPostcode() +
                ", sellingPrice=" + super.getSellingPrice() +
                ", area=" + super.getArea() +
                ", facilities=" + super.getFacilities() +
                ", numBed=" + numBed +
                ", propertyType=" + propertyType +
                '}';
    }


    public int numBed()
    {
        return numBed;
    }

    public String propertyType()
    {
        return propertyType;
    }
}
