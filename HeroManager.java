import java.util.ArrayList;
import java.util.Arrays;

public class HeroManager{
    public ArrayList<Hero> heroes;

    //Add a hero to the list
    public void addHero(Hero hero){
        heros.add(hero);
    }

    public void removeHero(String name){
        heroes.removeIf(hero -> hero.getName().equals(name));
    }

    public void bubbleSortBypowerLevel() {
        for (int i = 0; i < heroes.size() - 1; i++){
            for (int j = 0; j < heroes.size() - i - 1; j++){
                if(heroes.get(j).getPowerLevel() > heroes.get(j + 1).getPowerLevel()){
                    Hero temp = heroes.get(j);
                    heroes.set(j, heroes.get(j + 1));
                    heroes.set(j + 1, temp);
                }
            }
        } 
    }

    public void insertionSortBypowerLevel() {
        for(int i =1; i<heroes.size(); i++){
            Hero key = heroes.get(i);
            int j = i - 1;

            while(j >= 0 && heroess.get(j).getPowerLevel() > key.PowerLevel()){
                heroes.set(j + 1, heroes.get(j));
                j--;
            }
            heroes.set(j+1, key);
        }
    }

    public void displayHeroes2DArray(){
        String [][] heroArray = new String[heroes.size()][3];

        for(int i = 0; i <heroes.size(); i++){
            heroArray[i][0] = heroes.get(i).getName();
            heroArray[i][1] = String.valueOf(heroes.get(i).getPowerLevel());
            heroArray[i][2] = heroes.get(i).getpowerLevel().toString();
        }

        System.out.println(Arrays.deepToString(heroArray));
    }

    public void displayHeroes(){
        for(int i = 0; i< heroes.size(); i++){
            System.out.println(heroes.get(i));
        }
    }
}
