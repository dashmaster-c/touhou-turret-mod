package touhouturret.content;

import mindustry.ctype.*;



public class TDloader implements ContentList{
    private final ContentList[] contents = {
            new reisen_turret("reisen_turret")

    };

    public void load(){
        for(ContentList list : contents){
            list.load();
        }
    }
}