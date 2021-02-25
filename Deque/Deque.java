public interface Deque{
  public void inserirInicio(Object o);
  public void inserirFim(Object o);
  public Object removerInicio() throws EmptyStackException;
  public Object removerFim() throws EmptyStackException;
}