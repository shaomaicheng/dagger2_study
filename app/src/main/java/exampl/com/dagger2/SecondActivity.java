package exampl.com.dagger2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

import exampl.com.dagger2.network.component.DaggerOkHttpComponent;
import exampl.com.dagger2.network.module.RetrofitModule;
import exampl.com.dagger2.network.service.NetworkService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;


public class SecondActivity extends AppCompatActivity {
    private static final String TAG = "SecondActivity";
    @Inject
    Retrofit retrofit;
    @Inject
    Retrofit retrofit1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DaggerOkHttpComponent.create()
                .plus(new RetrofitModule())
                .plus()
                .inject(this);

        Log.e(TAG, retrofit.baseUrl().toString());
        Log.e(TAG, String.valueOf(retrofit.hashCode()));
        Log.e(TAG, String.valueOf(retrofit1.hashCode()));


        retrofit.create(NetworkService.class)
                .request()
                .enqueue(new Callback<String>() {
                    @Override
                    public void onResponse(Call<String> call, Response<String> response) {
                        if (response.isSuccessful()) {
                            Log.e(TAG, response.body());
                        } else {
                            Log.e(TAG, "response#isSuccessful() == false");
                        }
                    }

                    @Override
                    public void onFailure(Call<String> call, Throwable t) {
                        Log.e(TAG, t.getMessage());
                    }
                });
    }
}
