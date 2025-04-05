package com.gabriel.Delifood.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabriel.Delifood.Entitys.Cozinha;

@Repository
public interface CozinhaRepository extends JpaRepository<Cozinha, Long>  {

}
