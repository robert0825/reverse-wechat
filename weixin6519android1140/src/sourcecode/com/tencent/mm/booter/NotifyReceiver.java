package com.tencent.mm.booter;

import android.app.Notification;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import android.os.Process;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.comm.WakerLock;
import com.tencent.mm.g.a.lq;
import com.tencent.mm.kernel.i;
import com.tencent.mm.modelmulti.m;
import com.tencent.mm.modelmulti.r;
import com.tencent.mm.network.aa;
import com.tencent.mm.plugin.report.d;
import com.tencent.mm.plugin.zero.PluginZero;
import com.tencent.mm.plugin.zero.PluginZero.b;
import com.tencent.mm.protocal.aa.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class NotifyReceiver
  extends BroadcastReceiver
{
  private static WakerLock fIK;
  private static WakerLock fIX;
  private static Set<Long> fIY;
  private static Lock fIZ;
  private static byte[] fJa;
  private static byte[] fJb;
  private static a fJc;
  private static boolean fJd;
  
  static
  {
    GMTrace.i(13472775536640L, 100380);
    fIK = null;
    fIX = null;
    fIY = new HashSet();
    fIZ = new ReentrantLock(false);
    fJa = new byte[0];
    fJb = new byte[0];
    fJd = true;
    GMTrace.o(13472775536640L, 100380);
  }
  
  public NotifyReceiver()
  {
    GMTrace.i(13471030706176L, 100367);
    GMTrace.o(13471030706176L, 100367);
  }
  
  public static void rm()
  {
    GMTrace.i(13471164923904L, 100368);
    w.i("MicroMsg.NotifyReceiver", "markUIShow");
    fJd = false;
    aa.OR().edit().putBoolean("is_in_notify_mode", false).commit();
    GMTrace.o(13471164923904L, 100368);
  }
  
  public static void rn()
  {
    GMTrace.i(13471299141632L, 100369);
    com.tencent.mm.kernel.h.wS().b(138, fJc);
    com.tencent.mm.kernel.h.wS().b(39, fJc);
    com.tencent.mm.kernel.h.wS().b(268369922, fJc);
    if (fJc == null) {
      fJc = new a();
    }
    com.tencent.mm.kernel.h.wS().a(138, fJc);
    com.tencent.mm.kernel.h.wS().a(39, fJc);
    com.tencent.mm.kernel.h.wS().a(268369922, fJc);
    GMTrace.o(13471299141632L, 100369);
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    GMTrace.i(13471433359360L, 100370);
    w.i("MicroMsg.NotifyReceiver", "onReceive intent :%s", new Object[] { paramIntent });
    if (paramIntent == null)
    {
      GMTrace.o(13471433359360L, 100370);
      return;
    }
    if (com.tencent.mm.kernel.k.aS(paramContext))
    {
      w.i("MicroMsg.NotifyReceiver", "fully exited, no need to start service");
      GMTrace.o(13471433359360L, 100370);
      return;
    }
    com.tencent.mm.ai.a.fX(paramIntent.getIntExtra("notify_respType", -1));
    Intent localIntent = new Intent(paramContext, NotifyService.class);
    if (paramIntent.getBooleanExtra("intent_from_shoot_key", false)) {
      localIntent.putExtra("notify_option_type", 3);
    }
    localIntent.putExtras(paramIntent);
    paramContext.startService(localIntent);
    GMTrace.o(13471433359360L, 100370);
  }
  
  public static class NotifyService
    extends Service
  {
    Boolean fJg;
    private com.tencent.mm.kernel.api.h fJh;
    
    public NotifyService()
    {
      GMTrace.i(13469822746624L, 100358);
      this.fJg = null;
      GMTrace.o(13469822746624L, 100358);
    }
    
    public static void dn(String paramString)
    {
      GMTrace.i(13470628052992L, 100364);
      synchronized (NotifyReceiver.ro())
      {
        if (NotifyReceiver.rp() == null) {
          NotifyReceiver.a(new WakerLock(ab.getContext()));
        }
        NotifyReceiver.rp().lock(5000L, paramString);
        GMTrace.o(13470628052992L, 100364);
        return;
      }
    }
    
    private void k(Intent paramIntent)
    {
      GMTrace.i(13470359617536L, 100362);
      if (paramIntent == null)
      {
        w.e("MicroMsg.NotifyReceiver", "receiveImp receiveIntent == null");
        GMTrace.o(13470359617536L, 100362);
        return;
      }
      if (!com.tencent.mm.kernel.h.xz().fZy.fZU)
      {
        w.e("MicroMsg.NotifyReceiver", "summerboot WorkerProfile not has create, status %d", new Object[] { Integer.valueOf(0) });
        if (this.fJh != null) {
          com.tencent.mm.kernel.h.xz().b(this.fJh);
        }
        this.fJh = new com.tencent.mm.kernel.api.h()
        {
          public final void as(boolean paramAnonymousBoolean)
          {
            GMTrace.i(14896691412992L, 110989);
            GMTrace.o(14896691412992L, 110989);
          }
          
          public final void pe()
          {
            GMTrace.i(14896557195264L, 110988);
            com.tencent.mm.kernel.h.xz().b(this);
            NotifyReceiver.NotifyService.a(NotifyReceiver.NotifyService.this);
            long l = System.currentTimeMillis() - this.fJi;
            w.i("MicroMsg.NotifyReceiver", "summerboot startupDone[%b] take[%d]ms tid[%d] post last notify task", new Object[] { Boolean.valueOf(com.tencent.mm.kernel.h.xz().fZy.fZU), Long.valueOf(l), Long.valueOf(Thread.currentThread().getId()) });
            d.oqe.i(11098, new Object[] { Integer.valueOf(3600), Long.valueOf(l) });
            d.oqe.a(99L, 214L, 1L, false);
            af.i(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(14897362501632L, 110994);
                w.i("MicroMsg.NotifyReceiver", "summerboot startupDone do delay notify task");
                NotifyReceiver.NotifyService.a(NotifyReceiver.NotifyService.this, NotifyReceiver.NotifyService.1.this.fJj);
                d.oqe.a(99L, 215L, 1L, false);
                GMTrace.o(14897362501632L, 110994);
              }
            }, 500L);
            GMTrace.o(14896557195264L, 110988);
          }
        };
        com.tencent.mm.kernel.h.xz().a(this.fJh);
        d.oqe.a(99L, 213L, 1L, false);
      }
      for (int i = -1;; i = 0)
      {
        if (i < 0)
        {
          w.e("MicroMsg.NotifyReceiver", "summerboot status %s", new Object[] { Integer.valueOf(-1) });
          GMTrace.o(13470359617536L, 100362);
          return;
        }
        l(paramIntent);
        GMTrace.o(13470359617536L, 100362);
        return;
      }
    }
    
    private void l(Intent paramIntent)
    {
      GMTrace.i(14896825630720L, 110990);
      int i = paramIntent.getIntExtra("notify_option_type", 0);
      if (i == 0)
      {
        w.e("MicroMsg.NotifyReceiver", "receiveImp invalid opcode.");
        GMTrace.o(14896825630720L, 110990);
        return;
      }
      if (!com.tencent.mm.kernel.h.xw().wL()) {
        com.tencent.mm.kernel.h.xw().initialize();
      }
      if ((!com.tencent.mm.kernel.h.xw().wL()) || (com.tencent.mm.kernel.a.wF()))
      {
        w.e("MicroMsg.NotifyReceiver", "receiveImp hasSetuin:%b  isHold:%b  opcode:%d", new Object[] { Boolean.valueOf(com.tencent.mm.kernel.h.xw().wL()), Boolean.valueOf(com.tencent.mm.kernel.a.wF()), Integer.valueOf(i) });
        GMTrace.o(14896825630720L, 110990);
        return;
      }
      if (com.tencent.mm.kernel.h.wS().gus == null)
      {
        w.w("MicroMsg.NotifyReceiver", "receiveImp  opcode:%d  getDispatcher == null", new Object[] { Integer.valueOf(i) });
        com.tencent.mm.kernel.h.wS().bj(true);
      }
      if (this.fJg == null) {
        if (!com.tencent.mm.sdk.a.b.bPq()) {
          break label254;
        }
      }
      Object localObject;
      boolean bool;
      label254:
      int j;
      label454:
      byte[] arrayOfByte;
      long l;
      label963:
      label1110:
      label1115:
      label1911:
      label1996:
      label2001:
      label2179:
      for (;;)
      {
        localObject = this;
        bool = false;
        for (;;)
        {
          ((NotifyService)localObject).fJg = Boolean.valueOf(bool);
          w.i("MicroMsg.NotifyReceiver", "handleCommand useOld:%s operationCode:%d", new Object[] { this.fJg, Integer.valueOf(i) });
          switch (i)
          {
          default: 
            w.e("MicroMsg.NotifyReceiver", "invald opCode:" + i);
            GMTrace.o(14896825630720L, 110990);
            return;
            j = bg.getInt(((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.zero.b.a.class)).ut().getValue("AndroidOldNotifyReceiver"), 0);
            com.tencent.mm.kernel.h.xz();
            com.tencent.mm.kernel.h.xw();
            if (j <= com.tencent.mm.a.h.aw(com.tencent.mm.kernel.a.ww(), 100)) {
              break label2179;
            }
            bool = true;
            localObject = this;
          }
        }
        if (this.fJg.booleanValue()) {
          s(ab.getContext(), "NotifyReceiver.handleCommand:NOTIFY_OPCODE_NETWORK_AVAILABLE");
        }
        paramIntent = ab.getContext();
        w.i("MicroMsg.NotifyReceiver", "dealWithLooper");
        if ((!com.tencent.mm.kernel.h.xw().wL()) || (com.tencent.mm.kernel.a.wF()))
        {
          w.w("MicroMsg.NotifyReceiver", "receiveImp hasSetuin:" + com.tencent.mm.kernel.h.xw().wL() + " isHold:" + com.tencent.mm.kernel.a.wF());
          GMTrace.o(14896825630720L, 110990);
          return;
        }
        if (!com.tencent.mm.kernel.h.wS().foreground) {
          if ((paramIntent == null) || (am.isWap(paramIntent))) {
            break label454;
          }
        }
        for (i = 1; i == 0; i = 0)
        {
          ((com.tencent.mm.plugin.zero.b.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.zero.b.b.class)).JF().gE(2);
          GMTrace.o(14896825630720L, 110990);
          return;
        }
        com.tencent.mm.kernel.h.wS().a(new com.tencent.mm.modelmulti.k(), 0);
        GMTrace.o(14896825630720L, 110990);
        return;
        if (this.fJg.booleanValue())
        {
          s(ab.getContext(), "NotifyReceiver.handleCommand:NOTIFY_OPCODE_NOTIFY");
          j = paramIntent.getIntExtra("notify_respType", 0);
          localObject = paramIntent.getByteArrayExtra("notify_respBuf");
          arrayOfByte = paramIntent.getByteArrayExtra("notify_skey");
          l = paramIntent.getLongExtra("notfiy_recv_time", -1L);
          if (localObject == null) {}
          for (i = -1;; i = localObject.length)
          {
            w.i("MicroMsg.NotifyReceiver", "dealWithNotify respType:%d recvTime:%d respBuf:%d sessionkey:%s ", new Object[] { Integer.valueOf(j), Long.valueOf(l), Integer.valueOf(i), bg.SJ(bg.bs(arrayOfByte)) });
            switch (j)
            {
            default: 
              ((PluginZero)com.tencent.mm.kernel.h.j(PluginZero.class)).tko.a(this, j, (byte[])localObject, arrayOfByte, l);
              GMTrace.o(14896825630720L, 110990);
              return;
            }
          }
          if (bg.bq(arrayOfByte))
          {
            w.e("MicroMsg.NotifyReceiver", "dkpush dealWithNotify session:" + arrayOfByte);
            GMTrace.o(14896825630720L, 110990);
            return;
          }
          if ((bg.bq((byte[])localObject)) || (localObject.length <= 8))
          {
            w.e("MicroMsg.NotifyReceiver", "dkpush dealWithNotify respBuf error ");
            GMTrace.o(14896825630720L, 110990);
            return;
          }
          i = com.tencent.mm.a.n.c((byte[])localObject, 0);
          j = com.tencent.mm.a.n.c((byte[])localObject, 4);
          if (j != localObject.length - 8)
          {
            w.e("MicroMsg.NotifyReceiver", "dkpush: respBuf length error len:" + localObject.length);
            GMTrace.o(14896825630720L, 110990);
            return;
          }
          paramIntent = new byte[j];
          System.arraycopy(localObject, 8, paramIntent, 0, j);
          w.i("MicroMsg.NotifyReceiver", "dkpush PUSHDATA flag:%d bufLen:%d respBuf:%d recvTime:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(localObject.length), Long.valueOf(l) });
          try
          {
            NotifyReceiver.rs().lock();
            m.a(i, paramIntent, arrayOfByte, l);
            NotifyReceiver.rt().add(Long.valueOf(l));
            t(ab.getContext(), "NotifyReceiver.NotifyData");
            try
            {
              NotifyReceiver.rs().unlock();
              GMTrace.o(14896825630720L, 110990);
              return;
            }
            catch (Exception paramIntent)
            {
              GMTrace.o(14896825630720L, 110990);
              return;
            }
            try
            {
              NotifyReceiver.rs().unlock();
              throw paramIntent;
              if (localObject == null)
              {
                i = 7;
                if (localObject != null) {
                  break label1110;
                }
                j = 2;
                if (localObject != null) {
                  break label1115;
                }
              }
              for (int k = -1;; k = localObject.length)
              {
                w.d("MicroMsg.NotifyReceiver", "dkpush NOTIFY or SyncCheck selector:%d scnen:%d  respBuf:%d ", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) });
                try
                {
                  NotifyReceiver.rs().lock();
                  i = ((com.tencent.mm.plugin.zero.b.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.zero.b.b.class)).JF().a(i, j, "");
                  if (i > 0)
                  {
                    w.d("MicroMsg.NotifyReceiver", "add scene hash to memo, hash:%d", new Object[] { Integer.valueOf(i) });
                    NotifyReceiver.rt().add(Long.valueOf(i));
                    t(ab.getContext(), "NotifyReceiver.dealWithNotify:MMFunc_NewSync");
                  }
                  try
                  {
                    NotifyReceiver.rs().unlock();
                    GMTrace.o(14896825630720L, 110990);
                    return;
                  }
                  catch (Exception paramIntent)
                  {
                    GMTrace.o(14896825630720L, 110990);
                    return;
                  }
                  i = com.tencent.mm.a.n.c((byte[])localObject, 0);
                  break;
                }
                finally {}
                j = 1;
                break label963;
              }
              try
              {
                NotifyReceiver.rs().unlock();
                throw paramIntent;
                paramIntent = new StringBuilder("oreh on newsynccheck2 notify, notify=");
                if (localObject != null) {
                  bool = true;
                }
                for (;;)
                {
                  w.d("MicroMsg.NotifyReceiver", bool);
                  paramIntent = new aa.b();
                  try
                  {
                    paramIntent.y((byte[])localObject);
                    NotifyReceiver.rs().lock();
                    i = ((com.tencent.mm.plugin.zero.b.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.zero.b.b.class)).JF().a(paramIntent.tKZ, 1, paramIntent.bOn());
                    if (i > 0)
                    {
                      w.d("MicroMsg.NotifyReceiver", "add scene hash to memo, hash:%d", new Object[] { Integer.valueOf(i) });
                      NotifyReceiver.rt().add(Long.valueOf(i));
                      t(ab.getContext(), "NotifyReceiver.dealWithNotify:MM_PKT_NEW_SYNC_CHECK2_RESP");
                    }
                    try
                    {
                      NotifyReceiver.rs().unlock();
                      GMTrace.o(14896825630720L, 110990);
                      return;
                    }
                    catch (Exception paramIntent)
                    {
                      GMTrace.o(14896825630720L, 110990);
                      return;
                    }
                    bool = false;
                  }
                  catch (Exception paramIntent)
                  {
                    paramIntent = paramIntent;
                    w.printErrStackTrace("MicroMsg.NotifyReceiver", paramIntent, "", new Object[0]);
                    try
                    {
                      NotifyReceiver.rs().unlock();
                      GMTrace.o(14896825630720L, 110990);
                      return;
                    }
                    catch (Exception paramIntent)
                    {
                      GMTrace.o(14896825630720L, 110990);
                      return;
                    }
                  }
                  finally {}
                }
                try
                {
                  NotifyReceiver.rs().unlock();
                  throw paramIntent;
                  com.tencent.mm.kernel.h.wS().a(new com.tencent.mm.modelmulti.k(), 0);
                  GMTrace.o(14896825630720L, 110990);
                  return;
                  w.d("MicroMsg.NotifyReceiver", "dkpush GCM Notify");
                  i = ((com.tencent.mm.plugin.zero.b.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.zero.b.b.class)).JF().a(7L, 13, "");
                  try
                  {
                    NotifyReceiver.rs().lock();
                    if (i > 0)
                    {
                      w.d("MicroMsg.NotifyReceiver", "add scene hash to memo, hash:%d", new Object[] { Integer.valueOf(i) });
                      NotifyReceiver.rt().add(Long.valueOf(i));
                      t(ab.getContext(), "NotifyReceiver.dealWithNotify:MM_PKT_GCM_NOTIFY");
                    }
                    try
                    {
                      NotifyReceiver.rs().unlock();
                      GMTrace.o(14896825630720L, 110990);
                      return;
                    }
                    catch (Exception paramIntent)
                    {
                      GMTrace.o(14896825630720L, 110990);
                      return;
                    }
                    try
                    {
                      NotifyReceiver.rs().unlock();
                      throw paramIntent;
                      j = paramIntent.getIntExtra("notify_respType", 0);
                      localObject = paramIntent.getByteArrayExtra("notify_respBuf");
                      arrayOfByte = paramIntent.getByteArrayExtra("notify_skey");
                      l = paramIntent.getLongExtra("notfiy_recv_time", -1L);
                      if (localObject == null) {}
                      for (i = -1;; i = localObject.length)
                      {
                        w.i("MicroMsg.NotifyReceiver", "dealWithNotify respType:%d recvTime:%d respBuf:%d sessionkey:%s ", new Object[] { Integer.valueOf(j), Long.valueOf(l), Integer.valueOf(i), bg.SJ(bg.bs(arrayOfByte)) });
                        switch (j)
                        {
                        default: 
                          ((PluginZero)com.tencent.mm.kernel.h.j(PluginZero.class)).tko.a(this, j, (byte[])localObject, arrayOfByte, l);
                          GMTrace.o(14896825630720L, 110990);
                          return;
                        }
                      }
                      if (bg.bq(arrayOfByte))
                      {
                        w.e("MicroMsg.NotifyReceiver", "dkpush dealWithNotify session:" + arrayOfByte);
                        GMTrace.o(14896825630720L, 110990);
                        return;
                      }
                      if ((bg.bq((byte[])localObject)) || (localObject.length <= 8))
                      {
                        w.e("MicroMsg.NotifyReceiver", "dkpush dealWithNotify respBuf error ");
                        GMTrace.o(14896825630720L, 110990);
                        return;
                      }
                      i = com.tencent.mm.a.n.c((byte[])localObject, 0);
                      j = com.tencent.mm.a.n.c((byte[])localObject, 4);
                      if (j != localObject.length - 8)
                      {
                        w.e("MicroMsg.NotifyReceiver", "dkpush: respBuf length error len:" + localObject.length);
                        GMTrace.o(14896825630720L, 110990);
                        return;
                      }
                      paramIntent = new byte[j];
                      System.arraycopy(localObject, 8, paramIntent, 0, j);
                      w.i("MicroMsg.NotifyReceiver", "dkpush PUSHDATA flag:%d bufLen:%d respBuf:%d recvTime:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(localObject.length), Long.valueOf(l) });
                      m.a(i, paramIntent, arrayOfByte, l);
                      GMTrace.o(14896825630720L, 110990);
                      return;
                      if (localObject == null)
                      {
                        i = 7;
                        if (localObject != null) {
                          break label1996;
                        }
                        j = 2;
                        if (localObject != null) {
                          break label2001;
                        }
                      }
                      for (k = -1;; k = localObject.length)
                      {
                        w.i("MicroMsg.NotifyReceiver", "dkpush NOTIFY or SyncCheck selector:%d scnen:%d  respBuf:%d ", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) });
                        ((com.tencent.mm.plugin.zero.b.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.zero.b.b.class)).JF().a(i, j, "");
                        GMTrace.o(14896825630720L, 110990);
                        return;
                        i = com.tencent.mm.a.n.c((byte[])localObject, 0);
                        break;
                        j = 1;
                        break label1911;
                      }
                      w.i("MicroMsg.NotifyReceiver", "dkpush GCM Notify");
                      ((com.tencent.mm.plugin.zero.b.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.zero.b.b.class)).JF().a(7L, 13, "");
                      GMTrace.o(14896825630720L, 110990);
                      return;
                      paramIntent = new StringBuilder("oreh on newsynccheck2 notify, notify=");
                      if (localObject != null) {}
                      for (bool = true;; bool = false)
                      {
                        w.i("MicroMsg.NotifyReceiver", bool);
                        paramIntent = new aa.b();
                        ((com.tencent.mm.plugin.zero.b.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.zero.b.b.class)).JF().a(paramIntent.tKZ, 1, paramIntent.bOn());
                        GMTrace.o(14896825630720L, 110990);
                        return;
                      }
                      com.tencent.mm.kernel.h.wS().a(new com.tencent.mm.modelmulti.k(), 0);
                      GMTrace.o(14896825630720L, 110990);
                      return;
                    }
                    catch (Exception localException1)
                    {
                      for (;;) {}
                    }
                  }
                  finally {}
                }
                catch (Exception localException2)
                {
                  for (;;) {}
                }
              }
              catch (Exception localException3)
              {
                for (;;) {}
              }
            }
            catch (Exception localException4)
            {
              for (;;) {}
            }
          }
          finally {}
        }
      }
    }
    
    private static void s(Context paramContext, String paramString)
    {
      GMTrace.i(13470762270720L, 100365);
      synchronized (NotifyReceiver.ro())
      {
        if (NotifyReceiver.rp() == null) {
          NotifyReceiver.a(new WakerLock(paramContext));
        }
        NotifyReceiver.rp().lock(14000L, paramString);
        GMTrace.o(13470762270720L, 100365);
        return;
      }
    }
    
    private static void t(Context paramContext, String paramString)
    {
      GMTrace.i(13470896488448L, 100366);
      synchronized (NotifyReceiver.rq())
      {
        if (NotifyReceiver.rr() == null) {
          NotifyReceiver.b(new WakerLock(paramContext));
        }
        NotifyReceiver.rr().lock(60000L, paramString);
        GMTrace.o(13470896488448L, 100366);
        return;
      }
    }
    
    public IBinder onBind(Intent paramIntent)
    {
      GMTrace.i(13470225399808L, 100361);
      GMTrace.o(13470225399808L, 100361);
      return null;
    }
    
    public void onCreate()
    {
      GMTrace.i(13470493835264L, 100363);
      super.onCreate();
      if ((Build.VERSION.SDK_INT < 24) && (!com.tencent.mm.compatible.util.h.tE()))
      {
        if (Build.VERSION.SDK_INT >= 18) {
          break label94;
        }
        startForeground(64324, new Notification());
      }
      for (;;)
      {
        long l = ab.bPV().getLong("mm_stop_service_time", 86400000L);
        new ae().postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(14895751888896L, 110982);
            NotifyReceiver.NotifyService.this.stopForeground(true);
            GMTrace.o(14895751888896L, 110982);
          }
        }, l);
        GMTrace.o(13470493835264L, 100363);
        return;
        label94:
        if (getSharedPreferences("system_config_prefs", 4).getBoolean("set_service", false))
        {
          startForeground(64324, new Notification());
          startService(new Intent(this, InnerService.class));
          w.i("MicroMsg.NotifyReceiver", "set service for mm.");
        }
      }
    }
    
    public void onStart(Intent paramIntent, int paramInt)
    {
      GMTrace.i(13469956964352L, 100359);
      k(paramIntent);
      GMTrace.o(13469956964352L, 100359);
    }
    
    public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
    {
      GMTrace.i(13470091182080L, 100360);
      w.i("MicroMsg.NotifyReceiver", "NotifyService onStartCommand flags :" + paramInt1 + "startId :" + paramInt2 + " intent " + paramIntent);
      k(paramIntent);
      GMTrace.o(13470091182080L, 100360);
      return 2;
    }
    
    public static class InnerService
      extends Service
    {
      public InnerService()
      {
        GMTrace.i(13458548457472L, 100274);
        GMTrace.o(13458548457472L, 100274);
      }
      
      public IBinder onBind(Intent paramIntent)
      {
        GMTrace.i(13458951110656L, 100277);
        GMTrace.o(13458951110656L, 100277);
        return null;
      }
      
      public void onCreate()
      {
        GMTrace.i(13458682675200L, 100275);
        super.onCreate();
        try
        {
          startForeground(64324, new Notification());
          stopSelf();
          GMTrace.o(13458682675200L, 100275);
          return;
        }
        catch (NullPointerException localNullPointerException)
        {
          for (;;)
          {
            w.e("MicroMsg.NotifyReceiver", "set service for mm exception:%s", new Object[] { localNullPointerException });
          }
        }
      }
      
      public void onDestroy()
      {
        GMTrace.i(13458816892928L, 100276);
        stopForeground(true);
        super.onDestroy();
        GMTrace.o(13458816892928L, 100276);
      }
    }
  }
  
  public static final class a
    implements com.tencent.mm.ad.e
  {
    public static long fJe;
    
    static
    {
      GMTrace.i(13460427505664L, 100288);
      fJe = 0L;
      GMTrace.o(13460427505664L, 100288);
    }
    
    public a()
    {
      GMTrace.i(13459487981568L, 100281);
      GMTrace.o(13459487981568L, 100281);
    }
    
    public final void H(long paramLong)
    {
      GMTrace.i(13459756417024L, 100283);
      if (!aa.OR().getBoolean("is_in_notify_mode", false))
      {
        GMTrace.o(13459756417024L, 100283);
        return;
      }
      new ae(Looper.myLooper()).postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(13462574989312L, 100304);
          w.i("MicroMsg.NotifyReceiver", "checkKillProcess, canKillProcess :%b", new Object[] { Boolean.valueOf(NotifyReceiver.ru()) });
          synchronized (NotifyReceiver.ro())
          {
            if (NotifyReceiver.rp() != null) {
              NotifyReceiver.rp().unLock();
            }
            NotifyReceiver.a(null);
            if (NotifyReceiver.ru())
            {
              ??? = (PluginZero)com.tencent.mm.kernel.h.j(PluginZero.class);
              if (((PluginZero)???).tkn != null) {
                ((PluginZero)???).tkn.agT();
              }
              w.bPN();
              Process.killProcess(Process.myPid());
            }
            GMTrace.o(13462574989312L, 100304);
            return;
          }
        }
      }, paramLong);
      GMTrace.o(13459756417024L, 100283);
    }
    
    public final void a(int paramInt1, int paramInt2, String arg3, com.tencent.mm.ad.k paramk)
    {
      GMTrace.i(13459622199296L, 100282);
      long l = paramk.hashCode();
      if (paramk.getType() == 268369922) {
        l = ((com.tencent.mm.modelmulti.h)paramk).gMc;
      }
      for (;;)
      {
        try
        {
          NotifyReceiver.rs().lock();
        }
        finally
        {
          try
          {
            int i;
            boolean bool2;
            boolean bool1;
            NotifyReceiver.rs().unlock();
            try
            {
              NotifyReceiver.rs().lock();
              if (!NotifyReceiver.rt().isEmpty()) {
                continue;
              }
              synchronized (NotifyReceiver.rq())
              {
                if (NotifyReceiver.rr() == null) {
                  continue;
                }
                NotifyReceiver.rr().unLock();
                w.i("MicroMsg.NotifyReceiver", "all scene done, unlock wakelock.");
              }
            }
            finally
            {
              try
              {
                NotifyReceiver.rs().unlock();
                switch (paramk.getType())
                {
                default: 
                  H(7000L);
                  GMTrace.o(13459622199296L, 100282);
                  return;
                  bool1 = false;
                  continue;
                  paramk = finally;
                  throw paramk;
                  ??? = finally;
                }
              }
              catch (Exception ???)
              {
                try
                {
                  NotifyReceiver.rs().unlock();
                  throw ???;
                  paramk = finally;
                  throw paramk;
                  ??? = finally;
                  try
                  {
                    NotifyReceiver.rs().unlock();
                    throw ???;
                    w.i("MicroMsg.NotifyReceiver", "rest %d scene undone, keep wakelock.", new Object[] { Integer.valueOf(NotifyReceiver.rt().size()) });
                    continue;
                    if (!com.tencent.mm.kernel.h.xw().wL()) {
                      continue;
                    }
                    Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler()
                    {
                      public final boolean queueIdle()
                      {
                        GMTrace.i(13460964376576L, 100292);
                        NotifyReceiver.a locala = NotifyReceiver.a.this;
                        com.tencent.mm.kernel.h.xz();
                        com.tencent.mm.kernel.h.xB().A(new NotifyReceiver.a.3(locala));
                        GMTrace.o(13460964376576L, 100292);
                        return false;
                      }
                    });
                    if ((paramInt1 != 0) || (paramInt2 != 0) || (!com.tencent.mm.y.a.yB())) {
                      continue;
                    }
                    try
                    {
                      com.tencent.mm.kernel.h.xz();
                      ??? = com.tencent.mm.kernel.h.xw().fYa;
                      if (???.glM > -1L) {
                        ???.glM += 1L;
                      }
                      w.i("MicroMsg.AccInfoCacheInWorker", "countNormalCgi :%s ", new Object[] { Long.valueOf(???.glM) });
                      if ((???.glM != 2L) && (???.glM != 5L)) {
                        continue;
                      }
                      paramk = d.oqe;
                      if (???.glM != 2L) {
                        continue;
                      }
                      l = 37L;
                      paramk.a(226L, l, 1L, false);
                      d.oqe.i(11098, new Object[] { Integer.valueOf(2001), Long.valueOf(???.glM) });
                    }
                    catch (Throwable ???)
                    {
                      w.e("MicroMsg.AccInfoCacheInWorker", "tryBackupToWorker Exception:%s", new Object[] { bg.f(???) });
                    }
                    continue;
                    l = 38L;
                    continue;
                  }
                  catch (Exception paramk)
                  {
                    continue;
                  }
                  ??? = ???;
                }
                catch (Exception paramk)
                {
                  continue;
                }
              }
            }
          }
          catch (Exception ???)
          {
            continue;
          }
        }
        synchronized (NotifyReceiver.rq())
        {
          i = paramk.getType();
          bool2 = NotifyReceiver.rt().contains(Long.valueOf(l));
          if (NotifyReceiver.rr() != null)
          {
            bool1 = NotifyReceiver.rr().isLocking();
            w.i("MicroMsg.NotifyReceiver", "NotifyReceiver onSceneEnd type:%d syncHash: %d hashInMemo: %b isLocking: %b", new Object[] { Integer.valueOf(i), Long.valueOf(l), Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
            NotifyReceiver.rt().remove(Long.valueOf(l));
          }
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\booter\NotifyReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */