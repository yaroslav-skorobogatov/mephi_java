package com.example.finalWork.repository;

import com.example.finalWork.entity.Country;
import com.example.finalWork.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByCountryIn(List<Country> countries); //тут важно задать ...In в конце назхвания метода, для поиска по нескольким значениям, иначе spring ругаетя

    List<User> findByCountryInOrderByCountryAsc(List<Country> countries); //попробуем сортировку внесни на уровень запроса к бд
}
