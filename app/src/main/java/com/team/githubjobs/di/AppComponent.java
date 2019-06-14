package com.team.githubjobs.di;

import com.team.githubjobs.GithubJobApplication;
import com.team.githubjobs.model.repo.GithubJobRepo;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        AppModule.class,
        BuilderModule.class
})
public interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder instance(GithubJobApplication application);
        AppComponent build();
    }

    void inject(GithubJobApplication application);

    GithubJobRepo repo();

}
