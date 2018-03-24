package Main;

import javax.swing.*;
import Settings.GamePlay;

public class Main {

    public static void main(String[] args) {

        JFrame obj = new JFrame("Game");
        obj.setBounds(10, 10, 700, 600);
        obj.setResizable(false);
        obj.setVisible(true);

        GamePlay game = new GamePlay();
        obj.add(game);

        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
