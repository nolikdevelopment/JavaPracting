public class Entity {
    private String name;
    private int age;

    public Entity(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void take() {
        System.out.println("Сообщение отправилось в океан.");
    }
    public void isHeat() {
        System.out.println("Получение урона");
    }
}
