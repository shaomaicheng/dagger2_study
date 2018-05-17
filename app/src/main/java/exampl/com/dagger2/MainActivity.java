package exampl.com.dagger2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import javax.inject.Inject;

import exampl.com.dagger2.component.DaggerFlowerComponent;
import exampl.com.dagger2.component.DaggerMainActivityComponent;
import exampl.com.dagger2.component.DaggerPotComponent;
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
        findViewById(R.id.tv)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(MainActivity.this, SecondActivity.class));
                    }
                });
        DaggerMainActivityComponent.builder()
                .potComponent(DaggerPotComponent.builder().flowerComponent(DaggerFlowerComponent.create()).build())
                .build().inject(this);
        String res = pot.show();
        Log.e(TAG, res);

        Log.e(TAG, "pot: " + pot.hashCode());
        Log.e(TAG, "pot1: " + pot1.hashCode());
    }
}
