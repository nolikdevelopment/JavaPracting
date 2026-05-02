public class Player extends Entity {
     public Player(String name, int age) {
         super(name, age);
     }

    @Override
    public void take() {
        System.out.println("Игрок существует!");
    }

    @Override
    public void isHeat() {
        System.out.println("Я получил урон!");
    }
}
