package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.content.c.a;
import android.support.v4.content.c.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

public final class t
  extends s
{
  public static boolean DEBUG = false;
  boolean mP;
  boolean oF;
  final String ok;
  public k oy;
  final android.support.v4.e.k<a> qJ = new android.support.v4.e.k();
  final android.support.v4.e.k<a> qK = new android.support.v4.e.k();
  boolean qL;
  
  t(String paramString, k paramk, boolean paramBoolean)
  {
    this.ok = paramString;
    this.oy = paramk;
    this.mP = paramBoolean;
  }
  
  private a a(int paramInt, Bundle paramBundle, s.a<Object> parama)
  {
    paramBundle = new a(paramInt, paramBundle, parama);
    paramBundle.qO = parama.K(paramInt);
    return paramBundle;
  }
  
  private a b(int paramInt, Bundle paramBundle, s.a<Object> parama)
  {
    try
    {
      this.qL = true;
      paramBundle = a(paramInt, null, parama);
      a(paramBundle);
      return paramBundle;
    }
    finally
    {
      this.qL = false;
    }
  }
  
  public final <D> android.support.v4.content.c<D> J(int paramInt)
  {
    if (this.qL) {
      throw new IllegalStateException("Called while creating a loader");
    }
    a locala = (a)this.qJ.get(paramInt);
    if (locala != null)
    {
      if (locala.qU != null) {
        return locala.qU.qO;
      }
      return locala.qO;
    }
    return null;
  }
  
  public final <D> android.support.v4.content.c<D> a(int paramInt, s.a<D> parama)
  {
    if (this.qL) {
      throw new IllegalStateException("Called while creating a loader");
    }
    a locala = (a)this.qJ.get(paramInt);
    if (DEBUG) {
      new StringBuilder("initLoader in ").append(this).append(": args=").append(null);
    }
    if (locala == null)
    {
      locala = b(paramInt, null, parama);
      parama = locala;
      if (DEBUG) {
        new StringBuilder("  Created new loader ").append(locala);
      }
    }
    for (parama = locala;; parama = locala)
    {
      if ((parama.qP) && (this.mP)) {
        parama.c(parama.qO, parama.mData);
      }
      return parama.qO;
      if (DEBUG) {
        new StringBuilder("  Re-using existing loader ").append(locala);
      }
      locala.qN = parama;
    }
  }
  
  final void a(a parama)
  {
    this.qJ.put(parama.mId, parama);
    if (this.mP) {
      parama.start();
    }
  }
  
  public final <D> android.support.v4.content.c<D> b(int paramInt, s.a<D> parama)
  {
    if (this.qL) {
      throw new IllegalStateException("Called while creating a loader");
    }
    a locala1 = (a)this.qJ.get(paramInt);
    if (DEBUG) {
      new StringBuilder("restartLoader in ").append(this).append(": args=").append(null);
    }
    a locala2;
    if (locala1 != null)
    {
      locala2 = (a)this.qK.get(paramInt);
      if (locala2 == null) {
        break label381;
      }
      if (!locala1.qP) {
        break label146;
      }
      if (DEBUG) {
        new StringBuilder("  Removing last inactive loader: ").append(locala1);
      }
      locala2.qQ = false;
      locala2.destroy();
    }
    for (;;)
    {
      locala1.qO.sJ = true;
      this.qK.put(paramInt, locala1);
      for (;;)
      {
        return b(paramInt, null, parama).qO;
        label146:
        if (locala1.mP) {
          break;
        }
        this.qJ.put(paramInt, null);
        locala1.destroy();
      }
      if (DEBUG) {
        new StringBuilder("  Canceling: ").append(locala1);
      }
      if ((locala1.mP) && (locala1.qO != null) && (locala1.qT))
      {
        if (DEBUG) {
          new StringBuilder("onLoadCanceled: ").append(locala1);
        }
        if ((!locala1.pM) && (locala1.qV.qJ.get(locala1.mId) == locala1))
        {
          locala2 = locala1.qU;
          if (locala2 != null)
          {
            if (DEBUG) {
              new StringBuilder("  Switching to pending loader: ").append(locala2);
            }
            locala1.qU = null;
            locala1.qV.qJ.put(locala1.mId, null);
            locala1.destroy();
            locala1.qV.a(locala2);
          }
        }
      }
      if (locala1.qU != null)
      {
        if (DEBUG) {
          new StringBuilder("  Removing pending loader: ").append(locala1.qU);
        }
        locala1.qU.destroy();
        locala1.qU = null;
      }
      locala1.qU = a(paramInt, null, parama);
      return locala1.qU.qO;
      label381:
      if (DEBUG) {
        new StringBuilder("  Making last loader inactive: ").append(locala1);
      }
    }
  }
  
  public final boolean bc()
  {
    int j = this.qJ.size();
    int i = 0;
    boolean bool2 = false;
    if (i < j)
    {
      a locala = (a)this.qJ.valueAt(i);
      if ((locala.mP) && (!locala.qQ)) {}
      for (boolean bool1 = true;; bool1 = false)
      {
        bool2 |= bool1;
        i += 1;
        break;
      }
    }
    return bool2;
  }
  
  final void bd()
  {
    if (DEBUG) {
      new StringBuilder("Starting in ").append(this);
    }
    if (this.mP)
    {
      new RuntimeException("here").fillInStackTrace();
      new StringBuilder("Called doStart when already started: ").append(this);
    }
    for (;;)
    {
      return;
      this.mP = true;
      int i = this.qJ.size() - 1;
      while (i >= 0)
      {
        ((a)this.qJ.valueAt(i)).start();
        i -= 1;
      }
    }
  }
  
  final void be()
  {
    if (DEBUG) {
      new StringBuilder("Stopping in ").append(this);
    }
    if (!this.mP)
    {
      new RuntimeException("here").fillInStackTrace();
      new StringBuilder("Called doStop when not started: ").append(this);
      return;
    }
    int i = this.qJ.size() - 1;
    while (i >= 0)
    {
      ((a)this.qJ.valueAt(i)).stop();
      i -= 1;
    }
    this.mP = false;
  }
  
  final void bf()
  {
    if (DEBUG) {
      new StringBuilder("Retaining in ").append(this);
    }
    if (!this.mP)
    {
      new RuntimeException("here").fillInStackTrace();
      new StringBuilder("Called doRetain when not started: ").append(this);
    }
    for (;;)
    {
      return;
      this.oF = true;
      this.mP = false;
      int i = this.qJ.size() - 1;
      while (i >= 0)
      {
        a locala = (a)this.qJ.valueAt(i);
        if (DEBUG) {
          new StringBuilder("  Retaining: ").append(locala);
        }
        locala.oF = true;
        locala.qR = locala.mP;
        locala.mP = false;
        locala.qN = null;
        i -= 1;
      }
    }
  }
  
  final void bg()
  {
    int i = this.qJ.size() - 1;
    while (i >= 0)
    {
      ((a)this.qJ.valueAt(i)).qS = true;
      i -= 1;
    }
  }
  
  final void bh()
  {
    int i = this.qJ.size() - 1;
    while (i >= 0)
    {
      a locala = (a)this.qJ.valueAt(i);
      if ((locala.mP) && (locala.qS))
      {
        locala.qS = false;
        if (locala.qP) {
          locala.c(locala.qO, locala.mData);
        }
      }
      i -= 1;
    }
  }
  
  final void bi()
  {
    if (!this.oF)
    {
      if (DEBUG) {
        new StringBuilder("Destroying Active in ").append(this);
      }
      i = this.qJ.size() - 1;
      while (i >= 0)
      {
        ((a)this.qJ.valueAt(i)).destroy();
        i -= 1;
      }
      this.qJ.clear();
    }
    if (DEBUG) {
      new StringBuilder("Destroying Inactive in ").append(this);
    }
    int i = this.qK.size() - 1;
    while (i >= 0)
    {
      ((a)this.qK.valueAt(i)).destroy();
      i -= 1;
    }
    this.qK.clear();
  }
  
  public final void destroyLoader(int paramInt)
  {
    if (this.qL) {
      throw new IllegalStateException("Called while creating a loader");
    }
    if (DEBUG) {
      new StringBuilder("destroyLoader in ").append(this).append(" of ").append(paramInt);
    }
    int i = this.qJ.indexOfKey(paramInt);
    a locala;
    if (i >= 0)
    {
      locala = (a)this.qJ.valueAt(i);
      this.qJ.removeAt(i);
      locala.destroy();
    }
    paramInt = this.qK.indexOfKey(paramInt);
    if (paramInt >= 0)
    {
      locala = (a)this.qK.valueAt(paramInt);
      this.qK.removeAt(paramInt);
      locala.destroy();
    }
    if ((this.oy != null) && (!bc())) {
      this.oy.ox.aX();
    }
  }
  
  public final void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    int j = 0;
    String str;
    int i;
    a locala;
    if (this.qJ.size() > 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Active Loaders:");
      str = paramString + "    ";
      i = 0;
      while (i < this.qJ.size())
      {
        locala = (a)this.qJ.valueAt(i);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(this.qJ.keyAt(i));
        paramPrintWriter.print(": ");
        paramPrintWriter.println(locala.toString());
        locala.dump(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
        i += 1;
      }
    }
    if (this.qK.size() > 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Inactive Loaders:");
      str = paramString + "    ";
      i = j;
      while (i < this.qK.size())
      {
        locala = (a)this.qK.valueAt(i);
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  #");
        paramPrintWriter.print(this.qK.keyAt(i));
        paramPrintWriter.print(": ");
        paramPrintWriter.println(locala.toString());
        locala.dump(str, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
        i += 1;
      }
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("LoaderManager{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" in ");
    android.support.v4.e.c.a(this.oy, localStringBuilder);
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
  
  final class a
    implements c.a<Object>, c.b<Object>
  {
    Object mData;
    final int mId;
    boolean mP;
    boolean oF;
    boolean pM;
    final Bundle qM;
    s.a<Object> qN;
    android.support.v4.content.c<Object> qO;
    boolean qP;
    boolean qQ;
    boolean qR;
    boolean qS;
    boolean qT;
    a qU;
    
    public a(Bundle paramBundle, s.a<Object> parama)
    {
      this.mId = paramBundle;
      this.qM = parama;
      s.a locala;
      this.qN = locala;
    }
    
    public final void b(android.support.v4.content.c<Object> paramc, Object paramObject)
    {
      if (t.DEBUG) {
        new StringBuilder("onLoadComplete: ").append(this);
      }
      if (this.pM) {}
      do
      {
        do
        {
          return;
        } while (t.this.qJ.get(this.mId) != this);
        a locala = this.qU;
        if (locala != null)
        {
          if (t.DEBUG) {
            new StringBuilder("  Switching to pending loader: ").append(locala);
          }
          this.qU = null;
          t.this.qJ.put(this.mId, null);
          destroy();
          t.this.a(locala);
          return;
        }
        if ((this.mData != paramObject) || (!this.qP))
        {
          this.mData = paramObject;
          this.qP = true;
          if (this.mP) {
            c(paramc, paramObject);
          }
        }
        paramc = (a)t.this.qK.get(this.mId);
        if ((paramc != null) && (paramc != this))
        {
          paramc.qQ = false;
          paramc.destroy();
          t.this.qK.remove(this.mId);
        }
      } while ((t.this.oy == null) || (t.this.bc()));
      t.this.oy.ox.aX();
    }
    
    final void c(android.support.v4.content.c<Object> paramc, Object paramObject)
    {
      String str;
      if (this.qN != null)
      {
        if (t.this.oy == null) {
          break label176;
        }
        str = t.this.oy.ox.pN;
        t.this.oy.ox.pN = "onLoadFinished";
      }
      for (;;)
      {
        try
        {
          if (t.DEBUG)
          {
            StringBuilder localStringBuilder1 = new StringBuilder("  onLoadFinished in ").append(paramc).append(": ");
            StringBuilder localStringBuilder2 = new StringBuilder(64);
            android.support.v4.e.c.a(paramObject, localStringBuilder2);
            localStringBuilder2.append("}");
            localStringBuilder1.append(localStringBuilder2.toString());
          }
          this.qN.a(paramc, paramObject);
          if (t.this.oy != null) {
            t.this.oy.ox.pN = str;
          }
          this.qQ = true;
          return;
        }
        finally
        {
          if (t.this.oy != null) {
            t.this.oy.ox.pN = str;
          }
        }
        label176:
        str = null;
      }
    }
    
    final void destroy()
    {
      a locala = this;
      if (t.DEBUG) {
        new StringBuilder("  Destroying: ").append(locala);
      }
      locala.pM = true;
      boolean bool = locala.qQ;
      locala.qQ = false;
      Object localObject;
      if ((locala.qN != null) && (locala.qO != null) && (locala.qP) && (bool))
      {
        if (t.DEBUG) {
          new StringBuilder("  Reseting: ").append(locala);
        }
        if (locala.qV.oy == null) {
          break label245;
        }
        localObject = locala.qV.oy.ox.pN;
        locala.qV.oy.ox.pN = "onLoaderReset";
      }
      for (;;)
      {
        if (locala.qV.oy != null) {
          locala.qV.oy.ox.pN = ((String)localObject);
        }
        locala.qN = null;
        locala.mData = null;
        locala.qP = false;
        if (locala.qO != null)
        {
          if (locala.qT)
          {
            locala.qT = false;
            locala.qO.a(locala);
            locala.qO.a(locala);
          }
          localObject = locala.qO;
          ((android.support.v4.content.c)localObject).onReset();
          ((android.support.v4.content.c)localObject).sK = true;
          ((android.support.v4.content.c)localObject).mP = false;
          ((android.support.v4.content.c)localObject).sJ = false;
          ((android.support.v4.content.c)localObject).sL = false;
          ((android.support.v4.content.c)localObject).sM = false;
        }
        if (locala.qU != null)
        {
          locala = locala.qU;
          break;
        }
        return;
        label245:
        localObject = null;
      }
    }
    
    public final void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
    {
      String str = paramString;
      paramString = this;
      for (;;)
      {
        paramPrintWriter.print(str);
        paramPrintWriter.print("mId=");
        paramPrintWriter.print(paramString.mId);
        paramPrintWriter.print(" mArgs=");
        paramPrintWriter.println(paramString.qM);
        paramPrintWriter.print(str);
        paramPrintWriter.print("mCallbacks=");
        paramPrintWriter.println(paramString.qN);
        paramPrintWriter.print(str);
        paramPrintWriter.print("mLoader=");
        paramPrintWriter.println(paramString.qO);
        if (paramString.qO != null) {
          paramString.qO.dump(str + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
        }
        if ((paramString.qP) || (paramString.qQ))
        {
          paramPrintWriter.print(str);
          paramPrintWriter.print("mHaveData=");
          paramPrintWriter.print(paramString.qP);
          paramPrintWriter.print("  mDeliveredData=");
          paramPrintWriter.println(paramString.qQ);
          paramPrintWriter.print(str);
          paramPrintWriter.print("mData=");
          paramPrintWriter.println(paramString.mData);
        }
        paramPrintWriter.print(str);
        paramPrintWriter.print("mStarted=");
        paramPrintWriter.print(paramString.mP);
        paramPrintWriter.print(" mReportNextStart=");
        paramPrintWriter.print(paramString.qS);
        paramPrintWriter.print(" mDestroyed=");
        paramPrintWriter.println(paramString.pM);
        paramPrintWriter.print(str);
        paramPrintWriter.print("mRetaining=");
        paramPrintWriter.print(paramString.oF);
        paramPrintWriter.print(" mRetainingStarted=");
        paramPrintWriter.print(paramString.qR);
        paramPrintWriter.print(" mListenerRegistered=");
        paramPrintWriter.println(paramString.qT);
        if (paramString.qU == null) {
          break;
        }
        paramPrintWriter.print(str);
        paramPrintWriter.println("Pending Loader ");
        paramPrintWriter.print(paramString.qU);
        paramPrintWriter.println(":");
        paramString = paramString.qU;
        str = str + "  ";
      }
    }
    
    final void start()
    {
      if ((this.oF) && (this.qR)) {
        this.mP = true;
      }
      do
      {
        do
        {
          return;
        } while (this.mP);
        this.mP = true;
        if (t.DEBUG) {
          new StringBuilder("  Starting: ").append(this);
        }
        if ((this.qO == null) && (this.qN != null)) {
          this.qO = this.qN.K(this.mId);
        }
      } while (this.qO == null);
      if ((this.qO.getClass().isMemberClass()) && (!Modifier.isStatic(this.qO.getClass().getModifiers()))) {
        throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + this.qO);
      }
      if (!this.qT)
      {
        localc = this.qO;
        int i = this.mId;
        if (localc.sH != null) {
          throw new IllegalStateException("There is already a listener registered");
        }
        localc.sH = this;
        localc.mId = i;
        localc = this.qO;
        if (localc.sI != null) {
          throw new IllegalStateException("There is already a listener registered");
        }
        localc.sI = this;
        this.qT = true;
      }
      android.support.v4.content.c localc = this.qO;
      localc.mP = true;
      localc.sK = false;
      localc.sJ = false;
      localc.onStartLoading();
    }
    
    final void stop()
    {
      if (t.DEBUG) {
        new StringBuilder("  Stopping: ").append(this);
      }
      this.mP = false;
      if ((!this.oF) && (this.qO != null) && (this.qT))
      {
        this.qT = false;
        this.qO.a(this);
        this.qO.a(this);
        android.support.v4.content.c localc = this.qO;
        localc.mP = false;
        localc.onStopLoading();
      }
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder(64);
      localStringBuilder.append("LoaderInfo{");
      localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      localStringBuilder.append(" #");
      localStringBuilder.append(this.mId);
      localStringBuilder.append(" : ");
      android.support.v4.e.c.a(this.qO, localStringBuilder);
      localStringBuilder.append("}}");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\app\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */