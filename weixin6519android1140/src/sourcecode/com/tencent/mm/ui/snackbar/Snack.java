package com.tencent.mm.ui.snackbar;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

class Snack
  implements Parcelable
{
  public static final Parcelable.Creator<Snack> CREATOR;
  final String mMessage;
  final Parcelable xeA;
  final short xeB;
  final int xeC;
  final String xey;
  final int xez;
  
  static
  {
    GMTrace.i(2864877404160L, 21345);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(2864877404160L, 21345);
  }
  
  Snack(Parcel paramParcel)
  {
    GMTrace.i(2864474750976L, 21342);
    this.mMessage = paramParcel.readString();
    this.xey = paramParcel.readString();
    this.xez = paramParcel.readInt();
    this.xeA = paramParcel.readParcelable(paramParcel.getClass().getClassLoader());
    this.xeB = ((short)paramParcel.readInt());
    this.xeC = ((Integer)paramParcel.readParcelable(paramParcel.getClass().getClassLoader())).intValue();
    GMTrace.o(2864474750976L, 21342);
  }
  
  Snack(String paramString1, String paramString2, int paramInt1, Parcelable paramParcelable, short paramShort, int paramInt2)
  {
    GMTrace.i(2864340533248L, 21341);
    this.mMessage = paramString1;
    this.xey = paramString2;
    this.xez = paramInt1;
    this.xeA = paramParcelable;
    this.xeB = paramShort;
    this.xeC = paramInt2;
    GMTrace.o(2864340533248L, 21341);
  }
  
  public int describeContents()
  {
    GMTrace.i(2864743186432L, 21344);
    GMTrace.o(2864743186432L, 21344);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(2864608968704L, 21343);
    paramParcel.writeString(this.mMessage);
    paramParcel.writeString(this.xey);
    paramParcel.writeInt(this.xez);
    paramParcel.writeParcelable(this.xeA, 0);
    paramParcel.writeInt(this.xeB);
    paramParcel.writeInt(this.xeC);
    GMTrace.o(2864608968704L, 21343);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\snackbar\Snack.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */