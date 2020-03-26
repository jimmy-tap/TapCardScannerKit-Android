package company.tap.cardscanner;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import company.tap.cardscanner.library.Card;
import company.tap.cardscanner.library.camera.RecognitionAvailabilityChecker;
import company.tap.cardscanner.library.camera.RecognitionCoreUtils;
import company.tap.cardscanner.library.camera.RecognitionUnavailableException;
import company.tap.cardscanner.library.ui.InitLibraryFragment;
import company.tap.cardscanner.library.ui.ScanCardFragment;

public class TapCardScannerFragment extends Fragment {

    public TapCardScannerFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tap_card_scanner, container, false);
    }

    @SuppressLint("RestrictedApi")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
    }


}
