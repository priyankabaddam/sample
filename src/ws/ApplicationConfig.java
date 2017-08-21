package ws;

import java.util.Set;

import com.sun.glass.ui.Application;

@javax.ws.rs.ApplicationPath("rest")
public abstract  class ApplicationConfig extends Application {
	
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = new java.util.HashSet<>();
		addRestResourceClasses(resources);
		return resources;
		
		
}
	private void addRestResourceClasses(Set<Class<?>> resources) {
		// TODO Auto-generated method stub
		resources.add(ws.ProductRestful.class);
	}
	

}
