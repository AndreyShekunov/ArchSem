package gb.seminar2;

import gb.seminar2.Classes.ItemFabric;
import gb.seminar2.Classes.Rewards.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        ItemFabric generator = new GoldGenerator();
//        generator.openReward();
//
//        generator = new GemGenerator();
//        generator.openReward();

//        Random random = ThreadLocalRandom.current();
        List<ItemFabric> fabricList = new ArrayList<>();

        fabricList.add(new GoldGenerator());
        fabricList.add(new GemGenerator());
        fabricList.add(new WeaponGenerator());
        fabricList.add(new ArmorGenerator());
        fabricList.add(new HealthPotionGenerator());
        fabricList.add(new ManaPotionGenerator());

        for (int i = 0; i < 20; i++) {
            int index = (int)(Math.random() * 6);
            ItemFabric fabric = fabricList.get(index);
            fabric.openReward();
        }

    }
}