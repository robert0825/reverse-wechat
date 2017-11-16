package com.tencent.mm.plugin.record.a;

import android.content.Context;
import android.graphics.Bitmap.CompressFormat;
import android.util.SparseIntArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.g.a.cf.a;
import com.tencent.mm.g.a.rp;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.pluginsdk.model.app.am.a;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.ti;
import com.tencent.mm.protocal.c.tj;
import com.tencent.mm.protocal.c.to;
import com.tencent.mm.protocal.c.tp;
import com.tencent.mm.protocal.c.ts;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.protocal.c.tz;
import com.tencent.mm.protocal.c.uf;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.au.a;
import com.tencent.mm.storage.x;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.q;
import com.tencent.mm.y.r;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public final class m
{
  private static final com.tencent.mm.a.f<Integer, com.tencent.mm.protocal.b.a.c> gli;
  
  static
  {
    GMTrace.i(7510824058880L, 55960);
    gli = new com.tencent.mm.a.f(32);
    GMTrace.o(7510824058880L, 55960);
  }
  
  public static com.tencent.mm.protocal.b.a.c Fw(String paramString)
  {
    GMTrace.i(7509884534784L, 55953);
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.RecordMsgLogic", "xml is null");
      GMTrace.o(7509884534784L, 55953);
      return null;
    }
    int i = paramString.hashCode();
    Object localObject = (com.tencent.mm.protocal.b.a.c)gli.get(Integer.valueOf(i));
    if (localObject != null)
    {
      w.d("MicroMsg.RecordMsgLogic", "get record msg data from cache");
      GMTrace.o(7509884534784L, 55953);
      return (com.tencent.mm.protocal.b.a.c)localObject;
    }
    if (paramString.trim().startsWith("<recordinfo>")) {}
    for (localObject = bh.q(paramString, "recordinfo"); localObject == null; localObject = bh.q("<recordinfo>" + paramString + "</recordinfo>", "recordinfo"))
    {
      w.e("MicroMsg.RecordMsgLogic", "values is null: %s", new Object[] { paramString });
      GMTrace.o(7509884534784L, 55953);
      return null;
    }
    com.tencent.mm.protocal.b.a.c localc = new com.tencent.mm.protocal.b.a.c();
    localc.title = ((String)((Map)localObject).get(".recordinfo.title"));
    localc.desc = ((String)((Map)localObject).get(".recordinfo.desc"));
    localc.tLW = ((String)((Map)localObject).get(".recordinfo.favusername"));
    if (((Map)localObject).get(".recordinfo.noteinfo") != null)
    {
      tp localtp = new tp();
      localtp.ulu = ((String)((Map)localObject).get(".recordinfo.noteinfo.noteeditor"));
      localtp.ult = ((String)((Map)localObject).get(".recordinfo.noteinfo.noteauthor"));
      localc.tLX = localtp;
      localc.tLY = bg.getLong((String)((Map)localObject).get(".recordinfo.edittime"), 0L);
    }
    a(paramString, localc);
    gli.put(Integer.valueOf(i), localc);
    GMTrace.o(7509884534784L, 55953);
    return localc;
  }
  
  public static int a(Context paramContext, String paramString1, String paramString2, List<au> paramList, cf paramcf, com.tencent.mm.protocal.b.a.d paramd)
  {
    GMTrace.i(7508139704320L, 55940);
    if (bg.nm(paramString1))
    {
      w.w("MicroMsg.RecordMsgLogic", "send record msg error, touser is null");
      GMTrace.o(7508139704320L, 55940);
      return -1;
    }
    if ((paramList == null) || (paramList.isEmpty()))
    {
      w.w("MicroMsg.RecordMsgLogic", "send record msg error, msginfo error");
      GMTrace.o(7508139704320L, 55940);
      return -1;
    }
    com.tencent.mm.protocal.b.a.d locald;
    if (paramcf != null)
    {
      locald = paramd;
      if (paramd != null) {}
    }
    else
    {
      paramcf = new cf();
      if (!com.tencent.mm.pluginsdk.model.g.a(paramContext, paramcf, paramString2, paramList, true, true))
      {
        GMTrace.o(7508139704320L, 55940);
        return -1;
      }
      locald = a(paramContext, paramcf, paramString2);
    }
    paramList = a(locald.title, locald.desc, paramcf.eDv.eDx);
    paramd = new au();
    paramString2 = null;
    if (!bg.nm(locald.eIy))
    {
      paramContext = bg.readFromFile(locald.eIy);
      if (paramContext != null) {
        if (paramContext.length <= 32768) {
          break label441;
        }
      }
    }
    long l;
    int i;
    label441:
    for (paramContext = com.tencent.mm.ao.n.IZ().a(paramContext, false, Bitmap.CompressFormat.JPEG);; paramContext = com.tencent.mm.ao.n.IZ().f(8, paramContext))
    {
      w.d("MicroMsg.RecordMsgLogic", com.tencent.mm.compatible.util.g.tC() + " thumbData MsgInfo path:" + paramContext);
      if (!bg.nm(paramContext)) {
        paramd.dc(paramContext);
      }
      paramd.setContent(f.a.a(paramList, null, null));
      paramd.dB(1);
      paramd.db(paramString1);
      paramd.E(bc.gR(paramString1));
      paramd.dC(1);
      paramd.setType(49);
      if (com.tencent.mm.af.f.dL(paramString1)) {
        paramd.dh(com.tencent.mm.af.a.e.Br());
      }
      at.AR();
      l = com.tencent.mm.y.c.yM().P(paramd);
      w.d("MicroMsg.RecordMsgLogic", com.tencent.mm.compatible.util.g.tC() + " msginfo insert id: " + l);
      if (l >= 0L) {
        break label454;
      }
      w.e("MicroMsg.RecordMsgLogic", com.tencent.mm.compatible.util.g.tC() + "insert msg failed :" + l);
      i = com.tencent.mm.compatible.util.g.tA();
      GMTrace.o(7508139704320L, 55940);
      return 0 - i;
      paramContext = paramString2;
      if (locald.eRy != 0) {
        break;
      }
      paramContext = paramString2;
      if (bg.nm(locald.lbo)) {
        break;
      }
      paramContext = com.tencent.mm.sdk.platformtools.d.O(com.tencent.mm.ac.b.a(locald.lbo, false, -1));
      break;
    }
    label454:
    w.i("MicroMsg.RecordMsgLogic", com.tencent.mm.compatible.util.g.tA() + " new msg inserted to db , local id = " + l);
    paramd.C(l);
    paramContext = new com.tencent.mm.x.f();
    paramContext.field_xml = paramd.field_content;
    paramContext.field_title = paramList.title;
    paramContext.field_type = paramList.type;
    paramContext.field_description = paramList.description;
    paramContext.field_msgId = l;
    an.bJI().b(paramContext);
    paramContext = paramcf.eDv.eDx.ulB.iterator();
    for (boolean bool = false; paramContext.hasNext(); bool = true)
    {
      label566:
      paramString2 = (th)paramContext.next();
      paramd = paramString2.toString();
      i = paramString2.aGU;
      paramString2.Qt(com.tencent.mm.a.g.n((paramd + i + System.currentTimeMillis()).getBytes()));
      if ((!bool) && (!com.tencent.mm.a.e.aZ(paramString2.ujR)) && (!com.tencent.mm.a.e.aZ(paramString2.ujT)) && (bg.nm(paramString2.ujt)) && (bg.nm(paramString2.giD))) {
        break label566;
      }
    }
    w.d("MicroMsg.RecordMsgLogic", "summerrecord needNetScene:%b", new Object[] { Boolean.valueOf(bool) });
    if (bool)
    {
      paramContext = new k();
      paramContext.field_msgId = l;
      paramContext.field_title = paramList.title;
      paramContext.field_desc = paramList.description;
      paramContext.field_toUser = paramString1;
      paramContext.field_dataProto = paramcf.eDv.eDx;
      paramContext.field_type = 3;
      paramContext.field_localId = (new Random().nextInt(2147483645) + 1);
      w.i("MicroMsg.RecordMsgLogic", "summerrecord needNetScene insert ret:%b, id:%d, localid:%d", new Object[] { Boolean.valueOf(s.baK().b(paramContext)), Long.valueOf(l), Integer.valueOf(paramContext.field_localId) });
      s.baM().a(paramContext);
    }
    for (;;)
    {
      GMTrace.o(7508139704320L, 55940);
      return 0;
      w.d("MicroMsg.RecordMsgLogic", "summerrecord do not trans cdn, directly send msg id:%d", new Object[] { Long.valueOf(l) });
      an.bJK();
      am.a.ev(l);
    }
  }
  
  public static int a(String paramString1, tt paramtt, String paramString2, String paramString3, String paramString4, int paramInt, String paramString5)
  {
    GMTrace.i(7508676575232L, 55944);
    if (bg.nm(paramString1))
    {
      w.w("MicroMsg.RecordMsgLogic", "send record msg error, touser is null");
      GMTrace.o(7508676575232L, 55944);
      return -1;
    }
    if ((paramtt == null) || (paramtt.ulB.isEmpty()))
    {
      w.w("MicroMsg.RecordMsgLogic", "send record msg error, favprotoitem error");
      GMTrace.o(7508676575232L, 55944);
      return -1;
    }
    paramString3 = a(paramString2, paramString3, paramtt);
    au localau = new au();
    paramString2 = null;
    if (!bg.nm(paramString4))
    {
      paramString2 = bg.readFromFile(paramString4);
      if (paramString2 != null) {
        if (paramString2.length <= 32768) {
          break label370;
        }
      }
    }
    long l;
    label370:
    for (paramString2 = com.tencent.mm.ao.n.IZ().a(paramString2, false, Bitmap.CompressFormat.JPEG);; paramString2 = com.tencent.mm.ao.n.IZ().f(8, paramString2))
    {
      w.d("MicroMsg.RecordMsgLogic", com.tencent.mm.compatible.util.g.tC() + " thumbData MsgInfo path:" + paramString2);
      if (!bg.nm(paramString2)) {
        localau.dc(paramString2);
      }
      localau.setContent(f.a.a(paramString3, null, null));
      localau.dB(1);
      localau.db(paramString1);
      localau.E(bc.gR(paramString1));
      localau.dC(1);
      localau.setType(49);
      if (com.tencent.mm.af.f.dL(paramString1)) {
        localau.dh(com.tencent.mm.af.a.e.Br());
      }
      at.AR();
      l = com.tencent.mm.y.c.yM().P(localau);
      w.d("MicroMsg.RecordMsgLogic", com.tencent.mm.compatible.util.g.tC() + " msginfo insert id: " + l);
      if (l >= 0L) {
        break label383;
      }
      w.e("MicroMsg.RecordMsgLogic", com.tencent.mm.compatible.util.g.tC() + "insert msg failed :" + l);
      paramInt = com.tencent.mm.compatible.util.g.tA();
      GMTrace.o(7508676575232L, 55944);
      return 0 - paramInt;
      if (paramInt != 0)
      {
        paramString2 = com.tencent.mm.sdk.platformtools.d.O(com.tencent.mm.sdk.platformtools.d.Ag(paramInt));
        break;
      }
      if (bg.nm(paramString5)) {
        break;
      }
      paramString2 = com.tencent.mm.sdk.platformtools.d.O(com.tencent.mm.ac.b.a(paramString5, false, -1));
      break;
    }
    label383:
    w.i("MicroMsg.RecordMsgLogic", com.tencent.mm.compatible.util.g.tA() + " new msg inserted to db , local id = " + l);
    localau.C(l);
    paramString2 = new com.tencent.mm.x.f();
    paramString2.field_xml = localau.field_content;
    paramString2.field_title = paramString3.title;
    paramString2.field_type = paramString3.type;
    paramString2.field_description = paramString3.description;
    paramString2.field_msgId = l;
    an.bJI().b(paramString2);
    paramString2 = paramtt.ulB.iterator();
    do
    {
      if (!paramString2.hasNext()) {
        break;
      }
      paramString4 = (th)paramString2.next();
    } while ((bg.nm(paramString4.ujt)) && (bg.nm(paramString4.giD)));
    for (paramInt = 1;; paramInt = 0)
    {
      if ((paramInt != 0) || (com.tencent.mm.pluginsdk.model.c.tmH))
      {
        paramString2 = new k();
        paramString2.field_msgId = l;
        paramString2.field_title = paramString3.title;
        paramString2.field_desc = paramString3.description;
        paramString2.field_toUser = paramString1;
        paramString2.field_dataProto = paramtt;
        paramString2.field_type = 1;
        paramString2.field_localId = (new Random().nextInt(2147483645) + 1);
        s.baK().b(paramString2);
        s.baM().a(paramString2);
      }
      for (;;)
      {
        GMTrace.o(7508676575232L, 55944);
        return 0;
        w.d("MicroMsg.RecordMsgLogic", "do not trans cdn, directly send msg");
        an.bJK();
        am.a.ev(l);
      }
    }
  }
  
  public static int a(String paramString1, String paramString2, au paramau)
  {
    GMTrace.i(7508542357504L, 55943);
    if (bg.nm(paramString1))
    {
      w.w("MicroMsg.RecordMsgLogic", "send record msg error, touser is null");
      GMTrace.o(7508542357504L, 55943);
      return -1;
    }
    if ((paramau == null) || (bg.nm(paramau.field_content)))
    {
      w.w("MicroMsg.RecordMsgLogic", "send record msg error, msginfo error");
      GMTrace.o(7508542357504L, 55943);
      return -1;
    }
    if (1 == paramau.field_status)
    {
      w.w("MicroMsg.RecordMsgLogic", "send record msg error, msginfo is sending");
      GMTrace.o(7508542357504L, 55943);
      return -1;
    }
    paramString1 = bg.g(paramString1.split(",")).iterator();
    String str;
    Object localObject2;
    f.a locala;
    com.tencent.mm.protocal.b.a.c localc;
    Object localObject1;
    long l;
    if (paramString1.hasNext())
    {
      str = (String)paramString1.next();
      w.i("MicroMsg.RecordMsgLogic", "send recordMsg, toUser[%s] msgId[%d], msgType[%d]", new Object[] { str, Long.valueOf(paramau.field_msgId), Integer.valueOf(paramau.field_status) });
      localObject2 = bc.gQ(paramau.field_content);
      locala = f.a.eS((String)localObject2);
      if (locala == null)
      {
        w.w("MicroMsg.RecordMsgLogic", "send record msg error, parse appmsg error");
        GMTrace.o(7508542357504L, 55943);
        return -1;
      }
      localc = Fw(locala.giV);
      if (localc == null)
      {
        w.w("MicroMsg.RecordMsgLogic", "send record msg error, parse record data error");
        GMTrace.o(7508542357504L, 55943);
        return -1;
      }
      localObject1 = new au();
      if (!bg.nm(paramau.field_imgPath))
      {
        Object localObject3 = bg.readFromFile(com.tencent.mm.ao.n.IZ().x(paramau.field_imgPath, true));
        localObject3 = com.tencent.mm.ao.n.IZ().f(8, (byte[])localObject3);
        w.d("MicroMsg.RecordMsgLogic", com.tencent.mm.compatible.util.g.tC() + " thumbData from msg MsgInfo path:" + (String)localObject3);
        if (!bg.nm((String)localObject3)) {
          ((au)localObject1).dc((String)localObject3);
        }
      }
      ((au)localObject1).setContent((String)localObject2);
      ((au)localObject1).dB(1);
      ((au)localObject1).db(str);
      ((au)localObject1).E(bc.gR(str));
      ((au)localObject1).dC(1);
      ((au)localObject1).setType(49);
      at.AR();
      l = com.tencent.mm.y.c.yM().P((au)localObject1);
      w.d("MicroMsg.RecordMsgLogic", com.tencent.mm.compatible.util.g.tC() + " msginfo insert id: " + l);
      if (l < 0L)
      {
        w.e("MicroMsg.RecordMsgLogic", com.tencent.mm.compatible.util.g.tC() + "insert msg failed :" + l);
        i = com.tencent.mm.compatible.util.g.tA();
        GMTrace.o(7508542357504L, 55943);
        return 0 - i;
      }
      w.i("MicroMsg.RecordMsgLogic", com.tencent.mm.compatible.util.g.tA() + " new msg inserted to db , local id = " + l);
      ((au)localObject1).C(l);
      localObject2 = new rp();
      ((rp)localObject2).eWt.eWu = paramau.field_msgId;
      ((rp)localObject2).eWt.eWv = l;
      a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
      localObject2 = new com.tencent.mm.x.f();
      ((com.tencent.mm.x.f)localObject2).field_xml = ((ce)localObject1).field_content;
      ((com.tencent.mm.x.f)localObject2).field_title = locala.title;
      ((com.tencent.mm.x.f)localObject2).field_type = locala.type;
      ((com.tencent.mm.x.f)localObject2).field_description = locala.description;
      ((com.tencent.mm.x.f)localObject2).field_msgId = l;
      an.bJI().b((com.tencent.mm.sdk.e.c)localObject2);
      localObject1 = localc.glr.iterator();
      do
      {
        if (!((Iterator)localObject1).hasNext()) {
          break;
        }
        localObject2 = (th)((Iterator)localObject1).next();
      } while ((bg.nm(((th)localObject2).ujt)) && (bg.nm(((th)localObject2).giD)));
    }
    for (int i = 1;; i = 0)
    {
      if (i != 0)
      {
        localObject1 = new k();
        localObject2 = new tt();
        ((tt)localObject2).ulB.addAll(localc.glr);
        ((k)localObject1).field_msgId = l;
        ((k)localObject1).field_oriMsgId = paramau.field_msgId;
        ((k)localObject1).field_toUser = str;
        ((k)localObject1).field_title = locala.title;
        ((k)localObject1).field_desc = locala.description;
        ((k)localObject1).field_dataProto = ((tt)localObject2);
        ((k)localObject1).field_type = 0;
        ((k)localObject1).field_favFrom = localc.tLW;
        ((k)localObject1).field_localId = (new Random().nextInt(2147483645) + 1);
        s.baK().b((com.tencent.mm.sdk.e.c)localObject1);
        s.baM().a((k)localObject1);
      }
      for (;;)
      {
        if (bg.nm(paramString2)) {
          break label864;
        }
        com.tencent.mm.plugin.messenger.a.d.aOe().A(str, paramString2, com.tencent.mm.y.s.go(str));
        break;
        w.d("MicroMsg.RecordMsgLogic", "do not check upload, directly send msg");
        an.bJK();
        am.a.ev(l);
      }
      label864:
      break;
      GMTrace.o(7508542357504L, 55943);
      return 0;
    }
  }
  
  public static com.tencent.mm.protocal.b.a.d a(Context paramContext, cf paramcf, String paramString)
  {
    GMTrace.i(7508273922048L, 55941);
    com.tencent.mm.protocal.b.a.d locald = new com.tencent.mm.protocal.b.a.d();
    Object localObject1 = new SparseIntArray();
    int i;
    Object localObject2;
    if (com.tencent.mm.af.f.dL(paramString))
    {
      locald.title = paramcf.eDv.eDx.title;
      w.d("MicroMsg.RecordMsgLogic", "msgInfo title %s", new Object[] { locald.title });
      i = 0;
      paramString = new LinkedList();
      if (paramcf.eDv.eDx == null) {
        break label398;
      }
      paramcf = paramcf.eDv.eDx.ulB;
      localObject2 = paramcf.iterator();
    }
    for (;;)
    {
      if (!((Iterator)localObject2).hasNext()) {
        break label1397;
      }
      Object localObject3 = (th)((Iterator)localObject2).next();
      int j = ((SparseIntArray)localObject1).get(((th)localObject3).aGU);
      ((SparseIntArray)localObject1).put(((th)localObject3).aGU, j + 1);
      switch (((th)localObject3).aGU)
      {
      case 9: 
      case 12: 
      case 13: 
      default: 
        break;
      case 1: 
        if (paramString.size() < 5)
        {
          paramString.add(((th)localObject3).ukp + ":" + ((th)localObject3).desc + "\n");
          continue;
          if (com.tencent.mm.y.s.eb(paramString))
          {
            locald.title = paramContext.getString(R.l.dQl);
            break;
          }
          localObject2 = q.zG();
          paramString = r.fr(paramString);
          if (((String)localObject2).equals(paramString))
          {
            locald.title = paramContext.getString(R.l.duv, new Object[] { localObject2 });
            break;
          }
          locald.title = paramContext.getString(R.l.duu, new Object[] { localObject2, paramString });
          break;
          paramcf = new LinkedList();
        }
        break;
      case 3: 
        if (paramString.size() < 5) {
          paramString.add(((th)localObject3).ukp + ":" + paramContext.getString(R.l.cUQ) + "\n");
        }
        break;
      case 2: 
        if (paramString.size() < 5) {
          paramString.add(((th)localObject3).ukp + ":" + paramContext.getString(R.l.cUb) + "\n");
        }
        if (i == 0)
        {
          a(locald, (th)localObject3, R.g.aTK);
          i = 1;
        }
        break;
      case 5: 
        if (paramString.size() < 5) {
          paramString.add(((th)localObject3).ukp + ":" + paramContext.getString(R.l.cUM) + ((th)localObject3).title + "\n");
        }
        if (i == 0)
        {
          a(locald, (th)localObject3, R.k.cJr);
          i = 1;
        }
        break;
      case 15: 
        if (paramString.size() < 5) {
          paramString.add(((th)localObject3).ukp + ":" + paramContext.getString(R.l.cUP) + "\n");
        }
        if (i == 0)
        {
          a(locald, (th)localObject3, R.k.cJo);
          i = 1;
        }
        break;
      case 4: 
        if (paramString.size() < 5) {
          paramString.add(((th)localObject3).ukp + ":" + paramContext.getString(R.l.cUP) + "\n");
        }
        if (i == 0)
        {
          a(locald, (th)localObject3, R.k.cJo);
          i = 1;
        }
        break;
      case 6: 
        if (paramString.size() < 5)
        {
          paramcf = ((th)localObject3).ukn.ukH;
          localObject3 = new StringBuilder().append(((th)localObject3).ukp).append(":").append(paramContext.getString(R.l.cTu));
          if ((!bg.nm(paramcf.eQm)) && (!paramcf.eQm.equals(paramContext.getString(R.l.dGL)))) {
            break label904;
          }
        }
        for (paramcf = paramcf.label;; paramcf = paramcf.eQm)
        {
          paramString.add(paramcf + "\n");
          if (i != 0) {
            break;
          }
          locald.eRy = R.k.cJc;
          i = 1;
          break;
        }
      case 7: 
        if (paramString.size() < 5) {
          paramString.add(((th)localObject3).ukp + ":" + paramContext.getString(R.l.cTB) + ((th)localObject3).title + "\n");
        }
        if (i == 0)
        {
          a(locald, (th)localObject3, R.k.cJd);
          i = 1;
        }
        break;
      case 8: 
        if (paramString.size() < 5) {
          paramString.add(((th)localObject3).ukp + ":" + paramContext.getString(R.l.cTf) + ((th)localObject3).title + "\n");
        }
        if (i == 0)
        {
          a(locald, (th)localObject3, R.k.cJl);
          i = 1;
        }
        break;
      case 10: 
      case 11: 
        if (paramString.size() < 5) {
          paramString.add(((th)localObject3).ukp + ":" + paramContext.getString(R.l.cUd) + ((th)localObject3).ukn.ukL.title + "\n");
        }
        if (i == 0)
        {
          a(locald, (th)localObject3, R.k.cJl);
          i = 1;
        }
        break;
      case 14: 
        if (paramString.size() < 5) {
          paramString.add(((th)localObject3).ukp + ":" + paramContext.getString(R.l.cRN) + "\n");
        }
        if (i == 0)
        {
          a(locald, (th)localObject3, R.k.cJl);
          i = 1;
        }
        break;
      case 16: 
        if (paramString.size() < 5) {
          paramString.add(((th)localObject3).ukp + ":" + paramContext.getString(R.l.cTj) + "\n");
        }
        if (i == 0)
        {
          at.AR();
          locald.lbo = com.tencent.mm.y.c.yM().Cn(((th)localObject3).desc).rAP;
          i = 1;
        }
        break;
      case 17: 
        label398:
        label904:
        if (paramString.size() < 5) {
          paramString.add(((th)localObject3).ukp + ":" + paramContext.getString(R.l.cUk) + "\n");
        }
        break;
      }
    }
    label1397:
    locald.desc = "";
    paramcf = paramString.iterator();
    for (paramContext = ""; paramcf.hasNext(); paramContext = paramContext + (String)localObject1) {
      localObject1 = (String)paramcf.next();
    }
    paramcf = paramContext.trim();
    paramContext = paramcf;
    if (paramString.size() >= 5) {
      paramContext = paramcf + "...";
    }
    locald.desc = paramContext;
    GMTrace.o(7508273922048L, 55941);
    return locald;
  }
  
  public static f.a a(String paramString1, String paramString2, tt paramtt)
  {
    GMTrace.i(20648323710976L, 153842);
    LinkedList localLinkedList = paramtt.ulB;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("<recordinfo>");
    localStringBuilder.append("<title>").append(bg.Sw(paramString1)).append("</title>");
    localStringBuilder.append("<desc>").append(bg.Sw(paramString2)).append("</desc>");
    a(localStringBuilder, paramtt);
    localStringBuilder.append(n.aw(localLinkedList));
    localStringBuilder.append("<favusername>").append(bg.Sw(q.zE())).append("</favusername>");
    localStringBuilder.append("</recordinfo>");
    paramtt = new f.a();
    paramtt.title = paramString1;
    paramString1 = paramString2;
    if (paramString2 != null)
    {
      paramString1 = paramString2;
      if (paramString2.length() > 200) {
        paramString1 = paramString2.substring(0, 200);
      }
    }
    paramtt.description = paramString1;
    if ((!bg.cc(localLinkedList)) && (!bg.nm(((th)localLinkedList.get(0)).ujI)) && (((th)localLinkedList.get(0)).ujI.equals(".htm"))) {
      paramtt.type = 24;
    }
    for (paramtt.url = "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/readtemplate?t=page/common_page__upgrade&btn_text=btn_text_0&text=text008";; paramtt.url = "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/readtemplate?t=page/favorite_record__w_unsupport&from=singlemessage&isappinstalled=0")
    {
      paramtt.action = "view";
      paramtt.giV = localStringBuilder.toString();
      GMTrace.o(20648323710976L, 153842);
      return paramtt;
      paramtt.type = 19;
    }
  }
  
  public static String a(String paramString1, String paramString2, tt paramtt, String paramString3)
  {
    GMTrace.i(20648189493248L, 153841);
    if ((paramtt == null) || (paramtt.ulB == null))
    {
      w.e("MicroMsg.RecordMsgLogic", "buildRecordAppMsgXML error: protoItem or datalist is null");
      GMTrace.o(20648189493248L, 153841);
      return "";
    }
    LinkedList localLinkedList = paramtt.ulB;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("<recordinfo>");
    localStringBuilder.append("<title>").append(bg.Sw(paramString1)).append("</title>");
    localStringBuilder.append("<desc>").append(bg.Sw(paramString2)).append("</desc>");
    a(localStringBuilder, paramtt);
    localStringBuilder.append(n.aw(localLinkedList));
    localStringBuilder.append("<favusername>").append(bg.Sw(paramString3)).append("</favusername>");
    localStringBuilder.append("</recordinfo>");
    paramtt = new f.a();
    paramtt.title = paramString1;
    paramtt.description = paramString2;
    if ((!bg.nm(((th)localLinkedList.get(0)).ujI)) && (((th)localLinkedList.get(0)).ujI.equals(".htm"))) {
      paramtt.type = 24;
    }
    for (paramtt.url = "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/readtemplate?t=page/common_page__upgrade&btn_text=btn_text_0&text=text008";; paramtt.url = "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/readtemplate?t=page/favorite_record__w_unsupport&from=singlemessage&isappinstalled=0")
    {
      paramtt.action = "view";
      paramtt.giV = localStringBuilder.toString();
      paramString1 = f.a.a(paramtt, null, null);
      GMTrace.o(20648189493248L, 153841);
      return paramString1;
      paramtt.type = 19;
    }
  }
  
  private static void a(com.tencent.mm.protocal.b.a.d paramd, th paramth, int paramInt)
  {
    GMTrace.i(7508408139776L, 55942);
    paramth = paramth.ujT;
    if (com.tencent.mm.a.e.aZ(paramth))
    {
      paramd.eIy = paramth;
      GMTrace.o(7508408139776L, 55942);
      return;
    }
    paramd.eRy = paramInt;
    GMTrace.o(7508408139776L, 55942);
  }
  
  private static void a(String paramString, com.tencent.mm.protocal.b.a.c paramc)
  {
    GMTrace.i(16881503174656L, 125777);
    paramc.glr.clear();
    Object localObject1 = DocumentBuilderFactory.newInstance();
    for (;;)
    {
      int i;
      Object localObject2;
      try
      {
        paramString = ((DocumentBuilderFactory)localObject1).newDocumentBuilder().parse(new InputSource(new ByteArrayInputStream(paramString.getBytes())));
        paramString.normalize();
        paramString = paramString.getDocumentElement().getElementsByTagName("datalist");
        if (paramString == null) {
          break label3044;
        }
        NodeList localNodeList = paramString.item(0).getChildNodes();
        if ((localNodeList == null) || (localNodeList.getLength() <= 0)) {
          break label3044;
        }
        int j = localNodeList.getLength();
        i = 0;
        if (i >= j) {
          break label3044;
        }
        localObject1 = localNodeList.item(i);
        paramString = bh.b((Node)localObject1);
        localObject1 = ((Element)localObject1).getElementsByTagName("recordxml");
        if ((localObject1 == null) || (((NodeList)localObject1).getLength() <= 0)) {
          break label3059;
        }
        localObject1 = bh.b(((NodeList)localObject1).item(0).getFirstChild());
        if (!paramString.trim().startsWith("<dataitem")) {
          break label3054;
        }
        paramString = bh.q(paramString, "dataitem");
        if (paramString == null) {
          paramString = null;
        }
        try
        {
          paramc.glr.add(paramString);
        }
        catch (Exception paramString)
        {
          th localth;
          String str;
          w.e("MicroMsg.RecordMsgLogic", "get record msg data from xml error: %s", new Object[] { paramString.getMessage() });
          w.printErrStackTrace("MicroMsg.RecordMsgLogic", paramString, "", new Object[0]);
          paramc.glr.clear();
        }
        localth = new th();
        localth.zR(bg.getInt((String)paramString.get(".dataitem" + ".$datatype"), 0));
        localth.Qy((String)paramString.get(".dataitem" + ".$datasourceid"));
        localth.zS(bg.getInt((String)paramString.get(".dataitem" + ".$datastatus"), 0));
        localth.Qq((String)paramString.get(".dataitem" + ".datafmt"));
        localth.Qg((String)paramString.get(".dataitem" + ".datatitle"));
        localth.Qh((String)paramString.get(".dataitem" + ".datadesc"));
        localth.Qi((String)paramString.get(".dataitem" + ".cdnthumburl"));
        localth.Qj((String)paramString.get(".dataitem" + ".cdnthumbkey"));
        localth.zO(bg.getInt((String)paramString.get(".dataitem" + ".thumbwidth"), 0));
        localth.zP(bg.getInt((String)paramString.get(".dataitem" + ".thumbheight"), 0));
        localth.Qk((String)paramString.get(".dataitem" + ".cdndataurl"));
        localth.Ql((String)paramString.get(".dataitem" + ".cdndatakey"));
        localObject2 = (String)paramString.get(".dataitem" + ".duration");
        if ((localObject2 != null) && (((String)localObject2).length() > 0)) {
          localth.zQ(bg.getInt((String)localObject2, 0));
        }
        localth.Qn((String)paramString.get(".dataitem" + ".streamdataurl"));
        localth.Qo((String)paramString.get(".dataitem" + ".streamlowbandurl"));
        localth.Qm((String)paramString.get(".dataitem" + ".streamweburl"));
        localth.Qr((String)paramString.get(".dataitem" + ".fullmd5"));
        localth.Qs((String)paramString.get(".dataitem" + ".head256md5"));
        localObject2 = (String)paramString.get(".dataitem" + ".datasize");
        if (!bg.nm((String)localObject2)) {
          localth.ey(bg.getInt((String)localObject2, 0));
        }
        localth.Qp((String)paramString.get(".dataitem" + ".dataext"));
        localth.Qw((String)paramString.get(".dataitem" + ".thumbfullmd5"));
        localth.Qx((String)paramString.get(".dataitem" + ".thumbhead256md5"));
        localObject2 = (String)paramString.get(".dataitem" + ".thumbsize");
        if (!bg.nm((String)localObject2)) {
          localth.ez(bg.getInt((String)localObject2, 0));
        }
        localth.Qz((String)paramString.get(".dataitem" + ".streamvideoid"));
        localObject3 = (String)paramString.get(".dataitem" + ".$dataid");
        localObject2 = localObject3;
        if (bg.nm((String)localObject3)) {
          localObject2 = String.valueOf(i);
        }
        localth.Qt((String)localObject2);
        localObject2 = (String)paramString.get(".dataitem" + ".$htmlid");
        if (!bg.nm((String)localObject2)) {
          localth.QD((String)localObject2);
        }
        localth.zT(bg.getInt((String)paramString.get(".dataitem" + ".$dataillegaltype"), 0));
        localth.QA((String)paramString.get(".dataitem" + ".sourcetitle"));
        localth.QB((String)paramString.get(".dataitem" + ".sourcename"));
        localth.QC((String)paramString.get(".dataitem" + ".sourcetime"));
        localth.QE((String)paramString.get(".dataitem" + ".statextstr"));
        if (localObject1 != null) {
          localth.QG((String)localObject1);
        }
        localObject1 = new ti();
        localObject2 = new tj();
        ((tj)localObject2).zU(bg.getInt((String)paramString.get(".dataitem" + ".$sourcetype"), 0));
        localObject3 = (String)paramString.get(".dataitem" + ".dataitemsource.fromusr");
        if (!bg.nm((String)localObject3))
        {
          ((tj)localObject2).QH((String)localObject3);
          w.d("MicroMsg.RecordMsgParser", "fromusr %s", new Object[] { ((tj)localObject2).eMI });
        }
        localObject3 = (String)paramString.get(".dataitem" + ".dataitemsource.realchatname");
        if (!bg.nm((String)localObject3))
        {
          ((tj)localObject2).QK((String)localObject3);
          w.d("MicroMsg.RecordMsgParser", "realChatname %s", new Object[] { ((tj)localObject2).ulb });
        }
        ((tj)localObject2).QM((String)paramString.get(".dataitem" + ".appid"));
        ((tj)localObject2).QN((String)paramString.get(".dataitem" + ".link"));
        ((tj)localObject2).QO((String)paramString.get(".dataitem" + ".brandid"));
        ((ti)localObject1).c((tj)localObject2);
        localObject3 = ".dataitem" + ".locitem";
        if (!paramString.containsKey(localObject3))
        {
          w.w("MicroMsg.RecordMsgParser", "cur fav not contains %s", new Object[] { localObject3 });
          localObject2 = ".dataitem" + ".weburlitem";
          if (paramString.containsKey(localObject2)) {
            break label2472;
          }
          w.w("MicroMsg.RecordMsgParser", "cur fav not contains %s", new Object[] { localObject2 });
          localObject2 = ".dataitem" + ".productitem";
          if (paramString.containsKey(localObject2)) {
            break label2676;
          }
          w.w("MicroMsg.RecordMsgParser", "cur fav not contains %s", new Object[] { localObject2 });
          localObject2 = ".dataitem" + ".tvitem";
          if (paramString.containsKey(localObject2)) {
            break label2880;
          }
          w.w("MicroMsg.RecordMsgParser", "cur fav not contains %s", new Object[] { localObject2 });
          localth.a((ti)localObject1);
          paramString = localth;
          continue;
        }
        localObject2 = new to();
        if (!bg.nm((String)paramString.get((String)localObject3 + ".label"))) {
          ((to)localObject2).QP((String)paramString.get((String)localObject3 + ".label"));
        }
        if (!bg.nm((String)paramString.get((String)localObject3 + ".poiname"))) {
          ((to)localObject2).QQ((String)paramString.get((String)localObject3 + ".poiname"));
        }
        str = (String)paramString.get((String)localObject3 + ".lng");
        if (!bg.nm(str)) {
          ((to)localObject2).p(bg.getDouble(str, 0.0D));
        }
        str = (String)paramString.get((String)localObject3 + ".lat");
        if (!bg.nm(str)) {
          ((to)localObject2).q(bg.getDouble(str, 0.0D));
        }
        localObject3 = (String)paramString.get((String)localObject3 + ".scale");
        if (!bg.nm((String)localObject3))
        {
          if (((String)localObject3).indexOf('.') != -1) {
            ((to)localObject2).zV(bg.getInt(((String)localObject3).substring(0, ((String)localObject3).indexOf('.')), -1));
          }
        }
        else
        {
          ((ti)localObject1).a((to)localObject2);
          continue;
        }
        ((to)localObject2).zV(bg.getInt((String)localObject3, -1));
      }
      catch (Exception paramString)
      {
        w.e("MicroMsg.RecordMsgLogic", "[parser] parseXML exception:%s", new Object[] { paramString.toString() });
        GMTrace.o(16881503174656L, 125777);
        return;
      }
      continue;
      label2472:
      Object localObject3 = new uf();
      ((uf)localObject3).Rl((String)paramString.get((String)localObject2 + ".title"));
      ((uf)localObject3).Rm((String)paramString.get((String)localObject2 + ".desc"));
      ((uf)localObject3).Ro((String)paramString.get((String)localObject2 + ".thumburl"));
      ((uf)localObject3).Rn((String)paramString.get((String)localObject2 + ".link"));
      ((uf)localObject3).Aa(bg.getInt((String)paramString.get((String)localObject2 + ".opencache"), 0));
      ((ti)localObject1).a((uf)localObject3);
      continue;
      label2676:
      localObject3 = new ts();
      ((ts)localObject3).QR((String)paramString.get((String)localObject2 + ".title"));
      ((ts)localObject3).QS((String)paramString.get((String)localObject2 + ".desc"));
      ((ts)localObject3).QT((String)paramString.get((String)localObject2 + ".thumburl"));
      ((ts)localObject3).QU((String)paramString.get((String)localObject2 + ".productinfo"));
      ((ts)localObject3).zW(bg.getInt((String)paramString.get((String)localObject2 + ".$type"), 0));
      ((ti)localObject1).a((ts)localObject3);
      continue;
      label2880:
      localObject3 = new tz();
      ((tz)localObject3).Rh((String)paramString.get((String)localObject2 + ".title"));
      ((tz)localObject3).Ri((String)paramString.get((String)localObject2 + ".desc"));
      ((tz)localObject3).Rj((String)paramString.get((String)localObject2 + ".thumburl"));
      ((tz)localObject3).Rk((String)paramString.get((String)localObject2 + ".tvinfo"));
      ((ti)localObject1).a((tz)localObject3);
      continue;
      label3044:
      GMTrace.o(16881503174656L, 125777);
      return;
      label3054:
      paramString = null;
      continue;
      label3059:
      localObject1 = null;
      continue;
      i += 1;
    }
  }
  
  private static void a(StringBuilder paramStringBuilder, tt paramtt)
  {
    GMTrace.i(20648457928704L, 153843);
    if (paramtt.tLX != null)
    {
      paramStringBuilder.append("<noteinfo>");
      paramStringBuilder.append("<noteauthor>").append(bg.Sw(paramtt.tLX.ult)).append("</noteauthor>");
      paramStringBuilder.append("<noteeditor>").append(bg.Sw(paramtt.tLX.ulu)).append("</noteeditor>");
      paramStringBuilder.append("</noteinfo>");
      paramStringBuilder.append("<edittime>").append(paramtt.tLY).append("</edittime>");
    }
    GMTrace.o(20648457928704L, 153843);
  }
  
  public static boolean a(th paramth, long paramLong, boolean paramBoolean)
  {
    GMTrace.i(7510152970240L, 55955);
    if (paramth == null)
    {
      w.w("MicroMsg.RecordMsgLogic", "try download data fail, dataitem is null");
      GMTrace.o(7510152970240L, 55955);
      return false;
    }
    String str = d(paramth.lhq, paramLong, true);
    g localg2 = s.baL().Fv(str);
    g localg1 = localg2;
    if (localg2 == null)
    {
      localg2 = new g();
      localg2.field_cdnKey = paramth.ujv;
      localg2.field_cdnUrl = paramth.ujt;
      localg2.field_dataId = paramth.lhq;
      localg2.field_mediaId = str;
      localg2.field_totalLen = ((int)paramth.ujO);
      localg2.field_localId = (new Random().nextInt(2147483645) + 1);
      localg2.field_path = c(paramth, paramLong);
      localg2.field_type = 1;
      localg2.field_fileType = ti(paramth.aGU);
      localg2.field_isThumb = false;
      boolean bool = s.baL().a(localg2);
      w.d("MicroMsg.RecordMsgLogic", "insert localId[%d] result[%B]", new Object[] { Integer.valueOf(localg2.field_localId), Boolean.valueOf(bool) });
      localg1 = localg2;
      if (!bg.nm(paramth.ukv))
      {
        localg1 = localg2;
        if (paramth.ukv.equals("WeNoteHtmlFile"))
        {
          s.baN().a(localg2, true);
          localg1 = localg2;
        }
      }
    }
    w.d("MicroMsg.RecordMsgLogic", "try download data, dump record cdninfo: %s", new Object[] { localg1 });
    if (4 == localg1.field_status)
    {
      w.w("MicroMsg.RecordMsgLogic", "try download, but cdn info out of date, code[%d]", new Object[] { Integer.valueOf(localg1.field_errCode) });
      GMTrace.o(7510152970240L, 55955);
      return false;
    }
    if (3 == localg1.field_status)
    {
      w.i("MicroMsg.RecordMsgLogic", "try download, but cdn info error, code[%d], can retry[%B]", new Object[] { Integer.valueOf(localg1.field_errCode), Boolean.valueOf(paramBoolean) });
      if (paramBoolean)
      {
        localg1.field_status = 1;
        s.baL().b(localg1, new String[] { "localId" });
      }
    }
    else
    {
      s.baN().run();
      GMTrace.o(7510152970240L, 55955);
      return true;
    }
    GMTrace.o(7510152970240L, 55955);
    return false;
  }
  
  public static boolean b(th paramth, long paramLong, boolean paramBoolean)
  {
    GMTrace.i(7510421405696L, 55957);
    if (paramth == null)
    {
      w.w("MicroMsg.RecordMsgLogic", "try download thumb error, dataitem is null");
      GMTrace.o(7510421405696L, 55957);
      return false;
    }
    String str1 = xQ(paramth.lhq);
    String str2 = d(str1, paramLong, true);
    g localg2 = s.baL().Fv(str2);
    g localg1 = localg2;
    if (localg2 == null)
    {
      localg1 = new g();
      localg1.field_cdnKey = paramth.ujp;
      localg1.field_cdnUrl = paramth.giD;
      localg1.field_dataId = str1;
      localg1.field_mediaId = str2;
      localg1.field_totalLen = ((int)paramth.ujZ);
      localg1.field_localId = (new Random().nextInt(2147483645) + 1);
      localg1.field_path = f(paramth, paramLong);
      localg1.field_type = 1;
      localg1.field_fileType = com.tencent.mm.modelcdntran.b.MediaType_FULLSIZEIMAGE;
      localg1.field_isThumb = true;
      boolean bool = s.baL().a(localg1);
      w.d("MicroMsg.RecordMsgLogic", "insert localId[%d] result[%B]", new Object[] { Integer.valueOf(localg1.field_localId), Boolean.valueOf(bool) });
    }
    w.v("MicroMsg.RecordMsgLogic", "try download thumb, dump record cdninfo: %s", new Object[] { localg1 });
    if (4 == localg1.field_status)
    {
      w.w("MicroMsg.RecordMsgLogic", "try download thumb, but cdn info out of date, code[%d]", new Object[] { Integer.valueOf(localg1.field_errCode) });
      GMTrace.o(7510421405696L, 55957);
      return false;
    }
    if (3 == localg1.field_status)
    {
      w.i("MicroMsg.RecordMsgLogic", "try download thumb, but cdn info error, code[%d], can retry[%B]", new Object[] { Integer.valueOf(localg1.field_errCode), Boolean.valueOf(paramBoolean) });
      if (paramBoolean)
      {
        localg1.field_status = 1;
        s.baL().b(localg1, new String[] { "localId" });
      }
    }
    else
    {
      s.baN().run();
      GMTrace.o(7510421405696L, 55957);
      return true;
    }
    GMTrace.o(7510421405696L, 55957);
    return false;
  }
  
  public static String c(th paramth, long paramLong)
  {
    int i = 1;
    GMTrace.i(7509079228416L, 55947);
    if (paramth == null)
    {
      GMTrace.o(7509079228416L, 55947);
      return "";
    }
    String str1 = paramth.lhq;
    if ((bg.nm(str1)) || (!at.AU()))
    {
      GMTrace.o(7509079228416L, 55947);
      return "";
    }
    File localFile = df(paramLong);
    if ((paramth.aGU == 8) && (!bg.nm(paramth.title)))
    {
      str1 = paramth.title;
      int j = paramth.lhq.hashCode();
      at.AR();
      localFile = new File(String.format("%s/%d/%d/", new Object[] { com.tencent.mm.y.c.zi(), Long.valueOf(paramLong), Integer.valueOf(j & 0xFF) }));
      if ((!localFile.exists()) || (!localFile.isDirectory())) {
        localFile.mkdirs();
      }
    }
    for (;;)
    {
      String str2 = str1;
      if (paramth.ujI != null)
      {
        str2 = str1;
        if (paramth.ujI.trim().length() > 0)
        {
          str2 = str1;
          if (i == 0) {
            str2 = str1 + "." + paramth.ujI;
          }
        }
      }
      paramth = new File(localFile, str2).getAbsolutePath();
      GMTrace.o(7509079228416L, 55947);
      return paramth;
      i = 0;
    }
  }
  
  public static String d(String paramString, long paramLong, boolean paramBoolean)
  {
    GMTrace.i(7509750317056L, 55952);
    if (paramBoolean)
    {
      paramString = paramString + "@record_download@" + paramLong;
      GMTrace.o(7509750317056L, 55952);
      return paramString;
    }
    paramString = paramString + "@record_upload@" + paramLong;
    GMTrace.o(7509750317056L, 55952);
    return paramString;
  }
  
  public static boolean d(th paramth, long paramLong)
  {
    GMTrace.i(7509213446144L, 55948);
    boolean bool = new File(c(paramth, paramLong)).exists();
    GMTrace.o(7509213446144L, 55948);
    return bool;
  }
  
  private static File df(long paramLong)
  {
    GMTrace.i(7508810792960L, 55945);
    at.AR();
    File localFile = new File(String.format("%s/%d/", new Object[] { com.tencent.mm.y.c.zi(), Long.valueOf(paramLong) }));
    if ((!localFile.exists()) || (!localFile.isDirectory())) {
      localFile.mkdirs();
    }
    GMTrace.o(7508810792960L, 55945);
    return localFile;
  }
  
  public static void dg(long paramLong)
  {
    GMTrace.i(7508945010688L, 55946);
    File localFile = df(paramLong);
    boolean bool = com.tencent.mm.a.e.f(localFile);
    w.i("MicroMsg.RecordMsgLogic", "do clear resource, path %s, result %B", new Object[] { localFile.getAbsolutePath(), Boolean.valueOf(bool) });
    GMTrace.o(7508945010688L, 55946);
  }
  
  public static boolean e(th paramth, long paramLong)
  {
    GMTrace.i(7509347663872L, 55949);
    boolean bool = new File(f(paramth, paramLong)).exists();
    GMTrace.o(7509347663872L, 55949);
    return bool;
  }
  
  public static String f(th paramth, long paramLong)
  {
    GMTrace.i(7509481881600L, 55950);
    if ((paramth == null) || (bg.nm(paramth.lhq)))
    {
      GMTrace.o(7509481881600L, 55950);
      return "";
    }
    paramth = xQ(paramth.lhq);
    paramth = new File(df(paramLong), paramth).getAbsolutePath();
    GMTrace.o(7509481881600L, 55950);
    return paramth;
  }
  
  public static String ft(String paramString)
  {
    GMTrace.i(7510555623424L, 55958);
    at.AR();
    Object localObject = com.tencent.mm.y.c.yK().TE(paramString);
    if (localObject == null)
    {
      w.w("MicroMsg.RecordMsgLogic", "wtf get contact null, username %s", new Object[] { paramString });
      GMTrace.o(7510555623424L, 55958);
      return "";
    }
    String str = ((x)localObject).vk();
    localObject = str;
    if (com.tencent.mm.y.s.eb(str))
    {
      paramString = com.tencent.mm.y.m.fi(paramString);
      localObject = q.zE();
      if ((paramString != null) && (!paramString.isEmpty())) {
        break label113;
      }
      w.w("MicroMsg.RecordMsgLogic", "get members from username error, content empty");
    }
    for (localObject = str;; localObject = com.tencent.mm.y.m.b(paramString, 3))
    {
      GMTrace.o(7510555623424L, 55958);
      return (String)localObject;
      label113:
      paramString.remove(localObject);
      paramString.add(0, localObject);
    }
  }
  
  public static boolean g(th paramth, long paramLong)
  {
    GMTrace.i(7510287187968L, 55956);
    if (paramth == null)
    {
      w.w("MicroMsg.RecordMsgLogic", "checkDataOutOfDate fail, dataitem is null");
      GMTrace.o(7510287187968L, 55956);
      return true;
    }
    paramth = d(paramth.lhq, paramLong, true);
    paramth = s.baL().Fv(paramth);
    if (paramth == null)
    {
      w.d("MicroMsg.RecordMsgLogic", "checkDataOutOfDate ok, not find cdn info");
      GMTrace.o(7510287187968L, 55956);
      return false;
    }
    if (4 == paramth.field_status)
    {
      w.w("MicroMsg.RecordMsgLogic", "checkDataOutOfDate ok, status err, code %d", new Object[] { Integer.valueOf(paramth.field_errCode) });
      GMTrace.o(7510287187968L, 55956);
      return true;
    }
    w.d("MicroMsg.RecordMsgLogic", "checkDataOutOfDate ok, find cdn info, status %d", new Object[] { Integer.valueOf(paramth.field_status) });
    GMTrace.o(7510287187968L, 55956);
    return false;
  }
  
  public static boolean h(th paramth, long paramLong)
  {
    GMTrace.i(7510689841152L, 55959);
    boolean bool = o.RH(c(paramth, paramLong));
    GMTrace.o(7510689841152L, 55959);
    return bool;
  }
  
  public static int ti(int paramInt)
  {
    GMTrace.i(7510018752512L, 55954);
    if (2 == paramInt)
    {
      paramInt = com.tencent.mm.modelcdntran.b.MediaType_FULLSIZEIMAGE;
      GMTrace.o(7510018752512L, 55954);
      return paramInt;
    }
    if (4 == paramInt)
    {
      paramInt = com.tencent.mm.modelcdntran.b.MediaType_VIDEO;
      GMTrace.o(7510018752512L, 55954);
      return paramInt;
    }
    paramInt = com.tencent.mm.modelcdntran.b.MediaType_FILE;
    GMTrace.o(7510018752512L, 55954);
    return paramInt;
  }
  
  public static String xQ(String paramString)
  {
    GMTrace.i(7509616099328L, 55951);
    paramString = paramString + "_t";
    GMTrace.o(7509616099328L, 55951);
    return paramString;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\record\a\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */