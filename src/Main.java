public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow("Bobo", "man", 3, 25);
        Cow cow1 = new Cow("Bobo", "man", 3, 25);
        Cow cow2 = new Cow("Bobo", "man", 3, 25);
        Cow cow3 = new Cow("Bobo", "man", 3, 25);
        Cow cow4 = new Cow("Bobo", "man", 3, 25);
        Cow cow5 = new Cow("Bobo", "man", 3, 25);

        Cow[] cows = new Cow[]{cow,cow1,cow2,cow3,cow4};
//        for (int i = 0; i < cows.length ; i++) {
//            System.out.println("cow " + cows[i]);
//        }
        Cow[] cows1 = new Cow[]{cow};

        Sheep sheep = new Sheep("lala", "wumen", 4, 30);
        Sheep sheep1 = new Sheep("lala", "wumen", 4, 30);
        Sheep sheep2 = new Sheep("lala", "wumen", 4, 30);
        Sheep sheep3 = new Sheep("lala", "wumen", 4, 30);

        Sheep[] sheep4 = new Sheep[]{sheep,sheep1,sheep2};
//        for (int i = 0; i < sheep4.length; i++) {
//            System.out.println("sheep " + sheep4[i]);
//        }
        Sheep[] sheep5 = new Sheep[]{sheep};

        Horse horse = new Horse("dada", "men", 5, 40, "black");
        Horse horse1 = new Horse("dada", "men", 5, 40, "black");

        Horse[] horse2 = new Horse[]{horse,horse1};
//        for (int i = 0; i < horse2.length; i++) {
//            System.out.println("Horse "+ horse2[i]);
//        }
        Horse[] horses = new Horse[]{horse};

        Farm farms = new Farm(5, cows,horse2,sheep4,"Firma");
        Farm farms1 = new Farm( 6, cows1,horses,sheep5,"Firma");
        System.out.println(farms);
        System.out.println(farms1);

    }
}