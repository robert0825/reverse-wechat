package com.tencent.mm.modelsimple;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.i;
import com.tencent.mm.ad.n;
import com.tencent.mm.k.g;
import com.tencent.mm.network.c;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.protocal.c.fz;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.protocal.l;
import com.tencent.mm.protocal.l.a;
import com.tencent.mm.protocal.l.b;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;

public final class f
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ad.e fUd;
  private q guL;
  
  private f(boolean paramBoolean)
  {
    GMTrace.i(1362444156928L, 10151);
    this.guL = new a();
    l.a locala = (l.a)this.guL.DC();
    locala.netType = l.getNetType(ab.getContext());
    if (paramBoolean) {}
    for (int i = 1;; i = 2)
    {
      locala.tKv = i;
      GMTrace.o(1362444156928L, 10151);
      return;
    }
  }
  
  public static void bA(boolean paramBoolean)
  {
    GMTrace.i(1362175721472L, 10149);
    if (!at.AU())
    {
      GMTrace.o(1362175721472L, 10149);
      return;
    }
    if ((at.wS() == null) || (at.wS().gus == null) || (at.wS().gus.DY() == null))
    {
      GMTrace.o(1362175721472L, 10149);
      return;
    }
    if (paramBoolean)
    {
      at.wS().gus.DY().bl(true);
      at.wS().a(new f(true), 0);
      GMTrace.o(1362175721472L, 10149);
      return;
    }
    paramBoolean = gW(2);
    at.wS().gus.DY().bl(paramBoolean);
    f localf = new f(gW(1));
    at.wS().a(localf, 0);
    GMTrace.o(1362175721472L, 10149);
  }
  
  private static boolean gW(int paramInt)
  {
    GMTrace.i(1362309939200L, 10150);
    int i;
    boolean bool;
    if (r.hkP != -1)
    {
      i = r.hkP;
      bool = b.foreground;
      w.i("MicroMsg.NetSceneBgFg", "somr DynamicConfig checkBit:%d TestMuteRoomEnable:%d muteRoomDisable:%d fg:%b", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(r.hkP), Integer.valueOf(i), Boolean.valueOf(bool) });
      if ((i & paramInt) == 0) {
        break label118;
      }
      bool = true;
    }
    label118:
    for (;;)
    {
      GMTrace.o(1362309939200L, 10150);
      return bool;
      try
      {
        i = bg.getInt(g.ut().getValue("MuteRoomDisable"), 0);
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.NetSceneBgFg", localException, "", new Object[0]);
        i = 0;
      }
      break;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(1362578374656L, 10152);
    this.fUd = parame1;
    int i = a(parame, this.guL, this);
    GMTrace.o(1362578374656L, 10152);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(1362846810112L, 10154);
    w.d("MicroMsg.NetSceneBgFg", " ret[%d]", new Object[] { Integer.valueOf(((l.b)paramq.AZ()).tKw.jWs) });
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(1362846810112L, 10154);
  }
  
  public final int getType()
  {
    GMTrace.i(1362712592384L, 10153);
    GMTrace.o(1362712592384L, 10153);
    return 0;
  }
  
  public static final class a
    extends i
  {
    private final l.a gTH;
    private final l.b gTI;
    
    public a()
    {
      GMTrace.i(1349425037312L, 10054);
      this.gTH = new l.a();
      this.gTI = new l.b();
      GMTrace.o(1349425037312L, 10054);
    }
    
    protected final k.d AY()
    {
      GMTrace.i(1349559255040L, 10055);
      l.a locala = this.gTH;
      GMTrace.o(1349559255040L, 10055);
      return locala;
    }
    
    public final k.e AZ()
    {
      GMTrace.i(1349693472768L, 10056);
      l.b localb = this.gTI;
      GMTrace.o(1349693472768L, 10056);
      return localb;
    }
    
    public final int getType()
    {
      GMTrace.i(1349827690496L, 10057);
      GMTrace.o(1349827690496L, 10057);
      return 0;
    }
    
    public final String getUri()
    {
      GMTrace.i(1349961908224L, 10058);
      GMTrace.o(1349961908224L, 10058);
      return null;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelsimple\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */