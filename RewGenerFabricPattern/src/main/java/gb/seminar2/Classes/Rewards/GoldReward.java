package gb.seminar2.Classes.Rewards;

import gb.seminar2.Classes.iGameItem;

public class GoldReward implements iGameItem {
    @Override
    public void open() {
        System.out.println("Золото");
    }
}
