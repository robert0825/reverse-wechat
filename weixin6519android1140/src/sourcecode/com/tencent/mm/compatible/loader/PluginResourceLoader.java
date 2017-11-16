package com.tencent.mm.compatible.loader;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.util.TypedValue;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.zip.ZipFile;

public class PluginResourceLoader
  extends Resources
{
  private HashMap<String, ZipFile> fRA;
  private final b<WeakReference<Drawable.ConstantState>> fRB;
  public Resources fRx;
  private Method fRy;
  private Method fRz;
  
  private Drawable a(TypedValue paramTypedValue, int paramInt)
  {
    GMTrace.i(13793690124288L, 102771);
    try
    {
      Drawable localDrawable1 = (Drawable)this.fRy.invoke(this.fRx, new Object[] { paramTypedValue, Integer.valueOf(paramInt) });
      GMTrace.o(13793690124288L, 102771);
      return localDrawable1;
    }
    catch (StackOverflowError localStackOverflowError)
    {
      w.e("MicroMsg.PluginResourceLoader", "load drawable StackOverflowError");
      try
      {
        if ((paramTypedValue.string != null) && (paramTypedValue.string.toString().endsWith(".xml")))
        {
          XmlResourceParser localXmlResourceParser = b(paramTypedValue.string.toString(), paramInt, paramTypedValue.assetCookie, "drawable");
          localDrawable2 = Drawable.createFromXml(this, localXmlResourceParser);
          localXmlResourceParser.close();
          GMTrace.o(13793690124288L, 102771);
          return localDrawable2;
        }
      }
      catch (Exception localException1)
      {
        Drawable localDrawable2;
        Iterator localIterator = this.fRA.entrySet().iterator();
        while (localIterator.hasNext())
        {
          localDrawable2 = a((ZipFile)((Map.Entry)localIterator.next()).getValue(), paramTypedValue);
          if (localDrawable2 != null)
          {
            GMTrace.o(13793690124288L, 102771);
            return localDrawable2;
          }
        }
        w.d("MicroMsg.PluginResourceLoader", "loadFromZipFile null");
        GMTrace.o(13793690124288L, 102771);
        return null;
      }
    }
    catch (Exception localException2)
    {
      for (;;) {}
    }
  }
  
  /* Error */
  private Drawable a(ZipFile paramZipFile, TypedValue paramTypedValue)
  {
    // Byte code:
    //   0: ldc2_w 144
    //   3: ldc -110
    //   5: invokestatic 30	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_2
    //   9: getfield 69	android/util/TypedValue:string	Ljava/lang/CharSequence;
    //   12: ifnonnull +13 -> 25
    //   15: ldc2_w 144
    //   18: ldc -110
    //   20: invokestatic 53	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   23: aconst_null
    //   24: areturn
    //   25: aload_2
    //   26: getfield 87	android/util/TypedValue:assetCookie	I
    //   29: i2l
    //   30: bipush 32
    //   32: lshl
    //   33: aload_2
    //   34: getfield 149	android/util/TypedValue:data	I
    //   37: i2l
    //   38: lor
    //   39: lstore 4
    //   41: aload_0
    //   42: getfield 151	com/tencent/mm/compatible/loader/PluginResourceLoader:fRB	Lcom/tencent/mm/compatible/loader/b;
    //   45: astore 6
    //   47: aload 6
    //   49: getfield 157	com/tencent/mm/compatible/loader/b:vl	[J
    //   52: aload 6
    //   54: getfield 160	com/tencent/mm/compatible/loader/b:mSize	I
    //   57: lload 4
    //   59: invokestatic 163	com/tencent/mm/compatible/loader/b:b	([JIJ)I
    //   62: istore_3
    //   63: iload_3
    //   64: iflt +16 -> 80
    //   67: aload 6
    //   69: getfield 167	com/tencent/mm/compatible/loader/b:vm	[Ljava/lang/Object;
    //   72: iload_3
    //   73: aaload
    //   74: getstatic 171	com/tencent/mm/compatible/loader/b:vj	Ljava/lang/Object;
    //   77: if_acmpne +64 -> 141
    //   80: aconst_null
    //   81: astore 6
    //   83: aload 6
    //   85: checkcast 173	java/lang/ref/WeakReference
    //   88: astore 6
    //   90: aload 6
    //   92: ifnull +116 -> 208
    //   95: aload 6
    //   97: invokevirtual 176	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   100: checkcast 178	android/graphics/drawable/Drawable$ConstantState
    //   103: astore 6
    //   105: aload 6
    //   107: ifnull +46 -> 153
    //   110: aload 6
    //   112: aload_0
    //   113: invokevirtual 182	android/graphics/drawable/Drawable$ConstantState:newDrawable	(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
    //   116: astore 6
    //   118: aload 6
    //   120: ifnull +94 -> 214
    //   123: ldc 55
    //   125: ldc -72
    //   127: invokestatic 187	com/tencent/mm/sdk/platformtools/w:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   130: ldc2_w 144
    //   133: ldc -110
    //   135: invokestatic 53	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   138: aload 6
    //   140: areturn
    //   141: aload 6
    //   143: getfield 167	com/tencent/mm/compatible/loader/b:vm	[Ljava/lang/Object;
    //   146: iload_3
    //   147: aaload
    //   148: astore 6
    //   150: goto -67 -> 83
    //   153: aload_0
    //   154: getfield 151	com/tencent/mm/compatible/loader/PluginResourceLoader:fRB	Lcom/tencent/mm/compatible/loader/b;
    //   157: astore 6
    //   159: aload 6
    //   161: getfield 157	com/tencent/mm/compatible/loader/b:vl	[J
    //   164: aload 6
    //   166: getfield 160	com/tencent/mm/compatible/loader/b:mSize	I
    //   169: lload 4
    //   171: invokestatic 163	com/tencent/mm/compatible/loader/b:b	([JIJ)I
    //   174: istore_3
    //   175: iload_3
    //   176: iflt +32 -> 208
    //   179: aload 6
    //   181: getfield 167	com/tencent/mm/compatible/loader/b:vm	[Ljava/lang/Object;
    //   184: iload_3
    //   185: aaload
    //   186: getstatic 171	com/tencent/mm/compatible/loader/b:vj	Ljava/lang/Object;
    //   189: if_acmpeq +19 -> 208
    //   192: aload 6
    //   194: getfield 167	com/tencent/mm/compatible/loader/b:vm	[Ljava/lang/Object;
    //   197: iload_3
    //   198: getstatic 171	com/tencent/mm/compatible/loader/b:vj	Ljava/lang/Object;
    //   201: aastore
    //   202: aload 6
    //   204: iconst_1
    //   205: putfield 191	com/tencent/mm/compatible/loader/b:vk	Z
    //   208: aconst_null
    //   209: astore 6
    //   211: goto -93 -> 118
    //   214: aload_2
    //   215: getfield 69	android/util/TypedValue:string	Ljava/lang/CharSequence;
    //   218: invokeinterface 75 1 0
    //   223: astore 10
    //   225: aload 6
    //   227: astore 7
    //   229: ldc 55
    //   231: ldc -63
    //   233: iconst_2
    //   234: anewarray 36	java/lang/Object
    //   237: dup
    //   238: iconst_0
    //   239: aload 10
    //   241: aastore
    //   242: dup
    //   243: iconst_1
    //   244: aload_1
    //   245: invokevirtual 196	java/util/zip/ZipFile:getName	()Ljava/lang/String;
    //   248: aastore
    //   249: invokestatic 199	com/tencent/mm/sdk/platformtools/w:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   252: aload 6
    //   254: astore 7
    //   256: aload_1
    //   257: aload 10
    //   259: invokevirtual 203	java/util/zip/ZipFile:getEntry	(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   262: astore 11
    //   264: aconst_null
    //   265: astore 9
    //   267: aload_1
    //   268: aload 11
    //   270: invokevirtual 207	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   273: astore 7
    //   275: aload 7
    //   277: astore 9
    //   279: aload_0
    //   280: aload_2
    //   281: aload 7
    //   283: aload 10
    //   285: invokestatic 211	android/graphics/drawable/Drawable:createFromResourceStream	(Landroid/content/res/Resources;Landroid/util/TypedValue;Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    //   288: astore_2
    //   289: aload_2
    //   290: astore 6
    //   292: aload 6
    //   294: astore_2
    //   295: aload 7
    //   297: astore 8
    //   299: aload 7
    //   301: ifnull +15 -> 316
    //   304: aload 7
    //   306: invokevirtual 214	java/io/InputStream:close	()V
    //   309: aload 7
    //   311: astore 8
    //   313: aload 6
    //   315: astore_2
    //   316: aload_2
    //   317: astore 6
    //   319: aload_2
    //   320: ifnonnull +45 -> 365
    //   323: aload 8
    //   325: astore 7
    //   327: aload_1
    //   328: aload 11
    //   330: invokevirtual 207	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   333: astore_1
    //   334: aload_1
    //   335: astore 7
    //   337: aload_1
    //   338: astore 8
    //   340: aload_1
    //   341: aload 10
    //   343: invokestatic 218	android/graphics/drawable/Drawable:createFromStream	(Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    //   346: astore 6
    //   348: aload 6
    //   350: astore_2
    //   351: aload_2
    //   352: astore 6
    //   354: aload_1
    //   355: ifnull +10 -> 365
    //   358: aload_1
    //   359: invokevirtual 214	java/io/InputStream:close	()V
    //   362: aload_2
    //   363: astore 6
    //   365: aload 6
    //   367: ifnull +24 -> 391
    //   370: aload_0
    //   371: getfield 151	com/tencent/mm/compatible/loader/PluginResourceLoader:fRB	Lcom/tencent/mm/compatible/loader/b;
    //   374: lload 4
    //   376: new 173	java/lang/ref/WeakReference
    //   379: dup
    //   380: aload 6
    //   382: invokevirtual 222	android/graphics/drawable/Drawable:getConstantState	()Landroid/graphics/drawable/Drawable$ConstantState;
    //   385: invokespecial 226	java/lang/ref/WeakReference:<init>	(Ljava/lang/Object;)V
    //   388: invokevirtual 230	com/tencent/mm/compatible/loader/b:put	(JLjava/lang/Object;)V
    //   391: ldc2_w 144
    //   394: ldc -110
    //   396: invokestatic 53	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   399: aload 6
    //   401: areturn
    //   402: astore_2
    //   403: aload 6
    //   405: astore_2
    //   406: aload 9
    //   408: astore 8
    //   410: aload 9
    //   412: ifnull -96 -> 316
    //   415: aload 9
    //   417: invokevirtual 214	java/io/InputStream:close	()V
    //   420: aload 6
    //   422: astore_2
    //   423: aload 9
    //   425: astore 8
    //   427: goto -111 -> 316
    //   430: astore_2
    //   431: aload 6
    //   433: astore_2
    //   434: aload 9
    //   436: astore 8
    //   438: goto -122 -> 316
    //   441: astore_1
    //   442: aconst_null
    //   443: astore 7
    //   445: aload 7
    //   447: ifnull +8 -> 455
    //   450: aload 7
    //   452: invokevirtual 214	java/io/InputStream:close	()V
    //   455: aload 6
    //   457: astore 7
    //   459: aload_1
    //   460: athrow
    //   461: astore_1
    //   462: aload 7
    //   464: astore 6
    //   466: goto -101 -> 365
    //   469: astore_1
    //   470: aload_2
    //   471: astore 6
    //   473: aload 7
    //   475: ifnull -110 -> 365
    //   478: aload 7
    //   480: invokevirtual 214	java/io/InputStream:close	()V
    //   483: aload_2
    //   484: astore 6
    //   486: goto -121 -> 365
    //   489: astore_1
    //   490: aload_2
    //   491: astore 6
    //   493: goto -128 -> 365
    //   496: astore_1
    //   497: aload 8
    //   499: ifnull +8 -> 507
    //   502: aload 8
    //   504: invokevirtual 214	java/io/InputStream:close	()V
    //   507: aload_2
    //   508: astore 7
    //   510: aload_1
    //   511: athrow
    //   512: astore_2
    //   513: aload 6
    //   515: astore_2
    //   516: aload 7
    //   518: astore 8
    //   520: goto -204 -> 316
    //   523: astore_2
    //   524: goto -69 -> 455
    //   527: astore_1
    //   528: aload_2
    //   529: astore 6
    //   531: goto -166 -> 365
    //   534: astore 6
    //   536: goto -29 -> 507
    //   539: astore_1
    //   540: goto -95 -> 445
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	543	0	this	PluginResourceLoader
    //   0	543	1	paramZipFile	ZipFile
    //   0	543	2	paramTypedValue	TypedValue
    //   62	136	3	i	int
    //   39	336	4	l	long
    //   45	485	6	localObject1	Object
    //   534	1	6	localException	Exception
    //   227	290	7	localObject2	Object
    //   297	222	8	localObject3	Object
    //   265	170	9	localObject4	Object
    //   223	119	10	str	String
    //   262	67	11	localZipEntry	java.util.zip.ZipEntry
    // Exception table:
    //   from	to	target	type
    //   267	275	402	java/lang/Exception
    //   279	289	402	java/lang/Exception
    //   415	420	430	java/lang/Exception
    //   267	275	441	finally
    //   229	252	461	java/lang/Exception
    //   256	264	461	java/lang/Exception
    //   459	461	461	java/lang/Exception
    //   510	512	461	java/lang/Exception
    //   327	334	469	java/lang/Exception
    //   340	348	469	java/lang/Exception
    //   478	483	489	java/lang/Exception
    //   327	334	496	finally
    //   340	348	496	finally
    //   304	309	512	java/lang/Exception
    //   450	455	523	java/lang/Exception
    //   358	362	527	java/lang/Exception
    //   502	507	534	java/lang/Exception
    //   279	289	539	finally
  }
  
  private XmlResourceParser b(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    GMTrace.i(13793153253376L, 102767);
    try
    {
      paramString1 = (XmlResourceParser)this.fRz.invoke(this.fRx, new Object[] { paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString2 });
      GMTrace.o(13793153253376L, 102767);
      return paramString1;
    }
    catch (Exception paramString1)
    {
      w.printErrStackTrace("MicroMsg.PluginResourceLoader", paramString1, "", new Object[0]);
      GMTrace.o(13793153253376L, 102767);
    }
    return null;
  }
  
  private static InputStream b(ZipFile paramZipFile, TypedValue paramTypedValue)
  {
    GMTrace.i(13793958559744L, 102773);
    if (paramTypedValue.string == null)
    {
      GMTrace.o(13793958559744L, 102773);
      return null;
    }
    paramTypedValue = paramTypedValue.string.toString();
    try
    {
      w.d("MicroMsg.PluginResourceLoader", "try load stream from zip, entry=%s, file=%s", new Object[] { paramTypedValue, paramZipFile.getName() });
      paramZipFile = paramZipFile.getInputStream(paramZipFile.getEntry(paramTypedValue));
      GMTrace.o(13793958559744L, 102773);
      return paramZipFile;
    }
    catch (Exception paramZipFile)
    {
      GMTrace.o(13793958559744L, 102773);
    }
    return null;
  }
  
  Drawable loadDrawable(TypedValue paramTypedValue, int paramInt)
  {
    GMTrace.i(13793287471104L, 102768);
    paramTypedValue = a(paramTypedValue, paramInt);
    GMTrace.o(13793287471104L, 102768);
    return paramTypedValue;
  }
  
  Drawable loadDrawable(TypedValue paramTypedValue, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(13793421688832L, 102769);
    paramTypedValue = a(paramTypedValue, paramInt);
    GMTrace.o(13793421688832L, 102769);
    return paramTypedValue;
  }
  
  public InputStream openRawResource(int paramInt, TypedValue paramTypedValue)
  {
    InputStream localInputStream2 = null;
    GMTrace.i(13793555906560L, 102770);
    getValue(paramInt, paramTypedValue, true);
    try
    {
      InputStream localInputStream1 = super.openRawResource(paramInt, paramTypedValue);
      if (localInputStream1 == null)
      {
        Iterator localIterator = this.fRA.entrySet().iterator();
        localInputStream1 = localInputStream2;
        while (localIterator.hasNext())
        {
          localInputStream2 = b((ZipFile)((Map.Entry)localIterator.next()).getValue(), paramTypedValue);
          localInputStream1 = localInputStream2;
          if (localInputStream2 != null) {
            localInputStream1 = localInputStream2;
          }
        }
        GMTrace.o(13793555906560L, 102770);
        return localInputStream1;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject = null;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\compatible\loader\PluginResourceLoader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */