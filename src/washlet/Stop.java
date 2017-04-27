package washlet;

public class Stop implements WashletState{
    @Override
    public WashletState toBide() {
        Bide bide = new Bide();
        bide.action();
        return bide;
    }

    @Override
    public WashletState toOshiri() {
        Oshiri oshiri = new Oshiri();
        oshiri.action();

        return oshiri;
    }

    @Override
    public WashletState toStop() {
        return this;
    }

    @Override
    public void action() {
        System.out.println("ピタッ");
    }

    @Override
    public void move() {

    }
}
