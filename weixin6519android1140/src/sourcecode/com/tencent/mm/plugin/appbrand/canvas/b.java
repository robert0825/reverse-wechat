package com.tencent.mm.plugin.appbrand.canvas;

import android.graphics.Canvas;
import android.graphics.Paint.Style;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.plugin.appbrand.canvas.widget.a.a;
import com.tencent.mm.plugin.appbrand.collector.f;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.Stack;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b
  implements com.tencent.mm.plugin.appbrand.canvas.widget.a
{
  public volatile boolean hNA;
  private Runnable hNB;
  private Runnable hNC;
  public volatile long hND;
  protected long hNE;
  protected long hNF;
  protected volatile long hNG;
  public volatile boolean hNu;
  public JSONArray hNv;
  public d hNw;
  private c hNx;
  public com.tencent.mm.plugin.appbrand.canvas.widget.a hNy;
  public volatile String hNz;
  protected int mCount;
  
  public b(com.tencent.mm.plugin.appbrand.canvas.widget.a parama)
  {
    GMTrace.i(17706271113216L, 131922);
    this.hNB = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17719290232832L, 132019);
        b.this.hNG = 0L;
        b.this.hNA = true;
        GMTrace.o(17719290232832L, 132019);
      }
    };
    this.hNC = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17707613290496L, 131932);
        boolean bool = b.this.hNA;
        b.this.hNA = false;
        if ((bool) && (b.this.hNu)) {
          b.this.hNy.TM();
        }
        GMTrace.o(17707613290496L, 131932);
      }
    };
    this.hNy = parama;
    this.hNw = new d(new a(parama));
    this.hNx = new c();
    GMTrace.o(17706271113216L, 131922);
  }
  
  public final void TM()
  {
    GMTrace.i(17706673766400L, 131925);
    GMTrace.o(17706673766400L, 131925);
  }
  
  public final void TN()
  {
    GMTrace.i(17707076419584L, 131928);
    this.hNy.i(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18855711735808L, 140486);
        b.this.hNv = null;
        b.this.hNu = true;
        GMTrace.o(18855711735808L, 140486);
      }
    });
    GMTrace.o(17707076419584L, 131928);
  }
  
  public final int TO()
  {
    GMTrace.i(18967380885504L, 141318);
    if (equals(this.hNy))
    {
      GMTrace.o(18967380885504L, 141318);
      return 0;
    }
    int i = this.hNy.TO();
    GMTrace.o(18967380885504L, 141318);
    return i;
  }
  
  public final int TP()
  {
    GMTrace.i(18967515103232L, 141319);
    if (equals(this.hNy))
    {
      GMTrace.o(18967515103232L, 141319);
      return 0;
    }
    int i = this.hNy.TP();
    GMTrace.o(18967515103232L, 141319);
    return i;
  }
  
  public final void TQ()
  {
    GMTrace.i(18855443300352L, 140484);
    int j = this.mCount;
    long l1 = this.hNF;
    long l2 = this.hNE;
    if ((j <= 0) || (l1 <= 0L) || (l2 <= 0L))
    {
      GMTrace.o(18855443300352L, 140484);
      return;
    }
    int k = this.hNy.TO();
    long l3 = l1 / j;
    if (l3 <= 500000L)
    {
      i = 0;
      g.ork.a(k, i, 1L, false);
      k = this.hNy.TP();
      l3 = l2 / j;
      if (l3 > 20000000L) {
        break label240;
      }
      i = 0;
    }
    for (;;)
    {
      g.ork.a(k, i, 1L, false);
      k = getType();
      if ((l1 > 0L) && (l2 > 0L) && (j > 0)) {
        break label361;
      }
      GMTrace.o(18855443300352L, 140484);
      return;
      if (l3 <= 1000000L)
      {
        i = 1;
        break;
      }
      if (l3 <= 2000000L)
      {
        i = 2;
        break;
      }
      if (l3 <= 3000000L)
      {
        i = 3;
        break;
      }
      if (l3 <= 4000000L)
      {
        i = 4;
        break;
      }
      if (l3 <= 5000000L)
      {
        i = 5;
        break;
      }
      i = 6;
      break;
      label240:
      if (l3 <= 25000000L) {
        i = 1;
      } else if (l3 <= 30000000L) {
        i = 2;
      } else if (l3 <= 35000000L) {
        i = 3;
      } else if (l3 <= 40000000L) {
        i = 4;
      } else if (l3 <= 50000000L) {
        i = 5;
      } else if (l3 <= 60000000L) {
        i = 6;
      } else if (l3 <= 70000000L) {
        i = 7;
      } else if (l3 <= 80000000L) {
        i = 8;
      } else {
        i = 9;
      }
    }
    label361:
    ArrayList localArrayList = new ArrayList();
    IDKey localIDKey = new IDKey();
    localIDKey.SetID(703);
    if (k == 1)
    {
      i = 3;
      localIDKey.SetKey(i);
      localIDKey.SetValue(l1);
      localArrayList.add(localIDKey);
      localIDKey = new IDKey();
      localIDKey.SetID(703);
      if (k != 1) {
        break label528;
      }
      i = 4;
      label439:
      localIDKey.SetKey(i);
      localIDKey.SetValue(l2);
      localArrayList.add(localIDKey);
      localIDKey = new IDKey();
      localIDKey.SetID(703);
      if (k != 1) {
        break label533;
      }
    }
    label528:
    label533:
    for (int i = 5;; i = 2)
    {
      localIDKey.SetKey(i);
      localIDKey.SetValue(j);
      localArrayList.add(localIDKey);
      g.ork.b(localArrayList, false);
      GMTrace.o(18855443300352L, 140484);
      return;
      i = 0;
      break;
      i = 1;
      break label439;
    }
  }
  
  public final void a(final JSONArray paramJSONArray, final a.a parama)
  {
    GMTrace.i(20782675656704L, 154843);
    this.hNy.i(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17708284379136L, 131937);
        b.this.hNv = paramJSONArray;
        b.this.hNu = true;
        if (parama != null) {
          parama.TU();
        }
        GMTrace.o(17708284379136L, 131937);
      }
    });
    GMTrace.o(20782675656704L, 154843);
  }
  
  public final void b(final JSONArray paramJSONArray, final a.a parama)
  {
    GMTrace.i(20782809874432L, 154844);
    if ((paramJSONArray == null) || (paramJSONArray.length() == 0))
    {
      GMTrace.o(20782809874432L, 154844);
      return;
    }
    this.hNy.i(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18867925549056L, 140577);
        if (b.this.hNv == null) {
          b.this.hNv = paramJSONArray;
        }
        for (;;)
        {
          b.this.hNu = true;
          if (parama != null) {
            parama.TU();
          }
          GMTrace.o(18867925549056L, 140577);
          return;
          int i = 0;
          while (i < paramJSONArray.length())
          {
            b.this.hNv.put(paramJSONArray.opt(i));
            i += 1;
          }
        }
      }
    });
    GMTrace.o(20782809874432L, 154844);
  }
  
  public final boolean d(Canvas paramCanvas)
  {
    GMTrace.i(17843575848960L, 132945);
    this.hNu = false;
    if ((this.hNv == null) || (this.hNv.length() == 0))
    {
      GMTrace.o(17843575848960L, 132945);
      return false;
    }
    long l1 = this.hND;
    long l2 = System.nanoTime();
    String str1 = this.hNz;
    if (l1 != 0L) {
      com.tencent.mm.plugin.appbrand.collector.c.aM(str1, "before_draw_actions");
    }
    d locald = this.hNw;
    locald.hNO.clear();
    locald.hNP.clear();
    locald.hNM.reset();
    locald.hNN.reset();
    locald.hNM.setStyle(Paint.Style.STROKE);
    locald.hNN.setStyle(Paint.Style.FILL);
    locald.hNM.setAntiAlias(true);
    locald.hNN.setAntiAlias(true);
    locald.hNM.setStrokeWidth(com.tencent.mm.plugin.appbrand.n.c.jM(1));
    locald.hNN.setStrokeWidth(com.tencent.mm.plugin.appbrand.n.c.jM(1));
    int i = 0;
    while (i < this.hNv.length())
    {
      Object localObject2 = this.hNv.optJSONObject(i);
      if (localObject2 != null) {}
      try
      {
        Object localObject1 = this.hNx;
        locald = this.hNw;
        String str2 = ((JSONObject)localObject2).optString("method");
        localObject2 = ((JSONObject)localObject2).optJSONArray("data");
        localObject1 = (com.tencent.mm.plugin.appbrand.canvas.a.d)((c)localObject1).hNL.get(str2);
        if (localObject1 != null) {
          ((com.tencent.mm.plugin.appbrand.canvas.a.d)localObject1).a(locald, paramCanvas, (JSONArray)localObject2);
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.e("MicroMsg.DrawActionDelegateImpl", "drawAction error, exception : %s", new Object[] { localException });
        }
      }
      i += 1;
    }
    if (l1 != 0L)
    {
      com.tencent.mm.plugin.appbrand.collector.c.aM(str1, "after_draw_actions");
      com.tencent.mm.plugin.appbrand.collector.c.print(str1);
      long l3 = System.nanoTime();
      this.hNF = (l3 - l2 + this.hNF);
      this.hNE = (l3 - l1 + this.hNE);
      this.mCount += 1;
    }
    l1 = this.hNG;
    l2 = System.currentTimeMillis();
    if (l1 != 0L) {
      f.aK(l2 - l1);
    }
    if (!this.hNA) {
      this.hNG = l2;
    }
    GMTrace.o(17843575848960L, 132945);
    return true;
  }
  
  public final int getType()
  {
    GMTrace.i(19999649431552L, 149009);
    int i = this.hNy.getType();
    GMTrace.o(19999649431552L, 149009);
    return i;
  }
  
  public final void i(Runnable paramRunnable)
  {
    GMTrace.i(17707344855040L, 131930);
    if (equals(this.hNy))
    {
      GMTrace.o(17707344855040L, 131930);
      return;
    }
    this.hNy.i(paramRunnable);
    GMTrace.o(17707344855040L, 131930);
  }
  
  public final boolean isPaused()
  {
    GMTrace.i(18855040647168L, 140481);
    boolean bool = this.hNA;
    GMTrace.o(18855040647168L, 140481);
    return bool;
  }
  
  public final void oI(String paramString)
  {
    GMTrace.i(17707210637312L, 131929);
    this.hNw.fXC = paramString;
    GMTrace.o(17707210637312L, 131929);
  }
  
  public final void oJ(String paramString)
  {
    GMTrace.i(18855174864896L, 140482);
    this.hNz = paramString;
    GMTrace.o(18855174864896L, 140482);
  }
  
  public final void onPause()
  {
    GMTrace.i(18854772211712L, 140479);
    this.hND = 0L;
    this.hNy.i(this.hNB);
    GMTrace.o(18854772211712L, 140479);
  }
  
  public final void onResume()
  {
    GMTrace.i(18854906429440L, 140480);
    this.hNy.i(this.hNC);
    GMTrace.o(18854906429440L, 140480);
  }
  
  public final void setStartTime(long paramLong)
  {
    GMTrace.i(18855309082624L, 140483);
    this.hND = paramLong;
    GMTrace.o(18855309082624L, 140483);
  }
  
  private static final class a
    implements a
  {
    private WeakReference<com.tencent.mm.plugin.appbrand.canvas.widget.a> hNK;
    
    a(com.tencent.mm.plugin.appbrand.canvas.widget.a parama)
    {
      GMTrace.i(19999917867008L, 149011);
      this.hNK = new WeakReference(parama);
      GMTrace.o(19999917867008L, 149011);
    }
    
    public final void invalidate()
    {
      GMTrace.i(20000052084736L, 149012);
      com.tencent.mm.plugin.appbrand.canvas.widget.a locala = (com.tencent.mm.plugin.appbrand.canvas.widget.a)this.hNK.get();
      if (locala == null)
      {
        GMTrace.o(20000052084736L, 149012);
        return;
      }
      locala.TM();
      GMTrace.o(20000052084736L, 149012);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\canvas\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */