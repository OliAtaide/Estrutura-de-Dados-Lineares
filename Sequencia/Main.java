import java.util.EmptyStackException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    int opt = 1, i, j;
    List S = new List();
    Object o;
    Node n, m;
    while(opt != 0){
      try{
        S.debug();
        System.out.println("[1] Inserir Início");
        System.out.println("[2] Inserir Fim");
        System.out.println("[3] Inserir Antes");
        System.out.println("[4] Inserir Depois");
        System.out.println("[5] Alterar");
        System.out.println("[6] Trocar");
        System.out.println("[7] Remover");
        System.out.println("[8] Add at rank");
        System.out.println("[9] Replace at rank");
        System.out.println("[10] Remove at rank");
        System.out.println("[11] Element at rank");
        opt = sc.nextInt();
        switch(opt){
          case(1):
            System.out.println("Inserir Início: ");
            o = sc.next();
            S.insertFirst(o);
            break;
          case(2):
            System.out.println("Inserir Fim: ");
            o = sc.next();
            S.insertLast(o);
            break;
          case(3):
            S.isEmpty();
            System.out.println("Inserir Antes: ");
            o = sc.next();
            System.out.println("Indice: ");
            i = sc.nextInt();
            n = S.search(i);
            S.insertBefore(n, o);
            break;
          case(4):
            S.isEmpty();
            System.out.println("Inserir Depois: ");
            o = sc.next();
            System.out.println("Indice: ");
            i = sc.nextInt();
            n = S.search(i);
            S.insertAfter(n, o);
            break;
          case(5):
            S.isEmpty();
            System.out.println("Alterar: ");
            o = sc.next();
            System.out.println("Indice: ");
            i = sc.nextInt();
            n = S.search(i);
            S.replace(n, o);
            break;
          case(6):
            S.isEmpty();
            System.out.println("Indice 1: ");
            i = sc.nextInt();
            n = S.search(i);
            System.out.println("Indice 2: ");
            j = sc.nextInt();
            m = S.search(j);
            S.swap(n, m);
            break;
          case(7):
            S.isEmpty();
            System.out.println("Indice: ");
            i = sc.nextInt();
            n = S.search(i);
            S.remove(n);
          case(8):
            S.isEmpty();
            System.out.println("Inserir: ");
            o = sc.next();
            System.out.println("Indice: ");
            i = sc.nextInt();
            S.insertAtRank(i, o);
            break;
          case(9):
            S.isEmpty();
            System.out.println("Alterar: ");
            o = sc.next();
            System.out.println("Indice: ");
            i = sc.nextInt();
            S.replaceAtRank(i, o);
            break;
          case(10):
            S.isEmpty();
            System.out.println("Indice: ");
            i = sc.nextInt();
            S.removeAtRank(i);
        }
      }
      catch(EmptyException e){
        System.out.println(e.getError());
      }
    }
  }
}