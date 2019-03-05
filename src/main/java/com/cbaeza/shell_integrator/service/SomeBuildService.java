package com.cbaeza.shell_integrator.service;

import org.springframework.stereotype.Service;

@Service
public class SomeBuildService {

    public String listAllFiles() {
        return "ls -lash";
    }
}
