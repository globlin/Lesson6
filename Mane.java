public class Mane {

    public static void main(String[] args) {
        System.out.println("Кошка: ");
        Animal vaska = new Cat(200, 0, 2);
        vaska.run(320);
        vaska.swim(5);
        vaska.jump(1.8);

        System.out.println("Собака: ");
        Animal belka = new Dog(500, 10, 0.5);
        belka.run(400);
        belka.swim(2);
        belka.jump(0.4);

    }
}
