public class Cocktail extends Food {
    private Double volumeDrink;
    private Double volumeFruit;

    private Double DrinkCalories = 42.0;
    private Double FruitCalories = 207.0;

    public Cocktail(Double volumeMilk, Double volumeIceCream)
    {
        this.DrinkCalories = volumeMilk;
        this.FruitCalories = volumeIceCream;

        FirstArgument = volumeMilk * DrinkCalories ;
        SecondArgument = volumeIceCream * FruitCalories;
    }

    public double calculateCalories()
    {
        return FirstArgument + SecondArgument;
    }

    public void consume()
    {
        System.out.println("Now you must burn" + calculateCalories() + " ccal");
    }

}