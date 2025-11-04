public class UnBoundedGen<T> {

        T obj;
    UnBoundedGen(T obj){
            this.obj = obj;
        }

        public void show() {
            System.out.println(obj.getClass().getName());
        }

        public T getOb() {
            return obj;
        }


    public static void main(String[] args) {
        UnBoundedGen<String> obj = new UnBoundedGen<>("mahesh");
        obj.show();
        UnBoundedGen<Integer> obj2 = new UnBoundedGen<>(10);
        obj2.show();
    }
    }
