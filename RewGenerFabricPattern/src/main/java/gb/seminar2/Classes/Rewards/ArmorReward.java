package gb.seminar2.Classes.Rewards;

import gb.seminar2.Classes.iGameItem;

public class ArmorReward implements iGameItem {
    @Override
    public void open() {
        System.out.println("Броня");
    }
}
