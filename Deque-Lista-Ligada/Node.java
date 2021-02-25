public class Node{
  private Object S;
  private Node prev;
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
  public Node getPrev(){
    return prev;
  }

  public void setPrev(Node P){
    prev = P;
  }

  public void setObject(Object N){
    S = N;
  }

}