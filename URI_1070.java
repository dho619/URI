import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int X = sc.nextInt();
    int num_imprim = 0;
    while(num_imprim < 6){

      if (X%2!=0){
        System.out.println(X);
        num_imprim++;
      }
      X++;
    }
  }
}