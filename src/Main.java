public class Main {
    public static void main(String[] args) {
        //Задание 1
        byte someByte = -21;
        short someShort = 4800;
        int someInt = -8991;
        long someLong = 900000L;
        float someFloat = 9.002f;
        double someDouble = 65.2215677;

        System.out.println("Значение переменной someByte с типом byte равно " + someByte);
        System.out.println("Значение переменной someShort с типом short равно " + someShort);
        System.out.println("Значение переменной someInt с типом int равно " + someInt);
        System.out.println("Значение переменной someLong с типом long равно " + someLong);
        System.out.println("Значение переменной someFloat с типом float равно " + someFloat);
        System.out.println("Значение переменной someDouble с типом double равно " + someDouble);

        //Задание 2
        float otherFloat = 27.12f;
        long otherLong = 987678965549L;
        double otherDouble = 2.786;
        int otherInt = 569;
        short otherShort = -159;
        short anotherShort = 27897;
        byte otherByte = 67;

        //Задание 3
        int teacher1 = 23;
        int teacher2 = 27;
        int teacher3 = 30;
        int totalSheets = 480;
        int sheetsPerStudent = totalSheets / (teacher1 + teacher2 + teacher3);
        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги");

        //Задание 4
        short bottlesPerMinute = 16 / 2;
        int bottlesIn20Min = bottlesPerMinute * 20;
        int bottlesIn24Hrs = bottlesIn20Min * 3 * 24;
        int bottlesIn3Days = bottlesIn24Hrs * 3;
        int bottlesInMonth = bottlesIn3Days * 10;

        System.out.println("За 20 минут машина произвела " + bottlesIn20Min + " штук бутылок.");
        System.out.println("За сутки машина произвела " + bottlesIn24Hrs + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + bottlesIn3Days + " штук бутылок.");
        System.out.println("За месяц машина произвела " + bottlesInMonth + " штук бутылок.");

        //Задание 5
        short totalPaint = 120;
        short whitePerClassroom = 2;
        short brownPerClassroom = 4;
        int bothPerClassroom = whitePerClassroom + brownPerClassroom;
        int totalClassrooms = totalPaint / bothPerClassroom;
        int totalWhite = totalClassrooms * whitePerClassroom;
        int totalBrown = totalClassrooms * brownPerClassroom;
        System.out.println("В школе, где " + totalClassrooms + " классов, нужно " + totalWhite +
                " банок белой краски и " + totalBrown + " банок коричневой краски.");

        //Задание 6
        int bananas = 5 * 80;
        int milk = 2 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        int breakfast = bananas + milk + iceCream + eggs;
        float breakfastInKG = ((float) breakfast / 1000);
        System.out.println("Масса завтрака в граммах: " + breakfast);
        System.out.println("Масса завтрака в килограммах: " + breakfastInKG);

        //Задание 7
        double goal = 7.0;
        double diet1 = 0.25;
        double diet2 = 0.5;
        int daysToGoal1 = (int)(goal / diet1);
        int daysToGoal2 = (int)(goal / diet2);
        int daysToGoalAverage = (daysToGoal1 + daysToGoal2) / 2;
        System.out.println("Если худеть на 250 грамм в день, то потребуется " + daysToGoal1 + " дней");
        System.out.println("Если худеть на 500 грамм в день, то потребуется " + daysToGoal2 + " дней");
        System.out.println("Длительность диеты в среднем (в днях): " + daysToGoalAverage);

        //Задание 8
        int salaryMaria = 67760;
        int salaryMariaAnnual = salaryMaria * 12;
        int salaryMariaNew = salaryMaria + salaryMaria / 10;
        int salaryMariaAnnualNew = salaryMariaNew * 12;
        System.out.println("Мария теперь получает " + salaryMariaNew + " рублей." +
                " Годовой доход вырос на " + (salaryMariaAnnualNew - salaryMariaAnnual) + " рублей");

        int salaryDenis = 83690;
        int salaryDenisAnnual = salaryDenis * 12;
        int salaryDenisNew = salaryDenis + salaryDenis / 10;
        int salaryDenisAnnualNew = salaryDenisNew * 12;
        System.out.println("Денис теперь получает " + salaryDenisNew + " рублей." +
                " Годовой доход вырос на " + (salaryDenisAnnualNew - salaryDenisAnnual) + " рублей");

        int salaryChristina = 76230;
        int salaryChristinaAnnual = salaryChristina * 12;
        int salaryChristinaNew = salaryChristina + salaryChristina / 10;
        int salaryChristinaAnnualNew = salaryChristinaNew * 12;

        System.out.println("Кристина теперь получает " + salaryChristinaNew + " рублей." +
                " Годовой доход вырос на " + (salaryChristinaAnnualNew - salaryChristinaAnnual) + " рублей");
    }
}