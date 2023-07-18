//Bimal Aklesh Kumar
// Demonstration of Array Based List

class List
{
	int size = 20;
	int rear = -1;

	int[] arr = new int[size];

	//Insert
	public void insert(int element)
	{
		if (rear < size-1)
		{
			rear++;
			arr[rear] = element;

			System.out.println("Element Added: " + element);
		}
		else
			System.out.println("List is Full");
	}

	//Delete
	public void delete(int element)
	{
		if (search(element))
		{
			for (int i =0;i<=rear ;i++ )
			{
				if (arr[i] == element)
				{
					for (int j=i;j<rear ;j++ )
					{
						arr[j] = arr[j+1];
					}
						rear--;
						System.out.println("Element Deleted " + element);
						return;
					
				}
			}

			

		}
	}

	//Search
	public boolean search(int element)
	{
		for (int i=0;i<=rear ;i++ )
		{
			if (arr[i]== element)
			{
				return true;
			}

		}
		return false;
	}

	//Print
	public void print()
	{
		for (int i=0;i<=rear ;i++ )
		{
			System.out.println(arr[i]);
		}
	}

	public static void main (String args[])
	{
		List l = new List();
		
		l.insert(7);
		l.insert(8);
		l.insert(6);
		l.insert(3);
		l.insert(2);

		l.delete(6);

		l.print();
	
	}

}
