package productdata.rdf.model;

import org.eclipse.rdf4j.model.IRI;
import java.util.Set;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigDecimal;
/**
* Class Product 
*/
public interface IProduct extends IRI{

	public IRI iri();		
     	
    public void addPrices (IMoney parameter);
	
	public Set<IMoney> getPrices();
    

	public void setName (BigDecimal parameter);
	
	public String getName ();

	public void setDepth (BigDecimal parameter);
	
	public String getDepth ();

	public void setWidth (BigDecimal parameter);
	
	public String getWidth ();

	public void setHeigth (BigDecimal parameter);
	
	public String getHeigth ();

	public void setId (String parameter);
	
	public String getId ();
    /** 
    * This is just an email address.
	*/
	public void setProductManager (String parameter);
	
	public String getProductManager ();
}
