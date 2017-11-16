package com.tencent.mm.modelvideo;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.ad.d.b;
import com.tencent.mm.g.b.af;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.bhr;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.m;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;

public final class u
  implements com.tencent.mm.ad.d
{
  public u()
  {
    GMTrace.i(331517788160L, 2470);
    GMTrace.o(331517788160L, 2470);
  }
  
  public final d.b b(d.a arg1)
  {
    GMTrace.i(331652005888L, 2471);
    Object localObject5 = ???.gtM;
    if (localObject5 == null)
    {
      w.e("MicroMsg.VideoMsgExtension", "onPreAddMessage cmdAM is null , give up.");
      GMTrace.o(331652005888L, 2471);
      return null;
    }
    final String str1 = (String)com.tencent.mm.kernel.h.xy().xh().get(2, "");
    Object localObject1 = n.a(((bu)localObject5).tPX);
    Object localObject3 = n.a(((bu)localObject5).tPW);
    boolean bool1;
    if ((((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yS().has((String)localObject3)) || (str1.equals(localObject3)))
    {
      bool1 = true;
      w.d("MicroMsg.VideoMsgExtension", "video msg fromuser %s, toUser %s, userName %s, isSender %b", new Object[] { localObject3, localObject1, str1, Boolean.valueOf(bool1) });
      localObject6 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf();
      if (!str1.equals(localObject3)) {
        break label380;
      }
    }
    label380:
    for (Object localObject4 = localObject1;; localObject4 = localObject3)
    {
      localObject4 = ((com.tencent.mm.plugin.messenger.foundation.a.a.c)localObject6).B((String)localObject4, ((bu)localObject5).tQd);
      w.i("MicroMsg.VideoMsgExtension", "dkmsgid prepareMsgInfo svrid:%d localid:%d, flag:%d, msgseq:%d, addMsgInfo[%s]", new Object[] { Long.valueOf(((bu)localObject5).tQd), Long.valueOf(((ce)localObject4).field_msgId), Integer.valueOf(((ce)localObject4).field_flag), Long.valueOf(((ce)localObject4).field_msgSeq), ??? });
      if ((((ce)localObject4).field_msgId != 0L) && (((ce)localObject4).field_createTime + 604800000L < bc.k((String)localObject3, ((bu)localObject5).nFd)))
      {
        w.w("MicroMsg.VideoMsgExtension", "dkmsgid prepareMsgInfo msg Too Old Remove it. svrid:%d localid:%d", new Object[] { Long.valueOf(((bu)localObject5).tQd), Long.valueOf(((ce)localObject4).field_msgId) });
        bc.S(((ce)localObject4).field_msgId);
        ((au)localObject4).C(0L);
      }
      if (((ce)localObject4).field_msgId == 0L) {
        break label387;
      }
      w.d("MicroMsg.VideoMsgExtension", "Msgid:%d duplicate give up ", new Object[] { Long.valueOf(((bu)localObject5).tQd) });
      GMTrace.o(331652005888L, 2471);
      return null;
      bool1 = false;
      break;
    }
    label387:
    final Object localObject6 = n.a(((bu)localObject5).tPY);
    localObject4 = new r();
    if (bool1) {
      localObject3 = localObject1;
    }
    ((r)localObject4).eQu = ((String)localObject3);
    ((r)localObject4).hcs = ((bu)localObject5).nFd;
    ((r)localObject4).eSf = ((bu)localObject5).tQd;
    ((r)localObject4).hcB = ((bu)localObject5).tPY.uNR;
    w.i("MicroMsg.VideoMsgExtension", "parseVideoMsgXml [%s] msg Source[%s]", new Object[] { localObject6, ((bu)localObject5).tQb });
    Object localObject7 = bh.q((String)localObject6, "msg");
    if (localObject7 == null)
    {
      com.tencent.mm.plugin.report.service.g.ork.a(111L, 216L, 1L, false);
      GMTrace.o(331652005888L, 2471);
      return null;
    }
    localObject3 = new au();
    ((au)localObject3).dh(((bu)localObject5).tQb);
    ((au)localObject3).di(bc.gU(((bu)localObject5).tQb));
    final int j;
    int i;
    for (;;)
    {
      try
      {
        ((r)localObject4).gsL = bg.getInt((String)((Map)localObject7).get(".msg.videomsg.$length"), 0);
        ((r)localObject4).hcv = bg.getInt((String)((Map)localObject7).get(".msg.videomsg.$playlength"), 0);
        w.i("MicroMsg.VideoMsgExtension", "video msg total len %d, video len %d", new Object[] { Integer.valueOf(((r)localObject4).gsL), Integer.valueOf(((r)localObject4).hcv) });
        ((r)localObject4).hcn = ((String)((Map)localObject7).get(".msg.videomsg.$fromusername"));
        if (str1.equals(((r)localObject4).Nr())) {
          ((r)localObject4).hcn = ((String)localObject1);
        }
        ((r)localObject4).eTv = ((String)((Map)localObject7).get(".msg.statextstr"));
        localObject1 = (String)((Map)localObject7).get(".msg.videomsg.$cdnthumbaeskey");
        str1 = (String)((Map)localObject7).get(".msg.videomsg.$cdnthumburl");
        j = bg.getInt((String)((Map)localObject7).get(".msg.videomsg.$cdnthumblength"), 0);
        int k = bg.getInt((String)((Map)localObject7).get(".msg.videomsg.$type"), 0);
        w.d("MicroMsg.VideoMsgExtension", "video msg exportType :" + k);
        if (k == 44)
        {
          i = 1;
          ((r)localObject4).hcz = i;
          if (62 == ((bu)localObject5).lQc)
          {
            ((r)localObject4).hcC = 3;
            String str2 = bg.aq((String)((Map)localObject7).get(".msg.streamvideo.streamvideourl"), "");
            i = bg.getInt((String)((Map)localObject7).get(".msg.streamvideo.streamvideototaltime"), 0);
            String str3 = bg.aq((String)((Map)localObject7).get(".msg.streamvideo.streamvideotitle"), "");
            String str4 = bg.aq((String)((Map)localObject7).get(".msg.streamvideo.streamvideowording"), "");
            String str5 = bg.aq((String)((Map)localObject7).get(".msg.streamvideo.streamvideoweburl"), "");
            String str6 = bg.aq((String)((Map)localObject7).get(".msg.streamvideo.streamvideoaduxinfo"), "");
            String str7 = bg.aq((String)((Map)localObject7).get(".msg.streamvideo.streamvideopublishid"), "");
            if (((r)localObject4).hcE == null) {
              ((r)localObject4).hcE = new bhr();
            }
            ((r)localObject4).hcE.gkK = str3;
            ((r)localObject4).hcE.ulk = i;
            ((r)localObject4).hcE.gkI = str2;
            ((r)localObject4).hcE.gkL = str4;
            ((r)localObject4).hcE.gkM = str5;
            ((r)localObject4).hcE.gkO = str6;
            ((r)localObject4).hcE.gkP = str7;
            boolean bool2 = ((r)localObject4).Nr().equals((String)com.tencent.mm.kernel.h.xy().xh().get(2, ""));
            if (!bool2) {
              break;
            }
            GMTrace.o(331652005888L, 2471);
            return null;
          }
        }
        else
        {
          i = 0;
          continue;
        }
        if (k > 0) {
          ((r)localObject4).hcC = 2;
        } else {
          ((r)localObject4).hcC = 1;
        }
      }
      catch (Exception ???)
      {
        com.tencent.mm.plugin.report.service.g.ork.a(111L, 216L, 1L, false);
        w.e("MicroMsg.VideoMsgExtension", "parsing voice msg xml failed");
        w.e("MicroMsg.VideoMsgExtension", "exception:%s", new Object[] { bg.f(???) });
        GMTrace.o(331652005888L, 2471);
        return null;
      }
    }
    localObject7 = (String)((Map)localObject7).get(".msg.commenturl");
    localObject6 = bh.q((String)localObject6, "msgoperation");
    if (localObject6 != null)
    {
      ((au)localObject3).dj((String)((Map)localObject6).get(".msgoperation.expinfo.expidstr"));
      ((au)localObject3).dQ(bg.getInt((String)((Map)localObject6).get(".msgoperation.sightmsg.downloadcontroltype"), 0));
      w.i("MicroMsg.VideoMsgExtension", "[chatting_exp] expidstr:%s, downloadcontroltype:%d", new Object[] { ((ce)localObject3).fwE, Integer.valueOf(((ce)localObject3).fwF) });
    }
    localObject6 = s.mj(((r)localObject4).Nr());
    ((r)localObject4).euR = ((String)localObject6);
    ((au)localObject3).D(((r)localObject4).eSf);
    ((au)localObject3).dc(((r)localObject4).getFileName());
    ((au)localObject3).E(bc.k(((r)localObject4).Nq(), ((r)localObject4).hcs));
    ((au)localObject3).db(((r)localObject4).Nq());
    ((au)localObject3).dB(((bu)localObject5).jhA);
    if (bool1)
    {
      i = 1;
      ((au)localObject3).dC(i);
      if (((bu)localObject5).lQc != 62) {
        break label1473;
      }
      ((au)localObject3).setType(62);
    }
    final long l1;
    for (;;)
    {
      ((au)localObject3).setContent(p.b(((r)localObject4).Nr(), 0L, false));
      ((au)localObject3).dg((String)localObject7);
      ((au)localObject3).dh(((bu)localObject5).tQb);
      bc.a((au)localObject3, ???);
      l1 = bc.i((au)localObject3);
      if (l1 > 0L) {
        break label1483;
      }
      com.tencent.mm.plugin.report.service.g.ork.a(111L, 215L, 1L, false);
      w.e("MicroMsg.VideoMsgExtension", "onPreAddMessage insert msg failed local:%d svrid:%d", new Object[] { Long.valueOf(l1), Long.valueOf(((r)localObject4).eSf) });
      GMTrace.o(331652005888L, 2471);
      return null;
      i = 0;
      break;
      label1473:
      ((au)localObject3).setType(43);
    }
    label1483:
    ((r)localObject4).hcw = ((int)l1);
    ((r)localObject4).hct = bg.Pu();
    ((r)localObject4).hcx = 0;
    ((r)localObject4).status = 111;
    w.d("MicroMsg.VideoMsgExtension", "Insert fileName[" + ((r)localObject4).getFileName() + "] size:" + ((r)localObject4).gsL + " svrid:" + ((r)localObject4).eSf + " timelen:" + ((r)localObject4).hcv + " user:" + ((r)localObject4).Nq() + " human:" + ((r)localObject4).Nr());
    if (!o.Nh().a((r)localObject4))
    {
      w.d("MicroMsg.VideoMsgExtension", "Insert Error fileName:" + ((r)localObject4).getFileName());
      GMTrace.o(331652005888L, 2471);
      return null;
    }
    o.Nh();
    localObject6 = s.ml((String)localObject6);
    ??? = n.a(((bu)localObject5).tQa);
    w.i("MicroMsg.VideoMsgExtension", "imgBuf  :%d", new Object[] { Integer.valueOf(bg.br(???)) });
    if (com.tencent.mm.platformtools.r.hkp)
    {
      w.w("MicroMsg.VideoMsgExtension", "Test.useCdnDownThumb  set img buf null !!!!!!!");
      ??? = null;
    }
    if (!bg.bq(???)) {
      s.a((String)localObject6, 0, ???);
    }
    for (;;)
    {
      if (((au)localObject3).bTH())
      {
        com.tencent.mm.modelcontrol.c.Gs();
        if (((ce)localObject3).fwF != 1) {
          break label2182;
        }
        i = 1;
        label1752:
        if (i != 0)
        {
          t.ms(((ce)localObject3).field_imgPath);
          com.tencent.mm.modelcdntran.g.Gk().gzL.add("video_" + ((ce)localObject3).field_msgId);
        }
      }
      i = 1;
      j = 0;
      if (com.tencent.mm.y.s.eb(((r)localObject4).Nq()))
      {
        j = m.fk(((r)localObject4).Nq());
        if ((com.tencent.mm.y.s.gr(((r)localObject4).Nq())) || (!com.tencent.mm.y.s.gq(((r)localObject4).Nq()))) {
          i = 2;
        }
      }
      else
      {
        com.tencent.mm.plugin.report.service.g.ork.i(14388, new Object[] { Long.valueOf(((ce)localObject3).field_msgSvrId), Integer.valueOf(i), "", Integer.valueOf(j) });
        localObject1 = o.Nj();
      }
      synchronized (((i)localObject1).hbo)
      {
        ((i)localObject1).hbo.offerFirst(localObject3);
        ((i)localObject1).Nb();
        ??? = new d.b((au)localObject3, true);
        GMTrace.o(331652005888L, 2471);
        return (d.b)???;
        l1 = ((r)localObject4).eSf;
        w.i("MicroMsg.VideoMsgExtension", "getThumbByCdn msgSvrId:%d user:%s thumbUrl:%s thumbPath:%s", new Object[] { Long.valueOf(l1), ((r)localObject4).Nq(), str1, localObject6 });
        final long l2 = bg.Pv();
        ??? = (String)localObject6 + ".tmp";
        localObject5 = new com.tencent.mm.modelcdntran.i();
        ((com.tencent.mm.modelcdntran.i)localObject5).field_mediaId = com.tencent.mm.modelcdntran.d.a("downvideothumb", ((r)localObject4).hcs, ((r)localObject4).Nq(), String.valueOf(l1));
        ((com.tencent.mm.modelcdntran.i)localObject5).field_fullpath = ???;
        ((com.tencent.mm.modelcdntran.i)localObject5).field_fileType = com.tencent.mm.modelcdntran.b.MediaType_THUMBIMAGE;
        ((com.tencent.mm.modelcdntran.i)localObject5).field_totalLen = j;
        ((com.tencent.mm.modelcdntran.i)localObject5).field_aesKey = ((String)localObject1);
        ((com.tencent.mm.modelcdntran.i)localObject5).field_fileId = str1;
        ((com.tencent.mm.modelcdntran.i)localObject5).field_priority = com.tencent.mm.modelcdntran.b.gze;
        if (com.tencent.mm.y.s.eb(((r)localObject4).Nq())) {}
        for (i = 1;; i = 0)
        {
          ((com.tencent.mm.modelcdntran.i)localObject5).field_chattype = i;
          w.d("MicroMsg.VideoMsgExtension", "get thumb by cdn [video] chatType[%d] user[%s] ", new Object[] { Integer.valueOf(((com.tencent.mm.modelcdntran.i)localObject5).field_chattype), ((r)localObject4).Nq() });
          ((com.tencent.mm.modelcdntran.i)localObject5).gAB = new i.a()
          {
            public final int a(String paramAnonymousString, int paramAnonymousInt, keep_ProgressInfo paramAnonymouskeep_ProgressInfo, keep_SceneResult paramAnonymouskeep_SceneResult, boolean paramAnonymousBoolean)
            {
              GMTrace.i(341047246848L, 2541);
              if (paramAnonymousInt != 0)
              {
                w.e("MicroMsg.VideoMsgExtension", "getThumbByCdn failed. startRet:%d msgSvrId:%d user:%s thumbUrl:%s thumbPath:%s", new Object[] { Integer.valueOf(paramAnonymousInt), Long.valueOf(l1), str1.Nq(), localObject6, l2 });
                com.tencent.mm.plugin.report.service.g.ork.i(10421, new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(2), Long.valueOf(j), Long.valueOf(bg.Pv()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bc(ab.getContext())), Integer.valueOf(com.tencent.mm.modelcdntran.b.MediaType_THUMBIMAGE), Integer.valueOf(this.gHX), "" });
                GMTrace.o(341047246848L, 2541);
                return paramAnonymousInt;
              }
              if (paramAnonymouskeep_SceneResult == null)
              {
                GMTrace.o(341047246848L, 2541);
                return 0;
              }
              com.tencent.mm.plugin.report.service.g localg;
              label253:
              long l1;
              long l2;
              int i;
              int j;
              int k;
              if (paramAnonymouskeep_SceneResult.field_retCode != 0)
              {
                w.e("MicroMsg.VideoMsgExtension", "getThumbByCdn failed. sceneResult.field_retCode:%d msgSvrId:%d user:%s thumbUrl:%s thumbPath:%s", new Object[] { Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode), Long.valueOf(l1), str1.Nq(), localObject6, l2 });
                localg = com.tencent.mm.plugin.report.service.g.ork;
                if (paramAnonymouskeep_SceneResult != null) {
                  break label868;
                }
                paramAnonymousInt = -1;
                l1 = j;
                l2 = bg.Pv();
                i = com.tencent.mm.modelcdntran.d.bc(ab.getContext());
                j = com.tencent.mm.modelcdntran.b.MediaType_THUMBIMAGE;
                k = this.gHX;
                if (paramAnonymouskeep_SceneResult != null) {
                  break label877;
                }
                paramAnonymousString = "";
                label291:
                if (paramAnonymouskeep_SceneResult != null) {
                  break label886;
                }
                paramAnonymouskeep_ProgressInfo = "";
                label299:
                localg.i(10421, new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(2), Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), paramAnonymousString, "", "", "", "", "", "", "", paramAnonymouskeep_ProgressInfo });
                if ((paramAnonymouskeep_SceneResult != null) && (paramAnonymouskeep_SceneResult.field_retCode != 0))
                {
                  localg = com.tencent.mm.plugin.report.service.g.ork;
                  if (paramAnonymouskeep_SceneResult != null) {
                    break label895;
                  }
                  paramAnonymousInt = -1;
                  label444:
                  l1 = j;
                  l2 = bg.Pv();
                  i = com.tencent.mm.modelcdntran.d.bc(ab.getContext());
                  j = com.tencent.mm.modelcdntran.b.MediaType_THUMBIMAGE;
                  k = this.gHX;
                  if (paramAnonymouskeep_SceneResult != null) {
                    break label904;
                  }
                  paramAnonymousString = "";
                  label482:
                  if (paramAnonymouskeep_SceneResult != null) {
                    break label913;
                  }
                }
              }
              label868:
              label877:
              label886:
              label895:
              label904:
              label913:
              for (paramAnonymouskeep_ProgressInfo = "";; paramAnonymouskeep_ProgressInfo = paramAnonymouskeep_SceneResult.report_Part2)
              {
                localg.i(13937, new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(2), Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), paramAnonymousString, "", "", "", "", "", "", "", paramAnonymouskeep_ProgressInfo });
                o.Nh().b(str1);
                GMTrace.o(341047246848L, 2541);
                return 0;
                paramAnonymousString = new File(l2);
                new File(this.gHY).renameTo(paramAnonymousString);
                w.i("MicroMsg.VideoMsgExtension", "getThumbByCdn succ. msgSvrId:%d user:%s thumbUrl:%s thumbPath:%s", new Object[] { Long.valueOf(l1), str1.Nq(), localObject6, l2 });
                if (str1.hcC == 3)
                {
                  com.tencent.mm.plugin.report.service.g.ork.a(198L, 6L, this.gHX, false);
                  com.tencent.mm.plugin.report.service.g.ork.a(198L, 7L, 1L, false);
                  paramAnonymousString = com.tencent.mm.plugin.report.service.g.ork;
                  if (com.tencent.mm.y.s.eb(str1.Nq())) {}
                  for (l1 = 9L;; l1 = 8L)
                  {
                    paramAnonymousString.a(198L, l1, 1L, false);
                    break;
                  }
                }
                com.tencent.mm.plugin.report.service.g.ork.a(198L, 11L, this.gHX, false);
                com.tencent.mm.plugin.report.service.g.ork.a(198L, 12L, 1L, false);
                paramAnonymousString = com.tencent.mm.plugin.report.service.g.ork;
                if (com.tencent.mm.y.s.eb(str1.Nq())) {}
                for (l1 = 14L;; l1 = 13L)
                {
                  paramAnonymousString.a(198L, l1, 1L, false);
                  break;
                }
                paramAnonymousInt = paramAnonymouskeep_SceneResult.field_retCode;
                break label253;
                paramAnonymousString = paramAnonymouskeep_SceneResult.field_transInfo;
                break label291;
                paramAnonymouskeep_ProgressInfo = paramAnonymouskeep_SceneResult.report_Part2;
                break label299;
                paramAnonymousInt = paramAnonymouskeep_SceneResult.field_retCode;
                break label444;
                paramAnonymousString = paramAnonymouskeep_SceneResult.field_transInfo;
                break label482;
              }
            }
            
            public final void a(String paramAnonymousString, ByteArrayOutputStream paramAnonymousByteArrayOutputStream)
            {
              GMTrace.i(341181464576L, 2542);
              GMTrace.o(341181464576L, 2542);
            }
            
            public final byte[] h(String paramAnonymousString, byte[] paramAnonymousArrayOfByte)
            {
              GMTrace.i(341315682304L, 2543);
              GMTrace.o(341315682304L, 2543);
              return null;
            }
          };
          com.tencent.mm.modelcdntran.g.Gk().b((com.tencent.mm.modelcdntran.i)localObject5, -1);
          break;
        }
        label2182:
        if (((ce)localObject3).fwF == 2)
        {
          i = 0;
          break label1752;
        }
        if (!com.tencent.mm.modelcontrol.c.m((au)localObject3))
        {
          w.i("MicroMsg.SubCoreAutoDownload", "this message need control, do not auto download C2C short video.");
          i = 0;
          break label1752;
        }
        ??? = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.zero.b.a.class)).ut().getValue("C2CSightNotAutoDownloadTimeRange");
        w.i("MicroMsg.BusyTimeControlLogic", "C2CSightNotAutoDownloadTimeRange value: " + ???);
        if (com.tencent.mm.modelcontrol.b.jD(???))
        {
          w.i("MicroMsg.SubCoreAutoDownload", "it is busy time now , do not auto download C2C short video.");
          i = 0;
          break label1752;
        }
        ??? = ((ce)localObject3).field_talker;
        w.d("MicroMsg.SubCoreAutoDownload", "isC2CSightAutoDownload msg talker: " + ???);
        i = bg.getInt(((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.zero.b.a.class)).ut().getValue("SIGHTSessionAutoLoadNetwork"), 1);
        if (i == 3)
        {
          w.i("MicroMsg.SubCoreAutoDownload", "setting is not download sight automate, %d, %d", new Object[] { Long.valueOf(((ce)localObject3).field_msgId), Long.valueOf(((ce)localObject3).field_msgSvrId) });
          i = 0;
          break label1752;
        }
        if (am.isWifi(ab.getContext()))
        {
          w.i("MicroMsg.SubCoreAutoDownload", "match wifi, do auto download short video [msgid-%d-%d] [%s]", new Object[] { Long.valueOf(((ce)localObject3).field_msgId), Long.valueOf(((ce)localObject3).field_msgSvrId), ((ce)localObject3).field_imgPath });
          localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(???);
          if ((localObject1 != null) && ((int)((com.tencent.mm.l.a)localObject1).fTq > 0) && (((???.endsWith("@chatroom")) && (((af)localObject1).fji == 0)) || (((x)localObject1).vc()))) {
            break label2872;
          }
          i = 1;
          break label1752;
        }
        if (am.is2G(ab.getContext()))
        {
          w.i("MicroMsg.SubCoreAutoDownload", "match edge, do not auto download short video [msgid-%d-%d] [%s]", new Object[] { Long.valueOf(((ce)localObject3).field_msgId), Long.valueOf(((ce)localObject3).field_msgSvrId), ((ce)localObject3).field_imgPath });
          i = 0;
          break label1752;
        }
        ??? = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(((ce)localObject3).field_talker);
        if (com.tencent.mm.y.s.eb(((ce)localObject3).field_talker))
        {
          if (???.fji == 0)
          {
            w.i("MicroMsg.SubCoreAutoDownload", "match muted chatroom and not wifi, do not auto download short video [msgid-%d-%d] [%s]", new Object[] { Long.valueOf(((ce)localObject3).field_msgId), Long.valueOf(((ce)localObject3).field_msgSvrId), ((ce)localObject3).field_imgPath });
            i = 0;
            break label1752;
          }
          if (((am.is3G(ab.getContext())) || (am.is4G(ab.getContext()))) && (i == 1))
          {
            w.i("MicroMsg.SubCoreAutoDownload", "match 3G/4G and unmuted chatroom, do auto download short video [msgid-%d-%d] [%s]", new Object[] { Long.valueOf(((ce)localObject3).field_msgId), Long.valueOf(((ce)localObject3).field_msgSvrId), ((ce)localObject3).field_imgPath });
            i = 1;
            break label1752;
          }
          w.i("MicroMsg.SubCoreAutoDownload", "unknown auto download short video step A");
          i = 0;
          break label1752;
        }
        if (???.vc())
        {
          w.i("MicroMsg.SubCoreAutoDownload", "match muted and not wifi, do not auto download short video [msgid-%d-%d] [%s]", new Object[] { Long.valueOf(((ce)localObject3).field_msgId), Long.valueOf(((ce)localObject3).field_msgSvrId), ((ce)localObject3).field_imgPath });
          i = 0;
          break label1752;
        }
        if (((am.is3G(ab.getContext())) || (am.is4G(ab.getContext()))) && (i == 1))
        {
          w.i("MicroMsg.SubCoreAutoDownload", "match 3G/4G and unmuted, do auto download short video [msgid-%d-%d] [%s]", new Object[] { Long.valueOf(((ce)localObject3).field_msgId), Long.valueOf(((ce)localObject3).field_msgSvrId), ((ce)localObject3).field_imgPath });
          i = 1;
          break label1752;
        }
        w.i("MicroMsg.SubCoreAutoDownload", "unknown auto download short video step B");
        i = 0;
        break label1752;
        label2872:
        w.i("MicroMsg.SubCoreAutoDownload", "default can not auto download C2C short video.");
        i = 0;
        break label1752;
        i = 3;
      }
    }
  }
  
  public final void h(au paramau)
  {
    GMTrace.i(331786223616L, 2472);
    if (paramau == null)
    {
      GMTrace.o(331786223616L, 2472);
      return;
    }
    paramau = paramau.field_imgPath;
    if ((!bg.nm(paramau)) && (o.Nh().mi(paramau))) {
      try
      {
        o.Nh();
        new File(s.ml(paramau)).delete();
        o.Nh();
        new File(s.mk(paramau)).delete();
        GMTrace.o(331786223616L, 2472);
        return;
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.VideoLogic", "ERR: Delete file Failed" + com.tencent.mm.compatible.util.g.tC() + " file:" + paramau + " msg:" + localException.getMessage());
      }
    }
    GMTrace.o(331786223616L, 2472);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelvideo\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */