// Container Implementor
// Richard Padilla III
// 07/07/2017

import java.util.*;
import java.lang.Math.*;

/*
THIS PROGRAM IS INTENDED TO LEARN HOW TO USE CONTAINERS,
SPECIFICALLY HASHMAP AND ARRAYLIST BETTER.

THE USER WILL SELECT A NUMBER OF KEYS TO GENERATE, 
AND THEN A LIST OF KEYS WILL BE MADE.

THE HASHMAP WILL THEN BE ASSIGNED THE KEYS FROM THE ARRAYLIST.

THE USER WILL THEN BE SHOWN A LIST OF KEYS,
AND THEN BE ABLE TO INPUT A KEY AND SEE THE CORRESPONDING VALUE.

IT WOULD BE COOL TO EVENTUALLY HAVE THE USER ENTER A SENTENCE,
PARSE THE SENTENCE INTO WORDS, AND THEN HAVE THE WORDS BE MAPPED
TO A HASHMAP. 

WHICH THE USER COULD THEN PICK A WORD THAT WOULD BE THE WINNING WORD,
AND THEN TRY TO GUESS THE WORD FROM THE GENERATED KEYS. 
*/

public class hashrunner{
	
	public static void main(String args[]){

		//LIST TO HOLD RANDOMLY GENERATED KEYS
		ArrayList<Double> keyHolder = new ArrayList<Double>();
		
		//HASH MAP THAT I WANTED TO IMPLEMENT SO BADLY
		HashMap <Double,String> hash = new HashMap<Double,String>();
		
		//NEW INPUT SCANNER FOR USER. PG 641, Java Programming Language, 4th ed.	
		Scanner in = new Scanner();

		
		//KEY I MADE FOR TESTING. NOT NEEDED IN THE FINAL IMPLEMENTATION
		double k1 = Math.random()*10;

		int KEY_LIST = 20;


		//Generates a list of key values. Should set KEY_LIST to something the user inputs
		for(int i=0;i<KEY_LIST;i++){
			keyHolder.add(Math.random()*100);//Sets elements to a random number
		}
		

		//Routine for printing out the values in the key list
		for(int i=0;i<KEY_LIST;i++){
			System.out.println(keyHolder.get(i));
		}

		//puts two values in hash
		hash.put(keyHolder.get(0),"Howdy");
		hash.put(keyHolder.get(1),"Texas A&M!");
	
		//Should print out the first two values in hash	
		System.out.println(hash.get(keyHolder.get(0)) + " " + hash.get(keyHolder.get(1)));
	}
}
