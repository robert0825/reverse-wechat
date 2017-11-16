package com.tencent.mm.pluginsdk.wallet;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.sw;
import com.tencent.mm.g.a.sw.b;
import com.tencent.mm.g.a.sx;
import com.tencent.mm.g.a.sx.b;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import java.util.Iterator;
import java.util.List;

public final class e
{
  public static String PT(String paramString)
  {
    GMTrace.i(20404718534656L, 152027);
    at.AR();
    Object localObject = com.tencent.mm.y.c.yM().Cz(paramString);
    int k;
    int j;
    int i;
    if (localObject != null)
    {
      w.i("MicroMsg.WalletConvDelCheckLogic", "checkUnProcessWalletMsgCount, msgInfoList size: %s", new Object[] { Integer.valueOf(((List)localObject).size()) });
      Iterator localIterator = ((List)localObject).iterator();
      k = 0;
      j = 0;
      i = 0;
      while (localIterator.hasNext())
      {
        localObject = (au)localIterator.next();
        if (!aa((au)localObject)) {
          break label359;
        }
        if (((ce)localObject).field_type == 419430449)
        {
          k += 1;
        }
        else
        {
          if (((ce)localObject).field_type != 436207665) {
            break label359;
          }
          localObject = ((ce)localObject).field_content;
          if (localObject == null) {
            break label362;
          }
        }
      }
    }
    label359:
    label362:
    for (localObject = f.a.eS((String)localObject);; localObject = null)
    {
      if (localObject != null)
      {
        if ("1001".equals(((f.a)localObject).gka))
        {
          j += 1;
          break;
        }
        i += 1;
      }
      for (;;)
      {
        break;
        if ((i > 0) || (j > 0) || (k > 0))
        {
          if (s.eb(paramString))
          {
            paramString = ab.getContext().getString(R.l.ejy, new Object[] { Integer.valueOf(j) });
            GMTrace.o(20404718534656L, 152027);
            return paramString;
          }
          if ((i > 0) && (k <= 0))
          {
            paramString = ab.getContext().getString(R.l.ejA, new Object[] { Integer.valueOf(i) });
            GMTrace.o(20404718534656L, 152027);
            return paramString;
          }
          if ((k > 0) && (i <= 0))
          {
            paramString = ab.getContext().getString(R.l.ejB, new Object[] { Integer.valueOf(k) });
            GMTrace.o(20404718534656L, 152027);
            return paramString;
          }
          if ((k > 0) && (i > 0))
          {
            paramString = ab.getContext().getString(R.l.ejz, new Object[] { Integer.valueOf(i), Integer.valueOf(k) });
            GMTrace.o(20404718534656L, 152027);
            return paramString;
          }
        }
        GMTrace.o(20404718534656L, 152027);
        return null;
      }
    }
  }
  
  public static boolean aa(au paramau)
  {
    Object localObject1 = null;
    GMTrace.i(19251251380224L, 143433);
    if (paramau.field_type == 419430449)
    {
      if (paramau.field_isSend != 0) {
        break label342;
      }
      localObject1 = paramau.field_content;
      if (localObject1 == null) {
        break label359;
      }
    }
    label342:
    label352:
    label359:
    for (paramau = f.a.C((String)localObject1, paramau.field_reserved);; paramau = null)
    {
      int i;
      if (paramau != null)
      {
        localObject1 = new sx();
        ((sx)localObject1).eYp.eRi = paramau.gjA;
        a.vgX.m((b)localObject1);
        j = ((sx)localObject1).eYq.status;
        i = j;
        if (j <= 0) {
          i = paramau.gjx;
        }
        if ((i >= 0) && ((i == 1) || (i == 7)))
        {
          GMTrace.o(19251251380224L, 143433);
          return true;
          if ((paramau.field_type == 436207665) && (paramau.field_isSend == 0))
          {
            Object localObject2 = paramau.field_content;
            if (localObject2 != null) {
              localObject1 = f.a.eS((String)localObject2);
            }
            if (localObject1 != null) {
              if ((!"1001".equals(((f.a)localObject1).gka)) && (!s.eb(paramau.field_talker)))
              {
                paramau = new sw();
                if (!bg.nm(((f.a)localObject1).gkb))
                {
                  paramau.eYk.eYm = ((f.a)localObject1).gkb;
                  a.vgX.m(paramau);
                  if (paramau.eYl.eYo == 0)
                  {
                    GMTrace.o(19251251380224L, 143433);
                    return true;
                  }
                }
              }
              else if (s.eb(paramau.field_talker))
              {
                paramau = q.zE();
                if (bg.cc(((f.a)localObject1).gkq)) {
                  break label352;
                }
                localObject1 = ((f.a)localObject1).gkq.iterator();
                while (((Iterator)localObject1).hasNext())
                {
                  localObject2 = ((String)((Iterator)localObject1).next()).split(",");
                  if ((localObject2.length == 3) && (localObject2[0].equals(paramau))) {
                    i = bg.getInt(localObject2[2], -1);
                  }
                }
              }
            }
          }
        }
      }
      for (int j = 1;; j = 0)
      {
        if ((j != 0) && (i == 1))
        {
          GMTrace.o(19251251380224L, 143433);
          return true;
        }
        GMTrace.o(19251251380224L, 143433);
        return false;
        i = 0;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\wallet\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */