import java.util.EmptyStackException;

public class Fila{
  private Node i;
  private Node f;
  private int t = -1;

  public void enfileirar(Object N) {
    Node n = new Node(N);
    if(f != null){
      f.setNext(n);
    }
    if(t == -1){
      i = n;
    }
    f = n;
    t++;
  }

  public Object desenfileirar() throws EmptyStackException{
    if(t == -1){
      throw new EmptyStackException();
    }
    Node temp = i;
    i = i.getNext();
    t--;
    return temp;
  }

  public void list(){
    if(t == -1){
      return;
    }
    Node current = i;
    System.out.print("{ ");
    while(current != null){
      System.out.print(current.getObject()+", ");
      current = current.getNext();
    }
    System.out.println("}");
  }

  public int size(){
    return t+1;
  }


}