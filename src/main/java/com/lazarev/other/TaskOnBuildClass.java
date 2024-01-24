package com.lazarev.other;

public class TaskOnBuildClass {

    private static final int CRITICAL_LENGTH = 16;
    private String password;

    //Класс для вычисления сложности пользовательского пароля
    public TaskOnBuildClass(String password) {
        this.password = password;
    }

    //Проверяет что длина пароля больше значения CRITICAL_LENGTH
    public boolean isLength() {
        return password.length() > CRITICAL_LENGTH;
    }

    //Проверяет наличие спецсимволов в пароле
    public boolean hasSpecialSymbol() {
        return password.matches(".*[!@#$%^&*(),.?\":{}|<>].*");
    }

    //Проверяет наличие цифр в пароле
    public boolean hasNumbers() {
        return password.matches(".*\\d.*");
    }

    //Проверяет наличие разных регистров в пароле
    public boolean hasRegister() {
        return password.matches(".*[A-Z].*");
    }

    //Посчитать сложность пароля
    public int showComplicated() {
        int complexity = 0;
        if (isLength()) complexity++;
        if (hasSpecialSymbol()) complexity++;
        if (hasNumbers()) complexity++;
        if (hasRegister()) complexity++;
        return complexity;
    }
}