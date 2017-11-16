package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.os.SystemClock;
import com.google.android.gms.c.l;
import com.google.android.gms.c.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

public final class ImageManager
{
  public static final Object ajy = new Object();
  public static HashSet<Uri> ajz = new HashSet();
  public final ExecutorService ajA;
  public final b ajB;
  public final l ajC;
  public final Map<a, ImageReceiver> ajD;
  public final Map<Uri, ImageReceiver> ajE;
  public final Map<Uri, Long> ajF;
  public final Context mContext;
  public final Handler mHandler;
  
  private final class ImageReceiver
    extends ResultReceiver
  {
    private final ArrayList<a> ajG;
    private final Uri mUri;
    
    public final void onReceiveResult(int paramInt, Bundle paramBundle)
    {
      paramBundle = (ParcelFileDescriptor)paramBundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
      this.ajH.ajA.execute(new ImageManager.c(this.ajH, this.mUri, paramBundle));
    }
  }
  
  public static abstract interface a {}
  
  private static final class b
    extends o<a.a, Bitmap>
  {}
  
  private final class c
    implements Runnable
  {
    private final ParcelFileDescriptor ajI;
    private final Uri mUri;
    
    public c(Uri paramUri, ParcelFileDescriptor paramParcelFileDescriptor)
    {
      this.mUri = paramUri;
      this.ajI = paramParcelFileDescriptor;
    }
    
    /* Error */
    public final void run()
    {
      // Byte code:
      //   0: invokestatic 40	android/os/Looper:getMainLooper	()Landroid/os/Looper;
      //   3: invokevirtual 44	android/os/Looper:getThread	()Ljava/lang/Thread;
      //   6: invokestatic 49	java/lang/Thread:currentThread	()Ljava/lang/Thread;
      //   9: if_acmpne +48 -> 57
      //   12: new 51	java/lang/StringBuilder
      //   15: dup
      //   16: ldc 53
      //   18: invokespecial 56	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   21: invokestatic 49	java/lang/Thread:currentThread	()Ljava/lang/Thread;
      //   24: invokevirtual 60	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   27: ldc 62
      //   29: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   32: invokestatic 40	android/os/Looper:getMainLooper	()Landroid/os/Looper;
      //   35: invokevirtual 44	android/os/Looper:getThread	()Ljava/lang/Thread;
      //   38: invokevirtual 60	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   41: ldc 67
      //   43: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   46: pop
      //   47: new 69	java/lang/IllegalStateException
      //   50: dup
      //   51: ldc 71
      //   53: invokespecial 72	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
      //   56: athrow
      //   57: iconst_0
      //   58: istore_1
      //   59: iconst_0
      //   60: istore_2
      //   61: aconst_null
      //   62: astore_3
      //   63: aconst_null
      //   64: astore 4
      //   66: aload_0
      //   67: getfield 26	com/google/android/gms/common/images/ImageManager$c:ajI	Landroid/os/ParcelFileDescriptor;
      //   70: ifnull +23 -> 93
      //   73: aload_0
      //   74: getfield 26	com/google/android/gms/common/images/ImageManager$c:ajI	Landroid/os/ParcelFileDescriptor;
      //   77: invokevirtual 78	android/os/ParcelFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
      //   80: invokestatic 84	android/graphics/BitmapFactory:decodeFileDescriptor	(Ljava/io/FileDescriptor;)Landroid/graphics/Bitmap;
      //   83: astore_3
      //   84: iload_2
      //   85: istore_1
      //   86: aload_0
      //   87: getfield 26	com/google/android/gms/common/images/ImageManager$c:ajI	Landroid/os/ParcelFileDescriptor;
      //   90: invokevirtual 87	android/os/ParcelFileDescriptor:close	()V
      //   93: new 89	java/util/concurrent/CountDownLatch
      //   96: dup
      //   97: iconst_1
      //   98: invokespecial 92	java/util/concurrent/CountDownLatch:<init>	(I)V
      //   101: astore 4
      //   103: aload_0
      //   104: getfield 19	com/google/android/gms/common/images/ImageManager$c:ajH	Lcom/google/android/gms/common/images/ImageManager;
      //   107: getfield 96	com/google/android/gms/common/images/ImageManager:mHandler	Landroid/os/Handler;
      //   110: new 98	com/google/android/gms/common/images/ImageManager$d
      //   113: dup
      //   114: aload_0
      //   115: getfield 19	com/google/android/gms/common/images/ImageManager$c:ajH	Lcom/google/android/gms/common/images/ImageManager;
      //   118: aload_0
      //   119: getfield 24	com/google/android/gms/common/images/ImageManager$c:mUri	Landroid/net/Uri;
      //   122: aload_3
      //   123: iload_1
      //   124: aload 4
      //   126: invokespecial 101	com/google/android/gms/common/images/ImageManager$d:<init>	(Lcom/google/android/gms/common/images/ImageManager;Landroid/net/Uri;Landroid/graphics/Bitmap;ZLjava/util/concurrent/CountDownLatch;)V
      //   129: invokevirtual 107	android/os/Handler:post	(Ljava/lang/Runnable;)Z
      //   132: pop
      //   133: aload 4
      //   135: invokevirtual 110	java/util/concurrent/CountDownLatch:await	()V
      //   138: return
      //   139: astore_3
      //   140: new 51	java/lang/StringBuilder
      //   143: dup
      //   144: ldc 112
      //   146: invokespecial 56	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   149: aload_0
      //   150: getfield 24	com/google/android/gms/common/images/ImageManager$c:mUri	Landroid/net/Uri;
      //   153: invokevirtual 60	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   156: pop
      //   157: iconst_1
      //   158: istore_1
      //   159: aload 4
      //   161: astore_3
      //   162: goto -76 -> 86
      //   165: astore_3
      //   166: new 51	java/lang/StringBuilder
      //   169: dup
      //   170: ldc 114
      //   172: invokespecial 56	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   175: aload_0
      //   176: getfield 24	com/google/android/gms/common/images/ImageManager$c:mUri	Landroid/net/Uri;
      //   179: invokevirtual 60	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   182: pop
      //   183: return
      //   184: astore 4
      //   186: goto -93 -> 93
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	189	0	this	c
      //   58	101	1	bool1	boolean
      //   60	25	2	bool2	boolean
      //   62	61	3	localBitmap	Bitmap
      //   139	1	3	localOutOfMemoryError	OutOfMemoryError
      //   161	1	3	localObject	Object
      //   165	1	3	localInterruptedException	InterruptedException
      //   64	96	4	localCountDownLatch	CountDownLatch
      //   184	1	4	localIOException	java.io.IOException
      // Exception table:
      //   from	to	target	type
      //   73	84	139	java/lang/OutOfMemoryError
      //   133	138	165	java/lang/InterruptedException
      //   86	93	184	java/io/IOException
    }
  }
  
  private final class d
    implements Runnable
  {
    private final CountDownLatch ahu;
    private boolean ajJ;
    private final Bitmap mBitmap;
    private final Uri mUri;
    
    public d(Uri paramUri, Bitmap paramBitmap, boolean paramBoolean, CountDownLatch paramCountDownLatch)
    {
      this.mUri = paramUri;
      this.mBitmap = paramBitmap;
      this.ajJ = paramBoolean;
      this.ahu = paramCountDownLatch;
    }
    
    private void a(ImageManager.ImageReceiver paramImageReceiver, boolean paramBoolean)
    {
      paramImageReceiver = ImageManager.ImageReceiver.a(paramImageReceiver);
      int j = paramImageReceiver.size();
      int i = 0;
      if (i < j)
      {
        a locala = (a)paramImageReceiver.get(i);
        if (paramBoolean) {
          locala.a(ImageManager.this.mContext, this.mBitmap);
        }
        for (;;)
        {
          if (!(locala instanceof a.b)) {
            ImageManager.this.ajD.remove(locala);
          }
          i += 1;
          break;
          ImageManager.this.ajF.put(this.mUri, Long.valueOf(SystemClock.elapsedRealtime()));
          locala.a(ImageManager.this.mContext, ImageManager.this.ajC);
        }
      }
    }
    
    public final void run()
    {
      if (Looper.getMainLooper().getThread() != Thread.currentThread())
      {
        new StringBuilder("checkMainThread: current thread ").append(Thread.currentThread()).append(" IS NOT the main thread ").append(Looper.getMainLooper().getThread()).append("!");
        throw new IllegalStateException("OnBitmapLoadedRunnable must be executed in the main thread");
      }
      boolean bool;
      if (this.mBitmap != null) {
        bool = true;
      }
      while (ImageManager.this.ajB != null) {
        if (this.ajJ)
        {
          ImageManager.this.ajB.trimToSize(-1);
          System.gc();
          this.ajJ = false;
          ImageManager.this.mHandler.post(this);
          return;
          bool = false;
        }
        else if (bool)
        {
          ImageManager.this.ajB.put(new a.a(this.mUri), this.mBitmap);
        }
      }
      ??? = (ImageManager.ImageReceiver)ImageManager.this.ajE.remove(this.mUri);
      if (??? != null) {
        a((ImageManager.ImageReceiver)???, bool);
      }
      this.ahu.countDown();
      synchronized (ImageManager.ajy)
      {
        ImageManager.ajz.remove(this.mUri);
        return;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\common\images\ImageManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */