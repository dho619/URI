import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt(), n2 = sc.nextInt();
    int inicio = n1<n2?n1+1:n2+1;
    int fim = n1<n2?n2:n1; 

    for(int i = inicio; i<fim; i++){
      if(i%5==2 | i%5==3){
        System.out.println(i);
      }
    }
  }
}