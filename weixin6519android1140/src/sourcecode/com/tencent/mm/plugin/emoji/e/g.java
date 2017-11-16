package com.tencent.mm.plugin.emoji.e;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.opensdk.modelmsg.WXEmojiObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.emoji.model.b;
import com.tencent.mm.plugin.emoji.ui.CustomSmileyPreviewUI;
import com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI;
import com.tencent.mm.protocal.c.bef;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.aj;
import com.tencent.mm.storage.al;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.p;
import com.tencent.mm.storage.emotion.q;
import com.tencent.mm.storage.emotion.r;
import com.tencent.mm.storage.emotion.t;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class g
  implements com.tencent.mm.pluginsdk.c.d
{
  public g()
  {
    GMTrace.i(11557085904896L, 86107);
    GMTrace.o(11557085904896L, 86107);
  }
  
  private static void a(Context paramContext, String paramString1, String paramString2, String paramString3, long paramLong, String paramString4, String paramString5)
  {
    GMTrace.i(11558025428992L, 86114);
    if (paramString1.equals("-1"))
    {
      w.e("MicroMsg.emoji.EmojiMgrImpl", "showEmoji fail cause md5 is no valid");
      GMTrace.o(11558025428992L, 86114);
      return;
    }
    EmojiInfo localEmojiInfo = com.tencent.mm.plugin.emoji.model.h.arl().kjy.UK(paramString1);
    if (localEmojiInfo == null)
    {
      w.e("MicroMsg.emoji.EmojiMgrImpl", "showEmoji fail cause md5 is no valid");
      GMTrace.o(11558025428992L, 86114);
      return;
    }
    Intent localIntent = new Intent(paramContext, CustomSmileyPreviewUI.class);
    localIntent.putExtra("custom_smiley_preview_md5", paramString1);
    if (paramString2 != null) {
      localIntent.putExtra("custom_smiley_preview_appid", paramString2);
    }
    for (;;)
    {
      localIntent.putExtra("custom_smiley_preview_appname", paramString3);
      localIntent.putExtra("msg_id", paramLong);
      localIntent.putExtra("msg_content", paramString5);
      paramString1 = paramString4;
      if (com.tencent.mm.y.s.eb(paramString4)) {
        paramString1 = bc.gP(paramString5);
      }
      localIntent.putExtra("msg_sender", paramString1);
      paramContext.startActivity(localIntent);
      GMTrace.o(11558025428992L, 86114);
      return;
      localIntent.putExtra("custom_smiley_preview_appid", localEmojiInfo.field_app_id);
    }
  }
  
  private static void c(f.a parama)
  {
    GMTrace.i(11558159646720L, 86115);
    com.tencent.mm.plugin.emoji.model.h.aro();
    if (parama == null)
    {
      w.e("MicroMsg.emoji.EmojiAppMsgDownloadService", "msg content is null");
      GMTrace.o(11558159646720L, 86115);
      return;
    }
    String str = parama.gix;
    if (bg.nm(str))
    {
      w.e("MicroMsg.emoji.EmojiAppMsgDownloadService", "md5 is null.");
      GMTrace.o(11558159646720L, 86115);
      return;
    }
    EmojiInfo localEmojiInfo = new EmojiInfo();
    localEmojiInfo.field_md5 = str;
    localEmojiInfo.field_app_id = parama.appId;
    localEmojiInfo.field_catalog = EmojiInfo.vCo;
    localEmojiInfo.field_size = parama.giv;
    localEmojiInfo.field_temp = 1;
    localEmojiInfo.field_state = EmojiInfo.vCE;
    com.tencent.mm.plugin.emoji.model.h.arl().kjy.o(localEmojiInfo);
    parama = new LinkedList();
    parama.add(str);
    parama = new com.tencent.mm.plugin.emoji.f.e(parama);
    at.wS().a(parama, 0);
    b.aQ(str, 0);
    w.d("MicroMsg.emoji.EmojiAppMsgDownloadService", "start change cdn url. md5:%s", new Object[] { str });
    GMTrace.o(11558159646720L, 86115);
  }
  
  public final String a(Context paramContext, WXMediaMessage paramWXMediaMessage, String paramString)
  {
    GMTrace.i(11558696517632L, 86119);
    paramContext = EmojiLogic.b(paramContext, paramWXMediaMessage, paramString);
    GMTrace.o(11558696517632L, 86119);
    return paramContext;
  }
  
  public final void a(Context paramContext, au paramau)
  {
    GMTrace.i(11557622775808L, 86111);
    if ((paramContext == null) || (paramau == null))
    {
      w.w("MicroMsg.emoji.EmojiMgrImpl", "context or msg is null");
      GMTrace.o(11557622775808L, 86111);
      return;
    }
    aj localaj = aj.Uf(paramau.field_content);
    Object localObject2 = f.a.eS(paramau.field_content);
    Object localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject1 = new f.a();
      ((f.a)localObject1).gix = localaj.eDW;
    }
    localObject2 = com.tencent.mm.plugin.emoji.model.h.arl().kjy.UK(((f.a)localObject1).gix);
    if (paramau.field_isSend == 1)
    {
      if ((localObject2 != null) && (((EmojiInfo)localObject2).bUN()))
      {
        a(paramContext, ((f.a)localObject1).gix, ((f.a)localObject1).appId, ((f.a)localObject1).appName, paramau.field_msgSvrId, paramau.field_talker, paramau.field_content);
        GMTrace.o(11557622775808L, 86111);
        return;
      }
      l = paramau.field_msgId;
      c((f.a)localObject1);
      GMTrace.o(11557622775808L, 86111);
      return;
    }
    if ((localObject2 != null) && (((EmojiInfo)localObject2).bUN()))
    {
      a(paramContext, ((EmojiInfo)localObject2).GS(), ((f.a)localObject1).appId, ((f.a)localObject1).appName, paramau.field_msgSvrId, paramau.field_talker, paramau.field_content);
      GMTrace.o(11557622775808L, 86111);
      return;
    }
    long l = paramau.field_msgId;
    c((f.a)localObject1);
    GMTrace.o(11557622775808L, 86111);
  }
  
  public final void a(bef parambef)
  {
    GMTrace.i(19272994652160L, 143595);
    com.tencent.mm.plugin.emoji.model.h.arl().kjB.b(parambef);
    GMTrace.o(19272994652160L, 143595);
  }
  
  public final void a(String paramString, EmojiInfo paramEmojiInfo, au paramau)
  {
    GMTrace.i(11557891211264L, 86113);
    if ((paramEmojiInfo == null) && (paramau == null))
    {
      GMTrace.o(11557891211264L, 86113);
      return;
    }
    EmojiInfo localEmojiInfo = paramEmojiInfo;
    if (paramEmojiInfo == null) {
      localEmojiInfo = com.tencent.mm.plugin.emoji.model.h.arl().kjy.UK(paramau.field_imgPath);
    }
    com.tencent.mm.plugin.emoji.model.h.arf().a(paramString, localEmojiInfo, paramau);
    GMTrace.o(11557891211264L, 86113);
  }
  
  public final boolean a(Context paramContext, EmojiInfo paramEmojiInfo, int paramInt, String paramString)
  {
    GMTrace.i(11557488558080L, 86110);
    if (paramContext == null)
    {
      w.e("MicroMsg.emoji.EmojiMgrImpl", "[cpan] save emoji failed. context is null");
      GMTrace.o(11557488558080L, 86110);
      return false;
    }
    if (paramEmojiInfo == null)
    {
      w.e("MicroMsg.emoji.EmojiMgrImpl", "[cpan] save emoji failed. emoji is null");
      GMTrace.o(11557488558080L, 86110);
      return false;
    }
    Intent localIntent = new Intent();
    localIntent.setClass(paramContext, EmojiAddCustomDialogUI.class);
    localIntent.putExtra("extra_id", paramEmojiInfo.GS());
    localIntent.putExtra("extra_scence", paramInt);
    localIntent.addFlags(65536);
    localIntent.putExtra("extra_username", paramString);
    paramContext.startActivity(localIntent);
    GMTrace.o(11557488558080L, 86110);
    return true;
  }
  
  public final boolean a(EmojiGroupInfo paramEmojiGroupInfo)
  {
    GMTrace.i(19273397305344L, 143598);
    boolean bool = com.tencent.mm.plugin.emoji.model.h.arl().kjz.c(paramEmojiGroupInfo, new String[] { "productID" });
    GMTrace.o(19273397305344L, 143598);
    return bool;
  }
  
  public final boolean a(String paramString1, String paramString2, long paramLong, String paramString3, d.a parama)
  {
    GMTrace.i(11558830735360L, 86120);
    com.tencent.mm.plugin.emoji.model.c localc = com.tencent.mm.plugin.emoji.model.h.arf();
    w.d("MicroMsg.emoji.EmojiMsgInfo", "parserEmojiXml " + paramString2);
    paramString1 = al.a(bh.q(paramString2, "msg"), paramString1, paramString2, paramString3);
    if (paramString1 == null)
    {
      w.i("MicroMsg.emoji.EmojiService", "prepareEmoji failed. emoji msg info is null.");
      GMTrace.o(11558830735360L, 86120);
      return true;
    }
    paramString1.eSf = paramLong;
    w.i("MicroMsg.emoji.EmojiService", "summerbadcr prepareEmoji msgSvrId[%d], stack[%s]", new Object[] { Long.valueOf(paramLong), bg.bQW() });
    localc.wk(paramString1.eEa);
    if (!EmojiLogic.wj(n.aqU())) {}
    for (boolean bool = true;; bool = false)
    {
      localc.a(paramString1, parama, bool);
      GMTrace.o(11558830735360L, 86120);
      return true;
    }
  }
  
  public final byte[] a(EmojiInfo paramEmojiInfo)
  {
    GMTrace.i(19272457781248L, 143591);
    paramEmojiInfo = e.aqw().a(paramEmojiInfo);
    GMTrace.o(19272457781248L, 143591);
    return paramEmojiInfo;
  }
  
  public final ArrayList<q> aqA()
  {
    GMTrace.i(11560575565824L, 86133);
    ArrayList localArrayList = com.tencent.mm.plugin.emoji.model.h.arl().kjG.aqA();
    GMTrace.o(11560575565824L, 86133);
    return localArrayList;
  }
  
  public final ArrayList<String> aqB()
  {
    GMTrace.i(11560709783552L, 86134);
    ArrayList localArrayList = com.tencent.mm.plugin.emoji.model.h.arl().kjG.aqB();
    GMTrace.o(11560709783552L, 86134);
    return localArrayList;
  }
  
  public final ArrayList<com.tencent.mm.storage.emotion.s> aqC()
  {
    GMTrace.i(11560844001280L, 86135);
    ArrayList localArrayList = com.tencent.mm.plugin.emoji.model.h.arl().kjH.aqC();
    GMTrace.o(11560844001280L, 86135);
    return localArrayList;
  }
  
  public final com.tencent.mm.aw.f aqD()
  {
    GMTrace.i(11561649307648L, 86141);
    com.tencent.mm.aw.f localf = i.aqL().aqD();
    GMTrace.o(11561649307648L, 86141);
    return localf;
  }
  
  public final bef aqE()
  {
    GMTrace.i(19272860434432L, 143594);
    bef localbef = com.tencent.mm.plugin.emoji.model.h.arl().kjB.aqE();
    GMTrace.o(19272860434432L, 143594);
    return localbef;
  }
  
  public final int aqF()
  {
    GMTrace.i(19273128869888L, 143596);
    int i = com.tencent.mm.plugin.emoji.model.h.arl().kjy.kM(true);
    GMTrace.o(19273128869888L, 143596);
    return i;
  }
  
  public final ArrayList<EmojiGroupInfo> aqG()
  {
    GMTrace.i(19273531523072L, 143599);
    ArrayList localArrayList = com.tencent.mm.plugin.emoji.model.h.arl().aqG();
    GMTrace.o(19273531523072L, 143599);
    return localArrayList;
  }
  
  public final int aqH()
  {
    GMTrace.i(19273665740800L, 143600);
    int i = com.tencent.mm.plugin.emoji.model.h.arl().aqH();
    GMTrace.o(19273665740800L, 143600);
    return i;
  }
  
  public final ArrayList<EmojiInfo> aqI()
  {
    GMTrace.i(19273799958528L, 143601);
    ArrayList localArrayList = com.tencent.mm.plugin.emoji.model.h.arl().aqI();
    GMTrace.o(19273799958528L, 143601);
    return localArrayList;
  }
  
  public final com.tencent.mm.ao.a.a aqJ()
  {
    GMTrace.i(19274068393984L, 143603);
    com.tencent.mm.ao.a.a locala = com.tencent.mm.plugin.emoji.model.h.aqJ();
    GMTrace.o(19274068393984L, 143603);
    return locala;
  }
  
  public final boolean aqK()
  {
    GMTrace.i(19274739482624L, 143608);
    boolean bool = n.aqX();
    GMTrace.o(19274739482624L, 143608);
    return bool;
  }
  
  public final boolean aqz()
  {
    GMTrace.i(19272726216704L, 143593);
    boolean bool = n.aqS();
    GMTrace.o(19272726216704L, 143593);
    return bool;
  }
  
  public final al bT(String paramString1, String paramString2)
  {
    GMTrace.i(11558293864448L, 86116);
    Map localMap = bh.q(paramString1, "msg");
    if (localMap == null)
    {
      w.w("MicroMsg.emoji.EmojiMgrImpl", "get from xml, but attrs is null");
      GMTrace.o(11558293864448L, 86116);
      return null;
    }
    paramString2 = al.a(localMap, paramString2, paramString1, "");
    if (paramString2 == null)
    {
      w.w("MicroMsg.emoji.EmojiMgrImpl", "parserEmojiXml error " + paramString1);
      GMTrace.o(11558293864448L, 86116);
      return null;
    }
    GMTrace.o(11558293864448L, 86116);
    return paramString2;
  }
  
  public final String bU(String paramString1, String paramString2)
  {
    GMTrace.i(11561515089920L, 86140);
    at.AR();
    paramString1 = EmojiLogic.G(com.tencent.mm.y.c.zb(), paramString1, paramString2);
    GMTrace.o(11561515089920L, 86140);
    return paramString1;
  }
  
  public final EmojiInfo c(EmojiInfo paramEmojiInfo)
  {
    GMTrace.i(11557354340352L, 86109);
    Object localObject = paramEmojiInfo;
    if (paramEmojiInfo.field_catalog == EmojiGroupInfo.vCm)
    {
      localObject = paramEmojiInfo;
      if (paramEmojiInfo.field_type == EmojiInfo.vCv)
      {
        localObject = paramEmojiInfo;
        if (paramEmojiInfo.rc().length() > 0)
        {
          localObject = paramEmojiInfo;
          if (EmojiInfo.Az(bg.getInt(paramEmojiInfo.rc(), 0)))
          {
            Cursor localCursor = com.tencent.mm.plugin.emoji.model.h.arl().kjy.AD(bg.getInt(paramEmojiInfo.rc(), 0));
            EmojiInfo localEmojiInfo = paramEmojiInfo;
            if (localCursor != null)
            {
              localEmojiInfo = paramEmojiInfo;
              if (localCursor.getCount() > 1)
              {
                int i = bg.eb(localCursor.getCount() - 1, 0);
                localEmojiInfo = new EmojiInfo();
                localCursor.moveToPosition(i);
                localEmojiInfo.b(localCursor);
              }
            }
            localObject = localEmojiInfo;
            if (localCursor != null)
            {
              localCursor.close();
              localObject = localEmojiInfo;
            }
          }
        }
      }
    }
    GMTrace.o(11557354340352L, 86109);
    return (EmojiInfo)localObject;
  }
  
  public final void d(EmojiInfo paramEmojiInfo)
  {
    GMTrace.i(11558428082176L, 86117);
    com.tencent.mm.plugin.emoji.model.h.arl().kjy.p(paramEmojiInfo);
    GMTrace.o(11558428082176L, 86117);
  }
  
  public final int e(EmojiInfo paramEmojiInfo)
  {
    GMTrace.i(11560038694912L, 86129);
    if (paramEmojiInfo != null)
    {
      int i;
      if ((paramEmojiInfo.field_catalog == EmojiInfo.vCs) || (String.valueOf(EmojiInfo.vCs).equals(paramEmojiInfo.field_groupId)))
      {
        i = R.g.aXv;
        GMTrace.o(11560038694912L, 86129);
        return i;
      }
      if ((paramEmojiInfo.field_catalog == EmojiInfo.vCt) || (String.valueOf(EmojiInfo.vCt).equals(paramEmojiInfo.field_groupId)))
      {
        i = R.g.aVY;
        GMTrace.o(11560038694912L, 86129);
        return i;
      }
    }
    GMTrace.o(11560038694912L, 86129);
    return 0;
  }
  
  public final void f(j.a parama)
  {
    GMTrace.i(19274202611712L, 143604);
    com.tencent.mm.plugin.emoji.model.h.arl().kjy.j(parama);
    GMTrace.o(19274202611712L, 143604);
  }
  
  public final int[] f(EmojiInfo paramEmojiInfo)
  {
    GMTrace.i(11560172912640L, 86130);
    if (paramEmojiInfo != null)
    {
      int i;
      int j;
      int k;
      if (paramEmojiInfo.field_catalog == EmojiInfo.vCs)
      {
        i = R.g.aXx;
        j = R.g.aXy;
        k = R.g.aXw;
        GMTrace.o(11560172912640L, 86130);
        return new int[] { i, j, k };
      }
      if (paramEmojiInfo.field_catalog == EmojiInfo.vCt)
      {
        i = R.g.aVZ;
        j = R.g.aWa;
        k = R.g.aWb;
        int m = R.g.aWc;
        GMTrace.o(11560172912640L, 86130);
        return new int[] { i, j, k, m };
      }
    }
    GMTrace.o(11560172912640L, 86130);
    return null;
  }
  
  public final void g(j.a parama)
  {
    GMTrace.i(19274336829440L, 143605);
    com.tencent.mm.plugin.emoji.model.h.arl().kjy.c(parama);
    GMTrace.o(19274336829440L, 143605);
  }
  
  public final void h(j.a parama)
  {
    GMTrace.i(19274471047168L, 143606);
    com.tencent.mm.plugin.emoji.model.h.arl().kjz.j(parama);
    GMTrace.o(19274471047168L, 143606);
  }
  
  public final void i(j.a parama)
  {
    GMTrace.i(19274605264896L, 143607);
    if (((com.tencent.mm.kernel.b.f)com.tencent.mm.kernel.h.xv().wZ()).eR("")) {
      com.tencent.mm.plugin.emoji.model.h.arl().kjz.c(parama);
    }
    GMTrace.o(19274605264896L, 143607);
  }
  
  public final boolean m(Context paramContext, String paramString1, String paramString2)
  {
    GMTrace.i(11557756993536L, 86112);
    if (paramContext == null)
    {
      w.w("MicroMsg.emoji.EmojiMgrImpl", "sendEmoji: context is null");
      GMTrace.o(11557756993536L, 86112);
      return false;
    }
    if ((bg.nm(paramString1)) || (bg.nm(paramString2)))
    {
      w.w("MicroMsg.emoji.EmojiMgrImpl", "sendEmoji: userName or imgPath is null");
      GMTrace.o(11557756993536L, 86112);
      return false;
    }
    EmojiInfo localEmojiInfo = com.tencent.mm.plugin.emoji.model.h.arl().kjy.UK(paramString2);
    if (localEmojiInfo == null)
    {
      w.w("MicroMsg.emoji.EmojiMgrImpl", "sendEmoji: emoji not found, imgPath %s", new Object[] { paramString2 });
      GMTrace.o(11557756993536L, 86112);
      return false;
    }
    int i;
    if ((localEmojiInfo.field_type == EmojiInfo.vCy) || (localEmojiInfo.field_type == EmojiInfo.vCz))
    {
      paramString2 = new WXMediaMessage();
      Object localObject = new StringBuilder();
      at.AR();
      localObject = com.tencent.mm.y.c.zb() + localEmojiInfo.GS();
      if (com.tencent.mm.a.e.aZ((String)localObject + "_thumb"))
      {
        i = com.tencent.mm.a.e.aY((String)localObject + "_thumb");
        paramString2.thumbData = com.tencent.mm.a.e.c((String)localObject + "_thumb", 0, i);
      }
      for (;;)
      {
        paramString2.mediaObject = new WXEmojiObject((String)localObject);
        com.tencent.mm.pluginsdk.model.app.l.a(paramString2, localEmojiInfo.field_app_id, null, paramString1, 0, localEmojiInfo.GS());
        GMTrace.o(11557756993536L, 86112);
        return true;
        paramString2.setThumbImage(localEmojiInfo.eT(paramContext));
      }
    }
    if (localEmojiInfo.field_type == EmojiInfo.vCv) {
      if (EmojiInfo.Az(localEmojiInfo.field_catalog)) {
        paramContext = com.tencent.mm.plugin.emoji.model.h.arl().kjy.AD(localEmojiInfo.field_catalog);
      }
    }
    for (;;)
    {
      label349:
      if (paramContext != null)
      {
        i = bg.eb(paramContext.getCount() - 1, 0);
        paramString2 = new EmojiInfo();
        paramContext.moveToPosition(i);
        paramString2.b(paramContext);
        paramContext.close();
      }
      for (paramContext = paramString2;; paramContext = localEmojiInfo)
      {
        com.tencent.mm.plugin.emoji.model.h.arf().a(paramString1, paramContext, null);
        break;
        if ((localEmojiInfo.field_catalog != EmojiInfo.vCq) || (localEmojiInfo.rc().length() <= 0) || (!EmojiInfo.Az(bg.getInt(localEmojiInfo.rc(), 0)))) {
          break label474;
        }
        paramContext = com.tencent.mm.plugin.emoji.model.h.arl().kjy.AD(bg.getInt(localEmojiInfo.rc(), 0));
        break label349;
      }
      label474:
      paramContext = null;
    }
  }
  
  public final void onDestroy()
  {
    GMTrace.i(19272591998976L, 143592);
    GMTrace.o(19272591998976L, 143592);
  }
  
  public final boolean s(ArrayList<q> paramArrayList)
  {
    GMTrace.i(11560978219008L, 86136);
    r localr = com.tencent.mm.plugin.emoji.model.h.arl().kjG;
    if (paramArrayList.size() <= 0)
    {
      w.i("MicroMsg.emoji.NewSmileyInfoStorage", "insertSmileyInfoList failed. list is null.");
      GMTrace.o(11560978219008L, 86136);
      return false;
    }
    com.tencent.mm.bu.g localg;
    long l;
    if ((localr.fTZ instanceof com.tencent.mm.bu.g))
    {
      localg = (com.tencent.mm.bu.g)localr.fTZ;
      l = localg.cE(Thread.currentThread().getId());
    }
    for (;;)
    {
      localr.fTZ.delete("SmileyInfo", null, null);
      paramArrayList = paramArrayList.iterator();
      while (paramArrayList.hasNext()) {
        localr.b((q)paramArrayList.next());
      }
      int i = -1;
      if (localg != null) {
        i = localg.aL(l);
      }
      if (i < 0) {
        break;
      }
      GMTrace.o(11560978219008L, 86136);
      return true;
      l = -1L;
      localg = null;
    }
  }
  
  public final boolean t(ArrayList<com.tencent.mm.storage.emotion.s> paramArrayList)
  {
    GMTrace.i(11561112436736L, 86137);
    t localt = com.tencent.mm.plugin.emoji.model.h.arl().kjH;
    if (paramArrayList.size() <= 0)
    {
      w.i("MicroMsg.emoji.SmileyPanelConfigInfoStorage", "insertSmileyConfigInfoList failed. list is null.");
      GMTrace.o(11561112436736L, 86137);
      return false;
    }
    com.tencent.mm.bu.g localg;
    long l;
    if ((localt.fTZ instanceof com.tencent.mm.bu.g))
    {
      localg = (com.tencent.mm.bu.g)localt.fTZ;
      l = localg.cE(Thread.currentThread().getId());
    }
    for (;;)
    {
      localt.fTZ.delete("SmileyPanelConfigInfo", null, null);
      paramArrayList = paramArrayList.iterator();
      while (paramArrayList.hasNext()) {
        localt.b((com.tencent.mm.storage.emotion.s)paramArrayList.next());
      }
      int i = -1;
      if (localg != null) {
        i = localg.aL(l);
      }
      if (i < 0) {
        break;
      }
      GMTrace.o(11561112436736L, 86137);
      return true;
      l = -1L;
      localg = null;
    }
  }
  
  public final String vM(String paramString)
  {
    GMTrace.i(11559099170816L, 86122);
    paramString = com.tencent.mm.plugin.emoji.model.h.arg().vM(paramString);
    GMTrace.o(11559099170816L, 86122);
    return paramString;
  }
  
  public final EmojiInfo vP(String paramString)
  {
    GMTrace.i(11557220122624L, 86108);
    paramString = com.tencent.mm.plugin.emoji.model.h.arl().kjy.UK(paramString);
    GMTrace.o(11557220122624L, 86108);
    return paramString;
  }
  
  public final String vQ(String paramString)
  {
    GMTrace.i(11558562299904L, 86118);
    paramString = EmojiLogic.vQ(paramString);
    GMTrace.o(11558562299904L, 86118);
    return paramString;
  }
  
  public final List<EmojiInfo> vR(String paramString)
  {
    GMTrace.i(11558964953088L, 86121);
    at.AR();
    if (com.tencent.mm.y.c.isSDCardAvailable())
    {
      paramString = (ArrayList)com.tencent.mm.plugin.emoji.model.h.arl().kjy.vR(paramString);
      GMTrace.o(11558964953088L, 86121);
      return paramString;
    }
    paramString = new ArrayList();
    GMTrace.o(11558964953088L, 86121);
    return paramString;
  }
  
  public final boolean vS(String paramString)
  {
    GMTrace.i(11559233388544L, 86123);
    boolean bool = com.tencent.mm.plugin.emoji.model.h.arl().kjz.UF(paramString);
    GMTrace.o(11559233388544L, 86123);
    return bool;
  }
  
  public final ArrayList<String> vT(String paramString)
  {
    GMTrace.i(11559367606272L, 86124);
    a locala = com.tencent.mm.plugin.emoji.model.h.arg();
    if (!locala.mInit) {
      locala.aqs();
    }
    long l = System.currentTimeMillis();
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    int i = com.tencent.mm.ui.tools.h.WW(paramString);
    if ((i < locala.khL) || (i > locala.khM))
    {
      w.d("MicroMsg.emoji.EmojiDescNewMgr", "input text over checkout limit.");
      GMTrace.o(11559367606272L, 86124);
      return null;
    }
    if ((!bg.nm(paramString)) && (locala.khQ != null))
    {
      paramString = paramString.toLowerCase();
      Object localObject = new ArrayList();
      if (locala.khP.containsKey(paramString)) {
        ((ArrayList)localObject).addAll((Collection)locala.khO.get(locala.khP.get(paramString)));
      }
      for (;;)
      {
        paramString = ((ArrayList)localObject).iterator();
        while (paramString.hasNext())
        {
          localObject = (String)paramString.next();
          localObject = (ArrayList)locala.khQ.get(localObject);
          if ((localObject != null) && (!((ArrayList)localObject).isEmpty())) {
            localArrayList1.addAll((Collection)localObject);
          }
        }
        ((ArrayList)localObject).add(paramString);
      }
    }
    if (!localArrayList1.isEmpty())
    {
      Collections.sort(localArrayList1, locala.khR);
      i = 0;
      while (i < localArrayList1.size())
      {
        localArrayList2.add(((a.a)localArrayList1.get(i)).eDW);
        i += 1;
      }
    }
    w.d("MicroMsg.emoji.EmojiDescNewMgr", "cpan[check desc]User time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    GMTrace.o(11559367606272L, 86124);
    return localArrayList2;
  }
  
  public final String vU(String paramString)
  {
    GMTrace.i(11559501824000L, 86125);
    paramString = EmojiLogic.vU(paramString);
    GMTrace.o(11559501824000L, 86125);
    return paramString;
  }
  
  public final String vV(String paramString)
  {
    GMTrace.i(11559636041728L, 86126);
    paramString = EmojiLogic.vV(paramString);
    GMTrace.o(11559636041728L, 86126);
    return paramString;
  }
  
  public final int vW(String paramString)
  {
    GMTrace.i(11559770259456L, 86127);
    int i = EmojiLogic.vW(paramString);
    GMTrace.o(11559770259456L, 86127);
    return i;
  }
  
  public final String vX(String paramString)
  {
    GMTrace.i(11559904477184L, 86128);
    paramString = EmojiLogic.vX(paramString);
    GMTrace.o(11559904477184L, 86128);
    return paramString;
  }
  
  /* Error */
  public final void vY(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: ldc2_w 1013
    //   6: ldc_w 1015
    //   9: invokestatic 19	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   12: aload_1
    //   13: invokestatic 137	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   16: ifeq +12 -> 28
    //   19: ldc_w 1017
    //   22: ldc_w 1019
    //   25: invokestatic 383	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   28: ldc_w 1021
    //   31: aload_1
    //   32: invokevirtual 1024	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   35: ifeq +119 -> 154
    //   38: invokestatic 554	com/tencent/mm/y/at:AR	()Lcom/tencent/mm/y/c;
    //   41: pop
    //   42: invokestatic 1028	com/tencent/mm/y/c:xh	()Lcom/tencent/mm/storage/t;
    //   45: getstatic 1034	com/tencent/mm/storage/w$a:vqb	Lcom/tencent/mm/storage/w$a;
    //   48: iconst_1
    //   49: invokestatic 1039	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   52: invokevirtual 1044	com/tencent/mm/storage/t:a	(Lcom/tencent/mm/storage/w$a;Ljava/lang/Object;)V
    //   55: invokestatic 554	com/tencent/mm/y/at:AR	()Lcom/tencent/mm/y/c;
    //   58: pop
    //   59: invokestatic 1028	com/tencent/mm/y/c:xh	()Lcom/tencent/mm/storage/t;
    //   62: getstatic 1047	com/tencent/mm/storage/w$a:vqg	Lcom/tencent/mm/storage/w$a;
    //   65: iconst_1
    //   66: invokestatic 1039	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   69: invokevirtual 1044	com/tencent/mm/storage/t:a	(Lcom/tencent/mm/storage/w$a;Ljava/lang/Object;)V
    //   72: invokestatic 554	com/tencent/mm/y/at:AR	()Lcom/tencent/mm/y/c;
    //   75: pop
    //   76: invokestatic 1028	com/tencent/mm/y/c:xh	()Lcom/tencent/mm/storage/t;
    //   79: getstatic 1050	com/tencent/mm/storage/w$a:vqj	Lcom/tencent/mm/storage/w$a;
    //   82: lconst_0
    //   83: invokestatic 394	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   86: invokevirtual 1044	com/tencent/mm/storage/t:a	(Lcom/tencent/mm/storage/w$a;Ljava/lang/Object;)V
    //   89: invokestatic 554	com/tencent/mm/y/at:AR	()Lcom/tencent/mm/y/c;
    //   92: pop
    //   93: invokestatic 1028	com/tencent/mm/y/c:xh	()Lcom/tencent/mm/storage/t;
    //   96: getstatic 1053	com/tencent/mm/storage/w$a:vqa	Lcom/tencent/mm/storage/w$a;
    //   99: lconst_0
    //   100: invokestatic 394	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   103: invokevirtual 1044	com/tencent/mm/storage/t:a	(Lcom/tencent/mm/storage/w$a;Ljava/lang/Object;)V
    //   106: invokestatic 188	com/tencent/mm/y/at:wS	()Lcom/tencent/mm/ad/n;
    //   109: new 179	com/tencent/mm/plugin/emoji/f/e
    //   112: dup
    //   113: invokespecial 1054	com/tencent/mm/plugin/emoji/f/e:<init>	()V
    //   116: iconst_0
    //   117: invokevirtual 193	com/tencent/mm/ad/n:a	(Lcom/tencent/mm/ad/k;I)Z
    //   120: pop
    //   121: new 1056	com/tencent/mm/plugin/emoji/f/n
    //   124: dup
    //   125: bipush 8
    //   127: aconst_null
    //   128: bipush 15
    //   130: iconst_1
    //   131: invokespecial 1059	com/tencent/mm/plugin/emoji/f/n:<init>	(I[BIZ)V
    //   134: astore_1
    //   135: invokestatic 188	com/tencent/mm/y/at:wS	()Lcom/tencent/mm/ad/n;
    //   138: aload_1
    //   139: iconst_0
    //   140: invokevirtual 193	com/tencent/mm/ad/n:a	(Lcom/tencent/mm/ad/k;I)Z
    //   143: pop
    //   144: ldc2_w 1013
    //   147: ldc_w 1015
    //   150: invokestatic 22	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   153: return
    //   154: ldc_w 1061
    //   157: aload_1
    //   158: invokevirtual 1024	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   161: ifeq +22 -> 183
    //   164: invokestatic 52	com/tencent/mm/plugin/emoji/model/h:arl	()Lcom/tencent/mm/plugin/emoji/e/l;
    //   167: getfield 335	com/tencent/mm/plugin/emoji/e/l:kjz	Lcom/tencent/mm/storage/emotion/a;
    //   170: invokevirtual 1064	com/tencent/mm/storage/emotion/a:bUM	()V
    //   173: ldc2_w 1013
    //   176: ldc_w 1015
    //   179: invokestatic 22	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   182: return
    //   183: ldc_w 1066
    //   186: aload_1
    //   187: invokevirtual 1024	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   190: ifeq +57 -> 247
    //   193: ldc_w 1017
    //   196: ldc_w 1068
    //   199: invokestatic 383	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   202: invokestatic 52	com/tencent/mm/plugin/emoji/model/h:arl	()Lcom/tencent/mm/plugin/emoji/e/l;
    //   205: getfield 58	com/tencent/mm/plugin/emoji/e/l:kjy	Lcom/tencent/mm/storage/emotion/d;
    //   208: invokestatic 1074	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   211: invokevirtual 1077	com/tencent/mm/storage/emotion/d:eR	(Landroid/content/Context;)Z
    //   214: pop
    //   215: invokestatic 52	com/tencent/mm/plugin/emoji/model/h:arl	()Lcom/tencent/mm/plugin/emoji/e/l;
    //   218: getfield 335	com/tencent/mm/plugin/emoji/e/l:kjz	Lcom/tencent/mm/storage/emotion/a;
    //   221: invokestatic 1074	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   224: invokevirtual 1078	com/tencent/mm/storage/emotion/a:eR	(Landroid/content/Context;)Z
    //   227: pop
    //   228: ldc_w 1017
    //   231: ldc_w 1080
    //   234: invokestatic 383	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   237: ldc2_w 1013
    //   240: ldc_w 1015
    //   243: invokestatic 22	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   246: return
    //   247: ldc_w 1082
    //   250: aload_1
    //   251: invokevirtual 1024	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   254: ifeq +63 -> 317
    //   257: ldc_w 1017
    //   260: ldc_w 1084
    //   263: invokestatic 383	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   266: invokestatic 1090	com/tencent/mm/plugin/emoji/e/d:aqv	()Lcom/tencent/mm/plugin/emoji/e/d;
    //   269: astore_1
    //   270: invokestatic 554	com/tencent/mm/y/at:AR	()Lcom/tencent/mm/y/c;
    //   273: pop
    //   274: aload_1
    //   275: invokestatic 559	com/tencent/mm/y/c:zb	()Ljava/lang/String;
    //   278: invokevirtual 1093	com/tencent/mm/plugin/emoji/e/d:vO	(Ljava/lang/String;)V
    //   281: invokestatic 554	com/tencent/mm/y/at:AR	()Lcom/tencent/mm/y/c;
    //   284: pop
    //   285: invokestatic 1028	com/tencent/mm/y/c:xh	()Lcom/tencent/mm/storage/t;
    //   288: getstatic 1047	com/tencent/mm/storage/w$a:vqg	Lcom/tencent/mm/storage/w$a;
    //   291: iconst_1
    //   292: invokestatic 1039	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   295: invokevirtual 1044	com/tencent/mm/storage/t:a	(Lcom/tencent/mm/storage/w$a;Ljava/lang/Object;)V
    //   298: ldc_w 1017
    //   301: ldc_w 1095
    //   304: invokestatic 383	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   307: ldc2_w 1013
    //   310: ldc_w 1015
    //   313: invokestatic 22	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   316: return
    //   317: ldc_w 1097
    //   320: aload_1
    //   321: invokevirtual 1024	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   324: ifeq +224 -> 548
    //   327: ldc_w 1017
    //   330: ldc_w 1099
    //   333: invokestatic 383	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   336: invokestatic 52	com/tencent/mm/plugin/emoji/model/h:arl	()Lcom/tencent/mm/plugin/emoji/e/l;
    //   339: getfield 335	com/tencent/mm/plugin/emoji/e/l:kjz	Lcom/tencent/mm/storage/emotion/a;
    //   342: invokevirtual 1103	com/tencent/mm/storage/emotion/a:bUx	()Ljava/util/List;
    //   345: checkcast 786	java/util/ArrayList
    //   348: astore_1
    //   349: aload_1
    //   350: invokevirtual 789	java/util/ArrayList:size	()I
    //   353: ifle +56 -> 409
    //   356: aload_1
    //   357: invokevirtual 789	java/util/ArrayList:size	()I
    //   360: istore_3
    //   361: iconst_0
    //   362: istore_2
    //   363: iload_2
    //   364: iload_3
    //   365: if_icmpge +44 -> 409
    //   368: ldc_w 1017
    //   371: ldc_w 1105
    //   374: iconst_2
    //   375: anewarray 4	java/lang/Object
    //   378: dup
    //   379: iconst_0
    //   380: iload_2
    //   381: invokestatic 1110	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   384: aastore
    //   385: dup
    //   386: iconst_1
    //   387: aload_1
    //   388: iload_2
    //   389: invokevirtual 979	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   392: checkcast 569	com/tencent/mm/storage/emotion/EmojiGroupInfo
    //   395: invokevirtual 1111	com/tencent/mm/storage/emotion/EmojiGroupInfo:toString	()Ljava/lang/String;
    //   398: aastore
    //   399: invokestatic 400	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   402: iload_2
    //   403: iconst_1
    //   404: iadd
    //   405: istore_2
    //   406: goto -43 -> 363
    //   409: invokestatic 52	com/tencent/mm/plugin/emoji/model/h:arl	()Lcom/tencent/mm/plugin/emoji/e/l;
    //   412: getfield 58	com/tencent/mm/plugin/emoji/e/l:kjy	Lcom/tencent/mm/storage/emotion/d;
    //   415: invokevirtual 1115	com/tencent/mm/storage/emotion/d:Mx	()Landroid/database/Cursor;
    //   418: astore_1
    //   419: aload_1
    //   420: ifnull +61 -> 481
    //   423: aload_1
    //   424: invokeinterface 1118 1 0
    //   429: ifeq +52 -> 481
    //   432: new 110	com/tencent/mm/storage/emotion/EmojiInfo
    //   435: dup
    //   436: invokespecial 140	com/tencent/mm/storage/emotion/EmojiInfo:<init>	()V
    //   439: astore 5
    //   441: aload 5
    //   443: aload_1
    //   444: invokevirtual 610	com/tencent/mm/storage/emotion/EmojiInfo:b	(Landroid/database/Cursor;)V
    //   447: ldc_w 1017
    //   450: ldc_w 1120
    //   453: iconst_1
    //   454: anewarray 4	java/lang/Object
    //   457: dup
    //   458: iconst_0
    //   459: aload 5
    //   461: invokevirtual 1121	com/tencent/mm/storage/emotion/EmojiInfo:toString	()Ljava/lang/String;
    //   464: aastore
    //   465: invokestatic 400	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   468: aload_1
    //   469: invokeinterface 1124 1 0
    //   474: istore 4
    //   476: iload 4
    //   478: ifne -46 -> 432
    //   481: aload_1
    //   482: ifnull +9 -> 491
    //   485: aload_1
    //   486: invokeinterface 613 1 0
    //   491: ldc_w 1017
    //   494: ldc_w 1126
    //   497: invokestatic 383	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   500: ldc2_w 1013
    //   503: ldc_w 1015
    //   506: invokestatic 22	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   509: return
    //   510: astore_1
    //   511: aconst_null
    //   512: astore_1
    //   513: aload_1
    //   514: ifnull -23 -> 491
    //   517: aload_1
    //   518: invokeinterface 613 1 0
    //   523: goto -32 -> 491
    //   526: astore 6
    //   528: aload 5
    //   530: astore_1
    //   531: aload 6
    //   533: astore 5
    //   535: aload_1
    //   536: ifnull +9 -> 545
    //   539: aload_1
    //   540: invokeinterface 613 1 0
    //   545: aload 5
    //   547: athrow
    //   548: ldc_w 1128
    //   551: aload_1
    //   552: invokevirtual 1024	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   555: ifeq +83 -> 638
    //   558: invokestatic 554	com/tencent/mm/y/at:AR	()Lcom/tencent/mm/y/c;
    //   561: pop
    //   562: invokestatic 1028	com/tencent/mm/y/c:xh	()Lcom/tencent/mm/storage/t;
    //   565: getstatic 1131	com/tencent/mm/storage/w$a:vqq	Lcom/tencent/mm/storage/w$a;
    //   568: iconst_0
    //   569: invokestatic 1110	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   572: invokevirtual 1044	com/tencent/mm/storage/t:a	(Lcom/tencent/mm/storage/w$a;Ljava/lang/Object;)V
    //   575: invokestatic 554	com/tencent/mm/y/at:AR	()Lcom/tencent/mm/y/c;
    //   578: pop
    //   579: invokestatic 1028	com/tencent/mm/y/c:xh	()Lcom/tencent/mm/storage/t;
    //   582: getstatic 1134	com/tencent/mm/storage/w$a:vqr	Lcom/tencent/mm/storage/w$a;
    //   585: iconst_0
    //   586: invokestatic 1110	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   589: invokevirtual 1044	com/tencent/mm/storage/t:a	(Lcom/tencent/mm/storage/w$a;Ljava/lang/Object;)V
    //   592: invokestatic 554	com/tencent/mm/y/at:AR	()Lcom/tencent/mm/y/c;
    //   595: pop
    //   596: invokestatic 1028	com/tencent/mm/y/c:xh	()Lcom/tencent/mm/storage/t;
    //   599: getstatic 1137	com/tencent/mm/storage/w$a:vqt	Lcom/tencent/mm/storage/w$a;
    //   602: iconst_0
    //   603: invokestatic 1110	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   606: invokevirtual 1044	com/tencent/mm/storage/t:a	(Lcom/tencent/mm/storage/w$a;Ljava/lang/Object;)V
    //   609: new 1139	com/tencent/mm/pluginsdk/j/a/b/m
    //   612: dup
    //   613: bipush 37
    //   615: invokespecial 1142	com/tencent/mm/pluginsdk/j/a/b/m:<init>	(I)V
    //   618: astore_1
    //   619: invokestatic 188	com/tencent/mm/y/at:wS	()Lcom/tencent/mm/ad/n;
    //   622: aload_1
    //   623: iconst_0
    //   624: invokevirtual 193	com/tencent/mm/ad/n:a	(Lcom/tencent/mm/ad/k;I)Z
    //   627: pop
    //   628: ldc2_w 1013
    //   631: ldc_w 1015
    //   634: invokestatic 22	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   637: return
    //   638: ldc_w 1144
    //   641: aload_1
    //   642: invokevirtual 1024	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   645: ifeq +10 -> 655
    //   648: invokestatic 1150	com/tencent/mm/plugin/emoji/f/a:arq	()Lcom/tencent/mm/plugin/emoji/f/a;
    //   651: pop
    //   652: invokestatic 1153	com/tencent/mm/plugin/emoji/f/a:arr	()V
    //   655: ldc2_w 1013
    //   658: ldc_w 1015
    //   661: invokestatic 22	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   664: return
    //   665: astore 5
    //   667: goto -132 -> 535
    //   670: astore 5
    //   672: goto -159 -> 513
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	675	0	this	g
    //   0	675	1	paramString	String
    //   362	44	2	i	int
    //   360	6	3	j	int
    //   474	3	4	bool	boolean
    //   1	545	5	localObject1	Object
    //   665	1	5	localObject2	Object
    //   670	1	5	localException	Exception
    //   526	6	6	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   409	419	510	java/lang/Exception
    //   409	419	526	finally
    //   423	432	665	finally
    //   432	476	665	finally
    //   423	432	670	java/lang/Exception
    //   432	476	670	java/lang/Exception
  }
  
  public final int vZ(String paramString)
  {
    GMTrace.i(19273263087616L, 143597);
    int i = com.tencent.mm.plugin.emoji.model.h.arl().kjy.vZ(paramString);
    GMTrace.o(19273263087616L, 143597);
    return i;
  }
  
  public final ArrayList<EmojiInfo> wa(String paramString)
  {
    GMTrace.i(19273934176256L, 143602);
    l locall = com.tencent.mm.plugin.emoji.model.h.arl();
    if (l.kjO == null) {
      l.kjO = new HashMap();
    }
    if (l.kjL)
    {
      l.kjO.clear();
      l.kjL = false;
    }
    if (!l.kjO.containsKey(paramString))
    {
      at.AR();
      if (com.tencent.mm.y.c.isSDCardAvailable()) {
        l.kjO.put(paramString, (ArrayList)locall.kjy.vR(paramString));
      }
    }
    paramString = (ArrayList)l.kjO.get(paramString);
    GMTrace.o(19273934176256L, 143602);
    return paramString;
  }
  
  public final String zo()
  {
    GMTrace.i(19272323563520L, 143590);
    String str = com.tencent.mm.kernel.h.xy().fYU;
    GMTrace.o(19272323563520L, 143590);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\e\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */