public class newone {
    public static int newFunction(int number) {

        if (number <= 1) {
            System.out.println("first");
            return 1;
        }

        number = number * newFunction(number - 1);
        System.out.println("ahi");
        return number;

    }

    public static void main(String[] args) {

        newone newOne = new newone();
        System.out.println(newOne.newFunction(5));
    }

}
