
public class Main {
    public static void main(String[] args) {

        int eaters = 5; // сколько людей будут есть

        int water = 3000; // милилитров воды
        int potatoes = 5; // картофелин
        int chicken = 6; // куринных бёдер
        int spices = 10; // ложек специй

        System.out.println("Сварили суп. На одного человека вышло:");
        System.out.println((water / eaters) + " милилитров(а) воды");
        System.out.println((potatoes / eaters) + " картофелин(а/ы)");
        System.out.println((chicken / eaters) + " куринных(ое) бёдер(ро)");
        System.out.println((spices / eaters) + " ложек(ки/ка) специй");
    }
}