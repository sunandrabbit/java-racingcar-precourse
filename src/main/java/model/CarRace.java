package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import util.Utils;

public class CarRace {

    private List<Car> carList = new ArrayList<>();
    private int raceCount;


    public CarRace(String[] carNames){
        this.carList = Arrays.stream(carNames).map(Car::new).toList();
    }

    public List<Car> getCarList(){
        return carList;
    }

    public void raceOnce(){
        for(Car car : carList){
            car.move(Utils.getRandomNumber());
        }
    }



}
