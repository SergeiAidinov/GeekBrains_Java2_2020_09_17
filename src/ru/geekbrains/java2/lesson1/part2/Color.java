package ru.geekbrains.java2.lesson1.part2;

public enum Color {
//    BLACK,
//    WHITE,
//    RED,
//    GRAY



    WHITE("Белый"),
    RED("Рыжий"),
    BLACK("Черный"),
    GRAY("Серый");

    public static void test() {
        System.out.println("dsfs");
    }

    private String russianColor;

    Color(String russianColor) {
        this.russianColor = russianColor;
    }

    public String getRussianColor() {
        return russianColor;
    }

}
