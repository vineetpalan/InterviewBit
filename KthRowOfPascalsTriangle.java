/* 

------------------------------------------------------------------------------
				Kth Row of Pascal's Triangle
------------------------------------------------------------------------------
Given an index k, return the kth row of the Pascal’s triangle.

Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1.

---------------------------------------
Example:
---------------------------------------
Example:

Input : k = 3

Return : [1,3,3,1]

      1
    1    1
   1   2   1
  1  3   3   1
------------------------------------------------------------------------------
Problem Page : https://www.interviewbit.com/problems/kth-row-of-pascals-triangle/
Run Online : http://ideone.com/N6jd3G
------------------------------------------------------------------------------

*/

import java.util.*;
import java.lang.*;
import java.io.*;


class KthRowOfPascalsTriangle
{
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println(getRow(3));
	}
	
	private static ArrayList<Integer> getRow(int rowIndex)
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		
	    if(rowIndex<0)
	        return result;
	        
	    result.add(1);
	    
	    for(int i=1;i<=rowIndex;i++)
	    {
	        for(int j=result.size()-2;j>=0;j--)
	        {
	            result.set(j+1,result.get(j)+result.get(j+1));
	        }
	        result.add(1);
	    }
		return result;
	}
}
