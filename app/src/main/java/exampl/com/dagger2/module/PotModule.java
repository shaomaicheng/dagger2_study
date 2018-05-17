package exampl.com.dagger2.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import exampl.com.dagger2.obj.Flower;
import exampl.com.dagger2.obj.Pot;
import exampl.com.dagger2.qualifier.RoseFlower;

@Module
public class PotModule {
    @Provides
    @Singleton
    Pot provideFlower(@RoseFlower Flower flower) {
        return new Pot(flower);
    }
}
