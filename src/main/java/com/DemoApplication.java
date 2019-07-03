package com;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpa.entities.Employee;
import com.jpa.entities.Passport;
import com.jpa.repository.EmployeeRepository;
import com.jpa.repository.PassportRepository;
import com.springjdbc.dao.BonusDAO;
import com.springjdbc.dao.DepartmentDAO;
import com.springjdbc.dao.EmployeeDAO;
import com.springjdbc.dao.SalGradeDAO;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	EmployeeDAO empDAO;
	
	@Autowired
	DepartmentDAO deptDAO;
	
	@Autowired
	SalGradeDAO salGradeDAO;
	
	@Autowired
	BonusDAO bonusDAO;
	
	@Autowired
	EmployeeRepository emp;
	
	@Autowired
	PassportRepository passportRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {
		//Stat of spring jdbc sectino -------------------------------------------------------------------------------------------------------------------------------------
		//EmployeeDAO empDao=new EmployeeDAO();
/*		List<Employee> employees=empDAO.findAll();
		for(Employee e :employees) {
			System.out.println(e);
		}
		
		Employee specificEmployee=empDAO.findByID(7934);
		System.out.println(specificEmployee);
		
		//Test Exception scenario when no data is available
		Employee specificEmployee2=empDAO.findByID(1);
		System.out.println(specificEmployee2);
		System.out.println("Dept Info ******************");
		List<Department> depts=deptDAO.findAll();
		for(Department d :depts) {
			System.out.println(d);
		}
		
		Department dept=deptDAO.findByDeptNo(2);
		System.out.println(dept);
		
		Department dept2=deptDAO.findByDeptNo(111);
		System.out.println(dept2);
		
		System.out.println("Salgrade Info ***********");
		List<SalGrade> salgrades=salGradeDAO.findAll();
		for(SalGrade s:salgrades) {
			System.out.println(s);
		}
		System.out.println("Bonus Info ******************");
		List<Bonus> bonuses= bonusDAO.findAll();
		for(Bonus b: bonuses) {
			System.out.println(b);
		}
		
		//sample insert
		Employee empInsert=new Employee();
		empInsert.setComm(1);
		empInsert.setDeptNo(30);
		empInsert.setEmployeeId(1);
		empInsert.setEmployeeName("Virat");
		empInsert.setHireDate(new Date());
		empInsert.setJob("CLERK");
		empInsert.setMgr(7788);
		empInsert.setSal(1222);
		
		empDAO.insertEmployee(empInsert);
		System.out.println(empDAO.findByID(1));
		empDAO.updateEmployeeNameById("Wasim", 1);
		System.out.println(empDAO.findByID(1));
		empDAO.deleteEmployeeByID(1);*/
		//newly inserted data deleted at this point
		/* ---------------------------------------------------------------------------------------------------------------------------------------  End od spring jdbc section*/
		
	/*	Employee empInsert=new Employee();
		empInsert.setComm(1);
		empInsert.setDeptNo(30);
		empInsert.setEmployeeId(1);
		empInsert.setEmployeeName("Virat");
		empInsert.setHireDate(new Date());
		empInsert.setJob("CLERK");
		empInsert.setMgr(7788);
		empInsert.setSal(1222);
		
		Passport pass=new Passport();
		pass.setPassportCountry("India");
		
		
		empInsert.setPassport(pass);
		passportRepo.savePassportInfo(pass);
		emp.save(empInsert);
		System.out.println(emp.findById(1));
		
		empInsert.setEmployeeName("Wasim");
		emp.save(empInsert);
		
		Employee e=emp.findById(1);
		System.out.println(e);
		System.out.println(e.getPassport());*/
		
		
		//emp.deleteById(1);
		//System.out.println(emp.findById(1));
		
		emp.findEmpDeptDetails(7934);
		
		
		
		
		
		
		
		
	}

}
