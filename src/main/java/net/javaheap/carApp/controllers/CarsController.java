package net.javaheap.carApp.controllers;

import net.javaheap.carApp.models.Car;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/cars")
public class CarsController {

    @GetMapping
    public List<Car> list() {
        return new ArrayList<>();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Car car) {
    }

    @GetMapping("{id}")
    public Car get(@PathVariable("id") Long id) {
            return new Car();
    }
}
