package touhouturret.content;

import arc.scene.ui.layout.Table;
import mindustry.ui.Bar;
import mindustry.world.blocks.defense.turrets.Turret;
import arc.struct.*;
import mindustry.entities.bullet.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.world.meta.*;
import mindustry.world.meta.values.*;


public class Reisen_turret_parts extends Turret{
    public static float BS = 6;
    public static int S = 3;
    public static boolean judge = false;

    public ObjectMap<Item,BulletType> ammoTypes = new ObjectMap<> ();

    public Reisen_turret_parts(String name){
        super ( name );
        hasItems = true;
    }

    /**
     * Initializes accepted ammo map. Format: [item1, bullet1, item2, bullet2...]
     */
    public void ammo(Object... objects){
        ammoTypes = OrderedMap.of ( objects );
    }

    @Override
    public void setStats(){
        super.setStats ();
        stats.remove ( Stat.itemCapacity );
        stats.add ( Stat.ammo,new AmmoListValue<> ( ammoTypes ) );
    }

    public class ReisenTurretBuild extends TurretBuild{

        @Override
        public void displayBars(Table bars){
            super.displayBars ( bars );
            bars.add ( new Bar ( "spell charge%",Pal.powerBar,()->this.shotCounter/15 ) ).growX ();
            bars.row ();
            bars.add ( new Bar ( "stat.ammo",Pal.ammo,()->(float)totalAmmo/maxAmmo ) ).growX ();
            bars.row ();
        }
    }
}

