package com.tencent.mm.ipcinvoker.type;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public class IPCInteger
  implements Parcelable
{
  public static final Parcelable.Creator<IPCInteger> CREATOR;
  public int value;
  
  static
  {
    GMTrace.i(18708340670464L, 139388);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(18708340670464L, 139388);
  }
  
  public IPCInteger()
  {
    GMTrace.i(18707669581824L, 139383);
    GMTrace.o(18707669581824L, 139383);
  }
  
  public IPCInteger(int paramInt)
  {
    GMTrace.i(20278822305792L, 151089);
    this.value = paramInt;
    GMTrace.o(20278822305792L, 151089);
  }
  
  public int describeContents()
  {
    GMTrace.i(18707803799552L, 139384);
    GMTrace.o(18707803799552L, 139384);
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    GMTrace.i(18708206452736L, 139387);
    if (paramObject == this)
    {
      GMTrace.o(18708206452736L, 139387);
      return true;
    }
    if ((paramObject instanceof IPCInteger))
    {
      paramObject = (IPCInteger)paramObject;
      if (this.value == ((IPCInteger)paramObject).value)
      {
        GMTrace.o(18708206452736L, 139387);
        return true;
      }
      GMTrace.o(18708206452736L, 139387);
      return false;
    }
    if ((paramObject instanceof Integer))
    {
      boolean bool = paramObject.equals(Integer.valueOf(this.value));
      GMTrace.o(18708206452736L, 139387);
      return bool;
    }
    GMTrace.o(18708206452736L, 139387);
    return false;
  }
  
  public String toString()
  {
    GMTrace.i(18708072235008L, 139386);
    String str = Integer.toString(this.value);
    GMTrace.o(18708072235008L, 139386);
    return str;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(18707938017280L, 139385);
    paramParcel.writeInt(this.value);
    GMTrace.o(18707938017280L, 139385);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ipcinvoker\type\IPCInteger.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */