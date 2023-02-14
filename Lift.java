package util;

public class Lift {
    public static void main(String[] args) {
        int весЧеловека;
        int грузоподъемностьЛифта;
        int количествоЧеловек;

        весЧеловека = 80;
        грузоподъемностьЛифта = 1000;
        количествоЧеловек = грузоподъемностьЛифта / весЧеловека;

        System.out.print("Лифт может поднять ");
        System.out.print(количествоЧеловек);
        System.out.println(" человек.");


//        System.out.println("Верно ли, ");
//        System.out.println("что лифт может поднять ");
//        System.out.println("десять человек?");
//        System.out.println();
//        int весЧеловека = 80;
//        int грузоподъемностьЛифта = 1000;
//        int количествоЧеловек = грузоподъемностьЛифта / весЧеловека;
//        boolean можетПоднять = количествоЧеловек >= 10;
//        System.out.println("можетПоднять=" + можетПоднять);
    }
}
