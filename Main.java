package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DistanceExaminator de = new DistanceExaminator();
        Scanner in = new Scanner(System.in);
        int task = 8;
        String name, login, password, passwordRep;
        while (task != 0) {
        try {
                if (de.getCurreantUser() == -2)
                    System.out.print("[0] - завершение работы" + '\n' +
                    "[1] - регистрация в системе" + '\n' +
                    "[2] - вход в ситему" + '\n');
                if (de.getCurreantUser() == -1)
                    System.out.print(
                            "[3] - выход из системы" + '\n' +
                            "[4] - добавление вопроса" + '\n');
                if (de.getCurreantUser() >= 0)
                    System.out.print(
                            "[3] - выход из системы" + '\n' +
                            "[5] - сдача экзамена" + '\n' +
                            "[6] - узнать оценку" + '\n' +
                            "[7] - сменить пароль" + '\n');
                System.out.print("Выберите нужный пункт меню: ");
                task = in.nextInt();
                if (de.getCurreantUser() == -2)
                    switch (task) {
                case 0:
                    System.out.print("Завершение работы");
                    break;
                case 1:
                    in.nextLine();
                    System.out.print("Введите свое имя: ");
                    name = in.nextLine();
                    System.out.print("Введите логин: ");
                    login = in.nextLine();
                    System.out.print("Введите пароль: ");
                    password = in.nextLine();
                    System.out.print("Повторите пароль: ");
                    passwordRep = in.nextLine();
                    de.addUser(name, login, password, passwordRep);
                    System.out.println("Вы успешно зарегистрировались");
                    continue;
                case 2:
                    in.nextLine();
                    System.out.print("Введите логин: ");
                    login = in.nextLine();
                    System.out.print("Введите пароль: ");
                    password = in.nextLine();
                    de.logining(login, password);
                    System.out.println("Вы успешно вошли в систему");
                    continue;
                default:
                    System.out.println("Вы ввели непредусмотренную комбинацию символов");
                    continue;
            }
                if (de.getCurreantUser() == -1)
                    switch (task) {
                        case 3:
                            de.exit();
                            System.out.println("Вы успешно вышли");
                            continue;
                        case 4:
                            in.nextLine();
                            System.out.print("Введите вопрос: ");
                            login = in.nextLine();
                            System.out.print("Введите ответ на вопрос: ");
                            password = in.nextLine();
                            de.addQuestion(login, password);
                            System.out.println("Вопрос успешно добавлен");
                            continue;
                        default:
                            System.out.println("Вы ввели непредусмотренную комбинацию символов");
                            continue;
                    }
                if (de.getCurreantUser() >= 0)
                    switch (task){
                        case 3:
                            de.exit();
                            System.out.println("Вы успешно вышли");
                            continue;
                        case 5:
                            System.out.println("Экзамен начался");
                            de.examination();
                            System.out.println("Экзамен завершен");
                            continue;
                        case 6:
                            System.out.println("Ваша оценка за экзамен: " + de.getMark());
                            continue;
                        case 7:
                            in.nextLine();
                            System.out.print("Введите логин: ");
                            name = in.nextLine();
                            System.out.print("Введите страрый пароль: ");
                            login = in.nextLine();
                            System.out.print("Введите новый пароль: ");
                            password = in.nextLine();
                            System.out.print("Повторите новый пароль: ");
                            passwordRep = in.nextLine();
                            de.changePassword(name, login, password, passwordRep);
                            System.out.println("Вы успешно сменили пароль");
                            continue;
                        default:
                            System.out.println("Вы ввели непредусмотренную комбинацию символов");
                            continue;
                    }
            }
        catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
