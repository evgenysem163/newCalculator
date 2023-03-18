package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/calculator")
@RestController()
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {

        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/calculator")
    public String hello() {
        return " Добро пожаловать в калькулятор ";
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam("num1") String numOne, @RequestParam("num2") String numTwo) {
        if (numOne.isBlank() || numTwo.isBlank()) {
            return " Пустых значений не должно быть !";
        }
        return numOne + " + " + numTwo + " = " + calculatorService.plus(Integer.parseInt(numOne), Integer.parseInt(numTwo));
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam("num1") String numOne, @RequestParam("num2") String numTwo) {
        if (numOne.isBlank() || numTwo.isBlank()) {
            return " Ошибка. Пустых значений не должно быть ! ";
        }
        return numOne + " - " + numTwo + " = " + calculatorService.minus(Integer.parseInt(numOne), Integer.parseInt(numTwo));
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") String numOne, @RequestParam("num2") String numTwo) {
        if (numOne.isBlank() || numTwo.isBlank()) {
            return " Ошибка. Пустых значений не должно быть ! ";
        }
        return numOne + " * " + numTwo + " = " + calculatorService.multiply(Integer.parseInt(numOne), Integer.parseInt(numTwo));
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam("num1") String numOne, @RequestParam("num2") String numTwo) {
        if (numOne.isBlank() || numTwo.isBlank()) {
            return " Введите два параметра";
        }
        if (numTwo.equals("0")) {
            return " Ошибка. Делить на 0 нельзя! ";
        }
        return numOne + " / " + numTwo + " = " + calculatorService.divide(Integer.parseInt(numOne), Integer.parseInt(numTwo));
    }

}

