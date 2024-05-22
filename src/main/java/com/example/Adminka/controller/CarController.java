package com.example.Adminka.controller;
import com.example.popitka.model.Book;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/dir")
public class CarController {
    @GetMapping("/get_all_dir")
    public List<Book> getAllCars() {
        List<Book> cars = new ArrayList<>();
        Book car1 = new Book(1, "Second", "MIIT");
        Book car2 = new Book(2, "First","RUT");
        cars.add(car1);
        cars.add(car2);
        return cars;
    }

}
