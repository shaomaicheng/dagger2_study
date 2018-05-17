package exampl.com.dagger2.network.component;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Subcomponent;
import exampl.com.dagger2.network.module.RetrofitModule;

@Subcomponent(modules = RetrofitModule.class)
@Singleton
public interface RetrofitComponent {
    SecondActivityComponent plus();
}
