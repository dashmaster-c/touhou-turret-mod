package touhouturret.core;
  //불러오기
  import arc.Events;
  import mindustry.game.EventType;
  import mindustry.mod.Mod;
  import touhouturret.content.ModLoader;


  

public class Main extends Mod{
    public Main(){
        Events.on(EventType.ClientLoadEvent.class,e->{

        });

        Events.on(EventType.WorldLoadEvent.class,e->{

        });
    }
    @Override
    public void init(){
    }

    @Override
    public void loadContent(){
      new ModLoader().load();
    }
}