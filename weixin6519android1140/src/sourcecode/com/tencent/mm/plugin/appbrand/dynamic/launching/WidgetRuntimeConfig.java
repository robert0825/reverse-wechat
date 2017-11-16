package com.tencent.mm.plugin.appbrand.dynamic.launching;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public class WidgetRuntimeConfig
  implements Parcelable
{
  public static final Parcelable.Creator<WidgetRuntimeConfig> CREATOR;
  public String appId;
  public int hUL;
  public boolean hUM;
  public boolean hUN;
  public int hUw;
  
  static
  {
    GMTrace.i(19909052465152L, 148334);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(19909052465152L, 148334);
  }
  
  public WidgetRuntimeConfig()
  {
    GMTrace.i(19908649811968L, 148331);
    this.hUL = 32;
    this.hUM = false;
    this.hUN = true;
    GMTrace.o(19908649811968L, 148331);
  }
  
  public int describeContents()
  {
    GMTrace.i(19908784029696L, 148332);
    GMTrace.o(19908784029696L, 148332);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    GMTrace.i(19908918247424L, 148333);
    paramParcel.writeString(this.appId);
    paramParcel.writeInt(this.hUw);
    paramParcel.writeInt(this.hUL);
    if (this.hUM)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      if (!this.hUN) {
        break label76;
      }
    }
    label76:
    for (paramInt = i;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      GMTrace.o(19908918247424L, 148333);
      return;
      paramInt = 0;
      break;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\dynamic\launching\WidgetRuntimeConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */