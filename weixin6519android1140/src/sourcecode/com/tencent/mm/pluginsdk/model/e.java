package com.tencent.mm.pluginsdk.model;

import android.content.Intent;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.a.g;
import com.tencent.mm.ac.i;
import com.tencent.mm.ao.f;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.g.a.cf.a;
import com.tencent.mm.g.a.ft;
import com.tencent.mm.g.a.ft.b;
import com.tencent.mm.g.a.mn;
import com.tencent.mm.g.a.mn.b;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.t;
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
import com.tencent.mm.x.f.a;
import com.tencent.mm.x.k;
import com.tencent.mm.x.l;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class e
{
  private static tw W(au paramau)
  {
    GMTrace.i(727728521216L, 5422);
    tw localtw = new tw();
    if (paramau.field_isSend == 1)
    {
      localtw.QY(com.tencent.mm.y.q.zE());
      localtw.QZ(paramau.field_talker);
      if (com.tencent.mm.y.s.eb(paramau.field_talker)) {
        localtw.Rb(localtw.eMI);
      }
    }
    do
    {
      localtw.zZ(1);
      localtw.eE(paramau.field_createTime);
      localtw.Rc(paramau.field_msgSvrId);
      if (paramau.field_msgSvrId > 0L) {
        localtw.Ra(paramau.field_msgSvrId);
      }
      GMTrace.o(727728521216L, 5422);
      return localtw;
      localtw.QY(paramau.field_talker);
      localtw.QZ(com.tencent.mm.y.q.zE());
    } while (!com.tencent.mm.y.s.eb(paramau.field_talker));
    if (paramau.field_content != null) {}
    for (String str = paramau.field_content.substring(0, Math.max(0, paramau.field_content.indexOf(':')));; str = "")
    {
      localtw.Rb(str);
      if ((bg.nm(localtw.ulb)) || (paramau.bTu())) {
        break;
      }
      paramau.setContent(paramau.field_content.substring(localtw.ulb.length() + 1));
      if ((paramau.field_content.length() > 0) && ('\n' == paramau.field_content.charAt(0))) {
        paramau.setContent(paramau.field_content.substring(1));
      }
      if (!paramau.bTN()) {
        break;
      }
      paramau.de(paramau.field_transContent.substring(localtw.ulb.length() + 1));
      if ((paramau.field_transContent.length() <= 0) || ('\n' != paramau.field_transContent.charAt(0))) {
        break;
      }
      paramau.de(paramau.field_transContent.substring(1));
      break;
    }
  }
  
  private static th a(au paramau, f.a parama, int paramInt)
  {
    GMTrace.i(728265392128L, 5426);
    th localth = new th();
    a(localth, paramau);
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
      localth.QF(parama.canvasPageXml);
      localth.zR(paramInt);
      localth.QE(parama.eTv);
      GMTrace.o(728265392128L, 5426);
      return localth;
      localth.kx(true);
    }
  }
  
  private static void a(th paramth1, th paramth2)
  {
    GMTrace.i(728802263040L, 5430);
    paramth1.Qn(paramth2.ujC);
    paramth1.Qo(paramth2.ujE);
    paramth1.Qm(paramth2.ujA);
    paramth1.Qg(paramth2.title);
    paramth1.Qh(paramth2.desc);
    GMTrace.o(728802263040L, 5430);
  }
  
  private static void a(th paramth, au paramau)
  {
    GMTrace.i(727996956672L, 5424);
    if (paramau.field_isSend == 1)
    {
      if ((com.tencent.mm.y.s.eb(paramau.field_talker)) || (paramau.field_talker.equals("filehelper")))
      {
        paramth.Qy(String.valueOf(paramau.field_msgSvrId));
        GMTrace.o(727996956672L, 5424);
        return;
      }
      paramth.Qy(paramau.field_talker + "#" + String.valueOf(paramau.field_msgSvrId));
      GMTrace.o(727996956672L, 5424);
      return;
    }
    paramth.Qy(String.valueOf(paramau.field_msgSvrId));
    GMTrace.o(727996956672L, 5424);
  }
  
  public static boolean a(cf paramcf, int paramInt, String paramString)
  {
    GMTrace.i(727325868032L, 5419);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.GetFavDataSource", "fill favorite event fail, event is null or image path is empty");
      paramcf.eDv.eDB = R.l.dtu;
      GMTrace.o(727325868032L, 5419);
      return false;
    }
    w.i("MicroMsg.GetFavDataSource", "do fill event info(fav simple image), path %s sourceType %d", new Object[] { paramString, Integer.valueOf(paramInt) });
    tt localtt = new tt();
    tw localtw = new tw();
    th localth = new th();
    localth.zR(2);
    localth.Qu(paramString);
    localth.Qt(g.n((localth.toString() + 2 + System.currentTimeMillis()).getBytes()));
    Object localObject = new ft();
    ((ft)localObject).eIo.type = 27;
    ((ft)localObject).eIo.eIq = localth;
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    localObject = ((ft)localObject).eIp.eIy;
    com.tencent.mm.sdk.platformtools.d.b(paramString, 150, 150, Bitmap.CompressFormat.JPEG, 90, (String)localObject);
    localth.Qv((String)localObject);
    localtw.QY(com.tencent.mm.y.q.zE());
    localtw.QZ(com.tencent.mm.y.q.zE());
    localtw.zZ(paramInt);
    localtw.eE(bg.Pv());
    localtt.a(localtw);
    localtt.ulB.add(localth);
    paramcf.eDv.title = localth.title;
    paramcf.eDv.eDx = localtt;
    paramcf.eDv.type = 2;
    GMTrace.o(727325868032L, 5419);
    return true;
  }
  
  public static boolean a(cf paramcf, int paramInt, String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(727191650304L, 5418);
    if (bg.nm(paramString1))
    {
      w.w("MicroMsg.GetFavDataSource", "fill favorite event fail, event is null or image path is empty");
      paramcf.eDv.eDB = R.l.dtu;
      GMTrace.o(727191650304L, 5418);
      return false;
    }
    w.d("MicroMsg.GetFavDataSource", "do fill event info(fav simple file), title %s, desc %s, path %s, sourceType %d", new Object[] { paramString2, paramString3, paramString1, Integer.valueOf(paramInt) });
    if (new File(paramString1).length() > com.tencent.mm.k.b.uc())
    {
      paramcf.eDv.eDB = R.l.dva;
      GMTrace.o(727191650304L, 5418);
      return false;
    }
    tt localtt = new tt();
    tw localtw = new tw();
    th localth = new th();
    localth.Qu(paramString1);
    localth.zR(8);
    localth.Qq(com.tencent.mm.a.e.bb(paramString1));
    localth.kx(true);
    localth.Qg(paramString2);
    localth.Qh(paramString3);
    localtw.QY(com.tencent.mm.y.q.zE());
    localtw.QZ(com.tencent.mm.y.q.zE());
    localtw.zZ(paramInt);
    localtw.eE(bg.Pv());
    localtt.a(localtw);
    localtt.ulB.add(localth);
    paramcf.eDv.title = localth.title;
    paramcf.eDv.desc = localth.title;
    paramcf.eDv.eDx = localtt;
    paramcf.eDv.type = 8;
    GMTrace.o(727191650304L, 5418);
    return true;
  }
  
  public static boolean a(cf paramcf, long paramLong)
  {
    GMTrace.i(727460085760L, 5420);
    boolean bool = a(paramcf, ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cM(paramLong));
    GMTrace.o(727460085760L, 5420);
    return bool;
  }
  
  public static boolean a(cf paramcf, Intent paramIntent)
  {
    GMTrace.i(727057432576L, 5417);
    if (paramcf == null)
    {
      w.w("MicroMsg.GetFavDataSource", "fill favorite event fail, event is null");
      GMTrace.o(727057432576L, 5417);
      return false;
    }
    double d1 = paramIntent.getDoubleExtra("kwebmap_slat", 0.0D);
    double d2 = paramIntent.getDoubleExtra("kwebmap_lng", 0.0D);
    int i = paramIntent.getIntExtra("kwebmap_scale", 0);
    Object localObject1 = bg.aq(paramIntent.getStringExtra("Kwebmap_locaion"), "");
    Object localObject2 = paramIntent.getStringExtra("kPoiName");
    paramIntent.getCharSequenceExtra("kRemark");
    paramIntent.getStringArrayListExtra("kTags");
    paramIntent = new to();
    paramIntent.QP((String)localObject1);
    paramIntent.q(d1);
    paramIntent.p(d2);
    paramIntent.zV(i);
    paramIntent.QQ((String)localObject2);
    localObject1 = new tt();
    localObject2 = new tw();
    String str = com.tencent.mm.y.q.zE();
    ((tw)localObject2).QY(str);
    ((tw)localObject2).QZ(str);
    ((tw)localObject2).zZ(6);
    ((tw)localObject2).eE(bg.Pv());
    ((tt)localObject1).b(paramIntent);
    ((tt)localObject1).a((tw)localObject2);
    paramcf.eDv.eDx = ((tt)localObject1);
    paramcf.eDv.type = 6;
    GMTrace.o(727057432576L, 5417);
    return true;
  }
  
  public static boolean a(cf paramcf, au paramau)
  {
    boolean bool1 = false;
    boolean bool2 = true;
    GMTrace.i(727594303488L, 5421);
    if ((paramcf == null) || (paramau == null))
    {
      w.w("MicroMsg.GetFavDataSource", "fill favorite event fail, event or msg is null");
      if (paramcf != null) {
        paramcf.eDv.eDB = R.l.dtu;
      }
      GMTrace.o(727594303488L, 5421);
      return false;
    }
    au localau = au.ad(paramau);
    if (localau.bTF())
    {
      paramau = new tt();
      paramau.a(W(localau));
      paramcf.eDv.eDx = paramau;
      if (!localau.bTS())
      {
        paramcf.eDv.desc = localau.field_content;
        paramcf.eDv.type = 1;
        if (com.tencent.mm.ui.tools.h.WW(paramcf.eDv.desc) <= com.tencent.mm.k.b.tY()) {
          break label236;
        }
        paramcf.eDv.eDB = R.l.duY;
      }
    }
    label236:
    Object localObject2;
    label326:
    Object localObject3;
    for (;;)
    {
      paramcf.eDv.eDk = localau.field_content;
      if ((bool1) || (paramcf.eDv.eDB == 0)) {
        c.a(localau, paramcf, bool1);
      }
      GMTrace.o(727594303488L, 5421);
      return bool1;
      paramcf.eDv.desc = (localau.field_content + "\n\n" + localau.field_transContent);
      break;
      bool1 = true;
      continue;
      if (localau.bTu())
      {
        localObject1 = new tt();
        ((tt)localObject1).a(W(localau));
        localObject2 = new th();
        a((th)localObject2, localau);
        if (com.tencent.mm.y.s.fY(localau.field_talker))
        {
          paramau = localau.field_imgPath;
          paramau = com.tencent.mm.sdk.platformtools.h.a(com.tencent.mm.plugin.record.b.yZ(), "recbiz_", paramau, ".rec", 2);
          if (bg.nm(paramau))
          {
            paramau = null;
            ((th)localObject2).Qu(paramau);
          }
        }
        for (;;)
        {
          ((th)localObject2).zR(3);
          ((th)localObject2).kx(true);
          paramau = com.tencent.mm.modelvoice.q.mK(localau.field_imgPath);
          if (paramau == null) {
            break;
          }
          ((th)localObject2).Qq(yK(paramau.getFormat()));
          ((th)localObject2).zQ((int)new com.tencent.mm.modelvoice.n(localau.field_content).time);
          paramau = new LinkedList();
          paramau.add(localObject2);
          ((tt)localObject1).av(paramau);
          paramcf.eDv.eDx = ((tt)localObject1);
          paramcf.eDv.type = 3;
          bool1 = true;
          break;
          new File(paramau).exists();
          break label326;
          ((th)localObject2).Qu(com.tencent.mm.modelvoice.q.getFullPath(localau.field_imgPath));
        }
      }
      if (localau.bTE())
      {
        bool1 = b(paramcf, localau);
      }
      else if (localau.bTC())
      {
        paramau = null;
        if (localau.field_msgId > 0L) {
          paramau = com.tencent.mm.ao.n.IZ().aq(localau.field_msgId);
        }
        if (paramau != null)
        {
          localObject1 = paramau;
          if (paramau.gGR > 0L) {}
        }
        else
        {
          localObject1 = paramau;
          if (localau.field_msgSvrId > 0L) {
            localObject1 = com.tencent.mm.ao.n.IZ().ap(localau.field_msgSvrId);
          }
        }
        if (localObject1 == null)
        {
          w.w("MicroMsg.GetFavDataSource", "getImgDataPath: try get imgInfo fail");
          paramcf.eDv.eDB = R.l.dtA;
        }
        else
        {
          paramau = new tt();
          paramau.a(W(localau));
          localObject2 = new th();
          a((th)localObject2, localau);
          ((th)localObject2).zR(2);
          ((th)localObject2).Qu(com.tencent.mm.ao.n.IZ().l(com.tencent.mm.ao.e.c((com.tencent.mm.ao.d)localObject1), "", ""));
          if (((com.tencent.mm.ao.d)localObject1).II())
          {
            localObject1 = com.tencent.mm.ao.n.IZ().gr(((com.tencent.mm.ao.d)localObject1).gHb);
            if (((com.tencent.mm.ao.d)localObject1).gsL > ((com.tencent.mm.ao.d)localObject1).offset) {
              ((th)localObject2).Qu(com.tencent.mm.ao.n.IZ().l("SERVERID://" + localau.field_msgSvrId, "", ""));
            }
          }
          ((th)localObject2).Qv(com.tencent.mm.ao.n.IZ().x(localau.field_imgPath, true));
          localObject1 = new LinkedList();
          ((LinkedList)localObject1).add(localObject2);
          paramau.av((LinkedList)localObject1);
          paramcf.eDv.eDx = paramau;
          paramcf.eDv.type = 2;
          bool1 = true;
        }
      }
      else if ((localau.bTG()) || (localau.bTH()))
      {
        localObject1 = new tt();
        ((tt)localObject1).a(W(localau));
        paramau = new th();
        a(paramau, localau);
        o.Nh();
        paramau.Qv(com.tencent.mm.modelvideo.s.ml(localau.field_imgPath));
        paramau.Qq(com.tencent.mm.a.e.bb(paramau.ujR));
        localObject2 = t.mw(localau.field_imgPath);
        w.i("MicroMsg.GetFavDataSource", "video length is %d", new Object[] { Integer.valueOf(((r)localObject2).gsL) });
        if (((r)localObject2).gsL > com.tencent.mm.k.b.uc())
        {
          paramcf.eDv.eDB = R.l.dva;
        }
        else if ((localau.bTH()) && (t.my(((r)localObject2).getFileName())))
        {
          paramcf.eDv.eDB = R.l.dtt;
        }
        else
        {
          if (((r)localObject2).Nw())
          {
            o.Nh();
            localObject3 = com.tencent.mm.modelvideo.s.mk(localau.field_imgPath);
            w.i("MicroMsg.GetFavDataSource", "this video had finish download, set orgn path [%s]", new Object[] { localObject3 });
            paramau.Qu((String)localObject3);
            label1004:
            paramau.zQ(((r)localObject2).hcv);
            localObject2 = new LinkedList();
            ((LinkedList)localObject2).add(paramau);
            ((tt)localObject1).av((LinkedList)localObject2);
            paramcf.eDv.eDx = ((tt)localObject1);
            if (!localau.bTH()) {
              break label1234;
            }
            paramcf.eDv.type = 16;
            paramau.zR(15);
          }
          for (;;)
          {
            localObject1 = t.mw(localau.field_imgPath);
            paramau.QE(((r)localObject1).eTv);
            localObject1 = ((r)localObject1).hcE;
            if ((localObject1 != null) && (!bg.nm(((bhr)localObject1).gkO)))
            {
              localObject2 = new tk();
              ((tk)localObject2).gkI = ((bhr)localObject1).gkI;
              ((tk)localObject2).ulk = ((bhr)localObject1).ulk;
              ((tk)localObject2).gkL = ((bhr)localObject1).gkL;
              ((tk)localObject2).gkM = ((bhr)localObject1).gkM;
              ((tk)localObject2).gkK = ((bhr)localObject1).gkK;
              ((tk)localObject2).gkN = ((bhr)localObject1).gkN;
              ((tk)localObject2).gkO = ((bhr)localObject1).gkO;
              ((tk)localObject2).gkP = ((bhr)localObject1).gkP;
              paramau.a((tk)localObject2);
            }
            bool1 = true;
            break;
            w.i("MicroMsg.GetFavDataSource", "this video had not finish download, set orgn path null");
            paramau.Qu("");
            break label1004;
            label1234:
            paramcf.eDv.type = 4;
            paramau.zR(4);
          }
        }
      }
      else
      {
        if ((!localau.bTs()) && (!localau.bTt())) {
          break label1277;
        }
        bool1 = c(paramcf, localau);
      }
    }
    label1277:
    if (localau.bTD()) {}
    while ((!localau.aCp()) || (localau.bTJ()))
    {
      paramcf.eDv.eDB = R.l.dtC;
      break;
    }
    paramau = new tt();
    paramau.a(W(localau));
    Object localObject1 = localau.field_content;
    if (localObject1 == null)
    {
      paramcf.eDv.eDB = R.l.dtD;
      bool1 = false;
    }
    for (;;)
    {
      break;
      localObject1 = f.a.eS((String)localObject1);
      if (localObject1 == null)
      {
        paramcf.eDv.eDB = R.l.dtD;
        bool1 = false;
      }
      else
      {
        paramcf.eDv.eDx = paramau;
        localObject2 = paramau.ulz;
        ((tw)localObject2).Re(((f.a)localObject1).appId);
        ((tw)localObject2).Rg(((f.a)localObject1).eTo);
        switch (((f.a)localObject1).type)
        {
        case 8: 
        case 9: 
        case 11: 
        case 12: 
        case 14: 
        case 15: 
        case 16: 
        case 17: 
        case 18: 
        case 21: 
        case 22: 
        case 23: 
        default: 
          paramcf.eDv.eDB = R.l.dtC;
          bool1 = false;
          break;
        case 1: 
          paramcf.eDv.eDx = paramau;
          paramcf.eDv.desc = ((f.a)localObject1).title;
          paramcf.eDv.type = 1;
          bool1 = bool2;
          break;
        case 2: 
          if (!com.tencent.mm.kernel.h.xy().isSDCardAvailable())
          {
            paramcf.eDv.eDB = R.l.dtJ;
            bool1 = false;
          }
          else
          {
            localObject3 = com.tencent.mm.plugin.x.a.afP().Op(((f.a)localObject1).eAE);
            localObject2 = new th();
            a((th)localObject2, localau);
            if (localObject3 != null) {
              ((th)localObject2).Qu(((com.tencent.mm.pluginsdk.model.app.b)localObject3).field_fileFullPath);
            }
            localObject3 = com.tencent.mm.ao.n.IZ().x(localau.field_imgPath, true);
            if (com.tencent.mm.a.e.aZ((String)localObject3)) {
              ((th)localObject2).Qv((String)localObject3);
            }
            ((th)localObject2).zR(2);
            ((th)localObject2).Qg(((f.a)localObject1).title);
            ((th)localObject2).Qh(((f.a)localObject1).description);
            paramau.ulB.add(localObject2);
            paramcf.eDv.type = 2;
            bool1 = bool2;
          }
          break;
        case 3: 
          localObject1 = a(localau, (f.a)localObject1, 7);
          paramau.ulB.add(localObject1);
          paramcf.eDv.type = 7;
          bool1 = bool2;
          break;
        case 4: 
          localObject1 = a(localau, (f.a)localObject1, 4);
          paramau.QW(((th)localObject1).title);
          paramau.QX(((th)localObject1).desc);
          paramau.ulB.add(localObject1);
          paramcf.eDv.type = 4;
          bool1 = bool2;
          break;
        case 5: 
          if ((((f.a)localObject1).url != null) && (!((f.a)localObject1).url.equals("")))
          {
            paramau.ulz.Rf(((f.a)localObject1).url);
            localObject1 = a(localau, (f.a)localObject1, 5);
            paramau.ulB.add(localObject1);
            paramau.QW(((th)localObject1).title);
            paramau.QX(((th)localObject1).desc);
            paramcf.eDv.type = 5;
            bool1 = bool2;
          }
          else
          {
            paramcf.eDv.eDB = R.l.dty;
            bool1 = false;
          }
          break;
        case 6: 
          if (!com.tencent.mm.kernel.h.xy().isSDCardAvailable())
          {
            paramcf.eDv.eDB = R.l.dtJ;
            bool1 = false;
          }
          else
          {
            localObject3 = com.tencent.mm.plugin.x.a.afP().Op(((f.a)localObject1).eAE);
            localObject2 = new th();
            if (localObject3 != null) {
              ((th)localObject2).Qu(((com.tencent.mm.pluginsdk.model.app.b)localObject3).field_fileFullPath);
            }
            a((th)localObject2, localau);
            ((th)localObject2).zR(8);
            ((th)localObject2).Qq(((f.a)localObject1).giw);
            localObject3 = com.tencent.mm.ao.n.IZ().x(localau.field_imgPath, true);
            if (bg.nm((String)localObject3)) {
              ((th)localObject2).kx(true);
            }
            if (com.tencent.mm.a.e.aZ((String)localObject3)) {
              ((th)localObject2).Qv((String)localObject3);
            }
            ((th)localObject2).Qg(((f.a)localObject1).title);
            ((th)localObject2).Qh(((f.a)localObject1).description);
            paramau.ulB.add(localObject2);
            paramcf.eDv.desc = ((f.a)localObject1).title;
            paramcf.eDv.type = 8;
            bool1 = bool2;
          }
          break;
        case 7: 
          if ((((f.a)localObject1).eAE == null) || (((f.a)localObject1).eAE.length() == 0)) {
            paramcf.eDv.eDB = R.l.dtv;
          }
          while (com.tencent.mm.kernel.h.xy().isSDCardAvailable())
          {
            paramcf.eDv.eDB = R.l.dtC;
            bool1 = false;
            break;
          }
          paramcf.eDv.eDB = R.l.dtJ;
          bool1 = false;
          break;
        case 10: 
          localObject2 = new ts();
          ((ts)localObject2).QR(((f.a)localObject1).title);
          ((ts)localObject2).QS(((f.a)localObject1).description);
          ((ts)localObject2).zW(((f.a)localObject1).giQ);
          ((ts)localObject2).QU(((f.a)localObject1).giR);
          ((ts)localObject2).QT(((f.a)localObject1).thumburl);
          paramcf.eDv.title = ((f.a)localObject1).title;
          paramcf.eDv.desc = ((f.a)localObject1).description;
          paramcf.eDv.type = 10;
          paramau.b((ts)localObject2);
          bool1 = bool2;
          break;
        case 20: 
          localObject2 = new tz();
          ((tz)localObject2).Rh(((f.a)localObject1).title);
          ((tz)localObject2).Ri(((f.a)localObject1).description);
          ((tz)localObject2).Rk(((f.a)localObject1).giU);
          ((tz)localObject2).Rj(((f.a)localObject1).thumburl);
          paramcf.eDv.title = ((f.a)localObject1).title;
          paramcf.eDv.desc = ((f.a)localObject1).description;
          paramcf.eDv.type = 15;
          paramau.b((tz)localObject2);
          bool1 = bool2;
          break;
        case 13: 
          localObject2 = new ts();
          ((ts)localObject2).QR(((f.a)localObject1).title);
          ((ts)localObject2).QS(((f.a)localObject1).description);
          ((ts)localObject2).zW(((f.a)localObject1).giW);
          ((ts)localObject2).QU(((f.a)localObject1).giX);
          ((ts)localObject2).QT(((f.a)localObject1).thumburl);
          paramcf.eDv.title = ((f.a)localObject1).title;
          paramcf.eDv.desc = ((f.a)localObject1).description;
          paramcf.eDv.type = 11;
          paramau.b((ts)localObject2);
          bool1 = bool2;
          break;
        case 19: 
        case 24: 
          paramcf.eDv.eDy = new ue();
          bool1 = a(paramcf, (f.a)localObject1, paramau, localau);
        }
      }
    }
  }
  
  private static boolean a(cf paramcf, f.a parama, tt paramtt, au paramau)
  {
    GMTrace.i(728533827584L, 5428);
    Object localObject1 = new mn();
    ((mn)localObject1).eRu.type = 0;
    ((mn)localObject1).eRu.eRw = parama.giV;
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
    com.tencent.mm.protocal.b.a.c localc = ((mn)localObject1).eRv.eRE;
    if (localc == null)
    {
      w.w("MicroMsg.GetFavDataSource", "fill favorite event fail, parse record msg null");
      paramcf.eDv.eDB = R.l.dtD;
      GMTrace.o(728533827584L, 5428);
      return false;
    }
    paramtt.QW(localc.title);
    Iterator localIterator = localc.glr.iterator();
    int i = 0;
    if (localIterator.hasNext())
    {
      localObject1 = (th)localIterator.next();
      switch (((th)localObject1).aGU)
      {
      case 9: 
      case 13: 
      default: 
        parama = null;
        label226:
        if (parama != null) {
          if (paramau.field_isSend == 1) {
            if ((com.tencent.mm.y.s.eb(paramau.field_talker)) || (paramau.field_talker.equals("filehelper")))
            {
              localObject1 = String.format("%d$%d", new Object[] { Long.valueOf(paramau.field_msgSvrId), Integer.valueOf(i) });
              label291:
              parama.Qy((String)localObject1);
              paramtt.ulB.add(parama);
              i += 1;
            }
          }
        }
        break;
      }
    }
    for (;;)
    {
      break;
      long l = paramau.field_msgId;
      parama = p((th)localObject1);
      parama.zR(3);
      if (!bg.nm(((th)localObject1).ukv))
      {
        localObject2 = new mn();
        ((mn)localObject2).eRu.type = 1;
        ((mn)localObject2).eRu.eIc = ((th)localObject1);
        ((mn)localObject2).eRu.eDr = l;
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
        if ((bg.nm(((mn)localObject2).eRv.eRF)) && (bg.nm(((mn)localObject2).eRv.eIy))) {
          w.e("MicroMsg.GetFavDataSource", "cloneImgItem:not record plugin ? get paths error");
        }
        parama.Qu(((mn)localObject2).eRv.eRF);
        parama.zQ(((th)localObject1).duration);
        parama.kx(true);
        parama.kw(false);
        parama.Qq(((th)localObject1).ujI);
      }
      localObject1 = paramcf.eDv.eDy;
      ((ue)localObject1).ulS += 1;
      break label226;
      parama = p((th)localObject1);
      parama.zR(1);
      parama.Qh(((th)localObject1).desc);
      localObject1 = paramcf.eDv.eDy;
      ((ue)localObject1).ulQ += 1;
      break label226;
      l = paramau.field_msgId;
      parama = p((th)localObject1);
      parama.zR(2);
      Object localObject2 = new mn();
      ((mn)localObject2).eRu.type = 1;
      ((mn)localObject2).eRu.eIc = ((th)localObject1);
      ((mn)localObject2).eRu.eDr = l;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
      if ((bg.nm(((mn)localObject2).eRv.eRF)) && (bg.nm(((mn)localObject2).eRv.eIy))) {
        w.e("MicroMsg.GetFavDataSource", "cloneImgItem:not record plugin ? get paths error");
      }
      parama.Qu(((mn)localObject2).eRv.eRF);
      parama.Qv(((mn)localObject2).eRv.eIy);
      parama.kx(false);
      parama.kw(false);
      localObject1 = paramcf.eDv.eDy;
      ((ue)localObject1).ulR += 1;
      break label226;
      l = paramau.field_msgId;
      parama = p((th)localObject1);
      a(parama, (th)localObject1);
      parama.zR(5);
      localObject2 = new mn();
      ((mn)localObject2).eRu.type = 1;
      ((mn)localObject2).eRu.eIc = ((th)localObject1);
      ((mn)localObject2).eRu.eDr = l;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
      if ((bg.nm(((mn)localObject2).eRv.eRF)) && (bg.nm(((mn)localObject2).eRv.eIy))) {
        w.e("MicroMsg.GetFavDataSource", "cloneUrlItem:not record plugin ? get paths error");
      }
      parama.Qv(((mn)localObject2).eRv.eIy);
      parama.kx(false);
      if ((((th)localObject1).ukn != null) && (((th)localObject1).ukn.ukJ != null))
      {
        localObject2 = new uf();
        ((uf)localObject2).Rl(((th)localObject1).ukn.ukJ.title);
        ((uf)localObject2).Rm(((th)localObject1).ukn.ukJ.desc);
        ((uf)localObject2).Ro(((th)localObject1).ukn.ukJ.thumbUrl);
        ((uf)localObject2).Aa(((th)localObject1).ukn.ukJ.umh);
        ((uf)localObject2).Rn(((th)localObject1).ukn.ukJ.umf);
        parama.ukn.a((uf)localObject2);
      }
      localObject1 = paramcf.eDv.eDy;
      ((ue)localObject1).ulU += 1;
      break label226;
      l = paramau.field_msgId;
      parama = p((th)localObject1);
      a(parama, (th)localObject1);
      if (((th)localObject1).aGU == 15) {
        parama.zR(15);
      }
      for (;;)
      {
        localObject2 = new mn();
        ((mn)localObject2).eRu.type = 1;
        ((mn)localObject2).eRu.eIc = ((th)localObject1);
        ((mn)localObject2).eRu.eDr = l;
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
        if ((bg.nm(((mn)localObject2).eRv.eRF)) && (bg.nm(((mn)localObject2).eRv.eIy))) {
          w.e("MicroMsg.GetFavDataSource", "cloneVideoItem:not record plugin ? get paths error");
        }
        parama.kw(false);
        parama.Qu(((mn)localObject2).eRv.eRF);
        parama.kx(false);
        parama.Qv(((mn)localObject2).eRv.eIy);
        parama.zQ(((th)localObject1).duration);
        localObject1 = paramcf.eDv.eDy;
        ((ue)localObject1).ulT += 1;
        break;
        parama.zR(4);
      }
      parama = p((th)localObject1);
      parama.zR(6);
      if ((((th)localObject1).ukn != null) && (((th)localObject1).ukn.ukH != null))
      {
        localObject2 = new to();
        ((to)localObject2).QP(((th)localObject1).ukn.ukH.label);
        ((to)localObject2).q(((th)localObject1).ukn.ukH.lat);
        ((to)localObject2).p(((th)localObject1).ukn.ukH.lng);
        ((to)localObject2).zV(((th)localObject1).ukn.ukH.eMn);
        ((to)localObject2).QQ(((th)localObject1).ukn.ukH.eQm);
        parama.ukn.a((to)localObject2);
      }
      localObject1 = paramcf.eDv.eDy;
      ((ue)localObject1).ulV += 1;
      break label226;
      l = paramau.field_msgId;
      parama = p((th)localObject1);
      a(parama, (th)localObject1);
      parama.zR(7);
      localObject2 = new mn();
      ((mn)localObject2).eRu.type = 1;
      ((mn)localObject2).eRu.eIc = ((th)localObject1);
      ((mn)localObject2).eRu.eDr = l;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
      if ((bg.nm(((mn)localObject2).eRv.eRF)) && (bg.nm(((mn)localObject2).eRv.eIy))) {
        w.e("MicroMsg.GetFavDataSource", "cloneMusicItem:not record plugin ? get paths error");
      }
      parama.Qv(((mn)localObject2).eRv.eIy);
      parama.kx(false);
      localObject1 = paramcf.eDv.eDy;
      ((ue)localObject1).ulW += 1;
      break label226;
      l = paramau.field_msgId;
      parama = p((th)localObject1);
      a(parama, (th)localObject1);
      parama.zR(8);
      localObject2 = new mn();
      ((mn)localObject2).eRu.type = 1;
      ((mn)localObject2).eRu.eIc = ((th)localObject1);
      ((mn)localObject2).eRu.eDr = l;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
      if ((bg.nm(((mn)localObject2).eRv.eRF)) && (bg.nm(((mn)localObject2).eRv.eIy))) {
        w.e("MicroMsg.GetFavDataSource", "cloneFileItem:not record plugin ? get paths error");
      }
      parama.Qu(((mn)localObject2).eRv.eRF);
      parama.Qv(((mn)localObject2).eRv.eIy);
      parama.kw(false);
      parama.Qq(((th)localObject1).ujI);
      localObject1 = paramcf.eDv.eDy;
      ((ue)localObject1).ulX += 1;
      break label226;
      parama = c((th)localObject1, ((th)localObject1).aGU);
      localObject1 = paramcf.eDv.eDy;
      ((ue)localObject1).ulZ += 1;
      break label226;
      parama = c((th)localObject1, ((th)localObject1).aGU);
      localObject1 = paramcf.eDv.eDy;
      ((ue)localObject1).uma += 1;
      break label226;
      parama = p((th)localObject1);
      parama.zR(14);
      if ((((th)localObject1).ukn != null) && (((th)localObject1).ukn.ukN != null))
      {
        localObject2 = new tz();
        ((tz)localObject2).Rh(((th)localObject1).ukn.ukN.title);
        ((tz)localObject2).Ri(((th)localObject1).ukn.ukN.desc);
        ((tz)localObject2).Rk(((th)localObject1).ukn.ukN.info);
        ((tz)localObject2).Rj(((th)localObject1).ukn.ukN.thumbUrl);
        parama.ukn.a((tz)localObject2);
      }
      localObject1 = paramcf.eDv.eDy;
      ((ue)localObject1).umd += 1;
      break label226;
      parama = p((th)localObject1);
      parama.zR(16);
      parama.Qh(((th)localObject1).desc);
      localObject1 = paramcf.eDv.eDy;
      ((ue)localObject1).ume += 1;
      break label226;
      parama = p((th)localObject1);
      parama.Qg(((th)localObject1).title);
      parama.Qh(((th)localObject1).desc);
      parama.zR(17);
      parama.QG(((th)localObject1).ukD);
      break label226;
      localObject1 = String.format("%s#%d$%d", new Object[] { paramau.field_talker, Long.valueOf(paramau.field_msgSvrId), Integer.valueOf(i) });
      break label291;
      localObject1 = String.format("%d$%d", new Object[] { Long.valueOf(paramau.field_msgSvrId), Integer.valueOf(i) });
      break label291;
      if ((!bg.nm(((th)localc.glr.get(0)).ujI)) && (((th)localc.glr.get(0)).ujI.equals(".htm"))) {}
      for (paramcf.eDv.type = 18;; paramcf.eDv.type = 14)
      {
        GMTrace.o(728533827584L, 5428);
        return true;
      }
    }
  }
  
  private static boolean b(cf paramcf, au paramau)
  {
    GMTrace.i(727862738944L, 5423);
    tt localtt = new tt();
    localtt.a(W(paramau));
    paramau = bh.q(paramau.field_content, "msg");
    if (paramau != null) {
      try
      {
        to localto = new to();
        localto.QP((String)paramau.get(".msg.location.$label"));
        localto.q(Double.parseDouble((String)paramau.get(".msg.location.$x")));
        localto.p(Double.parseDouble((String)paramau.get(".msg.location.$y")));
        localto.zV(Integer.valueOf((String)paramau.get(".msg.location.$scale")).intValue());
        localto.QQ((String)paramau.get(".msg.location.$poiname"));
        localtt.b(localto);
        paramcf.eDv.type = 6;
        paramcf.eDv.eDx = localtt;
        GMTrace.o(727862738944L, 5423);
        return true;
      }
      catch (Exception paramau)
      {
        w.e("MicroMsg.GetFavDataSource", "parse failed, %s", new Object[] { paramau.getStackTrace().toString() });
      }
    }
    paramcf.eDv.eDB = R.l.dtD;
    GMTrace.o(727862738944L, 5423);
    return false;
  }
  
  private static th c(th paramth, int paramInt)
  {
    GMTrace.i(728936480768L, 5431);
    th localth = p(paramth);
    localth.zR(paramInt);
    if ((paramth.ukn != null) && (paramth.ukn.ukL != null))
    {
      ts localts = new ts();
      localts.QR(paramth.ukn.ukL.title);
      localts.QS(paramth.ukn.ukL.desc);
      localts.zW(paramth.ukn.ukL.type);
      localts.QU(paramth.ukn.ukL.info);
      localts.QT(paramth.ukn.ukL.thumbUrl);
      localth.ukn.a(localts);
    }
    GMTrace.o(728936480768L, 5431);
    return localth;
  }
  
  private static boolean c(cf paramcf, au paramau)
  {
    GMTrace.i(728399609856L, 5427);
    tt localtt = new tt();
    Object localObject1 = W(paramau);
    localtt.a((tw)localObject1);
    try
    {
      Object localObject2 = ((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.biz.a.a.class)).tA(paramau.field_content);
      Object localObject3 = ((k)localObject2).glr;
      ((tw)localObject1).Rg(((k)localObject2).eTo);
      if ((localObject3 != null) && (((List)localObject3).size() > paramcf.eDv.eDz))
      {
        w.i("MicroMsg.GetFavDataSource", "favorite biz msg, index is %d", new Object[] { Integer.valueOf(paramcf.eDv.eDz) });
        localObject2 = (l)((List)localObject3).get(paramcf.eDv.eDz);
        if (com.tencent.mm.x.h.eU(((l)localObject2).glC))
        {
          paramcf.eDv.eDB = R.l.dtC;
          GMTrace.o(728399609856L, 5427);
          return false;
        }
        ((tw)localObject1).Rf(((l)localObject2).url);
        if (paramcf.eDv.eDz > 0) {
          ((tw)localObject1).Ra("");
        }
        localObject3 = new th();
        ((th)localObject3).Qg(((l)localObject2).title);
        ((th)localObject3).Qh(((l)localObject2).glz);
        a((th)localObject3, paramau);
        localObject1 = ((l)localObject2).glx;
        if (!bg.nm((String)localObject1)) {
          break label505;
        }
        com.tencent.mm.ac.h localh = com.tencent.mm.ac.n.Di().ig(paramau.field_talker);
        if (localh == null) {
          break label505;
        }
        localObject1 = localh.Do();
      }
      for (;;)
      {
        if (!bg.nm((String)localObject1))
        {
          int i = paramau.field_type;
          if (paramcf.eDv.eDz > 0)
          {
            paramau = "@S";
            ((th)localObject3).Qv(s.s((String)localObject1, i, paramau));
            ((th)localObject3).kx(false);
            if ((bg.nm(((th)localObject3).ujT)) || (!FileOp.aZ(((th)localObject3).ujT)))
            {
              ((th)localObject3).Qp((String)localObject1);
              ((th)localObject3).kx(true);
              paramau = new uf();
              paramau.Ro((String)localObject1);
              localtt.b(paramau);
            }
          }
        }
        for (;;)
        {
          ((th)localObject3).kw(true);
          ((th)localObject3).zR(5);
          localtt.ulB.add(localObject3);
          paramcf.eDv.eDx = localtt;
          paramcf.eDv.desc = ((l)localObject2).title;
          paramcf.eDv.type = 5;
          GMTrace.o(728399609856L, 5427);
          return true;
          paramau = "@T";
          break;
          ((th)localObject3).kx(true);
        }
      }
    }
    catch (Exception paramau)
    {
      w.printErrStackTrace("MicroMsg.GetFavDataSource", paramau, "", new Object[0]);
      w.e("MicroMsg.GetFavDataSource", "retransmit app msg error : %s", new Object[] { paramau.getLocalizedMessage() });
      paramcf.eDv.eDB = R.l.dtD;
      GMTrace.o(728399609856L, 5427);
      return false;
    }
  }
  
  private static th p(th paramth)
  {
    GMTrace.i(728668045312L, 5429);
    th localth = new th();
    ti localti = new ti();
    tj localtj1 = new tj();
    tj localtj2 = paramth.ukn.ukF;
    if (localtj2.ukX) {
      localtj1.QH(localtj2.eMI);
    }
    if (localtj2.ukY) {
      localtj1.QI(localtj2.toUser);
    }
    if (localtj2.ulc) {
      localtj1.QK(localtj2.ulb);
    }
    localtj1.zU(1);
    localtj1.eB(bg.Pv());
    localti.c(localtj1);
    localth.a(localti);
    localth.QB(paramth.ukp);
    localth.QC(paramth.ukr);
    localth.kx(true);
    localth.kw(true);
    localth.QD(paramth.ukv);
    localth.zT(paramth.ukB);
    localth.Qr(paramth.ujK);
    localth.Qs(paramth.ujM);
    localth.ey(paramth.ujO);
    localth.Qw(paramth.ujV);
    localth.Qx(paramth.ujX);
    localth.ez(paramth.ujZ);
    GMTrace.o(728668045312L, 5429);
    return localth;
  }
  
  public static String yK(int paramInt)
  {
    GMTrace.i(728131174400L, 5425);
    if (paramInt == 1)
    {
      GMTrace.o(728131174400L, 5425);
      return "speex";
    }
    if (paramInt == 4)
    {
      GMTrace.o(728131174400L, 5425);
      return "silk";
    }
    GMTrace.o(728131174400L, 5425);
    return "amr";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */