package com.tencent.mm.plugin.voip.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.ad.d.b;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.k.f;
import com.tencent.mm.protocal.c.bph;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import java.util.Map;

public final class i
  implements com.tencent.mm.ad.d
{
  public i()
  {
    GMTrace.i(5317572165632L, 39619);
    GMTrace.o(5317572165632L, 39619);
  }
  
  public final d.b b(d.a parama)
  {
    GMTrace.i(5317706383360L, 39620);
    bu localbu = parama.gtM;
    String str1 = com.tencent.mm.platformtools.n.a(localbu.tPW);
    Object localObject1 = com.tencent.mm.platformtools.n.a(localbu.tPX);
    String str2 = com.tencent.mm.platformtools.n.a(localbu.tPY);
    w.d("MicroMsg.VoipExtension", "voip msg, from: %s, content: %s", new Object[] { str1, str2 });
    at.AR();
    Object localObject2 = com.tencent.mm.y.c.yM();
    at.AR();
    Object localObject3 = (String)com.tencent.mm.y.c.xh().get(2, "");
    if (((String)localObject3).length() <= 0)
    {
      GMTrace.o(5317706383360L, 39620);
      return null;
    }
    if (((String)localObject3).equals(str1))
    {
      localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.a.c)localObject2).B((String)localObject1, localbu.tQd);
      if (((ce)localObject1).field_msgId != 0L) {
        break label1021;
      }
      localObject1 = new au();
      ((au)localObject1).D(localbu.tQd);
      ((au)localObject1).E(bc.k(str1, localbu.nFd));
    }
    label502:
    label621:
    label719:
    label773:
    label911:
    label939:
    label984:
    label1015:
    label1021:
    for (;;)
    {
      d.btG();
      localObject3 = m.JO(str2);
      if (localObject3 == null)
      {
        w.e("MicroMsg.VoipExtension", "parse voip message failed, voipMessage is null!");
        do
        {
          try
          {
            parama = bh.q(str2, "voipwarnmsg");
            if ((parama != null) && (parama.get(".voipwarnmsg.type") != null) && (bg.getInt((String)parama.get(".voipwarnmsg.type"), 0) == 1))
            {
              localObject1 = (String)parama.get(".voipwarnmsg.warntips");
              if ((localObject1 != null) && (!((String)localObject1).equals("")))
              {
                w.i("MicroMsg.VoipExtension", "got risk tips back:" + (String)localObject1);
                if (parama.get(".voipwarnmsg.roomid") != null)
                {
                  if (f.tL()) {
                    continue;
                  }
                  w.i("MicroMsg.VoipExtension", "set voipmsg not notification...");
                }
                d.btG().qHD = ((String)localObject1);
                d.btG().JP((String)localObject1);
              }
            }
          }
          catch (Exception parama)
          {
            for (;;)
            {
              w.printErrStackTrace("MicroMsg.VoipExtension", parama, "", new Object[0]);
              w.e("MicroMsg.VoipExtension", "parse voip message error: %s", new Object[] { parama.getMessage() });
            }
          }
          GMTrace.o(5317706383360L, 39620);
          return null;
          localObject1 = str1;
          break;
        } while (bg.getInt((String)parama.get(".voipwarnmsg.roomid"), 0) == d.btG().qIe.qDX.qFr.mjF);
        w.i("MicroMsg.VoipExtension", "wrong roomid,now return..");
        GMTrace.o(5317706383360L, 39620);
        return null;
      }
      Object localObject4;
      if (((a)localObject3).status == a.qGS)
      {
        i = 1;
        if (i == 0) {
          break label621;
        }
        w.i("MicroMsg.VoipExtension", "recv voip cancel message");
        localObject4 = d.btG();
        if ((str2 != null) && (str2.length() != 0)) {
          break label502;
        }
      }
      for (;;)
      {
        if (((a)localObject3).qGO != d.btG().qIk) {
          break label719;
        }
        w.i("MicroMsg.VoipExtension", "already ignore the invite, don't add the message to db");
        GMTrace.o(5317706383360L, 39620);
        return null;
        i = 0;
        break;
        localObject2 = new a();
        if ((((a)localObject2).parse(str2)) && (((a)localObject2).status == 2))
        {
          ((m)localObject4).wq(((a)localObject2).qGO);
          localObject4 = ((m)localObject4).qIe;
          w.i("MicroMsg.Voip.VoipServiceEx", "onCancelInviteMessage, roomId: " + ((a)localObject2).qGO);
          if ((((n)localObject4).qDX.qFw != null) && (((a)localObject2).qGO == ((n)localObject4).qDX.qFw.uhU))
          {
            ((n)localObject4).buZ();
            ((n)localObject4).qDX.shutdown();
          }
        }
      }
      if (((a)localObject3).status == a.qGU) {}
      for (int i = 1; i != 0; i = 0)
      {
        GMTrace.o(5317706383360L, 39620);
        return null;
      }
      if (((a)localObject3).status == a.qGR) {}
      for (i = 1; i != 0; i = 0)
      {
        w.i("MicroMsg.VoipExtension", "recv voip invite delay");
        d.btG().N(((a)localObject3).qGO, ((a)localObject3).qGP);
        GMTrace.o(5317706383360L, 39620);
        return null;
      }
      GMTrace.o(5317706383360L, 39620);
      return null;
      ((au)localObject1).setType(localbu.lQc);
      if (((a)localObject3).bud())
      {
        localObject2 = au.vBm;
        ((au)localObject1).setContent((String)localObject2);
        ((au)localObject1).dC(0);
        ((au)localObject1).db(str1);
        if (localbu.jhA <= 3) {
          break label939;
        }
        i = localbu.jhA;
        ((au)localObject1).dB(i);
        ((au)localObject1).dh(null);
        bc.a((au)localObject1, parama);
        w.d("MicroMsg.VoipExtension", "voipMessage==null: %b", new Object[] { localObject3 });
        if (((ce)localObject1).field_msgId != 0L) {
          break label984;
        }
        if (localObject3 != null) {
          break label1015;
        }
        parama = new a();
        parama.parse(str2);
      }
      for (;;)
      {
        w.d("MicroMsg.VoipExtension", "add or update msg, roomid: %s", new Object[] { Integer.valueOf(parama.qGO) });
        if (d.btG().qIj.get(Integer.valueOf(parama.qGO)) == null)
        {
          ((au)localObject1).C(bc.i((au)localObject1));
          d.btG().qIj.put(Integer.valueOf(parama.qGO), Long.valueOf(((ce)localObject1).field_msgId));
        }
        for (parama = new d.b((au)localObject1, true);; parama = new d.b((au)localObject1, false))
        {
          GMTrace.o(5317706383360L, 39620);
          return parama;
          localObject2 = au.vBl;
          break;
          i = 3;
          break label773;
          at.AR();
          com.tencent.mm.y.c.yM().a(((Long)d.btG().qIj.get(Integer.valueOf(parama.qGO))).longValue(), (au)localObject1);
          break label911;
          at.AR();
          com.tencent.mm.y.c.yM().b(localbu.tQd, (au)localObject1);
        }
        parama = (d.a)localObject3;
      }
    }
  }
  
  public final void h(au paramau)
  {
    GMTrace.i(5317840601088L, 39621);
    GMTrace.o(5317840601088L, 39621);
  }
  
  public static final class a
  {
    public static int qGR;
    public static int qGS;
    public static int qGT;
    public static int qGU;
    public static int qGV;
    public static int qGW;
    public int qGO;
    public long qGP;
    public int qGQ;
    public int status;
    
    static
    {
      GMTrace.i(5326698971136L, 39687);
      qGR = 1;
      qGS = 2;
      qGT = 3;
      qGU = 4;
      qGV = 0;
      qGW = 1;
      GMTrace.o(5326698971136L, 39687);
    }
    
    public a()
    {
      GMTrace.i(5326296317952L, 39684);
      GMTrace.o(5326296317952L, 39684);
    }
    
    public final boolean bud()
    {
      GMTrace.i(5326430535680L, 39685);
      if (this.qGQ == qGV)
      {
        GMTrace.o(5326430535680L, 39685);
        return true;
      }
      GMTrace.o(5326430535680L, 39685);
      return false;
    }
    
    public final boolean parse(String paramString)
    {
      GMTrace.i(5326564753408L, 39686);
      this.qGQ = qGV;
      try
      {
        paramString = bh.q(paramString, "voipinvitemsg");
        if (paramString != null)
        {
          if (paramString.get(".voipinvitemsg.roomid") != null) {
            this.qGO = bg.getInt((String)paramString.get(".voipinvitemsg.roomid"), 0);
          }
          if (paramString.get(".voipinvitemsg.key") != null) {
            this.qGP = bg.getLong((String)paramString.get(".voipinvitemsg.key"), 0L);
          }
          if (paramString.get(".voipinvitemsg.status") != null) {
            this.status = bg.getInt((String)paramString.get(".voipinvitemsg.status"), 0);
          }
          if (paramString.get(".voipinvitemsg.invitetype") != null) {
            this.qGQ = bg.getInt((String)paramString.get(".voipinvitemsg.invitetype"), 0);
          }
          GMTrace.o(5326564753408L, 39686);
          return true;
        }
        GMTrace.o(5326564753408L, 39686);
        return false;
      }
      catch (Exception paramString)
      {
        w.printErrStackTrace("MicroMsg.VoipExtension", paramString, "", new Object[0]);
        w.e("MicroMsg.VoipExtension", "parse voip message error: %s", new Object[] { paramString.getMessage() });
        GMTrace.o(5326564753408L, 39686);
      }
      return false;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\model\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */