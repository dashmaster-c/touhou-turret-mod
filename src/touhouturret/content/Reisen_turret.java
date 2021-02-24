package touhouturret.content;
import mindustry.ctype.ContentList;

import mindustry.world.Block;


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




