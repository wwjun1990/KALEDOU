package com.kaledou.datapersistence.repository.impl.usersystem;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.kaledou.domainobject.domain.repository.BaseRepository;

public class BaseRepositoryImpl<E extends T, T> extends HibernateDaoSupport
		implements BaseRepository<E, T> {

	@SuppressWarnings("unchecked")
	protected Class<E> entityClass = (Class<E>) ((ParameterizedType) getClass()
			.getGenericSuperclass()).getActualTypeArguments()[0];

	@SuppressWarnings("unchecked")
	@Override
	public Long save(T obj) {
		return (Long) getHibernateTemplate().save((Class<E>) obj);
	}

	@Override
	public T get(Long id) {
		return getHibernateTemplate().get(entityClass, id);
	}

	@Override
	public T load(Long id) {
		return getHibernateTemplate().load(entityClass, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void update(T obj) {
		getHibernateTemplate().update((Class<E>) obj);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void merge(T obj) {
		getHibernateTemplate().merge((Class<E>) obj);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void delete(Long id) {
		T obj = this.load(id);
		getHibernateTemplate().delete((Class<E>) obj);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void delete(T obj) {
		getHibernateTemplate().delete((Class<E>) obj);
	}

	@Override
	public List<T> loadAll() {
		List<T> t = new ArrayList<T>();
		for (E e : getHibernateTemplate().loadAll(entityClass)) {
			t.add((T) e);
		}
		return t;
	}
	
	@SuppressWarnings("unchecked")
	public List<T> findByCriteria(DetachedCriteria detachedCriteria) {
		return getHibernateTemplate().findByCriteria(detachedCriteria);
	}

	@SuppressWarnings("unchecked")
	public List<T> findByCriteria(DetachedCriteria detachedCriteria, int first,
			int max) {
		return getHibernateTemplate().findByCriteria(detachedCriteria, first,
				max);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> findByHql(String hql, Object[] params) {
		Query query = getHibernateSession().createQuery(hql);
		if (null != params && params.length > 0) {
			for (int i = 0; i < params.length; i++) {
				query.setParameter(i, params[i]);
			}
		}
		return query.list();
	}
	
	public int countByCriteria(final DetachedCriteria detachedCriteria) {
		Long count = getHibernateTemplate().execute(
				new HibernateCallback<Long>() {
					public Long doInHibernate(Session session)
							throws HibernateException {
						Criteria criteria = detachedCriteria
								.getExecutableCriteria(session);
						return (Long)criteria.setProjection(Projections.rowCount())
								.uniqueResult();
					}
				});
		return count.intValue();
	}

	public Session getHibernateSession() {
		return getSession();
	}

}
