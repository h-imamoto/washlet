package washlet;

public class Oshiri implements WashletState{

    private MoveStatus moveStatus = MoveStatus.OFF;

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

    @Override
    public void move() {
        moveStatus = moveStatus.toggle();

        if (moveStatus.equals(MoveStatus.ON)) {
            System.out.println("ムーブON");
        } else {
            System.out.println("ムーブOFF");
        }
    }
}
