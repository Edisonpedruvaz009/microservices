package com.eazybytes.accounts;

import com.eazybytes.accounts.dto.AccountsContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {AccountsContactInfoDto.class})
@OpenAPIDefinition(
	info=@Info(
			title="Accounts microservice Rest API documentation",
			description="EazyBank Accounts microservice Rest API documentation",
			version="v1",
			contact=@Contact(
					name="Edison Vaz",
					email="edisonvaz009@gmail.com",
					url="https://github.com/edisonvaz"

			),
			license = @License(
					name="Apache 2.0",
					url="http://www.apache.org/licenses/LICENSE-2.0.html"
			)

	),
		externalDocs = @ExternalDocumentation(
				description = "EazyBank Accounts microservice Rest API documentation",
				url="https://github.com/edisonvaz"
		)

)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
