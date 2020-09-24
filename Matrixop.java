package xyz;
import java.util.Scanner;
public class Matrixop {
 int r,c;
 public static void sopln(Object o) {System.out.println(o);}
 Scanner sc = new Scanner(System.in);
 public int[][] acceptsize() {
	 sopln("Enter the no of rows");
	 this.r=sc.nextInt();
	 sopln("Enter the no of columns");
	 this.c=sc.nextInt();
	 int[][] A =new int[this.r][this.c];
	 sopln("Enter the matrix elements in row-wise order");
	 for (int i=0;i<this.r;i++) {
		 for(int j=0;j<this.c;j++) {
			 A[i][j]=sc.nextInt();
		 }
	}
	return A;
 }	
public void add(int[][]a ,int[][]b){
	int[][] C= new int[this.r][this.c];
	for (int i=0;i<this.r;i++) {
		 for(int j=0;j<this.c;j++) {
			 C[i][j]=a[i][j]+b[i][j];
		 }
	}
	sopln("The resultant matrix of two matrix addition is  ");
	display(C,this.r,this.c);
}
 public void display(int[][] a,int r,int c) {
	
	 
	 for (int i=0;i<r;i++) {
		 for(int j=0;j<c;j++) {
			 System.out.print(a[i][j]+" ");
		 }
		 sopln("");
	}
 }
 public void multiply(int[][] a,int[][] b,int c) {
	 int sum=0;
	 int[][] C= new int[this.r][c];
	 for (int i=0;i<this.r;i++) {
		 for(int j=0;j<c;j++) {
			 sum=0;
			 for(int k=0;k<this.c;k++) {
			 sum=sum+a[i][k]*b[k][j];
			 }
			 C[i][j]=sum;
		 }
	}
	 sopln("The resultant matrix of two matrix multiplication is  ");
	 display(C,this.r,c);
 }

 public static void main(String arg[]) {
	 
	 sopln("For first matrix: ");
	 Matrixop obj1=new Matrixop();
	 int[][] a=obj1.acceptsize();
	 
	 sopln("For second matrix: ");
	 Matrixop obj2=new Matrixop();
	 int[][] b=obj2.acceptsize();
	 
	 if(obj1.r==obj2.r && obj1.c==obj2.c) {
		 obj1.add(a, b);
	 }
	 else
		 sopln("Please input same number of rows and columns of two matrix for addition");
	 
	 if(obj1.c==obj2.r) {
		 obj1.multiply(a, b, obj2.c);
	 }
	 else
		 sopln("Please input no of columns of first matrix equal to no of rows of second matrix so that matrices are compatible for multiplication ");
	 

	
 } 

}
