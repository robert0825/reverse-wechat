package com.tencent.mm.plugin.appbrand.config;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public class WxaExposedParams
  implements Parcelable
{
  public static final Parcelable.Creator<WxaExposedParams> CREATOR;
  public String appId;
  public String eCQ;
  public int eDj;
  public String ePf;
  public int hKB;
  public int hKC;
  public String hRZ;
  public String hSa;
  public String iconUrl;
  public String username;
  
  static
  {
    GMTrace.i(18660961812480L, 139035);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(18660961812480L, 139035);
  }
  
  protected WxaExposedParams(Parcel paramParcel)
  {
    GMTrace.i(18660424941568L, 139031);
    this.appId = paramParcel.readString();
    this.username = paramParcel.readString();
    this.eCQ = paramParcel.readString();
    this.iconUrl = paramParcel.readString();
    this.hKB = paramParcel.readInt();
    this.hKC = paramParcel.readInt();
    this.hRZ = paramParcel.readString();
    this.eDj = paramParcel.readInt();
    this.ePf = paramParcel.readString();
    this.hSa = paramParcel.readString();
    GMTrace.o(18660424941568L, 139031);
  }
  
  public WxaExposedParams(a parama)
  {
    GMTrace.i(18660290723840L, 139030);
    this.appId = parama.appId;
    this.username = parama.username;
    this.eCQ = parama.eCQ;
    this.iconUrl = parama.iconUrl;
    this.hKB = parama.hKB;
    this.hKC = parama.hKC;
    this.hRZ = parama.hRZ;
    this.eDj = parama.eDj;
    this.ePf = parama.ePf;
    this.hSa = parama.hSa;
    GMTrace.o(18660290723840L, 139030);
  }
  
  public int describeContents()
  {
    GMTrace.i(18660693377024L, 139033);
    GMTrace.o(18660693377024L, 139033);
    return 0;
  }
  
  public String toString()
  {
    GMTrace.i(18660827594752L, 139034);
    String str = "WxaExposedParams{appId='" + this.appId + '\'' + ", username='" + this.username + '\'' + ", nickname='" + this.eCQ + '\'' + ", iconUrl='" + this.iconUrl + '\'' + ", pkgDebugType=" + this.hKB + ", pkgVersion=" + this.hKC + ", pkgMD5='" + this.hRZ + '\'' + ", from=" + this.eDj + ", pageId='" + this.ePf + '\'' + ", errorUrl='" + this.hSa + '\'' + '}';
    GMTrace.o(18660827594752L, 139034);
    return str;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(18660559159296L, 139032);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.username);
    paramParcel.writeString(this.eCQ);
    paramParcel.writeString(this.iconUrl);
    paramParcel.writeInt(this.hKB);
    paramParcel.writeInt(this.hKC);
    paramParcel.writeString(this.hRZ);
    paramParcel.writeInt(this.eDj);
    paramParcel.writeString(this.ePf);
    paramParcel.writeString(this.hSa);
    GMTrace.o(18660559159296L, 139032);
  }
  
  public static final class a
  {
    public String appId;
    public String eCQ;
    public int eDj;
    public String ePf;
    public int hKB;
    public int hKC;
    public String hRZ;
    public String hSa;
    public String iconUrl;
    public String username;
    
    public a()
    {
      GMTrace.i(18659619635200L, 139025);
      this.appId = "";
      this.username = "";
      this.eCQ = "";
      this.iconUrl = "";
      this.hKC = -1;
      this.hKB = -1;
      this.hRZ = "";
      this.eDj = 0;
      this.ePf = "";
      this.hSa = "";
      GMTrace.o(18659619635200L, 139025);
    }
    
    public final WxaExposedParams UI()
    {
      GMTrace.i(18659753852928L, 139026);
      WxaExposedParams localWxaExposedParams = new WxaExposedParams(this);
      GMTrace.o(18659753852928L, 139026);
      return localWxaExposedParams;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\appbrand\config\WxaExposedParams.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */