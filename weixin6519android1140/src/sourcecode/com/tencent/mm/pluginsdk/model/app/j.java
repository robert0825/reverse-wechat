package com.tencent.mm.pluginsdk.model.app;

import android.graphics.Bitmap.CompressFormat;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.ad.d.b;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.g.a.aj;
import com.tencent.mm.g.a.aj.a;
import com.tencent.mm.g.a.bs;
import com.tencent.mm.g.a.me;
import com.tencent.mm.g.a.mh;
import com.tencent.mm.g.a.se;
import com.tencent.mm.g.a.sf;
import com.tencent.mm.g.a.ta;
import com.tencent.mm.g.a.tj;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;
import com.tencent.mm.x.f.a;
import com.tencent.mm.x.f.a.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.bc.b;
import com.tencent.mm.y.q;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class j
  implements com.tencent.mm.ad.d
{
  a tnV;
  
  public j()
  {
    GMTrace.i(789468676096L, 5882);
    this.tnV = null;
    GMTrace.o(789468676096L, 5882);
  }
  
  private d.b a(d.a parama, String paramString, f.a parama1)
  {
    GMTrace.i(790139764736L, 5887);
    localbu = parama.gtM;
    at.AR();
    localc = com.tencent.mm.y.c.yM();
    at.AR();
    localObject1 = com.tencent.mm.y.c.yS();
    Object localObject2 = q.zE();
    final Object localObject3 = com.tencent.mm.platformtools.n.a(localbu.tPW);
    String str1 = com.tencent.mm.platformtools.n.a(localbu.tPX);
    int i;
    label92:
    label341:
    final int j;
    label419:
    final boolean bool;
    if ((((com.tencent.mm.plugin.messenger.foundation.a.a.f)localObject1).has((String)localObject3)) || (((String)localObject2).equals(localObject3)))
    {
      i = 1;
      if (i == 0) {
        break label1473;
      }
      localObject1 = str1;
      localObject2 = localc.B((String)localObject1, localbu.tQd);
      w.d("MicroMsg.AppMessageExtension", "dkmsgid doInsertMessage svrid:%d localid:%d", new Object[] { Long.valueOf(localbu.tQd), Long.valueOf(((ce)localObject2).field_msgId) });
      if ((((ce)localObject2).field_msgId != 0L) && (((ce)localObject2).field_createTime + 604800000L < bc.k((String)localObject3, localbu.nFd)))
      {
        w.w("MicroMsg.AppMessageExtension", "dkmsgid doInsertMessage msg Too Old Remove it. svrid:%d localid:%d", new Object[] { Long.valueOf(localbu.tQd), Long.valueOf(((ce)localObject2).field_msgId) });
        bc.S(((ce)localObject2).field_msgId);
        ((au)localObject2).C(0L);
      }
      localObject1 = localObject2;
      if (((ce)localObject2).field_msgId == 0L)
      {
        localObject1 = new au();
        ((au)localObject1).D(localbu.tQd);
        ((au)localObject1).E(bc.k((String)localObject3, localbu.nFd));
      }
      if (parama1.gis != null)
      {
        ((au)localObject1).dj(parama1.gis.fwE);
        w.i("MicroMsg.AppMessageExtension", "[chatting_exp] expidstr:%s", new Object[] { ((ce)localObject1).fwE });
      }
      ((au)localObject1).setType(l.d(parama1));
      if ((!((au)localObject1).bTs()) && (!((au)localObject1).bTt())) {
        break label1480;
      }
      localObject2 = parama1.content;
      ((au)localObject1).setContent((String)localObject2);
      if (((au)localObject1).bTs()) {
        ((au)localObject1).dg(parama1.fwt);
      }
      if ((localbu.tPZ != 2) || (((ce)localObject1).field_msgId != 0L)) {
        break label1997;
      }
      switch (((ce)localObject1).field_type)
      {
      default: 
        j = 0;
        if (j == 0) {
          if (parama1.type == 2)
          {
            bool = true;
            label435:
            localObject2 = com.tencent.mm.platformtools.n.a(localbu.tQa);
            if (r.hkp)
            {
              w.w("MicroMsg.AppMessageExtension", "Test.useCdnDownThumb  set img buf null !!!!!!!");
              localObject2 = null;
            }
            if (bg.bq((byte[])localObject2)) {
              break label1515;
            }
            if ((parama1.type != 33) && (parama1.type != 36)) {
              break label1498;
            }
            localObject2 = com.tencent.mm.ao.n.IZ().a((byte[])localObject2, Bitmap.CompressFormat.PNG);
            label500:
            if (bg.nm((String)localObject2)) {
              w.w("MicroMsg.AppMessageExtension", "thumbData MsgInfo content:%s", new Object[] { ((ce)localObject1).field_content });
            }
            if (!bg.nm((String)localObject2))
            {
              ((au)localObject1).dc((String)localObject2);
              w.d("MicroMsg.AppMessageExtension", "new thumbnail saved, path" + (String)localObject2);
            }
            label566:
            if (i == 0) {
              break label2156;
            }
            ((au)localObject1).dC(1);
            ((au)localObject1).db(str1);
            i = localbu.jhA;
            label591:
            ((au)localObject1).dB(i);
            if ((parama1.type == 2001) && (parama1.showType == 1))
            {
              if ((TextUtils.isEmpty(parama1.gke)) || (TextUtils.isEmpty(parama1.gkf)) || (parama1.gkg <= 0)) {
                break label2194;
              }
              w.i("MicroMsg.AppMessageExtension", "ljd:this is new year msg! send predownload image event!");
              localObject2 = new aj();
              ((aj)localObject2).eBw = new aj.a();
              ((aj)localObject2).eBw.eBy = parama1.gkf;
              ((aj)localObject2).eBw.eBx = parama1.gke;
              ((aj)localObject2).eBw.eBz = parama1.gkg;
              com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
            }
            label717:
            if (parama1.type != 2001) {
              break;
            }
          }
        }
        break;
      }
    }
    for (;;)
    {
      try
      {
        if (bg.cc(parama1.gkq)) {
          continue;
        }
        localObject2 = parama1.gkq.iterator();
        if (((Iterator)localObject2).hasNext())
        {
          localObject3 = ((String)((Iterator)localObject2).next()).split(",");
          if ((localObject3 == null) || (localObject3.length <= 0)) {
            continue;
          }
          localObject3 = localObject3[0];
          if ((bg.nm((String)localObject3)) || (!((String)localObject3).equals(q.zE()))) {
            continue;
          }
          ((au)localObject1).dL(((ce)localObject1).field_flag | 0x8);
          w.i("MicroMsg.AppMessageExtension", "check c2c payer list, myself is payer, add red flag");
          l(true, ((ce)localObject1).field_talker);
        }
      }
      catch (Exception localException)
      {
        final long l1;
        final long l2;
        label1473:
        label1480:
        label1498:
        label1515:
        final String str2;
        int m;
        final Object localObject4;
        Object localObject5;
        int k;
        c.a locala;
        label1997:
        label2156:
        label2194:
        w.e("MicroMsg.AppMessageExtension", "check c2c payer list error: %s", new Object[] { localException.getMessage() });
        continue;
        localc.b(localbu.tQd, (au)localObject1);
        parama = new d.b((au)localObject1, false);
        continue;
      }
      ((au)localObject1).dh(localbu.tQb);
      localObject2 = bc.gT(localbu.tQb);
      if (localObject2 != null)
      {
        ((au)localObject1).di(((bc.b)localObject2).gnT);
        ((au)localObject1).df(((bc.b)localObject2).gnS);
      }
      bc.a((au)localObject1, parama);
      if (((ce)localObject1).field_msgId != 0L) {
        continue;
      }
      ((au)localObject1).C(bc.i((au)localObject1));
      parama = new com.tencent.mm.g.a.s();
      parama.eAG.eAH = ((au)localObject1);
      parama.eAG.eAI = parama1;
      com.tencent.mm.sdk.b.a.vgX.m(parama);
      parama = new d.b((au)localObject1, true);
      if ((((ce)localObject1).field_type == 301989937) && (com.tencent.mm.y.s.gg(((ce)localObject1).field_talker))) {
        ((au)localObject1).C(0L);
      }
      if ((((au)localObject1).bTA()) && ("notifymessage".equals(((ce)localObject1).field_talker)))
      {
        localObject2 = bh.q(((ce)localObject1).field_content, "msg");
        if (localObject2 != null)
        {
          localObject2 = bg.nl((String)((Map)localObject2).get(".msg.fromusername"));
          if (x.eU((String)localObject2))
          {
            ((com.tencent.mm.plugin.appbrand.k.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.b.class)).po((String)localObject2);
            w.d("MicroMsg.AppMessageExtension", "trigger to get app brand WxaInfo(%s)", new Object[] { localObject2 });
          }
        }
      }
      if ((!bg.nm(parama1.gkj)) && (((ce)localObject1).field_type == 436207665))
      {
        localObject2 = new me();
        ((me)localObject2).eRc.eRd = ((ce)localObject1).field_msgId;
        ((me)localObject2).eRc.eQH = paramString;
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
      }
      if ((parama1.type == 2000) && (!bg.nm(parama1.gjA)))
      {
        paramString = new mh();
        paramString.eRh.eRi = parama1.gjA;
        paramString.eRh.eDr = ((ce)localObject1).field_msgId;
        paramString.eRh.eRj = parama1;
        com.tencent.mm.sdk.b.a.vgX.m(paramString);
        l(false, ((ce)localObject1).field_talker);
      }
      parama1 = parama1.gle;
      paramString = bg.aq((String)parama1.get(".msg.appmsg.ext_pay_info.pay_type"), "");
      if (((paramString.equals("wx_f2f")) || (paramString.equals("wx_md"))) && (parama.gtQ))
      {
        l1 = ((ce)localObject1).field_createTime;
        l2 = System.currentTimeMillis();
        w.i("MicroMsg.AppMessageExtension", "pay voice msg: %s, create: %s, current: %s", new Object[] { paramString, Long.valueOf(l1), Long.valueOf(l2) });
        localObject1 = new bs();
        i = bg.getInt((String)parama1.get(".msg.appmsg.ext_pay_info.pay_fee"), 0);
        localObject2 = bg.nl((String)parama1.get(".msg.appmsg.ext_pay_info.pay_feetype"));
        parama1 = bg.nl((String)parama1.get(".msg.appmsg.ext_pay_info.pay_outtradeno"));
        if ((i > 0) && (!bg.nm((String)localObject2)) && (!bg.nm(parama1)))
        {
          ((bs)localObject1).eCS.eCT = i;
          ((bs)localObject1).eCS.eCU = ((String)localObject2);
          ((bs)localObject1).eCS.eCV = parama1;
          ((bs)localObject1).eCS.eCW = paramString;
          ((bs)localObject1).eCS.eCX = (l2 - l1);
          com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
        }
      }
      GMTrace.o(790139764736L, 5887);
      return parama;
      i = 0;
      break;
      localObject1 = localObject3;
      break label92;
      localObject2 = paramString;
      break label341;
      j = 1;
      break label419;
      bool = false;
      break label435;
      localObject2 = a((byte[])localObject2, bool, ((au)localObject1).bTJ());
      break label500;
      if ((!bg.nm(parama1.giD)) && (!bg.nm(parama1.giK)))
      {
        l1 = ((ce)localObject1).field_msgSvrId;
        localObject2 = parama1.giK;
        str2 = parama1.giD;
        m = parama1.giE;
        w.i("MicroMsg.AppMessageExtension", "getThumbByCdn msgsvrid:%d aes:%s thumblen:%d url:%s talker:%s bigThumb:%b", new Object[] { Long.valueOf(((ce)localObject1).field_msgSvrId), localObject2, Integer.valueOf(m), str2, localObject3, Boolean.valueOf(bool) });
        l2 = bg.Pv();
        if (parama1 != null)
        {
          j = parama1.type;
          localObject4 = com.tencent.mm.ao.n.IZ().l(bg.Pv(), "", "");
          localObject5 = new com.tencent.mm.modelcdntran.i();
          ((com.tencent.mm.modelcdntran.i)localObject5).field_mediaId = com.tencent.mm.modelcdntran.d.a("downappthumb", ((ce)localObject1).field_createTime, (String)localObject3, String.valueOf(l1));
          ((com.tencent.mm.modelcdntran.i)localObject5).field_fullpath = ((String)localObject4);
          ((com.tencent.mm.modelcdntran.i)localObject5).field_fileType = com.tencent.mm.modelcdntran.b.MediaType_THUMBIMAGE;
          ((com.tencent.mm.modelcdntran.i)localObject5).field_totalLen = m;
          ((com.tencent.mm.modelcdntran.i)localObject5).field_aesKey = ((String)localObject2);
          ((com.tencent.mm.modelcdntran.i)localObject5).field_fileId = str2;
          ((com.tencent.mm.modelcdntran.i)localObject5).field_priority = com.tencent.mm.modelcdntran.b.gze;
          if (!com.tencent.mm.y.s.eb((String)localObject3)) {
            continue;
          }
          k = 1;
          ((com.tencent.mm.modelcdntran.i)localObject5).field_chattype = k;
          w.d("MicroMsg.AppMessageExtension", "get thumb by cdn [appmsg 1] chatType[%d] talker[%s] ", new Object[] { Integer.valueOf(((com.tencent.mm.modelcdntran.i)localObject5).field_chattype), localObject3 });
          ((com.tencent.mm.modelcdntran.i)localObject5).gAB = new i.a()
          {
            public final int a(String paramAnonymousString, int paramAnonymousInt, keep_ProgressInfo paramAnonymouskeep_ProgressInfo, keep_SceneResult paramAnonymouskeep_SceneResult, boolean paramAnonymousBoolean)
            {
              GMTrace.i(816178003968L, 6081);
              if (paramAnonymousInt != 0)
              {
                w.e("MicroMsg.AppMessageExtension", "getThumbByCdn start failed: msgid:%d startRet:%d thumbUrl:%s", new Object[] { Long.valueOf(localObject1.field_msgSvrId), Integer.valueOf(paramAnonymousInt), str2 });
                com.tencent.mm.plugin.report.service.g.ork.i(10421, new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(2), Long.valueOf(l2), Long.valueOf(bg.Pv()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bc(com.tencent.mm.sdk.platformtools.ab.getContext())), Integer.valueOf(com.tencent.mm.modelcdntran.b.MediaType_THUMBIMAGE), Integer.valueOf(localObject4), "" });
                GMTrace.o(816178003968L, 6081);
                return paramAnonymousInt;
              }
              if (paramAnonymouskeep_SceneResult == null)
              {
                GMTrace.o(816178003968L, 6081);
                return 0;
              }
              com.tencent.mm.plugin.report.service.g localg;
              label225:
              long l1;
              long l2;
              int i;
              int j;
              int k;
              if (paramAnonymouskeep_SceneResult.field_retCode != 0)
              {
                w.e("MicroMsg.AppMessageExtension", "getThumbByCdn failed: msgid:%d sceneResult.field_retCode:%d thumbUrl:%s", new Object[] { Long.valueOf(localObject1.field_msgSvrId), Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode), str2 });
                localg = com.tencent.mm.plugin.report.service.g.ork;
                if (paramAnonymouskeep_SceneResult != null) {
                  break label807;
                }
                paramAnonymousInt = -1;
                l1 = l2;
                l2 = bg.Pv();
                i = com.tencent.mm.modelcdntran.d.bc(com.tencent.mm.sdk.platformtools.ab.getContext());
                j = com.tencent.mm.modelcdntran.b.MediaType_THUMBIMAGE;
                k = localObject4;
                if (paramAnonymouskeep_SceneResult != null) {
                  break label816;
                }
                paramAnonymousString = "";
                label263:
                if (paramAnonymouskeep_SceneResult != null) {
                  break label825;
                }
                paramAnonymouskeep_ProgressInfo = "";
                label271:
                localg.i(10421, new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(2), Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), paramAnonymousString, "", "", "", "", "", "", "", paramAnonymouskeep_ProgressInfo });
                if ((paramAnonymouskeep_SceneResult != null) && (paramAnonymouskeep_SceneResult.field_retCode != 0))
                {
                  localg = com.tencent.mm.plugin.report.service.g.ork;
                  if (paramAnonymouskeep_SceneResult != null) {
                    break label834;
                  }
                  paramAnonymousInt = -1;
                  label416:
                  l1 = l2;
                  l2 = bg.Pv();
                  i = com.tencent.mm.modelcdntran.d.bc(com.tencent.mm.sdk.platformtools.ab.getContext());
                  j = com.tencent.mm.modelcdntran.b.MediaType_THUMBIMAGE;
                  k = localObject4;
                  if (paramAnonymouskeep_SceneResult != null) {
                    break label843;
                  }
                  paramAnonymousString = "";
                  label454:
                  if (paramAnonymouskeep_SceneResult != null) {
                    break label852;
                  }
                }
              }
              label638:
              label799:
              label807:
              label816:
              label825:
              label834:
              label843:
              label852:
              for (paramAnonymouskeep_ProgressInfo = "";; paramAnonymouskeep_ProgressInfo = paramAnonymouskeep_SceneResult.report_Part2)
              {
                localg.i(13937, new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(2), Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), paramAnonymousString, "", "", "", "", "", "", "", paramAnonymouskeep_ProgressInfo });
                com.tencent.mm.ao.n.IZ().doNotify();
                GMTrace.o(816178003968L, 6081);
                return 0;
                paramAnonymousString = e.c(j, 0, -1);
                if ((bool == 33) || (bool == 36))
                {
                  paramAnonymousString = com.tencent.mm.ao.n.IZ().a(paramAnonymousString, Bitmap.CompressFormat.PNG);
                  if (!bg.nm(paramAnonymousString))
                  {
                    localObject1.dc(paramAnonymousString);
                    at.AR();
                    com.tencent.mm.y.c.yM().b(localObject1.field_msgSvrId, localObject1);
                  }
                  w.i("MicroMsg.AppMessageExtension", "getThumbByCdn finished msgid:%d talker:%s thumbUrl:%s path:%s", new Object[] { Long.valueOf(localObject3), this.fTa, str2, paramAnonymousString });
                  com.tencent.mm.plugin.report.service.g.ork.a(198L, 16L, localObject4, false);
                  com.tencent.mm.plugin.report.service.g.ork.a(198L, 17L, 1L, false);
                  paramAnonymousString = com.tencent.mm.plugin.report.service.g.ork;
                  if (!com.tencent.mm.y.s.eb(this.fTa)) {
                    break label799;
                  }
                }
                for (l1 = 19L;; l1 = 18L)
                {
                  paramAnonymousString.a(198L, l1, 1L, false);
                  break;
                  paramAnonymousString = j.a(paramAnonymousString, l1, localObject1.bTJ());
                  break label638;
                }
                paramAnonymousInt = paramAnonymouskeep_SceneResult.field_retCode;
                break label225;
                paramAnonymousString = paramAnonymouskeep_SceneResult.field_transInfo;
                break label263;
                paramAnonymouskeep_ProgressInfo = paramAnonymouskeep_SceneResult.report_Part2;
                break label271;
                paramAnonymousInt = paramAnonymouskeep_SceneResult.field_retCode;
                break label416;
                paramAnonymousString = paramAnonymouskeep_SceneResult.field_transInfo;
                break label454;
              }
            }
            
            public final void a(String paramAnonymousString, ByteArrayOutputStream paramAnonymousByteArrayOutputStream)
            {
              GMTrace.i(816312221696L, 6082);
              GMTrace.o(816312221696L, 6082);
            }
            
            public final byte[] h(String paramAnonymousString, byte[] paramAnonymousArrayOfByte)
            {
              GMTrace.i(816446439424L, 6083);
              GMTrace.o(816446439424L, 6083);
              return null;
            }
          };
          com.tencent.mm.modelcdntran.g.Gk().b((com.tencent.mm.modelcdntran.i)localObject5, -1);
          break label566;
        }
        j = 0;
        continue;
        k = 0;
        continue;
      }
      if (bg.nm(parama1.thumburl)) {
        break label566;
      }
      w.d("MicroMsg.AppMessageExtension", "get cdn image " + parama1.thumburl);
      str2 = com.tencent.mm.a.g.n(bg.Pv().getBytes());
      localObject2 = com.tencent.mm.ao.n.IZ().getFullPath(str2);
      com.tencent.mm.ao.n.IZ();
      str2 = com.tencent.mm.ao.f.kd(str2);
      localObject4 = com.tencent.mm.ao.n.Jd();
      localObject5 = parama1.thumburl;
      locala = new c.a();
      locala.gKE = ((String)localObject2);
      locala.gKC = true;
      ((com.tencent.mm.ao.a.a)localObject4).a((String)localObject5, null, locala.Jn());
      ((au)localObject1).dc(str2);
      w.d("MicroMsg.AppMessageExtension", "new thumbnail saved, path " + (String)localObject2);
      break label566;
      if (bg.nm(parama1.thumburl)) {
        break label566;
      }
      w.d("MicroMsg.AppMessageExtension", "get cdn image " + parama1.thumburl);
      str2 = com.tencent.mm.a.g.n(bg.Pv().getBytes());
      localObject2 = com.tencent.mm.ao.n.IZ().getFullPath(str2);
      com.tencent.mm.ao.n.IZ();
      str2 = com.tencent.mm.ao.f.kd(str2);
      localObject4 = com.tencent.mm.ao.n.Jd();
      localObject5 = parama1.thumburl;
      locala = new c.a();
      locala.gKE = ((String)localObject2);
      locala.gKC = true;
      ((com.tencent.mm.ao.a.a)localObject4).a((String)localObject5, null, locala.Jn());
      ((au)localObject1).dc(str2);
      w.d("MicroMsg.AppMessageExtension", "new thumbnail saved, path " + (String)localObject2);
      break label566;
      ((au)localObject1).dC(0);
      ((au)localObject1).db((String)localObject3);
      if (localbu.jhA > 3)
      {
        i = localbu.jhA;
        break label591;
      }
      i = 3;
      break label591;
      w.e("MicroMsg.AppMessageExtension", "ljd:this is new year msg! don't send predownload image event, because image preload data is illegal!");
      break label717;
      if (!"1001".equals(parama1.gka))
      {
        localObject2 = new ta();
        ((ta)localObject2).eYu.eQH = paramString;
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
        l(false, ((ce)localObject1).field_talker);
      }
    }
  }
  
  public static String a(byte[] paramArrayOfByte, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(790005547008L, 5886);
    paramArrayOfByte = com.tencent.mm.ao.n.IZ().a(9, paramArrayOfByte, paramBoolean1, Bitmap.CompressFormat.PNG, paramBoolean2);
    GMTrace.o(790005547008L, 5886);
    return paramArrayOfByte;
  }
  
  public static String c(bu parambu)
  {
    GMTrace.i(789602893824L, 5883);
    String str1 = com.tencent.mm.platformtools.n.a(parambu.tPW);
    String str2 = com.tencent.mm.platformtools.n.a(parambu.tPX);
    if ((bg.nm(str1)) || (bg.nm(str2)))
    {
      w.e("MicroMsg.AppMessageExtension", "empty fromuser or touser");
      GMTrace.o(789602893824L, 5883);
      return null;
    }
    parambu = eF(str1, com.tencent.mm.platformtools.n.a(parambu.tPY));
    GMTrace.o(789602893824L, 5883);
    return parambu;
  }
  
  public static String eF(String paramString1, String paramString2)
  {
    GMTrace.i(789737111552L, 5884);
    if (bg.nm(paramString2))
    {
      GMTrace.o(789737111552L, 5884);
      return null;
    }
    String str = paramString2;
    if (com.tencent.mm.y.s.eb(paramString1))
    {
      int i = bc.gO(paramString2);
      str = paramString2;
      if (i != -1) {
        str = (paramString2 + " ").substring(i + 2).trim();
      }
    }
    paramString1 = bg.Sx(str);
    GMTrace.o(789737111552L, 5884);
    return paramString1;
  }
  
  private static void l(boolean paramBoolean, String paramString)
  {
    GMTrace.i(20407000236032L, 152044);
    ae localae;
    if (!bg.nm(paramString))
    {
      w.i("MicroMsg.AppMessageExtension", "updateC2CAAMsgMark, mark: %s, talker: %s", new Object[] { Boolean.valueOf(paramBoolean), paramString });
      at.AR();
      localae = com.tencent.mm.y.c.yP().TO(paramString);
      if (localae != null)
      {
        if (!paramBoolean) {
          break label93;
        }
        localae.eG(16777216);
      }
    }
    for (;;)
    {
      at.AR();
      com.tencent.mm.y.c.yP().a(localae, paramString);
      GMTrace.o(20407000236032L, 152044);
      return;
      label93:
      localae.vo();
    }
  }
  
  public final boolean a(final a parama, String paramString1, long paramLong, String paramString2, final String paramString3, int paramInt, String paramString4)
  {
    GMTrace.i(790408200192L, 5889);
    String str = com.tencent.mm.ao.n.IZ().l("Note_" + paramString1, "", "");
    if (FileOp.aZ(str))
    {
      GMTrace.o(790408200192L, 5889);
      return false;
    }
    this.tnV = parama;
    com.tencent.mm.modelcdntran.i locali = new com.tencent.mm.modelcdntran.i();
    locali.field_mediaId = com.tencent.mm.modelcdntran.d.a("downappthumb", paramLong, paramString4, paramString1);
    locali.field_fullpath = str;
    locali.field_fileType = com.tencent.mm.modelcdntran.b.MediaType_FULLSIZEIMAGE;
    locali.field_totalLen = paramInt;
    locali.field_aesKey = paramString2;
    locali.field_fileId = paramString3;
    locali.field_priority = com.tencent.mm.modelcdntran.b.gze;
    if (com.tencent.mm.y.s.eb(paramString4)) {}
    for (paramInt = 1;; paramInt = 0)
    {
      locali.field_chattype = paramInt;
      w.d("MicroMsg.AppMessageExtension", "get thumb by cdn [appmsg 2] chatType[%d] user[%s] ", new Object[] { Integer.valueOf(locali.field_chattype), paramString4 });
      locali.gAB = new i.a()
      {
        public final int a(String paramAnonymousString, int paramAnonymousInt, keep_ProgressInfo paramAnonymouskeep_ProgressInfo, keep_SceneResult paramAnonymouskeep_SceneResult, boolean paramAnonymousBoolean)
        {
          GMTrace.i(821278277632L, 6119);
          w.i("MicroMsg.AppMessageExtension", "getThumbByCdn start callback: field_mediaId:%s thumbUrl:%s", new Object[] { paramAnonymousString, paramString3 });
          if (paramAnonymousInt != 0)
          {
            w.e("MicroMsg.AppMessageExtension", "getThumbByCdn start failed: startRet:%d thumbUrl:%s", new Object[] { Integer.valueOf(paramAnonymousInt), paramString3 });
            GMTrace.o(821278277632L, 6119);
            return paramAnonymousInt;
          }
          if (paramAnonymouskeep_SceneResult == null)
          {
            GMTrace.o(821278277632L, 6119);
            return 0;
          }
          if (paramAnonymouskeep_SceneResult.field_retCode != 0) {
            w.e("MicroMsg.AppMessageExtension", "getThumbByCdn failed: sceneResult.field_retCode:%d thumbUrl:%s", new Object[] { Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode), paramString3 });
          }
          for (;;)
          {
            com.tencent.mm.ao.n.IZ().doNotify();
            if (parama != null) {
              parama.bJB();
            }
            GMTrace.o(821278277632L, 6119);
            return 0;
            w.i("MicroMsg.AppMessageExtension", "getThumbByCdn finished thumbUrl:%s", new Object[] { paramString3 });
          }
        }
        
        public final void a(String paramAnonymousString, ByteArrayOutputStream paramAnonymousByteArrayOutputStream)
        {
          GMTrace.i(821412495360L, 6120);
          GMTrace.o(821412495360L, 6120);
        }
        
        public final byte[] h(String paramAnonymousString, byte[] paramAnonymousArrayOfByte)
        {
          GMTrace.i(821546713088L, 6121);
          GMTrace.o(821546713088L, 6121);
          return null;
        }
      };
      com.tencent.mm.modelcdntran.g.Gk().b(locali, -1);
      GMTrace.o(790408200192L, 5889);
      return true;
    }
  }
  
  public final d.b b(d.a parama)
  {
    GMTrace.i(789871329280L, 5885);
    w.d("MicroMsg.AppMessageExtension", "process add app message");
    Object localObject3 = parama.gtM;
    Object localObject2 = c((bu)localObject3);
    f.a locala = f.a.eS((String)localObject2);
    if (locala == null)
    {
      w.e("MicroMsg.AppMessageExtension", "parse app message failed, insert failed");
      GMTrace.o(789871329280L, 5885);
      return null;
    }
    if (locala.gkh)
    {
      at.AR();
      com.tencent.mm.y.c.xh().set(352273, localObject2);
      at.AR();
      com.tencent.mm.y.c.xh().set(352274, Long.valueOf(System.currentTimeMillis()));
      new a((String)localObject2).bJr();
      GMTrace.o(789871329280L, 5885);
      return null;
    }
    f localf = an.aWy().Ox(locala.appId);
    String str = locala.appId;
    int i = locala.eVc;
    if (localf == null) {}
    for (Object localObject1 = "null";; localObject1 = Integer.valueOf(localf.field_appVersion))
    {
      w.i("MicroMsg.AppMessageExtension", "check version appid:%s, msgVer:%d, appVer:%s", new Object[] { str, Integer.valueOf(i), localObject1 });
      if ((localf == null) || (localf.field_appVersion < locala.eVc)) {
        an.aWx().Ov(locala.appId);
      }
      parama = a(parama, com.tencent.mm.platformtools.n.a(((bu)localObject3).tPY), locala);
      if (parama.eAH != null) {
        break;
      }
      GMTrace.o(789871329280L, 5885);
      return null;
    }
    localObject1 = parama.eAH;
    if ((((au)localObject1).bTs()) || (((au)localObject1).bTt()))
    {
      if (!bg.nm(locala.glb))
      {
        localObject1 = new tj();
        ((tj)localObject1).eYX.ePi = locala.glb;
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
      }
      GMTrace.o(789871329280L, 5885);
      return parama;
    }
    if (((ce)localObject1).field_type == 301989937)
    {
      GMTrace.o(789871329280L, 5885);
      return parama;
    }
    if (((ce)localObject1).field_type == -1879048190)
    {
      localObject3 = new sf();
      ((sf)localObject3).eWX.ePi = ((String)localObject2);
      ((sf)localObject3).eWX.description = locala.description;
      ((sf)localObject3).eWX.eAH = ((au)localObject1);
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject3);
    }
    if ((((ce)localObject1).field_type == 49) && (!bg.nm(locala.canvasPageXml)))
    {
      localObject3 = new com.tencent.mm.g.a.g();
      ((com.tencent.mm.g.a.g)localObject3).ezZ.eAa = locala.canvasPageXml;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject3);
    }
    localObject3 = new com.tencent.mm.x.f();
    locala.a((com.tencent.mm.x.f)localObject3);
    ((com.tencent.mm.x.f)localObject3).field_msgId = ((ce)localObject1).field_msgId;
    if (an.bJI().b((com.tencent.mm.sdk.e.c)localObject3))
    {
      if (locala.type == 40)
      {
        localObject3 = an.afP().eq(((ce)localObject1).field_msgId);
        localObject2 = com.tencent.mm.x.j.eW((String)localObject2);
        if (localObject3 == null) {
          l.a(null, ((ce)localObject1).field_msgId, 0, null, null, ((com.tencent.mm.x.j)localObject2).glt, locala.type, 0);
        }
        localObject1 = new ab(((ce)localObject1).field_msgId, ((ce)localObject1).field_msgSvrId, null);
        at.wS().a((com.tencent.mm.ad.k)localObject1, 0);
      }
      GMTrace.o(789871329280L, 5885);
      return parama;
    }
    GMTrace.o(789871329280L, 5885);
    return null;
  }
  
  public final void h(au paramau)
  {
    GMTrace.i(790273982464L, 5888);
    w.d("MicroMsg.AppMessageExtension", "onPreDelMessage " + paramau.field_imgPath);
    se localse = new se();
    localse.eWW.path = paramau.field_imgPath;
    com.tencent.mm.sdk.b.a.vgX.m(localse);
    GMTrace.o(790273982464L, 5888);
  }
  
  public static abstract interface a
  {
    public abstract void bJB();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\app\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */