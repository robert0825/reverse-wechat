package com.tencent.mm.plugin.game.gamewebview.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.webview.wepkg.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class c
  extends FrameLayout
{
  private b lIY;
  private b lIZ;
  com.tencent.mm.plugin.game.widget.b<b> lJa;
  private GameWebViewUI lJb;
  private Intent lJc;
  private long lJd;
  
  public c(final GameWebViewUI paramGameWebViewUI)
  {
    super(paramGameWebViewUI);
    GMTrace.i(19306817519616L, 143847);
    this.lJb = paramGameWebViewUI;
    this.lJa = new com.tencent.mm.plugin.game.widget.b(new com.tencent.mm.plugin.game.widget.b.a()
    {
      public final void aEi()
      {
        GMTrace.i(17985980858368L, 134006);
        paramGameWebViewUI.oF(c.a(c.this).size());
        GMTrace.o(17985980858368L, 134006);
      }
      
      public final void aEj()
      {
        GMTrace.i(17986115076096L, 134007);
        paramGameWebViewUI.oF(c.a(c.this).size());
        GMTrace.o(17986115076096L, 134007);
      }
    });
    GMTrace.o(19306817519616L, 143847);
  }
  
  private void a(Animator paramAnimator, final Runnable paramRunnable)
  {
    GMTrace.i(18018595766272L, 134249);
    paramAnimator.addListener(new AnimatorListenerAdapter()
    {
      public final void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        GMTrace.i(19300509286400L, 143800);
        if (paramRunnable != null) {
          paramRunnable.run();
        }
        GMTrace.o(19300509286400L, 143800);
      }
    });
    paramAnimator.start();
    GMTrace.o(18018595766272L, 134249);
  }
  
  private boolean aEe()
  {
    GMTrace.i(18018729984000L, 134250);
    boolean bool = this.lJc.getBooleanExtra("is_from_keep_top", false);
    GMTrace.o(18018729984000L, 134250);
    return bool;
  }
  
  final void a(b paramb)
  {
    GMTrace.i(18018461548544L, 134248);
    if (paramb == null)
    {
      GMTrace.o(18018461548544L, 134248);
      return;
    }
    paramb.eR(false);
    paramb.setVisibility(8);
    removeView(paramb);
    if (paramb != this.lIY)
    {
      paramb.Zg();
      GMTrace.o(18018461548544L, 134248);
      return;
    }
    paramb = ObjectAnimator.ofFloat(paramb, "translationX", new float[] { 0.0F });
    paramb.setDuration(0L);
    a(paramb, null);
    GMTrace.o(18018461548544L, 134248);
  }
  
  public final void aEh()
  {
    GMTrace.i(18019132637184L, 134253);
    w.d("MicroMsg.GameWebPageContainer", "cancelPageTop");
    if ((this.lIY != null) && (!this.lJa.contains(this.lIY))) {
      this.lIY.Zg();
    }
    for (;;)
    {
      this.lIY = null;
      GMTrace.o(18019132637184L, 134253);
      return;
      if (this.lIY != null) {
        this.lIY.aEd();
      }
    }
  }
  
  public final void b(b paramb)
  {
    GMTrace.i(18018998419456L, 134252);
    w.d("MicroMsg.GameWebPageContainer", "keepPageTop");
    if (this.lIY == paramb)
    {
      GMTrace.o(18018998419456L, 134252);
      return;
    }
    if ((this.lIY != null) && (!this.lJa.contains(this.lIY))) {
      this.lIY.Zg();
    }
    for (;;)
    {
      this.lIY = paramb;
      GMTrace.o(18018998419456L, 134252);
      return;
      if (this.lIY != null) {
        this.lIY.aEd();
      }
    }
  }
  
  public final void c(final Intent paramIntent, boolean paramBoolean)
  {
    GMTrace.i(18018193113088L, 134246);
    this.lJc = paramIntent;
    final Object localObject1 = paramIntent.getStringExtra("rawUrl");
    if (bg.nm((String)localObject1))
    {
      GMTrace.o(18018193113088L, 134246);
      return;
    }
    final Object localObject2 = (b)this.lJa.peek();
    if ((localObject2 != null) && (bg.nl(((b)localObject2).lHe.lID).equals(localObject1)))
    {
      paramBoolean = aEe();
      ((b)localObject2).ui.putBoolean("is_from_keep_top", paramBoolean);
      GMTrace.o(18018193113088L, 134246);
      return;
    }
    if ((aEe()) && (this.lIY != null))
    {
      while (!this.lJa.isEmpty()) {
        a((b)this.lJa.pop());
      }
      if (this.lIY.getParent() == null) {
        addView(this.lIY);
      }
      this.lIY.Ze();
      this.lJa.push(this.lIY);
      GMTrace.o(18018193113088L, 134246);
      return;
    }
    int i;
    if ((!paramBoolean) && (paramIntent.getBooleanExtra("needAnimation", true)))
    {
      i = 1;
      w.d("MicroMsg.GameWebPageContainer", "createPage start : " + System.currentTimeMillis());
      this.lJd = System.currentTimeMillis();
      if (this.lIZ == null) {
        break label696;
      }
      paramIntent = this.lIZ;
      this.lIZ = null;
      label255:
      localObject2 = this.lJc.getExtras();
      paramIntent.ui = ((Bundle)localObject2);
      d locald = paramIntent.aEb();
      locald.ui = ((Bundle)localObject2);
      locald.lJq.lGG = locald.aEl();
      locald.fKP = locald.ui.getString("geta8key_username");
      locald.lJV = locald.ui.getString("KPublisherId");
      locald.scene = locald.ui.getInt("geta8key_scene", 0);
      locald.lJU = com.tencent.mm.plugin.game.gamewebview.a.d.aa(locald.scene, locald.fKP);
      locald.lJO = locald.ui.getBoolean("neverGetA8Key", false);
      locald.lJZ = locald.ui.getString("game_hv_menu_appid");
      w.d("MicroMsg.GameWebPageContainer", "LoadUrl begin : %d", new Object[] { Long.valueOf(System.currentTimeMillis() - this.lJd) });
      w.d("MicroMsg.GameWebPage", "loadUrl, url = %s, pageViewId = %d, this = %d", new Object[] { localObject1, Integer.valueOf(paramIntent.lHe.hashCode()), Integer.valueOf(paramIntent.hashCode()) });
      localObject2 = paramIntent.lHe;
      if (!bg.nm((String)localObject1)) {
        break label760;
      }
      w.e("MicroMsg.GameWebPageView", "rawUrl is null");
    }
    for (;;)
    {
      w.d("MicroMsg.GameWebPageContainer", "LoadUrl end : %d", new Object[] { Long.valueOf(System.currentTimeMillis() - this.lJd) });
      localObject2 = (b)this.lJa.peek();
      this.lJa.push(paramIntent);
      if (i == 0) {
        break label896;
      }
      w.d("MicroMsg.GameWebPageContainer", "addView start : %d", new Object[] { Long.valueOf(System.currentTimeMillis() - this.lJd) });
      if (paramIntent.getParent() == null) {
        addView(paramIntent, 0);
      }
      w.d("MicroMsg.GameWebPageContainer", "addView end : %d", new Object[] { Long.valueOf(System.currentTimeMillis() - this.lJd) });
      localObject1 = new boolean[1];
      localObject1[0] = 0;
      localObject2 = new Runnable()
      {
        public final void run()
        {
          boolean bool1 = true;
          GMTrace.i(18015642976256L, 134227);
          w.i("MicroMsg.GameWebPageContainer", "loadUrl costTime = %d", new Object[] { Long.valueOf(System.currentTimeMillis() - c.b(c.this)) });
          if (localObject1[0] != 0)
          {
            GMTrace.o(18015642976256L, 134227);
            return;
          }
          localObject1[0] = true;
          synchronized (c.this)
          {
            if (localObject2 != null)
            {
              c localc2 = c.this;
              b localb = localObject2;
              boolean bool2 = c.c(c.this).getBooleanExtra("finish_recent_page", false);
              if (!c.c(c.this).getBooleanExtra("transparent_page", false)) {
                c.a(localc2, localb, bool2, bool1);
              }
            }
            else
            {
              c.a(c.this, paramIntent);
              GMTrace.o(18015642976256L, 134227);
              return;
            }
            bool1 = false;
          }
        }
      };
      paramIntent.lHe.lJS = new b.a()
      {
        public final void aEg()
        {
          GMTrace.i(17985443987456L, 134002);
          w.d("MicroMsg.GameWebPageContainer", "onLoadFinish, costTime = %d", new Object[] { Long.valueOf(System.currentTimeMillis() - c.b(c.this)) });
          if (localObject1[0] == 0)
          {
            w.d("MicroMsg.GameWebPageContainer", "removeCallback, %d", new Object[] { Integer.valueOf(localObject2.hashCode()) });
            c.this.removeCallbacks(localObject2);
            c.this.post(localObject2);
          }
          GMTrace.o(17985443987456L, 134002);
        }
      };
      w.d("MicroMsg.GameWebPageContainer", "post : %d", new Object[] { Long.valueOf(System.currentTimeMillis() - this.lJd) });
      postDelayed((Runnable)localObject2, 300L);
      GMTrace.o(18018193113088L, 134246);
      return;
      i = 0;
      break;
      label696:
      w.d("MicroMsg.GameWebPageContainer", "createPage begin: " + System.currentTimeMillis());
      paramIntent = new b(this.lJb, this);
      w.d("MicroMsg.GameWebPageContainer", "createPage end: " + System.currentTimeMillis());
      break label255;
      label760:
      w.d("MicroMsg.GameWebPageView", "loadUrl, rawUrl = %s, this = %d", new Object[] { localObject1, Integer.valueOf(localObject2.hashCode()) });
      g.ork.a(611L, 1L, 1L, false);
      ((d)localObject2).lID = ((String)localObject1);
      ((d)localObject2).lJD = new a(((d)localObject2).lJb, ((d)localObject2).lJr, ((d)localObject2).lJr.hashCode());
      ((d)localObject2).lJD.rWO = new d.22((d)localObject2);
      ((d)localObject2).lJD.onCreate(((d)localObject2).lID);
      if (((d)localObject2).lJD.rWJ) {
        ((d)localObject2).lJw.setVisibility(0);
      }
      ((d)localObject2).aEk();
    }
    label896:
    addView(paramIntent);
    paramIntent.Ze();
    GMTrace.o(18018193113088L, 134246);
  }
  
  public final void cleanup()
  {
    GMTrace.i(18018058895360L, 134245);
    while (!this.lJa.isEmpty()) {
      ((b)this.lJa.pop()).Zg();
    }
    if (this.lIZ != null) {
      this.lIZ.Zg();
    }
    GMTrace.o(18018058895360L, 134245);
  }
  
  public final void eS(final boolean paramBoolean)
  {
    GMTrace.i(18018327330816L, 134247);
    if (this.lJa.size() <= 1)
    {
      this.lJb.finish();
      GMTrace.o(18018327330816L, 134247);
      return;
    }
    Runnable local4 = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17986383511552L, 134009);
        b localb1 = (b)c.a(c.this).pop();
        b localb2 = (b)c.a(c.this).peek();
        c.a(c.this, localb2, localb1, paramBoolean);
        GMTrace.o(17986383511552L, 134009);
      }
    };
    if (Looper.getMainLooper().getThread() == Thread.currentThread())
    {
      local4.run();
      GMTrace.o(18018327330816L, 134247);
      return;
    }
    post(local4);
    GMTrace.o(18018327330816L, 134247);
  }
  
  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(18018864201728L, 134251);
    b localb = (b)this.lJa.peek();
    if (localb != null)
    {
      if (localb.lHe.onKeyDown(paramInt, paramKeyEvent))
      {
        GMTrace.o(18018864201728L, 134251);
        return true;
      }
      if ((paramInt == 4) && (localb.lHe.aEv()))
      {
        GMTrace.o(18018864201728L, 134251);
        return true;
      }
    }
    GMTrace.o(18018864201728L, 134251);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\ui\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */