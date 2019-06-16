


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
        Assignment3<Integer> a = new Assignment3<>();
        Assignment3<Integer> a1 = new Assignment3<>();
        a.setT(10);
        a1.setT(10);
        System.out.println(a.equals(a1));
        a1.setT(20);
        System.out.println(a.compareTo(a1));
    }

    @Override
    public int compareTo(Assignment3<T> o) {
        return this.getT().compareTo( o.getT());
    }
}
