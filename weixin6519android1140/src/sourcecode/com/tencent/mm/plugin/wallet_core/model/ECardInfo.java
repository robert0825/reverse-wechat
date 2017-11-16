package com.tencent.mm.plugin.wallet_core.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;

public class ECardInfo
  implements Parcelable
{
  public static final Parcelable.Creator<ECardInfo> CREATOR;
  public String eDL;
  public String eXH;
  public int rfA;
  public int rfB;
  public String rfC;
  public String rfD;
  public String rfE;
  public int rfF;
  public ArrayList<String> rfG;
  public String rfH;
  public String rfI;
  public String rfJ;
  public String rfK;
  public int rfz;
  public String title;
  
  static
  {
    GMTrace.i(19319970856960L, 143945);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(19319970856960L, 143945);
  }
  
  public ECardInfo()
  {
    GMTrace.i(19319433986048L, 143941);
    this.rfG = new ArrayList();
    GMTrace.o(19319433986048L, 143941);
  }
  
  public ECardInfo(Parcel paramParcel)
  {
    GMTrace.i(19319568203776L, 143942);
    this.rfG = new ArrayList();
    this.rfz = paramParcel.readInt();
    this.eDL = paramParcel.readString();
    this.rfA = paramParcel.readInt();
    this.rfB = paramParcel.readInt();
    this.rfC = paramParcel.readString();
    this.rfD = paramParcel.readString();
    this.rfE = paramParcel.readString();
    this.rfF = paramParcel.readInt();
    this.title = paramParcel.readString();
    paramParcel.readStringList(this.rfG);
    this.rfH = paramParcel.readString();
    this.rfI = paramParcel.readString();
    this.rfJ = paramParcel.readString();
    this.rfK = paramParcel.readString();
    GMTrace.o(19319568203776L, 143942);
  }
  
  public int describeContents()
  {
    GMTrace.i(19319702421504L, 143943);
    GMTrace.o(19319702421504L, 143943);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(19319836639232L, 143944);
    paramParcel.writeInt(this.rfz);
    paramParcel.writeString(this.eDL);
    paramParcel.writeInt(this.rfA);
    paramParcel.writeInt(this.rfB);
    paramParcel.writeString(this.rfC);
    paramParcel.writeString(this.rfD);
    paramParcel.writeString(this.rfE);
    paramParcel.writeInt(this.rfF);
    paramParcel.writeString(this.title);
    paramParcel.writeStringList(this.rfG);
    paramParcel.writeString(this.rfH);
    paramParcel.writeString(this.rfI);
    paramParcel.writeString(this.rfJ);
    paramParcel.writeString(this.rfK);
    GMTrace.o(19319836639232L, 143944);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\model\ECardInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */