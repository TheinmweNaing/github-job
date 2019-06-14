package com.team.githubjobs.model.repo;

import com.team.githubjobs.model.service.GithubJobService;

import javax.inject.Inject;

public class GithubJobRepo {

    private GithubJobService service;

    @Inject
    public GithubJobRepo(GithubJobService service) {
        this.service = service;
    }

}
