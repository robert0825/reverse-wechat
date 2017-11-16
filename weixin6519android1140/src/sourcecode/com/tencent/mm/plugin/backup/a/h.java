package com.tencent.mm.plugin.backup.a;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.StatFs;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.a.g;
import com.tencent.mm.a.n;
import com.tencent.mm.bm.a;
import com.tencent.mm.bm.b;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.plugin.backup.h.m;
import com.tencent.mm.plugin.backup.h.x;
import com.tencent.mm.pointers.PLong;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.azr;
import com.tencent.mm.protocal.c.ek;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.j;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.s;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.http.conn.util.InetAddressUtils;

public final class h
{
  private static List<String> iVA;
  
  static
  {
    GMTrace.i(14726503333888L, 109721);
    iVA = null;
    GMTrace.o(14726503333888L, 109721);
  }
  
  public static <T extends a> T a(T paramT, byte[] paramArrayOfByte)
  {
    GMTrace.i(14723147890688L, 109696);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      GMTrace.o(14723147890688L, 109696);
      return null;
    }
    try
    {
      paramT.aD(paramArrayOfByte);
      GMTrace.o(14723147890688L, 109696);
      return paramT;
    }
    catch (Exception paramT)
    {
      w.e("MicroMsg.BackupUtil", "ERROR: parseProBuf [%s] [%s]", new Object[] { paramT.getMessage(), bg.f(paramT) });
      GMTrace.o(14723147890688L, 109696);
    }
    return null;
  }
  
  public static String a(ek paramek, int paramInt)
  {
    GMTrace.i(14724758503424L, 109708);
    paramek = a(paramek, paramInt, null);
    GMTrace.o(14724758503424L, 109708);
    return paramek;
  }
  
  public static String a(ek paramek, int paramInt, String paramString)
  {
    GMTrace.i(14724892721152L, 109709);
    if ((paramek.tTg == paramInt) && (paramek.tTe != null))
    {
      paramek = g.n(paramek.tTe.uNP.tJp);
      GMTrace.o(14724892721152L, 109709);
      return paramek;
    }
    if (paramek.tTd != null)
    {
      Iterator localIterator = paramek.tTd.iterator();
      int i = 0;
      while (localIterator.hasNext()) {
        if (((azr)localIterator.next()).uNT == paramInt)
        {
          String str = ((azq)paramek.tTc.get(i)).uNR;
          if ((!bg.nm(paramString)) && (!str.endsWith(paramString)))
          {
            i += 1;
          }
          else
          {
            if (e.aZ(th(str)))
            {
              GMTrace.o(14724892721152L, 109709);
              return str;
            }
            GMTrace.o(14724892721152L, 109709);
            return null;
          }
        }
        else
        {
          i += 1;
        }
      }
    }
    GMTrace.o(14724892721152L, 109709);
    return null;
  }
  
  public static String a(String paramString1, String paramString2, String... paramVarArgs)
  {
    GMTrace.i(18450642632704L, 137468);
    if ((paramVarArgs == null) || (paramVarArgs.length == 0))
    {
      GMTrace.o(18450642632704L, 137468);
      return paramString1;
    }
    int i;
    int j;
    label56:
    String str;
    if (paramString1.equals(""))
    {
      paramString1 = new StringBuilder(paramVarArgs[0]);
      i = 1;
      int k = paramVarArgs.length;
      j = 0;
      if (j >= k) {
        break label112;
      }
      str = paramVarArgs[j];
      if (i == 0) {
        break label98;
      }
      i = 0;
    }
    for (;;)
    {
      j += 1;
      break label56;
      paramString1 = new StringBuilder(paramString1);
      i = 0;
      break;
      label98:
      paramString1.append(paramString2).append(str);
    }
    label112:
    paramString1 = paramString1.toString();
    GMTrace.o(18450642632704L, 137468);
    return paramString1;
  }
  
  /* Error */
  public static void a(String paramString, x paramx)
  {
    // Byte code:
    //   0: ldc2_w 178
    //   3: ldc -76
    //   5: invokestatic 18	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aconst_null
    //   9: astore 4
    //   11: aconst_null
    //   12: astore_3
    //   13: aload 4
    //   15: astore_2
    //   16: new 182	java/io/File
    //   19: dup
    //   20: aload_0
    //   21: invokespecial 183	java/io/File:<init>	(Ljava/lang/String;)V
    //   24: astore 5
    //   26: aload 4
    //   28: astore_2
    //   29: aload 5
    //   31: invokevirtual 186	java/io/File:exists	()Z
    //   34: ifne +12 -> 46
    //   37: aload 4
    //   39: astore_2
    //   40: aload 5
    //   42: invokevirtual 189	java/io/File:mkdirs	()Z
    //   45: pop
    //   46: aload 4
    //   48: astore_2
    //   49: new 165	java/lang/StringBuilder
    //   52: dup
    //   53: invokespecial 191	java/lang/StringBuilder:<init>	()V
    //   56: aload_0
    //   57: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: aload_1
    //   61: getfield 196	com/tencent/mm/plugin/backup/h/x:jie	Ljava/lang/String;
    //   64: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: invokevirtual 176	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   70: astore_0
    //   71: aload 4
    //   73: astore_2
    //   74: new 182	java/io/File
    //   77: dup
    //   78: aload_0
    //   79: invokespecial 183	java/io/File:<init>	(Ljava/lang/String;)V
    //   82: astore 5
    //   84: aload 4
    //   86: astore_2
    //   87: aload 5
    //   89: invokevirtual 186	java/io/File:exists	()Z
    //   92: ifne +12 -> 104
    //   95: aload 4
    //   97: astore_2
    //   98: aload 5
    //   100: invokevirtual 199	java/io/File:createNewFile	()Z
    //   103: pop
    //   104: aload 4
    //   106: astore_2
    //   107: new 201	java/io/RandomAccessFile
    //   110: dup
    //   111: aload_0
    //   112: ldc -53
    //   114: invokespecial 206	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   117: astore_0
    //   118: aload_0
    //   119: aload_1
    //   120: getfield 209	com/tencent/mm/plugin/backup/h/x:jig	I
    //   123: i2l
    //   124: invokevirtual 213	java/io/RandomAccessFile:setLength	(J)V
    //   127: aload_0
    //   128: aload_1
    //   129: getfield 216	com/tencent/mm/plugin/backup/h/x:jih	I
    //   132: i2l
    //   133: invokevirtual 219	java/io/RandomAccessFile:seek	(J)V
    //   136: aload_0
    //   137: aload_1
    //   138: getfield 222	com/tencent/mm/plugin/backup/h/x:jgP	Lcom/tencent/mm/bm/b;
    //   141: getfield 91	com/tencent/mm/bm/b:tJp	[B
    //   144: invokevirtual 226	java/io/RandomAccessFile:write	([B)V
    //   147: aload_0
    //   148: invokevirtual 229	java/io/RandomAccessFile:close	()V
    //   151: ldc2_w 178
    //   154: ldc -76
    //   156: invokestatic 23	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   159: return
    //   160: astore_0
    //   161: ldc2_w 178
    //   164: ldc -76
    //   166: invokestatic 23	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   169: return
    //   170: astore_1
    //   171: aload_3
    //   172: astore_0
    //   173: aload_0
    //   174: astore_2
    //   175: ldc 39
    //   177: aload_1
    //   178: ldc -25
    //   180: iconst_0
    //   181: anewarray 4	java/lang/Object
    //   184: invokestatic 235	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   187: aload_0
    //   188: ifnull +7 -> 195
    //   191: aload_0
    //   192: invokevirtual 229	java/io/RandomAccessFile:close	()V
    //   195: ldc2_w 178
    //   198: ldc -76
    //   200: invokestatic 23	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   203: return
    //   204: astore_0
    //   205: ldc2_w 178
    //   208: ldc -76
    //   210: invokestatic 23	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   213: return
    //   214: astore_0
    //   215: aload_2
    //   216: ifnull +7 -> 223
    //   219: aload_2
    //   220: invokevirtual 229	java/io/RandomAccessFile:close	()V
    //   223: aload_0
    //   224: athrow
    //   225: astore_1
    //   226: goto -3 -> 223
    //   229: astore_1
    //   230: aload_0
    //   231: astore_2
    //   232: aload_1
    //   233: astore_0
    //   234: goto -19 -> 215
    //   237: astore_1
    //   238: goto -65 -> 173
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	241	0	paramString	String
    //   0	241	1	paramx	x
    //   15	217	2	localObject1	Object
    //   12	160	3	localObject2	Object
    //   9	96	4	localObject3	Object
    //   24	75	5	localFile	File
    // Exception table:
    //   from	to	target	type
    //   147	151	160	java/lang/Exception
    //   16	26	170	java/lang/Exception
    //   29	37	170	java/lang/Exception
    //   40	46	170	java/lang/Exception
    //   49	71	170	java/lang/Exception
    //   74	84	170	java/lang/Exception
    //   87	95	170	java/lang/Exception
    //   98	104	170	java/lang/Exception
    //   107	118	170	java/lang/Exception
    //   191	195	204	java/lang/Exception
    //   16	26	214	finally
    //   29	37	214	finally
    //   40	46	214	finally
    //   49	71	214	finally
    //   74	84	214	finally
    //   87	95	214	finally
    //   98	104	214	finally
    //   107	118	214	finally
    //   175	187	214	finally
    //   219	223	225	java/lang/Exception
    //   118	147	229	finally
    //   118	147	237	java/lang/Exception
  }
  
  public static boolean a(long paramLong, PLong paramPLong1, PLong paramPLong2, String paramString)
  {
    GMTrace.i(14726100680704L, 109718);
    Object localObject = new StatFs(com.tencent.mm.compatible.util.h.getExternalStorageDirectory().getPath());
    long l1 = ((StatFs)localObject).getBlockSize();
    paramPLong1.value = (((StatFs)localObject).getAvailableBlocks() * l1);
    localObject = com.tencent.mm.compatible.util.h.getDataDirectory();
    StatFs localStatFs = new StatFs(((File)localObject).getPath());
    l1 = localStatFs.getBlockCount();
    long l2 = localStatFs.getAvailableBlocks();
    paramPLong2.value = (localStatFs.getBlockSize() * localStatFs.getAvailableBlocks());
    w.i("MicroMsg.BackupUtil", "checkDataFull, SDAvailSize:%d, DataAvailSize%d, dbSize:%d", new Object[] { Long.valueOf(paramPLong1.value), Long.valueOf(paramPLong2.value), Long.valueOf(paramLong) });
    if (l1 <= 0L)
    {
      GMTrace.o(14726100680704L, 109718);
      return false;
    }
    if (l1 - l2 < 0L)
    {
      GMTrace.o(14726100680704L, 109718);
      return false;
    }
    if ((paramPLong1.value == paramPLong2.value) || (paramString.startsWith(((File)localObject).getPath()))) {
      paramPLong1.value = 0L;
    }
    if (paramLong > paramPLong2.value)
    {
      GMTrace.o(14726100680704L, 109718);
      return false;
    }
    GMTrace.o(14726100680704L, 109718);
    return true;
  }
  
  public static int aA(String paramString, int paramInt)
  {
    GMTrace.i(14725295374336L, 109712);
    int i = paramInt;
    if (!bg.nm(paramString)) {}
    try
    {
      i = Integer.valueOf(paramString).intValue();
      GMTrace.o(14725295374336L, 109712);
      return i;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.BackupUtil", paramString, "", new Object[0]);
        i = paramInt;
      }
    }
  }
  
  public static m aP(long paramLong)
  {
    GMTrace.i(18450911068160L, 137470);
    m localm = new m();
    String str2 = p.getDeviceID(ab.getContext());
    String str1 = str2;
    if (str2 == null) {
      str1 = p.ta();
    }
    localm.jhl = str1;
    localm.jhm = Build.MANUFACTURER;
    localm.jhn = Build.MODEL;
    localm.jho = "Android";
    localm.jhp = Build.VERSION.RELEASE;
    localm.jhq = com.tencent.mm.protocal.d.tJC;
    localm.jhr = paramLong;
    w.i("MicroMsg.BackupUtil", "getBackupStartGeneralInfo WechatVersion[%s], freespace[%d], deviceId[%s]", new Object[] { Integer.valueOf(com.tencent.mm.protocal.d.tJC), Long.valueOf(paramLong), localm.jhl });
    GMTrace.o(18450911068160L, 137470);
    return localm;
  }
  
  public static String aer()
  {
    GMTrace.i(14723953197056L, 109702);
    Object localObject = new StringBuilder();
    at.AR();
    localObject = c.zo() + "backup/";
    GMTrace.o(14723953197056L, 109702);
    return (String)localObject;
  }
  
  public static int aes()
  {
    GMTrace.i(14724221632512L, 109704);
    Object localObject = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    localObject = ab.getContext().registerReceiver(null, (IntentFilter)localObject);
    if (localObject == null)
    {
      GMTrace.o(14724221632512L, 109704);
      return 100;
    }
    int i = ((Intent)localObject).getIntExtra("status", -1);
    if ((i == 2) || (i == 5)) {}
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.BackupUtil", "Battery mCharging: %b", new Object[] { Boolean.valueOf(bool) });
      if (!bool) {
        break;
      }
      GMTrace.o(14724221632512L, 109704);
      return 100;
    }
    i = ((Intent)localObject).getIntExtra("level", -1);
    int j = ((Intent)localObject).getIntExtra("scale", -1);
    if ((i >= 0) && (j > 0)) {}
    for (i = i * 100 / j;; i = 100)
    {
      w.i("MicroMsg.BackupUtil", "Battery Level Remaining: %d", new Object[] { Integer.valueOf(i) });
      GMTrace.o(14724221632512L, 109704);
      return i;
    }
  }
  
  public static List<String> aet()
  {
    GMTrace.i(14725966462976L, 109717);
    if (iVA != null)
    {
      localObject1 = iVA;
      GMTrace.o(14725966462976L, 109717);
      return (List<String>)localObject1;
    }
    iVA = new LinkedList();
    Object localObject1 = s.gmD;
    int j = localObject1.length;
    int i = 0;
    while (i < j)
    {
      Object localObject2 = localObject1[i];
      iVA.add(localObject2);
      i += 1;
    }
    iVA.add("weixin");
    iVA.add("weibo");
    iVA.add("qqmail");
    iVA.add("fmessage");
    iVA.add("tmessage");
    iVA.add("qmessage");
    iVA.add("qqsync");
    iVA.add("floatbottle");
    iVA.add("lbsapp");
    iVA.add("shakeapp");
    iVA.add("medianote");
    iVA.add("qqfriend");
    iVA.add("readerapp");
    iVA.add("newsapp");
    iVA.add("blogapp");
    iVA.add("facebookapp");
    iVA.add("masssendapp");
    iVA.add("meishiapp");
    iVA.add("feedsapp");
    iVA.add("voipapp");
    iVA.add("officialaccounts");
    iVA.add("helper_entry");
    iVA.add("pc_share");
    iVA.add("cardpackage");
    iVA.add("voicevoipapp");
    iVA.add("voiceinputapp");
    iVA.add("linkedinplugin");
    iVA.add("appbrandcustomerservicemsg");
    localObject1 = iVA;
    GMTrace.o(14725966462976L, 109717);
    return (List<String>)localObject1;
  }
  
  public static void b(String paramString, x paramx)
  {
    GMTrace.i(14723550543872L, 109699);
    if ((TextUtils.isEmpty(paramString)) || (paramx == null))
    {
      w.e("MicroMsg.BackupUtil", "appendFile dir:%s req:%s ", new Object[] { paramString, paramx });
      GMTrace.o(14723550543872L, 109699);
      return;
    }
    Object localObject;
    if ((TextUtils.isEmpty(paramx.jie)) || (paramx.jgP == null) || (bg.br(paramx.jgP.tJp) <= 0))
    {
      localObject = paramx.jie;
      b localb = paramx.jgP;
      if (paramx.jgP == null) {}
      for (paramString = "null";; paramString = Integer.valueOf(bg.br(paramx.jgP.tJp)))
      {
        w.e("MicroMsg.BackupUtil", "appendFile dataid:%s data:%s  %s", new Object[] { localObject, localb, paramString });
        GMTrace.o(14723550543872L, 109699);
        return;
      }
    }
    int i = 3;
    int j = i - 1;
    long l3;
    long l1;
    label237:
    long l2;
    if (i > 0)
    {
      l3 = td(paramString + paramx.jie);
      localObject = new File(paramString + paramx.jie);
      if (((File)localObject).exists())
      {
        l1 = ((File)localObject).length();
        i = e.a(paramString, paramx.jie, paramx.jgP.tJp);
        localObject = new File(paramString + paramx.jie);
        if (!((File)localObject).exists()) {
          break label479;
        }
        l2 = ((File)localObject).length();
        label298:
        if (l1 != l2) {
          break label556;
        }
        w.e("MicroMsg.BackupUtil", "append failed and try again:%s", new Object[] { paramString + paramx.jie });
        i = e.a(paramString, paramx.jie, paramx.jgP.tJp) * 10000;
      }
    }
    label479:
    label556:
    for (;;)
    {
      l1 = td(paramString + paramx.jie);
      if ((i == 0) && (l1 >= paramx.jgP.tJp.length))
      {
        w.d("MicroMsg.BackupUtil", "appendFile retry:%d append:%d  old:%d  new:%d  data:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Long.valueOf(l3), Long.valueOf(l1), Integer.valueOf(paramx.jgP.tJp.length) });
        GMTrace.o(14723550543872L, 109699);
        return;
        l1 = 0L;
        break label237;
        l2 = 0L;
        break label298;
      }
      w.e("MicroMsg.BackupUtil", "appendFile retry:%d append:%d  old:%d  new:%d  data:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Long.valueOf(l3), Long.valueOf(l1), Integer.valueOf(paramx.jgP.tJp.length) });
      i = j;
      break;
      GMTrace.o(14723550543872L, 109699);
      return;
    }
  }
  
  public static boolean b(ek paramek, int paramInt, String paramString)
  {
    GMTrace.i(14725429592064L, 109713);
    if (paramek.tTg == paramInt)
    {
      paramek = paramek.tTe.uNP.tJp;
      if (paramek.length <= 0)
      {
        GMTrace.o(14725429592064L, 109713);
        return false;
      }
      e.b(paramString, paramek, paramek.length);
      GMTrace.o(14725429592064L, 109713);
      return true;
    }
    paramek = a(paramek, paramInt, null);
    if (!bg.nm(paramek))
    {
      j.r(th(paramek), paramString, false);
      GMTrace.o(14725429592064L, 109713);
      return true;
    }
    GMTrace.o(14725429592064L, 109713);
    return false;
  }
  
  public static byte[] b(ek paramek, int paramInt)
  {
    GMTrace.i(14725563809792L, 109714);
    if ((paramek.tTg == paramInt) && (paramek.tTe != null))
    {
      paramek = paramek.tTe.uNP.tJp;
      GMTrace.o(14725563809792L, 109714);
      return paramek;
    }
    if ((paramek.tTd != null) && (paramek.tTc != null))
    {
      Iterator localIterator = paramek.tTd.iterator();
      int i = 0;
      while (localIterator.hasNext())
      {
        if (((azr)localIterator.next()).uNT == paramInt)
        {
          paramek = th(((azq)paramek.tTc.get(i)).uNR);
          paramInt = e.aY(paramek);
          if ((paramInt == 0) || (paramInt > 1048576))
          {
            w.e("MicroMsg.BackupUtil", "thumb not exist or  too big!");
            GMTrace.o(14725563809792L, 109714);
            return null;
          }
          paramek = e.d(paramek, 0, -1);
          GMTrace.o(14725563809792L, 109714);
          return paramek;
        }
        i += 1;
      }
    }
    GMTrace.o(14725563809792L, 109714);
    return null;
  }
  
  private static boolean bH(int paramInt1, int paramInt2)
  {
    GMTrace.i(14724355850240L, 109705);
    try
    {
      Iterator localIterator1 = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
      label55:
      int i;
      do
      {
        boolean bool;
        do
        {
          do
          {
            break label55;
            Iterator localIterator2;
            while (!localIterator2.hasNext())
            {
              if (!localIterator1.hasNext()) {
                break;
              }
              localIterator2 = Collections.list(((NetworkInterface)localIterator1.next()).getInetAddresses()).iterator();
            }
            localObject = (InetAddress)localIterator2.next();
          } while (((InetAddress)localObject).isLoopbackAddress());
          localObject = ((InetAddress)localObject).getHostAddress().toUpperCase();
          bool = InetAddressUtils.isIPv4Address((String)localObject);
          w.i("MicroMsg.BackupUtil", "check ip:%s, isIPv4:%b", new Object[] { localObject, Boolean.valueOf(bool) });
        } while (!bool);
        Object localObject = ((String)localObject).split("\\.");
        i = n.p(new byte[] { (byte)(bg.getInt(localObject[0], 0) & 0xFF), (byte)(bg.getInt(localObject[1], 0) & 0xFF), (byte)(bg.getInt(localObject[2], 0) & 0xFF), (byte)(bg.getInt(localObject[3], 0) & 0xFF) });
      } while ((paramInt1 & paramInt2) != (i & paramInt1));
      GMTrace.o(14724355850240L, 109705);
      return true;
    }
    catch (Exception localException)
    {
      GMTrace.o(14724355850240L, 109705);
    }
    return false;
  }
  
  public static String bY(Context paramContext)
  {
    GMTrace.i(14723818979328L, 109701);
    paramContext = (WifiManager)paramContext.getSystemService("wifi");
    if (paramContext.getWifiState() == 3)
    {
      paramContext = paramContext.getConnectionInfo();
      if (paramContext != null) {}
      for (;;)
      {
        try
        {
          paramContext = paramContext.getSSID();
          Object localObject = paramContext;
          if (paramContext.length() >= 2)
          {
            localObject = paramContext;
            if (paramContext.startsWith("\""))
            {
              localObject = paramContext;
              if (paramContext.endsWith("\""))
              {
                w.i("MicroMsg.BackupUtil", "start and end with \", and trunk it");
                localObject = paramContext.substring(1, paramContext.length() - 1);
              }
            }
          }
          GMTrace.o(14723818979328L, 109701);
          return (String)localObject;
        }
        catch (Exception paramContext)
        {
          w.e("MicroMsg.BackupUtil", "getConnectionInfo %s", new Object[] { paramContext });
          w.printErrStackTrace("MicroMsg.BackupUtil", paramContext, "", new Object[0]);
          GMTrace.o(14723818979328L, 109701);
          return "";
        }
        paramContext = "wifi";
      }
    }
    int i = 13;
    try
    {
      j = ((Integer)paramContext.getClass().getField("WIFI_AP_STATE_ENABLED").get(paramContext)).intValue();
      i = j;
      k = ((Integer)paramContext.getClass().getMethod("getWifiApState", new Class[0]).invoke(paramContext, new Object[0])).intValue();
      i = k;
      k = j;
      j = i;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        try
        {
          paramContext = ((WifiConfiguration)paramContext.getClass().getMethod("getWifiApConfiguration", new Class[0]).invoke(paramContext, new Object[0])).SSID;
          GMTrace.o(14723818979328L, 109701);
          return paramContext;
        }
        catch (Exception paramContext)
        {
          int j;
          int k;
          w.e("MicroMsg.BackupUtil", "getWifiApConfiguration %s", new Object[] { paramContext });
          w.printErrStackTrace("MicroMsg.BackupUtil", paramContext, "", new Object[0]);
        }
        localException = localException;
        w.e("MicroMsg.BackupUtil", "getWifiApState %s", new Object[] { localException });
        w.printErrStackTrace("MicroMsg.BackupUtil", localException, "", new Object[0]);
        j = 0;
        k = i;
      }
      GMTrace.o(14723818979328L, 109701);
    }
    if (j == k) {
      w.i("MicroMsg.BackupUtil", "getWifiName apmode");
    }
    return "";
  }
  
  public static String[] bq(String paramString1, String paramString2)
  {
    GMTrace.i(18450776850432L, 137469);
    paramString1 = paramString1.split(paramString2);
    GMTrace.o(18450776850432L, 137469);
    return paramString1;
  }
  
  public static int c(ek paramek, int paramInt)
  {
    GMTrace.i(14725698027520L, 109715);
    if (paramek.tTg == paramInt)
    {
      paramInt = paramek.tTe.uNP.tJp.length;
      GMTrace.o(14725698027520L, 109715);
      return paramInt;
    }
    if ((paramek.tTd != null) && (paramek.tTc != null))
    {
      Iterator localIterator = paramek.tTd.iterator();
      int i = 0;
      while (localIterator.hasNext())
      {
        if (((azr)localIterator.next()).uNT == paramInt)
        {
          paramInt = e.aY(th(((azq)paramek.tTc.get(i)).uNR));
          GMTrace.o(14725698027520L, 109715);
          return paramInt;
        }
        i += 1;
      }
    }
    GMTrace.o(14725698027520L, 109715);
    return 0;
  }
  
  public static boolean d(ek paramek, int paramInt)
  {
    GMTrace.i(14725832245248L, 109716);
    if ((paramek.tTg == paramInt) && (paramek.tTe != null))
    {
      GMTrace.o(14725832245248L, 109716);
      return true;
    }
    paramek = paramek.tTd.iterator();
    while (paramek.hasNext()) {
      if (((azr)paramek.next()).uNT == paramInt)
      {
        GMTrace.o(14725832245248L, 109716);
        return true;
      }
    }
    GMTrace.o(14725832245248L, 109716);
    return false;
  }
  
  public static LinkedList<String> t(LinkedList<d> paramLinkedList)
  {
    GMTrace.i(14726369116160L, 109720);
    LinkedList localLinkedList = new LinkedList();
    if (paramLinkedList != null)
    {
      paramLinkedList = paramLinkedList.iterator();
      while (paramLinkedList.hasNext()) {
        localLinkedList.add(((d)paramLinkedList.next()).iVh);
      }
    }
    GMTrace.o(14726369116160L, 109720);
    return localLinkedList;
  }
  
  public static long td(String paramString)
  {
    GMTrace.i(14723416326144L, 109698);
    paramString = new File(paramString);
    if (!paramString.exists())
    {
      GMTrace.o(14723416326144L, 109698);
      return -1L;
    }
    if (!paramString.canRead())
    {
      GMTrace.o(14723416326144L, 109698);
      return -2L;
    }
    if (!paramString.canWrite())
    {
      GMTrace.o(14723416326144L, 109698);
      return -3L;
    }
    long l = paramString.length();
    GMTrace.o(14723416326144L, 109698);
    return l;
  }
  
  public static void te(String paramString)
  {
    GMTrace.i(14724087414784L, 109703);
    File localFile = new File(paramString);
    if (!localFile.exists()) {
      localFile.mkdirs();
    }
    localFile = new File(paramString + "backupItem/");
    if (!localFile.exists()) {
      localFile.mkdirs();
    }
    paramString = new File(paramString + "backupMeida/");
    if (!paramString.exists()) {
      paramString.mkdirs();
    }
    GMTrace.o(14724087414784L, 109703);
  }
  
  public static boolean tf(String paramString)
  {
    GMTrace.i(14724490067968L, 109706);
    Object localObject = paramString.split("\\.");
    int k = n.p(new byte[] { (byte)(bg.getInt(localObject[0], 0) & 0xFF), (byte)(bg.getInt(localObject[1], 0) & 0xFF), (byte)(bg.getInt(localObject[2], 0) & 0xFF), (byte)(bg.getInt(localObject[3], 0) & 0xFF) });
    int m = n.p(new byte[] { -1, -1, -1, 0 });
    localObject = (WifiManager)ab.getContext().getSystemService("wifi");
    int i;
    if (((WifiManager)localObject).getWifiState() == 3)
    {
      i = ((WifiManager)localObject).getConnectionInfo().getIpAddress();
      w.i("MicroMsg.BackupUtil", "oldIpStr:%s, localIp:%s", new Object[] { paramString, (i & 0xFF) + "." + (i >> 8 & 0xFF) + "." + (i >> 16 & 0xFF) + "." + (i >> 24 & 0xFF) });
      if ((m & k) == (i & m))
      {
        GMTrace.o(14724490067968L, 109706);
        return true;
      }
      GMTrace.o(14724490067968L, 109706);
      return false;
    }
    for (;;)
    {
      try
      {
        i = ((Integer)localObject.getClass().getField("WIFI_AP_STATE_ENABLED").get(localObject)).intValue();
        boolean bool;
      }
      catch (Exception paramString)
      {
        try
        {
          j = ((Integer)localObject.getClass().getMethod("getWifiApState", new Class[0]).invoke(localObject, new Object[0])).intValue();
          if (j != i) {
            break;
          }
          w.i("MicroMsg.BackupUtil", "matchip in apmode");
          bool = bH(m, k);
          GMTrace.o(14724490067968L, 109706);
          return bool;
        }
        catch (Exception paramString)
        {
          int j;
          for (;;) {}
        }
        paramString = paramString;
        i = 13;
      }
      tmp374_371[0] = paramString;
      w.e("MicroMsg.BackupUtil", "getWifiApState %s", tmp374_371);
      w.printErrStackTrace("MicroMsg.BackupUtil", paramString, "", new Object[0]);
      j = 0;
    }
    w.i("MicroMsg.BackupUtil", "apState:%d", new Object[] { Integer.valueOf(j) });
    GMTrace.o(14724490067968L, 109706);
    return false;
  }
  
  public static boolean tg(String paramString)
  {
    GMTrace.i(14724624285696L, 109707);
    if (paramString == null)
    {
      GMTrace.o(14724624285696L, 109707);
      return false;
    }
    int i = paramString.indexOf('<');
    String str = paramString;
    if (i > 0) {
      str = paramString.substring(i);
    }
    if (bh.q(str, "msg") != null)
    {
      GMTrace.o(14724624285696L, 109707);
      return true;
    }
    GMTrace.o(14724624285696L, 109707);
    return false;
  }
  
  public static String th(String paramString)
  {
    GMTrace.i(14725026938880L, 109710);
    if ((paramString == null) || (paramString.equals("")))
    {
      GMTrace.o(14725026938880L, 109710);
      return "";
    }
    paramString = aer() + "backupMeida/" + ti(paramString) + paramString;
    GMTrace.o(14725026938880L, 109710);
    return paramString;
  }
  
  public static String ti(String paramString)
  {
    GMTrace.i(14725161156608L, 109711);
    if (paramString == null)
    {
      GMTrace.o(14725161156608L, 109711);
      return "";
    }
    String str2 = g.n(paramString.getBytes());
    paramString = "";
    String str1 = "";
    if (str2.length() > 0) {
      paramString = str2.charAt(0) + "/";
    }
    if (str2.length() >= 2) {
      str1 = str2.charAt(1) + "/";
    }
    paramString = paramString + str1;
    GMTrace.o(14725161156608L, 109711);
    return paramString;
  }
  
  public static long tj(String paramString)
  {
    GMTrace.i(14726234898432L, 109719);
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
    long l1 = 0L;
    try
    {
      long l2 = localSimpleDateFormat.parse(paramString).getTime();
      l1 = l2;
    }
    catch (ParseException localParseException)
    {
      for (;;)
      {
        w.e("MicroMsg.BackupUtil", "dateToTimeStamp failed. date:%s, stack:%s", new Object[] { paramString, bg.bQW() });
      }
    }
    GMTrace.o(14726234898432L, 109719);
    return l1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */