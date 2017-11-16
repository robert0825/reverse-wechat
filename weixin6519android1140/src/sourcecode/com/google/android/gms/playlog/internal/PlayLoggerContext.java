package com.google.android.gms.playlog.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.v;
import java.util.Arrays;

public class PlayLoggerContext
  implements SafeParcelable
{
  public static final b CREATOR = new b();
  public final boolean axA;
  public final String axB;
  public final boolean axC;
  public final int axD;
  public final int axw;
  public final int axx;
  public final String axy;
  public final String axz;
  public final String packageName;
  public final int versionCode;
  
  public PlayLoggerContext(int paramInt1, String paramString1, int paramInt2, int paramInt3, String paramString2, String paramString3, boolean paramBoolean1, String paramString4, boolean paramBoolean2, int paramInt4)
  {
    this.versionCode = paramInt1;
    this.packageName = paramString1;
    this.axw = paramInt2;
    this.axx = paramInt3;
    this.axy = paramString2;
    this.axz = paramString3;
    this.axA = paramBoolean1;
    this.axB = paramString4;
    this.axC = paramBoolean2;
    this.axD = paramInt4;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof PlayLoggerContext)) {
        break;
      }
      paramObject = (PlayLoggerContext)paramObject;
    } while ((this.versionCode == ((PlayLoggerContext)paramObject).versionCode) && (this.packageName.equals(((PlayLoggerContext)paramObject).packageName)) && (this.axw == ((PlayLoggerContext)paramObject).axw) && (this.axx == ((PlayLoggerContext)paramObject).axx) && (v.d(this.axB, ((PlayLoggerContext)paramObject).axB)) && (v.d(this.axy, ((PlayLoggerContext)paramObject).axy)) && (v.d(this.axz, ((PlayLoggerContext)paramObject).axz)) && (this.axA == ((PlayLoggerContext)paramObject).axA) && (this.axC == ((PlayLoggerContext)paramObject).axC) && (this.axD == ((PlayLoggerContext)paramObject).axD));
    return false;
    return false;
  }
  
  public int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(this.versionCode), this.packageName, Integer.valueOf(this.axw), Integer.valueOf(this.axx), this.axB, this.axy, this.axz, Boolean.valueOf(this.axA), Boolean.valueOf(this.axC), Integer.valueOf(this.axD) });
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("PlayLoggerContext[");
    localStringBuilder.append("versionCode=").append(this.versionCode).append(',');
    localStringBuilder.append("package=").append(this.packageName).append(',');
    localStringBuilder.append("packageVersionCode=").append(this.axw).append(',');
    localStringBuilder.append("logSource=").append(this.axx).append(',');
    localStringBuilder.append("logSourceName=").append(this.axB).append(',');
    localStringBuilder.append("uploadAccount=").append(this.axy).append(',');
    localStringBuilder.append("loggingId=").append(this.axz).append(',');
    localStringBuilder.append("logAndroidId=").append(this.axA).append(',');
    localStringBuilder.append("isAnonymous=").append(this.axC).append(',');
    localStringBuilder.append("qosTier=").append(this.axD);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    b.a(this, paramParcel);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\google\android\gms\playlog\internal\PlayLoggerContext.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */