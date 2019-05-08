import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int min_Jogo, hr_Jogo;
    int hr_I= sc.nextInt(), min_I= sc.nextInt(), hr_F= sc.nextInt(), min_F= sc.nextInt();

    hr_Jogo = hr_F-hr_I==0 & min_F-min_I==0?24:hr_F-hr_I<0?24+(hr_F-hr_I):hr_F-hr_I;

    if (min_F-min_I<0){
      min_Jogo = 60+(min_F-min_I);
      hr_Jogo--;
    }
    else{
      min_Jogo = min_F-min_I;
    }
    
    System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", hr_Jogo, min_Jogo);
  }
}