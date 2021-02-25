import java.util.EmptyStackException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    System.out.print("Quant. Array: ");
    int t = sc.nextInt();
    System.out.print("Ind. Início: ");
    int i = sc.nextInt();
    int opt = 1;
    Array S = new Array(t,i);
    Object o;
    while(opt != 0){
      try{
        S.items();
        System.out.println("[1] Inserir Início");
        System.out.println("[2] Inserir Fim");
        System.out.println("[3] Remover Início");
        System.out.println("[4] Remover Fim");
        System.out.println("[5] Size");
        opt = sc.nextInt();
        switch(opt){
          case(1):
            System.out.println("Push: ");
            o = sc.next();
            S.inserirInicio(o);
            break;
          case(2):
            System.out.println("Push: ");
            o = sc.next();
            S.inserirFim(o);
            break;
          case(3):
            S.removerInicio();
            break;
          case(4):
            S.removerFim();
            break;
          case(5):
            System.out.println("Size: " + S.tamanho());
            break;
        }
      }
      catch(EmptyStackException e){
        System.out.println("Pilha vazia.");
      }
    }
  }
}