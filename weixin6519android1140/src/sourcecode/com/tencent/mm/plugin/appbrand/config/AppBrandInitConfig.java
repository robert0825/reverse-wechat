package com.tencent.mm.plugin.appbrand.config;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import org.json.JSONException;
import org.json.JSONObject;

public final class AppBrandInitConfig
  implements Parcelable
{
  public static final Parcelable.Creator<AppBrandInitConfig> CREATOR;
  public String appId;
  public String eEs;
  public String gqY;
  public String gqZ;
  public int hKs;
  public boolean hQA;
  public final AppBrandLaunchReferrer hQB;
  public boolean hQw;
  public boolean hQx;
  public String hQy;
  public boolean hQz;
  public String hzG;
  public String iconUrl;
  public long startTime;
  public transient String username;
  
  static
  {
    GMTrace.i(10585483771904L, 78868);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(10585483771904L, 78868);
  }
  
  AppBrandInitConfig()
  {
    GMTrace.i(10584812683264L, 78863);
    this.hQB = new AppBrandLaunchReferrer();
    GMTrace.o(10584812683264L, 78863);
  }
  
  public AppBrandInitConfig(Parcel paramParcel)
  {
    GMTrace.i(10585215336448L, 78866);
    this.hQB = new AppBrandLaunchReferrer();
    this.appId = paramParcel.readString();
    this.eEs = paramParcel.readString();
    this.iconUrl = paramParcel.readString();
    this.hKs = paramParcel.readInt();
    if (paramParcel.readByte() != 0)
    {
      bool1 = true;
      this.hQw = bool1;
      if (paramParcel.readByte() == 0) {
        break label175;
      }
      bool1 = true;
      label80:
      this.hQx = bool1;
      this.hQy = paramParcel.readString();
      this.gqY = paramParcel.readString();
      this.gqZ = paramParcel.readString();
      if (paramParcel.readByte() == 0) {
        break label180;
      }
      bool1 = true;
      label118:
      this.hQz = bool1;
      this.startTime = paramParcel.readLong();
      this.hQB.g(paramParcel);
      this.hzG = paramParcel.readString();
      if (paramParcel.readByte() == 0) {
        break label185;
      }
    }
    label175:
    label180:
    label185:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.hQA = bool1;
      GMTrace.o(10585215336448L, 78866);
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label80;
      bool1 = false;
      break label118;
    }
  }
  
  public final void Uv()
  {
    GMTrace.i(20753281974272L, 154624);
    this.hzG = ("SessionId@" + hashCode() + "#" + bg.Pv());
    GMTrace.o(20753281974272L, 154624);
  }
  
  public final JSONObject Uw()
  {
    GMTrace.i(18346087022592L, 136689);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("shareKey", this.gqZ);
      localJSONObject.put("shareName", this.gqY);
      if (localJSONObject.length() == 0)
      {
        GMTrace.o(18346087022592L, 136689);
        return null;
      }
    }
    catch (JSONException localJSONException)
    {
      GMTrace.o(18346087022592L, 136689);
      return null;
    }
    GMTrace.o(18346087022592L, 136689);
    return localJSONException;
  }
  
  public final int describeContents()
  {
    GMTrace.i(10584946900992L, 78864);
    GMTrace.o(10584946900992L, 78864);
    return 0;
  }
  
  public final String toString()
  {
    GMTrace.i(20753416192000L, 154625);
    String str = "AppBrandInitConfig{visitingSessionId='" + this.hzG + '\'' + ", username='" + this.username + '\'' + ", appId='" + this.appId + '\'' + ", brandName='" + this.eEs + '\'' + ", debugType=" + this.hKs + ", isPluginApp=" + this.hQw + ", preferRunInTools=" + this.hQx + ", enterPath='" + this.hQy + '\'' + ", shareName='" + this.gqY + '\'' + ", shareKey='" + this.gqZ + '\'' + ", isStick=" + this.hQz + ", startTime=" + this.startTime + ", attrsFromCgi=" + this.hQA + ", referrer=" + this.hQB + '}';
    GMTrace.o(20753416192000L, 154625);
    return str;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    GMTrace.i(10585081118720L, 78865);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.eEs);
    paramParcel.writeString(this.iconUrl);
    paramParcel.writeInt(this.hKs);
    byte b;
    if (this.hQw)
    {
      b = 1;
      paramParcel.writeByte(b);
      if (!this.hQx) {
        break label164;
      }
      b = 1;
      label66:
      paramParcel.writeByte(b);
      paramParcel.writeString(this.hQy);
      paramParcel.writeString(this.gqY);
      paramParcel.writeString(this.gqZ);
      if (!this.hQz) {
        break label169;
      }
      b = 1;
      label104:
      paramParcel.writeByte(b);
      paramParcel.writeLong(this.startTime);
      this.hQB.writeToParcel(paramParcel, paramInt);
      paramParcel.writeString(this.hzG);
      if (!this.hQA) {
        break label174;
      }
    }
    label164:
    label169:
    label174:
    for (paramInt = i;; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      GMTrace.o(10585081118720L, 78865);
      return;
      b = 0;
      break;
      b = 0;
      break label66;
      b = 0;
      break label104;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\config\AppBrandInitConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */