package com.gabriel.Delifood.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.Delifood.Entitys.Restaurante;
import com.gabriel.Delifood.Repository.RestauranteRepository;

@Service
public class RestauranteService {
	@Autowired
	private RestauranteRepository repository;

	public void create(Restaurante obj) {
		repository.save(obj);
	}

	public void delete(Long Id) {
		repository.deleteById(Id);
	}

	public Restaurante GetId(Long Id) {
		Optional<Restaurante> obj = repository.findById(Id);
		return obj.get();
	}

	public List<Restaurante> getAll() {
		return repository.findAll();

	}

	public Restaurante update(Restaurante obj) {
		Optional<Restaurante> newObj = repository.findById(obj.getId());
		updateRestaurante(newObj, obj);
		return repository.save(newObj.get());
	}

	private void updateRestaurante(Optional<Restaurante> newObj, Restaurante obj) {
		newObj.get().setNome(obj.getNome());

	}

}
