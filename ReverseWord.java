//Bimal Aklesh Kumar
//Reverse word using stack

import java.util.*;
import java.lang.*;

class CharStack
{

	int size = 30;
	int top = -1;
	char[] arr = new char[size];

	public void push(char c)
	{
		if (top <size -1)
		{
			top++;
			arr[top]= c;
		}
		
		else
		System.out.println ("Stack is full");
	}

	public char pop()
	{
		char c;
		
		if (top >=0)
		{
			c = arr[top];
			top--;
			return c;
		}
		
		return '0';

	}

}

class ReverseWord
{
	public static void main (String args[])
	{
		CharStack stk = new CharStack();
		Scanner sc = new Scanner(System.in);
		String word;

		System.out.println("Please enter a word");
		word = sc.nextLine();

		for (int i=0;i<word.length();i++ )
		{
			stk.push(word.charAt(i));
		}

		for (int i=0;i<word.length();i++ )
		{
			System.out.println(stk.pop());
		}


	}
}
