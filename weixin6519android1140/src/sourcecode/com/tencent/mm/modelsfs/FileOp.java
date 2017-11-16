package com.tencent.mm.modelsfs;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.loader.stub.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.av;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

public final class FileOp
{
  public static ReentrantReadWriteLock gTe;
  public static TreeMap<String, SFSContextRec> gTf;
  private static File gTg;
  private static String gTh;
  private static final EnumSet<g.a> gTi;
  
  static
  {
    GMTrace.i(13837579321344L, 103098);
    gTe = new ReentrantReadWriteLock();
    gTf = new TreeMap();
    gTh = "";
    gTi = EnumSet.of(g.a.gTs, g.a.gTt);
    GMTrace.o(13837579321344L, 103098);
  }
  
  public static List<SFSContext.FileEntry> A(String paramString, boolean paramBoolean)
  {
    GMTrace.i(13836639797248L, 103091);
    if ((paramString == null) || (paramString.length() == 0))
    {
      paramString = Collections.emptyList();
      GMTrace.o(13836639797248L, 103091);
      return paramString;
    }
    SFSContextRec localSFSContextRec = kU(paramString);
    Object localObject4;
    Object localObject3;
    Object localObject2;
    if (localSFSContextRec != null)
    {
      Object localObject1 = paramString.substring(localSFSContextRec.gTl.length());
      paramString = (String)localObject1;
      if (!((String)localObject1).endsWith("/")) {
        paramString = (String)localObject1 + "/";
      }
      try
      {
        localObject1 = localSFSContextRec.gTp.li(paramString);
        localObject4 = new ArrayList();
        localObject1 = ((List)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject3 = (SFSContext.FileEntry)((Iterator)localObject1).next();
          if (((SFSContext.FileEntry)localObject3).name.substring(paramString.length()).indexOf('/') == -1) {
            ((List)localObject4).add(localObject3);
          }
        }
        if (localSFSContextRec == null) {
          break label239;
        }
      }
      catch (IOException localIOException)
      {
        w.printErrStackTrace("MicroMsg.FileOp", localIOException, "listFiles failed with SFS: " + paramString, new Object[0]);
        localObject2 = new ArrayList();
        localObject3 = paramString;
      }
      if ((localSFSContextRec.gTm != null) || (localSFSContextRec.gTn))
      {
        label239:
        paramString = new ArrayDeque();
        paramString.add(new File((String)localObject3));
      }
    }
    else
    {
      label284:
      do
      {
        localObject4 = ((File)paramString.pop()).listFiles();
        if (localObject4 != null)
        {
          int j = localObject4.length;
          int i = 0;
          if (i < j)
          {
            localSFSContextRec = localObject4[i];
            Object localObject5;
            if (localSFSContextRec.isFile())
            {
              localObject5 = new SFSContext.FileEntry();
              ((SFSContext.FileEntry)localObject5).name = localSFSContextRec.getAbsolutePath();
              if (paramBoolean)
              {
                ((SFSContext.FileEntry)localObject5).size = localSFSContextRec.length();
                ((SFSContext.FileEntry)localObject5).timestamp = localSFSContextRec.lastModified();
              }
              ((List)localObject2).add(localObject5);
            }
            for (;;)
            {
              i += 1;
              break label284;
              localObject5 = ((List)localObject4).iterator();
              for (;;)
              {
                localObject2 = localObject4;
                localObject3 = paramString;
                if (!((Iterator)localObject5).hasNext()) {
                  break;
                }
                localObject2 = (SFSContext.FileEntry)((Iterator)localObject5).next();
                ((SFSContext.FileEntry)localObject2).name = (localSFSContextRec.gTl + ((SFSContext.FileEntry)localObject2).name);
              }
              localObject2 = new ArrayList();
              localObject3 = paramString;
              break;
              localSFSContextRec.isDirectory();
            }
          }
        }
      } while (!paramString.isEmpty());
    }
    gTe.readLock().unlock();
    w.d("MicroMsg.FileOp", "listFiles: %s [%d]", new Object[] { localObject3, Integer.valueOf(((List)localObject2).size()) });
    GMTrace.o(13836639797248L, 103091);
    return (List<SFSContext.FileEntry>)localObject2;
  }
  
  public static boolean B(String paramString, boolean paramBoolean)
  {
    GMTrace.i(13836774014976L, 103092);
    if ((paramString == null) || (paramString.length() == 0))
    {
      GMTrace.o(13836774014976L, 103092);
      return false;
    }
    Object localObject2 = kU(paramString);
    Iterator localIterator;
    if (localObject2 != null)
    {
      localObject1 = paramString;
      try
      {
        if (paramString.equals(((SFSContextRec)localObject2).gTl))
        {
          localObject1 = paramString;
          localObject2 = ((SFSContextRec)localObject2).gTp;
          localObject1 = paramString;
          if (((SFSContext)localObject2).mNativePtr == 0L)
          {
            localObject1 = paramString;
            throw new IllegalArgumentException("Reuse already released SFSContext.");
          }
        }
      }
      catch (IOException paramString)
      {
        w.printErrStackTrace("MicroMsg.FileOp", paramString, "deleteDirIncludedFiles failed: " + (String)localObject1, new Object[0]);
        paramBoolean = false;
      }
      for (;;)
      {
        gTe.readLock().unlock();
        GMTrace.o(13836774014976L, 103092);
        return paramBoolean;
        localObject1 = paramString;
        if (SFSContext.nativeClear(((SFSContext)localObject2).mNativePtr) != 0)
        {
          localObject1 = paramString;
          throw new IOException(SFSContext.nativeErrorMessage());
          localObject1 = paramString;
          paramString = paramString.substring(((SFSContextRec)localObject2).gTl.length());
          localObject1 = paramString;
          localIterator = ((SFSContextRec)localObject2).gTp.li(paramString).iterator();
          for (;;)
          {
            localObject1 = paramString;
            if (!localIterator.hasNext()) {
              break;
            }
            localObject1 = paramString;
            SFSContext.FileEntry localFileEntry = (SFSContext.FileEntry)localIterator.next();
            localObject1 = paramString;
            ((SFSContextRec)localObject2).gTp.hB(localFileEntry.name);
          }
        }
        paramBoolean = true;
      }
    }
    Object localObject1 = new File(paramString);
    paramString = new ArrayDeque();
    paramString.add(new a((File)localObject1));
    label426:
    for (;;)
    {
      localObject1 = (a)paramString.getLast();
      if (((a)localObject1).gTk == null) {
        ((a)localObject1).gTk = ((a)localObject1).gTj.listFiles();
      }
      if (((a)localObject1).gTk == null) {
        if (!paramBoolean) {
          ((a)localObject1).gTj.delete();
        }
      }
      for (;;)
      {
        if (!paramString.isEmpty()) {
          break label426;
        }
        paramBoolean = true;
        break;
        localObject2 = ((a)localObject1).gTk;
        int i = ((a)localObject1).pos;
        if (i < localObject2.length)
        {
          localIterator = localObject2[i];
          if (localIterator.isFile()) {
            localIterator.delete();
          }
          while (!localIterator.isDirectory())
          {
            i += 1;
            break;
          }
          ((a)localObject1).pos = i;
          paramString.add(new a(localIterator));
        }
        else
        {
          if (!paramBoolean) {
            ((a)localObject1).gTj.delete();
          }
          paramString.removeLast();
        }
      }
    }
  }
  
  private static void KW()
  {
    GMTrace.i(13833015918592L, 103064);
    Object localObject1 = new Bundle();
    gTe.readLock().lock();
    Object localObject2 = gTf.values().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (SFSContextRec)((Iterator)localObject2).next();
      ((Bundle)localObject1).putParcelable(((SFSContextRec)localObject3).gTl, (Parcelable)localObject3);
    }
    gTe.readLock().unlock();
    localObject2 = Parcel.obtain();
    ((Bundle)localObject1).writeToParcel((Parcel)localObject2, 0);
    localObject1 = gTg.getAbsolutePath();
    Object localObject3 = ((Parcel)localObject2).marshall();
    b((String)localObject1, (byte[])localObject3, localObject3.length);
    ((Parcel)localObject2).recycle();
    GMTrace.o(13833015918592L, 103064);
  }
  
  public static Map<String, SFSContext.Statistics> KX()
  {
    GMTrace.i(13833418571776L, 103067);
    gTe.readLock().lock();
    TreeMap localTreeMap = new TreeMap();
    Iterator localIterator = gTf.values().iterator();
    while (localIterator.hasNext())
    {
      SFSContextRec localSFSContextRec = (SFSContextRec)localIterator.next();
      if ((localSFSContextRec != null) && (!localSFSContextRec.gTo))
      {
        if (localSFSContextRec.gTp == null) {}
        try
        {
          SFSContext localSFSContext = localSFSContextRec.gTp;
          if (localSFSContext == null) {}
          try
          {
            localSFSContextRec.gTp = localSFSContextRec.gTq.create();
            localSFSContext = localSFSContextRec.gTp;
            if (localSFSContext.mNativePtr != 0L) {
              break label166;
            }
            throw new IllegalArgumentException("Reuse already released SFSContext.");
          }
          catch (Exception localException)
          {
            w.e("MicroMsg.FileOp", "Failed to create SFSContext for prefix '%s': %s", new Object[] { localSFSContextRec.gTl, localException.getMessage() });
            localSFSContextRec.gTo = true;
          }
          continue;
        }
        finally {}
        label166:
        SFSContext.Statistics localStatistics = SFSContext.nativeStatistics(localException.mNativePtr);
        localMap.put(localSFSContextRec.gTq.mName, localStatistics);
      }
    }
    gTe.readLock().unlock();
    GMTrace.o(13833418571776L, 103067);
    return localMap;
  }
  
  public static void a(String paramString, String[] paramArrayOfString, SFSContext.Builder paramBuilder)
  {
    SFSContextRec localSFSContextRec = null;
    GMTrace.i(13833150136320L, 103065);
    if (paramBuilder == null)
    {
      kR(paramString);
      GMTrace.o(13833150136320L, 103065);
      return;
    }
    if (!gTh.toLowerCase().contains("fat"))
    {
      w.i("MicroMsg.FileOp", "SFS disabled on file system '%s'", new Object[] { gTh });
      GMTrace.o(13833150136320L, 103065);
      return;
    }
    w.i("MicroMsg.FileOp", "SFS enabled on file system '%s'", new Object[] { gTh });
    File localFile = Environment.getExternalStorageDirectory();
    if (new File(localFile.getAbsolutePath() + "/tencent/MicroMsg/disable-sfs").exists())
    {
      w.i("MicroMsg.FileOp", "SFS disabled.");
      GMTrace.o(13833150136320L, 103065);
      return;
    }
    if (paramBuilder != null)
    {
      localSFSContextRec = new SFSContextRec();
      localSFSContextRec.gTl = paramString;
      if ((paramArrayOfString != null) && (paramArrayOfString.length != 0)) {
        break label335;
      }
    }
    label335:
    for (paramArrayOfString = null;; paramArrayOfString = (String[])Arrays.copyOf(paramArrayOfString, paramArrayOfString.length))
    {
      localSFSContextRec.gTm = paramArrayOfString;
      localSFSContextRec.gTn = false;
      localSFSContextRec.gTp = null;
      localSFSContextRec.gTq = paramBuilder;
      gTe.writeLock().lock();
      paramArrayOfString = (SFSContextRec)gTf.put(paramString, localSFSContextRec);
      gTe.writeLock().unlock();
      if ((paramArrayOfString != null) && (paramArrayOfString.gTp != null)) {
        paramArrayOfString.gTp.release();
      }
      paramArrayOfString = Parcel.obtain();
      localSFSContextRec.writeToParcel(paramArrayOfString, 0);
      paramBuilder = paramArrayOfString.marshall();
      paramArrayOfString.recycle();
      paramArrayOfString = ab.getContext();
      paramArrayOfString.sendBroadcast(new Intent("com.tencent.mm.FileOp.registerSFS").putExtra("rec", paramBuilder).setPackage(paramArrayOfString.getPackageName()), "com.tencent.mm.permission.MM_MESSAGE");
      KW();
      w.i("MicroMsg.FileOp", "Register SFS for prefix: " + paramString);
      GMTrace.o(13833150136320L, 103065);
      return;
    }
  }
  
  private static boolean a(String paramString, SFSContextRec paramSFSContextRec)
  {
    GMTrace.i(13833552789504L, 103068);
    if (paramSFSContextRec.gTm == null)
    {
      GMTrace.o(13833552789504L, 103068);
      return false;
    }
    paramString = paramString.substring(paramSFSContextRec.gTl.length());
    int i = paramString.lastIndexOf('/');
    if (i == -1)
    {
      GMTrace.o(13833552789504L, 103068);
      return false;
    }
    paramString = paramString.substring(i + 1);
    if (paramString.length() == 0)
    {
      GMTrace.o(13833552789504L, 103068);
      return false;
    }
    paramSFSContextRec = paramSFSContextRec.gTm;
    int j = paramSFSContextRec.length;
    i = 0;
    while (i < j)
    {
      if (g.a(paramSFSContextRec[i], 0, paramString, 0, gTi))
      {
        GMTrace.o(13833552789504L, 103068);
        return true;
      }
      i += 1;
    }
    GMTrace.o(13833552789504L, 103068);
    return false;
  }
  
  public static boolean aZ(String paramString)
  {
    GMTrace.i(13836102926336L, 103087);
    if ((paramString == null) || (paramString.length() == 0))
    {
      GMTrace.o(13836102926336L, 103087);
      return false;
    }
    SFSContextRec localSFSContextRec = kU(paramString);
    boolean bool1;
    if (localSFSContextRec != null)
    {
      SFSContext localSFSContext = localSFSContextRec.gTp;
      String str2 = paramString.substring(localSFSContextRec.gTl.length());
      if (localSFSContext.mNativePtr == 0L) {
        throw new IllegalArgumentException("Reuse already released SFSContext.");
      }
      str1 = str2;
      if (f.le(str2))
      {
        f.lg(str2);
        str1 = f.lf(str2);
      }
      boolean bool2 = SFSContext.nativeExists(localSFSContext.mNativePtr, str1);
      bool1 = bool2;
      if (!bool2)
      {
        bool1 = bool2;
        if (localSFSContextRec.gTn) {
          bool1 = new File(paramString).exists();
        }
      }
      gTe.readLock().unlock();
      if (localSFSContextRec != null) {
        break label216;
      }
    }
    label216:
    for (String str1 = "regular";; str1 = "SFS")
    {
      w.d("MicroMsg.FileOp", "fileExists: %s [%b, %s]", new Object[] { paramString, Boolean.valueOf(bool1), str1 });
      GMTrace.o(13836102926336L, 103087);
      return bool1;
      bool1 = new File(paramString).exists();
      break;
    }
  }
  
  public static OutputStream aj(String paramString1, String paramString2)
  {
    GMTrace.i(13834358095872L, 103074);
    paramString1 = ak(paramString1, paramString2);
    GMTrace.o(13834358095872L, 103074);
    return paramString1;
  }
  
  private static OutputStream ak(String paramString1, String paramString2)
  {
    GMTrace.i(13834626531328L, 103076);
    if ((paramString1 == null) || (paramString1.length() == 0)) {
      throw new FileNotFoundException("path == null");
    }
    Object localObject = kU(paramString1);
    if (localObject == null) {}
    for (;;)
    {
      try
      {
        if (!TextUtils.isEmpty(paramString2))
        {
          paramString2 = new c(paramString1, paramString2);
          gTe.readLock().unlock();
          if (localObject != null) {
            break label160;
          }
          localObject = "regular";
          w.d("MicroMsg.FileOp", "openWrite: %s [%s, %s]", new Object[] { paramString1, "ok", localObject });
          GMTrace.o(13834626531328L, 103076);
          return paramString2;
        }
        paramString2 = new FileOutputStream(paramString1);
        continue;
        str = paramString1.substring(((SFSContextRec)localObject).gTl.length());
      }
      finally
      {
        gTe.readLock().unlock();
      }
      String str;
      paramString2 = ((SFSContextRec)localObject).gTp.aj(str, paramString2);
      continue;
      label160:
      localObject = "SFS";
    }
  }
  
  public static boolean al(String paramString1, String paramString2)
  {
    GMTrace.i(13836505579520L, 103090);
    if ((paramString1 == null) || (paramString2 == null) || (paramString1.length() == 0) || (paramString2.length() == 0))
    {
      GMTrace.o(13836505579520L, 103090);
      return false;
    }
    Object localObject = paramString1;
    String str2 = paramString2;
    if (kT(paramString1))
    {
      localObject = paramString1;
      str2 = paramString2;
      if (kT(paramString2))
      {
        String str1 = paramString1;
        if (f.le(paramString1)) {
          str1 = f.lf(paramString1);
        }
        paramString1 = paramString2;
        if (f.le(paramString2)) {
          paramString1 = f.lf(paramString2);
        }
        localObject = str1;
        str2 = paramString1;
        if (new File(str1).renameTo(new File(paramString1)))
        {
          GMTrace.o(13836505579520L, 103090);
          return true;
        }
      }
    }
    if (o((String)localObject, str2) < 0L)
    {
      GMTrace.o(13836505579520L, 103090);
      return false;
    }
    deleteFile((String)localObject);
    GMTrace.o(13836505579520L, 103090);
    return true;
  }
  
  /* Error */
  public static int b(String paramString, byte[] paramArrayOfByte, int paramInt)
  {
    // Byte code:
    //   0: ldc2_w 575
    //   3: ldc_w 577
    //   6: invokestatic 37	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_1
    //   10: ifnonnull +15 -> 25
    //   13: ldc2_w 575
    //   16: ldc_w 577
    //   19: invokestatic 73	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   22: bipush -2
    //   24: ireturn
    //   25: aload_1
    //   26: arraylength
    //   27: iload_2
    //   28: iconst_0
    //   29: iadd
    //   30: if_icmpge +15 -> 45
    //   33: ldc2_w 575
    //   36: ldc_w 577
    //   39: invokestatic 73	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   42: bipush -3
    //   44: ireturn
    //   45: aconst_null
    //   46: astore 4
    //   48: aconst_null
    //   49: astore_3
    //   50: aload_0
    //   51: invokestatic 581	com/tencent/mm/modelsfs/FileOp:kV	(Ljava/lang/String;)Ljava/io/OutputStream;
    //   54: astore 5
    //   56: aload 5
    //   58: astore_3
    //   59: aload 5
    //   61: astore 4
    //   63: aload 5
    //   65: aload_1
    //   66: iconst_0
    //   67: iload_2
    //   68: invokevirtual 587	java/io/OutputStream:write	([BII)V
    //   71: aload 5
    //   73: ifnull +8 -> 81
    //   76: aload 5
    //   78: invokevirtual 590	java/io/OutputStream:close	()V
    //   81: ldc2_w 575
    //   84: ldc_w 577
    //   87: invokestatic 73	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   90: iconst_0
    //   91: ireturn
    //   92: astore_1
    //   93: aload_3
    //   94: astore 4
    //   96: ldc -91
    //   98: ldc_w 592
    //   101: iconst_2
    //   102: anewarray 4	java/lang/Object
    //   105: dup
    //   106: iconst_0
    //   107: aload_0
    //   108: aastore
    //   109: dup
    //   110: iconst_1
    //   111: aload_1
    //   112: invokevirtual 593	java/io/IOException:getMessage	()Ljava/lang/String;
    //   115: aastore
    //   116: invokestatic 373	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   119: aload_3
    //   120: ifnull +7 -> 127
    //   123: aload_3
    //   124: invokevirtual 590	java/io/OutputStream:close	()V
    //   127: ldc2_w 575
    //   130: ldc_w 577
    //   133: invokestatic 73	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   136: iconst_m1
    //   137: ireturn
    //   138: astore_0
    //   139: aload 4
    //   141: ifnull +8 -> 149
    //   144: aload 4
    //   146: invokevirtual 590	java/io/OutputStream:close	()V
    //   149: aload_0
    //   150: athrow
    //   151: astore_0
    //   152: goto -71 -> 81
    //   155: astore_0
    //   156: goto -29 -> 127
    //   159: astore_1
    //   160: goto -11 -> 149
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	163	0	paramString	String
    //   0	163	1	paramArrayOfByte	byte[]
    //   0	163	2	paramInt	int
    //   49	75	3	localObject1	Object
    //   46	99	4	localObject2	Object
    //   54	23	5	localOutputStream	OutputStream
    // Exception table:
    //   from	to	target	type
    //   50	56	92	java/io/IOException
    //   63	71	92	java/io/IOException
    //   50	56	138	finally
    //   63	71	138	finally
    //   96	119	138	finally
    //   76	81	151	java/io/IOException
    //   123	127	155	java/io/IOException
    //   144	149	159	java/io/IOException
  }
  
  /* Error */
  public static String be(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 595
    //   3: ldc_w 597
    //   6: invokestatic 37	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: new 112	java/lang/StringBuilder
    //   12: dup
    //   13: invokespecial 113	java/lang/StringBuilder:<init>	()V
    //   16: astore 4
    //   18: new 599	java/io/InputStreamReader
    //   21: dup
    //   22: aload_0
    //   23: invokestatic 603	com/tencent/mm/modelsfs/FileOp:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   26: invokespecial 606	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   29: astore_3
    //   30: aload_3
    //   31: astore_2
    //   32: sipush 512
    //   35: newarray <illegal type>
    //   37: astore 5
    //   39: aload_3
    //   40: astore_2
    //   41: aload_3
    //   42: aload 5
    //   44: invokevirtual 610	java/io/InputStreamReader:read	([C)I
    //   47: istore_1
    //   48: iload_1
    //   49: iconst_m1
    //   50: if_icmpeq +62 -> 112
    //   53: aload_3
    //   54: astore_2
    //   55: aload 4
    //   57: aload 5
    //   59: iconst_0
    //   60: iload_1
    //   61: invokevirtual 613	java/lang/StringBuilder:append	([CII)Ljava/lang/StringBuilder;
    //   64: pop
    //   65: goto -26 -> 39
    //   68: astore 4
    //   70: aload_3
    //   71: astore_2
    //   72: ldc -91
    //   74: ldc_w 615
    //   77: iconst_2
    //   78: anewarray 4	java/lang/Object
    //   81: dup
    //   82: iconst_0
    //   83: aload_0
    //   84: aastore
    //   85: dup
    //   86: iconst_1
    //   87: aload 4
    //   89: invokevirtual 593	java/io/IOException:getMessage	()Ljava/lang/String;
    //   92: aastore
    //   93: invokestatic 373	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   96: aload_3
    //   97: astore_2
    //   98: aload 4
    //   100: athrow
    //   101: astore_0
    //   102: aload_2
    //   103: ifnull +7 -> 110
    //   106: aload_2
    //   107: invokevirtual 616	java/io/InputStreamReader:close	()V
    //   110: aload_0
    //   111: athrow
    //   112: aload_3
    //   113: invokevirtual 616	java/io/InputStreamReader:close	()V
    //   116: aload 4
    //   118: invokevirtual 121	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   121: astore_0
    //   122: ldc2_w 595
    //   125: ldc_w 597
    //   128: invokestatic 73	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   131: aload_0
    //   132: areturn
    //   133: astore_0
    //   134: goto -18 -> 116
    //   137: astore_2
    //   138: goto -28 -> 110
    //   141: astore_0
    //   142: aconst_null
    //   143: astore_2
    //   144: goto -42 -> 102
    //   147: astore 4
    //   149: aconst_null
    //   150: astore_3
    //   151: goto -81 -> 70
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	154	0	paramString	String
    //   47	14	1	i	int
    //   31	76	2	localInputStreamReader1	java.io.InputStreamReader
    //   137	1	2	localIOException1	IOException
    //   143	1	2	localObject	Object
    //   29	122	3	localInputStreamReader2	java.io.InputStreamReader
    //   16	40	4	localStringBuilder	StringBuilder
    //   68	49	4	localIOException2	IOException
    //   147	1	4	localIOException3	IOException
    //   37	21	5	arrayOfChar	char[]
    // Exception table:
    //   from	to	target	type
    //   32	39	68	java/io/IOException
    //   41	48	68	java/io/IOException
    //   55	65	68	java/io/IOException
    //   32	39	101	finally
    //   41	48	101	finally
    //   55	65	101	finally
    //   72	96	101	finally
    //   98	101	101	finally
    //   112	116	133	java/io/IOException
    //   106	110	137	java/io/IOException
    //   18	30	141	finally
    //   18	30	147	java/io/IOException
  }
  
  /* Error */
  public static byte[] c(String paramString, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: ldc2_w 619
    //   3: ldc_w 621
    //   6: invokestatic 37	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: ifnonnull +14 -> 24
    //   13: ldc2_w 619
    //   16: ldc_w 621
    //   19: invokestatic 73	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   22: aconst_null
    //   23: areturn
    //   24: iload_2
    //   25: ifge +113 -> 138
    //   28: sipush 2048
    //   31: istore_3
    //   32: new 623	java/io/ByteArrayOutputStream
    //   35: dup
    //   36: iload_3
    //   37: invokespecial 626	java/io/ByteArrayOutputStream:<init>	(I)V
    //   40: astore 8
    //   42: aload_0
    //   43: invokestatic 603	com/tencent/mm/modelsfs/FileOp:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   46: astore 7
    //   48: iload_1
    //   49: ifle +19 -> 68
    //   52: iload_1
    //   53: i2l
    //   54: lstore 4
    //   56: aload 7
    //   58: astore 6
    //   60: aload 7
    //   62: lload 4
    //   64: invokevirtual 632	java/io/InputStream:skip	(J)J
    //   67: pop2
    //   68: aload 7
    //   70: astore 6
    //   72: sipush 1024
    //   75: newarray <illegal type>
    //   77: astore 9
    //   79: iload_2
    //   80: istore_1
    //   81: iload_2
    //   82: ifge +7 -> 89
    //   85: ldc_w 633
    //   88: istore_1
    //   89: aload 7
    //   91: astore 6
    //   93: aload 7
    //   95: aload 9
    //   97: iconst_0
    //   98: iload_1
    //   99: sipush 1024
    //   102: invokestatic 639	java/lang/Math:min	(II)I
    //   105: invokevirtual 642	java/io/InputStream:read	([BII)I
    //   108: istore_2
    //   109: iload_2
    //   110: iconst_m1
    //   111: if_icmpeq +32 -> 143
    //   114: iload_1
    //   115: ifle +28 -> 143
    //   118: aload 7
    //   120: astore 6
    //   122: aload 8
    //   124: aload 9
    //   126: iconst_0
    //   127: iload_2
    //   128: invokevirtual 643	java/io/ByteArrayOutputStream:write	([BII)V
    //   131: iload_1
    //   132: iload_2
    //   133: isub
    //   134: istore_1
    //   135: goto -46 -> 89
    //   138: iload_2
    //   139: istore_3
    //   140: goto -108 -> 32
    //   143: aload 7
    //   145: ifnull +8 -> 153
    //   148: aload 7
    //   150: invokevirtual 644	java/io/InputStream:close	()V
    //   153: aload 8
    //   155: invokevirtual 647	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   158: astore 6
    //   160: aload 8
    //   162: invokevirtual 648	java/io/ByteArrayOutputStream:close	()V
    //   165: ldc -91
    //   167: ldc_w 650
    //   170: iconst_2
    //   171: anewarray 4	java/lang/Object
    //   174: dup
    //   175: iconst_0
    //   176: aload_0
    //   177: aastore
    //   178: dup
    //   179: iconst_1
    //   180: aload 6
    //   182: arraylength
    //   183: invokestatic 243	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   186: aastore
    //   187: invokestatic 247	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   190: ldc2_w 619
    //   193: ldc_w 621
    //   196: invokestatic 73	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   199: aload 6
    //   201: areturn
    //   202: astore 8
    //   204: aconst_null
    //   205: astore 7
    //   207: aload 7
    //   209: astore 6
    //   211: ldc -91
    //   213: new 112	java/lang/StringBuilder
    //   216: dup
    //   217: ldc_w 652
    //   220: invokespecial 170	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   223: aload_0
    //   224: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   227: ldc_w 654
    //   230: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   233: aload 8
    //   235: invokevirtual 593	java/io/IOException:getMessage	()Ljava/lang/String;
    //   238: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   241: invokevirtual 121	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   244: invokestatic 657	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   247: aload 7
    //   249: ifnull +8 -> 257
    //   252: aload 7
    //   254: invokevirtual 644	java/io/InputStream:close	()V
    //   257: ldc2_w 619
    //   260: ldc_w 621
    //   263: invokestatic 73	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   266: aconst_null
    //   267: areturn
    //   268: astore_0
    //   269: aconst_null
    //   270: astore 6
    //   272: aload 6
    //   274: ifnull +8 -> 282
    //   277: aload 6
    //   279: invokevirtual 644	java/io/InputStream:close	()V
    //   282: aload_0
    //   283: athrow
    //   284: astore 6
    //   286: goto -133 -> 153
    //   289: astore_0
    //   290: goto -33 -> 257
    //   293: astore 6
    //   295: goto -13 -> 282
    //   298: astore 7
    //   300: goto -135 -> 165
    //   303: astore_0
    //   304: goto -32 -> 272
    //   307: astore 8
    //   309: goto -102 -> 207
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	312	0	paramString	String
    //   0	312	1	paramInt1	int
    //   0	312	2	paramInt2	int
    //   31	109	3	i	int
    //   54	9	4	l	long
    //   58	220	6	localObject	Object
    //   284	1	6	localIOException1	IOException
    //   293	1	6	localIOException2	IOException
    //   46	207	7	localInputStream	InputStream
    //   298	1	7	localIOException3	IOException
    //   40	121	8	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   202	32	8	localIOException4	IOException
    //   307	1	8	localIOException5	IOException
    //   77	48	9	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   42	48	202	java/io/IOException
    //   42	48	268	finally
    //   148	153	284	java/io/IOException
    //   252	257	289	java/io/IOException
    //   277	282	293	java/io/IOException
    //   160	165	298	java/io/IOException
    //   60	68	303	finally
    //   72	79	303	finally
    //   93	109	303	finally
    //   122	131	303	finally
    //   211	247	303	finally
    //   60	68	307	java/io/IOException
    //   72	79	307	java/io/IOException
    //   93	109	307	java/io/IOException
    //   122	131	307	java/io/IOException
  }
  
  public static boolean deleteFile(String paramString)
  {
    GMTrace.i(13836237144064L, 103088);
    if ((paramString == null) || (paramString.length() == 0))
    {
      GMTrace.o(13836237144064L, 103088);
      return false;
    }
    SFSContextRec localSFSContextRec = kU(paramString);
    boolean bool1;
    if (localSFSContextRec != null)
    {
      str = paramString.substring(localSFSContextRec.gTl.length());
      boolean bool2 = localSFSContextRec.gTp.hB(str);
      bool1 = bool2;
      if (!bool2)
      {
        bool1 = bool2;
        if (localSFSContextRec.gTn) {
          if (!f.le(paramString)) {
            break label200;
          }
        }
      }
    }
    label123:
    label195:
    label200:
    for (String str = f.lf(paramString);; str = paramString)
    {
      bool1 = new File(str).delete();
      gTe.readLock().unlock();
      if (localSFSContextRec == null)
      {
        str = "regular";
        w.d("MicroMsg.FileOp", "deleteFile: %s [%b, %s]", new Object[] { paramString, Boolean.valueOf(bool1), str });
        GMTrace.o(13836237144064L, 103088);
        return bool1;
        if (!f.le(paramString)) {
          break label195;
        }
      }
      for (str = f.lf(paramString);; str = paramString)
      {
        bool1 = new File(str).delete();
        break;
        str = "SFS";
        break label123;
      }
    }
  }
  
  public static boolean g(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(13836371361792L, 103089);
    boolean bool = al(paramString1 + paramString2, paramString1 + paramString3);
    GMTrace.o(13836371361792L, 103089);
    return bool;
  }
  
  public static OutputStream hA(String paramString)
  {
    GMTrace.i(13834223878144L, 103073);
    paramString = kV(paramString);
    GMTrace.o(13834223878144L, 103073);
    return paramString;
  }
  
  public static void init(boolean paramBoolean)
  {
    GMTrace.i(13832881700864L, 103063);
    Context localContext = ab.getContext();
    gTg = new File(localContext.getFilesDir(), "fileop_mapping");
    gTh = av.Sd(a.ghx);
    if (paramBoolean)
    {
      gTg.delete();
      GMTrace.o(13832881700864L, 103063);
      return;
    }
    w.i("MicroMsg.FileOp", "Initializing FileOp mapping slave.");
    if (gTg.exists())
    {
      localObject1 = c(gTg.getAbsolutePath(), 0, -1);
      if (localObject1 != null)
      {
        localObject2 = Parcel.obtain();
        ((Parcel)localObject2).unmarshall((byte[])localObject1, 0, localObject1.length);
        ((Parcel)localObject2).setDataPosition(0);
        localObject1 = ((Parcel)localObject2).readBundle(SFSContextRec.class.getClassLoader());
        ((Parcel)localObject2).recycle();
        gTe.writeLock().lock();
        localObject2 = ((Bundle)localObject1).keySet().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          String str = (String)((Iterator)localObject2).next();
          SFSContextRec localSFSContextRec = (SFSContextRec)((Bundle)localObject1).getParcelable(str);
          localSFSContextRec = (SFSContextRec)gTf.put(str, localSFSContextRec);
          if ((localSFSContextRec != null) && (localSFSContextRec.gTp != null)) {
            localSFSContextRec.gTp.release();
          }
          w.i("MicroMsg.FileOp", "Load mapping from file: " + str);
        }
        gTe.writeLock().unlock();
      }
    }
    Object localObject1 = new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        GMTrace.i(13829123604480L, 103035);
        if (paramAnonymousIntent.getAction().equals("com.tencent.mm.FileOp.registerSFS"))
        {
          paramAnonymousIntent = paramAnonymousIntent.getByteArrayExtra("rec");
          if (paramAnonymousIntent == null)
          {
            GMTrace.o(13829123604480L, 103035);
            return;
          }
          paramAnonymousContext = Parcel.obtain();
          paramAnonymousContext.unmarshall(paramAnonymousIntent, 0, paramAnonymousIntent.length);
          paramAnonymousContext.setDataPosition(0);
          FileOp.SFSContextRec localSFSContextRec = (FileOp.SFSContextRec)FileOp.SFSContextRec.CREATOR.createFromParcel(paramAnonymousContext);
          if (localSFSContextRec == null)
          {
            GMTrace.o(13829123604480L, 103035);
            return;
          }
          paramAnonymousIntent = localSFSContextRec.gTl;
          FileOp.gTe.writeLock().lock();
          localSFSContextRec = (FileOp.SFSContextRec)FileOp.gTf.put(paramAnonymousIntent, localSFSContextRec);
          FileOp.gTe.writeLock().unlock();
          if ((localSFSContextRec != null) && (localSFSContextRec.gTp != null)) {
            localSFSContextRec.gTp.release();
          }
          w.i("MicroMsg.FileOp", "Load mapping from broadcast: " + paramAnonymousIntent);
          paramAnonymousContext.recycle();
          GMTrace.o(13829123604480L, 103035);
          return;
        }
        if (paramAnonymousIntent.getAction().equals("com.tencent.mm.FileOp.unregisterSFS"))
        {
          paramAnonymousContext = paramAnonymousIntent.getStringExtra("prefix");
          FileOp.gTe.writeLock().lock();
          paramAnonymousIntent = (FileOp.SFSContextRec)FileOp.gTf.remove(paramAnonymousContext);
          FileOp.gTe.writeLock().unlock();
          if ((paramAnonymousIntent != null) && (paramAnonymousIntent.gTp != null)) {
            paramAnonymousIntent.gTp.release();
          }
          w.i("MicroMsg.FileOp", "Unload mapping from broadcast: " + paramAnonymousContext);
          GMTrace.o(13829123604480L, 103035);
          return;
        }
        if (paramAnonymousIntent.getAction().equals("com.tencent.mm.FileOp.clearSFS"))
        {
          FileOp.gTe.writeLock().lock();
          paramAnonymousContext = FileOp.gTf.values().iterator();
          while (paramAnonymousContext.hasNext())
          {
            paramAnonymousIntent = (FileOp.SFSContextRec)paramAnonymousContext.next();
            if ((paramAnonymousIntent != null) && (paramAnonymousIntent.gTp != null)) {
              paramAnonymousIntent.gTp.release();
            }
          }
          FileOp.gTf.clear();
          FileOp.gTe.writeLock().unlock();
          w.i("MicroMsg.FileOp", "Clear mapping from broadcast.");
        }
        GMTrace.o(13829123604480L, 103035);
      }
    };
    Object localObject2 = new IntentFilter();
    ((IntentFilter)localObject2).addAction("com.tencent.mm.FileOp.registerSFS");
    ((IntentFilter)localObject2).addAction("com.tencent.mm.FileOp.unregisterSFS");
    ((IntentFilter)localObject2).addAction("com.tencent.mm.FileOp.clearSFS");
    localContext.registerReceiver((BroadcastReceiver)localObject1, (IntentFilter)localObject2, "com.tencent.mm.permission.MM_MESSAGE", null);
    GMTrace.o(13832881700864L, 103063);
  }
  
  public static int j(String paramString, byte[] paramArrayOfByte)
  {
    GMTrace.i(15695957983232L, 116944);
    int i = b(paramString, paramArrayOfByte, paramArrayOfByte.length);
    GMTrace.o(15695957983232L, 116944);
    return i;
  }
  
  public static void kR(String paramString)
  {
    GMTrace.i(13833284354048L, 103066);
    gTe.writeLock().lock();
    Object localObject = (SFSContextRec)gTf.remove(paramString);
    gTe.writeLock().unlock();
    if ((localObject != null) && (((SFSContextRec)localObject).gTp != null)) {
      ((SFSContextRec)localObject).gTp.release();
    }
    localObject = ab.getContext();
    ((Context)localObject).sendBroadcast(new Intent("com.tencent.mm.FileOp.unregisterSFS").putExtra("prefix", paramString).setPackage(((Context)localObject).getPackageName()), "com.tencent.mm.permission.MM_MESSAGE");
    KW();
    w.i("MicroMsg.FileOp", "Unregister SFS for prefix: " + paramString);
    GMTrace.o(13833284354048L, 103066);
  }
  
  private static boolean kS(String paramString)
  {
    GMTrace.i(13833687007232L, 103069);
    gTe.readLock().lock();
    Map.Entry localEntry = gTf.floorEntry(paramString);
    if ((localEntry != null) && (paramString.startsWith((String)localEntry.getKey())))
    {
      paramString = (SFSContextRec)localEntry.getValue();
      if ((paramString.gTo) || (paramString.gTm != null) || (paramString.gTn)) {}
    }
    for (boolean bool = false;; bool = true)
    {
      gTe.readLock().unlock();
      GMTrace.o(13833687007232L, 103069);
      return bool;
    }
  }
  
  private static boolean kT(String paramString)
  {
    GMTrace.i(13833821224960L, 103070);
    gTe.readLock().lock();
    Object localObject = gTf.floorEntry(paramString);
    if ((localObject != null) && (paramString.startsWith((String)((Map.Entry)localObject).getKey())))
    {
      localObject = (SFSContextRec)((Map.Entry)localObject).getValue();
      if ((((SFSContextRec)localObject).gTo) || (a(paramString, (SFSContextRec)localObject))) {}
    }
    for (boolean bool = false;; bool = true)
    {
      gTe.readLock().unlock();
      GMTrace.o(13833821224960L, 103070);
      return bool;
    }
  }
  
  private static SFSContextRec kU(String paramString)
  {
    GMTrace.i(13833955442688L, 103071);
    gTe.readLock().lock();
    Object localObject = gTf.floorEntry(paramString);
    if (localObject == null)
    {
      GMTrace.o(13833955442688L, 103071);
      return null;
    }
    if (paramString.startsWith((String)((Map.Entry)localObject).getKey()))
    {
      SFSContextRec localSFSContextRec = (SFSContextRec)((Map.Entry)localObject).getValue();
      localObject = localSFSContextRec;
      if (!a(paramString, localSFSContextRec)) {}
    }
    for (localObject = null;; localObject = null)
    {
      if ((localObject != null) && (!((SFSContextRec)localObject).gTo))
      {
        if (((SFSContextRec)localObject).gTp == null) {}
        try
        {
          paramString = ((SFSContextRec)localObject).gTp;
          if (paramString == null) {}
          try
          {
            ((SFSContextRec)localObject).gTp = ((SFSContextRec)localObject).gTq.create();
            GMTrace.o(13833955442688L, 103071);
            return (SFSContextRec)localObject;
          }
          catch (Exception paramString)
          {
            w.e("MicroMsg.FileOp", "Failed to create SFSContext for prefix '%s': %s", new Object[] { ((SFSContextRec)localObject).gTl, paramString.getMessage() });
            ((SFSContextRec)localObject).gTo = true;
            GMTrace.o(13833955442688L, 103071);
            return null;
          }
          GMTrace.o(13833955442688L, 103071);
        }
        finally {}
      }
      return null;
    }
  }
  
  public static OutputStream kV(String paramString)
  {
    GMTrace.i(13834492313600L, 103075);
    if ((paramString == null) || (paramString.length() == 0)) {
      throw new FileNotFoundException("path == null");
    }
    String str2 = "";
    String str1 = paramString;
    if (f.le(paramString))
    {
      str2 = f.lh(paramString);
      str1 = f.lf(paramString);
    }
    paramString = ak(str1, str2);
    GMTrace.o(13834492313600L, 103075);
    return paramString;
  }
  
  /* Error */
  public static boolean kW(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore 5
    //   6: ldc2_w 798
    //   9: ldc_w 800
    //   12: invokestatic 37	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   15: aload_0
    //   16: ifnull +10 -> 26
    //   19: aload_0
    //   20: invokevirtual 87	java/lang/String:length	()I
    //   23: ifne +14 -> 37
    //   26: ldc2_w 798
    //   29: ldc_w 800
    //   32: invokestatic 73	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   35: iconst_0
    //   36: ireturn
    //   37: aload_0
    //   38: invokestatic 97	com/tencent/mm/modelsfs/FileOp:kU	(Ljava/lang/String;)Lcom/tencent/mm/modelsfs/FileOp$SFSContextRec;
    //   41: astore_2
    //   42: aload_2
    //   43: ifnonnull +23 -> 66
    //   46: getstatic 44	com/tencent/mm/modelsfs/FileOp:gTe	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   49: invokevirtual 228	java/util/concurrent/locks/ReentrantReadWriteLock:readLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   52: invokevirtual 233	java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock:unlock	()V
    //   55: ldc2_w 798
    //   58: ldc_w 800
    //   61: invokestatic 73	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   64: iconst_1
    //   65: ireturn
    //   66: aload_0
    //   67: aload_2
    //   68: getfield 100	com/tencent/mm/modelsfs/FileOp$SFSContextRec:gTl	Ljava/lang/String;
    //   71: invokevirtual 87	java/lang/String:length	()I
    //   74: invokevirtual 104	java/lang/String:substring	(I)Ljava/lang/String;
    //   77: astore_3
    //   78: aload_2
    //   79: getfield 125	com/tencent/mm/modelsfs/FileOp$SFSContextRec:gTp	Lcom/tencent/mm/modelsfs/SFSContext;
    //   82: aload_3
    //   83: invokevirtual 801	com/tencent/mm/modelsfs/SFSContext:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   86: astore_2
    //   87: new 189	java/io/File
    //   90: dup
    //   91: aload_0
    //   92: invokespecial 190	java/io/File:<init>	(Ljava/lang/String;)V
    //   95: invokevirtual 804	java/io/File:getParent	()Ljava/lang/String;
    //   98: astore_3
    //   99: aload_3
    //   100: invokestatic 809	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   103: ifne +15 -> 118
    //   106: new 189	java/io/File
    //   109: dup
    //   110: aload_3
    //   111: invokespecial 190	java/io/File:<init>	(Ljava/lang/String;)V
    //   114: invokevirtual 812	java/io/File:mkdirs	()Z
    //   117: pop
    //   118: new 553	java/io/FileOutputStream
    //   121: dup
    //   122: aload_0
    //   123: invokespecial 554	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   126: astore_3
    //   127: sipush 1024
    //   130: newarray <illegal type>
    //   132: astore 4
    //   134: aload_2
    //   135: aload 4
    //   137: invokevirtual 815	java/io/InputStream:read	([B)I
    //   140: istore_1
    //   141: iload_1
    //   142: iconst_m1
    //   143: if_icmpeq +76 -> 219
    //   146: aload_3
    //   147: aload 4
    //   149: iconst_0
    //   150: iload_1
    //   151: invokevirtual 587	java/io/OutputStream:write	([BII)V
    //   154: goto -20 -> 134
    //   157: astore 4
    //   159: ldc -91
    //   161: ldc_w 817
    //   164: iconst_2
    //   165: anewarray 4	java/lang/Object
    //   168: dup
    //   169: iconst_0
    //   170: aload_0
    //   171: aastore
    //   172: dup
    //   173: iconst_1
    //   174: aload 4
    //   176: invokevirtual 593	java/io/IOException:getMessage	()Ljava/lang/String;
    //   179: aastore
    //   180: invokestatic 373	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   183: aload_2
    //   184: ifnull +7 -> 191
    //   187: aload_2
    //   188: invokevirtual 644	java/io/InputStream:close	()V
    //   191: aload_3
    //   192: ifnull +7 -> 199
    //   195: aload_3
    //   196: invokevirtual 590	java/io/OutputStream:close	()V
    //   199: getstatic 44	com/tencent/mm/modelsfs/FileOp:gTe	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   202: invokevirtual 228	java/util/concurrent/locks/ReentrantReadWriteLock:readLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   205: invokevirtual 233	java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock:unlock	()V
    //   208: ldc2_w 798
    //   211: ldc_w 800
    //   214: invokestatic 73	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   217: iconst_0
    //   218: ireturn
    //   219: aload_2
    //   220: invokevirtual 644	java/io/InputStream:close	()V
    //   223: aload_3
    //   224: invokevirtual 590	java/io/OutputStream:close	()V
    //   227: getstatic 44	com/tencent/mm/modelsfs/FileOp:gTe	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   230: invokevirtual 228	java/util/concurrent/locks/ReentrantReadWriteLock:readLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   233: invokevirtual 233	java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock:unlock	()V
    //   236: ldc2_w 798
    //   239: ldc_w 800
    //   242: invokestatic 73	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   245: iconst_1
    //   246: ireturn
    //   247: astore_0
    //   248: aconst_null
    //   249: astore_2
    //   250: aload 4
    //   252: astore_3
    //   253: aload_2
    //   254: ifnull +7 -> 261
    //   257: aload_2
    //   258: invokevirtual 644	java/io/InputStream:close	()V
    //   261: aload_3
    //   262: ifnull +7 -> 269
    //   265: aload_3
    //   266: invokevirtual 590	java/io/OutputStream:close	()V
    //   269: getstatic 44	com/tencent/mm/modelsfs/FileOp:gTe	Ljava/util/concurrent/locks/ReentrantReadWriteLock;
    //   272: invokevirtual 228	java/util/concurrent/locks/ReentrantReadWriteLock:readLock	()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
    //   275: invokevirtual 233	java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock:unlock	()V
    //   278: aload_0
    //   279: athrow
    //   280: astore_0
    //   281: goto -58 -> 223
    //   284: astore_0
    //   285: goto -58 -> 227
    //   288: astore_0
    //   289: goto -98 -> 191
    //   292: astore_0
    //   293: goto -94 -> 199
    //   296: astore_2
    //   297: goto -36 -> 261
    //   300: astore_2
    //   301: goto -32 -> 269
    //   304: astore_0
    //   305: aload 4
    //   307: astore_3
    //   308: goto -55 -> 253
    //   311: astore_0
    //   312: goto -59 -> 253
    //   315: astore_0
    //   316: goto -63 -> 253
    //   319: astore 4
    //   321: aconst_null
    //   322: astore_2
    //   323: aload 5
    //   325: astore_3
    //   326: goto -167 -> 159
    //   329: astore 4
    //   331: aload 5
    //   333: astore_3
    //   334: goto -175 -> 159
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	337	0	paramString	String
    //   140	11	1	i	int
    //   41	217	2	localObject1	Object
    //   296	1	2	localIOException1	IOException
    //   300	1	2	localIOException2	IOException
    //   322	1	2	localObject2	Object
    //   77	257	3	localObject3	Object
    //   1	147	4	arrayOfByte	byte[]
    //   157	149	4	localIOException3	IOException
    //   319	1	4	localIOException4	IOException
    //   329	1	4	localIOException5	IOException
    //   4	328	5	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   127	134	157	java/io/IOException
    //   134	141	157	java/io/IOException
    //   146	154	157	java/io/IOException
    //   66	87	247	finally
    //   219	223	280	java/io/IOException
    //   223	227	284	java/io/IOException
    //   187	191	288	java/io/IOException
    //   195	199	292	java/io/IOException
    //   257	261	296	java/io/IOException
    //   265	269	300	java/io/IOException
    //   87	118	304	finally
    //   118	127	304	finally
    //   127	134	311	finally
    //   134	141	311	finally
    //   146	154	311	finally
    //   159	183	315	finally
    //   66	87	319	java/io/IOException
    //   87	118	329	java/io/IOException
    //   118	127	329	java/io/IOException
  }
  
  public static long kX(String paramString)
  {
    long l = 0L;
    GMTrace.i(13834894966784L, 103078);
    if (paramString == null)
    {
      GMTrace.o(13834894966784L, 103078);
      return 0L;
    }
    SFSContextRec localSFSContextRec = kU(paramString);
    if (localSFSContextRec != null)
    {
      localObject = paramString.substring(localSFSContextRec.gTl.length());
      localObject = localSFSContextRec.gTp.lj((String)localObject);
      if (localObject == null) {
        if (localSFSContextRec.gTn) {
          if (!f.le(paramString)) {
            break label199;
          }
        }
      }
    }
    label114:
    label199:
    for (Object localObject = f.lf(paramString);; localObject = paramString)
    {
      for (l = new File((String)localObject).length();; l = ((SFSContext.FileEntry)localObject).size)
      {
        gTe.readLock().unlock();
        if (localSFSContextRec != null) {
          break;
        }
        localObject = "regular";
        w.d("MicroMsg.FileOp", "readFileLength: %s [%d, %s]", new Object[] { paramString, Long.valueOf(l), localObject });
        GMTrace.o(13834894966784L, 103078);
        return l;
      }
      if (f.le(paramString)) {}
      for (localObject = f.lf(paramString);; localObject = paramString)
      {
        l = new File((String)localObject).length();
        break;
        localObject = "SFS";
        break label114;
      }
    }
  }
  
  public static long kY(String paramString)
  {
    long l = 0L;
    GMTrace.i(13835029184512L, 103079);
    if ((paramString == null) || (paramString.length() == 0))
    {
      GMTrace.o(13835029184512L, 103079);
      return 0L;
    }
    Object localObject1 = kU(paramString);
    Object localObject2;
    if (localObject1 != null)
    {
      localObject2 = paramString.substring(((SFSContextRec)localObject1).gTl.length());
      localObject2 = ((SFSContextRec)localObject1).gTp.lj((String)localObject2);
      if (localObject2 == null)
      {
        if (((SFSContextRec)localObject1).gTn) {
          l = new File(paramString).lastModified();
        }
        gTe.readLock().unlock();
        if (localObject1 != null) {
          break label173;
        }
      }
    }
    label173:
    for (localObject1 = "regular";; localObject1 = "SFS")
    {
      w.d("MicroMsg.FileOp", "getFileTime: %s [%d, %s]", new Object[] { paramString, Long.valueOf(l), localObject1 });
      GMTrace.o(13835029184512L, 103079);
      return l;
      l = ((SFSContext.FileEntry)localObject2).timestamp * 1000L;
      break;
      l = new File(paramString).lastModified();
      break;
    }
  }
  
  public static String kZ(String paramString)
  {
    GMTrace.i(13835700273152L, 103084);
    paramString = new File(f.lf(paramString)).getParentFile().getAbsolutePath();
    GMTrace.o(13835700273152L, 103084);
    return paramString;
  }
  
  public static boolean la(String paramString)
  {
    GMTrace.i(13835834490880L, 103085);
    if ((paramString == null) || (paramString.length() == 0))
    {
      GMTrace.o(13835834490880L, 103085);
      return false;
    }
    paramString = f.lf(paramString);
    if (!kS(paramString))
    {
      GMTrace.o(13835834490880L, 103085);
      return true;
    }
    paramString = new File(paramString);
    if ((paramString.exists()) && (paramString.isDirectory()))
    {
      GMTrace.o(13835834490880L, 103085);
      return true;
    }
    boolean bool = paramString.mkdirs();
    GMTrace.o(13835834490880L, 103085);
    return bool;
  }
  
  /* Error */
  public static boolean lb(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 855
    //   3: ldc_w 857
    //   6: invokestatic 37	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: ifnull +10 -> 20
    //   13: aload_0
    //   14: invokevirtual 87	java/lang/String:length	()I
    //   17: ifne +14 -> 31
    //   20: ldc2_w 855
    //   23: ldc_w 857
    //   26: invokestatic 73	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   29: iconst_0
    //   30: ireturn
    //   31: aload_0
    //   32: invokestatic 859	com/tencent/mm/modelsfs/FileOp:aZ	(Ljava/lang/String;)Z
    //   35: ifne +12 -> 47
    //   38: aload_0
    //   39: invokestatic 581	com/tencent/mm/modelsfs/FileOp:kV	(Ljava/lang/String;)Ljava/io/OutputStream;
    //   42: astore_1
    //   43: aload_1
    //   44: invokevirtual 590	java/io/OutputStream:close	()V
    //   47: ldc2_w 855
    //   50: ldc_w 857
    //   53: invokestatic 73	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   56: iconst_1
    //   57: ireturn
    //   58: astore_1
    //   59: ldc -91
    //   61: ldc_w 861
    //   64: iconst_2
    //   65: anewarray 4	java/lang/Object
    //   68: dup
    //   69: iconst_0
    //   70: aload_0
    //   71: aastore
    //   72: dup
    //   73: iconst_1
    //   74: aload_1
    //   75: invokevirtual 593	java/io/IOException:getMessage	()Ljava/lang/String;
    //   78: aastore
    //   79: invokestatic 373	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   82: ldc2_w 855
    //   85: ldc_w 857
    //   88: invokestatic 73	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   91: iconst_0
    //   92: ireturn
    //   93: astore_0
    //   94: goto -47 -> 47
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	97	0	paramString	String
    //   42	2	1	localOutputStream	OutputStream
    //   58	17	1	localIOException	IOException
    // Exception table:
    //   from	to	target	type
    //   38	43	58	java/io/IOException
    //   43	47	93	java/io/IOException
  }
  
  public static void lc(String paramString)
  {
    GMTrace.i(13837042450432L, 103094);
    if ((paramString == null) || (paramString.length() == 0))
    {
      GMTrace.o(13837042450432L, 103094);
      return;
    }
    if (kS(paramString)) {
      try
      {
        new File(paramString, ".nomedia").createNewFile();
        GMTrace.o(13837042450432L, 103094);
        return;
      }
      catch (IOException localIOException)
      {
        w.e("MicroMsg.FileOp", "markNoMedia '%s' failed: %s", new Object[] { paramString, localIOException.getMessage() });
      }
    }
    GMTrace.o(13837042450432L, 103094);
  }
  
  public static String ld(String paramString)
  {
    GMTrace.i(13837176668160L, 103095);
    if (!aZ(paramString))
    {
      GMTrace.o(13837176668160L, 103095);
      return null;
    }
    long l = kX(paramString);
    paramString = com.tencent.mm.a.g.n((paramString + "-" + l).getBytes());
    GMTrace.o(13837176668160L, 103095);
    return paramString;
  }
  
  /* Error */
  public static long o(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc2_w 894
    //   3: ldc_w 896
    //   6: invokestatic 37	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: ifnull +21 -> 31
    //   13: aload_0
    //   14: invokevirtual 87	java/lang/String:length	()I
    //   17: ifeq +14 -> 31
    //   20: aload_1
    //   21: ifnull +10 -> 31
    //   24: aload_1
    //   25: invokevirtual 87	java/lang/String:length	()I
    //   28: ifne +16 -> 44
    //   31: ldc2_w 894
    //   34: ldc_w 896
    //   37: invokestatic 73	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   40: ldc2_w 897
    //   43: lreturn
    //   44: aconst_null
    //   45: astore 5
    //   47: aconst_null
    //   48: astore 7
    //   50: aconst_null
    //   51: astore 8
    //   53: aload_0
    //   54: invokestatic 603	com/tencent/mm/modelsfs/FileOp:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   57: astore 6
    //   59: aload 6
    //   61: astore 5
    //   63: aload_1
    //   64: invokestatic 581	com/tencent/mm/modelsfs/FileOp:kV	(Ljava/lang/String;)Ljava/io/OutputStream;
    //   67: astore 6
    //   69: sipush 1024
    //   72: newarray <illegal type>
    //   74: astore 7
    //   76: lconst_0
    //   77: lstore_3
    //   78: aload 5
    //   80: aload 7
    //   82: invokevirtual 815	java/io/InputStream:read	([B)I
    //   85: istore_2
    //   86: iload_2
    //   87: iconst_m1
    //   88: if_icmpeq +20 -> 108
    //   91: aload 6
    //   93: aload 7
    //   95: iconst_0
    //   96: iload_2
    //   97: invokevirtual 587	java/io/OutputStream:write	([BII)V
    //   100: lload_3
    //   101: iload_2
    //   102: i2l
    //   103: ladd
    //   104: lstore_3
    //   105: goto -27 -> 78
    //   108: ldc -91
    //   110: ldc_w 900
    //   113: iconst_2
    //   114: anewarray 4	java/lang/Object
    //   117: dup
    //   118: iconst_0
    //   119: aload_0
    //   120: aastore
    //   121: dup
    //   122: iconst_1
    //   123: aload_1
    //   124: aastore
    //   125: invokestatic 247	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   128: aload 5
    //   130: ifnull +8 -> 138
    //   133: aload 5
    //   135: invokevirtual 644	java/io/InputStream:close	()V
    //   138: aload 6
    //   140: ifnull +8 -> 148
    //   143: aload 6
    //   145: invokevirtual 590	java/io/OutputStream:close	()V
    //   148: ldc2_w 894
    //   151: ldc_w 896
    //   154: invokestatic 73	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   157: lload_3
    //   158: lreturn
    //   159: astore 7
    //   161: aload 8
    //   163: astore 6
    //   165: ldc -91
    //   167: ldc_w 902
    //   170: iconst_3
    //   171: anewarray 4	java/lang/Object
    //   174: dup
    //   175: iconst_0
    //   176: aload_0
    //   177: aastore
    //   178: dup
    //   179: iconst_1
    //   180: aload_1
    //   181: aastore
    //   182: dup
    //   183: iconst_2
    //   184: aload 7
    //   186: invokevirtual 593	java/io/IOException:getMessage	()Ljava/lang/String;
    //   189: aastore
    //   190: invokestatic 373	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   193: aload 5
    //   195: ifnull +8 -> 203
    //   198: aload 5
    //   200: invokevirtual 644	java/io/InputStream:close	()V
    //   203: aload 6
    //   205: ifnull +8 -> 213
    //   208: aload 6
    //   210: invokevirtual 590	java/io/OutputStream:close	()V
    //   213: ldc2_w 894
    //   216: ldc_w 896
    //   219: invokestatic 73	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   222: ldc2_w 897
    //   225: lreturn
    //   226: astore_0
    //   227: aconst_null
    //   228: astore 5
    //   230: aload 7
    //   232: astore 6
    //   234: aload 5
    //   236: ifnull +8 -> 244
    //   239: aload 5
    //   241: invokevirtual 644	java/io/InputStream:close	()V
    //   244: aload 6
    //   246: ifnull +8 -> 254
    //   249: aload 6
    //   251: invokevirtual 590	java/io/OutputStream:close	()V
    //   254: aload_0
    //   255: athrow
    //   256: astore_0
    //   257: goto -119 -> 138
    //   260: astore_0
    //   261: goto -113 -> 148
    //   264: astore_0
    //   265: goto -62 -> 203
    //   268: astore_0
    //   269: goto -56 -> 213
    //   272: astore_1
    //   273: goto -29 -> 244
    //   276: astore_1
    //   277: goto -23 -> 254
    //   280: astore_0
    //   281: aload 7
    //   283: astore 6
    //   285: goto -51 -> 234
    //   288: astore_0
    //   289: goto -55 -> 234
    //   292: astore_0
    //   293: goto -59 -> 234
    //   296: astore 7
    //   298: aload 8
    //   300: astore 6
    //   302: goto -137 -> 165
    //   305: astore 7
    //   307: goto -142 -> 165
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	310	0	paramString1	String
    //   0	310	1	paramString2	String
    //   85	17	2	i	int
    //   77	81	3	l	long
    //   45	195	5	localObject1	Object
    //   57	244	6	localObject2	Object
    //   48	46	7	arrayOfByte	byte[]
    //   159	123	7	localIOException1	IOException
    //   296	1	7	localIOException2	IOException
    //   305	1	7	localIOException3	IOException
    //   51	248	8	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   53	59	159	java/io/IOException
    //   53	59	226	finally
    //   133	138	256	java/io/IOException
    //   143	148	260	java/io/IOException
    //   198	203	264	java/io/IOException
    //   208	213	268	java/io/IOException
    //   239	244	272	java/io/IOException
    //   249	254	276	java/io/IOException
    //   63	69	280	finally
    //   69	76	288	finally
    //   78	86	288	finally
    //   91	100	288	finally
    //   108	128	288	finally
    //   165	193	292	finally
    //   63	69	296	java/io/IOException
    //   69	76	305	java/io/IOException
    //   78	86	305	java/io/IOException
    //   91	100	305	java/io/IOException
    //   108	128	305	java/io/IOException
  }
  
  public static InputStream openRead(String paramString)
  {
    GMTrace.i(13834089660416L, 103072);
    if ((paramString == null) || (paramString.length() == 0)) {
      throw new FileNotFoundException("path == null");
    }
    Object localObject2 = kU(paramString);
    if (localObject2 == null) {}
    for (;;)
    {
      try
      {
        if (f.le(paramString))
        {
          long l = f.lg(paramString);
          localObject1 = new b(f.lf(paramString), l);
          gTe.readLock().unlock();
          if (localObject2 != null) {
            break label197;
          }
          localObject2 = "regular";
          w.d("MicroMsg.FileOp", "openRead: %s [%s, %s]", new Object[] { paramString, "ok", localObject2 });
          GMTrace.o(13834089660416L, 103072);
          return (InputStream)localObject1;
        }
        Object localObject1 = new FileInputStream(paramString);
        continue;
        try
        {
          localObject1 = paramString.substring(((SFSContextRec)localObject2).gTl.length());
          localObject1 = ((SFSContextRec)localObject2).gTp.openRead((String)localObject1);
        }
        catch (FileNotFoundException localFileNotFoundException)
        {
          if (!((SFSContextRec)localObject2).gTn) {
            throw localFileNotFoundException;
          }
          FileInputStream localFileInputStream = new FileInputStream(paramString);
        }
      }
      finally
      {
        gTe.readLock().unlock();
      }
      continue;
      label197:
      localObject2 = "SFS";
    }
  }
  
  static class SFSContextRec
    implements Parcelable
  {
    public static final Parcelable.Creator<SFSContextRec> CREATOR;
    String gTl;
    String[] gTm;
    boolean gTn;
    boolean gTo;
    SFSContext gTp;
    SFSContext.Builder gTq;
    
    static
    {
      GMTrace.i(13844558643200L, 103150);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(13844558643200L, 103150);
    }
    
    public SFSContextRec()
    {
      GMTrace.i(13844290207744L, 103148);
      GMTrace.o(13844290207744L, 103148);
    }
    
    SFSContextRec(Parcel paramParcel)
    {
      GMTrace.i(13844424425472L, 103149);
      this.gTl = paramParcel.readString();
      this.gTm = paramParcel.createStringArray();
      if (paramParcel.readByte() != 0) {}
      for (boolean bool = true;; bool = false)
      {
        this.gTn = bool;
        this.gTp = null;
        this.gTo = false;
        this.gTq = ((SFSContext.Builder)paramParcel.readParcelable(SFSContext.Builder.class.getClassLoader()));
        GMTrace.o(13844424425472L, 103149);
        return;
      }
    }
    
    public int describeContents()
    {
      GMTrace.i(13844021772288L, 103146);
      GMTrace.o(13844021772288L, 103146);
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(13844155990016L, 103147);
      paramParcel.writeString(this.gTl);
      paramParcel.writeStringArray(this.gTm);
      if (this.gTn) {}
      for (int i = 1;; i = 0)
      {
        paramParcel.writeByte((byte)i);
        paramParcel.writeParcelable(this.gTq, paramInt);
        GMTrace.o(13844155990016L, 103147);
        return;
      }
    }
  }
  
  final class a
  {
    File[] gTk;
    int pos;
    
    a()
    {
      GMTrace.i(13842948030464L, 103138);
      this.gTk = null;
      this.pos = 0;
      GMTrace.o(13842948030464L, 103138);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelsfs\FileOp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */