package xyz;
import java.util.Scanner;
public class Switchcase {
	public static void sopln(Object o) {System.out.println(o);}
	public static void main(String arg[]) {
		int choice=1;
		sopln("Select a number corresponding to your choice \n1.Hello \n2.Hey \n3.Hi");
		Scanner sc = new Scanner(System.in);
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			sopln("You selected Hello");
			break;
		case 2:
			sopln("You selected Hey");
			break;
		case 3:
			sopln("You selected Hi");
			break;
		}
	 sc.close();
}
}