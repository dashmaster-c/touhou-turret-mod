package touhouturret.content;



public class TMLoader implements ContentList{
    private final ContentList[] contents = {
       
    };

    public void load(){
        for(ContentList list : contents){
            list.load();
        }
    }
}