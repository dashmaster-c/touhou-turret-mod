package touhouturret.content;
import mindustry.ctype.ContentList;
import mindustry.entities.bullet.*;
import mindustry.type.Weapon;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.defense.turrets.*;
import static mindustry.world.blocks.defense.turrets.Turret.*;
import mindustry.ui.*;
import arc.scene.ui.layout.*;
import touhouturret.content.ReisenBullet;
import static mindustry.graphics.Pal.lancerLaser;
import static mindustry.Vars.*;
import static touhouturret.content.ReisenBullet.*;
import static touhouturret.content.Reisen_turret_parts.*;
import static mindustry.type.Weapon.*;

public class Reisen_turret implements ContentList {
    /* 변수 생성 */

    public static Block Reisen_turret;
    @Override
    public void load(){
        Reisen_turret = new Reisen_turret_parts("레이센 터렛"){
            {
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
            }
        };
    }}




