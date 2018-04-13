package com.yeying.exercise.qinghua.newchapter6.Exercise2;

public class AnimalTest {
    public static void testAnimal(Animal animal){
        animal.eat();
        animal.sleep();
    }
    public static void main(String [] args){
        Animal rabbit = new Rabbit();
        Animal tiger = new Tiger();
        AnimalTest.testAnimal(rabbit);
        AnimalTest.testAnimal(tiger);
    }
}
