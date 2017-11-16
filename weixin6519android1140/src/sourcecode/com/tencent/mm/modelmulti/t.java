package com.tencent.mm.modelmulti;

import android.database.Cursor;
import android.os.HandlerThread;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.protocal.c.aqk;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.protocal.c.nk;
import com.tencent.mm.protocal.c.nl;
import com.tencent.mm.protocal.w.b;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.ArrayList;
import java.util.LinkedList;

public final class t
{
  public static ArrayList<bu> gOH;
  public static ArrayList<x> gOI;
  
  static
  {
    GMTrace.i(396344950784L, 2953);
    gOH = new ArrayList();
    gOI = new ArrayList();
    GMTrace.o(396344950784L, 2953);
  }
  
  public static void JJ()
  {
    GMTrace.i(16008953724928L, 119276);
    at.AR();
    Cursor localCursor = c.yK().c(null, null, new ArrayList());
    while (localCursor.moveToNext())
    {
      x localx = new x();
      localx.b(localCursor);
      gOI.add(localx);
    }
    localCursor.close();
    GMTrace.o(16008953724928L, 119276);
  }
  
  public static void aQ(int paramInt1, final int paramInt2)
  {
    GMTrace.i(395673862144L, 2948);
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(410169376768L, 3056);
        t.JJ();
        t.kC(e.ghz + "/testaddmsg.txt");
        if ((t.gOI.size() <= 0) || (t.gOH.size() <= 0))
        {
          w.e("MicroMsg.TestSyncAddMsg", "syncAddMsg get source failed cmd:%d contact:%d", new Object[] { Integer.valueOf(t.gOH.size()), Integer.valueOf(t.gOI.size()) });
          GMTrace.o(410169376768L, 3056);
          return;
        }
        new aj(at.xB().ngv.getLooper(), new aj.a()
        {
          int gOL;
          
          public final boolean pM()
          {
            GMTrace.i(395002773504L, 2943);
            if (this.gOL <= 0)
            {
              GMTrace.o(395002773504L, 2943);
              return false;
            }
            this.gOL -= 1;
            w.b localb = new w.b();
            localb.tKU.tZD = new nl();
            int j = bg.eb(t.1.this.gOK, 1);
            int i = 0;
            for (;;)
            {
              if (i >= j) {
                break label355;
              }
              bu localbu = (bu)t.gOH.get(bg.eb(t.gOH.size() - 1, 0));
              localbu.tPW = new azq().Rq(((x)t.gOI.get(bg.eb(t.gOI.size() - 1, 0))).field_username);
              localbu.nFd = ((int)bg.Pu());
              localbu.tQd = Math.abs((int)bg.Pv() % 10000000);
              try
              {
                Object localObject = new nk();
                ((nk)localObject).uej = new azp();
                ((nk)localObject).uej.be(localbu.toByteArray());
                ((nk)localObject).uei = 5;
                localb.tKU.tZD.jhd.add(localObject);
                localObject = localb.tKU.tZD;
                ((nl)localObject).jhc += 1;
                w.d("MicroMsg.TestSyncAddMsg", "syncAddMsg  loop:%d cnt:[%d,%d] cmdList:%d id:%d u:%s", new Object[] { Integer.valueOf(this.gOL), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(localb.tKU.tZD.jhd.size()), Long.valueOf(localbu.tQd), localbu.tPW.uNR });
              }
              catch (Exception localException)
              {
                for (;;)
                {
                  w.d("MicroMsg.TestSyncAddMsg", localException.getMessage());
                  w.printErrStackTrace("MicroMsg.TestSyncAddMsg", localException, "", new Object[0]);
                }
              }
              i += 1;
            }
            label355:
            localb.tKU.tXv = 0;
            aqk localaqk = localb.tKU;
            at.AR();
            localaqk.tZA = n.H(bg.St(bg.nl((String)c.xh().get(8195, new byte[0]))));
            localb.tKU.tST = 0;
            localb.tKU.jhA = 0;
            q.JF().a(localb, 0, bg.Pu());
            GMTrace.o(395002773504L, 2943);
            return true;
          }
        }, true).z(3000L, 3000L);
        GMTrace.o(410169376768L, 3056);
      }
    });
    GMTrace.o(395673862144L, 2948);
  }
  
  /* Error */
  public static void kC(String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: ldc2_w 99
    //   5: ldc 101
    //   7: invokestatic 23	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: new 103	java/io/BufferedReader
    //   13: dup
    //   14: new 105	java/io/InputStreamReader
    //   17: dup
    //   18: new 107	java/io/FileInputStream
    //   21: dup
    //   22: aload_0
    //   23: invokespecial 109	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   26: invokespecial 112	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   29: invokespecial 115	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   32: astore_3
    //   33: aload_3
    //   34: astore_0
    //   35: aload_3
    //   36: invokevirtual 119	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   39: astore 4
    //   41: aload 4
    //   43: ifnull +270 -> 313
    //   46: iload_1
    //   47: iconst_1
    //   48: iadd
    //   49: istore_2
    //   50: aload_3
    //   51: astore_0
    //   52: aload 4
    //   54: ldc 121
    //   56: invokevirtual 127	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   59: astore 4
    //   61: aload 4
    //   63: ifnull +12 -> 75
    //   66: aload_3
    //   67: astore_0
    //   68: aload 4
    //   70: arraylength
    //   71: iconst_3
    //   72: if_icmpeq +102 -> 174
    //   75: aload 4
    //   77: ifnonnull +88 -> 165
    //   80: iconst_m1
    //   81: istore_1
    //   82: aload_3
    //   83: astore_0
    //   84: ldc -127
    //   86: ldc -125
    //   88: iconst_2
    //   89: anewarray 4	java/lang/Object
    //   92: dup
    //   93: iconst_0
    //   94: iload_2
    //   95: invokestatic 137	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   98: aastore
    //   99: dup
    //   100: iconst_1
    //   101: iload_1
    //   102: invokestatic 137	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   105: aastore
    //   106: invokestatic 143	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   109: iload_2
    //   110: istore_1
    //   111: goto -78 -> 33
    //   114: astore 4
    //   116: aload_3
    //   117: astore_0
    //   118: ldc -127
    //   120: ldc -111
    //   122: iconst_1
    //   123: anewarray 4	java/lang/Object
    //   126: dup
    //   127: iconst_0
    //   128: aload 4
    //   130: invokevirtual 148	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   133: aastore
    //   134: invokestatic 143	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   137: aload_3
    //   138: astore_0
    //   139: ldc -127
    //   141: aload 4
    //   143: ldc -106
    //   145: iconst_0
    //   146: anewarray 4	java/lang/Object
    //   149: invokestatic 154	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   152: aload_3
    //   153: invokevirtual 155	java/io/BufferedReader:close	()V
    //   156: ldc2_w 99
    //   159: ldc 101
    //   161: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   164: return
    //   165: aload_3
    //   166: astore_0
    //   167: aload 4
    //   169: arraylength
    //   170: istore_1
    //   171: goto -89 -> 82
    //   174: aload_3
    //   175: astore_0
    //   176: new 157	com/tencent/mm/protocal/c/bu
    //   179: dup
    //   180: invokespecial 158	com/tencent/mm/protocal/c/bu:<init>	()V
    //   183: astore 5
    //   185: aload_3
    //   186: astore_0
    //   187: aload 5
    //   189: new 160	com/tencent/mm/protocal/c/azq
    //   192: dup
    //   193: invokespecial 161	com/tencent/mm/protocal/c/azq:<init>	()V
    //   196: invokestatic 166	com/tencent/mm/y/q:zE	()Ljava/lang/String;
    //   199: invokevirtual 170	com/tencent/mm/protocal/c/azq:Rq	(Ljava/lang/String;)Lcom/tencent/mm/protocal/c/azq;
    //   202: putfield 174	com/tencent/mm/protocal/c/bu:tPX	Lcom/tencent/mm/protocal/c/azq;
    //   205: aload_3
    //   206: astore_0
    //   207: aload 5
    //   209: iconst_2
    //   210: putfield 178	com/tencent/mm/protocal/c/bu:jhA	I
    //   213: aload_3
    //   214: astore_0
    //   215: aload 5
    //   217: new 180	com/tencent/mm/protocal/c/azp
    //   220: dup
    //   221: invokespecial 181	com/tencent/mm/protocal/c/azp:<init>	()V
    //   224: iconst_0
    //   225: newarray <illegal type>
    //   227: invokevirtual 185	com/tencent/mm/protocal/c/azp:be	([B)Lcom/tencent/mm/protocal/c/azp;
    //   230: putfield 189	com/tencent/mm/protocal/c/bu:tQa	Lcom/tencent/mm/protocal/c/azp;
    //   233: aload_3
    //   234: astore_0
    //   235: aload 5
    //   237: aload 4
    //   239: iconst_0
    //   240: aaload
    //   241: iconst_0
    //   242: invokestatic 195	com/tencent/mm/sdk/platformtools/bg:getInt	(Ljava/lang/String;I)I
    //   245: putfield 198	com/tencent/mm/protocal/c/bu:lQc	I
    //   248: aload_3
    //   249: astore_0
    //   250: aload 5
    //   252: aload 4
    //   254: iconst_1
    //   255: aaload
    //   256: iconst_0
    //   257: invokestatic 195	com/tencent/mm/sdk/platformtools/bg:getInt	(Ljava/lang/String;I)I
    //   260: putfield 201	com/tencent/mm/protocal/c/bu:tPZ	I
    //   263: aload_3
    //   264: astore_0
    //   265: aload 5
    //   267: new 160	com/tencent/mm/protocal/c/azq
    //   270: dup
    //   271: invokespecial 161	com/tencent/mm/protocal/c/azq:<init>	()V
    //   274: aload 4
    //   276: iconst_2
    //   277: aaload
    //   278: invokevirtual 170	com/tencent/mm/protocal/c/azq:Rq	(Ljava/lang/String;)Lcom/tencent/mm/protocal/c/azq;
    //   281: putfield 204	com/tencent/mm/protocal/c/bu:tPY	Lcom/tencent/mm/protocal/c/azq;
    //   284: aload_3
    //   285: astore_0
    //   286: getstatic 30	com/tencent/mm/modelmulti/t:gOH	Ljava/util/ArrayList;
    //   289: aload 5
    //   291: invokevirtual 75	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   294: pop
    //   295: iload_2
    //   296: istore_1
    //   297: goto -264 -> 33
    //   300: astore 4
    //   302: aload_0
    //   303: astore_3
    //   304: aload 4
    //   306: astore_0
    //   307: aload_3
    //   308: invokevirtual 155	java/io/BufferedReader:close	()V
    //   311: aload_0
    //   312: athrow
    //   313: aload_3
    //   314: invokevirtual 155	java/io/BufferedReader:close	()V
    //   317: ldc2_w 99
    //   320: ldc 101
    //   322: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   325: return
    //   326: astore_0
    //   327: ldc2_w 99
    //   330: ldc 101
    //   332: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   335: return
    //   336: astore_0
    //   337: ldc2_w 99
    //   340: ldc 101
    //   342: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   345: return
    //   346: astore_3
    //   347: goto -36 -> 311
    //   350: astore_0
    //   351: aconst_null
    //   352: astore_3
    //   353: goto -46 -> 307
    //   356: astore 4
    //   358: aconst_null
    //   359: astore_3
    //   360: goto -244 -> 116
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	363	0	paramString	String
    //   1	296	1	i	int
    //   49	247	2	j	int
    //   32	282	3	localObject1	Object
    //   346	1	3	localException1	Exception
    //   352	8	3	localObject2	Object
    //   39	37	4	localObject3	Object
    //   114	161	4	localException2	Exception
    //   300	5	4	localObject4	Object
    //   356	1	4	localException3	Exception
    //   183	107	5	localbu	bu
    // Exception table:
    //   from	to	target	type
    //   35	41	114	java/lang/Exception
    //   52	61	114	java/lang/Exception
    //   68	75	114	java/lang/Exception
    //   84	109	114	java/lang/Exception
    //   167	171	114	java/lang/Exception
    //   176	185	114	java/lang/Exception
    //   187	205	114	java/lang/Exception
    //   207	213	114	java/lang/Exception
    //   215	233	114	java/lang/Exception
    //   235	248	114	java/lang/Exception
    //   250	263	114	java/lang/Exception
    //   265	284	114	java/lang/Exception
    //   286	295	114	java/lang/Exception
    //   35	41	300	finally
    //   52	61	300	finally
    //   68	75	300	finally
    //   84	109	300	finally
    //   118	137	300	finally
    //   139	152	300	finally
    //   167	171	300	finally
    //   176	185	300	finally
    //   187	205	300	finally
    //   207	213	300	finally
    //   215	233	300	finally
    //   235	248	300	finally
    //   250	263	300	finally
    //   265	284	300	finally
    //   286	295	300	finally
    //   313	317	326	java/lang/Exception
    //   152	156	336	java/lang/Exception
    //   307	311	346	java/lang/Exception
    //   10	33	350	finally
    //   10	33	356	java/lang/Exception
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelmulti\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */