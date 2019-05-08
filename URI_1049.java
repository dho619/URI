import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String palavra [] = new String[3];
    for(int i=0;i<3;i++){palavra[i]= sc.next();}
    if (palavra[0].equals("vertebrado")){
      if (palavra[1].equals("ave")){
        if (palavra[2].equals("carnivoro")){
          System.out.println("aguia");
        }
        else if (palavra[2].equals("onivoro")){
          System.out.println("pomba");
        }
      }
      else if (palavra[1].equals("mamifero")){
        if (palavra[2].equals("onivoro")){
          System.out.println("homem");
        }
        else if (palavra[2].equals("herbivoro")){
          System.out.println("vaca");
        }
      }
    }
    else if (palavra[0].equals("invertebrado")){
      if (palavra[1].equals("inseto")){
        if (palavra[2].equals("hematofago")){
          System.out.println("pulga");           
        }
        else if (palavra[2].equals("herbivoro")){
          System.out.println("lagarta");
        }
      }
      else if (palavra[1].equals("anelideo")){
        if (palavra[2].equals("hematofago")){
          System.out.println("sanguessuga");
        }
        else if (palavra[2].equals("onivoro")){
          System.out.println("minhoca");
        }
      }
    }
  }
}