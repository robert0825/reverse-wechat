package com.tencent.mm.modelfriend;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.ContentObserver;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.if;
import com.tencent.mm.kernel.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.Random;

public final class AddrBookObserver
  extends ContentObserver
{
  private static boolean gBW;
  private static Intent gBX;
  private static ae handler;
  private final Context context;
  
  static
  {
    GMTrace.i(4444217409536L, 33112);
    gBW = false;
    handler = new ae(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(4448915030016L, 33147);
        super.handleMessage(paramAnonymousMessage);
        paramAnonymousMessage = (Context)paramAnonymousMessage.obj;
        if (AddrBookObserver.GN() == null)
        {
          AddrBookObserver.n(new Intent());
          AddrBookObserver.GN().setClass(paramAnonymousMessage, AddrBookObserver.AddrBookService.class);
        }
        float f = new Random(System.currentTimeMillis()).nextFloat();
        AddrBookObserver.GN().putExtra(AddrBookObserver.AddrBookService.gBY, f);
        try
        {
          w.i("MicroMsg.AddrBookObserver", "time's up, start AddrBookObserver, session:%f", new Object[] { Float.valueOf(f) });
          paramAnonymousMessage.startService(AddrBookObserver.GN());
          GMTrace.o(4448915030016L, 33147);
          return;
        }
        catch (Exception paramAnonymousMessage)
        {
          w.printErrStackTrace("MicroMsg.AddrBookObserver", paramAnonymousMessage, "startService failed", new Object[0]);
          GMTrace.o(4448915030016L, 33147);
        }
      }
    };
    GMTrace.o(4444217409536L, 33112);
  }
  
  public AddrBookObserver(Context paramContext)
  {
    super(ae.fetchFreeHandler());
    GMTrace.i(4443680538624L, 33108);
    this.context = paramContext;
    GMTrace.o(4443680538624L, 33108);
  }
  
  public final void onChange(boolean paramBoolean)
  {
    GMTrace.i(4443814756352L, 33109);
    super.onChange(paramBoolean);
    w.i("MicroMsg.AddrBookObserver", "address book changed, start sync after 20 second");
    if (gBW)
    {
      w.e("MicroMsg.AddrBookObserver", "isSyncing:" + gBW + ", is time to sync:true , return");
      GMTrace.o(4443814756352L, 33109);
      return;
    }
    handler.removeMessages(0);
    Message localMessage = handler.obtainMessage();
    localMessage.obj = this.context;
    localMessage.what = 0;
    handler.sendMessageDelayed(localMessage, 20000L);
    GMTrace.o(4443814756352L, 33109);
  }
  
  public static class AddrBookService
    extends Service
  {
    public static boolean gBW;
    public static String gBY;
    public static boolean gtZ;
    private a.b gBZ;
    
    static
    {
      GMTrace.i(4445962240000L, 33125);
      gBY = "key_sync_session";
      gtZ = false;
      gBW = false;
      GMTrace.o(4445962240000L, 33125);
    }
    
    public AddrBookService()
    {
      GMTrace.i(4445559586816L, 33122);
      this.gBZ = new a.b()
      {
        public final void bu(boolean paramAnonymousBoolean)
        {
          GMTrace.i(4431064072192L, 33014);
          if (!paramAnonymousBoolean)
          {
            w.v("MicroMsg.AddrBookObserver", "onSyncEnd not sync succ, do not upload");
            AddrBookObserver.AddrBookService.this.stopSelf();
            AddrBookObserver.AddrBookService.gBW = false;
            GMTrace.o(4431064072192L, 33014);
            return;
          }
          System.currentTimeMillis();
          aa localaa = new aa(m.Hv(), m.Hu());
          at.wS().a(localaa, 0);
          AddrBookObserver.AddrBookService.this.stopSelf();
          AddrBookObserver.AddrBookService.gBW = false;
          GMTrace.o(4431064072192L, 33014);
        }
      };
      GMTrace.o(4445559586816L, 33122);
    }
    
    public IBinder onBind(Intent paramIntent)
    {
      GMTrace.i(4445828022272L, 33124);
      GMTrace.o(4445828022272L, 33124);
      return null;
    }
    
    public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
    {
      GMTrace.i(4445693804544L, 33123);
      super.onStartCommand(paramIntent, paramInt1, paramInt2);
      if (paramIntent == null) {}
      for (boolean bool = true;; bool = false)
      {
        w.i("MicroMsg.AddrBookObserver", "service start intent:%b", new Object[] { Boolean.valueOf(bool) });
        if (paramIntent != null) {
          break;
        }
        w.e("MicroMsg.AddrBookObserver", "intent == null, stop service");
        stopSelf();
        GMTrace.o(4445693804544L, 33123);
        return 2;
      }
      float f1 = paramIntent.getFloatExtra(gBY, -1.0F);
      if (f1 == -1.0F)
      {
        w.e("MicroMsg.AddrBookObserver", "onStartCommand session == -1, stop service");
        stopSelf();
        GMTrace.o(4445693804544L, 33123);
        return 2;
      }
      paramIntent = ab.getContext().getSharedPreferences(ab.bPU(), 0);
      float f2 = paramIntent.getFloat(gBY, 0.0F);
      if (f2 == f1)
      {
        w.d("MicroMsg.AddrBookObserver", "onStartCommand session the same : %f", new Object[] { Float.valueOf(f2) });
        stopSelf();
        GMTrace.o(4445693804544L, 33123);
        return 2;
      }
      paramIntent.edit().putFloat(gBY, f1).commit();
      w.d("MicroMsg.AddrBookObserver", "onStartCommand new session:%f", new Object[] { Float.valueOf(f1) });
      if (gtZ)
      {
        w.i("MicroMsg.AddrBookObserver", "service canceled");
        gtZ = false;
        stopSelf();
        GMTrace.o(4445693804544L, 33123);
        return 2;
      }
      if (at.AJ())
      {
        w.e("MicroMsg.AddrBookObserver", "[onStartCommand] getCode is null, stop service");
        stopSelf();
        GMTrace.o(4445693804544L, 33123);
        return 2;
      }
      h.xw().initialize();
      for (;;)
      {
        try
        {
          if (!at.AU())
          {
            w.i("MicroMsg.AddrBookObserver", "account not ready, stop sync");
            stopSelf();
            GMTrace.o(4445693804544L, 33123);
            return 2;
          }
          if (com.tencent.mm.plugin.ipcall.d.aHT())
          {
            paramIntent = new if();
            com.tencent.mm.sdk.b.a.vgX.m(paramIntent);
          }
          if ((!m.Hr()) || (m.Hn())) {
            continue;
          }
          w.i("MicroMsg.AddrBookObserver", "start sync");
          if (com.tencent.mm.modelsimple.d.bo(this)) {
            continue;
          }
          gBW = true;
          a.a(this.gBZ);
        }
        catch (Exception paramIntent)
        {
          w.printErrStackTrace("MicroMsg.AddrBookObserver", paramIntent, "", new Object[0]);
          w.e("MicroMsg.AddrBookObserver", "AddrBookService onStart [%s]", new Object[] { paramIntent.getMessage() });
          stopSelf();
          continue;
        }
        GMTrace.o(4445693804544L, 33123);
        return 2;
        w.e("MicroMsg.AddrBookObserver", "requestSync false, stop service");
        stopSelf();
        GMTrace.o(4445693804544L, 33123);
        return 2;
        w.e("MicroMsg.AddrBookObserver", "can not sync addr book now, stop service");
        stopSelf();
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\modelfriend\AddrBookObserver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */