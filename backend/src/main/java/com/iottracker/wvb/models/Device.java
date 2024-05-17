package com.iottracker.wvb.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "manufacturer", nullable = false)
    private String manufacturer;

    @Column(name = "url", nullable = false)
    private String url;

    @OneToMany(mappedBy = "device", cascade = CascadeType.ALL)
    private List<CommandDescription> commands;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<CommandDescription> getCommands() {
        return commands;
    }

    public void setCommands(List<CommandDescription> commands) {
        this.commands = commands;
    }
}
