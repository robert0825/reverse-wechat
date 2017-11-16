package com.tencent.mm.modelgeo;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;

public class Addr
  implements Parcelable
{
  public static final Parcelable.Creator<Addr> CREATOR;
  public String country;
  public String gEA;
  public String gEB;
  public String gEC;
  public String gED;
  public String gEE;
  public String gEF;
  public String gEG;
  public String gEH;
  public String gEI;
  public float gEJ;
  public float gEK;
  public String gEy;
  public String gEz;
  public Object tag;
  
  static
  {
    GMTrace.i(486405046272L, 3624);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(486405046272L, 3624);
  }
  
  public Addr()
  {
    GMTrace.i(485733957632L, 3619);
    this.tag = "";
    GMTrace.o(485733957632L, 3619);
  }
  
  public final String Io()
  {
    GMTrace.i(486002393088L, 3621);
    String str = bg.aq(this.gEB, "") + bg.aq(this.gEC, "") + bg.aq(this.gED, "") + bg.aq(this.gEE, "") + bg.aq(this.gEF, "");
    GMTrace.o(486002393088L, 3621);
    return str;
  }
  
  public int describeContents()
  {
    GMTrace.i(486136610816L, 3622);
    GMTrace.o(486136610816L, 3622);
    return 0;
  }
  
  public String toString()
  {
    GMTrace.i(485868175360L, 3620);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("address='" + this.gEy + '\'');
    ((StringBuilder)localObject).append(", country='" + this.country + '\'');
    ((StringBuilder)localObject).append(", administrative_area_level_1='" + this.gEz + '\'');
    ((StringBuilder)localObject).append(", locality='" + this.gEA + '\'');
    ((StringBuilder)localObject).append(", locality_shi='" + this.gEB + '\'');
    ((StringBuilder)localObject).append(", sublocality='" + this.gEC + '\'');
    ((StringBuilder)localObject).append(", neighborhood='" + this.gED + '\'');
    ((StringBuilder)localObject).append(", route='" + this.gEE + '\'');
    ((StringBuilder)localObject).append(", streetNum='" + this.gEF + '\'');
    ((StringBuilder)localObject).append(", roughAddr='" + this.gEG + '\'');
    ((StringBuilder)localObject).append(", poi_name='" + this.gEH + '\'');
    ((StringBuilder)localObject).append(", lat=" + this.gEJ);
    ((StringBuilder)localObject).append(", lng=" + this.gEK);
    ((StringBuilder)localObject).append(", tag=" + this.tag);
    localObject = ((StringBuilder)localObject).toString();
    GMTrace.o(485868175360L, 3620);
    return (String)localObject;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(486270828544L, 3623);
    paramParcel.writeString(bg.aq(this.gEy, ""));
    paramParcel.writeString(bg.aq(this.country, ""));
    paramParcel.writeString(bg.aq(this.gEz, ""));
    paramParcel.writeString(bg.aq(this.gEA, ""));
    paramParcel.writeString(bg.aq(this.gEB, ""));
    paramParcel.writeString(bg.aq(this.gEC, ""));
    paramParcel.writeString(bg.aq(this.gED, ""));
    paramParcel.writeString(bg.aq(this.gEE, ""));
    paramParcel.writeString(bg.aq(this.gEF, ""));
    paramParcel.writeString(bg.aq(this.gEG, ""));
    paramParcel.writeString(bg.aq(this.gEH, ""));
    paramParcel.writeFloat(this.gEJ);
    paramParcel.writeFloat(this.gEK);
    GMTrace.o(486270828544L, 3623);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelgeo\Addr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */