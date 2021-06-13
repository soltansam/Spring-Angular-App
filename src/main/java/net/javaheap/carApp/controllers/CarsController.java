package net.javaheap.carApp.controllers;

import net.javaheap.carApp.models.Car;
import net.javaheap.carApp.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cars")
public class CarsController {

    @Autowired
    private CarRepository carRepository;

    @GetMapping
    public List<Car> list() {
        return carRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Car car) {
        carRepository.save(car);
    }

    @GetMapping("{id}")
    public Car get(@PathVariable("id") Long id) {
            return carRepository.getById(id);
    }
}
