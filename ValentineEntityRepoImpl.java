package com.xworkz.repositiory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.dto.ValentineEntityTable;

@Repository
public class ValentineEntityRepoImpl implements ValentineEntityRepo{
	
	@Autowired
	private EntityManagerFactory  entityManagerFactory;
	
	public ValentineEntityRepoImpl() {
		System.out.println("running valentine repo.."+this.getClass().getSimpleName());
	}
	
	@Override
	public boolean save(ValentineEntityTable valentine) {
		EntityManager entityManager=this.entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(valentine);
		entityTransaction.commit();
		entityManager.close();
		return false;
	}

		
	}


