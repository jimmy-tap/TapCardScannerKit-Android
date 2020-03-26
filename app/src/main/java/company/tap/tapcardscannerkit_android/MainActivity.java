package company.tap.tapcardscannerkit_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import company.tap.cardscanner.TapCardScannerFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.container, new TapCardScannerFragment()).commit();
    }
}
