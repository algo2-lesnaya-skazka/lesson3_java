package lesson3;
public class Car {
    public void start()
    {}
    public void stop()
    {}
    public int dive(int howlong)
    {
    	int distance = howlong*60;
        System.out.println("текст" + distance + " текст ");
        System.out.println("Я на глубине "+ distance + " футов ниже уровня моря");
        return howlong;
   }
}