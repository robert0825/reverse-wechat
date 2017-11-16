package com.tencent.mm.plugin.webview.modeltools;

import android.content.Context;
import android.view.OrientationEventListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;

public final class e
  extends OrientationEventListener
{
  private a rGF;
  private int rGG;
  private b rGH;
  
  public e(Context paramContext, b paramb)
  {
    super(paramContext);
    GMTrace.i(14346130292736L, 106887);
    this.rGF = a.rGI;
    this.rGG = 45;
    this.rGH = paramb;
    GMTrace.o(14346130292736L, 106887);
  }
  
  public final void disable()
  {
    GMTrace.i(14346398728192L, 106889);
    super.disable();
    this.rGF = a.rGI;
    GMTrace.o(14346398728192L, 106889);
  }
  
  public final void enable()
  {
    GMTrace.i(14346264510464L, 106888);
    super.enable();
    GMTrace.o(14346264510464L, 106888);
  }
  
  public final void onOrientationChanged(int paramInt)
  {
    GMTrace.i(14346532945920L, 106890);
    if (paramInt == -1)
    {
      GMTrace.o(14346532945920L, 106890);
      return;
    }
    a locala2 = this.rGF;
    a locala1;
    if (((paramInt >= 360 - this.rGG) && (paramInt < 360)) || ((paramInt >= 0) && (paramInt <= this.rGG + 0))) {
      locala1 = a.rGJ;
    }
    for (;;)
    {
      if (locala1 != this.rGF)
      {
        if ((this.rGH != null) && (this.rGF != a.rGI)) {
          this.rGH.a(this.rGF, locala1);
        }
        this.rGF = locala1;
      }
      w.i("MicroMsg.OrientationListenerHelper", "OrientationListener onOrientationChanged:" + paramInt);
      GMTrace.o(14346532945920L, 106890);
      return;
      if ((paramInt >= 270 - this.rGG) && (paramInt <= this.rGG + 270))
      {
        locala1 = a.rGK;
      }
      else if ((paramInt >= 180 - this.rGG) && (paramInt <= this.rGG + 180))
      {
        locala1 = a.rGL;
      }
      else
      {
        locala1 = locala2;
        if (paramInt >= 90 - this.rGG)
        {
          locala1 = locala2;
          if (paramInt <= this.rGG + 90) {
            locala1 = a.rGM;
          }
        }
      }
    }
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(14345861857280L, 106885);
      rGI = new a("NONE", 0);
      rGJ = new a("PORTRAIT", 1);
      rGK = new a("LANDSCAPE", 2);
      rGL = new a("REVERSE_PORTRAIT", 3);
      rGM = new a("REVERSE_LANDSCAPE", 4);
      rGN = new a[] { rGI, rGJ, rGK, rGL, rGM };
      GMTrace.o(14345861857280L, 106885);
    }
    
    private a()
    {
      GMTrace.i(14345727639552L, 106884);
      GMTrace.o(14345727639552L, 106884);
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(e.a parama1, e.a parama2);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\modeltools\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */