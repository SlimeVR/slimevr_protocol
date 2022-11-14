// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.device.pairing;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

public class PairingInfoT {
  private long pairedTo;
  private String displayName;
  private String model;
  private String manufacturer;
  private String firmwareVersion;
  private int mcuType;
  private solarxr_protocol.device.pairing.DeviceFeatureInfoT features;
  private solarxr_protocol.device.pairing.DeviceSensorInfoT[] sensors;

  public long getPairedTo() { return pairedTo; }

  public void setPairedTo(long pairedTo) { this.pairedTo = pairedTo; }

  public String getDisplayName() { return displayName; }

  public void setDisplayName(String displayName) { this.displayName = displayName; }

  public String getModel() { return model; }

  public void setModel(String model) { this.model = model; }

  public String getManufacturer() { return manufacturer; }

  public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }

  public String getFirmwareVersion() { return firmwareVersion; }

  public void setFirmwareVersion(String firmwareVersion) { this.firmwareVersion = firmwareVersion; }

  public int getMcuType() { return mcuType; }

  public void setMcuType(int mcuType) { this.mcuType = mcuType; }

  public solarxr_protocol.device.pairing.DeviceFeatureInfoT getFeatures() { return features; }

  public void setFeatures(solarxr_protocol.device.pairing.DeviceFeatureInfoT features) { this.features = features; }

  public solarxr_protocol.device.pairing.DeviceSensorInfoT[] getSensors() { return sensors; }

  public void setSensors(solarxr_protocol.device.pairing.DeviceSensorInfoT[] sensors) { this.sensors = sensors; }


  public PairingInfoT() {
    this.pairedTo = 0L;
    this.displayName = null;
    this.model = null;
    this.manufacturer = null;
    this.firmwareVersion = null;
    this.mcuType = 0;
    this.features = null;
    this.sensors = null;
  }
}

