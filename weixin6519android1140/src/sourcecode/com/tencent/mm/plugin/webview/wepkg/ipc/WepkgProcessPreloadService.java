package com.tencent.mm.plugin.webview.wepkg.ipc;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.f;
import com.tencent.mm.plugin.webview.wepkg.model.BaseWepkgProcessTask;
import com.tencent.mm.plugin.webview.wepkg.model.WepkgCrossProcessTask;
import com.tencent.mm.plugin.webview.wepkg.model.a;
import com.tencent.mm.plugin.webview.wepkg.model.c;
import com.tencent.mm.plugin.webview.wepkg.model.g;
import com.tencent.mm.plugin.webview.wepkg.utils.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public class WepkgProcessPreloadService
  extends Service
{
  private static ServiceConnection hWB;
  private static Messenger hWy;
  private static Messenger kUS;
  private static final Handler mHandler;
  private static final LinkedList<Message> rXM;
  private static f<Integer, c> rXO;
  private static final Handler rXP;
  private static final Messenger rXQ;
  
  static
  {
    GMTrace.i(12395007180800L, 92350);
    rXO = new f(10);
    mHandler = new Handler(d.xB().ngv.getLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(12399302148096L, 92382);
        for (;;)
        {
          Messenger localMessenger;
          Message localMessage;
          try
          {
            localMessenger = paramAnonymousMessage.replyTo;
            localMessage = Message.obtain();
            localMessage.what = paramAnonymousMessage.what;
            paramAnonymousMessage = paramAnonymousMessage.getData();
            int i = paramAnonymousMessage.getInt("call_cmd_type");
            switch (i)
            {
            default: 
              GMTrace.o(12399302148096L, 92382);
              return;
            }
          }
          catch (Exception paramAnonymousMessage)
          {
            GMTrace.o(12399302148096L, 92382);
            return;
          }
          WepkgProcessPreloadService.a(paramAnonymousMessage.getString("call_raw_url"), localMessenger, localMessage);
          GMTrace.o(12399302148096L, 92382);
          return;
          WepkgProcessPreloadService.b(paramAnonymousMessage.getString("call_pkg_id"), localMessenger, localMessage);
        }
      }
    };
    rXP = new Handler(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(12401046978560L, 92395);
        int i = paramAnonymousMessage.what;
        c localc = (c)WepkgProcessPreloadService.bGk().remove(Integer.valueOf(i));
        if (localc != null)
        {
          localc.m(paramAnonymousMessage);
          GMTrace.o(12401046978560L, 92395);
          return;
        }
        w.e("MicroMsg.Wepkg.WepkgProcessPreloadService", "receive client msg, get null task by id %s", new Object[] { Integer.valueOf(i) });
        GMTrace.o(12401046978560L, 92395);
      }
    };
    rXQ = new Messenger(mHandler);
    rXM = new LinkedList();
    hWy = new Messenger(rXP);
    GMTrace.o(12395007180800L, 92350);
  }
  
  public WepkgProcessPreloadService()
  {
    GMTrace.i(12394201874432L, 92344);
    GMTrace.o(12394201874432L, 92344);
  }
  
  private static final void a(Messenger paramMessenger, Message paramMessage)
  {
    GMTrace.i(15193983680512L, 113204);
    if (paramMessenger != null) {}
    try
    {
      paramMessenger.send(paramMessage);
      GMTrace.o(15193983680512L, 113204);
      return;
    }
    catch (RemoteException paramMessenger)
    {
      w.e("MicroMsg.Wepkg.WepkgProcessPreloadService", "messenger callback err:%s", new Object[] { paramMessenger.getMessage() });
      GMTrace.o(15193983680512L, 113204);
    }
  }
  
  public static void a(c paramc, Bundle paramBundle)
  {
    try
    {
      GMTrace.i(15194117898240L, 113205);
      rXO.put(Integer.valueOf(paramc.hashCode()), paramc);
      Message localMessage = Message.obtain();
      localMessage.what = paramc.hashCode();
      localMessage.setData(paramBundle);
      l(localMessage);
      GMTrace.o(15194117898240L, 113205);
      return;
    }
    finally
    {
      paramc = finally;
      throw paramc;
    }
  }
  
  private static void l(Message paramMessage)
  {
    GMTrace.i(12394470309888L, 92346);
    paramMessage.replyTo = hWy;
    if (kUS == null)
    {
      if (hWB == null) {
        hWB = new ServiceConnection()
        {
          public final void onServiceConnected(ComponentName paramAnonymousComponentName, IBinder paramAnonymousIBinder)
          {
            GMTrace.i(12398899494912L, 92379);
            WepkgProcessPreloadService.a(new Messenger(paramAnonymousIBinder));
            WepkgProcessPreloadService.bGl();
            w.i("MicroMsg.Wepkg.WepkgProcessPreloadService", "onServiceConnected(%s)", new Object[] { ab.vM() });
            GMTrace.o(12398899494912L, 92379);
          }
          
          public final void onServiceDisconnected(ComponentName paramAnonymousComponentName)
          {
            GMTrace.i(12399033712640L, 92380);
            WepkgProcessPreloadService.a(null);
            w.i("MicroMsg.Wepkg.WepkgProcessPreloadService", "onServiceDisconnected(%s)", new Object[] { ab.vM() });
            GMTrace.o(12399033712640L, 92380);
          }
        };
      }
      w.i("MicroMsg.Wepkg.WepkgProcessPreloadService", "try bind WepkgProcessPreloadService");
      ??? = ab.getContext();
      ((Context)???).bindService(new Intent((Context)???, WepkgProcessPreloadService.class), hWB, 1);
      synchronized (rXM)
      {
        rXM.add(paramMessage);
        GMTrace.o(12394470309888L, 92346);
        return;
      }
    }
    try
    {
      kUS.send(paramMessage);
      GMTrace.o(12394470309888L, 92346);
      return;
    }
    catch (RemoteException paramMessage)
    {
      w.e("MicroMsg.Wepkg.WepkgProcessPreloadService", paramMessage.getMessage());
      GMTrace.o(12394470309888L, 92346);
    }
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    GMTrace.i(12394336092160L, 92345);
    paramIntent = rXQ.getBinder();
    GMTrace.o(12394336092160L, 92345);
    return paramIntent;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\wepkg\ipc\WepkgProcessPreloadService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */