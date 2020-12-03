package week3.assignments;

public class ReverseEvenPositionwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  		String test = "I am a software tester"; 
  		String[] words = test.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i< words.length; i++)
        { 

        if(i%2 == 0) 
        {
            sb.append(words[i]); }
  else 
        	{
        	sb.append(new StringBuilder(words[i]).reverse());
        	}
        sb.append(" ");
        }
    System.out.println(sb.toString());
	}

}


