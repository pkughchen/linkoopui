package link;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class LinkApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(LinkApplication.class).web(true).run(args);
	}
}
