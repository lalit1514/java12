package march18;

public class HotelManegement {

	
	private int prise;
	
	private String menuItem;

	public HotelManegement(int prise, String menuItem) {
		super();
		this.prise = prise;
		this.menuItem = menuItem;
	}

	public int getPrise() {
		return prise;
	}

	public void setPrise(int prise) {
		this.prise = prise;
	}

	public String getMenuItem() {
		return menuItem;
	}

	public void setMenuItem(String menuItem) {
		this.menuItem = menuItem;
	}
}
