import java.util.Scanner;

class Main {
  public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    System.out.print("Quant. Array: ");
    int t = sc.nextInt();
    int opt = 1;
    Vector S = new Vector(t);
    Object o;
    int r;
    while(opt != 0){
      try{
        S.debug();
        System.out.println("[1] Insert");
        System.out.println("[2] Replace");
        System.out.println("[3] Remove");
        System.out.println("[4] At Rank");
        opt = sc.nextInt();
        switch(opt){
          case(1):
          System.out.println("Insert: ");
          o = sc.next();
          System.out.println("Rank: ");
          r = sc.nextInt();
          S.insertAtRank(r, o);
          break;
          case(2):
          System.out.println("Insert: ");
          o = sc.next();
          System.out.println("Rank: ");
          r = sc.nextInt();
          S.replaceAtRank(r, o);
          break;
          case(3):
          System.out.println("Rank: ");
          r = sc.nextInt();
          S.removeAtRank(r);
          break;
          case(4):
          System.out.println("Rank: ");
          r = sc.nextInt();
          S.elementAtRank(r);
          break;
        }
      }
      catch(EmptyRankException e){
        System.out.println("Rank vazio.");
      }
    }
  }
}