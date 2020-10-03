public class Apple extends Food {
    private Double volume;
    private Double calories = 27.0;

    public Apple(Double volume) {
        this.volume = volume;
        FirstArgument = volume*calories;
    }
    public void consume() {
        System.out.println("Now you must burn" + calculateCalories() + " ccal");
    }
    public double calculateCalories() {

        return FirstArgument;
    }
}