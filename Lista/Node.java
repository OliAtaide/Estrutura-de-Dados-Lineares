public class Node {
    private Object object;
    private Node prev, next;

    public Node(Object o){
      object = o;
    }

    public Object getObject() {
        return object;
    }
    public void setObject(Object o){
        object = o;
    }

    public Node getPrev(){
        return prev;
    }
    public void setPrev(Node p){
        prev = p;
    }

    public Node getNext(){
        return next;
    }
    public void setNext(Node n){
        next = n;
    }
}