package com.tencent.mm.plugin.webview.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelcdntran.d;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public abstract class WebViewJSSDKFileItem
  implements Parcelable
{
  public String appId;
  public int eGK;
  public String eHy;
  public String euR;
  public String hOo;
  public String hOp;
  public boolean hOr;
  public boolean hOs;
  public boolean hOt;
  public String idL;
  public String mediaId;
  public a rEC;
  
  public WebViewJSSDKFileItem()
  {
    GMTrace.i(12004567810048L, 89441);
    this.hOs = true;
    this.hOt = true;
    GMTrace.o(12004567810048L, 89441);
  }
  
  protected WebViewJSSDKFileItem(Parcel paramParcel)
  {
    GMTrace.i(16931969040384L, 126153);
    this.hOs = true;
    this.hOt = true;
    this.appId = paramParcel.readString();
    this.eHy = paramParcel.readString();
    this.idL = paramParcel.readString();
    this.hOo = paramParcel.readString();
    this.eGK = paramParcel.readInt();
    GMTrace.o(16931969040384L, 126153);
  }
  
  public static WebViewJSSDKFileItem Lh(String paramString)
  {
    GMTrace.i(12004702027776L, 89442);
    WebViewJSSDKImageItem localWebViewJSSDKImageItem = new WebViewJSSDKImageItem();
    localWebViewJSSDKImageItem.hOo = paramString;
    localWebViewJSSDKImageItem.bCk();
    localWebViewJSSDKImageItem.mediaId = d.a("jsupimg", bg.Pv(), localWebViewJSSDKImageItem.eHy, localWebViewJSSDKImageItem.eHy);
    GMTrace.o(12004702027776L, 89442);
    return localWebViewJSSDKImageItem;
  }
  
  public static WebViewJSSDKFileItem Li(String paramString)
  {
    GMTrace.i(12004836245504L, 89443);
    WebViewJSSDKVoiceItem localWebViewJSSDKVoiceItem = new WebViewJSSDKVoiceItem();
    localWebViewJSSDKVoiceItem.euR = paramString;
    localWebViewJSSDKVoiceItem.bCk();
    localWebViewJSSDKVoiceItem.mediaId = d.a("jsupvoice", bg.Pv(), localWebViewJSSDKVoiceItem.eHy, localWebViewJSSDKVoiceItem.eHy);
    GMTrace.o(12004836245504L, 89443);
    return localWebViewJSSDKVoiceItem;
  }
  
  public static WebViewJSSDKVideoItem Lj(String paramString)
  {
    GMTrace.i(12004970463232L, 89444);
    WebViewJSSDKVideoItem localWebViewJSSDKVideoItem = new WebViewJSSDKVideoItem();
    localWebViewJSSDKVideoItem.hOo = paramString;
    localWebViewJSSDKVideoItem.bCk();
    localWebViewJSSDKVideoItem.mediaId = d.a("jsvideofile", bg.Pv(), localWebViewJSSDKVideoItem.eHy, localWebViewJSSDKVideoItem.eHy);
    w.d("MicroMsg.WebViewJSSDKFileItem", "filepath = %s, localid = %s, mediaid = %s", new Object[] { paramString, localWebViewJSSDKVideoItem.eHy, localWebViewJSSDKVideoItem.mediaId });
    GMTrace.o(12004970463232L, 89444);
    return localWebViewJSSDKVideoItem;
  }
  
  public static WebViewJSSDKFileItem v(int paramInt, String paramString1, String paramString2)
  {
    GMTrace.i(16931834822656L, 126152);
    WebViewJSSDKUpFileItem localWebViewJSSDKUpFileItem = new WebViewJSSDKUpFileItem();
    localWebViewJSSDKUpFileItem.fileType = paramInt;
    localWebViewJSSDKUpFileItem.lIx = paramString1;
    localWebViewJSSDKUpFileItem.hOo = paramString2;
    localWebViewJSSDKUpFileItem.bCk();
    localWebViewJSSDKUpFileItem.mediaId = d.a("jsupfile", bg.Pv(), localWebViewJSSDKUpFileItem.eHy, localWebViewJSSDKUpFileItem.eHy);
    w.d("MicroMsg.WebViewJSSDKFileItem", "fileType=%d, origFilePath=%s, localId=%s", new Object[] { Integer.valueOf(paramInt), paramString2, localWebViewJSSDKUpFileItem.eHy });
    GMTrace.o(16931834822656L, 126152);
    return localWebViewJSSDKUpFileItem;
  }
  
  public void b(keep_SceneResult paramkeep_SceneResult)
  {
    GMTrace.i(12005104680960L, 89445);
    if (this.rEC == null) {
      this.rEC = new a();
    }
    if (paramkeep_SceneResult == null)
    {
      w.e("MicroMsg.WebViewJSSDKFileItem", "sceneResult info is null");
      GMTrace.o(12005104680960L, 89445);
      return;
    }
    this.rEC.field_aesKey = paramkeep_SceneResult.field_aesKey;
    this.rEC.field_fileId = paramkeep_SceneResult.field_fileId;
    this.rEC.field_fileUrl = paramkeep_SceneResult.field_fileUrl;
    this.rEC.field_fileLength = paramkeep_SceneResult.field_fileLength;
    GMTrace.o(12005104680960L, 89445);
  }
  
  public abstract WebViewJSSDKFileItem bCk();
  
  public abstract String bCl();
  
  public abstract String bCm();
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(16932103258112L, 126154);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.eHy);
    paramParcel.writeString(this.idL);
    paramParcel.writeString(this.hOo);
    paramParcel.writeInt(this.eGK);
    GMTrace.o(16932103258112L, 126154);
  }
  
  public static final class a
  {
    public String field_aesKey;
    public String field_fileId;
    public int field_fileLength;
    public String field_fileUrl;
    
    public a()
    {
      GMTrace.i(11996380528640L, 89380);
      GMTrace.o(11996380528640L, 89380);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\model\WebViewJSSDKFileItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */