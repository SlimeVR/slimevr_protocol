// automatically generated by the FlatBuffers compiler, do not modify

package slimevr_protocol.data_feed.tracker;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

public class TrackerDataMaskT {
  private boolean bodyPart;
  private boolean orientation;
  private boolean position;
  private boolean rawRotVel;
  private boolean rawTransAccel;
  private boolean temp;
  private boolean pollRate;
  private boolean mountingRotation;

  public boolean getBodyPart() { return bodyPart; }

  public void setBodyPart(boolean bodyPart) { this.bodyPart = bodyPart; }

  public boolean getOrientation() { return orientation; }

  public void setOrientation(boolean orientation) { this.orientation = orientation; }

  public boolean getPosition() { return position; }

  public void setPosition(boolean position) { this.position = position; }

  public boolean getRawRotVel() { return rawRotVel; }

  public void setRawRotVel(boolean rawRotVel) { this.rawRotVel = rawRotVel; }

  public boolean getRawTransAccel() { return rawTransAccel; }

  public void setRawTransAccel(boolean rawTransAccel) { this.rawTransAccel = rawTransAccel; }

  public boolean getTemp() { return temp; }

  public void setTemp(boolean temp) { this.temp = temp; }

  public boolean getPollRate() { return pollRate; }

  public void setPollRate(boolean pollRate) { this.pollRate = pollRate; }

  public boolean getMountingRotation() { return mountingRotation; }

  public void setMountingRotation(boolean mountingRotation) { this.mountingRotation = mountingRotation; }


  public TrackerDataMaskT() {
    this.bodyPart = false;
    this.orientation = false;
    this.position = false;
    this.rawRotVel = false;
    this.rawTransAccel = false;
    this.temp = false;
    this.pollRate = false;
    this.mountingRotation = false;
  }
}
