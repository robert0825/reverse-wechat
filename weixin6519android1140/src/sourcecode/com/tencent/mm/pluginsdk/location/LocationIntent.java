package com.tencent.mm.pluginsdk.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelgeo.Addr;

public class LocationIntent
  implements Parcelable
{
  public static final Parcelable.Creator<LocationIntent> CREATOR;
  public int eMn;
  public Addr gER;
  public String label;
  public double lat;
  public double lng;
  public String mwL;
  public String mzo;
  public String tmu;
  public int tmv;
  
  static
  {
    GMTrace.i(1249835483136L, 9312);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(1249835483136L, 9312);
  }
  
  public LocationIntent()
  {
    GMTrace.i(1249298612224L, 9308);
    this.eMn = 0;
    this.label = "";
    this.mzo = "";
    this.tmu = "";
    this.tmv = 0;
    this.gER = null;
    GMTrace.o(1249298612224L, 9308);
  }
  
  public final String brl()
  {
    GMTrace.i(1249432829952L, 9309);
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append("lat " + this.lat + ";");
    ((StringBuffer)localObject).append("lng " + this.lng + ";");
    ((StringBuffer)localObject).append("scale " + this.eMn + ";");
    ((StringBuffer)localObject).append("label " + this.label + ";");
    ((StringBuffer)localObject).append("poiname " + this.mzo + ";");
    ((StringBuffer)localObject).append("infourl " + this.tmu + ";");
    ((StringBuffer)localObject).append("locTypeId " + this.mwL + ";");
    ((StringBuffer)localObject).append("poiType " + this.tmv + ";");
    if (this.gER != null) {
      ((StringBuffer)localObject).append("addr " + this.gER.toString() + ";");
    }
    localObject = ((StringBuffer)localObject).toString();
    GMTrace.o(1249432829952L, 9309);
    return (String)localObject;
  }
  
  public int describeContents()
  {
    GMTrace.i(1249567047680L, 9310);
    GMTrace.o(1249567047680L, 9310);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(1249701265408L, 9311);
    paramParcel.writeDouble(this.lat);
    paramParcel.writeDouble(this.lng);
    paramParcel.writeInt(this.eMn);
    paramParcel.writeString(this.label);
    paramParcel.writeString(this.mzo);
    paramParcel.writeString(this.tmu);
    paramParcel.writeString(this.mwL);
    paramParcel.writeInt(this.tmv);
    paramParcel.writeParcelable(this.gER, paramInt);
    GMTrace.o(1249701265408L, 9311);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\pluginsdk\location\LocationIntent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */