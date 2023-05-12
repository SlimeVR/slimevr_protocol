// automatically generated by the FlatBuffers compiler, do not modify

package solarxr_protocol.rpc;

@SuppressWarnings("unused")
public final class RpcMessage {
  private RpcMessage() { }
  public static final byte NONE = 0;
  public static final byte HeartbeatRequest = 1;
  public static final byte HeartbeatResponse = 2;
  public static final byte ResetRequest = 3;
  public static final byte ResetResponse = 4;
  public static final byte AssignTrackerRequest = 5;
  public static final byte SettingsRequest = 6;
  public static final byte SettingsResponse = 7;
  public static final byte ChangeSettingsRequest = 8;
  public static final byte ClearDriftCompensationRequest = 9;
  public static final byte RecordBVHRequest = 10;
  public static final byte RecordBVHStatus = 11;
  public static final byte SkeletonConfigRequest = 12;
  public static final byte ChangeSkeletonConfigRequest = 13;
  public static final byte SkeletonResetAllRequest = 14;
  public static final byte SkeletonConfigResponse = 15;
  public static final byte OpenSerialRequest = 16;
  public static final byte CloseSerialRequest = 17;
  public static final byte SetWifiRequest = 18;
  public static final byte SerialUpdateResponse = 19;
  public static final byte AutoBoneProcessRequest = 20;
  public static final byte AutoBoneProcessStatusResponse = 21;
  public static final byte AutoBoneEpochResponse = 22;
  public static final byte OverlayDisplayModeRequest = 23;
  public static final byte OverlayDisplayModeChangeRequest = 24;
  public static final byte OverlayDisplayModeResponse = 25;
  public static final byte SerialTrackerRebootRequest = 26;
  public static final byte SerialTrackerGetInfoRequest = 27;
  public static final byte SerialTrackerFactoryResetRequest = 28;
  public static final byte SerialDevicesRequest = 29;
  public static final byte SerialDevicesResponse = 30;
  public static final byte NewSerialDeviceResponse = 31;
  public static final byte StartWifiProvisioningRequest = 32;
  public static final byte StopWifiProvisioningRequest = 33;
  public static final byte WifiProvisioningStatusResponse = 34;
  public static final byte ServerInfosRequest = 35;
  public static final byte ServerInfosResponse = 36;
  public static final byte LegTweaksTmpChange = 37;
  public static final byte LegTweaksTmpClear = 38;
  public static final byte TapDetectionSetupNotification = 39;

  public static final String[] names = { "NONE", "HeartbeatRequest", "HeartbeatResponse", "ResetRequest", "ResetResponse", "AssignTrackerRequest", "SettingsRequest", "SettingsResponse", "ChangeSettingsRequest", "ClearDriftCompensationRequest", "RecordBVHRequest", "RecordBVHStatus", "SkeletonConfigRequest", "ChangeSkeletonConfigRequest", "SkeletonResetAllRequest", "SkeletonConfigResponse", "OpenSerialRequest", "CloseSerialRequest", "SetWifiRequest", "SerialUpdateResponse", "AutoBoneProcessRequest", "AutoBoneProcessStatusResponse", "AutoBoneEpochResponse", "OverlayDisplayModeRequest", "OverlayDisplayModeChangeRequest", "OverlayDisplayModeResponse", "SerialTrackerRebootRequest", "SerialTrackerGetInfoRequest", "SerialTrackerFactoryResetRequest", "SerialDevicesRequest", "SerialDevicesResponse", "NewSerialDeviceResponse", "StartWifiProvisioningRequest", "StopWifiProvisioningRequest", "WifiProvisioningStatusResponse", "ServerInfosRequest", "ServerInfosResponse", "LegTweaksTmpChange", "LegTweaksTmpClear", "TapDetectionSetupNotification", };

  public static String name(int e) { return names[e]; }
}

