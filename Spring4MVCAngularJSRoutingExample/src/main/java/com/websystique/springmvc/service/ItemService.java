package com.websystique.springmvc.service;

import java.util.List;

public interface ItemService {

    @SuppressWarnings("rawtypes")
	List findItemsByCategory(String category);
    Object findItemById(long id, String category);
}