package com.tencent.mm.plugin.favorite.b;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.ad;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bp;
import com.tencent.mm.protocal.c.nk;
import com.tencent.mm.protocal.c.nl;
import com.tencent.mm.protocal.c.tx;
import com.tencent.mm.protocal.c.ty;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public final class af
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public static final byte[] lcs;
  private int cbU;
  final com.tencent.mm.ad.b fUa;
  com.tencent.mm.ad.e fUd;
  private a lct;
  long lcu;
  public boolean lcv;
  
  static
  {
    GMTrace.i(6303267160064L, 46963);
    lcs = null;
    GMTrace.o(6303267160064L, 46963);
  }
  
  public af()
  {
    GMTrace.i(6301924982784L, 46953);
    this.fUd = null;
    this.cbU = 1;
    this.lct = new a();
    this.lcu = -1L;
    this.lcv = false;
    b.a locala = new b.a();
    locala.gtF = new tx();
    locala.gtG = new ty();
    locala.uri = "/cgi-bin/micromsg-bin/favsync";
    locala.gtE = 400;
    locala.gtH = 195;
    locala.gtI = 1000000195;
    locala.gtJ = false;
    this.fUa = locala.DA();
    GMTrace.o(6301924982784L, 46953);
  }
  
  public af(int paramInt)
  {
    GMTrace.i(15698239684608L, 116961);
    this.fUd = null;
    this.cbU = 1;
    this.lct = new a();
    this.lcu = -1L;
    this.lcv = false;
    b.a locala = new b.a();
    locala.gtF = new tx();
    locala.gtG = new ty();
    locala.uri = "/cgi-bin/micromsg-bin/favsync";
    locala.gtE = 400;
    locala.gtH = 195;
    locala.gtI = 1000000195;
    locala.gtJ = false;
    this.fUa = locala.DA();
    this.cbU = paramInt;
    GMTrace.o(15698239684608L, 116961);
  }
  
  public final boolean DE()
  {
    GMTrace.i(6302193418240L, 46955);
    GMTrace.o(6302193418240L, 46955);
    return true;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(6302327635968L, 46956);
    this.fUd = parame1;
    tx localtx = (tx)this.fUa.gtC.gtK;
    localtx.tZz = this.cbU;
    e locale = com.tencent.mm.plugin.favorite.h.axy();
    parame1 = locale.axE();
    if (8216 != parame1.field_configId)
    {
      w.w("MicroMsg.FavConfigStorage", "get sync key from fav db fail, try to load from mmdb");
      at.AR();
      if (((Boolean)c.xh().get(8224, Boolean.valueOf(false))).booleanValue()) {
        w.w("MicroMsg.FavConfigStorage", "get sync from mmdb fail, has trans");
      }
    }
    else
    {
      w.i("MicroMsg.FavConfigStorage", "get sync key, id %d, value %s", new Object[] { Integer.valueOf(parame1.field_configId), parame1.field_value });
      parame1 = bg.St(parame1.field_value);
    }
    for (;;)
    {
      if (this.cbU == 2) {
        parame1 = new byte[0];
      }
      localtx.tZA = com.tencent.mm.platformtools.n.H(parame1);
      int i = a(parame, this.fUa, this);
      GMTrace.o(6302327635968L, 46956);
      return i;
      at.AR();
      parame1 = bg.nl((String)c.xh().get(8216, ""));
      w.i("MicroMsg.FavConfigStorage", "get sync key(%s) from mmdb, do update fav sync key", new Object[] { parame1 });
      parame1 = bg.St(parame1);
      locale.ar(parame1);
      w.w("MicroMsg.FavConfigStorage", "set fav sync key has trans");
      at.AR();
      c.xh().set(8224, Boolean.valueOf(true));
    }
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(6302730289152L, 46959);
    int i = k.b.gum;
    GMTrace.o(6302730289152L, 46959);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(6302461853696L, 46957);
    w.i("MicroMsg.NetSceneFavSync", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if (com.tencent.mm.plugin.favorite.h.axr().eyY)
    {
      w.w("MicroMsg.NetSceneFavSync", "sending item, skip sync onGYNetEnd");
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(6302461853696L, 46957);
      return;
    }
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(6302461853696L, 46957);
      return;
    }
    ty localty = (ty)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    paramArrayOfByte = localty.tZD.jhd;
    if ((paramArrayOfByte != null) && (paramArrayOfByte.size() > 0))
    {
      w.i("MicroMsg.NetSceneFavSync", "cmdList size:" + paramArrayOfByte.size());
      if (this.cbU != 2)
      {
        paramString = this.lct;
        paramString.lcw = paramArrayOfByte;
        if ((paramString.lcw != null) && (paramString.lcw.size() > 0))
        {
          paramq = new ag();
          at.wS().a(paramq, 0);
        }
        paramString.lcx.sendEmptyMessage(0);
        GMTrace.o(6302461853696L, 46957);
        return;
      }
      paramq = paramArrayOfByte.iterator();
      while (paramq.hasNext())
      {
        paramArrayOfByte = com.tencent.mm.platformtools.n.a(((nk)paramq.next()).uej);
        try
        {
          paramInt1 = ((bp)new bp().aD(paramArrayOfByte)).tPM;
        }
        catch (IOException paramArrayOfByte)
        {
          w.e("MicroMsg.NetSceneFavSync", "get favdelitem error, errmsg is %s", new Object[] { paramArrayOfByte.getMessage() });
        }
      }
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(6302461853696L, 46957);
      return;
    }
    if (localty.tZA.uNP != null)
    {
      paramArrayOfByte = localty.tZA.uNP.toByteArray();
      paramq = ad.g(((tx)((com.tencent.mm.ad.b)paramq).gtC.gtK).tZA.uNP.toByteArray(), paramArrayOfByte);
      if ((paramq != null) && (paramq.length > 0)) {
        com.tencent.mm.plugin.favorite.h.axy().ar(paramq);
      }
    }
    for (;;)
    {
      at.AR();
      c.xh().set(8217, Integer.valueOf(1));
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(6302461853696L, 46957);
      return;
      w.e("MicroMsg.NetSceneFavSync", "merge key should not be null");
    }
  }
  
  public final void as(byte[] paramArrayOfByte)
  {
    int j = 1;
    GMTrace.i(16031770738688L, 119446);
    if (paramArrayOfByte != null) {}
    for (;;)
    {
      try
      {
        i = paramArrayOfByte.length;
        w.i("MicroMsg.NetSceneFavSync", "processAddItem bufSize=%d", new Object[] { Integer.valueOf(i) });
        bp localbp = (bp)new bp().aD(paramArrayOfByte);
        if (localbp == null)
        {
          w.e("MicroMsg.NetSceneFavSync", "klem processAddItem favitem null");
          GMTrace.o(16031770738688L, 119446);
          return;
          i = 0;
          continue;
        }
        w.i("MicroMsg.NetSceneFavSync", "klem processAddItem id:%d, flag:%d, updateSeq:%d, updateTime:%d", new Object[] { Integer.valueOf(localbp.tPL), Integer.valueOf(localbp.tPM), Integer.valueOf(localbp.tPO), Integer.valueOf(localbp.tPN) });
        if ((localbp.tPM & 0x1) != 0)
        {
          x.a(com.tencent.mm.plugin.favorite.h.axB().cg(localbp.tPL), false, null);
          GMTrace.o(16031770738688L, 119446);
          return;
        }
        if ((this.lcu < 0L) || (localbp.tPN < this.lcu)) {
          this.lcu = localbp.tPN;
        }
        paramArrayOfByte = com.tencent.mm.plugin.favorite.h.axB().cg(localbp.tPL);
        if (paramArrayOfByte != null) {
          break label395;
        }
        paramArrayOfByte = new j();
        paramArrayOfByte.field_updateTime = (localbp.tPN * 1000L);
        i = j;
        paramArrayOfByte.field_id = localbp.tPL;
        paramArrayOfByte.field_updateSeq = localbp.tPO;
        if (paramArrayOfByte.field_localSeq == localbp.tPO) {
          paramArrayOfByte.field_updateTime = (localbp.tPN * 1000L);
        }
        paramArrayOfByte.field_flag = localbp.tPM;
        paramArrayOfByte.field_type = localbp.jib;
        if (i != 0)
        {
          paramArrayOfByte.field_localId = System.currentTimeMillis();
          com.tencent.mm.plugin.favorite.h.axB().c(paramArrayOfByte);
          GMTrace.o(16031770738688L, 119446);
          return;
        }
      }
      catch (IOException paramArrayOfByte)
      {
        w.printErrStackTrace("MicroMsg.NetSceneFavSync", paramArrayOfByte, "", new Object[0]);
        GMTrace.o(16031770738688L, 119446);
        return;
      }
      com.tencent.mm.plugin.favorite.h.axB().a(paramArrayOfByte, new String[] { "localId" });
      GMTrace.o(16031770738688L, 119446);
      return;
      label395:
      int i = 0;
    }
  }
  
  public final int getType()
  {
    GMTrace.i(6302864506880L, 46960);
    GMTrace.o(6302864506880L, 46960);
    return 400;
  }
  
  protected final int vB()
  {
    GMTrace.i(6302596071424L, 46958);
    GMTrace.o(6302596071424L, 46958);
    return 50;
  }
  
  final class a
  {
    LinkedList<nk> lcw;
    ae lcx;
    
    a()
    {
      GMTrace.i(6274141913088L, 46746);
      this.lcx = new ae(at.xB().ngv.getLooper())
      {
        public final void handleMessage(Message paramAnonymousMessage)
        {
          GMTrace.i(6271860211712L, 46729);
          if ((af.a.this.lcw == null) || (af.a.this.lcw.isEmpty()))
          {
            af localaf = af.this;
            paramAnonymousMessage = (tx)localaf.fUa.gtC.gtK;
            Object localObject = (ty)localaf.fUa.gtD.gtK;
            byte[] arrayOfByte = ((ty)localObject).tZA.uNP.toByteArray();
            arrayOfByte = ad.g(paramAnonymousMessage.tZA.uNP.toByteArray(), arrayOfByte);
            if ((arrayOfByte != null) && (arrayOfByte.length > 0)) {
              com.tencent.mm.plugin.favorite.h.axy().ar(arrayOfByte);
            }
            paramAnonymousMessage.tZA = com.tencent.mm.platformtools.n.H(arrayOfByte);
            int i = ((ty)localObject).tXv;
            if ((paramAnonymousMessage.tZz & i) == 0)
            {
              w.i("MicroMsg.NetSceneFavSync", "processEnd, minUpdateTime:%d", new Object[] { Long.valueOf(localaf.lcu) });
              at.AR();
              c.xh().set(8217, Integer.valueOf(1));
              if (localaf.lcu > 0L)
              {
                localObject = com.tencent.mm.plugin.favorite.h.axB().p(localaf.lcu, -1);
                if (((LinkedList)localObject).size() > 0)
                {
                  paramAnonymousMessage = (Message)localObject;
                  if (((LinkedList)localObject).size() > 40)
                  {
                    localObject = ((LinkedList)localObject).subList(0, 40);
                    paramAnonymousMessage = new LinkedList();
                    paramAnonymousMessage.addAll((Collection)localObject);
                  }
                  localaf.lcv = true;
                  w.i("MicroMsg.NetSceneFavSync", "processEnd, start batch get list size:%d", new Object[] { Integer.valueOf(paramAnonymousMessage.size()) });
                  paramAnonymousMessage = new ac(paramAnonymousMessage);
                  if (!at.wS().a(paramAnonymousMessage, 0))
                  {
                    w.w("MicroMsg.NetSceneFavSync", "do scene BatchGetFav fail");
                    ac.ayp();
                  }
                }
              }
              localaf.fUd.a(0, 0, "", localaf);
              GMTrace.o(6271860211712L, 46729);
              return;
            }
            w.i("MicroMsg.NetSceneFavSync", "continue flag:%d", new Object[] { Integer.valueOf(((ty)localObject).tXv) });
            localaf.a(localaf.gtW, localaf.fUd);
            GMTrace.o(6271860211712L, 46729);
            return;
          }
          paramAnonymousMessage = (nk)af.a.this.lcw.getFirst();
          w.d("MicroMsg.NetSceneFavSync", "cmdId = " + paramAnonymousMessage.uei);
          af.a.this.lcw.removeFirst();
          switch (paramAnonymousMessage.uei)
          {
          }
          for (;;)
          {
            GMTrace.o(6271860211712L, 46729);
            return;
            paramAnonymousMessage = com.tencent.mm.platformtools.n.a(paramAnonymousMessage.uej);
            if (paramAnonymousMessage == null)
            {
              w.e("MicroMsg.NetSceneFavSync", "docmd: no protobuf found.");
              sendEmptyMessage(0);
              GMTrace.o(6271860211712L, 46729);
              return;
            }
            af.this.as(paramAnonymousMessage);
            sendEmptyMessage(0);
          }
        }
      };
      GMTrace.o(6274141913088L, 46746);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\b\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */