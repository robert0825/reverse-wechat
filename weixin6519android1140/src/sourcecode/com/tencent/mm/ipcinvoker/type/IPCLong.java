package com.tencent.mm.ipcinvoker.type;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public class IPCLong
  implements Parcelable
{
  public static final Parcelable.Creator<IPCLong> CREATOR;
  public long value;
  
  static
  {
    GMTrace.i(18709951283200L, 139400);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(18709951283200L, 139400);
  }
  
  public IPCLong()
  {
    GMTrace.i(18709280194560L, 139395);
    GMTrace.o(18709280194560L, 139395);
  }
  
  public int describeContents()
  {
    GMTrace.i(18709414412288L, 139396);
    GMTrace.o(18709414412288L, 139396);
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    GMTrace.i(18709817065472L, 139399);
    if (paramObject == this)
    {
      GMTrace.o(18709817065472L, 139399);
      return true;
    }
    if ((paramObject instanceof IPCLong))
    {
      paramObject = (IPCLong)paramObject;
      if (this.value == ((IPCLong)paramObject).value)
      {
        GMTrace.o(18709817065472L, 139399);
        return true;
      }
      GMTrace.o(18709817065472L, 139399);
      return false;
    }
    if ((paramObject instanceof Long))
    {
      boolean bool = paramObject.equals(Long.valueOf(this.value));
      GMTrace.o(18709817065472L, 139399);
      return bool;
    }
    GMTrace.o(18709817065472L, 139399);
    return false;
  }
  
  public String toString()
  {
    GMTrace.i(18709682847744L, 139398);
    String str = Long.toString(this.value);
    GMTrace.o(18709682847744L, 139398);
    return str;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(18709548630016L, 139397);
    paramParcel.writeLong(this.value);
    GMTrace.o(18709548630016L, 139397);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ipcinvoker\type\IPCLong.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */