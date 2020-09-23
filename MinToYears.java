package xyz;

import java.util.Scanner;

class MinToYears { 
	public static void sopln(Object o) {System.out.println(o);}
	public static void main(String arg[]) {
	int min=0,days=0,years=0;
	sopln("Enter total minutes");
	Scanner sc = new Scanner(System.in);
	min=sc.nextInt();
	days=(int)(min/(24*60));
	years=(int)days/365;
	days=days-(years*365);
	sopln(min +" is approximately "+years+" years and "+days+ " days");
	sc.close();
	}
	}
