public class Main {
    public static void main(String[] args) {
        int age = 17;
        if (age >= 18){
            System.out.println("он совершеннолетний");
        } else {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать");}


        int temp = 5;
        if (temp < 5){
            System.out.println("На улице холодно, " + temp + " градусов, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, " + temp + " градусов, можно идти без шапки");}


        int speed = 60;
        if (speed > 60){
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");}
        else {
            System.out.println("Если скрость " + speed + " км/ч, то можно ездить спокойно");}


        int age1 = 44;
        if (age1 >=2 && age1 <= 18){
            System.out.println("Если возраст человека равен " + age1 + ",то ему нужно ходить в сад");}
        if (age1 >=7 && age1 <= 17){
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в школу");}
        if (age1 >=18 && age1 <= 24){
            System.out.println("Если возраст человека равен " + age1 + ", то его место в университете");}
        if (age1> 24){
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в на работу");}


        int ageOfChild = 44;
        if (ageOfChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageOfChild + ", то ему нельзя кататься на аттракционе");}
        if (ageOfChild >= 5 && ageOfChild <= 14){
            System.out.println("Если возраст ребенка равен " + ageOfChild + ", то ему можно кататься на аттракционе в сопровождении взрослого");}
        if (ageOfChild >= 14) {
            System.out.println("Если возраст ребенка равен " + ageOfChild + ", то ему можно кататься на аттракционе без сопровождения взрослого");}



        int capacitiOfCarridge = 59;
        if (capacitiOfCarridge < 102){
            System.out.println("в вагоне есть места");}
        else {
            System.out.println("в вагоне мест нет");}
        if (capacitiOfCarridge < 60){
            System.out.println("есть сидячие места и стоячие места");}
        if (capacitiOfCarridge > 60 && capacitiOfCarridge < 102){
            System.out.println("есть стоячие места");}


        int one = 3;
        int two = 1;
        int three = 2;
        if (one >= two && one >= three){
            System.out.println("Максимальное число в переменной one, равно " +one);
        } else {
            if (two >=three){
                System.out.println("Максимальное число в переменной two, равно " +two);
            }else {
                System.out.println("Максимальное число в переменной three, равно " +three);}
        }





















    }



}



