package exampl.com.dagger2.component;

import dagger.Component;
import exampl.com.dagger2.obj.Flower;
import exampl.com.dagger2.module.FlowerModule;
import exampl.com.dagger2.qualifier.LilyFlower;
import exampl.com.dagger2.qualifier.RoseFlower;

@Component(modules = FlowerModule.class)
public interface FlowerComponent {
    @RoseFlower
    Flower getRoseFlower();

    @LilyFlower
    Flower getLilyFlower();
}
