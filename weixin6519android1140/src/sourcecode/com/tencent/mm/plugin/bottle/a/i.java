package com.tencent.mm.plugin.bottle.a;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.av.f;
import com.tencent.mm.bu.g;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.as.a;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.br;
import java.util.HashMap;

public final class i
  implements aq
{
  private static HashMap<Integer, g.d> fIv;
  private as.a gnp;
  private b jpf;
  
  static
  {
    GMTrace.i(7597931364352L, 56609);
    HashMap localHashMap = new HashMap();
    fIv = localHashMap;
    localHashMap.put(Integer.valueOf("THROWBOTTLEINFO_TABLE".hashCode()), new g.d()
    {
      public final String[] rf()
      {
        GMTrace.i(7595112792064L, 56588);
        String[] arrayOfString = b.fTX;
        GMTrace.o(7595112792064L, 56588);
        return arrayOfString;
      }
    });
    GMTrace.o(7597931364352L, 56609);
  }
  
  public i()
  {
    GMTrace.i(7596723404800L, 56600);
    this.gnp = new as.a()
    {
      public final void a(ae paramAnonymousae, as paramAnonymousas)
      {
        GMTrace.i(7598199799808L, 56611);
        if (paramAnonymousae == null)
        {
          GMTrace.o(7598199799808L, 56611);
          return;
        }
        if ("_USER_FOR_THROWBOTTLE_".equals(paramAnonymousae.field_username))
        {
          paramAnonymousae.setUsername("");
          GMTrace.o(7598199799808L, 56611);
          return;
        }
        if ((1 != paramAnonymousae.field_isSend) && (x.fw(paramAnonymousae.field_username)) && (!paramAnonymousas.yN(paramAnonymousae.field_username))) {
          c.tD(paramAnonymousae.field_username);
        }
        GMTrace.o(7598199799808L, 56611);
      }
    };
    GMTrace.o(7596723404800L, 56600);
  }
  
  public static void ahA()
  {
    GMTrace.i(7597528711168L, 56606);
    at.AR();
    Cursor localCursor = com.tencent.mm.y.c.yP().bTe();
    int i = 0;
    while (i < localCursor.getCount())
    {
      localCursor.moveToPosition(i);
      ae localae = new ae();
      localae.b(localCursor);
      at.AR();
      au localau = com.tencent.mm.y.c.yM().BZ(localae.field_username);
      at.AR();
      com.tencent.mm.y.c.yJ().b(new com.tencent.mm.av.d(localae.field_username, localau.field_msgSvrId));
      at.AR();
      com.tencent.mm.y.c.yJ().b(new f(localae.field_username, 0));
      at.AR();
      com.tencent.mm.y.c.yK().TK(localae.field_username);
      i += 1;
    }
    localCursor.close();
    at.AR();
    com.tencent.mm.y.c.yM().Ch("@bottle");
    at.AR();
    com.tencent.mm.y.c.yP().bSY();
    at.AR();
    com.tencent.mm.y.c.yP().Ch("floatbottle");
    bc.Bh();
    ahz().goN.delete("bottleinfo1", null, null);
    GMTrace.o(7597528711168L, 56606);
  }
  
  private static i ahy()
  {
    GMTrace.i(7596857622528L, 56601);
    i locali2 = (i)at.AK().gZ("plugin.bottle");
    i locali1 = locali2;
    if (locali2 == null)
    {
      locali1 = new i();
      at.AK().a("plugin.bottle", locali1);
    }
    GMTrace.o(7596857622528L, 56601);
    return locali1;
  }
  
  public static b ahz()
  {
    GMTrace.i(7596991840256L, 56602);
    h.xw().wG();
    if (ahy().jpf == null)
    {
      localObject = ahy();
      at.AR();
      ((i)localObject).jpf = new b(com.tencent.mm.y.c.yH());
    }
    Object localObject = ahy().jpf;
    GMTrace.o(7596991840256L, 56602);
    return (b)localObject;
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(7597662928896L, 56607);
    c.ahu();
    at.AR();
    com.tencent.mm.y.c.yP().b(this.gnp);
    GMTrace.o(7597662928896L, 56607);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(7597797146624L, 56608);
    GMTrace.o(7597797146624L, 56608);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(7597394493440L, 56605);
    if ((paramInt & 0x40) != 0) {
      ahA();
    }
    GMTrace.o(7597394493440L, 56605);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(7597126057984L, 56603);
    at.AR();
    com.tencent.mm.y.c.yP().c(this.gnp);
    GMTrace.o(7597126057984L, 56603);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(7597260275712L, 56604);
    HashMap localHashMap = fIv;
    GMTrace.o(7597260275712L, 56604);
    return localHashMap;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\bottle\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */