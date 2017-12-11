package com.my.db;

public class T_funding_not_matched {
  private Long f_id;
  private Long f_invest_record_id;
  private Double f_not_matched_money;
  private String f_founding_type;
  private Double f_founding_weight;
  private String f_is_locked;
  private java.sql.Timestamp f_create_date;

  public Long getF_id() {
    return f_id;
  }

  public void setF_id(Long f_id) {
    this.f_id = f_id;
  }

  public Long getF_invest_record_id() {
    return f_invest_record_id;
  }

  public void setF_invest_record_id(Long f_invest_record_id) {
    this.f_invest_record_id = f_invest_record_id;
  }

  public Double getF_not_matched_money() {
    return f_not_matched_money;
  }

  public void setF_not_matched_money(Double f_not_matched_money) {
    this.f_not_matched_money = f_not_matched_money;
  }

  public String getF_founding_type() {
    return f_founding_type;
  }

  public void setF_founding_type(String f_founding_type) {
    this.f_founding_type = f_founding_type;
  }

  public Double getF_founding_weight() {
    return f_founding_weight;
  }

  public void setF_founding_weight(Double f_founding_weight) {
    this.f_founding_weight = f_founding_weight;
  }

  public String getF_is_locked() {
    return f_is_locked;
  }

  public void setF_is_locked(String f_is_locked) {
    this.f_is_locked = f_is_locked;
  }

  public java.sql.Timestamp getF_create_date() {
    return f_create_date;
  }

  public void setF_create_date(java.sql.Timestamp f_create_date) {
    this.f_create_date = f_create_date;
  }
}
