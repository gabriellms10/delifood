package com.gabriel.Delifood.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.Delifood.Repository.CozinhaRepository;

@Service
public class CozinhaService {
	@Autowired
	private CozinhaRepository repository;
}
