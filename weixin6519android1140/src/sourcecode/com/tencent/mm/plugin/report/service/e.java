package com.tencent.mm.plugin.report.service;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public final class e
{
  private static String filePath;
  private static Byte oqY;
  
  static
  {
    GMTrace.i(13119648694272L, 97749);
    filePath = getAppFilePath() + "/kvcomm/exception/";
    oqY = new Byte((byte)0);
    if (!com.tencent.mm.a.e.aZ(filePath)) {
      com.tencent.mm.a.e.bd(filePath);
    }
    GMTrace.o(13119648694272L, 97749);
  }
  
  public static void b(int paramInt, String arg1, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(13118843387904L, 97743);
    if (!com.tencent.mm.a.e.aZ(filePath))
    {
      w.e("MicroMsg.ReportManagerKvCheck", "saveKVcommData, filepath:" + filePath + " not exist , logId:" + paramInt + ", val:" + ??? + ", isImportant:" + paramBoolean2 + ", reportnow:" + paramBoolean1);
      GMTrace.o(13118843387904L, 97743);
      return;
    }
    w.i("MicroMsg.ReportManagerKvCheck", "saveKVcommData, logId:" + paramInt + ", val:" + ??? + ", isImportant:" + paramBoolean2 + ", reportnow:" + paramBoolean1);
    String str = bbY();
    if ("MM".equals(str))
    {
      w.e("MicroMsg.ReportManagerKvCheck", "error path, invalid processname:" + str + ", logId:" + paramInt + ", val:" + ??? + ", isImportant:" + paramBoolean2 + ", reportnow:" + paramBoolean1);
      GMTrace.o(13118843387904L, 97743);
      return;
    }
    str = filePath + str + ".statictis";
    Object localObject2 = new c();
    ((c)localObject2).oqP = paramInt;
    ((c)localObject2).oqQ = ???;
    ((c)localObject2).oqI = paramBoolean2;
    ((c)localObject2).oqR = paramBoolean1;
    try
    {
      localObject2 = ((c)localObject2).toByteArray();
      if (localObject2 == null)
      {
        w.e("MicroMsg.ReportManagerKvCheck", "saveKVcommData, null == temp.");
        GMTrace.o(13118843387904L, 97743);
        return;
      }
    }
    catch (IOException ???)
    {
      w.e("MicroMsg.ReportManagerKvCheck", "saveIDKeyData, IOException, detail:" + ???.getMessage());
      GMTrace.o(13118843387904L, 97743);
      return;
    }
    synchronized (oqY)
    {
      if (com.tencent.mm.a.e.d(str, to(localObject2.length)) != 0)
      {
        w.e("MicroMsg.ReportManagerKvCheck", "saveKVcommData, write obj_len to file:" + str + " fail.");
        GMTrace.o(13118843387904L, 97743);
        return;
      }
      if (com.tencent.mm.a.e.d(str, (byte[])localObject2) != 0) {
        w.e("MicroMsg.ReportManagerKvCheck", "saveKVcommData, write object to file:" + str + " fail.");
      }
      GMTrace.o(13118843387904L, 97743);
      return;
    }
  }
  
  public static void bbX()
  {
    GMTrace.i(13118709170176L, 97742);
    if (!com.tencent.mm.a.e.aZ(filePath))
    {
      w.w("MicroMsg.ReportManagerKvCheck", "loadFilesToReport, filepath:" + filePath + " not exist.");
      GMTrace.o(13118709170176L, 97742);
      return;
    }
    File[] arrayOfFile = new File(filePath).listFiles();
    if (arrayOfFile == null)
    {
      w.e("MicroMsg.ReportManagerKvCheck", "list file fail, filePath:" + filePath);
      GMTrace.o(13118709170176L, 97742);
      return;
    }
    for (;;)
    {
      int j;
      String str;
      int i;
      synchronized (oqY)
      {
        int k = arrayOfFile.length;
        j = 0;
        if (j >= k) {
          break label916;
        }
        localObject2 = arrayOfFile[j];
        if (localObject2 == null)
        {
          w.e("MicroMsg.ReportManagerKvCheck", "loadFilesToReport, file is null");
        }
        else
        {
          str = ((File)localObject2).getAbsolutePath();
          i = 0;
          int m = com.tencent.mm.a.e.aY(str);
          w.d("MicroMsg.ReportManagerKvCheck", "loadFilesToReport, filename:" + ((File)localObject2).getAbsolutePath() + ", filelenth:" + m);
          if (i >= m)
          {
            w.d("MicroMsg.ReportManagerKvCheck", "loadFilesToReport, read to end, deletefile:" + str);
            com.tencent.mm.loader.stub.b.deleteFile(str);
          }
        }
      }
      Object localObject2 = com.tencent.mm.a.e.c(str, i, 4);
      if (localObject2 == null)
      {
        w.e("MicroMsg.ReportManagerKvCheck", "loadFilesToReport, get obj_len fail. delete file:" + str);
      }
      else
      {
        i += 4;
        int n = byteArrayToInt((byte[])localObject2);
        localObject2 = com.tencent.mm.a.e.c(str, i, n);
        if (localObject2 == null)
        {
          w.e("MicroMsg.ReportManagerKvCheck", "loadFilesToReport, get obj_data fail. delete file:" + str);
        }
        else
        {
          i += n;
          Object localObject3;
          if (str.contains(".statictis")) {
            localObject3 = new c();
          }
          for (;;)
          {
            boolean bool1;
            try
            {
              ((c)localObject3).aD((byte[])localObject2);
              n = ((c)localObject3).oqP;
              localObject2 = ((c)localObject3).oqQ;
              bool1 = ((c)localObject3).oqI;
              boolean bool2 = ((c)localObject3).oqR;
              w.i("MicroMsg.ReportManagerKvCheck", "loadFilesToReport, reportkvcomm, logid:" + n + ", value:" + (String)localObject2 + ", isReportNow:" + bool2 + ", isImportant" + bool1);
              g.ork.a(n, (String)localObject2, bool2, bool1);
              w.d("MicroMsg.ReportManagerKvCheck", "loadFilesToReport, curLen:" + i);
            }
            catch (IOException localIOException1)
            {
              w.e("MicroMsg.ReportManagerKvCheck", "loadFilesToReport(kvcomm), IOException:" + localIOException1.getMessage());
            }
            break;
            if (str.contains(".monitor"))
            {
              localObject3 = new b();
              try
              {
                ((b)localObject3).aD(localIOException1);
                long l1 = ((b)localObject3).etB;
                long l2 = ((b)localObject3).oqG;
                long l3 = ((b)localObject3).oqH;
                bool1 = ((b)localObject3).oqI;
                w.i("MicroMsg.ReportManagerKvCheck", "loadFilesToReport, reportidkey, id:" + l1 + ", key:" + l2 + ", value:" + l3 + ", isImportant" + bool1);
                g.ork.a(l1, l2, l3, bool1);
              }
              catch (IOException localIOException2)
              {
                w.e("MicroMsg.ReportManagerKvCheck", "loadFilesToReport(idkey), IOException:" + localIOException2.getMessage());
              }
              break;
            }
            if (!str.contains(".group_monitor")) {
              break label890;
            }
            localObject3 = new a();
            try
            {
              ((a)localObject3).aD(localIOException2);
              ArrayList localArrayList = new ArrayList();
              bool1 = false;
              localObject3 = ((a)localObject3).oqF.iterator();
              while (((Iterator)localObject3).hasNext())
              {
                b localb = (b)((Iterator)localObject3).next();
                IDKey localIDKey = new IDKey(localb.etB, localb.oqG, localb.oqH);
                bool1 = localb.oqI;
                localArrayList.add(localIDKey);
                w.i("MicroMsg.ReportManagerKvCheck", "loadFilesToReport, idkeyGroupStat, id:" + localb.etB + ", key:" + localb.oqG + ", value:" + localb.oqH + ", isImportant" + bool1);
              }
              g.ork.b(localArrayList, bool1);
            }
            catch (IOException localIOException3)
            {
              w.e("MicroMsg.ReportManagerKvCheck", "loadFilesToReport(idkey), IOException:" + localIOException3.getMessage());
            }
          }
          continue;
          label890:
          w.e("MicroMsg.ReportManagerKvCheck", "invalid filename:" + str);
          continue;
          label916:
          GMTrace.o(13118709170176L, 97742);
          return;
          j += 1;
        }
      }
    }
  }
  
  private static String bbY()
  {
    GMTrace.i(13119246041088L, 97746);
    Object localObject = ab.vM();
    if ((localObject == null) || (((String)localObject).length() == 0))
    {
      GMTrace.o(13119246041088L, 97746);
      return "MM";
    }
    localObject = ((String)localObject).split(":");
    if (localObject.length <= 1)
    {
      GMTrace.o(13119246041088L, 97746);
      return "MM";
    }
    localObject = localObject[1];
    GMTrace.o(13119246041088L, 97746);
    return (String)localObject;
  }
  
  private static int byteArrayToInt(byte[] paramArrayOfByte)
  {
    int i = 0;
    GMTrace.i(13119514476544L, 97748);
    int j = 0;
    while (i < 4)
    {
      j += ((paramArrayOfByte[i] & 0xFF) << (3 - i) * 8);
      i += 1;
    }
    GMTrace.o(13119514476544L, 97748);
    return j;
  }
  
  public static void d(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    GMTrace.i(13118977605632L, 97744);
    w.i("MicroMsg.ReportManagerKvCheck", "saveIDKeyData, id:" + paramInt1 + ", key:" + paramInt2 + ", value:" + paramInt3 + ", isImportant:" + paramBoolean);
    if (!com.tencent.mm.a.e.aZ(filePath))
    {
      w.e("MicroMsg.ReportManagerKvCheck", "saveIDKeyData, filepath:" + filePath + " not exist , Id:" + paramInt1 + ", key:" + paramInt2 + ", value:" + paramInt3 + ", isImportant:" + paramBoolean);
      GMTrace.o(13118977605632L, 97744);
      return;
    }
    String str = bbY();
    if ("MM".equals(str))
    {
      w.e("MicroMsg.ReportManagerKvCheck", "error path, current processname:" + str + ", id:" + paramInt1 + ", key:" + paramInt2 + ", val:" + paramInt3 + ", isImportant:" + paramBoolean);
      GMTrace.o(13118977605632L, 97744);
      return;
    }
    str = filePath + str + ".monitor";
    ??? = new b();
    ((b)???).etB = paramInt1;
    ((b)???).oqG = paramInt2;
    ((b)???).oqH = paramInt3;
    ((b)???).oqI = paramBoolean;
    byte[] arrayOfByte;
    try
    {
      arrayOfByte = ((b)???).toByteArray();
      if (arrayOfByte == null)
      {
        w.e("MicroMsg.ReportManagerKvCheck", "saveIDKeyData, null == temp.");
        GMTrace.o(13118977605632L, 97744);
        return;
      }
    }
    catch (IOException localIOException)
    {
      w.e("MicroMsg.ReportManagerKvCheck", "saveIDKeyData, IOException, detail:" + localIOException.getMessage());
      GMTrace.o(13118977605632L, 97744);
      return;
    }
    synchronized (oqY)
    {
      if (com.tencent.mm.a.e.d(localIOException, to(arrayOfByte.length)) != 0)
      {
        w.e("MicroMsg.ReportManagerKvCheck", "saveIDKeyData, write obj_len to file:" + localIOException + " fail.");
        GMTrace.o(13118977605632L, 97744);
        return;
      }
      if (com.tencent.mm.a.e.d(localIOException, arrayOfByte) != 0) {
        w.e("MicroMsg.ReportManagerKvCheck", "saveIDKeyData, write object to file:" + localIOException + " fail.");
      }
      w.d("MicroMsg.ReportManagerKvCheck", "saveIDKeyData, fileLength:" + com.tencent.mm.a.e.aY(localIOException));
      GMTrace.o(13118977605632L, 97744);
      return;
    }
  }
  
  public static void d(ArrayList<IDKey> arg0, boolean paramBoolean)
  {
    GMTrace.i(13119111823360L, 97745);
    Object localObject1 = ???.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject3 = (IDKey)((Iterator)localObject1).next();
      w.i("MicroMsg.ReportManagerKvCheck", "saveGroupIDKeyData, id:" + ((IDKey)localObject3).GetID() + ", key:" + ((IDKey)localObject3).GetKey() + ", value:" + ((IDKey)localObject3).GetValue() + ", isImportant:" + paramBoolean);
    }
    if (!com.tencent.mm.a.e.aZ(filePath))
    {
      w.e("MicroMsg.ReportManagerKvCheck", "saveGroupIDKeyData, filepath:" + filePath + " not exist ");
      GMTrace.o(13119111823360L, 97745);
      return;
    }
    localObject1 = bbY();
    if ("MM".equals(localObject1))
    {
      w.e("MicroMsg.ReportManagerKvCheck", "error path, current processname:" + (String)localObject1);
      GMTrace.o(13119111823360L, 97745);
      return;
    }
    localObject1 = filePath + (String)localObject1 + ".group_monitor";
    Object localObject3 = new a();
    ((a)localObject3).jhc = ???.size();
    ??? = ???.iterator();
    while (???.hasNext())
    {
      IDKey localIDKey = (IDKey)???.next();
      b localb = new b();
      localb.etB = ((int)localIDKey.GetID());
      localb.oqG = ((int)localIDKey.GetKey());
      localb.oqH = ((int)localIDKey.GetValue());
      localb.oqI = paramBoolean;
      ((a)localObject3).oqF.add(localb);
    }
    try
    {
      localObject3 = ((a)localObject3).toByteArray();
      if (localObject3 == null)
      {
        w.e("MicroMsg.ReportManagerKvCheck", "saveGroupIDKeyData, null == temp.");
        GMTrace.o(13119111823360L, 97745);
        return;
      }
    }
    catch (IOException ???)
    {
      w.e("MicroMsg.ReportManagerKvCheck", "saveGroupIDKeyData, IOException, detail:" + ???.getMessage());
      GMTrace.o(13119111823360L, 97745);
      return;
    }
    synchronized (oqY)
    {
      if (com.tencent.mm.a.e.d((String)localObject1, to(localObject3.length)) != 0)
      {
        w.e("MicroMsg.ReportManagerKvCheck", "saveGroupIDKeyData, write obj_len to file:" + (String)localObject1 + " fail.");
        GMTrace.o(13119111823360L, 97745);
        return;
      }
      if (com.tencent.mm.a.e.d((String)localObject1, (byte[])localObject3) != 0) {
        w.e("MicroMsg.ReportManagerKvCheck", "saveGroupIDKeyData, write object to file:" + (String)localObject1 + " fail.");
      }
      GMTrace.o(13119111823360L, 97745);
      return;
    }
  }
  
  private static String getAppFilePath()
  {
    GMTrace.i(13118574952448L, 97741);
    Object localObject = ab.getContext();
    if (localObject == null)
    {
      GMTrace.o(13118574952448L, 97741);
      return null;
    }
    try
    {
      localObject = ((Context)localObject).getFilesDir();
      if (!((File)localObject).exists()) {
        ((File)localObject).createNewFile();
      }
      localObject = ((File)localObject).toString();
      GMTrace.o(13118574952448L, 97741);
      return (String)localObject;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.ReportManagerKvCheck", localException.getMessage());
      GMTrace.o(13118574952448L, 97741);
    }
    return null;
  }
  
  private static byte[] to(int paramInt)
  {
    GMTrace.i(13119380258816L, 97747);
    int i = (byte)(paramInt >> 24 & 0xFF);
    int j = (byte)(paramInt >> 16 & 0xFF);
    int k = (byte)(paramInt >> 8 & 0xFF);
    int m = (byte)(paramInt & 0xFF);
    GMTrace.o(13119380258816L, 97747);
    return new byte[] { i, j, k, m };
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\report\service\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */