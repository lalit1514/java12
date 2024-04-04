package march18;

public class MapFilter {

	private int pid;
	
	private String pname;
	
	private int prise;
	
	private int pqty;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrise() {
		return prise;
	}

	public void setPrise(int prise) {
		this.prise = prise;
	}

	public int getPqty() {
		return pqty;
	}

	public void setPqty(int pqty) {
		this.pqty = pqty;
	}

	public MapFilter(int pid, String pname, int prise, int pqty) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.prise = prise;
		this.pqty = pqty;
	}

	public MapFilter() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MapFilterSorted [pid=" + pid + ", pname=" + pname + ", prise=" + prise + ", pqty=" + pqty
				+ ", getPid()=" + getPid() + ", getPname()=" + getPname() + ", getPrise()=" + getPrise()
				+ ", getPqty()=" + getPqty() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
