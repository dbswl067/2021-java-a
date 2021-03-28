package racingcar;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분");
        String[] carName = scanner.nextLine().split(",");

        System.out.println("시도할 회수는 몇회인가요?");
        int number = scanner.nextInt();

        for(int i = 0; i < number; i++){
            Car car = new Car(carName[i]);
        }
    }
}