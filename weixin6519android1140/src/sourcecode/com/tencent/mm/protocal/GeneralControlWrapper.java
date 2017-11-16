package com.tencent.mm.protocal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.vk;
import com.tencent.mm.sdk.platformtools.w;

public class GeneralControlWrapper
  implements Parcelable
{
  public static final Parcelable.Creator<GeneralControlWrapper> CREATOR;
  public static final GeneralControlWrapper tJM;
  public static final GeneralControlWrapper tJN;
  public int tJO;
  
  static
  {
    GMTrace.i(4081829543936L, 30412);
    tJM = new GeneralControlWrapper(10);
    tJN = new GeneralControlWrapper(1);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(4081829543936L, 30412);
  }
  
  public GeneralControlWrapper(int paramInt)
  {
    GMTrace.i(4080621584384L, 30403);
    this.tJO = paramInt;
    w.d("MicroMsg.GeneralControlWrapper", "edw <init>, " + this);
    GMTrace.o(4080621584384L, 30403);
  }
  
  public GeneralControlWrapper(Parcel paramParcel)
  {
    GMTrace.i(4081561108480L, 30410);
    this.tJO = paramParcel.readInt();
    GMTrace.o(4081561108480L, 30410);
  }
  
  public GeneralControlWrapper(vk paramvk)
  {
    GMTrace.i(4080487366656L, 30402);
    this.tJO = paramvk.unG;
    w.d("MicroMsg.GeneralControlWrapper", "edw <init>, " + this);
    GMTrace.o(4080487366656L, 30402);
  }
  
  public final boolean bOc()
  {
    GMTrace.i(17828409245696L, 132832);
    if ((this.tJO & 0x2000) != 0) {}
    for (boolean bool = true;; bool = false)
    {
      w.d("MicroMsg.GeneralControlWrapper", "allowOuterOpenUrl, ret = " + bool);
      GMTrace.o(17828409245696L, 132832);
      return bool;
    }
  }
  
  public final boolean bOd()
  {
    GMTrace.i(4080755802112L, 30404);
    if ((this.tJO & 0x2) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      w.d("MicroMsg.GeneralControlWrapper", "allowInnerOpenUrl, ret = " + bool);
      GMTrace.o(4080755802112L, 30404);
      return bool;
    }
  }
  
  public final boolean bOe()
  {
    GMTrace.i(4080890019840L, 30405);
    if ((this.tJO & 0x40) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      w.d("MicroMsg.GeneralControlWrapper", "allowScanQRCode, ret = " + bool);
      GMTrace.o(4080890019840L, 30405);
      return bool;
    }
  }
  
  public final boolean bOf()
  {
    GMTrace.i(4081024237568L, 30406);
    if ((this.tJO & 0x800) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      w.d("MicroMsg.GeneralControlWrapper", "allowReportPageEvent, ret = " + bool);
      GMTrace.o(4081024237568L, 30406);
      return bool;
    }
  }
  
  public final boolean bOg()
  {
    GMTrace.i(20279761829888L, 151096);
    if ((this.tJO & 0x4000) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      w.d("MicroMsg.GeneralControlWrapper", "allowReportPageEvent, ret = " + bool);
      GMTrace.o(20279761829888L, 151096);
      return bool;
    }
  }
  
  public final boolean bOh()
  {
    GMTrace.i(20279896047616L, 151097);
    if ((this.tJO & 0x8000) > 0) {}
    for (boolean bool = true;; bool = false)
    {
      w.d("MicroMsg.GeneralControlWrapper", "allowFavImage, ret = " + bool);
      GMTrace.o(20279896047616L, 151097);
      return bool;
    }
  }
  
  public int describeContents()
  {
    GMTrace.i(4081292673024L, 30408);
    GMTrace.o(4081292673024L, 30408);
    return 0;
  }
  
  public String toString()
  {
    GMTrace.i(4081158455296L, 30407);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("[bitset=0x");
    ((StringBuilder)localObject).append(Integer.toHexString(this.tJO));
    ((StringBuilder)localObject).append("]");
    localObject = ((StringBuilder)localObject).toString();
    GMTrace.o(4081158455296L, 30407);
    return (String)localObject;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(4081426890752L, 30409);
    paramParcel.writeInt(this.tJO);
    GMTrace.o(4081426890752L, 30409);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\GeneralControlWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */