package in.deepak.util;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

import com.lowagie.text.Document;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import in.deepak.entity.CitizenPlan;

@Component
public class Pdfgenerator {

	
	public void generatePdf(HttpServletResponse response,List<CitizenPlan> plans)throws Exception{
		Document document = new Document(PageSize.A4);
		PdfWriter.getInstance(document, response.getOutputStream());
		document.open();
		
		Paragraph p= new Paragraph("Citizen Plan Info");
		 
		document.add(p);

		
		PdfPTable table= new PdfPTable(6);
		table.addCell("Id");
		table.addCell("Citizen Plan");
		table.addCell("Plan Name");
		table.addCell("Plan Status");
		table.addCell("Start Date");
		table.addCell("End Date");
		
		
		
		for(CitizenPlan plan:plans) {
			table.addCell(String.valueOf(plan.getCitizenId()));
			table.addCell(plan.getCitizenName());
			table.addCell(plan.getPlanName());
			table.addCell(plan.getPlanStatus());
			table.addCell(plan.getPlanStartDate()+"");
			table.addCell(plan.getPlanEndDate()+"");
			
		}
		
		document.add(table);
		document.close();
		
		
	}
}

