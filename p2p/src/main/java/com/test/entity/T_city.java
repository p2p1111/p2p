package com.my.db;

public class T_city {
  private Long t_id;
  private String t_city_area_num;
  private String t_city_name;
  private String t_city_level;
  private String t_parent_city_num;

  public Long getT_id() {
    return t_id;
  }

  public void setT_id(Long t_id) {
    this.t_id = t_id;
  }

  public String getT_city_area_num() {
    return t_city_area_num;
  }

  public void setT_city_area_num(String t_city_area_num) {
    this.t_city_area_num = t_city_area_num;
  }

  public String getT_city_name() {
    return t_city_name;
  }

  public void setT_city_name(String t_city_name) {
    this.t_city_name = t_city_name;
  }

  public String getT_city_level() {
    return t_city_level;
  }

  public void setT_city_level(String t_city_level) {
    this.t_city_level = t_city_level;
  }

  public String getT_parent_city_num() {
    return t_parent_city_num;
  }

  public void setT_parent_city_num(String t_parent_city_num) {
    this.t_parent_city_num = t_parent_city_num;
  }
}
