package touhouturret.content;

import mindustry.ctype.*;



public class ModLoader implements ContentList{
    private final ContentList[] contents = {
            new ReisenBullet(),
            new Reisen_turret()
    };

    public void load(){
        for(ContentList list : contents){
            list.load();
        }
    }
}