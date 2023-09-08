package org.pet.projects.Snake;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;


public class StartGame {
    public static void startGame(Scanner scanner) throws IOException {
        System.out.println(startData());
        String answer = inputData(scanner);
        if (answer.toUpperCase().equals("YES")) {
            new GameFrame();
        } else if (answer.toUpperCase().equals("NO")) {
            System.exit(0);
        }
    }

    static String inputData(Scanner scanner) {
        while (true) {
            String answer;
            if (scanner.hasNextLine()) {
                answer = scanner.nextLine();
                if (answer.toUpperCase().equals("YES")) {
                    return answer;
                } else if (answer.toUpperCase().equals("NO")) {
                    System.out.println("See you later :(");
                    System.exit(0);
                } else {
                    System.out.println("Wrong data. Try again");
                }
            }
        }
    }

    static String startData() {
        String information = """
                \u2757This version of the game is not final as it is under development\u2757
                Before starting the game, we suggest that you familiarize yourself with the rules:
                1) You play as a snake that you can control using the arrows on your keyboard.
                2) You need to collect apples that increase the size of your snake.
                3) You cannot crash into the edges of the map or into the tail of your game because the game will be finished.
                Your goal is to collect as many points as possible.
                In the end of the game you have opportunity to save your nickname and results :)
                Do you want to start the game?
                Write YES/NO for continue""";
        return information;
    }

    static String nickName(Scanner scanner) {
        System.out.println("Enter your name please");
        String name = scanner.nextLine();
        System.out.println("Your nickname:" + name);
        return name;
    }

    static LocalDate getDate() {
        return LocalDate.now();
    }
}
