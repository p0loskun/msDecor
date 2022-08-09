package com.github.minersstudios.msDecor.crafts;

import com.github.minersstudios.msDecor.Main;
import com.github.minersstudios.msDecor.crafts.christmas.Ball;
import com.github.minersstudios.msDecor.crafts.christmas.BrokenSnowman;
import com.github.minersstudios.msDecor.crafts.christmas.SantaSocks;
import com.github.minersstudios.msDecor.crafts.christmas.Snowman;
import com.github.minersstudios.msDecor.crafts.halloween.SkeletonHand;
import com.github.minersstudios.msDecor.crafts.home.*;
import com.github.minersstudios.msDecor.crafts.home.cameras.OldCamera;
import com.github.minersstudios.msDecor.crafts.home.chairs.*;
import com.github.minersstudios.msDecor.crafts.home.clocks.SmallClock;
import com.github.minersstudios.msDecor.crafts.home.globus.SmallGlobus;
import com.github.minersstudios.msDecor.crafts.home.lamps.BigLamp;
import com.github.minersstudios.msDecor.crafts.home.lamps.SmallLamp;
import com.github.minersstudios.msDecor.crafts.home.plushes.BMOPlush;
import com.github.minersstudios.msDecor.crafts.home.plushes.BrownBearPlush;
import com.github.minersstudios.msDecor.crafts.home.plushes.RacoonPlush;
import com.github.minersstudios.msDecor.crafts.home.tables.BigTable;
import com.github.minersstudios.msDecor.crafts.home.tables.SmallTable;
import com.github.minersstudios.msDecor.crafts.street.Brazier;
import com.github.minersstudios.msDecor.crafts.street.FireHydrant;
import com.github.minersstudios.msDecor.crafts.street.Wheelbarrow;
import com.github.minersstudios.msDecor.crafts.street.trashcans.IronTrashcan;

public class RegCrafts {

    public static void init() {
        Chair.addRecipes();
        SmallArmchair.addRecipes();
        Armchair.addRecipes();
        BarStool.addRecipes();
        CoolChair.addRecipes();
        CoolArmchair.addRecipes();
        RockingChair.addRecipes();
        Nightstand.addRecipes();
        BigTable.addRecipes();
        SmallTable.addRecipes();
        Wheelbarrow.addRecipes();
        SmallLamp.addRecipes();
        BigLamp.addRecipes();
        SmallGlobus.addRecipes();
        SmallClock.addRecipes();
        Patefon.addRecipes();
        IronTrashcan.addRecipes();
        FireHydrant.addRecipes();
        OldCamera.addRecipes();
        BMOPlush.addRecipes();
        BrownBearPlush.addRecipes();
        Piggybank.addRecipes();
        Heads.addRecipes();
        RacoonPlush.addRecipes();
        CookingPot.addRecipes();
        Cell.addRecipes();
        Brazier.addRecipes();
        SmallChair.addRecipes();
        if (Main.isChristmas) {
            Ball.addRecipes();
            BrokenSnowman.addRecipes();
            SantaSocks.addRecipes();
            Snowman.addRecipes();
        }
        if (Main.isHalloween) {
            SkeletonHand.addRecipes();
        }
    }
}
