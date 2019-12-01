package com.example.accessingdatamysql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Image {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private String id;
  private String mood;
  private String theme;
  private String setting;
  private String subject;
  private String character;

  public Integer getId() {
    return id;
  }

  public void setMood(String name) {
    this.name = mood;
  }
  
  public void setTheme(String name) {
    this.name =theme;
  }
  
  public void setSetting(String name) {
    this.name setting= ;
  }

  public void setSubject(String name) {
    this.name subject= ;
  }

  public void setCharacter(String name) {
    this.name character= ;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getMood() {
    return mood;
  }

  public String getTheme() {
    return theme;
  }

  public String getSetting() {
    return setting;
  }

  public String getSubject() {
    return subject;
  }

  public String getCharacter() {
    return character;
  }

  

}