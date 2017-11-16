package com.tencent.mm.plugin.qqmail.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.kernel.h;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.storage.as;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.br;
import com.tencent.mm.y.c;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;

public final class w
  implements aq
{
  private p nTN;
  private b nTO;
  private v nTl;
  
  public w()
  {
    GMTrace.i(5461587787776L, 40692);
    this.nTO = new b();
    GMTrace.o(5461587787776L, 40692);
  }
  
  private static w aYD()
  {
    GMTrace.i(5461722005504L, 40693);
    w localw2 = (w)at.AK().gZ("plugin.qqmail");
    w localw1 = localw2;
    if (localw2 == null)
    {
      localw1 = new w();
      at.AK().a("plugin.qqmail", localw1);
    }
    GMTrace.o(5461722005504L, 40693);
    return localw1;
  }
  
  public static p aYE()
  {
    GMTrace.i(5461856223232L, 40694);
    h.xw().wG();
    if (aYD().nTN == null) {
      aYD().nTN = new p(d.tJC, d.DEVICE_TYPE);
    }
    p localp = aYD().nTN;
    GMTrace.o(5461856223232L, 40694);
    return localp;
  }
  
  public static v aYF()
  {
    GMTrace.i(5461990440960L, 40695);
    h.xw().wG();
    if (aYD().nTl == null) {
      aYD().nTl = new v();
    }
    v localv = aYD().nTl;
    GMTrace.o(5461990440960L, 40695);
    return localv;
  }
  
  public static void aYG()
  {
    GMTrace.i(5462527311872L, 40699);
    bc.gS("qqmail");
    at.AR();
    c.yP().TN("qqmail");
    p localp = aYE();
    at.AR();
    e.f(new File(c.zc()));
    localp.reset();
    GMTrace.o(5462527311872L, 40699);
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(5462661529600L, 40700);
    com.tencent.mm.sdk.b.a.vgX.b(this.nTO);
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5477022826496L, 40807);
        if (!at.AU())
        {
          GMTrace.o(5477022826496L, 40807);
          return;
        }
        long l = System.currentTimeMillis();
        s locals = new s();
        if (locals.nTj.mTh.size() > 0)
        {
          int i = 0;
          while (i < locals.nTj.mTh.size())
          {
            s.Fa(((q)locals.nTj.mTh.get(i)).nSb);
            i += 1;
          }
          locals.nTj.mTh.clear();
          locals.save();
        }
        com.tencent.mm.sdk.platformtools.w.i("SubCoreQQMail", "summeranrt onAccountPostReset notifyAllFail take[%d]ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        GMTrace.o(5477022826496L, 40807);
      }
    });
    GMTrace.o(5462661529600L, 40700);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(5462795747328L, 40701);
    GMTrace.o(5462795747328L, 40701);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(5462393094144L, 40698);
    if ((paramInt & 0x1) != 0) {
      aYG();
    }
    GMTrace.o(5462393094144L, 40698);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(5462124658688L, 40696);
    p localp = aYD().nTN;
    if (localp != null) {
      localp.reset();
    }
    com.tencent.mm.sdk.b.a.vgX.c(this.nTO);
    GMTrace.o(5462124658688L, 40696);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(5462258876416L, 40697);
    GMTrace.o(5462258876416L, 40697);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\qqmail\b\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */