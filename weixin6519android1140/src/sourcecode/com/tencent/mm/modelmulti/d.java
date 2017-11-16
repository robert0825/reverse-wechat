package com.tencent.mm.modelmulti;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.booter.CoreService;
import com.tencent.mm.booter.f;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.network.a;
import com.tencent.mm.network.aa;
import com.tencent.mm.network.q;
import com.tencent.mm.network.t;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.zero.PluginZero;
import com.tencent.mm.plugin.zero.a.b;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.ad;
import com.tencent.mm.protocal.c.aqj;
import com.tencent.mm.protocal.c.aqk;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.protocal.c.nk;
import com.tencent.mm.protocal.c.nl;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.protocal.w.a;
import com.tencent.mm.protocal.w.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class d
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  protected static int cbU;
  private String eAR;
  private int errCode;
  private int errType;
  private com.tencent.mm.ad.e fUd;
  private int gLZ;
  private g.a gMa;
  private StringBuilder gMb;
  private long gMc;
  public boolean gMd;
  private aj gsj;
  
  static
  {
    GMTrace.i(13440294846464L, 100138);
    cbU = 7;
    GMTrace.o(13440294846464L, 100138);
  }
  
  public d()
  {
    GMTrace.i(13438818451456L, 100127);
    this.errType = 0;
    this.errCode = 0;
    this.eAR = "";
    this.gLZ = 0;
    this.gMb = new StringBuilder();
    this.gMc = -1L;
    this.gMd = false;
    w.d("MicroMsg.NetPushSync", "dksord NetSceneSync hash:%d stack:%s", new Object[] { Integer.valueOf(hashCode()), bg.bQW() });
    this.gMa = new g.a();
    this.gMb.append("stack:" + bg.bQW() + " time:" + bg.Pu());
    GMTrace.o(13438818451456L, 100127);
  }
  
  public d(final w.b paramb, int paramInt, long paramLong)
  {
    this();
    GMTrace.i(13438952669184L, 100128);
    this.gLZ = paramInt;
    this.gMc = paramLong;
    w.d("MicroMsg.NetPushSync", "dkpush do scene resp SCENE_SYNC_WAIT");
    this.gsj = new aj(aa.Pb(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(13436805185536L, 100112);
        d.this.gMd = true;
        d.a locala = new d.a(paramb);
        d.this.a(-1, 0, 0, "", locala, null);
        GMTrace.o(13436805185536L, 100112);
        return false;
      }
    }, false);
    GMTrace.o(13438952669184L, 100128);
  }
  
  public final boolean DF()
  {
    GMTrace.i(13439489540096L, 100132);
    boolean bool = super.DF();
    GMTrace.o(13439489540096L, 100132);
    return bool;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    boolean bool = false;
    GMTrace.i(13439892193280L, 100135);
    this.fUd = parame1;
    this.gMb.append(" lastd:" + this.gtX + " dotime:" + bg.Pu() + " net:" + am.getNetType(ab.getContext()));
    int i = hashCode();
    int j = cbU;
    if (this.gsj != null) {
      bool = true;
    }
    w.i("MicroMsg.NetPushSync", "doScene[%d] selector:%d pusher:%b ", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Boolean.valueOf(bool) });
    if (this.gsj != null)
    {
      c(parame);
      this.gsj.z(0L, 0L);
      this.gsj = null;
      GMTrace.o(13439892193280L, 100135);
      return -1;
    }
    parame1 = new a();
    parame1.uin = aa.OY().hgw.ww();
    aqj localaqj = ((w.a)parame1.DC()).tKT;
    localaqj.tZz = cbU;
    localaqj.tZA = n.H(bg.St(ab.getContext().getSharedPreferences("notify_sync_pref", 4).getString("notify_sync_key_keybuf", "")));
    localaqj.tOG = 1;
    localaqj.uGE = new nl();
    localaqj.tSz = com.tencent.mm.protocal.d.DEVICE_TYPE;
    i = a(parame, parame1, this);
    GMTrace.o(13439892193280L, 100135);
    return i;
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(13439355322368L, 100131);
    int i = k.b.gum;
    GMTrace.o(13439355322368L, 100131);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(13440026411008L, 100136);
    if ((paramq == null) || (paramq.getType() != 138))
    {
      if (paramq == null) {}
      for (paramInt1 = -2;; paramInt1 = paramq.getType())
      {
        w.e("MicroMsg.NetPushSync", "onGYNetEnd error type:%d", new Object[] { Integer.valueOf(paramInt1) });
        GMTrace.o(13440026411008L, 100136);
        return;
      }
    }
    this.gMb.append(" endtime:" + bg.Pu());
    w.i("MicroMsg.NetPushSync", "onGYNetEnd: %d [%d,%d,%s] hash isnotifydata:%b time:%d [%s]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, Boolean.valueOf(this.gMd), Long.valueOf(this.gMa.tD()), this.gMb });
    w.b localb;
    label269:
    label357:
    label446:
    label472:
    label524:
    Object localObject1;
    if ((paramInt2 == 4) && (paramInt3 == 63530))
    {
      paramInt2 = 0;
      paramInt3 = 0;
      paramInt1 = 1;
      if ((paramInt2 != 0) || (paramInt3 != 0))
      {
        this.fUd.a(paramInt2, paramInt3, paramString, this);
        GMTrace.o(13440026411008L, 100136);
        return;
      }
      localb = (w.b)paramq.AZ();
      if (paramInt1 == 0)
      {
        paramString = n.a(((w.a)paramq.DC()).tKT.tZA);
        if (paramString == null)
        {
          paramInt1 = -1;
          w.d("MicroMsg.NetPushSync", "dkpush req Key : %d[%s]", new Object[] { Integer.valueOf(paramInt1), bg.bp(paramString) });
          if (!bg.bq(paramString)) {
            break label1829;
          }
          paramString = bg.St(ab.getContext().getSharedPreferences("notify_sync_pref", 4).getString("notify_sync_key_keybuf", ""));
          w.d("MicroMsg.NetPushSync", "dkpush userinfo key : %d[%s]", new Object[] { Integer.valueOf(paramString.length), bg.bp(paramString) });
          paramq = n.a(localb.tKU.tZA);
          paramArrayOfByte = ad.g(paramString, paramq);
          if (paramArrayOfByte != null)
          {
            paramString = paramArrayOfByte;
            if (paramArrayOfByte.length > 0) {}
          }
          else
          {
            w.w("MicroMsg.NetPushSync", "merge key failed, use server side instead");
            paramString = paramq;
          }
          localb.tKU.tZA = n.H(paramString);
          if ((localb.tKU.tZD != null) && (localb.tKU.tZD.jhd != null)) {
            break label734;
          }
          paramInt1 = 0;
          w.i("MicroMsg.NetPushSync", "newMsgSize:%d", new Object[] { Integer.valueOf(paramInt1) });
          if (paramString != null) {
            break label752;
          }
          paramInt2 = -1;
          w.d("MicroMsg.NetPushSync", "newMsgSize:%d, mergeKey: %d[%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), bg.bp(paramString) });
        }
      }
      else
      {
        paramArrayOfByte = localb.tKU.tZD.jhd.iterator();
        paramInt2 = 0;
        while (paramArrayOfByte.hasNext())
        {
          localObject1 = (nk)paramArrayOfByte.next();
          if (((nk)localObject1).uei == 5) {
            paramString = n.a(((nk)localObject1).uej);
          }
        }
      }
    }
    for (;;)
    {
      Object localObject2;
      long l;
      label734:
      label752:
      String str;
      try
      {
        localObject2 = new bu();
        ((bu)localObject2).aD(paramString);
        int i = ((bu)localObject2).lQc;
        paramString = ((bu)localObject2).tPW.uNR;
        l = ((bu)localObject2).tQd;
        if (((bu)localObject2).tQc == null)
        {
          paramInt1 = 0;
          if (((bu)localObject2).tPY.uNR != null) {
            continue;
          }
          paramInt3 = 0;
          w.i("MicroMsg.NetPushSync", "oreh msgType:%d, talker:%s, newmsgID:%d, pushContent.len:%d, content.len:%d", new Object[] { Integer.valueOf(i), paramString, Long.valueOf(l), Integer.valueOf(paramInt1), Integer.valueOf(paramInt3) });
          paramInt1 = ((bu)localObject2).lQc;
          paramString = ((bu)localObject2).tPW.uNR;
          paramq = ((bu)localObject2).tPY.uNR;
          if (paramInt1 != 50) {
            continue;
          }
          w.i("MicroMsg.NetPushSync", "hit voip");
          paramInt1 = 1;
          if (paramInt1 == 0) {
            continue;
          }
          paramInt2 = 1;
          break label524;
          paramInt1 = paramString.length;
          break label269;
          paramInt1 = localb.tKU.tZD.jhd.size();
          break label446;
          paramInt2 = paramString.length;
          break label472;
        }
        paramInt1 = ((bu)localObject2).tQc.length();
        continue;
        paramInt3 = ((bu)localObject2).tPY.uNR.length();
        continue;
        if ((bg.nm(paramq)) || (bg.nm(paramString)))
        {
          w.w("MicroMsg.NetPushSync", "check should launch to mm ,content or from username is null.");
          break label1837;
        }
        if ((paramInt1 == 9998) && (paramString.equalsIgnoreCase("weixin")))
        {
          w.i("MicroMsg.NetPushSync", "hit ipxx");
          paramInt1 = 1;
          continue;
        }
        if ((paramInt1 != 10002) || (!paramq.contains("revokemsg"))) {
          break label1837;
        }
        w.i("MicroMsg.NetPushSync", "hit MM_DATA_SYSCMD_NEWXML_SUBTYPE_REVOKE");
        paramInt1 = 1;
        continue;
        l = ((bu)localObject2).tQd;
        str = ((bu)localObject2).tPW.uNR;
        paramString = ((bu)localObject2).tQc;
        paramInt1 = ((bu)localObject2).lQc;
        if (!bg.nm(paramString)) {
          break label986;
        }
        w.i("MicroMsg.NetPushSync", "showNotifyCation pushContent is null, skip");
        if (((bu)localObject2).lQc != 10002) {
          break label1218;
        }
        paramInt1 = 1;
        if (paramInt1 == 0) {
          break label524;
        }
        w.i("MicroMsg.NetPushSync", "need remove pushContent");
        ((bu)localObject2).tQc = null;
        ((nk)localObject1).uej = n.H(((bu)localObject2).toByteArray());
      }
      catch (IOException paramString)
      {
        w.printErrStackTrace("MicroMsg.NetPushSync", paramString, "", new Object[0]);
      }
      break label524;
      label986:
      PString localPString1 = new PString();
      PString localPString2 = new PString();
      paramq = bg.Sx(paramString);
      paramInt3 = paramq.indexOf("<pushcontent");
      paramString = paramq;
      if (paramInt3 > 0) {
        paramString = paramq.substring(paramInt3);
      }
      paramString = bh.q(paramString, "pushcontent");
      if (paramString == null) {
        w.e("MicroMsg.NetPushSync", "inval xml");
      }
      for (;;)
      {
        paramString = (PluginZero)com.tencent.mm.kernel.h.j(PluginZero.class);
        if (paramString.tkn == null) {
          break;
        }
        paramq = com.tencent.mm.compatible.util.e.ghz + g.n(new StringBuilder("mm").append(aa.OY().hgw.ww()).toString().getBytes());
        paramString.tkn.a(l, str, localPString2.value, localPString1.value, paramq + "/avatar/", paramInt1);
        break;
        localPString1.value = ((String)paramString.get(".pushcontent.$content"));
        localPString2.value = ((String)paramString.get(".pushcontent.$nickname"));
      }
      label1218:
      paramInt1 = 0;
      continue;
      try
      {
        paramq = localb.tKU.toByteArray();
        paramInt3 = aa.OY().hgw.ww();
        paramString = f.dS(paramInt3);
        paramInt1 = f.jdMethod_do(paramString) + 1;
        paramArrayOfByte = paramString + "/syncResp.bin" + paramInt1;
        localObject1 = g.n((p.sZ() + paramInt3).getBytes());
        localObject2 = com.tencent.mm.a.k.b(paramq, ((String)localObject1).getBytes());
        w.i("MicroMsg.NotifySyncMgr", "writeFile %d, len:%d, resultLen:%d, file:%s, dump %s -> %s, key:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramq.length), Integer.valueOf(localObject2.length), paramArrayOfByte, f.v(paramq), f.v((byte[])localObject2), f.v(((String)localObject1).getBytes()) });
        if (bg.bq((byte[])localObject2)) {
          w.e("MicroMsg.NotifySyncMgr", "encry failed");
        }
        for (;;)
        {
          w.d("MicroMsg.NetPushSync", "onRespHandled sync");
          ab.getContext().getSharedPreferences("notify_sync_pref", 4).edit().putString("notify_sync_key_keybuf", bg.bs(n.a(localb.tKU.tZA))).commit();
          w.d("MicroMsg.NetPushSync", "dkpush pushSyncFlag:%d", new Object[] { Integer.valueOf(this.gLZ) });
          if (paramInt2 != 0) {
            break label1741;
          }
          if (((localb.tKU.tXv & cbU) == 0) || (super.DF())) {
            break label1736;
          }
          paramInt1 = 1;
          w.i("MicroMsg.NetPushSync", "continue flag=" + localb.tKU.tXv + ", selector=" + cbU + ", limit reach=" + super.DF());
          if (paramInt1 == 0) {
            break label1741;
          }
          a(this.gtW, this.fUd);
          if (paramInt2 != 0) {
            CoreService.rj();
          }
          GMTrace.o(13440026411008L, 100136);
          return;
          paramInt3 = com.tencent.mm.a.e.b(paramArrayOfByte, (byte[])localObject2, localObject2.length);
          boolean bool = com.tencent.mm.a.e.aZ(paramArrayOfByte);
          if ((paramInt3 == 0) && (bool)) {
            break;
          }
          w.e("MicroMsg.NotifySyncMgr", "writeFile failed:!!!!!, writeResult:%d, writedFileExit:%b", new Object[] { Integer.valueOf(paramInt3), Boolean.valueOf(bool) });
        }
      }
      catch (IOException paramString)
      {
        for (;;)
        {
          w.e("MicroMsg.NetPushSync", "write syncResp buf err:%s", new Object[] { paramString });
          w.printErrStackTrace("MicroMsg.NetPushSync", paramString, "", new Object[0]);
          continue;
          paramq = String.valueOf(paramInt1).getBytes();
          com.tencent.mm.a.e.b(paramString + "/syncResp.ini", paramq, paramq.length);
          continue;
          label1736:
          paramInt1 = 0;
          continue;
          label1741:
          if ((this.gLZ & 0x1) > 0)
          {
            w.i("MicroMsg.NetPushSync", "oreh NotifyData ack");
            new h(this.gMc, n.a(localb.tKU.tZA), aa.OY().hgw.ww()).a(aa.OY(), new com.tencent.mm.ad.e()
            {
              public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.k paramAnonymousk)
              {
                GMTrace.i(13429154775040L, 100055);
                w.i("MicroMsg.NetPushSync", "NetSceneNotifyData onSceneEnd: %d, %d, %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
                paramAnonymousk.guc = true;
                GMTrace.o(13429154775040L, 100055);
              }
            });
          }
          this.fUd.a(this.errType, this.errCode, this.eAR, this);
        }
      }
      label1829:
      break label357;
      paramInt1 = 0;
      break;
      label1837:
      paramInt1 = 0;
    }
  }
  
  protected final void cancel()
  {
    GMTrace.i(13439757975552L, 100134);
    super.cancel();
    GMTrace.o(13439757975552L, 100134);
  }
  
  public final String getInfo()
  {
    GMTrace.i(13439086886912L, 100129);
    String str = this.gMb.toString();
    GMTrace.o(13439086886912L, 100129);
    return str;
  }
  
  public final int getType()
  {
    GMTrace.i(13439623757824L, 100133);
    GMTrace.o(13439623757824L, 100133);
    return 138;
  }
  
  protected final int vB()
  {
    GMTrace.i(13439221104640L, 100130);
    GMTrace.o(13439221104640L, 100130);
    return 500;
  }
  
  public static final class a
    implements q
  {
    private final w.a gMg;
    private final w.b gMh;
    private final boolean gMi;
    int uin;
    
    public a()
    {
      GMTrace.i(13434255048704L, 100093);
      this.gMg = new w.a();
      this.gMh = new w.b();
      this.gMi = false;
      GMTrace.o(13434255048704L, 100093);
    }
    
    public a(w.b paramb)
    {
      GMTrace.i(13434389266432L, 100094);
      this.gMg = new w.a();
      this.gMh = paramb;
      this.gMi = true;
      GMTrace.o(13434389266432L, 100094);
    }
    
    public final k.e AZ()
    {
      GMTrace.i(13434523484160L, 100095);
      w.b localb = this.gMh;
      GMTrace.o(13434523484160L, 100095);
      return localb;
    }
    
    public final k.d DC()
    {
      GMTrace.i(13434926137344L, 100098);
      this.gMg.tKl = p.ta();
      this.gMg.tKk = com.tencent.mm.protocal.d.DEVICE_TYPE;
      this.gMg.tKj = com.tencent.mm.protocal.d.tJC;
      this.gMg.dp(this.uin);
      w.a locala = this.gMg;
      GMTrace.o(13434926137344L, 100098);
      return locala;
    }
    
    public final boolean DD()
    {
      GMTrace.i(13435060355072L, 100099);
      GMTrace.o(13435060355072L, 100099);
      return false;
    }
    
    public final int Dz()
    {
      GMTrace.i(13435194572800L, 100100);
      GMTrace.o(13435194572800L, 100100);
      return 0;
    }
    
    public final int getType()
    {
      GMTrace.i(13434657701888L, 100096);
      GMTrace.o(13434657701888L, 100096);
      return 138;
    }
    
    public final String getUri()
    {
      GMTrace.i(13434791919616L, 100097);
      GMTrace.o(13434791919616L, 100097);
      return "/cgi-bin/micromsg-bin/newsync";
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelmulti\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */