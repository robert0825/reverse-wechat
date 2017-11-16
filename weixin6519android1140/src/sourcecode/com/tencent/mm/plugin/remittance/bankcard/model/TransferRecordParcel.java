package com.tencent.mm.plugin.remittance.bankcard.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.bjt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TransferRecordParcel
  implements Parcelable
{
  public static final Parcelable.Creator<TransferRecordParcel> CREATOR;
  public String mhU;
  public String nDt;
  public String ojE;
  public String ojF;
  public String ojG;
  public String ojH;
  public String ojk;
  
  static
  {
    GMTrace.i(20948434550784L, 156078);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(20948434550784L, 156078);
  }
  
  public TransferRecordParcel()
  {
    GMTrace.i(20947629244416L, 156072);
    GMTrace.o(20947629244416L, 156072);
  }
  
  protected TransferRecordParcel(Parcel paramParcel)
  {
    GMTrace.i(20947897679872L, 156074);
    this.ojE = paramParcel.readString();
    this.ojF = paramParcel.readString();
    this.ojk = paramParcel.readString();
    this.mhU = paramParcel.readString();
    this.nDt = paramParcel.readString();
    this.ojG = paramParcel.readString();
    this.ojH = paramParcel.readString();
    GMTrace.o(20947897679872L, 156074);
  }
  
  private TransferRecordParcel(bjt parambjt)
  {
    GMTrace.i(20947763462144L, 156073);
    this.ojE = parambjt.ojE;
    this.ojF = parambjt.ojF;
    this.ojk = parambjt.ojk;
    this.mhU = parambjt.mhU;
    this.nDt = parambjt.nDt;
    this.ojG = parambjt.ojG;
    this.ojH = parambjt.ojH;
    GMTrace.o(20947763462144L, 156073);
  }
  
  public static ArrayList<TransferRecordParcel> bm(List<bjt> paramList)
  {
    GMTrace.i(20948300333056L, 156077);
    if (paramList == null)
    {
      GMTrace.o(20948300333056L, 156077);
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localArrayList.add(new TransferRecordParcel((bjt)paramList.next()));
    }
    GMTrace.o(20948300333056L, 156077);
    return localArrayList;
  }
  
  public int describeContents()
  {
    GMTrace.i(20948031897600L, 156075);
    GMTrace.o(20948031897600L, 156075);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(20948166115328L, 156076);
    paramParcel.writeString(this.ojE);
    paramParcel.writeString(this.ojF);
    paramParcel.writeString(this.ojk);
    paramParcel.writeString(this.mhU);
    paramParcel.writeString(this.nDt);
    paramParcel.writeString(this.ojG);
    paramParcel.writeString(this.ojH);
    GMTrace.o(20948166115328L, 156076);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\bankcard\model\TransferRecordParcel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */