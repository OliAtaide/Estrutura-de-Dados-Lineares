public class Deque{
  private Node i;
  private Node f;
  private int t = -1;

  public int tamanho(){
    return t+1;
  }

  public void inserirInicio(Object o){
    Node n = new Node(o);
    if(i != null){
      i.setPrev(n);
      n.setNext(i);
    }
    if(t == -1){
      f = n;
    }
    i = n;
    t++;
  }

  public void inserirFim(Object o){
    Node n = new Node(o);
    if(f != null){
      f.setNext(n);
      n.setPrev(f);
    }
    if(t == -1){
      i = n;
    }
    f = n;
    t++;
  }

  public Object removerInicio() throws EmptyStackException{
    if(t == -1){
      throw new EmptyStackException("Lista vazia.");
    }
    Node temp = i;
    i = i.getNext();
    i.setPrev(null);
    t--;
    return temp;
  }

  public Object removerFim() throws EmptyStackException{
    if(t == -1){
      throw new EmptyStackException("Lista vazia.");
    }
    Node temp = f;
    f = f.getPrev();
    f.setNext(null);
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

}