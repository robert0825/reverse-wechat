package com.tencent.mm.pluginsdk.ui.tools;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.Menu;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bd.e.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.ui.VoiceSearchLayout;
import com.tencent.mm.pluginsdk.ui.VoiceSearchLayout.4;
import com.tencent.mm.pluginsdk.ui.VoiceSearchLayout.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.tools.f;
import com.tencent.mm.ui.tools.p.b;

public final class p
  extends com.tencent.mm.ui.tools.p
{
  private VoiceSearchLayout oCs;
  public boolean tHZ;
  public int tIa;
  public int tIb;
  public a tIc;
  private VoiceSearchLayout.a tId;
  
  public p()
  {
    GMTrace.i(1102732853248L, 8216);
    this.tHZ = true;
    this.tId = new VoiceSearchLayout.a()
    {
      public final void a(boolean paramAnonymousBoolean, String[] paramAnonymousArrayOfString, long paramAnonymousLong)
      {
        GMTrace.i(1130113269760L, 8420);
        w.d("MicroMsg.VoiceSearchViewHelper", "on voice search return, success %B, voice id %d", new Object[] { Boolean.valueOf(paramAnonymousBoolean), Long.valueOf(paramAnonymousLong) });
        if (p.this.tIc != null) {
          p.this.tIc.a(paramAnonymousBoolean, paramAnonymousArrayOfString, paramAnonymousLong, p.this.tIb);
        }
        GMTrace.o(1130113269760L, 8420);
      }
      
      public final void bLA()
      {
        GMTrace.i(1129979052032L, 8419);
        w.d("MicroMsg.VoiceSearchViewHelper", "on voice search cancel");
        g.ork.i(10453, new Object[] { Integer.valueOf(p.this.tIa), Integer.valueOf(4) });
        if (p.this.xiR != null)
        {
          p.this.xiR.my(true);
          p.this.xiR.mz(true);
        }
        if (p.this.tIc != null) {
          p.this.tIc.ain();
        }
        GMTrace.o(1129979052032L, 8419);
      }
      
      public final void bLz()
      {
        GMTrace.i(1129844834304L, 8418);
        if ((com.tencent.mm.p.a.aR(ab.getContext())) || (com.tencent.mm.p.a.aP(ab.getContext())))
        {
          GMTrace.o(1129844834304L, 8418);
          return;
        }
        w.d("MicroMsg.VoiceSearchViewHelper", "on voice search start");
        g.ork.i(10453, new Object[] { Integer.valueOf(p.this.tIa), Integer.valueOf(3) });
        if (p.this.tIc != null) {
          p.this.tIc.aim();
        }
        GMTrace.o(1129844834304L, 8418);
      }
    };
    GMTrace.o(1102732853248L, 8216);
  }
  
  public p(byte paramByte)
  {
    super(true, true);
    GMTrace.i(1102867070976L, 8217);
    this.tHZ = true;
    this.tId = new VoiceSearchLayout.a()
    {
      public final void a(boolean paramAnonymousBoolean, String[] paramAnonymousArrayOfString, long paramAnonymousLong)
      {
        GMTrace.i(1130113269760L, 8420);
        w.d("MicroMsg.VoiceSearchViewHelper", "on voice search return, success %B, voice id %d", new Object[] { Boolean.valueOf(paramAnonymousBoolean), Long.valueOf(paramAnonymousLong) });
        if (p.this.tIc != null) {
          p.this.tIc.a(paramAnonymousBoolean, paramAnonymousArrayOfString, paramAnonymousLong, p.this.tIb);
        }
        GMTrace.o(1130113269760L, 8420);
      }
      
      public final void bLA()
      {
        GMTrace.i(1129979052032L, 8419);
        w.d("MicroMsg.VoiceSearchViewHelper", "on voice search cancel");
        g.ork.i(10453, new Object[] { Integer.valueOf(p.this.tIa), Integer.valueOf(4) });
        if (p.this.xiR != null)
        {
          p.this.xiR.my(true);
          p.this.xiR.mz(true);
        }
        if (p.this.tIc != null) {
          p.this.tIc.ain();
        }
        GMTrace.o(1129979052032L, 8419);
      }
      
      public final void bLz()
      {
        GMTrace.i(1129844834304L, 8418);
        if ((com.tencent.mm.p.a.aR(ab.getContext())) || (com.tencent.mm.p.a.aP(ab.getContext())))
        {
          GMTrace.o(1129844834304L, 8418);
          return;
        }
        w.d("MicroMsg.VoiceSearchViewHelper", "on voice search start");
        g.ork.i(10453, new Object[] { Integer.valueOf(p.this.tIa), Integer.valueOf(3) });
        if (p.this.tIc != null) {
          p.this.tIc.aim();
        }
        GMTrace.o(1129844834304L, 8418);
      }
    };
    GMTrace.o(1102867070976L, 8217);
  }
  
  public final void a(Activity paramActivity, Menu paramMenu)
  {
    GMTrace.i(1103672377344L, 8223);
    super.a(paramActivity, paramMenu);
    if (this.oCs != null) {
      this.oCs.tvW = this.tId;
    }
    GMTrace.o(1103672377344L, 8223);
  }
  
  public final void a(a parama)
  {
    GMTrace.i(1103001288704L, 8218);
    this.tIc = parama;
    this.xiS = parama;
    GMTrace.o(1103001288704L, 8218);
  }
  
  protected final boolean bNt()
  {
    boolean bool1 = false;
    GMTrace.i(1103403941888L, 8221);
    boolean bool2 = this.tHZ;
    if (this.oCs == null) {
      bool1 = true;
    }
    w.d("MicroMsg.VoiceSearchViewHelper", "check has voice search, Enable %B, layout is null ? %B", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
    bool1 = this.tHZ;
    GMTrace.o(1103403941888L, 8221);
    return bool1;
  }
  
  protected final void bNu()
  {
    GMTrace.i(1103538159616L, 8222);
    w.d("MicroMsg.VoiceSearchViewHelper", "do require voice search");
    if (this.xiR != null)
    {
      this.xiR.my(false);
      this.xiR.mz(false);
    }
    if ((this.oCs != null) && (this.oCs.getVisibility() == 8))
    {
      w.d("MicroMsg.VoiceSearchViewHelper", "do voice search layout start");
      Object localObject = this.oCs;
      int i = this.tIb;
      boolean bool = com.tencent.mm.pluginsdk.h.a.aS(((VoiceSearchLayout)localObject).getContext(), "android.permission.RECORD_AUDIO");
      w.i("MicroMsg.VoiceSearchLayout", "summerper checkPermission checkMicrophone[%b]", new Object[] { Boolean.valueOf(bool) });
      if (bool)
      {
        w.d("MicroMsg.VoiceSearchLayout", "doStart " + ((VoiceSearchLayout)localObject).isStart);
        ((VoiceSearchLayout)localObject).tvZ = i;
        ((VoiceSearchLayout)localObject).isStart = true;
        ((VoiceSearchLayout)localObject).tvY = false;
        if (((VoiceSearchLayout)localObject).tvW != null) {
          ((VoiceSearchLayout)localObject).tvW.bLz();
        }
        ((VoiceSearchLayout)localObject).setVisibility(0);
        ((VoiceSearchLayout)localObject).jsM.z(50L, 50L);
        ((VoiceSearchLayout)localObject).a(true, null);
        ((VoiceSearchLayout)localObject).twj = 0;
        ((VoiceSearchLayout)localObject).twd = new com.tencent.mm.bd.e(new VoiceSearchLayout.4((VoiceSearchLayout)localObject), i);
        localObject = ((VoiceSearchLayout)localObject).twd;
        w.i("MicroMsg.SceneVoiceAddr", "start record");
        if ((((com.tencent.mm.bd.e)localObject).heT == 0) && (am.is2G(ab.getContext()))) {}
        for (bool = true;; bool = false)
        {
          ((com.tencent.mm.bd.e)localObject).hfe = bool;
          w.i("MicroMsg.SceneVoiceAddr", "mEnableAmrMode: %b", new Object[] { Boolean.valueOf(((com.tencent.mm.bd.e)localObject).hfe) });
          com.tencent.mm.sdk.f.e.post(new e.a((com.tencent.mm.bd.e)localObject), "SceneVoiceAddr_record");
          GMTrace.o(1103538159616L, 8222);
          return;
        }
      }
      if ((((VoiceSearchLayout)localObject).getContext() instanceof Activity)) {
        com.tencent.mm.pluginsdk.h.a.d((Activity)((VoiceSearchLayout)localObject).getContext(), "android.permission.RECORD_AUDIO");
      }
      GMTrace.o(1103538159616L, 8222);
      return;
    }
    GMTrace.o(1103538159616L, 8222);
  }
  
  protected final void bNv()
  {
    GMTrace.i(1103940812800L, 8225);
    cancel();
    GMTrace.o(1103940812800L, 8225);
  }
  
  public final void cancel()
  {
    GMTrace.i(1103269724160L, 8220);
    w.d("MicroMsg.VoiceSearchViewHelper", "do cancel");
    if (this.oCs != null) {
      this.oCs.bLj();
    }
    if (this.xiR != null)
    {
      this.xiR.my(true);
      this.xiR.mz(true);
    }
    GMTrace.o(1103269724160L, 8220);
  }
  
  public final void o(VoiceSearchLayout paramVoiceSearchLayout)
  {
    GMTrace.i(1103135506432L, 8219);
    this.oCs = paramVoiceSearchLayout;
    this.tIb = 1;
    if (1 == this.tIb)
    {
      this.tIa = 2;
      GMTrace.o(1103135506432L, 8219);
      return;
    }
    this.tIa = 1;
    GMTrace.o(1103135506432L, 8219);
  }
  
  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(1103806595072L, 8224);
    if (4 == paramInt)
    {
      if ((this.oCs != null) && (this.oCs.getVisibility() == 0)) {}
      for (bool = true;; bool = false)
      {
        w.d("MicroMsg.VoiceSearchViewHelper", "on back key down, try hide voice search panel, it is visiable[%B]", new Object[] { Boolean.valueOf(bool) });
        cancel();
        if (!bool) {
          break;
        }
        GMTrace.o(1103806595072L, 8224);
        return true;
      }
    }
    w.d("MicroMsg.VoiceSearchViewHelper", "not match key code, pass to super");
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(1103806595072L, 8224);
    return bool;
  }
  
  public static abstract interface a
    extends p.b
  {
    public abstract void a(boolean paramBoolean, String[] paramArrayOfString, long paramLong, int paramInt);
    
    public abstract void aim();
    
    public abstract void ain();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\tools\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */