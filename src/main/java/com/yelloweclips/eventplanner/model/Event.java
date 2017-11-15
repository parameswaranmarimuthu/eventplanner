package com.yelloweclips.eventplanner.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

/**
 * Created by m655222 on 11/14/2017.
 */

@Document(collection = "events")
public class Event {

    @Id
    private Long id;
    private String name;
    private List<User> participants;
    private User organizar;
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }



    public User getOrganizar() {
        return organizar;
    }

    public void setOrganizar(User organizar) {
        this.organizar = organizar;
    }



    public List<User> getUsers() {
        return participants;
    }

    public void setUsers(List<User> participants) {
        this.participants = participants;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
