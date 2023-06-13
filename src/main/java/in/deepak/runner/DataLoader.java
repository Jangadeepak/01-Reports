package in.deepak.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import in.deepak.entity.CitizenPlan;
import in.deepak.repo.CitizenPlanRepository;

@Component
public class DataLoader implements ApplicationRunner {

	@Autowired
	 private CitizenPlanRepository repo;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		/*
		repo.deleteAll();
		//cash plan
		
		CitizenPlan c1= new CitizenPlan();
		c1.setCitizenName("David");
		c1.setGender("Male");
		c1.setPlanName("cash");
		c1.setPlanStatus("Approved");
		c1.setPlanStartDate(LocalDate.now());
		c1.setPlanEndDate(LocalDate.now().plusMonths(6));
		c1.setBenefitAmt(5000.00);
		
		CitizenPlan c2= new CitizenPlan();
		c2.setCitizenName("merry");
		c2.setGender("Fe-Male");
		c2.setPlanName("cash");
		c2.setPlanStatus("Denied");
		c2.setDenialReason("Rental Income");
		
		CitizenPlan c3= new CitizenPlan();
		c3.setCitizenName("john");
		c3.setGender("Male");
		c3.setPlanName("cash");
		c3.setPlanStatus("Terminated");
		c3.setPlanStartDate(LocalDate.now());
		c3.setPlanEndDate(LocalDate.now().plusMonths(6));
		c3.setBenefitAmt(5000.00);
		c3.setTerminatedDate(LocalDate.now().plusMonths(0));
		c3.setTerminationRns("Employed");
		
		
		//food plan 
		
		CitizenPlan c4= new CitizenPlan();
		c4.setCitizenName("smith");
		c4.setGender("Male");
		c4.setPlanName("Food");
		c4.setPlanStatus("Approved");
		c4.setPlanStartDate(LocalDate.now());
		c4.setPlanEndDate(LocalDate.now().plusMonths(6));
		c4.setBenefitAmt(4000.00);
		
		CitizenPlan c5= new CitizenPlan();
		c5.setCitizenName("Morgon");
		c5.setGender("Fe-Male");
		c5.setPlanName("Food");
		c5.setPlanStatus("Denied");
		c5.setDenialReason("Prpperty Income");
		
		CitizenPlan c6= new CitizenPlan();
		c6.setCitizenName("jack");
		c6.setGender("Male");
		c6.setPlanName("Food");
		c6.setPlanStatus("Terminated");
		c6.setPlanStartDate(LocalDate.now());
		c6.setPlanEndDate(LocalDate.now().plusMonths(6));
		c6.setBenefitAmt(5000.00);
		c6.setTerminatedDate(LocalDate.now().plusMonths(0));
		c6.setTerminationRns("Employed");
		
		// mediacl income
		CitizenPlan c7= new CitizenPlan();
		c7.setCitizenName("charles");
		c7.setGender("Male");
		c7.setPlanName("Medical");
		c7.setPlanStatus("Approved");
		c7.setPlanStartDate(LocalDate.now());
		c7.setPlanEndDate(LocalDate.now().plusMonths(6));
		c7.setBenefitAmt(6000.00);
	
		CitizenPlan c8= new CitizenPlan();
		c8.setCitizenName("talory");
		c8.setGender("Fe-Male");
		c8.setPlanName("Medical");
		c8.setPlanStatus("Denied");
		c8.setDenialReason("Property Income");
		
		CitizenPlan c9= new CitizenPlan();
		c9.setCitizenName("Robert");
		c9.setGender("Male");
		c9.setPlanName("Medical");
		c9.setPlanStatus("Terminated");
		c9.setPlanStartDate(LocalDate.now());
		c9.setPlanEndDate(LocalDate.now().plusMonths(6));
		c9.setBenefitAmt(5000.00);
		c9.setTerminatedDate(LocalDate.now().plusMonths(0));
		c9.setTerminationRns("govt job");
		
		
		
		CitizenPlan c11= new CitizenPlan();
		c11.setCitizenName("conway");
		c11.setGender("Male");
		c11.setPlanName("Employment");
		c11.setPlanStatus("Approved");
		c11.setPlanStartDate(LocalDate.now());
		c11.setPlanEndDate(LocalDate.now().plusMonths(6));
		c11.setBenefitAmt(6000.00);
	
		CitizenPlan c12= new CitizenPlan();
		c12.setCitizenName("Gibbs");
		c12.setGender("Fe-Male");
		c12.setPlanName("Employment");
		c12.setPlanStatus("Denied");
		c12.setDenialReason("Property Income");
		CitizenPlan c10= new CitizenPlan();
		
		c10.setCitizenName("Brook");
		c10.setGender("Male");
		c10.setPlanName("Employemnt");
		c10.setPlanStatus("Terminated");
		c10.setPlanStartDate(LocalDate.now());
		c10.setPlanEndDate(LocalDate.now().plusMonths(6));
		c10.setBenefitAmt(5000.00);
		c10.setTerminatedDate(LocalDate.now().plusMonths(0));
		c10.setTerminationRns("govt job");
		
		
		List<CitizenPlan> List = Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c11,c12,c10);
		
		repo.saveAll(List);
		
		*/
	}
	
	
	

		
		
	}

