package com.tencent.mm.plugin.webview.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class WebViewJSSDKUpFileItem
  extends WebViewJSSDKFileItem
{
  public static final Parcelable.Creator<WebViewJSSDKUpFileItem> CREATOR;
  public int fileType;
  public String lIx;
  
  static
  {
    GMTrace.i(16930626863104L, 126143);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(16930626863104L, 126143);
  }
  
  public WebViewJSSDKUpFileItem()
  {
    GMTrace.i(12020002848768L, 89556);
    this.fileType = -1;
    this.eGK = 3;
    GMTrace.o(12020002848768L, 89556);
  }
  
  public WebViewJSSDKUpFileItem(byte paramByte)
  {
    GMTrace.i(16930492645376L, 126142);
    this.fileType = -1;
    GMTrace.o(16930492645376L, 126142);
  }
  
  public final void b(keep_SceneResult paramkeep_SceneResult)
  {
    GMTrace.i(12020271284224L, 89558);
    super.b(paramkeep_SceneResult);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(this.fileType);
    localArrayList.add(this.lIx);
    localArrayList.add(paramkeep_SceneResult.field_fileId);
    localArrayList.add(paramkeep_SceneResult.field_aesKey);
    localArrayList.add(paramkeep_SceneResult.field_fileLength);
    Context localContext = ab.getContext();
    if (am.isWifi(localContext)) {
      localArrayList.add("1");
    }
    for (;;)
    {
      w.d("MicroMsg.WebViewJSSDKVoiceItem", "fileType=%d, initUrl=%s, field_fileId=%s", new Object[] { Integer.valueOf(this.fileType), this.lIx, paramkeep_SceneResult.field_fileId });
      g.ork.d(12018, localArrayList);
      paramkeep_SceneResult = this.hOo;
      if (!bg.nm(paramkeep_SceneResult))
      {
        paramkeep_SceneResult = new File(paramkeep_SceneResult);
        if (paramkeep_SceneResult.exists()) {
          paramkeep_SceneResult.delete();
        }
      }
      GMTrace.o(12020271284224L, 89558);
      return;
      if (am.is3G(localContext)) {
        localArrayList.add("4");
      } else if (am.is4G(localContext)) {
        localArrayList.add("5");
      } else if (am.is2G(localContext)) {
        localArrayList.add("3");
      } else if (am.isWap(localContext)) {
        localArrayList.add("2");
      } else {
        localArrayList.add("0");
      }
    }
  }
  
  public final WebViewJSSDKFileItem bCk()
  {
    GMTrace.i(12020137066496L, 89557);
    this.eHy = ai.Ln(this.hOo);
    GMTrace.o(12020137066496L, 89557);
    return this;
  }
  
  public final String bCl()
  {
    GMTrace.i(12020405501952L, 89559);
    GMTrace.o(12020405501952L, 89559);
    return "file";
  }
  
  public final String bCm()
  {
    GMTrace.i(12020539719680L, 89560);
    GMTrace.o(12020539719680L, 89560);
    return "nomal";
  }
  
  public int describeContents()
  {
    GMTrace.i(16930224209920L, 126140);
    GMTrace.o(16930224209920L, 126140);
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(16930358427648L, 126141);
    GMTrace.o(16930358427648L, 126141);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\model\WebViewJSSDKUpFileItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */