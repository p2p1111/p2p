package com.test.entity;
public class T_claims_transfer {
  private Long c_id;
  private Long c_claims_id;
  private String c_transfer_serial_no;
  private Long c_user_id;
  private String c_claims_type;
  private java.sql.Timestamp c_transfer_date;
  private String c_claims_weight;
  private String c_transfer_money;
  private String c_audit_status;
  private String c_is_locked;

  public Long getC_id() {
    return c_id;
  }

  public void setC_id(Long c_id) {
    this.c_id = c_id;
  }

  public Long getC_claims_id() {
    return c_claims_id;
  }

  public void setC_claims_id(Long c_claims_id) {
    this.c_claims_id = c_claims_id;
  }

  public String getC_transfer_serial_no() {
    return c_transfer_serial_no;
  }

  public void setC_transfer_serial_no(String c_transfer_serial_no) {
    this.c_transfer_serial_no = c_transfer_serial_no;
  }

  public Long getC_user_id() {
    return c_user_id;
  }

  public void setC_user_id(Long c_user_id) {
    this.c_user_id = c_user_id;
  }

  public String getC_claims_type() {
    return c_claims_type;
  }

  public void setC_claims_type(String c_claims_type) {
    this.c_claims_type = c_claims_type;
  }

  public java.sql.Timestamp getC_transfer_date() {
    return c_transfer_date;
  }

  public void setC_transfer_date(java.sql.Timestamp c_transfer_date) {
    this.c_transfer_date = c_transfer_date;
  }

  public String getC_claims_weight() {
    return c_claims_weight;
  }

  public void setC_claims_weight(String c_claims_weight) {
    this.c_claims_weight = c_claims_weight;
  }

  public String getC_transfer_money() {
    return c_transfer_money;
  }

  public void setC_transfer_money(String c_transfer_money) {
    this.c_transfer_money = c_transfer_money;
  }

  public String getC_audit_status() {
    return c_audit_status;
  }

  public void setC_audit_status(String c_audit_status) {
    this.c_audit_status = c_audit_status;
  }

  public String getC_is_locked() {
    return c_is_locked;
  }

  public void setC_is_locked(String c_is_locked) {
    this.c_is_locked = c_is_locked;
  }
}
