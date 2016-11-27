/*

Longest Common Prefix

Write a function to find the longest common prefix string amongst an array of strings.

Longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.

As an example, longest common prefix of "abcdefgh" and "abcefgh" is "abc".

Given the array of strings, you need to find the longest S which is the prefix of ALL the strings in the array.

Example:

Given the array as:
[
  "abcdefgh",

  "aefghijk",

  "abcefgh"
]

The answer would be “a”.

*/



import java.util.*;
import java.lang.*;
import java.io.*;


public class LongestCommonPrefix
{
	public static void main (String[] args) throws java.lang.Exception
	{
		ArrayList<String> test1 = new ArrayList<String>();
		test1.add("abcdefgh");
		test1.add("abcefgh");
		System.out.println("Test 1 = " + longestCommonPrefix(test1));
		
		ArrayList<String> test2 = new ArrayList<String>();
		test2.add("abcdefgh");
		test2.add("");
		System.out.println("Test 2 = " + longestCommonPrefix(test2));
		
		ArrayList<String> test3 = new ArrayList<String>();
		test3.add("abcdefgh");
		test3.add("abccd");
		System.out.println("Test 3 = " + longestCommonPrefix(test3));
		
		ArrayList<String> test4 = new ArrayList<String>();
		test4.add("q");
		test4.add("abccd");
		System.out.println("Test 4 = " + longestCommonPrefix(test4));
		
		ArrayList<String> test5 = new ArrayList<String>();
		test5.add("aaa");
		System.out.println("Test 5 = " + longestCommonPrefix(test5));
		
		ArrayList<String> test6 = new ArrayList<String>();
		test6.add("abc");
		test6.add("abc");
		test6.add("pqr");
		System.out.println("Test 6 = " + longestCommonPrefix(test6));
	}
	
	public static String longestCommonPrefix(ArrayList<String> a) 
	{
		String result = "";
		if(a.size()==1)
		{
			result = a.get(0);
		}
		if(a.size()>1)
		{
		    char firstStringChars[] = a.get(0).toCharArray();
		    
		    int index = 0;
		    int flag = 1;
		    
		    for(char c:firstStringChars)
		    {
			    for(int i=0;i<a.size();i++)
			    {
			    	if(a.get(i).length() <= index || a.get(i).charAt(index) != c)
			    	{
			    		flag = 0;
			    		break;
			    	}
			    }
			    if(flag==0)
			    	break;
			    index++;
			    result += c;
		    }
		}
	    return result;
	}
}
