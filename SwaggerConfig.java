import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.security.SecuritySchemes;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
    title = "Example Spring Boot Application",
    version = "1.0",
    description = "API for managing contacts",
    contact = @Contact(
      name = "John Doe",
      email = "john.doe@example.com"
    )
  ),
 
        security = {
                @SecurityRequirement(name = "AuthKey"),
                @SecurityRequirement(name = "AuthToken"),
                @SecurityRequirement(name = "AuthUser")
        }
)
 
@SecuritySchemes(value = {
        @SecurityScheme(name = "AuthKey",
                type = SecuritySchemeType.APIKEY,
                in = SecuritySchemeIn.HEADER,
                paramName = "Authorization",
                description = "API key for authorization."),
        @SecurityScheme(name = "AuthToken",
                type = SecuritySchemeType.APIKEY,
                in = SecuritySchemeIn.HEADER,
                paramName = "Token",
                description = "Token for authorization."),
        @SecurityScheme(name = "AuthUser",
                type = SecuritySchemeType.APIKEY,
                in = SecuritySchemeIn.HEADER,
                paramName = "Username",
                description = "Username for authorization."),
})
public class SwaggerConfig {
}
