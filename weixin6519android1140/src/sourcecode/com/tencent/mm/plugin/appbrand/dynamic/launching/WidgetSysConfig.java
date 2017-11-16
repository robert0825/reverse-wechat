package com.tencent.mm.plugin.appbrand.dynamic.launching;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public class WidgetSysConfig
  implements Parcelable
{
  public static final Parcelable.Creator<WidgetSysConfig> CREATOR;
  public int hQj;
  public int hQk;
  public int hQl;
  
  static
  {
    GMTrace.i(18298037075968L, 136331);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(18298037075968L, 136331);
  }
  
  public WidgetSysConfig()
  {
    GMTrace.i(18297634422784L, 136328);
    GMTrace.o(18297634422784L, 136328);
  }
  
  public int describeContents()
  {
    GMTrace.i(18297768640512L, 136329);
    GMTrace.o(18297768640512L, 136329);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(18297902858240L, 136330);
    paramParcel.writeInt(this.hQj);
    paramParcel.writeInt(this.hQk);
    paramParcel.writeInt(this.hQl);
    GMTrace.o(18297902858240L, 136330);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\launching\WidgetSysConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */