package com.tencent.mm.plugin.appbrand.ipc;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class AppBrandMainProcessService
  extends Service
{
  private static c hWA;
  private static ServiceConnection hWB;
  private static final LinkedList<Parcel> hWC;
  private static Map<String, WeakReference<MainProcessTask>> hWD;
  private static Handler hWE;
  private static Messenger hWF;
  private static final Set<a> hWG;
  private final HashMap<String, IBinder.DeathRecipient> hWx;
  private final Messenger hWy;
  private final c.a hWz;
  private final Handler mHandler;
  
  static
  {
    GMTrace.i(10274098642944L, 76548);
    hWC = new LinkedList();
    hWD = new ConcurrentHashMap();
    hWE = new Handler()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(10288191504384L, 76653);
        paramAnonymousMessage = AppBrandMainProcessService.b(paramAnonymousMessage.getData(), false);
        MainProcessTask localMainProcessTask = AppBrandMainProcessService.qa(paramAnonymousMessage.hXm);
        if (localMainProcessTask == null)
        {
          w.e("MicroMsg.AppBrandMainProcessService", "receive client msg, get null task by id %s", new Object[] { paramAnonymousMessage.hXm });
          GMTrace.o(10288191504384L, 76653);
          return;
        }
        AppBrandMainProcessService.b(paramAnonymousMessage, localMainProcessTask);
        localMainProcessTask.VK();
        GMTrace.o(10288191504384L, 76653);
      }
    };
    hWF = new Messenger(hWE);
    hWG = Collections.newSetFromMap(new ConcurrentHashMap());
    GMTrace.o(10274098642944L, 76548);
  }
  
  public AppBrandMainProcessService()
  {
    GMTrace.i(10271280070656L, 76527);
    this.hWx = new HashMap();
    this.mHandler = new Handler(d.xB().ngv.getLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(10280541093888L, 76596);
        AppBrandMainProcessService.b(paramAnonymousMessage.getData(), true).RY();
        GMTrace.o(10280541093888L, 76596);
      }
    };
    this.hWy = new Messenger(this.mHandler);
    this.hWz = new c.a()
    {
      public final void a(final IBinder paramAnonymousIBinder, final String paramAnonymousString)
      {
        GMTrace.i(20686709981184L, 154128);
        IBinder.DeathRecipient local1 = new IBinder.DeathRecipient()
        {
          public final void binderDied()
          {
            GMTrace.i(20686441545728L, 154126);
            paramAnonymousIBinder.unlinkToDeath((IBinder.DeathRecipient)AppBrandMainProcessService.b(AppBrandMainProcessService.this).get(paramAnonymousString), 0);
            AppBrandMainProcessService.b(AppBrandMainProcessService.this).remove(paramAnonymousString);
            AppBrandMainProcessService.pY(paramAnonymousString);
            w.e("MicroMsg.AppBrandMainProcessService", "Client Process Died: %s", new Object[] { paramAnonymousString });
            GMTrace.o(20686441545728L, 154126);
          }
        };
        try
        {
          paramAnonymousIBinder.linkToDeath(local1, 0);
          AppBrandMainProcessService.b(AppBrandMainProcessService.this).put(paramAnonymousString, local1);
          AppBrandMainProcessService.pZ(paramAnonymousString);
          GMTrace.o(20686709981184L, 154128);
          return;
        }
        catch (Exception paramAnonymousIBinder)
        {
          w.e("MicroMsg.AppBrandMainProcessService", "registerDeathRecipient: %s", new Object[] { paramAnonymousIBinder });
          GMTrace.o(20686709981184L, 154128);
        }
      }
      
      public final void u(Bundle paramAnonymousBundle)
      {
        GMTrace.i(10274367078400L, 76550);
        Message localMessage = Message.obtain();
        localMessage.setData(paramAnonymousBundle);
        AppBrandMainProcessService.a(AppBrandMainProcessService.this).send(localMessage);
        GMTrace.o(10274367078400L, 76550);
      }
      
      public final void v(Bundle paramAnonymousBundle)
      {
        GMTrace.i(10274501296128L, 76551);
        AppBrandMainProcessService.b(paramAnonymousBundle, false).RY();
        GMTrace.o(10274501296128L, 76551);
      }
    };
    GMTrace.o(10271280070656L, 76527);
  }
  
  public static void Vz()
  {
    GMTrace.i(10272085377024L, 76533);
    if (hWB == null) {
      hWB = new ServiceConnection()
      {
        public final void onServiceConnected(ComponentName paramAnonymousComponentName, IBinder paramAnonymousIBinder)
        {
          GMTrace.i(10282017488896L, 76607);
          AppBrandMainProcessService.a(c.a.G(paramAnonymousIBinder));
          AppBrandMainProcessService.VA();
          AppBrandMainProcessService.pZ(ab.getPackageName());
          try
          {
            AppBrandMainProcessService.VB().a(new Binder(), ab.vM());
            w.i("MicroMsg.AppBrandMainProcessService", "onServiceConnected(%s)", new Object[] { ab.vM() });
            GMTrace.o(10282017488896L, 76607);
            return;
          }
          catch (Exception paramAnonymousComponentName)
          {
            for (;;)
            {
              w.e("MicroMsg.AppBrandMainProcessService", "onServiceConnected, registerDeathRecipient, %s", new Object[] { paramAnonymousComponentName });
            }
          }
        }
        
        public final void onServiceDisconnected(ComponentName paramAnonymousComponentName)
        {
          GMTrace.i(10282151706624L, 76608);
          AppBrandMainProcessService.a(null);
          AppBrandMainProcessService.pY(ab.getPackageName());
          AppBrandMainProcessService.Vz();
          w.i("MicroMsg.AppBrandMainProcessService", "onServiceDisconnected(%s)", new Object[] { ab.vM() });
          GMTrace.o(10282151706624L, 76608);
        }
      };
    }
    w.i("MicroMsg.AppBrandMainProcessService", "tryBindService");
    Context localContext = ab.getContext();
    localContext.bindService(new Intent(localContext, AppBrandMainProcessService.class), hWB, 1);
    GMTrace.o(10272085377024L, 76533);
  }
  
  static Bundle a(MainProcessTask paramMainProcessTask, boolean paramBoolean)
  {
    GMTrace.i(10272622247936L, 76537);
    Bundle localBundle = new Bundle(3);
    localBundle.putParcelable("task_object", paramMainProcessTask);
    if (paramBoolean) {
      localBundle.putParcelable("task_client", hWF);
    }
    localBundle.putString("task_id", paramMainProcessTask.hXm);
    GMTrace.o(10272622247936L, 76537);
    return localBundle;
  }
  
  private static MainProcessTask a(Bundle paramBundle, boolean paramBoolean)
  {
    GMTrace.i(10272756465664L, 76538);
    paramBundle.setClassLoader(MainProcessTask.class.getClassLoader());
    MainProcessTask localMainProcessTask = (MainProcessTask)paramBundle.getParcelable("task_object");
    if (paramBoolean) {
      localMainProcessTask.hXl = ((Messenger)paramBundle.getParcelable("task_client"));
    }
    localMainProcessTask.hXm = paramBundle.getString("task_id");
    GMTrace.o(10272756465664L, 76538);
    return localMainProcessTask;
  }
  
  public static void a(a parama)
  {
    GMTrace.i(20687649505280L, 154135);
    hWG.add(parama);
    GMTrace.o(20687649505280L, 154135);
  }
  
  public static void a(MainProcessTask paramMainProcessTask)
  {
    GMTrace.i(10271548506112L, 76529);
    hWD.put(paramMainProcessTask.hXm, new WeakReference(paramMainProcessTask));
    t(a(paramMainProcessTask, true));
    GMTrace.o(10271548506112L, 76529);
  }
  
  private static void a(MainProcessTask paramMainProcessTask1, MainProcessTask paramMainProcessTask2)
  {
    GMTrace.i(10272488030208L, 76536);
    Parcel localParcel = Parcel.obtain();
    paramMainProcessTask1.writeToParcel(localParcel, 0);
    localParcel.setDataPosition(0);
    paramMainProcessTask2.f(localParcel);
    localParcel.recycle();
    GMTrace.o(10272488030208L, 76536);
  }
  
  public static void b(a parama)
  {
    GMTrace.i(20687783723008L, 154136);
    hWG.remove(parama);
    GMTrace.o(20687783723008L, 154136);
  }
  
  public static boolean b(MainProcessTask paramMainProcessTask)
  {
    GMTrace.i(10271682723840L, 76530);
    Bundle localBundle = a(paramMainProcessTask, false);
    if (s(localBundle))
    {
      a(a(localBundle, false), paramMainProcessTask);
      paramMainProcessTask.VK();
      GMTrace.o(10271682723840L, 76530);
      return true;
    }
    GMTrace.o(10271682723840L, 76530);
    return false;
  }
  
  private static boolean s(Bundle paramBundle)
  {
    GMTrace.i(10271816941568L, 76531);
    boolean bool = true;
    try
    {
      hWA.v(paramBundle);
      GMTrace.o(10271816941568L, 76531);
      return bool;
    }
    catch (Exception paramBundle)
    {
      for (;;)
      {
        bool = false;
        w.e("MicroMsg.AppBrandMainProcessService", paramBundle.getMessage());
      }
    }
  }
  
  private static void t(Bundle paramBundle)
  {
    GMTrace.i(10271951159296L, 76532);
    if (hWA == null)
    {
      Vz();
      synchronized (hWC)
      {
        LinkedList localLinkedList2 = hWC;
        Parcel localParcel = Parcel.obtain();
        paramBundle.writeToParcel(localParcel, 0);
        localLinkedList2.add(localParcel);
        GMTrace.o(10271951159296L, 76532);
        return;
      }
    }
    try
    {
      hWA.u(paramBundle);
      GMTrace.o(10271951159296L, 76532);
      return;
    }
    catch (Exception paramBundle)
    {
      w.e("MicroMsg.AppBrandMainProcessService", paramBundle.getMessage());
      GMTrace.o(10271951159296L, 76532);
    }
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    GMTrace.i(10271414288384L, 76528);
    paramIntent = this.hWz;
    GMTrace.o(10271414288384L, 76528);
    return paramIntent;
  }
  
  public static class a
  {
    public a()
    {
      GMTrace.i(20687246852096L, 154132);
      GMTrace.o(20687246852096L, 154132);
    }
    
    public void RM()
    {
      GMTrace.i(20687381069824L, 154133);
      GMTrace.o(20687381069824L, 154133);
    }
    
    public void onDisconnected(String paramString)
    {
      GMTrace.i(20687515287552L, 154134);
      GMTrace.o(20687515287552L, 154134);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\ipc\AppBrandMainProcessService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */