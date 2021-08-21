package com.example.login.appuser;

import java.util.Optional;

import org.hibernate.type.TrueFalseType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
@Repository
public interface AppRepository extends CrudRepository<AppUser,Long>{

    Optional<AppUser> findByEmail(String email);

}


    
