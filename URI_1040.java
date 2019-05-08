import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    float nt1=sc.nextFloat(), nt2=sc.nextFloat(), nt3=sc.nextFloat(), nt4=sc.nextFloat();

    float media = (nt1*2+nt2*3+nt3*4+nt4*1)/10;
    System.out.printf("Media: %.1f\n", media);

    if(media>=7.0){
      System.out.println("Aluno aprovado.");
    }
    else if(media<5.0){
      System.out.println("Aluno reprovado.");
    }
    else{
      System.out.println("Aluno em exame.");
      float nt_exame = sc.nextFloat();
      float media_F = (nt_exame + media)/2;
      System.out.printf("Nota do exame: %.1f\n", nt_exame);
      if(media_F>=5.0){
        System.out.println("Aluno aprovado.");
      }
      else{
        System.out.println("Aluno reprovado.");
      }
      System.out.printf("Media final: %.1f\n", media_F);
    }
  }
}