package com.tencent.mm.plugin.appbrand.appcache;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public final class WxaPkgItemInfo
  implements Parcelable
{
  public static final Parcelable.Creator<WxaPkgItemInfo> CREATOR;
  public final String eYU;
  public final String euR;
  public final int hJT;
  public final int hJU;
  
  static
  {
    GMTrace.i(10619575074816L, 79122);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(10619575074816L, 79122);
  }
  
  public WxaPkgItemInfo(Parcel paramParcel)
  {
    GMTrace.i(10619306639360L, 79120);
    this.euR = paramParcel.readString();
    this.eYU = paramParcel.readString();
    this.hJT = paramParcel.readInt();
    this.hJU = paramParcel.readInt();
    GMTrace.o(10619306639360L, 79120);
  }
  
  WxaPkgItemInfo(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(10618903986176L, 79117);
    this.euR = paramString;
    this.eYU = null;
    this.hJT = paramInt1;
    this.hJU = paramInt2;
    GMTrace.o(10618903986176L, 79117);
  }
  
  public final int describeContents()
  {
    GMTrace.i(10619038203904L, 79118);
    GMTrace.o(10619038203904L, 79118);
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(10619172421632L, 79119);
    paramParcel.writeString(this.euR);
    paramParcel.writeString(this.eYU);
    paramParcel.writeInt(this.hJT);
    paramParcel.writeInt(this.hJU);
    GMTrace.o(10619172421632L, 79119);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\appcache\WxaPkgItemInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */