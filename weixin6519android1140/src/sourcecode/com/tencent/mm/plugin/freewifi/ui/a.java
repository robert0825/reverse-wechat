package com.tencent.mm.plugin.freewifi.ui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.bh;
import com.tencent.mm.g.a.bh.a;
import com.tencent.mm.pluginsdk.ui.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.lang.ref.WeakReference;
import java.util.Date;

public final class a
  extends b
{
  public static Date lsC;
  private boolean hasInit;
  private Runnable lsD;
  
  static
  {
    GMTrace.i(14553094029312L, 108429);
    lsC = null;
    GMTrace.o(14553094029312L, 108429);
  }
  
  public a(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(14551751852032L, 108419);
    this.hasInit = false;
    this.lsD = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14551617634304L, 108418);
        final View localView = a.b(a.this).findViewById(R.h.bBS);
        if (am.getNetType(ab.getContext()) != 0)
        {
          localView.setVisibility(8);
          GMTrace.o(14551617634304L, 108418);
          return;
        }
        at.xB().A(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(14553630900224L, 108433);
            final bh localbh = new bh();
            long l = System.currentTimeMillis();
            com.tencent.mm.sdk.b.a.vgX.m(localbh);
            w.i("MicroMsg.FreeWifi.FreeWifiBanner", "summeranrt CheckWechatFreeWifiEvent take[%d]ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
            af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(14553899335680L, 108435);
                if (bg.nm(localbh.eCB.eCG))
                {
                  a.2.1.this.lsF.setVisibility(8);
                  GMTrace.o(14553899335680L, 108435);
                  return;
                }
                ((TextView)a.c(a.this).findViewById(R.h.bBi)).setText(localbh.eCB.eCG);
                final String str2 = localbh.eCB.eCD;
                if ("0".equalsIgnoreCase(localbh.eCB.eCC)) {}
                final String str3;
                final String str4;
                final String str5;
                final String str6;
                for (String str1 = "0";; str1 = "1")
                {
                  str3 = localbh.eCB.eCE;
                  str4 = localbh.eCB.ssid;
                  str5 = localbh.eCB.bssid;
                  str6 = localbh.eCB.eCF;
                  w.i("MicroMsg.FreeWifi.FreeWifiBanner", "desc=it tries to show bar. pingEnabled = %s,  pingUrl= %s", new Object[] { str1, str2 });
                  if ("1".equals(str1)) {
                    break;
                  }
                  a.2.1.this.lsF.setVisibility(0);
                  GMTrace.o(14553899335680L, 108435);
                  return;
                }
                at.xB().A(new Runnable()
                {
                  /* Error */
                  public final void run()
                  {
                    // Byte code:
                    //   0: ldc2_w 57
                    //   3: ldc 59
                    //   5: invokestatic 50	com/tencent/gmtrace/GMTrace:i	(JI)V
                    //   8: ldc 61
                    //   10: ldc 63
                    //   12: iconst_1
                    //   13: anewarray 4	java/lang/Object
                    //   16: dup
                    //   17: iconst_0
                    //   18: aload_0
                    //   19: getfield 31	com/tencent/mm/plugin/freewifi/ui/a$2$1$1$1:lsJ	Ljava/lang/String;
                    //   22: aastore
                    //   23: invokestatic 68	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
                    //   26: aconst_null
                    //   27: astore 5
                    //   29: aconst_null
                    //   30: astore 7
                    //   32: aload 5
                    //   34: astore 4
                    //   36: new 70	java/net/URL
                    //   39: dup
                    //   40: aload_0
                    //   41: getfield 31	com/tencent/mm/plugin/freewifi/ui/a$2$1$1$1:lsJ	Ljava/lang/String;
                    //   44: invokespecial 73	java/net/URL:<init>	(Ljava/lang/String;)V
                    //   47: astore 6
                    //   49: aload 5
                    //   51: astore 4
                    //   53: invokestatic 79	java/lang/System:currentTimeMillis	()J
                    //   56: lstore_2
                    //   57: aload 5
                    //   59: astore 4
                    //   61: aload 6
                    //   63: invokevirtual 83	java/net/URL:openConnection	()Ljava/net/URLConnection;
                    //   66: checkcast 85	java/net/HttpURLConnection
                    //   69: astore 5
                    //   71: aload 5
                    //   73: ifnull +184 -> 257
                    //   76: aload 5
                    //   78: sipush 5000
                    //   81: invokevirtual 89	java/net/HttpURLConnection:setConnectTimeout	(I)V
                    //   84: aload 5
                    //   86: sipush 5000
                    //   89: invokevirtual 92	java/net/HttpURLConnection:setReadTimeout	(I)V
                    //   92: aload 5
                    //   94: iconst_0
                    //   95: invokevirtual 96	java/net/HttpURLConnection:setInstanceFollowRedirects	(Z)V
                    //   98: aload 5
                    //   100: iconst_0
                    //   101: invokevirtual 99	java/net/HttpURLConnection:setUseCaches	(Z)V
                    //   104: aload 5
                    //   106: ldc 101
                    //   108: ldc 103
                    //   110: invokevirtual 107	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
                    //   113: aload 5
                    //   115: ldc 109
                    //   117: ldc 103
                    //   119: invokevirtual 107	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
                    //   122: aload 5
                    //   124: invokevirtual 113	java/net/HttpURLConnection:getResponseCode	()I
                    //   127: istore_1
                    //   128: invokestatic 79	java/lang/System:currentTimeMillis	()J
                    //   131: lload_2
                    //   132: lsub
                    //   133: lstore_2
                    //   134: getstatic 119	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
                    //   137: sipush 12907
                    //   140: bipush 10
                    //   142: anewarray 4	java/lang/Object
                    //   145: dup
                    //   146: iconst_0
                    //   147: aload_0
                    //   148: getfield 33	com/tencent/mm/plugin/freewifi/ui/a$2$1$1$1:lpz	Ljava/lang/String;
                    //   151: aastore
                    //   152: dup
                    //   153: iconst_1
                    //   154: aload_0
                    //   155: getfield 35	com/tencent/mm/plugin/freewifi/ui/a$2$1$1$1:lpA	Ljava/lang/String;
                    //   158: aastore
                    //   159: dup
                    //   160: iconst_2
                    //   161: aload_0
                    //   162: getfield 37	com/tencent/mm/plugin/freewifi/ui/a$2$1$1$1:lsK	Ljava/lang/String;
                    //   165: aastore
                    //   166: dup
                    //   167: iconst_3
                    //   168: aload_0
                    //   169: getfield 39	com/tencent/mm/plugin/freewifi/ui/a$2$1$1$1:lpn	Ljava/lang/String;
                    //   172: aastore
                    //   173: dup
                    //   174: iconst_4
                    //   175: ldc 121
                    //   177: aastore
                    //   178: dup
                    //   179: iconst_5
                    //   180: lload_2
                    //   181: invokestatic 127	java/lang/Long:valueOf	(J)Ljava/lang/Long;
                    //   184: aastore
                    //   185: dup
                    //   186: bipush 6
                    //   188: iload_1
                    //   189: invokestatic 132	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
                    //   192: aastore
                    //   193: dup
                    //   194: bipush 7
                    //   196: ldc 121
                    //   198: aastore
                    //   199: dup
                    //   200: bipush 8
                    //   202: ldc 121
                    //   204: aastore
                    //   205: dup
                    //   206: bipush 9
                    //   208: ldc 121
                    //   210: aastore
                    //   211: invokevirtual 135	com/tencent/mm/plugin/report/service/g:i	(I[Ljava/lang/Object;)V
                    //   214: ldc 61
                    //   216: ldc -119
                    //   218: iconst_2
                    //   219: anewarray 4	java/lang/Object
                    //   222: dup
                    //   223: iconst_0
                    //   224: iload_1
                    //   225: invokestatic 132	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
                    //   228: aastore
                    //   229: dup
                    //   230: iconst_1
                    //   231: lload_2
                    //   232: invokestatic 127	java/lang/Long:valueOf	(J)Ljava/lang/Long;
                    //   235: aastore
                    //   236: invokestatic 68	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
                    //   239: sipush 200
                    //   242: iload_1
                    //   243: if_icmpne +33 -> 276
                    //   246: new 17	com/tencent/mm/plugin/freewifi/ui/a$2$1$1$1$1
                    //   249: dup
                    //   250: aload_0
                    //   251: invokespecial 140	com/tencent/mm/plugin/freewifi/ui/a$2$1$1$1$1:<init>	(Lcom/tencent/mm/plugin/freewifi/ui/a$2$1$1$1;)V
                    //   254: invokestatic 146	com/tencent/mm/sdk/platformtools/af:t	(Ljava/lang/Runnable;)V
                    //   257: aload 5
                    //   259: ifnull +331 -> 590
                    //   262: aload 5
                    //   264: invokevirtual 149	java/net/HttpURLConnection:disconnect	()V
                    //   267: ldc2_w 57
                    //   270: ldc 59
                    //   272: invokestatic 53	com/tencent/gmtrace/GMTrace:o	(JI)V
                    //   275: return
                    //   276: sipush 302
                    //   279: iload_1
                    //   280: if_icmpne -23 -> 257
                    //   283: ldc 61
                    //   285: ldc -105
                    //   287: iconst_1
                    //   288: anewarray 4	java/lang/Object
                    //   291: dup
                    //   292: iconst_0
                    //   293: aload 5
                    //   295: ldc -103
                    //   297: invokevirtual 157	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
                    //   300: aastore
                    //   301: invokestatic 68	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
                    //   304: goto -47 -> 257
                    //   307: astore 6
                    //   309: aload 5
                    //   311: astore 4
                    //   313: new 159	java/io/StringWriter
                    //   316: dup
                    //   317: invokespecial 160	java/io/StringWriter:<init>	()V
                    //   320: astore 7
                    //   322: aload 5
                    //   324: astore 4
                    //   326: aload 6
                    //   328: new 162	java/io/PrintWriter
                    //   331: dup
                    //   332: aload 7
                    //   334: invokespecial 165	java/io/PrintWriter:<init>	(Ljava/io/Writer;)V
                    //   337: invokevirtual 169	java/lang/Exception:printStackTrace	(Ljava/io/PrintWriter;)V
                    //   340: aload 5
                    //   342: astore 4
                    //   344: aload 7
                    //   346: invokevirtual 173	java/io/StringWriter:toString	()Ljava/lang/String;
                    //   349: astore 7
                    //   351: aload 5
                    //   353: astore 4
                    //   355: ldc 61
                    //   357: new 175	java/lang/StringBuilder
                    //   360: dup
                    //   361: ldc -79
                    //   363: invokespecial 178	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
                    //   366: aload 7
                    //   368: invokevirtual 182	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
                    //   371: invokevirtual 183	java/lang/StringBuilder:toString	()Ljava/lang/String;
                    //   374: invokestatic 185	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
                    //   377: aload 7
                    //   379: astore 6
                    //   381: aload 7
                    //   383: ifnonnull +7 -> 390
                    //   386: ldc 121
                    //   388: astore 6
                    //   390: aload 5
                    //   392: astore 4
                    //   394: getstatic 119	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
                    //   397: astore 8
                    //   399: aload 5
                    //   401: astore 4
                    //   403: aload_0
                    //   404: getfield 33	com/tencent/mm/plugin/freewifi/ui/a$2$1$1$1:lpz	Ljava/lang/String;
                    //   407: astore 9
                    //   409: aload 5
                    //   411: astore 4
                    //   413: aload_0
                    //   414: getfield 35	com/tencent/mm/plugin/freewifi/ui/a$2$1$1$1:lpA	Ljava/lang/String;
                    //   417: astore 10
                    //   419: aload 5
                    //   421: astore 4
                    //   423: aload_0
                    //   424: getfield 37	com/tencent/mm/plugin/freewifi/ui/a$2$1$1$1:lsK	Ljava/lang/String;
                    //   427: astore 11
                    //   429: aload 5
                    //   431: astore 4
                    //   433: aload_0
                    //   434: getfield 39	com/tencent/mm/plugin/freewifi/ui/a$2$1$1$1:lpn	Ljava/lang/String;
                    //   437: astore 12
                    //   439: aload 6
                    //   441: astore 7
                    //   443: aload 5
                    //   445: astore 4
                    //   447: aload 6
                    //   449: invokevirtual 190	java/lang/String:length	()I
                    //   452: sipush 1024
                    //   455: if_icmple +18 -> 473
                    //   458: aload 5
                    //   460: astore 4
                    //   462: aload 6
                    //   464: iconst_0
                    //   465: sipush 1024
                    //   468: invokevirtual 194	java/lang/String:substring	(II)Ljava/lang/String;
                    //   471: astore 7
                    //   473: aload 5
                    //   475: astore 4
                    //   477: aload 8
                    //   479: sipush 12907
                    //   482: bipush 10
                    //   484: anewarray 4	java/lang/Object
                    //   487: dup
                    //   488: iconst_0
                    //   489: aload 9
                    //   491: aastore
                    //   492: dup
                    //   493: iconst_1
                    //   494: aload 10
                    //   496: aastore
                    //   497: dup
                    //   498: iconst_2
                    //   499: aload 11
                    //   501: aastore
                    //   502: dup
                    //   503: iconst_3
                    //   504: aload 12
                    //   506: aastore
                    //   507: dup
                    //   508: iconst_4
                    //   509: ldc 121
                    //   511: aastore
                    //   512: dup
                    //   513: iconst_5
                    //   514: iconst_0
                    //   515: invokestatic 132	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
                    //   518: aastore
                    //   519: dup
                    //   520: bipush 6
                    //   522: iconst_0
                    //   523: invokestatic 132	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
                    //   526: aastore
                    //   527: dup
                    //   528: bipush 7
                    //   530: ldc 121
                    //   532: aastore
                    //   533: dup
                    //   534: bipush 8
                    //   536: ldc 121
                    //   538: aastore
                    //   539: dup
                    //   540: bipush 9
                    //   542: aload 7
                    //   544: aastore
                    //   545: invokevirtual 135	com/tencent/mm/plugin/report/service/g:i	(I[Ljava/lang/Object;)V
                    //   548: aload 5
                    //   550: ifnull +40 -> 590
                    //   553: aload 5
                    //   555: invokevirtual 149	java/net/HttpURLConnection:disconnect	()V
                    //   558: ldc2_w 57
                    //   561: ldc 59
                    //   563: invokestatic 53	com/tencent/gmtrace/GMTrace:o	(JI)V
                    //   566: return
                    //   567: astore 6
                    //   569: aload 4
                    //   571: astore 5
                    //   573: aload 6
                    //   575: astore 4
                    //   577: aload 5
                    //   579: ifnull +8 -> 587
                    //   582: aload 5
                    //   584: invokevirtual 149	java/net/HttpURLConnection:disconnect	()V
                    //   587: aload 4
                    //   589: athrow
                    //   590: ldc2_w 57
                    //   593: ldc 59
                    //   595: invokestatic 53	com/tencent/gmtrace/GMTrace:o	(JI)V
                    //   598: return
                    //   599: astore 4
                    //   601: goto -24 -> 577
                    //   604: astore 6
                    //   606: aload 7
                    //   608: astore 5
                    //   610: goto -301 -> 309
                    // Local variable table:
                    //   start	length	slot	name	signature
                    //   0	613	0	this	1
                    //   127	154	1	i	int
                    //   56	176	2	l	long
                    //   34	554	4	localObject1	Object
                    //   599	1	4	localObject2	Object
                    //   27	582	5	localObject3	Object
                    //   47	15	6	localURL	java.net.URL
                    //   307	20	6	localException1	Exception
                    //   379	84	6	localObject4	Object
                    //   567	7	6	localObject5	Object
                    //   604	1	6	localException2	Exception
                    //   30	577	7	localObject6	Object
                    //   397	81	8	localg	com.tencent.mm.plugin.report.service.g
                    //   407	83	9	str1	String
                    //   417	78	10	str2	String
                    //   427	73	11	str3	String
                    //   437	68	12	str4	String
                    // Exception table:
                    //   from	to	target	type
                    //   76	239	307	java/lang/Exception
                    //   246	257	307	java/lang/Exception
                    //   283	304	307	java/lang/Exception
                    //   36	49	567	finally
                    //   53	57	567	finally
                    //   61	71	567	finally
                    //   313	322	567	finally
                    //   326	340	567	finally
                    //   344	351	567	finally
                    //   355	377	567	finally
                    //   394	399	567	finally
                    //   403	409	567	finally
                    //   413	419	567	finally
                    //   423	429	567	finally
                    //   433	439	567	finally
                    //   447	458	567	finally
                    //   462	473	567	finally
                    //   477	548	567	finally
                    //   76	239	599	finally
                    //   246	257	599	finally
                    //   283	304	599	finally
                    //   36	49	604	java/lang/Exception
                    //   53	57	604	java/lang/Exception
                    //   61	71	604	java/lang/Exception
                  }
                });
                GMTrace.o(14553899335680L, 108435);
              }
            });
            GMTrace.o(14553630900224L, 108433);
          }
        });
        GMTrace.o(14551617634304L, 108418);
      }
    };
    initialize();
    GMTrace.o(14551751852032L, 108419);
  }
  
  private void initialize()
  {
    GMTrace.i(14552020287488L, 108421);
    if (this.view != null)
    {
      View localView = this.view.findViewById(R.h.bBS);
      if (this.hasInit)
      {
        GMTrace.o(14552020287488L, 108421);
        return;
      }
      this.hasInit = true;
      localView.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(14551349198848L, 108416);
          paramAnonymousView = new Date();
          if ((a.lsC != null) && (paramAnonymousView.getTime() - a.lsC.getTime() < 1000L))
          {
            GMTrace.o(14551349198848L, 108416);
            return;
          }
          a.lsC = paramAnonymousView;
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("free_wifi_source", 2);
          paramAnonymousView.addFlags(67108864);
          d.b((Context)a.a(a.this).get(), "freewifi", ".ui.FreeWifiEntryUI", paramAnonymousView);
          GMTrace.o(14551349198848L, 108416);
        }
      });
      localView.setVisibility(8);
    }
    GMTrace.o(14552020287488L, 108421);
  }
  
  public final boolean abd()
  {
    GMTrace.i(14552288722944L, 108423);
    if (!this.hasInit)
    {
      initialize();
      GMTrace.o(14552288722944L, 108423);
      return false;
    }
    af.F(this.lsD);
    af.i(this.lsD, 500L);
    GMTrace.o(14552288722944L, 108423);
    return true;
  }
  
  public final void destroy()
  {
    GMTrace.i(14552154505216L, 108422);
    GMTrace.o(14552154505216L, 108422);
  }
  
  public final int getLayoutId()
  {
    GMTrace.i(14551886069760L, 108420);
    int i = R.i.cxC;
    GMTrace.o(14551886069760L, 108420);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */