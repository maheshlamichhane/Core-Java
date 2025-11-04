public class BoundedGen<T extends Number> {
    T t;
    BoundedGen(T t){
        this.t= t;	}

    public T getVal() {
        return t;
    }

    public static void main(String[] args) {


        BoundedGen<Integer> i = new BoundedGen<>(10);
        BoundedGen<Double> d = new BoundedGen<>(10.4);
//         UnBoundedGen<String> s = new UnBoundedGen<String>("heheh");
        System.out.println(i.getVal());
        System.out.println(d.getVal());

    }

}
