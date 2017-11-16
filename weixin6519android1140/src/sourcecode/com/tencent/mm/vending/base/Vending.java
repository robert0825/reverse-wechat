package com.tencent.mm.vending.base;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.vending.g.g;
import com.tencent.mm.vending.h.d;
import com.tencent.mm.vending.i.b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class Vending<_Struct, _Index, _Change>
  implements com.tencent.mm.vending.e.a
{
  private static final int MESSAGE_DO_DESTROY = 2;
  private static final int MESSAGE_NOTIFY_DATA_LOADED = 1;
  private static final int MESSAGE_PREPARE_VENDING_DATA = 1;
  private static final int SYNC_MESSAGE_APPLY_CHANGE = 1;
  private static final int SYNC_MESSAGE_CLEAR_RESOLVED_ONLY = 3;
  private static final int SYNC_MESSAGE_PREPARE_DATA_DEGRADE = 2;
  private static final String TAG = "Vending";
  public g<_Index, i<_Struct, _Index>> mArray;
  private byte[] mArrayDataLock;
  private AtomicBoolean mCallDestroyed;
  public volatile com.tencent.mm.vending.b.c mDataChangedCallback;
  private volatile com.tencent.mm.vending.b.c mDataResolvedCallback;
  private c<_Index> mDeadlock;
  private boolean mFreezeDataChange;
  private boolean mHasPendingDataChange;
  public f mLoader;
  private byte[] mPendingDataChangeLock;
  private boolean mResolveFromVending;
  public Handler mSubscriberHandler;
  private Looper mSubscriberLooper;
  HashSet<Vending<_Struct, _Index, _Change>.h> mVendingDeferring;
  public Handler mVendingHandler;
  public Looper mVendingLooper;
  private c mVendingSync;
  
  public Vending()
  {
    this(Looper.getMainLooper());
    GMTrace.i(263737835520L, 1965);
    GMTrace.o(263737835520L, 1965);
  }
  
  public Vending(Looper paramLooper)
  {
    GMTrace.i(263872053248L, 1966);
    this.mCallDestroyed = new AtomicBoolean(false);
    this.mArrayDataLock = new byte[0];
    this.mPendingDataChangeLock = new byte[0];
    this.mHasPendingDataChange = false;
    this.mFreezeDataChange = false;
    this.mDeadlock = new c();
    this.mDataChangedCallback = new com.tencent.mm.vending.b.c(d.xyH) {};
    this.mDataResolvedCallback = new com.tencent.mm.vending.b.c(d.xyH) {};
    this.mArray = new g();
    this.mVendingDeferring = new HashSet();
    this.mResolveFromVending = false;
    this.mSubscriberLooper = paramLooper;
    this.mVendingLooper = b.cku().xyR.getLooper();
    this.mArray.xxq = new b()
    {
      public final void cjZ()
      {
        GMTrace.i(258503344128L, 1926);
        com.tencent.mm.vending.f.a.i("Vending", "SafeSparseArray fusing.", new Object[0]);
        Vending.this.deadlock();
        GMTrace.o(258503344128L, 1926);
      }
    };
    this.mVendingSync = new c(this.mSubscriberLooper, this.mVendingLooper);
    this.mVendingSync.xxz = new c.a()
    {
      public final void cka()
      {
        GMTrace.i(258771779584L, 1928);
        com.tencent.mm.vending.f.a.i("Vending", "%s beforeSynchronize", new Object[] { Vending.this });
        Vending.this.mLoader.ckc();
        GMTrace.o(258771779584L, 1928);
      }
      
      public final void ckb()
      {
        GMTrace.i(259040215040L, 1930);
        com.tencent.mm.vending.f.a.i("Vending", "%s afterSynchronize", new Object[] { Vending.this });
        if (Vending.this.mDataChangedCallback != null) {
          Vending.this.mDataChangedCallback.cke();
        }
        GMTrace.o(259040215040L, 1930);
      }
      
      public final void synchronizing(int paramAnonymousInt, Object paramAnonymousObject)
      {
        GMTrace.i(258905997312L, 1929);
        com.tencent.mm.vending.f.a.i("Vending", "%s synchronizing", new Object[] { Vending.this });
        Vending.this.mVendingDeferring.clear();
        Vending.this.mLoader.ckc();
        Vending.this.mSubscriberHandler.removeCallbacksAndMessages(null);
        if (paramAnonymousInt == 2) {
          paramAnonymousObject = Vending.this.prepareVendingDataAsynchronous();
        }
        if ((paramAnonymousInt == 2) || (paramAnonymousInt == 1)) {
          Vending.this.applyChangeSynchronized(paramAnonymousObject);
        }
        Vending.this.synchronizing(paramAnonymousInt, paramAnonymousObject);
        Vending.this.mArray.clear();
        GMTrace.o(258905997312L, 1929);
      }
    };
    this.mSubscriberHandler = new Handler(this.mSubscriberLooper)
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(259308650496L, 1932);
        switch (paramAnonymousMessage.what)
        {
        }
        for (;;)
        {
          GMTrace.o(259308650496L, 1932);
          return;
          paramAnonymousMessage = (Vending.i)paramAnonymousMessage.obj;
          Vending.this.onDataResolved(paramAnonymousMessage.xxr, paramAnonymousMessage.xxs);
        }
      }
    };
    this.mVendingHandler = new Handler(this.mVendingLooper)
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(259577085952L, 1934);
        switch (paramAnonymousMessage.what)
        {
        }
        for (;;)
        {
          GMTrace.o(259577085952L, 1934);
          return;
          Vending.this.callPrepareVendingData();
          GMTrace.o(259577085952L, 1934);
          return;
          Vending.this.destroyAsynchronous();
        }
      }
    };
    this.mLoader = new f(this.mVendingLooper, new Vending.f.a()
    {
      public final void bS(_Index paramAnonymous_Index)
      {
        GMTrace.i(259845521408L, 1936);
        Vending.i locali = Vending.this.getLock(paramAnonymous_Index);
        boolean bool = Vending.this.loadFromVending(locali, paramAnonymous_Index);
        if (locali.xwR)
        {
          com.tencent.mm.vending.f.a.d("Vending", "This lock is defer to return %s %s", new Object[] { locali, paramAnonymous_Index });
          GMTrace.o(259845521408L, 1936);
          return;
        }
        if (bool)
        {
          GMTrace.o(259845521408L, 1936);
          return;
        }
        Vending.this.notifyDataLoadedIfNeed(locali);
        GMTrace.o(259845521408L, 1936);
      }
      
      public final void cancel()
      {
        GMTrace.i(259979739136L, 1937);
        Vending.this.loaderClear();
        Vending.this.deadlock();
        GMTrace.o(259979739136L, 1937);
      }
    });
    GMTrace.o(263872053248L, 1966);
  }
  
  private i<_Struct, _Index> forSubscriberSync(i<_Struct, _Index> parami, _Index param_Index)
  {
    GMTrace.i(265482665984L, 1978);
    if (!b.cku().xyR.isAlive())
    {
      com.tencent.mm.vending.f.a.e("Vending", "Vending thread is not running!", new Object[0]);
      GMTrace.o(265482665984L, 1978);
      return parami;
    }
    long l;
    synchronized (parami.fWT)
    {
      boolean bool = requestIndex(parami, param_Index);
      if ((!parami.xxu) || (parami.iq))
      {
        if (!bool)
        {
          GMTrace.o(265482665984L, 1978);
          return parami;
        }
        this.mDeadlock.xxg.yA = param_Index;
        this.mDeadlock.xxh = parami;
        com.tencent.mm.vending.f.a.i("Vending", "%s waiting %s", new Object[] { this, param_Index });
        l = System.nanoTime();
      }
    }
    try
    {
      parami.fWT.wait();
      com.tencent.mm.vending.f.a.i("Vending", "%s waiting duration %s", new Object[] { this, Long.valueOf(System.nanoTime() - l) });
      this.mDeadlock.reset();
      GMTrace.o(265482665984L, 1978);
      return parami;
      parami = finally;
      throw parami;
    }
    catch (InterruptedException param_Index)
    {
      for (;;) {}
    }
  }
  
  private _Struct getAsync(_Index param_Index)
  {
    GMTrace.i(265751101440L, 1980);
    if (invalidIndex(param_Index))
    {
      GMTrace.o(265751101440L, 1980);
      return null;
    }
    i locali = getLock(param_Index);
    if (!requestIndex(locali, param_Index))
    {
      GMTrace.o(265751101440L, 1980);
      return null;
    }
    if (locali.iq)
    {
      GMTrace.o(265751101440L, 1980);
      return null;
    }
    param_Index = locali.xxs;
    GMTrace.o(265751101440L, 1980);
    return param_Index;
  }
  
  private _Struct getSync(_Index param_Index)
  {
    GMTrace.i(265080012800L, 1975);
    Looper localLooper = Looper.myLooper();
    if ((localLooper != this.mSubscriberLooper) && (localLooper != this.mVendingLooper)) {
      throw new IllegalAccessError("Call from wrong looper");
    }
    if (this.mCallDestroyed.get())
    {
      GMTrace.o(265080012800L, 1975);
      return null;
    }
    i locali = getLock(param_Index);
    if (invalidIndex(param_Index))
    {
      param_Index = locali.xxs;
      GMTrace.o(265080012800L, 1975);
      return param_Index;
    }
    if (localLooper == this.mSubscriberLooper)
    {
      param_Index = forSubscriberSync(locali, param_Index).xxs;
      GMTrace.o(265080012800L, 1975);
      return param_Index;
    }
    loadFromVending(locali, param_Index);
    param_Index = locali.xxs;
    GMTrace.o(265080012800L, 1975);
    return param_Index;
  }
  
  private void lockResolved(i<_Struct, _Index> parami, _Index param_Index, _Struct param_Struct)
  {
    GMTrace.i(265214230528L, 1976);
    parami.xxs = param_Struct;
    parami.xxr = param_Index;
    parami.iq = false;
    parami.xxt = false;
    parami.xxu = true;
    if (this.mDeadlock.xxh == parami) {
      parami.xxv = true;
    }
    parami.fWT.notify();
    GMTrace.o(265214230528L, 1976);
  }
  
  private void notifyVendingDataChange(boolean paramBoolean)
  {
    GMTrace.i(266690625536L, 1987);
    if (this.mCallDestroyed.get())
    {
      GMTrace.o(266690625536L, 1987);
      return;
    }
    if ((Looper.myLooper() != this.mSubscriberLooper) && (Looper.myLooper() != this.mVendingLooper)) {
      throw new IllegalAccessError("Call from wrong thread");
    }
    if (paramBoolean)
    {
      this.mVendingSync.i(2, null);
      GMTrace.o(266690625536L, 1987);
      return;
    }
    synchronized (this.mPendingDataChangeLock)
    {
      if (this.mFreezeDataChange)
      {
        this.mHasPendingDataChange = true;
        GMTrace.o(266690625536L, 1987);
        return;
      }
      if (Looper.myLooper() == this.mVendingLooper)
      {
        callPrepareVendingData();
        GMTrace.o(266690625536L, 1987);
        return;
      }
    }
    this.mVendingHandler.removeMessages(1);
    this.mVendingHandler.sendMessage(this.mVendingHandler.obtainMessage(1));
    this.mVendingHandler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(260248174592L, 1939);
        com.tencent.mm.vending.f.a.i("Vending", "WTTTTF", new Object[0]);
        GMTrace.o(260248174592L, 1939);
      }
    });
    GMTrace.o(266690625536L, 1987);
  }
  
  private void refillImpl(_Index param_Index, boolean paramBoolean)
  {
    GMTrace.i(266153754624L, 1983);
    looperCheckBoth();
    if (this.mCallDestroyed.get())
    {
      GMTrace.o(266153754624L, 1983);
      return;
    }
    i locali = getLock(param_Index);
    synchronized (locali.fWT)
    {
      if (locali.xxu)
      {
        if (paramBoolean) {
          locali.iq = true;
        }
      }
      else
      {
        getAsync(param_Index);
        GMTrace.o(266153754624L, 1983);
        return;
      }
      locali.xxt = true;
    }
  }
  
  private boolean requestIndex(i<_Struct, _Index> parami, _Index param_Index)
  {
    GMTrace.i(267495931904L, 1993);
    if (invalidIndex(param_Index))
    {
      GMTrace.o(267495931904L, 1993);
      return false;
    }
    if (this.mCallDestroyed.get())
    {
      com.tencent.mm.vending.f.a.e("Vending", "Vending.destroyed() has called.", new Object[0]);
      GMTrace.o(267495931904L, 1993);
      return false;
    }
    f localf = this.mLoader;
    if (!localf.hKZ.get()) {}
    synchronized (localf.xxk)
    {
      localf.xxi.put(param_Index, Vending.f.b.xxn);
      localf.mVendingHandler.sendMessageAtFrontOfQueue(localf.mVendingHandler.obtainMessage(0, param_Index));
      requestIndexImpl(parami, param_Index);
      GMTrace.o(267495931904L, 1993);
      return true;
    }
  }
  
  public void addVendingDataChangedCallback(d paramd)
  {
    GMTrace.i(263469400064L, 1963);
    this.mDataChangedCallback.bT(paramd);
    GMTrace.o(263469400064L, 1963);
  }
  
  public void addVendingDataResolvedCallback(e parame)
  {
    GMTrace.i(263603617792L, 1964);
    this.mDataResolvedCallback.bT(parame);
    GMTrace.o(263603617792L, 1964);
  }
  
  public abstract void applyChangeSynchronized(_Change param_Change);
  
  public void callPrepareVendingData()
  {
    GMTrace.i(267630149632L, 1994);
    if (this.mCallDestroyed.get())
    {
      GMTrace.o(267630149632L, 1994);
      return;
    }
    com.tencent.mm.vending.f.a.i("Vending", "Vending.callPrepareVendingData()", new Object[0]);
    Object localObject = prepareVendingDataAsynchronous();
    this.mVendingSync.i(1, localObject);
    GMTrace.o(267630149632L, 1994);
  }
  
  public final void dead()
  {
    GMTrace.i(268435456000L, 2000);
    looperCheckBoth();
    com.tencent.mm.vending.f.a.i("Vending", "Vending.destroy()", new Object[0]);
    this.mCallDestroyed.set(true);
    this.mVendingHandler.removeCallbacksAndMessages(null);
    this.mSubscriberHandler.removeCallbacksAndMessages(null);
    this.mLoader.hKZ.set(true);
    this.mLoader.ckc();
    this.mVendingHandler.sendMessage(this.mVendingHandler.obtainMessage(2));
    GMTrace.o(268435456000L, 2000);
  }
  
  public void deadlock()
  {
    GMTrace.i(267227496448L, 1991);
    if (this.mDeadlock.xxg.yA != null)
    {
      com.tencent.mm.vending.f.a.e("Vending", "Catch deadlock! Tell Carl! .. " + this.mDeadlock.xxg.yA, new Object[0]);
      if (this.mDeadlock.xxh == null) {}
    }
    synchronized (this.mDeadlock.xxh.fWT)
    {
      this.mDeadlock.xxh.fWT.notify();
      this.mDeadlock.reset();
      GMTrace.o(267227496448L, 1991);
      return;
    }
  }
  
  public Vending<_Struct, _Index, _Change>.h defer(_Index param_Index)
  {
    GMTrace.i(264543141888L, 1971);
    looperCheckForVending();
    if (!this.mResolveFromVending)
    {
      com.tencent.mm.vending.f.a.w("Vending", "Please call defer in resolveAsynchronous()", new Object[0]);
      GMTrace.o(264543141888L, 1971);
      return null;
    }
    getLock(param_Index).xwR = true;
    param_Index = new h(param_Index);
    this.mVendingDeferring.add(param_Index);
    GMTrace.o(264543141888L, 1971);
    return param_Index;
  }
  
  public void deferResolved(Vending<_Struct, _Index, _Change>.h arg1, _Index param_Index, _Struct param_Struct)
  {
    GMTrace.i(264677359616L, 1972);
    if (!this.mVendingDeferring.contains(???))
    {
      GMTrace.o(264677359616L, 1972);
      return;
    }
    i locali = getLock(param_Index);
    synchronized (locali.fWT)
    {
      locali.xwR = false;
      lockResolved(locali, param_Index, param_Struct);
      notifyDataLoadedIfNeed(locali);
      GMTrace.o(264677359616L, 1972);
      return;
    }
  }
  
  public abstract void destroyAsynchronous();
  
  public void freezeDataChange()
  {
    GMTrace.i(266824843264L, 1988);
    if (this.mCallDestroyed.get())
    {
      GMTrace.o(266824843264L, 1988);
      return;
    }
    synchronized (this.mPendingDataChangeLock)
    {
      this.mFreezeDataChange = true;
      GMTrace.o(266824843264L, 1988);
      return;
    }
  }
  
  public <T> T get(_Index param_Index)
  {
    GMTrace.i(264945795072L, 1974);
    param_Index = getSync(param_Index);
    GMTrace.o(264945795072L, 1974);
    return param_Index;
  }
  
  f<_Index> getLoader()
  {
    GMTrace.i(263335182336L, 1962);
    f localf = this.mLoader;
    GMTrace.o(263335182336L, 1962);
    return localf;
  }
  
  protected i<_Struct, _Index> getLock(_Index param_Index)
  {
    GMTrace.i(264274706432L, 1969);
    synchronized (this.mArrayDataLock)
    {
      i locali2 = (i)this.mArray.get(param_Index);
      i locali1 = locali2;
      if (locali2 == null)
      {
        locali1 = new i();
        this.mArray.put(param_Index, locali1);
      }
      GMTrace.o(264274706432L, 1969);
      return locali1;
    }
  }
  
  public Looper getLooper()
  {
    GMTrace.i(268301238272L, 1999);
    Looper localLooper = this.mVendingLooper;
    GMTrace.o(268301238272L, 1999);
    return localLooper;
  }
  
  protected boolean invalidIndex(_Index param_Index)
  {
    GMTrace.i(265616883712L, 1979);
    GMTrace.o(265616883712L, 1979);
    return false;
  }
  
  public boolean loadFromVending(i<_Struct, _Index> parami, _Index param_Index)
  {
    GMTrace.i(265348448256L, 1977);
    synchronized (parami.fWT)
    {
      if ((!parami.xxu) || (parami.iq) || (parami.xxt))
      {
        this.mResolveFromVending = true;
        Object localObject = resolveAsynchronous(param_Index);
        this.mResolveFromVending = false;
        if (parami.xwR)
        {
          GMTrace.o(265348448256L, 1977);
          return false;
        }
        lockResolved(parami, param_Index, localObject);
        GMTrace.o(265348448256L, 1977);
        return false;
      }
      GMTrace.o(265348448256L, 1977);
      return true;
    }
  }
  
  protected void loaderClear()
  {
    GMTrace.i(267093278720L, 1990);
    GMTrace.o(267093278720L, 1990);
  }
  
  protected void looperCheckBoth()
  {
    GMTrace.i(268972326912L, 2004);
    Looper localLooper = Looper.myLooper();
    if ((localLooper != this.mSubscriberLooper) && (localLooper != this.mVendingLooper)) {
      throw new IllegalAccessError("Call from wrong looper");
    }
    GMTrace.o(268972326912L, 2004);
  }
  
  protected void looperCheckForSubscriber()
  {
    GMTrace.i(268838109184L, 2003);
    if (Looper.myLooper() != this.mSubscriberLooper) {
      throw new IllegalAccessError("Call from wrong looper");
    }
    GMTrace.o(268838109184L, 2003);
  }
  
  public void looperCheckForVending()
  {
    GMTrace.i(268703891456L, 2002);
    if (Looper.myLooper() != this.mVendingLooper) {
      throw new IllegalAccessError("Call from wrong looper");
    }
    GMTrace.o(268703891456L, 2002);
  }
  
  public void notifyDataLoadedIfNeed(i<_Struct, _Index> parami)
  {
    GMTrace.i(264006270976L, 1967);
    if (parami.xxv)
    {
      parami.xxv = false;
      GMTrace.o(264006270976L, 1967);
      return;
    }
    this.mSubscriberHandler.sendMessage(this.mSubscriberHandler.obtainMessage(1, parami));
    GMTrace.o(264006270976L, 1967);
  }
  
  public void notifyVendingDataChange()
  {
    GMTrace.i(266422190080L, 1985);
    notifyVendingDataChange(false);
    GMTrace.o(266422190080L, 1985);
  }
  
  public void notifyVendingDataChangeSynchronize()
  {
    GMTrace.i(266556407808L, 1986);
    notifyVendingDataChange(true);
    GMTrace.o(266556407808L, 1986);
  }
  
  public void onDataResolved(_Index param_Index, _Struct param_Struct)
  {
    GMTrace.i(268569673728L, 2001);
    if (this.mCallDestroyed.get())
    {
      GMTrace.o(268569673728L, 2001);
      return;
    }
    if (this.mDataResolvedCallback != null) {
      this.mDataResolvedCallback.a(g.bZ(param_Index));
    }
    GMTrace.o(268569673728L, 2001);
  }
  
  public <T> T peek(_Index param_Index)
  {
    GMTrace.i(264811577344L, 1973);
    if (this.mCallDestroyed.get())
    {
      GMTrace.o(264811577344L, 1973);
      return null;
    }
    if (invalidIndex(param_Index))
    {
      GMTrace.o(264811577344L, 1973);
      return null;
    }
    param_Index = peekLock(param_Index);
    if (param_Index == null)
    {
      GMTrace.o(264811577344L, 1973);
      return null;
    }
    if (param_Index.iq)
    {
      GMTrace.o(264811577344L, 1973);
      return null;
    }
    param_Index = param_Index.xxs;
    GMTrace.o(264811577344L, 1973);
    return param_Index;
  }
  
  protected i<_Struct, _Index> peekLock(_Index param_Index)
  {
    GMTrace.i(264408924160L, 1970);
    synchronized (this.mArrayDataLock)
    {
      param_Index = (i)this.mArray.get(param_Index);
      GMTrace.o(264408924160L, 1970);
      return param_Index;
    }
  }
  
  public abstract _Change prepareVendingDataAsynchronous();
  
  public void request(_Index param_Index)
  {
    GMTrace.i(265885319168L, 1981);
    refillImpl(param_Index, false);
    GMTrace.o(265885319168L, 1981);
  }
  
  public void requestConsistent(_Index param_Index)
  {
    GMTrace.i(266019536896L, 1982);
    refillImpl(param_Index, true);
    GMTrace.o(266019536896L, 1982);
  }
  
  protected void requestIndexImpl(i<_Struct, _Index> parami, _Index param_Index)
  {
    GMTrace.i(267361714176L, 1992);
    GMTrace.o(267361714176L, 1992);
  }
  
  public abstract _Struct resolveAsynchronous(_Index param_Index);
  
  public void resolvedClear()
  {
    GMTrace.i(266287972352L, 1984);
    looperCheckBoth();
    if (this.mCallDestroyed.get())
    {
      GMTrace.o(266287972352L, 1984);
      return;
    }
    this.mVendingSync.i(3, null);
    GMTrace.o(266287972352L, 1984);
  }
  
  protected void synchronizing(int paramInt, Object paramObject)
  {
    GMTrace.i(264140488704L, 1968);
    GMTrace.o(264140488704L, 1968);
  }
  
  public void unfreezeDataChange()
  {
    GMTrace.i(266959060992L, 1989);
    if (this.mCallDestroyed.get())
    {
      GMTrace.o(266959060992L, 1989);
      return;
    }
    synchronized (this.mPendingDataChangeLock)
    {
      this.mFreezeDataChange = false;
      if (this.mHasPendingDataChange)
      {
        notifyVendingDataChange();
        this.mHasPendingDataChange = false;
      }
      GMTrace.o(266959060992L, 1989);
      return;
    }
  }
  
  private static final class a<T>
  {
    volatile T yA;
    
    public a()
    {
      GMTrace.i(260382392320L, 1940);
      GMTrace.o(260382392320L, 1940);
    }
  }
  
  private static abstract interface b
  {
    public abstract void cjZ();
  }
  
  private static final class c<_Index>
  {
    Vending.a<_Index> xxg;
    Vending.i xxh;
    
    public c()
    {
      GMTrace.i(260785045504L, 1943);
      this.xxg = new Vending.a();
      GMTrace.o(260785045504L, 1943);
    }
    
    public final void reset()
    {
      GMTrace.i(260919263232L, 1944);
      this.xxg.yA = null;
      this.xxh = null;
      GMTrace.o(260919263232L, 1944);
    }
  }
  
  public static abstract interface d
  {
    public abstract void bpH();
  }
  
  public static abstract interface e<_Index>
  {
    public abstract void bR(_Index param_Index);
  }
  
  public static final class f<_Index>
  {
    public AtomicBoolean hKZ;
    Handler mVendingHandler;
    HashMap<_Index, b> xxi;
    public a<_Index> xxj;
    byte[] xxk;
    
    protected f(Looper paramLooper, a<_Index> parama)
    {
      GMTrace.i(262529875968L, 1956);
      this.xxi = new HashMap();
      this.xxj = null;
      this.hKZ = new AtomicBoolean(false);
      this.xxk = new byte[0];
      this.xxj = parama;
      this.mVendingHandler = new Handler(paramLooper)
      {
        public final void handleMessage(Message arg1)
        {
          GMTrace.i(261590351872L, 1949);
          if (Vending.f.this.hKZ.get())
          {
            Vending.f.this.xxj.cancel();
            GMTrace.o(261590351872L, 1949);
            return;
          }
          Object localObject1 = ???.obj;
          Vending.f.this.xxj.bS(localObject1);
          synchronized (Vending.f.this.xxk)
          {
            Vending.f.this.xxi.put(localObject1, Vending.f.b.xxo);
            GMTrace.o(261590351872L, 1949);
            return;
          }
        }
      };
      GMTrace.o(262529875968L, 1956);
    }
    
    protected final void ckc()
    {
      GMTrace.i(262664093696L, 1957);
      this.mVendingHandler.removeCallbacksAndMessages(null);
      com.tencent.mm.vending.f.a.i("Vending.Loader", "clear()", new Object[0]);
      synchronized (this.xxk)
      {
        this.xxi.clear();
        this.xxj.cancel();
        GMTrace.o(262664093696L, 1957);
        return;
      }
    }
    
    protected static abstract interface a<_Index>
    {
      public abstract void bS(_Index param_Index);
      
      public abstract void cancel();
    }
    
    public static enum b
    {
      static
      {
        GMTrace.i(262395658240L, 1955);
        xxm = new b("NIL", 0);
        xxn = new b("PENDING", 1);
        xxo = new b("FILLED", 2);
        xxp = new b[] { xxm, xxn, xxo };
        GMTrace.o(262395658240L, 1955);
      }
      
      private b()
      {
        GMTrace.i(262261440512L, 1954);
        GMTrace.o(262261440512L, 1954);
      }
    }
  }
  
  static final class g<K, V>
    extends HashMap<K, V>
  {
    Vending.b xxq;
    
    g()
    {
      GMTrace.i(262798311424L, 1958);
      this.xxq = null;
      GMTrace.o(262798311424L, 1958);
    }
    
    public final void clear()
    {
      GMTrace.i(262932529152L, 1959);
      super.clear();
      if (this.xxq != null) {
        this.xxq.cjZ();
      }
      GMTrace.o(262932529152L, 1959);
    }
  }
  
  public final class h
  {
    public _Index xxr;
    
    h()
    {
      GMTrace.i(263066746880L, 1960);
      Object localObject;
      this.xxr = localObject;
      GMTrace.o(263066746880L, 1960);
    }
  }
  
  static final class i<_Struct, _Index>
  {
    public byte[] fWT;
    public boolean iq;
    public boolean xwR;
    public _Index xxr;
    public _Struct xxs;
    public boolean xxt;
    public boolean xxu;
    public boolean xxv;
    
    i()
    {
      GMTrace.i(263200964608L, 1961);
      this.fWT = new byte[0];
      this.iq = false;
      this.xxt = false;
      this.xxu = false;
      this.xwR = false;
      this.xxv = false;
      GMTrace.o(263200964608L, 1961);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\vending\base\Vending.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */