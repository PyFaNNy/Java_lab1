public class Cocktail extends Food {
    private Double volumeMilk;
    private Double volumeIceCream;

    private Double milkCalories = 42.0;
    private Double iceCreamCalories = 207.0;

    public Cocktail(Double volumeMilk, Double volumeIceCream)
    {
        this.volumeMilk = volumeMilk;
        this.volumeIceCream = volumeIceCream;

        FirstArgument = volumeMilk * milkCalories ;
        SecondArgument = volumeIceCream * iceCreamCalories;
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