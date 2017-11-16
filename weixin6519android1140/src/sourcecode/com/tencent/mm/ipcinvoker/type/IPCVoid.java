package com.tencent.mm.ipcinvoker.type;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public class IPCVoid
  implements Parcelable
{
  public static final Parcelable.Creator<IPCVoid> CREATOR;
  public static final IPCVoid fVT;
  
  static
  {
    GMTrace.i(18707535364096L, 139382);
    fVT = new IPCVoid();
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(18707535364096L, 139382);
  }
  
  public IPCVoid()
  {
    GMTrace.i(18707132710912L, 139379);
    GMTrace.o(18707132710912L, 139379);
  }
  
  public int describeContents()
  {
    GMTrace.i(18707266928640L, 139380);
    GMTrace.o(18707266928640L, 139380);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(18707401146368L, 139381);
    GMTrace.o(18707401146368L, 139381);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ipcinvoker\type\IPCVoid.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */