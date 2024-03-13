public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();


    }

    //        Реализуйте метод, который получает в качестве параметра год, проверяет, является ли он високосным, и выводит результат в консоль.
    public static void Task1() {
        System.out.println("\n Task1 \n Реализуйте метод, который получает в качестве параметра год, проверяет, является ли он високосным.");
        int currentYear = 2021;
        checkLeapYear(currentYear);}

    public static void checkLeapYear(int year) {

        if ((year % 400) == 0 || (year % 4 == 0 && (year % 100) != 0 && year > 1584)) {
            System.out.println(year + "год — високосный год.");
        } else
            System.out.println(year + "год — невисокосный год.");
    }

    //    Написать программу, которая выдает соответствующее сообщение клиенту при наличии двух условий.
    public static void Task2() {
        System.out.println("\n Task2: \n Написать программу, которая выдает соответствующее сообщение клиенту при наличии двух условий.");
        int clientOS = 1;
        int yearPhone = 2021;
        issuesMessages(clientOS, yearPhone);
    }

    public static void issuesMessages(int clientOS, int yearPhone) {
        if (clientOS == 0) {
            if (yearPhone > java.time.LocalDate.now().getYear()) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (yearPhone > java.time.LocalDate.now().getYear()) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Неверная версия ОС");
        }
    }

    public static void Task3() {
        System.out.println("\n Task3: \n Известить клиента о том, когда будет доставлена его карта");
        int deliveryDistance = 60;
        if (calculateDelivery(deliveryDistance) != 0) {
            System.out.println("Потребуется дней: " + calculateDelivery(deliveryDistance) + "+ срок доставки");

        } else System.out.println("Доставки нет.");
    }

    public static int calculateDelivery(int distance) {
        int day = 0;
        int limit1 = 20;
        int limit2 = 60;
        int limit3 = 100;
        if (distance <= limit1) {
            day = 1;        //Доставка в пределах 20 км занимает сутки.
        } else if (distance > limit1 && distance <= limit2) {
            day = 2;        //Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.

        } else if (distance > limit2 && distance <= limit3) {
            day = 3;        //Доставка в пределах от 60 км до 100 км добавляет еще одни сутки.
        } else if (distance > limit3) {
            day = 0;        //Свыше 100 км доставки нет.
        }
        return day;
    }
}


