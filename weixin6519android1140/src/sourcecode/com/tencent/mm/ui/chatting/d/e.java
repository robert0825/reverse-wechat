package com.tencent.mm.ui.chatting.d;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Looper;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.GridLayoutManager.b;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.support.v7.widget.RecyclerView.g;
import android.support.v7.widget.RecyclerView.h;
import android.view.View;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.ao.c.a;
import com.tencent.mm.ao.n;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.g.a.cf.a;
import com.tencent.mm.g.a.cf.b;
import com.tencent.mm.g.a.gj;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.s.a;
import com.tencent.mm.modelvideo.s.a.a;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pluginsdk.model.app.l.a;
import com.tencent.mm.protocal.c.anf;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.protocal.c.ue;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.chatting.a.d;
import com.tencent.mm.ui.chatting.c.a.a;
import com.tencent.mm.ui.chatting.dx;
import com.tencent.mm.ui.chatting.dx.a;
import com.tencent.mm.ui.chatting.gallery.b;
import com.tencent.mm.ui.chatting.gallery.g.a;
import com.tencent.mm.ui.chatting.gallery.g.b;
import com.tencent.mm.ui.chatting.gallery.i;
import com.tencent.mm.ui.chatting.z;
import com.tencent.mm.y.at;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public final class e
  implements c.a, s.a, a.a, g.b
{
  static int count;
  public ArrayList<com.tencent.mm.ui.chatting.a.a.c> iFZ;
  public String iGc;
  public int lyd;
  public Context mContext;
  public ae mHandler;
  public long wHM;
  private com.tencent.mm.sdk.b.c wIv;
  public int wOJ;
  public com.tencent.mm.ui.chatting.c.a.b wON;
  com.tencent.mm.ui.chatting.a.a wOO;
  private GridLayoutManager wOP;
  boolean wOQ;
  public int wOR;
  public boolean wOS;
  
  static
  {
    GMTrace.i(14936151425024L, 111283);
    count = 0;
    GMTrace.o(14936151425024L, 111283);
  }
  
  public e(Context paramContext)
  {
    GMTrace.i(14931856457728L, 111251);
    this.iFZ = null;
    this.wIv = new com.tencent.mm.sdk.b.c() {};
    this.wOQ = false;
    this.wOR = 0;
    this.mHandler = new ae(Looper.getMainLooper());
    this.wOS = false;
    this.wOJ = 0;
    this.lyd = 0;
    this.mContext = paramContext;
    this.iFZ = new ArrayList();
    GMTrace.o(14931856457728L, 111251);
  }
  
  static String c(au paramau, r paramr)
  {
    GMTrace.i(18820680908800L, 140225);
    Object localObject;
    if (paramr.hcC == -1)
    {
      paramr = paramr.Ns();
      localObject = paramr;
      if (!com.tencent.mm.a.e.aZ(paramr))
      {
        o.Nh();
        localObject = s.mk(paramau.field_imgPath);
      }
    }
    String str;
    do
    {
      do
      {
        do
        {
          GMTrace.o(18820680908800L, 140225);
          return (String)localObject;
          o.Nh();
          str = s.mk(paramau.field_imgPath);
          localObject = str;
        } while (paramau.field_isSend != 1);
        localObject = str;
      } while (paramr.hcF == null);
      localObject = str;
    } while (!paramr.hcF.uBZ);
    for (;;)
    {
      try
      {
        paramr = FileOp.kZ(str);
        paramau = paramr;
        if (!paramr.endsWith("/")) {
          paramau = paramr + "/";
        }
        paramr = com.tencent.mm.a.e.bc(str);
        paramau = paramau + paramr + "_hd.mp4";
        boolean bool = FileOp.aZ(paramau);
        w.i("MicroMsg.MediaHistoryGalleryPresenter", "local capture video, hdFilePath: %s, exist: %s", new Object[] { paramau, Boolean.valueOf(bool) });
        if (!bool) {
          break label227;
        }
        localObject = paramau;
      }
      catch (Exception paramau)
      {
        w.e("MicroMsg.MediaHistoryGalleryPresenter", "try to get hd filePath error: %s", new Object[] { paramau.getMessage() });
        localObject = str;
      }
      break;
      label227:
      paramau = str;
    }
  }
  
  private void cQ(final List<au> paramList)
  {
    GMTrace.i(14933735505920L, 111265);
    com.tencent.mm.plugin.report.service.g.ork.i(11627, new Object[] { Integer.valueOf(5) });
    final TreeSet localTreeSet = new TreeSet();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext()) {
      localTreeSet.add(Long.valueOf(((au)localIterator.next()).field_msgId));
    }
    com.tencent.mm.ui.base.h.a(this.mContext, this.mContext.getString(R.l.din), "", this.mContext.getString(R.l.dmE), this.mContext.getString(R.l.cSk), new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(18815312199680L, 140185);
        w.i("MicroMsg.MediaHistoryGalleryPresenter", "delete message");
        z.a(e.this.mContext, localTreeSet, new dx()
        {
          public final void a(dx.a paramAnonymous2a)
          {
            GMTrace.i(18815714852864L, 140188);
            if (paramAnonymous2a == dx.a.wFR) {
              e.this.iFZ.removeAll(e.5.this.inH);
            }
            GMTrace.o(18815714852864L, 140188);
          }
          
          public final void b(dx.a paramAnonymous2a)
          {
            GMTrace.i(18815849070592L, 140189);
            w.i("MicroMsg.MediaHistoryGalleryPresenter", "[requestExitSelectedMode] %s del size:%s job:%s", new Object[] { Thread.currentThread(), Integer.valueOf(e.5.this.inH.size()), paramAnonymous2a });
            if (paramAnonymous2a == dx.a.wFR) {
              e.this.wON.ceR();
            }
            GMTrace.o(18815849070592L, 140189);
          }
          
          public final void ccH()
          {
            GMTrace.i(18815580635136L, 140187);
            GMTrace.o(18815580635136L, 140187);
          }
          
          public final boolean ccI()
          {
            GMTrace.i(18815983288320L, 140190);
            GMTrace.o(18815983288320L, 140190);
            return true;
          }
        });
        GMTrace.o(18815312199680L, 140185);
      }
    }, null);
    GMTrace.o(14933735505920L, 111265);
  }
  
  public static void cR(List<au> paramList)
  {
    GMTrace.i(14933869723648L, 111266);
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      au localau = (au)paramList.next();
      com.tencent.mm.ui.chatting.a.a(com.tencent.mm.ui.chatting.a.c.wqy, a.d.wqD, localau, 0);
    }
    GMTrace.o(14933869723648L, 111266);
  }
  
  public final void CY(int paramInt)
  {
    GMTrace.i(14932661764096L, 111257);
    w.i("MicroMsg.MediaHistoryGalleryPresenter", "[handleSelectedItem] type:%s", new Object[] { Integer.valueOf(paramInt) });
    final ArrayList localArrayList = g.a.wMg.wKD;
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(14932661764096L, 111257);
      return;
      this.wON.ceU();
      final Object localObject1 = new ArrayList();
      Object localObject2 = localArrayList.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (au)((Iterator)localObject2).next();
        if ((!b.aZ((au)localObject3)) && (!b.ba((au)localObject3))) {
          ((List)localObject1).add(localObject3);
        }
      }
      if (((List)localObject1).size() != localArrayList.size())
      {
        com.tencent.mm.ui.base.h.a(this.mContext, R.l.dzf, R.l.cUG, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(18815043764224L, 140183);
            e.this.cN(localObject1);
            GMTrace.o(18815043764224L, 140183);
          }
        }, null);
        GMTrace.o(14932661764096L, 111257);
        return;
      }
      cN((List)localObject1);
      GMTrace.o(14932661764096L, 111257);
      return;
      com.tencent.mm.plugin.report.service.g.ork.a(219L, 18L, 1L, true);
      final Object localObject3 = new cf();
      if (com.tencent.mm.pluginsdk.model.g.a(this.mContext, (cf)localObject3, this.iGc, localArrayList, false, false))
      {
        b((cf)localObject3);
        cR(localArrayList);
      }
      for (;;)
      {
        this.wON.ceR();
        GMTrace.o(14932661764096L, 111257);
        return;
        if (localArrayList.size() > 1)
        {
          Context localContext = this.mContext;
          if (((cf)localObject3).eDv.eDB >= 0)
          {
            localObject1 = this.mContext.getString(R.l.dtH);
            label331:
            if (((cf)localObject3).eDv.eDB < 0) {
              break label406;
            }
          }
          label406:
          for (localObject2 = this.mContext.getString(R.l.diu);; localObject2 = this.mContext.getString(R.l.dNH))
          {
            com.tencent.mm.ui.base.h.a(localContext, (String)localObject1, "", (String)localObject2, this.mContext.getString(R.l.dis), new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                GMTrace.i(18817459683328L, 140201);
                if ((localObject3.eDv.type == 14) && (localObject3.eDv.eDx.ulB.size() == 0))
                {
                  GMTrace.o(18817459683328L, 140201);
                  return;
                }
                e.this.b(localObject3);
                e.cR(localArrayList);
                GMTrace.o(18817459683328L, 140201);
              }
            }, null);
            break;
            localObject1 = this.mContext.getString(R.l.dtG);
            break label331;
          }
        }
        com.tencent.mm.ui.base.h.h(this.mContext, ((cf)localObject3).eDv.eDB, 0);
      }
      com.tencent.mm.plugin.report.service.g.ork.a(219L, 19L, 1L, true);
      boolean bool = this.iGc.toLowerCase().endsWith("@chatroom");
      com.tencent.mm.ui.chatting.ab.a(this.mContext, localArrayList, bool, this.iGc, new dx()
      {
        public final void a(dx.a paramAnonymousa)
        {
          GMTrace.i(18816654376960L, 140195);
          GMTrace.o(18816654376960L, 140195);
        }
        
        public final void b(dx.a paramAnonymousa)
        {
          GMTrace.i(18816788594688L, 140196);
          GMTrace.o(18816788594688L, 140196);
        }
        
        public final void ccH()
        {
          GMTrace.i(18816520159232L, 140194);
          GMTrace.o(18816520159232L, 140194);
        }
        
        public final boolean ccI()
        {
          GMTrace.i(18816922812416L, 140197);
          GMTrace.o(18816922812416L, 140197);
          return true;
        }
      });
      this.wON.ceR();
      GMTrace.o(14932661764096L, 111257);
      return;
      cQ(localArrayList);
    }
  }
  
  public final String Qb()
  {
    GMTrace.i(14932527546368L, 111256);
    String str = this.mContext.getString(R.l.cRC);
    GMTrace.o(14932527546368L, 111256);
    return str;
  }
  
  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject)
  {
    GMTrace.i(18819741384704L, 140218);
    GMTrace.o(18819741384704L, 140218);
  }
  
  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject, int paramInt3, int paramInt4, k paramk)
  {
    GMTrace.i(18819472949248L, 140216);
    w.d("MicroMsg.MediaHistoryGalleryPresenter", "[onImgTaskProgress] offset:%s totalLen:%s", new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    GMTrace.o(18819472949248L, 140216);
  }
  
  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject, int paramInt3, int paramInt4, String paramString, k paramk)
  {
    GMTrace.i(18819607166976L, 140217);
    w.i("MicroMsg.MediaHistoryGalleryPresenter", "[onImgTaskEnd] mNeedDownloadCount:%s imgLocalId:%s msgLocalId:%s err[%s:%s:%s]", new Object[] { Integer.valueOf(this.wOR), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), paramString });
    if (!this.wON.ceW())
    {
      GMTrace.o(18819607166976L, 140217);
      return;
    }
    this.wOR -= 1;
    at.AR();
    paramObject = com.tencent.mm.y.c.yM().cM(paramLong2);
    if (!b.b(this.mContext, (au)paramObject, false)) {
      this.wOS = true;
    }
    if (cga())
    {
      if (!this.wOS)
      {
        this.mHandler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(18816251723776L, 140192);
            if (e.this.wON != null) {
              e.this.wON.ceV();
            }
            GMTrace.o(18816251723776L, 140192);
          }
        });
        GMTrace.o(18819607166976L, 140217);
        return;
      }
      this.mHandler.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18819070296064L, 140213);
          if (e.this.wON != null) {
            e.this.wON.Da(R.l.dzo);
          }
          GMTrace.o(18819070296064L, 140213);
        }
      });
    }
    GMTrace.o(18819607166976L, 140217);
  }
  
  public final void a(s.a.a parama)
  {
    GMTrace.i(18820009820160L, 140220);
    if (!this.wON.ceW())
    {
      GMTrace.o(18820009820160L, 140220);
      return;
    }
    r localr = t.mw(parama.euR);
    w.d("MicroMsg.MediaHistoryGalleryPresenter", "[notifyChanged] mNeedDownloadCount:%s statusType:%s %s", new Object[] { Integer.valueOf(this.wOR), parama.hcM, parama.euR });
    if (localr != null) {
      if (localr.Nw())
      {
        this.wOR -= 1;
        at.AR();
        parama = com.tencent.mm.y.c.yM().cM(localr.hcw);
        b.a(this.mContext, parama, false);
      }
    }
    while (cga()) {
      if (this.wOS)
      {
        this.mHandler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(18821486215168L, 140231);
            if (e.this.wON != null) {
              e.this.wON.Da(R.l.dzo);
            }
            GMTrace.o(18821486215168L, 140231);
          }
        });
        GMTrace.o(18820009820160L, 140220);
        return;
        w.e("MicroMsg.MediaHistoryGalleryPresenter", "[notifyChanged] videoInfo is null!");
        ceT();
        this.wON.Da(0);
      }
      else
      {
        this.mHandler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(18817057030144L, 140198);
            if (e.this.wON != null) {
              e.this.wON.ceV();
            }
            GMTrace.o(18817057030144L, 140198);
          }
        });
      }
    }
    GMTrace.o(18820009820160L, 140220);
  }
  
  public final RecyclerView.a an(String paramString, long paramLong)
  {
    GMTrace.i(14932393328640L, 111255);
    this.iGc = paramString;
    this.wHM = paramLong;
    if (paramLong == -1L) {}
    for (this.wOO = new com.tencent.mm.ui.chatting.a.a(this.mContext, this.iFZ, paramString);; this.wOO = new com.tencent.mm.ui.chatting.a.a(this.mContext, this.iFZ, paramString, paramLong))
    {
      this.wOO.wHO = new com.tencent.mm.ui.chatting.a.a.b()
      {
        public final void a(boolean paramAnonymousBoolean, com.tencent.mm.ui.chatting.a.a.c paramAnonymousc, int paramAnonymousInt)
        {
          GMTrace.i(18817191247872L, 140199);
          w.i("MicroMsg.MediaHistoryGalleryPresenter", "[onCheck] isChecked :%s pos:%s", new Object[] { Boolean.valueOf(paramAnonymousBoolean), Integer.valueOf(paramAnonymousInt) });
          if ((paramAnonymousBoolean) && (g.a.wMg.wKD.size() >= 9))
          {
            Toast.makeText(e.this.mContext, e.this.mContext.getResources().getString(R.l.dzj, new Object[] { Integer.valueOf(9) }), 1).show();
            e.this.wOO.bc(paramAnonymousInt);
            GMTrace.o(18817191247872L, 140199);
            return;
          }
          if (paramAnonymousBoolean) {
            g.a.wMg.bn(paramAnonymousc.eRz);
          }
          for (;;)
          {
            e.this.wON.CZ(g.a.wMg.wKD.size());
            GMTrace.o(18817191247872L, 140199);
            return;
            g.a.wMg.bo(paramAnonymousc.eRz);
          }
        }
      };
      paramString = this.wOO;
      GMTrace.o(14932393328640L, 111255);
      return paramString;
    }
  }
  
  public final void b(cf paramcf)
  {
    GMTrace.i(14934003941376L, 111267);
    paramcf.eDv.eDC = 45;
    paramcf.eDv.activity = ((Activity)this.mContext);
    com.tencent.mm.sdk.b.a.vgX.m(paramcf);
    if ((paramcf.eDw.ret == -2) || (paramcf.eDw.ret > 0))
    {
      GMTrace.o(14934003941376L, 111267);
      return;
    }
    if (paramcf.eDw.ret <= 0)
    {
      if (14 != paramcf.eDv.type)
      {
        w.d("MicroMsg.MediaHistoryGalleryPresenter", "not record type, do not report");
        GMTrace.o(14934003941376L, 111267);
        return;
      }
      if (paramcf.eDv.eDy == null)
      {
        w.e("MicroMsg.MediaHistoryGalleryPresenter", "want to report record fav, but type count is null");
        GMTrace.o(14934003941376L, 111267);
        return;
      }
      com.tencent.mm.plugin.report.service.g.ork.i(11142, new Object[] { Integer.valueOf(paramcf.eDv.eDy.ulQ), Integer.valueOf(paramcf.eDv.eDy.ulR), Integer.valueOf(paramcf.eDv.eDy.ulS), Integer.valueOf(paramcf.eDv.eDy.ulT), Integer.valueOf(paramcf.eDv.eDy.ulU), Integer.valueOf(paramcf.eDv.eDy.ulV), Integer.valueOf(paramcf.eDv.eDy.ulW), Integer.valueOf(paramcf.eDv.eDy.ulX), Integer.valueOf(paramcf.eDv.eDy.ulY), Integer.valueOf(paramcf.eDv.eDy.ulZ), Integer.valueOf(paramcf.eDv.eDy.uma), Integer.valueOf(paramcf.eDv.eDy.umb), Integer.valueOf(paramcf.eDv.eDy.umc), Integer.valueOf(paramcf.eDv.eDy.umd), Integer.valueOf(paramcf.eDv.eDy.ume) });
    }
    GMTrace.o(14934003941376L, 111267);
  }
  
  public final void cN(final List<au> paramList)
  {
    GMTrace.i(18820144037888L, 140221);
    com.tencent.mm.sdk.f.e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18818264989696L, 140207);
        Object localObject2 = paramList;
        int i;
        Object localObject3;
        label73:
        Object localObject4;
        if (localObject2 == null)
        {
          i = 0;
          if (paramList.size() == i)
          {
            e.this.mHandler.post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(18814775328768L, 140181);
                e.this.wON.Da(R.l.dzn);
                GMTrace.o(18814775328768L, 140181);
              }
            });
            GMTrace.o(18818264989696L, 140207);
          }
        }
        else
        {
          localObject3 = ((List)localObject2).iterator();
          i = 0;
          for (;;)
          {
            if (((Iterator)localObject3).hasNext())
            {
              localObject1 = (au)((Iterator)localObject3).next();
              if (((au)localObject1).bTO())
              {
                i += 1;
              }
              else if (b.aY((au)localObject1))
              {
                localObject4 = i.br((au)localObject1);
                if (localObject4 == null) {
                  break label1020;
                }
                w.i("MicroMsg.MediaHistoryGalleryPresenter", "[checkLegal] getStatus:%s", new Object[] { Integer.valueOf(((r)localObject4).status) });
              }
            }
          }
        }
        label296:
        label300:
        label385:
        label637:
        label708:
        label713:
        label1020:
        for (Object localObject1 = e.c((au)localObject1, (r)localObject4);; localObject1 = null)
        {
          if ((localObject4 == null) || (((r)localObject4).status == 198) || (!FileOp.aZ((String)localObject1))) {
            i += 1;
          }
          for (;;)
          {
            break label73;
            localObject4 = com.tencent.mm.ui.chatting.gallery.d.bm((au)localObject1);
            if (localObject4 != null) {
              w.i("MicroMsg.MediaHistoryGalleryPresenter", "[checkLegal] getStatus:%s", new Object[] { Integer.valueOf(((com.tencent.mm.ao.d)localObject4).status) });
            }
            if (((ce)localObject1).field_type == 268435505)
            {
              localObject1 = b.bh((au)localObject1);
              w.i("MicroMsg.MediaHistoryGalleryPresenter", "[checkLegal] is appmsg! null?%s,exists:%s", new Object[] { Boolean.valueOf(bg.nm((String)localObject1)), Boolean.valueOf(new File(bg.aq((String)localObject1, "")).exists()) });
              if (FileOp.aZ((String)localObject1)) {
                break label385;
              }
              i += 1;
              break label73;
            }
            if (localObject4 != null) {}
            for (localObject1 = com.tencent.mm.ui.chatting.gallery.d.a((au)localObject1, (com.tencent.mm.ao.d)localObject4, false);; localObject1 = null)
            {
              w.i("MicroMsg.MediaHistoryGalleryPresenter", "[checkLegal] null?%s,exists:%s", new Object[] { Boolean.valueOf(bg.nm((String)localObject1)), Boolean.valueOf(new File(bg.aq((String)localObject1, "")).exists()) });
              if ((localObject4 == null) || (((com.tencent.mm.ao.d)localObject4).status == -1) || (!FileOp.aZ((String)localObject1))) {
                break label296;
              }
              break label300;
              w.i("MicroMsg.MediaHistoryGalleryPresenter", "[checkLegal] count:%s size:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(((List)localObject2).size()) });
              break;
              localObject1 = e.this;
              if (i > 0) {}
              for (boolean bool1 = true;; bool1 = false)
              {
                ((e)localObject1).wOS = bool1;
                localObject2 = e.this.cO(paramList);
                localObject1 = e.this.cP(paramList);
                w.i("MicroMsg.MediaHistoryGalleryPresenter", "[innerHandleSave] needDownloadImageList size:%s needDownloadVideoList:%s", new Object[] { Integer.valueOf(((List)localObject2).size()), Integer.valueOf(((List)localObject1).size()) });
                e.this.wOR = (((List)localObject2).size() + ((List)localObject1).size());
                if ((am.isWifi(com.tencent.mm.sdk.platformtools.ab.getContext())) || (e.this.wOR != paramList.size())) {
                  break;
                }
                e.this.mHandler.post(new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(18820949344256L, 140227);
                    e.this.wON.Da(R.l.dzn);
                    GMTrace.o(18820949344256L, 140227);
                  }
                });
                GMTrace.o(18818264989696L, 140207);
                return;
              }
              localObject2 = ((List)localObject2).iterator();
              while (((Iterator)localObject2).hasNext())
              {
                localObject3 = (au)((Iterator)localObject2).next();
                localObject4 = e.this;
                com.tencent.mm.ao.d locald = com.tencent.mm.ui.chatting.gallery.d.bm((au)localObject3);
                if (localObject3 == null)
                {
                  bool1 = true;
                  if (locald != null) {
                    break label708;
                  }
                }
                for (boolean bool2 = true;; bool2 = false)
                {
                  w.e("MicroMsg.MediaHistoryGalleryPresenter", "[downloadImg] %s %s ", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
                  if (localObject3 == null) {
                    break;
                  }
                  if (((ce)localObject3).field_type != 268435505) {
                    break label713;
                  }
                  l.a((au)localObject3, new e.3((e)localObject4, (au)localObject3));
                  break;
                  bool1 = false;
                  break label637;
                }
                if ((locald != null) && (n.Ja().a(locald.gGR, ((ce)localObject3).field_msgId, 0, Integer.valueOf(-1), -1, (c.a)localObject4, 0) == -2))
                {
                  w.w("MicroMsg.MediaHistoryGalleryPresenter", "[downloadImg] this img has download! %s", new Object[] { locald.gGS });
                  ((e)localObject4).wOR -= 1;
                  b.b(((e)localObject4).mContext, (au)localObject3, false);
                }
              }
              localObject1 = ((List)localObject1).iterator();
              while (((Iterator)localObject1).hasNext())
              {
                localObject2 = (au)((Iterator)localObject1).next();
                localObject3 = e.this;
                localObject4 = i.br((au)localObject2);
                if (localObject4 == null)
                {
                  w.e("MicroMsg.MediaHistoryGalleryPresenter", "[saveVideo] info == null");
                }
                else
                {
                  o.Nh().a((s.a)localObject3, Looper.getMainLooper());
                  if (((r)localObject4).Nv())
                  {
                    w.i("MicroMsg.MediaHistoryGalleryPresenter", "start complete online video");
                    t.mA(((ce)localObject2).field_imgPath);
                  }
                  else
                  {
                    w.i("MicroMsg.MediaHistoryGalleryPresenter", "start complete offline video");
                    t.P(((ce)localObject2).field_imgPath, 10);
                    t.ms(((ce)localObject2).field_imgPath);
                  }
                }
              }
              if ((e.this.wOS) && (e.this.wOR == 0)) {
                e.this.mHandler.post(new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(18819338731520L, 140215);
                    e.this.wON.Da(R.l.dzo);
                    GMTrace.o(18819338731520L, 140215);
                  }
                });
              }
              if ((e.this.cga()) && (!e.this.wOS)) {
                e.this.mHandler.post(new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(18821754650624L, 140233);
                    if (e.this.wON != null) {
                      e.this.wON.ceV();
                    }
                    GMTrace.o(18821754650624L, 140233);
                  }
                });
              }
              GMTrace.o(18818264989696L, 140207);
              return;
            }
          }
        }
      }
    }, "handleSave");
    GMTrace.o(18820144037888L, 140221);
  }
  
  public final LinkedList<au> cO(List<au> paramList)
  {
    GMTrace.i(18820412473344L, 140223);
    LinkedList localLinkedList = new LinkedList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      au localau = (au)paramList.next();
      if (b.aX(localau))
      {
        if (!com.tencent.mm.ui.chatting.gallery.d.bm(localau).IH())
        {
          localLinkedList.add(localau);
        }
        else
        {
          this.wOR -= 1;
          b.b(this.mContext, localau, false);
        }
      }
      else if (localau.field_type == 268435505) {
        if ((!bg.nm(b.bh(localau))) && (new File(b.bh(localau)).exists()))
        {
          this.wOR -= 1;
          b.b(this.mContext, localau, false);
        }
        else
        {
          localLinkedList.add(localau);
        }
      }
    }
    GMTrace.o(18820412473344L, 140223);
    return localLinkedList;
  }
  
  public final LinkedList<au> cP(List<au> paramList)
  {
    GMTrace.i(18820546691072L, 140224);
    LinkedList localLinkedList = new LinkedList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      au localau = (au)paramList.next();
      if (b.aY(localau)) {
        if (!i.br(localau).Nw())
        {
          localLinkedList.add(localau);
        }
        else
        {
          this.wOR -= 1;
          b.a(this.mContext, localau, false);
        }
      }
    }
    GMTrace.o(18820546691072L, 140224);
    return localLinkedList;
  }
  
  public final int ceP()
  {
    GMTrace.i(14932795981824L, 111258);
    int i = g.a.wMg.wKD.size();
    GMTrace.o(14932795981824L, 111258);
    return i;
  }
  
  public final void ceQ()
  {
    GMTrace.i(14932930199552L, 111259);
    this.wOO.wHP = true;
    g.a.wMg.wMe = true;
    GridLayoutManager localGridLayoutManager = (GridLayoutManager)fv(this.mContext);
    int i = localGridLayoutManager.eZ();
    int j = localGridLayoutManager.fa();
    this.wOO.b(i, j - i + 1, Integer.valueOf(0));
    GMTrace.o(14932930199552L, 111259);
  }
  
  public final void ceR()
  {
    GMTrace.i(14933064417280L, 111260);
    this.wOO.wHP = false;
    g.a.wMg.clear();
    g.a.wMg.wMe = false;
    this.wOO.TS.notifyChanged();
    GMTrace.o(14933064417280L, 111260);
  }
  
  public final boolean ceS()
  {
    GMTrace.i(14933198635008L, 111261);
    boolean bool = g.a.wMg.wMe;
    GMTrace.o(14933198635008L, 111261);
    return bool;
  }
  
  public final void ceT()
  {
    GMTrace.i(18819875602432L, 140219);
    n.Ja().a(this);
    o.Nh().a(this);
    this.wON.ceT();
    GMTrace.o(18819875602432L, 140219);
  }
  
  public final void cfm()
  {
    GMTrace.i(14933467070464L, 111263);
    this.wOQ = true;
    GMTrace.o(14933467070464L, 111263);
  }
  
  public final boolean cga()
  {
    GMTrace.i(18820278255616L, 140222);
    if (this.wOR == 0)
    {
      GMTrace.o(18820278255616L, 140222);
      return true;
    }
    GMTrace.o(18820278255616L, 140222);
    return false;
  }
  
  public final void clear()
  {
    GMTrace.i(14933601288192L, 111264);
    GMTrace.o(14933601288192L, 111264);
  }
  
  public final <T extends RecyclerView.h> T fv(Context paramContext)
  {
    GMTrace.i(14932124893184L, 111253);
    if (this.wOP == null)
    {
      this.wOP = new GridLayoutManager(paramContext, 4);
      this.wOP.QC = new GridLayoutManager.b()
      {
        public final int aT(int paramAnonymousInt)
        {
          GMTrace.i(14946888843264L, 111363);
          if (((com.tencent.mm.ui.chatting.a.a.c)e.this.iFZ.get(paramAnonymousInt)).type == Integer.MAX_VALUE)
          {
            GMTrace.o(14946888843264L, 111363);
            return 4;
          }
          GMTrace.o(14946888843264L, 111363);
          return 1;
        }
      };
    }
    paramContext = this.wOP;
    GMTrace.o(14932124893184L, 111253);
    return paramContext;
  }
  
  public final RecyclerView.g fw(final Context paramContext)
  {
    GMTrace.i(14932259110912L, 111254);
    paramContext = new RecyclerView.g()
    {
      public final void a(Rect paramAnonymousRect, View paramAnonymousView, RecyclerView paramAnonymousRecyclerView)
      {
        GMTrace.i(14940580610048L, 111316);
        int i = (int)paramContext.getResources().getDimension(R.f.aQG);
        paramAnonymousRect.bottom = i;
        paramAnonymousRect.top = i;
        paramAnonymousRect.left = i;
        paramAnonymousRect.right = i;
        GMTrace.o(14940580610048L, 111316);
      }
    };
    GMTrace.o(14932259110912L, 111254);
    return paramContext;
  }
  
  public final void onDetach()
  {
    GMTrace.i(14931990675456L, 111252);
    this.wIv.dead();
    this.wON.a(null);
    this.wON = null;
    n.Ja().a(this);
    o.Nh().a(this);
    g.a.wMg.detach();
    GMTrace.o(14931990675456L, 111252);
  }
  
  public final void onResume()
  {
    GMTrace.i(14933332852736L, 111262);
    if ((this.wOQ) && (g.a.wMg.wMe))
    {
      this.wON.CZ(g.a.wMg.wKD.size());
      this.wOO.TS.notifyChanged();
    }
    GMTrace.o(14933332852736L, 111262);
  }
  
  public final void u(final boolean paramBoolean, final int paramInt)
  {
    GMTrace.i(14934138159104L, 111268);
    if ((!paramBoolean) && (this.lyd + this.wOJ == this.iFZ.size()))
    {
      w.i("MicroMsg.MediaHistoryGalleryPresenter", "[loadData] that's all msg :%s offset:%s", new Object[] { Integer.valueOf(this.lyd), Integer.valueOf(paramInt) });
      GMTrace.o(14934138159104L, 111268);
      return;
    }
    this.wOO.wHN = true;
    this.wON.mj(paramBoolean);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xB().A(new Runnable()
    {
      /* Error */
      public final void run()
      {
        // Byte code:
        //   0: ldc2_w 45
        //   3: ldc 47
        //   5: invokestatic 39	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   8: aload_0
        //   9: getfield 25	com/tencent/mm/ui/chatting/d/e$7:wOu	Z
        //   12: ifeq +47 -> 59
        //   15: aload_0
        //   16: getfield 23	com/tencent/mm/ui/chatting/d/e$7:wOT	Lcom/tencent/mm/ui/chatting/d/e;
        //   19: getfield 51	com/tencent/mm/ui/chatting/d/e:wHM	J
        //   22: ldc2_w 52
        //   25: lcmp
        //   26: ifne +183 -> 209
        //   29: aload_0
        //   30: getfield 23	com/tencent/mm/ui/chatting/d/e$7:wOT	Lcom/tencent/mm/ui/chatting/d/e;
        //   33: astore 7
        //   35: invokestatic 59	com/tencent/mm/y/at:AR	()Lcom/tencent/mm/y/c;
        //   38: pop
        //   39: aload 7
        //   41: invokestatic 65	com/tencent/mm/y/c:yM	()Lcom/tencent/mm/plugin/messenger/foundation/a/a/c;
        //   44: aload_0
        //   45: getfield 23	com/tencent/mm/ui/chatting/d/e$7:wOT	Lcom/tencent/mm/ui/chatting/d/e;
        //   48: getfield 69	com/tencent/mm/ui/chatting/d/e:iGc	Ljava/lang/String;
        //   51: invokeinterface 75 2 0
        //   56: putfield 78	com/tencent/mm/ui/chatting/d/e:lyd	I
        //   59: aload_0
        //   60: getfield 27	com/tencent/mm/ui/chatting/d/e$7:gAp	I
        //   63: iflt +184 -> 247
        //   66: aload_0
        //   67: getfield 23	com/tencent/mm/ui/chatting/d/e$7:wOT	Lcom/tencent/mm/ui/chatting/d/e;
        //   70: getfield 78	com/tencent/mm/ui/chatting/d/e:lyd	I
        //   73: aload_0
        //   74: getfield 27	com/tencent/mm/ui/chatting/d/e$7:gAp	I
        //   77: isub
        //   78: sipush 200
        //   81: if_icmple +166 -> 247
        //   84: aload_0
        //   85: getfield 23	com/tencent/mm/ui/chatting/d/e$7:wOT	Lcom/tencent/mm/ui/chatting/d/e;
        //   88: getfield 78	com/tencent/mm/ui/chatting/d/e:lyd	I
        //   91: aload_0
        //   92: getfield 27	com/tencent/mm/ui/chatting/d/e$7:gAp	I
        //   95: isub
        //   96: istore_1
        //   97: ldc 80
        //   99: ldc 82
        //   101: iconst_2
        //   102: anewarray 4	java/lang/Object
        //   105: dup
        //   106: iconst_0
        //   107: aload_0
        //   108: getfield 27	com/tencent/mm/ui/chatting/d/e$7:gAp	I
        //   111: invokestatic 88	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   114: aastore
        //   115: dup
        //   116: iconst_1
        //   117: iload_1
        //   118: invokestatic 88	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   121: aastore
        //   122: invokestatic 93	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   125: new 95	java/util/LinkedList
        //   128: dup
        //   129: invokespecial 96	java/util/LinkedList:<init>	()V
        //   132: astore 8
        //   134: aload_0
        //   135: getfield 23	com/tencent/mm/ui/chatting/d/e$7:wOT	Lcom/tencent/mm/ui/chatting/d/e;
        //   138: getfield 51	com/tencent/mm/ui/chatting/d/e:wHM	J
        //   141: ldc2_w 52
        //   144: lcmp
        //   145: ifne +109 -> 254
        //   148: invokestatic 59	com/tencent/mm/y/at:AR	()Lcom/tencent/mm/y/c;
        //   151: pop
        //   152: invokestatic 65	com/tencent/mm/y/c:yM	()Lcom/tencent/mm/plugin/messenger/foundation/a/a/c;
        //   155: aload_0
        //   156: getfield 23	com/tencent/mm/ui/chatting/d/e$7:wOT	Lcom/tencent/mm/ui/chatting/d/e;
        //   159: getfield 69	com/tencent/mm/ui/chatting/d/e:iGc	Ljava/lang/String;
        //   162: aload_0
        //   163: getfield 23	com/tencent/mm/ui/chatting/d/e$7:wOT	Lcom/tencent/mm/ui/chatting/d/e;
        //   166: getfield 100	com/tencent/mm/ui/chatting/d/e:iFZ	Ljava/util/ArrayList;
        //   169: invokevirtual 106	java/util/ArrayList:size	()I
        //   172: aload_0
        //   173: getfield 23	com/tencent/mm/ui/chatting/d/e$7:wOT	Lcom/tencent/mm/ui/chatting/d/e;
        //   176: getfield 109	com/tencent/mm/ui/chatting/d/e:wOJ	I
        //   179: isub
        //   180: iload_1
        //   181: invokeinterface 112 4 0
        //   186: astore 7
        //   188: aload 7
        //   190: ifnonnull +112 -> 302
        //   193: ldc 80
        //   195: ldc 114
        //   197: invokestatic 118	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
        //   200: ldc2_w 45
        //   203: ldc 47
        //   205: invokestatic 42	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   208: return
        //   209: aload_0
        //   210: getfield 23	com/tencent/mm/ui/chatting/d/e$7:wOT	Lcom/tencent/mm/ui/chatting/d/e;
        //   213: astore 7
        //   215: invokestatic 59	com/tencent/mm/y/at:AR	()Lcom/tencent/mm/y/c;
        //   218: pop
        //   219: aload 7
        //   221: invokestatic 122	com/tencent/mm/y/c:yN	()Lcom/tencent/mm/storage/o;
        //   224: aload_0
        //   225: getfield 23	com/tencent/mm/ui/chatting/d/e$7:wOT	Lcom/tencent/mm/ui/chatting/d/e;
        //   228: getfield 69	com/tencent/mm/ui/chatting/d/e:iGc	Ljava/lang/String;
        //   231: aload_0
        //   232: getfield 23	com/tencent/mm/ui/chatting/d/e$7:wOT	Lcom/tencent/mm/ui/chatting/d/e;
        //   235: getfield 51	com/tencent/mm/ui/chatting/d/e:wHM	J
        //   238: invokevirtual 128	com/tencent/mm/storage/o:al	(Ljava/lang/String;J)I
        //   241: putfield 78	com/tencent/mm/ui/chatting/d/e:lyd	I
        //   244: goto -185 -> 59
        //   247: sipush 200
        //   250: istore_1
        //   251: goto -154 -> 97
        //   254: invokestatic 59	com/tencent/mm/y/at:AR	()Lcom/tencent/mm/y/c;
        //   257: pop
        //   258: invokestatic 122	com/tencent/mm/y/c:yN	()Lcom/tencent/mm/storage/o;
        //   261: aload_0
        //   262: getfield 23	com/tencent/mm/ui/chatting/d/e$7:wOT	Lcom/tencent/mm/ui/chatting/d/e;
        //   265: getfield 69	com/tencent/mm/ui/chatting/d/e:iGc	Ljava/lang/String;
        //   268: aload_0
        //   269: getfield 23	com/tencent/mm/ui/chatting/d/e$7:wOT	Lcom/tencent/mm/ui/chatting/d/e;
        //   272: getfield 51	com/tencent/mm/ui/chatting/d/e:wHM	J
        //   275: aload_0
        //   276: getfield 23	com/tencent/mm/ui/chatting/d/e$7:wOT	Lcom/tencent/mm/ui/chatting/d/e;
        //   279: getfield 100	com/tencent/mm/ui/chatting/d/e:iFZ	Ljava/util/ArrayList;
        //   282: invokevirtual 106	java/util/ArrayList:size	()I
        //   285: aload_0
        //   286: getfield 23	com/tencent/mm/ui/chatting/d/e$7:wOT	Lcom/tencent/mm/ui/chatting/d/e;
        //   289: getfield 109	com/tencent/mm/ui/chatting/d/e:wOJ	I
        //   292: isub
        //   293: iload_1
        //   294: invokevirtual 132	com/tencent/mm/storage/o:b	(Ljava/lang/String;JII)Landroid/database/Cursor;
        //   297: astore 7
        //   299: goto -111 -> 188
        //   302: lconst_0
        //   303: lstore_3
        //   304: aload 7
        //   306: invokeinterface 138 1 0
        //   311: ifeq +107 -> 418
        //   314: new 140	com/tencent/mm/storage/au
        //   317: dup
        //   318: invokespecial 141	com/tencent/mm/storage/au:<init>	()V
        //   321: astore 9
        //   323: aload 9
        //   325: aload 7
        //   327: invokevirtual 144	com/tencent/mm/storage/au:b	(Landroid/database/Cursor;)V
        //   330: new 146	java/util/Date
        //   333: dup
        //   334: aload 9
        //   336: getfield 151	com/tencent/mm/g/b/ce:field_createTime	J
        //   339: invokespecial 154	java/util/Date:<init>	(J)V
        //   342: astore 10
        //   344: invokestatic 160	com/tencent/mm/ui/gridviewheaders/a:chJ	()Lcom/tencent/mm/ui/gridviewheaders/a;
        //   347: aload 10
        //   349: invokevirtual 164	com/tencent/mm/ui/gridviewheaders/a:a	(Ljava/util/Date;)J
        //   352: lstore 5
        //   354: lload_3
        //   355: lload 5
        //   357: lcmp
        //   358: ifeq +39 -> 397
        //   361: aload 8
        //   363: new 166	com/tencent/mm/ui/chatting/a/a$c
        //   366: dup
        //   367: aload 9
        //   369: getfield 151	com/tencent/mm/g/b/ce:field_createTime	J
        //   372: invokespecial 167	com/tencent/mm/ui/chatting/a/a$c:<init>	(J)V
        //   375: invokevirtual 171	java/util/LinkedList:add	(Ljava/lang/Object;)Z
        //   378: pop
        //   379: aload_0
        //   380: getfield 23	com/tencent/mm/ui/chatting/d/e$7:wOT	Lcom/tencent/mm/ui/chatting/d/e;
        //   383: astore 10
        //   385: aload 10
        //   387: aload 10
        //   389: getfield 109	com/tencent/mm/ui/chatting/d/e:wOJ	I
        //   392: iconst_1
        //   393: iadd
        //   394: putfield 109	com/tencent/mm/ui/chatting/d/e:wOJ	I
        //   397: aload 8
        //   399: new 166	com/tencent/mm/ui/chatting/a/a$c
        //   402: dup
        //   403: aload 9
        //   405: invokespecial 174	com/tencent/mm/ui/chatting/a/a$c:<init>	(Lcom/tencent/mm/storage/au;)V
        //   408: invokevirtual 171	java/util/LinkedList:add	(Ljava/lang/Object;)Z
        //   411: pop
        //   412: lload 5
        //   414: lstore_3
        //   415: goto -111 -> 304
        //   418: aload 7
        //   420: invokeinterface 177 1 0
        //   425: new 95	java/util/LinkedList
        //   428: dup
        //   429: invokespecial 96	java/util/LinkedList:<init>	()V
        //   432: astore 9
        //   434: aload 8
        //   436: invokevirtual 178	java/util/LinkedList:size	()I
        //   439: aload_0
        //   440: getfield 23	com/tencent/mm/ui/chatting/d/e$7:wOT	Lcom/tencent/mm/ui/chatting/d/e;
        //   443: getfield 109	com/tencent/mm/ui/chatting/d/e:wOJ	I
        //   446: isub
        //   447: iload_1
        //   448: if_icmpne +340 -> 788
        //   451: aload 8
        //   453: iconst_0
        //   454: invokevirtual 182	java/util/LinkedList:get	(I)Ljava/lang/Object;
        //   457: checkcast 166	com/tencent/mm/ui/chatting/a/a$c
        //   460: getfield 185	com/tencent/mm/ui/chatting/a/a$c:gVB	J
        //   463: lstore_3
        //   464: invokestatic 160	com/tencent/mm/ui/gridviewheaders/a:chJ	()Lcom/tencent/mm/ui/gridviewheaders/a;
        //   467: pop
        //   468: lload_3
        //   469: invokestatic 189	com/tencent/mm/ui/gridviewheaders/a:fn	(J)J
        //   472: lstore 5
        //   474: ldc 80
        //   476: ldc -65
        //   478: iconst_3
        //   479: anewarray 4	java/lang/Object
        //   482: dup
        //   483: iconst_0
        //   484: aload 8
        //   486: invokevirtual 178	java/util/LinkedList:size	()I
        //   489: invokestatic 88	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   492: aastore
        //   493: dup
        //   494: iconst_1
        //   495: lload 5
        //   497: invokestatic 196	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   500: aastore
        //   501: dup
        //   502: iconst_2
        //   503: lload_3
        //   504: invokestatic 196	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   507: aastore
        //   508: invokestatic 93	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   511: aload_0
        //   512: getfield 23	com/tencent/mm/ui/chatting/d/e$7:wOT	Lcom/tencent/mm/ui/chatting/d/e;
        //   515: getfield 51	com/tencent/mm/ui/chatting/d/e:wHM	J
        //   518: ldc2_w 52
        //   521: lcmp
        //   522: ifne +191 -> 713
        //   525: invokestatic 59	com/tencent/mm/y/at:AR	()Lcom/tencent/mm/y/c;
        //   528: pop
        //   529: invokestatic 65	com/tencent/mm/y/c:yM	()Lcom/tencent/mm/plugin/messenger/foundation/a/a/c;
        //   532: aload_0
        //   533: getfield 23	com/tencent/mm/ui/chatting/d/e$7:wOT	Lcom/tencent/mm/ui/chatting/d/e;
        //   536: getfield 69	com/tencent/mm/ui/chatting/d/e:iGc	Ljava/lang/String;
        //   539: lload 5
        //   541: lload_3
        //   542: invokeinterface 199 6 0
        //   547: astore 7
        //   549: new 146	java/util/Date
        //   552: dup
        //   553: lload_3
        //   554: invokespecial 154	java/util/Date:<init>	(J)V
        //   557: astore 10
        //   559: invokestatic 160	com/tencent/mm/ui/gridviewheaders/a:chJ	()Lcom/tencent/mm/ui/gridviewheaders/a;
        //   562: aload 10
        //   564: invokevirtual 164	com/tencent/mm/ui/gridviewheaders/a:a	(Ljava/util/Date;)J
        //   567: lstore_3
        //   568: aload 7
        //   570: ifnull +206 -> 776
        //   573: aload 7
        //   575: invokeinterface 138 1 0
        //   580: ifeq +196 -> 776
        //   583: new 140	com/tencent/mm/storage/au
        //   586: dup
        //   587: invokespecial 141	com/tencent/mm/storage/au:<init>	()V
        //   590: astore 11
        //   592: aload 11
        //   594: aload 7
        //   596: invokevirtual 144	com/tencent/mm/storage/au:b	(Landroid/database/Cursor;)V
        //   599: new 146	java/util/Date
        //   602: dup
        //   603: aload 11
        //   605: getfield 151	com/tencent/mm/g/b/ce:field_createTime	J
        //   608: invokespecial 154	java/util/Date:<init>	(J)V
        //   611: astore 12
        //   613: invokestatic 160	com/tencent/mm/ui/gridviewheaders/a:chJ	()Lcom/tencent/mm/ui/gridviewheaders/a;
        //   616: aload 12
        //   618: invokevirtual 164	com/tencent/mm/ui/gridviewheaders/a:a	(Ljava/util/Date;)J
        //   621: lstore 5
        //   623: lload_3
        //   624: lload 5
        //   626: lcmp
        //   627: ifeq +118 -> 745
        //   630: invokestatic 160	com/tencent/mm/ui/gridviewheaders/a:chJ	()Lcom/tencent/mm/ui/gridviewheaders/a;
        //   633: aload 10
        //   635: invokevirtual 164	com/tencent/mm/ui/gridviewheaders/a:a	(Ljava/util/Date;)J
        //   638: lload 5
        //   640: lcmp
        //   641: ifeq +104 -> 745
        //   644: aload 9
        //   646: new 166	com/tencent/mm/ui/chatting/a/a$c
        //   649: dup
        //   650: aload 11
        //   652: getfield 151	com/tencent/mm/g/b/ce:field_createTime	J
        //   655: invokespecial 167	com/tencent/mm/ui/chatting/a/a$c:<init>	(J)V
        //   658: invokevirtual 171	java/util/LinkedList:add	(Ljava/lang/Object;)Z
        //   661: pop
        //   662: aload_0
        //   663: getfield 23	com/tencent/mm/ui/chatting/d/e$7:wOT	Lcom/tencent/mm/ui/chatting/d/e;
        //   666: astore 12
        //   668: aload 12
        //   670: aload 12
        //   672: getfield 109	com/tencent/mm/ui/chatting/d/e:wOJ	I
        //   675: iconst_1
        //   676: iadd
        //   677: putfield 109	com/tencent/mm/ui/chatting/d/e:wOJ	I
        //   680: lload 5
        //   682: lstore_3
        //   683: aload 9
        //   685: new 166	com/tencent/mm/ui/chatting/a/a$c
        //   688: dup
        //   689: aload 11
        //   691: invokespecial 174	com/tencent/mm/ui/chatting/a/a$c:<init>	(Lcom/tencent/mm/storage/au;)V
        //   694: invokevirtual 171	java/util/LinkedList:add	(Ljava/lang/Object;)Z
        //   697: pop
        //   698: goto -130 -> 568
        //   701: astore 8
        //   703: aload 7
        //   705: invokeinterface 177 1 0
        //   710: aload 8
        //   712: athrow
        //   713: invokestatic 59	com/tencent/mm/y/at:AR	()Lcom/tencent/mm/y/c;
        //   716: pop
        //   717: invokestatic 122	com/tencent/mm/y/c:yN	()Lcom/tencent/mm/storage/o;
        //   720: aload_0
        //   721: getfield 23	com/tencent/mm/ui/chatting/d/e$7:wOT	Lcom/tencent/mm/ui/chatting/d/e;
        //   724: getfield 69	com/tencent/mm/ui/chatting/d/e:iGc	Ljava/lang/String;
        //   727: aload_0
        //   728: getfield 23	com/tencent/mm/ui/chatting/d/e$7:wOT	Lcom/tencent/mm/ui/chatting/d/e;
        //   731: getfield 51	com/tencent/mm/ui/chatting/d/e:wHM	J
        //   734: lload 5
        //   736: lload_3
        //   737: invokevirtual 202	com/tencent/mm/storage/o:a	(Ljava/lang/String;JJJ)Landroid/database/Cursor;
        //   740: astore 7
        //   742: goto -193 -> 549
        //   745: aload 8
        //   747: invokevirtual 178	java/util/LinkedList:size	()I
        //   750: ifle +23 -> 773
        //   753: aload 9
        //   755: invokevirtual 178	java/util/LinkedList:size	()I
        //   758: ifne +15 -> 773
        //   761: aload 9
        //   763: iconst_0
        //   764: aload 8
        //   766: iconst_0
        //   767: invokevirtual 205	java/util/LinkedList:remove	(I)Ljava/lang/Object;
        //   770: invokevirtual 208	java/util/LinkedList:add	(ILjava/lang/Object;)V
        //   773: goto -90 -> 683
        //   776: aload 7
        //   778: ifnull +10 -> 788
        //   781: aload 7
        //   783: invokeinterface 177 1 0
        //   788: aload 8
        //   790: invokevirtual 178	java/util/LinkedList:size	()I
        //   793: istore_1
        //   794: aload 9
        //   796: invokevirtual 178	java/util/LinkedList:size	()I
        //   799: istore_2
        //   800: aload_0
        //   801: getfield 23	com/tencent/mm/ui/chatting/d/e$7:wOT	Lcom/tencent/mm/ui/chatting/d/e;
        //   804: getfield 100	com/tencent/mm/ui/chatting/d/e:iFZ	Ljava/util/ArrayList;
        //   807: iconst_0
        //   808: aload 9
        //   810: invokevirtual 212	java/util/ArrayList:addAll	(ILjava/util/Collection;)Z
        //   813: pop
        //   814: aload_0
        //   815: getfield 23	com/tencent/mm/ui/chatting/d/e$7:wOT	Lcom/tencent/mm/ui/chatting/d/e;
        //   818: getfield 100	com/tencent/mm/ui/chatting/d/e:iFZ	Ljava/util/ArrayList;
        //   821: aload 9
        //   823: invokevirtual 178	java/util/LinkedList:size	()I
        //   826: aload 8
        //   828: invokevirtual 212	java/util/ArrayList:addAll	(ILjava/util/Collection;)Z
        //   831: pop
        //   832: aload 8
        //   834: invokevirtual 215	java/util/LinkedList:clear	()V
        //   837: aload 9
        //   839: invokevirtual 215	java/util/LinkedList:clear	()V
        //   842: aload_0
        //   843: getfield 23	com/tencent/mm/ui/chatting/d/e$7:wOT	Lcom/tencent/mm/ui/chatting/d/e;
        //   846: iconst_0
        //   847: putfield 109	com/tencent/mm/ui/chatting/d/e:wOJ	I
        //   850: ldc 80
        //   852: ldc -39
        //   854: iconst_1
        //   855: anewarray 4	java/lang/Object
        //   858: dup
        //   859: iconst_0
        //   860: aload_0
        //   861: getfield 23	com/tencent/mm/ui/chatting/d/e$7:wOT	Lcom/tencent/mm/ui/chatting/d/e;
        //   864: getfield 100	com/tencent/mm/ui/chatting/d/e:iFZ	Ljava/util/ArrayList;
        //   867: invokevirtual 106	java/util/ArrayList:size	()I
        //   870: invokestatic 88	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   873: aastore
        //   874: invokestatic 93	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   877: new 13	com/tencent/mm/ui/chatting/d/e$7$1
        //   880: dup
        //   881: aload_0
        //   882: iload_1
        //   883: iload_2
        //   884: iadd
        //   885: invokespecial 220	com/tencent/mm/ui/chatting/d/e$7$1:<init>	(Lcom/tencent/mm/ui/chatting/d/e$7;I)V
        //   888: invokestatic 226	com/tencent/mm/sdk/platformtools/af:t	(Ljava/lang/Runnable;)V
        //   891: ldc2_w 45
        //   894: ldc 47
        //   896: invokestatic 42	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   899: return
        //   900: astore 8
        //   902: aload 7
        //   904: ifnull +10 -> 914
        //   907: aload 7
        //   909: invokeinterface 177 1 0
        //   914: aload 8
        //   916: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	917	0	this	7
        //   96	789	1	i	int
        //   799	86	2	j	int
        //   303	434	3	l1	long
        //   352	383	5	l2	long
        //   33	875	7	localObject1	Object
        //   132	353	8	localLinkedList	LinkedList
        //   701	132	8	localCollection	java.util.Collection
        //   900	15	8	localObject2	Object
        //   321	517	9	localObject3	Object
        //   342	292	10	localObject4	Object
        //   590	100	11	localau	au
        //   611	60	12	localObject5	Object
        // Exception table:
        //   from	to	target	type
        //   304	354	701	finally
        //   361	397	701	finally
        //   397	412	701	finally
        //   573	623	900	finally
        //   630	680	900	finally
        //   683	698	900	finally
        //   745	773	900	finally
      }
    });
    GMTrace.o(14934138159104L, 111268);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\d\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */