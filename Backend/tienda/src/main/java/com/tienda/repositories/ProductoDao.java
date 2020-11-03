package com.tienda.repositories;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.tienda.entities.ProductoEntity;

public interface ProductoDao extends PagingAndSortingRepository<ProductoEntity, Long> {

}
