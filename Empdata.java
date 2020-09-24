package xyz;
import java.util.Scanner;
public class Empdata {
	String name,address;
	int year;
	Scanner sc = new Scanner(System.in);
	public static void sopln(Object o) {System.out.println(o);}
	public static void sop(Object o) {System.out.print(o);}
	public void accept() {
		
		sop("Name: ");
		this.name=sc.nextLine();
		sop("Year of joining: ");
		this.year=sc.nextInt();
		sc.nextLine();
		sop("Address: ");
		this.address=sc.nextLine();
		sopln("");
	}
	
	public void display() {
		
	}
	
	public static void main(String arg[]) {
		int n=0;
		Scanner sc = new Scanner(System.in);
		sopln("Enter the number of employees");
		n=sc.nextInt();
		Empdata[] objs= new Empdata[n];
		for(int i=0;i<n;i++) {
			sopln("For the employee number "+ (i+1) + " enter ");
			objs[i]=new Empdata();
			objs[i].accept();
		}
		sopln("The details of employees are: \n");
		System.out.printf("%10s %10s %20s ", "Name","Year","Address");
		sopln("");
		for(int i=0;i<n;i++) {
			
			System.out.printf("%10s %10s %20s ", objs[i].name,objs[i].year,objs[i].address);
			sopln("");
		}
		
		sc.close();
	}
	
}
