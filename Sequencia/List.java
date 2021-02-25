public class List{
    private Node first = new Node("{"), last = new Node("}");
    private int tam = -1;

    public List(){
      first.setNext(last);
      last.setPrev(first);
    }

    public Node atRank(int r){
      Node n;
      if(r <= tam/2){
        n = first.getNext();
        for(int i = 0; i < r; i++){
          n = n.getNext();
        }
      }
      else{
        n = last.getPrev();
        for(int i = 0; i < tam-r-1; i++){
          n = n.getPrev();
        }
      }
      return n;
    }

    public Object remove(Node n){
      Object t = n.getObject();
      Node pr = n.getPrev(), nx = n.getNext();
      pr.setNext(nx);
      nx.setPrev(pr);
      n.setPrev(null);
      n.setNext(null);
      tam--;
      return t;
    }

    public Object removeAtRank(int r) throws EmptyException{
      Node p = atRank(r);
      return remove(p);
    }
    
    public void removeRanks(int r_min, int r_max) throws EmptyException{
      if(r_min < r_max){
        for(int i = r_min; i <= r_max; i++){
          removeAtRank(i);
        }
      }
    }

    public int rankOf(Node n){
      Node node = first.getNext();
      int r = 0;
      while(node != n && node != last){
        n = n.getNext();
        r++;
      }
      return r;
    }

    public Object elementAtRank(int r){
        return atRank(r);
    }

    public Object replaceAtRank(int r, Object o) throws EmptyException{
      Node n = atRank(r);
      if(n == null){
          throw new EmptyException("Nulo.");
      }
      Object s = n;
      n.setObject(o);
      return s;
    }

    public void insertAtRank(int r, Object o) throws Exception{
      Node n = atRank(r);
      Node v = new Node(o);
      Node pr = n.getPrev();
      v.setNext(n);
      v.setPrev(pr);
      pr.setNext(v);
      n.setPrev(v);
      tam++;
    }

    

    public Node getFirst(){
        return first;
    }
    public Node getLast(){
        return last;
    }

    public void isEmpty() throws EmptyException{
      if(tam == -1 ){
        throw new EmptyException("Lista vazia.");
      }
    }

    public Node search(int i) throws EmptyException{
      Node n = first.getNext();
      if(i > tam){
        throw new EmptyException("Nó inválido.");
      }
      while(i != 0){
        n = n.getNext();
        i--;
      }
      return n;
    }

    public void debug(){
      if(tam == -1){
        return;
      }
      Node current = first;
      while(current != null){
        System.out.print(current.getObject()+" ");
        current = current.getNext();
      }
      System.out.println(" ");
    }

    public void insertFirst(Object o){
      Node v = new Node(o);
      v.setNext(first.getNext());
      v.setPrev(first);
      first.setNext(v);
      v.getNext().setPrev(v);
      tam++;
    }

    public void insertLast(Object o){
      Node v = new Node(o);
      v.setPrev(last.getPrev());
      v.setNext(last);
      last.setPrev(v);
      v.getPrev().setNext(v);
      tam++;
    }

    public Node insertBefore(Node n, Object o){
      Node v = new Node(o);
      Node pr = n.getPrev();
      v.setNext(n);
      v.setPrev(pr);
      pr.setNext(v);
      n.setPrev(v);
      tam++;
      return v;
    }

    public Node insertAfter(Node n, Object o){
      Node v = new Node(o);
      Node nx = n.getNext();
      v.setPrev(n);
      v.setNext(n.getNext());
      nx.setPrev(v);
      n.setNext(v);
      tam++;
      return v;
    }

    public Object replace(Node n, Object o){
      Object t = n.getObject();
      n.setObject(o);
      return t;
    }

    public void swap(Node n, Node q){
      Object t1 = n.getObject();
      Object t2 = q.getObject();
      n.setObject(t2);
      q.setObject(t1);
    }

    



}