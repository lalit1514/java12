package com.eb.model;

public class Menu {
	private int menuId;
	private String menuName;
	private String menuType;
	private int prise;
	private int quantity;
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getMenuType() {
		return menuType;
	}
	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}
	public int getPrise() {
		return prise;
	}
	public void setPrise(int prise) {
		this.prise = prise;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Menu( String menuName, String menuType, int prise, int quantity) {
		super();
		
		this.menuName = menuName;
		this.menuType = menuType;
		this.prise = prise;
		this.quantity = quantity;
	}
	public Menu() {
		super();

	}
	@Override
	public String toString() {
		return "Menu [menuId=" + menuId + ", menuName=" + menuName + ", menuType=" + menuType + ", prise=" + prise
				+ ", quantity=" + quantity + ", getMenuId()=" + getMenuId() + ", getMenuName()=" + getMenuName()
				+ ", getMenuType()=" + getMenuType() + ", getPrise()=" + getPrise() + ", getQuantity()=" + getQuantity()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
