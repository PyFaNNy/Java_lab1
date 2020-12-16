import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        final String apple = "Apple";
        final String cocktail = "Cocktail";
        final String sandwich = "Sandwich";

        System.out.println("What will you order?");

        String name = scan.nextLine();

        while(!((name.equals(apple))||(name.equals(cocktail))||(name.equals(sandwich)))){
            System.out.println("Repeat I didn't hear");
            name = scan.nextLine();
        }

        switch(name)
        {
            case apple:
                System.out.println("How many apples?");

                Double applNum = scan.nextDouble();

                Apple appleClass = new Apple(applNum);

                appleClass.calculateCalories();
                appleClass.consume();
                break;
            case cocktail:
                System.out.println("how many drink and fruit do you want?");

                Double volumeDrink = scan.nextDouble();
                Double volumeFruit = scan.nextDouble();

                Cocktail cocktailClass = new Cocktail(volumeDrink,volumeFruit);

                cocktailClass.calculateCalories();
                cocktailClass.consume();
                break;
            case sandwich:
                System.out.println("How many slices of bread cheese and hum to put?");

                Double volumeBread = scan.nextDouble();
                Double volumeCheese = scan.nextDouble();
                Double volumeHum = scan.nextDouble();

                Sandwich sandwichClass = new Sandwich(volumeBread,volumeCheese,volumeHum);

                sandwichClass.calculateCalories();
                sandwichClass.consume();
                break;
        }
    }
}
