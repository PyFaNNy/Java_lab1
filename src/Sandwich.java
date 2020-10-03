public class Sandwich extends Food {
    private Double VolumeBread;
    private Double VolumeCheese;
    private Double VolumeHum;

    private Double breadCalories = 256.0;
    private Double butterCalories = 884.0;
    private Double humCalories = 145.0;


    public Sandwich(Double VolumeBread, Double VolumeCheese, Double VolumeHum)
    {
        this.VolumeBread = VolumeBread;
        this.VolumeCheese = VolumeCheese;
        this.VolumeHum = VolumeHum;

        FirstArgument = VolumeBread* breadCalories;
        SecondArgument = VolumeCheese * butterCalories;
        ThirdArgument = VolumeHum* humCalories;
    }

    public double calculateCalories()
    {
        return FirstArgument + SecondArgument + ThirdArgument;
    }

    public void consume()
    {
        System.out.println("Now you must burn" + calculateCalories() + " ccal");
    }
}