import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int alc=0, gas=0, dis=0, op=0;
    while(op!=4){
      op = sc.nextInt();
      switch(op){
        case 1:
          alc++;
          break;
        case 2:
          gas++;
          break;
        case 3:
          dis++;
      }
    } 
    
    System.out.println("MUITO OBRIGADO");
    System.out.println("Alcool: " + alc);
    System.out.println("Gasolina: " + gas);
    System.out.println("Diesel: " + dis);
  }
}