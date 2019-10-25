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
                System.out.print("[0] - завершение работы" + '\n' +
                        "[1] - регистрация в системе" + '\n' +
                        "[2] - вход в ситему" + '\n' +
                        "[3] - выход из системы" + '\n' +
                        "[4] - добавление вопроса (для перподователя)" + '\n' +
                        "[5] - сдача экзамена" + '\n' +
                        "[6] - узнать оценку" + '\n' +
                        "[7] - сменить пароль" + '\n' +
                        "Выберите нужный пункт меню: ");
                task = in.nextInt();
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
                        break;
                    case 2:
                        in.nextLine();
                        System.out.print("Введите логин: ");
                        login = in.nextLine();
                        System.out.print("Введите пароль: ");
                        password = in.nextLine();
                        de.logining(login, password);
                        System.out.println("Вы успешно вошли в систему");
                        break;
                    case 3:
                        de.exit();
                        System.out.println("Вы успешно вышли");
                        break;
                    case 4:
                        in.nextLine();
                        System.out.print("Введите вопрос: ");
                        login = in.nextLine();
                        System.out.print("Введите ответ на вопрос: ");
                        password = in.nextLine();
                        de.addQuestion(login, password);
                        System.out.println("Вопрос успешно добавлен");
                        break;
                    case 5:
                        System.out.println("Экзамен начался");
                        de.examination();
                        System.out.println("Экзамен завершен");
                        break;
                    case 6:
                        System.out.println("Ваша оценка за экзамен: " + de.getMark());
                        break;
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
                        break;
                    default:
                        System.out.println("Вы ввели непредусмотренную комбинацию символов");
                        break;
                }
            }
        catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
