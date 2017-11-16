package com.tencent.mm.booter;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Looper;
import android.os.Process;
import com.jg.JgMethodChecked;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.Mars;
import com.tencent.mars.comm.Alarm;
import com.tencent.mars.comm.PlatformComm;
import com.tencent.mars.comm.PlatformComm.IResetProcess;
import com.tencent.mars.comm.WakerLock;
import com.tencent.mars.magicbox.IPxxLogic;
import com.tencent.mars.stn.StnLogic;
import com.tencent.mm.g.a.nd;
import com.tencent.mm.kernel.k;
import com.tencent.mm.network.aa;
import com.tencent.mm.network.aa.a;
import com.tencent.mm.network.ac;
import com.tencent.mm.network.af;
import com.tencent.mm.network.m;
import com.tencent.mm.network.p;
import com.tencent.mm.network.t;
import com.tencent.mm.network.t.12;
import com.tencent.mm.network.y;
import com.tencent.mm.plugin.zero.PluginZero;
import com.tencent.mm.plugin.zero.PluginZero.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bb;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.z.b;

public class CoreService
  extends Service
  implements PlatformComm.IResetProcess, aa.a, m
{
  private t fIC;
  private e fID;
  private boolean fIE;
  private final z.b fIF;
  private int fIG;
  private long fIH;
  private long fII;
  private long fIJ;
  private WakerLock fIK;
  private com.tencent.mm.platformtools.f fIL;
  private aj fIM;
  
  public CoreService()
  {
    GMTrace.i(13464856690688L, 100321);
    this.fID = new e();
    this.fIE = true;
    this.fIF = new z.b()
    {
      public final void cancel()
      {
        GMTrace.i(13462977642496L, 100307);
        MMReceivers.AlarmReceiver.ax(CoreService.this.getApplicationContext());
        GMTrace.o(13462977642496L, 100307);
      }
      
      public final void prepare()
      {
        GMTrace.i(13462843424768L, 100306);
        MMReceivers.AlarmReceiver.aw(CoreService.this.getApplicationContext());
        GMTrace.o(13462843424768L, 100306);
      }
    };
    this.fIG = -1;
    this.fIH = 0L;
    this.fII = 0L;
    this.fIJ = 0L;
    this.fIK = null;
    this.fIL = new com.tencent.mm.platformtools.f();
    this.fIM = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(13468346351616L, 100347);
        com.tencent.mm.platformtools.f localf = CoreService.a(CoreService.this);
        int i;
        if (bg.aI(localf.hiP) < localf.hiN)
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.FrequncyLimiter", "frequency limited, last=" + localf.hiP + ", cur=" + bg.Pw() + ", retries=" + localf.hiQ);
          if (localf.hiQ <= 0)
          {
            i = 0;
            if (i != 0) {
              break label255;
            }
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.CoreService", "setNetworkAvailable checker frequency limited");
          }
        }
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CoreService", "setNetworkAvailable finish lockCount:%d delayCount:%d delayDur:%d", new Object[] { Long.valueOf(CoreService.c(CoreService.this)), Long.valueOf(CoreService.d(CoreService.this)), Long.valueOf(bg.Pv() - CoreService.e(CoreService.this)) });
          CoreService.f(CoreService.this);
          CoreService.g(CoreService.this);
          CoreService.h(CoreService.this);
          new aj(new aj.a()
          {
            public final boolean pM()
            {
              GMTrace.i(13467809480704L, 100343);
              CoreService.i(CoreService.this).unLock();
              GMTrace.o(13467809480704L, 100343);
              return false;
            }
          }, false).z(500L, 500L);
          GMTrace.o(13468346351616L, 100347);
          return true;
          for (localf.hiQ -= 1;; localf.hiQ = localf.hiO)
          {
            localf.hiP = bg.Pw();
            i = 1;
            break;
          }
          label255:
          boolean bool1 = bg.bq(CoreService.b(CoreService.this).hgw.wR());
          boolean bool2 = aa.OY().OI();
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CoreService", "setNetworkAvailable  deal with Sync Check isSessionKeyNull:%b, isMMProcessExist:%b", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
          if ((!bool1) && (!bool2) && (f.a(1, 0, null, CoreService.b(CoreService.this).hgw.wR(), bg.Pv())))
          {
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CoreService", "setNetworkAvailable deal with notify sync in push");
            GMTrace.o(13468346351616L, 100347);
            return true;
          }
          CoreService.rj();
        }
      }
    }, false);
    GMTrace.o(13464856690688L, 100321);
  }
  
  public static void rj()
  {
    GMTrace.i(13466064650240L, 100330);
    Intent localIntent = new Intent(aa.getContext(), NotifyReceiver.class);
    localIntent.putExtra("notify_option_type", 1);
    localIntent.putExtra("notify_uin", aa.OY().hgw.ww());
    try
    {
      aa.getContext().sendBroadcast(localIntent);
      GMTrace.o(13466064650240L, 100330);
      return;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.w.f("MicroMsg.CoreService", "checker frequency limited hasDestroyed %s", new Object[] { localException.toString() });
      GMTrace.o(13466064650240L, 100330);
    }
  }
  
  private void rk()
  {
    GMTrace.i(13466198867968L, 100331);
    com.tencent.mm.sdk.platformtools.w.w("MicroMsg.CoreService", "[COMPLETE EXIT]");
    aa.OZ().e(3, 10000, "");
    Mars.onDestroy();
    try
    {
      MMReceivers.AlarmReceiver.az(getApplicationContext());
      MMReceivers.AlarmReceiver.ax(getApplicationContext());
      Alarm.resetAlarm(getApplicationContext());
      com.tencent.mm.sdk.platformtools.w.appenderClose();
      Process.killProcess(Process.myPid());
      GMTrace.o(13466198867968L, 100331);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.CoreService", localException, "", new Object[0]);
      }
    }
  }
  
  public final void aD(boolean paramBoolean)
  {
    GMTrace.i(13465930432512L, 100329);
    if (!paramBoolean)
    {
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.CoreService", "[NETWORK LOST]");
      aa.OU().hhL = false;
      aa.OV().hy(0);
      if (this.fIE)
      {
        aa.OY().OA();
        e locale = this.fID;
        locale.fIV = null;
        locale.fIW = null;
      }
      this.fIE = false;
      GMTrace.o(13465930432512L, 100329);
      return;
    }
    com.tencent.mm.sdk.platformtools.w.w("MicroMsg.CoreService", "[NETWORK CONNECTED]");
    aa.OU().hhL = true;
    paramBoolean = this.fID.rl();
    if ((this.fIE) && (!paramBoolean))
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CoreService", "network not change or can't get network info, lastStatus connect:%b", new Object[] { Boolean.valueOf(this.fIE) });
      GMTrace.o(13465930432512L, 100329);
      return;
    }
    if (paramBoolean) {
      aa.OY().OA();
    }
    this.fIE = true;
    aa.OV().hy(6);
    if (this.fIK == null) {
      this.fIK = new WakerLock(getApplicationContext());
    }
    if (!this.fIK.isLocking())
    {
      this.fIK.lock(6000L, "CoreService.setNetworkAvailable");
      this.fIH += 1L;
    }
    if (0L == this.fIJ) {
      this.fII = bg.Pv();
    }
    this.fIJ += 1L;
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CoreService", "setNetworkAvailable start lockCount:%d delayCount:%d delayDur:%d", new Object[] { Long.valueOf(this.fIH), Long.valueOf(this.fIJ), Long.valueOf(bg.Pv() - this.fII) });
    this.fIM.z(3000L, 3000L);
    GMTrace.o(13465930432512L, 100329);
  }
  
  public final boolean d(int paramInt, byte[] paramArrayOfByte)
  {
    GMTrace.i(13465796214784L, 100328);
    if (k.aS(this))
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CoreService", "fully exited, no need to notify worker");
      GMTrace.o(13465796214784L, 100328);
      return false;
    }
    if (paramInt == 65281) {
      paramInt = 138;
    }
    for (;;)
    {
      boolean bool1 = aa.OR().getBoolean("is_in_notify_mode", false);
      boolean bool2 = bg.bq(this.fIC.hgw.wR());
      boolean bool3 = aa.OY().OI();
      if ((bool1) && (!bool2) && (!bool3) && (f.a(2, paramInt, paramArrayOfByte, this.fIC.hgw.wR(), bg.Pv())))
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CoreService", "deal with notify sync in push");
        GMTrace.o(13465796214784L, 100328);
        return true;
      }
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CoreService", "deal with notify sync to mm by broast, isSessionKeyNull:%b, isMMProcessExist:%b, isInNotifyMode:%b", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(bool1) });
      Intent localIntent = new Intent(this, NotifyReceiver.class);
      localIntent.putExtra("notify_option_type", 2);
      localIntent.putExtra("notify_uin", this.fIC.hgw.ww());
      localIntent.putExtra("notify_respType", paramInt);
      localIntent.putExtra("notify_respBuf", paramArrayOfByte);
      localIntent.putExtra("notfiy_recv_time", bg.Pv());
      localIntent.putExtra("notify_skey", this.fIC.hgw.wR());
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CoreService", "notify broadcast:" + localIntent.getAction() + ", type=" + paramInt);
      try
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CoreService", "notify broadcast: dknot recvTime:%d uin:%d type:%d buf:%d", new Object[] { Long.valueOf(localIntent.getLongExtra("notfiy_recv_time", 0L)), Integer.valueOf(localIntent.getIntExtra("notify_uin", 0)), Integer.valueOf(localIntent.getIntExtra("notify_respType", 0)), Integer.valueOf(bg.i(localIntent.getByteArrayExtra("notify_respBuf"), new byte[0]).length) });
        sendBroadcast(localIntent);
        com.tencent.mm.ai.a.fW(paramInt);
        GMTrace.o(13465796214784L, 100328);
        return true;
      }
      catch (Throwable paramArrayOfByte)
      {
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.CoreService", "dknot sendBroadcast  failed:%s", new Object[] { bg.f(paramArrayOfByte) });
        }
      }
    }
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    GMTrace.i(13465527779328L, 100326);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.CoreService", "onBind~~~ threadID:" + Thread.currentThread());
    paramIntent = this.fIC;
    GMTrace.o(13465527779328L, 100326);
    return paramIntent;
  }
  
  @JgMethodChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.RECEIVERCHECK})
  public void onCreate()
  {
    Object localObject4 = null;
    GMTrace.i(13464990908416L, 100322);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.CoreService", "onCreate~~~threadID:" + Thread.currentThread());
    super.onCreate();
    if ((Build.VERSION.SDK_INT < 24) && (!com.tencent.mm.compatible.util.h.tE()))
    {
      if (Build.VERSION.SDK_INT >= 18) {
        break label590;
      }
      startForeground(64323, new Notification());
    }
    for (;;)
    {
      Object localObject1 = new ae(Looper.getMainLooper());
      Mars.init(com.tencent.mm.sdk.platformtools.ab.getContext(), (ae)localObject1);
      StnLogic.setCallBack(new af());
      IPxxLogic.setCallBack(new p());
      com.tencent.mm.jni.a.a.wf();
      com.tencent.mm.sdk.b.a.vgX.b(new com.tencent.mm.sdk.b.c() {});
      aa.OS();
      com.tencent.mm.sdk.platformtools.z.a(this.fIF);
      if (PlatformComm.resetprocessimp == null) {
        PlatformComm.resetprocessimp = this;
      }
      aa.a((ae)localObject1);
      aa.setContext(getApplicationContext());
      aa.a(new com.tencent.mm.network.ab());
      aa.a(new ac());
      aa.a(this);
      aa.a(new com.tencent.mm.network.w());
      this.fIC = aa.OY();
      label239:
      label267:
      Object localObject3;
      String str1;
      Object localObject5;
      if (this.fIC == null)
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CoreService", "autoAuth is null and new one");
        this.fIC = new t(aa.OW());
        aa.b(this.fIC);
        Mars.onCreate(true);
        if (aa.OZ() != null) {
          break label668;
        }
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CoreService", "NetTaskAdapter is null and new one");
        aa.a(new com.tencent.mm.network.z());
        if (aa.Pa() == null)
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CoreService", "NetNotifyAdapter is null and new one");
          aa.a(new y());
          aa.Pa().hhs = this;
          if (aa.Pd())
          {
            aa.bN(false);
            aa.OW().post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(13469554311168L, 100356);
                com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CoreService", "NetNotifyAdapter NeedNotifyGCM after init");
                aa.Pa().onPush(2147480001, new byte[0]);
                GMTrace.o(13469554311168L, 100356);
              }
              
              public final String toString()
              {
                GMTrace.i(13469688528896L, 100357);
                GMTrace.o(13469688528896L, 100357);
                return "NotifyGCM";
              }
            });
          }
        }
        localObject1 = ((com.tencent.mm.kernel.b.f)com.tencent.mm.kernel.h.xv().wZ()).fJG;
        if (localObject1 != null)
        {
          localObject3 = ((c)localObject1).getString(".com.tencent.mm.debug.server.host.http");
          str1 = ((c)localObject1).getString(".com.tencent.mm.debug.server.ports.http");
          localObject5 = ((c)localObject1).getString(".com.tencent.mm.debug.server.host.socket");
          String str2 = ((c)localObject1).getString(".com.tencent.mm.debug.server.ports.socket");
          this.fIC.d((String)localObject3, str1, (String)localObject5, str2);
          localObject3 = ((c)localObject1).getString(".com.tencent.mm.debug.server.wallet.host");
          str1 = ((c)localObject1).getString(".com.tencent.mm.debug.server.wallet.ip");
          localObject5 = this.fIC;
          if ((!bg.nm((String)localObject3)) && (!bg.E(new String[0]))) {
            break label685;
          }
        }
        label429:
        if (localObject1 != null) {
          break label709;
        }
        localObject1 = null;
        label435:
        if ((localObject1 == null) || (!((String)localObject1).contains(":"))) {
          break label720;
        }
        localObject1 = ((String)localObject1).split(":");
        localObject3 = localObject1[0];
        localObject1 = localObject1[1];
        this.fIC.setNewDnsDebugHost((String)localObject3, (String)localObject1);
        MMReceivers.AlarmReceiver.az(getApplicationContext());
        MMReceivers.AlarmReceiver.ay(getApplicationContext());
        localObject1 = (ConnectivityManager)getSystemService("connectivity");
      }
      try
      {
        localObject1 = ((ConnectivityManager)localObject1).getActiveNetworkInfo();
        if ((localObject1 == null) || (((NetworkInfo)localObject1).getState() != NetworkInfo.State.CONNECTED)) {
          if (localObject1 == null)
          {
            localObject1 = "null";
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.CoreService", "networkInfo.state: %s", new Object[] { localObject1 });
            aa.OU().hhL = false;
            aa.OV().hy(0);
            ((PluginZero)com.tencent.mm.kernel.h.j(PluginZero.class)).tkp.a(this);
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CoreService", "CoreService OnCreate ");
            GMTrace.o(13464990908416L, 100322);
            return;
            label590:
            if (!getSharedPreferences("system_config_prefs", 4).getBoolean("set_service", false)) {
              continue;
            }
            startForeground(64323, new Notification());
            startService(new Intent(this, InnerService.class));
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CoreService", "set service for push.");
            continue;
            com.tencent.mm.sdk.platformtools.w.w("MicroMsg.CoreService", "autoAuth is not null and reset");
            this.fIC.reset();
            break label239;
            label668:
            com.tencent.mm.sdk.platformtools.w.w("MicroMsg.CoreService", "NetTaskAdapter is not null and reset");
            aa.OZ().reset();
            break label267;
            label685:
            new t.12((t)localObject5, (String)localObject3, str1).b(((t)localObject5).handler);
            break label429;
            label709:
            localObject1 = ((c)localObject1).getString(".com.tencent.mm.debug.server.host.newdns");
            break label435;
            label720:
            localObject3 = localObject1;
            localObject1 = null;
          }
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.CoreService", localException, "", new Object[0]);
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.CoreService", "getActiveNetworkInfo failed. %s", new Object[] { localException.getMessage() });
          Object localObject2 = localObject4;
          continue;
          localObject2 = ((NetworkInfo)localObject2).getState();
          continue;
          aa.OU().hhL = true;
          aa.OV().hy(6);
        }
      }
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(13465259343872L, 100324);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.CoreService", "onDestroy~~~ threadID:" + Thread.currentThread());
    ((PluginZero)com.tencent.mm.kernel.h.j(PluginZero.class)).tkp.b(this);
    com.tencent.mm.jni.a.a.wg();
    super.onDestroy();
    rk();
    GMTrace.o(13465259343872L, 100324);
  }
  
  public void onRebind(Intent paramIntent)
  {
    GMTrace.i(13465661997056L, 100327);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.CoreService", "onRebind~~~ threadID:" + Thread.currentThread());
    super.onRebind(paramIntent);
    GMTrace.o(13465661997056L, 100327);
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    GMTrace.i(13465125126144L, 100323);
    int i = Process.myPid();
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CoreService", "onStartCommand lastpid:%d  pid:%d flags:%d startId:%d", new Object[] { Integer.valueOf(this.fIG), Integer.valueOf(i), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (i != this.fIG)
    {
      this.fIG = i;
      com.tencent.mm.plugin.report.d.oqe.a(99L, 141L, 1L, false);
      if ((paramIntent != null) && ("auto".equals(paramIntent.getStringExtra("START_TYPE")))) {
        com.tencent.mm.plugin.report.d.oqe.a(99L, 140L, 1L, false);
      }
    }
    GMTrace.o(13465125126144L, 100323);
    return 1;
  }
  
  public boolean onUnbind(Intent paramIntent)
  {
    GMTrace.i(13465393561600L, 100325);
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.CoreService", "onUnbind~~~ threadID:" + Thread.currentThread());
    aa.OU().hhK = null;
    aa.Pc().hhl = null;
    boolean bool = super.onUnbind(paramIntent);
    GMTrace.o(13465393561600L, 100325);
    return bool;
  }
  
  public void restartProcess()
  {
    GMTrace.i(13466333085696L, 100332);
    com.tencent.mm.sdk.platformtools.w.w("MicroMsg.CoreService", "restartProcess");
    rk();
    GMTrace.o(13466333085696L, 100332);
  }
  
  public static class InnerService
    extends Service
  {
    public InnerService()
    {
      GMTrace.i(13464051384320L, 100315);
      GMTrace.o(13464051384320L, 100315);
    }
    
    public IBinder onBind(Intent paramIntent)
    {
      GMTrace.i(13464454037504L, 100318);
      GMTrace.o(13464454037504L, 100318);
      return null;
    }
    
    public void onCreate()
    {
      GMTrace.i(13464185602048L, 100316);
      super.onCreate();
      try
      {
        startForeground(64323, new Notification());
        stopSelf();
        GMTrace.o(13464185602048L, 100316);
        return;
      }
      catch (NullPointerException localNullPointerException)
      {
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.CoreService", "set service for push exception:%s.", new Object[] { localNullPointerException });
        }
      }
    }
    
    public void onDestroy()
    {
      GMTrace.i(13464319819776L, 100317);
      stopForeground(true);
      super.onDestroy();
      GMTrace.o(13464319819776L, 100317);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\booter\CoreService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */