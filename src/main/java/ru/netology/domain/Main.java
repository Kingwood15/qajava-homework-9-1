package ru.netology.domain;

public class Main {
    public static void main(String[] args) {

        Post post = new Post();
        post.birthday = new FormDate();

        post.name = "Иван";
        post.passport = "1234 № 123456";
        post.patronymic = "Иванович";
        post.phone = "+7(919)-123-45-67";
        post.surname = "Иванов";
        post.subscription = true;

        post.birthday.day = 26;
        post.birthday.month = 4;
        post.birthday.year = 1986;
    }
}
