public class Sentinela{
  private Node i;
  private Node f;
  private int t = -1;

  public Sentinela(){
    i.setNext(f);
    f.setPrev(i);
  }

  public int tamanho(){
    return t+1;
  }

  public void inserirInicio(Object o){
    Node n = new Node();
    n.setNext(i.getNext());
    n.setPrev(i);
    i = n;
  }

  public void inserirFim(Object o){
    Node n = new Node(o);
    n.setPrev(f.getPrev());
    n.sertNext(f);
    f = n;
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