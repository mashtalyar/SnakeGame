package org.pet.projects.Snake;

import java.io.IOException;
import java.util.Scanner;

import static org.pet.projects.Snake.GamePanel.save;
import static org.pet.projects.Snake.StartGame.startGame;

public class SnakeGame {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        startGame(scanner);
        save();
    }
}
