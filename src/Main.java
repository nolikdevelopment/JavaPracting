import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Присвоение переменных //

        int a, b, c, g;
        boolean isRunning = true;
        boolean calc = true;
        a = 5;
        b = 10;
        c = 15;
        g = 15;
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
        do {
            System.out.println(g);
            g--;
        } while (g > 0);


        // Свитчи //

        switch (a) {
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            case 3:
                System.out.println("3");
        }

        // continue, break //

        for (int i = 4; i < 7; i++) {
            if (i == 5) continue;
            System.out.println(i);
        }
        for (int i = 0; i < 5; i++) {
            if (i == 5) break;
            System.out.println(i);
        }

        // Исключения //
        int nums;

        try {
            nums = 42 / 0;
            System.out.println(nums);
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0!");
        }

        // Лямба выражения //

        Operation operation;
        operation = (x, y) -> x + y;
        int sums = operation.operation(10, 20);
        System.out.println(sums);

        // Инкасуляция //

        Entity entity = new Entity("Сука", 1);
        entity.take();

        // Наследование //

        Player player = new Player("Джон", 25);
        player.take();

        // Полирмофизм //

        entity.isHeat();
        player.isHeat();

        // Абстракция //

        Car car = new Car();
        car.start();

        // Коллекции //

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Костян");
        arrayList.add("Матвей");
        arrayList.add("Димас");
        arrayList.add("Нечто");
        arrayList.remove("Нечто");
        System.out.println(arrayList);

        Set<String> strings = new HashSet<>();
        strings.add("Зеленый");
        strings.add("Красный");
        strings.add("Белый");
        System.out.println(strings);

        Map<String, Integer> maps = new HashMap<>();
        maps.put("БМВ ", 20);
        maps.put("Мерседес ", 34) ;
        maps.put("Кадилак ", 19 );
        System.out.println(maps);
    }
}
