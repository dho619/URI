import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double A=sc.nextDouble(), B=sc.nextDouble(), C=sc.nextDouble(), aux;
    int lados_iguais;
  
    if (A<B){
      aux = A;
      A = B;
      B = aux;
    }
    if(A<C){
      aux = A;
      A = C;
      C = aux;
    }
    if(B<C){
      aux = B;
      B = C;
      C = aux;
    }

    double A2=Math.pow(A,2);
    double B2=Math.pow(B,2);
    double C2=Math.pow(C,2);

    if(A>=(B+C)){
      System.out.println("NAO FORMA TRIANGULO");
    }else {
      if(A2==(B2+C2)){
        System.out.println("TRIANGULO RETANGULO");
      }else if((A2)>(B2+C2)){
        System.out.println("TRIANGULO OBTUSANGULO");
      }else if((A2)<(B2+C2)){
        System.out.println("TRIANGULO ACUTANGULO");
      }

      lados_iguais = A==B & A==C?3:A==B^A==C^B==C?2:1;
      if(lados_iguais==3){
        System.out.println("TRIANGULO EQUILATERO");
      }else if(lados_iguais==2){
        System.out.println("TRIANGULO ISOSCELES");        
      }
    }
  }
}