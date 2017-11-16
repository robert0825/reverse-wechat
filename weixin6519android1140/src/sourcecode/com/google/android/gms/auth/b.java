package com.google.android.gms.auth;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;

public final class b
{
  public static final String KEY_ANDROID_PACKAGE_NAME = "androidPackageName";
  public static final String KEY_CALLER_UID;
  private static final ComponentName afx = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
  private static final ComponentName afy = new ComponentName("com.google.android.gms", "com.google.android.gms.recovery.RecoveryService");
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    KEY_CALLER_UID = "callerUid";
    i = Build.VERSION.SDK_INT;
  }
  
  /* Error */
  private static Bundle a(Context paramContext, Account paramAccount, String paramString, Bundle paramBundle)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 59	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   4: astore 6
    //   6: ldc 61
    //   8: invokestatic 67	com/google/android/gms/common/internal/w:ah	(Ljava/lang/String;)V
    //   11: aload 6
    //   13: invokestatic 73	com/google/android/gms/common/e:z	(Landroid/content/Context;)V
    //   16: new 75	android/os/Bundle
    //   19: dup
    //   20: aload_3
    //   21: invokespecial 78	android/os/Bundle:<init>	(Landroid/os/Bundle;)V
    //   24: astore 7
    //   26: aload_0
    //   27: invokevirtual 82	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   30: getfield 87	android/content/pm/ApplicationInfo:packageName	Ljava/lang/String;
    //   33: astore_0
    //   34: aload 7
    //   36: ldc 89
    //   38: aload_0
    //   39: invokevirtual 92	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   42: aload 7
    //   44: getstatic 26	com/google/android/gms/auth/b:KEY_ANDROID_PACKAGE_NAME	Ljava/lang/String;
    //   47: invokevirtual 96	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   50: invokestatic 102	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   53: ifeq +12 -> 65
    //   56: aload 7
    //   58: getstatic 26	com/google/android/gms/auth/b:KEY_ANDROID_PACKAGE_NAME	Ljava/lang/String;
    //   61: aload_0
    //   62: invokevirtual 92	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   65: new 104	com/google/android/gms/common/h
    //   68: dup
    //   69: invokespecial 106	com/google/android/gms/common/h:<init>	()V
    //   72: astore_0
    //   73: aload 6
    //   75: invokestatic 112	com/google/android/gms/common/internal/m:C	(Landroid/content/Context;)Lcom/google/android/gms/common/internal/m;
    //   78: astore_3
    //   79: aload_3
    //   80: getstatic 38	com/google/android/gms/auth/b:afx	Landroid/content/ComponentName;
    //   83: aload_0
    //   84: ldc 114
    //   86: invokevirtual 117	com/google/android/gms/common/internal/m:a	(Landroid/content/ComponentName;Landroid/content/ServiceConnection;Ljava/lang/String;)Z
    //   89: ifeq +386 -> 475
    //   92: aload_0
    //   93: invokevirtual 121	com/google/android/gms/common/h:kW	()Landroid/os/IBinder;
    //   96: invokestatic 127	com/google/android/gms/c/c$a:m	(Landroid/os/IBinder;)Lcom/google/android/gms/c/c;
    //   99: aload_1
    //   100: aload_2
    //   101: aload 7
    //   103: invokeinterface 132 4 0
    //   108: astore_2
    //   109: aload_2
    //   110: ifnonnull +78 -> 188
    //   113: new 134	com/google/android/gms/auth/a
    //   116: dup
    //   117: ldc -120
    //   119: invokespecial 138	com/google/android/gms/auth/a:<init>	(Ljava/lang/String;)V
    //   122: athrow
    //   123: astore_1
    //   124: new 140	java/io/IOException
    //   127: dup
    //   128: ldc -114
    //   130: invokespecial 143	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   133: athrow
    //   134: astore_1
    //   135: aload_3
    //   136: getstatic 38	com/google/android/gms/auth/b:afx	Landroid/content/ComponentName;
    //   139: aload_0
    //   140: ldc 114
    //   142: invokevirtual 147	com/google/android/gms/common/internal/m:b	(Landroid/content/ComponentName;Landroid/content/ServiceConnection;Ljava/lang/String;)V
    //   145: aload_1
    //   146: athrow
    //   147: astore_0
    //   148: new 149	com/google/android/gms/auth/c
    //   151: dup
    //   152: aload_0
    //   153: getfield 152	com/google/android/gms/common/d:afz	I
    //   156: aload_0
    //   157: invokevirtual 156	com/google/android/gms/common/d:getMessage	()Ljava/lang/String;
    //   160: new 158	android/content/Intent
    //   163: dup
    //   164: aload_0
    //   165: getfield 164	com/google/android/gms/common/g:Jt	Landroid/content/Intent;
    //   168: invokespecial 167	android/content/Intent:<init>	(Landroid/content/Intent;)V
    //   171: invokespecial 170	com/google/android/gms/auth/c:<init>	(ILjava/lang/String;Landroid/content/Intent;)V
    //   174: athrow
    //   175: astore_0
    //   176: new 134	com/google/android/gms/auth/a
    //   179: dup
    //   180: aload_0
    //   181: invokevirtual 171	com/google/android/gms/common/c:getMessage	()Ljava/lang/String;
    //   184: invokespecial 138	com/google/android/gms/auth/a:<init>	(Ljava/lang/String;)V
    //   187: athrow
    //   188: aload_2
    //   189: ldc -83
    //   191: invokevirtual 96	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   194: invokestatic 102	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   197: istore 5
    //   199: iload 5
    //   201: ifne +15 -> 216
    //   204: aload_3
    //   205: getstatic 38	com/google/android/gms/auth/b:afx	Landroid/content/ComponentName;
    //   208: aload_0
    //   209: ldc 114
    //   211: invokevirtual 147	com/google/android/gms/common/internal/m:b	(Landroid/content/ComponentName;Landroid/content/ServiceConnection;Ljava/lang/String;)V
    //   214: aload_2
    //   215: areturn
    //   216: aload_2
    //   217: ldc -81
    //   219: invokevirtual 96	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   222: astore_1
    //   223: aload_2
    //   224: ldc -79
    //   226: invokevirtual 181	android/os/Bundle:getParcelable	(Ljava/lang/String;)Landroid/os/Parcelable;
    //   229: checkcast 158	android/content/Intent
    //   232: astore_2
    //   233: ldc -73
    //   235: aload_1
    //   236: invokevirtual 189	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   239: ifne +246 -> 485
    //   242: ldc -65
    //   244: aload_1
    //   245: invokevirtual 189	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   248: ifne +237 -> 485
    //   251: ldc -63
    //   253: aload_1
    //   254: invokevirtual 189	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   257: ifne +228 -> 485
    //   260: ldc -61
    //   262: aload_1
    //   263: invokevirtual 189	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   266: ifne +219 -> 485
    //   269: ldc -59
    //   271: aload_1
    //   272: invokevirtual 189	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   275: ifne +210 -> 485
    //   278: ldc -57
    //   280: aload_1
    //   281: invokevirtual 189	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   284: ifne +201 -> 485
    //   287: ldc -55
    //   289: aload_1
    //   290: invokevirtual 189	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   293: ifne +192 -> 485
    //   296: getstatic 207	com/google/android/gms/c/i:atM	Lcom/google/android/gms/c/i;
    //   299: getfield 210	com/google/android/gms/c/i:auo	Ljava/lang/String;
    //   302: aload_1
    //   303: invokevirtual 189	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   306: ifne +179 -> 485
    //   309: getstatic 213	com/google/android/gms/c/i:atN	Lcom/google/android/gms/c/i;
    //   312: getfield 210	com/google/android/gms/c/i:auo	Ljava/lang/String;
    //   315: aload_1
    //   316: invokevirtual 189	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   319: ifne +166 -> 485
    //   322: getstatic 216	com/google/android/gms/c/i:atO	Lcom/google/android/gms/c/i;
    //   325: getfield 210	com/google/android/gms/c/i:auo	Ljava/lang/String;
    //   328: aload_1
    //   329: invokevirtual 189	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   332: ifne +153 -> 485
    //   335: getstatic 219	com/google/android/gms/c/i:atP	Lcom/google/android/gms/c/i;
    //   338: getfield 210	com/google/android/gms/c/i:auo	Ljava/lang/String;
    //   341: aload_1
    //   342: invokevirtual 189	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   345: ifne +140 -> 485
    //   348: getstatic 222	com/google/android/gms/c/i:atQ	Lcom/google/android/gms/c/i;
    //   351: getfield 210	com/google/android/gms/c/i:auo	Ljava/lang/String;
    //   354: aload_1
    //   355: invokevirtual 189	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   358: ifne +127 -> 485
    //   361: getstatic 225	com/google/android/gms/c/i:atR	Lcom/google/android/gms/c/i;
    //   364: getfield 210	com/google/android/gms/c/i:auo	Ljava/lang/String;
    //   367: aload_1
    //   368: invokevirtual 189	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   371: ifne +114 -> 485
    //   374: getstatic 228	com/google/android/gms/c/i:atK	Lcom/google/android/gms/c/i;
    //   377: getfield 210	com/google/android/gms/c/i:auo	Ljava/lang/String;
    //   380: aload_1
    //   381: invokevirtual 189	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   384: ifeq +32 -> 416
    //   387: goto +98 -> 485
    //   390: iload 4
    //   392: ifeq +30 -> 422
    //   395: new 230	com/google/android/gms/auth/d
    //   398: dup
    //   399: aload_1
    //   400: aload_2
    //   401: invokespecial 233	com/google/android/gms/auth/d:<init>	(Ljava/lang/String;Landroid/content/Intent;)V
    //   404: athrow
    //   405: astore_1
    //   406: new 134	com/google/android/gms/auth/a
    //   409: dup
    //   410: ldc -21
    //   412: invokespecial 138	com/google/android/gms/auth/a:<init>	(Ljava/lang/String;)V
    //   415: athrow
    //   416: iconst_0
    //   417: istore 4
    //   419: goto -29 -> 390
    //   422: ldc -19
    //   424: aload_1
    //   425: invokevirtual 189	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   428: ifne +63 -> 491
    //   431: ldc -120
    //   433: aload_1
    //   434: invokevirtual 189	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   437: ifne +54 -> 491
    //   440: ldc -17
    //   442: aload_1
    //   443: invokevirtual 189	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   446: ifeq +51 -> 497
    //   449: goto +42 -> 491
    //   452: iload 4
    //   454: ifeq +12 -> 466
    //   457: new 140	java/io/IOException
    //   460: dup
    //   461: aload_1
    //   462: invokespecial 143	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   465: athrow
    //   466: new 134	com/google/android/gms/auth/a
    //   469: dup
    //   470: aload_1
    //   471: invokespecial 138	com/google/android/gms/auth/a:<init>	(Ljava/lang/String;)V
    //   474: athrow
    //   475: new 140	java/io/IOException
    //   478: dup
    //   479: ldc -15
    //   481: invokespecial 143	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   484: athrow
    //   485: iconst_1
    //   486: istore 4
    //   488: goto -98 -> 390
    //   491: iconst_1
    //   492: istore 4
    //   494: goto -42 -> 452
    //   497: iconst_0
    //   498: istore 4
    //   500: goto -48 -> 452
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	503	0	paramContext	Context
    //   0	503	1	paramAccount	Account
    //   0	503	2	paramString	String
    //   0	503	3	paramBundle	Bundle
    //   390	109	4	i	int
    //   197	3	5	bool	boolean
    //   4	70	6	localContext	Context
    //   24	78	7	localBundle	Bundle
    // Exception table:
    //   from	to	target	type
    //   92	109	123	android/os/RemoteException
    //   113	123	123	android/os/RemoteException
    //   188	199	123	android/os/RemoteException
    //   216	387	123	android/os/RemoteException
    //   395	405	123	android/os/RemoteException
    //   422	449	123	android/os/RemoteException
    //   457	466	123	android/os/RemoteException
    //   466	475	123	android/os/RemoteException
    //   92	109	134	finally
    //   113	123	134	finally
    //   124	134	134	finally
    //   188	199	134	finally
    //   216	387	134	finally
    //   395	405	134	finally
    //   406	416	134	finally
    //   422	449	134	finally
    //   457	466	134	finally
    //   466	475	134	finally
    //   11	16	147	com/google/android/gms/common/d
    //   11	16	175	com/google/android/gms/common/c
    //   92	109	405	java/lang/InterruptedException
    //   113	123	405	java/lang/InterruptedException
    //   188	199	405	java/lang/InterruptedException
    //   216	387	405	java/lang/InterruptedException
    //   395	405	405	java/lang/InterruptedException
    //   422	449	405	java/lang/InterruptedException
    //   457	466	405	java/lang/InterruptedException
    //   466	475	405	java/lang/InterruptedException
  }
  
  @Deprecated
  public static String d(Context paramContext, String paramString1, String paramString2)
  {
    return a(paramContext, new Account(paramString1, "com.google"), paramString2, new Bundle()).getString("authtoken");
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\auth\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */