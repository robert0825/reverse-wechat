package com.tencent.mm.plugin.notification.c;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Looper;
import android.support.v4.app.y.d;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.jz;
import com.tencent.mm.g.a.rp;
import com.tencent.mm.plugin.notification.d.a.a;
import com.tencent.mm.plugin.notification.d.e;
import com.tencent.mm.plugin.notification.ui.FailSendMsgNotification;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class a<T>
  implements c
{
  public Context mContext;
  public b nyj;
  protected FailSendMsgNotification nyk;
  protected boolean nyl;
  protected ArrayList<Long> nym;
  protected ArrayList<Long> nyn;
  protected ArrayList<Long> nyo;
  private ArrayList<aj> nyp;
  private aj nyq;
  private com.tencent.mm.sdk.b.c nyr;
  
  public a()
  {
    GMTrace.i(10742652731392L, 80039);
    this.nyj = null;
    this.nyk = null;
    this.nyl = false;
    this.mContext = null;
    this.nym = null;
    this.nyn = null;
    this.nyo = null;
    this.nyp = new ArrayList();
    this.nyq = null;
    this.nyr = new com.tencent.mm.sdk.b.c() {};
    this.nyj = new b();
    this.nyk = new FailSendMsgNotification(getType());
    this.nyl = false;
    this.mContext = ab.getContext();
    this.nym = new ArrayList();
    this.nyn = new ArrayList();
    this.nyo = new ArrayList();
    this.nyk.nzd = new com.tencent.mm.plugin.notification.ui.a()
    {
      public final void aUJ()
      {
        GMTrace.i(10739431505920L, 80015);
        w.d("MicroMsg.AbstractSendMsgFailNotification", "onClickResendButton");
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(10740371030016L, 80022);
            g.ork.i(11425, new Object[] { Integer.valueOf(a.this.getType()), Integer.valueOf(3), Integer.valueOf(0), Integer.valueOf(0) });
            a.this.aUG();
            a.this.aUz();
            a.this.aUy();
            GMTrace.o(10740371030016L, 80022);
          }
        });
        GMTrace.o(10739431505920L, 80015);
      }
      
      public final void aUK()
      {
        GMTrace.i(10739565723648L, 80016);
        w.d("MicroMsg.AbstractSendMsgFailNotification", "onClickOmitButton");
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(10741578989568L, 80031);
            g.ork.i(11425, new Object[] { Integer.valueOf(a.this.getType()), Integer.valueOf(2), Integer.valueOf(0), Integer.valueOf(0) });
            a.this.aUG();
            a.this.aUC();
            a.this.aIL();
            a.this.nyk.dismiss();
            GMTrace.o(10741578989568L, 80031);
          }
        });
        GMTrace.o(10739565723648L, 80016);
      }
    };
    this.nyk.nze = new com.tencent.mm.plugin.notification.ui.b()
    {
      public final void aUL()
      {
        GMTrace.i(10738894635008L, 80011);
        g.ork.i(11425, new Object[] { Integer.valueOf(a.this.getType()), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0) });
        a.this.aUG();
        a.this.aUI();
        if (!a.this.nyl) {
          a.this.nyk.dismiss();
        }
        GMTrace.o(10738894635008L, 80011);
      }
    };
    this.nyk.nzf = new com.tencent.mm.plugin.notification.ui.c()
    {
      public final void onDismiss()
      {
        GMTrace.i(10747618787328L, 80076);
        a.this.aIL();
        GMTrace.o(10747618787328L, 80076);
      }
    };
    aUt();
    GMTrace.o(10742652731392L, 80039);
  }
  
  private void aUB()
  {
    GMTrace.i(10744129126400L, 80050);
    Iterator localIterator = this.nyp.iterator();
    while (localIterator.hasNext()) {
      ((aj)localIterator.next()).stopTimer();
    }
    this.nyp.clear();
    this.nyo.clear();
    GMTrace.o(10744129126400L, 80050);
  }
  
  private String aUD()
  {
    GMTrace.i(10744531779584L, 80053);
    Object localObject = new StringBuilder("");
    int i = 0;
    while (i < this.nyj.nyu.size())
    {
      long l = this.nyj.get(i);
      ((StringBuilder)localObject).append(l + ", ");
      i += 1;
    }
    localObject = ((StringBuilder)localObject).toString();
    GMTrace.o(10744531779584L, 80053);
    return (String)localObject;
  }
  
  private void aUF()
  {
    GMTrace.i(10744800215040L, 80055);
    this.nyj.currentIndex = 0;
    if (this.nym.size() > 0)
    {
      Iterator localIterator = this.nym.iterator();
      while (localIterator.hasNext())
      {
        Long localLong = (Long)localIterator.next();
        this.nyj.remove(localLong.longValue());
      }
    }
    this.nym.clear();
    this.nyn.clear();
    GMTrace.o(10744800215040L, 80055);
  }
  
  private void aUH()
  {
    GMTrace.i(10745068650496L, 80057);
    a.a locala = new a.a(this.nyj, this.nyj.currentIndex, this.nym, this.nyn);
    com.tencent.mm.plugin.notification.d.a.a(getType(), locala);
    GMTrace.o(10745068650496L, 80057);
  }
  
  private void aUt()
  {
    GMTrace.i(10742786949120L, 80040);
    this.nyq = new aj(Looper.getMainLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(10739834159104L, 80018);
        if (a.this.nyl)
        {
          w.i("MicroMsg.AbstractSendMsgFailNotification", "mCheckMsgExistTimer, before check msgList.size:%d, successList.size:%d, failedList.size:%d", new Object[] { Integer.valueOf(a.this.nyj.nyu.size()), Integer.valueOf(a.this.nym.size()), Integer.valueOf(a.this.nyn.size()) });
          a.this.aUA();
          w.i("MicroMsg.AbstractSendMsgFailNotification", "mCheckMsgExistTimer, after check msgList.size:%d, successList.size:%d, failedList.size:%d", new Object[] { Integer.valueOf(a.this.nyj.nyu.size()), Integer.valueOf(a.this.nym.size()), Integer.valueOf(a.this.nyn.size()) });
          if (a.this.nyj.nyu.size() > 0) {
            a.this.aUv();
          }
          for (;;)
          {
            GMTrace.o(10739834159104L, 80018);
            return true;
            a.this.aUw();
          }
        }
        GMTrace.o(10739834159104L, 80018);
        return false;
      }
    }, true);
    GMTrace.o(10742786949120L, 80040);
  }
  
  public abstract String L(int paramInt1, int paramInt2, int paramInt3);
  
  public abstract void M(ArrayList<Long> paramArrayList);
  
  public final void aIL()
  {
    GMTrace.i(10744397561856L, 80052);
    this.nyj.clear();
    this.nyl = false;
    this.nym.clear();
    this.nyn.clear();
    aUB();
    GMTrace.o(10744397561856L, 80052);
  }
  
  public final void aUA()
  {
    GMTrace.i(10743860690944L, 80048);
    Object localObject = new ArrayList();
    int i = 0;
    while (i < this.nyj.nyu.size())
    {
      long l = this.nyj.get(i);
      if (!cZ(l)) {
        ((ArrayList)localObject).add(Long.valueOf(l));
      }
      i += 1;
    }
    if (((ArrayList)localObject).size() > 0)
    {
      localObject = ((ArrayList)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        Long localLong = (Long)((Iterator)localObject).next();
        this.nyj.remove(localLong.longValue());
      }
    }
    GMTrace.o(10743860690944L, 80048);
  }
  
  public final void aUC()
  {
    GMTrace.i(10744263344128L, 80051);
    w.d("MicroMsg.AbstractSendMsgFailNotification", "omitFailMsg, size:%d", new Object[] { Integer.valueOf(this.nyj.nyu.size()) });
    if (this.nyj.nyu.size() > 0)
    {
      Object localObject = this.nyj;
      ArrayList localArrayList = new ArrayList();
      localObject = ((b)localObject).nyu.iterator();
      while (((Iterator)localObject).hasNext()) {
        localArrayList.add(Long.valueOf(((Long)((Iterator)localObject).next()).longValue()));
      }
      M(localArrayList);
    }
    GMTrace.o(10744263344128L, 80051);
  }
  
  public final FailSendMsgNotification aUE()
  {
    GMTrace.i(10744665997312L, 80054);
    FailSendMsgNotification localFailSendMsgNotification = this.nyk;
    GMTrace.o(10744665997312L, 80054);
    return localFailSendMsgNotification;
  }
  
  protected final void aUG()
  {
    GMTrace.i(10744934432768L, 80056);
    if ((this.nyj == null) || (this.nyj.nyu.size() == 0))
    {
      w.d("MicroMsg.AbstractSendMsgFailNotification", "autoResumeFromCrash");
      a.a locala = com.tencent.mm.plugin.notification.d.a.sb(getType());
      if (locala == null)
      {
        w.e("MicroMsg.AbstractSendMsgFailNotification", "resetNotificationAfterCrash, cacheObj is null");
        GMTrace.o(10744934432768L, 80056);
        return;
      }
      if (this.nyq == null) {
        aUt();
      }
      b localb = locala.nyw;
      ArrayList localArrayList1 = locala.nyy;
      ArrayList localArrayList2 = locala.nyz;
      int i = locala.nyx;
      if ((localArrayList1.size() == 0) && (localArrayList2.size() == 0) && (i == 0))
      {
        w.d("MicroMsg.AbstractSendMsgFailNotification", "resetNotificationAfterCrash, not start resend");
        this.nyj.clear();
        this.nyj = localb;
        this.nym.clear();
        this.nyn.clear();
        aUu();
        GMTrace.o(10744934432768L, 80056);
        return;
      }
      if (localArrayList1.size() + localArrayList2.size() >= localb.nyu.size())
      {
        w.d("MicroMsg.AbstractSendMsgFailNotification", "resetNotificationAfterCrash, resendFinish");
        aUw();
        GMTrace.o(10744934432768L, 80056);
        return;
      }
      w.d("MicroMsg.AbstractSendMsgFailNotification", "resetNotificationAfterCrash, currently resending");
      this.nyj.clear();
      this.nyj = localb;
      this.nyj.currentIndex = i;
      this.nym.clear();
      this.nym.addAll(localArrayList1);
      this.nyn.clear();
      this.nyn.addAll(localArrayList2);
      aUv();
    }
    GMTrace.o(10744934432768L, 80056);
  }
  
  public abstract void aUI();
  
  public final void aUu()
  {
    GMTrace.i(10743055384576L, 80042);
    w.d("MicroMsg.AbstractSendMsgFailNotification", "showInitNotification, isInForeground:%b", new Object[] { Boolean.valueOf(e.aUT()) });
    this.nyk.nzh = sa(this.nyj.nyu.size());
    this.nyk.aUY();
    if ((!e.aUT()) && (!this.nyk.nzm))
    {
      this.nyk.nzg = sa(this.nyj.nyu.size());
      this.nyk.aUX();
      this.nyk.aUW();
      w.d("MicroMsg.AbstractSendMsgFailNotification", "showInitNotification, first show notification");
      this.nyk.show();
      com.tencent.mm.sdk.b.a.vgX.c(this.nyr);
      com.tencent.mm.sdk.b.a.vgX.b(this.nyr);
      GMTrace.o(10743055384576L, 80042);
      return;
    }
    if (this.nyk.nzm)
    {
      this.nyk.aUX();
      this.nyk.aUW();
      w.d("MicroMsg.AbstractSendMsgFailNotification", "showInitNotification, update notification content text");
      this.nyk.Ed(sa(this.nyj.nyu.size()));
      com.tencent.mm.sdk.b.a.vgX.c(this.nyr);
      com.tencent.mm.sdk.b.a.vgX.b(this.nyr);
      GMTrace.o(10743055384576L, 80042);
      return;
    }
    w.d("MicroMsg.AbstractSendMsgFailNotification", "showInitNotification, not show or update notification, isForeground:%b", new Object[] { Boolean.valueOf(e.aUT()) });
    GMTrace.o(10743055384576L, 80042);
  }
  
  public final void aUv()
  {
    GMTrace.i(10743323820032L, 80044);
    if (Build.VERSION.SDK_INT >= 16)
    {
      this.nyk.nzh = sa(this.nyj.nyu.size());
      if (this.nyn.size() <= 0)
      {
        this.nyk.Ed(cD(this.nyj.nyu.size(), this.nym.size() + this.nyn.size()));
        GMTrace.o(10743323820032L, 80044);
        return;
      }
      this.nyk.Ed(L(this.nyj.nyu.size(), this.nym.size() + this.nyn.size(), this.nyn.size()));
    }
    GMTrace.o(10743323820032L, 80044);
  }
  
  public final void aUw()
  {
    GMTrace.i(10743458037760L, 80045);
    this.nyl = false;
    w.d("MicroMsg.AbstractSendMsgFailNotification", "finish resend, msgList.size:%d, mFailList.size:%d, mSuccessList.size:%d", new Object[] { Integer.valueOf(this.nyj.nyu.size()), Integer.valueOf(this.nyn.size()), Integer.valueOf(this.nym.size()) });
    w.d("MicroMsg.AbstractSendMsgFailNotification", "checkMsgExistAfterResend, before check, mMsgList.size:%d, mSuccessList.size:%d, mFailList.size:%d", new Object[] { Integer.valueOf(this.nyj.nyu.size()), Integer.valueOf(this.nym.size()), Integer.valueOf(this.nyn.size()) });
    aUA();
    Object localObject1 = new ArrayList();
    Object localObject2 = this.nym.iterator();
    Long localLong;
    while (((Iterator)localObject2).hasNext())
    {
      localLong = (Long)((Iterator)localObject2).next();
      if (!cZ(localLong.longValue())) {
        ((ArrayList)localObject1).add(localLong);
      }
    }
    localObject2 = ((ArrayList)localObject1).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localLong = (Long)((Iterator)localObject2).next();
      this.nym.remove(localLong);
    }
    ((ArrayList)localObject1).clear();
    localObject2 = this.nyn.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localLong = (Long)((Iterator)localObject2).next();
      if (!cZ(localLong.longValue())) {
        ((ArrayList)localObject1).add(localLong);
      }
    }
    localObject1 = ((ArrayList)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Long)((Iterator)localObject1).next();
      this.nyn.remove(localObject2);
    }
    w.d("MicroMsg.AbstractSendMsgFailNotification", "checkMsgExistAfterResend, after check, mMsgList.size:%d, mSuccessList.size:%d, mFailList.size:%d", new Object[] { Integer.valueOf(this.nyj.nyu.size()), Integer.valueOf(this.nym.size()), Integer.valueOf(this.nyn.size()) });
    if ((this.nyn.size() <= 0) || (Build.VERSION.SDK_INT < 16)) {
      com.tencent.mm.plugin.notification.d.a.sc(getType());
    }
    g.ork.i(11425, new Object[] { Integer.valueOf(getType()), Integer.valueOf(0), Integer.valueOf(this.nym.size()), Integer.valueOf(this.nyn.size()) });
    if (Build.VERSION.SDK_INT >= 16)
    {
      this.nyk.aUX();
      this.nyk.nzh = sa(this.nyj.nyu.size());
      localObject1 = this.nyk;
      this.nyj.nyu.size();
      ((FailSendMsgNotification)localObject1).Ed(cE(this.nym.size(), this.nyn.size()));
      this.nyk.aUW();
      if (this.nyn.size() > 0)
      {
        this.nyk.aUY();
        this.nyk.show();
        aUF();
        aUH();
      }
    }
    localObject1 = new jz();
    ((jz)localObject1).eOn.type = getType();
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
    if (this.nyq != null) {
      this.nyq.stopTimer();
    }
    for (;;)
    {
      aUB();
      com.tencent.mm.sdk.b.a.vgX.c(this.nyr);
      aUx();
      GMTrace.o(10743458037760L, 80045);
      return;
      w.e("MicroMsg.AbstractSendMsgFailNotification", "stopCheckMsgExistTimer error, timer is null");
    }
  }
  
  public void aUx()
  {
    GMTrace.i(10743592255488L, 80046);
    GMTrace.o(10743592255488L, 80046);
  }
  
  public final void aUy()
  {
    GMTrace.i(10743726473216L, 80047);
    w.d("MicroMsg.AbstractSendMsgFailNotification", "resendAllMsg, mMsgList.size:%d", new Object[] { Integer.valueOf(this.nyj.nyu.size()) });
    this.nyl = true;
    if (Build.VERSION.SDK_INT >= 16)
    {
      FailSendMsgNotification localFailSendMsgNotification = this.nyk;
      localFailSendMsgNotification.nzo = false;
      localFailSendMsgNotification.nza = new y.d(localFailSendMsgNotification.mContext);
      localFailSendMsgNotification.aUV();
      localFailSendMsgNotification.show();
      w.d("MicroMsg.FailSendMsgNotification", "FailSendMsgNotification, removeActionButton");
      localFailSendMsgNotification = this.nyk;
      localFailSendMsgNotification.nza.b(2, true);
      localFailSendMsgNotification.nzn = true;
      localFailSendMsgNotification.show();
      w.d("MicroMsg.FailSendMsgNotification", "FailSendMsgNotification, setLockInNotificationBar");
      this.nyk.Ed(cD(this.nyj.nyu.size(), 0));
    }
    this.nyj.currentIndex = 0;
    aUB();
    com.tencent.mm.sdk.b.a.vgX.c(this.nyr);
    com.tencent.mm.sdk.b.a.vgX.b(this.nyr);
    cW(this.nyj.aUM());
    if (this.nyq != null)
    {
      this.nyq.z(300000L, 300000L);
      GMTrace.o(10743726473216L, 80047);
      return;
    }
    w.e("MicroMsg.AbstractSendMsgFailNotification", "startCheckMsgExistTimer error, timer is null");
    GMTrace.o(10743726473216L, 80047);
  }
  
  public final void aUz()
  {
    GMTrace.i(16058748502016L, 119647);
    w.d("MicroMsg.AbstractSendMsgFailNotification", "checkMsgExistBeforeResend, mMsgList.size:%d", new Object[] { Integer.valueOf(this.nyj.nyu.size()) });
    aUA();
    if (Build.VERSION.SDK_INT >= 16) {
      this.nyk.Ed(sa(this.nyj.nyu.size()));
    }
    w.d("MicroMsg.AbstractSendMsgFailNotification", "checkMsgExistBeforeResend, after check, mMsgList.size:%d", new Object[] { Integer.valueOf(this.nyj.nyu.size()) });
    GMTrace.o(16058748502016L, 119647);
  }
  
  public final void bi(T paramT)
  {
    GMTrace.i(10742921166848L, 80041);
    if (paramT == null)
    {
      GMTrace.o(10742921166848L, 80041);
      return;
    }
    w.d("MicroMsg.AbstractSendMsgFailNotification", "processSendMsgFail, msgId:%d, msgList:%s, isResending:%b", new Object[] { Long.valueOf(bk(paramT)), aUD(), Boolean.valueOf(this.nyl) });
    if (!this.nyl)
    {
      if (!this.nyo.contains(Long.valueOf(bk(paramT))))
      {
        if (paramT == null)
        {
          w.e("MicroMsg.AbstractSendMsgFailNotification", "showNotificationAfterSendFail, msgObj is null");
          GMTrace.o(10742921166848L, 80041);
          return;
        }
        paramT = bl(paramT);
        if ((paramT == null) || (paramT.size() <= 0))
        {
          w.e("MicroMsg.AbstractSendMsgFailNotification", "showNotificationAfterSendFail, cannot get history fail msg");
          GMTrace.o(10742921166848L, 80041);
          return;
        }
        aIL();
        b localb = this.nyj;
        if ((paramT != null) && (paramT.size() > 0)) {
          localb.nyu.addAll(paramT);
        }
        aUH();
        w.d("MicroMsg.AbstractSendMsgFailNotification", "showNotificationAfterSendFail, msgList.size:%d, msgList:%s", new Object[] { Integer.valueOf(this.nyj.nyu.size()), aUD() });
        g.ork.i(11426, new Object[] { Integer.valueOf(getType()) });
        af.i(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(10747887222784L, 80078);
            a.this.aUu();
            GMTrace.o(10747887222784L, 80078);
          }
        }, 1000L);
        GMTrace.o(10742921166848L, 80041);
        return;
      }
      this.nyo.remove(Long.valueOf(bk(paramT)));
      GMTrace.o(10742921166848L, 80041);
      return;
    }
    if ((this.nyj.db(bk(paramT))) && (!this.nyn.contains(Long.valueOf(bk(paramT))))) {
      this.nyn.add(Long.valueOf(bk(paramT)));
    }
    if (!this.nyj.db(bk(paramT)))
    {
      w.d("MicroMsg.AbstractSendMsgFailNotification", "sending msg, another fail msg");
      this.nyj.da(bk(paramT));
    }
    aUv();
    w.d("MicroMsg.AbstractSendMsgFailNotification", "processSendMsgFail, successlist.size:%d, faillist.size:%d", new Object[] { Integer.valueOf(this.nym.size()), Integer.valueOf(this.nyn.size()) });
    if (this.nym.size() + this.nyn.size() < this.nyj.nyu.size())
    {
      long l = this.nyj.aUM();
      if (l == -1L)
      {
        w.e("TAG", "resend error, next msg id is -1");
        GMTrace.o(10742921166848L, 80041);
        return;
      }
      w.d("MicroMsg.AbstractSendMsgFailNotification", "continue resend, nextId:%d", new Object[] { Long.valueOf(l) });
      aUH();
      cW(l);
      GMTrace.o(10742921166848L, 80041);
      return;
    }
    aUw();
    GMTrace.o(10742921166848L, 80041);
  }
  
  public final void bj(T paramT)
  {
    GMTrace.i(10743189602304L, 80043);
    w.d("MicroMsg.AbstractSendMsgFailNotification", "processSendMsgSucess, msgId:%d, msgList:%s", new Object[] { Long.valueOf(bk(paramT)), aUD() });
    if (this.nyj.db(bk(paramT)))
    {
      long l = bk(paramT);
      if ((this.nyo.contains(Long.valueOf(l))) && (this.nyn.contains(Long.valueOf(l))))
      {
        w.i("MicroMsg.AbstractSendMsgFailNotification", "receive send msg success event from a timout message, remvoe it from the fail list");
        this.nyo.remove(Long.valueOf(l));
        this.nyn.remove(Long.valueOf(l));
      }
      if (this.nyl)
      {
        this.nym.add(Long.valueOf(l));
        aUv();
        w.d("MicroMsg.AbstractSendMsgFailNotification", "processSendMsgSuccess, successlist.size:%d, faillist.size:%d", new Object[] { Integer.valueOf(this.nym.size()), Integer.valueOf(this.nyn.size()) });
        if (this.nym.size() + this.nyn.size() < this.nyj.nyu.size())
        {
          l = this.nyj.aUM();
          if (l == -1L)
          {
            w.e("TAG", "resend error, next msg id is -1");
            GMTrace.o(10743189602304L, 80043);
            return;
          }
          w.d("MicroMsg.AbstractSendMsgFailNotification", "continue resend, nextId:%d", new Object[] { Long.valueOf(l) });
          aUH();
          cW(l);
          GMTrace.o(10743189602304L, 80043);
          return;
        }
        aUw();
        GMTrace.o(10743189602304L, 80043);
        return;
      }
      this.nyj.remove(bk(paramT));
      if (this.nyj.nyu.size() == 0)
      {
        this.nyk.dismiss();
        aIL();
        com.tencent.mm.plugin.notification.d.a.sc(getType());
        GMTrace.o(10743189602304L, 80043);
        return;
      }
      w.d("MicroMsg.AbstractSendMsgFailNotification", "maybe the user manually resend the message, update init wording");
      this.nyk.Ed(sa(this.nyj.nyu.size()));
    }
    GMTrace.o(10743189602304L, 80043);
  }
  
  public abstract long bk(T paramT);
  
  public abstract ArrayList<Long> bl(T paramT);
  
  public abstract String cD(int paramInt1, int paramInt2);
  
  public abstract String cE(int paramInt1, int paramInt2);
  
  public final void cW(final long paramLong)
  {
    GMTrace.i(10743994908672L, 80049);
    af.i(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10748155658240L, 80080);
        a.this.cX(paramLong);
        GMTrace.o(10748155658240L, 80080);
      }
    }, 200L);
    GMTrace.o(10743994908672L, 80049);
  }
  
  public final void cX(final long paramLong)
  {
    GMTrace.i(16058882719744L, 119648);
    while (!cZ(paramLong))
    {
      this.nyn.add(Long.valueOf(paramLong));
      w.d("MicroMsg.AbstractSendMsgFailNotification", "tryResendNextMsg, msg:%d not exist", new Object[] { Long.valueOf(paramLong) });
      aUv();
      long l = this.nyj.aUM();
      paramLong = l;
      if (l == -1L)
      {
        w.e("MicroMsg.AbstractSendMsgFailNotification", "tryResendNextMsg error, finalMsgId is -1, may be resend finish");
        if (this.nym.size() + this.nyn.size() >= this.nyj.nyu.size())
        {
          w.d("MicroMsg.AbstractSendMsgFailNotification", "tryResendNextMsg, resend finish");
          aUw();
        }
        GMTrace.o(16058882719744L, 119648);
        return;
      }
    }
    w.d("MicroMsg.AbstractSendMsgFailNotification", "tryResendNextMsg, finalMsgId:%d", new Object[] { Long.valueOf(paramLong) });
    cY(paramLong);
    aj localaj = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(10739163070464L, 80013);
        if ((!a.this.nym.contains(Long.valueOf(paramLong))) && (!a.this.nyn.contains(Long.valueOf(paramLong))) && (a.this.nyj.db(paramLong)))
        {
          w.i("MicroMsg.AbstractSendMsgFailNotification", "msg:%d send timeout, move this message to fail list, continue send next message", new Object[] { Long.valueOf(paramLong) });
          a.this.nyn.add(Long.valueOf(paramLong));
          a.this.nyo.add(Long.valueOf(paramLong));
          if (a.this.nym.size() + a.this.nyn.size() < a.this.nyj.nyu.size()) {
            break label176;
          }
          a.this.aUw();
        }
        for (;;)
        {
          GMTrace.o(10739163070464L, 80013);
          return true;
          label176:
          long l = a.this.nyj.aUM();
          a.this.cW(l);
        }
      }
    }, false);
    localaj.z(1800000L, 1800000L);
    this.nyp.add(localaj);
    GMTrace.o(16058882719744L, 119648);
  }
  
  public abstract void cY(long paramLong);
  
  public abstract boolean cZ(long paramLong);
  
  public abstract int getType();
  
  public abstract String sa(int paramInt);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\notification\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */