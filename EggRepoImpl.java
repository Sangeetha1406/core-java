package com.xworkz.repo;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.dto.EggDto;

@Repository
public class EggRepoImpl implements eggRepo{
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public EggRepoImpl() {
		System.out.println("created.."+this.getClass().getSimpleName());
	}

	@Override
	public boolean save(EggDto dto) {
		System.out.println("running save..");
		EntityManager entityManager=this.entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(dto);
		entityTransaction.commit();
		entityManager.close();
		return false;
	}

}
