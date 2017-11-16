package com.tencent.mm.plugin.card.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.card.b.q;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.ae;
import com.tencent.mm.plugin.card.model.ah;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.model.g.c;
import com.tencent.mm.plugin.card.model.i;
import com.tencent.mm.plugin.card.model.j;
import com.tencent.mm.protocal.c.arr;
import com.tencent.mm.protocal.c.avs;
import com.tencent.mm.protocal.c.avt;
import com.tencent.mm.protocal.c.jm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class g
  implements com.tencent.mm.ad.e
{
  public List<WeakReference<a>> jwK;
  public com.tencent.mm.plugin.card.b.c jxg;
  public int jxh;
  public aj jxi;
  
  public g()
  {
    GMTrace.i(18901614198784L, 140828);
    this.jwK = new ArrayList();
    this.jxi = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(18900943110144L, 140823);
        w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "onTimerExpired, do refresh code!");
        g localg = g.this;
        w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "onShowTimeExpired()");
        if (localg.jwK != null)
        {
          int i = 0;
          while (i < localg.jwK.size())
          {
            Object localObject = (WeakReference)localg.jwK.get(i);
            if (localObject != null)
            {
              localObject = (g.a)((WeakReference)localObject).get();
              if (localObject != null) {
                ((g.a)localObject).ajV();
              }
            }
            i += 1;
          }
        }
        GMTrace.o(18900943110144L, 140823);
        return true;
      }
    }, false);
    GMTrace.o(18901614198784L, 140828);
  }
  
  private void D(LinkedList<arr> paramLinkedList)
  {
    GMTrace.i(18903090593792L, 140839);
    at.wS().a(1275, this);
    paramLinkedList = new ah(paramLinkedList);
    at.wS().a(paramLinkedList, 0);
    GMTrace.o(18903090593792L, 140839);
  }
  
  private void a(com.tencent.mm.plugin.card.b.c paramc)
  {
    GMTrace.i(18903761682432L, 140844);
    w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "onSuccess()");
    if (this.jwK == null)
    {
      GMTrace.o(18903761682432L, 140844);
      return;
    }
    int i = 0;
    while (i < this.jwK.size())
    {
      Object localObject = (WeakReference)this.jwK.get(i);
      if (localObject != null)
      {
        localObject = (a)((WeakReference)localObject).get();
        if (localObject != null) {
          ((a)localObject).c(paramc);
        }
      }
      i += 1;
    }
    GMTrace.o(18903761682432L, 140844);
  }
  
  private void a(avt paramavt)
  {
    GMTrace.i(18903359029248L, 140841);
    if (paramavt == null)
    {
      GMTrace.o(18903359029248L, 140841);
      return;
    }
    String str = paramavt.eTJ;
    Object localObject;
    if (al.akC().tV(str) == null)
    {
      localObject = b(paramavt);
      al.akC().b((com.tencent.mm.sdk.e.c)localObject);
    }
    for (;;)
    {
      localObject = al.akB().tW(str);
      if ((!((List)localObject).isEmpty()) && (al.akB().hB(str)) && (this.jxg != null)) {
        a(str, (List)localObject, this.jxg);
      }
      paramavt = paramavt.uLa.iterator();
      while (paramavt.hasNext())
      {
        localObject = (avs)paramavt.next();
        com.tencent.mm.plugin.card.model.k localk = new com.tencent.mm.plugin.card.model.k();
        localk.field_card_id = str;
        localk.field_code_id = ((avs)localObject).jzv;
        localk.field_code = com.tencent.mm.plugin.card.b.e.bH(str, ((avs)localObject).data);
        al.akB().b(localk);
      }
      localObject = b(paramavt);
      al.akC().c((com.tencent.mm.sdk.e.c)localObject, new String[0]);
    }
    GMTrace.o(18903359029248L, 140841);
  }
  
  private void a(String paramString, q paramq)
  {
    GMTrace.i(18902687940608L, 140836);
    Object localObject = new StringBuilder("doNetSceneGetDynamicQrcode, cardId:").append(paramString).append(",scene :");
    if (paramq == null)
    {
      i = 0;
      w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", i);
      localObject = new LinkedList();
      ((LinkedList)localObject).add(paramString);
      if (paramq != null) {
        break label117;
      }
    }
    label117:
    for (int i = 0;; i = paramq.scene)
    {
      paramString = new ae((LinkedList)localObject, i);
      at.wS().a(1382, this);
      at.wS().a(paramString, 0);
      GMTrace.o(18902687940608L, 140836);
      return;
      i = paramq.scene;
      break;
    }
  }
  
  private void a(String paramString, List<com.tencent.mm.plugin.card.model.k> paramList, com.tencent.mm.plugin.card.b.c paramc)
  {
    GMTrace.i(18902822158336L, 140837);
    if (paramc == null)
    {
      w.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "doNetSceneReport error! CardCodeRefreshAction is null! cannot report!");
      GMTrace.o(18902822158336L, 140837);
      return;
    }
    LinkedList localLinkedList = new LinkedList();
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localLinkedList.add(b(paramString, ((com.tencent.mm.plugin.card.model.k)paramList.next()).field_code_id, paramc));
    }
    D(localLinkedList);
    GMTrace.o(18902822158336L, 140837);
  }
  
  public static boolean a(i parami)
  {
    GMTrace.i(18902285287424L, 140833);
    if (System.currentTimeMillis() - parami.field_fetch_time > parami.field_expire_time_interval * 1000)
    {
      w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "code  expire time is true! currentTime= %s,codeFetchTime=%s,field_expire_time_interval=%s", new Object[] { Long.valueOf(System.currentTimeMillis()), Long.valueOf(parami.field_fetch_time), Integer.valueOf(parami.field_expire_time_interval) });
      GMTrace.o(18902285287424L, 140833);
      return true;
    }
    GMTrace.o(18902285287424L, 140833);
    return false;
  }
  
  private static i b(avt paramavt)
  {
    GMTrace.i(18903493246976L, 140842);
    i locali = new i();
    locali.field_card_id = paramavt.eTJ;
    locali.field_lower_bound = paramavt.uKV;
    locali.field_expire_time_interval = paramavt.uKY;
    locali.field_need_insert_show_timestamp = paramavt.uKW;
    locali.field_show_expire_interval = paramavt.uKZ;
    locali.field_show_timestamp_encrypt_key = paramavt.uKX;
    locali.field_fetch_time = System.currentTimeMillis();
    GMTrace.o(18903493246976L, 140842);
    return locali;
  }
  
  private static arr b(String paramString1, String paramString2, com.tencent.mm.plugin.card.b.c paramc)
  {
    GMTrace.i(18903224811520L, 140840);
    arr localarr = new arr();
    localarr.eTJ = paramString1;
    localarr.jzv = paramString2;
    localarr.uHL = new Long(System.currentTimeMillis() / 1000L).intValue();
    if (paramc == null) {}
    for (int i = -1;; i = paramc.action)
    {
      localarr.uHM = i;
      GMTrace.o(18903224811520L, 140840);
      return localarr;
    }
  }
  
  private void b(com.tencent.mm.plugin.card.b.c paramc)
  {
    GMTrace.i(18904030117888L, 140846);
    w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "onReceiveCodeUnavailable()");
    if (this.jwK == null)
    {
      GMTrace.o(18904030117888L, 140846);
      return;
    }
    int i = 0;
    while (i < this.jwK.size())
    {
      Object localObject = (WeakReference)this.jwK.get(i);
      if (localObject != null)
      {
        localObject = (a)((WeakReference)localObject).get();
        if (localObject != null) {
          ((a)localObject).b(paramc);
        }
      }
      i += 1;
    }
    GMTrace.o(18904030117888L, 140846);
  }
  
  private static boolean g(b paramb)
  {
    GMTrace.i(18902553722880L, 140835);
    if (paramb == null)
    {
      GMTrace.o(18902553722880L, 140835);
      return false;
    }
    if ((paramb.ajw() != null) && (paramb.ajw().tZu))
    {
      GMTrace.o(18902553722880L, 140835);
      return true;
    }
    w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "get cardInfo is_commom_card is false!");
    GMTrace.o(18902553722880L, 140835);
    return false;
  }
  
  public final void G(int paramInt, String paramString)
  {
    GMTrace.i(18903895900160L, 140845);
    w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "onFail()");
    if (this.jwK == null)
    {
      GMTrace.o(18903895900160L, 140845);
      return;
    }
    int i = 0;
    while (i < this.jwK.size())
    {
      Object localObject = (WeakReference)this.jwK.get(i);
      if (localObject != null)
      {
        localObject = (a)((WeakReference)localObject).get();
        if (localObject != null) {
          ((a)localObject).H(paramInt, paramString);
        }
      }
      i += 1;
    }
    GMTrace.o(18903895900160L, 140845);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(18903627464704L, 140843);
    StringBuilder localStringBuilder = new StringBuilder("onSceneEnd, errType = ").append(paramInt1).append(" errCode = ").append(paramInt2).append(",NetSceneBase=");
    if (paramk != null) {}
    for (Object localObject = paramk.getClass();; localObject = "")
    {
      w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", localObject);
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        break label176;
      }
      if (!(paramk instanceof ae)) {
        break label156;
      }
      paramString = ((ae)paramk).jzX;
      if (paramString != null) {
        break;
      }
      w.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "onSceneEnd, resp  qr_code_item_list is null ");
      GMTrace.o(18903627464704L, 140843);
      return;
    }
    a(paramString);
    a(this.jxg);
    at.wS().b(1382, this);
    GMTrace.o(18903627464704L, 140843);
    return;
    label156:
    at.wS().b(1275, this);
    GMTrace.o(18903627464704L, 140843);
    return;
    label176:
    localObject = new StringBuilder("onSceneEnd, errType = ").append(paramInt1).append(" errCode = ").append(paramInt2).append(" cmd:");
    if (paramk != null)
    {
      paramInt1 = paramk.getType();
      localStringBuilder = ((StringBuilder)localObject).append(paramInt1).append("  NetSceneBase=");
      if (paramk == null) {
        break label299;
      }
    }
    label299:
    for (localObject = paramk.getClass();; localObject = "")
    {
      w.e("MicroMsg.CardDynamicQrcodeOfflineMgr", localObject);
      if (!(paramk instanceof ae)) {
        break label307;
      }
      G(paramInt2, paramString);
      at.wS().b(1382, this);
      GMTrace.o(18903627464704L, 140843);
      return;
      paramInt1 = 0;
      break;
    }
    label307:
    at.wS().b(1275, this);
    GMTrace.o(18903627464704L, 140843);
  }
  
  public final void a(q paramq)
  {
    GMTrace.i(18902016851968L, 140831);
    w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "doUpdateOfflineQrcodeByDynaimicCard! fromScene=%d", new Object[] { Integer.valueOf(paramq.scene) });
    Object localObject1 = al.akn().akc();
    if (((List)localObject1).isEmpty())
    {
      w.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "doUpdateOfflineQrcodeByDynaimicCard do update all offileQrcode is failure! is dynamic cardList is empyt!fromScene=%d", new Object[] { Integer.valueOf(paramq.scene) });
      GMTrace.o(18902016851968L, 140831);
      return;
    }
    localObject1 = ((List)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      CardInfo localCardInfo = (CardInfo)((Iterator)localObject1).next();
      if (localCardInfo == null)
      {
        w.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "doUpdateOfflineQrcodeByDynaimicCard  is failure! cardInfo is null fromScene=%d", new Object[] { Integer.valueOf(paramq.scene) });
      }
      else if (paramq == null)
      {
        w.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "doUpdateOfflineQrcodeByDynaimicCard  is failure! fromScene is null!");
      }
      else
      {
        w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "doUpdateOfflineQrcodeByDynaimicCard  get dynamic code! cardId= %s,fromScene=%d", new Object[] { localCardInfo.ajz(), Integer.valueOf(paramq.scene) });
        if (!g(localCardInfo))
        {
          w.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "cannot  get qrCode ! cardId =%s", new Object[] { localCardInfo.ajz() });
        }
        else
        {
          Object localObject2 = localCardInfo.ajz();
          i locali = al.akC().tV((String)localObject2);
          int i;
          if (locali == null) {
            i = 1;
          }
          for (;;)
          {
            if (i != 0) {
              break label358;
            }
            w.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "do not need  get qrCode!  cardId =%s,fromScene=%d", new Object[] { localCardInfo.ajz(), Integer.valueOf(paramq.scene) });
            break;
            localObject2 = al.akB().tW((String)localObject2);
            if (((List)localObject2).isEmpty())
            {
              i = 1;
            }
            else if (((List)localObject2).size() < locali.field_lower_bound)
            {
              this.jxg = com.tencent.mm.plugin.card.b.c.jLi;
              i = 1;
            }
            else if (a(locali))
            {
              this.jxg = com.tencent.mm.plugin.card.b.c.jLc;
              i = 1;
            }
            else
            {
              i = 0;
            }
          }
          label358:
          w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "doUpdateOfflineQrcodeByDynaimicCard doNetSceneGetDynamicQrcode! fromScene=%d", new Object[] { Integer.valueOf(paramq.scene) });
          a(localCardInfo.ajz(), paramq);
        }
      }
    }
    GMTrace.o(18902016851968L, 140831);
  }
  
  public final void a(b paramb, q paramq)
  {
    GMTrace.i(18901882634240L, 140830);
    if (!g(paramb))
    {
      w.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "cannot  get qrCode !");
      G(2, "");
      GMTrace.o(18901882634240L, 140830);
      return;
    }
    if (!com.tencent.mm.plugin.card.b.l.isNetworkAvailable(ab.getContext()))
    {
      w.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "isNetworkAvailable false cannot connet network!");
      G(-1, "");
      GMTrace.o(18901882634240L, 140830);
      return;
    }
    if (this.jxh >= 3)
    {
      w.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "doRequestNetSceneGetDynamicQrcode is  limit requestcount:" + this.jxh + ",cannot request!");
      GMTrace.o(18901882634240L, 140830);
      return;
    }
    a(paramb.ajz(), paramq);
    this.jxh += 1;
    GMTrace.o(18901882634240L, 140830);
  }
  
  public final void a(String paramString1, String paramString2, com.tencent.mm.plugin.card.b.c paramc)
  {
    GMTrace.i(18902956376064L, 140838);
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add(b(paramString1, paramString2, paramc));
    w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "doNetSceneReport, operate_list=%d,refreshAction=%d", new Object[] { Integer.valueOf(localLinkedList.size()), Integer.valueOf(paramc.action) });
    D(localLinkedList);
    GMTrace.o(18902956376064L, 140838);
  }
  
  public final void ajM()
  {
    GMTrace.i(18902419505152L, 140834);
    w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "stopRefreshCodeTimer!");
    if (!this.jxi.bQn()) {
      this.jxi.stopTimer();
    }
    GMTrace.o(18902419505152L, 140834);
  }
  
  public final void b(com.tencent.mm.plugin.card.model.g paramg)
  {
    GMTrace.i(18902151069696L, 140832);
    String str = paramg.field_card_id;
    Object localObject1 = al.akB();
    if (paramg.jzm)
    {
      paramg = al.akB().tW(str);
      localObject2 = ((com.tencent.mm.plugin.card.model.l)localObject1).tY(str);
      w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "get msg allUnavailable is true! delete all card code data by card_id=%s", new Object[] { str });
      if (((com.tencent.mm.plugin.card.model.l)localObject1).hB(str))
      {
        if (localObject2 != null)
        {
          w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "code is showing card_id= %s,notify ui to refresh!", new Object[] { str });
          b(com.tencent.mm.plugin.card.b.c.jLh);
        }
        a(str, paramg, com.tencent.mm.plugin.card.b.c.jLh);
      }
      GMTrace.o(18902151069696L, 140832);
      return;
    }
    Object localObject2 = paramg.jzn;
    if (localObject2 == null)
    {
      w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "get msg allUnavailable is false! unavailableQrCodeList is empty, do nothing! card_id=%s", new Object[] { str });
      GMTrace.o(18902151069696L, 140832);
      return;
    }
    w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "get msg allUnavailable is false! delete card code data by unavailableQrCodeList, card_id=%s，unavailableQrCodeList size= %d", new Object[] { str, Integer.valueOf(((List)localObject2).size()) });
    paramg = ((com.tencent.mm.plugin.card.model.l)localObject1).tY(str);
    localObject1 = new LinkedList();
    localObject2 = ((List)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      g.c localc = (g.c)((Iterator)localObject2).next();
      if (al.akB().bA(str, localc.jzv)) {
        ((LinkedList)localObject1).add(b(str, localc.jzv, com.tencent.mm.plugin.card.b.c.jLh));
      }
    }
    if (paramg != null)
    {
      w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "code is showing card_id= %s,code_id= %s, notify ui to refresh!", new Object[] { str, paramg.field_code_id });
      b(com.tencent.mm.plugin.card.b.c.jLh);
    }
    if (!((LinkedList)localObject1).isEmpty()) {
      D((LinkedList)localObject1);
    }
    GMTrace.o(18902151069696L, 140832);
  }
  
  public final void release()
  {
    GMTrace.i(18901748416512L, 140829);
    this.jxh = 0;
    ajM();
    w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "removeNetSceneListener!");
    at.wS().b(1382, this);
    at.wS().b(1275, this);
    GMTrace.o(18901748416512L, 140829);
  }
  
  public static abstract interface a
  {
    public abstract void H(int paramInt, String paramString);
    
    public abstract void ajV();
    
    public abstract void b(com.tencent.mm.plugin.card.b.c paramc);
    
    public abstract void c(com.tencent.mm.plugin.card.b.c paramc);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */