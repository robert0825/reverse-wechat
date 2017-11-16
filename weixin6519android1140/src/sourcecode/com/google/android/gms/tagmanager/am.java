package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Message;
import com.google.android.gms.common.api.Status;

final class am
  implements b
{
  private a azN;
  private a azO;
  private Status azP;
  private b azQ;
  a azR;
  boolean azS;
  private d azT;
  
  /* Error */
  public final void az(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 29	com/google/android/gms/tagmanager/am:azS	Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: getfield 31	com/google/android/gms/tagmanager/am:azN	Lcom/google/android/gms/tagmanager/a;
    //   18: invokevirtual 37	com/google/android/gms/tagmanager/a:mi	()Lcom/google/android/gms/tagmanager/ac;
    //   21: aload_1
    //   22: invokevirtual 41	com/google/android/gms/tagmanager/ac:az	(Ljava/lang/String;)V
    //   25: goto -14 -> 11
    //   28: astore_1
    //   29: aload_0
    //   30: monitorexit
    //   31: aload_1
    //   32: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	33	0	this	am
    //   0	33	1	paramString	String
    //   6	2	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	7	28	finally
    //   14	25	28	finally
  }
  
  public final Status jT()
  {
    return this.azP;
  }
  
  final String mR()
  {
    if (this.azS)
    {
      m.mo();
      return "";
    }
    return this.azN.ayi;
  }
  
  final void mS()
  {
    if (this.azS) {
      m.mo();
    }
  }
  
  public final void refresh()
  {
    try
    {
      if (this.azS) {
        m.mo();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public final void release()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 29	com/google/android/gms/tagmanager/am:azS	Z
    //   6: ifeq +9 -> 15
    //   9: invokestatic 54	com/google/android/gms/tagmanager/m:mo	()V
    //   12: aload_0
    //   13: monitorexit
    //   14: return
    //   15: aload_0
    //   16: iconst_1
    //   17: putfield 29	com/google/android/gms/tagmanager/am:azS	Z
    //   20: aload_0
    //   21: getfield 65	com/google/android/gms/tagmanager/am:azT	Lcom/google/android/gms/tagmanager/d;
    //   24: getfield 71	com/google/android/gms/tagmanager/d:ayz	Ljava/util/concurrent/ConcurrentMap;
    //   27: aload_0
    //   28: invokeinterface 77 2 0
    //   33: pop
    //   34: aload_0
    //   35: getfield 31	com/google/android/gms/tagmanager/am:azN	Lcom/google/android/gms/tagmanager/a;
    //   38: aconst_null
    //   39: putfield 81	com/google/android/gms/tagmanager/a:ayj	Lcom/google/android/gms/tagmanager/ac;
    //   42: aload_0
    //   43: aconst_null
    //   44: putfield 31	com/google/android/gms/tagmanager/am:azN	Lcom/google/android/gms/tagmanager/a;
    //   47: aload_0
    //   48: aconst_null
    //   49: putfield 83	com/google/android/gms/tagmanager/am:azO	Lcom/google/android/gms/tagmanager/a;
    //   52: aload_0
    //   53: aconst_null
    //   54: putfield 85	com/google/android/gms/tagmanager/am:azR	Lcom/google/android/gms/tagmanager/am$a;
    //   57: aload_0
    //   58: aconst_null
    //   59: putfield 87	com/google/android/gms/tagmanager/am:azQ	Lcom/google/android/gms/tagmanager/am$b;
    //   62: goto -50 -> 12
    //   65: astore_1
    //   66: aload_0
    //   67: monitorexit
    //   68: aload_1
    //   69: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	70	0	this	am
    //   65	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	12	65	finally
    //   15	62	65	finally
  }
  
  public static abstract interface a
  {
    public abstract String mT();
  }
  
  private final class b
    extends Handler
  {
    public final void handleMessage(Message paramMessage)
    {
      switch (paramMessage.what)
      {
      default: 
        m.mo();
        return;
      }
      paramMessage = paramMessage.obj;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\tagmanager\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */