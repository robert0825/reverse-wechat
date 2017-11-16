package com.tencent.mm.plugin.location.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.location.ui.d;
import com.tencent.mm.sdk.platformtools.bg;

public class LocationInfo
  implements Parcelable
{
  public static final Parcelable.Creator<LocationInfo> CREATOR;
  public String eQm;
  public String mwG;
  public double mwH;
  public double mwI;
  public String mwJ;
  public String mwK;
  String mwL;
  public int mwM;
  public int zoom;
  
  static
  {
    GMTrace.i(9632001032192L, 71764);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(9632001032192L, 71764);
  }
  
  public LocationInfo()
  {
    GMTrace.i(9631061508096L, 71757);
    this.mwG = "";
    this.mwH = -85.0D;
    this.mwI = -1000.0D;
    this.mwJ = "";
    this.mwK = "zh-cn";
    this.mwL = "";
    this.mwM = 0;
    GMTrace.o(9631061508096L, 71757);
  }
  
  public LocationInfo(byte paramByte)
  {
    GMTrace.i(9631195725824L, 71758);
    this.mwG = "";
    this.mwH = -85.0D;
    this.mwI = -1000.0D;
    this.mwJ = "";
    this.mwK = "zh-cn";
    this.mwL = "";
    this.mwM = 0;
    this.mwG = (toString() + " " + System.nanoTime());
    this.zoom = d.fE(false);
    GMTrace.o(9631195725824L, 71758);
  }
  
  public final boolean aKd()
  {
    GMTrace.i(9631464161280L, 71760);
    if ((this.mwH != -85.0D) && (this.mwI != -1000.0D))
    {
      GMTrace.o(9631464161280L, 71760);
      return true;
    }
    GMTrace.o(9631464161280L, 71760);
    return false;
  }
  
  public final boolean aKe()
  {
    GMTrace.i(9631598379008L, 71761);
    if ((bg.nm(this.mwJ)) && (bg.nm(this.eQm)))
    {
      GMTrace.o(9631598379008L, 71761);
      return false;
    }
    GMTrace.o(9631598379008L, 71761);
    return true;
  }
  
  public int describeContents()
  {
    GMTrace.i(9631866814464L, 71763);
    GMTrace.o(9631866814464L, 71763);
    return 0;
  }
  
  public String toString()
  {
    GMTrace.i(9631732596736L, 71762);
    String str = this.mwH + " " + this.mwI + " " + this.mwJ + " " + this.eQm + "  " + this.mwG;
    GMTrace.o(9631732596736L, 71762);
    return str;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(9631329943552L, 71759);
    paramParcel.writeString(this.mwG);
    paramParcel.writeDouble(this.mwH);
    paramParcel.writeDouble(this.mwI);
    paramParcel.writeInt(this.zoom);
    paramParcel.writeString(this.mwJ);
    paramParcel.writeString(this.mwK);
    paramParcel.writeString(this.eQm);
    paramParcel.writeString(this.mwL);
    paramParcel.writeInt(this.mwM);
    GMTrace.o(9631329943552L, 71759);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\location\model\LocationInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */