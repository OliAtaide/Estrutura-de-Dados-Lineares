import java.util.EmptyStackException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    int opt = 1;
    Fila S = new Fila();
    Object o;
    while(opt != 0){
      try{
        S.list();
        System.out.println("[1] Enfileirar");
        System.out.println("[2] Desenfileirar");
        System.out.println("[3] Size");
        opt = sc.nextInt();
        switch(opt){
          case(1):
            System.out.println("Push: ");
            o = sc.next();
            S.enfileirar(o);
            break;
          case(2):
            S.desenfileirar();
            break;
          case(3):
            System.out.println("Size: " + S.size());
            break;
        }
      }
      catch(EmptyStackException e){
        System.out.println("Pilha vazia.");
      }
    }
  }
}