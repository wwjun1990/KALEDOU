package com.kaledou.domainobject.domain.repository;

import java.util.List;

public interface BaseRepository<E extends T, T> {
	
	public Long save(T obj);

	public T get(Long id);

	public T load(Long id);

	public void update(T obj);

	public void merge(T obj);

	public void delete(Long id);

	public void delete(T obj);

	public List<T> loadAll();

}
