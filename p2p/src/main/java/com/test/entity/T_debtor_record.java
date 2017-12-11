package com.my.db;

public class T_debtor_record {
  private Long t_id;
  private Long t_claims_id;
  private java.sql.Timestamp t_receivable_date;
  private String t_receivable_monry;
  private java.sql.Timestamp t_record_date;
  private String t_isreturned;

  public Long getT_id() {
    return t_id;
  }

  public void setT_id(Long t_id) {
    this.t_id = t_id;
  }

  public Long getT_claims_id() {
    return t_claims_id;
  }

  public void setT_claims_id(Long t_claims_id) {
    this.t_claims_id = t_claims_id;
  }

  public java.sql.Timestamp getT_receivable_date() {
    return t_receivable_date;
  }

  public void setT_receivable_date(java.sql.Timestamp t_receivable_date) {
    this.t_receivable_date = t_receivable_date;
  }

  public String getT_receivable_monry() {
    return t_receivable_monry;
  }

  public void setT_receivable_monry(String t_receivable_monry) {
    this.t_receivable_monry = t_receivable_monry;
  }

  public java.sql.Timestamp getT_record_date() {
    return t_record_date;
  }

  public void setT_record_date(java.sql.Timestamp t_record_date) {
    this.t_record_date = t_record_date;
  }

  public String getT_isreturned() {
    return t_isreturned;
  }

  public void setT_isreturned(String t_isreturned) {
    this.t_isreturned = t_isreturned;
  }
}
