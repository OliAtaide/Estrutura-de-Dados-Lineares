public class Array implements Fila{
  private Object S[];
  private int t, i, f;

  public Array(int t, int i){
    S = new Object[t];
    this.t = t;
    this.i = i;
    f = i;
  }

  public int tamanho(){
    return (t - i + f) % t;
  }

  public void enfileirar(Object o){
    int tam = tamanho();
    if(tam == t - 1){
      int t2 = t*2;
      Object[] N = new Object[t2];
      for(int i = this.i, j = this.i; i != f; i = (i + 1) % t, j = (j + 1) % (t2)){
        N[j] = S[i];
      } // j = 0
      f = (f + t) % t2;
      t = t2;
      S = N;
    }
    S[f] = o;
    f = (f + 1) % t;
  }

  public Object desenfileirar() throws EmptyStackException{
    if(i == f){
      throw new EmptyStackException("Pilha vazia.");
    }
    Object o = S[i];
    i = (i + 1) % t;
    return o;
  }

  public Object inicio(){
    return S[i];
  }

  public void items(){
    if(i == f){
      return;
    }
    System.out.print("|");
    for(int i = this.i; i != f; i = ( i + 1 ) % t){
      System.out.print(" " + i + " - " + S[i] + " |");
    }
    System.out.print("\n");
  }

}