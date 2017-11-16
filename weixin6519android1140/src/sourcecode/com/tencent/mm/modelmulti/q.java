package com.tencent.mm.modelmulti;

import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ap;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import com.tencent.mm.y.br;
import com.tencent.mm.y.c;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class q
  implements aq
{
  private b gOg;
  
  public q()
  {
    GMTrace.i(401982095360L, 2995);
    GMTrace.o(401982095360L, 2995);
  }
  
  public static r JF()
  {
    GMTrace.i(402653184000L, 3000);
    r localr = ((com.tencent.mm.plugin.zero.b.b)h.h(com.tencent.mm.plugin.zero.b.b.class)).JF();
    GMTrace.o(402653184000L, 3000);
    return localr;
  }
  
  public static b JG()
  {
    GMTrace.i(402787401728L, 3001);
    h.xw().wG();
    if (JH().gOg == null) {
      JH().gOg = new b();
    }
    b localb = JH().gOg;
    GMTrace.o(402787401728L, 3001);
    return localb;
  }
  
  private static q JH()
  {
    GMTrace.i(402921619456L, 3002);
    q localq2 = (q)at.AK().gZ(q.class.getName());
    q localq1 = localq2;
    if (localq2 == null)
    {
      localq1 = new q();
      at.AK().a(q.class.getName(), localq1);
    }
    GMTrace.o(402921619456L, 3002);
    return localq1;
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(402518966272L, 2999);
    b localb = JH().gOg;
    if (localb != null)
    {
      at.AR().zw().a(localb, at.xB().ngv.getLooper());
      at.xB().A(new b.1(localb));
    }
    GMTrace.o(402518966272L, 2999);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(402384748544L, 2998);
    GMTrace.o(402384748544L, 2998);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(402250530816L, 2997);
    GMTrace.o(402250530816L, 2997);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(403055837184L, 3003);
    b localb = JH().gOg;
    if (localb != null)
    {
      w.i("MicroMsg.GetChatRoomMsgService", "clear clearList.size:%d needGetInfosMap.size:%d respList.size:%d, currentListener:%s", new Object[] { Integer.valueOf(localb.gLD.size()), Integer.valueOf(localb.gLC.size()), Integer.valueOf(localb.gFB.size()), localb.gLE });
      localb.gFF.stopTimer();
      localb.gFG.stopTimer();
      localb.gLD.clear();
      localb.gLC.clear();
      localb.gFB.clear();
      localb.gLE = null;
      localb.gsb = false;
      at.AR().zw().j(localb);
    }
    GMTrace.o(403055837184L, 3003);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(402116313088L, 2996);
    GMTrace.o(402116313088L, 2996);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelmulti\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */