package com.google.android.gms.analytics;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.analytics.internal.f;
import com.google.android.gms.analytics.internal.k;
import com.google.android.gms.analytics.internal.q;
import com.google.android.gms.common.internal.w;

public class CampaignTrackingService
  extends Service
{
  private static Boolean abv;
  private Handler mHandler;
  
  public static boolean u(Context paramContext)
  {
    w.aa(paramContext);
    if (abv != null) {
      return abv.booleanValue();
    }
    boolean bool = k.a(paramContext, CampaignTrackingService.class);
    abv = Boolean.valueOf(bool);
    return bool;
  }
  
  protected final void a(final f paramf, Handler paramHandler, final int paramInt)
  {
    paramHandler.post(new Runnable()
    {
      public final void run()
      {
        boolean bool = CampaignTrackingService.this.stopSelfResult(paramInt);
        if (bool) {
          paramf.c("Install campaign broadcast processed", Boolean.valueOf(bool));
        }
      }
    });
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }
  
  public void onCreate()
  {
    super.onCreate();
    q.v(this).iE().N("CampaignTrackingService is starting up");
  }
  
  public void onDestroy()
  {
    q.v(this).iE().N("CampaignTrackingService is shutting down");
    super.onDestroy();
  }
  
  /* Error */
  public int onStartCommand(Intent paramIntent, int paramInt1, final int paramInt2)
  {
    // Byte code:
    //   0: getstatic 93	com/google/android/gms/analytics/CampaignTrackingReceiver:abs	Ljava/lang/Object;
    //   3: astore 4
    //   5: aload 4
    //   7: monitorenter
    //   8: getstatic 97	com/google/android/gms/analytics/CampaignTrackingReceiver:abt	Lcom/google/android/gms/c/as;
    //   11: astore 5
    //   13: aload 5
    //   15: ifnull +19 -> 34
    //   18: aload 5
    //   20: getfield 103	com/google/android/gms/c/as:awd	Landroid/os/PowerManager$WakeLock;
    //   23: invokevirtual 108	android/os/PowerManager$WakeLock:isHeld	()Z
    //   26: ifeq +8 -> 34
    //   29: aload 5
    //   31: invokevirtual 111	com/google/android/gms/c/as:release	()V
    //   34: aload 4
    //   36: monitorexit
    //   37: aload_0
    //   38: invokestatic 66	com/google/android/gms/analytics/internal/q:v	(Landroid/content/Context;)Lcom/google/android/gms/analytics/internal/q;
    //   41: astore 7
    //   43: aload 7
    //   45: invokevirtual 70	com/google/android/gms/analytics/internal/q:iE	()Lcom/google/android/gms/analytics/internal/f;
    //   48: astore 6
    //   50: aconst_null
    //   51: astore 4
    //   53: getstatic 117	com/google/android/gms/common/internal/f:akn	Z
    //   56: ifeq +103 -> 159
    //   59: aload 6
    //   61: ldc 119
    //   63: invokevirtual 122	com/google/android/gms/analytics/internal/f:R	(Ljava/lang/String;)V
    //   66: aload 4
    //   68: astore_1
    //   69: aload_0
    //   70: getfield 124	com/google/android/gms/analytics/CampaignTrackingService:mHandler	Landroid/os/Handler;
    //   73: astore 5
    //   75: aload 5
    //   77: astore 4
    //   79: aload 5
    //   81: ifnonnull +22 -> 103
    //   84: new 51	android/os/Handler
    //   87: dup
    //   88: aload_0
    //   89: invokevirtual 128	com/google/android/gms/analytics/CampaignTrackingService:getMainLooper	()Landroid/os/Looper;
    //   92: invokespecial 131	android/os/Handler:<init>	(Landroid/os/Looper;)V
    //   95: astore 4
    //   97: aload_0
    //   98: aload 4
    //   100: putfield 124	com/google/android/gms/analytics/CampaignTrackingService:mHandler	Landroid/os/Handler;
    //   103: aload_1
    //   104: invokestatic 137	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   107: ifeq +62 -> 169
    //   110: getstatic 117	com/google/android/gms/common/internal/f:akn	Z
    //   113: ifne +10 -> 123
    //   116: aload 6
    //   118: ldc -117
    //   120: invokevirtual 142	com/google/android/gms/analytics/internal/f:Q	(Ljava/lang/String;)V
    //   123: aload 7
    //   125: invokevirtual 146	com/google/android/gms/analytics/internal/q:iF	()Lcom/google/android/gms/c/ah;
    //   128: new 6	com/google/android/gms/analytics/CampaignTrackingService$1
    //   131: dup
    //   132: aload_0
    //   133: aload 6
    //   135: aload 4
    //   137: iload_3
    //   138: invokespecial 149	com/google/android/gms/analytics/CampaignTrackingService$1:<init>	(Lcom/google/android/gms/analytics/CampaignTrackingService;Lcom/google/android/gms/analytics/internal/f;Landroid/os/Handler;I)V
    //   141: invokevirtual 155	com/google/android/gms/c/ah:c	(Ljava/lang/Runnable;)V
    //   144: iconst_2
    //   145: ireturn
    //   146: astore 5
    //   148: aload 4
    //   150: monitorexit
    //   151: aload 5
    //   153: athrow
    //   154: astore 4
    //   156: goto -119 -> 37
    //   159: aload_1
    //   160: ldc -99
    //   162: invokevirtual 163	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   165: astore_1
    //   166: goto -97 -> 69
    //   169: invokestatic 169	com/google/android/gms/analytics/internal/ac:jj	()I
    //   172: istore_2
    //   173: aload_1
    //   174: invokevirtual 174	java/lang/String:length	()I
    //   177: iload_2
    //   178: if_icmpgt +69 -> 247
    //   181: aload 6
    //   183: ldc -80
    //   185: iload_3
    //   186: invokestatic 181	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   189: aload_1
    //   190: invokevirtual 184	com/google/android/gms/analytics/internal/f:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   193: aload 7
    //   195: invokevirtual 188	com/google/android/gms/analytics/internal/q:iG	()Lcom/google/android/gms/analytics/internal/m;
    //   198: astore 5
    //   200: new 8	com/google/android/gms/analytics/CampaignTrackingService$2
    //   203: dup
    //   204: aload_0
    //   205: aload 6
    //   207: aload 4
    //   209: iload_3
    //   210: invokespecial 189	com/google/android/gms/analytics/CampaignTrackingService$2:<init>	(Lcom/google/android/gms/analytics/CampaignTrackingService;Lcom/google/android/gms/analytics/internal/f;Landroid/os/Handler;I)V
    //   213: astore 4
    //   215: aload_1
    //   216: ldc -65
    //   218: invokestatic 195	com/google/android/gms/common/internal/w:h	(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   221: pop
    //   222: aload 5
    //   224: getfield 201	com/google/android/gms/analytics/internal/n:ack	Lcom/google/android/gms/analytics/internal/q;
    //   227: invokevirtual 146	com/google/android/gms/analytics/internal/q:iF	()Lcom/google/android/gms/c/ah;
    //   230: new 203	com/google/android/gms/analytics/internal/m$2
    //   233: dup
    //   234: aload 5
    //   236: aload_1
    //   237: aload 4
    //   239: invokespecial 206	com/google/android/gms/analytics/internal/m$2:<init>	(Lcom/google/android/gms/analytics/internal/m;Ljava/lang/String;Ljava/lang/Runnable;)V
    //   242: invokevirtual 155	com/google/android/gms/c/ah:c	(Ljava/lang/Runnable;)V
    //   245: iconst_2
    //   246: ireturn
    //   247: aload 6
    //   249: ldc -48
    //   251: aload_1
    //   252: invokevirtual 174	java/lang/String:length	()I
    //   255: invokestatic 181	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   258: iload_2
    //   259: invokestatic 181	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   262: invokevirtual 210	com/google/android/gms/analytics/internal/f:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   265: aload_1
    //   266: iconst_0
    //   267: iload_2
    //   268: invokevirtual 214	java/lang/String:substring	(II)Ljava/lang/String;
    //   271: astore_1
    //   272: goto -91 -> 181
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	275	0	this	CampaignTrackingService
    //   0	275	1	paramIntent	Intent
    //   0	275	2	paramInt1	int
    //   0	275	3	paramInt2	int
    //   154	54	4	localSecurityException	SecurityException
    //   213	25	4	local2	2
    //   11	69	5	localObject2	Object
    //   146	6	5	localObject3	Object
    //   198	37	5	localm	com.google.android.gms.analytics.internal.m
    //   48	200	6	localf	f
    //   41	153	7	localq	q
    // Exception table:
    //   from	to	target	type
    //   8	13	146	finally
    //   18	34	146	finally
    //   34	37	146	finally
    //   148	151	146	finally
    //   0	8	154	java/lang/SecurityException
    //   151	154	154	java/lang/SecurityException
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\analytics\CampaignTrackingService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */