package com.stackroute.springapplication.beans;

import com.stackroute.springapplication.beans.Actor;
import org.springframework.beans.factory.annotation.Autowired;

public class Movie {
    Actor actor = new Actor();

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

}
