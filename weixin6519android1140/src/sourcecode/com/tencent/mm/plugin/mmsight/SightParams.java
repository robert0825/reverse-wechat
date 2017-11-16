package com.tencent.mm.plugin.mmsight;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.modelcontrol.d;
import com.tencent.mm.storage.t;

public class SightParams
  implements Parcelable
{
  public static final Parcelable.Creator<SightParams> CREATOR;
  public int mWO;
  public VideoTransPara mWP;
  public String mWQ;
  public String mWR;
  public String mWS;
  public String mWT;
  public String mWU;
  public boolean mWV;
  public int mWW;
  public int mode;
  public int scene;
  
  static
  {
    GMTrace.i(18677873246208L, 139161);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(18677873246208L, 139161);
  }
  
  public SightParams(int paramInt1, int paramInt2)
  {
    GMTrace.i(18677202157568L, 139156);
    this.mode = 0;
    this.mWO = 2;
    this.mWQ = "";
    this.mWR = "";
    this.mWS = "";
    this.mWT = "";
    this.mWU = "";
    this.mWV = true;
    this.scene = -1;
    if (paramInt1 == 1) {
      this.mWP = d.Gv().Gw();
    }
    for (;;)
    {
      this.scene = paramInt1;
      this.mode = paramInt2;
      h.xz();
      this.mWW = ((Integer)h.xy().xh().get(344066, Integer.valueOf(0))).intValue();
      GMTrace.o(18677202157568L, 139156);
      return;
      if ((paramInt1 == 2) || (paramInt1 == 3) || (paramInt1 == 4)) {
        this.mWP = d.Gv().Gx();
      } else {
        this.mWP = d.Gv().Gx();
      }
    }
  }
  
  protected SightParams(Parcel paramParcel)
  {
    GMTrace.i(18677336375296L, 139157);
    this.mode = 0;
    this.mWO = 2;
    this.mWQ = "";
    this.mWR = "";
    this.mWS = "";
    this.mWT = "";
    this.mWU = "";
    this.mWV = true;
    this.scene = -1;
    this.mode = paramParcel.readInt();
    this.mWP = ((VideoTransPara)paramParcel.readParcelable(VideoTransPara.class.getClassLoader()));
    this.mWQ = paramParcel.readString();
    this.mWR = paramParcel.readString();
    this.mWS = paramParcel.readString();
    this.mWT = paramParcel.readString();
    this.mWW = paramParcel.readInt();
    this.mWO = paramParcel.readInt();
    if (paramParcel.readInt() > 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.mWV = bool;
      this.scene = paramParcel.readInt();
      GMTrace.o(18677336375296L, 139157);
      return;
    }
  }
  
  public int describeContents()
  {
    GMTrace.i(18677604810752L, 139159);
    GMTrace.o(18677604810752L, 139159);
    return 0;
  }
  
  public final SightParams h(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    GMTrace.i(18677470593024L, 139158);
    this.mWS = paramString1;
    this.mWQ = paramString2;
    this.mWR = paramString3;
    this.mWT = paramString4;
    GMTrace.o(18677470593024L, 139158);
    return this;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(18677739028480L, 139160);
    paramParcel.writeInt(this.mode);
    paramParcel.writeParcelable(this.mWP, paramInt);
    paramParcel.writeString(this.mWQ);
    paramParcel.writeString(this.mWR);
    paramParcel.writeString(this.mWS);
    paramParcel.writeString(this.mWT);
    paramParcel.writeInt(this.mWW);
    paramParcel.writeInt(this.mWO);
    if (this.mWV) {}
    for (paramInt = 1;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeInt(this.scene);
      GMTrace.o(18677739028480L, 139160);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\mmsight\SightParams.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */