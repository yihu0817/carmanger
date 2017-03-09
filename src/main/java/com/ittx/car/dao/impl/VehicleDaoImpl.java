package com.ittx.car.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ittx.car.dao.VehicleDao;
import com.ittx.car.model.Module;
import com.ittx.car.model.Vehicle;
import com.ittx.car.utils.MyHibernateDaoSupport;
@Repository("vehicleDao")
@Transactional
public class VehicleDaoImpl extends MyHibernateDaoSupport implements VehicleDao {

	@Override
	public List<Vehicle> getAllVehicleList() {
		return (List<Vehicle>) getHibernateTemplate().find("FROM Vehicle");
	}

}
