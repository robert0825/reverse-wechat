package com.tencent.mm.plugin.sns.model.a;

import android.os.Build.VERSION;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.j;
import com.tencent.mm.compatible.d.m;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.k.g;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public abstract class e
  extends b
{
  protected boolean pxu;
  protected boolean pxv;
  protected boolean pxw;
  protected boolean pxx;
  
  public e(b.a parama, a parama1)
  {
    super(parama, parama1);
    GMTrace.i(8067961847808L, 60111);
    this.pxu = false;
    this.pxv = false;
    this.pxw = false;
    this.pxx = false;
    GMTrace.o(8067961847808L, 60111);
  }
  
  private static String j(String paramString, String... paramVarArgs)
  {
    GMTrace.i(8068230283264L, 60113);
    StringBuilder localStringBuilder = new StringBuilder(paramString);
    int i;
    if (paramString.contains("?"))
    {
      paramString = "&";
      localStringBuilder.append(paramString);
      int j = 1;
      int k = paramVarArgs.length;
      i = 0;
      label45:
      if (i >= k) {
        break label92;
      }
      paramString = paramVarArgs[i];
      if (j == 0) {
        break label81;
      }
      j = 0;
    }
    for (;;)
    {
      localStringBuilder.append(paramString);
      i += 1;
      break label45;
      paramString = "?";
      break;
      label81:
      localStringBuilder.append("&");
    }
    label92:
    paramString = localStringBuilder.toString();
    GMTrace.o(8068230283264L, 60113);
    return paramString;
  }
  
  public final String HU(String paramString)
  {
    int m = 2;
    int n = 0;
    GMTrace.i(8068096065536L, 60112);
    Object localObject1 = paramString;
    for (;;)
    {
      Object localObject2;
      int i;
      try
      {
        localObject2 = g.ut().getValue("SnsCloseDownloadWebp");
        localObject1 = paramString;
        if (bg.nm((String)localObject2)) {
          break label929;
        }
        localObject1 = paramString;
        i = bg.Sy((String)localObject2);
      }
      catch (Exception paramString)
      {
        Object localObject3;
        localObject2 = paramString;
        paramString = (String)localObject1;
        w.e("MicroMsg.SnsDownloadImageBase", "error get dyna by webp " + ((Exception)localObject2).getMessage());
        GMTrace.o(8068096065536L, 60112);
        return paramString;
      }
      localObject1 = paramString;
      int j;
      if (!m.sR())
      {
        j = 0;
        localObject1 = paramString;
        if (!m.sR())
        {
          k = n;
          localObject1 = paramString;
          if (bg.nm(r.hkX))
          {
            localObject1 = paramString;
            if (bg.nm(r.hkY)) {
              continue;
            }
          }
          localObject3 = paramString;
          localObject1 = paramString;
          if (bg.nm(r.hkX)) {
            continue;
          }
          localObject1 = paramString;
          localObject2 = paramString.split("(//?)");
          localObject1 = paramString;
          localObject3 = new StringBuilder();
          localObject1 = paramString;
          ((StringBuilder)localObject3).append(localObject2[0]).append("//").append(r.hkX);
          i = m;
          localObject1 = paramString;
          if (i >= localObject2.length) {
            continue;
          }
          localObject1 = paramString;
          ((StringBuilder)localObject3).append("/").append(localObject2[i]);
          i += 1;
          continue;
          localObject1 = paramString;
          if (Build.VERSION.SDK_INT < 14)
          {
            i = 0;
            continue;
          }
          localObject1 = paramString;
          if (p.fQL.fQh == 2)
          {
            i = 0;
            continue;
          }
          localObject1 = paramString;
          if (bg.nm(r.hkY)) {
            break label924;
          }
          i = 0;
        }
      }
      else
      {
        localObject1 = paramString;
        if (!ae.bjo())
        {
          j = 0;
          continue;
        }
        localObject1 = paramString;
        if (bg.nm(r.hkY)) {
          break label919;
        }
        j = 0;
        continue;
      }
      int k = n;
      localObject1 = paramString;
      if (ae.bjn())
      {
        k = n;
        localObject1 = paramString;
        if (bg.nm(r.hkY))
        {
          k = 1;
          continue;
          localObject1 = paramString;
          localObject3 = ((StringBuilder)localObject3).toString();
          localObject1 = localObject3;
          w.i("MicroMsg.SnsDownloadImageBase", "new url  " + (String)localObject3);
          localObject2 = localObject3;
          localObject1 = localObject3;
          if (!bg.nm(r.hkY))
          {
            localObject1 = localObject3;
            localObject2 = j((String)localObject3, new String[] { "tp=" + r.hkY });
            localObject1 = localObject2;
            w.i("MicroMsg.SnsDownloadImageBase", "(dbg) new url  " + (String)localObject2);
          }
          paramString = (String)localObject2;
          localObject1 = localObject2;
          if (this.pwX != null)
          {
            paramString = (String)localObject2;
            localObject1 = localObject2;
            if (this.pwX.psm.uDa != 0)
            {
              localObject1 = localObject2;
              paramString = j((String)localObject2, new String[] { "enc=1" });
              localObject1 = paramString;
              w.i("MicroMsg.SnsDownloadImageBase", "test for enckey " + this.pwX.psm.uDb + " " + this.pwX.psm.uDa + " " + paramString);
              localObject1 = paramString;
              com.tencent.mm.plugin.sns.lucky.a.b.nU(136);
              localObject1 = paramString;
              this.pxx = true;
            }
          }
          localObject2 = paramString;
          try
          {
            if (this.pwX != null)
            {
              localObject2 = paramString;
              if (this.pwX.psm != null)
              {
                localObject2 = this.pwX.psm;
                if (!this.pwX.pwR) {
                  break label895;
                }
                localObject1 = ((anu)localObject2).uDg;
                if (!this.pwX.pwR) {
                  break label905;
                }
                i = ((anu)localObject2).uDh;
                localObject2 = paramString;
                if (!TextUtils.isEmpty((CharSequence)localObject1)) {
                  localObject2 = j(paramString, new String[] { "token=" + (String)localObject1, "idx=" + i });
                }
              }
            }
            GMTrace.o(8068096065536L, 60112);
            return (String)localObject2;
          }
          catch (Exception localException)
          {
            label895:
            label905:
            continue;
          }
          if (j != 0)
          {
            localObject1 = paramString;
            localObject2 = j(paramString, new String[] { "tp=wxpc" });
            localObject1 = localObject2;
            w.i("MicroMsg.SnsDownloadImageBase", "new url  " + (String)localObject2);
          }
          else if (k != 0)
          {
            localObject1 = paramString;
            localObject2 = j(paramString, new String[] { "tp=hevc" });
            localObject1 = localObject2;
            w.i("MicroMsg.SnsDownloadImageBase", "new url  " + (String)localObject2);
          }
          else
          {
            localObject2 = paramString;
            if (i != 0)
            {
              localObject1 = paramString;
              localObject2 = j(paramString, new String[] { "tp=webp" });
              localObject1 = localObject2;
              w.i("MicroMsg.SnsDownloadImageBase", "new url  " + (String)localObject2);
              continue;
              localObject1 = ((anu)localObject2).uDd;
              continue;
              i = ((anu)localObject2).uDe;
              continue;
              label919:
              j = 1;
              continue;
              label924:
              i = 1;
              continue;
              label929:
              i = 0;
              if (i != 0) {
                i = 0;
              }
            }
          }
        }
      }
    }
  }
  
  /* Error */
  public final boolean a(java.io.InputStream paramInputStream, java.util.Map<String, java.util.List<String>> paramMap)
  {
    // Byte code:
    //   0: ldc2_w 240
    //   3: ldc -14
    //   5: invokestatic 22	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aconst_null
    //   9: astore 8
    //   11: aload_2
    //   12: ldc -12
    //   14: invokeinterface 250 2 0
    //   19: checkcast 252	java/util/List
    //   22: astore 7
    //   24: aload 7
    //   26: ifnull +51 -> 77
    //   29: aload 7
    //   31: invokeinterface 256 1 0
    //   36: ifle +41 -> 77
    //   39: aload 7
    //   41: iconst_0
    //   42: invokeinterface 259 2 0
    //   47: checkcast 48	java/lang/String
    //   50: ldc_w 261
    //   53: invokestatic 265	com/tencent/mm/sdk/platformtools/bg:aq	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   56: astore 7
    //   58: aload 7
    //   60: invokevirtual 268	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   63: ldc_w 270
    //   66: invokevirtual 52	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   69: ifeq +406 -> 475
    //   72: aload_0
    //   73: iconst_1
    //   74: putfield 24	com/tencent/mm/plugin/sns/model/a/e:pxu	Z
    //   77: aload_2
    //   78: ldc_w 272
    //   81: invokeinterface 250 2 0
    //   86: checkcast 252	java/util/List
    //   89: astore_2
    //   90: aload_2
    //   91: ifnull +45 -> 136
    //   94: aload_2
    //   95: invokeinterface 256 1 0
    //   100: ifle +36 -> 136
    //   103: aload_2
    //   104: iconst_0
    //   105: invokeinterface 259 2 0
    //   110: checkcast 48	java/lang/String
    //   113: ldc_w 261
    //   116: invokestatic 265	com/tencent/mm/sdk/platformtools/bg:aq	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   119: invokevirtual 268	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   122: ldc_w 274
    //   125: invokevirtual 52	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   128: ifeq +8 -> 136
    //   131: aload_0
    //   132: iconst_1
    //   133: putfield 28	com/tencent/mm/plugin/sns/model/a/e:pxw	Z
    //   136: aload_0
    //   137: getfield 30	com/tencent/mm/plugin/sns/model/a/e:pxx	Z
    //   140: ifeq +16 -> 156
    //   143: aload_0
    //   144: getfield 28	com/tencent/mm/plugin/sns/model/a/e:pxw	Z
    //   147: ifne +9 -> 156
    //   150: sipush 138
    //   153: invokestatic 197	com/tencent/mm/plugin/sns/lucky/a/b:nU	(I)V
    //   156: aload 8
    //   158: astore 7
    //   160: sipush 1024
    //   163: newarray <illegal type>
    //   165: astore 9
    //   167: aload 8
    //   169: astore 7
    //   171: ldc -109
    //   173: new 41	java/lang/StringBuilder
    //   176: dup
    //   177: ldc_w 276
    //   180: invokespecial 44	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   183: aload_0
    //   184: getfield 28	com/tencent/mm/plugin/sns/model/a/e:pxw	Z
    //   187: invokevirtual 279	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   190: ldc -68
    //   192: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   195: new 41	java/lang/StringBuilder
    //   198: dup
    //   199: invokespecial 116	java/lang/StringBuilder:<init>	()V
    //   202: aload_0
    //   203: getfield 164	com/tencent/mm/plugin/sns/model/a/e:pwX	Lcom/tencent/mm/plugin/sns/model/a/a;
    //   206: invokevirtual 282	com/tencent/mm/plugin/sns/model/a/a:getPath	()Ljava/lang/String;
    //   209: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   212: aload_0
    //   213: getfield 164	com/tencent/mm/plugin/sns/model/a/e:pwX	Lcom/tencent/mm/plugin/sns/model/a/a;
    //   216: invokevirtual 285	com/tencent/mm/plugin/sns/model/a/a:bjO	()Ljava/lang/String;
    //   219: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   222: invokevirtual 62	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   225: invokestatic 290	com/tencent/mm/modelsfs/f:lf	(Ljava/lang/String;)Ljava/lang/String;
    //   228: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   231: invokevirtual 62	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   234: invokestatic 154	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   237: aload 8
    //   239: astore 7
    //   241: aload_0
    //   242: getfield 28	com/tencent/mm/plugin/sns/model/a/e:pxw	Z
    //   245: ifeq +292 -> 537
    //   248: ldc_w 261
    //   251: astore_2
    //   252: aload 8
    //   254: astore 7
    //   256: aload_0
    //   257: getfield 164	com/tencent/mm/plugin/sns/model/a/e:pwX	Lcom/tencent/mm/plugin/sns/model/a/a;
    //   260: getfield 170	com/tencent/mm/plugin/sns/model/a/a:psm	Lcom/tencent/mm/protocal/c/anu;
    //   263: ifnull +32 -> 295
    //   266: aload 8
    //   268: astore 7
    //   270: aload_0
    //   271: getfield 164	com/tencent/mm/plugin/sns/model/a/e:pwX	Lcom/tencent/mm/plugin/sns/model/a/a;
    //   274: getfield 200	com/tencent/mm/plugin/sns/model/a/a:pwR	Z
    //   277: ifeq +242 -> 519
    //   280: aload 8
    //   282: astore 7
    //   284: aload_0
    //   285: getfield 164	com/tencent/mm/plugin/sns/model/a/e:pwX	Lcom/tencent/mm/plugin/sns/model/a/a;
    //   288: getfield 170	com/tencent/mm/plugin/sns/model/a/a:psm	Lcom/tencent/mm/protocal/c/anu;
    //   291: getfield 293	com/tencent/mm/protocal/c/anu:uDi	Ljava/lang/String;
    //   294: astore_2
    //   295: aload 8
    //   297: astore 7
    //   299: new 41	java/lang/StringBuilder
    //   302: dup
    //   303: invokespecial 116	java/lang/StringBuilder:<init>	()V
    //   306: aload_0
    //   307: getfield 164	com/tencent/mm/plugin/sns/model/a/e:pwX	Lcom/tencent/mm/plugin/sns/model/a/a;
    //   310: invokevirtual 282	com/tencent/mm/plugin/sns/model/a/a:getPath	()Ljava/lang/String;
    //   313: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   316: aload_0
    //   317: getfield 164	com/tencent/mm/plugin/sns/model/a/e:pwX	Lcom/tencent/mm/plugin/sns/model/a/a;
    //   320: invokevirtual 285	com/tencent/mm/plugin/sns/model/a/a:bjO	()Ljava/lang/String;
    //   323: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   326: invokevirtual 62	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   329: aload_2
    //   330: invokestatic 299	com/tencent/mm/modelsfs/FileOp:aj	(Ljava/lang/String;Ljava/lang/String;)Ljava/io/OutputStream;
    //   333: astore_2
    //   334: aload_2
    //   335: astore 7
    //   337: invokestatic 305	java/lang/System:currentTimeMillis	()J
    //   340: lstore 5
    //   342: aload_2
    //   343: astore 7
    //   345: aload_0
    //   346: getfield 309	com/tencent/mm/plugin/sns/model/a/e:pxi	Lcom/tencent/mm/pointers/PString;
    //   349: ldc_w 261
    //   352: putfield 314	com/tencent/mm/pointers/PString:value	Ljava/lang/String;
    //   355: iconst_0
    //   356: istore_3
    //   357: aload_2
    //   358: astore 7
    //   360: aload_1
    //   361: aload 9
    //   363: invokevirtual 320	java/io/InputStream:read	([B)I
    //   366: istore 4
    //   368: iload 4
    //   370: iconst_m1
    //   371: if_icmpeq +368 -> 739
    //   374: aload_2
    //   375: astore 7
    //   377: aload_0
    //   378: getfield 323	com/tencent/mm/plugin/sns/model/a/e:pxl	J
    //   381: lconst_0
    //   382: lcmp
    //   383: ifne +17 -> 400
    //   386: aload_2
    //   387: astore 7
    //   389: aload_0
    //   390: aload_0
    //   391: getfield 326	com/tencent/mm/plugin/sns/model/a/e:pxm	J
    //   394: invokestatic 330	com/tencent/mm/sdk/platformtools/bg:aH	(J)J
    //   397: putfield 323	com/tencent/mm/plugin/sns/model/a/e:pxl	J
    //   400: aload_2
    //   401: astore 7
    //   403: iload 4
    //   405: aload_0
    //   406: getfield 333	com/tencent/mm/plugin/sns/model/a/e:pxj	I
    //   409: if_icmple +22 -> 431
    //   412: aload_2
    //   413: astore 7
    //   415: aload_0
    //   416: iload 4
    //   418: putfield 333	com/tencent/mm/plugin/sns/model/a/e:pxj	I
    //   421: aload_2
    //   422: astore 7
    //   424: aload_0
    //   425: invokestatic 336	com/tencent/mm/sdk/platformtools/bg:Pu	()J
    //   428: putfield 339	com/tencent/mm/plugin/sns/model/a/e:pxk	J
    //   431: aload_2
    //   432: astore 7
    //   434: invokestatic 342	com/tencent/mm/plugin/sns/model/ae:zo	()Ljava/lang/String;
    //   437: invokestatic 347	com/tencent/mm/plugin/sns/data/i:GY	(Ljava/lang/String;)Z
    //   440: ifne +239 -> 679
    //   443: aload_2
    //   444: astore 7
    //   446: aload_2
    //   447: invokevirtual 352	java/io/OutputStream:close	()V
    //   450: aload_2
    //   451: astore 7
    //   453: aload_1
    //   454: invokevirtual 353	java/io/InputStream:close	()V
    //   457: aload_2
    //   458: ifnull +7 -> 465
    //   461: aload_2
    //   462: invokevirtual 352	java/io/OutputStream:close	()V
    //   465: ldc2_w 240
    //   468: ldc -14
    //   470: invokestatic 33	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   473: iconst_0
    //   474: ireturn
    //   475: aload 7
    //   477: invokevirtual 268	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   480: ldc_w 355
    //   483: invokevirtual 52	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   486: ifeq +11 -> 497
    //   489: aload_0
    //   490: iconst_1
    //   491: putfield 26	com/tencent/mm/plugin/sns/model/a/e:pxv	Z
    //   494: goto -417 -> 77
    //   497: aload 7
    //   499: invokevirtual 268	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   502: ldc_w 357
    //   505: invokevirtual 52	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   508: ifeq -431 -> 77
    //   511: aload_0
    //   512: iconst_1
    //   513: putfield 26	com/tencent/mm/plugin/sns/model/a/e:pxv	Z
    //   516: goto -439 -> 77
    //   519: aload 8
    //   521: astore 7
    //   523: aload_0
    //   524: getfield 164	com/tencent/mm/plugin/sns/model/a/e:pwX	Lcom/tencent/mm/plugin/sns/model/a/a;
    //   527: getfield 170	com/tencent/mm/plugin/sns/model/a/a:psm	Lcom/tencent/mm/protocal/c/anu;
    //   530: getfield 360	com/tencent/mm/protocal/c/anu:uDf	Ljava/lang/String;
    //   533: astore_2
    //   534: goto -239 -> 295
    //   537: aload 8
    //   539: astore 7
    //   541: new 41	java/lang/StringBuilder
    //   544: dup
    //   545: invokespecial 116	java/lang/StringBuilder:<init>	()V
    //   548: aload_0
    //   549: getfield 164	com/tencent/mm/plugin/sns/model/a/e:pwX	Lcom/tencent/mm/plugin/sns/model/a/a;
    //   552: invokevirtual 282	com/tencent/mm/plugin/sns/model/a/a:getPath	()Ljava/lang/String;
    //   555: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   558: aload_0
    //   559: getfield 164	com/tencent/mm/plugin/sns/model/a/e:pwX	Lcom/tencent/mm/plugin/sns/model/a/a;
    //   562: invokevirtual 285	com/tencent/mm/plugin/sns/model/a/a:bjO	()Ljava/lang/String;
    //   565: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   568: invokevirtual 62	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   571: invokestatic 363	com/tencent/mm/modelsfs/f:le	(Ljava/lang/String;)Z
    //   574: ifeq +44 -> 618
    //   577: aload 8
    //   579: astore 7
    //   581: new 41	java/lang/StringBuilder
    //   584: dup
    //   585: invokespecial 116	java/lang/StringBuilder:<init>	()V
    //   588: aload_0
    //   589: getfield 164	com/tencent/mm/plugin/sns/model/a/e:pwX	Lcom/tencent/mm/plugin/sns/model/a/a;
    //   592: invokevirtual 282	com/tencent/mm/plugin/sns/model/a/a:getPath	()Ljava/lang/String;
    //   595: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   598: aload_0
    //   599: getfield 164	com/tencent/mm/plugin/sns/model/a/e:pwX	Lcom/tencent/mm/plugin/sns/model/a/a;
    //   602: invokevirtual 285	com/tencent/mm/plugin/sns/model/a/a:bjO	()Ljava/lang/String;
    //   605: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   608: invokevirtual 62	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   611: invokestatic 367	com/tencent/mm/modelsfs/FileOp:hA	(Ljava/lang/String;)Ljava/io/OutputStream;
    //   614: astore_2
    //   615: goto -281 -> 334
    //   618: aload 8
    //   620: astore 7
    //   622: new 41	java/lang/StringBuilder
    //   625: dup
    //   626: invokespecial 116	java/lang/StringBuilder:<init>	()V
    //   629: aload_0
    //   630: getfield 164	com/tencent/mm/plugin/sns/model/a/e:pwX	Lcom/tencent/mm/plugin/sns/model/a/a;
    //   633: invokevirtual 282	com/tencent/mm/plugin/sns/model/a/a:getPath	()Ljava/lang/String;
    //   636: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   639: aload_0
    //   640: getfield 164	com/tencent/mm/plugin/sns/model/a/e:pwX	Lcom/tencent/mm/plugin/sns/model/a/a;
    //   643: invokevirtual 285	com/tencent/mm/plugin/sns/model/a/a:bjO	()Ljava/lang/String;
    //   646: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   649: invokevirtual 62	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   652: invokestatic 290	com/tencent/mm/modelsfs/f:lf	(Ljava/lang/String;)Ljava/lang/String;
    //   655: invokestatic 367	com/tencent/mm/modelsfs/FileOp:hA	(Ljava/lang/String;)Ljava/io/OutputStream;
    //   658: astore_2
    //   659: goto -325 -> 334
    //   662: astore_1
    //   663: ldc -109
    //   665: aload_1
    //   666: ldc_w 261
    //   669: iconst_0
    //   670: anewarray 369	java/lang/Object
    //   673: invokestatic 373	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   676: goto -211 -> 465
    //   679: aload_2
    //   680: astore 7
    //   682: aload_2
    //   683: aload 9
    //   685: iconst_0
    //   686: iload 4
    //   688: invokevirtual 377	java/io/OutputStream:write	([BII)V
    //   691: aload_2
    //   692: astore 7
    //   694: aload_0
    //   695: aload_0
    //   696: getfield 380	com/tencent/mm/plugin/sns/model/a/e:pxr	I
    //   699: iload 4
    //   701: iadd
    //   702: putfield 380	com/tencent/mm/plugin/sns/model/a/e:pxr	I
    //   705: iconst_1
    //   706: istore_3
    //   707: aload_2
    //   708: astore 7
    //   710: aload_0
    //   711: getfield 380	com/tencent/mm/plugin/sns/model/a/e:pxr	I
    //   714: lload 5
    //   716: aload_0
    //   717: getfield 309	com/tencent/mm/plugin/sns/model/a/e:pxi	Lcom/tencent/mm/pointers/PString;
    //   720: invokestatic 383	com/tencent/mm/plugin/sns/model/a/e:a	(IJLcom/tencent/mm/pointers/PString;)Z
    //   723: ifeq -366 -> 357
    //   726: aload_2
    //   727: astore 7
    //   729: invokestatic 305	java/lang/System:currentTimeMillis	()J
    //   732: lstore 5
    //   734: iconst_0
    //   735: istore_3
    //   736: goto -379 -> 357
    //   739: aload_2
    //   740: astore 7
    //   742: aload_2
    //   743: invokevirtual 352	java/io/OutputStream:close	()V
    //   746: aload_2
    //   747: astore 7
    //   749: aload_1
    //   750: invokevirtual 353	java/io/InputStream:close	()V
    //   753: aconst_null
    //   754: astore 7
    //   756: iload_3
    //   757: ifeq +16 -> 773
    //   760: aload_0
    //   761: getfield 380	com/tencent/mm/plugin/sns/model/a/e:pxr	I
    //   764: lconst_0
    //   765: aload_0
    //   766: getfield 309	com/tencent/mm/plugin/sns/model/a/e:pxi	Lcom/tencent/mm/pointers/PString;
    //   769: invokestatic 383	com/tencent/mm/plugin/sns/model/a/e:a	(IJLcom/tencent/mm/pointers/PString;)Z
    //   772: pop
    //   773: ldc2_w 240
    //   776: ldc -14
    //   778: invokestatic 33	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   781: iconst_1
    //   782: ireturn
    //   783: astore 7
    //   785: aconst_null
    //   786: astore_2
    //   787: aload_2
    //   788: astore_1
    //   789: aload_0
    //   790: getfield 164	com/tencent/mm/plugin/sns/model/a/e:pwX	Lcom/tencent/mm/plugin/sns/model/a/a;
    //   793: getfield 200	com/tencent/mm/plugin/sns/model/a/a:pwR	Z
    //   796: ifeq +19 -> 815
    //   799: aload_2
    //   800: astore_1
    //   801: getstatic 389	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   804: ldc2_w 390
    //   807: ldc2_w 392
    //   810: lconst_1
    //   811: iconst_1
    //   812: invokevirtual 396	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   815: aload_2
    //   816: astore_1
    //   817: ldc -109
    //   819: aload 7
    //   821: new 41	java/lang/StringBuilder
    //   824: dup
    //   825: ldc_w 398
    //   828: invokespecial 44	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   831: aload 7
    //   833: invokevirtual 399	java/io/IOException:getMessage	()Ljava/lang/String;
    //   836: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   839: invokevirtual 62	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   842: iconst_0
    //   843: anewarray 369	java/lang/Object
    //   846: invokestatic 373	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   849: aload_2
    //   850: astore_1
    //   851: ldc -109
    //   853: aload 7
    //   855: ldc_w 261
    //   858: iconst_0
    //   859: anewarray 369	java/lang/Object
    //   862: invokestatic 373	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   865: aload_2
    //   866: ifnull +7 -> 873
    //   869: aload_2
    //   870: invokevirtual 352	java/io/OutputStream:close	()V
    //   873: ldc2_w 240
    //   876: ldc -14
    //   878: invokestatic 33	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   881: iconst_0
    //   882: ireturn
    //   883: astore_1
    //   884: ldc -109
    //   886: aload_1
    //   887: ldc_w 261
    //   890: iconst_0
    //   891: anewarray 369	java/lang/Object
    //   894: invokestatic 373	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   897: goto -24 -> 873
    //   900: astore 7
    //   902: aconst_null
    //   903: astore_2
    //   904: aload_2
    //   905: astore_1
    //   906: aload_0
    //   907: getfield 164	com/tencent/mm/plugin/sns/model/a/e:pwX	Lcom/tencent/mm/plugin/sns/model/a/a;
    //   910: getfield 200	com/tencent/mm/plugin/sns/model/a/a:pwR	Z
    //   913: ifeq +19 -> 932
    //   916: aload_2
    //   917: astore_1
    //   918: getstatic 389	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   921: ldc2_w 390
    //   924: ldc2_w 400
    //   927: lconst_1
    //   928: iconst_1
    //   929: invokevirtual 396	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   932: aload_2
    //   933: astore_1
    //   934: ldc -109
    //   936: aload 7
    //   938: new 41	java/lang/StringBuilder
    //   941: dup
    //   942: ldc_w 403
    //   945: invokespecial 44	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   948: aload 7
    //   950: invokevirtual 222	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   953: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   956: invokevirtual 62	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   959: iconst_0
    //   960: anewarray 369	java/lang/Object
    //   963: invokestatic 373	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   966: aload_2
    //   967: astore_1
    //   968: ldc -109
    //   970: aload 7
    //   972: ldc_w 261
    //   975: iconst_0
    //   976: anewarray 369	java/lang/Object
    //   979: invokestatic 373	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   982: aload_2
    //   983: ifnull +7 -> 990
    //   986: aload_2
    //   987: invokevirtual 352	java/io/OutputStream:close	()V
    //   990: ldc2_w 240
    //   993: ldc -14
    //   995: invokestatic 33	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   998: iconst_0
    //   999: ireturn
    //   1000: astore_1
    //   1001: ldc -109
    //   1003: aload_1
    //   1004: ldc_w 261
    //   1007: iconst_0
    //   1008: anewarray 369	java/lang/Object
    //   1011: invokestatic 373	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1014: goto -24 -> 990
    //   1017: astore_1
    //   1018: aload 7
    //   1020: ifnull +8 -> 1028
    //   1023: aload 7
    //   1025: invokevirtual 352	java/io/OutputStream:close	()V
    //   1028: aload_1
    //   1029: athrow
    //   1030: astore_2
    //   1031: ldc -109
    //   1033: aload_2
    //   1034: ldc_w 261
    //   1037: iconst_0
    //   1038: anewarray 369	java/lang/Object
    //   1041: invokestatic 373	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1044: goto -16 -> 1028
    //   1047: astore_2
    //   1048: aload_1
    //   1049: astore 7
    //   1051: aload_2
    //   1052: astore_1
    //   1053: goto -35 -> 1018
    //   1056: astore 7
    //   1058: goto -154 -> 904
    //   1061: astore 7
    //   1063: goto -276 -> 787
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1066	0	this	e
    //   0	1066	1	paramInputStream	java.io.InputStream
    //   0	1066	2	paramMap	java.util.Map<String, java.util.List<String>>
    //   356	401	3	i	int
    //   366	336	4	j	int
    //   340	393	5	l	long
    //   22	733	7	localObject1	Object
    //   783	71	7	localIOException1	java.io.IOException
    //   900	124	7	localException1	Exception
    //   1049	1	7	localInputStream	java.io.InputStream
    //   1056	1	7	localException2	Exception
    //   1061	1	7	localIOException2	java.io.IOException
    //   9	610	8	localObject2	Object
    //   165	519	9	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   461	465	662	java/io/IOException
    //   160	167	783	java/io/IOException
    //   171	237	783	java/io/IOException
    //   241	248	783	java/io/IOException
    //   256	266	783	java/io/IOException
    //   270	280	783	java/io/IOException
    //   284	295	783	java/io/IOException
    //   299	334	783	java/io/IOException
    //   523	534	783	java/io/IOException
    //   541	577	783	java/io/IOException
    //   581	615	783	java/io/IOException
    //   622	659	783	java/io/IOException
    //   760	773	783	java/io/IOException
    //   869	873	883	java/io/IOException
    //   160	167	900	java/lang/Exception
    //   171	237	900	java/lang/Exception
    //   241	248	900	java/lang/Exception
    //   256	266	900	java/lang/Exception
    //   270	280	900	java/lang/Exception
    //   284	295	900	java/lang/Exception
    //   299	334	900	java/lang/Exception
    //   523	534	900	java/lang/Exception
    //   541	577	900	java/lang/Exception
    //   581	615	900	java/lang/Exception
    //   622	659	900	java/lang/Exception
    //   760	773	900	java/lang/Exception
    //   986	990	1000	java/io/IOException
    //   160	167	1017	finally
    //   171	237	1017	finally
    //   241	248	1017	finally
    //   256	266	1017	finally
    //   270	280	1017	finally
    //   284	295	1017	finally
    //   299	334	1017	finally
    //   337	342	1017	finally
    //   345	355	1017	finally
    //   360	368	1017	finally
    //   377	386	1017	finally
    //   389	400	1017	finally
    //   403	412	1017	finally
    //   415	421	1017	finally
    //   424	431	1017	finally
    //   434	443	1017	finally
    //   446	450	1017	finally
    //   453	457	1017	finally
    //   523	534	1017	finally
    //   541	577	1017	finally
    //   581	615	1017	finally
    //   622	659	1017	finally
    //   682	691	1017	finally
    //   694	705	1017	finally
    //   710	726	1017	finally
    //   729	734	1017	finally
    //   742	746	1017	finally
    //   749	753	1017	finally
    //   760	773	1017	finally
    //   1023	1028	1030	java/io/IOException
    //   789	799	1047	finally
    //   801	815	1047	finally
    //   817	849	1047	finally
    //   851	865	1047	finally
    //   906	916	1047	finally
    //   918	932	1047	finally
    //   934	966	1047	finally
    //   968	982	1047	finally
    //   337	342	1056	java/lang/Exception
    //   345	355	1056	java/lang/Exception
    //   360	368	1056	java/lang/Exception
    //   377	386	1056	java/lang/Exception
    //   389	400	1056	java/lang/Exception
    //   403	412	1056	java/lang/Exception
    //   415	421	1056	java/lang/Exception
    //   424	431	1056	java/lang/Exception
    //   434	443	1056	java/lang/Exception
    //   446	450	1056	java/lang/Exception
    //   453	457	1056	java/lang/Exception
    //   682	691	1056	java/lang/Exception
    //   694	705	1056	java/lang/Exception
    //   710	726	1056	java/lang/Exception
    //   729	734	1056	java/lang/Exception
    //   742	746	1056	java/lang/Exception
    //   749	753	1056	java/lang/Exception
    //   337	342	1061	java/io/IOException
    //   345	355	1061	java/io/IOException
    //   360	368	1061	java/io/IOException
    //   377	386	1061	java/io/IOException
    //   389	400	1061	java/io/IOException
    //   403	412	1061	java/io/IOException
    //   415	421	1061	java/io/IOException
    //   424	431	1061	java/io/IOException
    //   434	443	1061	java/io/IOException
    //   446	450	1061	java/io/IOException
    //   453	457	1061	java/io/IOException
    //   682	691	1061	java/io/IOException
    //   694	705	1061	java/io/IOException
    //   710	726	1061	java/io/IOException
    //   729	734	1061	java/io/IOException
    //   742	746	1061	java/io/IOException
    //   749	753	1061	java/io/IOException
  }
  
  protected final boolean bjT()
  {
    GMTrace.i(17153696727040L, 127805);
    GMTrace.o(17153696727040L, 127805);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\model\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */