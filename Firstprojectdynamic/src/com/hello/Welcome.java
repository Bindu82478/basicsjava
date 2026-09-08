package com.hello;

public class Welcome {
	public static void main(String[] args) throws ClassNotFoundException{
	System.out.println("welcoem to starting good morning");
	//bootstrap class loader
	Class.forName("java.lang.String");
	//path 
	//bootstarp calss laoder, it takes from path where we have jdk javahoem
	Class.forName("java.lang.System");
	//boot strap class loader as iyt is ftrom default and from jdk
	//applicationcalss loader from it si from user define class  , it is from classpath 
	System.out.println("HIIIIIIIII");
	//Class.forName("com.hello.Student");
	System.out.println("HIIIIIIIII");
	
	//Class.forName("com.hello.studentt");
	//application calss loader from third party jars loads from secondary to primary inclasspath
	Class.forName("java.util.Scanner");
	//Class.forName("com.hello.Student");
	//classpath has other java java related in to project
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("final need to learmn more");
	}

}
