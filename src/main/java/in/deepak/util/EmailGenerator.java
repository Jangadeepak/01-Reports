package in.deepak.util;

import java.io.File;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailGenerator {

	
	@Autowired
	private JavaMailSender mailSender;
	
	
	
	public boolean sendMail(String subject,String body,String to, File f) {
		
		try {
			
			MimeMessage mimemsg= mailSender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(mimemsg, true);
			helper.setSubject(subject);
			helper.setText(body, true);
			helper.setTo(to);
			helper.addAttachment("Reports-Info", f);
			
			
			
			mailSender.send(mimemsg);
			
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		return true;
		
	}
}
