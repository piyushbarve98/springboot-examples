package com.codingspring.codespring.dto;

import java.time.LocalDate;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class EmployeeDTO {

    private Long id;

    private String name;

    private LocalDate dateOfJoining;
    @JsonProperty("isActive")
    private boolean isActive;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public EmployeeDTO(Long id, String name, LocalDate date, boolean isActive) {
        this.id = id;
        this.name = name;
        this.dateOfJoining = date;
        this.isActive = isActive;
    }


}
