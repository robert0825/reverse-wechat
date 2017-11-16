package com.tencent.mm.plugin.appbrand.launching;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.ipc.d;

public final class LaunchBroadCast
  implements Parcelable
{
  public static final Parcelable.Creator<LaunchBroadCast> CREATOR;
  public String appId;
  public boolean eWM;
  public int hZb;
  public int iqd;
  public String username;
  
  static
  {
    GMTrace.i(15438259945472L, 115024);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(15438259945472L, 115024);
  }
  
  private LaunchBroadCast()
  {
    GMTrace.i(15437857292288L, 115021);
    GMTrace.o(15437857292288L, 115021);
  }
  
  public LaunchBroadCast(Parcel paramParcel)
  {
    GMTrace.i(15437991510016L, 115022);
    this.username = paramParcel.readString();
    this.appId = paramParcel.readString();
    this.hZb = paramParcel.readInt();
    this.iqd = paramParcel.readInt();
    if (paramParcel.readByte() != 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.eWM = bool;
      GMTrace.o(15437991510016L, 115022);
      return;
    }
  }
  
  static void a(String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    GMTrace.i(15437454639104L, 115018);
    LaunchBroadCast localLaunchBroadCast = new LaunchBroadCast();
    localLaunchBroadCast.username = null;
    localLaunchBroadCast.appId = paramString;
    localLaunchBroadCast.hZb = paramInt1;
    localLaunchBroadCast.iqd = paramInt2;
    localLaunchBroadCast.eWM = paramBoolean;
    d.a(localLaunchBroadCast);
    GMTrace.o(15437454639104L, 115018);
  }
  
  public final int describeContents()
  {
    GMTrace.i(15437588856832L, 115019);
    GMTrace.o(15437588856832L, 115019);
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(15437723074560L, 115020);
    paramParcel.writeString(this.username);
    paramParcel.writeString(this.appId);
    paramParcel.writeInt(this.hZb);
    paramParcel.writeInt(this.iqd);
    if (this.eWM) {}
    for (byte b = 1;; b = 0)
    {
      paramParcel.writeByte(b);
      GMTrace.o(15437723074560L, 115020);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\launching\LaunchBroadCast.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */