public class Main {
    public static void main(String[] args) {
        MyList<Integer> num = new MyList<>();
        num.add(1,9);
        System.out.println(num);
        num.add(0,6);
        System.out.println(num);
        num.add(6,6);
        num.add(1,6);
        num.add(1,6);
        num.add(1,6);
        num.add(1,6);
        num.clear();
        System.out.println(num);
        num.add(9);
        System.out.println(num);


    }
}