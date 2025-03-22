package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public interface Subscriber {
    void notify(String msg);
}

class User implements Subscriber {

    private String name;

    public User(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void notify(String msg) {
        System.out.println(name + " received notification: " + msg);
    }
}

class YoutubeChanel{
    List<Subscriber> subscriberList = new ArrayList<>();

    public void subscribe(Subscriber subscriber){
        subscriberList.add(subscriber);
    }

    public void notify(String message){
        for (Subscriber s : subscriberList){
            s.notify(message);
        }
    }
}

class Main{
    public static void main(String[] args) {

        Subscriber a = new User("A");
        Subscriber b = new User("B");
        Subscriber c = new User("C");

        YoutubeChanel chanel = new YoutubeChanel();
        chanel.subscribe(a);
        chanel.subscribe(b);
        chanel.subscribe(c);

        chanel.notify("New Video Uploaded!");

    }
}