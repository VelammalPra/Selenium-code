package week3.assignments;

public class Findtypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		char[] array = test.toCharArray();
		int  letter = 0, space = 0, num = 0, specialChar = 0;
			for (int i = 0; i < array.length; i++) {
				if (Character.isLetter(array[i])) {
					letter+=1;
				}
				else if (Character.isDigit(array[i])) {
					num+=1;

				}
				else if (Character.isSpaceChar(array[i])) {
					space+=1;
				}	
				else {
					specialChar+=1;
				}

			}
			System.out.println("letter: " + letter);
			System.out.println("space: " + space);
			System.out.println("number: " + num);
			System.out.println("specialCharcter: " + specialChar);

	}

}
