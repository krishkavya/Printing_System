package sample1;

public class printer_functions {
	String req_id;
	String p_id;
	public	printer_functions()
	{
		
	}
	public printer_functions(String req_id,String p_id)
	{
		this.req_id=req_id;
		this.p_id=p_id;
	}
	public void request_id_access(String req_id)
	{
		this.req_id=req_id;
	}
	public void printer_id_access(String p_id)
	{
		this.p_id=p_id;
	}
	public String return_request_id()
	{
		return this.req_id;
	}
	public String return_printer_id()
	{
		return this.p_id;
	}
}
