package Part_One_Fundamentals;
class RandomNumbers {
    public static void main(String[] args) {
        // Random double value between 0 and 1
        System.out.println(Math.random());

        // Random double value between 0 and 9
        double a = Math.random() * 10;
        System.out.println(a);

        // Random int value between 0 and 9
        int b = (int) (Math.random() * 10);
        System.out.println(b);

        // Random int value between 1 and 10
        int c = (int) (Math.random() * 10) + 1;
        System.out.println(c);

        // Random int value between 10 and 20
        int d = (int) (Math.random() * 11) + 10;
        System.out.println(d);
    }
}
