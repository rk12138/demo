package com.yyy.springbootredis.mapper;

import com.yyy.springbootredis.entity.Person;
import com.yyy.springbootredis.entity.PersonInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    @Query("select p from Person p where p.name = :name")
    Optional<Person> findPersonByNameCustom(String name);

    @Query(value = "select com.yyy.springbootredis.entity.PersonInfo(p.name, p.age, p.companyName, p.schoolName)" +
            "from Person p left join Company c on p.companyId = c.id" +
            "left join School s on p.schoolId = s.id" +
            "where p.id = :id")
    Optional<PersonInfo> getPerSonInfoById(Long id);

}
