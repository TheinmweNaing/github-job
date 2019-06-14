package com.team.githubjobs.di;

import com.team.githubjobs.ui.detail.JobDetailFragment;
import com.team.githubjobs.ui.positions.JobPositionsFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public interface BuilderModule {

    @ContributesAndroidInjector
    JobPositionsFragment bindJobPositionsFragment();

    @ContributesAndroidInjector
    JobDetailFragment bindJobDetailFragment();

}
