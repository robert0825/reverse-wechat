package com.tencent.mm.ipcinvoker.extension;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public class XParcelableWrapper
  implements Parcelable
{
  public static final Parcelable.Creator<XParcelableWrapper> CREATOR;
  public f fVP;
  
  static
  {
    GMTrace.i(18719614959616L, 139472);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(18719614959616L, 139472);
  }
  
  public XParcelableWrapper()
  {
    GMTrace.i(18719212306432L, 139469);
    GMTrace.o(18719212306432L, 139469);
  }
  
  public int describeContents()
  {
    GMTrace.i(18719346524160L, 139470);
    GMTrace.o(18719346524160L, 139470);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(18719480741888L, 139471);
    if (this.fVP != null)
    {
      paramParcel.writeInt(1);
      paramParcel.writeString(this.fVP.getClass().getName());
      this.fVP.e(paramParcel);
      GMTrace.o(18719480741888L, 139471);
      return;
    }
    paramParcel.writeInt(0);
    GMTrace.o(18719480741888L, 139471);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\ipcinvoker\extension\XParcelableWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */