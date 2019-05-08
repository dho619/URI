import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int X = sc.nextInt();
    int Y = sc.nextInt();
    int total = 0;
    for(int i = Y+1; i<X; i++){
      if (i%2!=0){
        total += i;
      }
    }
    System.out.println(total);
  }
}