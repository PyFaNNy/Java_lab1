public abstract class Food implements  Consume, Nutritions {
    String name=null;
    Double FirstArgument=null;
    Double SecondArgument=null;
    Double ThirdArgument=null;

    public void getName()
    {
        System.out.println(name);
    }
}
