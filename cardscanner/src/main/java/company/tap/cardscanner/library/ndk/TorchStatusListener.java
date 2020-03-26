package company.tap.cardscanner.library.ndk;

public interface TorchStatusListener {

    void onTorchStatusChanged(boolean turnTorchOn);

}
