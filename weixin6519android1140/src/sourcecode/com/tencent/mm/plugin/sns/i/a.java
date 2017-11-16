package com.tencent.mm.plugin.sns.i;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.g.a.cf.a;
import com.tencent.mm.g.a.ft;
import com.tencent.mm.g.a.ft.a;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.ai;
import com.tencent.mm.plugin.sns.model.am;
import com.tencent.mm.plugin.sns.model.ap;
import com.tencent.mm.plugin.sns.storage.h;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.u;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.protocal.c.anw;
import com.tencent.mm.protocal.c.bhq;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tk;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.protocal.c.tw;
import com.tencent.mm.protocal.c.uf;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.q;
import java.util.LinkedList;
import java.util.Map;

public final class a
{
  public static void a(th paramth, m paramm)
  {
    GMTrace.i(8864678281216L, 66047);
    if (paramm != null) {
      a(paramth, paramm.blD());
    }
    GMTrace.o(8864678281216L, 66047);
  }
  
  private static void a(th paramth, biz parambiz)
  {
    GMTrace.i(8864544063488L, 66046);
    if ((paramth != null) && (parambiz != null) && (!bg.nm(parambiz.pTh))) {
      paramth.QE(parambiz.pTh);
    }
    GMTrace.o(8864544063488L, 66046);
  }
  
  public static boolean a(cf paramcf, m paramm)
  {
    GMTrace.i(8863738757120L, 66040);
    if (paramm == null)
    {
      w.w("MicroMsg.Sns.GetFavDataSource", "fill sight favorite event fail, event is null or tlObj is null");
      paramcf.eDv.eDB = i.j.dtu;
      GMTrace.o(8863738757120L, 66040);
      return false;
    }
    tt localtt = new tt();
    Object localObject2 = new tw();
    biz localbiz = paramm.blD();
    anu localanu = (anu)localbiz.uUc.ueW.get(0);
    if ((paramm.uX(32)) && (localbiz.uUc.ueV == 15))
    {
      localbiz.uUh.gkO = paramm.blB().pyc;
      localbiz.uUh.gkP = localbiz.mmR;
    }
    Object localObject1 = String.format("%s#%s", new Object[] { i.dt(paramm.field_snsId), localanu.mmR });
    ((tw)localObject2).QY(paramm.field_userName);
    ((tw)localObject2).QZ(q.zE());
    ((tw)localObject2).zZ(2);
    ((tw)localObject2).eE(bg.Pv());
    ((tw)localObject2).Rd(paramm.blE());
    ((tw)localObject2).Ra((String)localObject1);
    localtt.a((tw)localObject2);
    localObject2 = new th();
    ((th)localObject2).Qy((String)localObject1);
    localObject1 = am.dE(ae.getAccSnsPath(), localanu.mmR);
    Object localObject4 = i.j(localanu);
    Object localObject3 = i.e(localanu);
    if (bg.nm(ap.a(paramm.blY(), localanu)))
    {
      w.w("MicroMsg.Sns.GetFavDataSource", "this sight had no download finish, can not favorite.");
      paramcf.eDv.eDB = i.j.phQ;
      GMTrace.o(8863738757120L, 66040);
      return false;
    }
    if (!FileOp.aZ((String)localObject1 + (String)localObject4))
    {
      w.i("MicroMsg.Sns.GetFavDataSource", "fav error sight: " + FileOp.aZ(new StringBuilder().append((String)localObject1).append((String)localObject4).toString()) + " thumb:" + FileOp.aZ(new StringBuilder().append((String)localObject1).append((String)localObject3).toString()));
      paramcf.eDv.eDB = i.j.phQ;
      GMTrace.o(8863738757120L, 66040);
      return false;
    }
    int j;
    int i;
    Bitmap localBitmap;
    if (!FileOp.aZ((String)localObject1 + (String)localObject3))
    {
      int k = 320;
      int m = 240;
      j = m;
      i = k;
      if (localanu.uCR != null)
      {
        j = m;
        i = k;
        if (localanu.uCR.uDF > 0.0F)
        {
          j = m;
          i = k;
          if (localanu.uCR.uDE > 0.0F)
          {
            i = (int)localanu.uCR.uDE;
            j = (int)localanu.uCR.uDF;
          }
        }
      }
      localBitmap = com.tencent.mm.plugin.sight.base.d.O((String)localObject1 + (String)localObject4, i, j);
      if (localBitmap == null)
      {
        w.i("MicroMsg.Sns.GetFavDataSource", "fav error on get thumb:" + FileOp.aZ(new StringBuilder().append((String)localObject1).append((String)localObject3).toString()));
        paramcf.eDv.eDB = i.j.phQ;
        GMTrace.o(8863738757120L, 66040);
        return false;
      }
    }
    for (;;)
    {
      try
      {
        com.tencent.mm.sdk.platformtools.d.a(localBitmap, 60, Bitmap.CompressFormat.JPEG, (String)localObject1 + (String)localObject3, true);
        ((th)localObject2).Qu((String)localObject1 + (String)localObject4);
        ((th)localObject2).Qv((String)localObject1 + (String)localObject3);
        if (bg.nm(localanu.uCZ))
        {
          localObject1 = localbiz.uTZ;
          ((th)localObject2).Qg((String)localObject1);
          ((th)localObject2).QF(localbiz.pRQ);
          if (!bg.nm(localbiz.pRQ))
          {
            localObject1 = bh.q(localbiz.pRQ, "adxml");
            if (((Map)localObject1).size() > 0)
            {
              ((th)localObject2).Qg(bg.aq((String)((Map)localObject1).get(".adxml.adCanvasInfo.shareTitle"), ""));
              ((th)localObject2).Qh(bg.aq((String)((Map)localObject1).get(".adxml.adCanvasInfo.shareDesc"), ""));
            }
          }
          if (!paramm.uX(32)) {
            break label1278;
          }
          localObject3 = paramm.blz();
          localObject4 = new tk();
          if (!bg.nm(localanu.uCZ)) {
            break label1248;
          }
          localObject1 = localbiz.uTZ;
          ((tk)localObject4).gkK = ((String)localObject1);
          ((tk)localObject4).ulk = localanu.qkw;
          ((tk)localObject4).gkI = localanu.uCV;
          ((tk)localObject4).gkO = localbiz.uUh.gkO;
          ((tk)localObject4).gkP = localbiz.uUh.gkP;
          if (bg.nm(((tk)localObject4).gkP)) {
            ((tk)localObject4).gkP = localbiz.mmR;
          }
          if (!bg.nm(localanu.uCY)) {
            break label1258;
          }
          localObject1 = localanu.uCO;
          ((tk)localObject4).gkN = ((String)localObject1);
          if ((localObject3 != null) && (((com.tencent.mm.plugin.sns.storage.b)localObject3).pCO == 0))
          {
            ((tk)localObject4).gkM = ((com.tencent.mm.plugin.sns.storage.b)localObject3).pCQ;
            ((tk)localObject4).gkL = ((com.tencent.mm.plugin.sns.storage.b)localObject3).pCP;
          }
          ((th)localObject2).a((tk)localObject4);
          j = 15;
          i = 16;
          ((th)localObject2).zR(j);
          localObject1 = com.tencent.mm.plugin.sight.base.d.GB(((th)localObject2).ujR);
          if (localObject1 == null) {
            break label1268;
          }
          ((th)localObject2).zQ(((com.tencent.mm.plugin.sight.base.a)localObject1).bgg());
          localObject1 = new LinkedList();
          ((LinkedList)localObject1).add(localObject2);
          localtt.av((LinkedList)localObject1);
          paramcf.eDv.eDx = localtt;
          paramcf.eDv.type = i;
          a((th)localObject2, paramm);
          w.i("MicroMsg.Sns.GetFavDataSource", "fill event Info sight dataType %d eventType %d", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
          GMTrace.o(8863738757120L, 66040);
          return true;
        }
      }
      catch (Exception paramm)
      {
        w.printErrStackTrace("MicroMsg.Sns.GetFavDataSource", paramm, "save bmp error %s", new Object[] { paramm.getMessage() });
        w.i("MicroMsg.Sns.GetFavDataSource", "fav error on save thumb:" + FileOp.aZ(new StringBuilder().append((String)localObject1).append((String)localObject3).toString()));
        paramcf.eDv.eDB = i.j.phQ;
        GMTrace.o(8863738757120L, 66040);
        return false;
      }
      localObject1 = localanu.uCZ;
      continue;
      label1248:
      localObject1 = localanu.uCZ;
      continue;
      label1258:
      localObject1 = localanu.uCY;
      continue;
      label1268:
      ((th)localObject2).zQ(1);
      continue;
      label1278:
      i = 4;
      j = 4;
    }
  }
  
  public static boolean a(cf paramcf, m paramm, String paramString)
  {
    GMTrace.i(8864275628032L, 66044);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or media id is null");
      paramcf.eDv.eDB = i.j.dtu;
      GMTrace.o(8864275628032L, 66044);
      return false;
    }
    if (paramm == null)
    {
      w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, snsInfo is null");
      paramcf.eDv.eDB = i.j.dtv;
      GMTrace.o(8864275628032L, 66044);
      return false;
    }
    anu localanu = ai.a(paramm, paramString);
    if (localanu == null)
    {
      w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, mediaObj is null");
      paramcf.eDv.eDB = i.j.dtv;
      GMTrace.o(8864275628032L, 66044);
      return false;
    }
    String str = String.format("%s#%s", new Object[] { i.dt(paramm.field_snsId), paramString });
    tt localtt = new tt();
    tw localtw = new tw();
    th localth = new th();
    w.i("MicroMsg.Sns.GetFavDataSource", "fav sns image, from %s", new Object[] { paramm.field_userName });
    localtw.QY(paramm.field_userName);
    localtw.QZ(q.zE());
    localtw.zZ(2);
    localtw.eE(paramm.field_createTime * 1000L);
    localtw.Rd(paramm.blE());
    localtw.Ra(str);
    localth.Qy(str);
    localth.Qu(am.dE(ae.getAccSnsPath(), paramString) + i.l(localanu));
    if (paramm.blD() != null)
    {
      localth.QF(paramm.blD().pRQ);
      if (!bg.nm(paramm.blD().pRQ))
      {
        paramString = bh.q(paramm.blD().pRQ, "adxml");
        if (paramString.size() > 0)
        {
          localth.Qg(bg.aq((String)paramString.get(".adxml.adCanvasInfo.shareTitle"), ""));
          localth.Qh(bg.aq((String)paramString.get(".adxml.adCanvasInfo.shareDesc"), ""));
        }
      }
    }
    a(localth, paramm);
    paramString = am.dE(ae.getAccSnsPath(), localanu.mmR) + i.e(localanu);
    if ((!FileOp.aZ(localth.ujR)) && (paramm.field_userName.endsWith(ae.biJ())))
    {
      w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, mediaObj is null");
      paramcf.eDv.eDB = i.j.dtv;
      GMTrace.o(8864275628032L, 66044);
      return false;
    }
    if (FileOp.aZ(paramString)) {
      localth.Qv(paramString);
    }
    for (;;)
    {
      localth.zR(2);
      localtt.ulB.add(localth);
      localtt.a(localtw);
      paramcf.eDv.eDx = localtt;
      paramcf.eDv.type = 2;
      GMTrace.o(8864275628032L, 66044);
      return true;
      localth.kx(true);
      localth.Qp(localanu.uCO);
      paramm = new uf();
      paramm.Ro(localanu.uCO);
      localtt.b(paramm);
    }
  }
  
  public static boolean a(cf paramcf, String paramString)
  {
    int i = 0;
    GMTrace.i(20839047102464L, 155263);
    if ((paramcf == null) || (!u.IO(paramString)))
    {
      w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or snsId error or url is null");
      if (paramcf != null) {
        paramcf.eDv.eDB = i.j.dtu;
      }
      GMTrace.o(20839047102464L, 155263);
      return false;
    }
    if (ae.biM())
    {
      w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, sns core is invalid");
      paramcf.eDv.eDB = i.j.phR;
      GMTrace.o(20839047102464L, 155263);
      return false;
    }
    Object localObject1 = h.Is(paramString);
    if (localObject1 == null)
    {
      w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, snsInfo is null");
      paramcf.eDv.eDB = i.j.dtv;
      GMTrace.o(20839047102464L, 155263);
      return false;
    }
    paramString = "0";
    Object localObject2 = ai.a((m)localObject1, 0);
    if (localObject2 != null) {
      paramString = ((anu)localObject2).mmR;
    }
    String str = String.format("%s#%s", new Object[] { i.dt(((m)localObject1).field_snsId), paramString });
    localObject2 = new tw();
    paramString = ((m)localObject1).blD();
    if (paramString == null)
    {
      w.i("MicroMsg.Sns.GetFavDataSource", "fav NoteLink, tlObj is null , return");
      GMTrace.o(20839047102464L, 155263);
      return false;
    }
    w.i("MicroMsg.Sns.GetFavDataSource", "fav NoteLink, from %s", new Object[] { ((m)localObject1).field_userName });
    ((tw)localObject2).QY(((m)localObject1).field_userName);
    ((tw)localObject2).QZ(q.zE());
    ((tw)localObject2).zZ(2);
    ((tw)localObject2).eE(((m)localObject1).field_createTime * 1000L);
    ((tw)localObject2).Rd(((m)localObject1).blE());
    ((tw)localObject2).Ra(str);
    localObject1 = new ft();
    ((ft)localObject1).eIo.type = 30;
    ((ft)localObject1).eIo.eIv = 4;
    ((ft)localObject1).eIo.desc = paramString.uUc.ueY;
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
    ((ft)localObject1).eIo.eDx.a((tw)localObject2);
    paramcf.eDv.eDx = ((ft)localObject1).eIo.eDx;
    if (paramcf.eDv.eDx != null)
    {
      localObject1 = paramcf.eDv.eDx.ulB;
      if (localObject1 != null) {
        while (i < ((LinkedList)localObject1).size())
        {
          localObject2 = (th)((LinkedList)localObject1).get(i);
          if (localObject2 != null)
          {
            ((th)localObject2).kw(true);
            ((th)localObject2).kx(true);
          }
          i += 1;
        }
      }
    }
    paramcf.eDv.desc = paramString.uUc.eBt;
    paramcf.eDv.type = 18;
    GMTrace.o(20839047102464L, 155263);
    return true;
  }
  
  public static boolean a(cf paramcf, String paramString, CharSequence paramCharSequence)
  {
    GMTrace.i(8864141410304L, 66043);
    if ((u.IP(paramString)) || (paramCharSequence == null))
    {
      w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or snsId error or text is null");
      paramcf.eDv.eDB = i.j.dtu;
      GMTrace.o(8864141410304L, 66043);
      return false;
    }
    if (ae.biM())
    {
      w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, sns core is invalid");
      paramcf.eDv.eDB = i.j.phR;
      GMTrace.o(8864141410304L, 66043);
      return false;
    }
    paramString = ae.bjd().Is(paramString);
    if (paramString == null)
    {
      w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, snsInfo is null");
      paramcf.eDv.eDB = i.j.dtv;
      GMTrace.o(8864141410304L, 66043);
      return false;
    }
    if (0L == paramString.field_snsId)
    {
      w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, snsInfo.field_snsId is 0");
      paramcf.eDv.eDB = i.j.dtt;
      GMTrace.o(8864141410304L, 66043);
      return false;
    }
    String str = String.format("%s#0", new Object[] { i.dt(paramString.field_snsId) });
    tt localtt = new tt();
    tw localtw = new tw();
    w.i("MicroMsg.Sns.GetFavDataSource", "fav sns text, from %s", new Object[] { paramString.field_userName });
    localtw.QY(paramString.field_userName);
    localtw.QZ(q.zE());
    localtw.zZ(2);
    localtw.eE(paramString.field_createTime * 1000L);
    localtw.Rd(paramString.blE());
    localtw.Ra(str);
    localtt.a(localtw);
    paramcf.eDv.eDx = localtt;
    paramcf.eDv.desc = paramCharSequence.toString();
    paramcf.eDv.type = 1;
    GMTrace.o(8864141410304L, 66043);
    return true;
  }
  
  public static boolean a(cf paramcf, String paramString1, String paramString2)
  {
    GMTrace.i(8864007192576L, 66042);
    if ((paramcf == null) || (!u.IO(paramString2)) || (paramString1 == null))
    {
      w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or snsId error or url is null");
      if (paramcf != null) {
        paramcf.eDv.eDB = i.j.dtu;
      }
      GMTrace.o(8864007192576L, 66042);
      return false;
    }
    if (ae.biM())
    {
      w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, sns core is invalid");
      paramcf.eDv.eDB = i.j.phR;
      GMTrace.o(8864007192576L, 66042);
      return false;
    }
    Object localObject1 = h.Is(paramString2);
    if (localObject1 == null)
    {
      w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, snsInfo is null");
      paramcf.eDv.eDB = i.j.dtv;
      GMTrace.o(8864007192576L, 66042);
      return false;
    }
    if ((((m)localObject1).blD().uUc != null) && (((m)localObject1).blD().uUc.ueV == 26))
    {
      boolean bool = a(paramcf, paramString2);
      GMTrace.o(8864007192576L, 66042);
      return bool;
    }
    paramString2 = "0";
    Object localObject2 = ai.a((m)localObject1, 0);
    if (localObject2 != null) {
      paramString2 = ((anu)localObject2).mmR;
    }
    Object localObject3 = String.format("%s#%s", new Object[] { i.dt(((m)localObject1).field_snsId), paramString2 });
    paramString2 = new tt();
    tw localtw = new tw();
    w.i("MicroMsg.Sns.GetFavDataSource", "fav sns url, from %s", new Object[] { ((m)localObject1).field_userName });
    localtw.QY(((m)localObject1).field_userName);
    localtw.QZ(q.zE());
    localtw.zZ(2);
    localtw.eE(((m)localObject1).field_createTime * 1000L);
    localtw.Rd(((m)localObject1).blE());
    localtw.Ra((String)localObject3);
    localtw.Rf(paramString1);
    paramString1 = new th();
    paramString1.Qy((String)localObject3);
    if (localObject2 != null)
    {
      localObject3 = am.dE(ae.getAccSnsPath(), ((anu)localObject2).mmR) + i.e((anu)localObject2);
      if (FileOp.aZ((String)localObject3)) {
        paramString1.Qv((String)localObject3);
      }
    }
    for (;;)
    {
      paramString1.zR(5);
      localObject1 = ((m)localObject1).blD();
      paramString1.Qg(((biz)localObject1).uUc.eBt);
      paramString1.Qh(((biz)localObject1).uUc.lPj);
      paramString1.QF(((biz)localObject1).pRQ);
      if (!bg.nm(((biz)localObject1).pRQ))
      {
        localObject2 = bh.q(((biz)localObject1).pRQ, "adxml");
        if (((Map)localObject2).size() > 0)
        {
          paramString1.Qg(bg.aq((String)((Map)localObject2).get(".adxml.adCanvasInfo.shareTitle"), ""));
          paramString1.Qh(bg.aq((String)((Map)localObject2).get(".adxml.adCanvasInfo.shareDesc"), ""));
        }
      }
      a(paramString1, (biz)localObject1);
      paramString1.kw(true);
      paramString2.ulB.add(paramString1);
      paramString1 = new uf();
      paramString1.Ab(((biz)localObject1).giA);
      paramString2.b(paramString1);
      paramString2.a(localtw);
      paramcf.eDv.eDx = paramString2;
      paramcf.eDv.desc = ((biz)localObject1).uUc.eBt;
      paramcf.eDv.type = 5;
      GMTrace.o(8864007192576L, 66042);
      return true;
      paramString1.kx(true);
      paramString1.Qp(((anu)localObject2).uCO);
      localObject3 = new uf();
      ((uf)localObject3).Ro(((anu)localObject2).uCO);
      paramString2.b((uf)localObject3);
      continue;
      paramString1.kx(true);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\i\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */