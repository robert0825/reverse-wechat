package com.tencent.mm.ui.conversation;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.support.v4.app.FragmentActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ac.d.a;
import com.tencent.mm.g.a.ae;
import com.tencent.mm.g.a.qh;
import com.tencent.mm.g.a.qv;
import com.tencent.mm.g.b.aj;
import com.tencent.mm.pluginsdk.p.a;
import com.tencent.mm.pluginsdk.p.l;
import com.tencent.mm.pluginsdk.p.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;
import com.tencent.mm.sdk.platformtools.FLock;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.ui.AbstractTabChildActivity.a;
import com.tencent.mm.ui.HomeUI;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.base.MMSlideDelView.c;
import com.tencent.mm.ui.base.MMSlideDelView.f;
import com.tencent.mm.ui.conversation.a.e.a;
import com.tencent.mm.ui.conversation.a.o;
import com.tencent.mm.ui.f.a;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.u;
import com.tencent.mm.y.ap;
import com.tencent.mm.y.at;
import com.tencent.mm.y.b.b.b;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class j
  extends AbstractTabChildActivity.a
  implements i.a
{
  public int[] qcz;
  public ListView wVF;
  public g wWm;
  TextView wYI;
  private i wYJ;
  public c wYK;
  private m wYL;
  private k wYM;
  public a wYx;
  
  public j()
  {
    GMTrace.i(3437316014080L, 25610);
    this.wYx = new a();
    this.wYJ = new i();
    this.wYK = new c();
    this.wYL = new m();
    this.wYM = new k();
    this.qcz = new int[2];
    GMTrace.o(3437316014080L, 25610);
  }
  
  public final boolean aaS()
  {
    GMTrace.i(3437718667264L, 25613);
    GMTrace.o(3437718667264L, 25613);
    return true;
  }
  
  protected final void bVJ()
  {
    GMTrace.i(3440671457280L, 25635);
    w.i("MicroMsg.MainUI", "onTabCreate, %d", new Object[] { Integer.valueOf(hashCode()) });
    if (this.vKB != null) {
      this.vKB.aa(4, false);
    }
    w.i("MicroMsg.MainUI", "mainUIOnCreate");
    long l = System.currentTimeMillis();
    setMenuVisibility(true);
    at.xB().bQh();
    w.i("MicroMsg.MainUI", "main ui init view");
    if (this.wVF != null)
    {
      this.wVF.setAdapter(null);
      localObject1 = this.wYx;
      if (((a)localObject1).wVF != null)
      {
        ((a)localObject1).cZ(((a)localObject1).wVy);
        ((a)localObject1).cZ(((a)localObject1).wVz);
        ((a)localObject1).cZ(((a)localObject1).wVA);
        ((a)localObject1).cZ(((a)localObject1).wVB);
        localObject2 = ((a)localObject1).wVC.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (com.tencent.mm.pluginsdk.ui.b.b)((Iterator)localObject2).next();
          if ((localObject3 != null) && (((com.tencent.mm.pluginsdk.ui.b.b)localObject3).getView() != null)) {
            ((a)localObject1).wVF.removeFooterView(((com.tencent.mm.pluginsdk.ui.b.b)localObject3).getView());
          }
        }
      }
    }
    this.wYI = ((TextView)findViewById(R.h.bwz));
    this.wVF = ((ListView)findViewById(R.h.bLP));
    this.wVF.setDrawingCacheEnabled(false);
    this.wVF.setScrollingCacheEnabled(false);
    this.wWm = new g(this.vKB.vKW, new f.a()
    {
      public final void QC()
      {
        GMTrace.i(14481019109376L, 107892);
        j.this.wYK.cgT();
        g localg;
        if (j.this.wWm != null)
        {
          localg = j.this.wWm;
          if ((localg.woP != null) && (localg.wXD != null) && (!localg.wXD.isEmpty())) {}
        }
        else
        {
          j.this.wVF.post(new Runnable()
          {
            public final void run()
            {
              int i = 1;
              GMTrace.i(3388058107904L, 25243);
              j localj = j.this;
              int j = j.this.wWm.getCount();
              w.i("MicroMsg.MainUI", "summerinit setShowView count[%d], stack[%s]", new Object[] { Integer.valueOf(j), com.tencent.mm.platformtools.t.Py() });
              if (j <= 0)
              {
                a locala = localj.wYx;
                if (locala.context == null) {
                  break label219;
                }
                w.i("MicroMsg.BannerHelper", "checkBannerEmpyt %d", new Object[] { Integer.valueOf(locala.hashCode()) });
                if ((locala.i(locala.wVy, false)) || (locala.i(locala.wVz, false)) || (locala.i(locala.wVA, false)) || (locala.i(locala.wVB, false))) {
                  break label219;
                }
              }
              for (;;)
              {
                if (i != 0)
                {
                  localj.wYI.setVisibility(0);
                  localj.wVF.setVisibility(8);
                }
                localj.wVF.setVisibility(0);
                localj.wYI.setVisibility(8);
                j.this.wYx.cgQ();
                com.tencent.mm.plugin.report.service.f.tq(12);
                GMTrace.o(3388058107904L, 25243);
                return;
                label219:
                i = 0;
              }
            }
          });
          GMTrace.o(14481019109376L, 107892);
          return;
        }
        if (localg.wXE)
        {
          localg.woP.clear();
          localg.wXE = false;
        }
        for (;;)
        {
          localg.wXD.clear();
          break;
          w.d("MicroMsg.ConversationWithCacheAdapter", "dealWithConversationEvents size %d", new Object[] { Integer.valueOf(localg.wXD.size()) });
          Iterator localIterator = localg.wXD.iterator();
          while (localIterator.hasNext()) {
            localg.woP.remove(localIterator.next());
          }
        }
      }
      
      public final void QD()
      {
        GMTrace.i(14480884891648L, 107891);
        com.tencent.mm.plugin.report.service.f.tp(12);
        c localc = j.this.wYK;
        localc.wWk = -1;
        localc.wWj.clear();
        if ((localc.wWm == null) || (localc.wWl < 0) || (!localc.wWm.bVh()))
        {
          localc.wWk = 0;
          GMTrace.o(14480884891648L, 107891);
          return;
        }
        if (localc.wWm.wXE)
        {
          localc.wWk = 0;
          GMTrace.o(14480884891648L, 107891);
          return;
        }
        if (localc.wWm.wXC)
        {
          w.i("MicroMsg.ConvUnreadHelper", "unreadcheck preSetLauncherUIUnReadCount has contact change");
          localc.wWk = 0;
          localc.wWm.wXC = false;
          GMTrace.o(14480884891648L, 107891);
          return;
        }
        Object localObject1 = (HashSet)localc.wWm.wXD.clone();
        w.i("MicroMsg.ConvUnreadHelper", "unreadcheck preSetLauncherUIUnReadCount  events size %d", new Object[] { Integer.valueOf(((HashSet)localObject1).size()) });
        if (((HashSet)localObject1).contains("floatbottle"))
        {
          localc.wWk = 0;
          GMTrace.o(14480884891648L, 107891);
          return;
        }
        ((HashSet)localObject1).remove("officialaccounts");
        if (((HashSet)localObject1).isEmpty())
        {
          localc.wWk = 1;
          GMTrace.o(14480884891648L, 107891);
          return;
        }
        localObject1 = ((HashSet)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          String str = (String)((Iterator)localObject1).next();
          Object localObject2 = localc.wWm;
          boolean bool;
          if (((g)localObject2).WE(str)) {
            bool = false;
          }
          for (;;)
          {
            if (bool) {
              break label369;
            }
            localObject2 = localc.WD(str);
            if (localObject2 != null) {
              break label371;
            }
            localc.wWj.put(str, Integer.valueOf(0));
            w.i("MicroMsg.ConvUnreadHelper", "unreadcheck preSetLauncherUIUnReadCount  cov == null username %s, unreadcount %d", new Object[] { str, Integer.valueOf(0) });
            break;
            localObject2 = (g.d)((g)localObject2).woP.get(str);
            if (localObject2 == null) {
              bool = false;
            } else if (com.tencent.mm.y.s.eb(str)) {
              bool = ((g.d)localObject2).wWY;
            } else {
              bool = ((g.d)localObject2).wWV;
            }
          }
          label369:
          continue;
          label371:
          localc.wWj.put(str, Integer.valueOf(((aj)localObject2).field_unReadCount));
          w.i("MicroMsg.ConvUnreadHelper", "unreadcheck preSetLauncherUIUnReadCount  cov != null username %s, unreadcount %d", new Object[] { str, Integer.valueOf(((aj)localObject2).field_unReadCount) });
        }
        w.i("MicroMsg.ConvUnreadHelper", "unreadcheck preSetLauncherUIUnReadCount  preUnReadCount size %d", new Object[] { Integer.valueOf(localc.wWj.size()) });
        if (localc.wWj.isEmpty())
        {
          localc.wWk = 1;
          GMTrace.o(14480884891648L, 107891);
          return;
        }
        if (localc.wWj.size() > 20)
        {
          localc.wWk = 0;
          GMTrace.o(14480884891648L, 107891);
          return;
        }
        localc.wWk = 2;
        GMTrace.o(14480884891648L, 107891);
      }
    });
    this.wWm.a(new MMSlideDelView.c()
    {
      public final int cf(View paramAnonymousView)
      {
        GMTrace.i(14490145914880L, 107960);
        int i = j.this.wVF.getPositionForView(paramAnonymousView);
        GMTrace.o(14490145914880L, 107960);
        return i;
      }
    });
    this.wWm.a(new MMSlideDelView.f()
    {
      public final void t(View paramAnonymousView, int paramAnonymousInt)
      {
        GMTrace.i(14481153327104L, 107893);
        j.this.wVF.performItemClick(paramAnonymousView, paramAnonymousInt, 0L);
        GMTrace.o(14481153327104L, 107893);
      }
    });
    Object localObject1 = this.wYx;
    Object localObject2 = this.vKB.vKW;
    Object localObject3 = this.wVF;
    Object localObject4 = this.wYI;
    ((a)localObject1).context = ((Context)localObject2);
    ((a)localObject1).wVF = ((ListView)localObject3);
    ((a)localObject1).wVG = ((View)localObject4);
    ((a)localObject1).wVE = new a.1((a)localObject1);
    com.tencent.mm.sdk.b.a.vgX.b(((a)localObject1).wVE);
    localObject4 = new ae();
    ((ae)localObject4).eBa.activity = ((Activity)localObject2);
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject4);
    localObject4 = new com.tencent.mm.g.a.af();
    ((com.tencent.mm.g.a.af)localObject4).eBb.eBd = ((com.tencent.mm.pluginsdk.ui.b.b)com.tencent.mm.ui.conversation.a.e.a(((a)localObject1).context, e.a.wZF, null));
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject4);
    localObject4 = (com.tencent.mm.pluginsdk.ui.b.b)com.tencent.mm.ui.conversation.a.e.a(((a)localObject1).context, e.a.wZz, null);
    com.tencent.mm.g.a.af localaf = new com.tencent.mm.g.a.af();
    localaf.eBb.eBd = ((com.tencent.mm.pluginsdk.ui.b.b)localObject4);
    localaf.eBb.eBc = false;
    localaf.eBb.level = 1;
    com.tencent.mm.sdk.b.a.vgX.m(localaf);
    localObject4 = (o)com.tencent.mm.ui.conversation.a.e.a(((a)localObject1).context, e.a.wZE, null);
    localaf = new com.tencent.mm.g.a.af();
    localaf.eBb.eBd = ((com.tencent.mm.pluginsdk.ui.b.b)localObject4);
    localaf.eBb.eBc = false;
    localaf.eBb.level = 2;
    com.tencent.mm.sdk.b.a.vgX.m(localaf);
    localObject4 = (com.tencent.mm.ui.conversation.a.a)com.tencent.mm.ui.conversation.a.e.a(((a)localObject1).context, e.a.wZB, null);
    localaf = new com.tencent.mm.g.a.af();
    localaf.eBb.eBd = ((com.tencent.mm.pluginsdk.ui.b.b)localObject4);
    localaf.eBb.eBc = false;
    localaf.eBb.level = 3;
    com.tencent.mm.sdk.b.a.vgX.m(localaf);
    localObject4 = (com.tencent.mm.ui.e.a)com.tencent.mm.ui.conversation.a.e.a(((a)localObject1).context, e.a.wZG, new Object[] { b.b.gpQ });
    localaf = new com.tencent.mm.g.a.af();
    localaf.eBb.eBd = ((com.tencent.mm.pluginsdk.ui.b.b)localObject4);
    localaf.eBb.eBc = true;
    com.tencent.mm.sdk.b.a.vgX.m(localaf);
    com.tencent.mm.sdk.b.a.vgX.c(((a)localObject1).wVE);
    localObject4 = new LinkedList();
    ((List)localObject4).addAll(((a)localObject1).wVy);
    ((List)localObject4).addAll(((a)localObject1).wVz);
    ((List)localObject4).addAll(((a)localObject1).wVA);
    ((List)localObject4).addAll(((a)localObject1).wVB);
    Collections.sort((List)localObject4, new a.2((a)localObject1));
    ((a)localObject1).cY((List)localObject4);
    new LinkedList();
    localObject4 = (com.tencent.mm.pluginsdk.ui.b.b)com.tencent.mm.ui.conversation.a.e.a((Context)localObject2, e.a.wZA, null);
    if ((localObject4 != null) && (((com.tencent.mm.pluginsdk.ui.b.b)localObject4).getView() != null)) {
      ((ListView)localObject3).addFooterView(((com.tencent.mm.pluginsdk.ui.b.b)localObject4).getView());
    }
    ((a)localObject1).wVC.add(localObject4);
    ((ListView)localObject3).addFooterView(new com.tencent.mm.ui.conversation.a.i((Context)localObject2).getView(), null, true);
    ((a)localObject1).wVC.add(localObject4);
    ((a)localObject1).ovf = new a.3((a)localObject1);
    at.a(((a)localObject1).ovf);
    ((a)localObject1).wVD = new a.4((a)localObject1);
    com.tencent.mm.sdk.b.a.vgX.b(((a)localObject1).wVD);
    at.AR();
    com.tencent.mm.y.c.a((ap)localObject1);
    localObject1 = this.wYM;
    localObject2 = this.wVF;
    localObject3 = this.wWm;
    ((k)localObject1).wVF = ((ListView)localObject2);
    ((k)localObject1).wWm = ((g)localObject3);
    ((ListView)localObject2).setOnScrollListener(((k)localObject1).jNJ);
    ((g)localObject3).wWx = ((k)localObject1).jNJ;
    com.tencent.mm.sdk.platformtools.af.t(new k.2((k)localObject1));
    this.wYK.Z(aG());
    this.wVF.setAdapter(this.wWm);
    this.wVF.setOnItemClickListener(new e(this.wWm, this.wVF, aG()));
    this.wVF.setOnItemLongClickListener(new f(this.wWm, this.wVF, aG(), this.qcz));
    this.wVF.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(14477529448448L, 107866);
        switch (paramAnonymousMotionEvent.getAction())
        {
        }
        for (;;)
        {
          GMTrace.o(14477529448448L, 107866);
          return false;
          j.this.avJ();
          j.this.qcz[0] = ((int)paramAnonymousMotionEvent.getRawX());
          j.this.qcz[1] = ((int)paramAnonymousMotionEvent.getRawY());
        }
      }
    });
    this.wVF.setSelection(0);
    localObject1 = this.wYJ;
    localObject2 = aG();
    localObject3 = this.wYx;
    ((i)localObject1).eNu = ((Activity)localObject2);
    ((i)localObject1).wYx = ((a)localObject3);
    ((i)localObject1).wYy = this;
    ((i)localObject1).wakeLock = ((PowerManager)((Activity)localObject2).getSystemService("power")).newWakeLock(26, "NetSceneInit Lock");
    at.wS().a(-1, (com.tencent.mm.ad.e)localObject1);
    ((i)localObject1).wYu = false;
    com.tencent.mm.sdk.b.a.vgX.b(((i)localObject1).wYz);
    com.tencent.mm.sdk.b.a.vgX.b(((i)localObject1).wYA);
    localObject2 = new File(ab.getContext().getFilesDir(), "DBRecoverStarted");
    if (((File)localObject2).exists())
    {
      com.tencent.mm.plugin.report.d.oqe.d("DBRepair", "Last recovery interrupted.", null);
      ((File)localObject2).delete();
    }
    ((i)localObject1).wYB = new FLock(new File(ab.getContext().getFilesDir(), "MMStarted"), true);
    if (((i)localObject1).wYB.bPy())
    {
      ((i)localObject1).wYB.unlock();
      w.i("MicroMsg.DuplicateDetect", "No data multiple instance detected.");
    }
    for (;;)
    {
      ((i)localObject1).wYB.bPx();
      localObject1 = this.wYK;
      localObject2 = this.wWm;
      localObject3 = this.wVF;
      localObject4 = aG();
      ((c)localObject1).wWm = ((g)localObject2);
      ((c)localObject1).wVF = ((ListView)localObject3);
      ((c)localObject1).activity = ((Activity)localObject4);
      com.tencent.mm.sdk.b.a.vgX.b(((c)localObject1).wWp);
      com.tencent.mm.sdk.b.a.vgX.b(((c)localObject1).wWn);
      com.tencent.mm.sdk.b.a.vgX.b(((c)localObject1).wWo);
      localObject1 = this.wYL;
      localObject2 = this.wWm;
      localObject3 = this.wVF;
      localObject4 = aG();
      ((m)localObject1).wWm = ((g)localObject2);
      ((m)localObject1).eNu = ((Activity)localObject4);
      ((m)localObject1).wVF = ((ListView)localObject3);
      if (((m)localObject1).kid == null) {
        ((m)localObject1).kid = new m.4((m)localObject1, new m.1((m)localObject1));
      }
      if (((m)localObject1).wYZ == null) {
        ((m)localObject1).wYZ = new m.5((m)localObject1);
      }
      if (((m)localObject1).wZa == null) {
        ((m)localObject1).wZa = new m.6((m)localObject1, (ListView)localObject3);
      }
      com.tencent.mm.sdk.b.a.vgX.b(((m)localObject1).kid);
      com.tencent.mm.sdk.b.a.vgX.b(((m)localObject1).wYZ);
      com.tencent.mm.sdk.b.a.vgX.b(((m)localObject1).wZa);
      ((m)localObject1).vIH = new m.7((m)localObject1);
      Looper.myQueue().addIdleHandler(((m)localObject1).vIH);
      ((ListView)localObject3).post(new m.8((m)localObject1));
      localObject1 = com.tencent.mm.ao.n.Jb();
      int i = R.g.aVi;
      w.d("MicroMsg.AutoGetBigImgLogic", "chattingMaskResId change from " + ((com.tencent.mm.ao.a)localObject1).gGo + " to " + i);
      ((com.tencent.mm.ao.a)localObject1).gGo = i;
      com.tencent.mm.ao.n.Jb().start();
      at.bg(false);
      at.AR();
      com.tencent.mm.y.c.yP().a(this.wWm);
      at.AR();
      com.tencent.mm.y.c.yK().a(this.wWm);
      localObject1 = this.wWm;
      if (((g)localObject1).wWC == null) {
        ((g)localObject1).wWC = new g.1((g)localObject1);
      }
      com.tencent.mm.sdk.b.a.vgX.b(((g)localObject1).wWC);
      this.wWm.wXx = new g.b()
      {
        public final void cha()
        {
          GMTrace.i(14479542714368L, 107881);
          j.this.wWm.clearCache();
          at.AR();
          com.tencent.mm.y.c.yP().a(j.this.wWm);
          at.AR();
          com.tencent.mm.y.c.yK().a(j.this.wWm);
          GMTrace.o(14479542714368L, 107881);
        }
      };
      l = com.tencent.mm.platformtools.t.aH(l);
      at.AR();
      w.i("MicroMsg.MainUI", "kevin mainUIOnCreate time:%d uin:%d ver:%x", new Object[] { Long.valueOf(l), Integer.valueOf(com.tencent.mm.y.c.ww()), Integer.valueOf(com.tencent.mm.protocal.d.tJC) });
      this.wVF.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(14482898157568L, 107906);
          if (j.this.bWQ() != null) {
            j.this.bWQ().aQ();
          }
          GMTrace.o(14482898157568L, 107906);
        }
      }, 200L);
      GMTrace.o(3440671457280L, 25635);
      return;
      w.w("MicroMsg.DuplicateDetect", "Data multiple instance detected.");
      com.tencent.mm.plugin.report.d.oqe.a(579L, 0L, 1L, true);
    }
  }
  
  protected final void bVK()
  {
    GMTrace.i(3441074110464L, 25638);
    w.i("MicroMsg.MainUI", "onTabResume");
    long l = com.tencent.mm.platformtools.t.Pv();
    Object localObject = this.wYK;
    if (((c)localObject).wWl < 0)
    {
      w.d("MicroMsg.ConvUnreadHelper", "onTabResume totalUnReadCount %d", new Object[] { Integer.valueOf(((c)localObject).wWl) });
      if (((c)localObject).wWm != null) {
        ((c)localObject).wWm.cgY();
      }
    }
    chk();
    localObject = this.wYx;
    com.tencent.mm.ac.n.Dh().d((d.a)localObject);
    at.AR();
    com.tencent.mm.y.c.xh().a((m.b)localObject);
    ((a)localObject).cgQ();
    w.d("MicroMsg.MainUI", "start time check dkinit KEVIN mainui TestTimeLayoutTime onTabResume:%d", new Object[] { Long.valueOf(com.tencent.mm.platformtools.t.aH(l)) });
    localObject = this.wYL;
    if (p.a.tlV != null) {
      p.a.tlV.a((p.l)localObject);
    }
    com.tencent.mm.sdk.platformtools.af.t(new m.9((m)localObject));
    l.fy(((m)localObject).eNu);
    if ((((m)localObject).eNu != null) && (((m)localObject).eNu.getIntent() != null) && (((m)localObject).eNu.getIntent().getBooleanExtra("resend_fail_messages", false)))
    {
      com.tencent.mm.sdk.platformtools.af.i(new m.10((m)localObject), 500L);
      ((m)localObject).eNu.getIntent().putExtra("resend_fail_messages", false);
    }
    LauncherUI localLauncherUI = (LauncherUI)((m)localObject).eNu;
    if (localLauncherUI != null) {
      localLauncherUI.vJi.W(((m)localObject).wQh);
    }
    if ((com.tencent.mm.sdk.platformtools.s.a(((m)localObject).eNu.getIntent(), "Main_ListToTop", false)) && (((m)localObject).wVF != null)) {
      ((m)localObject).wVF.post(new m.2((m)localObject));
    }
    com.tencent.mm.sdk.platformtools.s.b(((m)localObject).eNu.getIntent(), "Main_ListToTop", false);
    localObject = this.wYJ;
    int i;
    if (((i)localObject).htG == null) {
      i = -1;
    }
    for (;;)
    {
      w.i("MicroMsg.InitHelper", "onTabResume tip:%d initscene:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(((i)localObject).chf()) });
      ((i)localObject).chd();
      com.tencent.mm.sdk.platformtools.af.i(new i.7((i)localObject), 100L);
      if ((at.AU()) && (!this.wYJ.chg()))
      {
        com.tencent.mm.sdk.b.a.vgX.a(new qv(), Looper.getMainLooper());
        localObject = new qh();
        ((qh)localObject).eUX.action = 4;
        com.tencent.mm.sdk.b.a.vgX.a((com.tencent.mm.sdk.b.b)localObject, Looper.getMainLooper());
      }
      GMTrace.o(3441074110464L, 25638);
      return;
      if (((i)localObject).htG.isShowing()) {
        i = 1;
      } else {
        i = 0;
      }
    }
  }
  
  protected final void bVL()
  {
    GMTrace.i(3441342545920L, 25640);
    w.i("MicroMsg.MainUI", "onTabStart");
    GMTrace.o(3441342545920L, 25640);
  }
  
  protected final void bVM()
  {
    GMTrace.i(3441476763648L, 25641);
    w.i("MicroMsg.MainUI", "onTabPause");
    Object localObject1 = this.wYx;
    w.i("MicroMsg.BannerHelper", "releaseBanner");
    a.db(((a)localObject1).wVy);
    a.db(((a)localObject1).wVz);
    a.db(((a)localObject1).wVA);
    a.db(((a)localObject1).wVB);
    Object localObject2 = ((a)localObject1).wVC.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      com.tencent.mm.pluginsdk.ui.b.b localb = (com.tencent.mm.pluginsdk.ui.b.b)((Iterator)localObject2).next();
      if (localb != null) {
        localb.release();
      }
    }
    if (at.AU()) {
      com.tencent.mm.ac.n.Dh().e((d.a)localObject1);
    }
    if (at.AU())
    {
      at.AR();
      com.tencent.mm.y.c.xh().b((m.b)localObject1);
    }
    localObject1 = this.wYJ;
    if (((i)localObject1).wakeLock.isHeld())
    {
      w.w("MicroMsg.InitHelper", "onTabPause wakelock.release!");
      ((i)localObject1).wakeLock.release();
    }
    avJ();
    localObject1 = this.wYL;
    if (p.a.tlV != null) {
      p.a.tlV.b((p.l)localObject1);
    }
    l.chn();
    localObject2 = (LauncherUI)((m)localObject1).eNu;
    if (localObject2 != null) {
      ((LauncherUI)localObject2).vJi.X(((m)localObject1).wQh);
    }
    chl();
    GMTrace.o(3441476763648L, 25641);
  }
  
  protected final void bVN()
  {
    GMTrace.i(3441610981376L, 25642);
    w.i("MicroMsg.MainUI", "onTabStop");
    GMTrace.o(3441610981376L, 25642);
  }
  
  protected final void bVO()
  {
    GMTrace.i(3441745199104L, 25643);
    w.i("MicroMsg.MainUI", "onTabDestroy  acc:%b", new Object[] { Boolean.valueOf(at.AU()) });
    Object localObject = this.wYx;
    w.i("MicroMsg.BannerHelper", "destroyBanner");
    a.dc(((a)localObject).wVy);
    a.dc(((a)localObject).wVz);
    a.dc(((a)localObject).wVA);
    a.dc(((a)localObject).wVB);
    Iterator localIterator = ((a)localObject).wVC.iterator();
    while (localIterator.hasNext())
    {
      com.tencent.mm.pluginsdk.ui.b.b localb = (com.tencent.mm.pluginsdk.ui.b.b)localIterator.next();
      if (localb != null) {
        localb.destroy();
      }
    }
    at.b(((a)localObject).ovf);
    com.tencent.mm.sdk.b.a.vgX.c(((a)localObject).wVD);
    com.tencent.mm.sdk.b.a.vgX.c(((a)localObject).wVE);
    if (at.AU())
    {
      at.AR();
      com.tencent.mm.y.c.b((ap)localObject);
    }
    ((a)localObject).context = null;
    localObject = this.wYJ;
    ((i)localObject).wYB.unlock();
    at.wS().b(-1, (com.tencent.mm.ad.e)localObject);
    if (((i)localObject).htG != null)
    {
      ((i)localObject).htG.dismiss();
      ((i)localObject).htG = null;
    }
    com.tencent.mm.sdk.b.a.vgX.c(((i)localObject).wYz);
    com.tencent.mm.sdk.b.a.vgX.c(((i)localObject).wYA);
    localObject = this.wYL;
    if (((m)localObject).kid != null)
    {
      com.tencent.mm.sdk.b.a.vgX.c(((m)localObject).kid);
      ((m)localObject).kid = null;
    }
    com.tencent.mm.sdk.b.a.vgX.c(((m)localObject).wYZ);
    com.tencent.mm.sdk.b.a.vgX.c(((m)localObject).wZa);
    if (p.a.tlV != null) {
      p.a.tlV.b((p.l)localObject);
    }
    if (at.AU()) {
      com.tencent.mm.platformtools.t.Px();
    }
    localObject = this.wYK;
    com.tencent.mm.sdk.b.a.vgX.c(((c)localObject).wWp);
    com.tencent.mm.sdk.b.a.vgX.c(((c)localObject).wWn);
    com.tencent.mm.sdk.b.a.vgX.c(((c)localObject).wWo);
    ((c)localObject).activity = null;
    if ((at.AU()) && (this.wWm != null))
    {
      at.AR();
      com.tencent.mm.y.c.yP().b(this.wWm);
      at.AR();
      com.tencent.mm.y.c.yK().b(this.wWm);
    }
    if (this.wWm != null)
    {
      localObject = this.wWm;
      if (((g)localObject).wWC != null)
      {
        com.tencent.mm.sdk.b.a.vgX.c(((g)localObject).wWC);
        ((g)localObject).wWC = null;
      }
      this.wWm.wXx = null;
      localObject = this.wWm;
      ((g)localObject).wXx = null;
      if (((g)localObject).woP != null)
      {
        ((g)localObject).woP.clear();
        ((g)localObject).woP = null;
      }
      ((com.tencent.mm.ui.f)localObject).kV(true);
      ((g)localObject).bWr();
      ((g)localObject).wXA.clear();
      w.i("MicroMsg.ConversationWithCacheAdapter", "clear usernamePositionMap");
    }
    GMTrace.o(3441745199104L, 25643);
  }
  
  public final void bVP()
  {
    GMTrace.i(3442147852288L, 25646);
    BackwardSupportUtil.c.a(this.wVF);
    GMTrace.o(3442147852288L, 25646);
  }
  
  public final void bVQ()
  {
    GMTrace.i(3441879416832L, 25644);
    w.i("MicroMsg.MainUI", "turn to bg");
    GMTrace.o(3441879416832L, 25644);
  }
  
  public final void bVR()
  {
    GMTrace.i(3442013634560L, 25645);
    w.i("MicroMsg.MainUI", "turn to fg");
    GMTrace.o(3442013634560L, 25645);
  }
  
  public final void bWN()
  {
    GMTrace.i(3442282070016L, 25647);
    w.i("MicroMsg.MainUI", "dkinit onTabSwitchIn");
    i locali = this.wYJ;
    int i;
    if (locali.htG == null) {
      i = -1;
    }
    for (;;)
    {
      w.i("MicroMsg.InitHelper", "onTabSwitchIn tip:%d initscene:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(locali.chf()) });
      if (locali.wakeLock != null) {
        locali.chd();
      }
      if (this.vKB != null) {
        this.vKB.onResume();
      }
      GMTrace.o(3442282070016L, 25647);
      return;
      if (locali.htG.isShowing()) {
        i = 1;
      } else {
        i = 0;
      }
    }
  }
  
  public final boolean bmX()
  {
    GMTrace.i(3437584449536L, 25612);
    GMTrace.o(3437584449536L, 25612);
    return false;
  }
  
  public final void cgh()
  {
    GMTrace.i(19036771450880L, 141835);
    if (this.wWm != null) {
      this.wWm.cgh();
    }
    GMTrace.o(19036771450880L, 141835);
  }
  
  public final void chi()
  {
    GMTrace.i(14514170888192L, 108139);
    if (this.wWm != null) {
      this.wWm.mAG = true;
    }
    GMTrace.o(14514170888192L, 108139);
  }
  
  public final void chj()
  {
    GMTrace.i(14514305105920L, 108140);
    if (this.wWm != null)
    {
      this.wWm.mAG = false;
      this.wWm.cgY();
      if (bWQ() != null) {
        this.wYK.Z(aG());
      }
    }
    GMTrace.o(14514305105920L, 108140);
  }
  
  public final void chk()
  {
    GMTrace.i(3440805675008L, 25636);
    if (this.wWm != null) {
      this.wWm.onResume();
    }
    GMTrace.o(3440805675008L, 25636);
  }
  
  public final void chl()
  {
    GMTrace.i(3440939892736L, 25637);
    if (this.wWm != null) {
      this.wWm.onPause();
    }
    GMTrace.o(3440939892736L, 25637);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(3437450231808L, 25611);
    int i = R.i.bLO;
    GMTrace.o(3437450231808L, 25611);
    return i;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(3438792409088L, 25621);
    super.onConfigurationChanged(paramConfiguration);
    this.wYx.cgQ();
    GMTrace.o(3438792409088L, 25621);
  }
  
  public final void onDestroy()
  {
    GMTrace.i(3443490029568L, 25656);
    w.i("MicroMsg.MainUI", "onDestroy");
    this.wYM.chm();
    super.onDestroy();
    GMTrace.o(3443490029568L, 25656);
  }
  
  public final void onPause()
  {
    GMTrace.i(3437987102720L, 25615);
    w.i("MicroMsg.MainUI", "onPause");
    super.onPause();
    GMTrace.o(3437987102720L, 25615);
  }
  
  public final void onResume()
  {
    GMTrace.i(3437852884992L, 25614);
    w.i("MicroMsg.MainUI", "onResume");
    super.onResume();
    GMTrace.o(3437852884992L, 25614);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\conversation\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */