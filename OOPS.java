class Car {
    String color;
    int speed;
}

class Main {
    public static void main(String[] args) {
        Car c1 = new Car();

        c1.color = "Red";
        c1.speed = 100;

        System.out.println(c1.color);
    }
}