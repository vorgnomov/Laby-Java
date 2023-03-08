package LR8;

import java.io.IOException;

class Weapon
{
    String name;//название
    String colibr;//колибр
    String type;//тип
    String state;//состояние
    public Weapon(String name, String type, String colibr, String state)
    {
        this.name=name;
        this.colibr=colibr;
        this.type=type;
        this.state=state;
    }
    public String GetName()
    {
        return name;
    }
    public String GetColibr()
    {
        return colibr;
    }
    public String GetType()
    {
        return type;
    }
    public String GetState()
    {
        return state;
    }

    public void SetName(String name)
    {
        this.name = name;
    }
    public void SetColibr(String colibr)
    {
        this.colibr = colibr;
    }
    public void SetType(String type)
    {
        this.type = type;
    }
    public void SetState(String state)
    {
        this.state = state;
    }

    public void Display() {};
}
class Gunshot extends Weapon
{
    public Gunshot(String name, String type, String colibr, String state) {
        super(name, type, colibr, state);
        Main.GunShotCount++;
    }

    @Override
    public void Display() {
        super.Display();
        System.out.println("Информация об огнестрельном оружии:");
        System.out.println("Калибр: " + GetColibr());;
        System.out.println("Имя: " + GetName());
        System.out.println("Состояние: " + GetState());
        System.out.println("Тип: " + GetType());
    }
}
class SteelArms extends Weapon
{
    public SteelArms(String name, String type, String colibr, String state) {
        super(name, type, colibr, state);
        Main.SteelArmsCount++;
    }

    @Override
    public void Display() {
        super.Display();
        System.out.println("Информация об оружии ближнего боя:");
        System.out.println("Информация об огнестрельном оружии:");
        System.out.println("Калибр: " + GetColibr());;
        System.out.println("Имя: " + GetName());
        System.out.println("Состояние: " + GetState());
        System.out.println("Тип: " + GetType());
    }
}

interface Count{
    void count();
}
class Armouries implements Count {
    Gunshot gunshot;
    SteelArms steelArms;
    @Override
    public void count() {
        System.out.printf("gunshot in armouries: %d, steelArms in armouries: %d", Main.GunShotCount, Main.SteelArmsCount);
    }
}