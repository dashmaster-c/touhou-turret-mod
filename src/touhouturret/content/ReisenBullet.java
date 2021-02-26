package touhouturret.content;

import mindustry.ctype.ContentList;
import mindustry.entities.bullet.BasicBulletType;
import mindustry.entities.bullet.BulletType;


public class ReisenBullet implements ContentList {
    public static boolean PE = false;
    public static BulletType ReisenBullet;


    @Override
    public void load() {
        ReisenBullet = new BasicBulletType()
            {{
                height = 16;
                width = 16;
                speed = 7f;
                knockback = 1;
                inaccuracy = 5f;
                damage = 60;
                pierce = PE;
            }};

    }
}

