package touhouturret.content;

import mindustry.mod.Mod;
import mindustry.content.*;
import mindustry.entities.*;

import mindustry.world.*;
import mindustry.world.modules.*;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;
import mindustry.world.blocks.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.meta.values.*;

import mindustry.type.*;
import mindustry.ctype.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.math.geom.*;
import mindustry.logic.*;
import mindustry.entities.bullet.*;
import mindustry.game.EventType.*;

import mindustry.ui.*;
import mindustry.ui.layout.*;
import mindustry.ui.fragments.*;

import arc.*;
import arc.scene.ui.layout.*;
import arc.struct.*;
import arc.util.io.*;
import static mindustry.Vars.*;



public class ItemTurret extends Turret{
    public String name = "레이센 터렛";
    
    public Effect shootEffect = LancerLaserShootSmoke;
    public float width = 16f, height = 16f;
    public String sprite = reisenbullet;
    public Sound shootSound = tan01;
    public float lifetime = 60f;
    public float speed = 6f;
    public float knockback = 1;
    public float range = 80f;
    public float rotateSpeed = 0;

    public boolean ignoreRotation = true;
    public float velocityRnd = 2f;
    public int maxAmmo = 30;
    public int ammoPerShot = 2;
    public float inaccuracy = 5f;
    public int shots = S;
    public float burstSpacing = BS;
    public boolean targetAir = true;
    public boolean targetGround = true;
    
    
    
        public void displayBars(Table bars){
            super.displayBars(bars);

            bars.add(new Bar("stat.spell charge%", Pal.titanium, () -> (int)shotCounter / 30 )).growX();
            bars.row();
        }
    @Override
    public void updateTile() {
        if (shotCounter == 30 && judge == true) {
            S = 3;
            BS = 7;
            judge = false;
            shotCounter = 0;
        }
        if (shotCounter == 29) {
            S = 7;
            BS = 0;
            boolean judge;
            judge = true;
        }
    }