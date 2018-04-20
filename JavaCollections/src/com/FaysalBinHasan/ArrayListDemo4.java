package com.FaysalBinHasan;
import java.util.*;
public class ArrayListDemo4 {
	  public static void main(String args[]) 
	  {
	    // create an array list
	    ArrayList<MyClass> al = new ArrayList<MyClass>();    
	    System.out.println("Initial size of al: " +  al.size());

	    // add elements to the array list
	    al.add(new MyClass("C"));
	    al.add(new MyClass("A"));
	    al.add(new MyClass("E"));
	    al.add(new MyClass("B"));
	    al.add(new MyClass("D"));
	    al.add(new MyClass("F"));
	    al.add(1,new MyClass("A2"));   
	    
	    System.out.println("Size of al after additions: " +  al.size());

	    // iterate
	    for(int i=0;i<al.size();i++)
	    {
	    	System.out.print(al.get(i).name+"  ");
	    }
	    System.out.println ("");
	    
	    // iterate
	    for(int i=0;i<al.size();i++)
	    {
	    	MyClass mc=al.get(i);
	    	System.out.print(mc.name+"  ");
	    }
	    System.out.println ("");   
	  }
}
class MyClass
{
	String  name;
	
	MyClass(String name)
	{
		this.name=name;		
	}	
}