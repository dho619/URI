import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int quebra= sc.nextInt(), stop= sc.nextInt();
    String aux;
    for(int i=1; i<=stop; i++){
          aux = i%quebra==0?String.format("%d\n",i):String.format("%d ",i);
          System.out.print(aux);
    }
  }
}
 /*
    for(int i=1; i<=stop; i++){
      System.out.printf("%d", i);
      if(qtd!=quebra_de_linha){
        System.out.print(" ");
      }
      else{
        System.out.println("");
        qtd = 0;
      }
      qtd++;
    }


      if(i == stop){
          System.out.printf("%d",i);//p/ o ultimo imprimir sem espaco
      }
      else if(i%quebra_de_linha==0){//imprimi sem espaco e quebra de linha, de acordo com a variavel quebra_de_linha
        System.out.printf("%d\n",i);
      }
      else{//outros casos
        System.out.printf("%d ",i);
      }*/