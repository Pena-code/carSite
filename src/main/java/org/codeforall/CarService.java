package org.codeforall;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Repository
public class CarService {

    private List<Car> carList = new ArrayList<>();

    @Autowired
    public CarService(){
        carList.add(new Car(1, "Fiat", "Punto", 1999, 75, 300, "https://prod-images.custojusto.pt/play/8457619864-fiat-punto-1999-p-pecas.jpg", "This magnificent piece of engineering, italian stallion!!! That's not rust on the bolts, that's patina!"));
        carList.add(new Car(2,"Rover", "214", 1992, 70, 150, "https://ecooparts.com//src/img/campa/v4nd66/13092516/87465.webp", "Made in Britain, works as a broken watch, sharp two times a day!!! With new breaking pads!"));
        carList.add(new Car(3, "Hyundai", "Accent", 1994, 60, 125, "https://ireland.apollo.olxcdn.com/v1/files/medawujosgmn3-PT/image;s=1000x700", "K-pop!!! With a working clock and almost new tires. You always know where the car is, just follow the oil trail."));
    }


    public Car getById(Integer id){
        for(Car car : carList){
            if(car.getId() == id){
                return car;
            }
        }
        return null;
    }

    public List<Car> getCarList() {
        return carList;
    }
}
