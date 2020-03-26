package company.tap.cardscanner.library.ndk;

import androidx.annotation.IntRange;

import company.tap.cardscanner.library.ndk.RecognitionConstants.WorkAreaOrientation;

public interface DisplayConfiguration {
    @WorkAreaOrientation
    int getNativeDisplayRotation();

    @IntRange(from=0, to=360)
    int getPreprocessFrameRotation(int width, int height);
}
