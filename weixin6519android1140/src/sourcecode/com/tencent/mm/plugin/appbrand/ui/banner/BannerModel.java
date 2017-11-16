package com.tencent.mm.plugin.appbrand.ui.banner;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;

final class BannerModel
  implements Parcelable
{
  public static final Parcelable.Creator<BannerModel> CREATOR;
  private static volatile BannerModel iDW;
  String appId;
  String appName;
  int hZb;
  String iDV;
  String izx;
  
  static
  {
    GMTrace.i(17319321403392L, 129039);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(17319321403392L, 129039);
  }
  
  BannerModel()
  {
    GMTrace.i(17318784532480L, 129035);
    GMTrace.o(17318784532480L, 129035);
  }
  
  public BannerModel(Parcel paramParcel)
  {
    GMTrace.i(17318918750208L, 129036);
    this.appId = paramParcel.readString();
    this.hZb = paramParcel.readInt();
    this.appName = paramParcel.readString();
    this.izx = paramParcel.readString();
    this.iDV = paramParcel.readString();
    GMTrace.o(17318918750208L, 129036);
  }
  
  static BannerModel abg()
  {
    GMTrace.i(17319052967936L, 129037);
    try
    {
      BannerModel localBannerModel = ((d)h.h(d.class)).aaY();
      iDW = localBannerModel;
      GMTrace.o(17319052967936L, 129037);
      return localBannerModel;
    }
    finally {}
  }
  
  static BannerModel abh()
  {
    GMTrace.i(17319187185664L, 129038);
    try
    {
      BannerModel localBannerModel = iDW;
      GMTrace.o(17319187185664L, 129038);
      return localBannerModel;
    }
    finally {}
  }
  
  public final int describeContents()
  {
    GMTrace.i(17318516097024L, 129033);
    GMTrace.o(17318516097024L, 129033);
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(17318650314752L, 129034);
    paramParcel.writeString(this.appId);
    paramParcel.writeInt(this.hZb);
    paramParcel.writeString(this.appName);
    paramParcel.writeString(this.izx);
    paramParcel.writeString(this.iDV);
    GMTrace.o(17318650314752L, 129034);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\ui\banner\BannerModel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */