//Bimal Aklesh Kumar
//Push and Pop Book Object in the Stack

class Book
{
	String BookName;
	String Author;
	String ISBN;

	public void setBookName(String BKName)
	{
		BookName = BKName;
	}

	public void setAuthor(String Auth)
	{
		Author = Auth;
	}

	public void setISBN(String IS)
	{
		ISBN = IS;
	}

	public String getBookName()
	{
		return BookName;
	}

	public String getAuthor()
	{
		return Author;
	}

	public String getISBN()
	{
		return ISBN;
	}
}

class ObjectStack
{
	int size = 5;
	Book[] arr = new Book[size];
	int top = -1;

	public void push(Book Bk)
	{
		if (top < size - 1)
		{
			top++;
			arr[top]=new Book();
			arr[top].setBookName(Bk.getBookName());
			arr[top].setAuthor(Bk.getAuthor());
			arr[top].setISBN(Bk.getISBN());

			System.out.println ("Book Added ");
		}

		else
			System.out.println ("Stack is Full");
	}

	public Book pop()
	{
		
		Book Bk = new Book();
		
		if (top >=0)
		{
			Bk = arr[top];
			top--;

		}
		else
		{
			System.out.println ("Stack is empty");
		}

		return Bk;
	}

	public static void main (String args[])
	{
		ObjectStack Obj = new ObjectStack();
        Book Bk = new Book();

		Bk.setBookName("Java Programming");
		Bk.setAuthor("Dietel");
		Bk.setISBN("7989898");

		Obj.push(Bk);
		Obj.pop();


	}
}
