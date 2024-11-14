public class Main{
    public static void main(String[] args) {
        HeroManager heroManager = new HeroManager();
        
        heroManager.addHero(new Hero("Iron-Man", 85, Affiliation.AVENGERS));
        heroManager.addHero(new Hero("Superman", 90, Affiliation.JUSTICELEAGUE));
        heroManager.addHero(new Hero("Iceman ", 95, Affiliation.XMEN));
        heroManager.addHero(new Hero("Flash", 92, Affiliation.JUSTICELEAGUE));

        System.out.println("Original List of Heroes:");
        heroManager.printHeroes();

        System.out.println("\nSorting using Bubble Sort:");
        heroManager.bubbleSort();
        heroManager.printHeroes();

        System.out.println("\nSorting using Insertion Sort:");
        heroManager.insertionSort();
        heroManager.printHeroes();

        heroManager.removeHero("Superman");
        System.out.println("\nAfter removing Superman:");
        heroManager.printHeroes();

        heroManager.addHero(new Hero("Flash", 88, Affiliation.JUSTICELEAGUE));
        System.out.println("\nAfter adding Flash:");
        heroManager.printHeroes();

        System.out.println("\nHeroes in 2D Array Format:");
        String[][] heroArray = heroManager.displayHeroes();
        System.out.println(Arrays.deepToString(heroArray));
    }
}
