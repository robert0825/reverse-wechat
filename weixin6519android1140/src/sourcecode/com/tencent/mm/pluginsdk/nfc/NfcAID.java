package com.tencent.mm.pluginsdk.nfc;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public class NfcAID
  implements Parcelable
{
  public static final Parcelable.Creator<NfcAID> CREATOR;
  public String mURL;
  public String tpi;
  
  static
  {
    GMTrace.i(1237755887616L, 9222);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(1237755887616L, 9222);
  }
  
  public NfcAID(Parcel paramParcel)
  {
    GMTrace.i(1237487452160L, 9220);
    this.tpi = null;
    this.mURL = null;
    this.tpi = paramParcel.readString();
    this.mURL = paramParcel.readString();
    GMTrace.o(1237487452160L, 9220);
  }
  
  public int describeContents()
  {
    GMTrace.i(1237353234432L, 9219);
    GMTrace.o(1237353234432L, 9219);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(1237621669888L, 9221);
    paramParcel.writeString(this.tpi);
    paramParcel.writeString(this.mURL);
    GMTrace.o(1237621669888L, 9221);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\pluginsdk\nfc\NfcAID.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */