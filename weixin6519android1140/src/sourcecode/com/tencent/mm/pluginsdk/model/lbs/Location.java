package com.tencent.mm.pluginsdk.model.lbs;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public class Location
  implements Parcelable
{
  public static final Parcelable.Creator<Location> CREATOR;
  public int accuracy;
  public int eNT;
  public String eNV;
  public float gEJ;
  public float gEK;
  public String mac;
  
  static
  {
    GMTrace.i(754303631360L, 5620);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(754303631360L, 5620);
  }
  
  public Location()
  {
    GMTrace.i(753632542720L, 5615);
    GMTrace.o(753632542720L, 5615);
  }
  
  public Location(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, String paramString1, String paramString2)
  {
    GMTrace.i(753766760448L, 5616);
    this.gEJ = paramFloat1;
    this.gEK = paramFloat2;
    this.accuracy = paramInt1;
    this.eNT = paramInt2;
    this.mac = paramString1;
    this.eNV = paramString2;
    GMTrace.o(753766760448L, 5616);
  }
  
  public final boolean bJM()
  {
    GMTrace.i(753900978176L, 5617);
    if ((this.gEJ == -85.0F) || (this.gEK == -1000.0F))
    {
      w.d("MicroMsg.Radar.Location", "mac and cellId is null");
      GMTrace.o(753900978176L, 5617);
      return true;
    }
    GMTrace.o(753900978176L, 5617);
    return false;
  }
  
  public int describeContents()
  {
    GMTrace.i(754035195904L, 5618);
    GMTrace.o(754035195904L, 5618);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(754169413632L, 5619);
    paramParcel.writeFloat(this.gEJ);
    paramParcel.writeFloat(this.gEK);
    paramParcel.writeInt(this.accuracy);
    paramParcel.writeInt(this.eNT);
    paramParcel.writeString(this.mac);
    paramParcel.writeString(this.eNV);
    GMTrace.o(754169413632L, 5619);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\pluginsdk\model\lbs\Location.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */