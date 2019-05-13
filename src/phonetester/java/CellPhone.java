/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phonetester.java;

/**
 *
 * @author anhen3335
 */
public class CellPhone {
  private String carrier, type;
  private double speed, memory;
  private int numApps;

  public String getCarrier() {
    return carrier;
  }
 public String getType() {
    return type;
  } 
 public Double getSpeed() {
    return speed;
  }
 public Double getMemory() {
    return memory;
  }
 public int getnumApps() {
    return numApps;
  }
 public void setCarrier(String NewCarrier) {
    carrier = NewCarrier;
  }
 public void setType(String NewType) {
    type = NewType;
  }
 public void setSpeed(Double NewSpeed) {
    speed = NewSpeed;
  }
 public void setMemory(Double NewMemory) {
    memory = NewMemory;
  }
 public void setnumApps(int NewnumApps) {
    numApps = NewnumApps;
  }
}