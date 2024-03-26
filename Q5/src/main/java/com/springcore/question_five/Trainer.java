package com.springcore.question_five;
import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private int id;
    private String name;
    private List<Session> sessions;

    public Trainer(int id, String name) {
        this.id = id;
        this.name = name;
        this.sessions = new ArrayList<>();
    }

    public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
	        return id;
	}
	public String getName() {
	        return name;
	}

	public void setSessions(List<Session> sessions) {
		this.sessions = sessions;
	}

    public List<Session> getSessions() {
        return sessions;
    }
}
