package ${package}.service;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import ${package}.core.CoreConfiguration;

@Configuration
@Import(CoreConfiguration.class)
public class ServiceConfiguration {

}