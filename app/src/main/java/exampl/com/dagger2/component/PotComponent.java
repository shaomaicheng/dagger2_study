package exampl.com.dagger2.component;

import javax.inject.Singleton;

import dagger.Component;
import exampl.com.dagger2.obj.Pot;
import exampl.com.dagger2.module.PotModule;

@Component(modules = PotModule.class, dependencies = FlowerComponent.class)
@Singleton
public interface PotComponent {
    Pot getPot();
}
