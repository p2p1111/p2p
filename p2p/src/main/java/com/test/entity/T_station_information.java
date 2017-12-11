package com.test.entity;

public class T_station_information {
  private Long s_id;
  private String s_message_state;
  private String s_message_content;
  private java.sql.Timestamp s_system_time;
  private String s_information_type;
  private Long s_receive_user_id;

  public Long getS_id() {
    return s_id;
  }

  public void setS_id(Long s_id) {
    this.s_id = s_id;
  }

  public String getS_message_state() {
    return s_message_state;
  }

  public void setS_message_state(String s_message_state) {
    this.s_message_state = s_message_state;
  }

  public String getS_message_content() {
    return s_message_content;
  }

  public void setS_message_content(String s_message_content) {
    this.s_message_content = s_message_content;
  }

  public java.sql.Timestamp getS_system_time() {
    return s_system_time;
  }

  public void setS_system_time(java.sql.Timestamp s_system_time) {
    this.s_system_time = s_system_time;
  }

  public String getS_information_type() {
    return s_information_type;
  }

  public void setS_information_type(String s_information_type) {
    this.s_information_type = s_information_type;
  }

  public Long getS_receive_user_id() {
    return s_receive_user_id;
  }

  public void setS_receive_user_id(Long s_receive_user_id) {
    this.s_receive_user_id = s_receive_user_id;
  }
}
