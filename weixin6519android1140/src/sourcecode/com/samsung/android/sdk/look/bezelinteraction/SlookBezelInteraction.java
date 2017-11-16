package com.samsung.android.sdk.look.bezelinteraction;

import android.content.ComponentName;
import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.samsung.android.bezelinteraction.BezelEvent;
import com.samsung.android.bezelinteraction.IBezelCallback.Stub;
import com.samsung.android.bezelinteraction.IBezelManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class SlookBezelInteraction
{
  public static final String SERVICE_NAME = "BezelInteractionService";
  private static final String TAG = "SlookBezelInteraction";
  public static Context mContext = null;
  private static IBezelManager mService = null;
  private final CopyOnWriteArrayList<BezelListenerDelegate> mListenerDelegates = new CopyOnWriteArrayList();
  
  public SlookBezelInteraction(Context paramContext)
  {
    mContext = paramContext;
    getService();
  }
  
  /* Error */
  private IBezelManager getService()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic 33	com/samsung/android/sdk/look/bezelinteraction/SlookBezelInteraction:mService	Lcom/samsung/android/bezelinteraction/IBezelManager;
    //   5: ifnonnull +22 -> 27
    //   8: ldc 17
    //   10: invokestatic 52	android/os/ServiceManager:getService	(Ljava/lang/String;)Landroid/os/IBinder;
    //   13: invokestatic 58	com/samsung/android/bezelinteraction/IBezelManager$Stub:asInterface	(Landroid/os/IBinder;)Lcom/samsung/android/bezelinteraction/IBezelManager;
    //   16: putstatic 33	com/samsung/android/sdk/look/bezelinteraction/SlookBezelInteraction:mService	Lcom/samsung/android/bezelinteraction/IBezelManager;
    //   19: getstatic 33	com/samsung/android/sdk/look/bezelinteraction/SlookBezelInteraction:mService	Lcom/samsung/android/bezelinteraction/IBezelManager;
    //   22: astore_1
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_1
    //   26: areturn
    //   27: getstatic 33	com/samsung/android/sdk/look/bezelinteraction/SlookBezelInteraction:mService	Lcom/samsung/android/bezelinteraction/IBezelManager;
    //   30: invokeinterface 64 1 0
    //   35: invokeinterface 70 1 0
    //   40: ifne -21 -> 19
    //   43: ldc 17
    //   45: invokestatic 52	android/os/ServiceManager:getService	(Ljava/lang/String;)Landroid/os/IBinder;
    //   48: invokestatic 58	com/samsung/android/bezelinteraction/IBezelManager$Stub:asInterface	(Landroid/os/IBinder;)Lcom/samsung/android/bezelinteraction/IBezelManager;
    //   51: putstatic 33	com/samsung/android/sdk/look/bezelinteraction/SlookBezelInteraction:mService	Lcom/samsung/android/bezelinteraction/IBezelManager;
    //   54: goto -35 -> 19
    //   57: astore_1
    //   58: aload_0
    //   59: monitorexit
    //   60: aload_1
    //   61: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	62	0	this	SlookBezelInteraction
    //   22	4	1	localIBezelManager	IBezelManager
    //   57	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	19	57	finally
    //   19	23	57	finally
    //   27	54	57	finally
  }
  
  public final void enableBezelInteraction(boolean paramBoolean)
  {
    try
    {
      IBezelManager localIBezelManager = getService();
      if (localIBezelManager != null) {
        localIBezelManager.enableBezelInteraction(paramBoolean);
      }
      return;
    }
    catch (RemoteException localRemoteException) {}
  }
  
  public final void registerListener(BezelListener paramBezelListener)
  {
    if (paramBezelListener == null) {
      return;
    }
    for (;;)
    {
      synchronized (this.mListenerDelegates)
      {
        Object localObject = this.mListenerDelegates.iterator();
        if (((Iterator)localObject).hasNext())
        {
          localBezelListenerDelegate = (BezelListenerDelegate)((Iterator)localObject).next();
          if (!localBezelListenerDelegate.getListener().equals(paramBezelListener)) {
            continue;
          }
          localObject = localBezelListenerDelegate;
          if (localBezelListenerDelegate == null)
          {
            localObject = new BezelListenerDelegate(paramBezelListener, null);
            this.mListenerDelegates.add(localObject);
          }
          try
          {
            paramBezelListener = getService();
            if (paramBezelListener != null) {
              paramBezelListener.registerCallback((IBinder)localObject, new ComponentName(mContext.getPackageName(), mContext.getClass().getCanonicalName()));
            }
          }
          catch (RemoteException paramBezelListener)
          {
            continue;
          }
          return;
        }
      }
      BezelListenerDelegate localBezelListenerDelegate = null;
    }
  }
  
  public final void unregisterListener(BezelListener paramBezelListener)
  {
    if (paramBezelListener == null) {
      return;
    }
    for (;;)
    {
      Object localObject;
      synchronized (this.mListenerDelegates)
      {
        Iterator localIterator = this.mListenerDelegates.iterator();
        if (!localIterator.hasNext()) {
          break label112;
        }
        localObject = (BezelListenerDelegate)localIterator.next();
        if (!((BezelListenerDelegate)localObject).getListener().equals(paramBezelListener)) {
          continue;
        }
        paramBezelListener = (BezelListener)localObject;
        if (paramBezelListener == null) {
          return;
        }
      }
      try
      {
        localObject = getService();
        if ((localObject != null) && (((IBezelManager)localObject).unregisterCallback(paramBezelListener)))
        {
          this.mListenerDelegates.remove(paramBezelListener);
          paramBezelListener.mHandler = null;
          paramBezelListener.mListener = null;
        }
      }
      catch (RemoteException paramBezelListener)
      {
        for (;;) {}
      }
      return;
      label112:
      paramBezelListener = null;
    }
  }
  
  public static abstract interface BezelListener
  {
    public abstract void onItemSelected(BezelEvent paramBezelEvent);
  }
  
  private static class BezelListenerDelegate
    extends IBezelCallback.Stub
  {
    public Handler mHandler;
    public SlookBezelInteraction.BezelListener mListener;
    
    BezelListenerDelegate(SlookBezelInteraction.BezelListener paramBezelListener, Handler paramHandler)
    {
      this.mListener = paramBezelListener;
      if (paramHandler == null) {}
      for (paramBezelListener = SlookBezelInteraction.mContext.getMainLooper();; paramBezelListener = paramHandler.getLooper())
      {
        this.mHandler = new ListenerHandler(paramBezelListener, this.mListener);
        return;
      }
    }
    
    public SlookBezelInteraction.BezelListener getListener()
    {
      return this.mListener;
    }
    
    public String getListenerInfo()
    {
      return this.mListener.toString();
    }
    
    public void onBezelCallback(BezelEvent paramBezelEvent)
    {
      Message localMessage = Message.obtain();
      localMessage.what = 0;
      localMessage.obj = paramBezelEvent;
      this.mHandler.sendMessage(localMessage);
    }
    
    static class ListenerHandler
      extends Handler
    {
      public SlookBezelInteraction.BezelListener mListener = null;
      
      public ListenerHandler(Looper paramLooper, SlookBezelInteraction.BezelListener paramBezelListener)
      {
        super();
        this.mListener = paramBezelListener;
      }
      
      public void handleMessage(Message paramMessage)
      {
        if (this.mListener != null)
        {
          paramMessage = (BezelEvent)paramMessage.obj;
          if (paramMessage != null) {
            this.mListener.onItemSelected(paramMessage);
          }
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\samsung\android\sdk\look\bezelinteraction\SlookBezelInteraction.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */