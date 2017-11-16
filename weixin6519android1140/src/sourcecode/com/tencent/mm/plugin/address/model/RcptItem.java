package com.tencent.mm.plugin.address.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public class RcptItem
  implements Parcelable
{
  public static final Parcelable.Creator<RcptItem> CREATOR;
  public String code;
  public String hur;
  public boolean hus;
  public String name;
  
  static
  {
    GMTrace.i(12793231179776L, 95317);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(12793231179776L, 95317);
  }
  
  public RcptItem()
  {
    GMTrace.i(12792560091136L, 95312);
    this.name = "";
    this.code = "";
    this.hur = "";
    this.hus = false;
    GMTrace.o(12792560091136L, 95312);
  }
  
  public RcptItem(Parcel paramParcel)
  {
    GMTrace.i(12792962744320L, 95315);
    this.name = "";
    this.code = "";
    this.hur = "";
    this.hus = false;
    this.name = paramParcel.readString();
    this.code = paramParcel.readString();
    this.hur = paramParcel.readString();
    GMTrace.o(12792962744320L, 95315);
  }
  
  public RcptItem(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(12792694308864L, 95313);
    this.name = "";
    this.code = "";
    this.hur = "";
    this.hus = false;
    this.name = paramString1;
    this.code = paramString2;
    this.hur = paramString3;
    GMTrace.o(12792694308864L, 95313);
  }
  
  public int describeContents()
  {
    GMTrace.i(12792828526592L, 95314);
    GMTrace.o(12792828526592L, 95314);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(12793096962048L, 95316);
    paramParcel.writeString(this.name);
    paramParcel.writeString(this.code);
    paramParcel.writeString(this.hur);
    GMTrace.o(12793096962048L, 95316);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\address\model\RcptItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */