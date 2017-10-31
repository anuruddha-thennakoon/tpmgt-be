package org.tpmgt.application;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.tpmgt.filters.CorsFilter;
import org.tpmgt.mappers.DataNotFoundExceptionMapper;
import org.tpmgt.mappers.ThrowableExceptionMapper;
import org.tpmgt.mappers.UnAuthorizedExceptionMapper;
import org.tpmgt.mappers.UserNotFoundExceptionMapper;
import org.tpmgt.resources.DashboardResource;
import org.tpmgt.resources.RevisionResource;
import org.tpmgt.resources.UserResource;

import io.swagger.jaxrs.config.BeanConfig;

@ApplicationPath("api")
public class Main extends Application {
	Logger LOGGER = Logger.getLogger(Main.class.getName());

	public Main() {

		BeanConfig beanConfig = new BeanConfig();
		beanConfig.setTitle("TPMGT BACK END");
		beanConfig.setVersion("1.0");
		beanConfig.setSchemes(new String[] { "http" });
		beanConfig.setHost("localhost:8080");
		beanConfig.setBasePath("/api");
		beanConfig.setResourcePackage("org.tpmgt.resources");
		beanConfig.setScan(true);

	}

	@Override
	public Set<Class<?>> getClasses() {

		Set<Class<?>> resources = new HashSet<Class<?>>();

		resources.add(UserResource.class);
		resources.add(RevisionResource.class);
		resources.add(DashboardResource.class);
		resources.add(CorsFilter.class);

		/*
		 * exception mappers
		 */
		resources.add(ThrowableExceptionMapper.class);
		resources.add(DataNotFoundExceptionMapper.class);
		resources.add(UnAuthorizedExceptionMapper.class);
		resources.add(UserNotFoundExceptionMapper.class);

		resources.add(io.swagger.jaxrs.listing.ApiListingResource.class);
		resources.add(io.swagger.jaxrs.listing.SwaggerSerializers.class);

		return resources;
	}

}
