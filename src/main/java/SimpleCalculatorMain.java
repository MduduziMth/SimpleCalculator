public class SimpleCalculatorMain {

    public static void main(String[] args) {

        System.out.println(add(1,2,3,4,5));
        System.out.println(add(1,3));
        System.out.println(add(-1,-1));


        System.out.println();
        System.out.println(multiply(1,2,3,4,5));
        System.out.println(multiply(1,3));
        System.out.println(multiply(-1,3));
    }


    public static int add(int ...number)
    {
        int sum = 0;

        for(int i: number)
        {
            sum+=i;
        }

        return sum;
    }

    public static int multiply(int ...number)
    {
        int sum = 1;

        for(int i: number)
        {
            sum*=i;
        }

        return sum;
    }
}
