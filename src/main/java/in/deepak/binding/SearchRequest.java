package in.deepak.binding;

import java.time.LocalDate;

import lombok.Data;

@Data
public class SearchRequest {

	private String PlanName;
	private String PlanStatus;
	private String gender;
	private String startDate;
	private String endDate;
}
