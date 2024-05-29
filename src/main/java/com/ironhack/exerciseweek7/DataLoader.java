package com.ironhack.exerciseweek7;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private PhilosopherRepository philosopherRepository;

    @Override
    public void run(String... args) throws Exception {

        var philosopher1 = new Philosopher("Platao", "Greek");
        var philosopher2 = new Philosopher("Io Proprio", "Contemporanea");

        // System.out.println("Created a first Philosopher: " + philosopher1);
        //philosopherRepository.save(philosopher1);
        //System.out.println("Created a first Philosopher: " + philosopher2);
        //philosopherRepository.save(philosopher2);

        System.out.println("Removing");
        philosopherRepository.deleteById(1L);

        var updatedPhilosopherList = philosopherRepository.findAll();
        System.out.println("List");
        for (int i = 0; i < updatedPhilosopherList.size(); i++) {
            System.out.println(updatedPhilosopherList.get(i));
        }

    }
}
