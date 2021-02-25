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