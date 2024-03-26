package com.springcore.question_five;
import java.sql.SQLException;
import java.util.List;

public class App {
    public static void main(String[] args) {
        try {
            List<Trainer> trainers = TrainerModel.getAllTrainersWithSessions();
            for (Trainer trainer : trainers) {
                System.out.println("Trainer: " + trainer.getName());
                System.out.println("Sessions:");
                for (Session session : trainer.getSessions()) {
                    System.out.println("- " + session.getName());
                }
                System.out.println();
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}