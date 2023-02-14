package util;

import javax.swing.*;

public class ShowAFrame {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame();     // создаем пустую рамку. JFrame - это тип переменной myFrame
        String myTitle = "Пустой фрейм";   // присваиваем название рамки переменной myTitle типа String
        myFrame.setTitle(myTitle);         //
        myFrame.setSize(300,200);   // задаем параметры рамки - ширина и высота
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}
