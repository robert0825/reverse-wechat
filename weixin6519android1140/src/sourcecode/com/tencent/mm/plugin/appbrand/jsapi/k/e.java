package com.tencent.mm.plugin.appbrand.jsapi.k;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.webkit.ValueCallback;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.scanner.a;
import com.tencent.mm.plugin.webview.modeltools.c;
import com.tencent.mm.plugin.webview.modeltools.g.c;
import com.tencent.mm.plugin.webview.stub.WebviewScanImageActivity;
import com.tencent.mm.plugin.webview.ui.tools.widget.MMWebViewWithJsApi;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.pluginsdk.ui.tools.s.b;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.tools.l;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase.HitTestResult;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase.HitTestResult.ImageData;
import com.tencent.xweb.WebView.a;
import com.tencent.xweb.b;
import com.tencent.xweb.h.a;
import org.json.JSONObject;

public class e
  implements View.OnCreateContextMenuListener, c.b
{
  public MMWebViewWithJsApi ioe;
  private b iof;
  private a iog;
  public com.tencent.mm.plugin.webview.stub.d ioh;
  public com.tencent.mm.plugin.webview.ui.tools.e ioi;
  public String ioj;
  public l iok;
  public String iol;
  int iom;
  int ion;
  com.tencent.mm.plugin.webview.modeltools.g ioo;
  WebView.a iop;
  IX5WebViewBase.HitTestResult ioq;
  public final c.c ior;
  public com.tencent.mm.plugin.webview.ui.tools.widget.g ios;
  private g.c iot;
  public final c rMk;
  
  public e(c.c paramc)
  {
    GMTrace.i(19508278329344L, 145348);
    this.rMk = new c();
    this.ios = new com.tencent.mm.plugin.webview.ui.tools.widget.g()
    {
      public final Bundle d(int paramAnonymousInt, Bundle paramAnonymousBundle)
      {
        GMTrace.i(19506533498880L, 145335);
        Bundle localBundle = new Bundle();
        localBundle.putString("key_webview_container_env", "miniProgram");
        switch (paramAnonymousInt)
        {
        }
        for (;;)
        {
          GMTrace.o(19506533498880L, 145335);
          return localBundle;
          paramAnonymousBundle = paramAnonymousBundle.getString("info");
          try
          {
            paramAnonymousBundle = new JSONObject(paramAnonymousBundle);
            e.this.ior.n(paramAnonymousBundle);
          }
          catch (Exception paramAnonymousBundle) {}
          continue;
          paramAnonymousBundle.setClassLoader(e.class.getClassLoader());
          com.tencent.mm.bj.d.b(e.this.ioe.getContext(), paramAnonymousBundle.getString("open_ui_with_webview_ui_plugin_name"), paramAnonymousBundle.getString("open_ui_with_webview_ui_plugin_entry"), new Intent().putExtras(paramAnonymousBundle.getBundle("open_ui_with_webview_ui_extras")));
          continue;
          localBundle.putInt("key_webview_preverify_info_scene", 1);
          localBundle.putString("key_webview_preverify_info_source_appid", e.this.ior.getAppId());
        }
      }
      
      public final void e(String paramAnonymousString1, final String paramAnonymousString2, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(19506667716608L, 145336);
        w.d("MicroMsg.AppBrand.HTMLWebViewLogicDelegate", "result: " + paramAnonymousString2);
        if ((e.this.ioo == null) || (paramAnonymousString1 == null) || (!paramAnonymousString1.equals(e.this.ioo.rHl)))
        {
          GMTrace.o(19506667716608L, 145336);
          return;
        }
        if (e.this.ioo != null) {
          e.this.ioo.bDa();
        }
        e.this.iom = paramAnonymousInt1;
        e.this.ion = paramAnonymousInt2;
        if ((paramAnonymousString2 == null) || (e.this.iok == null))
        {
          GMTrace.o(19506667716608L, 145336);
          return;
        }
        e.this.ior.runOnUiThread(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(19505728192512L, 145329);
            e.this.iol = paramAnonymousString2;
            e.this.iok.b(e.this.ioe, new View.OnCreateContextMenuListener()
            {
              public final void onCreateContextMenu(ContextMenu paramAnonymous3ContextMenu, View paramAnonymous3View, ContextMenu.ContextMenuInfo paramAnonymous3ContextMenuInfo)
              {
                GMTrace.i(19506265063424L, 145333);
                if (e.this.iop != null)
                {
                  w.d("MicroMsg.AppBrand.HTMLWebViewLogicDelegate", "show webkit menu");
                  e.this.a(paramAnonymous3ContextMenu, e.this.iop);
                  e.this.iop = null;
                  GMTrace.o(19506265063424L, 145333);
                  return;
                }
                if (e.this.ioq != null)
                {
                  w.d("MicroMsg.AppBrand.HTMLWebViewLogicDelegate", "show IX5 menu");
                  e.this.a(paramAnonymous3ContextMenu, e.this.ioq);
                  e.this.ioq = null;
                }
                GMTrace.o(19506265063424L, 145333);
              }
            }, null);
            e.this.iok.bpI();
            GMTrace.o(19505728192512L, 145329);
          }
        });
        GMTrace.o(19506667716608L, 145336);
      }
    };
    this.iot = new g.c()
    {
      public final void qV(String paramAnonymousString)
      {
        GMTrace.i(19505459757056L, 145327);
        try
        {
          if (e.this.ioh != null)
          {
            e.this.ioh.LQ(paramAnonymousString);
            GMTrace.o(19505459757056L, 145327);
            return;
          }
          w.i("MicroMsg.AppBrand.HTMLWebViewLogicDelegate", "viewCaptureCallback, invoker is null");
          GMTrace.o(19505459757056L, 145327);
          return;
        }
        catch (RemoteException paramAnonymousString)
        {
          w.e("MicroMsg.AppBrand.HTMLWebViewLogicDelegate", "recog failed");
          GMTrace.o(19505459757056L, 145327);
        }
      }
    };
    this.ior = paramc;
    this.ioe = ((MMWebViewWithJsApi)paramc.XW());
    this.iof = new b(this.ioe);
    this.iog = new a(this.ioe);
    this.ioe.setWebViewClient(this.iof);
    this.ioe.setWebChromeClient(this.iog);
    this.ioe.rVG = true;
    this.iok = new l(this.ioe.getContext());
    this.iok.a(this.ioe, this, null);
    this.iok.e(new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(19510023159808L, 145361);
        if ((e.this.ioo != null) && (e.this.ioh != null)) {
          try
          {
            e.this.ioh.LR(e.this.ioo.rHl);
            e.this.ioo.bDa();
            GMTrace.o(19510023159808L, 145361);
            return;
          }
          catch (Exception paramAnonymousDialogInterface)
          {
            w.e("MicroMsg.AppBrand.HTMLWebViewLogicDelegate", "cancel capture failed");
          }
        }
        GMTrace.o(19510023159808L, 145361);
      }
    });
    GMTrace.o(19508278329344L, 145348);
  }
  
  private boolean a(ContextMenu paramContextMenu, final String paramString)
  {
    GMTrace.i(19508546764800L, 145350);
    try
    {
      bool1 = this.ioh.isSDCardAvailable();
      if (!bool1)
      {
        GMTrace.o(19508546764800L, 145350);
        return true;
      }
    }
    catch (Exception localException1)
    {
      for (;;)
      {
        w.e("MicroMsg.AppBrand.HTMLWebViewLogicDelegate", "onCreateContextMenu fail, ex = " + localException1.getMessage());
        bool1 = false;
      }
      if (this.ioi == null)
      {
        GMTrace.o(19508546764800L, 145350);
        return true;
      }
      boolean bool1 = false;
      paramContextMenu.setHeaderTitle(R.l.elA);
      try
      {
        bool2 = this.ioh.aDJ();
        bool1 = bool2;
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          boolean bool2;
          boolean bool3;
          final String str3;
          String str1;
          w.e("MicroMsg.AppBrand.HTMLWebViewLogicDelegate", "get has setuin failed : %s", new Object[] { localException2.getMessage() });
          continue;
          String str2 = this.ioe.getContext().getString(R.l.dQg);
        }
        GMTrace.o(19508546764800L, 145350);
      }
      bool2 = this.ioi.bDN().bOg();
      bool3 = this.ioi.bDN().bOh();
      w.i("MicroMsg.AppBrand.HTMLWebViewLogicDelegate", "hasSetAcc = %b, canShareImage = %b, canFavImage = %b", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
      if ((bool1) && (bool2)) {
        paramContextMenu.add(0, 0, 0, this.ioe.getContext().getString(R.l.dPA)).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            GMTrace.i(19505996627968L, 145331);
            try
            {
              boolean bool = e.this.ioh.isSDCardAvailable();
              s.a(e.this.ioe.getContext(), paramString, b.crS().getCookie(paramString), bool, new s.b()
              {
                public final void qU(String paramAnonymous2String)
                {
                  GMTrace.i(19509486288896L, 145357);
                  if (bg.nm(paramAnonymous2String))
                  {
                    w.w("MicroMsg.AppBrand.HTMLWebViewLogicDelegate", "share image to friend fail, imgPath is null");
                    GMTrace.o(19509486288896L, 145357);
                    return;
                  }
                  e locale = e.this;
                  Intent localIntent = new Intent();
                  localIntent.putExtra("Retr_File_Name", paramAnonymous2String);
                  localIntent.putExtra("Retr_Compress_Type", 0);
                  localIntent.putExtra("Retr_Msg_Type", 0);
                  if (localIntent.getIntExtra("Retr_Msg_Type", -1) < 0) {
                    localIntent.putExtra("Retr_Msg_Type", 4);
                  }
                  com.tencent.mm.bj.d.a(locale.ioe.getContext(), ".ui.transmit.MsgRetransmitUI", localIntent);
                  GMTrace.o(19509486288896L, 145357);
                }
              });
              GMTrace.o(19505996627968L, 145331);
              return true;
            }
            catch (Exception paramAnonymousMenuItem)
            {
              for (;;)
              {
                w.e("MicroMsg.AppBrand.HTMLWebViewLogicDelegate", "onMenuItemClick fail, ex = " + paramAnonymousMenuItem.getMessage());
              }
            }
          }
        });
      }
      paramContextMenu.add(0, 0, 0, this.ioe.getContext().getString(R.l.dUM)).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(19507204587520L, 145340);
          try
          {
            bool = e.this.ioh.isSDCardAvailable();
          }
          catch (Exception paramAnonymousMenuItem)
          {
            try
            {
              for (;;)
              {
                s.a(e.this.ioe.getContext(), paramString, b.crS().getCookie(paramString), bool);
                GMTrace.o(19507204587520L, 145340);
                return true;
                paramAnonymousMenuItem = paramAnonymousMenuItem;
                w.e("MicroMsg.AppBrand.HTMLWebViewLogicDelegate", "onMenuItemClick fail, ex = " + paramAnonymousMenuItem.getMessage());
                boolean bool = false;
              }
            }
            catch (Exception paramAnonymousMenuItem)
            {
              for (;;)
              {
                w.e("MicroMsg.AppBrand.HTMLWebViewLogicDelegate", "save to sdcard failed : %s", new Object[] { paramAnonymousMenuItem.getMessage() });
              }
            }
          }
        }
      });
      if ((bool1) && (bool3)) {
        paramContextMenu.add(0, 0, 0, this.ioe.getContext().getString(R.l.dNH)).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            GMTrace.i(19509217853440L, 145355);
            try
            {
              boolean bool = e.this.ioh.isSDCardAvailable();
              paramAnonymousMenuItem = paramString.replaceAll("tp=webp", "");
              s.a(e.this.ioe.getContext(), paramAnonymousMenuItem, b.crS().getCookie(paramAnonymousMenuItem), bool, new s.b()
              {
                public final void qU(String paramAnonymous2String)
                {
                  GMTrace.i(19510291595264L, 145363);
                  e locale = e.this;
                  try
                  {
                    if (locale.ioh.LO(paramAnonymous2String) == 0) {
                      Toast.makeText(locale.ioe.getContext(), locale.ioe.getContext().getString(R.l.duh), 0).show();
                    }
                    GMTrace.o(19510291595264L, 145363);
                    return;
                  }
                  catch (Exception paramAnonymous2String)
                  {
                    w.e("MicroMsg.AppBrand.HTMLWebViewLogicDelegate", "favoriteUrl fail, ex = " + paramAnonymous2String.getMessage());
                    GMTrace.o(19510291595264L, 145363);
                  }
                }
              });
              GMTrace.o(19509217853440L, 145355);
              return true;
            }
            catch (Exception paramAnonymousMenuItem)
            {
              for (;;)
              {
                w.e("MicroMsg.AppBrand.HTMLWebViewLogicDelegate", "onMenuItemClick fail, ex = " + paramAnonymousMenuItem.getMessage());
              }
            }
          }
        });
      }
      if (this.iol != null)
      {
        str3 = this.iol;
        if (a.an(this.iom, this.iol))
        {
          str1 = this.ioe.getContext().getString(R.l.dQh);
          paramContextMenu.add(0, 0, 0, str1).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener()
          {
            public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
            {
              GMTrace.i(19509754724352L, 145359);
              paramAnonymousMenuItem = e.this;
              String str1 = str3;
              String str2 = e.this.ioj;
              String str3 = paramString;
              int i = e.this.iom;
              int j = e.this.ion;
              if (str1 != null)
              {
                Intent localIntent = new Intent();
                localIntent.setClass(paramAnonymousMenuItem.ioe.getContext(), WebviewScanImageActivity.class);
                localIntent.putExtra("key_string_for_scan", str1);
                localIntent.putExtra("key_string_for_url", str2);
                localIntent.putExtra("key_string_for_image_url", str3);
                localIntent.putExtra("key_codetype_for_scan", i);
                localIntent.putExtra("key_codeversion_for_scan", j);
                paramAnonymousMenuItem.ioe.getContext().startActivity(localIntent);
              }
              GMTrace.o(19509754724352L, 145359);
              return false;
            }
          });
          this.iol = null;
          GMTrace.o(19508546764800L, 145350);
          return true;
        }
      }
    }
    return false;
  }
  
  public final void a(ContextMenu paramContextMenu, IX5WebViewBase.HitTestResult paramHitTestResult)
  {
    GMTrace.i(19508680982528L, 145351);
    if ((!a(paramContextMenu, ((IX5WebViewBase.HitTestResult.ImageData)paramHitTestResult.getData()).mPicUrl)) && (this.ioi.bDN().bOe()))
    {
      this.ioq = paramHitTestResult;
      this.ioo = new com.tencent.mm.plugin.webview.modeltools.g();
      this.ioo.a(this.ioe, this.iot);
    }
    GMTrace.o(19508680982528L, 145351);
  }
  
  public final void a(ContextMenu paramContextMenu, WebView.a parama)
  {
    GMTrace.i(19508815200256L, 145352);
    if ((!a(paramContextMenu, parama.mExtra)) && (this.ioi.bDN().bOe()))
    {
      this.iop = parama;
      this.ioo = new com.tencent.mm.plugin.webview.modeltools.g();
      this.ioo.a(this.ioe, this.iot);
    }
    GMTrace.o(19508815200256L, 145352);
  }
  
  public final void cleanup()
  {
    GMTrace.i(19508412547072L, 145349);
    this.iof.cleanup();
    this.ioe.destroy();
    GMTrace.o(19508412547072L, 145349);
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    GMTrace.i(19508949417984L, 145353);
    if ((paramView instanceof android.webkit.WebView))
    {
      paramView = this.ioe.getHitTestResult();
      if (paramView == null)
      {
        GMTrace.o(19508949417984L, 145353);
        return;
      }
      if ((paramView.mType == 5) || (paramView.mType == 8)) {
        a(paramContextMenu, paramView);
      }
      GMTrace.o(19508949417984L, 145353);
      return;
    }
    if ((paramView instanceof IX5WebViewBase))
    {
      paramView = ((IX5WebViewBase)paramView).getHitTestResult();
      if (paramView == null)
      {
        GMTrace.o(19508949417984L, 145353);
        return;
      }
      if ((paramView.getType() == 5) || (paramView.getType() == 8)) {
        a(paramContextMenu, paramView);
      }
    }
    GMTrace.o(19508949417984L, 145353);
  }
  
  private final class a
    extends com.tencent.mm.plugin.webview.ui.tools.widget.d
  {
    a(MMWebViewWithJsApi paramMMWebViewWithJsApi)
    {
      super();
      GMTrace.i(19506801934336L, 145337);
      GMTrace.o(19506801934336L, 145337);
    }
    
    private void a(ValueCallback<Uri> paramValueCallback, ValueCallback<Uri[]> paramValueCallback1, String paramString1, String paramString2)
    {
      GMTrace.i(21074599215104L, 157018);
      if (!(e.this.ioe.getContext() instanceof MMActivity))
      {
        GMTrace.o(21074599215104L, 157018);
        return;
      }
      final MMActivity localMMActivity = (MMActivity)e.this.ioe.getContext();
      localMMActivity.vKC = new MMActivity.a()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
        {
          GMTrace.i(21074196561920L, 157015);
          e.this.rMk.a(localMMActivity, paramAnonymousInt1, paramAnonymousInt2, paramAnonymousIntent);
          GMTrace.o(21074196561920L, 157015);
        }
      };
      e.this.rMk.a(localMMActivity, e.this.ioi, paramValueCallback, paramValueCallback1, paramString1, paramString2);
      GMTrace.o(21074599215104L, 157018);
    }
    
    public final boolean a(com.tencent.xweb.WebView paramWebView, ValueCallback<Uri[]> paramValueCallback, h.a parama)
    {
      GMTrace.i(21074464997376L, 157017);
      if (parama.getMode() == 0)
      {
        if ((parama.getAcceptTypes() == null) || (parama.getAcceptTypes().length <= 0))
        {
          w.i("MicroMsg.AppBrand.HTMLWebViewLogicDelegate", "onShowFileChooser, mode = MODE_OPEN, but params.getAcceptTypes is null");
          GMTrace.o(21074464997376L, 157017);
          return true;
        }
        String str2 = parama.getAcceptTypes()[0];
        String str1 = "*";
        paramWebView = str1;
        if (parama.isCaptureEnabled())
        {
          if (!"image/*".equalsIgnoreCase(str2)) {
            break label101;
          }
          paramWebView = "camera";
        }
        for (;;)
        {
          a(null, paramValueCallback, str2, paramWebView);
          GMTrace.o(21074464997376L, 157017);
          return true;
          label101:
          paramWebView = str1;
          if ("video/*".equalsIgnoreCase(str2)) {
            paramWebView = "camcorder";
          }
        }
      }
      GMTrace.o(21074464997376L, 157017);
      return false;
    }
    
    public final void c(com.tencent.xweb.WebView paramWebView, String paramString)
    {
      GMTrace.i(19506936152064L, 145338);
      super.c(paramWebView, paramString);
      e.this.ior.qQ(paramString);
      GMTrace.o(19506936152064L, 145338);
    }
    
    protected final void onClose()
    {
      GMTrace.i(21050708459520L, 156840);
      e.this.ior.bBP();
      GMTrace.o(21050708459520L, 156840);
    }
    
    public final void openFileChooser(ValueCallback<Uri> paramValueCallback, String paramString1, String paramString2)
    {
      GMTrace.i(21074330779648L, 157016);
      a(paramValueCallback, null, paramString1, paramString2);
      GMTrace.o(21074330779648L, 157016);
    }
  }
  
  private final class b
    extends com.tencent.mm.plugin.webview.ui.tools.widget.e
  {
    b(MMWebView paramMMWebView)
    {
      super();
      GMTrace.i(19507338805248L, 145341);
      GMTrace.o(19507338805248L, 145341);
    }
    
    protected final com.tencent.mm.plugin.webview.ui.tools.widget.g XZ()
    {
      GMTrace.i(19507473022976L, 145342);
      com.tencent.mm.plugin.webview.ui.tools.widget.g localg = e.this.ios;
      GMTrace.o(19507473022976L, 145342);
      return localg;
    }
    
    protected final int Ya()
    {
      GMTrace.i(19508009893888L, 145346);
      GMTrace.o(19508009893888L, 145346);
      return 49;
    }
    
    protected final void a(com.tencent.mm.plugin.webview.stub.d paramd, com.tencent.mm.plugin.webview.ui.tools.e parame)
    {
      GMTrace.i(19507607240704L, 145343);
      e.this.ioh = paramd;
      e.this.ioi = parame;
      GMTrace.o(19507607240704L, 145343);
    }
    
    protected final void a(com.tencent.xweb.WebView paramWebView, String paramString, Bitmap paramBitmap)
    {
      GMTrace.i(19507741458432L, 145344);
      e.this.ioj = paramString;
      e.this.ior.qR(paramString);
      GMTrace.o(19507741458432L, 145344);
    }
    
    protected final void d(com.tencent.xweb.WebView paramWebView, String paramString)
    {
      GMTrace.i(19507875676160L, 145345);
      e.this.ioj = paramString;
      e.this.ior.qS(paramString);
      GMTrace.o(19507875676160L, 145345);
    }
    
    protected final void e(Bundle paramBundle, String paramString)
    {
      GMTrace.i(19508144111616L, 145347);
      super.e(paramBundle, paramString);
      paramBundle.putString("geta8key_data_appid", e.this.ior.getAppId());
      GMTrace.o(19508144111616L, 145347);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\k\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */