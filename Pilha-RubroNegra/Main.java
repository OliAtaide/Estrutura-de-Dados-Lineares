import java.util.Scanner;

class Main {
  public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    System.out.print("Quant. Array: ");
    int t = sc.nextInt();
    int opt = 1;
    Array S = new Array(t);
    Object o;
    while(opt != 0){
      try{
        S.items_rubra();
        S.items_negra();
        System.out.println("[1] Push (Rubra)");
        System.out.println("[2] Pop (Rubra)");
        System.out.println("[3] Size (Rubra)");
        System.out.println("[4] Push (Negra)");
        System.out.println("[5] Pop (Negra)");
        System.out.println("[6] Size (Negra)");
        opt = sc.nextInt();
        switch(opt){
          case(1):
            System.out.println("Push: ");
            o = sc.next();
            S.push_rubra(o);
            break;
          case(2):
            S.pop_rubra();
            break;
          case(3):
            System.out.println("Size: " + S.size_rubra());
            break;
          case(4):
            System.out.println("Push: ");
            o = sc.next();
            S.push_negra(o);
            break;
          case(5):
            S.pop_negra();
            break;
          case(6):
            System.out.println("Size: " + S.size_negra());
            break;
        }
      }
      catch(EmptyStackException e){
        System.out.println("Pilha vazia.");
      }
    }
  }
}