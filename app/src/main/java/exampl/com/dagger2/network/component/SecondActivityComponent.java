package exampl.com.dagger2.network.component;

import dagger.Subcomponent;
import exampl.com.dagger2.SecondActivity;
import exampl.com.dagger2.scope.ActivityScope;

@Subcomponent
@ActivityScope
public interface SecondActivityComponent {
    void inject(SecondActivity secondActivity);
}
