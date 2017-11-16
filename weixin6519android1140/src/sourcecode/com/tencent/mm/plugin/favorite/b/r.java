package com.tencent.mm.plugin.favorite.b;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.g.a.ls;
import com.tencent.mm.g.a.ls.b;
import com.tencent.mm.g.a.mn;
import com.tencent.mm.g.a.qz;
import com.tencent.mm.g.a.qz.b;
import com.tencent.mm.opensdk.modelmsg.WXFileObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.opensdk.modelmsg.WXMusicObject;
import com.tencent.mm.opensdk.modelmsg.WXVideoObject;
import com.tencent.mm.plugin.messenger.a.d;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.protocal.c.bhr;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.ti;
import com.tencent.mm.protocal.c.tk;
import com.tencent.mm.protocal.c.to;
import com.tencent.mm.protocal.c.ts;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.protocal.c.tw;
import com.tencent.mm.protocal.c.tz;
import com.tencent.mm.protocal.c.uf;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au.a;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.ab.a;
import com.tencent.mm.y.ab.b;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import com.tencent.mm.y.u;
import com.tencent.mm.y.u.b;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class r
{
  public static void a(Context paramContext, String paramString, final j paramj, final th paramth, final Runnable paramRunnable)
  {
    GMTrace.i(6262330753024L, 46658);
    if (paramContext == null)
    {
      w.w("MicroMsg.FavSendLogic", "want to send fav file, but context is null");
      GMTrace.o(6262330753024L, 46658);
      return;
    }
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.FavSendLogic", "want to send fav file, but to user is null");
      GMTrace.o(6262330753024L, 46658);
      return;
    }
    if (paramj == null) {
      w.w("MicroMsg.FavSendLogic", "want to send fav file, but info is null");
    }
    if (paramth == null)
    {
      w.w("MicroMsg.FavSendLogic", "want to send fav file, but dataItem is null");
      GMTrace.o(6262330753024L, 46658);
      return;
    }
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6311722876928L, 47026);
        r.a(this.etX, paramj, paramth);
        af.t(paramRunnable);
        GMTrace.o(6311722876928L, 47026);
      }
      
      public final String toString()
      {
        GMTrace.i(6311857094656L, 47027);
        String str = super.toString() + "|sendFavFile";
        GMTrace.o(6311857094656L, 47027);
        return str;
      }
    });
    GMTrace.o(6262330753024L, 46658);
  }
  
  public static void a(Context paramContext, String paramString, th paramth)
  {
    GMTrace.i(16031368085504L, 119443);
    File localFile = new File(x.g(paramth));
    if (localFile.exists())
    {
      String str = c(paramth);
      w.d("MicroMsg.FavSendLogic", "send fav short Video::data path[%s] thumb path[%s]", new Object[] { localFile.getAbsolutePath(), str });
      bhr localbhr = null;
      tk localtk = paramth.ukt;
      if (localtk != null)
      {
        localbhr = new bhr();
        localbhr.gkN = localtk.gkN;
        localbhr.gkK = localtk.gkK;
        localbhr.ulk = localtk.ulk;
        localbhr.gkI = localtk.gkI;
        localbhr.gkL = localtk.gkL;
        localbhr.gkO = localtk.gkO;
        localbhr.gkP = localtk.gkP;
        localbhr.gkM = localtk.gkM;
      }
      if (localbhr != null)
      {
        d.aOe().a(paramContext, paramString, localFile.getAbsolutePath(), str, 62, paramth.duration, localbhr, false, false, paramth.eTv);
        GMTrace.o(16031368085504L, 119443);
        return;
      }
      d.aOe().a(paramContext, paramString, localFile.getAbsolutePath(), str, 62, paramth.duration, paramth.eTv);
      GMTrace.o(16031368085504L, 119443);
      return;
    }
    w.w("MicroMsg.FavSendLogic", "sendShortVideo, error! data not existed");
    GMTrace.o(16031368085504L, 119443);
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2, j paramj, Runnable paramRunnable)
  {
    GMTrace.i(6262062317568L, 46656);
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add(paramj);
    a(paramContext, paramString1, paramString2, localLinkedList, paramRunnable);
    GMTrace.o(6262062317568L, 46656);
  }
  
  public static void a(final Context paramContext, String paramString1, final String paramString2, final List<j> paramList, final Runnable paramRunnable)
  {
    GMTrace.i(6262196535296L, 46657);
    if (paramContext == null)
    {
      w.w("MicroMsg.FavSendLogic", "want to send fav msg, but context is null");
      af.t(paramRunnable);
      GMTrace.o(6262196535296L, 46657);
      return;
    }
    if (bg.nm(paramString1))
    {
      w.w("MicroMsg.FavSendLogic", "want to send fav msg, but to user is null");
      af.t(paramRunnable);
      GMTrace.o(6262196535296L, 46657);
      return;
    }
    if (paramList.isEmpty())
    {
      w.w("MicroMsg.FavSendLogic", "want to send fav msg, but info is null");
      af.t(paramRunnable);
      GMTrace.o(6262196535296L, 46657);
      return;
    }
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6295079878656L, 46902);
        Iterator localIterator1 = bg.g(this.lbh.split(",")).iterator();
        while (localIterator1.hasNext())
        {
          String str = (String)localIterator1.next();
          Iterator localIterator2 = paramList.iterator();
          while (localIterator2.hasNext())
          {
            Object localObject3 = (j)localIterator2.next();
            if (localObject3 == null)
            {
              w.e("MicroMsg.FavSendLogic", "in run workerThread,want to send fav msg, but info is null,infos.size = %d", new Object[] { Integer.valueOf(paramList.size()) });
            }
            else
            {
              com.tencent.mm.plugin.report.service.g.ork.i(10925, new Object[] { Integer.valueOf(((j)localObject3).field_type), Integer.valueOf(((j)localObject3).field_id) });
              Object localObject1;
              Object localObject2;
              Object localObject4;
              Object localObject6;
              Object localObject5;
              switch (((j)localObject3).field_type)
              {
              case 3: 
              case 9: 
              case 12: 
              case 13: 
              default: 
                break;
              case 1: 
                d.aOe().A(str, ((j)localObject3).field_favProto.desc, s.go(str));
                break;
              case 2: 
                localObject1 = ((j)localObject3).field_favProto.ulB.iterator();
                while (((Iterator)localObject1).hasNext())
                {
                  localObject2 = (th)((Iterator)localObject1).next();
                  d.aOe().a(paramContext, str, x.g((th)localObject2), 0, "", "");
                }
              case 16: 
                r.a(paramContext, str, x.n((j)localObject3));
                break;
              case 4: 
                r.b(paramContext, str, x.n((j)localObject3));
                break;
              case 6: 
                localObject1 = ((j)localObject3).field_favProto.ukH;
                localObject2 = new StringBuilder();
                ((StringBuilder)localObject2).append("<msg>");
                ((StringBuilder)localObject2).append("<location ");
                ((StringBuilder)localObject2).append("x=\"").append(((to)localObject1).lat).append("\" ");
                ((StringBuilder)localObject2).append("y=\"").append(((to)localObject1).lng).append("\" ");
                ((StringBuilder)localObject2).append("scale=\"").append(((to)localObject1).eMn).append("\" ");
                ((StringBuilder)localObject2).append("label=\"").append(bg.aq(((to)localObject1).label, "")).append("\" ");
                ((StringBuilder)localObject2).append("maptype=\"0\" ");
                ((StringBuilder)localObject2).append("poiname=\"").append(bg.aq(((to)localObject1).eQm, "")).append("\" ");
                ((StringBuilder)localObject2).append("/>");
                ((StringBuilder)localObject2).append("</msg>");
                d.aOe().A(str, ((StringBuilder)localObject2).toString(), 48);
                break;
              case 8: 
                r.a(str, (j)localObject3, x.n((j)localObject3));
                break;
              case 7: 
                localObject4 = paramContext;
                localObject6 = x.n((j)localObject3);
                localObject1 = new WXMusicObject();
                ((WXMusicObject)localObject1).musicUrl = ((th)localObject6).ujA;
                ((WXMusicObject)localObject1).musicDataUrl = ((th)localObject6).ujC;
                ((WXMusicObject)localObject1).musicLowBandUrl = ((th)localObject6).ujE;
                ((WXMusicObject)localObject1).musicLowBandDataUrl = ((th)localObject6).ujE;
                localObject5 = new WXMediaMessage();
                ((WXMediaMessage)localObject5).mediaObject = ((WXMediaMessage.IMediaObject)localObject1);
                ((WXMediaMessage)localObject5).title = ((th)localObject6).title;
                ((WXMediaMessage)localObject5).description = ((th)localObject6).desc;
                localObject2 = bg.readFromFile(x.h((th)localObject6));
                localObject1 = localObject2;
                if (localObject2 == null)
                {
                  localObject1 = bg.aq(((th)localObject6).eDk, "");
                  localObject1 = bg.readFromFile(x.axY() + com.tencent.mm.a.g.n(((String)localObject1).getBytes()));
                }
                ((WXMediaMessage)localObject5).thumbData = ((byte[])localObject1);
                localObject1 = ((j)localObject3).field_favProto.ulz.appId;
                l.a((WXMediaMessage)localObject5, (String)localObject1, ab.a.gmV.m((Context)localObject4, (String)localObject1), str, 3, null);
                break;
              case 5: 
                if (localObject3 == null)
                {
                  w.w("MicroMsg.FavSendLogic", "item info is null, send fav url fail, return");
                }
                else
                {
                  localObject4 = x.n((j)localObject3);
                  localObject6 = ((j)localObject3).field_favProto.ukJ;
                  Object localObject7 = ((j)localObject3).field_favProto.ulz;
                  localObject5 = new f.a();
                  if (localObject6 != null)
                  {
                    ((f.a)localObject5).title = ((uf)localObject6).title;
                    localObject2 = ((uf)localObject6).thumbUrl;
                    localObject1 = localObject2;
                    if (bg.nm((String)localObject2)) {
                      localObject1 = bg.aq(((th)localObject4).eDk, "");
                    }
                    ((f.a)localObject5).thumburl = ((String)localObject1);
                  }
                  if ((bg.nm(((f.a)localObject5).title)) && (localObject4 != null)) {
                    ((f.a)localObject5).title = ((th)localObject4).title;
                  }
                  if (localObject6 != null) {
                    ((f.a)localObject5).description = ((uf)localObject6).desc;
                  }
                  if ((bg.nm(((f.a)localObject5).description)) && (localObject4 != null)) {
                    ((f.a)localObject5).description = ((th)localObject4).desc;
                  }
                  if (((j)localObject3).field_favProto.ukJ != null) {
                    ((f.a)localObject5).url = ((j)localObject3).field_favProto.ukJ.umf;
                  }
                  if ((localObject7 != null) && (bg.nm(((f.a)localObject5).url))) {
                    ((f.a)localObject5).url = ((tw)localObject7).gVf;
                  }
                  if ((localObject4 != null) && (!bg.nm(((th)localObject4).canvasPageXml))) {
                    ((f.a)localObject5).canvasPageXml = ((th)localObject4).canvasPageXml;
                  }
                  ((f.a)localObject5).action = "view";
                  ((f.a)localObject5).type = 5;
                  ((f.a)localObject5).eTv = ((th)localObject4).eTv;
                  localObject2 = bg.readFromFile(x.h((th)localObject4));
                  localObject1 = localObject2;
                  if (localObject2 == null) {
                    if (localObject6 != null) {
                      break label1208;
                    }
                  }
                  for (localObject1 = null;; localObject1 = ((uf)localObject6).thumbUrl)
                  {
                    localObject2 = localObject1;
                    if (bg.nm((String)localObject1)) {
                      localObject2 = bg.aq(((th)localObject4).eDk, "");
                    }
                    localObject1 = bg.readFromFile(x.axY() + com.tencent.mm.a.g.n(((String)localObject2).getBytes()));
                    localObject2 = "fav_" + q.zE() + "_" + ((j)localObject3).field_id;
                    localObject6 = u.gy((String)localObject2);
                    localObject7 = u.Av().p((String)localObject6, true);
                    ((u.b)localObject7).o("prePublishId", localObject2);
                    ((u.b)localObject7).o("preUsername", ((j)localObject3).field_fromUser);
                    ((u.b)localObject7).o("sendAppMsgScene", Integer.valueOf(1));
                    ((u.b)localObject7).o("adExtStr", ((th)localObject4).eTv);
                    d.aOe().a(str, (byte[])localObject1, f.a.a((f.a)localObject5, null, null), (String)localObject6);
                    break;
                  }
                }
                break;
              case 10: 
                localObject1 = paramContext;
                localObject2 = ((j)localObject3).field_favProto.ukL;
                localObject3 = new ls();
                ((ls)localObject3).eQf.opType = 0;
                ((ls)localObject3).eQf.eQh = ((ts)localObject2).info;
                ((ls)localObject3).eQf.context = ((Context)localObject1);
                a.vgX.m((b)localObject3);
                if (((ls)localObject3).eQg.eDb)
                {
                  localObject2 = bg.readFromFile(x.axY() + com.tencent.mm.a.g.n(bg.aq(((ts)localObject2).thumbUrl, "").getBytes()));
                  localObject1 = localObject2;
                  if (localObject2 == null) {
                    localObject1 = bg.readFromFile(((ls)localObject3).eQg.eIy);
                  }
                  d.aOe().a(str, (byte[])localObject1, ((ls)localObject3).eQg.eQi, null);
                }
                break;
              case 15: 
                localObject1 = paramContext;
                localObject2 = ((j)localObject3).field_favProto.ukN;
                localObject3 = new qz();
                ((qz)localObject3).eVN.opType = 0;
                ((qz)localObject3).eVN.eVP = ((tz)localObject2).info;
                ((qz)localObject3).eVN.context = ((Context)localObject1);
                a.vgX.m((b)localObject3);
                w.d("MicroMsg.FavSendLogic", "sendFavTV ret = [%s], thumbUrl = [%s]", new Object[] { Boolean.valueOf(((qz)localObject3).eVO.eDb), ((tz)localObject2).thumbUrl });
                if (((qz)localObject3).eVO.eDb)
                {
                  localObject2 = bg.readFromFile(x.axY() + com.tencent.mm.a.g.n(bg.aq(((tz)localObject2).thumbUrl, "").getBytes()));
                  localObject1 = localObject2;
                  if (localObject2 == null) {
                    localObject1 = bg.readFromFile(((qz)localObject3).eVO.eIy);
                  }
                  d.aOe().a(str, (byte[])localObject1, ((qz)localObject3).eVO.eQi, null);
                }
                break;
              case 11: 
                localObject1 = paramContext;
                localObject2 = ((j)localObject3).field_favProto.ukL;
                localObject3 = new ls();
                ((ls)localObject3).eQf.opType = 1;
                ((ls)localObject3).eQf.eQh = ((ts)localObject2).info;
                ((ls)localObject3).eQf.context = ((Context)localObject1);
                a.vgX.m((b)localObject3);
                if (((ls)localObject3).eQg.eDb)
                {
                  localObject2 = bg.readFromFile(x.axY() + com.tencent.mm.a.g.n(bg.aq(((ts)localObject2).thumbUrl, "").getBytes()));
                  localObject1 = localObject2;
                  if (localObject2 == null) {
                    localObject1 = bg.readFromFile(((ls)localObject3).eQg.eIy);
                  }
                  d.aOe().a(str, (byte[])localObject1, ((ls)localObject3).eQg.eQi, null);
                }
                break;
              case 14: 
              case 18: 
                w.i("MicroMsg.FavSendLogic", "want send record, fav id %d", new Object[] { Integer.valueOf(((j)localObject3).field_id) });
                if ((((j)localObject3).field_id > 0) || (com.tencent.mm.pluginsdk.model.c.tmH))
                {
                  localObject1 = r.a.a(paramContext, (j)localObject3);
                  localObject2 = new tt();
                  try
                  {
                    w.d("MicroMsg.FavSendLogic", "do clone fav proto item");
                    ((tt)localObject2).aD(((j)localObject3).field_favProto.toByteArray());
                    localObject3 = new mn();
                    ((mn)localObject3).eRu.type = 2;
                    ((mn)localObject3).eRu.toUser = str;
                    ((mn)localObject3).eRu.eRx = ((tt)localObject2);
                    ((mn)localObject3).eRu.title = ((r.a)localObject1).title;
                    ((mn)localObject3).eRu.desc = ((r.a)localObject1).desc;
                    ((mn)localObject3).eRu.eIy = ((r.a)localObject1).eIy;
                    ((mn)localObject3).eRu.eRC = ((r.a)localObject1).lbo;
                    a.vgX.m((b)localObject3);
                  }
                  catch (Exception localException)
                  {
                    for (;;)
                    {
                      w.printErrStackTrace("MicroMsg.FavSendLogic", localException, "", new Object[0]);
                      w.e("MicroMsg.FavSendLogic", "clone fav proto item error: %s", new Object[] { localException.getMessage() });
                    }
                  }
                }
                break;
              case 17: 
                label1208:
                localObject1 = x.n(localException).desc;
                d.aOe().A(str, (String)localObject1, 42);
              }
            }
          }
          if (!bg.nm(paramString2)) {
            d.aOe().A(str, paramString2, s.go(str));
          }
        }
        af.t(paramRunnable);
        GMTrace.o(6295079878656L, 46902);
      }
      
      public final String toString()
      {
        GMTrace.i(6295214096384L, 46903);
        String str = super.toString() + "|sendFavMsg";
        GMTrace.o(6295214096384L, 46903);
        return str;
      }
    });
    GMTrace.o(6262196535296L, 46657);
  }
  
  public static void a(String paramString, j paramj, th paramth)
  {
    GMTrace.i(16031636520960L, 119445);
    Object localObject = x.g(paramth);
    WXFileObject localWXFileObject = new WXFileObject();
    localWXFileObject.setFilePath((String)localObject);
    localObject = new WXMediaMessage();
    ((WXMediaMessage)localObject).mediaObject = localWXFileObject;
    ((WXMediaMessage)localObject).title = paramth.title;
    if (bg.nm(((WXMediaMessage)localObject).title)) {
      ((WXMediaMessage)localObject).title = paramj.field_favProto.title;
    }
    ((WXMediaMessage)localObject).description = paramth.desc;
    ((WXMediaMessage)localObject).thumbData = bg.readFromFile(x.h(paramth));
    l.a((WXMediaMessage)localObject, "", "", paramString, 3, null);
    GMTrace.o(16031636520960L, 119445);
  }
  
  public static void b(Context paramContext, String paramString, th paramth)
  {
    GMTrace.i(16031502303232L, 119444);
    File localFile = new File(x.g(paramth));
    Object localObject2;
    if (localFile.exists())
    {
      localObject1 = new File(x.h(paramth));
      if (((File)localObject1).exists()) {}
      for (localObject1 = ((File)localObject1).getAbsolutePath();; localObject1 = x.axY() + com.tencent.mm.a.g.n(bg.aq(paramth.eDk, "").getBytes()))
      {
        w.d("MicroMsg.FavSendLogic", "sendVideo::data path[%s] thumb path[%s]", new Object[] { localFile.getAbsolutePath(), localObject1 });
        localObject2 = null;
        tk localtk = paramth.ukt;
        if (localtk != null)
        {
          localObject2 = new bhr();
          ((bhr)localObject2).gkN = localtk.gkN;
          ((bhr)localObject2).gkK = localtk.gkK;
          ((bhr)localObject2).ulk = localtk.ulk;
          ((bhr)localObject2).gkI = localtk.gkI;
          ((bhr)localObject2).gkL = localtk.gkL;
          ((bhr)localObject2).gkO = localtk.gkO;
          ((bhr)localObject2).gkP = localtk.gkP;
        }
        if (localObject2 == null) {
          break;
        }
        d.aOe().a(paramContext, paramString, localFile.getAbsolutePath(), (String)localObject1, 1, paramth.duration, (bhr)localObject2, false, false, paramth.eTv);
        GMTrace.o(16031502303232L, 119444);
        return;
      }
      d.aOe().a(paramContext, paramString, localFile.getAbsolutePath(), (String)localObject1, 1, paramth.duration, paramth.eTv);
      GMTrace.o(16031502303232L, 119444);
      return;
    }
    Object localObject1 = paramth.ujA;
    if (!bg.nm((String)localObject1))
    {
      localObject2 = new WXVideoObject();
      ((WXVideoObject)localObject2).videoUrl = ((String)localObject1);
      localObject1 = new WXMediaMessage((WXMediaMessage.IMediaObject)localObject2);
      paramContext = bg.aq(paramth.title, paramContext.getResources().getString(R.l.dve));
      ((WXMediaMessage)localObject1).mediaObject = ((WXMediaMessage.IMediaObject)localObject2);
      ((WXMediaMessage)localObject1).title = paramContext;
      ((WXMediaMessage)localObject1).description = paramth.desc;
      ((WXMediaMessage)localObject1).thumbData = bg.readFromFile(x.h(paramth));
      if (((WXMediaMessage)localObject1).thumbData == null) {
        ((WXMediaMessage)localObject1).thumbData = bg.readFromFile(x.axY() + com.tencent.mm.a.g.n(bg.aq(paramth.eDk, "").getBytes()));
      }
      paramContext = new f.a();
      paramContext.giy = 3;
      paramth = paramth.ukt;
      if (paramth != null)
      {
        paramContext.gkN = paramth.gkN;
        paramContext.gkK = paramth.gkK;
        paramContext.gkJ = paramth.ulk;
        paramContext.gkI = paramth.gkI;
        paramContext.gkL = paramth.gkL;
        paramContext.gkO = paramth.gkO;
        paramContext.gkP = paramth.gkP;
      }
      l.a(paramContext, (WXMediaMessage)localObject1, paramString);
    }
    GMTrace.o(16031502303232L, 119444);
  }
  
  public static String c(th paramth)
  {
    GMTrace.i(6262464970752L, 46659);
    File localFile = new File(x.h(paramth));
    if (localFile.exists()) {}
    for (paramth = localFile.getAbsolutePath();; paramth = x.axY() + com.tencent.mm.a.g.n(bg.aq(paramth.eDk, "").getBytes()))
    {
      GMTrace.o(6262464970752L, 46659);
      return paramth;
    }
  }
  
  public static final class a
  {
    public String desc;
    public String eIy;
    public String lbo;
    public String title;
    
    public a()
    {
      GMTrace.i(6311051788288L, 47021);
      GMTrace.o(6311051788288L, 47021);
    }
    
    public static a a(Context paramContext, j paramj)
    {
      GMTrace.i(6311320223744L, 47023);
      int j;
      Object localObject1;
      Object localObject2;
      if (paramj.field_type == 18)
      {
        locala = new a();
        localSparseIntArray = new SparseIntArray();
        if (paramj.field_type == 18) {
          locala.title = paramj.field_favProto.title;
        }
        localLinkedList = new LinkedList();
        localIterator = paramj.field_favProto.ulB.iterator();
        i = 0;
        j = 0;
        while (localIterator.hasNext())
        {
          localObject1 = (th)localIterator.next();
          if ((paramj.field_type != 18) || (bg.nm(((th)localObject1).ujI)) || (!((th)localObject1).ujI.equals(".htm")))
          {
            int k = localSparseIntArray.get(((th)localObject1).aGU);
            localSparseIntArray.put(((th)localObject1).aGU, k + 1);
            switch (((th)localObject1).aGU)
            {
            default: 
              break;
            case 1: 
              if (localLinkedList.size() < 4)
              {
                localObject1 = ((th)localObject1).desc;
                if (!bg.nm((String)localObject1))
                {
                  localObject1 = ((String)localObject1).replaceAll("&lt;", "<").replaceAll("&gt;", ">");
                  localLinkedList.add((String)localObject1 + "\n");
                }
              }
              break;
            case 3: 
              if (localLinkedList.size() < 4)
              {
                k = (int)x.cm(((th)localObject1).duration);
                localLinkedList.add(paramContext.getString(R.l.cUQ) + paramContext.getString(R.l.dxn, new Object[] { Integer.valueOf(k) }) + "\n");
              }
              break;
            case 2: 
              localLinkedList.size();
              if (j == 0)
              {
                localObject2 = x.h((th)localObject1);
                if (xK((String)localObject2))
                {
                  locala.eIy = ((String)localObject2);
                  j = 1;
                }
                else
                {
                  locala.eIy = x.g((th)localObject1);
                  j = 1;
                }
              }
              break;
            case 6: 
              if (localLinkedList.size() < 4)
              {
                localObject1 = ((th)localObject1).ukn.ukH;
                localObject2 = new StringBuilder().append(paramContext.getString(R.l.cTu));
                if ((!bg.nm(((to)localObject1).eQm)) && (!((to)localObject1).eQm.equals(paramContext.getString(R.l.dGL)))) {
                  break label557;
                }
              }
              for (localObject1 = ((to)localObject1).label;; localObject1 = ((to)localObject1).eQm)
              {
                localLinkedList.add((String)localObject1 + "\n");
                if (i != 0) {
                  break;
                }
                i = 1;
                break;
              }
            case 8: 
              if (localLinkedList.size() < 4) {
                localLinkedList.add(paramContext.getString(R.l.cTf) + ((th)localObject1).title + "\n");
              }
              if (i == 0) {
                i = 1;
              }
              break;
            case 4: 
              if (localLinkedList.size() < 4) {
                localLinkedList.add(paramContext.getString(R.l.cUP) + "\n");
              }
              break;
            case 17: 
              label557:
              if (localLinkedList.size() < 4) {
                localLinkedList.add(paramContext.getString(R.l.cUk) + "\n");
              }
              break;
            }
          }
        }
        locala.desc = "";
        paramj = localLinkedList.iterator();
        for (paramContext = ""; paramj.hasNext(); paramContext = paramContext + (String)localObject1) {
          localObject1 = (String)paramj.next();
        }
        paramj = paramContext.trim();
        paramContext = paramj;
        if (localLinkedList.size() >= 4) {
          paramContext = paramj + "...";
        }
        locala.desc = paramContext;
        locala.title = ab.getContext().getString(R.l.dvi);
        GMTrace.o(6311320223744L, 47023);
        return locala;
      }
      a locala = new a();
      SparseIntArray localSparseIntArray = new SparseIntArray();
      if (paramj.field_type == 14) {
        locala.title = paramj.field_favProto.title;
      }
      LinkedList localLinkedList = new LinkedList();
      Iterator localIterator = paramj.field_favProto.ulB.iterator();
      int i = 0;
      while (localIterator.hasNext())
      {
        localObject2 = (th)localIterator.next();
        j = localSparseIntArray.get(((th)localObject2).aGU);
        localSparseIntArray.put(((th)localObject2).aGU, j + 1);
        switch (((th)localObject2).aGU)
        {
        case 9: 
        case 12: 
        case 13: 
        default: 
          break;
        case 1: 
          if (localLinkedList.size() < 4) {
            localLinkedList.add(((th)localObject2).ukp + ":" + ((th)localObject2).desc + "\n");
          }
          break;
        case 3: 
          if (localLinkedList.size() < 4)
          {
            j = (int)x.aD(((th)localObject2).duration);
            localLinkedList.add(((th)localObject2).ukp + ":" + paramContext.getString(R.l.cUQ) + paramContext.getString(R.l.dxn, new Object[] { Integer.valueOf(j) }) + "\n");
          }
          break;
        case 2: 
          if (localLinkedList.size() < 4) {
            localLinkedList.add(((th)localObject2).ukp + ":" + paramContext.getString(R.l.cUb) + "\n");
          }
          if (i == 0)
          {
            paramj = x.h((th)localObject2);
            if (!xK(paramj)) {
              break label2349;
            }
            locala.eIy = paramj;
            i = 1;
          }
          break;
        }
      }
      label1720:
      label2349:
      for (;;)
      {
        break;
        if (localLinkedList.size() < 4) {
          localLinkedList.add(((th)localObject2).ukp + ":" + paramContext.getString(R.l.cUM) + ((th)localObject2).title + "\n");
        }
        if (i != 0) {
          break;
        }
        paramj = x.h((th)localObject2);
        if (xK(paramj))
        {
          locala.eIy = paramj;
          i = 1;
          break;
        }
        paramj = ((th)localObject2).ukn.ukJ;
        if (paramj == null) {}
        for (paramj = "";; paramj = paramj.thumbUrl)
        {
          localObject1 = paramj;
          if (bg.nm(paramj)) {
            localObject1 = bg.aq(((th)localObject2).eDk, "");
          }
          a(locala, (String)localObject1);
          break;
        }
        if (localLinkedList.size() < 4) {
          localLinkedList.add(((th)localObject2).ukp + ":" + paramContext.getString(R.l.cUz) + "\n");
        }
        if (i != 0) {
          break;
        }
        paramj = x.h((th)localObject2);
        if (xK(paramj))
        {
          locala.eIy = paramj;
          i = 1;
        }
        for (;;)
        {
          break;
          if (localLinkedList.size() < 4) {
            localLinkedList.add(((th)localObject2).ukp + ":" + paramContext.getString(R.l.cUP) + "\n");
          }
          if (i != 0) {
            break;
          }
          paramj = x.h((th)localObject2);
          if (xK(paramj))
          {
            locala.eIy = paramj;
            i = 1;
          }
          for (;;)
          {
            break;
            if (localLinkedList.size() < 4)
            {
              paramj = ((th)localObject2).ukn.ukH;
              localObject1 = new StringBuilder().append(((th)localObject2).ukp).append(":").append(paramContext.getString(R.l.cTu));
              if ((!bg.nm(paramj.eQm)) && (!paramj.eQm.equals(paramContext.getString(R.l.dGL)))) {
                break label1720;
              }
            }
            for (paramj = paramj.label;; paramj = paramj.eQm)
            {
              localLinkedList.add(paramj + "\n");
              if (i != 0) {
                break;
              }
              i = 1;
              break;
            }
            if (localLinkedList.size() < 4) {
              localLinkedList.add(((th)localObject2).ukp + ":" + paramContext.getString(R.l.cTB) + ((th)localObject2).title + "\n");
            }
            if (i != 0) {
              break;
            }
            a(locala, ((th)localObject2).eDk);
            i = 1;
            break;
            if (localLinkedList.size() < 4) {
              localLinkedList.add(((th)localObject2).ukp + ":" + paramContext.getString(R.l.cTf) + ((th)localObject2).title + "\n");
            }
            if (i != 0) {
              break;
            }
            i = 1;
            break;
            if (localLinkedList.size() < 4) {
              localLinkedList.add(((th)localObject2).ukp + ":" + paramContext.getString(R.l.cUd) + ((th)localObject2).ukn.ukL.title + "\n");
            }
            if (i != 0) {
              break;
            }
            paramj = ((th)localObject2).ukn.ukL;
            if (paramj != null) {
              a(locala, paramj.thumbUrl);
            }
            i = 1;
            break;
            if (localLinkedList.size() < 4) {
              localLinkedList.add(((th)localObject2).ukp + ":" + paramContext.getString(R.l.cRN) + "\n");
            }
            if (i != 0) {
              break;
            }
            paramj = ((th)localObject2).ukn.ukN;
            if (paramj != null) {
              a(locala, paramj.thumbUrl);
            }
            i = 1;
            break;
            if (localLinkedList.size() < 4) {
              localLinkedList.add(((th)localObject2).ukp + ":" + paramContext.getString(R.l.cTj) + "\n");
            }
            if (i != 0) {
              break;
            }
            at.AR();
            locala.lbo = com.tencent.mm.y.c.yM().Cn(((th)localObject2).desc).rAP;
            i = 1;
            break;
            if (localLinkedList.size() >= 4) {
              break;
            }
            localLinkedList.add(((th)localObject2).ukp + ":" + paramContext.getString(R.l.cUk) + "\n");
            break;
            locala.desc = "";
            paramj = localLinkedList.iterator();
            for (paramContext = ""; paramj.hasNext(); paramContext = paramContext + (String)localObject1) {
              localObject1 = (String)paramj.next();
            }
            paramj = paramContext.trim();
            paramContext = paramj;
            if (localLinkedList.size() >= 4) {
              paramContext = paramj + "...";
            }
            locala.desc = paramContext;
            GMTrace.o(6311320223744L, 47023);
            return locala;
          }
        }
      }
    }
    
    private static void a(a parama, String paramString)
    {
      GMTrace.i(6311454441472L, 47024);
      paramString = x.axY() + com.tencent.mm.a.g.n(bg.aq(paramString, "").getBytes());
      if (xK(paramString)) {
        parama.eIy = paramString;
      }
      GMTrace.o(6311454441472L, 47024);
    }
    
    private static boolean xK(String paramString)
    {
      GMTrace.i(6311186006016L, 47022);
      boolean bool = new File(paramString).exists();
      GMTrace.o(6311186006016L, 47022);
      return bool;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\b\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */