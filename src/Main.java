public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        int age = 17;
        if (age >= 18) {
            System.out.println(" Ты совершенолетний ");
        } else {
            System.out.println(" Ты не достиг совершенолетия, нужно немного подождать");
        }

        int coldly = 6;
        if (coldly <= 5) {
            System.out.println(" На улице " + coldly + " градусов" + " нужно надеть шапку");
        }
        if (coldly > 5) {
            System.out.println(" На улице " + coldly + " градусов" + " можно идти без шапки ");
        }

        int speed = 100;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " км/ч, " + " то придется заплатить штраф");
        }
        if (speed < 60) {
            System.out.println("Если скорость " + speed + " км/ч, " + " можно ездить спокойно ");
        }

        int year = 35;
        if (year >= 2 && year <= 6) {
            System.out.println("Если возраст человека равен " + year + ", то ему нужно ходить в детский сад");
        }
        if (year >= 7 && year <= 17) {
            System.out.println("Если возраст человека равен " + year + ", то ему нужно ходить в школу");
        }
        if (year >= 18 && year <= 24) {
            System.out.println("Если возраст человека равен " + year + ", то его место в университете");
        }
        if (year > 24) {
            System.out.println("Если возраст человека равен " + year + ", то ему пора ходить на работу");

            int childYear = 20;
            if (childYear < 5) {
                System.out.println("Если возраст ребенка равен " + childYear + ", то ему нельзя кататься на аттракционе");
            }
            if (childYear >= 5 && childYear < 14) {
                System.out.println("Если возраст ребенка " + childYear + ", то ему можно кататься на аттракционе в сопровождении взрослого");
            }
            if (childYear >= 14) {
                System.out.println("Если возраст ребенка " + childYear + ", то ему можно кататься на аттракцыоне без сопровождения взрослого");
            }
        }

        int capacityVan = 101;
        if (capacityVan > 102) {
            System.out.println("Вагон уже полностью забит");
        }if (capacityVan < 60) {
            System.out.println("Есть место в вагоне - сидячие");
        } else if (capacityVan >60 && capacityVan < 102) {
            System.out.println("Есть место в вагоне - стоячие");
        }

        int one = 1;
        int two = 2;
        int three = 3;
        {
            if (one > two && one > three) {
                System.out.println(one);
            } else {
                if (two > three) {
                    System.out.println(two);
                } else {
                    System.out.println(three);
                }
            }
        }
    }
}

