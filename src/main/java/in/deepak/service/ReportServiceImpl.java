package in.deepak.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.lowagie.text.Document;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import in.deepak.binding.SearchRequest;
import in.deepak.entity.CitizenPlan;
import in.deepak.repo.CitizenPlanRepository;
import in.deepak.util.EmailGenerator;
import in.deepak.util.ExcelGenerator;
import in.deepak.util.Pdfgenerator;

@Service
public class ReportServiceImpl implements ReportService{

	@Autowired
	private CitizenPlanRepository repo;
	
	@Autowired
	private ExcelGenerator get;
	
	@Autowired
	private Pdfgenerator pdf;
	
	@Autowired
	private EmailGenerator email;
	
	@Override
	public List<String> getPlanNames() {
		return repo.getPlanNames();
	}
	
	@Override
	public List<String> getPlanStatuses() {
		
		return repo.getPlanStatus();
	}
	
	@Override
	public List<CitizenPlan> search(SearchRequest request) {
		
		CitizenPlan entity = new CitizenPlan();
		
		if(null!=request.getPlanName() && !"" .equals(request.getPlanName())) {
			entity.setPlanName(request.getPlanName());
		
	}
		if(null!=request.getPlanStatus() && !"" .equals(request.getPlanStatus())) {
			entity.setPlanStatus(request.getPlanStatus());
		
	}
		if(null!=request.getGender() && !"" .equals(request.getGender())) {
			
			entity.setGender(request.getGender());
		
	}
		
		if(null!=request.getStartDate() && !"".equals(request.getStartDate())) {
			
			String startDate=request.getStartDate();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			
			LocalDate localdate = LocalDate.parse(startDate, formatter);
			entity.setPlanStartDate(localdate);
		
	}
		if(null!=request.getEndDate() && !"".equals(request.getEndDate())) {
			
			String endDate=request.getEndDate();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			
			LocalDate localdate = LocalDate.parse(endDate, formatter);
			entity.setPlanEndDate(localdate);
		
	}
		
		
		
		return repo.findAll(Example.of(entity));
	}
	@Override
	public boolean exportExcel(HttpServletResponse response) throws Exception  {
		
		File f = new File("Plans.xls");
	List<CitizenPlan> records=repo.findAll();
	
	get.generateExcel(response ,records,f);
	
	String subject="Test mail subject";
	String body="<h1> Test mail body</h1>";
	String to ="jangadeepak9@gmail.com";
	
	
	
	email.sendMail(subject, body, to,f);
	
	f.delete();
	
	return true;
	}
			
	@Override
	public boolean exportPdf(HttpServletResponse response)throws Exception {
		
		List<CitizenPlan> plans = repo.findAll();
		
		pdf.generatePdf(response, plans);
		
		return true;
	
}
}
