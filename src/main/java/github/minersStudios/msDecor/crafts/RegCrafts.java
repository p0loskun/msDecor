package github.minersStudios.msDecor.crafts;

import github.minersStudios.msDecor.Main;
import github.minersStudios.msDecor.crafts.christmas.*;
import github.minersStudios.msDecor.crafts.halloween.*;
import github.minersStudios.msDecor.crafts.home.*;
import github.minersStudios.msDecor.crafts.home.cameras.*;
import github.minersStudios.msDecor.crafts.home.chairs.*;
import github.minersStudios.msDecor.crafts.home.clocks.*;
import github.minersStudios.msDecor.crafts.home.globus.*;
import github.minersStudios.msDecor.crafts.home.lamps.*;
import github.minersStudios.msDecor.crafts.home.plushes.*;
import github.minersStudios.msDecor.crafts.home.tables.*;
import github.minersStudios.msDecor.crafts.street.*;
import github.minersStudios.msDecor.crafts.street.trashcans.*;

public class RegCrafts {
    public RegCrafts() {
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