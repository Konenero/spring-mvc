package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.DAO.CarsDAO;


@Controller
@RequestMapping("/cars")
public class CarsController {
    @Autowired
    private CarsDAO carsDAO;

    @GetMapping("")
    public String printCars(@RequestParam(name="count", defaultValue = "5", required = false) Integer count, ModelMap model) {
        model.addAttribute("countCars", carsDAO.getCars(count));
        return "cars";
    }
}
