package com.tencent.mm.ipcinvoker.type;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public class IPCFloat
  implements Parcelable
{
  public static final Parcelable.Creator<IPCFloat> CREATOR;
  public float value;
  
  static
  {
    GMTrace.i(18706058969088L, 139371);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(18706058969088L, 139371);
  }
  
  public IPCFloat()
  {
    GMTrace.i(18705387880448L, 139366);
    GMTrace.o(18705387880448L, 139366);
  }
  
  public int describeContents()
  {
    GMTrace.i(18705522098176L, 139367);
    GMTrace.o(18705522098176L, 139367);
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    GMTrace.i(18705924751360L, 139370);
    if (paramObject == this)
    {
      GMTrace.o(18705924751360L, 139370);
      return true;
    }
    if ((paramObject instanceof IPCFloat))
    {
      paramObject = (IPCFloat)paramObject;
      if (this.value == ((IPCFloat)paramObject).value)
      {
        GMTrace.o(18705924751360L, 139370);
        return true;
      }
      GMTrace.o(18705924751360L, 139370);
      return false;
    }
    if ((paramObject instanceof Float))
    {
      boolean bool = paramObject.equals(Float.valueOf(this.value));
      GMTrace.o(18705924751360L, 139370);
      return bool;
    }
    GMTrace.o(18705924751360L, 139370);
    return false;
  }
  
  public String toString()
  {
    GMTrace.i(18705790533632L, 139369);
    String str = Float.toString(this.value);
    GMTrace.o(18705790533632L, 139369);
    return str;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(18705656315904L, 139368);
    paramParcel.writeFloat(this.value);
    GMTrace.o(18705656315904L, 139368);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\ipcinvoker\type\IPCFloat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */