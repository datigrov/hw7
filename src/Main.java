public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Задача № 1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника - " +  fullName);


        System.out.println("Задача № 2");
        //fullName = fullName.replace("Ivanov Ivan Ivanovich", "IVANOV IVAN IVANOVICH");
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());


        System.out.println("Задача № 3");
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println(fullName);


    }
}