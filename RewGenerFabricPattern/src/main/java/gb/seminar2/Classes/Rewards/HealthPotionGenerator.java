package gb.seminar2.Classes.Rewards;

import gb.seminar2.Classes.ItemFabric;
import gb.seminar2.Classes.iGameItem;

public class HealthPotionGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        return new HealthPotionReward();
    }
}
