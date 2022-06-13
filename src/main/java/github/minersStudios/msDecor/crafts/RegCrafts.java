package github.minersStudios.msDecor.crafts;

import github.minersStudios.msDecor.Main;
import github.minersStudios.msDecor.crafts.christmas.Ball;
import github.minersStudios.msDecor.crafts.christmas.BrokenSnowman;
import github.minersStudios.msDecor.crafts.christmas.SantaSocks;
import github.minersStudios.msDecor.crafts.christmas.Snowman;
import github.minersStudios.msDecor.crafts.halloween.SkeletonHand;
import github.minersStudios.msDecor.crafts.home.*;
import github.minersStudios.msDecor.crafts.home.cameras.OldCamera;
import github.minersStudios.msDecor.crafts.home.chairs.*;
import github.minersStudios.msDecor.crafts.home.clocks.SmallClock;
import github.minersStudios.msDecor.crafts.home.globus.SmallGlobus;
import github.minersStudios.msDecor.crafts.home.lamps.BigLamp;
import github.minersStudios.msDecor.crafts.home.lamps.SmallLamp;
import github.minersStudios.msDecor.crafts.home.plushes.BMOPlush;
import github.minersStudios.msDecor.crafts.home.plushes.BrownBearPlush;
import github.minersStudios.msDecor.crafts.home.plushes.RacoonPlush;
import github.minersStudios.msDecor.crafts.home.tables.BigTable;
import github.minersStudios.msDecor.crafts.home.tables.SmallTable;
import github.minersStudios.msDecor.crafts.street.Brazier;
import github.minersStudios.msDecor.crafts.street.FireHydrant;
import github.minersStudios.msDecor.crafts.street.trashcans.IronTrashcan;
import github.minersStudios.msDecor.crafts.street.Wheelbarrow;

public class RegCrafts {
    public RegCrafts(){
        new SmallChair();
        new Chair();
        new SmallArmchair();
        new Armchair();
        new BarStool();
        new CoolChair();
        new CoolArmchair();
        new RockingChair();
        new Nightstand();
        new BigTable();
        new SmallTable();
        new Wheelbarrow();
        new SmallLamp();
        new BigLamp();
        new SmallGlobus();
        new SmallClock();
        new Patefon();
        new IronTrashcan();
        new FireHydrant();
        new OldCamera();
        new BMOPlush();
        new BrownBearPlush();
        new Piggybank();
        new Heads();
        new RacoonPlush();
        new CookingPot();
        new Cell();
        new Brazier();
        if(Main.isChristmas){
            new Ball();
            new BrokenSnowman();
            new SantaSocks();
            new Snowman();
        }
        if(Main.isHalloween){
            new SkeletonHand();
        }
    }
}