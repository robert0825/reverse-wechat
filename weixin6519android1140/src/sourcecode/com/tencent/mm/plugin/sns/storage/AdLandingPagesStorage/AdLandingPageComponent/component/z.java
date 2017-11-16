package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.b;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.c;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarChart;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.y;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.y.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d.a;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public final class z
  extends a
{
  private static final int pJd;
  public CountDownLatch kCM;
  private RadarChart pJe;
  public Bitmap pJf;
  public Bitmap pJg;
  
  static
  {
    GMTrace.i(8244995031040L, 61430);
    pJd = Color.parseColor("#26eae9e2");
    GMTrace.o(8244995031040L, 61430);
  }
  
  public z(Context paramContext, y paramy, ViewGroup paramViewGroup)
  {
    super(paramContext, paramy, paramViewGroup);
    GMTrace.i(8243518636032L, 61419);
    GMTrace.o(8243518636032L, 61419);
  }
  
  private static void a(Spannable paramSpannable, int paramInt1, int paramInt2, Object... paramVarArgs)
  {
    GMTrace.i(8244055506944L, 61423);
    int i = 0;
    while (i < 2)
    {
      paramSpannable.setSpan(paramVarArgs[i], paramInt1, paramInt2, 18);
      i += 1;
    }
    GMTrace.o(8244055506944L, 61423);
  }
  
  public final void a(Bitmap paramBitmap1, Bitmap paramBitmap2)
  {
    GMTrace.i(16042910810112L, 119529);
    Object localObject1 = (y)bkA();
    Object localObject2 = this.pJe;
    ((RadarChart)localObject2).pFV = 0;
    ((RadarChart)localObject2).pFX = null;
    ((RadarChart)localObject2).pFO = null;
    ((RadarChart)localObject2).pFM = null;
    this.pJe.pFW = 5;
    localObject2 = new c();
    ((c)localObject2).pFr = 0;
    int i = Color.parseColor(((y)localObject1).pFb);
    ((c)localObject2).backgroundColor = (0x55FFFFFF & i);
    ((c)localObject2).pFw = pJd;
    ((c)localObject2).pFA = 1.0F;
    ((c)localObject2).pFL = paramBitmap2;
    ((c)localObject2).pFx = pJd;
    ((c)localObject2).pFy = pJd;
    ((c)localObject2).pFz = com.tencent.mm.br.a.fromDPToPix(this.context, 1);
    ((c)localObject2).pFB = -1;
    ((c)localObject2).pFD = 30.0F;
    ((c)localObject2).pFC = 40.0F;
    ((c)localObject2).pFH = paramBitmap1;
    ((c)localObject2).pFI = ((y)localObject1).pFa;
    ((c)localObject2).pFJ = Color.parseColor("#7feae9e2");
    ((c)localObject2).pFK = com.tencent.mm.br.a.fromDPToPix(this.context, 1);
    paramBitmap1 = this.pJe;
    paramBitmap1.pFN = ((c)localObject2);
    if (paramBitmap1.pFP != null)
    {
      paramBitmap1 = paramBitmap1.pFP;
      paramBitmap1.pFZ = ((c)localObject2);
      paramBitmap1.invalidate();
    }
    Object localObject3 = new b();
    ((b)localObject3).pFl = pJd;
    ((b)localObject3).pFm = 1.0F;
    ((b)localObject3).pFn = (i & 0x7FFFFFFF);
    ((b)localObject3).pFo = 127;
    ((b)localObject3).pFp = Color.parseColor("#00fcff");
    ((b)localObject3).pFq = com.tencent.mm.br.a.fromDPToPix(this.context, 2);
    paramBitmap1 = new ForegroundColorSpan(((y)localObject1).pFc);
    paramBitmap2 = new ForegroundColorSpan(((y)localObject1).pFe);
    localObject2 = new AbsoluteSizeSpan(((y)localObject1).pFd);
    AbsoluteSizeSpan localAbsoluteSizeSpan = new AbsoluteSizeSpan(((y)localObject1).pFf);
    localObject3 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.a((b)localObject3);
    StringBuilder localStringBuilder = new StringBuilder();
    localObject1 = ((y)localObject1).ozi.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      y.a locala = (y.a)((Iterator)localObject1).next();
      if (locala != null)
      {
        localStringBuilder.delete(0, localStringBuilder.length());
        localStringBuilder.append(locala.label).append(":").append(locala.pFh);
        SpannableString localSpannableString = new SpannableString(localStringBuilder.toString());
        a(localSpannableString, 0, locala.label.length() + 1, new Object[] { paramBitmap1, localObject2 });
        a(localSpannableString, locala.label.length() + 1, localStringBuilder.length(), new Object[] { paramBitmap2, localAbsoluteSizeSpan });
        ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.a)localObject3).put(localSpannableString, Float.valueOf(locala.value));
      }
    }
    paramBitmap1 = new ArrayList();
    paramBitmap1.add(localObject3);
    try
    {
      this.pJe.a((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.a[])paramBitmap1.toArray(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.a[paramBitmap1.size()]));
      this.pJe.pFU = 2;
      GMTrace.o(16042910810112L, 119529);
      return;
    }
    catch (Exception paramBitmap1)
    {
      for (;;)
      {
        Log.getStackTraceString(paramBitmap1);
      }
    }
  }
  
  protected final int aXW()
  {
    GMTrace.i(8243921289216L, 61422);
    int i = i.g.pfd;
    GMTrace.o(8243921289216L, 61422);
    return i;
  }
  
  public final View bkC()
  {
    GMTrace.i(8243652853760L, 61420);
    this.pJe = ((RadarChart)this.hqF.findViewById(i.f.pad));
    View localView = this.hqF;
    GMTrace.o(8243652853760L, 61420);
    return localView;
  }
  
  protected final void bkI()
  {
    GMTrace.i(8243787071488L, 61421);
    this.kCM = new CountDownLatch(2);
    e.b(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8259758981120L, 61540);
        try
        {
          z.this.kCM.await();
          z.this.hqF.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(8253719183360L, 61495);
              z.this.a(z.this.pJf, z.this.pJg);
              GMTrace.o(8253719183360L, 61495);
            }
          });
          GMTrace.o(8259758981120L, 61540);
          return;
        }
        catch (InterruptedException localInterruptedException)
        {
          for (;;) {}
        }
      }
    }, "AdlandingRadarComp").start();
    y localy = (y)bkA();
    if (localy != null)
    {
      d.a(localy.pEZ, localy.pEA, new d.a()
      {
        public final void Ih(String paramAnonymousString)
        {
          GMTrace.i(8272375447552L, 61634);
          try
          {
            paramAnonymousString = MMBitmapFactory.decodeFile(paramAnonymousString);
            z.this.pJf = paramAnonymousString;
            z.this.kCM.countDown();
            GMTrace.o(8272375447552L, 61634);
            return;
          }
          catch (Exception paramAnonymousString)
          {
            w.e("AdlandingRadarChartComp", "%s" + bg.f(paramAnonymousString));
            GMTrace.o(8272375447552L, 61634);
          }
        }
        
        public final void bkK()
        {
          GMTrace.i(8272107012096L, 61632);
          GMTrace.o(8272107012096L, 61632);
        }
        
        public final void bkL()
        {
          GMTrace.i(8272241229824L, 61633);
          z.this.pJf = null;
          z.this.kCM.countDown();
          GMTrace.o(8272241229824L, 61633);
        }
      });
      d.a(localy.pFg, localy.pEA, new d.a()
      {
        public final void Ih(String paramAnonymousString)
        {
          GMTrace.i(8252108570624L, 61483);
          try
          {
            z.this.pJg = MMBitmapFactory.decodeFile(paramAnonymousString);
            z.this.kCM.countDown();
            GMTrace.o(8252108570624L, 61483);
            return;
          }
          catch (Exception paramAnonymousString)
          {
            w.e("AdlandingRadarChartComp", "%s" + bg.f(paramAnonymousString));
            GMTrace.o(8252108570624L, 61483);
          }
        }
        
        public final void bkK()
        {
          GMTrace.i(8251840135168L, 61481);
          GMTrace.o(8251840135168L, 61481);
        }
        
        public final void bkL()
        {
          GMTrace.i(8251974352896L, 61482);
          z.this.pJg = null;
          z.this.kCM.countDown();
          GMTrace.o(8251974352896L, 61482);
        }
      });
      GMTrace.o(8243787071488L, 61421);
      return;
    }
    Log.wtf("AdlandingRadarChartComp", "null info");
    GMTrace.o(8243787071488L, 61421);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\component\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */