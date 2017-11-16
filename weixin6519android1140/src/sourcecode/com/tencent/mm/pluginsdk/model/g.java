package com.tencent.mm.pluginsdk.model;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.af.a.j;
import com.tencent.mm.ao.d;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.g.a.cf.a;
import com.tencent.mm.g.a.mn;
import com.tencent.mm.g.a.mn.b;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.protocal.c.bhr;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.ti;
import com.tencent.mm.protocal.c.tj;
import com.tencent.mm.protocal.c.tk;
import com.tencent.mm.protocal.c.to;
import com.tencent.mm.protocal.c.ts;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.protocal.c.tw;
import com.tencent.mm.protocal.c.tz;
import com.tencent.mm.protocal.c.ue;
import com.tencent.mm.protocal.c.uf;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.au.a;
import com.tencent.mm.x.f.a;
import com.tencent.mm.x.k;
import com.tencent.mm.x.l;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.bc.b;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class g
{
  private static final SimpleDateFormat okV;
  
  static
  {
    GMTrace.i(770409758720L, 5740);
    okV = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    GMTrace.o(770409758720L, 5740);
  }
  
  private static tw Oj(String paramString)
  {
    GMTrace.i(769067581440L, 5730);
    tw localtw = new tw();
    localtw.QY(paramString);
    localtw.zZ(1);
    localtw.eE(bg.Pv());
    localtw.Ra("");
    GMTrace.o(769067581440L, 5730);
    return localtw;
  }
  
  private static tj X(au paramau)
  {
    GMTrace.i(769201799168L, 5731);
    tj localtj = new tj();
    if (paramau == null)
    {
      GMTrace.o(769201799168L, 5731);
      return localtj;
    }
    if ((paramau.field_isSend == 1) || (paramau.field_content.startsWith("<msg>")))
    {
      localtj.QH(com.tencent.mm.y.q.zE());
      localtj.QI(paramau.field_talker);
      if (com.tencent.mm.y.s.eb(paramau.field_talker)) {
        localtj.QK(localtj.eMI);
      }
    }
    do
    {
      if (com.tencent.mm.af.f.dL(paramau.field_talker))
      {
        String str2 = paramau.field_bizChatUserId;
        str1 = str2;
        if (str2 == null) {
          str1 = bc.gT(paramau.fwv).userId;
        }
        localtj.QK(str1);
      }
      localtj.zU(1);
      localtj.eB(paramau.field_createTime);
      localtj.QL(paramau.field_msgSvrId);
      if (paramau.field_msgSvrId > 0L) {
        localtj.QJ(paramau.field_msgSvrId);
      }
      GMTrace.o(769201799168L, 5731);
      return localtj;
      localtj.QH(paramau.field_talker);
      localtj.QI(com.tencent.mm.y.q.zE());
    } while (!com.tencent.mm.y.s.eb(paramau.field_talker));
    if (paramau.field_content != null) {}
    for (String str1 = paramau.field_content.substring(0, Math.max(0, paramau.field_content.indexOf(':')));; str1 = "")
    {
      localtj.QK(str1);
      if ((bg.nm(localtj.ulb)) || (paramau.bTu())) {
        break;
      }
      paramau.setContent(paramau.field_content.substring(localtj.ulb.length() + 1));
      if ((paramau.field_content.length() > 0) && ('\n' == paramau.field_content.charAt(0))) {
        paramau.setContent(paramau.field_content.substring(1));
      }
      if (!paramau.bTN()) {
        break;
      }
      paramau.de(paramau.field_transContent.substring(localtj.ulb.length() + 1));
      if ((paramau.field_transContent.length() <= 0) || ('\n' != paramau.field_transContent.charAt(0))) {
        break;
      }
      paramau.de(paramau.field_transContent.substring(1));
      break;
    }
  }
  
  private static String Y(au paramau)
  {
    GMTrace.i(769604452352L, 5734);
    if (paramau.field_isSend == 1)
    {
      if ((com.tencent.mm.y.s.eb(paramau.field_talker)) || (paramau.field_talker.equals("filehelper")))
      {
        paramau = String.format("%d", new Object[] { Long.valueOf(paramau.field_msgSvrId) });
        GMTrace.o(769604452352L, 5734);
        return paramau;
      }
      paramau = String.format("%s#%d", new Object[] { paramau.field_talker, Long.valueOf(paramau.field_msgSvrId) });
      GMTrace.o(769604452352L, 5734);
      return paramau;
    }
    long l = paramau.field_msgSvrId;
    GMTrace.o(769604452352L, 5734);
    return String.valueOf(l);
  }
  
  private static th a(au paramau, f.a parama, int paramInt)
  {
    GMTrace.i(770007105536L, 5737);
    th localth = new th();
    localth.Qy(Y(paramau));
    localth.Qn(parama.giM);
    localth.Qo(parama.giN);
    localth.Qm(parama.url);
    localth.kw(true);
    paramau = new File(bg.aq(com.tencent.mm.ao.n.IZ().x(paramau.field_imgPath, true), ""));
    if (paramau.exists()) {
      localth.Qv(paramau.getAbsolutePath());
    }
    for (;;)
    {
      localth.Qg(parama.title);
      localth.Qh(parama.description);
      localth.zR(paramInt);
      localth.QF(parama.canvasPageXml);
      GMTrace.o(770007105536L, 5737);
      return localth;
      localth.kx(true);
    }
  }
  
  private static th a(au paramau, String paramString, ti paramti)
  {
    GMTrace.i(770141323264L, 5738);
    th localth = new th();
    localth.Qy(Y(paramau));
    localth.zR(1);
    localth.Qh(paramString);
    localth.kx(true);
    localth.kw(true);
    localth.a(paramti);
    localth.QB(a(paramti.ukF));
    localth.QC(b(paramti.ukF));
    GMTrace.o(770141323264L, 5738);
    return localth;
  }
  
  private static String a(tj paramtj)
  {
    GMTrace.i(769336016896L, 5732);
    String str2 = paramtj.ulb;
    String str1 = str2;
    if (bg.nm(str2)) {
      str1 = paramtj.eMI;
    }
    if (com.tencent.mm.af.a.e.je(str1))
    {
      paramtj = com.tencent.mm.af.a.e.jg(str1);
      GMTrace.o(769336016896L, 5732);
      return paramtj;
    }
    paramtj = com.tencent.mm.y.r.fr(str1);
    GMTrace.o(769336016896L, 5732);
    return paramtj;
  }
  
  private static boolean a(Context paramContext, cf paramcf, au paramau, int paramInt)
  {
    GMTrace.i(768933363712L, 5729);
    ti localti = new ti();
    localti.c(X(paramau));
    String str = null;
    if (paramInt == 1) {
      str = paramContext.getString(R.l.cSD);
    }
    for (;;)
    {
      paramContext = a(paramau, str, localti);
      paramcf.eDv.eDx.ulB.add(paramContext);
      GMTrace.o(768933363712L, 5729);
      return true;
      if (paramInt == 2) {
        str = paramContext.getString(R.l.cTO);
      } else if (paramInt == 3) {
        str = paramContext.getString(R.l.cUB);
      }
    }
  }
  
  private static boolean a(Context paramContext, cf paramcf, au paramau, boolean paramBoolean)
  {
    GMTrace.i(768799145984L, 5728);
    if ((paramcf == null) || (paramau == null))
    {
      w.w("MicroMsg.GetFavRecordDataSource", "fill favorite event fail, event or msg is null");
      if (paramcf != null) {
        paramcf.eDv.eDB = R.l.dtu;
      }
      GMTrace.o(768799145984L, 5728);
      return false;
    }
    au localau = au.ad(paramau);
    boolean bool = false;
    if (localau.bTF())
    {
      paramContext = new ti();
      paramContext.c(X(localau));
      paramau = new th();
      paramau.Qy(Y(localau));
      paramau.zR(1);
      if (!localau.bTS())
      {
        paramau.Qh(localau.field_content);
        paramau.kx(true);
        paramau.kw(true);
        paramau.a(paramContext);
        paramau.QB(a(paramContext.ukF));
        paramau.QC(b(paramContext.ukF));
        paramcf.eDv.eDx.ulB.add(paramau);
        paramContext = paramcf.eDv.eDy;
        paramContext.ulQ += 1;
        bool = true;
      }
    }
    for (;;)
    {
      if (!paramBoolean) {
        c.a(localau, paramcf, bool);
      }
      GMTrace.o(768799145984L, 5728);
      return bool;
      paramau.Qh(localau.field_content + "\n\n" + localau.field_transContent);
      break;
      Object localObject1;
      if (localau.bTu())
      {
        paramau = new ti();
        paramau.c(X(localau));
        localObject1 = new th();
        ((th)localObject1).Qy(Y(localau));
        ((th)localObject1).zR(3);
        if (paramBoolean)
        {
          ((th)localObject1).kx(true);
          ((th)localObject1).kw(true);
        }
        for (;;)
        {
          ((th)localObject1).a(paramau);
          ((th)localObject1).QB(a(paramau.ukF));
          ((th)localObject1).QC(b(paramau.ukF));
          paramcf.eDv.eDx.ulB.add(localObject1);
          paramContext = paramcf.eDv.eDy;
          paramContext.ulS += 1;
          bool = true;
          break;
          if (com.tencent.mm.y.s.fY(localau.field_talker))
          {
            paramContext = localau.field_imgPath;
            at.AR();
            paramContext = com.tencent.mm.sdk.platformtools.h.a(com.tencent.mm.y.c.yZ(), "recbiz_", paramContext, ".rec", 2);
            if (bg.nm(paramContext))
            {
              paramContext = null;
              label460:
              ((th)localObject1).Qu(paramContext);
            }
          }
          for (;;)
          {
            ((th)localObject1).kx(true);
            paramContext = com.tencent.mm.modelvoice.q.mK(localau.field_imgPath);
            if (paramContext != null) {
              break label525;
            }
            bool = false;
            break;
            new File(paramContext).exists();
            break label460;
            ((th)localObject1).Qu(com.tencent.mm.modelvoice.q.getFullPath(localau.field_imgPath));
          }
          label525:
          ((th)localObject1).Qq(e.yK(paramContext.getFormat()));
          ((th)localObject1).zQ((int)new com.tencent.mm.modelvoice.n(localau.field_content).time);
        }
      }
      if (localau.bTE())
      {
        bool = b(paramcf, localau);
      }
      else
      {
        Object localObject2;
        int i;
        if (localau.bTC())
        {
          paramau = null;
          if (localau.field_msgId > 0L) {
            paramau = com.tencent.mm.ao.n.IZ().aq((int)localau.field_msgId);
          }
          if (paramau != null)
          {
            paramContext = paramau;
            if (paramau.gGR > 0L) {}
          }
          else
          {
            paramContext = paramau;
            if (localau.field_msgSvrId > 0L) {
              paramContext = com.tencent.mm.ao.n.IZ().ap(localau.field_msgSvrId);
            }
          }
          if (paramContext == null)
          {
            w.w("MicroMsg.GetFavRecordDataSource", "getImgDataPath: try get imgInfo fail");
            paramcf.eDv.eDB = R.l.dtA;
            bool = false;
          }
          else
          {
            paramau = new ti();
            paramau.c(X(localau));
            localObject1 = new th();
            ((th)localObject1).Qy(Y(localau));
            ((th)localObject1).zR(2);
            ((th)localObject1).Qu(com.tencent.mm.ao.n.IZ().l(com.tencent.mm.ao.e.c(paramContext), "", ""));
            if (paramContext.II())
            {
              localObject2 = com.tencent.mm.ao.n.IZ().gr(paramContext.gHb);
              if (((d)localObject2).gsL > ((d)localObject2).offset) {
                ((th)localObject1).Qu(com.tencent.mm.ao.n.IZ().l("SERVERID://" + localau.field_msgSvrId, "", ""));
              }
            }
            ((th)localObject1).Qv(com.tencent.mm.ao.n.IZ().x(localau.field_imgPath, true));
            ((th)localObject1).a(paramau);
            ((th)localObject1).QB(a(paramau.ukF));
            ((th)localObject1).QC(b(paramau.ukF));
            ((th)localObject1).eA(localau.field_msgId);
            if (paramBoolean)
            {
              paramau = paramContext;
              if (paramContext.II())
              {
                paramau = paramContext;
                if (paramContext.gsL == 0) {
                  paramau = com.tencent.mm.ao.n.IZ().gr(paramContext.gHb);
                }
              }
              if (localau.field_isSend != 1) {
                break label1060;
              }
              if (!paramau.II()) {
                break label1054;
              }
              i = 1;
              label934:
              paramContext = bh.q(paramau.gHc, "msg");
              if (paramContext == null) {
                break label1110;
              }
              if (i == 1)
              {
                ((th)localObject1).Qk((String)paramContext.get(".msg.img.$cdnbigimgurl"));
                ((th)localObject1).ey(bg.getInt((String)paramContext.get(".msg.img.$length"), 0));
                ((th)localObject1).Ql((String)paramContext.get(".msg.img.$aeskey"));
              }
            }
            for (;;)
            {
              paramcf.eDv.eDx.ulB.add(localObject1);
              paramContext = paramcf.eDv.eDy;
              paramContext.ulR += 1;
              bool = true;
              break;
              label1054:
              i = 0;
              break label934;
              label1060:
              if (!paramau.II())
              {
                i = 0;
                break label934;
              }
              paramContext = com.tencent.mm.ao.e.a(paramau);
              if (!com.tencent.mm.a.e.aZ(com.tencent.mm.ao.n.IZ().l(paramContext.gGS, "", "")))
              {
                i = 0;
                break label934;
              }
              i = 1;
              break label934;
              label1110:
              w.i("MicroMsg.GetFavRecordDataSource", "parse cdnInfo failed. [%s]", new Object[] { paramau.gHc });
            }
          }
        }
        else if (localau.bTG())
        {
          bool = a(paramcf, localau, paramBoolean);
        }
        else if (localau.bTH())
        {
          bool = a(paramcf, localau, paramBoolean);
        }
        else
        {
          if ((paramBoolean) && (localau.field_type == 318767153))
          {
            paramBoolean = a(paramContext, paramcf, localau, 3);
            GMTrace.o(768799145984L, 5728);
            return paramBoolean;
          }
          if ((localau.bTs()) || (localau.bTt()))
          {
            bool = c(paramcf, localau);
          }
          else if ((paramBoolean) && ((localau.bTI()) || (localau.bTJ())))
          {
            bool = a(paramContext, paramcf, localau, 1);
          }
          else if ((paramBoolean) && (localau.field_type == 419430449))
          {
            bool = a(paramContext, paramcf, localau, 2);
          }
          else
          {
            if (localau.bTD())
            {
              at.AR();
              localObject1 = com.tencent.mm.y.c.yM().Cn(localau.field_content);
              paramau = new ti();
              paramau.c(X(localau));
              if ((localObject1 != null) && (com.tencent.mm.y.s.fp(((au.a)localObject1).rCC)))
              {
                paramContext = new th();
                paramContext.Qy(Y(localau));
                paramContext.zR(16);
                paramContext.Qh(localau.field_content);
                paramContext.kx(true);
                paramContext.kw(true);
                paramContext.a(paramau);
                paramContext.QB(a(paramau.ukF));
                paramContext.QC(b(paramau.ukF));
              }
              for (;;)
              {
                paramcf.eDv.eDx.ulB.add(paramContext);
                paramContext = paramcf.eDv.eDy;
                paramContext.ume += 1;
                bool = true;
                break;
                paramContext = a(localau, paramContext.getString(R.l.cTl), paramau);
              }
            }
            if (localau.aCp())
            {
              if (localau.bTJ())
              {
                paramcf.eDv.eDB = R.l.dtC;
              }
              else
              {
                paramau = new ti();
                paramau.c(X(localau));
                localObject1 = localau.field_content;
                if (localObject1 == null)
                {
                  paramcf.eDv.eDB = R.l.dtD;
                  bool = false;
                }
                else
                {
                  localObject1 = f.a.eS((String)localObject1);
                  if (localObject1 == null)
                  {
                    paramcf.eDv.eDB = R.l.dtD;
                    bool = false;
                  }
                  else
                  {
                    paramau.ukF.QM(((f.a)localObject1).appId);
                    paramau.ukF.QO(((f.a)localObject1).eTo);
                    localObject2 = com.tencent.mm.pluginsdk.model.app.g.aP(((f.a)localObject1).appId, true);
                    if ((localObject2 != null) && (((com.tencent.mm.pluginsdk.model.app.f)localObject2).bJs()) && (paramBoolean))
                    {
                      paramContext = a(localau, paramContext.getString(R.l.cTm), paramau);
                      paramcf.eDv.eDx.ulB.add(paramContext);
                      bool = true;
                    }
                    else
                    {
                      switch (((f.a)localObject1).type)
                      {
                      }
                      for (;;)
                      {
                        if (paramBoolean)
                        {
                          paramContext = a(localau, paramContext.getString(R.l.cUB), paramau);
                          paramcf.eDv.eDx.ulB.add(paramContext);
                          bool = true;
                          break;
                          paramContext = new th();
                          paramContext.Qy(Y(localau));
                          paramContext.zR(1);
                          paramContext.Qh(((f.a)localObject1).title);
                          paramContext.kx(true);
                          paramContext.kw(true);
                          paramContext.a(paramau);
                          paramContext.QB(a(paramau.ukF));
                          paramContext.QC(b(paramau.ukF));
                          paramcf.eDv.eDx.ulB.add(paramContext);
                          paramContext = paramcf.eDv.eDy;
                          paramContext.ulQ += 1;
                          bool = true;
                          break;
                          at.AR();
                          if (!com.tencent.mm.y.c.isSDCardAvailable())
                          {
                            paramcf.eDv.eDB = R.l.dtJ;
                            bool = false;
                            break;
                          }
                          localObject2 = an.afP().Op(((f.a)localObject1).eAE);
                          paramContext = new th();
                          paramContext.Qy(Y(localau));
                          if (localObject2 != null) {
                            paramContext.Qu(((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_fileFullPath);
                          }
                          localObject2 = com.tencent.mm.ao.n.IZ().x(localau.field_imgPath, true);
                          if (com.tencent.mm.a.e.aZ((String)localObject2)) {
                            paramContext.Qv((String)localObject2);
                          }
                          paramContext.zR(2);
                          paramContext.Qg(((f.a)localObject1).title);
                          paramContext.Qh(((f.a)localObject1).description);
                          paramContext.a(paramau);
                          paramContext.QB(a(paramau.ukF));
                          paramContext.QC(b(paramau.ukF));
                          paramContext.eA(localau.field_msgId);
                          paramcf.eDv.eDx.ulB.add(paramContext);
                          paramContext = paramcf.eDv.eDy;
                          paramContext.ulR += 1;
                          bool = true;
                          break;
                          paramContext = a(localau, (f.a)localObject1, 7);
                          paramContext.a(paramau);
                          paramContext.QB(a(paramau.ukF));
                          paramContext.QC(b(paramau.ukF));
                          paramcf.eDv.eDx.ulB.add(paramContext);
                          paramContext = paramcf.eDv.eDy;
                          paramContext.ulW += 1;
                          bool = true;
                          break;
                          paramContext = a(localau, (f.a)localObject1, 4);
                          paramContext.a(paramau);
                          paramContext.QB(a(paramau.ukF));
                          paramContext.QC(b(paramau.ukF));
                          paramContext.eA(localau.field_msgId);
                          paramcf.eDv.eDx.ulB.add(paramContext);
                          paramContext = paramcf.eDv.eDy;
                          paramContext.ulT += 1;
                          bool = true;
                          break;
                          if ((((f.a)localObject1).url != null) && (!((f.a)localObject1).url.equals("")))
                          {
                            paramau.ukF.QN(((f.a)localObject1).url);
                            paramContext = a(localau, (f.a)localObject1, 5);
                            paramContext.a(paramau);
                            paramContext.QB(a(paramau.ukF));
                            paramContext.QC(b(paramau.ukF));
                            localObject2 = new uf();
                            if (!bg.nm(((f.a)localObject1).title)) {
                              ((uf)localObject2).Rl(((f.a)localObject1).title);
                            }
                            if (!bg.nm(((f.a)localObject1).description)) {
                              ((uf)localObject2).Rm(((f.a)localObject1).description);
                            }
                            if (!bg.nm(((f.a)localObject1).thumburl)) {
                              ((uf)localObject2).Ro(((f.a)localObject1).thumburl);
                            }
                            if (!bg.nm(((f.a)localObject1).canvasPageXml)) {
                              ((uf)localObject2).Rp(((f.a)localObject1).canvasPageXml);
                            }
                            if (((uf)localObject2).aYq() > 0)
                            {
                              ((uf)localObject2).Aa(1);
                              paramau.a((uf)localObject2);
                            }
                            paramcf.eDv.eDx.ulB.add(paramContext);
                            paramContext = paramcf.eDv.eDy;
                            paramContext.ulU += 1;
                            bool = true;
                            break;
                          }
                          paramcf.eDv.eDB = R.l.dty;
                          if (paramBoolean)
                          {
                            paramContext = a(localau, paramContext.getString(R.l.cUB), paramau);
                            paramcf.eDv.eDx.ulB.add(paramContext);
                            bool = true;
                            break;
                          }
                          bool = false;
                          break;
                          at.AR();
                          if (!com.tencent.mm.y.c.isSDCardAvailable())
                          {
                            paramcf.eDv.eDB = R.l.dtJ;
                            bool = false;
                            break;
                          }
                          localObject2 = an.afP().Op(((f.a)localObject1).eAE);
                          paramContext = new th();
                          if (localObject2 != null) {
                            paramContext.Qu(((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_fileFullPath);
                          }
                          paramContext.Qy(Y(localau));
                          paramContext.zR(8);
                          paramContext.Qq(((f.a)localObject1).giw);
                          localObject2 = com.tencent.mm.ao.n.IZ().x(localau.field_imgPath, true);
                          if (bg.nm((String)localObject2)) {
                            paramContext.kx(true);
                          }
                          if (com.tencent.mm.a.e.aZ((String)localObject2)) {
                            paramContext.Qv((String)localObject2);
                          }
                          paramContext.Qg(((f.a)localObject1).title);
                          paramContext.Qh(((f.a)localObject1).description);
                          paramContext.a(paramau);
                          paramContext.QB(a(paramau.ukF));
                          paramContext.QC(b(paramau.ukF));
                          paramContext.eA(localau.field_msgId);
                          if (paramBoolean)
                          {
                            paramContext.Qk(((f.a)localObject1).giC);
                            paramContext.Ql(((f.a)localObject1).giJ);
                          }
                          paramcf.eDv.eDx.ulB.add(paramContext);
                          paramContext = paramcf.eDv.eDy;
                          paramContext.ulX += 1;
                          bool = true;
                          break;
                          if ((((f.a)localObject1).eAE == null) || (((f.a)localObject1).eAE.length() == 0)) {
                            paramcf.eDv.eDB = R.l.dtv;
                          }
                          do
                          {
                            paramcf.eDv.eDB = R.l.dtC;
                            bool = false;
                            break;
                            at.AR();
                          } while (com.tencent.mm.y.c.isSDCardAvailable());
                          paramcf.eDv.eDB = R.l.dtJ;
                          bool = false;
                          break;
                          paramContext = new ts();
                          paramContext.QR(((f.a)localObject1).title);
                          paramContext.QS(((f.a)localObject1).description);
                          paramContext.zW(((f.a)localObject1).giQ);
                          paramContext.QU(((f.a)localObject1).giR);
                          paramContext.QT(((f.a)localObject1).thumburl);
                          paramau.a(paramContext);
                          paramContext = new th();
                          paramContext.Qy(Y(localau));
                          paramContext.zR(10);
                          paramContext.kx(true);
                          paramContext.kw(true);
                          paramContext.a(paramau);
                          paramContext.QB(a(paramau.ukF));
                          paramContext.QC(b(paramau.ukF));
                          paramcf.eDv.eDx.ulB.add(paramContext);
                          paramContext = paramcf.eDv.eDy;
                          paramContext.ulZ += 1;
                          bool = true;
                          break;
                          paramContext = new tz();
                          paramContext.Rh(((f.a)localObject1).title);
                          paramContext.Ri(((f.a)localObject1).description);
                          paramContext.Rk(((f.a)localObject1).giU);
                          paramContext.Rj(((f.a)localObject1).thumburl);
                          paramau.a(paramContext);
                          paramContext = new th();
                          paramContext.Qy(Y(localau));
                          paramContext.zR(14);
                          paramContext.kx(true);
                          paramContext.kw(true);
                          paramContext.a(paramau);
                          paramContext.QB(a(paramau.ukF));
                          paramContext.QC(b(paramau.ukF));
                          paramcf.eDv.eDx.ulB.add(paramContext);
                          paramContext = paramcf.eDv.eDy;
                          paramContext.umd += 1;
                          bool = true;
                          break;
                          paramContext = new ts();
                          paramContext.QR(((f.a)localObject1).title);
                          paramContext.QS(((f.a)localObject1).description);
                          paramContext.zW(((f.a)localObject1).giW);
                          paramContext.QU(((f.a)localObject1).giX);
                          paramContext.QT(((f.a)localObject1).thumburl);
                          paramau.a(paramContext);
                          paramContext = new th();
                          paramContext.Qy(Y(localau));
                          paramContext.zR(11);
                          paramContext.kx(true);
                          paramContext.kw(true);
                          paramContext.a(paramau);
                          paramContext.QB(a(paramau.ukF));
                          paramContext.QC(b(paramau.ukF));
                          paramcf.eDv.eDx.ulB.add(paramContext);
                          paramContext = paramcf.eDv.eDy;
                          paramContext.uma += 1;
                          bool = true;
                          break;
                          if ((((f.a)localObject1).giV != null) && (((f.a)localObject1).giV.contains("<recordxml>"))) {}
                          for (i = 1;; i = 0)
                          {
                            if (i != 0) {
                              break label3668;
                            }
                            localObject2 = new th();
                            ((th)localObject2).Qy(Y(localau));
                            ((th)localObject2).zR(17);
                            ((th)localObject2).kx(true);
                            ((th)localObject2).Qg(((f.a)localObject1).title);
                            ((th)localObject2).QG(((f.a)localObject1).giV);
                            paramContext = ((f.a)localObject1).description;
                            mn localmn = new mn();
                            localmn.eRu.type = 0;
                            localmn.eRu.eRw = ((f.a)localObject1).giV;
                            com.tencent.mm.sdk.b.a.vgX.m(localmn);
                            localObject1 = localmn.eRv.eRE;
                            if (localObject1 != null) {
                              paramContext = ((com.tencent.mm.protocal.b.a.c)localObject1).desc;
                            }
                            ((th)localObject2).Qh(paramContext);
                            ((th)localObject2).a(paramau);
                            ((th)localObject2).QB(a(paramau.ukF));
                            ((th)localObject2).QC(b(paramau.ukF));
                            ((th)localObject2).eA(localau.field_msgId);
                            paramcf.eDv.eDx.ulB.add(localObject2);
                            bool = true;
                            break;
                          }
                          label3668:
                          if (paramBoolean)
                          {
                            paramContext = a(localau, paramContext.getString(R.l.dvk), paramau);
                            paramcf.eDv.eDx.ulB.add(paramContext);
                            bool = true;
                            break;
                          }
                          if (paramBoolean)
                          {
                            paramContext = a(localau, paramContext.getString(R.l.cUf), paramau);
                            paramcf.eDv.eDx.ulB.add(paramContext);
                            bool = true;
                            break;
                          }
                        }
                      }
                      paramcf.eDv.eDB = R.l.dtC;
                      bool = false;
                    }
                  }
                }
              }
            }
            else
            {
              paramcf.eDv.eDB = R.l.dtC;
              if (paramBoolean) {
                bool = a(paramContext, paramcf, localau, 3);
              }
            }
          }
        }
      }
    }
  }
  
  public static boolean a(Context paramContext, cf paramcf, String paramString, List<au> paramList, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(19254472605696L, 143457);
    if ((paramList == null) || (paramList.isEmpty()) || (paramContext == null))
    {
      w.w("MicroMsg.GetFavRecordDataSource", "fill favorite event fail, event or msgs is null");
      paramcf.eDv.eDB = R.l.dtu;
      GMTrace.o(19254472605696L, 143457);
      return false;
    }
    boolean bool = com.tencent.mm.af.f.dL(paramString);
    Object localObject;
    if ((paramList.size() == 1) && (!paramBoolean2))
    {
      paramList = (au)paramList.get(0);
      if ((paramList.bTs()) || (paramList.bTt()))
      {
        localObject = ((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.biz.a.a.class)).tA(paramList.field_content);
        if ((((k)localObject).glr != null) && (((k)localObject).glr.size() == 1))
        {
          paramBoolean1 = e.a(paramcf, paramList);
          GMTrace.o(19254472605696L, 143457);
          return paramBoolean1;
        }
        paramcf.eDv.eDx = new tt();
        paramcf.eDv.eDy = new ue();
        paramcf.eDv.eDx.a(Oj(paramString));
        paramcf.eDv.type = 14;
        paramBoolean1 = a(paramContext, paramcf, paramList, paramBoolean1);
        GMTrace.o(19254472605696L, 143457);
        return paramBoolean1;
      }
      paramBoolean1 = e.a(paramcf, paramList);
      GMTrace.o(19254472605696L, 143457);
      return paramBoolean1;
    }
    paramcf.eDv.eDx = new tt();
    paramcf.eDv.eDy = new ue();
    int i;
    if (paramContext != null)
    {
      if (!bool) {
        break label479;
      }
      localObject = com.tencent.mm.af.a.e.aj(((au)paramList.get(0)).field_bizChatId);
      if (com.tencent.mm.af.a.e.jf((String)localObject))
      {
        paramcf.eDv.eDx.QW(paramContext.getString(R.l.dQl));
        w.d("MicroMsg.GetFavRecordDataSource", "title %s", new Object[] { paramcf.eDv.eDx.title });
      }
    }
    else
    {
      paramcf.eDv.eDx.a(Oj(paramString));
      paramcf.eDv.type = 14;
      paramString = paramList.iterator();
      i = 0;
      paramBoolean2 = true;
    }
    for (;;)
    {
      if (!paramString.hasNext()) {
        break label598;
      }
      if (a(paramContext, paramcf, (au)paramString.next(), paramBoolean1))
      {
        i = 1;
        continue;
        j localj = com.tencent.mm.af.a.e.ji(paramString);
        paramcf.eDv.eDx.QW(paramContext.getString(R.l.duu, new Object[] { localj.field_userName, com.tencent.mm.af.a.e.jg((String)localObject) }));
        break;
        label479:
        if (com.tencent.mm.y.s.eb(paramString))
        {
          paramcf.eDv.eDx.QW(paramContext.getString(R.l.dQl));
          break;
        }
        localObject = com.tencent.mm.y.q.zG();
        if (((String)localObject).equals(com.tencent.mm.y.r.fr(paramString)))
        {
          paramcf.eDv.eDx.QW(paramContext.getString(R.l.duv, new Object[] { localObject }));
          break;
        }
        paramcf.eDv.eDx.QW(paramContext.getString(R.l.duu, new Object[] { com.tencent.mm.y.q.zG(), com.tencent.mm.y.r.fr(paramString) }));
        break;
      }
      paramBoolean2 = false;
    }
    label598:
    if ((i != 0) && (paramcf.eDv.eDB > 0)) {
      paramcf.eDv.eDB = 0;
    }
    GMTrace.o(19254472605696L, 143457);
    return paramBoolean2;
  }
  
  private static boolean a(cf paramcf, au paramau, boolean paramBoolean)
  {
    GMTrace.i(15697702813696L, 116957);
    Object localObject = new ti();
    ((ti)localObject).c(X(paramau));
    th localth = new th();
    localth.Qy(Y(paramau));
    o.Nh();
    localth.Qu(com.tencent.mm.modelvideo.s.mk(paramau.field_imgPath));
    o.Nh();
    localth.Qv(com.tencent.mm.modelvideo.s.ml(paramau.field_imgPath));
    localth.Qq(com.tencent.mm.a.e.bb(localth.ujR));
    if (paramau.bTH()) {
      localth.zR(15);
    }
    com.tencent.mm.modelvideo.r localr;
    for (;;)
    {
      localr = t.mw(paramau.field_imgPath);
      w.i("MicroMsg.GetFavRecordDataSource", "video length is %d", new Object[] { Integer.valueOf(localr.gsL) });
      if (localr.gsL <= com.tencent.mm.k.b.uc()) {
        break;
      }
      paramcf.eDv.eDB = R.l.dva;
      GMTrace.o(15697702813696L, 116957);
      return false;
      localth.zR(4);
    }
    if ((paramau.bTH()) && (t.my(localr.getFileName())))
    {
      paramcf.eDv.eDB = R.l.dtt;
      GMTrace.o(15697702813696L, 116957);
      return false;
    }
    localth.zQ(localr.hcv);
    localth.a((ti)localObject);
    localth.QB(a(((ti)localObject).ukF));
    localth.QC(b(((ti)localObject).ukF));
    localth.eA(paramau.field_msgId);
    localth.ey(localr.gsL);
    if (paramBoolean)
    {
      localObject = bh.q(localr.Nt(), "msg");
      if (localObject == null) {
        break label495;
      }
      localth.Qk((String)((Map)localObject).get(".msg.videomsg.$cdnvideourl"));
      localth.Ql((String)((Map)localObject).get(".msg.videomsg.$aeskey"));
    }
    for (;;)
    {
      paramcf.eDv.eDx.ulB.add(localth);
      paramcf = paramcf.eDv.eDy;
      paramcf.ulT += 1;
      paramcf = t.mw(paramau.field_imgPath);
      localth.QE(paramcf.eTv);
      paramcf = paramcf.hcE;
      if ((paramcf != null) && (!bg.nm(paramcf.gkO)))
      {
        paramau = new tk();
        paramau.gkI = paramcf.gkI;
        paramau.ulk = paramcf.ulk;
        paramau.gkL = paramcf.gkL;
        paramau.gkM = paramcf.gkM;
        paramau.gkK = paramcf.gkK;
        paramau.gkN = paramcf.gkN;
        paramau.gkO = paramcf.gkO;
        paramau.gkP = paramcf.gkP;
        localth.a(paramau);
      }
      GMTrace.o(15697702813696L, 116957);
      return true;
      label495:
      w.i("MicroMsg.GetFavRecordDataSource", "cdntra parse video recv xml failed");
    }
  }
  
  private static String b(tj paramtj)
  {
    GMTrace.i(769470234624L, 5733);
    paramtj = okV.format(new Date(paramtj.hcs));
    GMTrace.o(769470234624L, 5733);
    return paramtj;
  }
  
  private static boolean b(cf paramcf, au paramau)
  {
    GMTrace.i(769738670080L, 5735);
    ti localti = new ti();
    localti.c(X(paramau));
    Object localObject = bh.q(paramau.field_content, "msg");
    if (localObject != null) {
      try
      {
        to localto = new to();
        localto.QP((String)((Map)localObject).get(".msg.location.$label"));
        localto.q(Double.parseDouble((String)((Map)localObject).get(".msg.location.$x")));
        localto.p(Double.parseDouble((String)((Map)localObject).get(".msg.location.$y")));
        localto.zV(Integer.valueOf((String)((Map)localObject).get(".msg.location.$scale")).intValue());
        localto.QQ((String)((Map)localObject).get(".msg.location.$poiname"));
        localti.a(localto);
        localObject = new th();
        ((th)localObject).Qy(Y(paramau));
        ((th)localObject).zR(6);
        ((th)localObject).kx(true);
        ((th)localObject).kw(true);
        ((th)localObject).a(localti);
        ((th)localObject).QB(a(localti.ukF));
        ((th)localObject).QC(b(localti.ukF));
        paramcf.eDv.eDx.ulB.add(localObject);
        paramau = paramcf.eDv.eDy;
        paramau.ulV += 1;
        GMTrace.o(769738670080L, 5735);
        return true;
      }
      catch (Exception paramau)
      {
        w.e("MicroMsg.GetFavRecordDataSource", "parse failed, %s", new Object[] { paramau.getStackTrace().toString() });
      }
    }
    paramcf.eDv.eDB = R.l.dtD;
    GMTrace.o(769738670080L, 5735);
    return false;
  }
  
  private static boolean c(cf paramcf, au paramau)
  {
    GMTrace.i(770275540992L, 5739);
    for (;;)
    {
      try
      {
        k localk = ((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.biz.a.a.class)).tA(paramau.field_content);
        localObject = localk.glr;
        int i;
        if (localObject != null)
        {
          Iterator localIterator = ((List)localObject).iterator();
          i = 0;
          if (!localIterator.hasNext()) {
            break label476;
          }
          l locall = (l)localIterator.next();
          if (com.tencent.mm.x.h.eU(locall.glC)) {
            continue;
          }
          ti localti = new ti();
          localti.c(X(paramau));
          localti.ukF.QO(localk.eTo);
          localti.ukF.QN(locall.url);
          th localth = new th();
          localth.Qg(locall.title);
          localth.Qh(locall.glz);
          localth.Qy(Y(paramau));
          if (!bg.nm(locall.glx))
          {
            String str = locall.glx;
            int j = paramau.field_type;
            if (i != 0) {
              break label512;
            }
            localObject = "@T";
            localth.Qv(s.s(str, j, (String)localObject));
            localth.kw(true);
            localObject = new uf();
            if (!bg.nm(locall.title)) {
              ((uf)localObject).Rl(locall.title);
            }
            if (!bg.nm(locall.glz)) {
              ((uf)localObject).Rm(locall.glz);
            }
            if (!bg.nm(locall.glx)) {
              ((uf)localObject).Ro(locall.glx);
            }
            if (((uf)localObject).aYq() > 0)
            {
              ((uf)localObject).Aa(1);
              localti.a((uf)localObject);
            }
            localth.zR(5);
            localth.a(localti);
            localth.QB(a(localti.ukF));
            localth.QC(b(localti.ukF));
            paramcf.eDv.eDx.ulB.add(localth);
            localObject = paramcf.eDv.eDy;
            ((ue)localObject).ulU += 1;
            i += 1;
            continue;
          }
          localth.kx(true);
          continue;
        }
        if (i != 0) {
          break label501;
        }
      }
      catch (Exception paramau)
      {
        w.printErrStackTrace("MicroMsg.GetFavRecordDataSource", paramau, "", new Object[0]);
        w.e("MicroMsg.GetFavRecordDataSource", "retransmit app msg error : %s", new Object[] { paramau.getLocalizedMessage() });
        paramcf.eDv.eDB = R.l.dtD;
        GMTrace.o(770275540992L, 5739);
        return false;
      }
      label476:
      paramcf.eDv.eDB = R.l.dtC;
      GMTrace.o(770275540992L, 5739);
      return false;
      label501:
      GMTrace.o(770275540992L, 5739);
      return true;
      label512:
      Object localObject = "@S";
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */