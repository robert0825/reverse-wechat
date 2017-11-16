package com.tencent.mm.ac;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.List;

public final class m
{
  public static List<String> gtg;
  public static int gth;
  private static a gti;
  
  static
  {
    GMTrace.i(386681274368L, 2881);
    gtg = null;
    gth = 0;
    gti = new a(new b());
    GMTrace.o(386681274368L, 2881);
  }
  
  public static void Ds()
  {
    GMTrace.i(386010185728L, 2876);
    gth = 0;
    gti.stopTimer();
    GMTrace.o(386010185728L, 2876);
  }
  
  public static void f(Runnable paramRunnable)
  {
    GMTrace.i(385875968000L, 2875);
    if (!h.xw().wL())
    {
      GMTrace.o(385875968000L, 2875);
      return;
    }
    Object localObject = n.Di();
    ArrayList localArrayList = new ArrayList();
    localObject = ((i)localObject).goN.a("select username from img_flag where username not in (select username from rcontact ) and username not like \"%@qqim\" and username not like \"%@bottle\";", null, 2);
    while (((Cursor)localObject).moveToNext()) {
      localArrayList.add(((Cursor)localObject).getString(0));
    }
    ((Cursor)localObject).close();
    gtg = localArrayList;
    if (localArrayList.size() <= 0)
    {
      GMTrace.o(385875968000L, 2875);
      return;
    }
    gti.gtj.gtk = paramRunnable;
    gti.z(10L, 10L);
    GMTrace.o(385875968000L, 2875);
  }
  
  static final class a
    extends aj
  {
    final m.b gtj;
    
    public a(m.b paramb)
    {
      super(true);
      GMTrace.i(374199025664L, 2788);
      this.gtj = paramb;
      GMTrace.o(374199025664L, 2788);
    }
  }
  
  static final class b
    implements aj.a
  {
    Runnable gtk;
    
    b()
    {
      GMTrace.i(382923177984L, 2853);
      GMTrace.o(382923177984L, 2853);
    }
    
    public final boolean pM()
    {
      GMTrace.i(383057395712L, 2854);
      int j = m.gtg.size();
      w.e("MicroMsg.RemoveAvatarTask", "RemoveOldAvatar left count:" + j);
      if ((j <= 2000) || (m.gth >= 300))
      {
        if (this.gtk != null) {
          this.gtk.run();
        }
        m.gth = 0;
        GMTrace.o(383057395712L, 2854);
        return false;
      }
      long l = h.xy().fYV.cE(Thread.currentThread().getId());
      int i = j - 1;
      while (i >= j - 30)
      {
        m.gth += 1;
        String str = (String)m.gtg.get(i);
        m.gtg.remove(i);
        n.Dh();
        d.u(str, false);
        n.Dh();
        d.u(str, true);
        n.Di().ih(str);
        i -= 1;
      }
      h.xy().fYV.aL(l);
      GMTrace.o(383057395712L, 2854);
      return true;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ac\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */