package org.codeforall;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    CarService carService;

    @RequestMapping(method = RequestMethod.GET, path = { "/", "", "/carsite"})
    public String getCarList(Model model){
        List<Car> carList = new ArrayList<>();
        model.addAttribute("carList", carService.getCarList());
        return "car-list";
    }
    @Autowired
    public void setCarService(CarService carService) {
        this.carService = carService;
    }
    @RequestMapping(method = RequestMethod.GET, value = "{id}")
    public String viewCar(Model model, @PathVariable int id) {
        model.addAttribute("car", carService.getById(id));
        return "car-view";
    }
}
