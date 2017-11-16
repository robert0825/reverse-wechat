package com.tencent.mm.plugin.appbrand.appcache;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class WxaPkgWrappingInfo
  implements Parcelable
{
  public static final Parcelable.Creator<WxaPkgWrappingInfo> CREATOR;
  public int hKB;
  public int hKC;
  public long hKD;
  public boolean hKE;
  public String hKF;
  @Deprecated
  public volatile transient Map<String, WxaPkgItemInfo> hKG;
  @Deprecated
  public ArrayList<WxaPkgItemInfo> hKH;
  public String hKI;
  
  static
  {
    GMTrace.i(10613669494784L, 79078);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(10613669494784L, 79078);
  }
  
  public WxaPkgWrappingInfo()
  {
    GMTrace.i(10612729970688L, 79071);
    this.hKG = null;
    this.hKH = null;
    GMTrace.o(10612729970688L, 79071);
  }
  
  public WxaPkgWrappingInfo(Parcel paramParcel)
  {
    GMTrace.i(10613401059328L, 79076);
    this.hKG = null;
    this.hKH = null;
    this.hKB = paramParcel.readInt();
    this.hKC = paramParcel.readInt();
    this.hKD = paramParcel.readLong();
    if (paramParcel.readByte() != 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.hKE = bool;
      this.hKF = paramParcel.readString();
      this.hKH = paramParcel.createTypedArrayList(WxaPkgItemInfo.CREATOR);
      this.hKI = paramParcel.readString();
      GMTrace.o(10613401059328L, 79076);
      return;
    }
  }
  
  public static WxaPkgWrappingInfo ou(String paramString)
  {
    GMTrace.i(10612595752960L, 79070);
    if (bg.nm(paramString))
    {
      GMTrace.o(10612595752960L, 79070);
      return null;
    }
    Object localObject = new p(new File(paramString));
    if (!((p)localObject).hJn)
    {
      w.e("MicroMsg.WxaPkgWrappingInfo#obtain", "wxPkg invalid, path = %s ", new Object[] { paramString });
      ((p)localObject).close();
      GMTrace.o(10612595752960L, 79070);
      return null;
    }
    if (!((p)localObject).SH())
    {
      w.e("MicroMsg.WxaPkgWrappingInfo#obtain", "wxPkg read info failed, path = %s ", new Object[] { paramString });
      ((p)localObject).close();
      GMTrace.o(10612595752960L, 79070);
      return null;
    }
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = ((p)localObject).SI().iterator();
    while (localIterator.hasNext())
    {
      p.a locala = (p.a)localIterator.next();
      localLinkedList.add(new WxaPkgItemInfo(locala.euR, locala.hJt, locala.hJs));
    }
    ((p)localObject).close();
    localObject = new WxaPkgWrappingInfo();
    ((WxaPkgWrappingInfo)localObject).hKH = new ArrayList(localLinkedList);
    ((WxaPkgWrappingInfo)localObject).hKI = paramString;
    ((WxaPkgWrappingInfo)localObject).hKE = false;
    GMTrace.o(10612595752960L, 79070);
    return (WxaPkgWrappingInfo)localObject;
  }
  
  public final int describeContents()
  {
    GMTrace.i(10613132623872L, 79074);
    GMTrace.o(10613132623872L, 79074);
    return 0;
  }
  
  public final String toString()
  {
    GMTrace.i(10612998406144L, 79073);
    StringBuilder localStringBuilder = new StringBuilder("WxaPkgWrappingInfo{pkgDebugType=").append(this.hKB).append(", pkgVersion=").append(this.hKC).append(", pkgCreateTime=").append(this.hKD).append(", localPkg=").append(this.hKE).append(", pkgMd5='").append(this.hKF).append('\'').append(", pkgFileInfoList.size=");
    if (this.hKH == null) {}
    for (Object localObject = "null";; localObject = Integer.valueOf(this.hKH.size()))
    {
      localObject = localObject + ", pkgPath='" + this.hKI + '\'' + '}';
      GMTrace.o(10612998406144L, 79073);
      return (String)localObject;
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(10613266841600L, 79075);
    paramParcel.writeInt(this.hKB);
    paramParcel.writeInt(this.hKC);
    paramParcel.writeLong(this.hKD);
    if (this.hKE) {}
    for (byte b = 1;; b = 0)
    {
      paramParcel.writeByte(b);
      paramParcel.writeString(this.hKF);
      paramParcel.writeTypedList(this.hKH);
      paramParcel.writeString(this.hKI);
      GMTrace.o(10613266841600L, 79075);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\appcache\WxaPkgWrappingInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */