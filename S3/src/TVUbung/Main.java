package TVUbung;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        List<Kanale> kanaleliste= Stream.of("RTL","Pro TV","Dinsey","MiniMax","BBC")
                .map(name->new Kanale(name)).toList();
        TV tv=new TV(kanaleliste);
        Remote remote=new Remote(tv);
        System.out.println(remote.channelUp());
        System.out.println(remote.channelDown());
        System.out.println(remote.channelDown());
        System.out.println(remote.channelDown());
    }
}
