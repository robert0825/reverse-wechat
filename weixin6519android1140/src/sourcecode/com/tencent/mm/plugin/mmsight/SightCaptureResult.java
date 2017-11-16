package com.tencent.mm.plugin.mmsight;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.anf;
import com.tencent.mm.sdk.platformtools.w;

public class SightCaptureResult
  implements Parcelable
{
  public static final Parcelable.Creator<SightCaptureResult> CREATOR;
  public boolean mWE;
  public boolean mWF;
  public boolean mWG;
  public String mWH;
  public String mWI;
  public String mWJ;
  public String mWK;
  public int mWL;
  public anf mWM;
  public String mWN;
  
  static
  {
    GMTrace.i(18675859980288L, 139146);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(18675859980288L, 139146);
  }
  
  protected SightCaptureResult(Parcel paramParcel)
  {
    GMTrace.i(18675457327104L, 139143);
    this.mWE = false;
    this.mWF = false;
    this.mWG = true;
    this.mWH = "";
    this.mWI = "";
    this.mWJ = "";
    this.mWK = "";
    this.mWL = 0;
    this.mWM = new anf();
    this.mWN = "";
    if (paramParcel.readByte() != 0)
    {
      bool = true;
      this.mWE = bool;
      if (paramParcel.readByte() == 0) {
        break label209;
      }
      bool = true;
      label96:
      this.mWF = bool;
      if (paramParcel.readByte() == 0) {
        break label214;
      }
    }
    label209:
    label214:
    for (boolean bool = true;; bool = false)
    {
      this.mWG = bool;
      this.mWH = paramParcel.readString();
      this.mWI = paramParcel.readString();
      this.mWJ = paramParcel.readString();
      this.mWK = paramParcel.readString();
      this.mWL = paramParcel.readInt();
      this.mWN = paramParcel.readString();
      try
      {
        byte[] arrayOfByte = new byte[paramParcel.readInt()];
        paramParcel.readByteArray(arrayOfByte);
        this.mWM = new anf();
        this.mWM.aD(arrayOfByte);
        GMTrace.o(18675457327104L, 139143);
        return;
      }
      catch (Exception paramParcel)
      {
        w.e("MicroMsg.SightCaptureResult", "read ext info error: %s", new Object[] { paramParcel.getMessage() });
        GMTrace.o(18675457327104L, 139143);
      }
      bool = false;
      break;
      bool = false;
      break label96;
    }
  }
  
  public SightCaptureResult(boolean paramBoolean, String paramString)
  {
    GMTrace.i(18675323109376L, 139142);
    this.mWE = false;
    this.mWF = false;
    this.mWG = true;
    this.mWH = "";
    this.mWI = "";
    this.mWJ = "";
    this.mWK = "";
    this.mWL = 0;
    this.mWM = new anf();
    this.mWN = "";
    this.mWG = paramBoolean;
    this.mWN = paramString;
    this.mWE = false;
    this.mWF = true;
    GMTrace.o(18675323109376L, 139142);
  }
  
  public SightCaptureResult(boolean paramBoolean, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt, anf paramanf)
  {
    GMTrace.i(18675188891648L, 139141);
    this.mWE = false;
    this.mWF = false;
    this.mWG = true;
    this.mWH = "";
    this.mWI = "";
    this.mWJ = "";
    this.mWK = "";
    this.mWL = 0;
    this.mWM = new anf();
    this.mWN = "";
    this.mWG = paramBoolean;
    this.mWH = paramString1;
    this.mWI = paramString2;
    this.mWJ = paramString3;
    this.mWL = paramInt;
    this.mWM = paramanf;
    this.mWK = paramString4;
    this.mWE = true;
    this.mWF = false;
    GMTrace.o(18675188891648L, 139141);
  }
  
  public int describeContents()
  {
    GMTrace.i(18675591544832L, 139144);
    GMTrace.o(18675591544832L, 139144);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    GMTrace.i(18675725762560L, 139145);
    if (this.mWE)
    {
      paramInt = 1;
      paramParcel.writeByte((byte)paramInt);
      if (!this.mWF) {
        break label139;
      }
      paramInt = 1;
      label34:
      paramParcel.writeByte((byte)paramInt);
      if (!this.mWG) {
        break label144;
      }
    }
    label139:
    label144:
    for (paramInt = i;; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      paramParcel.writeString(this.mWH);
      paramParcel.writeString(this.mWI);
      paramParcel.writeString(this.mWJ);
      paramParcel.writeString(this.mWK);
      paramParcel.writeInt(this.mWL);
      paramParcel.writeString(this.mWN);
      try
      {
        byte[] arrayOfByte = this.mWM.toByteArray();
        paramParcel.writeInt(arrayOfByte.length);
        paramParcel.writeByteArray(arrayOfByte);
        GMTrace.o(18675725762560L, 139145);
        return;
      }
      catch (Exception paramParcel)
      {
        w.e("MicroMsg.SightCaptureResult", "write ext info error");
        GMTrace.o(18675725762560L, 139145);
      }
      paramInt = 0;
      break;
      paramInt = 0;
      break label34;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\mmsight\SightCaptureResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */