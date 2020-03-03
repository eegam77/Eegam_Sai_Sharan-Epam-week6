package com.epam.collection_frameworks.Collection_frameworks;
import java.util.*;
//import java.io.*;
public class CustomCollectionList 
{
    public static void main( String[] args )
    {
    	ListFunctions myListobj=new ListFunctions();
    	char tobecontinue='y';
    	Scanner sc=new Scanner(System.in);
    	while(tobecontinue=='y')
    	{
	       System.out.println( "Enter an operation to be performed: \n 1) Insert Element \n 2)Delete Element \n 3)Fetch an element\n 4)print elements of a list");
	       
	       int optionSelected,index;
	       optionSelected=sc.nextInt();
	    	switch(optionSelected)
	    	{
	    	case 1:System.out.println("Enter the element:");
	    		   Object element=sc.next();
	    		   myListobj.add(element);break;
	    	case 2:System.out.println("Enter the index of element which is to be deleted:");
	    			 index=sc.nextInt();
	    			myListobj.deleteElement(index);break;
	    	case 3: System.out.println("Enter the index of the element which is to be fetched:");
	    			 index=sc.nextInt();
	    			myListobj.fetchingElement(index);break;
	    	case 4: myListobj.printingElements();break;
	    	default: System.out.println("Please enter correct option");
	    	}
	    	System.out.println("DO you want to continue:(Enter y for continue)");
	    	tobecontinue=sc.next(). charAt(0);
	    	
    	}
    	sc.close();
    }
}
