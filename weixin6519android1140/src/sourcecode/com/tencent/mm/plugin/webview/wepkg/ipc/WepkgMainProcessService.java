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
import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.webview.wepkg.utils.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class WepkgMainProcessService
  extends Service
{
  private static ServiceConnection hWB;
  private static Map<Integer, WeakReference<WepkgMainProcessTask>> hWD;
  private static Handler hWE;
  private static Messenger hWF;
  private static a rXL;
  private static final LinkedList<Message> rXM;
  private final Messenger hWy;
  private final Handler mHandler;
  private final a.a rXK;
  
  static
  {
    GMTrace.i(12398631059456L, 92377);
    rXM = new LinkedList();
    hWD = new ConcurrentHashMap();
    hWE = new Handler(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(12395812487168L, 92356);
        int i = paramAnonymousMessage.what;
        paramAnonymousMessage = WepkgMainProcessService.af(paramAnonymousMessage.getData());
        WepkgMainProcessTask localWepkgMainProcessTask = WepkgMainProcessService.yt(i);
        if (localWepkgMainProcessTask == null)
        {
          w.e("MicroMsg.Wepkg.WepkgMainProcessService", "receive client msg, get null task by id %s", new Object[] { Integer.valueOf(i) });
          GMTrace.o(12395812487168L, 92356);
          return;
        }
        WepkgMainProcessService.b(paramAnonymousMessage, localWepkgMainProcessTask);
        localWepkgMainProcessTask.VK();
        GMTrace.o(12395812487168L, 92356);
      }
    };
    hWF = new Messenger(hWE);
    GMTrace.o(12398631059456L, 92377);
  }
  
  public WepkgMainProcessService()
  {
    GMTrace.i(12395946704896L, 92357);
    this.mHandler = new Handler(d.xB().ngv.getLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(12400241672192L, 92389);
        WepkgMainProcessTask localWepkgMainProcessTask = WepkgMainProcessService.af(paramAnonymousMessage.getData());
        Messenger localMessenger = paramAnonymousMessage.replyTo;
        int i = paramAnonymousMessage.what;
        localWepkgMainProcessTask.hXl = localMessenger;
        localWepkgMainProcessTask.mTaskId = i;
        localWepkgMainProcessTask.RY();
        GMTrace.o(12400241672192L, 92389);
      }
    };
    this.hWy = new Messenger(this.mHandler);
    this.rXK = new a.a()
    {
      public final void k(Message paramAnonymousMessage)
      {
        GMTrace.i(12393665003520L, 92340);
        WepkgMainProcessService.a(WepkgMainProcessService.this).send(paramAnonymousMessage);
        GMTrace.o(12393665003520L, 92340);
      }
      
      public final void v(Bundle paramAnonymousBundle)
      {
        GMTrace.i(12393799221248L, 92341);
        WepkgMainProcessService.af(paramAnonymousBundle).RY();
        GMTrace.o(12393799221248L, 92341);
      }
    };
    GMTrace.o(12395946704896L, 92357);
  }
  
  private static void Vz()
  {
    GMTrace.i(12396752011264L, 92363);
    if (hWB == null) {
      hWB = new ServiceConnection()
      {
        public final void onServiceConnected(ComponentName paramAnonymousComponentName, IBinder paramAnonymousIBinder)
        {
          GMTrace.i(12399570583552L, 92384);
          WepkgMainProcessService.a(a.a.Z(paramAnonymousIBinder));
          WepkgMainProcessService.aDL();
          w.i("MicroMsg.Wepkg.WepkgMainProcessService", "onServiceConnected(%s)", new Object[] { ab.vM() });
          GMTrace.o(12399570583552L, 92384);
        }
        
        public final void onServiceDisconnected(ComponentName paramAnonymousComponentName)
        {
          GMTrace.i(12399704801280L, 92385);
          WepkgMainProcessService.a(null);
          WepkgMainProcessService.aDM();
          w.i("MicroMsg.Wepkg.WepkgMainProcessService", "onServiceDisconnected(%s)", new Object[] { ab.vM() });
          GMTrace.o(12399704801280L, 92385);
        }
      };
    }
    w.i("MicroMsg.Wepkg.WepkgMainProcessService", "tryBindService");
    Context localContext = ab.getContext();
    localContext.bindService(new Intent(localContext, WepkgMainProcessService.class), hWB, 1);
    GMTrace.o(12396752011264L, 92363);
  }
  
  public static boolean Xi()
  {
    GMTrace.i(12396886228992L, 92364);
    if (rXL != null)
    {
      GMTrace.o(12396886228992L, 92364);
      return true;
    }
    GMTrace.o(12396886228992L, 92364);
    return false;
  }
  
  public static void a(WepkgMainProcessTask paramWepkgMainProcessTask)
  {
    GMTrace.i(12396215140352L, 92359);
    hWD.put(Integer.valueOf(paramWepkgMainProcessTask.hashCode()), new WeakReference(paramWepkgMainProcessTask));
    Message localMessage = Message.obtain();
    localMessage.what = paramWepkgMainProcessTask.hashCode();
    localMessage.replyTo = hWF;
    localMessage.setData(c(paramWepkgMainProcessTask));
    l(localMessage);
    GMTrace.o(12396215140352L, 92359);
  }
  
  private static void a(WepkgMainProcessTask paramWepkgMainProcessTask1, WepkgMainProcessTask paramWepkgMainProcessTask2)
  {
    GMTrace.i(12397288882176L, 92367);
    Parcel localParcel = Parcel.obtain();
    paramWepkgMainProcessTask1.writeToParcel(localParcel, 0);
    localParcel.setDataPosition(0);
    paramWepkgMainProcessTask2.f(localParcel);
    localParcel.recycle();
    GMTrace.o(12397288882176L, 92367);
  }
  
  private static WepkgMainProcessTask ae(Bundle paramBundle)
  {
    GMTrace.i(12397154664448L, 92366);
    paramBundle.setClassLoader(WepkgMainProcessTask.class.getClassLoader());
    paramBundle = (WepkgMainProcessTask)paramBundle.getParcelable("task_object");
    GMTrace.o(12397154664448L, 92366);
    return paramBundle;
  }
  
  public static boolean b(WepkgMainProcessTask paramWepkgMainProcessTask)
  {
    GMTrace.i(12396349358080L, 92360);
    Bundle localBundle = c(paramWepkgMainProcessTask);
    if (s(localBundle))
    {
      a(ae(localBundle), paramWepkgMainProcessTask);
      paramWepkgMainProcessTask.VK();
      GMTrace.o(12396349358080L, 92360);
      return true;
    }
    GMTrace.o(12396349358080L, 92360);
    return false;
  }
  
  static Bundle c(WepkgMainProcessTask paramWepkgMainProcessTask)
  {
    GMTrace.i(12397020446720L, 92365);
    Bundle localBundle = new Bundle(1);
    localBundle.putParcelable("task_object", paramWepkgMainProcessTask);
    GMTrace.o(12397020446720L, 92365);
    return localBundle;
  }
  
  private static void l(Message paramMessage)
  {
    GMTrace.i(12396617793536L, 92362);
    paramMessage.replyTo = hWF;
    if (rXL == null)
    {
      Vz();
      synchronized (rXM)
      {
        rXM.add(paramMessage);
        GMTrace.o(12396617793536L, 92362);
        return;
      }
    }
    try
    {
      rXL.k(paramMessage);
      GMTrace.o(12396617793536L, 92362);
      return;
    }
    catch (Exception paramMessage)
    {
      w.e("MicroMsg.Wepkg.WepkgMainProcessService", paramMessage.getMessage());
      GMTrace.o(12396617793536L, 92362);
    }
  }
  
  private static boolean s(Bundle paramBundle)
  {
    GMTrace.i(12396483575808L, 92361);
    boolean bool = true;
    try
    {
      rXL.v(paramBundle);
      GMTrace.o(12396483575808L, 92361);
      return bool;
    }
    catch (Exception paramBundle)
    {
      for (;;)
      {
        bool = false;
        w.e("MicroMsg.Wepkg.WepkgMainProcessService", paramBundle.getMessage());
      }
    }
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    GMTrace.i(12396080922624L, 92358);
    paramIntent = this.rXK;
    GMTrace.o(12396080922624L, 92358);
    return paramIntent;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\wepkg\ipc\WepkgMainProcessService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */