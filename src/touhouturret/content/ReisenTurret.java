package touhouturret.content;
import mindustry.content.Items;
import mindustry.ctype.ContentList;

import mindustry.type.Category;
import mindustry.world.Block;

import static mindustry.type.ItemStack.with;


public class ReisenTurret implements ContentList {
    public static float Reloader = 24f;
    /* 변수 생성 */

    public static Block Reisen_turret;
    @Override
    public void load(){
        Reisen_turret = new ReisenTurretParts ("Reisen"){
            {
                ammo(
                        Items.titanium, ReisenBullet.ReisenBullet
                );
                range = 100f;
                rotateSpeed = 50;
                maxAmmo = 30;
                ammoPerShot = 2;
                shots = S;
                burstSpacing = BS;
                targetAir = true;
                targetGround = true;
                reloadTime = Reloader;
                velocityInaccuracy = vel_In;
                size = 2;

                requirements(Category.turret, with(Items.copper, 120,Items.titanium, 70,Items.lead, 100,Items.graphite, 95));
            }
        };
    }}




