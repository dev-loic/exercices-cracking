package Part1;

import java.util.HashSet;

public class Ex11 {

	public static void main(String[] args) {
		// If it is possible to use other data structure, then use a HashSet to store character until you find a doublon
		String test1 = "aabc";
		System.out.println("TEST1 : aabc | expected=false | computed="+allUniqueCharacters(test1));
		String test2="";
		System.out.println("TEST1 : a | expected=true | computed="+allUniqueCharacters(test2));
		String test3="abcd";
		System.out.println("TEST1 : abcd | expected=true | computed="+allUniqueCharacters(test3));
		
		// If it is not possible to use other data structures then 
		// Solution 1 : Brute force method with double FOR but O(N^2)
		// Solution 2 : Sort the input String and then check for neighbors
	}
	
	
	
	// Using additional data structure HashSet
	static boolean allUniqueCharacters(String iChaine)
	{
		HashSet<Character> setCharacters = new HashSet<Character>();
		int sizeChaine = iChaine.length();
		boolean output=true;
		
		for(int i=0;i<sizeChaine;i++)
		{
			char curChar = iChaine.charAt(i);
			if(setCharacters.contains(curChar)) 
			{
				output = false;
				break;
			}
			else
				setCharacters.add(curChar);
		}
		return output;
	}
	

}
