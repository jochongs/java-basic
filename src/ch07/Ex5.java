package ch07;

class Car {}

class SuperCar extends Car {}
class Ambulance extends Car {}

public class Ex5 {
    SuperCar superCar = new SuperCar();
    Car car = new Car();

    Car car2 = (Car)superCar;
    SuperCar superCar2 = (SuperCar) car;

    Ambulance ambulance = (Ambulance) car2;
}
