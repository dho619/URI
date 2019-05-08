import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int n1=1, n2=1, n3=1;
    for(int i=1; i<(x*2)+1; i++){
      System.out.printf("%d %d %d\n",n1,n2,n3);
      if (i%2!=0){
        n1 = n1;
        n2 = n2+1;
        n3= n3+1;
      }
      else{
      n1 = n1+1;
      n2 = n2+i;
      n3= n1*n2;
      }
    }
  }
}