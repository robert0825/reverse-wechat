package com.tencent.mm.plugin.voiceprint.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;

public class VertifyInfo
  implements Parcelable
{
  public static final Parcelable.Creator<VertifyInfo> CREATOR;
  public String iJz;
  public String mFileName;
  public String qBM;
  public int qBT;
  public String qBY;
  public int qCc;
  public int qCd;
  public int qCe;
  public boolean qCf;
  public boolean qCg;
  
  static
  {
    GMTrace.i(12502247145472L, 93149);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(12502247145472L, 93149);
  }
  
  public VertifyInfo()
  {
    GMTrace.i(12501844492288L, 93146);
    this.iJz = "";
    this.qBM = "";
    this.qCe = 0;
    this.qBT = 0;
    this.mFileName = "";
    this.qCf = false;
    this.qCg = false;
    this.qBY = "";
    GMTrace.o(12501844492288L, 93146);
  }
  
  public int describeContents()
  {
    GMTrace.i(12501978710016L, 93147);
    GMTrace.o(12501978710016L, 93147);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    GMTrace.i(12502112927744L, 93148);
    paramParcel.writeInt(this.qCc);
    paramParcel.writeInt(this.qCd);
    paramParcel.writeInt(this.qCe);
    paramParcel.writeInt(this.qBT);
    paramParcel.writeString(bg.aq(this.iJz, ""));
    paramParcel.writeString(bg.aq(this.qBM, ""));
    paramParcel.writeString(bg.aq(this.mFileName, ""));
    if (this.qCf)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      if (!this.qCg) {
        break label123;
      }
    }
    label123:
    for (paramInt = i;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      GMTrace.o(12502112927744L, 93148);
      return;
      paramInt = 0;
      break;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\voiceprint\model\VertifyInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */