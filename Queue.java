class Queue
{
	int size = 5;
	int arr[] = new int[size];

	int front = 0;
	int rear = -1;
	
	public void enqueue (int element)
	{
		if (rear < size -1)
		{
			rear ++;
			arr[rear] = element;
			System.out.println ("Element Added " + element);
		}
		else
			System.out.println("Queue is Full");
		
	}

	public int dequeue()
	{
		int front =0;	
		if (rear >= 0)
		{
			front =  arr[front];

			for (int i=0;i < rear ;i++ )
			{
				arr[i] = arr[i + 1];
			}
			return front;
		}
		else
			return 0;
	}

	public boolean isFull()
	{
		if (rear == size -1)
			return true;
		else
			return false;
	}

	public boolean isEmpty()
	{
		if (rear == -1)
			return true;
		else
			return false;
	}
	
	public int front()
	{
		return arr[front];
	}



	public static void main (String args[])
	{
		Queue myqueue = new Queue();

		myqueue.enqueue(5);
		myqueue.enqueue(2);
		myqueue.enqueue(3);
		myqueue.enqueue(3);

		System.out.println("Element Removed " + myqueue.dequeue());
		System.out.println("Element Removed " + myqueue.dequeue());
	}

}