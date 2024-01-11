package ru.neoflex.practice.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// Аннотация @RestController говорит Spring, что этот класс является REST-контроллером
@RestController
public class CalcController {

    // Метод для обработки GET-запросов по пути "/plus/{a}/{b}"
    @GetMapping("/plus/{a}/{b}")
    public Integer addNumbers(
            @PathVariable("a") Integer a,
            @PathVariable("b") Integer b
    ) {
        // Возвращает сумму двух чисел
        return a + b;
    }

    // Метод для обработки GET-запросов по пути "/minus/{a}/{b}"
    @GetMapping("/minus/{a}/{b}")
    public Integer subtractNumbers(
            @PathVariable("a") Integer a,
            @PathVariable("b") Integer b
    ) {
        // Возвращает разность двух чисел
        return a - b;
    }
}