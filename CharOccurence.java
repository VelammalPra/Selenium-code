package week3.assignments;

public class CharOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to chennai";
		char[] array = str.toCharArray();
		char ch = 'e';
		int totalCount = 0;
		int length = array.length;
		for (int i = 0; i < length; i++) {
            if(ch == array[i]) {
				totalCount= totalCount+1;
			}
	}
		System.out.println("Occurance Count is:"+totalCount);

	}
	
}



