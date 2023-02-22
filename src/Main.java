import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Задание № 1 Проверка високосный год или нет");
        chekLeapYear(1999);

        System.out.println();
        System.out.println("Задание № 2 Облегченная или обычная версия приложения");
        versionApplication("iOS", 2022);

        System.out.println();
        System.out.println("Задание № 3 доставка");
        timeToDelivery(99);


    }

    public static void chekLeapYear(int year) {
        if ((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0))) {
            System.out.println(year + " год високосный");
        } else System.out.println(year + " год невисокосный");
    }

    public static void versionApplication(String typeOs, int year) {
        String answer;
        if (typeOs.equals("iOS")) {
            answer = "версию приложения для iOS по ссылке";
        } else answer = "версию приложения для Android  по ссылке";

        if (year < LocalDate.now().getYear()) {
            answer = "Установите облегченную " + answer;
        } else answer = "Установите " + answer;

        System.out.println(answer);

    }

    public static void timeToDelivery(int deliveryDistance) {
        int countDays = 1;

        if (deliveryDistance > 20) {
            countDays++;
        }
        if (deliveryDistance > 60) {
            countDays++;
        }

        if (deliveryDistance >= 100) {
            countDays = 0;
        }

        if (countDays != 0) {
            System.out.println("Потребуется дней: " + countDays);
        } else System.out.println("Доставки нет");

    }
}