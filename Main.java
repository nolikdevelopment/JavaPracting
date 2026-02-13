public class Main {
    public static void main(String[] args) {

        // Присвоение переменных //

        int a, b, c;
        boolean isRunning = true;
        boolean calc = true;
        a = 5;
        b = 10;
        c = 15;
        System.out.println(a + b + c);

        // Переменные //

        int number = 10;
        double number1 = 10d;
        float number2 = 10.0f;
        short number3 = 32767;
        long number4 = 10;
        var number5 = 10;

        // if, else

        if (isRunning) {
            System.out.println("Костян бежит");
        } else {
            System.out.println("Костян перестал бежать");
        }

        // if, else if

        if (!isRunning) {
        } else if (isRunning) {
            System.out.println("Костян упал");
        }
        // if

        if (isRunning) {
            System.out.println("Костян бежит");
        }
        // Тернарный оператор // ( Если, то, иначе )

        int sum = calc ? a : b;
        System.out.println(sum);

        // Массивы //

        int[] numbers = {
                1, // [0]
                2, // [1]
                7, // [2]
                4, // [3]
                12, // [4]
        };
        System.out.println(numbers[2]);

        // Строки ( String )

        String string = "nolikdevelopment";
        System.out.println(string);

        // Операции // ( + - * / )

        System.out.println(a + b);
        System.out.println(c - b);
        System.out.println(a * b);
        System.out.println(c / a);

        // Циклы //

        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }
        while (a < b) {
            System.out.println(a++);
        }

        // Свитчи //

        switch (a) {
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            case 3:
                System.out.println("3");
        }
    }
}

