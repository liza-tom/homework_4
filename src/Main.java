public class Main {
    public static void main(String[] args) {

        //task 1
        int age = 6;
        boolean ageUnderEighteen = age < 18;
        if (ageUnderEighteen) {
            System.out.println("Если возраст человека равен " + age +
                    ", то он не достиг совершеннолетия, нужно немного подождать");
        } else {
            System.out.println("Если возраст человека равен " + age +
                    ", то он совершеннолетний ");
        }

        //task 2
        int temperature = 7;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        //task 3
        int speed = 70;
        boolean speedAboveSixty = speed > 60;
        if (speedAboveSixty) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

        //task 4
        int age2 = 9;
        if (age2 >= 2 && age2 <= 6) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в детский сад");
        }
        if (age2 >= 7 && age2 <= 17) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в школу");
        }
        if (age2 >= 18 && age2 <= 24) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в университет");
        }
        if (age2 > 24) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить на работу");
        }

        //task 5
        int ageForAttractions = 6;
        if (ageForAttractions < 5) {
            System.out.println("Если возраст ребенка равен " + ageForAttractions + ", то ему нельзя кататься на аттракционе");
        }
        if (ageForAttractions >= 5 && ageForAttractions <= 14) {
            System.out.println("Если возраст ребенка равен " + ageForAttractions + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (ageForAttractions > 14) {
            System.out.println("Если возраст ребенка равен " + ageForAttractions + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        //task 6
        int amountOfPeople = 60;
        int capacity = 102;
        int seats = 60;
        if (amountOfPeople < seats) {
            System.out.println("В вагоне есть сидячее место");
        }
        if (amountOfPeople >= seats && amountOfPeople < capacity) {
            System.out.println("В вагоне есть стоячее место");
        }
        if (amountOfPeople >= capacity) {
            System.out.println("Вагон полностью забит");
        }

        //task 7
        int one = 5;
        int two = 2;
        int three = 5;
        if (one > two && one > three) {
            System.out.println("Самое большое число " + one);
        }
        if (one == two && one > three) {
            System.out.println("Самие большие совпадают -  " + one);
        }
        if (two > one && two > three) {
            System.out.println("Самое большое число " + two);
        }
        if (two > one && two == three) {
            System.out.println("Самие большие совпадают -  " + two);
        }
        if (three > one && three > two) {
            System.out.println("Самое большое число " + three);
        }
        if (three == one && three > two) {
            System.out.println("Самие большие совпадают -  " + three);
        }
        if (three == one && three == two){
            System.out.println("Все числа равны " + three);
        }
    }
}