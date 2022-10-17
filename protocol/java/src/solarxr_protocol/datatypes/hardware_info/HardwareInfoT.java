// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.datatypes.hardware_info;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

public class HardwareInfoT {
  private int mcuId;
  private String displayName;
  private String model;
  private String manufacturer;
  private String hardwareRevision;
  private String firmwareVersion;
  private solarxr_protocol.datatypes.hardware_info.HardwareAddressT hardwareAddress;
  private solarxr_protocol.datatypes.IPAddressT ipAddress;

  public int getMcuId() { return mcuId; }

  public void setMcuId(int mcuId) { this.mcuId = mcuId; }

  public String getDisplayName() { return displayName; }

  public void setDisplayName(String displayName) { this.displayName = displayName; }

  public String getModel() { return model; }

  public void setModel(String model) { this.model = model; }

  public String getManufacturer() { return manufacturer; }

  public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }

  public String getHardwareRevision() { return hardwareRevision; }

  public void setHardwareRevision(String hardwareRevision) { this.hardwareRevision = hardwareRevision; }

  public String getFirmwareVersion() { return firmwareVersion; }

  public void setFirmwareVersion(String firmwareVersion) { this.firmwareVersion = firmwareVersion; }

  public solarxr_protocol.datatypes.hardware_info.HardwareAddressT getHardwareAddress() { return hardwareAddress; }

  public void setHardwareAddress(solarxr_protocol.datatypes.hardware_info.HardwareAddressT hardwareAddress) { this.hardwareAddress = hardwareAddress; }

  public solarxr_protocol.datatypes.IPAddressT getIpAddress() { return ipAddress; }

  public void setIpAddress(solarxr_protocol.datatypes.IPAddressT ipAddress) { this.ipAddress = ipAddress; }


  public HardwareInfoT() {
    this.mcuId = 0;
    this.displayName = null;
    this.model = null;
    this.manufacturer = null;
    this.hardwareRevision = null;
    this.firmwareVersion = null;
    this.hardwareAddress = new solarxr_protocol.datatypes.hardware_info.HardwareAddressT();
    this.ipAddress = new solarxr_protocol.datatypes.IPAddressT();
  }
}

