package GreatBeginnings;
import java.time.LocalDate;
public class Event {
	private String eventId;
	private String eventType;
	private LocalDate dateOfRegistration;
	private LocalDate dateOfEvent;
	private double payment;
	public String getEventId() {
		return eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	public LocalDate getDateOfRegistration() {
		return dateOfRegistration;
	}
	public void setDateOfRegistration(LocalDate dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}
	public LocalDate getDateOfEvent() {
		return dateOfEvent;
	}
	public void setDateOfEvent(LocalDate dateOfEvent) {
		this.dateOfEvent = dateOfEvent;
	}
	public double getPayment() {
		return payment;
	}
	public void setPayment(double payment) {
		this.payment = payment;
	}
	public Event(String eventId, String eventType, LocalDate dateOfRegistration, LocalDate dateOfEvent,
			double payment) {
		super();
		this.eventId = eventId;
		this.eventType = eventType;
		this.dateOfRegistration = dateOfRegistration;
		this.dateOfEvent = dateOfEvent;
		this.payment = payment;
	}
	public double calculateAmountToBePaid() {
		double d=0;
		if(payment>0) {
			if(eventType.equalsIgnoreCase("Weddings")) {
				d=payment*.88;
				return d;
			}
			else if(eventType.equalsIgnoreCase("Charity")) {
				d=payment*.91;
				return d;
			}
			else if(eventType.equalsIgnoreCase("ProductLaunch")) {
				d=payment*.85;
				return d;
			}
			else if(eventType.equalsIgnoreCase("Exhibitions")) {
				d=payment*.95;
				return d;
			}
			else if(eventType.equalsIgnoreCase("Workshops")) {
				d=payment*.93;
				return d;
			}
		}
		return -1;
	}
}
