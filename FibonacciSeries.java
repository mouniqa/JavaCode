//This is fibonacci series code
//Jagadeesh changed the below code
package main;

public class FibonacciSeries {
	//Main method starts
	public static void main(String[] args) {
		// 0,1,1,2,3,5,8....
		int n1=0;
		int n2=1;
		int n3;
		int n=5;
		System.out.print(n1+" "+n2+" ");
	//For loop starts
		for(int i=2;i<n;i++){
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
	}

}
