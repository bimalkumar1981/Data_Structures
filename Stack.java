//Bimal Aklesh Kumar
//Arraybased IntegerStack

class Stack
{
	int size = 5;
	int[] arr = new int[size];
	int top = -1;

	public void push(int element)
	{
		if (top < size - 1)
		{
			top++;
			arr[top] = element;

			System.out.println ("Element Added " + element);
		}

		else
			System.out.println ("Stack is Full");
	}

	public int pop()
	{
		
		int element=0;
		
		if (top >=0)
		{
			element = arr[top];
			top--;

		}
		else
		{
			System.out.println ("Stack is empty");
		}

		return element;
	}

	public boolean isEmpty()
	{
		if (top == -1)
		{
			return true;
		}

		else
			return false;
	}

	public boolean isFull()
	{
		if (top == size -1)
		{
			return true;
		}
		else
			return false;
	}

	public void peek()
	{
		System.out.println("The peek value is " + arr[top]);
	}

	

	public static void main (String args[])
	{
		Stack2 stk = new Stack2();

		if (stk.isEmpty())
		{
			System.out.println("Stack is Empty");
		}
		else
			System.out.println("Stack is Not empty");

		stk.push(4);
		stk.push(3);
		stk.push(8);

		stk.peek();

		stk.push(6);
		stk.push(5);
		
		if (stk.isFull())
		{
			System.out.println("Stack is Full");
		}
		else
			System.out.println("Stack is Not Full");

		
	}
		

}




