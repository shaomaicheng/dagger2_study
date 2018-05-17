package exampl.com.dagger2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

import exampl.com.dagger2.network.component.DaggerRetrofitComponent;
import retrofit2.Retrofit;


public class SecondActivity extends AppCompatActivity {
    private static final String TAG = "SecondActivity";
    @Inject
    Retrofit retrofit;
    @Inject
    Retrofit  retrofit1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DaggerRetrofitComponent.create()
                .plus()
                .inject(this);

        Log.e(TAG, retrofit.baseUrl().toString());
        Log.e(TAG, String.valueOf(retrofit.hashCode()));
        Log.e(TAG, String.valueOf(retrofit1.hashCode()));
    }
}
