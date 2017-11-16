package com.tencent.mm.ipcinvoker.type;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public class IPCString
  implements Parcelable
{
  public static final Parcelable.Creator<IPCString> CREATOR;
  public String value;
  
  static
  {
    GMTrace.i(18706998493184L, 139378);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(18706998493184L, 139378);
  }
  
  public IPCString()
  {
    GMTrace.i(18706193186816L, 139372);
    GMTrace.o(18706193186816L, 139372);
  }
  
  public IPCString(String paramString)
  {
    GMTrace.i(18706327404544L, 139373);
    this.value = paramString;
    GMTrace.o(18706327404544L, 139373);
  }
  
  public int describeContents()
  {
    GMTrace.i(18706461622272L, 139374);
    GMTrace.o(18706461622272L, 139374);
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    GMTrace.i(18706864275456L, 139377);
    if (paramObject == this)
    {
      GMTrace.o(18706864275456L, 139377);
      return true;
    }
    if ((paramObject instanceof IPCString))
    {
      paramObject = (IPCString)paramObject;
      if ((this.value == ((IPCString)paramObject).value) || ((this.value != null) && (this.value.equals(((IPCString)paramObject).value))))
      {
        GMTrace.o(18706864275456L, 139377);
        return true;
      }
      GMTrace.o(18706864275456L, 139377);
      return false;
    }
    if ((paramObject instanceof String))
    {
      boolean bool = paramObject.equals(this.value);
      GMTrace.o(18706864275456L, 139377);
      return bool;
    }
    GMTrace.o(18706864275456L, 139377);
    return false;
  }
  
  public String toString()
  {
    GMTrace.i(18706730057728L, 139376);
    String str = this.value;
    GMTrace.o(18706730057728L, 139376);
    return str;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(18706595840000L, 139375);
    paramParcel.writeString(this.value);
    GMTrace.o(18706595840000L, 139375);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ipcinvoker\type\IPCString.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */