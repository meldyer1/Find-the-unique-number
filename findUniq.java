package com.myproject;
import java.util.*;

public class findUniqueNum
{
	 public static double findUniq(double arr[])
	 {
		 /*iterates through the elements of arr[], adding them to a map. The Double (key) part of the
		 map represents all the numbers in arr[] and the Integer(value) part of the map represents the 
		 number of times the element in arr[] was seen. */ 
		 
		 Map<Double, Integer> map = new HashMap<Double, Integer>();
		 
		 int count = 1;
		 double resultOfFindUniq = 0;
		 for (Double it: arr) {
		 /*First step: iterate through the keys of the map. If an item appears more than once, increment the counter. Else if it does 
		 not appear in the map, add it to the map */
		 if (map.containsKey(it))
		 {
			  // find the corresponding the value to the key that is included in the map and increment it by 1
			 // note: hashMap does not have a getValue method
	          for(Integer keyValue: map.values()) 
	          {
					 if(map.get(it) == keyValue)
					 {
						 keyValue++;
						 map.replace(it, keyValue);
						 break;
					 }
				 }
	          }
		 else
		 {
			 map.put(it, count);
		 }
	 }
	 // find first occurrence of a key in the map whose its value is 1 and return the key.
		 // note: hashMap does not find a key for each value
		 for(int i = 0; i < map.size(); i++) 
		 {
			 double key = arr[i];

			 if(map.get(key) == 1)
			 {
				 resultOfFindUniq = key;
				 break;
			 }
		 }
		 return resultOfFindUniq;
	 }
}
