public interface Tad {
  public int size_rubra();
  public int size_negra();
  public void push_rubra(Object o);
  public void push_negra(Object o);
  public Object pop_rubra() throws Exception;
  public Object pop_negra() throws Exception;
  public void items_rubra();
  public void items_negra();
}