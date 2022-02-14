package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here

// Task1

        String firstName = "Ivanov ";
        String middleName = "Ivan ";
        String lastName = "Ivanovich ";
        String fullName = firstName + middleName + lastName;
        System.out.println("ФИО сострудник - " + fullName);

//Task2

        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName);

//Task3

        fullName = fullName.replace(" ", ";");
        System.out.println("Данные ФИО сотрудника для административного отдела - " + fullName);

//Task4

        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + fullName);

    }
}
