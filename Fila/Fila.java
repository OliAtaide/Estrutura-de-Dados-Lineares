public interface Fila{
  public int tamanho();
  public void enfileirar(Object o);
  public Object desenfileirar() throws EmptyStackException;
  public Object inicio();
}