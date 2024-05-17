package com.iottracker.wvb.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class CommandDescription {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "operation", nullable = false)
    private String operation;

    @Column(name = "description", nullable = false)
    private String description;

    @OneToMany(mappedBy = "commandDesciption", cascade = CascadeType.ALL)
    private List<Command> command;

    @Column(name = "result", nullable = false)
    private String result;

    @Column(name = "format", nullable = false)
    private String format;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Command> getCommand() {
        return command;
    }

    public void setCommand(List<Command> command) {
        this.command = command;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
