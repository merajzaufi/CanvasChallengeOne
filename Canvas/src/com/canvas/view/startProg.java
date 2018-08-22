package com.canvas.view;

import java.util.Scanner;

import com.canvas.controller.ChallengeOne;

public class startProg {
	
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Only Numbers, Other than numbers application may crash as there is no validation handler written!!");
		System.out.println("Enter Start Number");
		int start = 0, end = 0;
		try{
		 start = scan.nextInt();
		
		System.out.println("Enter End Number");
		 end = scan.nextInt();
		}
		catch(Exception e){
			System.out.println("Re-run and enter numbers only...");
		}
		if(end > start){
		new ChallengeOne().generateSeries(start, end);
		}else{
			System.out.println("Re-run and enter Start number should be greater than End");
		}
		
	}

}
