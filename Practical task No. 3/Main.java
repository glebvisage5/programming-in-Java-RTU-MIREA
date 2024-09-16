package app;

import vehicles.Car;
import vehicles.ElectricCar;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setOwnerName("Назар");
        myCar.setInsuranceNumber(12345);
        myCar.setEngineType("V6");

        System.out.println("Имя владельца: " + myCar.getOwnerName());
        System.out.println("Страховой номер: " + myCar.getInsuranceNumber());
        System.out.println("Тип двигателя: " + myCar.getEngineType());

        ElectricCar myElectricCar = new ElectricCar();
        myElectricCar.setOwnerName("Ваня");
        myElectricCar.setInsuranceNumber(67890);
        myElectricCar.setEngineType("Электрический");
        myElectricCar.setBatteryCapacity(75);

        System.out.println("\nИмя владельца: " + myElectricCar.getOwnerName());
        System.out.println("Страховой номер: " + myElectricCar.getInsuranceNumber());
        System.out.println("Тип двигателя: " + myElectricCar.getEngineType());
        System.out.println("Емкость аккамулятора: " + myElectricCar.getBatteryCapacity() + " мАч");
    }
}
