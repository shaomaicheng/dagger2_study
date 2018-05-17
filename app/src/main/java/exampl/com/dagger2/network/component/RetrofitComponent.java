package exampl.com.dagger2.network.component;

import javax.inject.Singleton;

import dagger.Component;
import exampl.com.dagger2.network.module.RetrofitModule;

@Component(modules = RetrofitModule.class)
@Singleton
public interface RetrofitComponent {
    SecondActivityComponent plus();
}
