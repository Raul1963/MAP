package TVUbung;

import java.util.List;

public class Remote {

    TV tv;
    public Remote(TV tv){
        this.tv=tv;
    }

    public Kanale channelUp(){
        return tv.next();
    }

    public Kanale channelDown(){
        return tv.previous();
    }
}
