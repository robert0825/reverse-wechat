package com.tencent.mm.plugin.game.gamewebview.ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameMMToClientEvent;
import com.tencent.mm.plugin.game.gamewebview.jsapi.GameJsApiInterface;
import com.tencent.mm.plugin.webview.ui.tools.f;
import com.tencent.mm.plugin.webview.ui.tools.game.c.a;
import com.tencent.mm.plugin.webview.ui.tools.game.menu.GameMenuImageButton;
import com.tencent.mm.plugin.webview.ui.tools.widget.MovingImageButton;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.tools.j;
import com.tencent.mm.ui.widget.SwipeBackLayout;
import com.tencent.mm.ui.widget.SwipeBackLayout.a;
import com.tencent.mm.ui.widget.k;
import com.tencent.mm.ui.widget.k.a;
import com.tencent.xweb.h;

public final class b
  extends SwipeBackLayout
  implements SwipeBackLayout.a, k.a
{
  private boolean iuq;
  boolean iur;
  d lHe;
  c lIW;
  boolean lIX;
  public Context mContext;
  public Bundle ui;
  
  public b(Context paramContext, c paramc)
  {
    super(paramContext);
    GMTrace.i(20407268671488L, 152046);
    this.ui = new Bundle();
    this.iur = false;
    this.mContext = paramContext;
    this.lIW = paramc;
    setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    init();
    this.xsJ = false;
    mM(true);
    addView(aEb());
    this.Hw = aEb();
    this.xsO = this;
    GMTrace.o(20407268671488L, 152046);
  }
  
  public final void U(float paramFloat)
  {
    GMTrace.i(18021816991744L, 134273);
    w.d("MicroMsg.GameWebPage", "onSwipe， " + hashCode());
    if (this.iuq)
    {
      if (paramFloat == 1.0F) {
        break label75;
      }
      setVisibility(0);
    }
    while (Float.compare(1.0F, paramFloat) <= 0)
    {
      j.n(aEb(), 0.0F);
      GMTrace.o(18021816991744L, 134273);
      return;
      label75:
      hide();
    }
    float f = aEb().getWidth() / 4;
    j.n(aEb(), f * (1.0F - paramFloat) * -1.0F);
    GMTrace.o(18021816991744L, 134273);
  }
  
  public final void Ze()
  {
    GMTrace.i(18021011685376L, 134267);
    w.d("MicroMsg.GameWebPage", "onPageForeground: %s", new Object[] { bg.nl(this.lHe.lID) });
    k.b(this);
    this.xpb = false;
    this.mEnable = aEc();
    this.iuq = false;
    setVisibility(0);
    Object localObject;
    if (this.ui.getBoolean("transparent_page", false))
    {
      localObject = this.lHe;
      ((d)localObject).lJr.setBackgroundColor(0);
      ((d)localObject).lJp.rKn = true;
      ((d)localObject).lJp.hPU = false;
      ((d)localObject).lJp.jw(true);
      ((d)localObject).lJp.xQ(0);
    }
    if ((this.mContext instanceof GameWebViewUI))
    {
      localObject = (GameWebViewUI)this.mContext;
      ((GameWebViewUI)localObject).oG(this.ui.getInt("screen_orientation", -1));
      if (isFullScreen())
      {
        ((GameWebViewUI)localObject).getWindow().setFlags(1024, 1024);
        ((GameWebViewUI)localObject).getWindow().getDecorView().setSystemUiVisibility(5894);
      }
    }
    else
    {
      localObject = this.lHe;
      boolean bool = isFullScreen();
      w.d("MicroMsg.GameWebPageView", "setFullScreen, rawUrl = %s, fullscreen = %b, mHVGameAppId = %s", new Object[] { ((d)localObject).lID, Boolean.valueOf(bool), ((d)localObject).lJZ });
      ((d)localObject).ivn = bool;
      if (!bool) {
        break label385;
      }
      ((d)localObject).oB(8);
      if (bg.nm(((d)localObject).lJZ)) {
        break label374;
      }
      if (((d)localObject).lJx == null)
      {
        ((d)localObject).lJx = new GameMenuImageButton(((d)localObject).lJb);
        ((d)localObject).lJx.a((FrameLayout)localObject, new d.30((d)localObject));
      }
      ((d)localObject).lJv.setVisibility(8);
    }
    for (;;)
    {
      localObject = this.lHe;
      ((d)localObject).aEt();
      ((d)localObject).zw("onResume");
      ((d)localObject).zx("onResume");
      ((d)localObject).lJk.lIJ = System.currentTimeMillis();
      ((d)localObject).lKa.rQG.onResume();
      GMTrace.o(18021011685376L, 134267);
      return;
      ((GameWebViewUI)localObject).getWindow().clearFlags(1024);
      ((GameWebViewUI)localObject).getWindow().getDecorView().setSystemUiVisibility(0);
      break;
      label374:
      ((d)localObject).lJv.setVisibility(0);
      continue;
      label385:
      ((d)localObject).oB(0);
      ((d)localObject).lJv.setVisibility(8);
    }
  }
  
  protected final void Zg()
  {
    GMTrace.i(18021280120832L, 134269);
    w.d("MicroMsg.GameWebPage", "onPageDestroy: %s", new Object[] { this.lHe.aEr() });
    d locald = this.lHe;
    w.d("MicroMsg.GameWebPageView", "onPageDestroy");
    locald.khg = true;
    if (locald.lJX != null) {
      locald.lJX.cancel();
    }
    if (locald.lJD != null) {
      locald.lJD.onDestroy();
    }
    com.tencent.mm.plugin.game.gamewebview.d.a locala = locald.lJk;
    long l = System.currentTimeMillis() - locala.lII;
    w.d("MicroMsg.GameWebViewReportManager", "totalTime = %d, visitTime = %d, loadSuccess = %d", new Object[] { Long.valueOf(l), Long.valueOf(locala.lIK), Integer.valueOf(locala.lIG) });
    locala.a(locala.lHe.aEr(), 4, l, locala.lIG, 0);
    locala.a(locala.lHe.aEr(), 1, locala.lIK, locala.lIG, 0);
    locald.zw("onDestroy");
    locald.lKa.rQG.onDestroy();
    w.d("MicroMsg.GameWebPageView", "destroy");
    GameMMToClientEvent.oy(locald.hashCode());
    com.tencent.mm.plugin.game.gamewebview.model.a.b(locald);
    locald.lJp.release();
    if (locald.lJA != null)
    {
      locald.lJA.detach();
      locald.lJA = null;
    }
    locald.lJq.hTS.getLooper().quit();
    locald.lJr.setWebChromeClient(null);
    locald.lJr.setWebChromeClient(null);
    locald.lJr.setOnTouchListener(null);
    locald.lJr.setOnLongClickListener(null);
    try
    {
      locald.lJr.destroy();
      locald.lJr = null;
      System.gc();
      GMTrace.o(18021280120832L, 134269);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.GameWebPageView", "destroy, webview destroy, excepiton: " + localException.getMessage());
      }
    }
  }
  
  public final boolean Zo()
  {
    GMTrace.i(18022085427200L, 134275);
    GMTrace.o(18022085427200L, 134275);
    return false;
  }
  
  public final void Zp()
  {
    GMTrace.i(18022219644928L, 134276);
    this.lIW.eS(true);
    GMTrace.o(18022219644928L, 134276);
  }
  
  public final void Zq()
  {
    GMTrace.i(18022353862656L, 134277);
    this.iur = true;
    GMTrace.o(18022353862656L, 134277);
  }
  
  public final d aEb()
  {
    GMTrace.i(18020609032192L, 134264);
    if (this.lHe == null) {
      this.lHe = new d(this);
    }
    d locald = this.lHe;
    GMTrace.o(18020609032192L, 134264);
    return locald;
  }
  
  public final boolean aEc()
  {
    GMTrace.i(18021548556288L, 134271);
    if ((!this.ui.getBoolean("disable_swipe_back", false)) && (!this.ui.getBoolean("transparent_page", false)) && (!this.lIX))
    {
      if (this.lIW.lJa.size() > 1) {}
      for (int i = 1; i != 0; i = 0)
      {
        GMTrace.o(18021548556288L, 134271);
        return true;
      }
    }
    GMTrace.o(18021548556288L, 134271);
    return false;
  }
  
  public final void aEd()
  {
    GMTrace.i(18022890733568L, 134281);
    this.lIX = false;
    this.mEnable = aEc();
    GMTrace.o(18022890733568L, 134281);
  }
  
  public final boolean aEe()
  {
    GMTrace.i(18023024951296L, 134282);
    boolean bool = this.ui.getBoolean("is_from_keep_top", false);
    GMTrace.o(18023024951296L, 134282);
    return bool;
  }
  
  public final void aEf()
  {
    GMTrace.i(18023159169024L, 134283);
    this.lIW.eS(true);
    GMTrace.o(18023159169024L, 134283);
  }
  
  public final void eR(boolean paramBoolean)
  {
    GMTrace.i(18021145903104L, 134268);
    w.d("MicroMsg.GameWebPage", "onPageBackground: %s", new Object[] { bg.nl(this.lHe.lID) });
    if (paramBoolean) {
      k.a(this);
    }
    this.iuq = true;
    d locald = this.lHe;
    com.tencent.mm.plugin.game.gamewebview.d.a locala = locald.lJk;
    locala.lIK += System.currentTimeMillis() - locala.lIJ;
    locald.lKa.rQG.onPause();
    locald.zw("onPause");
    locald.zx("onPause");
    locald.iwr.onHideCustomView();
    GMTrace.o(18021145903104L, 134268);
  }
  
  public final void f(boolean paramBoolean, int paramInt)
  {
    long l = 120L;
    GMTrace.i(18021951209472L, 134274);
    w.d("MicroMsg.GameWebPage", "onSettle(%d), %b, %d ", new Object[] { Integer.valueOf(hashCode()), Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt) });
    if (paramBoolean)
    {
      locald = aEb();
      if (paramInt > 0) {}
      for (;;)
      {
        j.a(locald, l, 0.0F, null);
        GMTrace.o(18021951209472L, 134274);
        return;
        l = 240L;
      }
    }
    d locald = aEb();
    if (paramInt > 0) {}
    for (;;)
    {
      j.a(locald, l, aEb().getWidth() * -1 / 4, null);
      GMTrace.o(18021951209472L, 134274);
      return;
      l = 240L;
    }
  }
  
  public final void hide()
  {
    GMTrace.i(18021682774016L, 134272);
    if (this.iuq)
    {
      w.d("MicroMsg.GameWebPage", "hide, %d", new Object[] { Integer.valueOf(hashCode()) });
      setVisibility(4);
    }
    GMTrace.o(18021682774016L, 134272);
  }
  
  public final boolean isFullScreen()
  {
    GMTrace.i(18023293386752L, 134284);
    boolean bool = this.ui.getBoolean("show_full_screen", false);
    GMTrace.o(18023293386752L, 134284);
    return bool;
  }
  
  public final void onCancel()
  {
    GMTrace.i(18022488080384L, 134278);
    this.iur = false;
    GMTrace.o(18022488080384L, 134278);
  }
  
  public static abstract interface a
  {
    public abstract void aEg();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\ui\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */