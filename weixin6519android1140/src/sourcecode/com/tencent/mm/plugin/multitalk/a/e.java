package com.tencent.mm.plugin.multitalk.a;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.Notification.Builder;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.jl;
import com.tencent.mm.g.a.mq;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.s;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.b;
import com.tencent.mm.y.ak.b.a;
import com.tencent.mm.y.am;
import com.tencent.mm.y.at;
import com.tencent.mm.y.m;
import com.tencent.mm.y.q;
import com.tencent.mm.y.r;
import com.tencent.pb.common.b.a.a.aa;
import com.tencent.pb.common.b.a.a.am;
import com.tencent.pb.common.b.a.a.at;
import com.tencent.pb.common.b.a.a.z;
import com.tencent.pb.talkroom.sdk.MultiTalkGroup;
import com.tencent.pb.talkroom.sdk.MultiTalkGroupMember;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public final class e
  implements com.tencent.pb.talkroom.sdk.a
{
  private long gRS;
  public com.tencent.mm.compatible.util.b hez;
  public boolean jGN;
  private Timer lmz;
  private boolean mip;
  public com.tencent.mm.plugin.voip.video.h mjp;
  public MultiTalkGroup nmA;
  public long nmB;
  public com.tencent.mm.sdk.platformtools.aj nmC;
  public com.tencent.mm.sdk.platformtools.ae nmD;
  BroadcastReceiver nmE;
  com.tencent.mm.sdk.b.c nmF;
  public boolean nmj;
  public boolean nmk;
  public int nml;
  public boolean nmm;
  public HashSet<String> nmn;
  public com.tencent.mm.plugin.multitalk.ui.widget.e nmo;
  public MultiTalkGroup nmp;
  private k nmq;
  public int nmr;
  private int nms;
  private int nmt;
  private boolean nmu;
  private long nmv;
  private long nmw;
  public a nmx;
  public i.a nmy;
  public boolean nmz;
  
  public e()
  {
    GMTrace.i(4742986072064L, 35338);
    this.nmm = true;
    this.nmn = new HashSet();
    this.nmo = com.tencent.mm.plugin.multitalk.ui.widget.e.noD;
    this.nmp = null;
    this.gRS = 0L;
    this.nmr = 0;
    this.nms = 0;
    this.nmt = 2;
    this.nmu = false;
    this.nmv = 0L;
    this.nmw = 30000L;
    this.nmA = null;
    this.nmB = 0L;
    this.nmC = new com.tencent.mm.sdk.platformtools.aj(Looper.getMainLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(4768353222656L, 35527);
        w.v("MicroMsg.MT.MultiTalkManager", "voip repeat check is foreground");
        if (e.this.nmA == null)
        {
          e.this.nmB = 0L;
          e.this.nmC.stopTimer();
          GMTrace.o(4768353222656L, 35527);
          return false;
        }
        if (e.cR(ab.getContext()))
        {
          e.this.b(e.this.nmA);
          e.this.nmA = null;
          e.this.nmB = 0L;
          e.this.nmC.stopTimer();
          com.tencent.mm.plugin.report.service.g.ork.a(500L, 7L, 1L, false);
          GMTrace.o(4768353222656L, 35527);
          return false;
        }
        if (System.currentTimeMillis() - e.this.nmB < 60000L)
        {
          GMTrace.o(4768353222656L, 35527);
          return true;
        }
        e.this.nmA = null;
        e.this.nmB = 0L;
        e.this.nmC.stopTimer();
        GMTrace.o(4768353222656L, 35527);
        return false;
      }
    }, true);
    this.nmD = new com.tencent.mm.sdk.platformtools.ae(Looper.getMainLooper());
    this.nmE = new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        GMTrace.i(4762850295808L, 35486);
        if (!e.this.aRq())
        {
          GMTrace.o(4762850295808L, 35486);
          return;
        }
        if (paramAnonymousIntent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE"))
        {
          e.this.nmD.removeCallbacksAndMessages(null);
          e.this.nmD.postDelayed(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(4739093757952L, 35309);
              i.a locala1 = i.aRK();
              if (locala1 != e.this.nmy)
              {
                i.a locala2 = e.this.nmy;
                e.this.nmy = locala1;
                w.i("MicroMsg.MT.MultiTalkManager", "steve: network change: %s -> %s", new Object[] { locala2.name(), e.this.nmy.name() });
                e.this.rc(e.this.nml);
                if (e.this.nmx != null) {
                  e.this.nmx.a(e.this.nmy);
                }
                GMTrace.o(4739093757952L, 35309);
                return;
              }
              w.i("MicroMsg.MT.MultiTalkManager", "network not change: %s", new Object[] { e.this.nmy.name() });
              GMTrace.o(4739093757952L, 35309);
            }
          }, 8000L);
          GMTrace.o(4762850295808L, 35486);
          return;
        }
        int i = i.q(paramAnonymousContext, paramAnonymousIntent);
        w.i("MicroMsg.MT.MultiTalkManager", "phone state %d", new Object[] { Integer.valueOf(i) });
        if (i == 0)
        {
          com.tencent.mm.sdk.platformtools.af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(4751576006656L, 35402);
              o.aRQ().nlX.mU(false);
              GMTrace.o(4751576006656L, 35402);
            }
          });
          GMTrace.o(4762850295808L, 35486);
          return;
        }
        com.tencent.mm.sdk.platformtools.af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(4750099611648L, 35391);
            o.aRQ().nlX.mU(true);
            GMTrace.o(4750099611648L, 35391);
          }
        });
        GMTrace.o(4762850295808L, 35486);
      }
    };
    this.nmF = new com.tencent.mm.sdk.b.c() {};
    com.tencent.mm.sdk.b.a.vgX.b(this.nmF);
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.intent.action.PHONE_STATE");
    localIntentFilter.addAction("android.intent.action.PHONE_STATE_2");
    localIntentFilter.addAction("android.intent.action.PHONE_STATE2");
    localIntentFilter.addAction("android.intent.action.PHONE_STATE_EXT");
    localIntentFilter.addAction("android.intent.action.DUAL_PHONE_STATE");
    localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
    ab.getContext().registerReceiver(this.nmE, localIntentFilter);
    this.mjp = new com.tencent.mm.plugin.voip.video.h(ab.getContext());
    this.hez = new com.tencent.mm.compatible.util.b(ab.getContext());
    this.nmz = false;
    GMTrace.o(4742986072064L, 35338);
  }
  
  public static void CP(String paramString)
  {
    GMTrace.i(4744730902528L, 35351);
    w.i("MicroMsg.MT.MultiTalkManager", "generateMsgExitMsg");
    au localau = new au();
    localau.setType(64);
    localau.E(System.currentTimeMillis());
    localau.dB(6);
    localau.setContent(ab.getContext().getString(R.l.dKm));
    if (m.fc(paramString))
    {
      localau.db(paramString);
      localau.setContent(localau.field_content);
      at.AR();
      com.tencent.mm.y.c.yM().P(localau);
    }
    GMTrace.o(4744730902528L, 35351);
  }
  
  private void ZX()
  {
    GMTrace.i(4747817910272L, 35374);
    if (this.lmz != null)
    {
      this.lmz.cancel();
      this.lmz = null;
    }
    GMTrace.o(4747817910272L, 35374);
  }
  
  private static void a(MultiTalkGroup paramMultiTalkGroup, com.tencent.mm.plugin.multitalk.ui.widget.e parame, boolean paramBoolean)
  {
    GMTrace.i(4744865120256L, 35352);
    w.i("MicroMsg.MT.MultiTalkManager", "generateMsgExitMsg");
    if ((parame == com.tencent.mm.plugin.multitalk.ui.widget.e.noE) && (paramBoolean))
    {
      parame = new au();
      parame.setType(64);
      parame.E(System.currentTimeMillis());
      parame.dB(6);
      parame.setContent(ab.getContext().getString(R.l.dKm));
      if (m.fc(paramMultiTalkGroup.xOz))
      {
        parame.db(paramMultiTalkGroup.xOz);
        parame.setContent(parame.field_content);
        at.AR();
        com.tencent.mm.y.c.yM().P(parame);
      }
    }
    GMTrace.o(4744865120256L, 35352);
  }
  
  private boolean a(MultiTalkGroup paramMultiTalkGroup)
  {
    GMTrace.i(4743925596160L, 35345);
    if (!aRq())
    {
      w.i("MicroMsg.MT.MultiTalkManager", "first time update multitalk group: %s", new Object[] { i.h(paramMultiTalkGroup) });
      this.nmp = paramMultiTalkGroup;
      this.nmr = 0;
      this.nml = 1;
      this.nmn.clear();
      aRu();
      sort();
      GMTrace.o(4743925596160L, 35345);
      return true;
    }
    if (i.a(paramMultiTalkGroup, this.nmp))
    {
      w.i("MicroMsg.MT.MultiTalkManager", "update multitalk group: %s", new Object[] { i.h(paramMultiTalkGroup) });
      Object localObject1 = this.nmp;
      HashMap localHashMap = new HashMap();
      Object localObject2 = paramMultiTalkGroup.xOB.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        MultiTalkGroupMember localMultiTalkGroupMember = (MultiTalkGroupMember)((Iterator)localObject2).next();
        localHashMap.put(localMultiTalkGroupMember.xOC, localMultiTalkGroupMember);
      }
      localObject1 = ((MultiTalkGroup)localObject1).xOB.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (MultiTalkGroupMember)((Iterator)localObject1).next();
        if ((!q.zE().equals(((MultiTalkGroupMember)localObject2).xOC)) && (q.zE().equals(((MultiTalkGroupMember)localObject2).xOD)) && (((MultiTalkGroupMember)localObject2).status == 1) && ((!localHashMap.containsKey(((MultiTalkGroupMember)localObject2).xOC)) || (((MultiTalkGroupMember)localHashMap.get(((MultiTalkGroupMember)localObject2).xOC)).status == 20)))
        {
          localObject2 = ((MultiTalkGroupMember)localObject2).xOC;
          localObject2 = ab.getContext().getString(R.l.dKh, new Object[] { r.fs((String)localObject2) });
          localObject2 = com.tencent.mm.pluginsdk.ui.d.h.a(ab.getContext(), (CharSequence)localObject2);
          Toast.makeText(ab.getContext(), (CharSequence)localObject2, 0).show();
        }
      }
      this.nmp = paramMultiTalkGroup;
      aRu();
      sort();
      GMTrace.o(4743925596160L, 35345);
      return true;
    }
    w.e("MicroMsg.MT.MultiTalkManager", "updateCurrentMultiTalkGroup: not same multitalk\ncurrentGroup=%s\nchangeGroup=%s", new Object[] { i.h(this.nmp), i.h(paramMultiTalkGroup) });
    GMTrace.o(4743925596160L, 35345);
    return false;
  }
  
  private void aHR()
  {
    GMTrace.i(4747683692544L, 35373);
    w.i("MicroMsg.MT.MultiTalkManager", "startTimeCount");
    if (this.lmz != null)
    {
      this.lmz.cancel();
      GMTrace.o(4747683692544L, 35373);
      return;
    }
    this.gRS = System.currentTimeMillis();
    this.nmr = 0;
    this.lmz = new Timer();
    TimerTask local3 = new TimerTask()
    {
      public final void run()
      {
        GMTrace.i(4763118731264L, 35488);
        if ((e.this.aRt() >= 45000L) && (e.this.nmo != com.tencent.mm.plugin.multitalk.ui.widget.e.noH)) {
          com.tencent.mm.sdk.platformtools.af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(4737751580672L, 35299);
              e.this.c(false, true, false);
              GMTrace.o(4737751580672L, 35299);
            }
          });
        }
        if (e.this.nmo == com.tencent.mm.plugin.multitalk.ui.widget.e.noH)
        {
          e locale = e.this;
          locale.nmr += 1;
          com.tencent.mm.sdk.platformtools.af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(4768084787200L, 35525);
              if (e.this.nmo == com.tencent.mm.plugin.multitalk.ui.widget.e.noH)
              {
                com.tencent.mm.plugin.voip.model.d.btH().uM(e.this.nmr);
                if (e.this.nmx != null) {
                  e.this.nmx.aHX();
                }
              }
              GMTrace.o(4768084787200L, 35525);
            }
          });
        }
        GMTrace.o(4763118731264L, 35488);
      }
    };
    this.lmz.schedule(local3, 1000L, 1000L);
    GMTrace.o(4747683692544L, 35373);
  }
  
  private static boolean aRC()
  {
    GMTrace.i(4748220563456L, 35377);
    for (;;)
    {
      try
      {
        TelephonyManager localTelephonyManager = (TelephonyManager)ab.getContext().getSystemService("phone");
        if (localTelephonyManager == null) {
          continue;
        }
        i = localTelephonyManager.getCallState();
        switch (i)
        {
        default: 
          bool = false;
        }
      }
      catch (Exception localException1)
      {
        int i;
        boolean bool = false;
        w.e("MicroMsg.MT.MultiTalkManager", "get callState error , errMsg is %s", new Object[] { localException1.getLocalizedMessage() });
        continue;
        bool = false;
        continue;
      }
      try
      {
        w.i("MicroMsg.MT.MultiTalkManager", "TelephoneManager.callState is %d", new Object[] { Integer.valueOf(i) });
        GMTrace.o(4748220563456L, 35377);
        return bool;
      }
      catch (Exception localException2)
      {
        continue;
      }
      bool = false;
      continue;
      bool = true;
    }
  }
  
  private void aRu()
  {
    GMTrace.i(4744194031616L, 35347);
    Iterator localIterator = this.nmp.xOB.iterator();
    while (localIterator.hasNext())
    {
      MultiTalkGroupMember localMultiTalkGroupMember = (MultiTalkGroupMember)localIterator.next();
      if ((localMultiTalkGroupMember.status != 10) && (this.nmn.remove(localMultiTalkGroupMember.xOC))) {
        w.i("MicroMsg.MT.MultiTalkManager", "remove video user according group %s", new Object[] { localMultiTalkGroupMember.xOC });
      }
    }
    GMTrace.o(4744194031616L, 35347);
  }
  
  private void aRv()
  {
    GMTrace.i(4745401991168L, 35356);
    if (this.nmo == com.tencent.mm.plugin.multitalk.ui.widget.e.noF) {}
    for (;;)
    {
      e locale = this;
      boolean bool = false;
      for (;;)
      {
        locale.nmk = bool;
        this.jGN = false;
        this.nmy = i.aRK();
        GMTrace.o(4745401991168L, 35356);
        return;
        if ((at.AS().sn()) || (at.AS().sh())) {
          break;
        }
        bool = true;
        locale = this;
      }
    }
  }
  
  private void aRw()
  {
    GMTrace.i(4745938862080L, 35360);
    if (i.i(this.nmp)) {
      b(com.tencent.mm.plugin.multitalk.ui.widget.e.noH);
    }
    while (this.nmx != null)
    {
      this.nmx.aNV();
      localObject = i.aRK();
      if (localObject != this.nmy) {
        this.nmy = ((i.a)localObject);
      }
      GMTrace.o(4745938862080L, 35360);
      return;
      b(com.tencent.mm.plugin.multitalk.ui.widget.e.noG);
    }
    Object localObject = new Intent();
    com.tencent.mm.bj.d.b(ab.getContext(), "multitalk", ".ui.MultiTalkMainUI", (Intent)localObject);
    GMTrace.o(4745938862080L, 35360);
  }
  
  private void b(com.tencent.mm.plugin.multitalk.ui.widget.e parame)
  {
    boolean bool = true;
    GMTrace.i(4747549474816L, 35372);
    Object localObject = this.nmo;
    this.nmo = parame;
    if (localObject != parame) {
      if (parame == com.tencent.mm.plugin.multitalk.ui.widget.e.noH)
      {
        localObject = new mq();
        ((mq)localObject).eRK.type = 1;
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
        d.a(i.k(this.nmp), aRt(), i.l(this.nmp));
        o.aRR().stopRing();
        if ((at.AS().sn()) || (at.AS().sh())) {
          break label134;
        }
      }
    }
    for (;;)
    {
      gm(bool);
      if (this.nmx != null) {
        this.nmx.a(parame);
      }
      GMTrace.o(4747549474816L, 35372);
      return;
      label134:
      bool = false;
    }
  }
  
  private void c(MultiTalkGroup paramMultiTalkGroup)
  {
    GMTrace.i(4745267773440L, 35355);
    if (a(paramMultiTalkGroup))
    {
      this.nmj = false;
      aRv();
      aHR();
      paramMultiTalkGroup = new Intent();
      com.tencent.mm.bj.d.b(ab.getContext(), "multitalk", ".ui.MultiTalkMainUI", paramMultiTalkGroup);
    }
    GMTrace.o(4745267773440L, 35355);
  }
  
  public static boolean cR(Context paramContext)
  {
    GMTrace.i(4748354781184L, 35378);
    Object localObject = ((ActivityManager)paramContext.getSystemService("activity")).getRunningTasks(1);
    if ((localObject != null) && (!((List)localObject).isEmpty()))
    {
      localObject = ((ActivityManager.RunningTaskInfo)((List)localObject).get(0)).topActivity;
      w.d("MicroMsg.MT.MultiTalkManager", "topActivity:" + ((ComponentName)localObject).flattenToString());
      if (!((ComponentName)localObject).getPackageName().equals(paramContext.getPackageName()))
      {
        w.i("MicroMsg.MT.MultiTalkManager", "is in backGround.");
        GMTrace.o(4748354781184L, 35378);
        return false;
      }
    }
    if (((KeyguardManager)ab.getContext().getSystemService("keyguard")).inKeyguardRestrictedInputMode())
    {
      GMTrace.o(4748354781184L, 35378);
      return false;
    }
    w.i("MicroMsg.MT.MultiTalkManager", "is in foreGround.");
    GMTrace.o(4748354781184L, 35378);
    return true;
  }
  
  private void sort()
  {
    GMTrace.i(4744059813888L, 35346);
    w.v("MicroMsg.MT.MultiTalkManager", "before sort: %s", new Object[] { this.nmp.xOB });
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = this.nmp.xOB.iterator();
    Object localObject = null;
    while (localIterator.hasNext())
    {
      MultiTalkGroupMember localMultiTalkGroupMember = (MultiTalkGroupMember)localIterator.next();
      if (!localMultiTalkGroupMember.xOC.equals(q.zE())) {
        localLinkedList.add(localMultiTalkGroupMember);
      } else {
        localObject = localMultiTalkGroupMember;
      }
    }
    Collections.sort(localLinkedList, new Comparator() {});
    Collections.sort(localLinkedList, new Comparator() {});
    Collections.sort(localLinkedList, new Comparator() {});
    if (localObject != null) {
      localLinkedList.add(localObject);
    }
    this.nmp.xOB = localLinkedList;
    w.v("MicroMsg.MT.MultiTalkManager", "after sort: %s", new Object[] { this.nmp.xOB });
    GMTrace.o(4744059813888L, 35346);
  }
  
  public final boolean CQ(String paramString)
  {
    GMTrace.i(20508737273856L, 152802);
    if (aRr())
    {
      w.i("MicroMsg.MT.MultiTalkManager", "ownerUserName : " + paramString);
      boolean bool = o.aRQ().nlX.CQ(paramString);
      w.i("MicroMsg.MT.MultiTalkManager", "result of subscribeLargeVideo: " + bool);
      GMTrace.o(20508737273856L, 152802);
      return bool;
    }
    GMTrace.o(20508737273856L, 152802);
    return false;
  }
  
  public final void a(Activity paramActivity, String paramString1, String paramString2)
  {
    GMTrace.i(4744328249344L, 35348);
    boolean bool2 = this.jGN;
    boolean bool3 = this.nmk;
    boolean bool4 = this.nmm;
    Object localObject = this.nmo.toString();
    if (this.nmp == null) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      w.i("MicroMsg.MT.MultiTalkManager", "createMultiTalk All Var Value:\n isMute: %b isHandsFree: %b isCameraFace: %b multiTalkStatus: %s groupIsNull: %b", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(bool4), localObject, Boolean.valueOf(bool1) });
      d.aRc();
      if (!aRC()) {
        break;
      }
      com.tencent.mm.ui.base.h.h(paramActivity, R.l.dDa, R.l.cUG);
      GMTrace.o(4744328249344L, 35348);
      return;
    }
    if (com.tencent.mm.plugin.voip.b.d.bvM())
    {
      com.tencent.mm.ui.base.h.h(paramActivity, R.l.dDe, R.l.cUG);
      GMTrace.o(4744328249344L, 35348);
      return;
    }
    if (com.tencent.mm.plugin.voip.b.d.bvN())
    {
      com.tencent.mm.ui.base.h.h(paramActivity, R.l.dDd, R.l.cUG);
      GMTrace.o(4744328249344L, 35348);
      return;
    }
    if (com.tencent.mm.as.a.JK())
    {
      com.tencent.mm.ui.base.h.h(paramActivity, R.l.dCZ, R.l.cUG);
      GMTrace.o(4744328249344L, 35348);
      return;
    }
    if (com.tencent.mm.plugin.voip.b.d.bvO())
    {
      com.tencent.mm.ui.base.h.h(paramActivity, R.l.dDc, R.l.cUG);
      GMTrace.o(4744328249344L, 35348);
      return;
    }
    if (aRq())
    {
      com.tencent.mm.as.a.a(paramActivity, R.l.dJR, null);
      GMTrace.o(4744328249344L, 35348);
      return;
    }
    if ((this.nmu) && (System.currentTimeMillis() - this.nmv < this.nmw))
    {
      com.tencent.mm.as.a.a(paramActivity, R.l.dKa, null);
      GMTrace.o(4744328249344L, 35348);
      return;
    }
    this.nmu = false;
    paramActivity = bg.g(paramString1.split(","));
    paramString1 = new MultiTalkGroup();
    paramString1.xOy = o.aRQ().nlX.cnb();
    paramString1.xOz = paramString2;
    localObject = paramActivity.iterator();
    if (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      MultiTalkGroupMember localMultiTalkGroupMember = new MultiTalkGroupMember();
      localMultiTalkGroupMember.xOC = str;
      if (str.equals(q.zE())) {}
      for (localMultiTalkGroupMember.status = 10;; localMultiTalkGroupMember.status = 1)
      {
        paramString1.xOB.add(localMultiTalkGroupMember);
        break;
      }
    }
    o.aRQ().nlX.aQ(bg.e((Integer)at.AP().get(1)), q.zE());
    if (o.aRQ().nlX.e(paramString1.xOy, paramString2, paramActivity)) {
      d.aRa();
    }
    for (;;)
    {
      b(com.tencent.mm.plugin.multitalk.ui.widget.e.noF);
      c(paramString1);
      GMTrace.o(4744328249344L, 35348);
      return;
      d.aRb();
    }
  }
  
  public final void aHP()
  {
    GMTrace.i(4746878386176L, 35367);
    this.mip = false;
    com.tencent.mm.plugin.voip.model.d.btH().dismiss();
    ((NotificationManager)ab.getContext().getSystemService("notification")).cancel(43);
    GMTrace.o(4746878386176L, 35367);
  }
  
  public final void aRA()
  {
    GMTrace.i(4747012603904L, 35368);
    w.i("MicroMsg.MT.MultiTalkManager", "try to startNetworkReceiver");
    if (this.nmx == null)
    {
      w.e("MicroMsg.MT.MultiTalkManager", "ui callback is null");
      GMTrace.o(4747012603904L, 35368);
      return;
    }
    if (this.nmn.size() == 0)
    {
      w.i("MicroMsg.MT.MultiTalkManager", "currentVideoUserSet.size() is 0,just return.");
      GMTrace.o(4747012603904L, 35368);
      return;
    }
    if (this.nmq == null)
    {
      w.i("MicroMsg.MT.MultiTalkManager", "startNetworkReceiver: networkReceiver is null %d", new Object[] { Integer.valueOf(this.nmn.size()) });
      this.nmq = new k(this.nmx);
      this.nmq.rf(this.nmn.size());
    }
    if (!this.nmq.running) {
      this.nmq.start();
    }
    GMTrace.o(4747012603904L, 35368);
  }
  
  public final void aRB()
  {
    GMTrace.i(4747146821632L, 35369);
    w.i("MicroMsg.MT.MultiTalkManager", "try to stopNetworkReceiver");
    if (this.nmq != null)
    {
      this.nmq.stop();
      this.nmq = null;
    }
    GMTrace.o(4747146821632L, 35369);
  }
  
  public final boolean aRo()
  {
    GMTrace.i(4743120289792L, 35339);
    i.aRJ();
    boolean bool = i.rd(this.nml);
    GMTrace.o(4743120289792L, 35339);
    return bool;
  }
  
  public final boolean aRp()
  {
    GMTrace.i(4743254507520L, 35340);
    i.aRJ();
    boolean bool = i.re(this.nml);
    GMTrace.o(4743254507520L, 35340);
    return bool;
  }
  
  public final boolean aRq()
  {
    GMTrace.i(4743388725248L, 35341);
    if ((this.nmo != com.tencent.mm.plugin.multitalk.ui.widget.e.noD) && (this.nmp != null)) {}
    for (boolean bool = true;; bool = false)
    {
      w.d("MicroMsg.MT.MultiTalkManager", "isMultiTalkConnecting %b", new Object[] { Boolean.valueOf(bool) });
      GMTrace.o(4743388725248L, 35341);
      return bool;
    }
  }
  
  public final boolean aRr()
  {
    GMTrace.i(4743522942976L, 35342);
    if ((this.nmo == com.tencent.mm.plugin.multitalk.ui.widget.e.noG) || (this.nmo == com.tencent.mm.plugin.multitalk.ui.widget.e.noH)) {}
    for (boolean bool = true;; bool = false)
    {
      w.d("MicroMsg.MT.MultiTalkManager", "isMultiTalkStarting %b", new Object[] { Boolean.valueOf(bool) });
      GMTrace.o(4743522942976L, 35342);
      return bool;
    }
  }
  
  public final boolean aRs()
  {
    GMTrace.i(4743657160704L, 35343);
    if (this.nmo == com.tencent.mm.plugin.multitalk.ui.widget.e.noH) {}
    for (boolean bool = true;; bool = false)
    {
      w.d("MicroMsg.MT.MultiTalkManager", "isMultiTalkTalking %b", new Object[] { Boolean.valueOf(bool) });
      GMTrace.o(4743657160704L, 35343);
      return bool;
    }
  }
  
  public final long aRt()
  {
    GMTrace.i(4743791378432L, 35344);
    long l1 = System.currentTimeMillis();
    long l2 = this.gRS;
    GMTrace.o(4743791378432L, 35344);
    return l1 - l2;
  }
  
  public final void aRx()
  {
    GMTrace.i(4746207297536L, 35362);
    w.i("MicroMsg.MT.MultiTalkManager", "onMultiTalkReady");
    GMTrace.o(4746207297536L, 35362);
  }
  
  public final void aRy()
  {
    GMTrace.i(4746475732992L, 35364);
    w.i("MicroMsg.MT.MultiTalkManager", "onSwitchMultiTalkVideoSuss currentVideoAction %d", new Object[] { Integer.valueOf(this.nml) });
    GMTrace.o(4746475732992L, 35364);
  }
  
  public final void aRz()
  {
    GMTrace.i(20508468838400L, 152800);
    w.i("MicroMsg.MT.MultiTalkManager", "onSubscribeLargeVideoSuss ");
    GMTrace.o(20508468838400L, 152800);
  }
  
  public final void aX(List<a.am> paramList)
  {
    GMTrace.i(4746609950720L, 35365);
    if (aRq())
    {
      this.nmn.clear();
      w.d("MicroMsg.MT.MultiTalkManager", "onVideoGroupMemberChange: %s", new Object[] { paramList });
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        a.am localam = (a.am)paramList.next();
        if ((localam.xMI == 2) || (localam.xMI == 3)) {
          this.nmn.add(localam.xMH);
        }
      }
      this.nmn.remove(q.zE());
      w.i("MicroMsg.MT.MultiTalkManager", "onVideoGroupMemberChange %s", new Object[] { this.nmn });
      if (this.nmq != null) {
        this.nmq.rf(this.nmn.size());
      }
      if (this.nmx != null) {
        this.nmx.aQS();
      }
    }
    GMTrace.o(4746609950720L, 35365);
  }
  
  public final void b(final MultiTalkGroup paramMultiTalkGroup)
  {
    GMTrace.i(4745133555712L, 35354);
    boolean bool2 = this.jGN;
    boolean bool3 = this.nmk;
    boolean bool4 = this.nmm;
    String str = this.nmo.toString();
    if (this.nmp == null) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      w.i("MicroMsg.MT.MultiTalkManager", "onInviteMultiTalk All Var Value:\n isMute: %b isHandsFree: %b isCameraFace: %b multiTalkStatus: %s groupIsNull: %b", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(bool4), str, Boolean.valueOf(bool1) });
      d.aRd();
      if ((com.tencent.mm.k.f.tL()) || (cR(ab.getContext()))) {
        break;
      }
      w.i("MicroMsg.MT.MultiTalkManager", "NotificationConfig.isNewVoipMsgNotification() is false and is not in foreground, now return.");
      if ((this.nmA == null) && (this.nmC.bQn()))
      {
        this.nmA = paramMultiTalkGroup;
        this.nmC.z(2000L, 2000L);
        this.nmB = System.currentTimeMillis();
        com.tencent.mm.plugin.report.service.g.ork.a(500L, 6L, 1L, false);
      }
      GMTrace.o(4745133555712L, 35354);
      return;
    }
    str = i.m(paramMultiTalkGroup);
    at.AR();
    x localx = com.tencent.mm.y.c.yK().TE(str);
    if (com.tencent.mm.k.g.ut().getInt("MultitalkBlockReceiver", 0) == 0) {}
    for (int i = 1; (i == 0) || (localx.uZ()); i = 0)
    {
      w.i("MicroMsg.MT.MultiTalkManager", "not open multitalk receiver or black user");
      com.tencent.mm.sdk.platformtools.af.i(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(4751978659840L, 35405);
          String str2 = paramMultiTalkGroup.xOx;
          String str1 = str2;
          if (bg.nm(str2)) {
            str1 = paramMultiTalkGroup.xOy;
          }
          o.aRQ().nlX.CY(str1);
          GMTrace.o(4751978659840L, 35405);
        }
      }, 1000L);
      d.ag(3, i.l(paramMultiTalkGroup));
      GMTrace.o(4745133555712L, 35354);
      return;
    }
    if ((!aRq()) && (!com.tencent.mm.plugin.voip.b.d.bvN()) && (!com.tencent.mm.plugin.voip.b.d.bvM()) && (!com.tencent.mm.as.a.JK())) {
      if (((TelephonyManager)ab.getContext().getSystemService("phone")).getCallState() == 0) {
        break label455;
      }
    }
    label455:
    for (i = 1; (i != 0) || (com.tencent.mm.plugin.voip.b.d.bvO()) || (!com.tencent.mm.l.a.eE(localx.field_type)); i = 0)
    {
      w.i("MicroMsg.MT.MultiTalkManager", "onInviteMultiTalk: exit multitalk: %s", new Object[] { i.h(paramMultiTalkGroup) });
      if (!m.fb(paramMultiTalkGroup.xOz))
      {
        w.i("MicroMsg.MT.MultiTalkManager", "Get Chatroom When chatroom not in conversation %s", new Object[] { paramMultiTalkGroup.xOz });
        ak.a.gmX.a(paramMultiTalkGroup.xOz, "", new ak.b.a()
        {
          public final void r(String paramAnonymousString, boolean paramAnonymousBoolean)
          {
            GMTrace.i(4750636482560L, 35395);
            GMTrace.o(4750636482560L, 35395);
          }
        });
      }
      com.tencent.mm.sdk.platformtools.af.i(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(4768621658112L, 35529);
          String str2 = paramMultiTalkGroup.xOx;
          String str1 = str2;
          if (bg.nm(str2)) {
            str1 = paramMultiTalkGroup.xOy;
          }
          o.aRQ().nlX.CY(str1);
          GMTrace.o(4768621658112L, 35529);
        }
      }, 1000L);
      d.ag(3, i.l(paramMultiTalkGroup));
      GMTrace.o(4745133555712L, 35354);
      return;
    }
    if (!m.fb(paramMultiTalkGroup.xOz))
    {
      w.i("MicroMsg.MT.MultiTalkManager", "Get Chatroom When chatroom not in conversation %s", new Object[] { paramMultiTalkGroup.xOz });
      ak.a.gmX.a(paramMultiTalkGroup.xOz, "", null);
    }
    w.i("MicroMsg.MT.MultiTalkManager", "onInviteMultiTalk: %s", new Object[] { i.h(paramMultiTalkGroup) });
    b(com.tencent.mm.plugin.multitalk.ui.widget.e.noE);
    d.ag(1, i.l(paramMultiTalkGroup));
    if (!com.tencent.mm.l.a.eE(localx.field_type))
    {
      w.i("MicroMsg.MT.MultiTalkManager", "onInviteMultiTalk nofriend do not show invitingUI  inviter=%s,currentuser=%s", new Object[] { str, q.zE() });
      if (a(paramMultiTalkGroup))
      {
        this.nmj = false;
        aRv();
        aHR();
        GMTrace.o(4745133555712L, 35354);
      }
    }
    else
    {
      w.i("MicroMsg.MT.MultiTalkManager", "onInviteMultiTalk friend show invitingUI inviter=%s,currentuser=%s", new Object[] { str, q.zE() });
      c(paramMultiTalkGroup);
    }
    GMTrace.o(4745133555712L, 35354);
  }
  
  public final void b(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(4744596684800L, 35350);
    if (!m.fb(paramString1))
    {
      w.i("MicroMsg.MT.MultiTalkManager", "Get Chatroom When chatroom not in conversation %s", new Object[] { paramString1 });
      ak.a.gmX.a(paramString1, "", new ak.b.a()
      {
        public final void r(String paramAnonymousString, boolean paramAnonymousBoolean)
        {
          GMTrace.i(4770634924032L, 35544);
          GMTrace.o(4770634924032L, 35544);
        }
      });
    }
    au localau = new au();
    localau.setType(64);
    localau.E(System.currentTimeMillis());
    localau.dB(6);
    localau.dC(2);
    String str = r.fs(paramString2);
    Object localObject = paramString2;
    if (str != null) {
      if (!str.equals("")) {
        break label364;
      }
    }
    label364:
    for (localObject = paramString2;; localObject = str)
    {
      paramString2 = (String)localObject + ab.getContext().getString(R.l.dKk);
      localau.setContent(paramString2);
      if (m.fc(paramString1))
      {
        localau.db(paramString1);
        at.AR();
        com.tencent.mm.y.c.yM().P(localau);
        at.AR();
        localObject = com.tencent.mm.y.c.yP().TO(paramString1);
        if (localObject != null)
        {
          if (paramBoolean1) {
            ((com.tencent.mm.storage.ae)localObject).dz(((com.tencent.mm.g.b.aj)localObject).field_unReadCount + 1);
          }
          ((com.tencent.mm.storage.ae)localObject).setContent(paramString2);
          at.AR();
          if (com.tencent.mm.y.c.yP().a((com.tencent.mm.storage.ae)localObject, paramString1) == -1) {
            w.e("MicroMsg.MT.MultiTalkManager", "update cvs fail!!! for :" + paramString1);
          }
          if (paramBoolean2)
          {
            ((am)at.getNotification()).a(localau);
            GMTrace.o(4744596684800L, 35350);
          }
        }
        else
        {
          localObject = new com.tencent.mm.storage.ae();
          ((com.tencent.mm.storage.ae)localObject).setUsername(paramString1);
          if (paramBoolean1) {
            ((com.tencent.mm.storage.ae)localObject).dz(1);
          }
          ((com.tencent.mm.storage.ae)localObject).setContent(paramString2);
          at.AR();
          com.tencent.mm.y.c.yP().d((com.tencent.mm.storage.ae)localObject);
          if (paramBoolean2) {
            ((am)at.getNotification()).a(localau);
          }
        }
      }
      GMTrace.o(4744596684800L, 35350);
      return;
    }
  }
  
  public void c(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    GMTrace.i(4744462467072L, 35349);
    w.i("MicroMsg.MT.MultiTalkManager", "exitCurrentMultiTalk: isReject %b isMissCall %b isPhoneCall %b isNetworkError %b", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), Boolean.valueOf(false), Boolean.valueOf(paramBoolean3) });
    o.aRR().stopRing();
    if (aRq())
    {
      Object localObject = new mq();
      ((mq)localObject).eRK.type = 2;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
      localObject = i.l(this.nmp);
      d.CO((String)localObject);
      long l;
      int i;
      if (this.nmo != com.tencent.mm.plugin.multitalk.ui.widget.e.noH)
      {
        boolean bool = i.k(this.nmp);
        l = aRt();
        i = 0;
        if (bool) {
          if (paramBoolean2)
          {
            i = 4;
            d.a(bool, l, (String)localObject, i);
          }
        }
      }
      for (;;)
      {
        localObject = this.nmo;
        if (this.nmx != null) {
          this.nmx.aQQ();
        }
        this.nmo = com.tencent.mm.plugin.multitalk.ui.widget.e.noD;
        aRB();
        aHP();
        ZX();
        o.aRP().reset();
        o.aRS().aRL();
        if (this.nmp != null)
        {
          a(this.nmp, (com.tencent.mm.plugin.multitalk.ui.widget.e)localObject, paramBoolean2);
          String str = this.nmp.xOx;
          localObject = str;
          if (bg.nm(str)) {
            localObject = this.nmp.xOy;
          }
          o.aRQ().nlX.CY((String)localObject);
          this.nmp = null;
        }
        this.nml = 0;
        this.nmk = true;
        this.jGN = false;
        this.nmm = true;
        this.gRS = 0L;
        this.nmr = 0;
        this.nmn.clear();
        this.nms = 0;
        GMTrace.o(4744462467072L, 35349);
        return;
        if (paramBoolean1)
        {
          i = 1;
          break;
        }
        if (paramBoolean3)
        {
          i = 5;
          break;
        }
        i = 2;
        break;
        if (paramBoolean2)
        {
          if (l >= 45L)
          {
            i = 6;
            break;
          }
          i = 8;
          break;
        }
        if (paramBoolean1)
        {
          i = 7;
          break;
        }
        if (!paramBoolean3) {
          break;
        }
        i = 10;
        break;
        d.ra(this.nmr);
        d.m(this.nmr, (String)localObject);
      }
    }
    aRB();
    aHP();
    ZX();
    this.nmp = null;
    this.nml = 0;
    this.gRS = 0L;
    this.nmr = 0;
    this.nmn.clear();
    this.nmo = com.tencent.mm.plugin.multitalk.ui.widget.e.noD;
    this.nms = 0;
    GMTrace.o(4744462467072L, 35349);
  }
  
  public final void d(MultiTalkGroup paramMultiTalkGroup)
  {
    GMTrace.i(4745536208896L, 35357);
    d.ag(2, i.l(paramMultiTalkGroup));
    a(paramMultiTalkGroup, com.tencent.mm.plugin.multitalk.ui.widget.e.noE, true);
    GMTrace.o(4745536208896L, 35357);
  }
  
  public final void e(int paramInt, Object paramObject)
  {
    GMTrace.i(4744999337984L, 35353);
    w.i("MicroMsg.MT.MultiTalkManager", "onErr: %d", new Object[] { Integer.valueOf(paramInt) });
    int i;
    switch (paramInt)
    {
    default: 
      i = R.l.dJN;
    case -100: 
    case -200: 
    case -300: 
    case -400: 
    case -500: 
    case -600: 
    case -700: 
    case -800: 
    case -900: 
    case -1000: 
    case -1100: 
    case -1200: 
    case -1300: 
    case -14256: 
    case -1400: 
      for (;;)
      {
        if ((paramInt != 64736) && (paramInt != 65036))
        {
          Toast.makeText(ab.getContext(), ab.getContext().getString(i), 0).show();
          c(false, false, true);
        }
        GMTrace.o(4744999337984L, 35353);
        return;
        d.gj(false);
        i = R.l.dJC;
        continue;
        d.gk(false);
        i = R.l.dJJ;
        continue;
        i = R.l.dJK;
        continue;
        i = R.l.dJL;
        continue;
        i = R.l.dJM;
        continue;
        i = R.l.dJN;
        continue;
        i = R.l.dJO;
        continue;
        i = R.l.dJP;
        continue;
        i = R.l.dJQ;
        continue;
        i = R.l.dJD;
        continue;
        i = R.l.dJE;
        continue;
        i = R.l.dJF;
        continue;
        int j = R.l.dJG;
        this.nmu = true;
        this.nmv = System.currentTimeMillis();
        i = j;
        if (paramObject != null)
        {
          paramObject = (a.z)paramObject;
          i = j;
          if (paramObject != null)
          {
            w.i("MicroMsg.MT.MultiTalkManager", "ErrorCode : -1300, now try set retrySeconds:" + ((a.z)paramObject).xMA);
            i = j;
            if (((a.z)paramObject).xMA != 0)
            {
              this.nmw = (((a.z)paramObject).xMA * 1000);
              i = j;
              continue;
              w.i("MicroMsg.MT.MultiTalkManager", "14256,other device has handle this!");
              j = R.l.dJI;
              i = j;
              if (paramObject != null)
              {
                i = j;
                if ((a.aa)paramObject != null)
                {
                  com.tencent.wecall.talkroom.model.a.crb().nf(false);
                  i = j;
                  continue;
                  i = R.l.dJH;
                }
              }
            }
          }
        }
      }
    }
    MultiTalkGroup localMultiTalkGroup = this.nmp;
    if (this.nmp != null) {}
    for (String str = this.nmp.xOz;; str = "")
    {
      w.i("MicroMsg.MT.MultiTalkManager", "onErr:MULTITALK_E_Talk_Enter_BannerClear  %d, currentMultiTalkGroup=%s,wxGroupId=%s", new Object[] { Integer.valueOf(paramInt), localMultiTalkGroup, str });
      if (paramObject != null)
      {
        paramObject = (a.aa)paramObject;
        if (paramObject != null)
        {
          w.i("MicroMsg.MT.MultiTalkManager", "ErrorCode :-14255,now exitMultiTalk for groupId : " + ((a.aa)paramObject).groupId);
          if (((a.aa)paramObject).xLe != null)
          {
            o.aRT().Da(((a.aa)paramObject).xLe.xNm);
            w.i("MicroMsg.MT.MultiTalkManager", "cleanBanner for wxGroupId :" + ((a.aa)paramObject).xLe.xNm);
          }
          if (!o.aRQ().nlX.CY(((a.aa)paramObject).groupId)) {
            w.i("MicroMsg.MT.MultiTalkManager", "exit fail!!,now cleanBanner for groupId :" + ((a.aa)paramObject).groupId);
          }
        }
      }
      i = R.l.dKi;
      break;
    }
  }
  
  public final void e(MultiTalkGroup paramMultiTalkGroup)
  {
    GMTrace.i(4745670426624L, 35358);
    w.i("MicroMsg.MT.MultiTalkManager", "onCreateMultiTalk: %s", new Object[] { i.h(paramMultiTalkGroup) });
    d.gj(true);
    if (a(paramMultiTalkGroup)) {
      aRw();
    }
    GMTrace.o(4745670426624L, 35358);
  }
  
  public final void f(MultiTalkGroup paramMultiTalkGroup)
  {
    GMTrace.i(4745804644352L, 35359);
    w.i("MicroMsg.MT.MultiTalkManager", "onEnterMultiTalk: %s", new Object[] { i.h(paramMultiTalkGroup) });
    mq localmq = new mq();
    localmq.eRK.type = 1;
    com.tencent.mm.sdk.b.a.vgX.m(localmq);
    d.gk(true);
    if (this.nmo != com.tencent.mm.plugin.multitalk.ui.widget.e.noE)
    {
      b(com.tencent.mm.plugin.multitalk.ui.widget.e.noG);
      c(paramMultiTalkGroup);
    }
    if ((aRq()) && (a(paramMultiTalkGroup))) {
      aRw();
    }
    GMTrace.o(4745804644352L, 35359);
  }
  
  public final void g(MultiTalkGroup paramMultiTalkGroup)
  {
    GMTrace.i(4746073079808L, 35361);
    w.i("MicroMsg.MT.MultiTalkManager", "onMemberChange: %s", new Object[] { i.h(paramMultiTalkGroup) });
    if ((aRq()) && (a(paramMultiTalkGroup)))
    {
      if (!i.j(this.nmp))
      {
        if (this.nmo == com.tencent.mm.plugin.multitalk.ui.widget.e.noE)
        {
          c(false, true, false);
          GMTrace.o(4746073079808L, 35361);
          return;
        }
        c(false, false, false);
        GMTrace.o(4746073079808L, 35361);
        return;
      }
      if ((this.nmo != com.tencent.mm.plugin.multitalk.ui.widget.e.noH) && (i.i(paramMultiTalkGroup))) {
        b(com.tencent.mm.plugin.multitalk.ui.widget.e.noH);
      }
      if ((this.nmx != null) && (i.c(this.nmo))) {
        this.nmx.aQR();
      }
    }
    GMTrace.o(4746073079808L, 35361);
  }
  
  public final void gg(boolean paramBoolean)
  {
    GMTrace.i(4746341515264L, 35363);
    this.jGN = paramBoolean;
    if (this.nmx != null) {
      this.nmx.gg(this.jGN);
    }
    GMTrace.o(4746341515264L, 35363);
  }
  
  public final void gl(boolean paramBoolean)
  {
    GMTrace.i(4746744168448L, 35366);
    if (aRq())
    {
      if (this.mip)
      {
        GMTrace.o(4746744168448L, 35366);
        return;
      }
      this.mip = true;
      d.d(i.aRH(), o.aRR().aRo(), paramBoolean);
      Toast.makeText(ab.getContext(), R.l.dJY, 0).show();
      Object localObject1 = ab.getContext().getString(R.l.dJx);
      String str = ab.getContext().getString(R.l.dKb);
      Object localObject2 = new Intent();
      ((Intent)localObject2).setClass(ab.getContext(), MultiTalkMainUI.class);
      localObject2 = PendingIntent.getActivity(ab.getContext(), 43, (Intent)localObject2, 134217728);
      int i = R.g.aYD;
      if (com.tencent.mm.compatible.util.d.eu(19)) {
        i = R.g.aYC;
      }
      localObject1 = com.tencent.mm.plugin.voip.b.d.a(new Notification.Builder(ab.getContext()).setTicker(str).setWhen(System.currentTimeMillis()).setContentTitle((CharSequence)localObject1).setContentText(str).setContentIntent((PendingIntent)localObject2));
      ((Notification)localObject1).icon = i;
      ((Notification)localObject1).flags |= 0x20;
      at.getNotification().a(43, (Notification)localObject1, false);
      if (this.nmx != null) {
        this.nmx.aHW();
      }
      com.tencent.mm.sdk.platformtools.af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(4740435935232L, 35319);
          Intent localIntent = new Intent();
          localIntent.setFlags(268435456);
          if (e.this.nmp != null) {}
          for (String str = e.this.nmp.xOz;; str = "")
          {
            localIntent.putExtra("enterMainUiWxGroupId", str);
            localIntent.setClass(ab.getContext(), MultiTalkMainUI.class);
            localIntent.putExtra("enterMainUiSource", 1);
            com.tencent.mm.plugin.voip.model.d.btH().a(localIntent, new com.tencent.mm.plugin.voip.ui.a()
            {
              public final void a(Intent paramAnonymous2Intent, com.tencent.mm.plugin.voip.ui.h paramAnonymous2h)
              {
                GMTrace.i(14281974218752L, 106409);
                if (!e.this.aRs())
                {
                  paramAnonymous2h.JQ(ab.getContext().getString(R.l.dKo));
                  GMTrace.o(14281974218752L, 106409);
                  return;
                }
                int i = e.this.nmr;
                paramAnonymous2h.JQ(String.format("%02d:%02d", new Object[] { Integer.valueOf(i / 60), Integer.valueOf(i % 60) }));
                GMTrace.o(14281974218752L, 106409);
              }
              
              public final boolean aHS()
              {
                GMTrace.i(14281840001024L, 106408);
                if ((e.this.aRr()) || (e.this.aRs()))
                {
                  GMTrace.o(14281840001024L, 106408);
                  return true;
                }
                GMTrace.o(14281840001024L, 106408);
                return false;
              }
            });
            GMTrace.o(4740435935232L, 35319);
            return;
          }
        }
      });
    }
    GMTrace.o(4746744168448L, 35366);
  }
  
  public final void gm(boolean paramBoolean)
  {
    GMTrace.i(4747281039360L, 35370);
    o.aRQ().nlX.gm(paramBoolean);
    w.i("MicroMsg.MT.MultiTalkManager", "onSpeakerStateChange %b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.nmk = paramBoolean;
    if (this.nmx != null) {
      this.nmx.gh(this.nmk);
    }
    GMTrace.o(4747281039360L, 35370);
  }
  
  public final void gn(boolean paramBoolean)
  {
    GMTrace.i(4747952128000L, 35375);
    if (this.nmj)
    {
      GMTrace.o(4747952128000L, 35375);
      return;
    }
    this.mjp.m(R.k.cOh, 0, paramBoolean);
    this.hez.requestFocus();
    this.nmj = true;
    GMTrace.o(4747952128000L, 35375);
  }
  
  public final void rb(int paramInt)
  {
    GMTrace.i(20508603056128L, 152801);
    w.i("MicroMsg.MT.MultiTalkManager", "onNotifyLargeVideoSubscribersChange largeVideoSubscribersCnt: " + paramInt);
    if (paramInt > 0)
    {
      this.nmz = true;
      GMTrace.o(20508603056128L, 152801);
      return;
    }
    this.nmz = false;
    GMTrace.o(20508603056128L, 152801);
  }
  
  public final boolean rc(int paramInt)
  {
    GMTrace.i(4747415257088L, 35371);
    if (aRr())
    {
      w.i("MicroMsg.MT.MultiTalkManager", "try switch to action : " + paramInt);
      boolean bool = o.aRQ().nlX.rc(paramInt);
      w.i("MicroMsg.MT.MultiTalkManager", "switchMultiTalkVideo %b", new Object[] { Boolean.valueOf(bool) });
      int i = this.nml;
      this.nml = paramInt;
      if (aRp()) {
        aRA();
      }
      for (;;)
      {
        if ((this.nmx != null) && (i != this.nml)) {
          this.nmx.cx(i, this.nml);
        }
        GMTrace.o(4747415257088L, 35371);
        return bool;
        aRB();
      }
    }
    GMTrace.o(4747415257088L, 35371);
    return false;
  }
  
  public final void stopRing()
  {
    GMTrace.i(4748086345728L, 35376);
    com.tencent.mm.sdk.f.e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(4763924037632L, 35494);
        e.this.mjp.stop();
        e.this.nmj = false;
        e.this.hez.tx();
        at.AS().setSpeakerphoneOn(e.this.nmk);
        GMTrace.o(4763924037632L, 35494);
      }
    }, "MultiTalkManager_stop_ring");
    GMTrace.o(4748086345728L, 35376);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\multitalk\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */