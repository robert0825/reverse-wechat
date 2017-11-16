package com.tencent.mm.pluginsdk.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public class PayInfo
  implements Parcelable
{
  public static final Parcelable.Creator<PayInfo> CREATOR;
  public String appId;
  public String eAR;
  public String eEa;
  public String eHG;
  public int eJP;
  public String eJR;
  public String eJS;
  public int ePH;
  public int ePL;
  public int ePM;
  public String ePr;
  public String eXm;
  public String hLO;
  public String jxX;
  public boolean lNA;
  public String lOv;
  public int omG;
  public String partnerId;
  public String rse;
  public boolean tIA;
  public String tIB;
  public Bundle tIC;
  public int tID;
  public int tIE;
  public int tIF;
  public long tIG;
  public int tIH;
  public String tII;
  public String tIJ;
  public int tIK;
  public int tIz;
  
  static
  {
    GMTrace.i(1229434388480L, 9160);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(1229434388480L, 9160);
  }
  
  public PayInfo()
  {
    GMTrace.i(1228763299840L, 9155);
    this.ePM = -1;
    this.ePL = 0;
    this.tIz = 0;
    this.lNA = false;
    this.tIA = true;
    this.tID = 0;
    this.tIE = 0;
    this.tIG = 0L;
    this.ePr = "";
    this.tIH = -1;
    this.tIK = 1;
    this.omG = 0;
    GMTrace.o(1228763299840L, 9155);
  }
  
  public PayInfo(Parcel paramParcel)
  {
    GMTrace.i(1228897517568L, 9156);
    this.ePM = -1;
    this.ePL = 0;
    this.tIz = 0;
    this.lNA = false;
    this.tIA = true;
    this.tID = 0;
    this.tIE = 0;
    this.tIG = 0L;
    this.ePr = "";
    this.tIH = -1;
    this.tIK = 1;
    this.omG = 0;
    this.ePL = paramParcel.readInt();
    this.tIz = paramParcel.readInt();
    this.eHG = paramParcel.readString();
    this.lOv = paramParcel.readString();
    this.appId = paramParcel.readString();
    this.rse = paramParcel.readString();
    this.partnerId = paramParcel.readString();
    this.eXm = paramParcel.readString();
    this.eEa = paramParcel.readString();
    this.eAR = paramParcel.readString();
    this.ePH = paramParcel.readInt();
    this.ePM = paramParcel.readInt();
    if (paramParcel.readInt() == 1)
    {
      bool1 = true;
      this.lNA = bool1;
      if (paramParcel.readInt() != 1) {
        break label321;
      }
    }
    label321:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.tIA = bool1;
      this.tIC = paramParcel.readBundle();
      this.tID = paramParcel.readInt();
      this.eJR = paramParcel.readString();
      this.eJS = paramParcel.readString();
      this.eJP = paramParcel.readInt();
      this.tIG = paramParcel.readLong();
      this.ePr = paramParcel.readString();
      this.tII = paramParcel.readString();
      this.tIJ = paramParcel.readString();
      this.tIK = paramParcel.readInt();
      this.jxX = paramParcel.readString();
      this.hLO = paramParcel.readString();
      this.omG = paramParcel.readInt();
      GMTrace.o(1228897517568L, 9156);
      return;
      bool1 = false;
      break;
    }
  }
  
  public int describeContents()
  {
    GMTrace.i(1229031735296L, 9157);
    GMTrace.o(1229031735296L, 9157);
    return 0;
  }
  
  public String toString()
  {
    GMTrace.i(1229300170752L, 9159);
    String str = String.format("sense : %d, reqKey : %s, uuid : %s, appId : %s, appSource : %s, partnerId : %s, paySign : %s, productId : %s, soterAuth: %s", new Object[] { Integer.valueOf(this.ePL), this.eHG, this.lOv, this.appId, this.rse, this.partnerId, this.eXm, this.eEa, this.ePr });
    GMTrace.o(1229300170752L, 9159);
    return str;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    GMTrace.i(1229165953024L, 9158);
    paramParcel.writeInt(this.ePL);
    paramParcel.writeInt(this.tIz);
    paramParcel.writeString(this.eHG);
    paramParcel.writeString(this.lOv);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.rse);
    paramParcel.writeString(this.partnerId);
    paramParcel.writeString(this.eXm);
    paramParcel.writeString(this.eEa);
    paramParcel.writeString(this.eAR);
    paramParcel.writeInt(this.ePH);
    paramParcel.writeInt(this.ePM);
    if (this.lNA)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      if (!this.tIA) {
        break label254;
      }
    }
    label254:
    for (paramInt = i;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeBundle(this.tIC);
      paramParcel.writeInt(this.tID);
      paramParcel.writeString(this.eJR);
      paramParcel.writeString(this.eJS);
      paramParcel.writeInt(this.eJP);
      paramParcel.writeLong(this.tIG);
      paramParcel.writeString(this.ePr);
      paramParcel.writeString(this.tII);
      paramParcel.writeString(this.tIJ);
      paramParcel.writeInt(this.tIK);
      paramParcel.writeString(this.jxX);
      paramParcel.writeString(this.hLO);
      paramParcel.writeInt(this.omG);
      GMTrace.o(1229165953024L, 9158);
      return;
      paramInt = 0;
      break;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\wallet\PayInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */