package com.tencent.mm.plugin.fts.b;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.b;
import com.tencent.mm.plugin.fts.a.k;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.wcdb.database.SQLiteDatabaseCorruptException;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public final class f
  extends b
{
  public k fTu;
  private com.tencent.mm.plugin.fts.c lvr;
  public com.tencent.mm.sdk.b.c lyT;
  public String[] lyU;
  public List<String> lyV;
  
  public f()
  {
    GMTrace.i(18545668784128L, 138176);
    this.lyT = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(18545668784128L, 138176);
  }
  
  public final com.tencent.mm.plugin.fts.a.a.a a(com.tencent.mm.plugin.fts.a.a.f paramf)
  {
    GMTrace.i(18546071437312L, 138179);
    switch (paramf.lwS)
    {
    default: 
      paramf = new d(paramf);
    }
    for (;;)
    {
      paramf = this.fTu.a(-65536, paramf);
      GMTrace.o(18546071437312L, 138179);
      return paramf;
      paramf = new c(paramf.lwV);
      continue;
      paramf = new a();
    }
  }
  
  public final String getName()
  {
    GMTrace.i(18545803001856L, 138177);
    GMTrace.o(18545803001856L, 138177);
    return "SearchTestLogic";
  }
  
  protected final boolean onCreate()
  {
    GMTrace.i(18545937219584L, 138178);
    if (!((l)h.j(l.class)).isFTSContextReady())
    {
      w.i("MicroMsg.FTS.FTSSearchTestLogic", "Create Fail!");
      GMTrace.o(18545937219584L, 138178);
      return false;
    }
    w.i("MicroMsg.FTS.FTSSearchTestLogic", "Create Success!");
    this.fTu = ((l)h.j(l.class)).getFTSTaskDaemon();
    this.lvr = ((com.tencent.mm.plugin.fts.c)((l)h.j(l.class)).getFTSIndexDB());
    this.lyT.bPu();
    GMTrace.o(18545937219584L, 138178);
    return true;
  }
  
  protected final boolean vt()
  {
    GMTrace.i(18546205655040L, 138180);
    GMTrace.o(18546205655040L, 138180);
    return false;
  }
  
  private final class a
    extends com.tencent.mm.plugin.fts.a.a.a
  {
    public a()
    {
      GMTrace.i(18543118647296L, 138157);
      GMTrace.o(18543118647296L, 138157);
    }
    
    public final boolean execute()
    {
      GMTrace.i(18543252865024L, 138158);
      throw new SQLiteDatabaseCorruptException("For Test");
    }
  }
  
  private final class b
    extends com.tencent.mm.plugin.fts.a.a.a
  {
    public b()
    {
      GMTrace.i(18544997695488L, 138171);
      GMTrace.o(18544997695488L, 138171);
    }
    
    private static LinkedList<String> aCs()
    {
      GMTrace.i(18545266130944L, 138173);
      LinkedList localLinkedList = new LinkedList();
      Cursor localCursor = ((l)h.j(l.class)).getFTSIndexDB().rawQuery("SELECT name FROM sqlite_master WHERE type='table' AND name LIKE ?;", new String[] { "FTS5Index%" });
      if (localCursor.moveToFirst()) {
        do
        {
          String str = localCursor.getString(0);
          if (!str.contains("_")) {
            localLinkedList.add(str);
          }
        } while (localCursor.moveToNext());
      }
      localCursor.close();
      GMTrace.o(18545266130944L, 138173);
      return localLinkedList;
    }
    
    private static LinkedList<String> aCt()
    {
      GMTrace.i(18545400348672L, 138174);
      LinkedList localLinkedList = new LinkedList();
      Cursor localCursor = ((l)h.j(l.class)).getFTSIndexDB().rawQuery("SELECT name FROM sqlite_master WHERE type='table' AND name LIKE ?;", new String[] { "FTS5Meta%" });
      if (localCursor.moveToFirst()) {
        do
        {
          localLinkedList.add(localCursor.getString(0));
        } while (localCursor.moveToNext());
      }
      localCursor.close();
      GMTrace.o(18545400348672L, 138174);
      return localLinkedList;
    }
    
    public final boolean execute()
    {
      GMTrace.i(18545131913216L, 138172);
      StringBuffer localStringBuffer = new StringBuffer();
      long l1 = new File(h.xy().cachePath, "FTS5IndexMicroMsg.db").length();
      localStringBuffer.append("[DBSize] ");
      localStringBuffer.append(bg.eL(l1));
      localStringBuffer.append("\n");
      localStringBuffer.append("[TableInfo]");
      localStringBuffer.append("\n");
      Object localObject3 = aCs();
      Object localObject4 = aCt();
      Object localObject5 = new ArrayList();
      ((List)localObject5).addAll((Collection)localObject3);
      ((List)localObject5).addAll((Collection)localObject4);
      localObject4 = ((List)localObject5).iterator();
      if (((Iterator)localObject4).hasNext()) {
        localObject5 = (String)((Iterator)localObject4).next();
      }
      try
      {
        localObject3 = ((l)h.j(l.class)).getFTSIndexDB().rawQuery("SELECT count(*) FROM " + (String)localObject5 + ";", null);
      }
      finally
      {
        try
        {
          if (((Cursor)localObject3).moveToNext())
          {
            localStringBuffer.append((String)localObject5);
            localStringBuffer.append("=");
            localStringBuffer.append(((Cursor)localObject3).getLong(0));
            localStringBuffer.append("\n");
          }
          ((Cursor)localObject3).close();
        }
        finally
        {
          long l2;
          String str;
          for (;;) {}
        }
        localObject1 = finally;
        localObject3 = null;
        if (localObject3 != null) {
          ((Cursor)localObject3).close();
        }
        throw ((Throwable)localObject1);
        localObject3 = (com.tencent.mm.plugin.fts.c.a)((l)h.j(l.class)).getFTSIndexStorage(3);
        l1 = ((com.tencent.mm.plugin.fts.c.a)localObject3).i(new int[] { 131075 });
        l2 = ((com.tencent.mm.plugin.fts.c.a)localObject3).i(new int[] { 131072 });
        ((StringBuffer)localObject1).append("[Contact.Chatroom]=" + l1);
        ((StringBuffer)localObject1).append("\n");
        ((StringBuffer)localObject1).append("[Contact.WXContact]=" + l2);
        ((StringBuffer)localObject1).append("\n");
        str = ((StringBuffer)localObject1).toString();
        w.i("MicroMsg.FTS.FTSSearchTestLogic", str);
        localObject3 = new File(com.tencent.mm.plugin.fts.a.c.lwp, "FTS5IndexMicroMsgInfo.txt");
        if (((File)localObject3).exists()) {
          ((File)localObject3).delete();
        }
        FileOp.j(((File)localObject3).getAbsolutePath(), str.getBytes());
        GMTrace.o(18545131913216L, 138172);
        return true;
      }
    }
    
    public final String getName()
    {
      GMTrace.i(18545534566400L, 138175);
      GMTrace.o(18545534566400L, 138175);
      return "FTS5DBInfoTask";
    }
  }
  
  private final class c
    extends com.tencent.mm.plugin.fts.a.a.a
  {
    private int count;
    
    public c(int paramInt)
    {
      GMTrace.i(18525536124928L, 138026);
      this.count = paramInt;
      GMTrace.o(18525536124928L, 138026);
    }
    
    private static String v(String[] paramArrayOfString)
    {
      GMTrace.i(18525804560384L, 138028);
      Random localRandom = new Random();
      StringBuffer localStringBuffer = new StringBuffer();
      int i = 0;
      while (i < 300)
      {
        localStringBuffer.append(paramArrayOfString[localRandom.nextInt(paramArrayOfString.length - 1)]);
        i += 1;
      }
      paramArrayOfString = localStringBuffer.toString();
      GMTrace.o(18525804560384L, 138028);
      return paramArrayOfString;
    }
    
    /* Error */
    public final boolean execute()
    {
      // Byte code:
      //   0: ldc2_w 59
      //   3: ldc 61
      //   5: invokestatic 27	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   8: aload_0
      //   9: getfield 15	com/tencent/mm/plugin/fts/b/f$c:lyW	Lcom/tencent/mm/plugin/fts/b/f;
      //   12: getfield 65	com/tencent/mm/plugin/fts/b/f:lyU	[Ljava/lang/String;
      //   15: ifnonnull +42 -> 57
      //   18: new 67	java/io/FileInputStream
      //   21: dup
      //   22: ldc 69
      //   24: invokespecial 72	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
      //   27: astore_3
      //   28: new 74	java/lang/String
      //   31: dup
      //   32: aload_3
      //   33: invokestatic 79	com/tencent/mm/loader/stub/b:c	(Ljava/io/InputStream;)[B
      //   36: invokespecial 82	java/lang/String:<init>	([B)V
      //   39: astore_2
      //   40: aload_0
      //   41: getfield 15	com/tencent/mm/plugin/fts/b/f$c:lyW	Lcom/tencent/mm/plugin/fts/b/f;
      //   44: aload_2
      //   45: ldc 84
      //   47: invokevirtual 88	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
      //   50: putfield 65	com/tencent/mm/plugin/fts/b/f:lyU	[Ljava/lang/String;
      //   53: aload_3
      //   54: invokestatic 94	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
      //   57: aload_0
      //   58: getfield 15	com/tencent/mm/plugin/fts/b/f$c:lyW	Lcom/tencent/mm/plugin/fts/b/f;
      //   61: getfield 98	com/tencent/mm/plugin/fts/b/f:lyV	Ljava/util/List;
      //   64: ifnonnull +83 -> 147
      //   67: aload_0
      //   68: getfield 15	com/tencent/mm/plugin/fts/b/f$c:lyW	Lcom/tencent/mm/plugin/fts/b/f;
      //   71: new 100	java/util/ArrayList
      //   74: dup
      //   75: invokespecial 101	java/util/ArrayList:<init>	()V
      //   78: putfield 98	com/tencent/mm/plugin/fts/b/f:lyV	Ljava/util/List;
      //   81: ldc 103
      //   83: invokestatic 109	com/tencent/mm/kernel/h:h	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
      //   86: checkcast 103	com/tencent/mm/plugin/messenger/foundation/a/h
      //   89: invokeinterface 113 1 0
      //   94: invokeinterface 119 1 0
      //   99: astore_2
      //   100: aload_2
      //   101: invokeinterface 124 1 0
      //   106: ifeq +35 -> 141
      //   109: aload_0
      //   110: getfield 15	com/tencent/mm/plugin/fts/b/f$c:lyW	Lcom/tencent/mm/plugin/fts/b/f;
      //   113: getfield 98	com/tencent/mm/plugin/fts/b/f:lyV	Ljava/util/List;
      //   116: aload_2
      //   117: iconst_0
      //   118: invokeinterface 128 2 0
      //   123: invokeinterface 134 2 0
      //   128: pop
      //   129: goto -29 -> 100
      //   132: astore_2
      //   133: aconst_null
      //   134: astore_3
      //   135: aload_3
      //   136: invokestatic 94	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
      //   139: aload_2
      //   140: athrow
      //   141: aload_2
      //   142: invokeinterface 137 1 0
      //   147: aload_0
      //   148: getfield 15	com/tencent/mm/plugin/fts/b/f$c:lyW	Lcom/tencent/mm/plugin/fts/b/f;
      //   151: getfield 65	com/tencent/mm/plugin/fts/b/f:lyU	[Ljava/lang/String;
      //   154: ifnull +180 -> 334
      //   157: iconst_0
      //   158: istore_1
      //   159: iload_1
      //   160: aload_0
      //   161: getfield 29	com/tencent/mm/plugin/fts/b/f$c:count	I
      //   164: if_icmpge +170 -> 334
      //   167: aload_0
      //   168: getfield 15	com/tencent/mm/plugin/fts/b/f$c:lyW	Lcom/tencent/mm/plugin/fts/b/f;
      //   171: getfield 65	com/tencent/mm/plugin/fts/b/f:lyU	[Ljava/lang/String;
      //   174: invokestatic 139	com/tencent/mm/plugin/fts/b/f$c:v	([Ljava/lang/String;)Ljava/lang/String;
      //   177: astore_2
      //   178: new 141	com/tencent/mm/storage/au
      //   181: dup
      //   182: invokespecial 142	com/tencent/mm/storage/au:<init>	()V
      //   185: astore_3
      //   186: aload_3
      //   187: iconst_1
      //   188: invokevirtual 146	com/tencent/mm/storage/au:setType	(I)V
      //   191: aload_3
      //   192: iconst_1
      //   193: invokevirtual 149	com/tencent/mm/storage/au:dC	(I)V
      //   196: aload_3
      //   197: iconst_4
      //   198: invokevirtual 152	com/tencent/mm/storage/au:dB	(I)V
      //   201: aload_3
      //   202: aload_2
      //   203: invokevirtual 155	com/tencent/mm/storage/au:setContent	(Ljava/lang/String;)V
      //   206: aload_0
      //   207: getfield 15	com/tencent/mm/plugin/fts/b/f$c:lyW	Lcom/tencent/mm/plugin/fts/b/f;
      //   210: getfield 98	com/tencent/mm/plugin/fts/b/f:lyV	Ljava/util/List;
      //   213: astore 4
      //   215: aload_3
      //   216: aload 4
      //   218: new 40	java/util/Random
      //   221: dup
      //   222: invokespecial 41	java/util/Random:<init>	()V
      //   225: aload 4
      //   227: invokeinterface 159 1 0
      //   232: iconst_1
      //   233: isub
      //   234: invokevirtual 48	java/util/Random:nextInt	(I)I
      //   237: invokeinterface 163 2 0
      //   242: checkcast 74	java/lang/String
      //   245: invokevirtual 166	com/tencent/mm/storage/au:db	(Ljava/lang/String;)V
      //   248: aload_3
      //   249: invokestatic 172	java/lang/System:currentTimeMillis	()J
      //   252: ldc2_w 173
      //   255: lsub
      //   256: invokevirtual 178	com/tencent/mm/storage/au:E	(J)V
      //   259: ldc 103
      //   261: invokestatic 109	com/tencent/mm/kernel/h:h	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
      //   264: checkcast 103	com/tencent/mm/plugin/messenger/foundation/a/h
      //   267: invokeinterface 182 1 0
      //   272: aload_3
      //   273: invokeinterface 188 2 0
      //   278: pop2
      //   279: ldc -66
      //   281: ldc -64
      //   283: iconst_4
      //   284: anewarray 194	java/lang/Object
      //   287: dup
      //   288: iconst_0
      //   289: aload_0
      //   290: getfield 29	com/tencent/mm/plugin/fts/b/f$c:count	I
      //   293: invokestatic 200	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   296: aastore
      //   297: dup
      //   298: iconst_1
      //   299: iload_1
      //   300: invokestatic 200	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   303: aastore
      //   304: dup
      //   305: iconst_2
      //   306: aload_2
      //   307: invokevirtual 203	java/lang/String:length	()I
      //   310: invokestatic 200	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   313: aastore
      //   314: dup
      //   315: iconst_3
      //   316: aload_3
      //   317: getfield 209	com/tencent/mm/g/b/ce:field_msgId	J
      //   320: invokestatic 214	java/lang/Long:valueOf	(J)Ljava/lang/Long;
      //   323: aastore
      //   324: invokestatic 219	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   327: iload_1
      //   328: iconst_1
      //   329: iadd
      //   330: istore_1
      //   331: goto -172 -> 159
      //   334: ldc2_w 59
      //   337: ldc 61
      //   339: invokestatic 32	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   342: iconst_1
      //   343: ireturn
      //   344: astore_2
      //   345: goto -210 -> 135
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	348	0	this	c
      //   158	173	1	i	int
      //   39	78	2	localObject1	Object
      //   132	10	2	localObject2	Object
      //   177	130	2	str	String
      //   344	1	2	localObject3	Object
      //   27	290	3	localObject4	Object
      //   213	13	4	localList	List
      // Exception table:
      //   from	to	target	type
      //   18	28	132	finally
      //   28	53	344	finally
    }
  }
  
  private final class d
    extends com.tencent.mm.plugin.fts.a.a.e
  {
    public d(com.tencent.mm.plugin.fts.a.a.f paramf)
    {
      super();
      GMTrace.i(18525938778112L, 138029);
      GMTrace.o(18525938778112L, 138029);
    }
    
    protected final List<i> a(String[] paramArrayOfString, com.tencent.mm.plugin.fts.a.a.f paramf)
    {
      GMTrace.i(18526072995840L, 138030);
      if ("tophitscore".equals(paramArrayOfString[0]))
      {
        paramArrayOfString = (com.tencent.mm.plugin.fts.c.e)((l)h.j(l.class)).getFTSIndexStorage(1);
        paramf = String.format("Select docid, aux_index, query, score, scene from %s", new Object[] { paramArrayOfString.aCf() });
        paramArrayOfString = paramArrayOfString.lvN.rawQuery(paramf, null);
        while (paramArrayOfString.moveToNext())
        {
          paramf = paramArrayOfString.getString(1);
          w.d("MicroMsg.FTS.FTS5TopHitsStorage", "rowid=%d aux_index=%s, query=%s, score=%d, scene=%d displayName=%s", new Object[] { Long.valueOf(paramArrayOfString.getLong(0)), paramf, paramArrayOfString.getString(2), Long.valueOf(paramArrayOfString.getLong(3)), Long.valueOf(paramArrayOfString.getLong(4)), paramf });
        }
        paramArrayOfString.close();
      }
      for (;;)
      {
        paramArrayOfString = new ArrayList();
        GMTrace.o(18526072995840L, 138030);
        return paramArrayOfString;
        bg.nm(paramf.eQb);
      }
    }
    
    public final String getName()
    {
      GMTrace.i(18526207213568L, 138031);
      GMTrace.o(18526207213568L, 138031);
      return "SearchTestTask";
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fts\b\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */