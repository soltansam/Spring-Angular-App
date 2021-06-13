package net.javaheap.carApp.repositories;

import net.javaheap.carApp.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
