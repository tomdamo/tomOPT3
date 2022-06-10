import java.util.AbstractMap;
import java.util.HashMap;

public class IDandPW {
    HashMap<String,String> loginfo = new HashMap<String,String>();

    IDandPW(){
        loginfo.put("Tom","Pizza");
        loginfo.put("Peter","Noodle");
        loginfo.put("Baas","Salami");
    }
    
    protected HashMap getLoginInfo(){
        return loginfo;
    }
}
