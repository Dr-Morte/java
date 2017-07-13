// Container Implementor
// Richard Padilla III
// 07/07/2017

import java.util.*;
import java.lang.Math.*;

/*
THIS PROGRAM IS INTENDED TO LEARN HOW TO USE CONTAINERS,
SPECIFICALLY HASHMAP AND ARRAYLIST BETTER.

THE USER WILL INPUT A STRING TO GUESS FROM

THE HASHMAP WILL THEN BE ASSIGNED THE KEYS FROM THE ARRAYLIST.

THE USER WILL THEN BE SHOWN A LIST OF KEYS,
AND THEN BE ABLE TO INPUT A KEY AND SEE THE CORRESPONDING VALUE.

IT WOULD BE COOL TO EVENTUALLY HAVE THE USER ENTER A SENTENCE,
PARSE THE SENTENCE INTO WORDS, AND THEN HAVE THE WORDS BE MAPPED
TO A HASHMAP. 

WHICH THE USER COULD THEN PICK A WORD THAT WOULD BE THE WINNING WORD,
AND THEN TRY TO GUESS THE WORD FROM THE GENERATED KEYS. 
*/

public class hashgame{
	
	public static void main(String args[]){

		//Boolean to test if the user won or not
		  boolean game_over = false;
		
		//LIST TO HOLD RANDOMLY GENERATED KEYS
		ArrayList<Double> keyHolder = new ArrayList<Double>();

		//String to hold the sentence
		String user_in;
		double user_try; //double to get user try on the game

		//String array to hold the parsed user input
		String[] mySplit;		

		//HASH MAP THAT I WANTED TO IMPLEMENT SO BADLY
		HashMap <Double,String> hash = new HashMap<Double,String>();
		
		//NEW INPUT SCANNER FOR USER. PG 641, Java Programming Language, 4th ed.	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a sentence to begin the game: ");
		user_in = in.nextLine();
		
		//Parsing the string by whitespace
		mySplit = user_in.split("\\s+");
		
		//set the game key to be a random word from the user input
		double game_key = Math.floor((Math.random()*100))%mySplit.length;
		
		//sets the hashmap size based on the user input	
		int KEY_LIST_SIZE = mySplit.length;
		
		//Generates a list of key values. Should set KEY_LIST to something the user inputs
		for(int i=0;i<KEY_LIST_SIZE;i++){
			keyHolder.add(Math.floor(Math.random()*100*100)/100);//Sets elements to a random number
		}
	
		//supposed to populate the hashmap	
		for(int i=0;i<KEY_LIST_SIZE;i++){
			hash.put(keyHolder.get(i),mySplit[i]);
		}
		
		while(game_over != true){
			System.out.println(" Try to guess which key matches to the WINNING WORD \"" + mySplit[(int)game_key]  + "\" : ");
			for(int i=0;i<keyHolder.size();i++){
				System.out.println(keyHolder.get(i));
			}
			System.out.print("Your guess is : ");	
			user_try = in.nextDouble();
			
			//if the user wins, let them know, and end the game	
			if(hash.get(user_try) == mySplit[(int)game_key]){
				System.out.println("\n\nCONGRATULATIONS!!! YOU ARE A WINNER!! :D\n");
				game_over = true;
				
			}
			//otherwise, tell them they did not win, adjust the keyholder, and try again
			else{
				System.out.println("\n\nYou failure of a human being...\n");
				for(int i=0;i<keyHolder.size();i++){
					if(keyHolder.get(i) == user_try){
						keyHolder.remove(i);	
					}
				}
			}
		}
		
		//show the user a list of keys
		//the user will guess a key
		//if the key is not the word, then delete it from the arraylist and try again
		
	}
}
