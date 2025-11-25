/* 1. Create an interface with only one method and implement it in a class. 
 Call the method implemented.*/

package Interfaces;

interface Searchcontext
{
	void findElement();
	}

class RemoteWebdriver
{
	void findElemnt()
	{
		System.out.println("Implementation of searchcontext");
	}


	public static void main(String[] args)
	{
		RemoteWebdriver rw = new RemoteWebdriver();
		rw.findElemnt();
	}
	}


