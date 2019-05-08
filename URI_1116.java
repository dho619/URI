import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int qtd = sc.nextInt();
    int x,y;
    for(int i=0; i<qtd; i++){
      x = sc.nextInt();
      y = sc.nextInt();
      if (y==0){
        System.out.println("divisao impossivel");
      }
      else{
        System.out.println((float)(x)/y);
      }
    }
  }
}