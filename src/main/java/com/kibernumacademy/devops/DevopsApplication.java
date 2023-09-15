package com.kibernumacademy.devops;

import com.kibernumacademy.devops.entity.Student;
import com.kibernumacademy.devops.repositories.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevopsApplication implements CommandLineRunner {
  private final IStudentRepository repository;
  @Autowired
  public DevopsApplication(IStudentRepository repository) {
    this.repository = repository;
  }
  public static void main(String[] args) {
    SpringApplication.run(DevopsApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
 Student student1 = new Student("Username", "Lastname", "user.default@correo.com");
    repository.save(student1);

  }
}
