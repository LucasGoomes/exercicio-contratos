package entities;

import java.util.Date;

public class HourContract {
	//atributos
	private Date date;
	private Double valuePerHour;
	private Integer Hours;
	
	//construtores
	public HourContract() {
		
	}
	public HourContract(Date date, Double valuePerHour, Integer hours) {
		super();
		this.date = date;
		this.valuePerHour = valuePerHour;
		Hours = hours;
	}
	
	//getters e setters
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Double getValuePerHour() {
		return valuePerHour;
	}
	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	public Integer getHours() {
		return Hours;
	}
	public void setHours(Integer hours) {
		Hours = hours;
	}
	
	public double totalValue() {
		return valuePerHour * Hours;
	}
	
}


