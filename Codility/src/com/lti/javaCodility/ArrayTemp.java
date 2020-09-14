package com.lti.javaCodility;

public class ArrayTemp {
	
	public static int negativeTemp(int[] temp) {
		int days =0;
		for(int i=0;i<temp.length;i++) {
			if(temp[i]<0) {
				days++;
			}
		}
		
		return days;
	}
	
	 public static void main(String[] args) {
		 int[] temp = {-2,45,32,-34,-10};
		 
		 System.out.println(negativeTemp(temp));
		 
		 }
	 }


