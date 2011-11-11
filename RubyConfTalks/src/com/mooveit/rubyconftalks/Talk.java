package com.mooveit.rubyconftalks;

import java.util.Date;

public class Talk {
  Date start;
  Date end;
  String name;

  public Talk(Date start, Date end, String name) {
    this.start = start;
    this.end = end;
    this.name = name;
  }

  public Date getStart() {
    return start;
  }

  public void setStart(Date start) {
    this.start = start;
  }

  public Date getEnd() {
    return end;
  }

  public void setEnd(Date end) {
    this.end = end;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
