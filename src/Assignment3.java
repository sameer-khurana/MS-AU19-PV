


public class Assignment3 <T extends Comparable<T>> implements Comparable<Assignment3<T>>{
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public boolean equals(Object t1){
        if(!(t1 instanceof Assignment3))
            return false;

        if(((Assignment3) t1).getT().equals(this.getT()))
            return true;

        return  false;
    }

    public static void main(String[] args) {

    }

    @Override
    public int compareTo(Assignment3<T> o) {
        return this.getT().compareTo( o.getT());
    }
}
