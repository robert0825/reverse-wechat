package com.tencent.gmtrace;

import android.os.Process;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class GMTrace
{
  private static final int _1000000 = 1000000;
  protected static volatile long currentDiffTime;
  private static GMTraceWorker gmTraceWorker;
  public static boolean isInit;
  private static boolean isOnlyCareMainThread;
  private static boolean isStartTrace;
  private static long[] mainThreadBuffer;
  private static int mainThreadIndex;
  private static GMTraceBitSet methodInFlagSet;
  private static HashMap<Integer, List<GMTraceHandler>> methodInHandlerMap;
  private static List<GMTraceHandler> methodPostDataHandlerList;
  private static long[] otherThreadBuffer;
  private static AtomicInteger otherThreadIndex;
  protected static long startTime;
  private static HashMap<Integer, String> threadNameMap;
  private static GMTraceBitSet threadNameSet;
  
  public static void clearHandler()
  {
    if (!isInit) {}
    do
    {
      return;
      if (methodInFlagSet != null) {
        methodInFlagSet.clear();
      }
    } while (methodInHandlerMap == null);
    methodInHandlerMap.clear();
  }
  
  public static long getCurrentDiffTime()
  {
    return currentDiffTime;
  }
  
  public static long[] getMainThreadBuffer()
  {
    return mainThreadBuffer;
  }
  
  public static int getMainThreadIndex()
  {
    return mainThreadIndex;
  }
  
  public static long[] getOtherThreadBuffer()
  {
    return otherThreadBuffer;
  }
  
  public static int getOtherThreadIndex()
  {
    return otherThreadIndex.get() % 1000000;
  }
  
  public static long getStartTime()
  {
    return startTime;
  }
  
  public static HashMap<Integer, String> getThreadNameMap()
  {
    return threadNameMap;
  }
  
  public static void i(long paramLong, int paramInt)
  {
    long l2 = 134217727L;
    long l1 = 131071L;
    if (!isInit) {}
    label54:
    label148:
    label155:
    label195:
    for (;;)
    {
      return;
      if (isStartTrace)
      {
        long l3 = Thread.currentThread().getId();
        long l4 = currentDiffTime;
        int i;
        if (l3 > 131071L)
        {
          if (l4 <= 134217727L) {
            break label148;
          }
          paramLong = l2 | l1 << 46 | 0x8000000000000000 | paramLong;
          if ((l3 != 1L) || (mainThreadBuffer == null)) {
            break label155;
          }
          i = mainThreadIndex + 1;
          mainThreadIndex = i;
          mainThreadIndex = i % 1000000;
          mainThreadBuffer[mainThreadIndex] = paramLong;
          if (mainThreadIndex % 250000 == 0) {
            notifyPostData(true);
          }
        }
        for (;;)
        {
          if ((methodInFlagSet == null) || (!methodInFlagSet.get(paramInt))) {
            break label195;
          }
          notifySyncDo(paramInt);
          return;
          l1 = l3;
          break;
          l2 = l4;
          break label54;
          if ((!isOnlyCareMainThread) && (otherThreadBuffer != null))
          {
            i = otherThreadIndex.incrementAndGet() % 1000000;
            otherThreadBuffer[i] = paramLong;
            if (i % 250000 == 0) {
              notifyPostData(false);
            }
          }
        }
      }
    }
  }
  
  public static void init(boolean paramBoolean)
  {
    if (isInit) {
      return;
    }
    isOnlyCareMainThread = paramBoolean;
    isInit = true;
    startTime = System.nanoTime() / 1000000L;
    mainThreadIndex = 0;
    otherThreadIndex = new AtomicInteger(0);
    methodInHandlerMap = new HashMap();
    methodPostDataHandlerList = new ArrayList();
    if (!isOnlyCareMainThread)
    {
      threadNameMap = new HashMap();
      threadNameSet = new GMTraceBitSet(10000);
    }
    methodInFlagSet = new GMTraceBitSet(140000);
  }
  
  public static boolean isEmptyHandler()
  {
    if (!isInit) {
      return true;
    }
    return methodInHandlerMap.isEmpty();
  }
  
  public static boolean isInit()
  {
    return isInit;
  }
  
  private static void notifyPostData(boolean paramBoolean)
  {
    Iterator localIterator = methodPostDataHandlerList.iterator();
    while (localIterator.hasNext()) {
      ((GMTraceHandler)localIterator.next()).postBufferData(paramBoolean);
    }
  }
  
  private static void notifyStop()
  {
    Iterator localIterator = methodPostDataHandlerList.iterator();
    while (localIterator.hasNext()) {
      ((GMTraceHandler)localIterator.next()).stopTrace();
    }
  }
  
  private static void notifySyncDo(int paramInt)
  {
    List localList = (List)methodInHandlerMap.get(Integer.valueOf(paramInt));
    if (localList != null)
    {
      int i = 0;
      while (i < localList.size())
      {
        ((GMTraceHandler)localList.get(i)).syncDo(paramInt, currentDiffTime);
        i += 1;
      }
    }
  }
  
  public static void o(long paramLong, int paramInt)
  {
    if (!isInit) {}
    label6:
    do
    {
      long l;
      do
      {
        do
        {
          break label6;
          do
          {
            return;
          } while (!isStartTrace);
          l = Thread.currentThread().getId();
          paramLong = currentDiffTime | 0L | l << 46 | paramLong;
          if ((l != 1L) || (mainThreadBuffer == null)) {
            break;
          }
          paramInt = mainThreadIndex + 1;
          mainThreadIndex = paramInt;
          mainThreadIndex = paramInt % 1000000;
          mainThreadBuffer[mainThreadIndex] = paramLong;
        } while (mainThreadIndex % 250000 != 0);
        notifyPostData(true);
        return;
      } while ((isOnlyCareMainThread) || (otherThreadBuffer == null));
      paramInt = (int)l;
      if (!threadNameSet.get(paramInt))
      {
        threadNameSet.set(paramInt);
        threadNameMap.put(Integer.valueOf(paramInt), Thread.currentThread().getName());
      }
      paramInt = otherThreadIndex.incrementAndGet() % 1000000;
      otherThreadBuffer[paramInt] = paramLong;
    } while (paramInt % 250000 != 0);
    notifyPostData(false);
  }
  
  public static void registerHandler(GMTraceHandler paramGMTraceHandler)
  {
    if (!isInit) {
      return;
    }
    if ((paramGMTraceHandler.getPointId() != null) && (paramGMTraceHandler.getPointId().size() > 0))
    {
      new StringBuilder("register handler ").append(paramGMTraceHandler.getPointId().toString());
      Iterator localIterator = paramGMTraceHandler.getPointId().iterator();
      if (localIterator.hasNext())
      {
        int i = ((Integer)localIterator.next()).intValue();
        if (methodInFlagSet != null) {
          methodInFlagSet.set(i);
        }
        if (!methodInHandlerMap.containsKey(Integer.valueOf(i))) {}
        for (Object localObject = new ArrayList();; localObject = (List)methodInHandlerMap.get(Integer.valueOf(i)))
        {
          ((List)localObject).add(paramGMTraceHandler);
          methodInHandlerMap.put(Integer.valueOf(i), localObject);
          break;
        }
      }
    }
    methodPostDataHandlerList.add(paramGMTraceHandler);
  }
  
  public static void releaseBuffer()
  {
    if (!isInit) {}
    do
    {
      do
      {
        return;
      } while (isStartTrace);
      mainThreadBuffer = null;
    } while (isOnlyCareMainThread);
    otherThreadBuffer = null;
  }
  
  public static void startTrace()
  {
    if (!isInit) {}
    do
    {
      do
      {
        return;
      } while (isStartTrace);
      isStartTrace = true;
      GMTraceWorker localGMTraceWorker = new GMTraceWorker();
      gmTraceWorker = localGMTraceWorker;
      localGMTraceWorker.start();
      if (mainThreadBuffer == null) {
        mainThreadBuffer = new long[1000000];
      }
    } while ((isOnlyCareMainThread) || (otherThreadBuffer != null));
    otherThreadBuffer = new long[1000000];
  }
  
  public static void stopTrace()
  {
    if (!isInit) {}
    while (!isStartTrace) {
      return;
    }
    isStartTrace = false;
    gmTraceWorker.stop();
    gmTraceWorker = null;
    notifyStop();
  }
  
  public static void unregisterHandler(GMTraceHandler paramGMTraceHandler)
  {
    if (!isInit) {}
    for (;;)
    {
      return;
      methodPostDataHandlerList.remove(paramGMTraceHandler);
      if ((paramGMTraceHandler.getPointId() != null) && (paramGMTraceHandler.getPointId().size() > 0))
      {
        new StringBuilder("unregister handler ").append(paramGMTraceHandler.getPointId().toString());
        Iterator localIterator = paramGMTraceHandler.getPointId().iterator();
        while (localIterator.hasNext())
        {
          int i = ((Integer)localIterator.next()).intValue();
          List localList = (List)methodInHandlerMap.get(Integer.valueOf(i));
          if (localList != null)
          {
            localList.remove(paramGMTraceHandler);
            if ((localList.size() == 0) && (methodInFlagSet != null)) {
              methodInFlagSet.unset(i);
            }
            methodInHandlerMap.put(Integer.valueOf(i), localList);
          }
          else if (methodInFlagSet != null)
          {
            methodInFlagSet.unset(i);
          }
        }
      }
    }
  }
  
  private static class GMTraceWorker
    implements Runnable
  {
    private boolean isReady = false;
    
    public void run()
    {
      Process.setThreadPriority(0);
      while ((this.isReady) && (GMTrace.isInit))
      {
        GMTrace.currentDiffTime = System.nanoTime() / 1000000L - GMTrace.startTime;
        try
        {
          Thread.sleep(1L);
        }
        catch (InterruptedException localInterruptedException) {}
      }
    }
    
    public void start()
    {
      if (!this.isReady)
      {
        this.isReady = true;
        new Thread(this).start();
      }
    }
    
    public void stop()
    {
      if (this.isReady) {
        this.isReady = false;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\gmtrace\GMTrace.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */