package com.genec.cheesemvc.models.data;

import com.genec.cheesemvc.models.Cheese;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface CheeseDao extends CrudRepository<Cheese, Integer> {
    //void delete(int cheeseId);
}
