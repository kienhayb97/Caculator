package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CaculatorCotroller {
    @RequestMapping("/controller")
    public String controller(@RequestParam(name = "firstmunber", defaultValue = "0") double firstNum,
                             @RequestParam(name = "secondnumber", defaultValue = "0") double secondNum,
                             @RequestParam(name = "pheptinh", defaultValue = "+") String pheptinh, ModelMap modelMap) {
        double result = 0;
        switch (pheptinh) {
            case "Addition(+)":
                result = firstNum + secondNum;
                break;
            case "Subtraction(-)":
                result = firstNum - secondNum;
                break;
            case "Multiplication(X)":
                result = firstNum * secondNum;
                break;
            case "Division(/)":
                result = firstNum / firstNum;
                break;
        }
        modelMap.addAttribute("result", result);
        modelMap.addAttribute("firstmunber",firstNum);
        modelMap.addAttribute("secondnumber",secondNum);
        return "index";
    }
}
