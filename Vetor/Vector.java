public class Vector{
    Object V[];
    int n;

    public Vector(int N){
        V = new Object [N];
        n = -1;
    }

    public Object elementAtRank(int r){
        return V[r];
    }

    public Object replaceAtRank(int r, Object o) throws EmptyRankException{
        if(V[r] == null){
            throw new EmptyRankException("Nulo.");
        }
        Object s = V[r];
        V[r] = o;
        return s;
    }

    public void insertAtRank(int r, Object o){
        if(n == V.length-1){
          Object N[] = new Object[V.length * 2];
          for(int i = 0; i < V.length; i++){
            N[i] = V[i];
          }
          V = N;
        }
        for(int i = n; i >= r; i--){
            V[i+1] = V[i];
        }
        V[r] = o;
        n++;
    }

    public Object removeAtRank(int r) throws EmptyRankException{
        if(V[r] == null){
            throw new EmptyRankException("Nulo.");
        }
        Object del = V[r];
        V[r] = null;
        for(int i = r; i < n; i++){
            V[i] = V[i+1];
            
        }
        n--;
        return del;
    }

    public void debug(){
//        if(n != -1){
          for(int i = 0; i < V.length; i++){
            System.out.print(V[i] + ", ");
          }
//        }
      System.out.println(".");
    }
}