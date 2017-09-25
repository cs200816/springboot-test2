package cs.test.web;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mail")
@EnableAutoConfiguration
public class MailController {
	@Autowired
	JavaMailSender mailSender;

	@RequestMapping("sendemail")
	@ResponseBody
	public String sendEmail() throws MessagingException {

		final MimeMessage mimeMessage = this.mailSender.createMimeMessage();
		final MimeMessageHelper message = new MimeMessageHelper(mimeMessage,true);
		message.setFrom("cs200816@163.com");
		message.setTo("276885742@qq.com");
		message.setSubject("给你一张美女图片！");
		message.setText("how are you！");
		String filePath="F:/123.jpg";
		 FileSystemResource file = new FileSystemResource(filePath);  
//         String fileName = filePath.substring(filePath.lastIndexOf(File.separator));  
         message.addAttachment("美女.jpg", file);  
		this.mailSender.send(mimeMessage);
		System.out.println("发送成功1！");
		new Thread(new Runnable() {
			
			public void run() {
				try {
					MimeMessage mimeMessage2 =mailSender.createMimeMessage();
					MimeMessageHelper message1 = new MimeMessageHelper(mimeMessage2,true);
					message1.setFrom("cs200816@163.com");
					message1.setTo("343937069@qq.com");
					message1.setSubject("你好啊！");
					message1.setText("给你一张美女图片！");
					
					String filePath="F:/123.jpg";
					 FileSystemResource file1 = new FileSystemResource(filePath);  
//			         String fileName = filePath.substring(filePath.lastIndexOf(File.separator));  
			         message1.addAttachment("美女", file1);  
					System.out.println("发送成功2！");
					mailSender.send(mimeMessage2);
				} catch (MessagingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		}).start();;
		 return "发送成功!";
	}
	
	public static void main(String[] args) throws Exception {
        SpringApplication.run(MailController.class, args);
    }
}
