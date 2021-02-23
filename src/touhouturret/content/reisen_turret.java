package touhouturret.content;
import mindustry.ctype.ContentList;
import mindustry.entities.bullet.*;
import mindustry.type.Item;
import mindustry.type.ItemStack;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.ui.*;
import arc.scene.ui.layout.*;
import touhouturret.content.ReisenBullet;
import static mindustry.graphics.Pal.lancerLaser;
import static mindustry.Vars.*;
import static touhouturret.content.ReisenBullet.*;

public class reisen_turret extends Turret implements ContentList {
    /* 변수 생성 */
    protected float BS = 6;
    protected int S = 3;
    protected boolean judge = false;
    @Override
    public void load() {
        String name = "레이센 터렛";
        float range = 100f;
        float rotateSpeed = 0;
        boolean ignoreRotation = true;
        float velocityRnd = 2f;
        int maxAmmo = 30;
        int ammoPerShot = 2;
        int shots = S;
        float burstSpacing = BS;
        boolean targetAir = true;
        boolean targetGround = true;
        float reloadTime = 24f;
        int size = 2;

    }


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
            judge = false;
            PE = false;
            timers = 0;
        }
        if (timers == 200) {
            S = 7;
            BS = 0;
            judge = true;
            PE = true;
        }
    }
}