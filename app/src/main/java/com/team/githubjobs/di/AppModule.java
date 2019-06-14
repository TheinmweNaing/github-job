package com.team.githubjobs.di;

import android.content.Context;

import com.team.githubjobs.GithubJobApplication;
import com.team.githubjobs.model.RetrofitManager;
import com.team.githubjobs.model.service.GithubJobService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    Context provideContext(GithubJobApplication application) {
        return application.getApplicationContext();
    }

    @Singleton
    @Provides
    RetrofitManager retrofitManager(Context context) {
        return new RetrofitManager(context);
    }

    @Provides
    GithubJobService service(RetrofitManager retrofitManager) {
        return retrofitManager.create(GithubJobService.class);
    }

}
