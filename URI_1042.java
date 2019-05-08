import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int [] valores = new int[3];
    int [] valores_ordenados = new int[3];

    for(int i=0; i<3; i++) valores[i]= sc.nextInt();

    valores_ordenados = valores.clone();
    Arrays.sort(valores_ordenados);

    for(int i=0; i<3; i++) System.out.println(valores_ordenados[i]);
    System.out.println();
    for(int i=0; i<3; i++) System.out.println(valores[i]);
  }
}