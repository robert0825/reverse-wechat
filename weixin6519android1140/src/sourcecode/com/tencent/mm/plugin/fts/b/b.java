package com.tencent.mm.plugin.fts.b;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.aw.n;
import com.tencent.mm.aw.t;
import com.tencent.mm.g.a.bd;
import com.tencent.mm.g.a.rr;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.fts.PluginFTS;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.d;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class b
  extends com.tencent.mm.plugin.fts.a.b
{
  public com.tencent.mm.plugin.fts.a.k fTu;
  private com.tencent.mm.sdk.b.c lxH;
  public com.tencent.mm.plugin.fts.c.b lym;
  private com.tencent.mm.sdk.b.c<bd> lyn;
  
  public b()
  {
    GMTrace.i(18531307487232L, 138069);
    this.lxH = new com.tencent.mm.sdk.b.c() {};
    this.lyn = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(18531307487232L, 138069);
  }
  
  public static File aCn()
  {
    GMTrace.i(19598472642560L, 146020);
    File localFile = new File(new File(com.tencent.mm.compatible.util.e.ghw, "fts"), "feature");
    if (!localFile.exists()) {
      localFile.mkdirs();
    }
    GMTrace.o(19598472642560L, 146020);
    return localFile;
  }
  
  public static File aCo()
  {
    GMTrace.i(19598606860288L, 146021);
    File localFile = new File(aCn(), "fts_template");
    if (!localFile.exists()) {
      localFile.mkdirs();
    }
    GMTrace.o(19598606860288L, 146021);
    return localFile;
  }
  
  public static int y(File paramFile)
  {
    GMTrace.i(19598741078016L, 146022);
    paramFile = new File(paramFile, "version.info");
    int i = -1;
    for (;;)
    {
      try
      {
        if (!paramFile.exists()) {
          continue;
        }
        int j = Integer.parseInt(FileOp.be(paramFile.getAbsolutePath()), 10);
        i = j;
      }
      catch (Exception paramFile)
      {
        w.printErrStackTrace("MicroMsg.FTS.FTS5SearchFeatureLogic", paramFile, "getFeatureVersion", new Object[0]);
        continue;
      }
      GMTrace.o(19598741078016L, 146022);
      return i;
      w.i("MicroMsg.FTS.FTS5SearchFeatureLogic", "version file %s not exist", new Object[] { paramFile.getAbsolutePath() });
    }
  }
  
  public static List<com.tencent.mm.plugin.fts.a.a.c> yV(String paramString)
  {
    GMTrace.i(18532381229056L, 138077);
    Object localObject1 = v.eq(ab.getContext());
    if (((String)localObject1).equalsIgnoreCase("zh_CN")) {
      localObject1 = "zh_CN".toLowerCase();
    }
    long l;
    ArrayList localArrayList;
    for (;;)
    {
      localObject1 = String.format("%s/feature_%s.conf", new Object[] { paramString, localObject1 });
      w.i("MicroMsg.FTS.FTS5SearchFeatureLogic", "decodeToFeatureList %s", new Object[] { localObject1 });
      l = new File((String)localObject1).lastModified();
      i = com.tencent.mm.a.e.aY((String)localObject1);
      localArrayList = new ArrayList();
      if (i != 0) {
        break;
      }
      throw new com.tencent.mm.plugin.fts.a.a.k("data file no exist error");
      if ((((String)localObject1).equalsIgnoreCase("zh_TW")) || (((String)localObject1).equalsIgnoreCase("zh_HK"))) {
        localObject1 = "zh_TW".toLowerCase();
      } else {
        localObject1 = "en".toLowerCase();
      }
    }
    String[] arrayOfString = new String(com.tencent.mm.a.e.d((String)localObject1, 0, i)).split("\n");
    int j = arrayOfString.length;
    localObject1 = null;
    int i = 0;
    if (i < j)
    {
      Object localObject2 = arrayOfString[i];
      Object localObject3 = localObject1;
      String str1;
      String str2;
      if (localObject2 != null)
      {
        localObject2 = ((String)localObject2).trim();
        localObject3 = localObject1;
        if (((String)localObject2).length() != 0)
        {
          int k = ((String)localObject2).indexOf("=");
          localObject3 = localObject1;
          if (k >= 0)
          {
            str1 = ((String)localObject2).substring(0, k);
            str2 = ((String)localObject2).substring(k + 1);
            localObject2 = localObject1;
            if (str1.equals("FeatureID"))
            {
              if (localObject1 != null)
              {
                ((com.tencent.mm.plugin.fts.a.a.c)localObject1).field_iconPath = (paramString + "/icon/" + ((com.tencent.mm.plugin.fts.a.a.c)localObject1).field_featureId + ".png");
                localArrayList.add(localObject1);
              }
              localObject2 = new com.tencent.mm.plugin.fts.a.a.c();
              ((com.tencent.mm.plugin.fts.a.a.c)localObject2).field_featureId = Integer.valueOf(str2).intValue();
              ((com.tencent.mm.plugin.fts.a.a.c)localObject2).field_timestamp = l;
            }
            localObject3 = localObject2;
            if (localObject2 != null)
            {
              if (!str1.equals("Title")) {
                break label393;
              }
              ((com.tencent.mm.plugin.fts.a.a.c)localObject2).field_title = str2;
              localObject3 = localObject2;
            }
          }
        }
      }
      for (;;)
      {
        i += 1;
        localObject1 = localObject3;
        break;
        label393:
        if (str1.equals("TitlePY"))
        {
          ((com.tencent.mm.plugin.fts.a.a.c)localObject2).field_titlePY = str2;
          localObject3 = localObject2;
        }
        else if (str1.equals("TitleShortPY"))
        {
          ((com.tencent.mm.plugin.fts.a.a.c)localObject2).field_titleShortPY = str2;
          localObject3 = localObject2;
        }
        else if (str1.equals("Tag"))
        {
          ((com.tencent.mm.plugin.fts.a.a.c)localObject2).field_tag = str2;
          localObject3 = localObject2;
        }
        else if (str1.equals("ActionType"))
        {
          if (str2.equals("H5"))
          {
            ((com.tencent.mm.plugin.fts.a.a.c)localObject2).field_actionType = 2;
            localObject3 = localObject2;
          }
          else
          {
            localObject3 = localObject2;
            if (str2.equals("Native"))
            {
              ((com.tencent.mm.plugin.fts.a.a.c)localObject2).field_actionType = 1;
              localObject3 = localObject2;
            }
          }
        }
        else if (str1.equals("Url"))
        {
          ((com.tencent.mm.plugin.fts.a.a.c)localObject2).field_url = str2;
          localObject3 = localObject2;
        }
        else if (str1.equals("HelpUrl"))
        {
          ((com.tencent.mm.plugin.fts.a.a.c)localObject2).field_helpUrl = str2;
          localObject3 = localObject2;
        }
        else if (str1.equals("UpdateUrl"))
        {
          ((com.tencent.mm.plugin.fts.a.a.c)localObject2).field_updateUrl = str2;
          localObject3 = localObject2;
        }
        else
        {
          localObject3 = localObject2;
          if (str1.equals("AndroidUrl"))
          {
            ((com.tencent.mm.plugin.fts.a.a.c)localObject2).field_androidUrl = str2;
            localObject3 = localObject2;
          }
        }
      }
    }
    if (localObject1 != null)
    {
      ((com.tencent.mm.plugin.fts.a.a.c)localObject1).field_iconPath = (paramString + "/icon/" + ((com.tencent.mm.plugin.fts.a.a.c)localObject1).field_featureId + ".png");
      ((com.tencent.mm.plugin.fts.a.a.c)localObject1).field_timestamp = l;
      localArrayList.add(localObject1);
    }
    if (localArrayList.size() == 0) {
      throw new com.tencent.mm.plugin.fts.a.a.k("no data error");
    }
    GMTrace.o(18532381229056L, 138077);
    return localArrayList;
  }
  
  public final com.tencent.mm.plugin.fts.a.a.a a(com.tencent.mm.plugin.fts.a.a.f paramf)
  {
    GMTrace.i(18531441704960L, 138070);
    paramf = new c(paramf);
    paramf = this.fTu.a(-65536, paramf);
    GMTrace.o(18531441704960L, 138070);
    return paramf;
  }
  
  public final String getName()
  {
    GMTrace.i(18531844358144L, 138073);
    GMTrace.o(18531844358144L, 138073);
    return "FTS5SearchFeatureLogic";
  }
  
  protected final boolean onCreate()
  {
    GMTrace.i(18531575922688L, 138071);
    if (!((l)h.j(l.class)).isFTSContextReady())
    {
      w.i("MicroMsg.FTS.FTS5SearchFeatureLogic", "Create Fail!");
      GMTrace.o(18531575922688L, 138071);
      return false;
    }
    w.i("MicroMsg.FTS.FTS5SearchFeatureLogic", "Create Success!");
    this.fTu = ((l)h.j(l.class)).getFTSTaskDaemon();
    this.lym = ((com.tencent.mm.plugin.fts.c.b)((l)h.j(l.class)).getFTSIndexStorage(17));
    this.lxH.bPu();
    this.lyn.bPu();
    this.fTu.a(131132, new b());
    this.fTu.a(131133, new a());
    GMTrace.o(18531575922688L, 138071);
    return true;
  }
  
  protected final boolean vt()
  {
    GMTrace.i(18531710140416L, 138072);
    this.lxH.dead();
    this.lyn.dead();
    this.lym = null;
    this.fTu = null;
    GMTrace.o(18531710140416L, 138072);
    return true;
  }
  
  private final class a
    extends com.tencent.mm.plugin.fts.a.a.a
  {
    public a()
    {
      GMTrace.i(18523925512192L, 138014);
      GMTrace.o(18523925512192L, 138014);
    }
    
    public final boolean execute()
    {
      GMTrace.i(18524059729920L, 138015);
      w.i("MicroMsg.FTS.FTS5SearchFeatureLogic", "start to build feature index task");
      Object localObject1 = b.this.lym;
      Object localObject2 = new ArrayList();
      Object localObject3 = String.format("SELECT * FROM Feature", new Object[0]);
      localObject1 = ((com.tencent.mm.plugin.fts.a.a)localObject1).lvN.rawQuery((String)localObject3, null);
      while (((Cursor)localObject1).moveToNext())
      {
        localObject3 = new com.tencent.mm.plugin.fts.a.a.c();
        ((com.tencent.mm.plugin.fts.a.a.c)localObject3).b((Cursor)localObject1);
        ((List)localObject2).add(localObject3);
      }
      ((Cursor)localObject1).close();
      localObject1 = localObject2;
      if (((List)localObject2).size() == 0) {
        localObject1 = localObject2;
      }
      try
      {
        localObject2 = b.yV(t.Kj().aU(0, 18));
        localObject1 = localObject2;
        b.this.lym.aJ((List)localObject2);
        localObject1 = localObject2;
      }
      catch (Exception localException)
      {
        Object localObject4;
        Object localObject5;
        for (;;) {}
      }
      localObject3 = b.this.lym.aCu();
      localObject2 = new HashMap();
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject4 = (com.tencent.mm.plugin.fts.a.a.c)((Iterator)localObject1).next();
        ((HashMap)localObject2).put(Integer.valueOf(((com.tencent.mm.plugin.fts.a.a.c)localObject4).field_featureId), localObject4);
      }
      if (b.this.lym.lvN.inTransaction()) {
        b.this.lym.commit();
      }
      b.this.lym.beginTransaction();
      localObject1 = new HashSet();
      localObject4 = new HashSet();
      localObject3 = ((List)localObject3).iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject5 = (com.tencent.mm.plugin.fts.c.b.a)((Iterator)localObject3).next();
        com.tencent.mm.plugin.fts.a.a.c localc = (com.tencent.mm.plugin.fts.a.a.c)((HashMap)localObject2).remove(Integer.valueOf(((com.tencent.mm.plugin.fts.c.b.a)localObject5).lzg));
        if (localc != null)
        {
          if (((com.tencent.mm.plugin.fts.c.b.a)localObject5).timestamp != localc.field_timestamp)
          {
            ((HashSet)localObject4).add(localc);
            b.this.lym.b(com.tencent.mm.plugin.fts.a.c.lvY, Long.valueOf(localc.field_featureId).longValue());
            ((PluginFTS)h.j(PluginFTS.class)).getTopHitsLogic().c(com.tencent.mm.plugin.fts.a.c.lvY, String.valueOf(localc.field_featureId));
          }
        }
        else {
          ((HashSet)localObject1).add(Integer.valueOf(((com.tencent.mm.plugin.fts.c.b.a)localObject5).lzg));
        }
      }
      ((HashSet)localObject4).addAll(((HashMap)localObject2).values());
      b.this.lym.commit();
      b.this.lym.beginTransaction();
      w.i("MicroMsg.FTS.FTS5SearchFeatureLogic", "remove %d add %d", new Object[] { Integer.valueOf(((HashSet)localObject1).size()), Integer.valueOf(((HashSet)localObject4).size()) });
      localObject2 = ((HashSet)localObject4).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (com.tencent.mm.plugin.fts.a.a.c)((Iterator)localObject2).next();
        localObject4 = b.this;
        ((b)localObject4).lym.a(262144, 1, ((com.tencent.mm.plugin.fts.a.a.c)localObject3).field_featureId, String.valueOf(((com.tencent.mm.plugin.fts.a.a.c)localObject3).field_featureId), ((com.tencent.mm.plugin.fts.a.a.c)localObject3).field_timestamp, ((com.tencent.mm.plugin.fts.a.a.c)localObject3).field_title);
        localObject5 = d.ad(((com.tencent.mm.plugin.fts.a.a.c)localObject3).field_title, false);
        if (!bg.nm((String)localObject5)) {
          ((b)localObject4).lym.a(262144, 2, ((com.tencent.mm.plugin.fts.a.a.c)localObject3).field_featureId, String.valueOf(((com.tencent.mm.plugin.fts.a.a.c)localObject3).field_featureId), ((com.tencent.mm.plugin.fts.a.a.c)localObject3).field_timestamp, (String)localObject5);
        }
        localObject5 = d.ad(((com.tencent.mm.plugin.fts.a.a.c)localObject3).field_title, true);
        if (!bg.nm((String)localObject5)) {
          ((b)localObject4).lym.a(262144, 3, ((com.tencent.mm.plugin.fts.a.a.c)localObject3).field_featureId, String.valueOf(((com.tencent.mm.plugin.fts.a.a.c)localObject3).field_featureId), ((com.tencent.mm.plugin.fts.a.a.c)localObject3).field_timestamp, (String)localObject5);
        }
        ((b)localObject4).lym.a(262144, 4, ((com.tencent.mm.plugin.fts.a.a.c)localObject3).field_featureId, String.valueOf(((com.tencent.mm.plugin.fts.a.a.c)localObject3).field_featureId), ((com.tencent.mm.plugin.fts.a.a.c)localObject3).field_timestamp, ((com.tencent.mm.plugin.fts.a.a.c)localObject3).field_tag);
        ((PluginFTS)h.j(PluginFTS.class)).getTopHitsLogic().yX(String.valueOf(((com.tencent.mm.plugin.fts.a.a.c)localObject3).field_featureId));
      }
      localObject1 = ((HashSet)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Integer)((Iterator)localObject1).next();
        b.this.lym.b(com.tencent.mm.plugin.fts.a.c.lvY, Long.valueOf(((Integer)localObject2).intValue()).longValue());
      }
      b.this.lym.commit();
      GMTrace.o(18524059729920L, 138015);
      return true;
    }
    
    public final int getId()
    {
      GMTrace.i(18524328165376L, 138017);
      GMTrace.o(18524328165376L, 138017);
      return 5;
    }
    
    public final String getName()
    {
      GMTrace.i(18524193947648L, 138016);
      GMTrace.o(18524193947648L, 138016);
      return "BuildFeatureIndexTask";
    }
  }
  
  private final class b
    extends com.tencent.mm.plugin.fts.a.a.a
  {
    public b()
    {
      GMTrace.i(19598069989376L, 146017);
      GMTrace.o(19598069989376L, 146017);
    }
    
    /* Error */
    public final boolean execute()
    {
      // Byte code:
      //   0: aconst_null
      //   1: astore 5
      //   3: aconst_null
      //   4: astore 4
      //   6: ldc2_w 34
      //   9: ldc 36
      //   11: invokestatic 25	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   14: invokestatic 40	com/tencent/mm/plugin/fts/b/b:aCo	()Ljava/io/File;
      //   17: invokestatic 44	com/tencent/mm/plugin/fts/b/b:y	(Ljava/io/File;)I
      //   20: istore_1
      //   21: ldc 46
      //   23: ldc 48
      //   25: iconst_1
      //   26: anewarray 50	java/lang/Object
      //   29: dup
      //   30: iconst_0
      //   31: iload_1
      //   32: invokestatic 56	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   35: aastore
      //   36: invokestatic 61	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   39: iload_1
      //   40: ifge +172 -> 212
      //   43: new 63	java/io/File
      //   46: dup
      //   47: invokestatic 69	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
      //   50: invokevirtual 74	android/content/Context:getCacheDir	()Ljava/io/File;
      //   53: ldc 76
      //   55: invokespecial 79	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
      //   58: astore 6
      //   60: invokestatic 69	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
      //   63: invokevirtual 83	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
      //   66: astore_2
      //   67: aload_2
      //   68: ldc 76
      //   70: invokevirtual 89	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
      //   73: astore_2
      //   74: aload 6
      //   76: invokevirtual 92	java/io/File:exists	()Z
      //   79: ifeq +9 -> 88
      //   82: aload 6
      //   84: invokevirtual 95	java/io/File:delete	()Z
      //   87: pop
      //   88: new 97	java/io/FileOutputStream
      //   91: dup
      //   92: aload 6
      //   94: invokespecial 100	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
      //   97: astore_3
      //   98: sipush 1024
      //   101: newarray <illegal type>
      //   103: astore 4
      //   105: aload_2
      //   106: aload 4
      //   108: invokevirtual 106	java/io/InputStream:read	([B)I
      //   111: istore_1
      //   112: iload_1
      //   113: iconst_m1
      //   114: if_icmpeq +108 -> 222
      //   117: aload_3
      //   118: aload 4
      //   120: iconst_0
      //   121: iload_1
      //   122: invokevirtual 112	java/io/OutputStream:write	([BII)V
      //   125: goto -20 -> 105
      //   128: astore 5
      //   130: aload_3
      //   131: astore 4
      //   133: aload 5
      //   135: astore_3
      //   136: ldc 46
      //   138: aload_3
      //   139: ldc 114
      //   141: iconst_0
      //   142: anewarray 50	java/lang/Object
      //   145: invokestatic 118	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   148: aload_2
      //   149: invokestatic 123	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
      //   152: aload 4
      //   154: invokestatic 127	com/tencent/mm/a/e:a	(Ljava/io/OutputStream;)V
      //   157: aload 6
      //   159: invokevirtual 92	java/io/File:exists	()Z
      //   162: ifeq +50 -> 212
      //   165: new 129	com/tencent/mm/g/a/bd
      //   168: dup
      //   169: invokespecial 130	com/tencent/mm/g/a/bd:<init>	()V
      //   172: astore_2
      //   173: aload_2
      //   174: getfield 134	com/tencent/mm/g/a/bd:eCr	Lcom/tencent/mm/g/a/bd$a;
      //   177: bipush 35
      //   179: putfield 140	com/tencent/mm/g/a/bd$a:eCs	I
      //   182: aload_2
      //   183: getfield 134	com/tencent/mm/g/a/bd:eCr	Lcom/tencent/mm/g/a/bd$a;
      //   186: iconst_1
      //   187: putfield 143	com/tencent/mm/g/a/bd$a:eCt	I
      //   190: aload_2
      //   191: getfield 134	com/tencent/mm/g/a/bd:eCr	Lcom/tencent/mm/g/a/bd$a;
      //   194: aload 6
      //   196: invokevirtual 147	java/io/File:getAbsolutePath	()Ljava/lang/String;
      //   199: putfield 151	com/tencent/mm/g/a/bd$a:filePath	Ljava/lang/String;
      //   202: getstatic 157	com/tencent/mm/sdk/b/a:vgX	Lcom/tencent/mm/sdk/b/a;
      //   205: aload_2
      //   206: invokestatic 163	android/os/Looper:getMainLooper	()Landroid/os/Looper;
      //   209: invokevirtual 166	com/tencent/mm/sdk/b/a:a	(Lcom/tencent/mm/sdk/b/b;Landroid/os/Looper;)V
      //   212: ldc2_w 34
      //   215: ldc 36
      //   217: invokestatic 28	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   220: iconst_1
      //   221: ireturn
      //   222: aload_2
      //   223: invokestatic 123	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
      //   226: aload_3
      //   227: invokestatic 127	com/tencent/mm/a/e:a	(Ljava/io/OutputStream;)V
      //   230: goto -73 -> 157
      //   233: astore_3
      //   234: aconst_null
      //   235: astore_2
      //   236: aload 5
      //   238: astore 4
      //   240: aload_2
      //   241: invokestatic 123	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
      //   244: aload 4
      //   246: invokestatic 127	com/tencent/mm/a/e:a	(Ljava/io/OutputStream;)V
      //   249: aload_3
      //   250: athrow
      //   251: astore_3
      //   252: aload 5
      //   254: astore 4
      //   256: goto -16 -> 240
      //   259: astore 5
      //   261: aload_3
      //   262: astore 4
      //   264: aload 5
      //   266: astore_3
      //   267: goto -27 -> 240
      //   270: astore_3
      //   271: goto -31 -> 240
      //   274: astore_3
      //   275: aconst_null
      //   276: astore_2
      //   277: goto -141 -> 136
      //   280: astore_3
      //   281: goto -145 -> 136
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	284	0	this	b
      //   20	102	1	i	int
      //   66	211	2	localObject1	Object
      //   97	130	3	localObject2	Object
      //   233	17	3	localObject3	Object
      //   251	11	3	localObject4	Object
      //   266	1	3	localObject5	Object
      //   270	1	3	localObject6	Object
      //   274	1	3	localException1	Exception
      //   280	1	3	localException2	Exception
      //   4	259	4	localObject7	Object
      //   1	1	5	localObject8	Object
      //   128	125	5	localException3	Exception
      //   259	6	5	localObject9	Object
      //   58	137	6	localFile	File
      // Exception table:
      //   from	to	target	type
      //   98	105	128	java/lang/Exception
      //   105	112	128	java/lang/Exception
      //   117	125	128	java/lang/Exception
      //   67	74	233	finally
      //   74	88	251	finally
      //   88	98	251	finally
      //   98	105	259	finally
      //   105	112	259	finally
      //   117	125	259	finally
      //   136	148	270	finally
      //   67	74	274	java/lang/Exception
      //   74	88	280	java/lang/Exception
      //   88	98	280	java/lang/Exception
    }
    
    public final String getName()
    {
      GMTrace.i(19598338424832L, 146019);
      GMTrace.o(19598338424832L, 146019);
      return "CheckFeatureResourceTask";
    }
  }
  
  private final class c
    extends com.tencent.mm.plugin.fts.a.a.e
  {
    public c(com.tencent.mm.plugin.fts.a.a.f paramf)
    {
      super();
      GMTrace.i(18513859182592L, 137939);
      GMTrace.o(18513859182592L, 137939);
    }
    
    protected final List<i> a(String[] paramArrayOfString, com.tencent.mm.plugin.fts.a.a.f paramf)
    {
      GMTrace.i(18513993400320L, 137940);
      ArrayList localArrayList = new ArrayList();
      HashSet localHashSet = new HashSet();
      paramArrayOfString = b.this.lym.a(paramArrayOfString, com.tencent.mm.plugin.fts.a.c.lvY, true);
      while (paramArrayOfString.moveToNext())
      {
        j localj = new j();
        localj.e(paramArrayOfString);
        if ((!localHashSet.contains(Long.valueOf(localj.lxe))) && (!paramf.lwW.contains(localj.lwH)))
        {
          localj.aCl();
          localArrayList.add(localj);
          localHashSet.add(Long.valueOf(localj.lxe));
        }
      }
      if (paramArrayOfString != null) {
        paramArrayOfString.close();
      }
      if (Thread.interrupted()) {
        throw new InterruptedException();
      }
      if (paramf.lwX != null) {
        Collections.sort(localArrayList, paramf.lwX);
      }
      paramArrayOfString = localArrayList.iterator();
      while (paramArrayOfString.hasNext())
      {
        paramf = (i)paramArrayOfString.next();
        paramf.userData = b.this.lym.nZ((int)paramf.lxe);
      }
      GMTrace.o(18513993400320L, 137940);
      return localArrayList;
    }
    
    public final int getId()
    {
      GMTrace.i(18514261835776L, 137942);
      GMTrace.o(18514261835776L, 137942);
      return 12;
    }
    
    public final String getName()
    {
      GMTrace.i(18514127618048L, 137941);
      GMTrace.o(18514127618048L, 137941);
      return "SearchFeatureTask";
    }
  }
  
  private final class d
    extends com.tencent.mm.plugin.fts.a.a.a
  {
    private String path;
    
    public d(String paramString)
    {
      GMTrace.i(18524462383104L, 138018);
      this.path = paramString;
      GMTrace.o(18524462383104L, 138018);
    }
    
    public final boolean execute()
    {
      GMTrace.i(18524730818560L, 138020);
      Object localObject = b.yV(this.path);
      b.this.lym.beginTransaction();
      b.this.lym.aJ((List)localObject);
      b.this.lym.commit();
      b.this.lym.h(com.tencent.mm.plugin.fts.a.c.lvY);
      b.this.fTu.a(131132, new b.a(b.this));
      localObject = ((PluginFTS)h.j(PluginFTS.class)).getTopHitsLogic();
      int[] arrayOfInt = com.tencent.mm.plugin.fts.a.c.lvY;
      ((e)localObject).lyN.e(arrayOfInt, 1);
      GMTrace.o(18524730818560L, 138020);
      return true;
    }
    
    public final String getName()
    {
      GMTrace.i(18524596600832L, 138019);
      GMTrace.o(18524596600832L, 138019);
      return "UpdateFeatureIndexTask";
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fts\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */