
package com.legalbriz.legalBriz.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.legalbriz.legalBriz.model.Lawyer;



@Repository
public interface Dao extends JpaRepository<Lawyer,Integer>{



}
