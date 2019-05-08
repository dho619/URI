import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int senha;
    boolean senha_correta = false;
    while(!senha_correta){
      senha = sc.nextInt();
      senha_correta = senha==2002;
      if(!senha_correta){
        System.out.println("Senha Invalida");
      }
      else{
         System.out.println("Acesso Permitido");
      }
    }
  }
}