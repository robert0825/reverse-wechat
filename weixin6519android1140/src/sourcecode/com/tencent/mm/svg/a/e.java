package com.tencent.mm.svg.a;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.TypedValue;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.svg.b.b;
import com.tencent.mm.svg.b.c.a;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;

public final class e
{
  private static Class<?> esV;
  public static boolean vEK;
  private static a vEL;
  private static LongSparseArray<Drawable.ConstantState>[] vEM;
  private static LongSparseArray<Drawable.ConstantState> vEN;
  private static c<Drawable.ConstantState> vEO;
  private static c<Drawable.ConstantState> vEP;
  protected static Application vEQ;
  protected static String vER;
  protected static Class<d> vES;
  private static boolean vET;
  private static Map<WeakReference<Resources>, Map<Long, Integer>> vEU;
  private static Method veo;
  private static Method vep;
  
  static
  {
    GMTrace.i(3489124057088L, 25996);
    vEK = false;
    esV = null;
    vET = false;
    vEU = new HashMap();
    veo = null;
    vep = null;
    GMTrace.o(3489124057088L, 25996);
  }
  
  @TargetApi(16)
  public static void a(Application paramApplication, Resources paramResources, int paramInt, TypedValue paramTypedValue)
  {
    GMTrace.i(16088947490816L, 119872);
    if (paramInt == 0)
    {
      com.tencent.mm.svg.b.c.e("MicroMsg.SVGResourceLoader", "preloadDrawable Why this id is %d. TypedValue %s", new Object[] { Integer.valueOf(paramInt), paramTypedValue });
      com.tencent.mm.svg.b.c.i("MicroMsg.SVGResourceLoader", Log.getStackTraceString(new Throwable()), new Object[0]);
    }
    paramResources.getValue(paramInt, paramTypedValue, true);
    long l = paramTypedValue.assetCookie << 32 | paramTypedValue.data;
    paramApplication = new b(paramInt, paramApplication.getResources(), l);
    vEN.put(l, paramApplication);
    GMTrace.o(16088947490816L, 119872);
  }
  
  private static void a(Application paramApplication, Class<d> paramClass)
  {
    GMTrace.i(3488318750720L, 25990);
    vEQ = paramApplication;
    vES = paramClass;
    try
    {
      Class localClass = vES;
      if (localClass == null)
      {
        GMTrace.o(3488318750720L, 25990);
        return;
      }
      ((d)paramClass.newInstance()).load(g(paramApplication));
      com.tencent.mm.svg.b.c.i("MicroMsg.SVGResourceLoader", "SVGCode wrapper size %s", new Object[] { Integer.valueOf(g(paramApplication).vEv.size()) });
      vEK = true;
      GMTrace.o(3488318750720L, 25990);
      return;
    }
    catch (Resources.NotFoundException paramApplication)
    {
      com.tencent.mm.svg.b.c.printErrStackTrace("MicroMsg.SVGResourceLoader", paramApplication, "We found one NotFoundException.", new Object[0]);
      vEK = false;
      GMTrace.o(3488318750720L, 25990);
    }
  }
  
  @TargetApi(16)
  private static void a(Context paramContext, Object paramObject)
  {
    GMTrace.i(3488184532992L, 25989);
    paramObject = new com.tencent.mm.svg.b.a(paramObject, "sPreloadedDrawables").get();
    if (paramObject != null)
    {
      int i;
      long l;
      if ((paramObject instanceof LongSparseArray[]))
      {
        vEM = (LongSparseArray[])paramObject;
        com.tencent.mm.svg.b.c.d("MicroMsg.SVGResourceLoader", "sPreloadDrawable content: %s ", new Object[] { vEM[0] });
        i = 0;
        while (i < vEM[0].size())
        {
          l = vEM[0].keyAt(i);
          vEO.put(l, vEM[0].get(l));
          i += 1;
        }
        i = 0;
        while (i < vEM[1].size())
        {
          l = vEM[1].keyAt(i);
          vEP.put(l, vEM[1].get(l));
          i += 1;
        }
        vEM[0] = vEO;
        vEM[1] = vEP;
        GMTrace.o(3488184532992L, 25989);
        return;
      }
      if ((paramObject instanceof LongSparseArray))
      {
        paramContext = new com.tencent.mm.svg.b.a(paramContext.getResources(), "sPreloadedDrawables");
        paramObject = (LongSparseArray)paramContext.get();
        i = 0;
        while (i < ((LongSparseArray)paramObject).size())
        {
          l = ((LongSparseArray)paramObject).keyAt(i);
          vEO.put(l, ((LongSparseArray)paramObject).get(l));
          i += 1;
        }
        paramObject = vEO;
        paramContext.prepare();
        if (paramContext.fRv == null) {
          throw new NoSuchFieldException();
        }
        paramContext.fRv.set(paramContext.obj, paramObject);
        if (paramContext.get() == null) {
          com.tencent.mm.svg.b.c.e("MicroMsg.SVGResourceLoader", "resourcePreloadDrawable is null!! OMG!!", new Object[0]);
        }
        GMTrace.o(3488184532992L, 25989);
        return;
      }
      com.tencent.mm.svg.b.c.e("MicroMsg.SVGResourceLoader", "mResourcePreloadDrawable is others!! OMG!", new Object[0]);
      GMTrace.o(3488184532992L, 25989);
      return;
    }
    com.tencent.mm.svg.b.c.e("MicroMsg.SVGResourceLoader", "mResourcePreloadDrawable is null!! OMG!!!", new Object[0]);
    GMTrace.o(3488184532992L, 25989);
  }
  
  public static void a(Resources paramResources, Map<Long, Integer> paramMap)
  {
    GMTrace.i(20303249932288L, 151271);
    com.tencent.mm.svg.b.c.i("MicroMsg.SVGResourceLoader", "addFilterResources:" + paramResources, new Object[0]);
    Iterator localIterator = vEU.keySet().iterator();
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
    } while (((WeakReference)localIterator.next()).get() != paramResources);
    for (int i = 1;; i = 0)
    {
      if (i == 0) {
        vEU.put(new WeakReference(paramResources), paramMap);
      }
      GMTrace.o(20303249932288L, 151271);
      return;
    }
  }
  
  public static void a(c.a parama)
  {
    GMTrace.i(3487647662080L, 25985);
    com.tencent.mm.svg.b.c.b(parama);
    GMTrace.o(3487647662080L, 25985);
  }
  
  public static Drawable b(Resources paramResources, int paramInt)
  {
    int i = 1;
    GMTrace.i(20303518367744L, 151273);
    Object localObject3 = new TypedValue();
    paramResources.getValue(paramInt, (TypedValue)localObject3, true);
    Object localObject1 = null;
    if ((((TypedValue)localObject3).type >= 28) && (((TypedValue)localObject3).type <= 31)) {}
    for (;;)
    {
      if (i != 0) {
        localObject1 = new ColorDrawable(((TypedValue)localObject3).data);
      }
      if (veo == null) {}
      Object localObject2;
      try
      {
        localObject2 = Resources.class.getDeclaredMethod("loadXmlResourceParser", new Class[] { String.class, Integer.TYPE, Integer.TYPE, String.class });
        veo = (Method)localObject2;
        ((Method)localObject2).setAccessible(true);
        if (vep == null) {}
        localObject1 = ((TypedValue)localObject3).string.toString();
      }
      catch (NoSuchMethodException paramResources)
      {
        try
        {
          localObject2 = AssetManager.class.getDeclaredMethod("openNonAsset", new Class[] { Integer.TYPE, String.class, Integer.TYPE });
          vep = (Method)localObject2;
          ((Method)localObject2).setAccessible(true);
          localObject2 = localObject1;
          if (localObject1 != null) {
            break label369;
          }
          if (((TypedValue)localObject3).string != null) {
            break label289;
          }
          throw new Resources.NotFoundException("Resource is not a Drawable (color or path): " + localObject3);
        }
        catch (NoSuchMethodException paramResources)
        {
          w.printErrStackTrace("MicroMsg.SVGResourceLoader", paramResources, "", new Object[0]);
          w.printErrStackTrace("MicroMsg.SVGResourceLoader", paramResources, "", new Object[0]);
          GMTrace.o(20303518367744L, 151273);
          return null;
        }
        paramResources = paramResources;
        w.printErrStackTrace("MicroMsg.SVGResourceLoader", paramResources, "", new Object[0]);
        w.printErrStackTrace("MicroMsg.SVGResourceLoader", paramResources, "", new Object[0]);
        GMTrace.o(20303518367744L, 151273);
        return null;
      }
      label289:
      if (((String)localObject1).endsWith(".xml")) {}
      for (;;)
      {
        try
        {
          localObject3 = (XmlResourceParser)veo.invoke(paramResources, new Object[] { localObject1, Integer.valueOf(paramInt), Integer.valueOf(((TypedValue)localObject3).assetCookie), "drawable" });
          localObject2 = Drawable.createFromXml(paramResources, (XmlPullParser)localObject3);
          ((XmlResourceParser)localObject3).close();
          label369:
          GMTrace.o(20303518367744L, 151273);
          return (Drawable)localObject2;
        }
        catch (Exception paramResources)
        {
          localObject1 = new Resources.NotFoundException("File " + (String)localObject1 + " from drawable resource ID #0x" + Integer.toHexString(paramInt));
          ((Resources.NotFoundException)localObject1).initCause(paramResources);
          throw ((Throwable)localObject1);
        }
        try
        {
          InputStream localInputStream = (InputStream)vep.invoke(paramResources.getAssets(), new Object[] { Integer.valueOf(((TypedValue)localObject3).assetCookie), localObject1, Integer.valueOf(2) });
          localObject2 = Drawable.createFromResourceStream(paramResources, (TypedValue)localObject3, localInputStream, (String)localObject1, null);
          localInputStream.close();
        }
        catch (Exception paramResources)
        {
          localObject1 = new Resources.NotFoundException("File " + (String)localObject1 + " from drawable resource ID #0x" + Integer.toHexString(paramInt));
          ((Resources.NotFoundException)localObject1).initCause(paramResources);
          throw ((Throwable)localObject1);
        }
      }
      i = 0;
    }
  }
  
  public static Map<Long, Integer> b(Resources paramResources)
  {
    GMTrace.i(20303384150016L, 151272);
    Iterator localIterator = vEU.keySet().iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      Resources localResources = (Resources)localWeakReference.get();
      if ((localResources != null) && (localResources == paramResources))
      {
        paramResources = (Map)vEU.get(localWeakReference);
        GMTrace.o(20303384150016L, 151272);
        return paramResources;
      }
    }
    GMTrace.o(20303384150016L, 151272);
    return null;
  }
  
  /* Error */
  public static void b(Application paramApplication, String paramString)
  {
    // Byte code:
    //   0: ldc2_w 419
    //   3: ldc_w 421
    //   6: invokestatic 53	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: getstatic 59	com/tencent/mm/svg/a/e:vET	Z
    //   12: ifeq +25 -> 37
    //   15: ldc 83
    //   17: ldc_w 423
    //   20: iconst_0
    //   21: anewarray 4	java/lang/Object
    //   24: invokestatic 108	com/tencent/mm/svg/b/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   27: ldc2_w 419
    //   30: ldc_w 421
    //   33: invokestatic 73	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   36: return
    //   37: iconst_0
    //   38: istore 7
    //   40: iconst_0
    //   41: istore 8
    //   43: iconst_0
    //   44: istore 9
    //   46: iconst_0
    //   47: istore 6
    //   49: aload_1
    //   50: putstatic 425	com/tencent/mm/svg/a/e:vER	Ljava/lang/String;
    //   53: aload_1
    //   54: invokestatic 430	com/tencent/mm/svg/a/a:bE	(Ljava/lang/String;)V
    //   57: aload_1
    //   58: invokestatic 433	com/tencent/mm/svg/b/b:bE	(Ljava/lang/String;)V
    //   61: new 254	java/lang/StringBuilder
    //   64: dup
    //   65: invokespecial 434	java/lang/StringBuilder:<init>	()V
    //   68: aload_1
    //   69: invokevirtual 382	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: ldc_w 436
    //   75: invokevirtual 382	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: invokevirtual 267	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   81: astore_1
    //   82: aload_0
    //   83: putstatic 148	com/tencent/mm/svg/a/e:vEQ	Landroid/app/Application;
    //   86: iload 6
    //   88: istore_3
    //   89: iload 7
    //   91: istore 4
    //   93: iload 8
    //   95: istore 5
    //   97: iload 9
    //   99: istore_2
    //   100: ldc 83
    //   102: ldc_w 438
    //   105: iconst_0
    //   106: anewarray 4	java/lang/Object
    //   109: invokestatic 108	com/tencent/mm/svg/b/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   112: iload 6
    //   114: istore_3
    //   115: iload 7
    //   117: istore 4
    //   119: iload 8
    //   121: istore 5
    //   123: iload 9
    //   125: istore_2
    //   126: aload_1
    //   127: invokestatic 442	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   130: astore 12
    //   132: iload 6
    //   134: istore_3
    //   135: iload 7
    //   137: istore 4
    //   139: iload 8
    //   141: istore 5
    //   143: iload 9
    //   145: istore_2
    //   146: invokestatic 448	java/lang/System:nanoTime	()J
    //   149: lstore 10
    //   151: iload 6
    //   153: istore_3
    //   154: iload 7
    //   156: istore 4
    //   158: iload 8
    //   160: istore 5
    //   162: iload 9
    //   164: istore_2
    //   165: aload_0
    //   166: invokestatic 452	com/tencent/mm/svg/a/e:eV	(Landroid/content/Context;)V
    //   169: iload 6
    //   171: istore_3
    //   172: iload 7
    //   174: istore 4
    //   176: iload 8
    //   178: istore 5
    //   180: iload 9
    //   182: istore_2
    //   183: aload_0
    //   184: aload 12
    //   186: invokestatic 454	com/tencent/mm/svg/a/e:a	(Landroid/app/Application;Ljava/lang/Class;)V
    //   189: iconst_1
    //   190: istore 4
    //   192: iconst_1
    //   193: istore 5
    //   195: iconst_1
    //   196: istore_2
    //   197: iconst_1
    //   198: istore_3
    //   199: ldc 83
    //   201: ldc_w 456
    //   204: iconst_1
    //   205: anewarray 4	java/lang/Object
    //   208: dup
    //   209: iconst_0
    //   210: invokestatic 448	java/lang/System:nanoTime	()J
    //   213: lload 10
    //   215: lsub
    //   216: ldc2_w 457
    //   219: ldiv
    //   220: invokestatic 463	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   223: aastore
    //   224: invokestatic 108	com/tencent/mm/svg/b/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   227: iconst_1
    //   228: putstatic 59	com/tencent/mm/svg/a/e:vET	Z
    //   231: ldc2_w 419
    //   234: ldc_w 421
    //   237: invokestatic 73	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   240: return
    //   241: astore 12
    //   243: iload_3
    //   244: istore_2
    //   245: ldc 83
    //   247: ldc_w 465
    //   250: iconst_1
    //   251: anewarray 4	java/lang/Object
    //   254: dup
    //   255: iconst_0
    //   256: aload_1
    //   257: aastore
    //   258: invokestatic 97	com/tencent/mm/svg/b/c:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   261: iload_3
    //   262: ifne +56 -> 318
    //   265: ldc 83
    //   267: ldc_w 467
    //   270: iconst_0
    //   271: anewarray 4	java/lang/Object
    //   274: invokestatic 108	com/tencent/mm/svg/b/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   277: invokestatic 448	java/lang/System:nanoTime	()J
    //   280: lstore 10
    //   282: aload_0
    //   283: invokestatic 452	com/tencent/mm/svg/a/e:eV	(Landroid/content/Context;)V
    //   286: aload_0
    //   287: invokestatic 471	com/tencent/mm/svg/a/e:h	(Landroid/app/Application;)V
    //   290: ldc 83
    //   292: ldc_w 473
    //   295: iconst_1
    //   296: anewarray 4	java/lang/Object
    //   299: dup
    //   300: iconst_0
    //   301: invokestatic 448	java/lang/System:nanoTime	()J
    //   304: lload 10
    //   306: lsub
    //   307: ldc2_w 457
    //   310: ldiv
    //   311: invokestatic 463	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   314: aastore
    //   315: invokestatic 108	com/tencent/mm/svg/b/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   318: iconst_1
    //   319: putstatic 59	com/tencent/mm/svg/a/e:vET	Z
    //   322: ldc2_w 419
    //   325: ldc_w 421
    //   328: invokestatic 73	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   331: return
    //   332: astore 12
    //   334: iload 4
    //   336: istore_2
    //   337: ldc 83
    //   339: ldc_w 475
    //   342: iconst_1
    //   343: anewarray 4	java/lang/Object
    //   346: dup
    //   347: iconst_0
    //   348: aload_1
    //   349: aastore
    //   350: invokestatic 97	com/tencent/mm/svg/b/c:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   353: iload 4
    //   355: ifne +56 -> 411
    //   358: ldc 83
    //   360: ldc_w 467
    //   363: iconst_0
    //   364: anewarray 4	java/lang/Object
    //   367: invokestatic 108	com/tencent/mm/svg/b/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   370: invokestatic 448	java/lang/System:nanoTime	()J
    //   373: lstore 10
    //   375: aload_0
    //   376: invokestatic 452	com/tencent/mm/svg/a/e:eV	(Landroid/content/Context;)V
    //   379: aload_0
    //   380: invokestatic 471	com/tencent/mm/svg/a/e:h	(Landroid/app/Application;)V
    //   383: ldc 83
    //   385: ldc_w 473
    //   388: iconst_1
    //   389: anewarray 4	java/lang/Object
    //   392: dup
    //   393: iconst_0
    //   394: invokestatic 448	java/lang/System:nanoTime	()J
    //   397: lload 10
    //   399: lsub
    //   400: ldc2_w 457
    //   403: ldiv
    //   404: invokestatic 463	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   407: aastore
    //   408: invokestatic 108	com/tencent/mm/svg/b/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   411: iconst_1
    //   412: putstatic 59	com/tencent/mm/svg/a/e:vET	Z
    //   415: ldc2_w 419
    //   418: ldc_w 421
    //   421: invokestatic 73	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   424: return
    //   425: astore 12
    //   427: iload 5
    //   429: istore_2
    //   430: ldc 83
    //   432: ldc_w 477
    //   435: iconst_1
    //   436: anewarray 4	java/lang/Object
    //   439: dup
    //   440: iconst_0
    //   441: aload_1
    //   442: aastore
    //   443: invokestatic 97	com/tencent/mm/svg/b/c:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   446: iload 5
    //   448: ifne +56 -> 504
    //   451: ldc 83
    //   453: ldc_w 467
    //   456: iconst_0
    //   457: anewarray 4	java/lang/Object
    //   460: invokestatic 108	com/tencent/mm/svg/b/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   463: invokestatic 448	java/lang/System:nanoTime	()J
    //   466: lstore 10
    //   468: aload_0
    //   469: invokestatic 452	com/tencent/mm/svg/a/e:eV	(Landroid/content/Context;)V
    //   472: aload_0
    //   473: invokestatic 471	com/tencent/mm/svg/a/e:h	(Landroid/app/Application;)V
    //   476: ldc 83
    //   478: ldc_w 473
    //   481: iconst_1
    //   482: anewarray 4	java/lang/Object
    //   485: dup
    //   486: iconst_0
    //   487: invokestatic 448	java/lang/System:nanoTime	()J
    //   490: lload 10
    //   492: lsub
    //   493: ldc2_w 457
    //   496: ldiv
    //   497: invokestatic 463	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   500: aastore
    //   501: invokestatic 108	com/tencent/mm/svg/b/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   504: iconst_1
    //   505: putstatic 59	com/tencent/mm/svg/a/e:vET	Z
    //   508: ldc2_w 419
    //   511: ldc_w 421
    //   514: invokestatic 73	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   517: return
    //   518: astore_1
    //   519: iload_2
    //   520: ifne +56 -> 576
    //   523: ldc 83
    //   525: ldc_w 467
    //   528: iconst_0
    //   529: anewarray 4	java/lang/Object
    //   532: invokestatic 108	com/tencent/mm/svg/b/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   535: invokestatic 448	java/lang/System:nanoTime	()J
    //   538: lstore 10
    //   540: aload_0
    //   541: invokestatic 452	com/tencent/mm/svg/a/e:eV	(Landroid/content/Context;)V
    //   544: aload_0
    //   545: invokestatic 471	com/tencent/mm/svg/a/e:h	(Landroid/app/Application;)V
    //   548: ldc 83
    //   550: ldc_w 473
    //   553: iconst_1
    //   554: anewarray 4	java/lang/Object
    //   557: dup
    //   558: iconst_0
    //   559: invokestatic 448	java/lang/System:nanoTime	()J
    //   562: lload 10
    //   564: lsub
    //   565: ldc2_w 457
    //   568: ldiv
    //   569: invokestatic 463	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   572: aastore
    //   573: invokestatic 108	com/tencent/mm/svg/b/c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   576: iconst_1
    //   577: putstatic 59	com/tencent/mm/svg/a/e:vET	Z
    //   580: aload_1
    //   581: athrow
    //   582: astore_0
    //   583: goto -293 -> 290
    //   586: astore_0
    //   587: goto -204 -> 383
    //   590: astore_0
    //   591: goto -115 -> 476
    //   594: astore_0
    //   595: goto -47 -> 548
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	598	0	paramApplication	Application
    //   0	598	1	paramString	String
    //   99	421	2	i	int
    //   88	174	3	j	int
    //   91	263	4	k	int
    //   95	352	5	m	int
    //   47	123	6	n	int
    //   38	135	7	i1	int
    //   41	136	8	i2	int
    //   44	137	9	i3	int
    //   149	414	10	l	long
    //   130	55	12	localClass	Class
    //   241	1	12	localClassNotFoundException	ClassNotFoundException
    //   332	1	12	localInstantiationException	InstantiationException
    //   425	1	12	localIllegalAccessException	IllegalAccessException
    // Exception table:
    //   from	to	target	type
    //   100	112	241	java/lang/ClassNotFoundException
    //   126	132	241	java/lang/ClassNotFoundException
    //   146	151	241	java/lang/ClassNotFoundException
    //   165	169	241	java/lang/ClassNotFoundException
    //   183	189	241	java/lang/ClassNotFoundException
    //   199	227	241	java/lang/ClassNotFoundException
    //   100	112	332	java/lang/InstantiationException
    //   126	132	332	java/lang/InstantiationException
    //   146	151	332	java/lang/InstantiationException
    //   165	169	332	java/lang/InstantiationException
    //   183	189	332	java/lang/InstantiationException
    //   199	227	332	java/lang/InstantiationException
    //   100	112	425	java/lang/IllegalAccessException
    //   126	132	425	java/lang/IllegalAccessException
    //   146	151	425	java/lang/IllegalAccessException
    //   165	169	425	java/lang/IllegalAccessException
    //   183	189	425	java/lang/IllegalAccessException
    //   199	227	425	java/lang/IllegalAccessException
    //   100	112	518	finally
    //   126	132	518	finally
    //   146	151	518	finally
    //   165	169	518	finally
    //   183	189	518	finally
    //   199	227	518	finally
    //   245	261	518	finally
    //   337	353	518	finally
    //   430	446	518	finally
    //   286	290	582	java/lang/ClassNotFoundException
    //   379	383	586	java/lang/ClassNotFoundException
    //   472	476	590	java/lang/ClassNotFoundException
    //   544	548	594	java/lang/ClassNotFoundException
  }
  
  private static Class<?> bVu()
  {
    GMTrace.i(3488452968448L, 25991);
    Class localClass1;
    if (esV != null)
    {
      localClass1 = esV;
      GMTrace.o(3488452968448L, 25991);
      return localClass1;
    }
    try
    {
      localClass1 = Class.forName(vER + ".R$raw");
      if (localClass1 != null)
      {
        GMTrace.o(3488452968448L, 25991);
        return localClass1;
      }
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      Class localClass2 = b.bVy();
      if (localClass2 != null)
      {
        GMTrace.o(3488452968448L, 25991);
        return localClass2;
      }
      GMTrace.o(3488452968448L, 25991);
    }
    return null;
  }
  
  public static void bVv()
  {
    GMTrace.i(16089081708544L, 119873);
    try
    {
      com.tencent.mm.svg.b.c.e("MicroMsg.SVGResourceLoader", "Reach here, why?", new Object[0]);
      if (vES == null)
      {
        h(vEQ);
        GMTrace.o(16089081708544L, 119873);
        return;
      }
      a(vEQ, vES);
      GMTrace.o(16089081708544L, 119873);
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      com.tencent.mm.svg.b.c.printErrStackTrace("MicroMsg.SVGResourceLoader", localClassNotFoundException, "", new Object[0]);
      GMTrace.o(16089081708544L, 119873);
      return;
    }
    catch (InstantiationException localInstantiationException)
    {
      com.tencent.mm.svg.b.c.printErrStackTrace("MicroMsg.SVGResourceLoader", localInstantiationException, "", new Object[0]);
      GMTrace.o(16089081708544L, 119873);
      return;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      com.tencent.mm.svg.b.c.printErrStackTrace("MicroMsg.SVGResourceLoader", localIllegalAccessException, "", new Object[0]);
      GMTrace.o(16089081708544L, 119873);
    }
  }
  
  public static void d(Class<?> paramClass)
  {
    GMTrace.i(3487513444352L, 25984);
    esV = paramClass;
    GMTrace.o(3487513444352L, 25984);
  }
  
  @TargetApi(16)
  private static void eV(Context paramContext)
  {
    int i = 1;
    GMTrace.i(3488050315264L, 25988);
    if (vEO == null) {
      try
      {
        vEN = new LongSparseArray();
        Object localObject = new c();
        vEO = (c)localObject;
        ((c)localObject).vEN = vEN;
        localObject = new c();
        vEP = (c)localObject;
        ((c)localObject).vEN = vEN;
        if (Build.VERSION.SDK_INT >= 23)
        {
          localObject = new com.tencent.mm.svg.b.a(paramContext.getResources(), "mResourcesImpl");
          ((com.tencent.mm.svg.b.a)localObject).prepare();
          if (((com.tencent.mm.svg.b.a)localObject).fRv != null)
          {
            if (i == 0) {
              break label147;
            }
            localObject = ((com.tencent.mm.svg.b.a)localObject).get();
          }
        }
        for (;;)
        {
          a(paramContext, localObject);
          com.tencent.mm.svg.b.c.i("MicroMsg.SVGResourceLoader", "SVG this resources %s", new Object[] { paramContext.getResources() });
          GMTrace.o(3488050315264L, 25988);
          return;
          i = 0;
          break;
          label147:
          localObject = paramContext.getResources();
          continue;
          localObject = paramContext.getResources();
        }
        GMTrace.o(3488050315264L, 25988);
      }
      catch (NoSuchFieldException paramContext)
      {
        com.tencent.mm.svg.b.c.printErrStackTrace("MicroMsg.SVGResourceLoader", paramContext, "Call reflectPreloadCache failed. Reason : NoSuchFieldException.", new Object[0]);
        GMTrace.o(3488050315264L, 25988);
        return;
      }
      catch (IllegalAccessException paramContext)
      {
        com.tencent.mm.svg.b.c.printErrStackTrace("MicroMsg.SVGResourceLoader", paramContext, "Call reflectPreloadCache failed. Reason : IllegalAccessException.", new Object[0]);
        GMTrace.o(3488050315264L, 25988);
        return;
      }
      catch (IllegalArgumentException paramContext)
      {
        com.tencent.mm.svg.b.c.printErrStackTrace("MicroMsg.SVGResourceLoader", paramContext, "Call reflectPreloadCache failed. Reason : IllegalArgumentException.", new Object[0]);
      }
    }
  }
  
  private static a g(Application paramApplication)
  {
    GMTrace.i(3487916097536L, 25987);
    if (vEL == null) {
      vEL = new a(a.bVq(), paramApplication);
    }
    paramApplication = vEL;
    GMTrace.o(3487916097536L, 25987);
    return paramApplication;
  }
  
  private static void h(Application paramApplication)
  {
    GMTrace.i(3488587186176L, 25992);
    Object localObject = bVu();
    if (localObject == null)
    {
      com.tencent.mm.svg.b.c.e("MicroMsg.SVGResourceLoader", "Raw class is null!", new Object[0]);
      GMTrace.o(3488587186176L, 25992);
      return;
    }
    localObject = ((Class)localObject).getDeclaredFields();
    a locala = g(paramApplication);
    try
    {
      a locala1 = new a();
      int i = 0;
      while (i < localObject.length)
      {
        int j = localObject[i].getInt(null);
        if (locala1.d(paramApplication.getResources(), j)) {
          a(locala.vEV, locala.mResources, j, locala.vEq);
        }
        i += 1;
      }
      vEK = true;
    }
    catch (IllegalAccessException paramApplication)
    {
      vEK = false;
      GMTrace.o(3488587186176L, 25992);
      return;
    }
    catch (IllegalArgumentException paramApplication)
    {
      vEK = false;
      GMTrace.o(3488587186176L, 25992);
      return;
    }
    GMTrace.o(3488587186176L, 25992);
  }
  
  public static final class a
  {
    Resources mResources;
    Application vEV;
    TypedValue vEq;
    Map<Integer, com.tencent.mm.svg.c> vEv;
    
    public a(Map<Integer, com.tencent.mm.svg.c> paramMap, Application paramApplication)
    {
      GMTrace.i(3484292218880L, 25960);
      this.vEq = new TypedValue();
      this.vEv = paramMap;
      this.vEV = paramApplication;
      this.mResources = paramApplication.getResources();
      GMTrace.o(3484292218880L, 25960);
    }
    
    public final void a(Integer paramInteger, com.tencent.mm.svg.c paramc)
    {
      GMTrace.i(15699716079616L, 116972);
      this.vEv.put(paramInteger, paramc);
      e.a(this.vEV, this.mResources, paramInteger.intValue(), this.vEq);
      GMTrace.o(15699716079616L, 116972);
    }
  }
  
  protected static final class b
    extends Drawable.ConstantState
  {
    private Resources mResources;
    private int qCd;
    private long vEW;
    
    public b(int paramInt, Resources paramResources, long paramLong)
    {
      GMTrace.i(20303652585472L, 151274);
      this.qCd = 0;
      this.vEW = 0L;
      if (paramInt == 0)
      {
        com.tencent.mm.svg.b.c.e("MicroMsg.SVGResourceLoader", "SVGConstantState Why this id is %d. TypedValue %s", new Object[] { Integer.valueOf(paramInt) });
        com.tencent.mm.svg.b.c.i("MicroMsg.SVGResourceLoader", Log.getStackTraceString(new Throwable()), new Object[0]);
      }
      this.qCd = paramInt;
      this.mResources = paramResources;
      this.vEW = paramLong;
      GMTrace.o(20303652585472L, 151274);
    }
    
    public final int getChangingConfigurations()
    {
      GMTrace.i(3484829089792L, 25964);
      GMTrace.o(3484829089792L, 25964);
      return 0;
    }
    
    public final Drawable newDrawable()
    {
      GMTrace.i(3484694872064L, 25963);
      com.tencent.mm.svg.b.c.i("MicroMsg.SVGResourceLoader", "newDrawable mResources:" + this.mResources, new Object[0]);
      Drawable localDrawable = a.c(this.mResources, this.qCd);
      GMTrace.o(3484694872064L, 25963);
      return localDrawable;
    }
    
    public final Drawable newDrawable(Resources paramResources)
    {
      GMTrace.i(20303786803200L, 151275);
      try
      {
        Map localMap = e.b(paramResources);
        if (localMap != null)
        {
          int i = ((Integer)localMap.get(Long.valueOf(this.vEW))).intValue();
          paramResources = e.b(paramResources, i);
          com.tencent.mm.svg.b.c.i("MicroMsg.SVGResourceLoader", "loadDrawableSkipCache id:" + Integer.toHexString(i) + ",drawable:" + paramResources, new Object[0]);
          GMTrace.o(20303786803200L, 151275);
          return paramResources;
        }
      }
      catch (Exception paramResources)
      {
        com.tencent.mm.svg.b.c.i("MicroMsg.SVGResourceLoader", "newDrawable loadDrawableSkipCache error:" + paramResources.getMessage(), new Object[0]);
        paramResources = newDrawable();
        GMTrace.o(20303786803200L, 151275);
      }
      return paramResources;
    }
  }
  
  @TargetApi(16)
  public static final class c<T>
    extends LongSparseArray<T>
  {
    public static boolean vEX;
    LongSparseArray<T> vEN;
    
    static
    {
      GMTrace.i(3485634396160L, 25970);
      vEX = false;
      GMTrace.o(3485634396160L, 25970);
    }
    
    public c()
    {
      GMTrace.i(3484963307520L, 25965);
      this.vEN = null;
      GMTrace.o(3484963307520L, 25965);
    }
    
    public final void clear()
    {
      GMTrace.i(3485500178432L, 25969);
      super.clear();
      com.tencent.mm.svg.b.c.e("MicroMsg.SVGLongSparseArray", "Found u! clear.", new Object[0]);
      GMTrace.o(3485500178432L, 25969);
    }
    
    public final void delete(long paramLong)
    {
      GMTrace.i(3485231742976L, 25967);
      super.delete(paramLong);
      com.tencent.mm.svg.b.c.e("MicroMsg.SVGLongSparseArray", "Found u! delete key %s", new Object[] { Long.valueOf(paramLong) });
      GMTrace.o(3485231742976L, 25967);
    }
    
    public final T get(long paramLong, T paramT)
    {
      GMTrace.i(3485097525248L, 25966);
      if (this.vEN.indexOfKey(paramLong) >= 0)
      {
        if (!e.vEK) {
          e.bVv();
        }
        paramT = this.vEN.get(paramLong, paramT);
        GMTrace.o(3485097525248L, 25966);
        return paramT;
      }
      paramT = super.get(paramLong, paramT);
      GMTrace.o(3485097525248L, 25966);
      return paramT;
    }
    
    public final void remove(long paramLong)
    {
      GMTrace.i(3485365960704L, 25968);
      super.remove(paramLong);
      com.tencent.mm.svg.b.c.e("MicroMsg.SVGLongSparseArray", "Found u! remove key %s", new Object[] { Long.valueOf(paramLong) });
      GMTrace.o(3485365960704L, 25968);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\svg\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */