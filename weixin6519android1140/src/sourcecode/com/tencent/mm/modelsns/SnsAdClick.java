package com.tencent.mm.modelsns;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.mx;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bg;

public class SnsAdClick
  implements Parcelable
{
  public static final Parcelable.Creator<SnsAdClick> CREATOR;
  public String gVs;
  public long gVt;
  public String gVu;
  public int gVv;
  public long gVw;
  public int gVx;
  public int gVy;
  public int scene;
  
  static
  {
    GMTrace.i(4463678980096L, 33257);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(4463678980096L, 33257);
  }
  
  public SnsAdClick()
  {
    GMTrace.i(4462873673728L, 33251);
    this.gVs = "";
    this.scene = 0;
    this.gVt = 0L;
    this.gVu = "";
    this.gVv = 0;
    this.gVw = 0L;
    this.gVx = 0;
    this.gVy = 0;
    GMTrace.o(4462873673728L, 33251);
  }
  
  public SnsAdClick(String paramString1, int paramInt1, long paramLong, String paramString2, int paramInt2)
  {
    GMTrace.i(4463007891456L, 33252);
    this.gVs = "";
    this.scene = 0;
    this.gVt = 0L;
    this.gVu = "";
    this.gVv = 0;
    this.gVw = 0L;
    this.gVx = 0;
    this.gVy = 0;
    this.gVs = paramString1;
    this.scene = paramInt1;
    this.gVt = paramLong;
    this.gVu = paramString2;
    this.gVx = paramInt2;
    this.gVy = 1;
    this.gVw = System.currentTimeMillis();
    GMTrace.o(4463007891456L, 33252);
  }
  
  public SnsAdClick(String paramString1, int paramInt1, long paramLong, String paramString2, int paramInt2, byte paramByte)
  {
    GMTrace.i(4463142109184L, 33253);
    this.gVs = "";
    this.scene = 0;
    this.gVt = 0L;
    this.gVu = "";
    this.gVv = 0;
    this.gVw = 0L;
    this.gVx = 0;
    this.gVy = 0;
    this.gVs = paramString1;
    this.scene = paramInt1;
    this.gVt = paramLong;
    this.gVu = paramString2;
    this.gVx = paramInt2;
    this.gVy = 0;
    this.gVw = System.currentTimeMillis();
    GMTrace.o(4463142109184L, 33253);
  }
  
  public int describeContents()
  {
    GMTrace.i(4463276326912L, 33254);
    GMTrace.o(4463276326912L, 33254);
    return 0;
  }
  
  public final void gZ(int paramInt)
  {
    GMTrace.i(4463544762368L, 33256);
    mx localmx = new mx();
    this.gVv = paramInt;
    localmx.eRU.eRV = this;
    a.vgX.m(localmx);
    GMTrace.o(4463544762368L, 33256);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(4463410544640L, 33255);
    paramParcel.writeString(this.gVs);
    paramParcel.writeInt(this.scene);
    paramParcel.writeInt(this.gVv);
    paramParcel.writeLong(this.gVt);
    paramParcel.writeString(bg.aq(this.gVu, ""));
    paramParcel.writeLong(this.gVw);
    paramParcel.writeInt(this.gVy);
    paramParcel.writeInt(this.gVx);
    GMTrace.o(4463410544640L, 33255);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelsns\SnsAdClick.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */