package washlet;

public class Bide implements WashletState{


    @Override
    public WashletState toBide() {
        return this;
    }

    @Override
    public WashletState toOshiri() {
        Oshiri oshiri = new Oshiri();
        oshiri.action();

        return oshiri;
    }

    @Override
    public WashletState toStop() {
        Stop stop = new Stop();
        stop.action();

        return stop;
    }

    @Override
    public void action() {
        System.out.println("ビデプシュー");
    }
}
