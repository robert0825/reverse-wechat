package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.tencent.smtt.sdk.a.c;

final class b
  implements com.tencent.smtt.export.external.interfaces.DownloadListener
{
  private DownloadListener xTw;
  private WebView xTx;
  
  public b(WebView paramWebView, DownloadListener paramDownloadListener)
  {
    this.xTw = paramDownloadListener;
    this.xTx = paramWebView;
  }
  
  public final void onDownloadStart(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong)
  {
    onDownloadStart(paramString1, null, null, paramString2, paramString3, paramString4, paramLong, null, null);
  }
  
  public final void onDownloadStart(String paramString1, String paramString2, byte[] paramArrayOfByte, String paramString3, String paramString4, String paramString5, long paramLong, String paramString6, String paramString7)
  {
    if (this.xTw == null)
    {
      if (QbSdk.canOpenMimeFileType(this.xTx.getContext(), paramString5))
      {
        paramString2 = new Intent("com.tencent.QQBrowser.action.sdk.document");
        paramString2.setFlags(268435456);
        paramString2.putExtra("key_reader_sdk_url", paramString1);
        paramString2.putExtra("key_reader_sdk_type", 1);
        paramString2.setData(Uri.parse(paramString1));
        this.xTx.getContext().startActivity(paramString2);
        return;
      }
      c.a(this.xTx.getContext(), paramString1, null, null);
      return;
    }
    this.xTw.onDownloadStart(paramString1, paramString3, paramString4, paramString5, paramLong);
  }
  
  public final void onDownloadVideo(String paramString, long paramLong, int paramInt) {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\smtt\sdk\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */