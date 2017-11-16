package com.tencent.mm.ao;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelcdntran.b;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.y.e;
import com.tencent.mm.y.s;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Map;

public final class g
  extends e
{
  public g()
  {
    GMTrace.i(3516370255872L, 26199);
    GMTrace.o(3516370255872L, 26199);
  }
  
  protected final au a(bu parambu, String paramString1, final String paramString2, final String paramString3)
  {
    GMTrace.i(3516504473600L, 26200);
    final Object localObject1 = n.IZ();
    paramString3 = super.a(parambu, paramString1, paramString2, paramString3);
    if (paramString3.field_msgId != 0L)
    {
      GMTrace.o(3516504473600L, 26200);
      return paramString3;
    }
    final long l1 = parambu.tQd;
    paramString2 = ((f)localObject1).ap(l1);
    if (paramString2.eSf == l1)
    {
      FileOp.deleteFile(((f)localObject1).l(paramString2.gGS, "", ""));
      FileOp.deleteFile(((f)localObject1).l(paramString2.gGU, "", ""));
      FileOp.deleteFile(((f)localObject1).l(paramString2.gGU, "", "") + "hd");
      ((f)localObject1).goN.delete("ImgInfo2", "msgSvrId=?", new String[] { String.valueOf(l1) });
      if (paramString2.II())
      {
        paramString2 = ((f)localObject1).gr(paramString2.gHb);
        if (paramString2 != null)
        {
          FileOp.deleteFile(((f)localObject1).l(paramString2.gGS, "", ""));
          FileOp.deleteFile(((f)localObject1).l(paramString2.gGU, "", ""));
          FileOp.deleteFile(((f)localObject1).l(paramString2.gGU, "", "") + "hd");
          ((f)localObject1).goN.delete("ImgInfo2", "id=?", new String[] { paramString2.gGR });
        }
      }
    }
    if (parambu.tPZ != 2)
    {
      w.e("MicroMsg.ImgMsgExtension", "data type img, but has no imgstatus_hasimg ?!");
      GMTrace.o(3516504473600L, 26200);
      return paramString3;
    }
    paramString2 = com.tencent.mm.platformtools.n.a(parambu.tQa);
    if (r.hkp)
    {
      w.w("MicroMsg.ImgMsgExtension", "Test.useCdnDownThumb  set img buf null !!!!!!!");
      paramString2 = null;
    }
    for (;;)
    {
      Object localObject2 = bh.q(paramString3.field_content, "msg");
      l1 = -1L;
      int i;
      if (!bg.nm(paramString3.field_content))
      {
        w.i("MicroMsg.ImgMsgExtension", "cdntra content:[%s]", new Object[] { paramString3.field_content });
        if (localObject2 == null) {
          com.tencent.mm.plugin.report.service.g.ork.a(111L, 190L, 1L, false);
        }
        if ((localObject2 == null) || (bg.getInt((String)((Map)localObject2).get(".msg.img.$hdlength"), 0) <= 0)) {
          break label1039;
        }
        i = parambu.tPZ;
      }
      label1033:
      label1039:
      for (l1 = ((f)localObject1).a(paramString2, parambu.tQd, true, paramString3.field_content, new PString(), new PInt(), new PInt());; l1 = -1L)
      {
        Object localObject3 = bh.q(paramString3.field_content, "msgoperation");
        if (localObject3 != null)
        {
          paramString3.dj((String)((Map)localObject3).get(".msgoperation.expinfo.expidstr"));
          paramString3.dQ(bg.getInt((String)((Map)localObject3).get(".msgoperation.imagemsg.downloadcontroltype"), 0));
          w.i("MicroMsg.ImgMsgExtension", "[chatting_exp] expidstr:%s, downloadcontroltype:%d", new Object[] { paramString3.fwE, Integer.valueOf(paramString3.fwF) });
        }
        localObject3 = new PString();
        PInt localPInt1 = new PInt();
        PInt localPInt2 = new PInt();
        i = parambu.tPZ;
        final long l2 = ((f)localObject1).a(paramString2, parambu.tQd, false, paramString3.field_content, (PString)localObject3, localPInt1, localPInt2);
        if (l2 > 0L)
        {
          paramString3.dc(((PString)localObject3).value);
          paramString3.dN(localPInt1.value);
          paramString3.dO(localPInt2.value);
          if (l1 > 0L)
          {
            parambu = n.IZ().b(Long.valueOf(l2));
            parambu.gn((int)l1);
            n.IZ().a(Long.valueOf(l2), parambu);
          }
        }
        final int j;
        if ((bg.bq(paramString2)) && (localObject2 != null))
        {
          parambu = (String)((Map)localObject2).get(".msg.img.$cdnthumbaeskey");
          paramString2 = (String)((Map)localObject2).get(".msg.img.$cdnthumburl");
          j = bg.getInt((String)((Map)localObject2).get(".msg.img.$cdnthumblength"), 0);
          localObject1 = ((f)localObject1).l(com.tencent.mm.a.g.n(("SERVERID://" + paramString3.field_msgSvrId).getBytes()), "th_", "");
          l1 = paramString3.field_msgSvrId;
          w.i("MicroMsg.ImgMsgExtension", "getThumbByCdn msgSvrId:%d fromUser:%s thumbUrl:%s thumbPath:%s", new Object[] { Long.valueOf(l1), paramString1, paramString2, localObject1 });
          l2 = bg.Pv();
          localObject2 = (String)localObject1 + ".tmp";
          localObject3 = new i();
          ((i)localObject3).field_mediaId = com.tencent.mm.modelcdntran.d.a("downimgthumb", paramString3.field_createTime, paramString1, String.valueOf(l1));
          ((i)localObject3).field_fullpath = ((String)localObject2);
          ((i)localObject3).field_fileType = b.MediaType_THUMBIMAGE;
          ((i)localObject3).field_totalLen = j;
          ((i)localObject3).field_aesKey = parambu;
          ((i)localObject3).field_fileId = paramString2;
          ((i)localObject3).field_priority = b.gze;
          if (!s.eb(paramString1)) {
            break label1033;
          }
        }
        for (i = 1;; i = 0)
        {
          ((i)localObject3).field_chattype = i;
          w.d("MicroMsg.ImgMsgExtension", "get thumb by cdn [image] chatType[%d] fromUser[%s] ", new Object[] { Integer.valueOf(((i)localObject3).field_chattype), paramString1 });
          ((i)localObject3).gAB = new i.a()
          {
            public final int a(String paramAnonymousString, int paramAnonymousInt, keep_ProgressInfo paramAnonymouskeep_ProgressInfo, keep_SceneResult paramAnonymouskeep_SceneResult, boolean paramAnonymousBoolean)
            {
              GMTrace.i(3535160737792L, 26339);
              if (paramAnonymousInt != 0)
              {
                w.e("MicroMsg.ImgMsgExtension", "getThumbByCdn failed. startRet:%d msgSvrId:%d fromUser:%s thumbUrl:%s thumbPath:%s", new Object[] { Integer.valueOf(paramAnonymousInt), Long.valueOf(l1), paramString2, localObject1, paramString3 });
                l2.dB(5);
                ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().b(l2.field_msgSvrId, l2);
                com.tencent.mm.plugin.report.service.g.ork.i(10421, new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(2), Long.valueOf(j), Long.valueOf(bg.Pv()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bc(ab.getContext())), Integer.valueOf(b.MediaType_THUMBIMAGE), Integer.valueOf(this.gHX), "" });
                com.tencent.mm.plugin.report.service.g.ork.i(13937, new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(2), Long.valueOf(j), Long.valueOf(bg.Pv()), Integer.valueOf(com.tencent.mm.modelcdntran.d.bc(ab.getContext())), Integer.valueOf(b.MediaType_THUMBIMAGE), Integer.valueOf(this.gHX), "" });
                n.IZ().doNotify();
                GMTrace.o(3535160737792L, 26339);
                return 0;
              }
              if (paramAnonymouskeep_SceneResult == null)
              {
                GMTrace.o(3535160737792L, 26339);
                return 0;
              }
              com.tencent.mm.plugin.report.service.g localg;
              int i;
              label426:
              long l1;
              long l2;
              int j;
              int k;
              if (paramAnonymouskeep_SceneResult.field_retCode != 0)
              {
                w.e("MicroMsg.ImgMsgExtension", "getThumbByCdn failed. sceneResult.field_retCode:%d msgSvrId:%d fromUser:%s thumbUrl:%s thumbPath:%s", new Object[] { Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode), Long.valueOf(l1), paramString2, localObject1, paramString3 });
                l2.dB(5);
                if (!bg.nm(l2.field_talker)) {
                  ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().b(l2.field_msgSvrId, l2);
                }
                localg = com.tencent.mm.plugin.report.service.g.ork;
                if (paramAnonymouskeep_SceneResult != null) {
                  break label1071;
                }
                i = paramAnonymousInt;
                l1 = j;
                l2 = bg.Pv();
                j = com.tencent.mm.modelcdntran.d.bc(ab.getContext());
                k = b.MediaType_THUMBIMAGE;
                int m = this.gHX;
                if (paramAnonymouskeep_SceneResult != null) {
                  break label1081;
                }
                paramAnonymousString = "";
                label464:
                if (paramAnonymouskeep_SceneResult != null) {
                  break label1090;
                }
                paramAnonymouskeep_ProgressInfo = "";
                label472:
                localg.i(10421, new Object[] { Integer.valueOf(i), Integer.valueOf(2), Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), paramAnonymousString, "", "", "", "", "", "", "", paramAnonymouskeep_ProgressInfo });
                if ((paramAnonymouskeep_SceneResult != null) && (paramAnonymouskeep_SceneResult.field_retCode != 0))
                {
                  localg = com.tencent.mm.plugin.report.service.g.ork;
                  if (paramAnonymouskeep_SceneResult != null) {
                    break label1099;
                  }
                  label616:
                  l1 = j;
                  l2 = bg.Pv();
                  i = com.tencent.mm.modelcdntran.d.bc(ab.getContext());
                  j = b.MediaType_THUMBIMAGE;
                  k = this.gHX;
                  if (paramAnonymouskeep_SceneResult != null) {
                    break label1108;
                  }
                  paramAnonymousString = "";
                  label654:
                  if (paramAnonymouskeep_SceneResult != null) {
                    break label1117;
                  }
                }
              }
              label1071:
              label1081:
              label1090:
              label1099:
              label1108:
              label1117:
              for (paramAnonymouskeep_ProgressInfo = "";; paramAnonymouskeep_ProgressInfo = paramAnonymouskeep_SceneResult.report_Part2)
              {
                localg.i(13937, new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(2), Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), paramAnonymousString, "", "", "", "", "", "", "", paramAnonymouskeep_ProgressInfo });
                n.IZ().doNotify();
                GMTrace.o(3535160737792L, 26339);
                return 0;
                paramAnonymousString = new File(paramString3);
                new File(this.gHY).renameTo(paramAnonymousString);
                l2.dB(6);
                paramAnonymousString = new PInt();
                paramAnonymouskeep_ProgressInfo = new PInt();
                com.tencent.mm.sdk.platformtools.d.c(paramString3, paramAnonymousString, paramAnonymouskeep_ProgressInfo);
                l2.dN(paramAnonymousString.value);
                l2.dO(paramAnonymouskeep_ProgressInfo.value);
                w.i("MicroMsg.ImgMsgExtension", "getThumbByCdn succ. sceneResult.field_retCode:%d msgSvrId:%d fromUser:%s thumb[%d,%d] thumbUrl:%s thumbPath:%s", new Object[] { Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode), Long.valueOf(l1), paramString2, Integer.valueOf(paramAnonymousString.value), Integer.valueOf(paramAnonymouskeep_ProgressInfo.value), localObject1, paramString3 });
                if (!bg.nm(l2.field_talker)) {
                  ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().b(l2.field_msgSvrId, l2);
                }
                com.tencent.mm.plugin.report.service.g.ork.a(198L, 1L, this.gHX, false);
                com.tencent.mm.plugin.report.service.g.ork.a(198L, 2L, 1L, false);
                paramAnonymousString = com.tencent.mm.plugin.report.service.g.ork;
                if (s.eb(paramString2)) {}
                for (l1 = 4L;; l1 = 3L)
                {
                  paramAnonymousString.a(198L, l1, 1L, false);
                  break;
                }
                i = paramAnonymouskeep_SceneResult.field_retCode;
                break label426;
                paramAnonymousString = paramAnonymouskeep_SceneResult.field_transInfo;
                break label464;
                paramAnonymouskeep_ProgressInfo = paramAnonymouskeep_SceneResult.report_Part2;
                break label472;
                paramAnonymousInt = paramAnonymouskeep_SceneResult.field_retCode;
                break label616;
                paramAnonymousString = paramAnonymouskeep_SceneResult.field_transInfo;
                break label654;
              }
            }
            
            public final void a(String paramAnonymousString, ByteArrayOutputStream paramAnonymousByteArrayOutputStream)
            {
              GMTrace.i(3535294955520L, 26340);
              GMTrace.o(3535294955520L, 26340);
            }
            
            public final byte[] h(String paramAnonymousString, byte[] paramAnonymousArrayOfByte)
            {
              GMTrace.i(3535429173248L, 26341);
              GMTrace.o(3535429173248L, 26341);
              return null;
            }
          };
          paramString3.dB(4);
          com.tencent.mm.modelcdntran.g.Gk().b((i)localObject3, -1);
          GMTrace.o(3516504473600L, 26200);
          return paramString3;
        }
      }
    }
  }
  
  public final void h(au paramau)
  {
    GMTrace.i(3516638691328L, 26201);
    n.IZ().o(paramau);
    GMTrace.o(3516638691328L, 26201);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ao\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */