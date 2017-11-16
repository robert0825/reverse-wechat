package com.d.a.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.util.Base64;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class f
{
  private final WifiManager aDQ;
  private final LocationManager aDR;
  final SensorManager aDS;
  final PackageManager aDT;
  PackageInfo aDU;
  String aDV;
  String aDW;
  String aDX;
  private int aDY = 0;
  private int aDZ = 0;
  int aEa = 0;
  int aEb = 0;
  int aEc = 0;
  int aEd = 0;
  private String aEe = "203";
  String imei;
  final Context mContext;
  private String version = "2.0.1";
  String versionName;
  
  public f(Context paramContext)
  {
    this.mContext = paramContext;
    this.aDQ = ((WifiManager)this.mContext.getSystemService("wifi"));
    this.aDR = ((LocationManager)this.mContext.getSystemService("location"));
    this.aDS = ((SensorManager)this.mContext.getSystemService("sensor"));
    this.aDT = this.mContext.getPackageManager();
    this.aDU = new PackageInfo();
    try
    {
      this.aDU = this.aDT.getPackageInfo(this.mContext.getPackageName(), 0);
      return;
    }
    catch (PackageManager.NameNotFoundException paramContext) {}
  }
  
  private static String aJ(String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    return str;
  }
  
  private boolean nH()
  {
    try
    {
      boolean bool = this.aDR.isProviderEnabled("gps");
      return bool;
    }
    catch (Exception localException) {}
    return false;
  }
  
  @SuppressLint({"NewApi"})
  private boolean nI()
  {
    boolean bool1 = false;
    boolean bool2;
    if (this.aDQ != null)
    {
      bool2 = this.aDQ.isWifiEnabled();
      bool1 = bool2;
      if (!bool2) {
        bool1 = bool2;
      }
    }
    try
    {
      if (Build.VERSION.SDK_INT >= 18) {
        bool1 = this.aDQ.isScanAlwaysAvailable();
      }
      return bool1;
    }
    catch (Error localError)
    {
      return bool2;
    }
    catch (Exception localException) {}
    return bool2;
  }
  
  public final String k(byte[] paramArrayOfByte)
  {
    int j = 1;
    HashMap localHashMap = new HashMap();
    localHashMap.put("version", this.version);
    localHashMap.put("app_name", aJ(this.versionName));
    if (this.aDV != null)
    {
      localHashMap.put("app_label", aJ(Base64.encodeToString(this.aDV.getBytes(), 0)));
      if (!nH()) {
        break label301;
      }
      i = 1;
      label76:
      this.aDZ = i;
      if ((this.aDQ == null) || (!this.aDQ.isWifiEnabled())) {
        break label306;
      }
      i = 1;
      label100:
      if ((i | nI()) == 0) {
        break label311;
      }
    }
    label301:
    label306:
    label311:
    for (int i = j;; i = 0)
    {
      this.aDY = i;
      localHashMap.put("chips", Integer.toBinaryString(this.aEd | 0x0 | this.aEc << 1 | this.aEb << 2 | this.aEa << 3 | this.aDZ << 4 | this.aDY << 5));
      localHashMap.put("source", this.aEe);
      localHashMap.put("query", new String(paramArrayOfByte));
      try
      {
        paramArrayOfByte = new JSONObject(localHashMap);
        localHashMap = new HashMap();
        localHashMap.put("model", aJ(Base64.encodeToString(this.aDW.getBytes(), 0)));
        localHashMap.put("version", aJ(this.aDX));
        localHashMap.put("imei", aJ(this.imei));
        paramArrayOfByte = paramArrayOfByte.put("attribute", new JSONObject(localHashMap)).toString();
        return paramArrayOfByte;
      }
      catch (JSONException paramArrayOfByte) {}
      localHashMap.put("app_label", "");
      break;
      i = 0;
      break label76;
      i = 0;
      break label100;
    }
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\d\a\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */