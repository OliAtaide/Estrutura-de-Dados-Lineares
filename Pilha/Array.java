public class Array implements Tad{
  private Object S[];
  private int t = -1;

  public Array(int t){
    S = new Object[t];
  }
  public int size(){
    return t+1;
  }
  public void push(Object o){
    if(t == S.length -1){
      Object[] N = new Object[S.length*2];
      for(int i = 0; i <= t; i++){
        N[i] = S[i];
      }
      S = N;
    }
    t = t + 1;
    S[t] = o;
  }

  public Object pop() throws EmptyStackException{
    if(t == -1){
      throw new EmptyStackException("Pilha vazia.");
    }
    Object temp = S[t];
    S[t] = null;
    t = t - 1;
    return temp;
  }

  public void items(){
    if(t == -1){
      return;
    }
    System.out.print("|");
    for(int i = 0; i <= t; i++){
      System.out.print(" " + S[i] + " |");
    }
    System.out.print("\n");
  }
}