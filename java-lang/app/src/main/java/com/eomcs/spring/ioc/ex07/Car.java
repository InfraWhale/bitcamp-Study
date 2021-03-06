package com.eomcs.spring.ioc.ex07;

import java.sql.Date;

public class Car {
  String model;
  String maker;
  int cc;
  boolean auto;
  Date createdDate;
  Engine engine;

  public Car() {
    System.out.println("Truck()");
  }


  @Override
  public String toString() {
    return "Truck [model=" + model + ", maker=" + maker + ", cc=" + cc + ", auto=" + auto + ", createdDate="
        + createdDate + ", engine=" + engine + "]";
  }
  public Engine getEngine() {
    return engine;
  }
  public void setEngine(Engine engine) {
    System.out.println("Truck.setEngine()");
    this.engine = engine;
  }
  public boolean isAuto() {
    return auto;
  }
  public void setAuto(boolean auto) {
    System.out.println("Truck.setAuto()");
    this.auto = auto;
  }
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createdDate) {
    System.out.println("Truck.setCreatedDate()");
    this.createdDate = createdDate;
  }
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    System.out.println("Truck.setModel()");
    this.model = model;
  }
  public String getMaker() {
    return maker;
  }
  public void setMaker(String maker) {
    System.out.println("Truck.setMaker()");
    this.maker = maker;
  }
  public int getCc() {
    return cc;
  }
  public void setCc(int cc) {
    System.out.println("Truck.setCc()");
    this.cc = cc;
  }


}
