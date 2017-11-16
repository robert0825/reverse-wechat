package com.tencent.mm.plugin.appbrand.config;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle;
import com.tencent.mm.protocal.c.cx;
import java.util.ArrayList;

public class AppBrandSysConfig
  implements Parcelable
{
  public static final Parcelable.Creator<AppBrandSysConfig> CREATOR;
  public String appId;
  public String eAr;
  public String eEs;
  public String hQJ;
  public String hQK;
  public boolean hQL;
  public boolean hQM;
  public AppRuntimeApiPermissionBundle hQN;
  public boolean hQO;
  public int hQP;
  public int hQQ;
  public int hQR;
  public int hQS;
  public int hQT;
  public int hQU;
  public long hQV;
  public int hQW;
  public boolean hQX;
  public boolean hQY;
  public ArrayList<String> hQZ;
  public ArrayList<String> hRa;
  public ArrayList<String> hRb;
  public ArrayList<String> hRc;
  public boolean hRd;
  public int hRe;
  public int hRf;
  public final WxaPkgWrappingInfo hRg;
  public AppBrandGlobalSystemConfig hRh;
  cx hRi;
  public int uin;
  
  static
  {
    GMTrace.i(10591389351936L, 78912);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(10591389351936L, 78912);
  }
  
  public AppBrandSysConfig()
  {
    GMTrace.i(10590718263296L, 78907);
    this.hQL = false;
    this.hQM = false;
    this.hRg = new WxaPkgWrappingInfo();
    GMTrace.o(10590718263296L, 78907);
  }
  
  protected AppBrandSysConfig(Parcel paramParcel)
  {
    GMTrace.i(10591255134208L, 78911);
    this.hQL = false;
    this.hQM = false;
    this.uin = paramParcel.readInt();
    this.eAr = paramParcel.readString();
    this.eEs = paramParcel.readString();
    this.appId = paramParcel.readString();
    this.hQJ = paramParcel.readString();
    this.hQK = paramParcel.readString();
    if (paramParcel.readByte() != 0)
    {
      bool1 = true;
      this.hQL = bool1;
      if (paramParcel.readByte() == 0) {
        break label346;
      }
      bool1 = true;
      label95:
      this.hQM = bool1;
      this.hQN = ((AppRuntimeApiPermissionBundle)paramParcel.readParcelable(AppRuntimeApiPermissionBundle.class.getClassLoader()));
      if (paramParcel.readByte() == 0) {
        break label351;
      }
      bool1 = true;
      label125:
      this.hQO = bool1;
      this.hQP = paramParcel.readInt();
      this.hQQ = paramParcel.readInt();
      this.hQR = paramParcel.readInt();
      this.hQS = paramParcel.readInt();
      this.hQT = paramParcel.readInt();
      this.hQU = paramParcel.readInt();
      this.hQV = paramParcel.readLong();
      this.hQW = paramParcel.readInt();
      if (paramParcel.readByte() == 0) {
        break label356;
      }
      bool1 = true;
      label203:
      this.hQX = bool1;
      if (paramParcel.readByte() == 0) {
        break label361;
      }
      bool1 = true;
      label217:
      this.hQY = bool1;
      this.hQZ = paramParcel.createStringArrayList();
      this.hRa = paramParcel.createStringArrayList();
      this.hRb = paramParcel.createStringArrayList();
      this.hRc = paramParcel.createStringArrayList();
      this.hRg = ((WxaPkgWrappingInfo)paramParcel.readParcelable(WxaPkgWrappingInfo.class.getClassLoader()));
      this.hRh = ((AppBrandGlobalSystemConfig)paramParcel.readParcelable(AppBrandGlobalSystemConfig.class.getClassLoader()));
      if (paramParcel.readByte() <= 0) {
        break label366;
      }
    }
    label346:
    label351:
    label356:
    label361:
    label366:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.hRd = bool1;
      this.hRe = paramParcel.readInt();
      this.hRf = paramParcel.readInt();
      this.hRi = ((cx)com.tencent.mm.ipcinvoker.extension.c.a(com.tencent.mm.ipcinvoker.wx_extension.c.class.getName(), paramParcel));
      GMTrace.o(10591255134208L, 78911);
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label95;
      bool1 = false;
      break label125;
      bool1 = false;
      break label203;
      bool1 = false;
      break label217;
    }
  }
  
  public final long UA()
  {
    GMTrace.i(10590584045568L, 78906);
    if (this.hRi == null)
    {
      GMTrace.o(10590584045568L, 78906);
      return 0L;
    }
    long l = this.hRi.tQW;
    GMTrace.o(10590584045568L, 78906);
    return l;
  }
  
  public int describeContents()
  {
    GMTrace.i(10590986698752L, 78909);
    GMTrace.o(10590986698752L, 78909);
    return 0;
  }
  
  public String toString()
  {
    GMTrace.i(10590852481024L, 78908);
    String str = "AppBrandSysConfig{uin=" + this.uin + ", brandId='" + this.eAr + '\'' + ", brandName='" + this.eEs + '\'' + ", appId='" + this.appId + '\'' + ", appIconUrl='" + this.hQJ + '\'' + ", debugEnabled=" + this.hQL + ", performancePanelEnabled=" + this.hQM + ", maxWebViewDepth=" + this.hQP + ", maxBackgroundLifeSpan=" + this.hQQ + ", maxRequestConcurrent=" + this.hQR + ", maxUploadConcurrent=" + this.hQS + ", maxDownloadConcurrent=" + this.hQT + ", maxWebsocketConnect=" + this.hQU + ", requestDomains=" + this.hQZ + ", socketDomains=" + this.hRa + ", uploadDomains=" + this.hRb + ", downloadDomains=" + this.hRc + ", appPkgInfo=" + this.hRg + ", systemSettings=" + this.hRh + ", runningFlag=" + SysConfigUtil.a(this.hRi) + '}';
    GMTrace.o(10590852481024L, 78908);
    return str;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    byte b2 = 1;
    GMTrace.i(10591120916480L, 78910);
    paramParcel.writeInt(this.uin);
    paramParcel.writeString(this.eAr);
    paramParcel.writeString(this.eEs);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.hQJ);
    paramParcel.writeString(this.hQK);
    label83:
    int i;
    if (this.hQL)
    {
      b1 = 1;
      paramParcel.writeByte(b1);
      if (!this.hQM) {
        break label310;
      }
      b1 = 1;
      paramParcel.writeByte(b1);
      paramParcel.writeParcelable(this.hQN, paramInt);
      if (!this.hQO) {
        break label315;
      }
      i = 1;
      label107:
      paramParcel.writeByte((byte)i);
      paramParcel.writeInt(this.hQP);
      paramParcel.writeInt(this.hQQ);
      paramParcel.writeInt(this.hQR);
      paramParcel.writeInt(this.hQS);
      paramParcel.writeInt(this.hQT);
      paramParcel.writeInt(this.hQU);
      paramParcel.writeLong(this.hQV);
      paramParcel.writeInt(this.hQW);
      if (!this.hQX) {
        break label321;
      }
      b1 = 1;
      label187:
      paramParcel.writeByte(b1);
      if (!this.hQY) {
        break label326;
      }
      b1 = 1;
      label201:
      paramParcel.writeByte(b1);
      paramParcel.writeStringList(this.hQZ);
      paramParcel.writeStringList(this.hRa);
      paramParcel.writeStringList(this.hRb);
      paramParcel.writeStringList(this.hRc);
      paramParcel.writeParcelable(this.hRg, paramInt);
      paramParcel.writeParcelable(this.hRh, paramInt);
      if (!this.hRd) {
        break label331;
      }
    }
    label310:
    label315:
    label321:
    label326:
    label331:
    for (byte b1 = b2;; b1 = 0)
    {
      paramParcel.writeByte(b1);
      paramParcel.writeInt(this.hRe);
      paramParcel.writeInt(this.hRf);
      com.tencent.mm.ipcinvoker.extension.c.a(this.hRi, paramParcel);
      GMTrace.o(10591120916480L, 78910);
      return;
      b1 = 0;
      break;
      b1 = 0;
      break label83;
      i = 0;
      break label107;
      b1 = 0;
      break label187;
      b1 = 0;
      break label201;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\config\AppBrandSysConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */