package com.tencent.mm.plugin.favorite.b;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.favorite.c.d;
import com.tencent.mm.protocal.c.aox;
import com.tencent.mm.protocal.c.apa;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tl;
import com.tencent.mm.protocal.c.ud;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class z
{
  public static void a(long paramLong, LinkedList<aox> paramLinkedList, LinkedList<apa> paramLinkedList1)
  {
    GMTrace.i(6261928099840L, 46655);
    Object localObject1 = new aox();
    ((aox)localObject1).uEL = 4;
    ((aox)localObject1).uEM = 0;
    paramLinkedList.add(localObject1);
    localObject1 = com.tencent.mm.plugin.favorite.h.axw();
    paramLinkedList = new LinkedList();
    Object localObject2 = "select * from FavCdnInfo where favLocalId = " + paramLong + " and type = 0" + " and status = 3";
    localObject1 = ((b)localObject1).fTZ.a((String)localObject2, null, 2);
    if ((localObject1 != null) && (((Cursor)localObject1).moveToFirst())) {
      do
      {
        localObject2 = new a();
        ((a)localObject2).b((Cursor)localObject1);
        paramLinkedList.add(localObject2);
      } while (((Cursor)localObject1).moveToNext());
    }
    if (localObject1 != null) {
      ((Cursor)localObject1).close();
    }
    w.v("MicroMsg.FavCdnStorage", "getUploadedInfos size:%d", new Object[] { Integer.valueOf(paramLinkedList.size()) });
    paramLinkedList = paramLinkedList.iterator();
    label545:
    while (paramLinkedList.hasNext())
    {
      localObject1 = (a)paramLinkedList.next();
      boolean bool = x.xR(((a)localObject1).field_dataId);
      if ((bg.nm(((a)localObject1).field_cdnUrl)) || (bool))
      {
        w.e("MicroMsg.ModFavItemLogic", "setModAfterClientUpload cdnUrl:%s, isThumb:%b,  favLocalId:%d", new Object[] { ((a)localObject1).field_cdnUrl, Boolean.valueOf(bool), Long.valueOf(paramLong) });
      }
      else
      {
        localObject2 = new apa();
        ((apa)localObject2).lRR = ("dataitem." + ((a)localObject1).field_dataId + ".cdn_dataurl");
        ((apa)localObject2).oqQ = ((a)localObject1).field_cdnUrl;
        paramLinkedList1.add(localObject2);
        localObject2 = new apa();
        ((apa)localObject2).lRR = ("dataitem." + ((a)localObject1).field_dataId + ".cdn_datakey");
        ((apa)localObject2).oqQ = ((a)localObject1).field_cdnKey;
        paramLinkedList1.add(localObject2);
        localObject2 = new apa();
        ((apa)localObject2).lRR = ("dataitem." + ((a)localObject1).field_dataId);
        ((apa)localObject2).uER = "datastatus";
        ((apa)localObject2).oqQ = "0";
        paramLinkedList1.add(localObject2);
        localObject2 = com.tencent.mm.plugin.favorite.h.axB().cf(((a)localObject1).field_favLocalId);
        if (localObject2 != null)
        {
          if (((j)localObject2).field_type == 4) {}
          for (int i = 1;; i = 0)
          {
            if (i == 0) {
              break label545;
            }
            localObject2 = x.a((j)localObject2, ((a)localObject1).field_dataId);
            apa localapa = new apa();
            localapa.lRR = ("dataitem." + ((a)localObject1).field_dataId + ".stream_videoid");
            localapa.oqQ = ((th)localObject2).ukd;
            paramLinkedList1.add(localapa);
            break;
          }
        }
      }
    }
    GMTrace.o(6261928099840L, 46655);
  }
  
  public static void a(j paramj, int paramInt)
  {
    GMTrace.i(6261793882112L, 46654);
    if (paramj == null)
    {
      w.w("MicroMsg.ModFavItemLogic", "modeTag, item info is null");
      GMTrace.o(6261793882112L, 46654);
      return;
    }
    LinkedList localLinkedList1 = new LinkedList();
    Object localObject1 = new aox();
    ((aox)localObject1).uEL = 4;
    ((aox)localObject1).uEM = 0;
    localLinkedList1.add(localObject1);
    LinkedList localLinkedList2 = new LinkedList();
    localObject1 = new apa();
    ((apa)localObject1).lRR = "favitem.taglist";
    ((apa)localObject1).jib = 1;
    Object localObject2 = new StringBuffer();
    int j = paramj.field_tagProto.ulP.size();
    int i = 0;
    while (i < j)
    {
      ((StringBuffer)localObject2).append("<tag>").append(bg.Sw((String)paramj.field_tagProto.ulP.get(i))).append("</tag>");
      i += 1;
    }
    ((apa)localObject1).oqQ = ((StringBuffer)localObject2).toString();
    w.v("MicroMsg.ModFavItemLogic", "do net scene mod tag, id=%d, tag=%s", new Object[] { Integer.valueOf(paramj.field_id), ((apa)localObject1).oqQ });
    localLinkedList2.add(localObject1);
    if (paramj.field_id > 0)
    {
      localObject1 = new ah(paramj.field_id, localLinkedList1, localLinkedList2);
      at.wS().a((com.tencent.mm.ad.k)localObject1, 0);
      com.tencent.mm.plugin.report.service.g.ork.i(11122, new Object[] { Integer.valueOf(paramj.field_id), Integer.valueOf(j), Integer.valueOf(com.tencent.mm.plugin.favorite.h.axu().axR()), Integer.valueOf(paramInt) });
      GMTrace.o(6261793882112L, 46654);
      return;
    }
    localObject2 = com.tencent.mm.plugin.favorite.h.axz();
    long l = paramj.field_localId;
    i = 0;
    paramj = com.tencent.mm.plugin.favorite.h.axx();
    w.d("MicroMsg.FavModInfoStorage", "get mod info sql %s, {%d, %d}", new Object[] { "select * from FavEditInfo where localId =  ? and type =  ?", Long.valueOf(l), Integer.valueOf(0) });
    localObject1 = paramj.fTZ.a("select * from FavEditInfo where localId =  ? and type =  ?", new String[] { String.valueOf(l), "0" }, 2);
    if (localObject1 == null)
    {
      paramj = null;
      localObject1 = paramj;
      if (paramj == null)
      {
        i = 1;
        localObject1 = new g();
      }
      ((g)localObject1).field_localId = l;
      paramj = new tl();
      paramj.lcD = localLinkedList1;
      paramj.ull = localLinkedList2;
      ((g)localObject1).field_modItem = paramj;
      ((g)localObject1).field_time = bg.Pv();
      ((g)localObject1).field_type = 0;
      ((g)localObject1).field_scene = paramInt;
      if (i == 0) {
        break label529;
      }
      com.tencent.mm.plugin.favorite.h.axx().b((c)localObject1);
    }
    for (;;)
    {
      ((d)localObject2).run();
      GMTrace.o(6261793882112L, 46654);
      return;
      paramj = null;
      if (((Cursor)localObject1).moveToFirst())
      {
        paramj = new g();
        paramj.b((Cursor)localObject1);
      }
      ((Cursor)localObject1).close();
      break;
      label529:
      com.tencent.mm.plugin.favorite.h.axx().c((c)localObject1, new String[] { "localId" });
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\b\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */