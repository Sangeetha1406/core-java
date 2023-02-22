package com.xworkz.repositiory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.dto.AeroplaneEntity;
@Repository
public class AeroplaneRepoImpl implements AeroplaneRepo {
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public AeroplaneRepoImpl() {
		System.out.println("created running..."+this.getClass().getSimpleName());
	}
	@Override
	public boolean save(AeroplaneEntity aeroplaneentity) {
		EntityManager entityManager=this.entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(aeroplaneentity);
		entityTransaction.commit();
		entityManager.close();
		return true;

	}
	public AeroplaneEntity findById(int id)
	{
		System.out.println("find by id repo impl"+id);
		EntityManager manager=this.entityManagerFactory.createEntityManager();
		AeroplaneEntity fromDB=manager.find(AeroplaneEntity.class, id);
		manager.close();
		return fromDB;
		
	}



}
