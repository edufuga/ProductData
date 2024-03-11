package productdata.rdf.model;

import org.eclipse.rdf4j.model.IRI;
/**
* Class Employee 
*/
public interface IEmployee extends IRI{

	public IRI iri();		
    

	public void setProductExpertFor (String parameter);
	
	public String getProductExpertFor ();

	public void setName (String parameter);
	
	public String getName ();

	public void setEmail (String parameter);
	
	public String getEmail ();

	public void setPhone (String parameter);
	
	public String getPhone ();

	public void setAddress (String parameter);
	
	public String getAddress ();
}
