package LR8;

import java.io.IOException;

public class Main {
    public static int GunShotCount;
    public static int SteelArmsCount;
    public static void main(String[] args) throws IOException {
        Gunshot gunshot = new Gunshot("пистолет Макакрова", "самозарядный пистолет","9 мм","не заряжен");
        SteelArms steelArms = new SteelArms("катана","японский меч","отсутствует","готово к бою");
        Armouries armouries = new Armouries();
        gunshot.Display();
        steelArms.Display();
        System.out.println("Количество огнестрельного оружия: " + GunShotCount);
        System.out.println("Количество оружия ближнего боя: " + SteelArmsCount);
        armouries.count();
    }
}
