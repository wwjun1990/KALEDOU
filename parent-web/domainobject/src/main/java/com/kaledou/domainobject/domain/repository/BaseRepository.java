package com.kaledou.domainobject.domain.repository;

public interface BaseRepository<E extends T, T> {
	
	public void save(E e);

}
