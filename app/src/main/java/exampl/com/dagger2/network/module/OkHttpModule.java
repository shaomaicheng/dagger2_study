package exampl.com.dagger2.network.module;

import java.io.IOException;

import dagger.Module;
import dagger.Provides;
import exampl.com.dagger2.network.qualifier.Baidu;
import exampl.com.dagger2.network.qualifier.Mistong;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Module
public class OkHttpModule {
    @Provides
    @Mistong
    OkHttpClient provideMistongClient() {
        return new OkHttpClient.Builder()
                .addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        Request request = chain.request()
                                .newBuilder()
                                .url("http://www.mistong.com")
                                .build();
                        return chain.proceed(request);
                    }
                })
                .build();
    }

    @Provides
    @Baidu
    OkHttpClient provideBaiduClient() {
        return new OkHttpClient.Builder()
                .addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        Request request = chain.request()
                                .newBuilder()
                                .url("https://www.baidu.com")
                                .build();
                        return chain.proceed(request);
                    }
                })
                .build();
    }
}
