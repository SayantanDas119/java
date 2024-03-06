class factorial {
    static void Factorial(int number) {
        int fact = 1;
        for (int i = 1; i < number; i++)
            fact = fact * i;
        System.out.println("factorial of two number is :" + fact);
    }

    public static void main(String[] args) {
        int number;
        Factorial(5);
    }
}