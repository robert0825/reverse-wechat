package com.tencent.mm.plugin.facedetect.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.facedetect.FaceProNative.FaceStatus;

public class FaceCharacteristicsResult
  implements Parcelable
{
  public static final Parcelable.Creator<FaceCharacteristicsResult> CREATOR;
  public String eAR;
  public int errCode;
  public FaceProNative.FaceStatus kSG;
  
  static
  {
    GMTrace.i(5869743898624L, 43733);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(5869743898624L, 43733);
  }
  
  public FaceCharacteristicsResult()
  {
    GMTrace.i(5869072809984L, 43728);
    GMTrace.o(5869072809984L, 43728);
  }
  
  protected FaceCharacteristicsResult(Parcel paramParcel)
  {
    GMTrace.i(5868535939072L, 43724);
    this.errCode = paramParcel.readInt();
    this.eAR = paramParcel.readString();
    GMTrace.o(5868535939072L, 43724);
  }
  
  public static boolean nm(int paramInt)
  {
    GMTrace.i(5869207027712L, 43729);
    if ((paramInt >= 10) && (paramInt < 100))
    {
      GMTrace.o(5869207027712L, 43729);
      return true;
    }
    GMTrace.o(5869207027712L, 43729);
    return false;
  }
  
  public static boolean nn(int paramInt)
  {
    GMTrace.i(5869341245440L, 43730);
    if ((paramInt > 0) && (paramInt < 10))
    {
      GMTrace.o(5869341245440L, 43730);
      return true;
    }
    GMTrace.o(5869341245440L, 43730);
    return false;
  }
  
  public static boolean no(int paramInt)
  {
    GMTrace.i(5869475463168L, 43731);
    if (paramInt <= 0)
    {
      GMTrace.o(5869475463168L, 43731);
      return true;
    }
    GMTrace.o(5869475463168L, 43731);
    return false;
  }
  
  public final void P(int paramInt, String paramString)
  {
    GMTrace.i(5869609680896L, 43732);
    this.errCode = paramInt;
    this.eAR = paramString;
    GMTrace.o(5869609680896L, 43732);
  }
  
  public int describeContents()
  {
    GMTrace.i(5868804374528L, 43726);
    GMTrace.o(5868804374528L, 43726);
    return 0;
  }
  
  public String toString()
  {
    GMTrace.i(5868938592256L, 43727);
    String str = "FaceCharacteristicsResult{mStatus=" + this.kSG + ", errCode=" + this.errCode + ", errMsg='" + this.eAR + '\'' + '}';
    GMTrace.o(5868938592256L, 43727);
    return str;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(5868670156800L, 43725);
    paramParcel.writeParcelable(this.kSG, paramInt);
    paramParcel.writeInt(this.errCode);
    paramParcel.writeString(this.eAR);
    GMTrace.o(5868670156800L, 43725);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\model\FaceCharacteristicsResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */