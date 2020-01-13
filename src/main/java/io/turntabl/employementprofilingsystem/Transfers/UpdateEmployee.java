package io.turntabl.employementprofilingsystem.Transfers;

import java.util.List;

public class UpdateEmployee {
    private String employee_firstname;
    private String employee_lastname;
    private String employee_phonenumber;
    private String employee_email;
    private String employee_address;
    private String employee_dev_level;
    private String employee_gender;
    private String employee_status;
    private String employee_role;
    private List<Integer> employee_tech_stack;

    public UpdateEmployee() {
    }

    public String getEmployee_firstname() {
        return employee_firstname;
    }

    public void setEmployee_firstname(String employee_firstname) {
        this.employee_firstname = employee_firstname;
    }

    public String getEmployee_lastname() {
        return employee_lastname;
    }

    public void setEmployee_lastname(String employee_lastname) {
        this.employee_lastname = employee_lastname;
    }

    public String getEmployee_phonenumber() {
        return employee_phonenumber;
    }

    public void setEmployee_phonenumber(String employee_phonenumber) {
        this.employee_phonenumber = employee_phonenumber;
    }

    public String getEmployee_email() {
        return employee_email;
    }

    public void setEmployee_email(String employee_email) {
        this.employee_email = employee_email;
    }

    public String getEmployee_address() {
        return employee_address;
    }

    public void setEmployee_address(String employee_address) {
        this.employee_address = employee_address;
    }

    public String getEmployee_dev_level() {
        return employee_dev_level;
    }

    public void setEmployee_dev_level(String employee_dev_level) {
        this.employee_dev_level = employee_dev_level;
    }

    public String getEmployee_gender() {
        return employee_gender;
    }

    public void setEmployee_gender(String employee_gender) {
        this.employee_gender = employee_gender;
    }

    public String getEmployee_status() {
        return employee_status;
    }

    public void setEmployee_status(String employee_status) {
        this.employee_status = employee_status;
    }

    public String getEmployee_role() {
        return employee_role;
    }

    public void setEmployee_role(String employee_role) {
        this.employee_role = employee_role;
    }

    public List<Integer> getEmployee_tech_stack() {
        return employee_tech_stack;
    }

    public void setEmployee_tech_stack(List<Integer> employee_tech_stack) {
        this.employee_tech_stack = employee_tech_stack;
    }
}