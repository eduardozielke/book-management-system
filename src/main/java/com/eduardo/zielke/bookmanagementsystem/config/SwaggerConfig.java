package com.eduardo.zielke.bookmanagementsystem.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI springOpenAPI() {

        Contact appContact = new Contact();
        appContact.setName(AppInfo.contactName);
        appContact.setUrl(AppInfo.contactUrl);
        appContact.setEmail(AppInfo.contactEmail);

        License appLicense = new License();
        appLicense.setName("MIT");
        appLicense.setUrl("");

        Server server = new Server();
        server.setUrl(AppInfo.serverUrl);

        return new OpenAPI()
                .addServersItem(server)
                .components(new Components().addSecuritySchemes(
                        "bearer-key",
                        new SecurityScheme()
                                .type(SecurityScheme.Type.HTTP)
                                .scheme("bearer")
                                .bearerFormat("JWT")
                ))
                .info(new Info()
                        .title(AppInfo.name)
                        .description(AppInfo.description)
                        .version(AppInfo.version)
                        .contact(appContact)
                        .license(appLicense)
                ).addSecurityItem(new SecurityRequirement().addList("bearer-key", new ArrayList<>()));
    }

}