package lesson07;

public class Main {
    public static void main(String[] args) {
        Cat [] cat = new Cat[3];
        cat[0] = new Cat("Барсик", 10);
        cat[1] = new Cat ("Персик", 20);
        cat[2] = new Cat ("Мурзик", 30);

        Plate plate = new Plate(30);

        while(true) {
            if (plate.getFoodPlate() >= 0) {
                for (int i = 0; i < cat.length; i++) {
                    if (plate.eatingFood(cat[i].getAppetite())) {
                        cat[i].setAppetite(0);
                        System.out.printf("Кот %s насытился.", cat[i].getName());
                        System.out.println();
                    } else {
                        System.out.printf("Для кота %sа еды недостаточно.", cat[i].getName());
                        System.out.println();
                    }
                }
                for (int i = 0; i < cat.length; i++) {
                    if (plate.getFoodPlate() == 0 || plate.getFoodPlate() < cat[i].getAppetite()) {
                        System.out.println("Тарелка пуста");
                        plate.addFood(plate.getFoodPlate());
                    }
                }
                if (allCatsAreFed(cat)) return;
            }
        }
    }
    public static boolean allCatsAreFed(Cat[] cat) {
        boolean allCats = true;
        for (int i = 0; i < cat.length; i++) {
            allCats &= (cat[i].getAppetite() == 0);
        }
        if (allCats) {
            System.out.println("Все коты накормлены!");
            return true;
        }
        return false;
    }
}