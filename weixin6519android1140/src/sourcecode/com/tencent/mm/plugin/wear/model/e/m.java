package com.tencent.mm.plugin.wear.model.e;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.e.b.g.a;
import com.tencent.mm.g.a.tc;
import com.tencent.mm.g.a.te;
import com.tencent.mm.k.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.plugin.wear.model.j;
import com.tencent.mm.pluginsdk.i.n;
import com.tencent.mm.protocal.c.bhm;
import com.tencent.mm.protocal.c.bsb;
import com.tencent.mm.protocal.c.bsv;
import com.tencent.mm.protocal.c.bsw;
import com.tencent.mm.protocal.c.bsx;
import com.tencent.mm.protocal.c.bsy;
import com.tencent.mm.protocal.c.btc;
import com.tencent.mm.protocal.c.bua;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.as;
import com.tencent.mm.y.at;
import com.tencent.mm.y.s;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

public final class m
  extends a
{
  public m()
  {
    GMTrace.i(9202638520320L, 68565);
    GMTrace.o(9202638520320L, 68565);
  }
  
  public final List<Integer> bBA()
  {
    GMTrace.i(9202772738048L, 68566);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(11022));
    localArrayList.add(Integer.valueOf(11023));
    localArrayList.add(Integer.valueOf(11025));
    localArrayList.add(Integer.valueOf(11024));
    localArrayList.add(Integer.valueOf(11026));
    localArrayList.add(Integer.valueOf(11029));
    GMTrace.o(9202772738048L, 68566);
    return localArrayList;
  }
  
  protected final byte[] m(int paramInt, byte[] paramArrayOfByte)
  {
    GMTrace.i(9203041173504L, 68568);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(9203041173504L, 68568);
      return null;
      Object localObject = new bsy();
      try
      {
        ((bsy)localObject).aD(paramArrayOfByte);
        com.tencent.mm.plugin.wear.model.a.bBm().rzz.a(new a((bsy)localObject));
        com.tencent.mm.plugin.wear.model.a.bBm().rzv.KU(((bsy)localObject).vbv);
        com.tencent.mm.plugin.wear.model.c.a.dC(2, ((bsy)localObject).tOG);
        com.tencent.mm.plugin.wear.model.c.a.xi(2);
        continue;
        localObject = new bsx();
      }
      catch (IOException paramArrayOfByte)
      {
        try
        {
          ((bsx)localObject).aD(paramArrayOfByte);
          com.tencent.mm.plugin.messenger.a.d.aOe().A(((bsx)localObject).vbv, ((bsx)localObject).ulE, s.go(((bsx)localObject).vbv));
          at.AR();
          com.tencent.mm.y.c.yP().TQ(((bsx)localObject).vbv);
          com.tencent.mm.plugin.wear.model.c.a.dC(3, ((bsx)localObject).tOG);
          com.tencent.mm.plugin.wear.model.c.a.xi(5);
          continue;
          localObject = new bsw();
        }
        catch (IOException paramArrayOfByte)
        {
          try
          {
            ((bsw)localObject).aD(paramArrayOfByte);
            com.tencent.mm.plugin.messenger.a.d.aOe().A(((bsw)localObject).vbv, ((bsw)localObject).ulE, s.go(((bsw)localObject).vbv));
            ((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().m(ab.getContext(), ((bsw)localObject).vbv, ((bsw)localObject).ugH);
            at.AR();
            com.tencent.mm.y.c.yP().TQ(((bsw)localObject).vbv);
            com.tencent.mm.plugin.wear.model.c.a.dC(8, ((bsw)localObject).tOG);
            com.tencent.mm.plugin.wear.model.c.a.xi(4);
            continue;
            localObject = new bsv();
          }
          catch (IOException paramArrayOfByte)
          {
            try
            {
              ((bsv)localObject).aD(paramArrayOfByte);
              ((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().m(ab.getContext(), ((bsv)localObject).vbv, ((bsv)localObject).ugH);
              at.AR();
              com.tencent.mm.y.c.yP().TQ(((bsv)localObject).vbv);
              com.tencent.mm.plugin.wear.model.c.a.dC(7, ((bsv)localObject).tOG);
              com.tencent.mm.plugin.wear.model.c.a.xi(3);
              continue;
              localObject = new btc();
            }
            catch (IOException paramArrayOfByte)
            {
              try
              {
                ((btc)localObject).aD(paramArrayOfByte);
                com.tencent.mm.plugin.wear.model.a.bBm();
                paramArrayOfByte = com.tencent.mm.plugin.wear.model.a.bBm().rzt.rzK.rAy;
                if (paramArrayOfByte == null)
                {
                  w.e("MicroMsg.Wear.WearBizLogic", "logicRequest is null");
                  continue;
                }
                w.i("MicroMsg.Wear.WearBizLogic", "receive step count %d | time %s", new Object[] { Integer.valueOf(((btc)localObject).vbV), n.ac("yyyy-MM-dd HH:mm:ss", ((btc)localObject).vbW / 1000L) });
                localbua = new bua();
                bhm localbhm = new bhm();
                if (((btc)localObject).vbV > 0)
                {
                  paramInt = ((btc)localObject).vbV;
                  localbhm.jhZ = paramInt;
                  localbhm.uhM = ((int)(((btc)localObject).vbW / 1000L));
                  Calendar localCalendar = Calendar.getInstance();
                  localCalendar.setTimeInMillis(((btc)localObject).vbW);
                  localbhm.uTr = localCalendar.get(1);
                  localbhm.uTs = (localCalendar.get(2) + 1);
                  localbhm.uTt = localCalendar.get(5);
                  localbhm.uTu = localCalendar.get(11);
                  localbhm.uTv = localCalendar.get(12);
                  localbhm.uTw = localCalendar.get(13);
                  localbua.vcG.add(localbhm);
                  localObject = new te();
                }
              }
              catch (IOException paramArrayOfByte)
              {
                try
                {
                  for (;;)
                  {
                    bua localbua;
                    ((te)localObject).eYK.data = localbua.toByteArray();
                    ((te)localObject).eYK.eCx = 4;
                    ((te)localObject).eYK.esG = paramArrayOfByte.vbo;
                    ((te)localObject).eYK.eEl = "gh_43f2581f6fd6";
                    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
                    break;
                    paramInt = 0;
                    continue;
                    if ((!com.tencent.mm.plugin.wear.model.a.bBm().rzt.bBr()) || (com.tencent.mm.k.g.ut().getInt("WearLuckyBlock", 0) != 0))
                    {
                      GMTrace.o(9203041173504L, 68568);
                      return null;
                    }
                    long l1 = 0L;
                    try
                    {
                      long l2 = Long.valueOf(new String(paramArrayOfByte)).longValue();
                      l1 = l2;
                    }
                    catch (Exception paramArrayOfByte)
                    {
                      for (;;) {}
                    }
                    paramArrayOfByte = new tc();
                    paramArrayOfByte.eYy.action = 1;
                    paramArrayOfByte.eYy.eCL = l1;
                    com.tencent.mm.sdk.b.a.vgX.a(paramArrayOfByte, Looper.getMainLooper());
                    com.tencent.mm.plugin.wear.model.c.a.dC(11, 0);
                    com.tencent.mm.plugin.wear.model.c.a.xi(11);
                    break;
                    paramArrayOfByte = paramArrayOfByte;
                    continue;
                    paramArrayOfByte = paramArrayOfByte;
                    continue;
                    paramArrayOfByte = paramArrayOfByte;
                    continue;
                    paramArrayOfByte = paramArrayOfByte;
                  }
                  paramArrayOfByte = paramArrayOfByte;
                }
                catch (IOException localIOException)
                {
                  for (;;) {}
                }
              }
            }
          }
        }
      }
    }
  }
  
  protected final boolean xk(int paramInt)
  {
    GMTrace.i(9202906955776L, 68567);
    switch (paramInt)
    {
    case 11024: 
    default: 
      GMTrace.o(9202906955776L, 68567);
      return false;
    }
    GMTrace.o(9202906955776L, 68567);
    return true;
  }
  
  private static final class a
    extends com.tencent.mm.plugin.wear.model.f.d
  {
    private bsy rAA;
    
    public a(bsy parambsy)
    {
      GMTrace.i(9202235867136L, 68562);
      this.rAA = parambsy;
      GMTrace.o(9202235867136L, 68562);
    }
    
    protected final void execute()
    {
      GMTrace.i(9202370084864L, 68563);
      String str = q.mM(this.rAA.vbv);
      w.i("MicroMsg.Wear.HttpReplyServer", "get fileName=%s", new Object[] { str });
      Object localObject = q.H(str, false);
      w.i("MicroMsg.Wear.HttpReplyServer", "get fullPath=%s", new Object[] { localObject });
      ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream(this.rAA.tRB.toByteArray());
      com.tencent.mm.e.c.c localc = new com.tencent.mm.e.c.c(8000, 16000);
      localc.bU((String)localObject);
      localObject = new byte['ŀ'];
      int i = 0;
      for (;;)
      {
        try
        {
          int j = localByteArrayInputStream.read((byte[])localObject, 0, 320);
          i = j;
        }
        catch (IOException localIOException)
        {
          continue;
        }
        if (i <= 0) {
          continue;
        }
        localc.a(new g.a((byte[])localObject, i), 0, false);
      }
      localc.qI();
      w.i("MicroMsg.Wear.HttpReplyServer", "amr compress finish");
      q.Q(str, (int)this.rAA.vbQ);
      com.tencent.mm.modelvoice.m.NM().run();
      w.i("MicroMsg.Wear.HttpReplyServer", "run service to send the voice");
      at.AR();
      com.tencent.mm.y.c.yP().TQ(this.rAA.vbv);
      GMTrace.o(9202370084864L, 68563);
    }
    
    public final String getName()
    {
      GMTrace.i(9202504302592L, 68564);
      GMTrace.o(9202504302592L, 68564);
      return "SendVioceMsgTask";
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wear\model\e\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */