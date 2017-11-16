package com.tencent.mm.plugin.dbbackup;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Parcel;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.comm.WakerLock;
import com.tencent.mm.ao.f;
import com.tencent.mm.ao.n;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.g.a.lq;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.FLock;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import com.tencent.wcdb.database.SQLiteCipherSpec;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDirectCursor;
import com.tencent.wcdb.repair.BackupKit;
import com.tencent.wcdb.repair.DBDumpUtil.ExecuteSqlCallback;
import com.tencent.wcdb.repair.RecoverKit;
import com.tencent.wcdb.repair.RepairKit;
import com.tencent.wcdb.repair.RepairKit.MasterInfo;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class d
  implements aq
{
  public static final SQLiteCipherSpec kds;
  private BroadcastReceiver gNE;
  public boolean gNF;
  public boolean gNG;
  public Runnable gNI;
  public volatile BackupKit kdc;
  public volatile RecoverKit kdd;
  public volatile RepairKit kde;
  public volatile boolean kdf;
  public boolean kdg;
  public boolean kdh;
  public long kdi;
  public long kdj;
  public long kdk;
  public int kdl;
  private boolean kdm;
  final SimpleDateFormat kdn;
  private String kdo;
  private FLock kdp;
  private j.a kdq;
  private com.tencent.mm.sdk.b.c kdr;
  
  static
  {
    GMTrace.i(5137049321472L, 38274);
    kds = new SQLiteCipherSpec().setPageSize(1024).setSQLCipherVersion(1);
    GMTrace.o(5137049321472L, 38274);
  }
  
  public d()
  {
    GMTrace.i(5131277959168L, 38231);
    this.kdf = false;
    this.kdg = false;
    this.kdh = false;
    this.kdi = 0L;
    this.kdj = 600000L;
    this.gNF = false;
    this.gNG = true;
    this.kdk = 0L;
    this.kdl = 10;
    this.kdm = false;
    this.kdn = new SimpleDateFormat("HH:mm:ss.SSS");
    GMTrace.o(5131277959168L, 38231);
  }
  
  /* Error */
  public static boolean a(String paramString, long[] paramArrayOfLong)
  {
    // Byte code:
    //   0: ldc2_w 136
    //   3: ldc -118
    //   5: invokestatic 79	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: new 140	java/io/FileWriter
    //   11: dup
    //   12: new 142	java/lang/StringBuilder
    //   15: dup
    //   16: invokespecial 143	java/lang/StringBuilder:<init>	()V
    //   19: aload_0
    //   20: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   23: ldc -107
    //   25: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   28: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   31: invokespecial 154	java/io/FileWriter:<init>	(Ljava/lang/String;)V
    //   34: astore 7
    //   36: aload 7
    //   38: astore 6
    //   40: aload_1
    //   41: arraylength
    //   42: istore_3
    //   43: iconst_0
    //   44: istore_2
    //   45: iload_2
    //   46: iload_3
    //   47: if_icmpge +47 -> 94
    //   50: aload_1
    //   51: iload_2
    //   52: laload
    //   53: lstore 4
    //   55: aload 7
    //   57: astore 6
    //   59: aload 7
    //   61: new 142	java/lang/StringBuilder
    //   64: dup
    //   65: invokespecial 143	java/lang/StringBuilder:<init>	()V
    //   68: lload 4
    //   70: invokestatic 159	java/lang/Long:toString	(J)Ljava/lang/String;
    //   73: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   76: ldc -95
    //   78: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   84: invokevirtual 164	java/io/FileWriter:write	(Ljava/lang/String;)V
    //   87: iload_2
    //   88: iconst_1
    //   89: iadd
    //   90: istore_2
    //   91: goto -46 -> 45
    //   94: aload 7
    //   96: invokevirtual 167	java/io/FileWriter:close	()V
    //   99: ldc2_w 136
    //   102: ldc -118
    //   104: invokestatic 96	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   107: iconst_1
    //   108: ireturn
    //   109: astore 8
    //   111: aconst_null
    //   112: astore_1
    //   113: aload_1
    //   114: astore 6
    //   116: ldc -87
    //   118: aload 8
    //   120: ldc -85
    //   122: iconst_1
    //   123: anewarray 4	java/lang/Object
    //   126: dup
    //   127: iconst_0
    //   128: aload_0
    //   129: aastore
    //   130: invokestatic 177	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   133: aload_1
    //   134: ifnull +7 -> 141
    //   137: aload_1
    //   138: invokevirtual 167	java/io/FileWriter:close	()V
    //   141: ldc2_w 136
    //   144: ldc -118
    //   146: invokestatic 96	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   149: iconst_0
    //   150: ireturn
    //   151: astore_0
    //   152: aconst_null
    //   153: astore 6
    //   155: aload 6
    //   157: ifnull +8 -> 165
    //   160: aload 6
    //   162: invokevirtual 167	java/io/FileWriter:close	()V
    //   165: aload_0
    //   166: athrow
    //   167: astore_0
    //   168: goto -69 -> 99
    //   171: astore_0
    //   172: goto -31 -> 141
    //   175: astore_1
    //   176: goto -11 -> 165
    //   179: astore_0
    //   180: goto -25 -> 155
    //   183: astore 8
    //   185: aload 7
    //   187: astore_1
    //   188: goto -75 -> 113
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	191	0	paramString	String
    //   0	191	1	paramArrayOfLong	long[]
    //   44	47	2	i	int
    //   42	6	3	j	int
    //   53	16	4	l	long
    //   38	123	6	localObject	Object
    //   34	152	7	localFileWriter	java.io.FileWriter
    //   109	10	8	localIOException1	IOException
    //   183	1	8	localIOException2	IOException
    // Exception table:
    //   from	to	target	type
    //   8	36	109	java/io/IOException
    //   8	36	151	finally
    //   94	99	167	java/io/IOException
    //   137	141	171	java/io/IOException
    //   160	165	175	java/io/IOException
    //   40	43	179	finally
    //   59	87	179	finally
    //   116	133	179	finally
    //   40	43	183	java/io/IOException
    //   59	87	183	java/io/IOException
  }
  
  public static void aps()
  {
    GMTrace.i(18829002407936L, 140287);
    Object localObject = com.tencent.mm.y.c.c.Ct().er("100274");
    if (((com.tencent.mm.storage.c)localObject).isValid())
    {
      localObject = ((com.tencent.mm.storage.c)localObject).bSg();
      HashMap localHashMap = new HashMap();
      localHashMap.put("wal", Integer.valueOf(bg.getInt((String)((Map)localObject).get("wal"), 0)));
      localHashMap.put("alter_cursor", Integer.valueOf(bg.getInt((String)((Map)localObject).get("alter_cursor"), 0)));
      localHashMap.put("flags", Integer.valueOf(bg.getInt((String)((Map)localObject).get("flags"), 0)));
      com.tencent.mm.bu.e.ak(localHashMap);
    }
    GMTrace.o(18829002407936L, 140287);
  }
  
  static void apt()
  {
    GMTrace.i(18829136625664L, 140288);
    Object localObject = com.tencent.mm.y.c.yM();
    ((com.tencent.mm.plugin.messenger.foundation.a.a.c)localObject).aOj();
    ((com.tencent.mm.plugin.messenger.foundation.a.a.c)localObject).aOl();
    ((com.tencent.mm.plugin.messenger.foundation.a.a.c)localObject).aOk();
    com.tencent.mm.y.c.yP().bTa();
    n.IZ().IK();
    localObject = com.tencent.mm.y.c.xh();
    ((t)localObject).a(w.a.vqq, Integer.valueOf(0));
    ((t)localObject).a(w.a.vqr, Integer.valueOf(0));
    ((t)localObject).a(w.a.vqs, Integer.valueOf(0));
    GMTrace.o(18829136625664L, 140288);
  }
  
  /* Error */
  private static long[] vm(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 311
    //   3: ldc_w 313
    //   6: invokestatic 79	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: lconst_0
    //   10: lstore_1
    //   11: lconst_0
    //   12: lstore_3
    //   13: lconst_0
    //   14: lstore 5
    //   16: new 315	java/io/BufferedReader
    //   19: dup
    //   20: new 317	java/io/FileReader
    //   23: dup
    //   24: new 142	java/lang/StringBuilder
    //   27: dup
    //   28: invokespecial 143	java/lang/StringBuilder:<init>	()V
    //   31: aload_0
    //   32: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: ldc -107
    //   37: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   40: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   43: invokespecial 318	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   46: invokespecial 321	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   49: astore 10
    //   51: aload 10
    //   53: astore 9
    //   55: aload 10
    //   57: invokevirtual 324	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   60: astore 11
    //   62: aload 11
    //   64: ifnull +13 -> 77
    //   67: aload 10
    //   69: astore 9
    //   71: aload 11
    //   73: invokestatic 328	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   76: lstore_1
    //   77: aload 10
    //   79: astore 9
    //   81: aload 10
    //   83: invokevirtual 324	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   86: astore 11
    //   88: aload 11
    //   90: ifnull +13 -> 103
    //   93: aload 10
    //   95: astore 9
    //   97: aload 11
    //   99: invokestatic 328	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   102: lstore_3
    //   103: aload 10
    //   105: astore 9
    //   107: aload 10
    //   109: invokevirtual 324	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   112: astore 11
    //   114: aload 11
    //   116: ifnull +14 -> 130
    //   119: aload 10
    //   121: astore 9
    //   123: aload 11
    //   125: invokestatic 328	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   128: lstore 5
    //   130: aload 10
    //   132: astore 9
    //   134: aload 10
    //   136: invokevirtual 324	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   139: astore 11
    //   141: aload 11
    //   143: ifnull +136 -> 279
    //   146: aload 10
    //   148: astore 9
    //   150: aload 11
    //   152: invokestatic 328	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   155: lstore 7
    //   157: aload 10
    //   159: invokevirtual 329	java/io/BufferedReader:close	()V
    //   162: ldc2_w 311
    //   165: ldc_w 313
    //   168: invokestatic 96	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   171: iconst_4
    //   172: newarray <illegal type>
    //   174: dup
    //   175: iconst_0
    //   176: lload_1
    //   177: lastore
    //   178: dup
    //   179: iconst_1
    //   180: lload_3
    //   181: lastore
    //   182: dup
    //   183: iconst_2
    //   184: lload 5
    //   186: lastore
    //   187: dup
    //   188: iconst_3
    //   189: lload 7
    //   191: lastore
    //   192: areturn
    //   193: astore 11
    //   195: aconst_null
    //   196: astore 10
    //   198: aload 10
    //   200: astore 9
    //   202: ldc -87
    //   204: aload 11
    //   206: ldc_w 331
    //   209: iconst_1
    //   210: anewarray 4	java/lang/Object
    //   213: dup
    //   214: iconst_0
    //   215: aload_0
    //   216: aastore
    //   217: invokestatic 177	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   220: aload 10
    //   222: ifnull +8 -> 230
    //   225: aload 10
    //   227: invokevirtual 329	java/io/BufferedReader:close	()V
    //   230: ldc2_w 311
    //   233: ldc_w 313
    //   236: invokestatic 96	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   239: aconst_null
    //   240: areturn
    //   241: astore_0
    //   242: aconst_null
    //   243: astore 9
    //   245: aload 9
    //   247: ifnull +8 -> 255
    //   250: aload 9
    //   252: invokevirtual 329	java/io/BufferedReader:close	()V
    //   255: aload_0
    //   256: athrow
    //   257: astore_0
    //   258: goto -96 -> 162
    //   261: astore_0
    //   262: goto -32 -> 230
    //   265: astore 9
    //   267: goto -12 -> 255
    //   270: astore_0
    //   271: goto -26 -> 245
    //   274: astore 11
    //   276: goto -78 -> 198
    //   279: lconst_0
    //   280: lstore 7
    //   282: goto -125 -> 157
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	285	0	paramString	String
    //   10	167	1	l1	long
    //   12	169	3	l2	long
    //   14	171	5	l3	long
    //   155	126	7	l4	long
    //   53	198	9	localBufferedReader1	java.io.BufferedReader
    //   265	1	9	localIOException	IOException
    //   49	177	10	localBufferedReader2	java.io.BufferedReader
    //   60	91	11	str	String
    //   193	12	11	localException1	Exception
    //   274	1	11	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   16	51	193	java/lang/Exception
    //   16	51	241	finally
    //   157	162	257	java/io/IOException
    //   225	230	261	java/io/IOException
    //   250	255	265	java/io/IOException
    //   55	62	270	finally
    //   71	77	270	finally
    //   81	88	270	finally
    //   97	103	270	finally
    //   107	114	270	finally
    //   123	130	270	finally
    //   134	141	270	finally
    //   150	157	270	finally
    //   202	220	270	finally
    //   55	62	274	java/lang/Exception
    //   71	77	274	java/lang/Exception
    //   81	88	274	java/lang/Exception
    //   97	103	274	java/lang/Exception
    //   107	114	274	java/lang/Exception
    //   123	130	274	java/lang/Exception
    //   134	141	274	java/lang/Exception
    //   150	157	274	java/lang/Exception
  }
  
  public final int a(final b paramb)
  {
    GMTrace.i(5132217483264L, 38238);
    at.AR();
    final Object localObject1 = com.tencent.mm.y.c.xd();
    if ((localObject1 == null) || (((String)localObject1).isEmpty()))
    {
      GMTrace.o(5132217483264L, 38238);
      return -3;
    }
    localObject1 = new File((String)localObject1);
    if (!((File)localObject1).canRead())
    {
      GMTrace.o(5132217483264L, 38238);
      return -3;
    }
    final Object localObject2 = new StringBuilder().append(p.sZ());
    at.AR();
    localObject2 = com.tencent.mm.a.g.n(com.tencent.mm.y.c.ww().getBytes()).substring(0, 7);
    long l1 = ((File)localObject1).length() * 2L;
    long l2 = bg.bQS();
    w.i("MicroMsg.SubCoreDBBackup", "db recover needSize : %d blockSize:%d", new Object[] { Long.valueOf(l1), Long.valueOf(l2) });
    if (l2 < l1)
    {
      GMTrace.o(5132217483264L, 38238);
      return -2;
    }
    at.xB().bQf();
    at.xB().E(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5142149595136L, 38312);
        try
        {
          Thread.sleep(200L);
          at.AR();
          final Object localObject2 = com.tencent.mm.y.c.zn();
          Object localObject1 = (String)localObject2 + localObject1.getName().replace(".db", "temp.db");
          w.i("MicroMsg.SubCoreDBBackup", "temp db path is %s", new Object[] { localObject1 });
          localObject1.renameTo(new File((String)localObject1));
          String str = (String)localObject2 + "sqlTemp.sql";
          List localList = Arrays.asList(new String[] { "getcontactinfo", "contact", "contact_ext", "ContactCmdBuf", "rcontact", "img_flag", "userinfo" });
          localObject2 = new int[1];
          long l = System.currentTimeMillis();
          at.AR();
          boolean bool = com.tencent.mm.y.c.yH().a((String)localObject1, localObject2, str, localList, new DBDumpUtil.ExecuteSqlCallback()
          {
            public final String preExecute(String paramAnonymous2String)
            {
              GMTrace.i(5140270546944L, 38298);
              paramAnonymous2String = localObject2;
              paramAnonymous2String[0] += 1;
              GMTrace.o(5140270546944L, 38298);
              return null;
            }
          });
          if (bool)
          {
            at.AR();
            com.tencent.mm.y.c.yM().aOj();
            at.AR();
            com.tencent.mm.y.c.yP().bTa();
            at.AR();
            com.tencent.mm.y.c.yM().aOl();
            at.AR();
            com.tencent.mm.y.c.yM().aOk();
            i = 12;
            com.tencent.mm.plugin.report.service.g.ork.a(181L, i, 1L, true);
            l = System.currentTimeMillis() - l;
            w.i("MicroMsg.SubCoreDBBackup", "execute %d sql and last %d", new Object[] { Integer.valueOf(localObject2[0]), Long.valueOf(l) });
            localObject1 = com.tencent.mm.plugin.report.service.g.ork;
            if (!bool) {
              break label394;
            }
            i = 1;
            label314:
            ((com.tencent.mm.plugin.report.service.g)localObject1).i(11224, new Object[] { Integer.valueOf(i), localObject2, Long.valueOf(l) });
            at.xB().bQh();
            if (paramb != null)
            {
              localObject1 = paramb;
              if (!bool) {
                break label399;
              }
            }
          }
          label394:
          label399:
          for (int i = 0;; i = -1)
          {
            ((b)localObject1).mr(i);
            GMTrace.o(5142149595136L, 38312);
            return;
            i = 15;
            break;
            i = 0;
            break label314;
          }
        }
        catch (InterruptedException localInterruptedException)
        {
          for (;;) {}
        }
      }
    });
    GMTrace.o(5132217483264L, 38238);
    return 0;
  }
  
  public final int a(final String paramString, b paramb)
  {
    try
    {
      GMTrace.i(5131949047808L, 38236);
      paramString = new Runnable()
      {
        /* Error */
        public final void run()
        {
          // Byte code:
          //   0: ldc2_w 53
          //   3: ldc 55
          //   5: invokestatic 45	com/tencent/gmtrace/GMTrace:i	(JI)V
          //   8: aload_0
          //   9: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kdF	Lcom/tencent/mm/plugin/dbbackup/d;
          //   12: aconst_null
          //   13: putfield 59	com/tencent/mm/plugin/dbbackup/d:kdd	Lcom/tencent/wcdb/repair/RecoverKit;
          //   16: invokestatic 65	com/tencent/mm/y/c:yM	()Lcom/tencent/mm/plugin/messenger/foundation/a/a/c;
          //   19: pop
          //   20: invokestatic 69	com/tencent/mm/y/c:yP	()Lcom/tencent/mm/storage/as;
          //   23: pop
          //   24: invokestatic 75	com/tencent/mm/ao/n:IZ	()Lcom/tencent/mm/ao/f;
          //   27: pop
          //   28: invokestatic 81	com/tencent/mm/modelvideo/o:Nh	()Lcom/tencent/mm/modelvideo/s;
          //   31: pop
          //   32: invokestatic 87	java/lang/System:nanoTime	()J
          //   35: lstore 11
          //   37: new 89	java/lang/StringBuilder
          //   40: dup
          //   41: invokespecial 90	java/lang/StringBuilder:<init>	()V
          //   44: invokestatic 96	com/tencent/mm/compatible/d/p:sZ	()Ljava/lang/String;
          //   47: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   50: invokestatic 104	com/tencent/mm/y/c:ww	()I
          //   53: invokevirtual 107	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
          //   56: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
          //   59: invokevirtual 116	java/lang/String:getBytes	()[B
          //   62: astore 14
          //   64: aload 14
          //   66: invokestatic 121	com/tencent/mm/a/g:o	([B)[B
          //   69: astore 17
          //   71: aload 14
          //   73: invokestatic 125	com/tencent/mm/a/g:n	([B)Ljava/lang/String;
          //   76: iconst_0
          //   77: bipush 7
          //   79: invokevirtual 129	java/lang/String:substring	(II)Ljava/lang/String;
          //   82: invokevirtual 116	java/lang/String:getBytes	()[B
          //   85: astore 14
          //   87: ldc -126
          //   89: istore_1
          //   90: invokestatic 136	com/tencent/mm/bu/e:bVi	()Z
          //   93: ifeq +6 -> 99
          //   96: ldc -119
          //   98: istore_1
          //   99: invokestatic 141	com/tencent/mm/y/c:yH	()Lcom/tencent/mm/bu/g;
          //   102: invokevirtual 147	com/tencent/mm/bu/g:bVk	()Lcom/tencent/wcdb/database/SQLiteDatabase;
          //   105: invokevirtual 152	com/tencent/wcdb/database/SQLiteDatabase:getPath	()Ljava/lang/String;
          //   108: aload 14
          //   110: getstatic 156	com/tencent/mm/plugin/dbbackup/d:kds	Lcom/tencent/wcdb/database/SQLiteCipherSpec;
          //   113: aconst_null
          //   114: iload_1
          //   115: aconst_null
          //   116: iconst_0
          //   117: invokestatic 160	com/tencent/wcdb/database/SQLiteDatabase:openDatabase	(Ljava/lang/String;[BLcom/tencent/wcdb/database/SQLiteCipherSpec;Lcom/tencent/wcdb/database/SQLiteDatabase$CursorFactory;ILcom/tencent/wcdb/DatabaseErrorHandler;I)Lcom/tencent/wcdb/database/SQLiteDatabase;
          //   120: astore 15
          //   122: aload 15
          //   124: astore 16
          //   126: aload_0
          //   127: getfield 29	com/tencent/mm/plugin/dbbackup/d$2:kdG	Ljava/lang/String;
          //   130: ifnull +104 -> 234
          //   133: aload 15
          //   135: astore 16
          //   137: aload_0
          //   138: getfield 29	com/tencent/mm/plugin/dbbackup/d$2:kdG	Ljava/lang/String;
          //   141: astore 14
          //   143: iconst_1
          //   144: anewarray 112	java/lang/String
          //   147: dup
          //   148: iconst_0
          //   149: aload 14
          //   151: aastore
          //   152: astore 14
          //   154: bipush -3
          //   156: istore_1
          //   157: aload 15
          //   159: astore 16
          //   161: aload 14
          //   163: arraylength
          //   164: istore_3
          //   165: iconst_0
          //   166: istore_2
          //   167: lconst_0
          //   168: lstore 7
          //   170: bipush -3
          //   172: istore_1
          //   173: lload 7
          //   175: lstore 9
          //   177: iload_2
          //   178: iload_3
          //   179: if_icmpge +408 -> 587
          //   182: aload 14
          //   184: iload_2
          //   185: aaload
          //   186: astore 18
          //   188: lload 7
          //   190: lstore 9
          //   192: aload 15
          //   194: astore 16
          //   196: new 162	java/io/File
          //   199: dup
          //   200: aload 18
          //   202: invokespecial 165	java/io/File:<init>	(Ljava/lang/String;)V
          //   205: astore 19
          //   207: lload 7
          //   209: lstore 9
          //   211: aload 15
          //   213: astore 16
          //   215: aload 19
          //   217: invokevirtual 168	java/io/File:canRead	()Z
          //   220: istore 13
          //   222: iload 13
          //   224: ifne +102 -> 326
          //   227: iload_2
          //   228: iconst_1
          //   229: iadd
          //   230: istore_2
          //   231: goto -58 -> 173
          //   234: aload 15
          //   236: astore 16
          //   238: new 89	java/lang/StringBuilder
          //   241: dup
          //   242: invokespecial 90	java/lang/StringBuilder:<init>	()V
          //   245: invokestatic 171	com/tencent/mm/y/c:xd	()Ljava/lang/String;
          //   248: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   251: ldc -83
          //   253: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   256: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
          //   259: astore 14
          //   261: aload 15
          //   263: astore 16
          //   265: new 89	java/lang/StringBuilder
          //   268: dup
          //   269: invokespecial 90	java/lang/StringBuilder:<init>	()V
          //   272: astore 18
          //   274: aload 15
          //   276: astore 16
          //   278: invokestatic 179	com/tencent/mm/kernel/h:xz	()Lcom/tencent/mm/kernel/h;
          //   281: pop
          //   282: aload 15
          //   284: astore 16
          //   286: aload 18
          //   288: invokestatic 183	com/tencent/mm/kernel/h:xy	()Lcom/tencent/mm/kernel/e;
          //   291: getfield 188	com/tencent/mm/kernel/e:fYU	Ljava/lang/String;
          //   294: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   297: ldc -66
          //   299: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   302: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
          //   305: astore 18
          //   307: iconst_2
          //   308: anewarray 112	java/lang/String
          //   311: dup
          //   312: iconst_0
          //   313: aload 14
          //   315: aastore
          //   316: dup
          //   317: iconst_1
          //   318: aload 18
          //   320: aastore
          //   321: astore 14
          //   323: goto -169 -> 154
          //   326: lload 7
          //   328: lstore 9
          //   330: aload 15
          //   332: astore 16
          //   334: aload 19
          //   336: invokevirtual 193	java/io/File:length	()J
          //   339: lstore 7
          //   341: lload 7
          //   343: lstore 9
          //   345: aload 15
          //   347: astore 16
          //   349: ldc -61
          //   351: ldc -59
          //   353: iconst_2
          //   354: anewarray 4	java/lang/Object
          //   357: dup
          //   358: iconst_0
          //   359: lload 7
          //   361: invokestatic 203	java/lang/Long:valueOf	(J)Ljava/lang/Long;
          //   364: aastore
          //   365: dup
          //   366: iconst_1
          //   367: aload_0
          //   368: getfield 31	com/tencent/mm/plugin/dbbackup/d$2:kdH	J
          //   371: invokestatic 203	java/lang/Long:valueOf	(J)Ljava/lang/Long;
          //   374: aastore
          //   375: invokestatic 208	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
          //   378: lload 7
          //   380: lstore 9
          //   382: aload 15
          //   384: astore 16
          //   386: aload_0
          //   387: getfield 31	com/tencent/mm/plugin/dbbackup/d$2:kdH	J
          //   390: ldc2_w 209
          //   393: lload 7
          //   395: lmul
          //   396: lcmp
          //   397: ifge +98 -> 495
          //   400: lload 7
          //   402: lstore 9
          //   404: aload 15
          //   406: astore 16
          //   408: aload_0
          //   409: getfield 33	com/tencent/mm/plugin/dbbackup/d$2:kdt	Lcom/tencent/mm/plugin/dbbackup/b;
          //   412: ifnull +22 -> 434
          //   415: lload 7
          //   417: lstore 9
          //   419: aload 15
          //   421: astore 16
          //   423: aload_0
          //   424: getfield 33	com/tencent/mm/plugin/dbbackup/d$2:kdt	Lcom/tencent/mm/plugin/dbbackup/b;
          //   427: bipush -2
          //   429: invokeinterface 216 2 0
          //   434: aload_0
          //   435: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kdF	Lcom/tencent/mm/plugin/dbbackup/d;
          //   438: getfield 59	com/tencent/mm/plugin/dbbackup/d:kdd	Lcom/tencent/wcdb/repair/RecoverKit;
          //   441: ifnull +21 -> 462
          //   444: aload_0
          //   445: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kdF	Lcom/tencent/mm/plugin/dbbackup/d;
          //   448: getfield 59	com/tencent/mm/plugin/dbbackup/d:kdd	Lcom/tencent/wcdb/repair/RecoverKit;
          //   451: invokevirtual 221	com/tencent/wcdb/repair/RecoverKit:release	()V
          //   454: aload_0
          //   455: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kdF	Lcom/tencent/mm/plugin/dbbackup/d;
          //   458: aconst_null
          //   459: putfield 59	com/tencent/mm/plugin/dbbackup/d:kdd	Lcom/tencent/wcdb/repair/RecoverKit;
          //   462: aload 15
          //   464: ifnull +8 -> 472
          //   467: aload 15
          //   469: invokevirtual 224	com/tencent/wcdb/database/SQLiteDatabase:close	()V
          //   472: aload_0
          //   473: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kdF	Lcom/tencent/mm/plugin/dbbackup/d;
          //   476: iconst_0
          //   477: putfield 228	com/tencent/mm/plugin/dbbackup/d:kdf	Z
          //   480: invokestatic 234	com/tencent/mm/y/at:xB	()Lcom/tencent/mm/sdk/platformtools/af;
          //   483: invokevirtual 239	com/tencent/mm/sdk/platformtools/af:bQh	()V
          //   486: ldc2_w 53
          //   489: ldc 55
          //   491: invokestatic 48	com/tencent/gmtrace/GMTrace:o	(JI)V
          //   494: return
          //   495: lload 7
          //   497: lstore 9
          //   499: aload 15
          //   501: astore 16
          //   503: getstatic 245	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
          //   506: sipush 11098
          //   509: iconst_2
          //   510: anewarray 4	java/lang/Object
          //   513: dup
          //   514: iconst_0
          //   515: sipush 10004
          //   518: invokestatic 250	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
          //   521: aastore
          //   522: dup
          //   523: iconst_1
          //   524: ldc -4
          //   526: iconst_2
          //   527: anewarray 4	java/lang/Object
          //   530: dup
          //   531: iconst_0
          //   532: lload 7
          //   534: invokestatic 203	java/lang/Long:valueOf	(J)Ljava/lang/Long;
          //   537: aastore
          //   538: dup
          //   539: iconst_1
          //   540: aload_0
          //   541: getfield 31	com/tencent/mm/plugin/dbbackup/d$2:kdH	J
          //   544: invokestatic 203	java/lang/Long:valueOf	(J)Ljava/lang/Long;
          //   547: aastore
          //   548: invokestatic 256	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
          //   551: aastore
          //   552: invokevirtual 259	com/tencent/mm/plugin/report/service/g:i	(I[Ljava/lang/Object;)V
          //   555: lload 7
          //   557: lstore 9
          //   559: aload 15
          //   561: astore 16
          //   563: aload_0
          //   564: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kdF	Lcom/tencent/mm/plugin/dbbackup/d;
          //   567: new 218	com/tencent/wcdb/repair/RecoverKit
          //   570: dup
          //   571: aload 15
          //   573: aload 18
          //   575: aload 17
          //   577: invokespecial 262	com/tencent/wcdb/repair/RecoverKit:<init>	(Lcom/tencent/wcdb/database/SQLiteDatabase;Ljava/lang/String;[B)V
          //   580: putfield 59	com/tencent/mm/plugin/dbbackup/d:kdd	Lcom/tencent/wcdb/repair/RecoverKit;
          //   583: lload 7
          //   585: lstore 9
          //   587: aload 15
          //   589: astore 16
          //   591: aload_0
          //   592: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kdF	Lcom/tencent/mm/plugin/dbbackup/d;
          //   595: getfield 59	com/tencent/mm/plugin/dbbackup/d:kdd	Lcom/tencent/wcdb/repair/RecoverKit;
          //   598: astore 14
          //   600: aload 14
          //   602: ifnonnull +221 -> 823
          //   605: bipush -3
          //   607: istore_2
          //   608: aload 15
          //   610: astore 14
          //   612: iload_2
          //   613: istore_1
          //   614: aload 15
          //   616: astore 16
          //   618: getstatic 245	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
          //   621: ldc2_w 263
          //   624: ldc2_w 265
          //   627: lconst_1
          //   628: iconst_1
          //   629: invokevirtual 269	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
          //   632: aload 15
          //   634: astore 14
          //   636: iload_2
          //   637: istore_1
          //   638: aload 15
          //   640: astore 16
          //   642: new 271	java/lang/RuntimeException
          //   645: dup
          //   646: invokespecial 272	java/lang/RuntimeException:<init>	()V
          //   649: athrow
          //   650: astore 16
          //   652: aload 14
          //   654: astore 15
          //   656: aload 16
          //   658: astore 14
          //   660: aload 15
          //   662: astore 16
          //   664: ldc -61
          //   666: aload 14
          //   668: ldc_w 274
          //   671: iconst_0
          //   672: anewarray 4	java/lang/Object
          //   675: invokestatic 278	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
          //   678: aload 15
          //   680: astore 16
          //   682: aload_0
          //   683: getfield 33	com/tencent/mm/plugin/dbbackup/d$2:kdt	Lcom/tencent/mm/plugin/dbbackup/b;
          //   686: ifnull +17 -> 703
          //   689: aload 15
          //   691: astore 16
          //   693: aload_0
          //   694: getfield 33	com/tencent/mm/plugin/dbbackup/d$2:kdt	Lcom/tencent/mm/plugin/dbbackup/b;
          //   697: iload_1
          //   698: invokeinterface 216 2 0
          //   703: aload 15
          //   705: astore 16
          //   707: getstatic 245	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
          //   710: ldc2_w 263
          //   713: ldc2_w 279
          //   716: lconst_1
          //   717: iconst_1
          //   718: invokevirtual 269	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
          //   721: aload_0
          //   722: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kdF	Lcom/tencent/mm/plugin/dbbackup/d;
          //   725: getfield 59	com/tencent/mm/plugin/dbbackup/d:kdd	Lcom/tencent/wcdb/repair/RecoverKit;
          //   728: ifnull +21 -> 749
          //   731: aload_0
          //   732: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kdF	Lcom/tencent/mm/plugin/dbbackup/d;
          //   735: getfield 59	com/tencent/mm/plugin/dbbackup/d:kdd	Lcom/tencent/wcdb/repair/RecoverKit;
          //   738: invokevirtual 221	com/tencent/wcdb/repair/RecoverKit:release	()V
          //   741: aload_0
          //   742: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kdF	Lcom/tencent/mm/plugin/dbbackup/d;
          //   745: aconst_null
          //   746: putfield 59	com/tencent/mm/plugin/dbbackup/d:kdd	Lcom/tencent/wcdb/repair/RecoverKit;
          //   749: aload 15
          //   751: ifnull +8 -> 759
          //   754: aload 15
          //   756: invokevirtual 224	com/tencent/wcdb/database/SQLiteDatabase:close	()V
          //   759: aload_0
          //   760: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kdF	Lcom/tencent/mm/plugin/dbbackup/d;
          //   763: iconst_0
          //   764: putfield 228	com/tencent/mm/plugin/dbbackup/d:kdf	Z
          //   767: invokestatic 234	com/tencent/mm/y/at:xB	()Lcom/tencent/mm/sdk/platformtools/af;
          //   770: invokevirtual 239	com/tencent/mm/sdk/platformtools/af:bQh	()V
          //   773: ldc2_w 53
          //   776: ldc 55
          //   778: invokestatic 48	com/tencent/gmtrace/GMTrace:o	(JI)V
          //   781: return
          //   782: astore 18
          //   784: aload 15
          //   786: astore 16
          //   788: ldc -61
          //   790: new 89	java/lang/StringBuilder
          //   793: dup
          //   794: ldc_w 282
          //   797: invokespecial 283	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
          //   800: aload 18
          //   802: invokevirtual 286	java/lang/Exception:getMessage	()Ljava/lang/String;
          //   805: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   808: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
          //   811: invokestatic 290	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
          //   814: iconst_m1
          //   815: istore_1
          //   816: lload 9
          //   818: lstore 7
          //   820: goto -593 -> 227
          //   823: aload 15
          //   825: astore 16
          //   827: aload_0
          //   828: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kdF	Lcom/tencent/mm/plugin/dbbackup/d;
          //   831: getfield 59	com/tencent/mm/plugin/dbbackup/d:kdd	Lcom/tencent/wcdb/repair/RecoverKit;
          //   834: iconst_0
          //   835: invokevirtual 293	com/tencent/wcdb/repair/RecoverKit:run	(Z)I
          //   838: istore 4
          //   840: aload 15
          //   842: astore 14
          //   844: iload 4
          //   846: istore_1
          //   847: aload 15
          //   849: astore 16
          //   851: invokestatic 296	com/tencent/mm/plugin/dbbackup/d:apt	()V
          //   854: aload 15
          //   856: astore 14
          //   858: iload 4
          //   860: istore_1
          //   861: aload 15
          //   863: astore 16
          //   865: invokestatic 87	java/lang/System:nanoTime	()J
          //   868: lload 11
          //   870: lsub
          //   871: lstore 7
          //   873: aload 15
          //   875: astore 14
          //   877: iload 4
          //   879: istore_1
          //   880: aload 15
          //   882: astore 16
          //   884: aload_0
          //   885: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kdF	Lcom/tencent/mm/plugin/dbbackup/d;
          //   888: getfield 59	com/tencent/mm/plugin/dbbackup/d:kdd	Lcom/tencent/wcdb/repair/RecoverKit;
          //   891: invokevirtual 299	com/tencent/wcdb/repair/RecoverKit:successCount	()I
          //   894: istore 5
          //   896: aload 15
          //   898: astore 14
          //   900: iload 4
          //   902: istore_1
          //   903: aload 15
          //   905: astore 16
          //   907: aload_0
          //   908: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kdF	Lcom/tencent/mm/plugin/dbbackup/d;
          //   911: getfield 59	com/tencent/mm/plugin/dbbackup/d:kdd	Lcom/tencent/wcdb/repair/RecoverKit;
          //   914: invokevirtual 302	com/tencent/wcdb/repair/RecoverKit:failureCount	()I
          //   917: istore 6
          //   919: aload 15
          //   921: astore 14
          //   923: iload 4
          //   925: istore_1
          //   926: aload 15
          //   928: astore 16
          //   930: aload_0
          //   931: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kdF	Lcom/tencent/mm/plugin/dbbackup/d;
          //   934: getfield 59	com/tencent/mm/plugin/dbbackup/d:kdd	Lcom/tencent/wcdb/repair/RecoverKit;
          //   937: invokevirtual 305	com/tencent/wcdb/repair/RecoverKit:lastError	()Ljava/lang/String;
          //   940: astore 19
          //   942: aload 15
          //   944: astore 14
          //   946: iload 4
          //   948: istore_1
          //   949: aload 15
          //   951: astore 16
          //   953: aload_0
          //   954: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kdF	Lcom/tencent/mm/plugin/dbbackup/d;
          //   957: getfield 59	com/tencent/mm/plugin/dbbackup/d:kdd	Lcom/tencent/wcdb/repair/RecoverKit;
          //   960: invokevirtual 221	com/tencent/wcdb/repair/RecoverKit:release	()V
          //   963: aload 15
          //   965: astore 14
          //   967: iload 4
          //   969: istore_1
          //   970: aload 15
          //   972: astore 16
          //   974: aload_0
          //   975: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kdF	Lcom/tencent/mm/plugin/dbbackup/d;
          //   978: aconst_null
          //   979: putfield 59	com/tencent/mm/plugin/dbbackup/d:kdd	Lcom/tencent/wcdb/repair/RecoverKit;
          //   982: aload 15
          //   984: astore 14
          //   986: iload 4
          //   988: istore_1
          //   989: aload 15
          //   991: astore 16
          //   993: aload 15
          //   995: invokevirtual 224	com/tencent/wcdb/database/SQLiteDatabase:close	()V
          //   998: aconst_null
          //   999: astore 18
          //   1001: aconst_null
          //   1002: astore 17
          //   1004: iload 4
          //   1006: ifne +276 -> 1282
          //   1009: ldc_w 307
          //   1012: astore 15
          //   1014: aload 17
          //   1016: astore 14
          //   1018: iload 4
          //   1020: istore_1
          //   1021: aload 18
          //   1023: astore 16
          //   1025: ldc -61
          //   1027: ldc_w 309
          //   1030: iconst_4
          //   1031: anewarray 4	java/lang/Object
          //   1034: dup
          //   1035: iconst_0
          //   1036: aload 15
          //   1038: aastore
          //   1039: dup
          //   1040: iconst_1
          //   1041: lload 7
          //   1043: l2f
          //   1044: ldc_w 310
          //   1047: fdiv
          //   1048: invokestatic 315	java/lang/Float:valueOf	(F)Ljava/lang/Float;
          //   1051: aastore
          //   1052: dup
          //   1053: iconst_2
          //   1054: iload 5
          //   1056: invokestatic 250	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
          //   1059: aastore
          //   1060: dup
          //   1061: iconst_3
          //   1062: iload 6
          //   1064: invokestatic 250	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
          //   1067: aastore
          //   1068: invokestatic 208	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
          //   1071: iload 4
          //   1073: ifne +372 -> 1445
          //   1076: sipush 10005
          //   1079: istore_3
          //   1080: bipush 22
          //   1082: istore_2
          //   1083: aload 17
          //   1085: astore 14
          //   1087: iload 4
          //   1089: istore_1
          //   1090: aload 18
          //   1092: astore 16
          //   1094: getstatic 245	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
          //   1097: sipush 11098
          //   1100: iconst_2
          //   1101: anewarray 4	java/lang/Object
          //   1104: dup
          //   1105: iconst_0
          //   1106: iload_3
          //   1107: invokestatic 250	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
          //   1110: aastore
          //   1111: dup
          //   1112: iconst_1
          //   1113: ldc_w 317
          //   1116: iconst_4
          //   1117: anewarray 4	java/lang/Object
          //   1120: dup
          //   1121: iconst_0
          //   1122: lload 9
          //   1124: invokestatic 203	java/lang/Long:valueOf	(J)Ljava/lang/Long;
          //   1127: aastore
          //   1128: dup
          //   1129: iconst_1
          //   1130: lload 7
          //   1132: ldc2_w 318
          //   1135: ldiv
          //   1136: invokestatic 203	java/lang/Long:valueOf	(J)Ljava/lang/Long;
          //   1139: aastore
          //   1140: dup
          //   1141: iconst_2
          //   1142: iload 5
          //   1144: invokestatic 250	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
          //   1147: aastore
          //   1148: dup
          //   1149: iconst_3
          //   1150: iload 6
          //   1152: invokestatic 250	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
          //   1155: aastore
          //   1156: invokestatic 256	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
          //   1159: aastore
          //   1160: invokevirtual 259	com/tencent/mm/plugin/report/service/g:i	(I[Ljava/lang/Object;)V
          //   1163: iload_2
          //   1164: iflt +27 -> 1191
          //   1167: aload 17
          //   1169: astore 14
          //   1171: iload 4
          //   1173: istore_1
          //   1174: aload 18
          //   1176: astore 16
          //   1178: getstatic 245	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
          //   1181: ldc2_w 263
          //   1184: iload_2
          //   1185: i2l
          //   1186: lconst_1
          //   1187: iconst_1
          //   1188: invokevirtual 269	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
          //   1191: aload 17
          //   1193: astore 14
          //   1195: iload 4
          //   1197: istore_1
          //   1198: aload 18
          //   1200: astore 16
          //   1202: aload_0
          //   1203: getfield 33	com/tencent/mm/plugin/dbbackup/d$2:kdt	Lcom/tencent/mm/plugin/dbbackup/b;
          //   1206: ifnull +25 -> 1231
          //   1209: aload 17
          //   1211: astore 14
          //   1213: iload 4
          //   1215: istore_1
          //   1216: aload 18
          //   1218: astore 16
          //   1220: aload_0
          //   1221: getfield 33	com/tencent/mm/plugin/dbbackup/d$2:kdt	Lcom/tencent/mm/plugin/dbbackup/b;
          //   1224: iload 4
          //   1226: invokeinterface 216 2 0
          //   1231: aload_0
          //   1232: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kdF	Lcom/tencent/mm/plugin/dbbackup/d;
          //   1235: getfield 59	com/tencent/mm/plugin/dbbackup/d:kdd	Lcom/tencent/wcdb/repair/RecoverKit;
          //   1238: ifnull +21 -> 1259
          //   1241: aload_0
          //   1242: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kdF	Lcom/tencent/mm/plugin/dbbackup/d;
          //   1245: getfield 59	com/tencent/mm/plugin/dbbackup/d:kdd	Lcom/tencent/wcdb/repair/RecoverKit;
          //   1248: invokevirtual 221	com/tencent/wcdb/repair/RecoverKit:release	()V
          //   1251: aload_0
          //   1252: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kdF	Lcom/tencent/mm/plugin/dbbackup/d;
          //   1255: aconst_null
          //   1256: putfield 59	com/tencent/mm/plugin/dbbackup/d:kdd	Lcom/tencent/wcdb/repair/RecoverKit;
          //   1259: aload_0
          //   1260: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kdF	Lcom/tencent/mm/plugin/dbbackup/d;
          //   1263: iconst_0
          //   1264: putfield 228	com/tencent/mm/plugin/dbbackup/d:kdf	Z
          //   1267: invokestatic 234	com/tencent/mm/y/at:xB	()Lcom/tencent/mm/sdk/platformtools/af;
          //   1270: invokevirtual 239	com/tencent/mm/sdk/platformtools/af:bQh	()V
          //   1273: ldc2_w 53
          //   1276: ldc 55
          //   1278: invokestatic 48	com/tencent/gmtrace/GMTrace:o	(JI)V
          //   1281: return
          //   1282: iload 4
          //   1284: iconst_1
          //   1285: if_icmpne +152 -> 1437
          //   1288: ldc_w 321
          //   1291: astore 15
          //   1293: goto -279 -> 1014
          //   1296: sipush 10007
          //   1299: istore_3
          //   1300: bipush 23
          //   1302: istore_2
          //   1303: aload 17
          //   1305: astore 14
          //   1307: iload 4
          //   1309: istore_1
          //   1310: aload 18
          //   1312: astore 16
          //   1314: getstatic 245	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
          //   1317: ldc_w 323
          //   1320: new 89	java/lang/StringBuilder
          //   1323: dup
          //   1324: ldc_w 325
          //   1327: invokespecial 283	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
          //   1330: aload 19
          //   1332: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
          //   1335: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
          //   1338: aconst_null
          //   1339: invokevirtual 329	com/tencent/mm/plugin/report/service/g:d	(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
          //   1342: goto -259 -> 1083
          //   1345: astore 14
          //   1347: aload_0
          //   1348: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kdF	Lcom/tencent/mm/plugin/dbbackup/d;
          //   1351: getfield 59	com/tencent/mm/plugin/dbbackup/d:kdd	Lcom/tencent/wcdb/repair/RecoverKit;
          //   1354: ifnull +21 -> 1375
          //   1357: aload_0
          //   1358: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kdF	Lcom/tencent/mm/plugin/dbbackup/d;
          //   1361: getfield 59	com/tencent/mm/plugin/dbbackup/d:kdd	Lcom/tencent/wcdb/repair/RecoverKit;
          //   1364: invokevirtual 221	com/tencent/wcdb/repair/RecoverKit:release	()V
          //   1367: aload_0
          //   1368: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kdF	Lcom/tencent/mm/plugin/dbbackup/d;
          //   1371: aconst_null
          //   1372: putfield 59	com/tencent/mm/plugin/dbbackup/d:kdd	Lcom/tencent/wcdb/repair/RecoverKit;
          //   1375: aload 16
          //   1377: ifnull +8 -> 1385
          //   1380: aload 16
          //   1382: invokevirtual 224	com/tencent/wcdb/database/SQLiteDatabase:close	()V
          //   1385: aload_0
          //   1386: getfield 25	com/tencent/mm/plugin/dbbackup/d$2:kdF	Lcom/tencent/mm/plugin/dbbackup/d;
          //   1389: iconst_0
          //   1390: putfield 228	com/tencent/mm/plugin/dbbackup/d:kdf	Z
          //   1393: invokestatic 234	com/tencent/mm/y/at:xB	()Lcom/tencent/mm/sdk/platformtools/af;
          //   1396: invokevirtual 239	com/tencent/mm/sdk/platformtools/af:bQh	()V
          //   1399: aload 14
          //   1401: athrow
          //   1402: astore 14
          //   1404: aconst_null
          //   1405: astore 16
          //   1407: goto -60 -> 1347
          //   1410: astore 14
          //   1412: aconst_null
          //   1413: astore 15
          //   1415: iconst_m1
          //   1416: istore_1
          //   1417: goto -757 -> 660
          //   1420: astore 14
          //   1422: iconst_m1
          //   1423: istore_1
          //   1424: goto -764 -> 660
          //   1427: astore 14
          //   1429: goto -769 -> 660
          //   1432: astore 14
          //   1434: goto -774 -> 660
          //   1437: ldc_w 331
          //   1440: astore 15
          //   1442: goto -428 -> 1014
          //   1445: iload 4
          //   1447: iconst_1
          //   1448: if_icmpne -152 -> 1296
          //   1451: sipush 10006
          //   1454: istore_3
          //   1455: iconst_m1
          //   1456: istore_2
          //   1457: goto -374 -> 1083
          // Local variable table:
          //   start	length	slot	name	signature
          //   0	1460	0	this	2
          //   89	1335	1	i	int
          //   166	1291	2	j	int
          //   164	1291	3	k	int
          //   838	611	4	m	int
          //   894	249	5	n	int
          //   917	234	6	i1	int
          //   168	963	7	l1	long
          //   175	948	9	l2	long
          //   35	834	11	l3	long
          //   220	3	13	bool	boolean
          //   62	1244	14	localObject1	Object
          //   1345	55	14	localObject2	Object
          //   1402	1	14	localObject3	Object
          //   1410	1	14	localException1	Exception
          //   1420	1	14	localException2	Exception
          //   1427	1	14	localException3	Exception
          //   1432	1	14	localException4	Exception
          //   120	1321	15	localObject4	Object
          //   124	517	16	localObject5	Object
          //   650	7	16	localException5	Exception
          //   662	744	16	localObject6	Object
          //   69	1235	17	arrayOfByte	byte[]
          //   186	388	18	localObject7	Object
          //   782	19	18	localException6	Exception
          //   999	312	18	localObject8	Object
          //   205	1126	19	localObject9	Object
          // Exception table:
          //   from	to	target	type
          //   618	632	650	java/lang/Exception
          //   642	650	650	java/lang/Exception
          //   851	854	650	java/lang/Exception
          //   865	873	650	java/lang/Exception
          //   884	896	650	java/lang/Exception
          //   907	919	650	java/lang/Exception
          //   930	942	650	java/lang/Exception
          //   953	963	650	java/lang/Exception
          //   974	982	650	java/lang/Exception
          //   993	998	650	java/lang/Exception
          //   1025	1071	650	java/lang/Exception
          //   1094	1163	650	java/lang/Exception
          //   1178	1191	650	java/lang/Exception
          //   1202	1209	650	java/lang/Exception
          //   1220	1231	650	java/lang/Exception
          //   1314	1342	650	java/lang/Exception
          //   196	207	782	java/lang/Exception
          //   215	222	782	java/lang/Exception
          //   334	341	782	java/lang/Exception
          //   349	378	782	java/lang/Exception
          //   386	400	782	java/lang/Exception
          //   408	415	782	java/lang/Exception
          //   423	434	782	java/lang/Exception
          //   503	555	782	java/lang/Exception
          //   563	583	782	java/lang/Exception
          //   126	133	1345	finally
          //   137	143	1345	finally
          //   161	165	1345	finally
          //   196	207	1345	finally
          //   215	222	1345	finally
          //   238	261	1345	finally
          //   265	274	1345	finally
          //   278	282	1345	finally
          //   286	307	1345	finally
          //   334	341	1345	finally
          //   349	378	1345	finally
          //   386	400	1345	finally
          //   408	415	1345	finally
          //   423	434	1345	finally
          //   503	555	1345	finally
          //   563	583	1345	finally
          //   591	600	1345	finally
          //   618	632	1345	finally
          //   642	650	1345	finally
          //   664	678	1345	finally
          //   682	689	1345	finally
          //   693	703	1345	finally
          //   707	721	1345	finally
          //   788	814	1345	finally
          //   827	840	1345	finally
          //   851	854	1345	finally
          //   865	873	1345	finally
          //   884	896	1345	finally
          //   907	919	1345	finally
          //   930	942	1345	finally
          //   953	963	1345	finally
          //   974	982	1345	finally
          //   993	998	1345	finally
          //   1025	1071	1345	finally
          //   1094	1163	1345	finally
          //   1178	1191	1345	finally
          //   1202	1209	1345	finally
          //   1220	1231	1345	finally
          //   1314	1342	1345	finally
          //   16	87	1402	finally
          //   90	96	1402	finally
          //   99	122	1402	finally
          //   16	87	1410	java/lang/Exception
          //   90	96	1410	java/lang/Exception
          //   99	122	1410	java/lang/Exception
          //   126	133	1420	java/lang/Exception
          //   137	143	1420	java/lang/Exception
          //   238	261	1420	java/lang/Exception
          //   265	274	1420	java/lang/Exception
          //   278	282	1420	java/lang/Exception
          //   286	307	1420	java/lang/Exception
          //   161	165	1427	java/lang/Exception
          //   591	600	1432	java/lang/Exception
          //   788	814	1432	java/lang/Exception
          //   827	840	1432	java/lang/Exception
        }
      };
      this.kdf = true;
      at.xB().bQf();
      at.xB().E(paramString);
      GMTrace.o(5131949047808L, 38236);
      return 0;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final boolean a(final boolean paramBoolean, final b paramb)
  {
    GMTrace.i(5131680612352L, 38234);
    if (this.kdf)
    {
      w.i("MicroMsg.SubCoreDBBackup", "Backup or recover task is in progress, %s canceled", new Object[] { "backup" });
      GMTrace.o(5131680612352L, 38234);
      return false;
    }
    final com.tencent.mm.y.c localc = at.AR();
    final String str1 = com.tencent.mm.y.c.xf();
    final SQLiteDatabase localSQLiteDatabase = com.tencent.mm.y.c.yH().bVk();
    final String str2 = str1 + ".bak";
    final String str3 = str2 + ".tmp";
    final String str4 = str1 + ".sm";
    final String str5 = str4 + ".tmp";
    int j = 8;
    final int i = j;
    boolean bool = paramBoolean;
    long l2;
    long l3;
    long l4;
    final Object localObject;
    if (paramBoolean)
    {
      if (FileOp.aZ(str2))
      {
        i = 24;
        FileOp.o(str2, str3);
        bool = paramBoolean;
      }
    }
    else
    {
      l2 = -1L;
      l3 = -1L;
      l4 = -1L;
      localObject = localSQLiteDatabase.rawQueryWithFactory(SQLiteDirectCursor.FACTORY, "SELECT max(msgId) FROM message;", null, null);
      if (!((Cursor)localObject).moveToFirst()) {
        break label889;
      }
    }
    label415:
    label628:
    label716:
    label883:
    label889:
    for (long l1 = ((Cursor)localObject).getLong(0);; l1 = -1L)
    {
      ((Cursor)localObject).close();
      localObject = localSQLiteDatabase.rawQueryWithFactory(SQLiteDirectCursor.FACTORY, "SELECT max(id) FROM ImgInfo2;", null, null);
      if (((Cursor)localObject).moveToFirst()) {
        l2 = ((Cursor)localObject).getLong(0);
      }
      ((Cursor)localObject).close();
      localObject = localSQLiteDatabase.rawQueryWithFactory(SQLiteDirectCursor.FACTORY, "SELECT max(rowid) FROM videoinfo2;", null, null);
      if (((Cursor)localObject).moveToFirst()) {
        l3 = ((Cursor)localObject).getLong(0);
      }
      ((Cursor)localObject).close();
      localObject = localSQLiteDatabase.rawQueryWithFactory(SQLiteDirectCursor.FACTORY, "SELECT max(rowid) FROM EmojiInfo;", null, null);
      if (((Cursor)localObject).moveToFirst()) {
        l4 = ((Cursor)localObject).getLong(0);
      }
      ((Cursor)localObject).close();
      final long[] arrayOfLong = new long[4];
      arrayOfLong[0] = l1;
      arrayOfLong[1] = l2;
      arrayOfLong[2] = l3;
      arrayOfLong[3] = l4;
      final String[] arrayOfString;
      if (bool)
      {
        localObject = vm(str1);
        if ((localObject == null) || (localObject.length < 4)) {
          break label716;
        }
        arrayOfString = new String[12];
        arrayOfString[0] = "message";
        arrayOfString[1] = String.format("msgId > %d AND msgId <= %d", new Object[] { Long.valueOf(localObject[0]), Long.valueOf(arrayOfLong[0]) });
        arrayOfString[2] = "ImgInfo2";
        arrayOfString[3] = String.format("id > %d AND id <= %d", new Object[] { Long.valueOf(localObject[1]), Long.valueOf(arrayOfLong[1]) });
        arrayOfString[4] = "videoinfo2";
        arrayOfString[5] = String.format("rowid > %d AND rowid <= %d", new Object[] { Long.valueOf(localObject[2]), Long.valueOf(arrayOfLong[2]) });
        arrayOfString[6] = "EmojiInfo";
        arrayOfString[7] = String.format("rowid > %d AND rowid <= %d", new Object[] { Long.valueOf(localObject[3]), Long.valueOf(arrayOfLong[3]) });
        arrayOfString[8] = "conversation";
        arrayOfString[9] = null;
        arrayOfString[10] = "rconversation";
        arrayOfString[11] = null;
        if (localObject != null) {
          break label883;
        }
      }
      for (paramBoolean = false;; paramBoolean = bool)
      {
        if (this.kdm) {
          i |= 0x3;
        }
        for (;;)
        {
          paramb = new Runnable()
          {
            public final void run()
            {
              GMTrace.i(5141075853312L, 38304);
              if (!d.this.kdf)
              {
                if (paramb != null) {
                  paramb.mr(1);
                }
                GMTrace.o(5141075853312L, 38304);
                return;
              }
              d.this.kdc = null;
              for (;;)
              {
                Object localObject3;
                long l1;
                label223:
                label278:
                label293:
                int i;
                label340:
                int k;
                int j;
                try
                {
                  long l2 = System.nanoTime();
                  localObject3 = com.tencent.mm.a.g.o((p.sZ() + com.tencent.mm.y.c.ww()).getBytes());
                  Object localObject1 = new File(str4);
                  File localFile;
                  if ((!paramBoolean) || (!((File)localObject1).exists()))
                  {
                    boolean bool = RepairKit.MasterInfo.save(localSQLiteDatabase, str5, (byte[])localObject3);
                    localFile = new File(str5);
                    if (bool)
                    {
                      ((File)localObject1).delete();
                      bool = localFile.renameTo((File)localObject1);
                      l1 = System.nanoTime();
                      if (!bool) {
                        break label1145;
                      }
                      localObject1 = "SUCCEEDED";
                      w.i("MicroMsg.SubCoreDBBackup", "Master table backup %s, elapsed %.3f", new Object[] { localObject1, Float.valueOf((float)(l1 - l2) / 1.0E9F) });
                      localObject1 = com.tencent.mm.plugin.report.service.g.ork;
                      if (!bool) {
                        break label1153;
                      }
                      l1 = 24L;
                      ((com.tencent.mm.plugin.report.service.g)localObject1).a(181L, l1, 1L, false);
                    }
                  }
                  else
                  {
                    long l3 = new File(str1).length();
                    long l4 = new File(str3).length();
                    if (!paramBoolean) {
                      break label1161;
                    }
                    localObject1 = "incremental";
                    if (localObject == null) {
                      break label1169;
                    }
                    l1 = localObject[0];
                    w.i("MicroMsg.SubCoreDBBackup", "Backup started [%s, cursor: %d ~ %d]", new Object[] { localObject1, Long.valueOf(l1), Long.valueOf(arrayOfLong[0]) });
                    if (!paramBoolean) {
                      break label1175;
                    }
                    i = 10011;
                    com.tencent.mm.plugin.report.service.g.ork.i(11098, new Object[] { Integer.valueOf(i), String.format("%d|%d|%s", new Object[] { Long.valueOf(l3), Long.valueOf(l4), d.this.kdn.format(new Date()) }) });
                    d.this.kdc = new BackupKit(localSQLiteDatabase, str3, (byte[])localObject3, i, arrayOfString);
                    k = d.this.kdc.run();
                    l1 = System.nanoTime() - l2;
                    localObject1 = new File(str3);
                    l2 = ((File)localObject1).length();
                    if (k != 0) {
                      continue;
                    }
                    d.a(str1, arrayOfLong);
                    localObject3 = new File(str2);
                    ((File)localObject3).delete();
                    ((File)localObject1).renameTo((File)localObject3);
                    if (!paramBoolean) {
                      break label1182;
                    }
                    i = 19;
                    j = 10012;
                    label536:
                    if (!paramBoolean) {
                      break label1212;
                    }
                    localObject3 = "incremental";
                    break label1133;
                    label550:
                    w.i("MicroMsg.SubCoreDBBackup", "Database %s backup %s, elapsed %.2f seconds.", new Object[] { localObject3, localObject1, Float.valueOf((float)l1 / 1.0E9F) });
                    com.tencent.mm.plugin.report.service.g.ork.a(181L, i, 1L, false);
                    com.tencent.mm.plugin.report.service.g.ork.i(11098, new Object[] { Integer.valueOf(j), String.format("%d|%d|%d|%d|%d|%s", new Object[] { Long.valueOf(l3), Long.valueOf(l4), Long.valueOf(l2), Integer.valueOf(d.this.kdc.statementCount()), Long.valueOf(l1 / 1000000L), d.this.kdn.format(new Date()) }) });
                    if (paramb != null) {
                      paramb.mr(k);
                    }
                    d.this.kdc.release();
                    d.this.kdc = null;
                    localObject1 = new StringBuilder();
                    h.xz();
                    FileOp.la(h.xy().fYU + "dbback");
                    localObject1 = str4;
                    localObject3 = new StringBuilder();
                    h.xz();
                    FileOp.o((String)localObject1, h.xy().fYU + "dbback/EnMicroMsg.db.sm");
                    localObject1 = str2;
                    localObject3 = new StringBuilder();
                    h.xz();
                    FileOp.o((String)localObject1, h.xy().fYU + "dbback/EnMicroMsg.db.bak");
                    if (d.this.kdc != null)
                    {
                      d.this.kdc.release();
                      d.this.kdc = null;
                    }
                    d.this.kdf = false;
                    GMTrace.o(5141075853312L, 38304);
                    return;
                  }
                  localFile.delete();
                  continue;
                  ((File)localObject1).delete();
                  if (k == 1)
                  {
                    if (paramBoolean)
                    {
                      i = 20;
                      j = 10013;
                    }
                  }
                  else
                  {
                    if (!paramBoolean) {
                      break label1202;
                    }
                    i = 21;
                    j = 10014;
                    continue;
                    localObject1 = "failed";
                    continue;
                    com.tencent.mm.plugin.report.service.g localg;
                    if (k != 0) {
                      break label1220;
                    }
                  }
                }
                catch (Exception localException)
                {
                  w.printErrStackTrace("MicroMsg.SubCoreDBBackup", localException, "Failed to start database backup, path: %s", new Object[] { str1 });
                  if (paramb != null) {
                    paramb.mr(-1);
                  }
                  localg = com.tencent.mm.plugin.report.service.g.ork;
                  if (paramBoolean)
                  {
                    l1 = 18L;
                    localg.a(181L, l1, 1L, false);
                    if (d.this.kdc != null)
                    {
                      d.this.kdc.release();
                      d.this.kdc = null;
                    }
                    d.this.kdf = false;
                    GMTrace.o(5141075853312L, 38304);
                    return;
                  }
                  l1 = 21L;
                  continue;
                }
                finally
                {
                  if (d.this.kdc != null)
                  {
                    d.this.kdc.release();
                    d.this.kdc = null;
                  }
                  d.this.kdf = false;
                }
                label1133:
                String str;
                for (;;)
                {
                  str = "succeeded";
                  break label550;
                  label1145:
                  str = "FAILED";
                  break;
                  label1153:
                  l1 = 25L;
                  break label223;
                  label1161:
                  str = "new";
                  break label278;
                  label1169:
                  l1 = 0L;
                  break label293;
                  label1175:
                  i = 10000;
                  break label340;
                  label1182:
                  i = 16;
                  j = 10001;
                  break label536;
                  i = 17;
                  j = 10002;
                  break label536;
                  label1202:
                  i = 18;
                  j = 10003;
                  break label536;
                  label1212:
                  localObject3 = "new";
                }
                label1220:
                if (k == 1) {
                  str = "canceled";
                }
              }
            }
          };
          this.kdf = true;
          com.tencent.mm.sdk.f.e.post(paramb, "DB Backup");
          GMTrace.o(5131680612352L, 38234);
          return true;
          bool = false;
          i = j;
          break;
          localObject = null;
          break label415;
          arrayOfString = new String[12];
          arrayOfString[0] = "message";
          arrayOfString[1] = ("msgId <= " + arrayOfLong[0]);
          arrayOfString[2] = "ImgInfo2";
          arrayOfString[3] = ("id <= " + arrayOfLong[1]);
          arrayOfString[4] = "videoinfo2";
          arrayOfString[5] = ("rowid <= " + arrayOfLong[2]);
          arrayOfString[6] = "EmojiInfo";
          arrayOfString[7] = ("rowid <= " + arrayOfLong[3]);
          arrayOfString[8] = "conversation";
          arrayOfString[9] = null;
          arrayOfString[10] = "rconversation";
          arrayOfString[11] = null;
          break label628;
        }
      }
    }
  }
  
  /* Error */
  public final void aX(boolean paramBoolean)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 9
    //   3: ldc2_w 535
    //   6: ldc_w 537
    //   9: invokestatic 79	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   12: new 142	java/lang/StringBuilder
    //   15: dup
    //   16: invokespecial 143	java/lang/StringBuilder:<init>	()V
    //   19: invokestatic 543	com/tencent/mm/kernel/h:xy	()Lcom/tencent/mm/kernel/e;
    //   22: getfield 548	com/tencent/mm/kernel/e:cachePath	Ljava/lang/String;
    //   25: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   28: ldc_w 550
    //   31: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   34: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   37: astore 11
    //   39: aload_0
    //   40: aload 11
    //   42: putfield 552	com/tencent/mm/plugin/dbbackup/d:kdo	Ljava/lang/String;
    //   45: aload_0
    //   46: new 554	com/tencent/mm/sdk/platformtools/FLock
    //   49: dup
    //   50: aload 11
    //   52: invokespecial 555	com/tencent/mm/sdk/platformtools/FLock:<init>	(Ljava/lang/String;)V
    //   55: putfield 557	com/tencent/mm/plugin/dbbackup/d:kdp	Lcom/tencent/mm/sdk/platformtools/FLock;
    //   58: aload_0
    //   59: getfield 557	com/tencent/mm/plugin/dbbackup/d:kdp	Lcom/tencent/mm/sdk/platformtools/FLock;
    //   62: invokevirtual 560	com/tencent/mm/sdk/platformtools/FLock:bPy	()Z
    //   65: ifeq +684 -> 749
    //   68: new 140	java/io/FileWriter
    //   71: dup
    //   72: aload 11
    //   74: invokespecial 154	java/io/FileWriter:<init>	(Ljava/lang/String;)V
    //   77: astore 7
    //   79: aload 7
    //   81: invokestatic 565	android/os/Process:myPid	()I
    //   84: invokestatic 568	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   87: invokevirtual 164	java/io/FileWriter:write	(Ljava/lang/String;)V
    //   90: aload 7
    //   92: invokevirtual 167	java/io/FileWriter:close	()V
    //   95: ldc_w 570
    //   98: ldc_w 572
    //   101: invokestatic 575	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   104: aconst_null
    //   105: astore 7
    //   107: aload 7
    //   109: ifnull +8 -> 117
    //   112: aload 7
    //   114: invokevirtual 329	java/io/BufferedReader:close	()V
    //   117: invokestatic 341	com/tencent/mm/y/at:AR	()Lcom/tencent/mm/y/c;
    //   120: pop
    //   121: invokestatic 289	com/tencent/mm/y/c:xh	()Lcom/tencent/mm/storage/t;
    //   124: astore 7
    //   126: invokestatic 434	com/tencent/mm/y/c:yH	()Lcom/tencent/mm/bu/g;
    //   129: invokevirtual 440	com/tencent/mm/bu/g:bVk	()Lcom/tencent/wcdb/database/SQLiteDatabase;
    //   132: astore 10
    //   134: aload_0
    //   135: aload 7
    //   137: ldc_w 576
    //   140: invokevirtual 579	com/tencent/mm/storage/t:As	(I)J
    //   143: putfield 119	com/tencent/mm/plugin/dbbackup/d:kdk	J
    //   146: aload_0
    //   147: aload 7
    //   149: ldc_w 580
    //   152: bipush 10
    //   154: invokevirtual 583	com/tencent/mm/storage/t:getInt	(II)I
    //   157: putfield 121	com/tencent/mm/plugin/dbbackup/d:kdl	I
    //   160: aload 7
    //   162: ldc_w 584
    //   165: iconst_0
    //   166: invokevirtual 583	com/tencent/mm/storage/t:getInt	(II)I
    //   169: ifeq +995 -> 1164
    //   172: iconst_1
    //   173: istore_1
    //   174: aload_0
    //   175: iload_1
    //   176: putfield 123	com/tencent/mm/plugin/dbbackup/d:kdm	Z
    //   179: invokestatic 590	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   182: astore 7
    //   184: aload 7
    //   186: aconst_null
    //   187: new 592	android/content/IntentFilter
    //   190: dup
    //   191: ldc_w 594
    //   194: invokespecial 595	android/content/IntentFilter:<init>	(Ljava/lang/String;)V
    //   197: invokevirtual 601	android/content/Context:registerReceiver	(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    //   200: astore 8
    //   202: aload 8
    //   204: ifnull +970 -> 1174
    //   207: aload 8
    //   209: ldc_w 603
    //   212: iconst_m1
    //   213: invokevirtual 608	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   216: istore_2
    //   217: iload_2
    //   218: iconst_2
    //   219: if_icmpeq +8 -> 227
    //   222: iload_2
    //   223: iconst_5
    //   224: if_icmpne +945 -> 1169
    //   227: iconst_1
    //   228: istore_1
    //   229: aload_0
    //   230: iload_1
    //   231: putfield 115	com/tencent/mm/plugin/dbbackup/d:gNF	Z
    //   234: aload_0
    //   235: aload 7
    //   237: ldc_w 610
    //   240: invokevirtual 614	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   243: checkcast 616	android/os/PowerManager
    //   246: invokevirtual 619	android/os/PowerManager:isScreenOn	()Z
    //   249: putfield 117	com/tencent/mm/plugin/dbbackup/d:gNG	Z
    //   252: aload_0
    //   253: new 22	com/tencent/mm/plugin/dbbackup/d$7
    //   256: dup
    //   257: aload_0
    //   258: invokespecial 622	com/tencent/mm/plugin/dbbackup/d$7:<init>	(Lcom/tencent/mm/plugin/dbbackup/d;)V
    //   261: putfield 624	com/tencent/mm/plugin/dbbackup/d:kdq	Lcom/tencent/mm/sdk/e/j$a;
    //   264: invokestatic 187	com/tencent/mm/y/c/c:Ct	()Lcom/tencent/mm/storage/d;
    //   267: aload_0
    //   268: getfield 624	com/tencent/mm/plugin/dbbackup/d:kdq	Lcom/tencent/mm/sdk/e/j$a;
    //   271: invokevirtual 628	com/tencent/mm/storage/d:c	(Lcom/tencent/mm/sdk/e/j$a;)V
    //   274: invokestatic 630	com/tencent/mm/plugin/dbbackup/d:aps	()V
    //   277: aload_0
    //   278: new 24	com/tencent/mm/plugin/dbbackup/d$8
    //   281: dup
    //   282: aload_0
    //   283: invokespecial 631	com/tencent/mm/plugin/dbbackup/d$8:<init>	(Lcom/tencent/mm/plugin/dbbackup/d;)V
    //   286: putfield 633	com/tencent/mm/plugin/dbbackup/d:kdr	Lcom/tencent/mm/sdk/b/c;
    //   289: getstatic 639	com/tencent/mm/sdk/b/a:vgX	Lcom/tencent/mm/sdk/b/a;
    //   292: aload_0
    //   293: getfield 633	com/tencent/mm/plugin/dbbackup/d:kdr	Lcom/tencent/mm/sdk/b/c;
    //   296: invokevirtual 643	com/tencent/mm/sdk/b/a:b	(Lcom/tencent/mm/sdk/b/c;)Z
    //   299: pop
    //   300: aload_0
    //   301: new 26	com/tencent/mm/plugin/dbbackup/d$9
    //   304: dup
    //   305: aload_0
    //   306: invokespecial 644	com/tencent/mm/plugin/dbbackup/d$9:<init>	(Lcom/tencent/mm/plugin/dbbackup/d;)V
    //   309: putfield 646	com/tencent/mm/plugin/dbbackup/d:gNE	Landroid/content/BroadcastReceiver;
    //   312: new 592	android/content/IntentFilter
    //   315: dup
    //   316: invokespecial 647	android/content/IntentFilter:<init>	()V
    //   319: astore 8
    //   321: aload 8
    //   323: ldc_w 649
    //   326: invokevirtual 652	android/content/IntentFilter:addAction	(Ljava/lang/String;)V
    //   329: aload 8
    //   331: ldc_w 654
    //   334: invokevirtual 652	android/content/IntentFilter:addAction	(Ljava/lang/String;)V
    //   337: aload 8
    //   339: ldc_w 656
    //   342: invokevirtual 652	android/content/IntentFilter:addAction	(Ljava/lang/String;)V
    //   345: aload 8
    //   347: ldc_w 658
    //   350: invokevirtual 652	android/content/IntentFilter:addAction	(Ljava/lang/String;)V
    //   353: aload 8
    //   355: ldc_w 594
    //   358: invokevirtual 652	android/content/IntentFilter:addAction	(Ljava/lang/String;)V
    //   361: aload 7
    //   363: aload_0
    //   364: getfield 646	com/tencent/mm/plugin/dbbackup/d:gNE	Landroid/content/BroadcastReceiver;
    //   367: aload 8
    //   369: invokevirtual 601	android/content/Context:registerReceiver	(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    //   372: pop
    //   373: new 660	com/tencent/mm/plugin/dbbackup/c
    //   376: dup
    //   377: aload_0
    //   378: invokespecial 661	com/tencent/mm/plugin/dbbackup/c:<init>	(Lcom/tencent/mm/plugin/dbbackup/d;)V
    //   381: bipush 7
    //   383: anewarray 218	java/lang/String
    //   386: dup
    //   387: iconst_0
    //   388: ldc_w 663
    //   391: aastore
    //   392: dup
    //   393: iconst_1
    //   394: ldc_w 665
    //   397: aastore
    //   398: dup
    //   399: iconst_2
    //   400: ldc_w 667
    //   403: aastore
    //   404: dup
    //   405: iconst_3
    //   406: ldc_w 669
    //   409: aastore
    //   410: dup
    //   411: iconst_4
    //   412: ldc_w 671
    //   415: aastore
    //   416: dup
    //   417: iconst_5
    //   418: ldc_w 673
    //   421: aastore
    //   422: dup
    //   423: bipush 6
    //   425: ldc_w 675
    //   428: aastore
    //   429: invokestatic 680	com/tencent/mm/pluginsdk/b/b:a	(Lcom/tencent/mm/pluginsdk/b/a;[Ljava/lang/String;)V
    //   432: aload_0
    //   433: getfield 107	com/tencent/mm/plugin/dbbackup/d:kdh	Z
    //   436: ifeq +746 -> 1182
    //   439: ldc_w 682
    //   442: astore 7
    //   444: aload_0
    //   445: getfield 117	com/tencent/mm/plugin/dbbackup/d:gNG	Z
    //   448: ifeq +742 -> 1190
    //   451: ldc_w 684
    //   454: astore 8
    //   456: aload_0
    //   457: getfield 115	com/tencent/mm/plugin/dbbackup/d:gNF	Z
    //   460: ifeq +738 -> 1198
    //   463: ldc_w 684
    //   466: astore 9
    //   468: ldc -87
    //   470: ldc_w 686
    //   473: iconst_3
    //   474: anewarray 4	java/lang/Object
    //   477: dup
    //   478: iconst_0
    //   479: aload 7
    //   481: aastore
    //   482: dup
    //   483: iconst_1
    //   484: aload 8
    //   486: aastore
    //   487: dup
    //   488: iconst_2
    //   489: aload 9
    //   491: aastore
    //   492: invokestatic 396	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   495: aload 10
    //   497: invokevirtual 689	com/tencent/wcdb/database/SQLiteDatabase:getPath	()Ljava/lang/String;
    //   500: astore 7
    //   502: new 142	java/lang/StringBuilder
    //   505: dup
    //   506: invokespecial 143	java/lang/StringBuilder:<init>	()V
    //   509: aload 7
    //   511: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   514: ldc_w 446
    //   517: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   520: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   523: astore 8
    //   525: new 142	java/lang/StringBuilder
    //   528: dup
    //   529: invokespecial 143	java/lang/StringBuilder:<init>	()V
    //   532: aload 8
    //   534: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   537: ldc_w 444
    //   540: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   543: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   546: astore 7
    //   548: new 349	java/io/File
    //   551: dup
    //   552: aload 8
    //   554: invokespecial 350	java/io/File:<init>	(Ljava/lang/String;)V
    //   557: astore 8
    //   559: aload 8
    //   561: invokevirtual 692	java/io/File:isFile	()Z
    //   564: ifne +150 -> 714
    //   567: invokestatic 697	java/lang/System:nanoTime	()J
    //   570: lstore_3
    //   571: new 142	java/lang/StringBuilder
    //   574: dup
    //   575: invokespecial 143	java/lang/StringBuilder:<init>	()V
    //   578: invokestatic 358	com/tencent/mm/compatible/d/p:sZ	()Ljava/lang/String;
    //   581: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   584: astore 9
    //   586: invokestatic 341	com/tencent/mm/y/at:AR	()Lcom/tencent/mm/y/c;
    //   589: pop
    //   590: aload 10
    //   592: aload 7
    //   594: aload 9
    //   596: invokestatic 362	com/tencent/mm/y/c:ww	()I
    //   599: invokevirtual 365	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   602: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   605: invokevirtual 369	java/lang/String:getBytes	()[B
    //   608: invokestatic 700	com/tencent/mm/a/g:o	([B)[B
    //   611: invokestatic 706	com/tencent/wcdb/repair/RepairKit$MasterInfo:save	(Lcom/tencent/wcdb/database/SQLiteDatabase;Ljava/lang/String;[B)Z
    //   614: istore_1
    //   615: new 349	java/io/File
    //   618: dup
    //   619: aload 7
    //   621: invokespecial 350	java/io/File:<init>	(Ljava/lang/String;)V
    //   624: astore 7
    //   626: iload_1
    //   627: ifeq +579 -> 1206
    //   630: aload 8
    //   632: invokevirtual 709	java/io/File:delete	()Z
    //   635: pop
    //   636: aload 7
    //   638: aload 8
    //   640: invokevirtual 713	java/io/File:renameTo	(Ljava/io/File;)Z
    //   643: istore_1
    //   644: invokestatic 697	java/lang/System:nanoTime	()J
    //   647: lstore 5
    //   649: iload_1
    //   650: ifeq +565 -> 1215
    //   653: ldc_w 715
    //   656: astore 7
    //   658: ldc -87
    //   660: ldc_w 717
    //   663: iconst_2
    //   664: anewarray 4	java/lang/Object
    //   667: dup
    //   668: iconst_0
    //   669: aload 7
    //   671: aastore
    //   672: dup
    //   673: iconst_1
    //   674: lload 5
    //   676: lload_3
    //   677: lsub
    //   678: l2f
    //   679: ldc_w 718
    //   682: fdiv
    //   683: invokestatic 723	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   686: aastore
    //   687: invokestatic 396	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   690: getstatic 729	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   693: astore 7
    //   695: iload_1
    //   696: ifeq +527 -> 1223
    //   699: ldc2_w 730
    //   702: lstore_3
    //   703: aload 7
    //   705: ldc2_w 732
    //   708: lload_3
    //   709: lconst_1
    //   710: iconst_0
    //   711: invokevirtual 736	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   714: invokestatic 739	com/tencent/mm/y/c:zn	()Ljava/lang/String;
    //   717: astore 7
    //   719: invokestatic 400	com/tencent/mm/y/at:xB	()Lcom/tencent/mm/sdk/platformtools/af;
    //   722: new 20	com/tencent/mm/plugin/dbbackup/d$6
    //   725: dup
    //   726: aload_0
    //   727: aload 7
    //   729: invokespecial 742	com/tencent/mm/plugin/dbbackup/d$6:<init>	(Lcom/tencent/mm/plugin/dbbackup/d;Ljava/lang/String;)V
    //   732: ldc2_w 743
    //   735: invokevirtual 748	com/tencent/mm/sdk/platformtools/af:h	(Ljava/lang/Runnable;J)I
    //   738: pop
    //   739: ldc2_w 535
    //   742: ldc_w 537
    //   745: invokestatic 96	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   748: return
    //   749: new 315	java/io/BufferedReader
    //   752: dup
    //   753: new 317	java/io/FileReader
    //   756: dup
    //   757: aload 11
    //   759: invokespecial 318	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   762: invokespecial 321	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   765: astore 7
    //   767: aload 7
    //   769: astore 8
    //   771: aload 7
    //   773: invokevirtual 324	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   776: astore 10
    //   778: aload 10
    //   780: ifnonnull +248 -> 1028
    //   783: iconst_0
    //   784: istore_2
    //   785: aload 7
    //   787: astore 8
    //   789: aload 7
    //   791: invokevirtual 329	java/io/BufferedReader:close	()V
    //   794: iload_2
    //   795: ifeq +502 -> 1297
    //   798: iload_2
    //   799: invokestatic 565	android/os/Process:myPid	()I
    //   802: if_icmpeq +495 -> 1297
    //   805: new 349	java/io/File
    //   808: dup
    //   809: new 142	java/lang/StringBuilder
    //   812: dup
    //   813: ldc_w 750
    //   816: invokespecial 525	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   819: iload_2
    //   820: invokevirtual 365	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   823: ldc_w 752
    //   826: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   829: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   832: invokespecial 350	java/io/File:<init>	(Ljava/lang/String;)V
    //   835: astore 7
    //   837: aload 7
    //   839: invokevirtual 692	java/io/File:isFile	()Z
    //   842: ifeq +455 -> 1297
    //   845: aload 7
    //   847: invokevirtual 353	java/io/File:canRead	()Z
    //   850: ifeq +447 -> 1297
    //   853: new 315	java/io/BufferedReader
    //   856: dup
    //   857: new 317	java/io/FileReader
    //   860: dup
    //   861: aload 7
    //   863: invokespecial 755	java/io/FileReader:<init>	(Ljava/io/File;)V
    //   866: invokespecial 321	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   869: astore 7
    //   871: aload 7
    //   873: invokevirtual 324	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   876: astore 8
    //   878: aload 8
    //   880: ifnull +161 -> 1041
    //   883: aload 8
    //   885: ldc_w 757
    //   888: invokevirtual 760	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   891: ifeq -20 -> 871
    //   894: aload 8
    //   896: ldc_w 762
    //   899: invokevirtual 766	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   902: astore 8
    //   904: aload 8
    //   906: arraylength
    //   907: iconst_1
    //   908: if_icmple +133 -> 1041
    //   911: aload 8
    //   913: iconst_1
    //   914: aaload
    //   915: ldc_w 768
    //   918: invokevirtual 772	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   921: ifne +16 -> 937
    //   924: aload 8
    //   926: iconst_1
    //   927: aaload
    //   928: ldc_w 774
    //   931: invokevirtual 772	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   934: ifeq +107 -> 1041
    //   937: new 32	com/tencent/mm/plugin/dbbackup/d$a
    //   940: dup
    //   941: new 142	java/lang/StringBuilder
    //   944: dup
    //   945: ldc_w 776
    //   948: invokespecial 525	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   951: iload_2
    //   952: invokevirtual 365	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   955: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   958: invokespecial 777	com/tencent/mm/plugin/dbbackup/d$a:<init>	(Ljava/lang/String;)V
    //   961: athrow
    //   962: astore 12
    //   964: aload 7
    //   966: astore 9
    //   968: aload 7
    //   970: astore 8
    //   972: aload 7
    //   974: astore 10
    //   976: aload 7
    //   978: invokevirtual 329	java/io/BufferedReader:close	()V
    //   981: aload 7
    //   983: astore 9
    //   985: aload 7
    //   987: astore 8
    //   989: aload 7
    //   991: astore 10
    //   993: aload 12
    //   995: athrow
    //   996: astore 8
    //   998: aload 9
    //   1000: astore 7
    //   1002: aload 8
    //   1004: athrow
    //   1005: astore 9
    //   1007: aload 7
    //   1009: astore 8
    //   1011: aload 9
    //   1013: astore 7
    //   1015: aload 8
    //   1017: ifnull +8 -> 1025
    //   1020: aload 8
    //   1022: invokevirtual 329	java/io/BufferedReader:close	()V
    //   1025: aload 7
    //   1027: athrow
    //   1028: aload 7
    //   1030: astore 8
    //   1032: aload 10
    //   1034: invokestatic 781	com/tencent/mm/sdk/platformtools/bg:Sy	(Ljava/lang/String;)I
    //   1037: istore_2
    //   1038: goto -253 -> 785
    //   1041: aload 7
    //   1043: astore 9
    //   1045: aload 7
    //   1047: astore 8
    //   1049: aload 7
    //   1051: astore 10
    //   1053: aload 7
    //   1055: invokevirtual 329	java/io/BufferedReader:close	()V
    //   1058: aload 7
    //   1060: astore 9
    //   1062: aload 7
    //   1064: astore 8
    //   1066: aload 7
    //   1068: astore 10
    //   1070: ldc_w 570
    //   1073: ldc_w 783
    //   1076: invokestatic 575	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1079: goto -972 -> 107
    //   1082: astore 7
    //   1084: ldc_w 570
    //   1087: aload 7
    //   1089: new 142	java/lang/StringBuilder
    //   1092: dup
    //   1093: ldc_w 785
    //   1096: invokespecial 525	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1099: aload 11
    //   1101: invokevirtual 147	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1104: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1107: iconst_0
    //   1108: anewarray 4	java/lang/Object
    //   1111: invokestatic 177	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1114: aload_0
    //   1115: getfield 557	com/tencent/mm/plugin/dbbackup/d:kdp	Lcom/tencent/mm/sdk/platformtools/FLock;
    //   1118: invokevirtual 788	com/tencent/mm/sdk/platformtools/FLock:unlock	()V
    //   1121: aload_0
    //   1122: aconst_null
    //   1123: putfield 557	com/tencent/mm/plugin/dbbackup/d:kdp	Lcom/tencent/mm/sdk/platformtools/FLock;
    //   1126: new 349	java/io/File
    //   1129: dup
    //   1130: aload_0
    //   1131: getfield 552	com/tencent/mm/plugin/dbbackup/d:kdo	Ljava/lang/String;
    //   1134: invokespecial 350	java/io/File:<init>	(Ljava/lang/String;)V
    //   1137: invokevirtual 709	java/io/File:delete	()Z
    //   1140: pop
    //   1141: aload_0
    //   1142: aconst_null
    //   1143: putfield 552	com/tencent/mm/plugin/dbbackup/d:kdo	Ljava/lang/String;
    //   1146: aload 8
    //   1148: ifnull -1031 -> 117
    //   1151: aload 8
    //   1153: invokevirtual 329	java/io/BufferedReader:close	()V
    //   1156: goto -1039 -> 117
    //   1159: astore 7
    //   1161: goto -1044 -> 117
    //   1164: iconst_0
    //   1165: istore_1
    //   1166: goto -992 -> 174
    //   1169: iconst_0
    //   1170: istore_1
    //   1171: goto -942 -> 229
    //   1174: aload_0
    //   1175: iconst_0
    //   1176: putfield 115	com/tencent/mm/plugin/dbbackup/d:gNF	Z
    //   1179: goto -945 -> 234
    //   1182: ldc_w 790
    //   1185: astore 7
    //   1187: goto -743 -> 444
    //   1190: ldc_w 792
    //   1193: astore 8
    //   1195: goto -739 -> 456
    //   1198: ldc_w 792
    //   1201: astore 9
    //   1203: goto -735 -> 468
    //   1206: aload 7
    //   1208: invokevirtual 709	java/io/File:delete	()Z
    //   1211: pop
    //   1212: goto -568 -> 644
    //   1215: ldc_w 794
    //   1218: astore 7
    //   1220: goto -562 -> 658
    //   1223: ldc2_w 795
    //   1226: lstore_3
    //   1227: goto -524 -> 703
    //   1230: astore 7
    //   1232: goto -1115 -> 117
    //   1235: astore 8
    //   1237: goto -212 -> 1025
    //   1240: astore 7
    //   1242: aload 9
    //   1244: astore 8
    //   1246: goto -231 -> 1015
    //   1249: astore 9
    //   1251: aload 7
    //   1253: astore 8
    //   1255: aload 9
    //   1257: astore 7
    //   1259: goto -244 -> 1015
    //   1262: astore 7
    //   1264: aload 10
    //   1266: astore 8
    //   1268: goto -253 -> 1015
    //   1271: astore 7
    //   1273: goto -258 -> 1015
    //   1276: astore 7
    //   1278: aconst_null
    //   1279: astore 8
    //   1281: goto -197 -> 1084
    //   1284: astore 8
    //   1286: aconst_null
    //   1287: astore 7
    //   1289: goto -287 -> 1002
    //   1292: astore 8
    //   1294: goto -292 -> 1002
    //   1297: aconst_null
    //   1298: astore 7
    //   1300: goto -242 -> 1058
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1303	0	this	d
    //   0	1303	1	paramBoolean	boolean
    //   216	822	2	i	int
    //   570	657	3	l1	long
    //   647	28	5	l2	long
    //   77	990	7	localObject1	Object
    //   1082	6	7	localException1	Exception
    //   1159	1	7	localIOException1	IOException
    //   1185	34	7	str1	String
    //   1230	1	7	localIOException2	IOException
    //   1240	12	7	localObject2	Object
    //   1257	1	7	localObject3	Object
    //   1262	1	7	localObject4	Object
    //   1271	1	7	localObject5	Object
    //   1276	1	7	localException2	Exception
    //   1287	12	7	localObject6	Object
    //   200	788	8	localObject7	Object
    //   996	7	8	locala1	a
    //   1009	185	8	localObject8	Object
    //   1235	1	8	localIOException3	IOException
    //   1244	36	8	localObject9	Object
    //   1284	1	8	locala2	a
    //   1292	1	8	locala3	a
    //   1	998	9	localObject10	Object
    //   1005	7	9	localObject11	Object
    //   1043	200	9	localObject12	Object
    //   1249	7	9	localObject13	Object
    //   132	1133	10	localObject14	Object
    //   37	1063	11	str2	String
    //   962	32	12	localObject15	Object
    // Exception table:
    //   from	to	target	type
    //   871	878	962	finally
    //   883	937	962	finally
    //   937	962	962	finally
    //   976	981	996	com/tencent/mm/plugin/dbbackup/d$a
    //   993	996	996	com/tencent/mm/plugin/dbbackup/d$a
    //   1053	1058	996	com/tencent/mm/plugin/dbbackup/d$a
    //   1070	1079	996	com/tencent/mm/plugin/dbbackup/d$a
    //   1002	1005	1005	finally
    //   771	778	1082	java/lang/Exception
    //   789	794	1082	java/lang/Exception
    //   976	981	1082	java/lang/Exception
    //   993	996	1082	java/lang/Exception
    //   1032	1038	1082	java/lang/Exception
    //   1053	1058	1082	java/lang/Exception
    //   1070	1079	1082	java/lang/Exception
    //   1151	1156	1159	java/io/IOException
    //   112	117	1230	java/io/IOException
    //   1020	1025	1235	java/io/IOException
    //   45	104	1240	finally
    //   749	767	1240	finally
    //   798	871	1240	finally
    //   771	778	1249	finally
    //   789	794	1249	finally
    //   1032	1038	1249	finally
    //   976	981	1262	finally
    //   993	996	1262	finally
    //   1053	1058	1262	finally
    //   1070	1079	1262	finally
    //   1084	1146	1271	finally
    //   45	104	1276	java/lang/Exception
    //   749	767	1276	java/lang/Exception
    //   798	871	1276	java/lang/Exception
    //   45	104	1284	com/tencent/mm/plugin/dbbackup/d$a
    //   749	767	1284	com/tencent/mm/plugin/dbbackup/d$a
    //   798	871	1284	com/tencent/mm/plugin/dbbackup/d$a
    //   771	778	1292	com/tencent/mm/plugin/dbbackup/d$a
    //   789	794	1292	com/tencent/mm/plugin/dbbackup/d$a
    //   1032	1038	1292	com/tencent/mm/plugin/dbbackup/d$a
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(5132888571904L, 38243);
    GMTrace.o(5132888571904L, 38243);
  }
  
  /* Error */
  public final boolean apr()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aload_0
    //   3: monitorenter
    //   4: ldc2_w 802
    //   7: ldc_w 804
    //   10: invokestatic 79	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   13: aload_0
    //   14: iconst_0
    //   15: putfield 103	com/tencent/mm/plugin/dbbackup/d:kdf	Z
    //   18: aload_0
    //   19: getfield 806	com/tencent/mm/plugin/dbbackup/d:kdc	Lcom/tencent/wcdb/repair/BackupKit;
    //   22: ifnonnull +16 -> 38
    //   25: ldc2_w 802
    //   28: ldc_w 804
    //   31: invokestatic 96	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   34: aload_0
    //   35: monitorexit
    //   36: iload_1
    //   37: ireturn
    //   38: aload_0
    //   39: getfield 806	com/tencent/mm/plugin/dbbackup/d:kdc	Lcom/tencent/wcdb/repair/BackupKit;
    //   42: invokevirtual 811	com/tencent/wcdb/repair/BackupKit:onCancel	()V
    //   45: iconst_1
    //   46: istore_1
    //   47: ldc2_w 802
    //   50: ldc_w 804
    //   53: invokestatic 96	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   56: goto -22 -> 34
    //   59: astore_2
    //   60: aload_0
    //   61: monitorexit
    //   62: aload_2
    //   63: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	64	0	this	d
    //   1	46	1	bool	boolean
    //   59	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   4	34	59	finally
    //   38	45	59	finally
    //   47	56	59	finally
  }
  
  public final int b(String paramString, final b paramb)
  {
    int i = 0;
    for (;;)
    {
      final com.tencent.mm.y.c localc;
      final String str;
      long l;
      try
      {
        GMTrace.i(5132083265536L, 38237);
        localc = at.AR();
        str = paramString;
        if (paramString == null) {
          str = com.tencent.mm.y.c.xd();
        }
        l = bg.bQS();
        if (str == null)
        {
          paramString = null;
          if ((paramString == null) || (!paramString.canRead()))
          {
            i = -3;
            GMTrace.o(5132083265536L, 38237);
            return i;
          }
        }
        else
        {
          paramString = new File(str);
          continue;
        }
      }
      finally {}
      tmp96_93[0] = Long.valueOf(paramString.length());
      Object[] tmp106_96 = tmp96_93;
      tmp106_96[1] = Long.valueOf(l);
      w.i("MicroMsg.SubCoreDBBackup", "[Repair] inFileSize: %d, diskFreeSpace: %d", tmp106_96);
      if ((float)l < (float)paramString.length() * 1.5F)
      {
        i = -2;
        GMTrace.o(5132083265536L, 38237);
      }
      else
      {
        paramString = new Runnable()
        {
          final String[] kdI;
          
          /* Error */
          public final void run()
          {
            // Byte code:
            //   0: ldc2_w 67
            //   3: ldc 69
            //   5: invokestatic 43	com/tencent/gmtrace/GMTrace:i	(JI)V
            //   8: aload_0
            //   9: getfield 25	com/tencent/mm/plugin/dbbackup/d$3:kdF	Lcom/tencent/mm/plugin/dbbackup/d;
            //   12: aconst_null
            //   13: putfield 73	com/tencent/mm/plugin/dbbackup/d:kde	Lcom/tencent/wcdb/repair/RepairKit;
            //   16: invokestatic 79	com/tencent/mm/y/c:yM	()Lcom/tencent/mm/plugin/messenger/foundation/a/a/c;
            //   19: pop
            //   20: invokestatic 83	com/tencent/mm/y/c:yP	()Lcom/tencent/mm/storage/as;
            //   23: pop
            //   24: invokestatic 89	com/tencent/mm/ao/n:IZ	()Lcom/tencent/mm/ao/f;
            //   27: pop
            //   28: invokestatic 95	com/tencent/mm/modelvideo/o:Nh	()Lcom/tencent/mm/modelvideo/s;
            //   31: pop
            //   32: new 97	java/lang/StringBuilder
            //   35: dup
            //   36: invokespecial 98	java/lang/StringBuilder:<init>	()V
            //   39: invokestatic 104	com/tencent/mm/compatible/d/p:sZ	()Ljava/lang/String;
            //   42: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //   45: invokestatic 112	com/tencent/mm/y/c:ww	()I
            //   48: invokevirtual 115	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
            //   51: invokevirtual 118	java/lang/StringBuilder:toString	()Ljava/lang/String;
            //   54: invokevirtual 122	java/lang/String:getBytes	()[B
            //   57: astore 7
            //   59: aload 7
            //   61: invokestatic 127	com/tencent/mm/a/g:o	([B)[B
            //   64: astore 13
            //   66: aload 7
            //   68: invokestatic 131	com/tencent/mm/a/g:n	([B)Ljava/lang/String;
            //   71: iconst_0
            //   72: bipush 7
            //   74: invokevirtual 135	java/lang/String:substring	(II)Ljava/lang/String;
            //   77: invokevirtual 122	java/lang/String:getBytes	()[B
            //   80: astore 12
            //   82: ldc -120
            //   84: istore_1
            //   85: invokestatic 142	com/tencent/mm/bu/e:bVi	()Z
            //   88: ifeq +6 -> 94
            //   91: ldc -113
            //   93: istore_1
            //   94: invokestatic 147	com/tencent/mm/y/c:yH	()Lcom/tencent/mm/bu/g;
            //   97: invokevirtual 153	com/tencent/mm/bu/g:bVk	()Lcom/tencent/wcdb/database/SQLiteDatabase;
            //   100: invokevirtual 158	com/tencent/wcdb/database/SQLiteDatabase:getPath	()Ljava/lang/String;
            //   103: aload 12
            //   105: getstatic 162	com/tencent/mm/plugin/dbbackup/d:kds	Lcom/tencent/wcdb/database/SQLiteCipherSpec;
            //   108: aconst_null
            //   109: iload_1
            //   110: aconst_null
            //   111: iconst_0
            //   112: invokestatic 166	com/tencent/wcdb/database/SQLiteDatabase:openDatabase	(Ljava/lang/String;[BLcom/tencent/wcdb/database/SQLiteCipherSpec;Lcom/tencent/wcdb/database/SQLiteDatabase$CursorFactory;ILcom/tencent/wcdb/DatabaseErrorHandler;I)Lcom/tencent/wcdb/database/SQLiteDatabase;
            //   115: astore 11
            //   117: invokestatic 172	java/lang/System:nanoTime	()J
            //   120: lstore_3
            //   121: new 97	java/lang/StringBuilder
            //   124: dup
            //   125: invokespecial 98	java/lang/StringBuilder:<init>	()V
            //   128: aload_0
            //   129: getfield 29	com/tencent/mm/plugin/dbbackup/d$3:kdJ	Ljava/lang/String;
            //   132: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //   135: ldc -82
            //   137: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //   140: invokevirtual 118	java/lang/StringBuilder:toString	()Ljava/lang/String;
            //   143: astore 14
            //   145: new 97	java/lang/StringBuilder
            //   148: dup
            //   149: invokespecial 98	java/lang/StringBuilder:<init>	()V
            //   152: astore 7
            //   154: invokestatic 180	com/tencent/mm/kernel/h:xz	()Lcom/tencent/mm/kernel/h;
            //   157: pop
            //   158: aload 7
            //   160: invokestatic 184	com/tencent/mm/kernel/h:xy	()Lcom/tencent/mm/kernel/e;
            //   163: getfield 189	com/tencent/mm/kernel/e:fYU	Ljava/lang/String;
            //   166: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //   169: ldc -65
            //   171: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //   174: invokevirtual 118	java/lang/StringBuilder:toString	()Ljava/lang/String;
            //   177: astore 15
            //   179: iconst_0
            //   180: istore_1
            //   181: aconst_null
            //   182: astore 7
            //   184: aload 7
            //   186: astore 10
            //   188: iload_1
            //   189: iconst_2
            //   190: if_icmpge +68 -> 258
            //   193: iconst_2
            //   194: anewarray 45	java/lang/String
            //   197: dup
            //   198: iconst_0
            //   199: aload 14
            //   201: aastore
            //   202: dup
            //   203: iconst_1
            //   204: aload 15
            //   206: aastore
            //   207: iload_1
            //   208: aaload
            //   209: astore 9
            //   211: aload 7
            //   213: astore 8
            //   215: aload 9
            //   217: aload 13
            //   219: aload_0
            //   220: getfield 59	com/tencent/mm/plugin/dbbackup/d$3:kdI	[Ljava/lang/String;
            //   223: invokestatic 197	com/tencent/wcdb/repair/RepairKit$MasterInfo:load	(Ljava/lang/String;[B[Ljava/lang/String;)Lcom/tencent/wcdb/repair/RepairKit$MasterInfo;
            //   226: astore 10
            //   228: aload 10
            //   230: astore 8
            //   232: aload 10
            //   234: astore 7
            //   236: ldc -57
            //   238: new 97	java/lang/StringBuilder
            //   241: dup
            //   242: ldc -55
            //   244: invokespecial 204	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
            //   247: aload 9
            //   249: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //   252: invokevirtual 118	java/lang/StringBuilder:toString	()Ljava/lang/String;
            //   255: invokestatic 209	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
            //   258: aload 10
            //   260: ifnonnull +398 -> 658
            //   263: aload 10
            //   265: astore 9
            //   267: aload 10
            //   269: astore 7
            //   271: aload_0
            //   272: getfield 59	com/tencent/mm/plugin/dbbackup/d$3:kdI	[Ljava/lang/String;
            //   275: invokestatic 213	com/tencent/wcdb/repair/RepairKit$MasterInfo:make	([Ljava/lang/String;)Lcom/tencent/wcdb/repair/RepairKit$MasterInfo;
            //   278: astore 8
            //   280: aload 8
            //   282: astore 9
            //   284: aload 8
            //   286: astore 7
            //   288: ldc -57
            //   290: ldc -41
            //   292: invokestatic 218	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
            //   295: aload 8
            //   297: astore 9
            //   299: aload 8
            //   301: astore 7
            //   303: getstatic 224	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
            //   306: ldc2_w 225
            //   309: ldc2_w 227
            //   312: lconst_1
            //   313: iconst_1
            //   314: invokevirtual 232	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
            //   317: aload 8
            //   319: astore 9
            //   321: aload 8
            //   323: astore 7
            //   325: aload_0
            //   326: getfield 25	com/tencent/mm/plugin/dbbackup/d$3:kdF	Lcom/tencent/mm/plugin/dbbackup/d;
            //   329: new 234	com/tencent/wcdb/repair/RepairKit
            //   332: dup
            //   333: aload_0
            //   334: getfield 29	com/tencent/mm/plugin/dbbackup/d$3:kdJ	Ljava/lang/String;
            //   337: aload 12
            //   339: getstatic 162	com/tencent/mm/plugin/dbbackup/d:kds	Lcom/tencent/wcdb/database/SQLiteCipherSpec;
            //   342: aload 8
            //   344: invokespecial 237	com/tencent/wcdb/repair/RepairKit:<init>	(Ljava/lang/String;[BLcom/tencent/wcdb/database/SQLiteCipherSpec;Lcom/tencent/wcdb/repair/RepairKit$MasterInfo;)V
            //   347: putfield 73	com/tencent/mm/plugin/dbbackup/d:kde	Lcom/tencent/wcdb/repair/RepairKit;
            //   350: aload 8
            //   352: astore 9
            //   354: aload 8
            //   356: astore 7
            //   358: aload_0
            //   359: getfield 25	com/tencent/mm/plugin/dbbackup/d$3:kdF	Lcom/tencent/mm/plugin/dbbackup/d;
            //   362: getfield 73	com/tencent/mm/plugin/dbbackup/d:kde	Lcom/tencent/wcdb/repair/RepairKit;
            //   365: aload 11
            //   367: iconst_1
            //   368: invokevirtual 241	com/tencent/wcdb/repair/RepairKit:output	(Lcom/tencent/wcdb/database/SQLiteDatabase;I)I
            //   371: ifne +502 -> 873
            //   374: iconst_1
            //   375: istore_1
            //   376: aload 8
            //   378: astore 9
            //   380: aload 8
            //   382: astore 7
            //   384: aload_0
            //   385: getfield 25	com/tencent/mm/plugin/dbbackup/d$3:kdF	Lcom/tencent/mm/plugin/dbbackup/d;
            //   388: getfield 73	com/tencent/mm/plugin/dbbackup/d:kde	Lcom/tencent/wcdb/repair/RepairKit;
            //   391: invokevirtual 244	com/tencent/wcdb/repair/RepairKit:isHeaderCorrupted	()Z
            //   394: ifeq +709 -> 1103
            //   397: aload 8
            //   399: astore 9
            //   401: aload 8
            //   403: astore 7
            //   405: aload_0
            //   406: getfield 25	com/tencent/mm/plugin/dbbackup/d$3:kdF	Lcom/tencent/mm/plugin/dbbackup/d;
            //   409: getfield 73	com/tencent/mm/plugin/dbbackup/d:kde	Lcom/tencent/wcdb/repair/RepairKit;
            //   412: invokevirtual 247	com/tencent/wcdb/repair/RepairKit:isDataCorrupted	()Z
            //   415: ifne +463 -> 878
            //   418: goto +685 -> 1103
            //   421: iload_1
            //   422: iload_2
            //   423: iand
            //   424: istore_1
            //   425: aload 8
            //   427: astore 9
            //   429: aload 8
            //   431: astore 7
            //   433: aload 11
            //   435: invokevirtual 250	com/tencent/wcdb/database/SQLiteDatabase:close	()V
            //   438: aconst_null
            //   439: astore 9
            //   441: aload 8
            //   443: invokevirtual 253	com/tencent/wcdb/repair/RepairKit$MasterInfo:release	()V
            //   446: aconst_null
            //   447: astore 10
            //   449: aconst_null
            //   450: astore 8
            //   452: aload_0
            //   453: getfield 25	com/tencent/mm/plugin/dbbackup/d$3:kdF	Lcom/tencent/mm/plugin/dbbackup/d;
            //   456: getfield 73	com/tencent/mm/plugin/dbbackup/d:kde	Lcom/tencent/wcdb/repair/RepairKit;
            //   459: invokevirtual 254	com/tencent/wcdb/repair/RepairKit:release	()V
            //   462: aload_0
            //   463: getfield 25	com/tencent/mm/plugin/dbbackup/d$3:kdF	Lcom/tencent/mm/plugin/dbbackup/d;
            //   466: aconst_null
            //   467: putfield 73	com/tencent/mm/plugin/dbbackup/d:kde	Lcom/tencent/wcdb/repair/RepairKit;
            //   470: invokestatic 257	com/tencent/mm/plugin/dbbackup/d:apt	()V
            //   473: invokestatic 172	java/lang/System:nanoTime	()J
            //   476: lstore 5
            //   478: iload_1
            //   479: ifeq +404 -> 883
            //   482: ldc_w 259
            //   485: astore 7
            //   487: ldc -57
            //   489: ldc_w 261
            //   492: iconst_2
            //   493: anewarray 4	java/lang/Object
            //   496: dup
            //   497: iconst_0
            //   498: aload 7
            //   500: aastore
            //   501: dup
            //   502: iconst_1
            //   503: lload 5
            //   505: lload_3
            //   506: lsub
            //   507: l2f
            //   508: ldc_w 262
            //   511: fdiv
            //   512: invokestatic 268	java/lang/Float:valueOf	(F)Ljava/lang/Float;
            //   515: aastore
            //   516: invokestatic 271	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
            //   519: iload_1
            //   520: ifeq +371 -> 891
            //   523: bipush 26
            //   525: istore_2
            //   526: iload_2
            //   527: istore_1
            //   528: aload_0
            //   529: getfield 31	com/tencent/mm/plugin/dbbackup/d$3:kdt	Lcom/tencent/mm/plugin/dbbackup/b;
            //   532: ifnull +15 -> 547
            //   535: aload_0
            //   536: getfield 31	com/tencent/mm/plugin/dbbackup/d$3:kdt	Lcom/tencent/mm/plugin/dbbackup/b;
            //   539: iconst_0
            //   540: invokeinterface 277 2 0
            //   545: iload_2
            //   546: istore_1
            //   547: getstatic 224	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
            //   550: ldc2_w 225
            //   553: iload_1
            //   554: i2l
            //   555: lconst_1
            //   556: iconst_1
            //   557: invokevirtual 232	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
            //   560: aload_0
            //   561: getfield 25	com/tencent/mm/plugin/dbbackup/d$3:kdF	Lcom/tencent/mm/plugin/dbbackup/d;
            //   564: getfield 73	com/tencent/mm/plugin/dbbackup/d:kde	Lcom/tencent/wcdb/repair/RepairKit;
            //   567: ifnull +21 -> 588
            //   570: aload_0
            //   571: getfield 25	com/tencent/mm/plugin/dbbackup/d$3:kdF	Lcom/tencent/mm/plugin/dbbackup/d;
            //   574: getfield 73	com/tencent/mm/plugin/dbbackup/d:kde	Lcom/tencent/wcdb/repair/RepairKit;
            //   577: invokevirtual 254	com/tencent/wcdb/repair/RepairKit:release	()V
            //   580: aload_0
            //   581: getfield 25	com/tencent/mm/plugin/dbbackup/d$3:kdF	Lcom/tencent/mm/plugin/dbbackup/d;
            //   584: aconst_null
            //   585: putfield 73	com/tencent/mm/plugin/dbbackup/d:kde	Lcom/tencent/wcdb/repair/RepairKit;
            //   588: aload_0
            //   589: getfield 25	com/tencent/mm/plugin/dbbackup/d$3:kdF	Lcom/tencent/mm/plugin/dbbackup/d;
            //   592: iconst_0
            //   593: putfield 281	com/tencent/mm/plugin/dbbackup/d:kdf	Z
            //   596: invokestatic 287	com/tencent/mm/y/at:xB	()Lcom/tencent/mm/sdk/platformtools/af;
            //   599: invokevirtual 292	com/tencent/mm/sdk/platformtools/af:bQh	()V
            //   602: ldc2_w 67
            //   605: ldc 69
            //   607: invokestatic 62	com/tencent/gmtrace/GMTrace:o	(JI)V
            //   610: return
            //   611: astore 10
            //   613: aload 8
            //   615: astore 9
            //   617: aload 8
            //   619: astore 7
            //   621: ldc -57
            //   623: new 97	java/lang/StringBuilder
            //   626: dup
            //   627: ldc_w 294
            //   630: invokespecial 204	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
            //   633: aload 10
            //   635: invokevirtual 297	java/lang/Exception:getMessage	()Ljava/lang/String;
            //   638: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //   641: invokevirtual 118	java/lang/StringBuilder:toString	()Ljava/lang/String;
            //   644: invokestatic 300	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
            //   647: iload_1
            //   648: iconst_1
            //   649: iadd
            //   650: istore_1
            //   651: aload 8
            //   653: astore 7
            //   655: goto -471 -> 184
            //   658: aload 10
            //   660: astore 8
            //   662: iload_1
            //   663: ifle -346 -> 317
            //   666: aload 10
            //   668: astore 9
            //   670: aload 10
            //   672: astore 7
            //   674: ldc -57
            //   676: ldc_w 302
            //   679: invokestatic 209	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
            //   682: aload 10
            //   684: astore 9
            //   686: aload 10
            //   688: astore 7
            //   690: getstatic 224	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
            //   693: ldc2_w 225
            //   696: ldc2_w 303
            //   699: lconst_1
            //   700: iconst_1
            //   701: invokevirtual 232	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
            //   704: aload 10
            //   706: astore 8
            //   708: goto -391 -> 317
            //   711: astore 7
            //   713: aload 9
            //   715: astore 8
            //   717: aload 11
            //   719: astore 9
            //   721: ldc -57
            //   723: aload 7
            //   725: ldc_w 306
            //   728: iconst_1
            //   729: anewarray 4	java/lang/Object
            //   732: dup
            //   733: iconst_0
            //   734: aload_0
            //   735: getfield 29	com/tencent/mm/plugin/dbbackup/d$3:kdJ	Ljava/lang/String;
            //   738: aastore
            //   739: invokestatic 310	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
            //   742: aload_0
            //   743: getfield 31	com/tencent/mm/plugin/dbbackup/d$3:kdt	Lcom/tencent/mm/plugin/dbbackup/b;
            //   746: ifnull +13 -> 759
            //   749: aload_0
            //   750: getfield 31	com/tencent/mm/plugin/dbbackup/d$3:kdt	Lcom/tencent/mm/plugin/dbbackup/b;
            //   753: iconst_m1
            //   754: invokeinterface 277 2 0
            //   759: getstatic 224	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
            //   762: ldc_w 312
            //   765: new 97	java/lang/StringBuilder
            //   768: dup
            //   769: ldc_w 314
            //   772: invokespecial 204	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
            //   775: invokestatic 317	com/tencent/wcdb/repair/RepairKit:lastError	()Ljava/lang/String;
            //   778: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //   781: invokevirtual 118	java/lang/StringBuilder:toString	()Ljava/lang/String;
            //   784: aconst_null
            //   785: invokevirtual 321	com/tencent/mm/plugin/report/service/g:d	(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
            //   788: getstatic 224	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
            //   791: ldc2_w 225
            //   794: ldc2_w 322
            //   797: lconst_1
            //   798: iconst_1
            //   799: invokevirtual 232	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
            //   802: aload_0
            //   803: getfield 25	com/tencent/mm/plugin/dbbackup/d$3:kdF	Lcom/tencent/mm/plugin/dbbackup/d;
            //   806: getfield 73	com/tencent/mm/plugin/dbbackup/d:kde	Lcom/tencent/wcdb/repair/RepairKit;
            //   809: ifnull +21 -> 830
            //   812: aload_0
            //   813: getfield 25	com/tencent/mm/plugin/dbbackup/d$3:kdF	Lcom/tencent/mm/plugin/dbbackup/d;
            //   816: getfield 73	com/tencent/mm/plugin/dbbackup/d:kde	Lcom/tencent/wcdb/repair/RepairKit;
            //   819: invokevirtual 254	com/tencent/wcdb/repair/RepairKit:release	()V
            //   822: aload_0
            //   823: getfield 25	com/tencent/mm/plugin/dbbackup/d$3:kdF	Lcom/tencent/mm/plugin/dbbackup/d;
            //   826: aconst_null
            //   827: putfield 73	com/tencent/mm/plugin/dbbackup/d:kde	Lcom/tencent/wcdb/repair/RepairKit;
            //   830: aload 9
            //   832: ifnull +8 -> 840
            //   835: aload 9
            //   837: invokevirtual 250	com/tencent/wcdb/database/SQLiteDatabase:close	()V
            //   840: aload 8
            //   842: ifnull +8 -> 850
            //   845: aload 8
            //   847: invokevirtual 253	com/tencent/wcdb/repair/RepairKit$MasterInfo:release	()V
            //   850: aload_0
            //   851: getfield 25	com/tencent/mm/plugin/dbbackup/d$3:kdF	Lcom/tencent/mm/plugin/dbbackup/d;
            //   854: iconst_0
            //   855: putfield 281	com/tencent/mm/plugin/dbbackup/d:kdf	Z
            //   858: invokestatic 287	com/tencent/mm/y/at:xB	()Lcom/tencent/mm/sdk/platformtools/af;
            //   861: invokevirtual 292	com/tencent/mm/sdk/platformtools/af:bQh	()V
            //   864: ldc2_w 67
            //   867: ldc 69
            //   869: invokestatic 62	com/tencent/gmtrace/GMTrace:o	(JI)V
            //   872: return
            //   873: iconst_0
            //   874: istore_1
            //   875: goto -499 -> 376
            //   878: iconst_0
            //   879: istore_2
            //   880: goto -459 -> 421
            //   883: ldc_w 325
            //   886: astore 7
            //   888: goto -401 -> 487
            //   891: bipush 27
            //   893: istore_1
            //   894: aload_0
            //   895: getfield 31	com/tencent/mm/plugin/dbbackup/d$3:kdt	Lcom/tencent/mm/plugin/dbbackup/b;
            //   898: ifnull +13 -> 911
            //   901: aload_0
            //   902: getfield 31	com/tencent/mm/plugin/dbbackup/d$3:kdt	Lcom/tencent/mm/plugin/dbbackup/b;
            //   905: iconst_m1
            //   906: invokeinterface 277 2 0
            //   911: getstatic 224	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
            //   914: ldc_w 312
            //   917: new 97	java/lang/StringBuilder
            //   920: dup
            //   921: ldc_w 314
            //   924: invokespecial 204	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
            //   927: invokestatic 317	com/tencent/wcdb/repair/RepairKit:lastError	()Ljava/lang/String;
            //   930: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //   933: invokevirtual 118	java/lang/StringBuilder:toString	()Ljava/lang/String;
            //   936: aconst_null
            //   937: invokevirtual 321	com/tencent/mm/plugin/report/service/g:d	(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
            //   940: goto -393 -> 547
            //   943: astore 7
            //   945: goto -224 -> 721
            //   948: astore 7
            //   950: aconst_null
            //   951: astore 9
            //   953: aconst_null
            //   954: astore 8
            //   956: aload_0
            //   957: getfield 25	com/tencent/mm/plugin/dbbackup/d$3:kdF	Lcom/tencent/mm/plugin/dbbackup/d;
            //   960: getfield 73	com/tencent/mm/plugin/dbbackup/d:kde	Lcom/tencent/wcdb/repair/RepairKit;
            //   963: ifnull +21 -> 984
            //   966: aload_0
            //   967: getfield 25	com/tencent/mm/plugin/dbbackup/d$3:kdF	Lcom/tencent/mm/plugin/dbbackup/d;
            //   970: getfield 73	com/tencent/mm/plugin/dbbackup/d:kde	Lcom/tencent/wcdb/repair/RepairKit;
            //   973: invokevirtual 254	com/tencent/wcdb/repair/RepairKit:release	()V
            //   976: aload_0
            //   977: getfield 25	com/tencent/mm/plugin/dbbackup/d$3:kdF	Lcom/tencent/mm/plugin/dbbackup/d;
            //   980: aconst_null
            //   981: putfield 73	com/tencent/mm/plugin/dbbackup/d:kde	Lcom/tencent/wcdb/repair/RepairKit;
            //   984: aload 9
            //   986: ifnull +8 -> 994
            //   989: aload 9
            //   991: invokevirtual 250	com/tencent/wcdb/database/SQLiteDatabase:close	()V
            //   994: aload 8
            //   996: ifnull +8 -> 1004
            //   999: aload 8
            //   1001: invokevirtual 253	com/tencent/wcdb/repair/RepairKit$MasterInfo:release	()V
            //   1004: aload_0
            //   1005: getfield 25	com/tencent/mm/plugin/dbbackup/d$3:kdF	Lcom/tencent/mm/plugin/dbbackup/d;
            //   1008: iconst_0
            //   1009: putfield 281	com/tencent/mm/plugin/dbbackup/d:kdf	Z
            //   1012: invokestatic 287	com/tencent/mm/y/at:xB	()Lcom/tencent/mm/sdk/platformtools/af;
            //   1015: invokevirtual 292	com/tencent/mm/sdk/platformtools/af:bQh	()V
            //   1018: aload 7
            //   1020: athrow
            //   1021: astore 7
            //   1023: aconst_null
            //   1024: astore 8
            //   1026: aload 11
            //   1028: astore 9
            //   1030: goto -74 -> 956
            //   1033: astore 9
            //   1035: aload 7
            //   1037: astore 8
            //   1039: aload 9
            //   1041: astore 7
            //   1043: aload 11
            //   1045: astore 9
            //   1047: goto -91 -> 956
            //   1050: astore 7
            //   1052: aconst_null
            //   1053: astore 9
            //   1055: goto -99 -> 956
            //   1058: astore 7
            //   1060: aconst_null
            //   1061: astore 9
            //   1063: aload 10
            //   1065: astore 8
            //   1067: goto -111 -> 956
            //   1070: astore 7
            //   1072: goto -116 -> 956
            //   1075: astore 7
            //   1077: aconst_null
            //   1078: astore 9
            //   1080: aconst_null
            //   1081: astore 8
            //   1083: goto -362 -> 721
            //   1086: astore 7
            //   1088: aload 11
            //   1090: astore 9
            //   1092: aconst_null
            //   1093: astore 8
            //   1095: goto -374 -> 721
            //   1098: astore 7
            //   1100: goto -379 -> 721
            //   1103: iconst_1
            //   1104: istore_2
            //   1105: goto -684 -> 421
            // Local variable table:
            //   start	length	slot	name	signature
            //   0	1108	0	this	3
            //   84	810	1	i	int
            //   422	683	2	j	int
            //   120	386	3	l1	long
            //   476	28	5	l2	long
            //   57	632	7	localObject1	Object
            //   711	13	7	localException1	Exception
            //   886	1	7	str1	String
            //   943	1	7	localException2	Exception
            //   948	71	7	localObject2	Object
            //   1021	15	7	localObject3	Object
            //   1041	1	7	localObject4	Object
            //   1050	1	7	localObject5	Object
            //   1058	1	7	localObject6	Object
            //   1070	1	7	localObject7	Object
            //   1075	1	7	localException3	Exception
            //   1086	1	7	localException4	Exception
            //   1098	1	7	localException5	Exception
            //   213	881	8	localObject8	Object
            //   209	820	9	localObject9	Object
            //   1033	7	9	localObject10	Object
            //   1045	46	9	localSQLiteDatabase1	SQLiteDatabase
            //   186	262	10	localObject11	Object
            //   611	453	10	localException6	Exception
            //   115	974	11	localSQLiteDatabase2	SQLiteDatabase
            //   80	258	12	arrayOfByte1	byte[]
            //   64	154	13	arrayOfByte2	byte[]
            //   143	57	14	str2	String
            //   177	28	15	str3	String
            // Exception table:
            //   from	to	target	type
            //   215	228	611	java/lang/Exception
            //   236	258	611	java/lang/Exception
            //   271	280	711	java/lang/Exception
            //   288	295	711	java/lang/Exception
            //   303	317	711	java/lang/Exception
            //   325	350	711	java/lang/Exception
            //   358	374	711	java/lang/Exception
            //   384	397	711	java/lang/Exception
            //   405	418	711	java/lang/Exception
            //   433	438	711	java/lang/Exception
            //   621	647	711	java/lang/Exception
            //   674	682	711	java/lang/Exception
            //   690	704	711	java/lang/Exception
            //   452	478	943	java/lang/Exception
            //   487	519	943	java/lang/Exception
            //   528	545	943	java/lang/Exception
            //   547	560	943	java/lang/Exception
            //   894	911	943	java/lang/Exception
            //   911	940	943	java/lang/Exception
            //   16	82	948	finally
            //   85	91	948	finally
            //   94	117	948	finally
            //   117	179	1021	finally
            //   215	228	1033	finally
            //   236	258	1033	finally
            //   271	280	1033	finally
            //   288	295	1033	finally
            //   303	317	1033	finally
            //   325	350	1033	finally
            //   358	374	1033	finally
            //   384	397	1033	finally
            //   405	418	1033	finally
            //   433	438	1033	finally
            //   621	647	1033	finally
            //   674	682	1033	finally
            //   690	704	1033	finally
            //   441	446	1050	finally
            //   452	478	1058	finally
            //   487	519	1058	finally
            //   528	545	1058	finally
            //   547	560	1058	finally
            //   894	911	1058	finally
            //   911	940	1058	finally
            //   721	759	1070	finally
            //   759	802	1070	finally
            //   16	82	1075	java/lang/Exception
            //   85	91	1075	java/lang/Exception
            //   94	117	1075	java/lang/Exception
            //   117	179	1086	java/lang/Exception
            //   441	446	1098	java/lang/Exception
          }
        };
        this.kdf = true;
        at.xB().bQf();
        at.xB().E(paramString);
        GMTrace.o(5132083265536L, 38237);
      }
    }
  }
  
  public final void b(final b paramb)
  {
    GMTrace.i(5132351700992L, 38239);
    final File localFile = new File(ab.getContext().getFilesDir(), "DBRecoverStarted");
    final WakerLock localWakerLock = new WakerLock(ab.getContext());
    paramb = new b()
    {
      int kdN;
      
      public final void mr(int paramAnonymousInt)
      {
        GMTrace.i(5130338435072L, 38224);
        int i = paramAnonymousInt;
        if (this.kdN > 0) {
          w.i("MicroMsg.SubCoreDBBackup", "Recovery stage %d result: %d", new Object[] { Integer.valueOf(this.kdN), Integer.valueOf(i) });
        }
        if (i == 0)
        {
          localFile.delete();
          com.tencent.mm.plugin.report.service.g.ork.a(181L, 29L, 1L, true);
          if (paramb != null) {
            paramb.mr(i);
          }
          localWakerLock.unLock();
          GMTrace.o(5130338435072L, 38224);
          return;
        }
        if (i == -2)
        {
          localFile.delete();
          com.tencent.mm.plugin.report.service.g.ork.a(181L, 3L, 1L, true);
          if (paramb != null) {
            paramb.mr(i);
          }
          localWakerLock.unLock();
          GMTrace.o(5130338435072L, 38224);
          return;
        }
        paramAnonymousInt = this.kdN + 1;
        this.kdN = paramAnonymousInt;
        switch (paramAnonymousInt)
        {
        default: 
          localFile.delete();
          com.tencent.mm.plugin.report.service.g.ork.a(181L, 30L, 1L, true);
          if (paramb != null) {
            paramb.mr(i);
          }
          localWakerLock.unLock();
          GMTrace.o(5130338435072L, 38224);
          return;
        case 1: 
          w.i("MicroMsg.SubCoreDBBackup", "Database recovery stage %d: REPAIR", new Object[] { Integer.valueOf(this.kdN) });
          paramAnonymousInt = d.this.b(null, this);
        }
        for (;;)
        {
          i = paramAnonymousInt;
          if (paramAnonymousInt != 0) {
            break;
          }
          GMTrace.o(5130338435072L, 38224);
          return;
          w.i("MicroMsg.SubCoreDBBackup", "Database recovery stage %d: BACKUP RECOVER", new Object[] { Integer.valueOf(this.kdN) });
          paramAnonymousInt = d.this.a(null, this);
          continue;
          w.i("MicroMsg.SubCoreDBBackup", "Database recovery stage %d: DUMP", new Object[] { Integer.valueOf(this.kdN) });
          paramAnonymousInt = d.this.a(this);
        }
      }
    };
    w.i("MicroMsg.SubCoreDBBackup", "Database recover started.");
    localWakerLock.lock();
    com.tencent.mm.plugin.report.service.g.ork.a(181L, 28L, 1L, true);
    try
    {
      localFile.createNewFile();
      paramb.mr(-1);
      GMTrace.o(5132351700992L, 38239);
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(5132620136448L, 38241);
    GMTrace.o(5132620136448L, 38241);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(5133022789632L, 38244);
    apr();
    this.kdg = false;
    if (this.gNI != null)
    {
      at.xB().bQi().removeCallbacks(this.gNI);
      this.gNI = null;
    }
    if (this.kdr != null)
    {
      a.vgX.c(this.kdr);
      this.kdr = null;
    }
    if (this.gNE != null)
    {
      ab.getContext().unregisterReceiver(this.gNE);
      this.gNE = null;
    }
    com.tencent.mm.pluginsdk.b.b.C(new String[] { "//recover", "//post-recover", "//backupdb", "//recoverdb", "//repairdb", "//corruptdb", "//iotracedb" });
    if ((this.kdp != null) && (this.kdo != null) && (this.kdo.length() > 0))
    {
      this.kdp.unlock();
      this.kdp = null;
      new File(this.kdo).delete();
      this.kdo = null;
      w.i("MicroMsg.DuplicateDetect", "Instance exited.");
    }
    GMTrace.o(5133022789632L, 38244);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(5132485918720L, 38240);
    GMTrace.o(5132485918720L, 38240);
    return null;
  }
  
  private static final class a
    extends RuntimeException
  {
    a(String paramString)
    {
      super();
      GMTrace.i(15963453915136L, 118937);
      GMTrace.o(15963453915136L, 118937);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\dbbackup\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */