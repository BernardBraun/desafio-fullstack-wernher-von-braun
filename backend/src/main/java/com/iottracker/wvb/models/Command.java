package com.iottracker.wvb.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Command {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "command", nullable = false)
    private String command;

    @OneToMany(mappedBy = "command", cascade = CascadeType.ALL)
    private List<Parameter> parameters;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }
}
