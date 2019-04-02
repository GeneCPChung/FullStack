package com.mdntstudios.imsproject.models.data;

import com.mdntstudios.imsproject.models.InventoryItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public interface IMSDao extends CrudRepository<InventoryItem, Integer> {
}
