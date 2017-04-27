package washlet;

import static washlet.UseStatus.*;

public class Washlet {
    private UseStatus useStatus = 座ってない;
    private WashletState washletState = new Stop();

    public UseStatus getUseStatus() {
        return useStatus;
    }

    void 座る() {
        useStatus = 座ってる;
    }

    void おしりを押す() {
        if (useStatus.equals(座ってる)) {
            washletState = washletState.toOshiri();
        }
    }

    void ビデを押す() {
        if (useStatus.equals(座ってる)) {
            washletState = washletState.toBide();
        }
    }

    void とめる() {
        washletState = washletState.toStop();
    }

    void 立つ() {
        useStatus = 座ってない;
    }

    void ムーブ() {
        washletState.move();
    }
}
