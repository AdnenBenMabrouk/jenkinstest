package com.jenkinstest.jenkinsapp;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	CalculMoyen calculMoyen = new CalculMoyen();
        System.out.println( "La moyenne est : "+calculMoyen.calcul(15.5, 13));
        System.out.println("You made it !!!!!!!!");
    }
}
