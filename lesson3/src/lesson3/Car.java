package lesson3;
public class Car {
    public void start()
    {}
    public void stop()
    {}
    public int dive(int howlong)
    {
    	int distance = howlong*60;
        System.out.println("�����" + distance + " ����� ");
        System.out.println("� �� ������� "+ distance + " ����� ���� ������ ����");
        return howlong;
   }
}