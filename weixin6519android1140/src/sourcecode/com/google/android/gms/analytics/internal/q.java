package com.google.android.gms.analytics.internal;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.analytics.b;
import com.google.android.gms.analytics.c;
import com.google.android.gms.c.ah;

public class q
{
  private static q acQ;
  final Context acR;
  final ac acS;
  final f acT;
  private final ah acU;
  private final m acV;
  final ag acW;
  private final l acX;
  final i acY;
  private final com.google.android.gms.analytics.a acZ;
  public final com.google.android.gms.c.v acz;
  private final y ada;
  public final a adb;
  public final v adc;
  public final af add;
  final Context mContext;
  
  private q(r paramr)
  {
    Object localObject1 = paramr.adf;
    com.google.android.gms.common.internal.w.j(localObject1, "Application context can't be null");
    com.google.android.gms.common.internal.w.c(localObject1 instanceof Application, "getApplicationContext didn't return the application");
    Object localObject2 = paramr.adg;
    com.google.android.gms.common.internal.w.aa(localObject2);
    this.mContext = ((Context)localObject1);
    this.acR = ((Context)localObject2);
    this.acz = com.google.android.gms.c.w.lt();
    this.acS = r.b(this);
    localObject2 = new f(this);
    ((f)localObject2).iD();
    this.acT = ((f)localObject2);
    if (com.google.android.gms.common.internal.f.akn) {
      iE().P("Google Analytics " + p.VERSION + " is starting up.");
    }
    for (;;)
    {
      localObject2 = r.f(this);
      ((i)localObject2).iD();
      this.acY = ((i)localObject2);
      localObject2 = new l(this);
      ((l)localObject2).iD();
      this.acX = ((l)localObject2);
      paramr = new m(this, paramr);
      localObject2 = r.a(this);
      Object localObject3 = new a(this);
      v localv = new v(this);
      af localaf = new af(this);
      localObject1 = ah.N((Context)localObject1);
      ((ah)localObject1).avo = new Thread.UncaughtExceptionHandler()
      {
        public final void uncaughtException(Thread paramAnonymousThread, Throwable paramAnonymousThrowable)
        {
          paramAnonymousThread = q.this.acT;
          if (paramAnonymousThread != null) {
            paramAnonymousThread.f("Job execution failed", paramAnonymousThrowable);
          }
        }
      };
      this.acU = ((ah)localObject1);
      localObject1 = new com.google.android.gms.analytics.a(this);
      ((y)localObject2).iD();
      this.ada = ((y)localObject2);
      ((a)localObject3).iD();
      this.adb = ((a)localObject3);
      localv.iD();
      this.adc = localv;
      localaf.iD();
      this.add = localaf;
      localObject2 = r.e(this);
      ((ag)localObject2).iD();
      this.acW = ((ag)localObject2);
      paramr.iD();
      this.acV = paramr;
      if (com.google.android.gms.common.internal.f.akn) {
        iE().d("Device AnalyticsService version", p.VERSION);
      }
      localObject2 = ((c)localObject1).aeb.iI();
      if (((l)localObject2).iq()) {
        e.hZ().setLogLevel(((l)localObject2).getLogLevel());
      }
      if (((l)localObject2).it()) {
        ((com.google.android.gms.analytics.a)localObject1).abH = ((l)localObject2).iu();
      }
      if (((l)localObject2).iq())
      {
        localObject3 = e.hZ();
        if (localObject3 != null) {
          ((b)localObject3).setLogLevel(((l)localObject2).getLogLevel());
        }
      }
      ((com.google.android.gms.analytics.a)localObject1).abE = true;
      this.acZ = ((com.google.android.gms.analytics.a)localObject1);
      paramr.acG.start();
      return;
      iE().P("Google Analytics " + p.VERSION + " is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4");
    }
  }
  
  public static void a(o paramo)
  {
    com.google.android.gms.common.internal.w.j(paramo, "Analytics service not created/initialized");
    com.google.android.gms.common.internal.w.c(paramo.isInitialized(), "Analytics service not initialized");
  }
  
  public static void iK() {}
  
  public static q v(Context paramContext)
  {
    com.google.android.gms.common.internal.w.aa(paramContext);
    if (acQ == null) {}
    try
    {
      if (acQ == null)
      {
        com.google.android.gms.c.v localv = com.google.android.gms.c.w.lt();
        long l1 = localv.elapsedRealtime();
        paramContext = new q(new r(paramContext.getApplicationContext()));
        acQ = paramContext;
        com.google.android.gms.analytics.a.hR();
        l1 = localv.elapsedRealtime() - l1;
        long l2 = ((Long)aj.afe.get()).longValue();
        if (l1 > l2) {
          paramContext.iE().c("Slow initialization (ms)", Long.valueOf(l1), Long.valueOf(l2));
        }
      }
      return acQ;
    }
    finally {}
  }
  
  public final f iE()
  {
    a(this.acT);
    return this.acT;
  }
  
  public final ah iF()
  {
    com.google.android.gms.common.internal.w.aa(this.acU);
    return this.acU;
  }
  
  public final m iG()
  {
    a(this.acV);
    return this.acV;
  }
  
  public final com.google.android.gms.analytics.a iH()
  {
    com.google.android.gms.common.internal.w.aa(this.acZ);
    com.google.android.gms.analytics.a locala = this.acZ;
    if ((locala.abE) && (!locala.abF)) {}
    for (boolean bool = true;; bool = false)
    {
      com.google.android.gms.common.internal.w.c(bool, "Analytics instance not initialized");
      return this.acZ;
    }
  }
  
  public final l iI()
  {
    a(this.acX);
    return this.acX;
  }
  
  public final y iJ()
  {
    a(this.ada);
    return this.ada;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\analytics\internal\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */