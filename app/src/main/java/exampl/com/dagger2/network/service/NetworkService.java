package exampl.com.dagger2.network.service;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NetworkService {

    @GET("/")
    Call<String> request();
}
