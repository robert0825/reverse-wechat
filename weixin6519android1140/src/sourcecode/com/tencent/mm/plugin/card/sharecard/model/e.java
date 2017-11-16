package com.tencent.mm.plugin.card.sharecard.model;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.card.b.f;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.protocal.c.adn;
import com.tencent.mm.protocal.c.ado;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public final class e
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private final com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  public LinkedList<String> jzL;
  public LinkedList<String> jzM;
  
  public e(LinkedList<String> paramLinkedList)
  {
    GMTrace.i(5069135151104L, 37768);
    this.jzM = new LinkedList();
    this.jzL = paramLinkedList;
    b.a locala = new b.a();
    locala.gtF = new adn();
    locala.gtG = new ado();
    locala.uri = "/cgi-bin/micromsg-bin/getsharecardlist";
    locala.gtE = 903;
    locala.gtH = 0;
    locala.gtI = 0;
    this.fUa = locala.DA();
    ((adn)this.fUa.gtC.gtK).tTF = paramLinkedList;
    w.i("MicroMsg.NetSceneGetShareCardList", "card_ids length is " + paramLinkedList.size());
    GMTrace.o(5069135151104L, 37768);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(5069537804288L, 37771);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(5069537804288L, 37771);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(5069269368832L, 37769);
    w.i("MicroMsg.NetSceneGetShareCardList", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", new Object[] { Integer.valueOf(903), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      w.e("MicroMsg.NetSceneGetShareCardList", "onGYNetEnd, batch get fail, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(5069269368832L, 37769);
      return;
    }
    paramq = (ado)this.fUa.gtD.gtK;
    w.v("MicroMsg.NetSceneGetShareCardList", "json:" + paramq.jzG);
    paramq = paramq.jzG;
    if (TextUtils.isEmpty(paramq))
    {
      w.e("MicroMsg.NetSceneGetShareCardList", "onGYNetEnd fail, resp json_ret is null");
      this.fUd.a(4, -1, null, this);
      GMTrace.o(5069269368832L, 37769);
      return;
    }
    long l1 = System.currentTimeMillis();
    paramq = f.uv(paramq);
    if (paramq != null)
    {
      if (this.jzL != null) {
        this.jzM.addAll(this.jzL);
      }
      long l2 = System.currentTimeMillis();
      at.AR();
      long l3 = c.yH().cE(Thread.currentThread().getId());
      paramArrayOfByte = paramq.iterator();
      paramInt1 = 0;
      int i = 0;
      Object localObject;
      while (paramArrayOfByte.hasNext())
      {
        localObject = (ShareCardInfo)paramArrayOfByte.next();
        int j = paramInt1 + 1;
        if (!l.a((ShareCardInfo)localObject))
        {
          i += 1;
          this.jzM.remove(((ShareCardInfo)localObject).field_card_id);
          paramInt1 = j;
        }
        else
        {
          w.i("MicroMsg.NetSceneGetShareCardList", "onGYNetEnd update share card count");
          com.tencent.mm.plugin.card.sharecard.a.b.O(ab.getContext(), ((ShareCardInfo)localObject).field_card_tp_id);
          paramInt1 = j;
          if (((ShareCardInfo)localObject).field_status != 0)
          {
            com.tencent.mm.plugin.card.sharecard.a.b.bB(((ShareCardInfo)localObject).field_card_id, ((ShareCardInfo)localObject).field_card_tp_id);
            paramInt1 = j;
          }
        }
      }
      at.AR();
      c.yH().aL(l3);
      w.i("MicroMsg.NetSceneGetShareCardList", "onGYNetEnd do transaction use time %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l2) });
      w.e("MicroMsg.NetSceneGetShareCardList", "onGYNetEnd, deal CardObject %d fail of %d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt1) });
      l.amW();
      if (paramq.size() > 0)
      {
        paramInt1 = (int)(System.currentTimeMillis() - l1);
        paramArrayOfByte = new ArrayList();
        localObject = new IDKey();
        ((IDKey)localObject).SetID(281);
        ((IDKey)localObject).SetKey(17);
        ((IDKey)localObject).SetValue(1L);
        IDKey localIDKey1 = new IDKey();
        localIDKey1.SetID(281);
        localIDKey1.SetKey(18);
        localIDKey1.SetValue(paramInt1);
        IDKey localIDKey2 = new IDKey();
        localIDKey2.SetID(281);
        localIDKey2.SetKey(19);
        localIDKey2.SetValue(paramq.size());
        IDKey localIDKey3 = new IDKey();
        localIDKey3.SetID(281);
        localIDKey3.SetKey(21);
        localIDKey3.SetValue(paramInt1 / paramq.size());
        paramArrayOfByte.add(localObject);
        paramArrayOfByte.add(localIDKey1);
        paramArrayOfByte.add(localIDKey2);
        paramArrayOfByte.add(localIDKey3);
        com.tencent.mm.plugin.report.service.g.ork.b(paramArrayOfByte, true);
      }
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(5069269368832L, 37769);
  }
  
  public final int getType()
  {
    GMTrace.i(15361218969600L, 114450);
    GMTrace.o(15361218969600L, 114450);
    return 903;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\sharecard\model\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */