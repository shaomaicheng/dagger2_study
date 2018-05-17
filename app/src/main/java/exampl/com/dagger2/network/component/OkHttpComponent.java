package exampl.com.dagger2.network.component;

import dagger.Component;
import exampl.com.dagger2.network.module.OkHttpModule;
import exampl.com.dagger2.network.module.RetrofitModule;

@Component(modules = OkHttpModule.class)
public interface OkHttpComponent {
    RetrofitComponent plus(RetrofitModule retrofitModule);
}
