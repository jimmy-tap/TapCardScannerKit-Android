package company.tap.cardscanner.library.ndk;

import android.graphics.Bitmap;

public interface RecognitionStatusListener {

    void onRecognitionComplete(RecognitionResult result);

    void onCardImageReceived(Bitmap bitmap);

}
