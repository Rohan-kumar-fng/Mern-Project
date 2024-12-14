package com.example.Ecommerce.dao;

import com.example.Ecommerce.entity.Product;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository // TODO: We are not using repository because we have to write every endpoint
// collectionResourceRel=class,path=table name

// First One is the Entity and second one is db table name
// What are the endpoints exposes by this RepositoryRestResources?
//GET /entities: Retrieves all entities;
//POST /entities: Creates a new entity;
//GET /entities/search/{query}: Executes custom search methods;
//GET /profile/entities: Provides metadata about the entity;
//GET /entities/{id}: Retrieves a specific entity by ID;
//PUT /entities/{id}: Fully updates an entity by ID;
//PATCH /entities/{id}: Partially updates an entity by ID;
//DELETE /entities/{id}: Deletes an entity by ID;
//GET /entities?page=x&size=y&sort=field,asc/desc: Retrieves paginated/sorted results.
@RepositoryRestResource(collectionResourceRel = "product", path = "product")
public interface ProductRepository extends JpaRepository<Product,Long>{
}