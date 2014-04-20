package myHibernate.bean;

public class Product {
	private String id=null;
	private String pname=null;
	private String provider=null;
	public void setId(String id)
	{
		this.id=id;
	}
	public String getid()
	{
		return this.id;
		
	}
	public void setPname(String pname)
	{
		this.pname=pname;
	}
	public String getPname()
	{
		return this.pname;
		
	}
	public void setProvider(String provider)
	{
		this.provider=provider;
	}
	public String getProvider()
	{
		return this.provider;
		
	}
	

}
