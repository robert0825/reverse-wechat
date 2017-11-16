package com.tencent.mm.ipcinvoker.type;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public class IPCBoolean
  implements Parcelable
{
  public static final Parcelable.Creator<IPCBoolean> CREATOR;
  public boolean value;
  
  static
  {
    GMTrace.i(18702435090432L, 139344);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(18702435090432L, 139344);
  }
  
  public IPCBoolean()
  {
    GMTrace.i(18701629784064L, 139338);
    GMTrace.o(18701629784064L, 139338);
  }
  
  public IPCBoolean(boolean paramBoolean)
  {
    GMTrace.i(18701764001792L, 139339);
    this.value = paramBoolean;
    GMTrace.o(18701764001792L, 139339);
  }
  
  public int describeContents()
  {
    GMTrace.i(18701898219520L, 139340);
    GMTrace.o(18701898219520L, 139340);
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    GMTrace.i(18702300872704L, 139343);
    if (paramObject == this)
    {
      GMTrace.o(18702300872704L, 139343);
      return true;
    }
    if ((paramObject instanceof IPCBoolean))
    {
      paramObject = (IPCBoolean)paramObject;
      if (this.value == ((IPCBoolean)paramObject).value)
      {
        GMTrace.o(18702300872704L, 139343);
        return true;
      }
      GMTrace.o(18702300872704L, 139343);
      return false;
    }
    if ((paramObject instanceof Boolean))
    {
      boolean bool = paramObject.equals(Boolean.valueOf(this.value));
      GMTrace.o(18702300872704L, 139343);
      return bool;
    }
    GMTrace.o(18702300872704L, 139343);
    return false;
  }
  
  public String toString()
  {
    GMTrace.i(18702166654976L, 139342);
    String str = Boolean.toString(this.value);
    GMTrace.o(18702166654976L, 139342);
    return str;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(18702032437248L, 139341);
    if (this.value) {}
    for (paramInt = 1;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      GMTrace.o(18702032437248L, 139341);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ipcinvoker\type\IPCBoolean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */