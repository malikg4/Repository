package edu.clayton.csit.antlab.person;

/**
 *  A simple class for person 5
 *  returns their name and a
 *  modified string 
 *  
 *  @author Qu
 *  @version 1.1
 */
public class Person5 {
  /** Holds the persons real name */
  private String name;
  	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
  public Person5(String name) {
    name = "Gregory";
  }
  	/**
	 * This method should take the string
	 * input and return its characters rotated
	 * 2 positions.
	 * given "gtg123b" it should return
	 * "g123bgt".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
   
	 	  if (name.length()>2){
        char first = name.charAt(0);
        char second = name.charAt(1);
        name = (name.substring(1)).substring(1);
        return name + first + second;
	}
	return name;
   }
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
   Person5 g = new Person5 (name);

     public static void main (String[]args){
Person5 G = new Person5("Greg");
System.out.println(G.toString());
     
     }
   }

