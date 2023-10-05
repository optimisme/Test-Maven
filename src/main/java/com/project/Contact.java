package com.project;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class Contact implements Serializable {

	private long contactId;
	private String name;
	private String email;
	private Set<Employee> employees; // Ha de tenir getter i setter perquè s'encarrega de la taula relacional N:N

	public Contact() { }

	public Contact(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public long getContactId() {
		return this.contactId;
	}

	public void setContactId(long id) {
		this.contactId = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Employee> getEmployees () {
		return this.employees;
	}

	public void setEmployees (Set<Employee> employees) {
		this.employees = employees;
	}

	public List<Object[]> queryEmployees () {
		long id = this.getContactId();
		return Manager.queryTable("SELECT DISTINCT e.* FROM Employee_Contact ec, Employee e WHERE e.id = ec.employees_id AND ec.contacts_id = " + id);
	}

	@Override
    public String toString () {
		String str = Manager.tableToString(queryEmployees()).replaceAll("\n", " | ");
      	return this.getContactId() + ": " + this.getName() + ", " + this.getEmail() + ", Employees: [" + str + "]";
    }
}