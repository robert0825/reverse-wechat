package com.tencent.mm.plugin.webview.wepkg.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.webview.wepkg.downloader.WePkgDownloader;
import com.tencent.mm.plugin.webview.wepkg.downloader.WePkgDownloader.IWepkgUpdateCallback;
import com.tencent.mm.plugin.webview.wepkg.downloader.WePkgDownloader.IWepkgUpdateCallback.RetCode;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public class WepkgDownloadProcessTask
  extends BaseWepkgProcessTask
{
  public static final Parcelable.Creator<WepkgDownloadProcessTask> CREATOR;
  public String downloadUrl;
  public String eDW;
  public String eZq;
  public int fileType;
  public String hKI;
  public Runnable hYr;
  public String rYr;
  public long rYs;
  public int rYt;
  public WePkgDownloader.IWepkgUpdateCallback.RetCode rYu;
  public String version;
  
  static
  {
    GMTrace.i(15174387892224L, 113058);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(15174387892224L, 113058);
  }
  
  public WepkgDownloadProcessTask()
  {
    GMTrace.i(15173314150400L, 113050);
    GMTrace.o(15173314150400L, 113050);
  }
  
  public WepkgDownloadProcessTask(Parcel paramParcel)
  {
    GMTrace.i(15173448368128L, 113051);
    f(paramParcel);
    GMTrace.o(15173448368128L, 113051);
  }
  
  public final void RY()
  {
    GMTrace.i(15173582585856L, 113052);
    VM();
    WePkgDownloader.bGj().a(this.fileType, bg.nl(this.eZq), bg.nl(this.rYr), bg.nl(this.downloadUrl), this.rYs, bg.nl(this.version), bg.nl(this.eDW), this.rYt, new WePkgDownloader.IWepkgUpdateCallback()
    {
      public final void a(String paramAnonymousString1, String paramAnonymousString2, WePkgDownloader.IWepkgUpdateCallback.RetCode paramAnonymousRetCode)
      {
        GMTrace.i(15191836196864L, 113188);
        w.i("MicroMsg.Wepkg.WepkgDownloadProcessTask", "onPkgUpdatingCallback errCode:%s", new Object[] { paramAnonymousRetCode });
        WepkgDownloadProcessTask.this.eZq = paramAnonymousString1;
        WepkgDownloadProcessTask.this.hKI = paramAnonymousString2;
        WepkgDownloadProcessTask.this.rYu = paramAnonymousRetCode;
        WepkgDownloadProcessTask.this.VN();
        WepkgDownloadProcessTask.a(WepkgDownloadProcessTask.this);
        GMTrace.o(15191836196864L, 113188);
      }
    });
    GMTrace.o(15173582585856L, 113052);
  }
  
  public final void VK()
  {
    GMTrace.i(15173716803584L, 113053);
    if (this.hYr != null) {
      this.hYr.run();
    }
    GMTrace.o(15173716803584L, 113053);
  }
  
  public final void j(Parcel paramParcel)
  {
    GMTrace.i(15173851021312L, 113054);
    this.fileType = paramParcel.readInt();
    this.eZq = paramParcel.readString();
    this.rYr = paramParcel.readString();
    this.downloadUrl = paramParcel.readString();
    this.rYs = paramParcel.readLong();
    this.version = paramParcel.readString();
    this.eDW = paramParcel.readString();
    this.rYt = paramParcel.readInt();
    this.hKI = paramParcel.readString();
    this.rYu = ((WePkgDownloader.IWepkgUpdateCallback.RetCode)paramParcel.readParcelable(WePkgDownloader.IWepkgUpdateCallback.RetCode.class.getClassLoader()));
    GMTrace.o(15173851021312L, 113054);
  }
  
  public final void v(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(15173985239040L, 113055);
    paramParcel.writeInt(this.fileType);
    paramParcel.writeString(this.eZq);
    paramParcel.writeString(this.rYr);
    paramParcel.writeString(this.downloadUrl);
    paramParcel.writeLong(this.rYs);
    paramParcel.writeString(this.version);
    paramParcel.writeString(this.eDW);
    paramParcel.writeInt(this.rYt);
    paramParcel.writeString(this.hKI);
    paramParcel.writeParcelable(this.rYu, paramInt);
    GMTrace.o(15173985239040L, 113055);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\wepkg\model\WepkgDownloadProcessTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */