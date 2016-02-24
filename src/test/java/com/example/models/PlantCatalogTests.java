package com.example.models;

import java.time.LocalDate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.RentitApplication;
import com.example.models.BusinessPeriod;
import com.example.models.PlantInventoryEntry;
import com.example.models.PlantInvetoryEntryRepository;
import com.example.models.PurchaseOrder;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RentitApplication.class) 
@Sql(scripts="plants-dataset.sql") 
@DirtiesContext(classMode=ClassMode.AFTER_EACH_TEST_METHOD) 
public class PlantCatalogTests {
	@Autowired
	PlantInvetoryEntryRepository plantRepo;

	@Test
	public void queryPlantCatalog() {
		assertThat(plantRepo.count(), is(14l)); 
	}

	@Test
	public void queryByName() {
		//assertThat(plantRepo.findByNameContaining("Mini").size(), is(2));
	}

//	@Test
//	public void findAvailableTest() {
//		PlantInventoryEntry p = plantRepo.findOne(1l);
//
//		assertThat(plantRepo.findAvailablePlants(LocalDate.of(2016,2,20), LocalDate.of(2016,2,25)), hasItem(p));
//
//		PurchaseOrder po = new PurchaseOrder();
//		po.setPlant(p);
//    po.setRentalPeriod(BusinessPeriod.of(LocalDate.of(2016, 2, 20), LocalDate.of(2016, 2, 25)));
//		poRepo.save(po);
//
//		assertThat(plantRepo.findAvailablePlants(LocalDate.of(2016,2,20), LocalDate.of(2016,2,25)), not(hasItem(p))); 
//	}
}