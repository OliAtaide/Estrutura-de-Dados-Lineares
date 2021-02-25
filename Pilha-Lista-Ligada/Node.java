public class Node{
  private Object S;
  private Node next;

  public Node(Object N, Node nx){
    S = N;
    next = nx;
  }

  public Object getObject(){
    return S;
  }

  public Node getNext(){
    return next;
  }

  public void setObject(Object N){
    S = N;
  }

}