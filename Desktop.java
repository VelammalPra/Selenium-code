package week3.day2;

public class Desktop implements Hardware,Software{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Desktop dp = new Desktop();
dp.hardwareResources();
dp.softwareResources();
	}

	@Override
	public void softwareResources() {
System.out.println("Software resources are provided");		
	}

	@Override
	public void hardwareResources() {
		System.out.println("Hardware resources are provided");		
		
	}

}
