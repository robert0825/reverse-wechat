package com.tencent.mm.sdk.platformtools;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.Printer;
import com.tencent.gmtrace.GMTrace;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ae
  implements ag.a
{
  private static final String TAG = "MicroMsg.MMHandler";
  private static b sLogCallback;
  private ag handler;
  private int latestSize;
  private LinkedList<WeakReference<ak>> latestTasks;
  private ConcurrentHashMap<Runnable, WeakReference<ak>> map;
  private String toStringResult;
  
  public ae()
  {
    GMTrace.i(13941195407360L, 103870);
    this.map = new ConcurrentHashMap();
    this.latestTasks = new LinkedList();
    this.toStringResult = null;
    this.handler = new ag(this);
    if (getLooper().getThread().getName().equals("initThread")) {
      w.e("MicroMsg.MMHandler", "MMHandler can not init handler with initThread looper, stack %s", new Object[] { bg.bQW() });
    }
    GMTrace.o(13941195407360L, 103870);
  }
  
  public ae(Looper paramLooper)
  {
    GMTrace.i(13941329625088L, 103871);
    this.map = new ConcurrentHashMap();
    this.latestTasks = new LinkedList();
    this.toStringResult = null;
    this.handler = new ag(paramLooper, this);
    if (paramLooper.getThread().getName().equals("initThread")) {
      w.e("MicroMsg.MMHandler", "MMHandler can not init handler with initThread looper, stack %s", new Object[] { bg.bQW() });
    }
    GMTrace.o(13941329625088L, 103871);
  }
  
  public ae(Looper paramLooper, a parama)
  {
    GMTrace.i(13941598060544L, 103873);
    this.map = new ConcurrentHashMap();
    this.latestTasks = new LinkedList();
    this.toStringResult = null;
    this.handler = new ag(paramLooper, parama, this);
    if (paramLooper.getThread().getName().equals("initThread")) {
      w.e("MicroMsg.MMHandler", "MMHandler can not init handler with initThread looper, stack %s", new Object[] { bg.bQW() });
    }
    GMTrace.o(13941598060544L, 103873);
  }
  
  public ae(a parama)
  {
    GMTrace.i(13941463842816L, 103872);
    this.map = new ConcurrentHashMap();
    this.latestTasks = new LinkedList();
    this.toStringResult = null;
    this.handler = new ag(parama, this);
    if (getLooper().getThread().getName().equals("initThread")) {
      w.e("MicroMsg.MMHandler", "MMHandler can not init handler with initThread looper, stack %s", new Object[] { bg.bQW() });
    }
    GMTrace.o(13941463842816L, 103872);
  }
  
  public static String dump(Runnable paramRunnable, boolean paramBoolean)
  {
    GMTrace.i(13947235205120L, 103915);
    if (paramRunnable == null)
    {
      GMTrace.o(13947235205120L, 103915);
      return "";
    }
    if ((paramRunnable instanceof ak))
    {
      paramRunnable = ((ak)paramRunnable).dump(paramBoolean);
      GMTrace.o(13947235205120L, 103915);
      return paramRunnable;
    }
    paramRunnable = paramRunnable.toString();
    GMTrace.o(13947235205120L, 103915);
    return paramRunnable;
  }
  
  public static Handler fetchFreeHandler()
  {
    GMTrace.i(13946027245568L, 103906);
    Handler localHandler = new Handler();
    GMTrace.o(13946027245568L, 103906);
    return localHandler;
  }
  
  public static Handler fetchFreeHandler(Looper paramLooper)
  {
    GMTrace.i(13946161463296L, 103907);
    paramLooper = new Handler(paramLooper);
    GMTrace.o(13946161463296L, 103907);
    return paramLooper;
  }
  
  public static Handler fetchFreeHandler(Looper paramLooper, a parama)
  {
    GMTrace.i(13946429898752L, 103909);
    paramLooper = new Handler(paramLooper, parama);
    GMTrace.o(13946429898752L, 103909);
    return paramLooper;
  }
  
  public static Handler fetchFreeHandler(a parama)
  {
    GMTrace.i(13946295681024L, 103908);
    parama = new Handler(parama);
    GMTrace.o(13946295681024L, 103908);
    return parama;
  }
  
  public static void setLogCallback(b paramb)
  {
    GMTrace.i(13946564116480L, 103910);
    sLogCallback = paramb;
    GMTrace.o(13946564116480L, 103910);
  }
  
  public String dump(boolean paramBoolean)
  {
    GMTrace.i(13947100987392L, 103914);
    Object localObject1 = new StringBuilder();
    ConcurrentHashMap localConcurrentHashMap = new ConcurrentHashMap(this.map);
    ((StringBuilder)localObject1).append("tasks info size = " + localConcurrentHashMap.size() + '\n');
    Iterator localIterator = localConcurrentHashMap.values().iterator();
    if (localIterator != null)
    {
      int i = 0;
      while (localIterator.hasNext())
      {
        Object localObject2 = (WeakReference)localIterator.next();
        if ((localObject2 != null) && (((WeakReference)localObject2).get() != null))
        {
          localObject2 = (ak)((WeakReference)localObject2).get();
          ((StringBuilder)localObject1).append("[index = " + i + " | taskinfo:" + ((ak)localObject2).dump(paramBoolean) + "]\n");
        }
        i += 1;
      }
    }
    localConcurrentHashMap.clear();
    localObject1 = ((StringBuilder)localObject1).toString();
    GMTrace.o(13947100987392L, 103914);
    return (String)localObject1;
  }
  
  public final void dump(Printer paramPrinter, String paramString)
  {
    GMTrace.i(13945356156928L, 103901);
    this.handler.dump(paramPrinter, paramString);
    GMTrace.o(13945356156928L, 103901);
  }
  
  public String dumpLatestTasks(boolean paramBoolean)
  {
    GMTrace.i(13946966769664L, 103913);
    Object localObject1 = new StringBuilder();
    LinkedList localLinkedList = new LinkedList(this.latestTasks);
    ((StringBuilder)localObject1).append("|MMHandler latest(" + localLinkedList.size() + ") tasks done info");
    Iterator localIterator = localLinkedList.iterator();
    if (localIterator != null)
    {
      int i = 0;
      while (localIterator.hasNext())
      {
        Object localObject2 = (WeakReference)localIterator.next();
        if ((localObject2 != null) && (((WeakReference)localObject2).get() != null))
        {
          localObject2 = (ak)((WeakReference)localObject2).get();
          ((StringBuilder)localObject1).append("[index = " + i + "|task=" + ((ak)localObject2).dump(paramBoolean) + "]");
        }
        i += 1;
      }
    }
    localLinkedList.clear();
    localObject1 = ((StringBuilder)localObject1).toString();
    GMTrace.o(13946966769664L, 103913);
    return (String)localObject1;
  }
  
  public Runnable findTaskByName(String paramString)
  {
    GMTrace.i(13947503640576L, 103917);
    if (bg.nm(paramString))
    {
      GMTrace.o(13947503640576L, 103917);
      return null;
    }
    Iterator localIterator = new ConcurrentHashMap(this.map).values().iterator();
    if (localIterator != null) {
      while (localIterator.hasNext())
      {
        Object localObject = (WeakReference)localIterator.next();
        if ((localObject != null) && (((WeakReference)localObject).get() != null))
        {
          localObject = (ak)((WeakReference)localObject).get();
          if (((ak)localObject).lGL.equals(paramString))
          {
            w.i("MicroMsg.MMHandler", "findTaskByName: %s, found task info: %s", new Object[] { paramString, ((ak)localObject).dump(true) });
            GMTrace.o(13947503640576L, 103917);
            return (Runnable)localObject;
          }
        }
      }
    }
    w.i("MicroMsg.MMHandler", "findTaskByName: %s, not found!", new Object[] { paramString });
    GMTrace.o(13947503640576L, 103917);
    return null;
  }
  
  public Runnable findTaskByRunTime(long paramLong)
  {
    GMTrace.i(13947369422848L, 103916);
    Iterator localIterator = new ConcurrentHashMap(this.map).values().iterator();
    long l = System.currentTimeMillis();
    while ((localIterator != null) && (localIterator.hasNext()))
    {
      Object localObject = (WeakReference)localIterator.next();
      if ((localObject != null) && (((WeakReference)localObject).get() != null))
      {
        localObject = (ak)((WeakReference)localObject).get();
        if ((((ak)localObject).started) && (((ak)localObject).gqA >= ((ak)localObject).viQ) && (l - ((ak)localObject).gqA > paramLong))
        {
          w.i("MicroMsg.MMHandler", "findTaskByRunTime limit: %d, found task info: %s", new Object[] { Long.valueOf(paramLong), ((ak)localObject).dump(true) });
          GMTrace.o(13947369422848L, 103916);
          return (Runnable)localObject;
        }
      }
    }
    w.i("MicroMsg.MMHandler", "findTaskByRunTime limit: %d, not found!", new Object[] { Long.valueOf(paramLong) });
    GMTrace.o(13947369422848L, 103916);
    return null;
  }
  
  public final Looper getLooper()
  {
    GMTrace.i(13945221939200L, 103900);
    Looper localLooper = this.handler.getLooper();
    GMTrace.o(13945221939200L, 103900);
    return localLooper;
  }
  
  @TargetApi(14)
  public String getMessageName(Message paramMessage)
  {
    GMTrace.i(13941732278272L, 103874);
    if (Build.VERSION.SDK_INT < 14)
    {
      if (paramMessage.getCallback() != null)
      {
        paramMessage = paramMessage.getCallback().getClass().getName();
        GMTrace.o(13941732278272L, 103874);
        return paramMessage;
      }
      paramMessage = "0x" + Integer.toHexString(paramMessage.what);
      GMTrace.o(13941732278272L, 103874);
      return paramMessage;
    }
    paramMessage = this.handler.getMessageName(paramMessage);
    GMTrace.o(13941732278272L, 103874);
    return paramMessage;
  }
  
  public void handleMessage(Message paramMessage)
  {
    GMTrace.i(13945624592384L, 103903);
    GMTrace.o(13945624592384L, 103903);
  }
  
  public final boolean hasMessages(int paramInt)
  {
    GMTrace.i(13944953503744L, 103898);
    boolean bool = this.handler.hasMessages(paramInt);
    GMTrace.o(13944953503744L, 103898);
    return bool;
  }
  
  public final boolean hasMessages(int paramInt, Object paramObject)
  {
    GMTrace.i(13945087721472L, 103899);
    boolean bool = this.handler.hasMessages(paramInt, paramObject);
    GMTrace.o(13945087721472L, 103899);
    return bool;
  }
  
  public final Message obtainMessage()
  {
    GMTrace.i(13941866496000L, 103875);
    Message localMessage = this.handler.obtainMessage();
    GMTrace.o(13941866496000L, 103875);
    return localMessage;
  }
  
  public final Message obtainMessage(int paramInt)
  {
    GMTrace.i(13942000713728L, 103876);
    Message localMessage = this.handler.obtainMessage(paramInt);
    GMTrace.o(13942000713728L, 103876);
    return localMessage;
  }
  
  public final Message obtainMessage(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(13942269149184L, 103878);
    Message localMessage = this.handler.obtainMessage(paramInt1, paramInt2, paramInt3);
    GMTrace.o(13942269149184L, 103878);
    return localMessage;
  }
  
  public final Message obtainMessage(int paramInt1, int paramInt2, int paramInt3, Object paramObject)
  {
    GMTrace.i(13942403366912L, 103879);
    paramObject = this.handler.obtainMessage(paramInt1, paramInt2, paramInt3, paramObject);
    GMTrace.o(13942403366912L, 103879);
    return (Message)paramObject;
  }
  
  public final Message obtainMessage(int paramInt, Object paramObject)
  {
    GMTrace.i(13942134931456L, 103877);
    paramObject = this.handler.obtainMessage(paramInt, paramObject);
    GMTrace.o(13942134931456L, 103877);
    return (Message)paramObject;
  }
  
  public void onLog(Message paramMessage, Runnable paramRunnable, Thread paramThread, long paramLong1, long paramLong2, float paramFloat)
  {
    GMTrace.i(13946698334208L, 103911);
    if (sLogCallback != null) {
      sLogCallback.onLog(paramMessage, paramRunnable, paramThread, paramLong1, paramLong2, paramFloat);
    }
    GMTrace.o(13946698334208L, 103911);
  }
  
  public final void onTaskAdded(Runnable paramRunnable, ak paramak)
  {
    GMTrace.i(13945758810112L, 103904);
    this.map.put(paramRunnable, new WeakReference(paramak));
    GMTrace.o(13945758810112L, 103904);
  }
  
  public final void onTaskRunEnd(Runnable paramRunnable, ak paramak)
  {
    GMTrace.i(13945893027840L, 103905);
    WeakReference localWeakReference = (WeakReference)this.map.get(paramRunnable);
    if ((localWeakReference != null) && (localWeakReference.get() != null) && (localWeakReference.get() == paramak))
    {
      this.map.remove(paramRunnable);
      if (this.latestSize > 0)
      {
        if (this.latestTasks.size() == this.latestSize) {
          this.latestTasks.pop();
        }
        this.latestTasks.add(localWeakReference);
      }
    }
    GMTrace.o(13945893027840L, 103905);
  }
  
  public final boolean post(Runnable paramRunnable)
  {
    GMTrace.i(13942537584640L, 103880);
    boolean bool = this.handler.post(paramRunnable);
    GMTrace.o(13942537584640L, 103880);
    return bool;
  }
  
  public final boolean postAtFrontOfQueue(Runnable paramRunnable)
  {
    GMTrace.i(13943074455552L, 103884);
    boolean bool = this.handler.postAtFrontOfQueue(paramRunnable);
    GMTrace.o(13943074455552L, 103884);
    return bool;
  }
  
  public final boolean postAtFrontOfQueueV2(Runnable paramRunnable)
  {
    GMTrace.i(13943208673280L, 103885);
    paramRunnable = Message.obtain(this.handler, paramRunnable);
    boolean bool = this.handler.sendMessageAtTime(paramRunnable, 0L);
    GMTrace.o(13943208673280L, 103885);
    return bool;
  }
  
  public final boolean postAtTime(Runnable paramRunnable, long paramLong)
  {
    GMTrace.i(13942671802368L, 103881);
    boolean bool = this.handler.postAtTime(paramRunnable, paramLong);
    GMTrace.o(13942671802368L, 103881);
    return bool;
  }
  
  public final boolean postAtTime(Runnable paramRunnable, Object paramObject, long paramLong)
  {
    GMTrace.i(13942806020096L, 103882);
    boolean bool = this.handler.postAtTime(paramRunnable, paramObject, paramLong);
    GMTrace.o(13942806020096L, 103882);
    return bool;
  }
  
  public final boolean postDelayed(Runnable paramRunnable, long paramLong)
  {
    GMTrace.i(13942940237824L, 103883);
    boolean bool = this.handler.postDelayed(paramRunnable, paramLong);
    GMTrace.o(13942940237824L, 103883);
    return bool;
  }
  
  public final void removeCallbacks(Runnable paramRunnable)
  {
    GMTrace.i(13943342891008L, 103886);
    if (paramRunnable == null)
    {
      GMTrace.o(13943342891008L, 103886);
      return;
    }
    WeakReference localWeakReference = (WeakReference)this.map.get(paramRunnable);
    if ((localWeakReference != null) && (localWeakReference.get() != null)) {
      this.handler.removeCallbacks((Runnable)localWeakReference.get());
    }
    this.map.remove(paramRunnable);
    GMTrace.o(13943342891008L, 103886);
  }
  
  public final void removeCallbacks(Runnable paramRunnable, Object paramObject)
  {
    GMTrace.i(13943477108736L, 103887);
    if (paramRunnable == null)
    {
      GMTrace.o(13943477108736L, 103887);
      return;
    }
    WeakReference localWeakReference = (WeakReference)this.map.get(paramRunnable);
    if ((localWeakReference != null) && (localWeakReference.get() != null) && ((paramObject == null) || (((ak)localWeakReference.get()).viO == paramObject))) {
      this.handler.removeCallbacks((Runnable)localWeakReference.get(), paramObject);
    }
    this.map.remove(paramRunnable);
    GMTrace.o(13943477108736L, 103887);
  }
  
  public final void removeCallbacksAndMessages(Object paramObject)
  {
    GMTrace.i(13944819286016L, 103897);
    this.handler.removeCallbacksAndMessages(paramObject);
    if (paramObject == null)
    {
      this.map.clear();
      GMTrace.o(13944819286016L, 103897);
      return;
    }
    Iterator localIterator = this.map.entrySet().iterator();
    if (localIterator != null) {
      while (localIterator.hasNext())
      {
        Object localObject = (Map.Entry)localIterator.next();
        if (localObject != null)
        {
          localObject = (WeakReference)((Map.Entry)localObject).getValue();
          if ((localObject != null) && (((WeakReference)localObject).get() != null) && (((ak)((WeakReference)localObject).get()).viO == paramObject)) {
            localIterator.remove();
          }
        }
      }
    }
    GMTrace.o(13944819286016L, 103897);
  }
  
  public final void removeMessages(int paramInt)
  {
    GMTrace.i(13944550850560L, 103895);
    this.handler.removeMessages(paramInt);
    GMTrace.o(13944550850560L, 103895);
  }
  
  public final void removeMessages(int paramInt, Object paramObject)
  {
    GMTrace.i(13944685068288L, 103896);
    this.handler.removeMessages(paramInt, paramObject);
    GMTrace.o(13944685068288L, 103896);
  }
  
  public final boolean sendEmptyMessage(int paramInt)
  {
    GMTrace.i(13943745544192L, 103889);
    boolean bool = this.handler.sendEmptyMessage(paramInt);
    GMTrace.o(13943745544192L, 103889);
    return bool;
  }
  
  public final boolean sendEmptyMessageAtTime(int paramInt, long paramLong)
  {
    GMTrace.i(13944013979648L, 103891);
    boolean bool = this.handler.sendEmptyMessageAtTime(paramInt, paramLong);
    GMTrace.o(13944013979648L, 103891);
    return bool;
  }
  
  public final boolean sendEmptyMessageDelayed(int paramInt, long paramLong)
  {
    GMTrace.i(13943879761920L, 103890);
    boolean bool = this.handler.sendEmptyMessageDelayed(paramInt, paramLong);
    GMTrace.o(13943879761920L, 103890);
    return bool;
  }
  
  public final boolean sendMessage(Message paramMessage)
  {
    GMTrace.i(13943611326464L, 103888);
    boolean bool = this.handler.sendMessage(paramMessage);
    GMTrace.o(13943611326464L, 103888);
    return bool;
  }
  
  public final boolean sendMessageAtFrontOfQueue(Message paramMessage)
  {
    GMTrace.i(13944416632832L, 103894);
    boolean bool = this.handler.sendMessageAtFrontOfQueue(paramMessage);
    GMTrace.o(13944416632832L, 103894);
    return bool;
  }
  
  public boolean sendMessageAtTime(Message paramMessage, long paramLong)
  {
    GMTrace.i(13944282415104L, 103893);
    boolean bool = this.handler.sendMessageAtTime(paramMessage, paramLong);
    GMTrace.o(13944282415104L, 103893);
    return bool;
  }
  
  public final boolean sendMessageDelayed(Message paramMessage, long paramLong)
  {
    GMTrace.i(13944148197376L, 103892);
    boolean bool = this.handler.sendMessageDelayed(paramMessage, paramLong);
    GMTrace.o(13944148197376L, 103892);
    return bool;
  }
  
  public void setLatestSize(int paramInt)
  {
    GMTrace.i(13946832551936L, 103912);
    this.latestSize = paramInt;
    GMTrace.o(13946832551936L, 103912);
  }
  
  public String toString()
  {
    GMTrace.i(13945490374656L, 103902);
    if (this.toStringResult == null) {
      this.toStringResult = ("MMHandler(" + getClass().getName() + ")");
    }
    String str = this.toStringResult;
    GMTrace.o(13945490374656L, 103902);
    return str;
  }
  
  public static abstract interface a
    extends Handler.Callback
  {}
  
  public static abstract interface b
  {
    public abstract void onLog(Message paramMessage, Runnable paramRunnable, Thread paramThread, long paramLong1, long paramLong2, float paramFloat);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */