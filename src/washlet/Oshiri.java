package washlet;

public class Oshiri implements WashletState{
    @Override
    public WashletState toBide() {
        Bide bide = new Bide();
        bide.action();
        return bide;
    }

    @Override
    public WashletState toOshiri() {
        return this;
    }

    @Override
    public WashletState toStop() {
        Stop stop = new Stop();
        stop.action();

        return stop;
    }

    @Override
    public void action() {
        System.out.println("おしりプシュー");
    }
}
