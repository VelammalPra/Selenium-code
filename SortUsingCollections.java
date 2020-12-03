package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SortUsingCollections {

	public static void main(String[] args) {
		String[] companies = {"HCL", "Wipro" ,"Aspire", "CTS"};
		//declare empty list
		List<String>values = new ArrayList<String>();
		for(String eachData : companies) {
			values.add(eachData);}
	
	System.out.println(values);

}}

