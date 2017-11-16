package com.tencent.mm.y;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.af;
import com.tencent.mm.l.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import java.util.Iterator;
import java.util.List;

public final class aa
{
  public static void Ay()
  {
    GMTrace.i(14628524392448L, 108991);
    Object localObject = s.As().iterator();
    x localx1;
    while (((Iterator)localObject).hasNext())
    {
      localx1 = (x)((Iterator)localObject).next();
      if ((localx1 != null) && ((int)localx1.fTq != 0) && (localx1.field_showHead == 32))
      {
        localx1.di(localx1.ux());
        w.d("MicroMsg.HardCodeUpdateTask", "contact to updatefavour " + localx1.field_username);
        at.AR();
        c.yK().a(localx1.field_username, localx1);
      }
    }
    localObject = s.gmD;
    int j = localObject.length;
    int i = 0;
    while (i < j)
    {
      localx1 = localObject[i];
      x localx2 = c.yK().TE(localx1);
      if ((localx2 != null) && (((int)localx2.fTq != 0) || (a.eE(localx2.field_type))))
      {
        localx2.uJ();
        c.yK().a(localx1, localx2);
      }
      i += 1;
    }
    GMTrace.o(14628524392448L, 108991);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */