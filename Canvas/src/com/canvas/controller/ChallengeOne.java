package com.canvas.controller;

public class ChallengeOne {

	public boolean generateSeries(int start, int end){
		
		if(start<0){
			System.out.print("No negative value support for now!!");
			return false;
		}
		if(start%2!=0){
			start++;
		}
		for(int i = start; i <= end; i = i + 4){
			if(i>start)
				System.out.print(",");
				System.out.print(i);
			if(i+2 <= end){
				System.out.print(","+(i+2));
			
			}
		}
		
		return true;
	}
}
