import java.util.Scanner;  // Import the Scanner class
import java.util.ArrayList;
import java.util.Collections;

class Main {

  public static ArrayList<String> converter(ArrayList<Integer> x) {
    ArrayList<String> y = new ArrayList<String>();
    for (int i =0; i < x.size(); i++){
      y.add(x.get(i).toString());
    }

   return y;
  }


  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    ArrayList<ArrayList<Integer> > pascalTriangle = new ArrayList<ArrayList<Integer> >(); 

    System.out.print("Enter number of rows:");
    int numberOfRows = scan.nextInt();
    System.out.println();

    ArrayList<Integer> a1 = new ArrayList<Integer>(); 
    a1.add(1);
    pascalTriangle.add(a1);


    for (int i = 1; i < numberOfRows; i++) {
      ArrayList previousRow = pascalTriangle.get(i-1);
      ArrayList<Integer> nextRow = new ArrayList<Integer>();
      nextRow.add(1);

      for (int j = 1; j < previousRow.size(); j++) {
        nextRow.add((int) previousRow.get(j-1) + (int) previousRow.get(j));
      }
      nextRow.add(1);
      pascalTriangle.add(nextRow);
    }



    ArrayList<Integer> lengthList = new ArrayList<Integer>();
    for (int i = 0; i < pascalTriangle.size(); i++) {
      lengthList.add(pascalTriangle.get(i).size());
    } 
    int maxWidth = Collections.max(lengthList);
    int intendation = maxWidth-1;
    for (int i = 0; i < pascalTriangle.size(); i++) {
      String o = String.join(" ",converter(pascalTriangle.get(i)));
      System.out.println(" ".repeat(intendation-i)+o);   
      }
    }
  }