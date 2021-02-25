public class Node{
  private Object S;
  private Node next;

  public Node(Object N){
    S = N;
  }

  public Object getObject(){
    return S;
  }

  public Node getNext(){
    return next;
  }

  public void setNext(Node N){
    next = N;
  }

  public void setObject(Object N){
    S = N;
  }

}