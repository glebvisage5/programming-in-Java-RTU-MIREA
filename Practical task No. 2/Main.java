public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Kia K5", "ABC123", "Черный", 2021);
        Car car2 = new Car();
        Car car3 = new Car("Nisan gtr", "XYZ789");

        System.out.println("Информация первого авто: " + car1);
        System.out.println("Информация второго авто: " + car2);
        System.out.println("Информация третьего авто: " + car3);

        car2.setModel("Ford Focus");
        car2.setLicense("LMN456");
        car2.setColor("Синий");
        car2.setYear(2012);

        System.out.println("Обновленная информация второго авто: " + car2);

        System.out.println("Возраст первой машины: " + car1.getAge() + " лет");
        System.out.println("Возраст второй машины: " + car2.getAge() + " лет");
        System.out.println("Возраст третьей машины: " + car3.getAge() + " лет");
    }
}
