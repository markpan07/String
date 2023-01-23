public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();


    }

    private static void task1() {
        System.out.println("Task1");
        String firstName = "Ivan";
        String lastName = "Ivanov";
        String middleName = "Ivanovich";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника " + fullName);
    }

    private static void task2() {
        System.out.println("Task2");
        String firstName = "Ivan";
        String lastName = "Ivanov";
        String middleName = "Ivanovich";
        String fullName = lastName + " " + firstName + " " + middleName;
        String correctFullName = fullName.toUpperCase();
        System.out.println(correctFullName);
    }

    private static void task3() {
        System.out.println("Task3");
        String firstName = "Иван";
        String lastName = "Семён";
        String middleName = "Фёдорович";
        String fullName = lastName + " " + firstName + " " + middleName;
        String correctFullName = fullName.replace('ё', 'е');
        System.out.println(correctFullName);
    }


}