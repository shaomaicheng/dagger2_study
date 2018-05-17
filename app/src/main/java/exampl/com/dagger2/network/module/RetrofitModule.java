package exampl.com.dagger2.network.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import exampl.com.dagger2.network.qualifier.Baidu;
import exampl.com.dagger2.network.qualifier.Mistong;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

@Module
public class RetrofitModule {
    @Provides
    @Singleton
    Retrofit provideRetrofit(@Baidu OkHttpClient client) {
        return new Retrofit.Builder()
                .baseUrl("https://www.baidu.com")
                .addConverterFactory(ScalarsConverterFactory.create())
                .client(client)
                .build();
    }
}
