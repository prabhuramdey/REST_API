package in.jsp.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	@GetMapping("/greet")
	public String getGreetMsg() {	
		return "GOOD NIGHT GUYZ...";
	}
	
	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMsg() {
		String msg="WELCOME TO REST API....";
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	
	
	@PostMapping("/save")
	public ResponseEntity<String> saveMsg() {
		String responseBody="Message saved sucessfully...";
		return new ResponseEntity<String>(responseBody, HttpStatus.CREATED);
	}
}
