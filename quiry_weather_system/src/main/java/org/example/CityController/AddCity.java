package org.example.CityController;

import org.example.Utils.ToCity;
import org.example.mapper.CityMapper;
import org.example.pojo.City;

import java.io.IOException;

public class AddCity {
    public  City add(CityMapper cityMapper) throws IOException {
        ToCity toCity=new ToCity();
        City city= toCity.toCity();
        //添加
        cityMapper.add(city);
        return city;

    }
}
