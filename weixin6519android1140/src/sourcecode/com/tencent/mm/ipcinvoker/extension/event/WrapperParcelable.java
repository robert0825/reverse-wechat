package com.tencent.mm.ipcinvoker.extension.event;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ipcinvoker.extension.a;
import com.tencent.mm.ipcinvoker.extension.c;

class WrapperParcelable
  implements Parcelable
{
  public static final Parcelable.Creator<WrapperParcelable> CREATOR;
  Object fVM;
  
  static
  {
    GMTrace.i(18717333258240L, 139455);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(18717333258240L, 139455);
  }
  
  public WrapperParcelable()
  {
    GMTrace.i(18716930605056L, 139452);
    GMTrace.o(18716930605056L, 139452);
  }
  
  public int describeContents()
  {
    GMTrace.i(18717064822784L, 139453);
    GMTrace.o(18717064822784L, 139453);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(18717199040512L, 139454);
    if (this.fVM != null)
    {
      a locala = c.ao(this.fVM);
      if (locala != null)
      {
        paramParcel.writeInt(1);
        paramParcel.writeString(locala.getClass().getName());
        locala.a(this.fVM, paramParcel);
        GMTrace.o(18717199040512L, 139454);
        return;
      }
    }
    paramParcel.writeInt(1);
    GMTrace.o(18717199040512L, 139454);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ipcinvoker\extension\event\WrapperParcelable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */