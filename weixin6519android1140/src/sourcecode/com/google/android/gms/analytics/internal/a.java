package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.a.a.a.a;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

public final class a
  extends o
{
  public static boolean abM;
  private a.a abN;
  private final j abO;
  private String abP;
  private boolean abQ = false;
  private Object abR = new Object();
  
  a(q paramq)
  {
    super(paramq);
    this.abO = new j(paramq.acz);
  }
  
  private static String H(String paramString)
  {
    MessageDigest localMessageDigest = k.L("MD5");
    if (localMessageDigest == null) {
      return null;
    }
    return String.format(Locale.US, "%032X", new Object[] { new BigInteger(1, localMessageDigest.digest(paramString.getBytes())) });
  }
  
  private boolean I(String paramString)
  {
    try
    {
      paramString = H(paramString);
      N("Storing hashed adid.");
      FileOutputStream localFileOutputStream = this.ack.mContext.openFileOutput("gaClientIdData", 0);
      localFileOutputStream.write(paramString.getBytes());
      localFileOutputStream.close();
      this.abP = paramString;
      return true;
    }
    catch (IOException paramString)
    {
      f("Error creating hash file", paramString);
    }
    return false;
  }
  
  private boolean a(a.a parama1, a.a parama2)
  {
    Object localObject1 = null;
    if (parama2 == null) {}
    for (parama2 = null; TextUtils.isEmpty(parama2); parama2 = parama2.abm) {
      return true;
    }
    String str = this.ack.iJ().jd();
    boolean bool;
    for (;;)
    {
      synchronized (this.abR)
      {
        if (!this.abQ)
        {
          this.abP = hX();
          this.abQ = true;
          parama1 = H(parama2 + str);
          if (!TextUtils.isEmpty(parama1)) {
            break;
          }
          return false;
        }
      }
      if (TextUtils.isEmpty(this.abP))
      {
        if (parama1 == null) {}
        for (parama1 = (a.a)localObject1; parama1 == null; parama1 = parama1.abm)
        {
          bool = I(parama2 + str);
          return bool;
        }
        this.abP = H(parama1 + str);
      }
    }
    if (parama1.equals(this.abP)) {
      return true;
    }
    if (!TextUtils.isEmpty(this.abP))
    {
      N("Resetting the client id because Advertising Id changed.");
      parama1 = this.ack.iJ().je();
      c("New client Id", parama1);
    }
    for (;;)
    {
      bool = I(parama2 + parama1);
      return bool;
      parama1 = str;
    }
  }
  
  /* Error */
  private a.a hV()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 41	com/google/android/gms/analytics/internal/a:abO	Lcom/google/android/gms/analytics/internal/j;
    //   6: ldc2_w 183
    //   9: invokevirtual 188	com/google/android/gms/analytics/internal/j:i	(J)Z
    //   12: ifeq +32 -> 44
    //   15: aload_0
    //   16: getfield 41	com/google/android/gms/analytics/internal/a:abO	Lcom/google/android/gms/analytics/internal/j;
    //   19: invokevirtual 191	com/google/android/gms/analytics/internal/j:start	()V
    //   22: aload_0
    //   23: invokespecial 194	com/google/android/gms/analytics/internal/a:hW	()Lcom/google/android/gms/a/a/a$a;
    //   26: astore_1
    //   27: aload_0
    //   28: aload_0
    //   29: getfield 196	com/google/android/gms/analytics/internal/a:abN	Lcom/google/android/gms/a/a/a$a;
    //   32: aload_1
    //   33: invokespecial 198	com/google/android/gms/analytics/internal/a:a	(Lcom/google/android/gms/a/a/a$a;Lcom/google/android/gms/a/a/a$a;)Z
    //   36: ifeq +17 -> 53
    //   39: aload_0
    //   40: aload_1
    //   41: putfield 196	com/google/android/gms/analytics/internal/a:abN	Lcom/google/android/gms/a/a/a$a;
    //   44: aload_0
    //   45: getfield 196	com/google/android/gms/analytics/internal/a:abN	Lcom/google/android/gms/a/a/a$a;
    //   48: astore_1
    //   49: aload_0
    //   50: monitorexit
    //   51: aload_1
    //   52: areturn
    //   53: aload_0
    //   54: ldc -56
    //   56: invokevirtual 203	com/google/android/gms/analytics/internal/a:R	(Ljava/lang/String;)V
    //   59: aload_0
    //   60: new 138	com/google/android/gms/a/a/a$a
    //   63: dup
    //   64: ldc -51
    //   66: iconst_0
    //   67: invokespecial 208	com/google/android/gms/a/a/a$a:<init>	(Ljava/lang/String;Z)V
    //   70: putfield 196	com/google/android/gms/analytics/internal/a:abN	Lcom/google/android/gms/a/a/a$a;
    //   73: goto -29 -> 44
    //   76: astore_1
    //   77: aload_0
    //   78: monitorexit
    //   79: aload_1
    //   80: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	81	0	this	a
    //   26	26	1	locala	a.a
    //   76	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	44	76	finally
    //   44	49	76	finally
    //   53	73	76	finally
  }
  
  private a.a hW()
  {
    Object localObject = null;
    try
    {
      a.a locala = com.google.android.gms.a.a.a.s(this.ack.mContext);
      localObject = locala;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      Q("IllegalStateException getting Ad Id Info. If you would like to see Audience reports, please ensure that you have added '<meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />' to your application manifest file. See http://goo.gl/naFqQk for details.");
      return null;
    }
    catch (Throwable localThrowable)
    {
      while (abM) {}
      abM = true;
      e("Error getting advertiser id", localThrowable);
    }
    return (a.a)localObject;
    return null;
  }
  
  private String hX()
  {
    Object localObject1 = null;
    try
    {
      FileInputStream localFileInputStream = this.ack.mContext.openFileInput("gaClientIdData");
      Object localObject2 = new byte[''];
      int i = localFileInputStream.read((byte[])localObject2, 0, 128);
      if (localFileInputStream.available() > 0)
      {
        Q("Hash file seems corrupted, deleting it.");
        localFileInputStream.close();
        this.ack.mContext.deleteFile("gaClientIdData");
        return null;
      }
      if (i <= 0)
      {
        N("Hash file is empty.");
        localFileInputStream.close();
        return null;
      }
      localObject2 = new String((byte[])localObject2, 0, i);
      IOException localIOException2;
      return null;
    }
    catch (IOException localIOException1)
    {
      try
      {
        localFileInputStream.close();
        return (String)localObject2;
      }
      catch (IOException localIOException3)
      {
        for (;;)
        {
          localObject1 = localIOException1;
          localIOException2 = localIOException3;
        }
      }
      catch (FileNotFoundException localFileNotFoundException1)
      {
        return localIOException2;
      }
      localIOException1 = localIOException1;
      e("Error reading Hash file, deleting it", localIOException1);
      this.ack.mContext.deleteFile("gaClientIdData");
      return (String)localObject1;
    }
    catch (FileNotFoundException localFileNotFoundException2) {}
  }
  
  protected final void hS() {}
  
  public final boolean hT()
  {
    boolean bool2 = false;
    iC();
    a.a locala = hV();
    boolean bool1 = bool2;
    if (locala != null)
    {
      bool1 = bool2;
      if (!locala.abn) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public final String hU()
  {
    iC();
    Object localObject = hV();
    if (localObject != null) {}
    for (localObject = ((a.a)localObject).abm;; localObject = null)
    {
      if (TextUtils.isEmpty((CharSequence)localObject)) {
        return null;
      }
      return (String)localObject;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\analytics\internal\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */