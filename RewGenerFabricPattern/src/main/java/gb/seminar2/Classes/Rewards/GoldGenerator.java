package gb.seminar2.Classes.Rewards;

import gb.seminar2.Classes.ItemFabric;
import gb.seminar2.Classes.iGameItem;

public class GoldGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        return new GoldReward();
    }
}
