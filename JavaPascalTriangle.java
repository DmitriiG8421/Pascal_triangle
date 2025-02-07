import java.util.Scanner;  // Import the Scanner class
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    ArrayList<ArrayList<Integer> > pascalTriangle = new ArrayList<ArrayList<Integer> >(); 

    System.out.print("Enter number of rows:");
    int numberOfRows = scan.nextInt();
    System.out.println();

    ArrayList<Integer> a1 = new ArrayList<Integer>(); 
    a1.add(1);
    pascalTriangle.add(a1);


    for (int i = 1; i < numberOfRows+1; i++) {
      ArrayList previousRow = pascalTriangle.get(i-1);
      ArrayList<Integer> nextRow = new ArrayList<Integer>();
      nextRow.add(1);

      for (int j = 1; j < previousRow.size(); j++) {
        int z = previousRow.get(j-1);
        nextRow.add();
      }
        
        
    }


  }
}