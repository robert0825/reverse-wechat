package com.tencent.mm.plugin.appbrand.permission;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public final class AppPermissionUpdateParcel
  implements Parcelable
{
  public static final Parcelable.Creator<AppPermissionUpdateParcel> CREATOR;
  public String appId;
  public byte[] ixH;
  
  static
  {
    GMTrace.i(14433908686848L, 107541);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(14433908686848L, 107541);
  }
  
  public AppPermissionUpdateParcel()
  {
    GMTrace.i(14433506033664L, 107538);
    GMTrace.o(14433506033664L, 107538);
  }
  
  public AppPermissionUpdateParcel(Parcel paramParcel)
  {
    GMTrace.i(14433640251392L, 107539);
    this.appId = paramParcel.readString();
    this.ixH = paramParcel.createByteArray();
    GMTrace.o(14433640251392L, 107539);
  }
  
  public final int describeContents()
  {
    GMTrace.i(14433237598208L, 107536);
    GMTrace.o(14433237598208L, 107536);
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(14433371815936L, 107537);
    paramParcel.writeString(this.appId);
    paramParcel.writeByteArray(this.ixH);
    GMTrace.o(14433371815936L, 107537);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\appbrand\permission\AppPermissionUpdateParcel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */