package ru.levelup.lesson9_10.service;

import ru.levelup.lesson9_10.entity.City;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
public interface CityService {

    Optional<City> findById(Integer id);

    List<City> findByIdAndNameRu(Integer id, String nameRu);

    void create(City city);

    void update(City city);

    void deleteById(Integer id);

}
