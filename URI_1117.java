import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float med, aux;
    int qtd=0;
    float [] notas = new float[2];
    while (qtd < 2){
      aux = sc.nextFloat();
      if (aux >= 0.0 & aux<=10.0){
        notas[qtd] = aux;
        qtd++;
      }
      else{
        System.out.println("nota invalida");
      }
    }

    med = (notas[0] + notas[1])/2;
    String result = String.format("%.2f", med);
    System.out.println("media = " + result);
  }
}