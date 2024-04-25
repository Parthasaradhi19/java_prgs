class Multiplication {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Multiplication table of " + a + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " * " + i + " = " + (a * i));
        }
    }
}
