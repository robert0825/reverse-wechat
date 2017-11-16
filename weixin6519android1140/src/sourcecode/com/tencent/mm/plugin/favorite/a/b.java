package com.tencent.mm.plugin.favorite.a;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.d;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tm;
import com.tencent.mm.protocal.c.to;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.protocal.c.ud;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class b
  extends com.tencent.mm.plugin.fts.a.b
{
  public com.tencent.mm.plugin.fts.a.k fTu;
  private com.tencent.mm.plugin.fts.a.h laK;
  public a laL;
  public com.tencent.mm.sdk.e.e laM;
  public j.a laN;
  
  public b()
  {
    GMTrace.i(16652393512960L, 124070);
    this.laN = new j.a()
    {
      public final void a(String paramAnonymousString, com.tencent.mm.sdk.e.l paramAnonymousl)
      {
        GMTrace.i(16651588206592L, 124064);
        if (paramAnonymousl == null)
        {
          GMTrace.o(16651588206592L, 124064);
          return;
        }
        int i = paramAnonymousl.iqq;
        if (paramAnonymousl.obj == null)
        {
          GMTrace.o(16651588206592L, 124064);
          return;
        }
        long l = ((Long)paramAnonymousl.obj).longValue();
        if (l < 0L)
        {
          GMTrace.o(16651588206592L, 124064);
          return;
        }
        w.i("MicroMsg.FTS.FTS5SearchFavoriteLogic", "EventData: %s", new Object[] { paramAnonymousl });
        switch (i)
        {
        }
        for (;;)
        {
          GMTrace.o(16651588206592L, 124064);
          return;
          b.this.fTu.a(65576, new b.e(b.this, l));
          GMTrace.o(16651588206592L, 124064);
          return;
          b.this.fTu.a(65576, new b.b(b.this, l));
        }
      }
    };
    GMTrace.o(16652393512960L, 124070);
  }
  
  private int a(String[] paramArrayOfString, int[] paramArrayOfInt, long paramLong1, long paramLong2, String paramString)
  {
    GMTrace.i(16652930383872L, 124074);
    int j = 0;
    String str2 = paramArrayOfString[0];
    String str1 = paramArrayOfString[1];
    paramArrayOfString = paramArrayOfString[2];
    int i = j;
    if (str2 != null)
    {
      i = j;
      if (str2.length() > 0)
      {
        if (!str2.equalsIgnoreCase(str1)) {
          break label194;
        }
        paramArrayOfString = null;
        str1 = null;
      }
    }
    label194:
    for (;;)
    {
      if ((str1 != null) && (str1.equalsIgnoreCase(paramArrayOfString))) {
        paramArrayOfString = null;
      }
      for (;;)
      {
        this.laL.a(196608, paramArrayOfInt[0], paramLong1, paramString, paramLong2, str2);
        j = 1;
        i = j;
        if (str1 != null)
        {
          i = j;
          if (str1.length() > 0)
          {
            this.laL.a(196608, paramArrayOfInt[1], paramLong1, paramString, paramLong2, str1);
            i = 2;
          }
        }
        if ((paramArrayOfString != null) && (paramArrayOfString.length() > 0))
        {
          this.laL.a(196608, paramArrayOfInt[2], paramLong1, paramString, paramLong2, paramArrayOfString);
          i += 1;
        }
        for (;;)
        {
          GMTrace.o(16652930383872L, 124074);
          return i;
        }
      }
    }
  }
  
  public final int a(c paramc)
  {
    GMTrace.i(16653064601600L, 124075);
    long l1 = paramc.gGR;
    int k = paramc.type;
    long l2 = paramc.hMN;
    String str2 = paramc.eMI;
    tt localtt = paramc.eRx;
    paramc = paramc.laU;
    int j = 0;
    tm localtm = com.tencent.mm.pluginsdk.model.c.a(k, localtt, paramc);
    if (localtm == null)
    {
      w.d("MicroMsg.FTS.FTS5SearchFavoriteLogic", "Fav info is null");
      GMTrace.o(16653064601600L, 124075);
      return 0;
    }
    Object localObject2 = localtm.ulm;
    Object localObject3 = localtm.eMI;
    Object localObject1;
    if ((localObject2 != null) && (((String)localObject2).length() != 0))
    {
      paramc = (c)localObject3;
      localObject1 = localObject2;
      if (!((String)localObject2).equals(localObject3)) {}
    }
    else
    {
      localObject1 = localtm.eMI;
      paramc = null;
    }
    String str3 = localtm.eAr;
    String[] arrayOfString = new String[3];
    int[] arrayOfInt = new int[3];
    int i = j;
    Object localObject4;
    String str1;
    Object localObject6;
    Object localObject7;
    Object localObject5;
    if (localObject1 != null)
    {
      i = j;
      if (((String)localObject1).length() > 0)
      {
        localObject4 = this.laK.yM((String)localObject1);
        i = j;
        if (localObject4 != null)
        {
          localObject2 = ((af)localObject4).field_nickname;
          localObject1 = ((x)localObject4).qS();
          localObject3 = ((x)localObject4).qR();
          str1 = ((af)localObject4).field_conRemark;
          localObject6 = ((af)localObject4).field_conRemarkPYFull;
          localObject7 = ((af)localObject4).field_conRemarkPYShort;
          if ((str1 != null) && (str1.length() != 0)) {
            break label1283;
          }
          localObject5 = null;
          localObject4 = null;
          localObject6 = null;
          localObject7 = localObject3;
          localObject3 = localObject2;
        }
      }
    }
    for (;;)
    {
      arrayOfString[0] = localObject3;
      arrayOfString[1] = localObject1;
      arrayOfString[2] = localObject7;
      arrayOfInt[0] = 9;
      arrayOfInt[1] = 10;
      arrayOfInt[2] = 11;
      i = a(arrayOfString, arrayOfInt, l1, l2, str2);
      arrayOfString[0] = localObject6;
      arrayOfString[1] = localObject5;
      arrayOfString[2] = localObject4;
      arrayOfInt[0] = 12;
      arrayOfInt[1] = 13;
      arrayOfInt[2] = 14;
      i = i + 0 + a(arrayOfString, arrayOfInt, l1, l2, str2);
      j = i;
      if (paramc != null)
      {
        j = i;
        if (paramc.length() > 0)
        {
          paramc = this.laK.yM(paramc);
          j = i;
          if (paramc != null)
          {
            localObject2 = paramc.field_conRemark;
            if ((localObject2 != null) && (((String)localObject2).length() != 0)) {
              break label677;
            }
            localObject2 = paramc.field_nickname;
            localObject1 = paramc.qS();
            paramc = paramc.qR();
            arrayOfString[0] = localObject2;
            arrayOfString[1] = localObject1;
            arrayOfString[2] = paramc;
            arrayOfInt[0] = 16;
            arrayOfInt[1] = 17;
            arrayOfInt[2] = 18;
            j = i + a(arrayOfString, arrayOfInt, l1, l2, str2);
          }
        }
      }
      if ((str3 != null) && (str3.length() > 0))
      {
        paramc = this.laK.yM(str3);
        if (paramc != null)
        {
          localObject2 = paramc.field_conRemark;
          if ((localObject2 == null) || (((String)localObject2).length() == 0))
          {
            localObject2 = paramc.field_nickname;
            localObject1 = paramc.qS();
            paramc = paramc.qR();
            label548:
            arrayOfString[0] = localObject2;
            arrayOfString[1] = localObject1;
            arrayOfString[2] = paramc;
            arrayOfInt[0] = 20;
            arrayOfInt[1] = 21;
            arrayOfInt[2] = 22;
          }
        }
      }
      for (i = a(arrayOfString, arrayOfInt, l1, l2, str2) + j;; i = j)
      {
        localObject1 = localtm.uln;
        paramc = new StringBuilder(256);
        localObject1 = ((List)localObject1).iterator();
        for (;;)
        {
          if (((Iterator)localObject1).hasNext())
          {
            localObject2 = (String)((Iterator)localObject1).next();
            if ((localObject2 != null) && (((String)localObject2).length() > 0))
            {
              paramc.append((String)localObject2).append("​");
              continue;
              label677:
              localObject1 = paramc.field_conRemarkPYFull;
              paramc = paramc.field_conRemarkPYShort;
              break;
              localObject1 = paramc.field_conRemarkPYFull;
              paramc = paramc.field_conRemarkPYShort;
              break label548;
            }
          }
        }
        j = i;
        if (paramc.length() > 0)
        {
          this.laL.a(196608, 7, l1, str2, l2, paramc.toString());
          j = i + 1;
        }
        switch (k)
        {
        default: 
          paramc = localtm.title;
          k = j;
          if (!bg.nm(paramc))
          {
            this.laL.a(196608, 1, l1, str2, l2, paramc);
            k = j + 1;
          }
          paramc = localtm.desc;
          i = k;
          if (!bg.nm(paramc))
          {
            this.laL.a(196608, 2, l1, str2, l2, paramc);
            i = k + 1;
          }
          GMTrace.o(16653064601600L, 124075);
          return i;
        case 6: 
          paramc = localtt.hLO;
          if (!bg.nm(paramc)) {
            this.laL.a(196608, 4, l1, str2, l2, paramc);
          }
          break;
        }
        for (i = j + 1;; i = j)
        {
          paramc = localtt.ukH.eQm;
          j = i;
          if (!bg.nm(paramc))
          {
            this.laL.a(196608, 5, l1, str2, l2, paramc);
            j = i + 1;
          }
          paramc = localtt.ukH.label;
          if (!bg.nm(paramc))
          {
            this.laL.a(196608, 6, l1, str2, l2, paramc);
            i = j + 1;
            break;
            paramc = localtm.title;
            k = j;
            if (!bg.nm(paramc))
            {
              this.laL.a(196608, 1, l1, str2, l2, paramc);
              k = j + 1;
            }
            paramc = localtm.desc;
            i = k;
            if (bg.nm(paramc)) {
              break;
            }
            this.laL.a(196608, 3, l1, str2, l2, paramc);
            i = k + 1;
            break;
            paramc = localtm.title;
            i = j;
            if (bg.nm(paramc)) {
              break;
            }
            this.laL.a(196608, 1, l1, str2, l2, paramc);
            i = j + 1;
            break;
            i = j;
            if (localtt.ulB == null) {
              break;
            }
            localObject1 = new StringBuffer();
            localObject2 = localtt.ulB.iterator();
            while (((Iterator)localObject2).hasNext())
            {
              localObject3 = com.tencent.mm.pluginsdk.model.c.o((th)((Iterator)localObject2).next());
              if (!bg.nm((String)localObject3))
              {
                paramc.append((String)localObject3);
                paramc.append("​");
              }
            }
            paramc = ((StringBuffer)localObject1).toString();
            i = j;
            if (bg.nm(paramc)) {
              break;
            }
            this.laL.a(196608, 1, l1, str2, l2, paramc);
            i = j + 1;
            break;
            paramc = localtm.title;
            i = j;
            if (bg.nm(paramc)) {
              break;
            }
            this.laL.a(196608, 23, l1, str2, l2, paramc);
            i = j + 1;
            break;
          }
          i = j;
          break;
        }
      }
      label1283:
      localObject4 = localObject3;
      localObject5 = localObject1;
      localObject3 = str1;
      localObject1 = localObject6;
      localObject6 = localObject2;
    }
  }
  
  public final com.tencent.mm.plugin.fts.a.a.a a(com.tencent.mm.plugin.fts.a.a.f paramf)
  {
    GMTrace.i(18032957063168L, 134356);
    if (paramf.lwS == 1) {}
    for (paramf = new g(paramf);; paramf = new f(paramf))
    {
      paramf = this.fTu.a(-65536, paramf);
      GMTrace.o(18032957063168L, 134356);
      return paramf;
    }
  }
  
  public final String getName()
  {
    GMTrace.i(16652796166144L, 124073);
    GMTrace.o(16652796166144L, 124073);
    return "FTS5SearchFavoriteLogic";
  }
  
  protected final boolean onCreate()
  {
    GMTrace.i(16652527730688L, 124071);
    if (!((com.tencent.mm.plugin.fts.a.l)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.fts.a.l.class)).isFTSContextReady())
    {
      w.i("MicroMsg.FTS.FTS5SearchFavoriteLogic", "Create Fail!");
      GMTrace.o(16652527730688L, 124071);
      return false;
    }
    w.i("MicroMsg.FTS.FTS5SearchFavoriteLogic", "Create Success!");
    this.fTu = ((com.tencent.mm.plugin.fts.a.l)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.fts.a.l.class)).getFTSTaskDaemon();
    this.laL = ((a)((com.tencent.mm.plugin.fts.a.l)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.fts.a.l.class)).getFTSIndexStorage(256));
    this.laK = ((com.tencent.mm.plugin.fts.a.l)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.fts.a.l.class)).getFTSMainDB();
    this.fTu.a(-65536, new d());
    GMTrace.o(16652527730688L, 124071);
    return true;
  }
  
  protected final boolean vt()
  {
    GMTrace.i(16652661948416L, 124072);
    com.tencent.mm.plugin.favorite.h.axB().j(this.laN);
    this.laL = null;
    this.fTu = null;
    GMTrace.o(16652661948416L, 124072);
    return true;
  }
  
  private final class a
    extends com.tencent.mm.plugin.fts.a.a.a
  {
    private HashSet<Long> laP;
    private int laQ;
    private int laR;
    private int laS;
    private int mFailedCount;
    
    public a()
    {
      GMTrace.i(16655614738432L, 124094);
      this.laP = null;
      this.laQ = 0;
      this.laR = 0;
      this.laS = 0;
      this.mFailedCount = 0;
      GMTrace.o(16655614738432L, 124094);
    }
    
    /* Error */
    public final boolean execute()
    {
      // Byte code:
      //   0: ldc2_w 52
      //   3: ldc 54
      //   5: invokestatic 33	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   8: aload_0
      //   9: getfield 21	com/tencent/mm/plugin/favorite/a/b$a:laO	Lcom/tencent/mm/plugin/favorite/a/b;
      //   12: getfield 58	com/tencent/mm/plugin/favorite/a/b:laM	Lcom/tencent/mm/sdk/e/e;
      //   15: ifnonnull +20 -> 35
      //   18: ldc 60
      //   20: ldc 62
      //   22: invokestatic 68	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
      //   25: ldc2_w 52
      //   28: ldc 54
      //   30: invokestatic 46	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   33: iconst_1
      //   34: ireturn
      //   35: ldc 60
      //   37: ldc 70
      //   39: invokestatic 72	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
      //   42: aload_0
      //   43: getfield 35	com/tencent/mm/plugin/favorite/a/b$a:laP	Ljava/util/HashSet;
      //   46: ifnonnull +141 -> 187
      //   49: aload_0
      //   50: new 74	java/util/HashSet
      //   53: dup
      //   54: invokespecial 75	java/util/HashSet:<init>	()V
      //   57: putfield 35	com/tencent/mm/plugin/favorite/a/b$a:laP	Ljava/util/HashSet;
      //   60: aload_0
      //   61: getfield 21	com/tencent/mm/plugin/favorite/a/b$a:laO	Lcom/tencent/mm/plugin/favorite/a/b;
      //   64: getfield 79	com/tencent/mm/plugin/favorite/a/b:laL	Lcom/tencent/mm/plugin/favorite/a/a;
      //   67: getstatic 85	com/tencent/mm/plugin/fts/a/c:lvX	[I
      //   70: iconst_0
      //   71: iconst_1
      //   72: iconst_0
      //   73: iconst_0
      //   74: iconst_0
      //   75: invokevirtual 90	com/tencent/mm/plugin/favorite/a/a:a	([IZZZZZ)Landroid/database/Cursor;
      //   78: astore 6
      //   80: aload 6
      //   82: astore 5
      //   84: aload 6
      //   86: invokeinterface 95 1 0
      //   91: ifeq +73 -> 164
      //   94: aload 6
      //   96: astore 5
      //   98: aload 6
      //   100: iconst_0
      //   101: invokeinterface 99 2 0
      //   106: lstore_3
      //   107: aload 6
      //   109: astore 5
      //   111: aload_0
      //   112: getfield 35	com/tencent/mm/plugin/favorite/a/b$a:laP	Ljava/util/HashSet;
      //   115: lload_3
      //   116: invokestatic 105	java/lang/Long:valueOf	(J)Ljava/lang/Long;
      //   119: invokevirtual 109	java/util/HashSet:add	(Ljava/lang/Object;)Z
      //   122: pop
      //   123: goto -43 -> 80
      //   126: astore 7
      //   128: aload 6
      //   130: astore 5
      //   132: aload 7
      //   134: astore 6
      //   136: aload 6
      //   138: athrow
      //   139: astore 7
      //   141: aload 5
      //   143: astore 6
      //   145: aload 7
      //   147: astore 5
      //   149: aload 6
      //   151: ifnull +10 -> 161
      //   154: aload 6
      //   156: invokeinterface 112 1 0
      //   161: aload 5
      //   163: athrow
      //   164: aload 6
      //   166: ifnull +10 -> 176
      //   169: aload 6
      //   171: invokeinterface 112 1 0
      //   176: aload_0
      //   177: aload_0
      //   178: getfield 35	com/tencent/mm/plugin/favorite/a/b$a:laP	Ljava/util/HashSet;
      //   181: invokevirtual 116	java/util/HashSet:size	()I
      //   184: putfield 37	com/tencent/mm/plugin/favorite/a/b$a:laQ	I
      //   187: invokestatic 121	java/lang/Thread:interrupted	()Z
      //   190: ifeq +11 -> 201
      //   193: new 123	java/lang/InterruptedException
      //   196: dup
      //   197: invokespecial 124	java/lang/InterruptedException:<init>	()V
      //   200: athrow
      //   201: aload_0
      //   202: getfield 21	com/tencent/mm/plugin/favorite/a/b$a:laO	Lcom/tencent/mm/plugin/favorite/a/b;
      //   205: getfield 58	com/tencent/mm/plugin/favorite/a/b:laM	Lcom/tencent/mm/sdk/e/e;
      //   208: ldc 126
      //   210: aconst_null
      //   211: invokeinterface 132 3 0
      //   216: astore 5
      //   218: bipush 50
      //   220: istore_1
      //   221: aload 5
      //   223: invokeinterface 95 1 0
      //   228: ifeq +174 -> 402
      //   231: invokestatic 121	java/lang/Thread:interrupted	()Z
      //   234: ifeq +43 -> 277
      //   237: aload_0
      //   238: getfield 21	com/tencent/mm/plugin/favorite/a/b$a:laO	Lcom/tencent/mm/plugin/favorite/a/b;
      //   241: getfield 79	com/tencent/mm/plugin/favorite/a/b:laL	Lcom/tencent/mm/plugin/favorite/a/a;
      //   244: invokevirtual 135	com/tencent/mm/plugin/favorite/a/a:commit	()V
      //   247: new 123	java/lang/InterruptedException
      //   250: dup
      //   251: invokespecial 124	java/lang/InterruptedException:<init>	()V
      //   254: athrow
      //   255: astore 6
      //   257: aload 6
      //   259: athrow
      //   260: astore 6
      //   262: aload 5
      //   264: ifnull +10 -> 274
      //   267: aload 5
      //   269: invokeinterface 112 1 0
      //   274: aload 6
      //   276: athrow
      //   277: new 137	com/tencent/mm/plugin/favorite/a/b$c
      //   280: dup
      //   281: aload_0
      //   282: getfield 21	com/tencent/mm/plugin/favorite/a/b$a:laO	Lcom/tencent/mm/plugin/favorite/a/b;
      //   285: invokespecial 139	com/tencent/mm/plugin/favorite/a/b$c:<init>	(Lcom/tencent/mm/plugin/favorite/a/b;)V
      //   288: astore 6
      //   290: aload 6
      //   292: aload 5
      //   294: invokevirtual 143	com/tencent/mm/plugin/favorite/a/b$c:b	(Landroid/database/Cursor;)V
      //   297: aload_0
      //   298: getfield 35	com/tencent/mm/plugin/favorite/a/b$a:laP	Ljava/util/HashSet;
      //   301: aload 6
      //   303: getfield 147	com/tencent/mm/plugin/favorite/a/b$c:gGR	J
      //   306: invokestatic 105	java/lang/Long:valueOf	(J)Ljava/lang/Long;
      //   309: invokevirtual 150	java/util/HashSet:remove	(Ljava/lang/Object;)Z
      //   312: ifne -91 -> 221
      //   315: iload_1
      //   316: bipush 50
      //   318: if_icmplt +277 -> 595
      //   321: aload_0
      //   322: getfield 21	com/tencent/mm/plugin/favorite/a/b$a:laO	Lcom/tencent/mm/plugin/favorite/a/b;
      //   325: getfield 79	com/tencent/mm/plugin/favorite/a/b:laL	Lcom/tencent/mm/plugin/favorite/a/a;
      //   328: invokevirtual 135	com/tencent/mm/plugin/favorite/a/a:commit	()V
      //   331: aload_0
      //   332: getfield 21	com/tencent/mm/plugin/favorite/a/b$a:laO	Lcom/tencent/mm/plugin/favorite/a/b;
      //   335: getfield 79	com/tencent/mm/plugin/favorite/a/b:laL	Lcom/tencent/mm/plugin/favorite/a/a;
      //   338: invokevirtual 153	com/tencent/mm/plugin/favorite/a/a:beginTransaction	()V
      //   341: iconst_0
      //   342: istore_2
      //   343: iload_2
      //   344: istore_1
      //   345: iload_2
      //   346: aload_0
      //   347: getfield 21	com/tencent/mm/plugin/favorite/a/b$a:laO	Lcom/tencent/mm/plugin/favorite/a/b;
      //   350: aload 6
      //   352: invokevirtual 156	com/tencent/mm/plugin/favorite/a/b:a	(Lcom/tencent/mm/plugin/favorite/a/b$c;)I
      //   355: iadd
      //   356: istore_2
      //   357: iload_2
      //   358: istore_1
      //   359: aload_0
      //   360: aload_0
      //   361: getfield 39	com/tencent/mm/plugin/favorite/a/b$a:laR	I
      //   364: iconst_1
      //   365: iadd
      //   366: putfield 39	com/tencent/mm/plugin/favorite/a/b$a:laR	I
      //   369: iload_2
      //   370: istore_1
      //   371: goto -150 -> 221
      //   374: astore 6
      //   376: ldc 60
      //   378: aload 6
      //   380: ldc -98
      //   382: iconst_0
      //   383: anewarray 160	java/lang/Object
      //   386: invokestatic 164	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   389: aload_0
      //   390: aload_0
      //   391: getfield 43	com/tencent/mm/plugin/favorite/a/b$a:mFailedCount	I
      //   394: iconst_1
      //   395: iadd
      //   396: putfield 43	com/tencent/mm/plugin/favorite/a/b$a:mFailedCount	I
      //   399: goto -178 -> 221
      //   402: aload 5
      //   404: ifnull +10 -> 414
      //   407: aload 5
      //   409: invokeinterface 112 1 0
      //   414: aload_0
      //   415: getfield 21	com/tencent/mm/plugin/favorite/a/b$a:laO	Lcom/tencent/mm/plugin/favorite/a/b;
      //   418: getfield 79	com/tencent/mm/plugin/favorite/a/b:laL	Lcom/tencent/mm/plugin/favorite/a/a;
      //   421: invokevirtual 135	com/tencent/mm/plugin/favorite/a/a:commit	()V
      //   424: aload_0
      //   425: getfield 35	com/tencent/mm/plugin/favorite/a/b$a:laP	Ljava/util/HashSet;
      //   428: invokevirtual 168	java/util/HashSet:iterator	()Ljava/util/Iterator;
      //   431: astore 5
      //   433: aload 5
      //   435: invokeinterface 173 1 0
      //   440: ifeq +107 -> 547
      //   443: invokestatic 121	java/lang/Thread:interrupted	()Z
      //   446: ifeq +21 -> 467
      //   449: aload_0
      //   450: getfield 21	com/tencent/mm/plugin/favorite/a/b$a:laO	Lcom/tencent/mm/plugin/favorite/a/b;
      //   453: getfield 79	com/tencent/mm/plugin/favorite/a/b:laL	Lcom/tencent/mm/plugin/favorite/a/a;
      //   456: invokevirtual 135	com/tencent/mm/plugin/favorite/a/a:commit	()V
      //   459: new 123	java/lang/InterruptedException
      //   462: dup
      //   463: invokespecial 124	java/lang/InterruptedException:<init>	()V
      //   466: athrow
      //   467: iload_1
      //   468: bipush 50
      //   470: if_icmplt +122 -> 592
      //   473: aload_0
      //   474: getfield 21	com/tencent/mm/plugin/favorite/a/b$a:laO	Lcom/tencent/mm/plugin/favorite/a/b;
      //   477: getfield 79	com/tencent/mm/plugin/favorite/a/b:laL	Lcom/tencent/mm/plugin/favorite/a/a;
      //   480: invokevirtual 135	com/tencent/mm/plugin/favorite/a/a:commit	()V
      //   483: aload_0
      //   484: getfield 21	com/tencent/mm/plugin/favorite/a/b$a:laO	Lcom/tencent/mm/plugin/favorite/a/b;
      //   487: getfield 79	com/tencent/mm/plugin/favorite/a/b:laL	Lcom/tencent/mm/plugin/favorite/a/a;
      //   490: invokevirtual 153	com/tencent/mm/plugin/favorite/a/a:beginTransaction	()V
      //   493: iconst_0
      //   494: istore_1
      //   495: aload 5
      //   497: invokeinterface 177 1 0
      //   502: checkcast 101	java/lang/Long
      //   505: invokevirtual 181	java/lang/Long:longValue	()J
      //   508: lstore_3
      //   509: aload_0
      //   510: getfield 21	com/tencent/mm/plugin/favorite/a/b$a:laO	Lcom/tencent/mm/plugin/favorite/a/b;
      //   513: getfield 79	com/tencent/mm/plugin/favorite/a/b:laL	Lcom/tencent/mm/plugin/favorite/a/a;
      //   516: getstatic 85	com/tencent/mm/plugin/fts/a/c:lvX	[I
      //   519: lload_3
      //   520: invokevirtual 184	com/tencent/mm/plugin/favorite/a/a:b	([IJ)V
      //   523: iload_1
      //   524: iconst_1
      //   525: iadd
      //   526: istore_1
      //   527: aload_0
      //   528: aload_0
      //   529: getfield 41	com/tencent/mm/plugin/favorite/a/b$a:laS	I
      //   532: iconst_1
      //   533: iadd
      //   534: putfield 41	com/tencent/mm/plugin/favorite/a/b$a:laS	I
      //   537: aload 5
      //   539: invokeinterface 186 1 0
      //   544: goto -111 -> 433
      //   547: aload_0
      //   548: getfield 21	com/tencent/mm/plugin/favorite/a/b$a:laO	Lcom/tencent/mm/plugin/favorite/a/b;
      //   551: getfield 79	com/tencent/mm/plugin/favorite/a/b:laL	Lcom/tencent/mm/plugin/favorite/a/a;
      //   554: invokevirtual 135	com/tencent/mm/plugin/favorite/a/a:commit	()V
      //   557: ldc 60
      //   559: aload_0
      //   560: invokevirtual 190	com/tencent/mm/plugin/favorite/a/b$a:toString	()Ljava/lang/String;
      //   563: invokestatic 72	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
      //   566: ldc2_w 52
      //   569: ldc 54
      //   571: invokestatic 46	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   574: iconst_1
      //   575: ireturn
      //   576: astore 5
      //   578: aconst_null
      //   579: astore 6
      //   581: goto -432 -> 149
      //   584: astore 6
      //   586: aconst_null
      //   587: astore 5
      //   589: goto -453 -> 136
      //   592: goto -97 -> 495
      //   595: iload_1
      //   596: istore_2
      //   597: goto -254 -> 343
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	600	0	this	a
      //   220	376	1	i	int
      //   342	255	2	j	int
      //   106	414	3	l	long
      //   82	456	5	localObject1	Object
      //   576	1	5	localObject2	Object
      //   587	1	5	localObject3	Object
      //   78	92	6	localObject4	Object
      //   255	3	6	localException1	Exception
      //   260	15	6	localObject5	Object
      //   288	63	6	localc	b.c
      //   374	5	6	localException2	Exception
      //   579	1	6	localObject6	Object
      //   584	1	6	localException3	Exception
      //   126	7	7	localException4	Exception
      //   139	7	7	localObject7	Object
      // Exception table:
      //   from	to	target	type
      //   84	94	126	java/lang/Exception
      //   98	107	126	java/lang/Exception
      //   111	123	126	java/lang/Exception
      //   84	94	139	finally
      //   98	107	139	finally
      //   111	123	139	finally
      //   136	139	139	finally
      //   221	255	255	java/lang/Exception
      //   277	315	255	java/lang/Exception
      //   321	341	255	java/lang/Exception
      //   376	399	255	java/lang/Exception
      //   221	255	260	finally
      //   257	260	260	finally
      //   277	315	260	finally
      //   321	341	260	finally
      //   345	357	260	finally
      //   359	369	260	finally
      //   376	399	260	finally
      //   345	357	374	java/lang/Exception
      //   359	369	374	java/lang/Exception
      //   60	80	576	finally
      //   60	80	584	java/lang/Exception
    }
    
    public final int getId()
    {
      GMTrace.i(16656017391616L, 124097);
      GMTrace.o(16656017391616L, 124097);
      return 6;
    }
    
    public final String toString()
    {
      GMTrace.i(16655883173888L, 124096);
      String str = "BuildFavoriteIndex [new: " + this.laR + ", exist: " + this.laQ + ", removed: " + this.laS + ", failed: " + this.mFailedCount + "]";
      GMTrace.o(16655883173888L, 124096);
      return str;
    }
  }
  
  private final class b
    extends com.tencent.mm.plugin.fts.a.a.a
  {
    private long laT;
    
    public b(long paramLong)
    {
      GMTrace.i(16654809432064L, 124088);
      this.laT = paramLong;
      GMTrace.o(16654809432064L, 124088);
    }
    
    public final boolean execute()
    {
      GMTrace.i(16654943649792L, 124089);
      w.d("MicroMsg.FTS.FTS5SearchFavoriteLogic", "start to delete favorite item");
      long l = this.laT;
      b.this.laL.b(com.tencent.mm.plugin.fts.a.c.lvX, l);
      w.i("MicroMsg.FTS.FTS5SearchFavoriteLogic", toString());
      GMTrace.o(16654943649792L, 124089);
      return true;
    }
    
    public final String toString()
    {
      GMTrace.i(16655077867520L, 124090);
      String str = "DeleteFavItemTask id=" + this.laT;
      GMTrace.o(16655077867520L, 124090);
      return str;
    }
  }
  
  private final class c
  {
    String eMI;
    tt eRx;
    long gGR;
    long hMN;
    ud laU;
    int type;
    
    public c()
    {
      GMTrace.i(16653198819328L, 124076);
      GMTrace.o(16653198819328L, 124076);
    }
    
    public final void b(Cursor paramCursor)
    {
      GMTrace.i(16653333037056L, 124077);
      this.gGR = paramCursor.getLong(0);
      this.type = paramCursor.getInt(1);
      this.hMN = paramCursor.getLong(2);
      this.eMI = paramCursor.getString(3);
      byte[] arrayOfByte = paramCursor.getBlob(4);
      if ((arrayOfByte == null) || (arrayOfByte.length == 0)) {
        w.d("MicroMsg.FTS.FTS5SearchFavoriteLogic", "FavIndexItem protoData is null or data length is 0");
      }
      for (this.eRx = new tt();; this.eRx = ((tt)new tt().aD(arrayOfByte)))
      {
        paramCursor = paramCursor.getBlob(5);
        if ((paramCursor != null) && (paramCursor.length != 0)) {
          break;
        }
        this.laU = null;
        GMTrace.o(16653333037056L, 124077);
        return;
      }
      this.laU = ((ud)new ud().aD(paramCursor));
      GMTrace.o(16653333037056L, 124077);
    }
  }
  
  private final class d
    extends com.tencent.mm.plugin.fts.a.a.a
  {
    public d()
    {
      GMTrace.i(16654406778880L, 124085);
      GMTrace.o(16654406778880L, 124085);
    }
    
    public final boolean execute()
    {
      GMTrace.i(16654540996608L, 124086);
      com.tencent.mm.plugin.favorite.h.axB().c(b.this.laN);
      b.this.laM = com.tencent.mm.plugin.favorite.h.axB().fTZ;
      b.this.fTu.a(131122, new b.a(b.this));
      GMTrace.o(16654540996608L, 124086);
      return true;
    }
    
    public final String getName()
    {
      GMTrace.i(16654675214336L, 124087);
      GMTrace.o(16654675214336L, 124087);
      return "InitFavoriteDBTask";
    }
  }
  
  private final class e
    extends com.tencent.mm.plugin.fts.a.a.a
  {
    private long laT;
    private int laV;
    
    public e(long paramLong)
    {
      GMTrace.i(16655212085248L, 124091);
      this.laT = paramLong;
      GMTrace.o(16655212085248L, 124091);
    }
    
    public final boolean execute()
    {
      GMTrace.i(16655346302976L, 124092);
      if (b.this.laM == null)
      {
        w.e("MicroMsg.FTS.FTS5SearchFavoriteLogic", "InsertFavItemTask: fav db is null");
        GMTrace.o(16655346302976L, 124092);
        return true;
      }
      w.d("MicroMsg.FTS.FTS5SearchFavoriteLogic", "start to insert favorite item");
      Cursor localCursor2 = b.this.laM.a("SELECT localId, type, updateTime, fromUser, favProto, tagProto FROM FavItemInfo WHERE localId = ? AND flag <> -1;", new String[] { String.valueOf(this.laT) }, 2);
      Cursor localCursor3 = localCursor2;
      Cursor localCursor1 = localCursor2;
      Object localObject1 = localCursor2;
      try
      {
        if (localCursor2.moveToFirst())
        {
          localCursor1 = localCursor2;
          localObject1 = localCursor2;
          b.c localc = new b.c(b.this);
          localCursor1 = localCursor2;
          localObject1 = localCursor2;
          localc.b(localCursor2);
          localCursor1 = localCursor2;
          localObject1 = localCursor2;
          localCursor2.close();
          localCursor2 = null;
          Object localObject3 = null;
          localCursor3 = null;
          localCursor1 = localCursor2;
          localObject1 = localObject3;
          b.this.laL.beginTransaction();
          localCursor1 = localCursor2;
          localObject1 = localObject3;
          long l = this.laT;
          localCursor1 = localCursor2;
          localObject1 = localObject3;
          b.this.laL.b(com.tencent.mm.plugin.fts.a.c.lvX, l);
          localCursor1 = localCursor2;
          localObject1 = localObject3;
          this.laV = b.this.a(localc);
          localCursor1 = localCursor2;
          localObject1 = localObject3;
          b.this.laL.commit();
          localCursor1 = localCursor2;
          localObject1 = localObject3;
          w.i("MicroMsg.FTS.FTS5SearchFavoriteLogic", toString());
        }
        if (localCursor3 != null) {
          localCursor3.close();
        }
        GMTrace.o(16655346302976L, 124092);
        return true;
      }
      catch (Exception localException)
      {
        localObject1 = localCursor1;
        throw localException;
      }
      finally
      {
        if (localObject1 != null) {
          ((Cursor)localObject1).close();
        }
      }
    }
    
    public final String toString()
    {
      GMTrace.i(16655480520704L, 124093);
      String str = "InsertFavItemTask local id is " + this.laT + " transactionCount: " + this.laV;
      GMTrace.o(16655480520704L, 124093);
      return str;
    }
  }
  
  private final class f
    extends com.tencent.mm.plugin.fts.a.a.e
  {
    f(com.tencent.mm.plugin.fts.a.a.f paramf)
    {
      super();
      GMTrace.i(18032688627712L, 134354);
      GMTrace.o(18032688627712L, 134354);
    }
    
    protected final List<i> a(String[] paramArrayOfString, com.tencent.mm.plugin.fts.a.a.f paramf)
    {
      GMTrace.i(18032822845440L, 134355);
      Object localObject = new HashMap();
      paramArrayOfString = b.this.laL.a(paramArrayOfString, com.tencent.mm.plugin.fts.a.c.lvX, null, null, false, false);
      while (paramArrayOfString.moveToNext())
      {
        j localj = new j().e(paramArrayOfString);
        i locali = (i)((HashMap)localObject).get(Long.valueOf(localj.lxe));
        if ((locali == null) || (d.b(com.tencent.mm.plugin.fts.a.c.lwo, localj.gRk, locali.gRk) < 0)) {
          ((HashMap)localObject).put(Long.valueOf(localj.lxe), localj);
        }
        if (Thread.interrupted())
        {
          paramArrayOfString.close();
          throw new InterruptedException();
        }
      }
      paramArrayOfString.close();
      if (Thread.interrupted()) {
        throw new InterruptedException();
      }
      paramArrayOfString = new ArrayList(((HashMap)localObject).size());
      localObject = ((HashMap)localObject).values().iterator();
      while (((Iterator)localObject).hasNext()) {
        paramArrayOfString.add((j)((Iterator)localObject).next());
      }
      if (paramf.lwX != null) {
        Collections.sort(paramArrayOfString, paramf.lwX);
      }
      GMTrace.o(18032822845440L, 134355);
      return paramArrayOfString;
    }
    
    public final String getName()
    {
      GMTrace.i(16651990859776L, 124067);
      GMTrace.o(16651990859776L, 124067);
      return "SearchFavoriteTask";
    }
  }
  
  private final class g
    extends com.tencent.mm.plugin.fts.a.a.e
  {
    g(com.tencent.mm.plugin.fts.a.a.f paramf)
    {
      super();
      GMTrace.i(18033091280896L, 134357);
      GMTrace.o(18033091280896L, 134357);
    }
    
    protected final List<i> a(String[] paramArrayOfString, com.tencent.mm.plugin.fts.a.a.f paramf)
    {
      GMTrace.i(18033225498624L, 134358);
      Object localObject = b.this.laL;
      int i = paramf.lwV;
      paramArrayOfString = d.t(paramArrayOfString);
      paramArrayOfString = String.format("SELECT %s.docid, type, subtype, entity_id, aux_index, timestamp FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' ORDER BY -timestamp, subtype limit " + (i + 1 + 1) + ";", new Object[] { ((a)localObject).aCf(), ((a)localObject).aCf(), ((a)localObject).aCg(), ((a)localObject).aCf(), ((a)localObject).aCg(), ((a)localObject).aCg(), paramArrayOfString });
      paramArrayOfString = ((com.tencent.mm.plugin.fts.a.a)localObject).lvN.rawQuery(paramArrayOfString, null);
      localObject = new ArrayList();
      HashSet localHashSet = new HashSet();
      while (paramArrayOfString.moveToNext()) {
        if (localHashSet.add(String.valueOf(paramArrayOfString.getLong(3))))
        {
          ((List)localObject).add(new j().e(paramArrayOfString));
          if (((List)localObject).size() <= paramf.lwV) {
            if (Thread.interrupted())
            {
              paramArrayOfString.close();
              throw new InterruptedException();
            }
          }
        }
      }
      if (paramArrayOfString != null) {
        paramArrayOfString.close();
      }
      if (Thread.interrupted()) {
        throw new InterruptedException();
      }
      GMTrace.o(18033225498624L, 134358);
      return (List<i>)localObject;
    }
    
    public final int getId()
    {
      GMTrace.i(18033493934080L, 134360);
      GMTrace.o(18033493934080L, 134360);
      return 9;
    }
    
    public final String getName()
    {
      GMTrace.i(18033359716352L, 134359);
      GMTrace.o(18033359716352L, 134359);
      return "SearchTopFavoriteTask";
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */