package com.tencent.mm.ui.chatting;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.sv;
import com.tencent.mm.g.a.sv.b;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.q;
import java.util.Iterator;
import java.util.List;

public final class v
{
  private static int wtw;
  private static int wtx;
  private static int wty;
  
  static
  {
    GMTrace.i(17906255527936L, 133412);
    wtw = 1;
    wtx = 2;
    wty = 3;
    GMTrace.o(17906255527936L, 133412);
  }
  
  public static int a(f.a parama, boolean paramBoolean)
  {
    GMTrace.i(17905450221568L, 133406);
    a locala = e(parama);
    switch (parama.gkk)
    {
    }
    for (;;)
    {
      i = R.k.cKP;
      GMTrace.o(17905450221568L, 133406);
      return i;
      if ((paramBoolean) || (locala.tMk == 1))
      {
        if ((locala.wtz <= 0) || (locala.wtA < 0) || (locala.wtB < 0)) {}
      }
      else {
        switch (locala.wtz)
        {
        default: 
          break;
        case 1: 
        case 2: 
          i = R.k.cKR;
          GMTrace.o(17905450221568L, 133406);
          return i;
        case 3: 
          i = R.k.cKP;
          GMTrace.o(17905450221568L, 133406);
          return i;
        case 4: 
          i = R.k.cKQ;
          GMTrace.o(17905450221568L, 133406);
          return i;
          if (locala.tMk != 2) {
            break label269;
          }
          if ((locala.wtz > 0) && (locala.wtC >= 0L)) {
            switch (locala.wtz)
            {
            }
          }
          break;
        }
      }
    }
    int i = R.k.cKR;
    GMTrace.o(17905450221568L, 133406);
    return i;
    i = R.k.cKP;
    GMTrace.o(17905450221568L, 133406);
    return i;
    i = R.k.cKQ;
    GMTrace.o(17905450221568L, 133406);
    return i;
    label269:
    i = R.k.cKP;
    GMTrace.o(17905450221568L, 133406);
    return i;
  }
  
  public static String a(int paramInt1, int paramInt2, boolean paramBoolean, f.a parama)
  {
    GMTrace.i(17905718657024L, 133408);
    Context localContext = ab.getContext();
    if (paramInt1 == 5)
    {
      parama = localContext.getString(R.l.dHq);
      GMTrace.o(17905718657024L, 133408);
      return parama;
    }
    if (paramInt1 == 4)
    {
      if (paramBoolean)
      {
        parama = localContext.getString(R.l.dHp);
        GMTrace.o(17905718657024L, 133408);
        return parama;
      }
      parama = localContext.getString(R.l.dHr);
      GMTrace.o(17905718657024L, 133408);
      return parama;
    }
    if (paramInt1 == 3)
    {
      if (paramInt2 == 2)
      {
        if (paramBoolean)
        {
          parama = parama.gjW;
          GMTrace.o(17905718657024L, 133408);
          return parama;
        }
        parama = localContext.getString(R.l.dHr);
        GMTrace.o(17905718657024L, 133408);
        return parama;
      }
      if (paramBoolean)
      {
        parama = parama.gjW;
        GMTrace.o(17905718657024L, 133408);
        return parama;
      }
      parama = parama.gjX;
      GMTrace.o(17905718657024L, 133408);
      return parama;
    }
    if (paramBoolean)
    {
      parama = parama.gjW;
      GMTrace.o(17905718657024L, 133408);
      return parama;
    }
    parama = parama.gjX;
    GMTrace.o(17905718657024L, 133408);
    return parama;
  }
  
  public static String b(f.a parama, boolean paramBoolean)
  {
    GMTrace.i(17905584439296L, 133407);
    for (;;)
    {
      int i1;
      long l;
      int i3;
      int i2;
      int n;
      int m;
      int k;
      int j;
      int i;
      try
      {
        str1 = q.zE();
        if (parama.gkk <= 0)
        {
          if (paramBoolean)
          {
            str1 = parama.gjW;
            GMTrace.o(17905584439296L, 133407);
            return str1;
          }
          str1 = parama.gjX;
          GMTrace.o(17905584439296L, 133407);
          return str1;
        }
        i1 = 0;
        int i7 = 0;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        l = -1L;
        Object localObject = parama.gkj;
        sv localsv = new sv();
        localsv.eYh.eYj = ((String)localObject);
        a.vgX.m(localsv);
        if (parama.gkk != 2)
        {
          i3 = i6;
          i2 = i5;
          n = i4;
          if (parama.gkk != 3) {
            break label936;
          }
        }
        m = i6;
        k = i5;
        j = i4;
        i = i7;
        if (!bg.cc(parama.gko))
        {
          localObject = parama.gko.iterator();
          m = i6;
          k = i5;
          j = i4;
          i = i7;
          if (((Iterator)localObject).hasNext())
          {
            arrayOfString = ((String)((Iterator)localObject).next()).split(",");
            if ((arrayOfString.length != 4) || (!arrayOfString[0].equals(str1))) {
              continue;
            }
            j = bg.getInt(arrayOfString[1], -1);
            k = bg.getInt(arrayOfString[2], -1);
            m = bg.getInt(arrayOfString[3], -1);
            i = 1;
          }
        }
        i3 = m;
        i2 = k;
        n = j;
        i1 = i;
        if (bg.cc(parama.gkq)) {
          break label936;
        }
        localObject = parama.gkq.iterator();
        i3 = m;
        i2 = k;
        n = j;
        i1 = i;
        if (!((Iterator)localObject).hasNext()) {
          break label936;
        }
        String[] arrayOfString = ((String)((Iterator)localObject).next()).split(",");
        if ((arrayOfString.length != 3) || (!arrayOfString[0].equals(str1))) {
          continue;
        }
        l = bg.getLong(arrayOfString[1], -1L);
        i2 = bg.getInt(arrayOfString[2], -1);
        i3 = 1;
        i1 = i;
        n = j;
        j = i3;
        i = i2;
        if (localsv.eYi.status == wty)
        {
          str1 = ab.getContext().getString(R.l.cPZ);
          GMTrace.o(17905584439296L, 133407);
          return str1;
        }
        if (localsv.eYi.status == wtx)
        {
          str1 = ab.getContext().getString(R.l.cPS);
          GMTrace.o(17905584439296L, 133407);
          return str1;
        }
        i2 = parama.gkk;
        switch (i2)
        {
        }
      }
      catch (Exception localException)
      {
        String str1;
        w.e("MicroMsg.C2CAppMsgUtil", "getC2CDescFromAppMsgContent, error: %s", new Object[] { localException.getMessage() });
        continue;
        str2 = parama.gjX;
        GMTrace.o(17905584439296L, 133407);
        return str2;
      }
      if (paramBoolean)
      {
        parama = parama.gjW;
        GMTrace.o(17905584439296L, 133407);
        return parama;
        if (paramBoolean)
        {
          str1 = parama.gjW;
          GMTrace.o(17905584439296L, 133407);
          return str1;
        }
        String str2;
        if ((!str2.equals(parama.gkt)) && (!paramBoolean)) {
          if (i1 != 0)
          {
            break label951;
            str2 = ab.getContext().getString(R.l.cQa);
            GMTrace.o(17905584439296L, 133407);
            return str2;
            str2 = ab.getContext().getString(R.l.cPY, new Object[] { Integer.valueOf(k - m) });
            GMTrace.o(17905584439296L, 133407);
            return str2;
            str2 = ab.getContext().getString(R.l.cPX);
            GMTrace.o(17905584439296L, 133407);
            return str2;
            str2 = ab.getContext().getString(R.l.cPZ);
            GMTrace.o(17905584439296L, 133407);
            return str2;
          }
          else
          {
            if (j != 0)
            {
              if ((i <= 0) || (l < 0L)) {
                continue;
              }
              switch (i)
              {
              default: 
                break;
              case 1: 
                str2 = ab.getContext().getString(R.l.cPU, new Object[] { Float.valueOf((float)l / 100.0F) });
                GMTrace.o(17905584439296L, 133407);
                return str2;
              case 2: 
                str2 = ab.getContext().getString(R.l.cPT, new Object[] { Float.valueOf((float)l / 100.0F) });
                GMTrace.o(17905584439296L, 133407);
                return str2;
              case 3: 
                str2 = ab.getContext().getString(R.l.cPW, new Object[] { Float.valueOf((float)l / 100.0F) });
                GMTrace.o(17905584439296L, 133407);
                return str2;
              case 4: 
                str2 = ab.getContext().getString(R.l.cPV);
                GMTrace.o(17905584439296L, 133407);
                return str2;
              }
            }
            str2 = ab.getContext().getString(R.l.cPV);
            GMTrace.o(17905584439296L, 133407);
            return str2;
          }
        }
      }
      else
      {
        parama = parama.gjX;
        GMTrace.o(17905584439296L, 133407);
        return parama;
        label936:
        i = -1;
        j = 0;
        m = i3;
        k = i2;
        continue;
      }
      label951:
      if ((n > 0) && (k >= 0) && (m >= 0)) {
        switch (n)
        {
        }
      }
    }
  }
  
  public static int c(f.a parama, boolean paramBoolean)
  {
    GMTrace.i(17906121310208L, 133411);
    if (parama == null)
    {
      if (paramBoolean)
      {
        i = R.g.aTl;
        GMTrace.o(17906121310208L, 133411);
        return i;
      }
      i = R.g.aTj;
      GMTrace.o(17906121310208L, 133411);
      return i;
    }
    Object localObject = parama.gkj;
    sv localsv = new sv();
    localsv.eYh.eYj = ((String)localObject);
    a.vgX.m(localsv);
    if ((localsv.eYi.status == wty) || (localsv.eYi.status == wtx))
    {
      if (paramBoolean)
      {
        i = R.g.aTm;
        GMTrace.o(17906121310208L, 133411);
        return i;
      }
      i = R.g.aTk;
      GMTrace.o(17906121310208L, 133411);
      return i;
    }
    localObject = e(parama);
    switch (parama.gkk)
    {
    }
    while (paramBoolean)
    {
      i = R.g.aTl;
      GMTrace.o(17906121310208L, 133411);
      return i;
      if ((paramBoolean) || (((a)localObject).tMk == 1)) {
        if ((((a)localObject).wtz <= 0) || (((a)localObject).wtA < 0) || (((a)localObject).wtB < 0)) {
          break;
        }
      } else {
        switch (((a)localObject).wtz)
        {
        default: 
          break;
        case 1: 
        case 2: 
          if (paramBoolean)
          {
            i = R.g.aTl;
            GMTrace.o(17906121310208L, 133411);
            return i;
          }
          i = R.g.aTj;
          GMTrace.o(17906121310208L, 133411);
          return i;
        case 3: 
        case 4: 
          if (paramBoolean)
          {
            i = R.g.aTm;
            GMTrace.o(17906121310208L, 133411);
            return i;
          }
          i = R.g.aTk;
          GMTrace.o(17906121310208L, 133411);
          return i;
          if (((a)localObject).tMk == 2)
          {
            if ((((a)localObject).wtz > 0) && (((a)localObject).wtC >= 0L)) {
              switch (((a)localObject).wtz)
              {
              default: 
                break;
              case 1: 
                if (paramBoolean)
                {
                  i = R.g.aTl;
                  GMTrace.o(17906121310208L, 133411);
                  return i;
                }
                i = R.g.aTj;
                GMTrace.o(17906121310208L, 133411);
                return i;
              case 2: 
              case 3: 
              case 4: 
                if (paramBoolean)
                {
                  i = R.g.aTm;
                  GMTrace.o(17906121310208L, 133411);
                  return i;
                }
                i = R.g.aTk;
                GMTrace.o(17906121310208L, 133411);
                return i;
              }
            }
          }
          else
          {
            if (paramBoolean)
            {
              i = R.g.aTl;
              GMTrace.o(17906121310208L, 133411);
              return i;
            }
            i = R.g.aTj;
            GMTrace.o(17906121310208L, 133411);
            return i;
          }
          break;
        }
      }
    }
    int i = R.g.aTj;
    GMTrace.o(17906121310208L, 133411);
    return i;
  }
  
  public static a e(f.a parama)
  {
    GMTrace.i(17905316003840L, 133405);
    String str = q.zE();
    if ((parama.gkk == 2) || (parama.gkk == 3))
    {
      Object localObject;
      if (!bg.cc(parama.gko))
      {
        localObject = parama.gko.iterator();
        while (((Iterator)localObject).hasNext())
        {
          String[] arrayOfString = ((String)((Iterator)localObject).next()).split(",");
          if ((arrayOfString.length == 4) && (arrayOfString[0].equals(str)))
          {
            parama = new a(bg.getInt(arrayOfString[1], -1), bg.getInt(arrayOfString[2], -1), bg.getInt(arrayOfString[3], -1));
            GMTrace.o(17905316003840L, 133405);
            return parama;
          }
        }
      }
      if (!bg.cc(parama.gkq))
      {
        parama = parama.gkq.iterator();
        while (parama.hasNext())
        {
          localObject = ((String)parama.next()).split(",");
          if ((localObject.length == 3) && (localObject[0].equals(str)))
          {
            long l = bg.getLong(localObject[1], -1L);
            parama = new a(bg.getInt(localObject[2], -1), l);
            GMTrace.o(17905316003840L, 133405);
            return parama;
          }
        }
      }
    }
    parama = new a();
    GMTrace.o(17905316003840L, 133405);
    return parama;
  }
  
  public static int q(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    GMTrace.i(17905852874752L, 133409);
    if (paramInt1 == 5)
    {
      if (paramBoolean)
      {
        paramInt1 = R.g.aUN;
        GMTrace.o(17905852874752L, 133409);
        return paramInt1;
      }
      paramInt1 = R.g.aUL;
      GMTrace.o(17905852874752L, 133409);
      return paramInt1;
    }
    if (paramInt1 == 4)
    {
      if (paramBoolean)
      {
        paramInt1 = R.g.aUN;
        GMTrace.o(17905852874752L, 133409);
        return paramInt1;
      }
      paramInt1 = R.g.aUL;
      GMTrace.o(17905852874752L, 133409);
      return paramInt1;
    }
    if (paramInt1 == 3)
    {
      if (paramInt2 == 2)
      {
        if (paramBoolean)
        {
          paramInt1 = R.g.aUM;
          GMTrace.o(17905852874752L, 133409);
          return paramInt1;
        }
        paramInt1 = R.g.aUL;
        GMTrace.o(17905852874752L, 133409);
        return paramInt1;
      }
      if (paramBoolean)
      {
        paramInt1 = R.g.aUM;
        GMTrace.o(17905852874752L, 133409);
        return paramInt1;
      }
      paramInt1 = R.g.aUK;
      GMTrace.o(17905852874752L, 133409);
      return paramInt1;
    }
    if (paramBoolean)
    {
      paramInt1 = R.g.aUM;
      GMTrace.o(17905852874752L, 133409);
      return paramInt1;
    }
    paramInt1 = R.g.aUK;
    GMTrace.o(17905852874752L, 133409);
    return paramInt1;
  }
  
  public static int r(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    GMTrace.i(17905987092480L, 133410);
    if (paramInt1 == 5)
    {
      paramInt1 = R.g.aXM;
      GMTrace.o(17905987092480L, 133410);
      return paramInt1;
    }
    if (paramInt1 == 4)
    {
      paramInt1 = R.g.aXM;
      GMTrace.o(17905987092480L, 133410);
      return paramInt1;
    }
    if (paramInt1 == 3)
    {
      if (paramInt2 == 2)
      {
        if (paramBoolean)
        {
          GMTrace.o(17905987092480L, 133410);
          return -1;
        }
        paramInt1 = R.g.aXM;
        GMTrace.o(17905987092480L, 133410);
        return paramInt1;
      }
      if (paramBoolean)
      {
        GMTrace.o(17905987092480L, 133410);
        return -1;
      }
      paramInt1 = R.g.aXM;
      GMTrace.o(17905987092480L, 133410);
      return paramInt1;
    }
    GMTrace.o(17905987092480L, 133410);
    return -1;
  }
  
  public static final class a
  {
    public int tMk;
    public int wtA;
    public int wtB;
    public long wtC;
    public int wtz;
    
    public a()
    {
      GMTrace.i(17917932470272L, 133499);
      this.wtA = -1;
      this.wtB = -1;
      this.wtC = -1L;
      this.tMk = 3;
      GMTrace.o(17917932470272L, 133499);
    }
    
    public a(int paramInt1, int paramInt2, int paramInt3)
    {
      GMTrace.i(17917664034816L, 133497);
      this.wtA = -1;
      this.wtB = -1;
      this.wtC = -1L;
      this.tMk = 1;
      this.wtz = paramInt1;
      this.wtA = paramInt2;
      this.wtB = paramInt3;
      GMTrace.o(17917664034816L, 133497);
    }
    
    public a(int paramInt, long paramLong)
    {
      GMTrace.i(17917798252544L, 133498);
      this.wtA = -1;
      this.wtB = -1;
      this.wtC = -1L;
      this.tMk = 2;
      this.wtz = paramInt;
      this.wtC = paramLong;
      GMTrace.o(17917798252544L, 133498);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */