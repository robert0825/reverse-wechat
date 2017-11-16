package com.tencent.mm.plugin.qmessage.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.ad.d.b;
import com.tencent.mm.g.b.af;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import java.util.Map;
import junit.framework.Assert;

public final class f
  implements com.tencent.mm.ad.d
{
  public f()
  {
    GMTrace.i(8941987692544L, 66623);
    GMTrace.o(8941987692544L, 66623);
  }
  
  public final d.b b(d.a parama)
  {
    GMTrace.i(8942121910272L, 66624);
    bu localbu = parama.gtM;
    if (localbu == null)
    {
      w.e("MicroMsg.QMsgExtension", "onPreAddMessage cmdAM is null");
      GMTrace.o(8942121910272L, 66624);
      return null;
    }
    if ((localbu.lQc != 36) && (localbu.lQc != 39))
    {
      w.e("MicroMsg.QMsgExtension", "onPreAddMessage cmdAM.type:%d", new Object[] { Integer.valueOf(localbu.lQc) });
      GMTrace.o(8942121910272L, 66624);
      return null;
    }
    Object localObject2 = com.tencent.mm.platformtools.n.a(localbu.tPY);
    String str1 = com.tencent.mm.platformtools.n.a(localbu.tPW);
    Object localObject1 = com.tencent.mm.platformtools.n.a(localbu.tPX);
    w.d("MicroMsg.QMsgExtension", "parseQMsg content:" + (String)localObject2);
    at.AR();
    String str2 = (String)com.tencent.mm.y.c.xh().get(2, null);
    au localau;
    if (str2.equals(str1))
    {
      at.AR();
      localau = com.tencent.mm.y.c.yM().B((String)localObject1, localbu.tQd);
      w.d("MicroMsg.QMsgExtension", "dkmsgid parseQMsg svrid:%d localid:%d", new Object[] { Long.valueOf(localbu.tQd), Long.valueOf(localau.field_msgId) });
      if ((localau.field_msgId != 0L) && (localau.field_createTime + 604800000L < bc.k(str1, localbu.nFd)))
      {
        w.w("MicroMsg.QMsgExtension", "dkmsgid prepareMsgInfo msg Too Old Remove it. svrid:%d localid:%d", new Object[] { Long.valueOf(localbu.tQd), Long.valueOf(localau.field_msgId) });
        bc.S(localau.field_msgId);
        localau.C(0L);
      }
      if (localau.field_msgId != 0L) {
        break label1117;
      }
      localau = new au();
      localau.D(localbu.tQd);
      localau.E(bc.k(str1, localbu.nFd));
    }
    label632:
    label654:
    label786:
    label806:
    label832:
    label861:
    label877:
    label990:
    label996:
    label1012:
    label1022:
    label1045:
    label1050:
    label1079:
    label1112:
    label1117:
    for (;;)
    {
      localau.setType(localbu.lQc);
      localau.db((String)localObject1);
      Object localObject3 = g.aYk().EQ((String)localObject1);
      if ((localObject3 == null) || (bg.nl(((d)localObject3).getUsername()).length() <= 0))
      {
        localObject3 = new d();
        ((d)localObject3).username = ((String)localObject1);
        ((d)localObject3).nRm = 1;
        ((d)localObject3).eQl = 9;
        if (!g.aYk().a((d)localObject3)) {
          w.e("MicroMsg.QMsgExtension", "parseQMsg : insert QContact failed : username = " + ((d)localObject3).getUsername());
        }
      }
      long l2 = -1L;
      long l1 = l2;
      if (localbu.tPZ == 2)
      {
        l1 = l2;
        if (localau.field_msgId == 0L)
        {
          localObject1 = com.tencent.mm.platformtools.n.a(localbu.tQa);
          localObject3 = new PString();
          PInt localPInt1 = new PInt();
          PInt localPInt2 = new PInt();
          com.tencent.mm.ao.f localf = com.tencent.mm.ao.n.IZ();
          i = localbu.tPZ;
          l2 = localf.a((byte[])localObject1, localbu.tQd, false, "", (PString)localObject3, localPInt1, localPInt2);
          l1 = l2;
          if (l2 > 0L)
          {
            localau.dc(((PString)localObject3).value);
            localau.dN(localPInt1.value);
            localau.dO(localPInt2.value);
            l1 = l2;
          }
        }
      }
      boolean bool;
      if (localbu.lQc == 36)
      {
        Assert.assertTrue(true);
        if (bg.nl((String)localObject2).length() <= 0) {
          break label990;
        }
        bool = true;
        Assert.assertTrue(bool);
        if (bg.nl(localau.field_talker).length() <= 0) {
          break label996;
        }
        bool = true;
        Assert.assertTrue(bool);
        at.AR();
        localObject1 = com.tencent.mm.y.c.yK().TE(localau.field_talker);
        if ((localObject1 != null) && (bg.nl(((af)localObject1).field_username).length() > 0)) {
          break label1112;
        }
        localObject1 = new x(localau.field_talker);
      }
      for (int i = 1;; i = 0)
      {
        localObject3 = new a();
        localObject2 = bh.q((String)localObject2, "msg");
        if (localObject2 != null)
        {
          ((a)localObject3).fMz = ((String)((Map)localObject2).get(".msg.from.displayname"));
          ((a)localObject3).content = ((String)((Map)localObject2).get(".msg.content.t"));
        }
        if (((a)localObject3).fMz == null)
        {
          localObject2 = "";
          ((x)localObject1).cj((String)localObject2);
          if (((a)localObject3).content != null) {
            break label1012;
          }
          localObject2 = "";
          localau.setContent((String)localObject2);
          if (i == 0) {
            break label1022;
          }
          at.AR();
          com.tencent.mm.y.c.yK().R((x)localObject1);
          at.AR();
          if ((!com.tencent.mm.y.c.yS().has(str1)) && (!str2.equals(str1))) {
            break label1045;
          }
          i = 1;
          if (i == 0) {
            break label1050;
          }
          localau.dC(1);
          i = localbu.jhA;
          localau.dB(i);
          localau.dh(localbu.tQb);
          bc.a(localau, parama);
          if (localau.field_msgId != 0L) {
            break label1079;
          }
          localau.C(bc.i(localau));
          if (localbu.tPZ == 2)
          {
            parama = com.tencent.mm.ao.n.IZ().b(Long.valueOf(l1));
            parama.an((int)localau.field_msgId);
            com.tencent.mm.ao.n.IZ().a(Long.valueOf(l1), parama);
          }
        }
        for (parama = new d.b(localau, true);; parama = new d.b(localau, false))
        {
          GMTrace.o(8942121910272L, 66624);
          return parama;
          localObject1 = str1;
          break;
          bool = false;
          break label632;
          bool = false;
          break label654;
          localObject2 = ((a)localObject3).fMz;
          break label786;
          localObject2 = ((a)localObject3).content;
          break label806;
          at.AR();
          com.tencent.mm.y.c.yK().a(((af)localObject1).field_username, (x)localObject1);
          break label832;
          i = 0;
          break label861;
          localau.dC(0);
          if (localbu.jhA > 3)
          {
            i = localbu.jhA;
            break label877;
          }
          i = 3;
          break label877;
          at.AR();
          com.tencent.mm.y.c.yM().b(localbu.tQd, localau);
        }
      }
    }
  }
  
  public final void h(au paramau)
  {
    GMTrace.i(8942256128000L, 66625);
    com.tencent.mm.ao.n.IZ().o(paramau);
    GMTrace.o(8942256128000L, 66625);
  }
  
  public static final class a
  {
    String content;
    String fMz;
    
    public a()
    {
      GMTrace.i(8940779732992L, 66614);
      this.fMz = "";
      this.content = "";
      GMTrace.o(8940779732992L, 66614);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\qmessage\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */