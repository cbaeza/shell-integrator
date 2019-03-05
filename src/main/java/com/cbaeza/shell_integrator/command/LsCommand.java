package com.cbaeza.shell_integrator.command;

import com.cbaeza.shell_integrator.service.SomeBuildService;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class LsCommand {

    private final SomeBuildService someBuildService;

    public LsCommand(SomeBuildService someBuildService) {
        this.someBuildService = someBuildService;
    }

    @ShellMethod("Translate text from one language to another.")
    public String listAll(@ShellOption String country) {
        // invoke service
        return someBuildService.listAllFiles();
    }
}
