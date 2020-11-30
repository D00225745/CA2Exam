package com.dkit.gd2.berktatar;

import java.net.PortUnreachableException;

/**
 * OOP - CA#2 - Nov 2020
 * Your Name: Berk Tatar
 * <p>
 * Your GitHub link: https://github.com/D00225745/CA2Exam
 */
public class App
{
    public static void main(String[] args)
    {
        System.out.println("\n*** Property & Private Property- - App ***");
        App app = new App();
        app.start();
    }

    public void start()
    {
        System.out.println("Q1 - some simple tests");

        Property p1 = new Property(1, "Mary Smith", "A91AB12", 255000, 130, "mains water, electricity, freehold, private access ");
        System.out.println("Property p1 details:");
        System.out.println(p1.getPropertyID() + " : " + p1.getOwner() + " : " + p1.getPostcode() + " : " + p1.getSellingPrice() + " : " + p1.getArea() + " : " + p1.getFacilities());


        Property p2 = new Property(2, "Mary Smith", "A91AB12", 0, 130, "mains water, electricity, freehold, private access ");
        System.out.println( "Property p2 details without sellingPrice:" );
        System.out.println(p2.getPropertyID() + " : " + p2.getOwner() + " : " + p2.getPostcode() + " : " + p2.getSellingPrice() + " : " + p2.getArea() + " : " + p2.getFacilities());



        System.out.println("Q2 - tests");


        System.out.println("Q3 - tests");

        PrivateProperty p3 = new PrivateProperty(3,"Mark Smith", "A92BC13", 455000, 160, "mains water, electricity, freehold, private access ", 3, "Apartment, Semi-D, Detached");
        System.out.println("Private Property p3 details:");
        System.out.println(p3.getPropertyID() + " : " + p3.getOwner() + " : " + p3.getPostcode() + " : " + p3.getSellingPrice() + " : " + p3.getArea() + " : " + p3.getFacilities() + " : " + p3.numBed() + " : " + p3.propertyType());

        System.out.println("Q4 - tests");


    }
}
