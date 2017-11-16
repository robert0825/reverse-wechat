package com.tencent.mm.plugin.webview.modelcache.downloaderimpl;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.j.a.d.l;
import com.tencent.mm.pluginsdk.j.a.d.o;
import com.tencent.mm.pluginsdk.j.a.d.o.a;
import com.tencent.mm.pluginsdk.j.a.d.q;
import com.tencent.mm.sdk.platformtools.w;

final class b
{
  static void c(String paramString, l paraml)
  {
    GMTrace.i(12357291999232L, 92069);
    q localq = o.a.trx.OO(paramString);
    if (localq == null)
    {
      w.e("MicroMsg.ResDownloader.WebViewCache.DoResponseLogic", "networkRequest already completed, but get null record with urlKey = %s", new Object[] { paramString });
      GMTrace.o(12357291999232L, 92069);
      return;
    }
    if (!"WebViewCache".equals(localq.field_groupId1))
    {
      w.e("MicroMsg.ResDownloader.WebViewCache.DoResponseLogic", "mismatch groupId, urlKey = %s, record.groupId = %s", new Object[] { paramString, localq.field_groupId1 });
      GMTrace.o(12357291999232L, 92069);
      return;
    }
    localq.field_contentType = paraml.eYU;
    o.a.trx.e(localq);
    paramString = new f(localq.field_url, localq.field_filePath, localq.field_fileVersion, localq.field_appId, localq.field_groupId2, localq.field_packageId, localq.field_wvCacheType, paraml.eYU, paraml.eYV, paraml.tro);
    WebViewCacheDownloadHelper.bCL();
    WebViewCacheDownloadHelper.a(paramString);
    GMTrace.o(12357291999232L, 92069);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\modelcache\downloaderimpl\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */