package com.tencent.mm.plugin.luckymoney.particles;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wxpay.a.d;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

public final class a
{
  private static int mKe;
  private static int mKf;
  private static int mKg;
  private static int mKh;
  private static int mKi;
  private static int mKj;
  public c mKk;
  
  public a(ViewGroup paramViewGroup)
  {
    GMTrace.i(9910502817792L, 73839);
    if (mKe == 0)
    {
      paramViewGroup = paramViewGroup.getResources();
      mKe = paramViewGroup.getDimensionPixelSize(a.d.sni);
      mKf = paramViewGroup.getDimensionPixelOffset(a.d.snm);
      mKg = paramViewGroup.getDimensionPixelOffset(a.d.snl);
      mKh = paramViewGroup.getDimensionPixelOffset(a.d.snk);
      mKi = paramViewGroup.getDimensionPixelOffset(a.d.snn);
      mKj = paramViewGroup.getDimensionPixelOffset(a.d.snj);
    }
    GMTrace.o(9910502817792L, 73839);
  }
  
  public static a a(ViewGroup paramViewGroup, b paramb)
  {
    GMTrace.i(9910637035520L, 73840);
    a locala = new a(paramViewGroup);
    paramViewGroup = new c(paramViewGroup.getContext(), paramb, new d(paramViewGroup.getWidth() / 2, paramViewGroup.getHeight() + 400), paramViewGroup).w(0.0F, 800.0F).x(-2000.0F, 1250.0F).ae(2000.0F);
    paramViewGroup.mKT = 3000.0F;
    paramViewGroup.mKU = 500.0F;
    paramViewGroup = paramViewGroup.aMk();
    paramViewGroup.mKw = e.aMo();
    locala.mKk = paramViewGroup.aMl().aMm();
    GMTrace.o(9910637035520L, 73840);
    return locala;
  }
  
  public final c x(int paramInt, long paramLong)
  {
    GMTrace.i(9910771253248L, 73841);
    c localc = this.mKk;
    localc.mKs = 0;
    localc.mKt = paramLong;
    localc.mKu = (paramInt / 1000.0F);
    localc.mKv = (1.0F / localc.mKu);
    if (localc.iKQ != null) {
      localc.iKQ.cancel();
    }
    localc.mKr = 0L;
    Object localObject = localc.mKq.iterator();
    while (((Iterator)localObject).hasNext())
    {
      localc.mKp.add(((Iterator)localObject).next());
      ((Iterator)localObject).remove();
    }
    localObject = localc.mKo.getParent();
    if (localObject != null)
    {
      if (localObject != localc.mKn) {
        ((ViewGroup)localObject).removeView(localc.mKo);
      }
    }
    else {
      localc.mKn.addView(localc.mKo);
    }
    localc.mKo.mLa = false;
    localc.y(localc.mKs, 0L);
    localc.iKQ = ValueAnimator.ofInt(new int[] { 0 }).setDuration(Long.MAX_VALUE);
    localc.iKQ.addUpdateListener(new c.2(localc));
    localc.iKQ.start();
    GMTrace.o(9910771253248L, 73841);
    return localc;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\particles\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */