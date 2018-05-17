package exampl.com.dagger2.module;

import dagger.Module;
import dagger.Provides;
import exampl.com.dagger2.obj.Flower;
import exampl.com.dagger2.obj.Lily;
import exampl.com.dagger2.obj.Rose;
import exampl.com.dagger2.qualifier.LilyFlower;
import exampl.com.dagger2.qualifier.RoseFlower;

@Module
public class FlowerModule {
    @Provides
    @RoseFlower
    Flower provideRose() {
        return new Rose();
    }

    @Provides
    @LilyFlower
    Flower provideLily() {
        return new Lily();
    }
}
