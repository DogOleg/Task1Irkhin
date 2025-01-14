package ru.mirea.task13_2;

public class task2 {
    private String surname;
    private String name;
    private String patronymic;

    public task2(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public task2(String surname) {
        this.surname = surname;
        this.name = "";
        this.patronymic = "";
    }

    private String getFIO(){
        if (!name.isEmpty() && !patronymic.isEmpty())
            return surname + ' ' + name + ' ' + patronymic;
        else
            return surname;
    }

    public static void main(String[] args) {
        task2 person_name = new task2("marov");
        task2 person_fio = new task2("marov", "german", "andreevich");
        System.out.println(person_name.getFIO());
        System.out.println(person_fio.getFIO());
    }
}
