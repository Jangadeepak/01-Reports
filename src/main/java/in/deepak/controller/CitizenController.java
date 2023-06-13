package in.deepak.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.deepak.binding.SearchRequest;
import in.deepak.entity.CitizenPlan;
import in.deepak.service.ReportService;

@Controller
public class CitizenController {

	@Autowired
	private ReportService service;
	
	// this method is used to send index page
	@GetMapping("/")
	public String loadindex(Model model) {
		
		model.addAttribute("search", new SearchRequest());
		model.addAttribute("names", service.getPlanNames());
		model.addAttribute("status", service.getPlanStatuses());
		
		return "index";
		
	}
	
	// this method will take care of form data
	@PostMapping("/search")
	public String handelsearch(@ModelAttribute("search") SearchRequest request,Model model)  {
		
		List<CitizenPlan> plans = service.search(request);
		model.addAttribute("plan", plans);
		
		//model.addAttribute("search", new SearchRequest());
		model.addAttribute("names", service.getPlanNames());
		model.addAttribute("status", service.getPlanStatuses());
		
		return "index";
	}
	
	@GetMapping("/excel")
	public void excelExport(HttpServletResponse response) throws Exception {
		
		response.setContentType("application/octet-stream");
		response.addHeader("content-Disposition", "attachment;filename=plans.xls;");
		
		service.exportExcel(response);
	}
	
	@GetMapping("/pdf")
	public void pdfExport(HttpServletResponse response) throws Exception {
		
		response.setContentType("application/pdf");
		response.addHeader("content-Disposition", "attachment;filename=plans.pdf;");
		
		service.exportPdf(response);
	}
	
	
}
