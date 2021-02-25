import java.util.EmptyStackException;

public class List{
  private Node first;
  private int t = -1;

  public void push(Object N) {
    Node n = new Node(N, first);
    first = n;
    t++;
  }

  public Object pop() throws EmptyStackException{
    if(t == -1){
      throw new EmptyStackException();
    }
    Node temp = first;
    first = first.getNext();
    t--;
    return temp;
  }

  public void list(){
    if(t == -1){
      return;
    }
    Node current = first;
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