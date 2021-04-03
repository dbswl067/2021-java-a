package view;

import racingcar.Car;

import java.util.List;

public class ResultView {
    public static final String Bar = "-";

    public static void printResultTitle(){
        System.out.println();
        System.out.println("실행 결과");
    }

    public static void printResultPosition(List<Car> cars){
        for(Car car : cars) {
            printCarPosition(car);
        }
    }

    public static void printCarPosition(Car car) {
        System.out.print(car.getName() + " : ");
        for (int i = 0; i < car.getPosition(); i++) {
            System.out.print(Bar);
        }
        System.out.println();
    }
}
