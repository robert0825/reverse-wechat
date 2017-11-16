package com.tencent.mm.plugin.remittance.bankcard.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.rp;

public class EnterTimeParcel
  implements Parcelable
{
  public static final Parcelable.Creator<EnterTimeParcel> CREATOR;
  public String gjg;
  public int ojr;
  public String ojs;
  public String ojt;
  public int oju;
  
  static
  {
    GMTrace.i(20950045163520L, 156090);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(20950045163520L, 156090);
  }
  
  public EnterTimeParcel()
  {
    GMTrace.i(20949374074880L, 156085);
    GMTrace.o(20949374074880L, 156085);
  }
  
  public EnterTimeParcel(Parcel paramParcel)
  {
    GMTrace.i(20949642510336L, 156087);
    this.ojr = paramParcel.readInt();
    this.ojs = paramParcel.readString();
    this.ojt = paramParcel.readString();
    this.oju = paramParcel.readInt();
    this.gjg = paramParcel.readString();
    GMTrace.o(20949642510336L, 156087);
  }
  
  public EnterTimeParcel(rp paramrp)
  {
    GMTrace.i(20949508292608L, 156086);
    this.ojr = paramrp.ojr;
    this.ojs = paramrp.ojs;
    this.ojt = paramrp.ojt;
    this.oju = paramrp.oju;
    this.gjg = paramrp.gjg;
    GMTrace.o(20949508292608L, 156086);
  }
  
  public int describeContents()
  {
    GMTrace.i(20949776728064L, 156088);
    GMTrace.o(20949776728064L, 156088);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(20949910945792L, 156089);
    paramParcel.writeInt(this.ojr);
    paramParcel.writeString(this.ojs);
    paramParcel.writeString(this.ojt);
    paramParcel.writeInt(this.oju);
    paramParcel.writeString(this.gjg);
    GMTrace.o(20949910945792L, 156089);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\bankcard\model\EnterTimeParcel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */