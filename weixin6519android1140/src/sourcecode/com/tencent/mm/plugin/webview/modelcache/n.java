package com.tencent.mm.plugin.webview.modelcache;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.g.a.bl;
import com.tencent.mm.g.a.tj;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelsfs.SFSContext.Builder;
import com.tencent.mm.plugin.webview.modelcache.downloaderimpl.WebViewCacheDownloadHelper;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.e.g;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bt.a;

public final class n
{
  public final bt.a rFQ;
  public final com.tencent.mm.sdk.b.c rFR;
  public final com.tencent.mm.sdk.b.c rFS;
  
  public n()
  {
    GMTrace.i(12357963087872L, 92074);
    this.rFQ = new bt.a()
    {
      public final void a(d.a paramAnonymousa)
      {
        GMTrace.i(12363466014720L, 92115);
        paramAnonymousa = paramAnonymousa.gtM;
        if (paramAnonymousa.tPY == null)
        {
          GMTrace.o(12363466014720L, 92115);
          return;
        }
        if (bg.nm(com.tencent.mm.platformtools.n.a(paramAnonymousa.tPY)))
        {
          GMTrace.o(12363466014720L, 92115);
          return;
        }
        w.d("MicroMsg.WebViewCacheSubCoreToolsExtension", "can not do brand pre-push");
        GMTrace.o(12363466014720L, 92115);
      }
    };
    this.rFR = new com.tencent.mm.sdk.b.c() {};
    this.rFS = new com.tencent.mm.sdk.b.c()
    {
      private static boolean a(bl paramAnonymousbl)
      {
        GMTrace.i(12365345062912L, 92129);
        if ((paramAnonymousbl == null) || (!(paramAnonymousbl instanceof bl)))
        {
          GMTrace.o(12365345062912L, 92129);
          return false;
        }
        if (ab.getContext() != null)
        {
          paramAnonymousbl = new Intent();
          paramAnonymousbl.setComponent(new ComponentName(e.g.vGK, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
          paramAnonymousbl.putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_CLEAR_WEBVIEW_CACHE");
          ab.getContext().sendBroadcast(paramAnonymousbl);
        }
        FileOp.kR(e.fSl);
        FileOp.B(e.fSl, false);
        WebViewCacheDownloadHelper.bCM();
        n.bCK();
        GMTrace.o(12365345062912L, 92129);
        return false;
      }
    };
    GMTrace.o(12357963087872L, 92074);
  }
  
  public static void bCK()
  {
    GMTrace.i(12358097305600L, 92075);
    try
    {
      com.tencent.mm.y.c localc = at.AR();
      if (localc == null)
      {
        GMTrace.o(12358097305600L, 92075);
        return;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.WebViewCacheSubCoreToolsExtension", "setupSFS, getAccStg, exception = %s", new Object[] { localException });
        Object localObject = null;
      }
      FileOp.la(e.fSl + "sfs");
      FileOp.a(e.fSl, null, new SFSContext.Builder().setDBDirectory(com.tencent.mm.y.c.zn() + "sfs").setStoragePath(e.fSl + "sfs").setName("wvcache"));
      GMTrace.o(12358097305600L, 92075);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\modelcache\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */