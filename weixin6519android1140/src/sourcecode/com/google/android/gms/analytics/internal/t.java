package com.google.android.gms.analytics.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.RemoteException;
import com.google.android.gms.c.ah;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.common.stats.b;
import java.util.Collections;
import java.util.List;

public final class t
  extends o
{
  public final a adm;
  d adn;
  private final ae ado;
  private j adp;
  
  protected t(q paramq)
  {
    super(paramq);
    this.adp = new j(paramq.acz);
    this.adm = new a();
    this.ado = new ae(paramq)
    {
      public final void run()
      {
        t.this.iM();
      }
    };
  }
  
  public final boolean connect()
  {
    q.iK();
    iC();
    if (this.adn != null) {
      return true;
    }
    d locald = this.adm.iN();
    if (locald != null)
    {
      this.adn = locald;
      iL();
      return true;
    }
    return false;
  }
  
  public final boolean d(c paramc)
  {
    w.aa(paramc);
    q.iK();
    iC();
    d locald = this.adn;
    if (locald == null) {
      return false;
    }
    if (paramc.acc) {}
    for (String str = ac.jo();; str = ac.jp())
    {
      List localList = Collections.emptyList();
      try
      {
        locald.a(paramc.abX, paramc.aca, str, localList);
        iL();
        return true;
      }
      catch (RemoteException paramc)
      {
        N("Failed to send hits to AnalyticsService");
      }
    }
    return false;
  }
  
  public final void disconnect()
  {
    q.iK();
    iC();
    try
    {
      b.kU().a(this.ack.mContext, this.adm);
      if (this.adn != null)
      {
        this.adn = null;
        this.ack.iG().iw();
      }
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;) {}
    }
    catch (IllegalStateException localIllegalStateException)
    {
      for (;;) {}
    }
  }
  
  protected final void hS() {}
  
  void iL()
  {
    this.adp.start();
    this.ado.m(((Long)aj.aeY.get()).longValue());
  }
  
  public final void iM()
  {
    
    if (!isConnected()) {
      return;
    }
    N("Inactivity, disconnecting from device AnalyticsService");
    disconnect();
  }
  
  public final boolean isConnected()
  {
    q.iK();
    iC();
    return this.adn != null;
  }
  
  protected final class a
    implements ServiceConnection
  {
    private volatile d adr;
    private volatile boolean ads;
    
    protected a() {}
    
    /* Error */
    public final d iN()
    {
      // Byte code:
      //   0: invokestatic 36	com/google/android/gms/analytics/internal/q:iK	()V
      //   3: new 38	android/content/Intent
      //   6: dup
      //   7: ldc 40
      //   9: invokespecial 43	android/content/Intent:<init>	(Ljava/lang/String;)V
      //   12: astore_2
      //   13: aload_2
      //   14: new 45	android/content/ComponentName
      //   17: dup
      //   18: ldc 47
      //   20: ldc 49
      //   22: invokespecial 52	android/content/ComponentName:<init>	(Ljava/lang/String;Ljava/lang/String;)V
      //   25: invokevirtual 56	android/content/Intent:setComponent	(Landroid/content/ComponentName;)Landroid/content/Intent;
      //   28: pop
      //   29: aload_0
      //   30: getfield 23	com/google/android/gms/analytics/internal/t$a:adq	Lcom/google/android/gms/analytics/internal/t;
      //   33: getfield 62	com/google/android/gms/analytics/internal/n:ack	Lcom/google/android/gms/analytics/internal/q;
      //   36: getfield 66	com/google/android/gms/analytics/internal/q:mContext	Landroid/content/Context;
      //   39: astore_3
      //   40: aload_2
      //   41: ldc 68
      //   43: aload_3
      //   44: invokevirtual 74	android/content/Context:getPackageName	()Ljava/lang/String;
      //   47: invokevirtual 78	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
      //   50: pop
      //   51: invokestatic 84	com/google/android/gms/common/stats/b:kU	()Lcom/google/android/gms/common/stats/b;
      //   54: astore 4
      //   56: aload_0
      //   57: monitorenter
      //   58: aload_0
      //   59: aconst_null
      //   60: putfield 86	com/google/android/gms/analytics/internal/t$a:adr	Lcom/google/android/gms/analytics/internal/d;
      //   63: aload_0
      //   64: iconst_1
      //   65: putfield 88	com/google/android/gms/analytics/internal/t$a:ads	Z
      //   68: aload 4
      //   70: aload_3
      //   71: aload_2
      //   72: aload_0
      //   73: getfield 23	com/google/android/gms/analytics/internal/t$a:adq	Lcom/google/android/gms/analytics/internal/t;
      //   76: getfield 92	com/google/android/gms/analytics/internal/t:adm	Lcom/google/android/gms/analytics/internal/t$a;
      //   79: sipush 129
      //   82: invokevirtual 95	com/google/android/gms/common/stats/b:a	(Landroid/content/Context;Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
      //   85: istore_1
      //   86: aload_0
      //   87: getfield 23	com/google/android/gms/analytics/internal/t$a:adq	Lcom/google/android/gms/analytics/internal/t;
      //   90: ldc 97
      //   92: iload_1
      //   93: invokestatic 103	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
      //   96: invokevirtual 107	com/google/android/gms/analytics/internal/t:c	(Ljava/lang/String;Ljava/lang/Object;)V
      //   99: iload_1
      //   100: ifne +12 -> 112
      //   103: aload_0
      //   104: iconst_0
      //   105: putfield 88	com/google/android/gms/analytics/internal/t$a:ads	Z
      //   108: aload_0
      //   109: monitorexit
      //   110: aconst_null
      //   111: areturn
      //   112: aload_0
      //   113: getstatic 113	com/google/android/gms/analytics/internal/aj:aeZ	Lcom/google/android/gms/analytics/internal/aj$a;
      //   116: invokevirtual 119	com/google/android/gms/analytics/internal/aj$a:get	()Ljava/lang/Object;
      //   119: checkcast 121	java/lang/Long
      //   122: invokevirtual 125	java/lang/Long:longValue	()J
      //   125: invokevirtual 129	java/lang/Object:wait	(J)V
      //   128: aload_0
      //   129: iconst_0
      //   130: putfield 88	com/google/android/gms/analytics/internal/t$a:ads	Z
      //   133: aload_0
      //   134: getfield 86	com/google/android/gms/analytics/internal/t$a:adr	Lcom/google/android/gms/analytics/internal/d;
      //   137: astore_2
      //   138: aload_0
      //   139: aconst_null
      //   140: putfield 86	com/google/android/gms/analytics/internal/t$a:adr	Lcom/google/android/gms/analytics/internal/d;
      //   143: aload_2
      //   144: ifnonnull +12 -> 156
      //   147: aload_0
      //   148: getfield 23	com/google/android/gms/analytics/internal/t$a:adq	Lcom/google/android/gms/analytics/internal/t;
      //   151: ldc -125
      //   153: invokevirtual 134	com/google/android/gms/analytics/internal/t:R	(Ljava/lang/String;)V
      //   156: aload_0
      //   157: monitorexit
      //   158: aload_2
      //   159: areturn
      //   160: astore_2
      //   161: aload_0
      //   162: monitorexit
      //   163: aload_2
      //   164: athrow
      //   165: astore_2
      //   166: aload_0
      //   167: getfield 23	com/google/android/gms/analytics/internal/t$a:adq	Lcom/google/android/gms/analytics/internal/t;
      //   170: ldc -120
      //   172: invokevirtual 139	com/google/android/gms/analytics/internal/t:Q	(Ljava/lang/String;)V
      //   175: goto -47 -> 128
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	178	0	this	a
      //   85	15	1	bool	boolean
      //   12	147	2	localObject1	Object
      //   160	4	2	localObject2	Object
      //   165	1	2	localInterruptedException	InterruptedException
      //   39	32	3	localContext	android.content.Context
      //   54	15	4	localb	b
      // Exception table:
      //   from	to	target	type
      //   58	99	160	finally
      //   103	110	160	finally
      //   112	128	160	finally
      //   128	143	160	finally
      //   147	156	160	finally
      //   156	158	160	finally
      //   161	163	160	finally
      //   166	175	160	finally
      //   112	128	165	java/lang/InterruptedException
    }
    
    /* Error */
    public final void onServiceConnected(final ComponentName paramComponentName, android.os.IBinder paramIBinder)
    {
      // Byte code:
      //   0: ldc -109
      //   2: invokestatic 152	com/google/android/gms/common/internal/w:ag	(Ljava/lang/String;)V
      //   5: aload_0
      //   6: monitorenter
      //   7: aload_2
      //   8: ifnonnull +19 -> 27
      //   11: aload_0
      //   12: getfield 23	com/google/android/gms/analytics/internal/t$a:adq	Lcom/google/android/gms/analytics/internal/t;
      //   15: ldc -102
      //   17: invokevirtual 134	com/google/android/gms/analytics/internal/t:R	(Ljava/lang/String;)V
      //   20: aload_0
      //   21: invokevirtual 157	java/lang/Object:notifyAll	()V
      //   24: aload_0
      //   25: monitorexit
      //   26: return
      //   27: aconst_null
      //   28: astore 4
      //   30: aconst_null
      //   31: astore_3
      //   32: aload 4
      //   34: astore_1
      //   35: aload_2
      //   36: invokeinterface 162 1 0
      //   41: astore 5
      //   43: aload 4
      //   45: astore_1
      //   46: ldc -92
      //   48: aload 5
      //   50: invokevirtual 170	java/lang/String:equals	(Ljava/lang/Object;)Z
      //   53: ifeq +63 -> 116
      //   56: aload 4
      //   58: astore_1
      //   59: aload_2
      //   60: invokestatic 176	com/google/android/gms/analytics/internal/d$a:d	(Landroid/os/IBinder;)Lcom/google/android/gms/analytics/internal/d;
      //   63: astore_2
      //   64: aload_2
      //   65: astore_1
      //   66: aload_0
      //   67: getfield 23	com/google/android/gms/analytics/internal/t$a:adq	Lcom/google/android/gms/analytics/internal/t;
      //   70: ldc -78
      //   72: invokevirtual 181	com/google/android/gms/analytics/internal/t:N	(Ljava/lang/String;)V
      //   75: aload_2
      //   76: astore_1
      //   77: aload_1
      //   78: ifnonnull +77 -> 155
      //   81: invokestatic 84	com/google/android/gms/common/stats/b:kU	()Lcom/google/android/gms/common/stats/b;
      //   84: aload_0
      //   85: getfield 23	com/google/android/gms/analytics/internal/t$a:adq	Lcom/google/android/gms/analytics/internal/t;
      //   88: getfield 62	com/google/android/gms/analytics/internal/n:ack	Lcom/google/android/gms/analytics/internal/q;
      //   91: getfield 66	com/google/android/gms/analytics/internal/q:mContext	Landroid/content/Context;
      //   94: aload_0
      //   95: getfield 23	com/google/android/gms/analytics/internal/t$a:adq	Lcom/google/android/gms/analytics/internal/t;
      //   98: getfield 92	com/google/android/gms/analytics/internal/t:adm	Lcom/google/android/gms/analytics/internal/t$a;
      //   101: invokevirtual 184	com/google/android/gms/common/stats/b:a	(Landroid/content/Context;Landroid/content/ServiceConnection;)V
      //   104: aload_0
      //   105: invokevirtual 157	java/lang/Object:notifyAll	()V
      //   108: aload_0
      //   109: monitorexit
      //   110: return
      //   111: astore_1
      //   112: aload_0
      //   113: monitorexit
      //   114: aload_1
      //   115: athrow
      //   116: aload 4
      //   118: astore_1
      //   119: aload_0
      //   120: getfield 23	com/google/android/gms/analytics/internal/t$a:adq	Lcom/google/android/gms/analytics/internal/t;
      //   123: ldc -70
      //   125: aload 5
      //   127: invokevirtual 189	com/google/android/gms/analytics/internal/t:f	(Ljava/lang/String;Ljava/lang/Object;)V
      //   130: aload_3
      //   131: astore_1
      //   132: goto -55 -> 77
      //   135: astore_2
      //   136: aload_0
      //   137: getfield 23	com/google/android/gms/analytics/internal/t$a:adq	Lcom/google/android/gms/analytics/internal/t;
      //   140: ldc -65
      //   142: invokevirtual 134	com/google/android/gms/analytics/internal/t:R	(Ljava/lang/String;)V
      //   145: goto -68 -> 77
      //   148: astore_1
      //   149: aload_0
      //   150: invokevirtual 157	java/lang/Object:notifyAll	()V
      //   153: aload_1
      //   154: athrow
      //   155: aload_0
      //   156: getfield 88	com/google/android/gms/analytics/internal/t$a:ads	Z
      //   159: ifne +37 -> 196
      //   162: aload_0
      //   163: getfield 23	com/google/android/gms/analytics/internal/t$a:adq	Lcom/google/android/gms/analytics/internal/t;
      //   166: ldc -63
      //   168: invokevirtual 139	com/google/android/gms/analytics/internal/t:Q	(Ljava/lang/String;)V
      //   171: aload_0
      //   172: getfield 23	com/google/android/gms/analytics/internal/t$a:adq	Lcom/google/android/gms/analytics/internal/t;
      //   175: getfield 62	com/google/android/gms/analytics/internal/n:ack	Lcom/google/android/gms/analytics/internal/q;
      //   178: invokevirtual 197	com/google/android/gms/analytics/internal/q:iF	()Lcom/google/android/gms/c/ah;
      //   181: new 11	com/google/android/gms/analytics/internal/t$a$1
      //   184: dup
      //   185: aload_0
      //   186: aload_1
      //   187: invokespecial 200	com/google/android/gms/analytics/internal/t$a$1:<init>	(Lcom/google/android/gms/analytics/internal/t$a;Lcom/google/android/gms/analytics/internal/d;)V
      //   190: invokevirtual 205	com/google/android/gms/c/ah:c	(Ljava/lang/Runnable;)V
      //   193: goto -89 -> 104
      //   196: aload_0
      //   197: aload_1
      //   198: putfield 86	com/google/android/gms/analytics/internal/t$a:adr	Lcom/google/android/gms/analytics/internal/d;
      //   201: goto -97 -> 104
      //   204: astore_1
      //   205: goto -101 -> 104
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	208	0	this	a
      //   0	208	1	paramComponentName	ComponentName
      //   0	208	2	paramIBinder	android.os.IBinder
      //   31	100	3	localObject1	Object
      //   28	89	4	localObject2	Object
      //   41	85	5	str	String
      // Exception table:
      //   from	to	target	type
      //   20	26	111	finally
      //   104	110	111	finally
      //   112	114	111	finally
      //   149	155	111	finally
      //   35	43	135	android/os/RemoteException
      //   46	56	135	android/os/RemoteException
      //   59	64	135	android/os/RemoteException
      //   66	75	135	android/os/RemoteException
      //   119	130	135	android/os/RemoteException
      //   11	20	148	finally
      //   35	43	148	finally
      //   46	56	148	finally
      //   59	64	148	finally
      //   66	75	148	finally
      //   81	104	148	finally
      //   119	130	148	finally
      //   136	145	148	finally
      //   155	193	148	finally
      //   196	201	148	finally
      //   81	104	204	java/lang/IllegalArgumentException
    }
    
    public final void onServiceDisconnected(final ComponentName paramComponentName)
    {
      w.ag("AnalyticsServiceConnection.onServiceDisconnected");
      t.this.ack.iF().c(new Runnable()
      {
        public final void run()
        {
          t localt = t.this;
          ComponentName localComponentName = paramComponentName;
          q.iK();
          if (localt.adn != null)
          {
            localt.adn = null;
            localt.c("Disconnected from device AnalyticsService", localComponentName);
            localt.ack.iG().iw();
          }
        }
      });
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\analytics\internal\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */