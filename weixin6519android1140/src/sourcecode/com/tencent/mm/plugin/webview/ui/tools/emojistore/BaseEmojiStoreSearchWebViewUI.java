package com.tencent.mm.plugin.webview.ui.tools.emojistore;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI.i;
import com.tencent.mm.plugin.webview.ui.tools.f;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d.44;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.i.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.tools.p;
import com.tencent.mm.ui.tools.p.b;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView;
import java.util.HashMap;
import java.util.Map;

public class BaseEmojiStoreSearchWebViewUI
  extends WebViewUI
  implements p.b
{
  String eQb;
  private p jtA;
  private boolean rNN;
  private boolean rNO;
  private int rNP;
  private int type;
  
  public BaseEmojiStoreSearchWebViewUI()
  {
    GMTrace.i(12343467573248L, 91966);
    this.rNO = true;
    GMTrace.o(12343467573248L, 91966);
  }
  
  public final void QA()
  {
    GMTrace.i(12344407097344L, 91973);
    this.jtA.chX();
    aLs();
    GMTrace.o(12344407097344L, 91973);
  }
  
  public final void QB()
  {
    GMTrace.i(16916265566208L, 126036);
    GMTrace.o(16916265566208L, 126036);
  }
  
  public final void Qy()
  {
    GMTrace.i(12344004444160L, 91970);
    finish();
    GMTrace.o(12344004444160L, 91970);
  }
  
  public final void Qz()
  {
    GMTrace.i(12343736008704L, 91968);
    GMTrace.o(12343736008704L, 91968);
  }
  
  protected final void aaO()
  {
    GMTrace.i(12343601790976L, 91967);
    super.aaO();
    this.eQb = getIntent().getStringExtra("keyword");
    this.type = getIntent().getIntExtra("type", 0);
    this.rNN = getIntent().getBooleanExtra("showkeyboard", false);
    this.rNP = getIntent().getIntExtra("sence", 0);
    this.nXD.setWebViewClient(new a());
    this.nXD.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(12346823016448L, 91991);
        BaseEmojiStoreSearchWebViewUI.this.aLo();
        GMTrace.o(12346823016448L, 91991);
        return false;
      }
    });
    this.jtA = new p();
    a(this.jtA);
    this.jtA.mD(false);
    this.jtA.xiS = this;
    lg(false);
    if (this.rMj != null) {
      this.rMj.jw(true);
    }
    this.nXD.setOnLongClickListener(new View.OnLongClickListener()
    {
      public final boolean onLongClick(View paramAnonymousView)
      {
        GMTrace.i(12343064920064L, 91963);
        GMTrace.o(12343064920064L, 91963);
        return true;
      }
    });
    GMTrace.o(12343601790976L, 91967);
  }
  
  protected final void bEb()
  {
    GMTrace.i(12344675532800L, 91975);
    finish();
    GMTrace.o(12344675532800L, 91975);
  }
  
  protected final boolean bEp()
  {
    GMTrace.i(12345078185984L, 91978);
    GMTrace.o(12345078185984L, 91978);
    return true;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(12344809750528L, 91976);
    int i = R.i.cvg;
    GMTrace.o(12344809750528L, 91976);
    return i;
  }
  
  public final boolean nC(String paramString)
  {
    GMTrace.i(12344272879616L, 91972);
    String str = paramString;
    if (paramString != null) {
      str = paramString.trim();
    }
    this.eQb = str;
    if (!bg.nm(str))
    {
      this.eQb = str;
      this.handler.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(12346554580992L, 91989);
          if (BaseEmojiStoreSearchWebViewUI.b(BaseEmojiStoreSearchWebViewUI.this) != null) {
            BaseEmojiStoreSearchWebViewUI.c(BaseEmojiStoreSearchWebViewUI.this).bFs();
          }
          GMTrace.o(12346554580992L, 91989);
        }
      });
      paramString = new Bundle();
      paramString.putInt("type", this.type);
      paramString.putString("nextPageBuffer", "");
      paramString.putString("keyword", this.eQb);
      paramString.putInt("webview_instance_id", hashCode());
      paramString.putLong("searchID", this.rBw.bFt());
    }
    try
    {
      if (this.ioh != null) {
        this.ioh.p(1, paramString);
      }
      for (;;)
      {
        aLo();
        paramString = "";
        if (!bg.nm(str)) {
          paramString = str.replace(",", " ");
        }
        g.ork.i(13054, new Object[] { Integer.valueOf(this.rNP), Integer.valueOf(1), paramString });
        GMTrace.o(12344272879616L, 91972);
        return false;
        w.e("MicroMsg.emoji.BaseEmojiStoreSearchWebViewUI", "invoker should not be null");
      }
    }
    catch (RemoteException paramString)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.emoji.BaseEmojiStoreSearchWebViewUI", paramString, "doSearch", new Object[0]);
      }
    }
  }
  
  public final void nD(String paramString)
  {
    GMTrace.i(12344138661888L, 91971);
    if ((this.rNO) && (bg.nm(paramString)))
    {
      this.rNO = false;
      if (!this.rNN)
      {
        af.i(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(12346286145536L, 91987);
            BaseEmojiStoreSearchWebViewUI.a(BaseEmojiStoreSearchWebViewUI.this).clearFocus();
            BaseEmojiStoreSearchWebViewUI.this.aLo();
            GMTrace.o(12346286145536L, 91987);
          }
        }, 500L);
        GMTrace.o(12344138661888L, 91971);
        return;
      }
      this.jtA.chX();
      aLs();
    }
    GMTrace.o(12344138661888L, 91971);
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    GMTrace.i(12343870226432L, 91969);
    if (this.jtA != null)
    {
      this.jtA.a(this, paramMenu);
      this.jtA.setHint(getString(R.l.doo));
    }
    GMTrace.o(12343870226432L, 91969);
    return true;
  }
  
  protected void onDestroy()
  {
    GMTrace.i(12344943968256L, 91977);
    super.onDestroy();
    GMTrace.o(12344943968256L, 91977);
  }
  
  protected void r(int paramInt, Bundle paramBundle)
  {
    GMTrace.i(12344541315072L, 91974);
    w.i("MicroMsg.emoji.BaseEmojiStoreSearchWebViewUI", "handleEmojiStoreAction action:%d", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    default: 
      super.r(paramInt, paramBundle);
      GMTrace.o(12344541315072L, 91974);
      return;
    case 80001: 
      String str1 = paramBundle.getString("emoji_store_json_data");
      boolean bool = paramBundle.getBoolean("emoji_store_new_query", true);
      String str2 = paramBundle.getString("emoji_store_page_buf");
      long l = paramBundle.getLong("emoji_store_search_id");
      paramBundle = this.rBw;
      if (!paramBundle.rSa)
      {
        w.e("MicroMsg.JsApiHandler", "onEmojiStoreGetSearchData fail, not ready");
        GMTrace.o(12344541315072L, 91974);
        return;
      }
      w.i("MicroMsg.JsApiHandler", "onEmojiStoreGetSearchData success, ready");
      HashMap localHashMap = new HashMap();
      localHashMap.put("json", str1);
      localHashMap.put("newQuery", Boolean.valueOf(bool));
      localHashMap.put("nextPageBuffer", str2);
      w.d("MicroMsg.JsApiHandler", "cpan emoji set SearchID:%d", new Object[] { Long.valueOf(l) });
      paramBundle.rSl = l;
      str1 = i.a.a("getSearchEmotionDataCallBack", localHashMap, paramBundle.rSc, paramBundle.rSd);
      w.i("MicroMsg.JsApiHandler", "event:%s", new Object[] { str1 });
      af.t(new d.44(paramBundle, str1));
      GMTrace.o(12344541315072L, 91974);
      return;
    }
    this.rBw.bFs();
    GMTrace.o(12344541315072L, 91974);
  }
  
  private final class a
    extends WebViewUI.i
  {
    public a()
    {
      super();
      GMTrace.i(12345615056896L, 91982);
      GMTrace.o(12345615056896L, 91982);
    }
    
    public final void a(WebView paramWebView, String paramString)
    {
      GMTrace.i(19393790607360L, 144495);
      w.i("MicroMsg.emoji.BaseEmojiStoreSearchWebViewUI", "onPageFinished url:%s", new Object[] { paramString });
      super.a(paramWebView, paramString);
      BaseEmojiStoreSearchWebViewUI.this.lg(false);
      BaseEmojiStoreSearchWebViewUI.a(BaseEmojiStoreSearchWebViewUI.this).WP(BaseEmojiStoreSearchWebViewUI.this.eQb);
      GMTrace.o(19393790607360L, 144495);
    }
    
    public final void b(WebView paramWebView, String paramString, Bitmap paramBitmap)
    {
      GMTrace.i(19393924825088L, 144496);
      super.b(paramWebView, paramString, paramBitmap);
      BaseEmojiStoreSearchWebViewUI.this.lg(false);
      GMTrace.o(19393924825088L, 144496);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\emojistore\BaseEmojiStoreSearchWebViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */