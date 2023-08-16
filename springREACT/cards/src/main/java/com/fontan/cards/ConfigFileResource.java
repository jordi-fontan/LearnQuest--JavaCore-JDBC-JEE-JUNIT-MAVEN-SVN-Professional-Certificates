/**
 * 
 */
package com.fontan.cards;

import java.io.File;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jordi
 *
 */
@Configuration
public class ConfigFileResource {

	@Bean(name="configFile")	
	public File configFile() {
			return new File("config.xml");
		}
		
}
