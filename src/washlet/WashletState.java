package washlet;

interface WashletState {

    WashletState toOshiri();

    WashletState toBide();

    WashletState toStop();

    void action();
}
