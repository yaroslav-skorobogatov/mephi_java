package com.example.finalWork.service;

import com.example.finalWork.entity.Country;
import com.example.finalWork.entity.User;
import com.example.finalWork.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@Service
@RequiredArgsConstructor  //заюзаем чтобы автоматически сгененрировать конструктор
public class UserService {
    private final UserRepository userRepository;


    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getUsersByCountries(String countries) {
//        return userRepository.findByCountryIn(countries).stream()
//                .sorted(Comparator.comparing(user -> user.getCountry().name()))
//                .toList();
        List<String> validCountryNames = Arrays.stream(Country.values())
                .map(Enum::name)
                .toList();

        List<Country> countriesParse = Arrays.stream(countries.split(","))
                .map(x -> x.trim().toUpperCase())
                .filter(validCountryNames::contains) //пропустим все что не входит в перечисление
                .map(Country::valueOf)
                .toList();


        return userRepository.findByCountryInOrderByCountryAsc(countriesParse);
    }
}
