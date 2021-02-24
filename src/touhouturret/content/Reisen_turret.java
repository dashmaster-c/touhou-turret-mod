package touhouturret.content;
import mindustry.content.Items;
import mindustry.ctype.ContentList;

import mindustry.entities.bullet.BulletType;
import mindustry.type.Category;
import mindustry.world.Block;

import static mindustry.content.Items.*;
import static mindustry.type.ItemStack.with;


public class Reisen_turret implements ContentList {
    /* 변수 생성 */

    public static Block Reisen_turret;
    @Override
    public void load(){
        Reisen_turret = new Reisen_turret_parts("레이센 터렛"){
            {
                ammo(
                        Items.titanium, ReisenBullet.ReisenBullet
                );
                range = 100f;
                rotateSpeed = 50;
                velocityInaccuracy = 2f;
                maxAmmo = 30;
                ammoPerShot = 2;
                shots = S;
                burstSpacing = BS;
                targetAir = true;
                targetGround = true;
                reloadTime = 24f;
                size = 2;

                requirements(Category.turret, with(Items.copper,120,Items.titanium,70,Items.lead,100,Items.graphite,95));
            }
        };
    }}




