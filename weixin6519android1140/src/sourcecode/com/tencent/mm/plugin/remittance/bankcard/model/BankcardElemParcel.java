package com.tencent.mm.plugin.remittance.bankcard.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.eo;
import com.tencent.mm.protocal.c.rp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class BankcardElemParcel
  implements Parcelable
{
  public static final Parcelable.Creator<BankcardElemParcel> CREATOR;
  public String mhU;
  public String nDt;
  public String ojk;
  public int ojl;
  public int ojm;
  public String ojn;
  public String ojo;
  public String ojp;
  public ArrayList<EnterTimeParcel> ojq;
  
  static
  {
    GMTrace.i(20949239857152L, 156084);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(20949239857152L, 156084);
  }
  
  public BankcardElemParcel()
  {
    GMTrace.i(20948568768512L, 156079);
    GMTrace.o(20948568768512L, 156079);
  }
  
  public BankcardElemParcel(Parcel paramParcel)
  {
    GMTrace.i(20948837203968L, 156081);
    this.nDt = paramParcel.readString();
    this.mhU = paramParcel.readString();
    this.ojk = paramParcel.readString();
    this.ojl = paramParcel.readInt();
    this.ojm = paramParcel.readInt();
    this.ojq = new ArrayList();
    paramParcel.readTypedList(this.ojq, EnterTimeParcel.CREATOR);
    this.ojn = paramParcel.readString();
    this.ojo = paramParcel.readString();
    this.ojp = paramParcel.readString();
    GMTrace.o(20948837203968L, 156081);
  }
  
  public BankcardElemParcel(eo parameo)
  {
    GMTrace.i(20948702986240L, 156080);
    this.nDt = parameo.nDt;
    this.mhU = parameo.mhU;
    this.ojk = parameo.ojk;
    this.ojl = parameo.ojl;
    this.ojm = parameo.ojm;
    this.ojn = parameo.ojn;
    this.ojo = parameo.ojo;
    this.ojp = parameo.ojp;
    this.ojq = new ArrayList();
    parameo = parameo.tTs.iterator();
    while (parameo.hasNext())
    {
      EnterTimeParcel localEnterTimeParcel = new EnterTimeParcel((rp)parameo.next());
      this.ojq.add(localEnterTimeParcel);
    }
    GMTrace.o(20948702986240L, 156080);
  }
  
  public int describeContents()
  {
    GMTrace.i(20949105639424L, 156083);
    GMTrace.o(20949105639424L, 156083);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(20948971421696L, 156082);
    paramParcel.writeString(this.nDt);
    paramParcel.writeString(this.mhU);
    paramParcel.writeString(this.ojk);
    paramParcel.writeInt(this.ojl);
    paramParcel.writeInt(this.ojm);
    paramParcel.writeTypedList(this.ojq);
    paramParcel.writeString(this.ojn);
    paramParcel.writeString(this.ojo);
    paramParcel.writeString(this.ojp);
    GMTrace.o(20948971421696L, 156082);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\bankcard\model\BankcardElemParcel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */