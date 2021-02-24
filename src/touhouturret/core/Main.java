package touhouturret.core;
  //불러오기
  import mindustry.mod.Mod;
  import touhouturret.content.TDloader;


  

public class Main extends Mod{

    @Override
    public void init(){
    }

    @Override
    public void loadContent(){
      new TDloader().load();
    }
}