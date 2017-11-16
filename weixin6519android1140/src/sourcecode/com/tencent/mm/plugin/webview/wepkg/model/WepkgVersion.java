package com.tencent.mm.plugin.webview.wepkg.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.webview.wepkg.a.c;
import org.json.JSONException;
import org.json.JSONObject;

public class WepkgVersion
  implements Parcelable
{
  public static final Parcelable.Creator<WepkgVersion> CREATOR;
  public String appId;
  public String charset;
  public String downloadUrl;
  public String eDW;
  public String eYR;
  public String hKI;
  public long hcs;
  public String rYG;
  public boolean rYW;
  public long rYX;
  public long rYY;
  public int rYZ;
  public int rYt;
  public int rZa;
  public long rZb;
  public boolean rZc;
  public boolean rZd;
  public boolean rZe;
  public int rZf;
  public String version;
  
  static
  {
    GMTrace.i(12383732891648L, 92266);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(12383732891648L, 92266);
  }
  
  public WepkgVersion()
  {
    GMTrace.i(12382927585280L, 92260);
    GMTrace.o(12382927585280L, 92260);
  }
  
  public WepkgVersion(Parcel paramParcel)
  {
    GMTrace.i(12383061803008L, 92261);
    this.rYG = paramParcel.readString();
    this.appId = paramParcel.readString();
    this.version = paramParcel.readString();
    this.hKI = paramParcel.readString();
    if (paramParcel.readByte() != 0)
    {
      bool1 = true;
      this.rYW = bool1;
      this.rYX = paramParcel.readLong();
      this.rYY = paramParcel.readLong();
      this.rYZ = paramParcel.readInt();
      this.eYR = paramParcel.readString();
      this.eDW = paramParcel.readString();
      this.downloadUrl = paramParcel.readString();
      this.rZa = paramParcel.readInt();
      this.rYt = paramParcel.readInt();
      this.rZb = paramParcel.readLong();
      this.hcs = paramParcel.readLong();
      this.charset = paramParcel.readString();
      if (paramParcel.readByte() == 0) {
        break label212;
      }
      bool1 = true;
      label157:
      this.rZc = bool1;
      if (paramParcel.readByte() == 0) {
        break label217;
      }
      bool1 = true;
      label171:
      this.rZd = bool1;
      if (paramParcel.readByte() == 0) {
        break label222;
      }
    }
    label212:
    label217:
    label222:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.rZe = bool1;
      this.rZf = paramParcel.readInt();
      GMTrace.o(12383061803008L, 92261);
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label157;
      bool1 = false;
      break label171;
    }
  }
  
  public final void a(c paramc)
  {
    GMTrace.i(12383196020736L, 92262);
    if (paramc != null)
    {
      this.rYG = paramc.field_pkgId;
      this.appId = paramc.field_appId;
      this.version = paramc.field_version;
      this.hKI = paramc.field_pkgPath;
      this.rYW = paramc.field_disableWvCache;
      this.rYX = paramc.field_clearPkgTime;
      this.rYY = paramc.field_checkIntervalTime;
      this.rYZ = paramc.field_packMethod;
      this.eYR = paramc.field_domain;
      this.eDW = paramc.field_md5;
      this.downloadUrl = paramc.field_downloadUrl;
      this.rZa = paramc.field_pkgSize;
      this.rYt = paramc.field_downloadNetType;
      this.rZb = paramc.field_nextCheckTime;
      this.hcs = paramc.field_createTime;
      this.charset = paramc.field_charset;
      this.rZc = paramc.field_bigPackageReady;
      this.rZd = paramc.field_preloadFilesReady;
      this.rZe = paramc.field_preloadFilesAtomic;
      this.rZf = paramc.field_totalDownloadCount;
    }
    GMTrace.o(12383196020736L, 92262);
  }
  
  public final JSONObject bGo()
  {
    GMTrace.i(12383330238464L, 92263);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("appId", this.appId);
      localJSONObject.put("version", this.version);
      localJSONObject.put("pkgPath", this.hKI);
      localJSONObject.put("disableWvCache", this.rYW);
      localJSONObject.put("clearPkgTime", this.rYX);
      localJSONObject.put("checkIntervalTime", this.rYY);
      localJSONObject.put("packMethod", this.rYZ);
      localJSONObject.put("domain", this.eYR);
      localJSONObject.put("md5", this.eDW);
      localJSONObject.put("downloadUrl", this.downloadUrl);
      localJSONObject.put("pkgSize", this.rZa);
      localJSONObject.put("downloadNetType", this.rYt);
      localJSONObject.put("nextCheckTime", this.rZb);
      localJSONObject.put("charset", this.charset);
      localJSONObject.put("bigPackageReady", this.rZc);
      localJSONObject.put("preloadFilesReady", this.rZd);
      localJSONObject.put("preloadFilesAtomic", this.rZe);
      localJSONObject.put("totalDownloadCount", this.rZf);
      GMTrace.o(12383330238464L, 92263);
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
  }
  
  public int describeContents()
  {
    GMTrace.i(12383464456192L, 92264);
    GMTrace.o(12383464456192L, 92264);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    GMTrace.i(12383598673920L, 92265);
    paramParcel.writeString(this.rYG);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.version);
    paramParcel.writeString(this.hKI);
    if (this.rYW)
    {
      paramInt = 1;
      paramParcel.writeByte((byte)paramInt);
      paramParcel.writeLong(this.rYX);
      paramParcel.writeLong(this.rYY);
      paramParcel.writeInt(this.rYZ);
      paramParcel.writeString(this.eYR);
      paramParcel.writeString(this.eDW);
      paramParcel.writeString(this.downloadUrl);
      paramParcel.writeInt(this.rZa);
      paramParcel.writeInt(this.rYt);
      paramParcel.writeLong(this.rZb);
      paramParcel.writeLong(this.hcs);
      paramParcel.writeString(this.charset);
      if (!this.rZc) {
        break label212;
      }
      paramInt = 1;
      label154:
      paramParcel.writeByte((byte)paramInt);
      if (!this.rZd) {
        break label217;
      }
      paramInt = 1;
      label169:
      paramParcel.writeByte((byte)paramInt);
      if (!this.rZe) {
        break label222;
      }
    }
    label212:
    label217:
    label222:
    for (paramInt = i;; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      paramParcel.writeInt(this.rZf);
      GMTrace.o(12383598673920L, 92265);
      return;
      paramInt = 0;
      break;
      paramInt = 0;
      break label154;
      paramInt = 0;
      break label169;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\wepkg\model\WepkgVersion.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */