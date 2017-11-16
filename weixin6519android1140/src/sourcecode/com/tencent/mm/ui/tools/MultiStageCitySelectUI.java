package com.tencent.mm.ui.tools;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.RegionCodeDecoder.Region;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceCategory;
import com.tencent.mm.ui.base.preference.PreferenceTitleCategory;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.List;

public class MultiStageCitySelectUI
  extends MMPreference
  implements e
{
  private static List<RegionCodeDecoder.Region> xiw;
  private String countryCode;
  private int eOh;
  private a.a fJt;
  private String gLy;
  private String goU;
  private String goV;
  private com.tencent.mm.modelgeo.c gxh;
  private ae handler;
  private f htU;
  private p jQL;
  private String xil;
  private String xim;
  private boolean xin;
  private int xio;
  private RegionCodeDecoder.Region[] xip;
  private boolean xiq;
  private boolean xir;
  private boolean xis;
  private boolean xit;
  private boolean xiu;
  private ZoneRecommandPreference xiv;
  private String xix;
  private Runnable xiy;
  
  public MultiStageCitySelectUI()
  {
    GMTrace.i(1995280744448L, 14866);
    this.countryCode = null;
    this.goV = null;
    this.goU = null;
    this.gLy = null;
    this.xil = null;
    this.xim = null;
    this.xin = false;
    this.eOh = 0;
    this.xio = -1;
    this.xiq = false;
    this.xir = true;
    this.xis = true;
    this.xit = false;
    this.xiu = false;
    this.jQL = new p(true, true);
    this.handler = new ae(Looper.getMainLooper());
    this.fJt = new a.a()
    {
      public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
      {
        GMTrace.i(15328872497152L, 114209);
        if (MultiStageCitySelectUI.a(MultiStageCitySelectUI.this) == null)
        {
          GMTrace.o(15328872497152L, 114209);
          return false;
        }
        if (paramAnonymousBoolean)
        {
          w.i("MicroMsg.MultiStageCitySelectUI", "lat:%f lng:%f accuracy:%f", new Object[] { Float.valueOf(paramAnonymousFloat2), Float.valueOf(paramAnonymousFloat1), Double.valueOf(paramAnonymousDouble2) });
          com.tencent.mm.modelsimple.n localn = new com.tencent.mm.modelsimple.n(paramAnonymousFloat2, paramAnonymousFloat1);
          at.wS().a(localn, 0);
        }
        for (;;)
        {
          if (MultiStageCitySelectUI.a(MultiStageCitySelectUI.this) != null)
          {
            MultiStageCitySelectUI.a(MultiStageCitySelectUI.this).c(MultiStageCitySelectUI.c(MultiStageCitySelectUI.this));
            MultiStageCitySelectUI.d(MultiStageCitySelectUI.this);
          }
          GMTrace.o(15328872497152L, 114209);
          return false;
          MultiStageCitySelectUI.b(MultiStageCitySelectUI.this);
        }
      }
    };
    this.xiy = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(16859088814080L, 125610);
        MultiStageCitySelectUI.k(MultiStageCitySelectUI.this);
        GMTrace.o(16859088814080L, 125610);
      }
    };
    GMTrace.o(1995280744448L, 14866);
  }
  
  private void cip()
  {
    GMTrace.i(1995549179904L, 14868);
    switch (this.eOh)
    {
    }
    for (;;)
    {
      GMTrace.o(1995549179904L, 14868);
      return;
      this.goU = null;
      GMTrace.o(1995549179904L, 14868);
      return;
      this.goV = null;
      GMTrace.o(1995549179904L, 14868);
      return;
      this.countryCode = null;
    }
  }
  
  /* Error */
  private static List<RegionCodeDecoder.Region> ciq()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aconst_null
    //   4: astore_1
    //   5: ldc2_w 155
    //   8: ldc -99
    //   10: invokestatic 65	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   13: invokestatic 163	com/tencent/mm/storage/RegionCodeDecoder:bUl	()Lcom/tencent/mm/storage/RegionCodeDecoder;
    //   16: astore_0
    //   17: aload_0
    //   18: invokestatic 169	com/tencent/mm/sdk/platformtools/v:bPK	()Ljava/lang/String;
    //   21: putfield 172	com/tencent/mm/storage/RegionCodeDecoder:vCc	Ljava/lang/String;
    //   24: aload_0
    //   25: invokevirtual 175	com/tencent/mm/storage/RegionCodeDecoder:bUm	()Ljava/lang/String;
    //   28: astore_2
    //   29: aload_2
    //   30: invokestatic 181	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   33: ifeq +46 -> 79
    //   36: ldc -73
    //   38: new 185	java/lang/StringBuilder
    //   41: dup
    //   42: ldc -69
    //   44: invokespecial 190	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   47: aload_0
    //   48: getfield 172	com/tencent/mm/storage/RegionCodeDecoder:vCc	Ljava/lang/String;
    //   51: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: invokevirtual 197	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   57: invokestatic 203	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   60: aconst_null
    //   61: astore_0
    //   62: aload_0
    //   63: invokestatic 181	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   66: ifeq +37 -> 103
    //   69: ldc2_w 155
    //   72: ldc -99
    //   74: invokestatic 124	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   77: aconst_null
    //   78: areturn
    //   79: new 185	java/lang/StringBuilder
    //   82: dup
    //   83: invokespecial 204	java/lang/StringBuilder:<init>	()V
    //   86: getstatic 207	com/tencent/mm/storage/RegionCodeDecoder:vCb	Ljava/lang/String;
    //   89: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   92: aload_2
    //   93: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: invokevirtual 197	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   99: astore_0
    //   100: goto -38 -> 62
    //   103: new 209	java/util/ArrayList
    //   106: dup
    //   107: invokespecial 210	java/util/ArrayList:<init>	()V
    //   110: astore 8
    //   112: aload_0
    //   113: invokestatic 216	com/tencent/mm/modelsfs/FileOp:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   116: astore_0
    //   117: new 218	java/io/InputStreamReader
    //   120: dup
    //   121: aload_0
    //   122: invokespecial 221	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   125: astore_3
    //   126: new 223	java/io/BufferedReader
    //   129: dup
    //   130: aload_3
    //   131: invokespecial 226	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   134: astore_2
    //   135: aconst_null
    //   136: astore 4
    //   138: aload_2
    //   139: invokevirtual 229	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   142: astore 5
    //   144: aload 5
    //   146: ifnull +393 -> 539
    //   149: aload 5
    //   151: ldc -25
    //   153: invokevirtual 237	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   156: astore 6
    //   158: new 239	com/tencent/mm/storage/RegionCodeDecoder$Region
    //   161: dup
    //   162: invokespecial 240	com/tencent/mm/storage/RegionCodeDecoder$Region:<init>	()V
    //   165: astore 5
    //   167: aload 6
    //   169: arraylength
    //   170: iconst_2
    //   171: if_icmpne -33 -> 138
    //   174: aload 5
    //   176: aload 6
    //   178: iconst_1
    //   179: aaload
    //   180: invokevirtual 243	com/tencent/mm/storage/RegionCodeDecoder$Region:setName	(Ljava/lang/String;)V
    //   183: aload 6
    //   185: iconst_0
    //   186: aaload
    //   187: ldc -11
    //   189: invokevirtual 237	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   192: astore 9
    //   194: aload 9
    //   196: iconst_0
    //   197: aaload
    //   198: astore 6
    //   200: aload 5
    //   202: aload 6
    //   204: invokevirtual 248	com/tencent/mm/storage/RegionCodeDecoder$Region:setCountryCode	(Ljava/lang/String;)V
    //   207: aload 6
    //   209: invokestatic 181	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   212: ifne -74 -> 138
    //   215: aload 9
    //   217: arraylength
    //   218: iconst_1
    //   219: if_icmpne +122 -> 341
    //   222: aload 5
    //   224: aload 6
    //   226: invokevirtual 251	com/tencent/mm/storage/RegionCodeDecoder$Region:setCode	(Ljava/lang/String;)V
    //   229: aload 5
    //   231: iconst_0
    //   232: invokevirtual 255	com/tencent/mm/storage/RegionCodeDecoder$Region:setProvince	(Z)V
    //   235: aload 5
    //   237: iconst_0
    //   238: invokevirtual 258	com/tencent/mm/storage/RegionCodeDecoder$Region:setCity	(Z)V
    //   241: aload 5
    //   243: iconst_1
    //   244: invokevirtual 261	com/tencent/mm/storage/RegionCodeDecoder$Region:setCountry	(Z)V
    //   247: aload 5
    //   249: astore 6
    //   251: aload_1
    //   252: astore 7
    //   254: aload 8
    //   256: aload 5
    //   258: invokeinterface 267 2 0
    //   263: pop
    //   264: aload 6
    //   266: astore 4
    //   268: aload 7
    //   270: astore_1
    //   271: goto -133 -> 138
    //   274: astore 4
    //   276: aload_0
    //   277: astore_1
    //   278: aload_3
    //   279: astore_0
    //   280: aload_2
    //   281: astore_3
    //   282: aload 4
    //   284: astore_2
    //   285: ldc_w 269
    //   288: aload_2
    //   289: ldc_w 271
    //   292: iconst_1
    //   293: anewarray 273	java/lang/Object
    //   296: dup
    //   297: iconst_0
    //   298: aload_2
    //   299: invokevirtual 276	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   302: aastore
    //   303: invokestatic 280	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   306: aload_1
    //   307: ifnull +7 -> 314
    //   310: aload_1
    //   311: invokestatic 284	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   314: aload_0
    //   315: ifnull +7 -> 322
    //   318: aload_0
    //   319: invokestatic 286	com/tencent/mm/a/e:a	(Ljava/io/Reader;)V
    //   322: aload_3
    //   323: ifnull +7 -> 330
    //   326: aload_3
    //   327: invokestatic 286	com/tencent/mm/a/e:a	(Ljava/io/Reader;)V
    //   330: ldc2_w 155
    //   333: ldc -99
    //   335: invokestatic 124	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   338: aload 8
    //   340: areturn
    //   341: aload 9
    //   343: arraylength
    //   344: iconst_2
    //   345: if_icmpne +67 -> 412
    //   348: aload 5
    //   350: aload 9
    //   352: iconst_1
    //   353: aaload
    //   354: invokevirtual 251	com/tencent/mm/storage/RegionCodeDecoder$Region:setCode	(Ljava/lang/String;)V
    //   357: aload 5
    //   359: iconst_1
    //   360: invokevirtual 255	com/tencent/mm/storage/RegionCodeDecoder$Region:setProvince	(Z)V
    //   363: aload 5
    //   365: iconst_0
    //   366: invokevirtual 261	com/tencent/mm/storage/RegionCodeDecoder$Region:setCountry	(Z)V
    //   369: aload 5
    //   371: iconst_0
    //   372: invokevirtual 258	com/tencent/mm/storage/RegionCodeDecoder$Region:setCity	(Z)V
    //   375: aload 4
    //   377: ifnull +266 -> 643
    //   380: aload 4
    //   382: invokevirtual 289	com/tencent/mm/storage/RegionCodeDecoder$Region:getCountryCode	()Ljava/lang/String;
    //   385: aload 5
    //   387: invokevirtual 289	com/tencent/mm/storage/RegionCodeDecoder$Region:getCountryCode	()Ljava/lang/String;
    //   390: invokevirtual 292	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   393: ifeq +250 -> 643
    //   396: aload 4
    //   398: iconst_1
    //   399: invokevirtual 295	com/tencent/mm/storage/RegionCodeDecoder$Region:setHasChildren	(Z)V
    //   402: aload 5
    //   404: aload 4
    //   406: invokevirtual 299	com/tencent/mm/storage/RegionCodeDecoder$Region:setParent	(Lcom/tencent/mm/storage/RegionCodeDecoder$Region;)V
    //   409: goto +234 -> 643
    //   412: aload 4
    //   414: astore 6
    //   416: aload_1
    //   417: astore 7
    //   419: aload 9
    //   421: arraylength
    //   422: iconst_3
    //   423: if_icmpne -169 -> 254
    //   426: aload 5
    //   428: aload 9
    //   430: iconst_2
    //   431: aaload
    //   432: invokevirtual 251	com/tencent/mm/storage/RegionCodeDecoder$Region:setCode	(Ljava/lang/String;)V
    //   435: aload 5
    //   437: iconst_1
    //   438: invokevirtual 258	com/tencent/mm/storage/RegionCodeDecoder$Region:setCity	(Z)V
    //   441: aload 5
    //   443: iconst_0
    //   444: invokevirtual 261	com/tencent/mm/storage/RegionCodeDecoder$Region:setCountry	(Z)V
    //   447: aload 5
    //   449: iconst_0
    //   450: invokevirtual 255	com/tencent/mm/storage/RegionCodeDecoder$Region:setProvince	(Z)V
    //   453: aload 5
    //   455: iconst_0
    //   456: invokevirtual 295	com/tencent/mm/storage/RegionCodeDecoder$Region:setHasChildren	(Z)V
    //   459: aload 4
    //   461: astore 6
    //   463: aload_1
    //   464: astore 7
    //   466: aload_1
    //   467: ifnull -213 -> 254
    //   470: aload 4
    //   472: astore 6
    //   474: aload_1
    //   475: astore 7
    //   477: aload_1
    //   478: invokevirtual 302	com/tencent/mm/storage/RegionCodeDecoder$Region:getCode	()Ljava/lang/String;
    //   481: aload 9
    //   483: iconst_1
    //   484: aaload
    //   485: invokevirtual 292	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   488: ifeq -234 -> 254
    //   491: aload 5
    //   493: aload_1
    //   494: invokevirtual 299	com/tencent/mm/storage/RegionCodeDecoder$Region:setParent	(Lcom/tencent/mm/storage/RegionCodeDecoder$Region;)V
    //   497: aload_1
    //   498: iconst_1
    //   499: invokevirtual 295	com/tencent/mm/storage/RegionCodeDecoder$Region:setHasChildren	(Z)V
    //   502: aload 4
    //   504: astore 6
    //   506: aload_1
    //   507: astore 7
    //   509: goto -255 -> 254
    //   512: astore_1
    //   513: aload_0
    //   514: ifnull +7 -> 521
    //   517: aload_0
    //   518: invokestatic 284	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   521: aload_3
    //   522: ifnull +7 -> 529
    //   525: aload_3
    //   526: invokestatic 286	com/tencent/mm/a/e:a	(Ljava/io/Reader;)V
    //   529: aload_2
    //   530: ifnull +7 -> 537
    //   533: aload_2
    //   534: invokestatic 286	com/tencent/mm/a/e:a	(Ljava/io/Reader;)V
    //   537: aload_1
    //   538: athrow
    //   539: aload_0
    //   540: ifnull +7 -> 547
    //   543: aload_0
    //   544: invokestatic 284	com/tencent/mm/a/e:b	(Ljava/io/InputStream;)V
    //   547: aload_3
    //   548: invokestatic 286	com/tencent/mm/a/e:a	(Ljava/io/Reader;)V
    //   551: aload_2
    //   552: invokestatic 286	com/tencent/mm/a/e:a	(Ljava/io/Reader;)V
    //   555: goto -225 -> 330
    //   558: astore_1
    //   559: aconst_null
    //   560: astore_2
    //   561: aconst_null
    //   562: astore_3
    //   563: aconst_null
    //   564: astore_0
    //   565: goto -52 -> 513
    //   568: astore_1
    //   569: aconst_null
    //   570: astore_2
    //   571: aconst_null
    //   572: astore_3
    //   573: goto -60 -> 513
    //   576: astore_1
    //   577: aconst_null
    //   578: astore_2
    //   579: goto -66 -> 513
    //   582: astore 5
    //   584: aload_1
    //   585: astore 4
    //   587: aload_3
    //   588: astore_2
    //   589: aload 5
    //   591: astore_1
    //   592: aload_0
    //   593: astore_3
    //   594: aload 4
    //   596: astore_0
    //   597: goto -84 -> 513
    //   600: astore_2
    //   601: aconst_null
    //   602: astore_0
    //   603: aconst_null
    //   604: astore_1
    //   605: aload 5
    //   607: astore_3
    //   608: goto -323 -> 285
    //   611: astore_2
    //   612: aconst_null
    //   613: astore 4
    //   615: aload_0
    //   616: astore_1
    //   617: aload 5
    //   619: astore_3
    //   620: aload 4
    //   622: astore_0
    //   623: goto -338 -> 285
    //   626: astore_2
    //   627: aload_3
    //   628: astore_1
    //   629: aload_0
    //   630: astore 4
    //   632: aload 5
    //   634: astore_3
    //   635: aload_1
    //   636: astore_0
    //   637: aload 4
    //   639: astore_1
    //   640: goto -355 -> 285
    //   643: aload 5
    //   645: astore 7
    //   647: aload 4
    //   649: astore 6
    //   651: goto -397 -> 254
    // Local variable table:
    //   start	length	slot	name	signature
    //   16	621	0	localObject1	Object
    //   4	503	1	localObject2	Object
    //   512	26	1	localObject3	Object
    //   558	1	1	localObject4	Object
    //   568	1	1	localObject5	Object
    //   576	9	1	localObject6	Object
    //   591	49	1	localObject7	Object
    //   28	561	2	localObject8	Object
    //   600	1	2	localException1	Exception
    //   611	1	2	localException2	Exception
    //   626	1	2	localException3	Exception
    //   125	510	3	localObject9	Object
    //   136	131	4	localObject10	Object
    //   274	229	4	localException4	Exception
    //   585	63	4	localObject11	Object
    //   1	491	5	localObject12	Object
    //   582	62	5	localObject13	Object
    //   156	494	6	localObject14	Object
    //   252	394	7	localObject15	Object
    //   110	229	8	localArrayList	ArrayList
    //   192	290	9	arrayOfString	String[]
    // Exception table:
    //   from	to	target	type
    //   138	144	274	java/lang/Exception
    //   149	194	274	java/lang/Exception
    //   200	247	274	java/lang/Exception
    //   254	264	274	java/lang/Exception
    //   341	375	274	java/lang/Exception
    //   380	409	274	java/lang/Exception
    //   419	459	274	java/lang/Exception
    //   477	502	274	java/lang/Exception
    //   138	144	512	finally
    //   149	194	512	finally
    //   200	247	512	finally
    //   254	264	512	finally
    //   341	375	512	finally
    //   380	409	512	finally
    //   419	459	512	finally
    //   477	502	512	finally
    //   112	117	558	finally
    //   117	126	568	finally
    //   126	135	576	finally
    //   285	306	582	finally
    //   112	117	600	java/lang/Exception
    //   117	126	611	java/lang/Exception
    //   126	135	626	java/lang/Exception
  }
  
  private void cir()
  {
    GMTrace.i(1996891357184L, 14878);
    if (this.xiv != null) {
      this.xiv.ciB();
    }
    GMTrace.o(1996891357184L, 14878);
  }
  
  protected final void MP()
  {
    GMTrace.i(1996220268544L, 14873);
    oM(R.l.dKA);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(16862175821824L, 125633);
        MultiStageCitySelectUI.l(MultiStageCitySelectUI.this);
        MultiStageCitySelectUI.this.finish();
        GMTrace.o(16862175821824L, 125633);
        return true;
      }
    });
    this.xiq = getIntent().getBooleanExtra("GetAddress", false);
    this.countryCode = getIntent().getStringExtra("Country");
    this.goV = getIntent().getStringExtra("Provice");
    this.gLy = getIntent().getStringExtra("CountryName");
    this.xil = getIntent().getStringExtra("ProviceName");
    Intent localIntent = getIntent();
    boolean bool;
    if (!bg.Jw())
    {
      bool = true;
      this.xir = localIntent.getBooleanExtra("IsAutoPosition", bool);
      this.xin = getIntent().getBooleanExtra("IsRealNameVerifyScene", false);
      this.xit = getIntent().getBooleanExtra("IsSelectNonChinaCountry", false);
      this.xiu = getIntent().getBooleanExtra("IsNeedShowSearchBar", false);
      w.i("MicroMsg.MultiStageCitySelectUI", " country = " + this.countryCode + " province =" + this.goV + " city = " + this.goU + " " + this.gLy + " " + this.xil + " " + this.xin + " " + this.xit);
      if (!this.xin) {
        break label304;
      }
      this.eOh = 3;
    }
    for (;;)
    {
      cio();
      GMTrace.o(1996220268544L, 14873);
      return;
      bool = false;
      break;
      label304:
      if (this.countryCode == null)
      {
        this.eOh = 0;
        this.goV = null;
        this.goU = null;
      }
      else if (this.goV == null)
      {
        this.eOh = 1;
        this.goU = null;
      }
      else
      {
        this.eOh = 2;
      }
    }
  }
  
  public final int QI()
  {
    GMTrace.i(1996086050816L, 14872);
    int i = R.i.cId;
    GMTrace.o(1996086050816L, 14872);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(1996757139456L, 14877);
    Object localObject2;
    Object localObject1;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (paramk.getType() != 665) {
        break label354;
      }
      paramString = (com.tencent.mm.modelsimple.n)paramk;
      paramk = paramString.country;
      localObject2 = paramString.fjk;
      String str = paramString.fjl;
      w.i("MicroMsg.MultiStageCitySelectUI", "current location country %s, province %s, city %s", new Object[] { paramk, localObject2, str });
      RegionCodeDecoder.Region[] arrayOfRegion = RegionCodeDecoder.bUl().bUn();
      localObject1 = null;
      paramInt2 = arrayOfRegion.length;
      paramInt1 = 0;
      if (paramInt1 >= paramInt2) {
        break label364;
      }
      paramString = arrayOfRegion[paramInt1];
      if (paramString.getCode().equalsIgnoreCase(paramk))
      {
        localObject1 = RegionCodeDecoder.bUl().Uw(paramString.getCode());
        paramInt2 = localObject1.length;
        paramInt1 = 0;
        label137:
        if (paramInt1 < paramInt2)
        {
          paramk = localObject1[paramInt1];
          if (paramk.getCode().equalsIgnoreCase((String)localObject2))
          {
            localObject1 = RegionCodeDecoder.bUl().fh(paramString.getCode(), paramk.getCode());
            paramInt2 = localObject1.length;
            paramInt1 = 0;
            label184:
            if (paramInt1 < paramInt2)
            {
              localObject2 = localObject1[paramInt1];
              if (((RegionCodeDecoder.Region)localObject2).getCode().equalsIgnoreCase(str))
              {
                localObject1 = paramString;
                paramString = (String)localObject2;
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      if ((localObject1 == null) && (paramk == null) && (paramString == null))
      {
        if (this.xiv == null) {
          break label340;
        }
        this.xiv.ciB();
        GMTrace.o(1996757139456L, 14877);
        return;
        paramInt1 += 1;
        break label184;
        localObject2 = null;
        localObject1 = paramString;
        paramString = (String)localObject2;
        continue;
        paramInt1 += 1;
        break label137;
        localObject1 = paramString;
        paramString = null;
        paramk = null;
        continue;
        paramInt1 += 1;
        break;
      }
      if (this.xiv != null)
      {
        localObject2 = this.xiv;
        ((ZoneRecommandPreference)localObject2).status = 1;
        ((ZoneRecommandPreference)localObject2).xka = ((RegionCodeDecoder.Region)localObject1);
        ((ZoneRecommandPreference)localObject2).xkb = paramk;
        ((ZoneRecommandPreference)localObject2).xkc = paramString;
        ((ZoneRecommandPreference)localObject2).ciA();
      }
      label340:
      GMTrace.o(1996757139456L, 14877);
      return;
      cir();
      label354:
      GMTrace.o(1996757139456L, 14877);
      return;
      label364:
      paramk = null;
      paramString = null;
    }
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    Object localObject3 = null;
    GMTrace.i(1996354486272L, 14874);
    Object localObject1;
    label118:
    label630:
    Object localObject2;
    if ((paramPreference instanceof ZonePreference))
    {
      paramPreference = ((ZonePreference)paramPreference).xjX;
      if ((paramPreference == null) || (bg.nm(paramPreference.getCode())))
      {
        localObject1 = new StringBuilder("onPreferenceTreeClick error item, code:");
        if (paramPreference == null)
        {
          paramf = Integer.valueOf(-1);
          localObject1 = ((StringBuilder)localObject1).append(paramf).append(" ,name:");
          if (paramPreference != null) {
            break label118;
          }
        }
        for (paramf = "null";; paramf = paramPreference.getName())
        {
          w.e("MicroMsg.MultiStageCitySelectUI", paramf);
          GMTrace.o(1996354486272L, 14874);
          return false;
          paramf = paramPreference.getCode();
          break;
        }
      }
      if (this.eOh == 3)
      {
        this.countryCode = "CN";
        this.goV = paramPreference.getCode();
        this.xil = paramPreference.getName();
      }
      if (this.eOh == 0)
      {
        this.countryCode = paramPreference.getCode();
        this.gLy = paramPreference.getName();
        if (paramPreference.hasChildren()) {
          break label630;
        }
        if (!this.xiq)
        {
          at.AR();
          com.tencent.mm.y.c.xh().set(12324, this.countryCode);
          at.AR();
          com.tencent.mm.y.c.xh().set(12325, this.goV);
          at.AR();
          com.tencent.mm.y.c.xh().set(12326, this.goU);
        }
        paramf = new Intent();
        paramf.putExtra("CountryName", this.gLy);
        paramf.putExtra("ProviceName", this.xil);
        paramf.putExtra("CityName", this.xim);
        paramf.putExtra("Country", this.countryCode);
        paramf.putExtra("Contact_Province", this.goV);
        paramf.putExtra("Contact_City", this.goU);
        aLo();
        setResult(-1, paramf);
        finish();
      }
      for (;;)
      {
        GMTrace.o(1996354486272L, 14874);
        return true;
        if (this.eOh == 1)
        {
          this.goV = paramPreference.getCode();
          this.xil = paramPreference.getName();
          break;
        }
        if (this.eOh == 2)
        {
          this.goU = paramPreference.getCode();
          this.xim = paramPreference.getName();
          if (("CN".equalsIgnoreCase(this.countryCode)) || ("HK".equalsIgnoreCase(this.countryCode)) || ("MO".equalsIgnoreCase(this.countryCode)) || ("TW".equalsIgnoreCase(this.countryCode)))
          {
            this.gLy = null;
            break;
          }
          this.xil = null;
          break;
        }
        if (this.eOh != 4) {
          break;
        }
        if ((paramPreference.getParent() != null) && (!paramPreference.hasChildren()))
        {
          this.goU = paramPreference.getCode();
          this.xim = paramPreference.getName();
          this.goV = paramPreference.getParent().getCode();
          this.xil = paramPreference.getParent().getName();
          this.countryCode = paramPreference.getCountryCode();
          this.gLy = null;
          break;
        }
        if ((paramPreference.hasChildren()) && (paramPreference.getParent() != null))
        {
          this.goV = paramPreference.getCode();
          this.xil = paramPreference.getName();
          this.countryCode = paramPreference.getCountryCode();
          this.gLy = null;
          break;
        }
        this.countryCode = paramPreference.getCode();
        this.gLy = paramPreference.getName();
        this.goV = null;
        this.xil = null;
        this.goU = null;
        this.xim = null;
        break;
        localObject1 = new Intent(this, MultiStageCitySelectUI.class);
        localObject2 = new Bundle();
        ((Bundle)localObject2).putString("Country", this.countryCode);
        ((Bundle)localObject2).putString("Provice", this.goV);
        ((Bundle)localObject2).putString("CountryName", this.gLy);
        ((Bundle)localObject2).putString("ProviceName", this.xil);
        ((Bundle)localObject2).putBoolean("GetAddress", this.xiq);
        ((Bundle)localObject2).putBoolean("ShowSelectedLocation", this.xis);
        if (this.xin)
        {
          paramPreference = paramPreference.getCountryCode();
          paramf = paramPreference;
          if (bg.nm(paramPreference)) {
            paramf = this.countryCode;
          }
          if (("CN".equalsIgnoreCase(paramf)) || ("HK".equalsIgnoreCase(paramf)) || ("MO".equalsIgnoreCase(paramf)) || ("TW".equalsIgnoreCase(paramf))) {
            ((Bundle)localObject2).putBoolean("IsNeedShowSearchBar", true);
          }
        }
        ((Intent)localObject1).putExtras((Bundle)localObject2);
        aLo();
        startActivityForResult((Intent)localObject1, 1);
      }
    }
    int i;
    RegionCodeDecoder.Region[] arrayOfRegion;
    label902:
    label927:
    label952:
    label970:
    label979:
    label989:
    label998:
    label1044:
    Intent localIntent;
    if (paramPreference.hiu.equals("current_location"))
    {
      if (this.xiv.status != 1) {
        break label1160;
      }
      i = 1;
      if (i != 0)
      {
        paramf = this.xiv;
        arrayOfRegion = new RegionCodeDecoder.Region[3];
        arrayOfRegion[0] = paramf.xka;
        arrayOfRegion[1] = paramf.xkb;
        arrayOfRegion[2] = paramf.xkc;
        at.AR();
        paramPreference = com.tencent.mm.y.c.xh();
        if (arrayOfRegion[0] != null) {
          break label1165;
        }
        paramf = null;
        paramPreference.set(12324, paramf);
        at.AR();
        paramPreference = com.tencent.mm.y.c.xh();
        if (arrayOfRegion[1] != null) {
          break label1176;
        }
        paramf = null;
        paramPreference.set(12325, paramf);
        at.AR();
        paramPreference = com.tencent.mm.y.c.xh();
        if (arrayOfRegion[2] != null) {
          break label1187;
        }
        paramf = null;
        paramPreference.set(12326, paramf);
        if (arrayOfRegion[0] != null) {
          break label1198;
        }
        localObject1 = null;
        if (arrayOfRegion[0] != null) {
          break label1210;
        }
        paramf = null;
        if (arrayOfRegion[1] != null) {
          break label1221;
        }
        localObject2 = null;
        if (arrayOfRegion[1] != null) {
          break label1233;
        }
        paramPreference = null;
        if ((!"CN".equalsIgnoreCase((String)localObject1)) && (!"HK".equalsIgnoreCase((String)localObject1)) && (!"MO".equalsIgnoreCase((String)localObject1)) && (!"TW".equalsIgnoreCase((String)localObject1))) {
          break label1244;
        }
        paramf = null;
        localIntent = new Intent();
        localIntent.putExtra("CountryName", paramf);
        localIntent.putExtra("ProviceName", paramPreference);
        if (arrayOfRegion[2] != null) {
          break label1249;
        }
        paramf = null;
        label1082:
        localIntent.putExtra("CityName", paramf);
        localIntent.putExtra("Country", (String)localObject1);
        localIntent.putExtra("Contact_Province", (String)localObject2);
        if (arrayOfRegion[2] != null) {
          break label1260;
        }
      }
    }
    label1160:
    label1165:
    label1176:
    label1187:
    label1198:
    label1210:
    label1221:
    label1233:
    label1244:
    label1249:
    label1260:
    for (paramf = (f)localObject3;; paramf = arrayOfRegion[2].getCode())
    {
      localIntent.putExtra("Contact_City", paramf);
      aLo();
      setResult(-1, localIntent);
      finish();
      GMTrace.o(1996354486272L, 14874);
      return false;
      i = 0;
      break;
      paramf = arrayOfRegion[0].getCode();
      break label902;
      paramf = arrayOfRegion[1].getCode();
      break label927;
      paramf = arrayOfRegion[2].getCode();
      break label952;
      localObject1 = arrayOfRegion[0].getCode();
      break label970;
      paramf = arrayOfRegion[0].getName();
      break label979;
      localObject2 = arrayOfRegion[1].getCode();
      break label989;
      paramPreference = arrayOfRegion[1].getName();
      break label998;
      paramPreference = null;
      break label1044;
      paramf = arrayOfRegion[2].getName();
      break label1082;
    }
  }
  
  public final void cio()
  {
    GMTrace.i(1995414962176L, 14867);
    if (this.eOh == 3) {
      localObject1 = RegionCodeDecoder.bUl().Uw("CN");
    }
    for (;;)
    {
      this.xip = ((RegionCodeDecoder.Region[])localObject1);
      if ((this.xip != null) && (this.xip.length > 0)) {
        break;
      }
      w.e("MicroMsg.MultiStageCitySelectUI", "initZoneItems error ,check zone lists!");
      GMTrace.o(1995414962176L, 14867);
      return;
      if (bg.nm(this.countryCode))
      {
        localObject2 = RegionCodeDecoder.bUl().bUn();
        localObject1 = localObject2;
        if (this.xit)
        {
          localObject3 = new ArrayList();
          if (localObject2 != null)
          {
            int j = localObject2.length;
            i = 0;
            while (i < j)
            {
              localObject1 = localObject2[i];
              if ((!"CN".equalsIgnoreCase(((RegionCodeDecoder.Region)localObject1).getCode())) && (!"HK".equalsIgnoreCase(((RegionCodeDecoder.Region)localObject1).getCode())) && (!"TW".equalsIgnoreCase(((RegionCodeDecoder.Region)localObject1).getCode())) && (!"MO".equalsIgnoreCase(((RegionCodeDecoder.Region)localObject1).getCode()))) {
                ((List)localObject3).add(localObject1);
              }
              i += 1;
            }
          }
          localObject1 = new RegionCodeDecoder.Region[((List)localObject3).size()];
          ((List)localObject3).toArray((Object[])localObject1);
        }
      }
      else if (bg.nm(this.goV))
      {
        localObject1 = RegionCodeDecoder.bUl().Uw(this.countryCode);
      }
      else
      {
        localObject1 = RegionCodeDecoder.bUl().fh(this.countryCode, this.goV);
      }
    }
    this.htU.removeAll();
    at.AR();
    Object localObject1 = (String)com.tencent.mm.y.c.xh().get(12324, null);
    at.AR();
    Object localObject2 = (String)com.tencent.mm.y.c.xh().get(12325, null);
    at.AR();
    Object localObject3 = (String)com.tencent.mm.y.c.xh().get(12326, null);
    this.xis = getIntent().getBooleanExtra("ShowSelectedLocation", true);
    int i = 0;
    if (i < this.xip.length)
    {
      ZonePreference localZonePreference;
      if ((this.xip[i] != null) && (!bg.nm(this.xip[i].getCode())) && (!bg.nm(this.xip[i].getName())))
      {
        localZonePreference = new ZonePreference(this);
        localZonePreference.a(this.xip[i]);
        if (!this.xis) {
          break label575;
        }
        if ((this.eOh != 0) || (!this.xip[i].getCode().equalsIgnoreCase((String)localObject1))) {
          break label465;
        }
        this.htU.a(localZonePreference, 0);
        localZonePreference.setSummary(R.l.dYp);
      }
      for (;;)
      {
        i += 1;
        break;
        label465:
        if ((this.eOh == 1) && (this.xip[i].getCode().equalsIgnoreCase((String)localObject2)))
        {
          this.htU.a(localZonePreference, 0);
          localZonePreference.setSummary(R.l.dYp);
        }
        else if ((this.eOh == 2) && (this.xip[i].getCode().equalsIgnoreCase((String)localObject3)))
        {
          this.htU.a(localZonePreference, 0);
          localZonePreference.setSummary(R.l.dYp);
        }
        else
        {
          this.htU.a(localZonePreference);
          continue;
          label575:
          this.htU.a(localZonePreference);
        }
      }
    }
    if (this.eOh == 3)
    {
      localObject1 = new ZoneSelectOtherCountryPreference(this);
      ((ZoneSelectOtherCountryPreference)localObject1).text = getString(R.l.dYl);
      ((ZoneSelectOtherCountryPreference)localObject1).xkf = new ZoneSelectOtherCountryPreference.a()
      {
        public final void onClick()
        {
          GMTrace.i(16858820378624L, 125608);
          Intent localIntent = new Intent(MultiStageCitySelectUI.this, MultiStageCitySelectUI.class);
          Bundle localBundle = new Bundle();
          localBundle.putBoolean("GetAddress", MultiStageCitySelectUI.e(MultiStageCitySelectUI.this));
          localBundle.putBoolean("ShowSelectedLocation", MultiStageCitySelectUI.f(MultiStageCitySelectUI.this));
          localBundle.putBoolean("IsSelectNonChinaCountry", true);
          localBundle.putBoolean("IsAutoPosition", false);
          localBundle.putBoolean("IsNeedShowSearchBar", true);
          localIntent.putExtras(localBundle);
          MultiStageCitySelectUI.this.startActivityForResult(localIntent, 1);
          GMTrace.o(16858820378624L, 125608);
        }
      };
      this.htU.a((Preference)localObject1);
    }
    localObject1 = new PreferenceCategory(this.vKB.vKW);
    this.htU.a((Preference)localObject1);
    if ((this.eOh == 0) || (this.eOh == 3))
    {
      if (this.xir)
      {
        localObject1 = new PreferenceTitleCategory(this);
        ((PreferenceTitleCategory)localObject1).setTitle(R.l.dYj);
        this.htU.a((Preference)localObject1, 0);
        this.xiv = new ZoneRecommandPreference(this);
        this.xiv.setKey("current_location");
        this.htU.a(this.xiv, 1);
      }
      localObject1 = new PreferenceTitleCategory(this);
      ((PreferenceTitleCategory)localObject1).setTitle(R.l.dYi);
      if (this.xir)
      {
        this.htU.a((Preference)localObject1, 2);
        if (this.gxh == null) {
          this.gxh = com.tencent.mm.modelgeo.c.Ir();
        }
        this.gxh.b(this.fJt);
        GMTrace.o(1995414962176L, 14867);
        return;
      }
      this.htU.a((Preference)localObject1, 0);
    }
    GMTrace.o(1995414962176L, 14867);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(1996622921728L, 14876);
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(1996622921728L, 14876);
      return;
      if (paramInt2 == -1)
      {
        setResult(-1, paramIntent);
        finish();
      }
    }
  }
  
  public void onBackPressed()
  {
    GMTrace.i(1996488704000L, 14875);
    cip();
    super.onBackPressed();
    GMTrace.o(1996488704000L, 14875);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(1995683397632L, 14869);
    super.onCreate(paramBundle);
    at.wS().a(665, this);
    this.htU = this.wky;
    MP();
    long l;
    if (this.xiu) {
      if ((xiw == null) || (xiw.size() <= 0))
      {
        l = bg.Pw();
        paramBundle = RegionCodeDecoder.bUl().bUn();
        if ((paramBundle != null) && (paramBundle.length > 0)) {
          break label113;
        }
      }
    }
    for (;;)
    {
      a(this.jQL);
      this.jQL.xiS = new p.b()
      {
        public final void QA()
        {
          GMTrace.i(16861773168640L, 125630);
          MultiStageCitySelectUI.g(MultiStageCitySelectUI.this);
          MultiStageCitySelectUI.this.cio();
          GMTrace.o(16861773168640L, 125630);
        }
        
        public final void QB()
        {
          GMTrace.i(16861907386368L, 125631);
          GMTrace.o(16861907386368L, 125631);
        }
        
        public final void Qy()
        {
          GMTrace.i(16861370515456L, 125627);
          MultiStageCitySelectUI.this.aLo();
          MultiStageCitySelectUI.g(MultiStageCitySelectUI.this);
          MultiStageCitySelectUI.this.cio();
          GMTrace.o(16861370515456L, 125627);
        }
        
        public final void Qz()
        {
          GMTrace.i(16861236297728L, 125626);
          GMTrace.o(16861236297728L, 125626);
        }
        
        public final boolean nC(String paramAnonymousString)
        {
          GMTrace.i(16861638950912L, 125629);
          if (!bg.nm(paramAnonymousString))
          {
            MultiStageCitySelectUI.a(MultiStageCitySelectUI.this, paramAnonymousString);
            MultiStageCitySelectUI.h(MultiStageCitySelectUI.this).removeAll();
            MultiStageCitySelectUI.j(MultiStageCitySelectUI.this).removeCallbacks(MultiStageCitySelectUI.i(MultiStageCitySelectUI.this));
            MultiStageCitySelectUI.j(MultiStageCitySelectUI.this).postDelayed(MultiStageCitySelectUI.i(MultiStageCitySelectUI.this), 50L);
            GMTrace.o(16861638950912L, 125629);
            return true;
          }
          GMTrace.o(16861638950912L, 125629);
          return false;
        }
        
        public final void nD(String paramAnonymousString)
        {
          GMTrace.i(16861504733184L, 125628);
          if (!bg.nm(paramAnonymousString))
          {
            MultiStageCitySelectUI.a(MultiStageCitySelectUI.this, paramAnonymousString);
            MultiStageCitySelectUI.h(MultiStageCitySelectUI.this).removeAll();
            MultiStageCitySelectUI.j(MultiStageCitySelectUI.this).removeCallbacks(MultiStageCitySelectUI.i(MultiStageCitySelectUI.this));
            MultiStageCitySelectUI.j(MultiStageCitySelectUI.this).postDelayed(MultiStageCitySelectUI.i(MultiStageCitySelectUI.this), 50L);
          }
          GMTrace.o(16861504733184L, 125628);
        }
      };
      GMTrace.o(1995683397632L, 14869);
      return;
      label113:
      if ((xiw == null) || (xiw.size() <= 0))
      {
        paramBundle = ciq();
        xiw = paramBundle;
        if (paramBundle != null) {
          w.i("MicroMsg.MultiStageCitySelectUI", "buildAllSearchRegion used %sms, size: %s", new Object[] { Long.valueOf(bg.aI(l)), Integer.valueOf(xiw.size()) });
        }
      }
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(1995951833088L, 14871);
    at.wS().b(665, this);
    if (this.gxh != null) {
      this.gxh.c(this.fJt);
    }
    super.onDestroy();
    GMTrace.o(1995951833088L, 14871);
  }
  
  protected void onResume()
  {
    GMTrace.i(1995817615360L, 14870);
    super.onResume();
    GMTrace.o(1995817615360L, 14870);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\tools\MultiStageCitySelectUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */