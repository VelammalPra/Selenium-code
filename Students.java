package wee3day1.assignment3and4;

public class Students {
public void getStudentInfo(int Id)
{
	System.out.println("ID of the student is" +Id);
}
public void getStudentInfo(int Id, String name)
{
	System.out.println("ID of the student is" +Id);
	System.out.println("Name of the student is" +name);
}
public void getStudentInfo(String email, String phno)
{
	System.out.println("Email of the student is" +email);
	System.out.println("Phone number of the student is" +phno);
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students sd = new Students();
		sd.getStudentInfo(123);
		sd.getStudentInfo(123, "Velammal");
		sd.getStudentInfo("xyz@gmail.com", "7654321");

	}

}
