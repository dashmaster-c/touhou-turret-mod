package touhouturret.content;
import mindustry.entities.bullet.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.ui.*;
import arc.scene.ui.layout.*;

import static mindustry.graphics.Pal.lancerLaser;
import static mindustry.Vars.*;

public class reisen_turret extends Turret {
    /* 변수 생성 */
    private static float BS =6;
    private static int S =3;
    private boolean judge = false;

    public String name = "레이센 터렛";

    public float width = 16f, height = 16f;
    public float lifetime = 60f;
    public float speed = 6f;
    public float knockback = 1;
    public float range = 100f;
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
    public float damage = 60;
    public boolean pierce = false;
    public float reloadTime = 24f;
    

    /* 새로운 클래스 만들기. */
    public reisen_turret(String name) {
        super("reisen_turret");
    }

    public void displayBars(Table bars){
            super.setBars();

            bars.add(new Bar("stat.spell charge%", lancerLaser, () -> (float)timers / 200 )).growX();
            bars.row();
        }
    public void updateTile() {
        if (timers == 240 && judge) {
            S = 3;
            BS = 6;
            this.judge = false;
            this.pierce = false;
            timers = 0;
        }
        if (timers == 200) {
            S = 7;
            BS = 0;
            this.judge = true;
            this.pierce = true;
        }
    }
}