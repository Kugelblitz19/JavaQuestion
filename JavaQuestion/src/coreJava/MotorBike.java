package coreJava;

abstract class MotorBike {
    abstract void bike();
    abstract class SportsBike extends MotorBike{
        public void brake(){
            System.out.println("SportsBike Brake");
        }
        abstract class MountainBike extends MotorBike{
            public void brake() {
                System.out.println("MountainBike Brake");
            }
    }

    }
}
