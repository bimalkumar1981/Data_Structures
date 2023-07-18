//Bimal Aklesh Kumar
//List to mantain the names of students

class Student
{
	String StudentID;
	String FirstName;
	String LastName;
	String Program;

	Student()
	{
	}

	public void setStudentID(String ID)
	{
		StudentID = ID;
	}

	public void setFirstName(String FName)
	{
		FirstName = FName;
	}

	public void setLastName(String LName)
	{
		LastName = LName;
	}

	public void setProgram(String Prog)
	{
		Program = Prog;
	}

	public String getStudentID()
	{
		return StudentID;
	}

	public String getFirstName()
	{
		return FirstName;
	}
	public String getLastName()
	{
		return LastName;
	}

	public String getProgram()
	{
		return Program;
	}
}

class StudentList
{
	int size = 20;
	int rear = -1;

	Student[] arr = new Student[size];

	public void insert(Student std)
	{
		if (rear < size -1)
		{
			rear++;
			arr[rear] = new Student();
			arr[rear].setStudentID(std.getStudentID());
			arr[rear].setFirstName(std.getFirstName());
			arr[rear].setLastName(std.getLastName());
			arr[rear].setProgram(std.getProgram());
			
			System.out.println("Student Details Added in the list");
		}
		else
			System.out.println("The List is Full");

	}
	public void delete(String element)
	{
		if (search(element))
		{
			for (int i=0;i<=rear ;i++ )
			{
				if (arr[i].getStudentID() == element)
				{
					for (int j=0;j<rear ;j++ )
					{
						arr[j] = arr[j+1];
					}
					rear--;
					System.out.println("Student Record Deleted");
					return;
					
				}
			}
		}
	}

	public boolean search(String ID)
	{
		for (int i=0;i<=rear ;i++ )
		{
			if (arr[i].getStudentID() == ID)
			{
				return true;
			}
		}

		return false;

	}

	public void print()
	{
		for (int i =0;i <=rear ;i++ )
		{
			System.out.println(arr[i].getStudentID()+" " +arr[i].getFirstName()+ " " + arr[i].getLastName());
		}
	}

	public static void main(String args[])
	{
		Student std = new Student();
		Student std1 = new Student();

		StudentList obj = new StudentList();

		std.setStudentID("2004006678");
		std.setFirstName("Conan");
		std.setLastName("Htach");
		std.setProgram("BSc");

		std1.setStudentID("2003007897");
		std1.setFirstName("Joseph");
		std1.setLastName("Singh");
		std1.setProgram("BSc");

		obj.insert(std);
		obj.insert(std1);

		obj.delete("2004006678");


		obj.print();
	}

}