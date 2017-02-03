//This is Even or Odd code
//Wriiten by Mouniqa
import java.util.Scanner;
class EvenOrOdd{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int number=0;
    System.out.print("\nEnter any number : ");
    for(int i=1;i>0;i++){
    number = in.nextInt();
    if (number==0) {
      if (i>1) {
        System.out.println("\nHey! '0' is EVEN by the way...");
      }
      else{
      System.out.println("'0' is EVEN");
      }
    break;
    }
    if (number%2==0) {
      System.out.println("\nYou have entered an EVEN number");
    }
    else{
      System.out.println("\nYou have entered an ODD number");
    }
    if (number!=0) {
      System.out.print("\nEnter another 'number' or Enter '0' to exit : ");
    }
  }
  }
}
