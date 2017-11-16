package com.tencent.mm.ipcinvoker.type;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public class IPCDouble
  implements Parcelable
{
  public static final Parcelable.Creator<IPCDouble> CREATOR;
  public double value;
  
  static
  {
    GMTrace.i(18709145976832L, 139394);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(18709145976832L, 139394);
  }
  
  public IPCDouble()
  {
    GMTrace.i(18708474888192L, 139389);
    GMTrace.o(18708474888192L, 139389);
  }
  
  public int describeContents()
  {
    GMTrace.i(18708609105920L, 139390);
    GMTrace.o(18708609105920L, 139390);
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    GMTrace.i(18709011759104L, 139393);
    if (paramObject == this)
    {
      GMTrace.o(18709011759104L, 139393);
      return true;
    }
    if ((paramObject instanceof IPCDouble))
    {
      paramObject = (IPCDouble)paramObject;
      if (this.value == ((IPCDouble)paramObject).value)
      {
        GMTrace.o(18709011759104L, 139393);
        return true;
      }
      GMTrace.o(18709011759104L, 139393);
      return false;
    }
    if ((paramObject instanceof Double))
    {
      boolean bool = paramObject.equals(Double.valueOf(this.value));
      GMTrace.o(18709011759104L, 139393);
      return bool;
    }
    GMTrace.o(18709011759104L, 139393);
    return false;
  }
  
  public String toString()
  {
    GMTrace.i(18708877541376L, 139392);
    String str = Double.toString(this.value);
    GMTrace.o(18708877541376L, 139392);
    return str;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(18708743323648L, 139391);
    paramParcel.writeDouble(this.value);
    GMTrace.o(18708743323648L, 139391);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ipcinvoker\type\IPCDouble.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */