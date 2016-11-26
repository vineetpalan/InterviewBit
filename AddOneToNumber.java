/*
Add One To Number
https://www.interviewbit.com/problems/add-one-to-number/

Example:

If the ArrayList has [1, 2, 3]

the returned ArrayList should be [1, 2, 4]

as 123 + 1 = 124.

Note: 
Check for boundary conditions like 
[9,9,9]   ==> [1,0,0,0]
[0]       ==> [1]
[0,1,6,7] ==> [1,6,8]

*/


class AddOneToNumber 
{
	public ArrayList<Integer> plusOne(ArrayList<Integer> a) 
	{
	    while(a.size()>0 && a.get(0)==0)
	    {
	    	a.remove(0);
	    }
	    int carry = 1;
	    ArrayList<Integer> result = new ArrayList<Integer>(a);
	    
	    for (int index = a.size() - 1; index >= 0; index--) 
	    {
	        int val = a.get(index) + carry;
	        result.set(index, val % 10);
	        carry = val / 10;
	    }
	    if (carry == 1) 
	    {
	        result.add(0,1);
	    }
	    return result;
	}
}
