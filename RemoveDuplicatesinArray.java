package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesinArray {
public static void main(String[]args) {
	String[] companies = {"TCS", "Wipro" ,"Aspire", "TCS"};
	Set<String>values = new LinkedHashSet<String>();
	for(String eachData : companies) {
		values.add(eachData);
		}
System.out.println(values);
	
}
}