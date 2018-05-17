package exampl.com.dagger2.component;


import dagger.Component;
import dagger.Subcomponent;
import exampl.com.dagger2.MainActivity;
import exampl.com.dagger2.scope.ActivityScope;

@ActivityScope
@Component(dependencies = PotComponent.class)
public interface MainActivityComponent {
    void inject(MainActivity activity);
}
