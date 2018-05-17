package exampl.com.dagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import exampl.com.dagger2.obj.Pot;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Inject
    Pot pot;

    @Inject
    Pot pot1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainActivityComponent.builder()
                .potComponent(DaggerPotComponent.builder().flowerComponent(DaggerFlowerComponent.create()).build())
                .build().inject(this);
        String res = pot.show();
        Log.e(TAG, res);

        Log.e(TAG, "pot: " + pot.hashCode());
        Log.e(TAG, "pot1: " + pot1.hashCode());
    }
}
