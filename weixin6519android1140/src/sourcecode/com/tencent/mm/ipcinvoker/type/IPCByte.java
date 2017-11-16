package com.tencent.mm.ipcinvoker.type;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public class IPCByte
  implements Parcelable
{
  public static final Parcelable.Creator<IPCByte> CREATOR;
  public byte value;
  
  static
  {
    GMTrace.i(18704045703168L, 139356);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(18704045703168L, 139356);
  }
  
  public IPCByte()
  {
    GMTrace.i(18703374614528L, 139351);
    GMTrace.o(18703374614528L, 139351);
  }
  
  public int describeContents()
  {
    GMTrace.i(18703508832256L, 139352);
    GMTrace.o(18703508832256L, 139352);
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    GMTrace.i(18703911485440L, 139355);
    if (paramObject == this)
    {
      GMTrace.o(18703911485440L, 139355);
      return true;
    }
    if ((paramObject instanceof IPCByte))
    {
      paramObject = (IPCByte)paramObject;
      if (this.value == ((IPCByte)paramObject).value)
      {
        GMTrace.o(18703911485440L, 139355);
        return true;
      }
      GMTrace.o(18703911485440L, 139355);
      return false;
    }
    if ((paramObject instanceof Byte))
    {
      boolean bool = paramObject.equals(Byte.valueOf(this.value));
      GMTrace.o(18703911485440L, 139355);
      return bool;
    }
    GMTrace.o(18703911485440L, 139355);
    return false;
  }
  
  public String toString()
  {
    GMTrace.i(18703777267712L, 139354);
    String str = Integer.toString(this.value);
    GMTrace.o(18703777267712L, 139354);
    return str;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(18703643049984L, 139353);
    paramParcel.writeByte(this.value);
    GMTrace.o(18703643049984L, 139353);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ipcinvoker\type\IPCByte.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */