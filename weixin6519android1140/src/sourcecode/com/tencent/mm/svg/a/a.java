package com.tencent.mm.svg.a;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.svg.WeChatSVG;
import com.tencent.mm.svg.b.b;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.util.EncodingUtils;

public final class a
{
  private static String vEs;
  protected static int vEt;
  private static String vEu;
  private static Map<Integer, com.tencent.mm.svg.c> vEv;
  private static Map<Integer, Picture> vEw;
  private static Map<String, Picture> vEx;
  private static Float vEy;
  private TypedValue vEq;
  private byte[] vEr;
  
  static
  {
    GMTrace.i(3487379226624L, 25983);
    vEs = ".svg.code.drawable";
    vEt = 3;
    vEu = "";
    vEv = new ConcurrentHashMap();
    vEw = new ConcurrentHashMap();
    vEx = new ConcurrentHashMap();
    GMTrace.o(3487379226624L, 25983);
  }
  
  public a()
  {
    GMTrace.i(3485768613888L, 25971);
    this.vEq = new TypedValue();
    this.vEr = new byte[0];
    GMTrace.o(3485768613888L, 25971);
  }
  
  private static Picture a(float paramFloat1, com.tencent.mm.svg.c paramc, float paramFloat2)
  {
    GMTrace.i(3487245008896L, 25982);
    Picture localPicture = new Picture();
    if (paramc == null)
    {
      com.tencent.mm.svg.b.c.e("MicroMsg.SVGCompat", "fromCodeToPicture code is null!", new Object[0]);
      GMTrace.o(3487245008896L, 25982);
      return localPicture;
    }
    if (vEy == null) {
      vEy = Float.valueOf(paramFloat1 / vEt);
    }
    paramFloat1 = vEy.floatValue() * paramFloat2;
    paramFloat2 = paramc.b(0, new Object[0]);
    float f = paramc.b(1, new Object[0]);
    Canvas localCanvas = localPicture.beginRecording((int)(paramFloat2 * paramFloat1), (int)(f * paramFloat1));
    localCanvas.save();
    localCanvas.scale(paramFloat1, paramFloat1);
    paramc.b(2, new Object[] { localCanvas, Looper.myLooper() });
    localCanvas.restore();
    localPicture.endRecording();
    GMTrace.o(3487245008896L, 25982);
    return localPicture;
  }
  
  private static Drawable a(Resources paramResources, int paramInt, float paramFloat)
  {
    GMTrace.i(3486171267072L, 25974);
    Object localObject;
    if (paramInt == 0)
    {
      com.tencent.mm.svg.b.c.e("MicroMsg.SVGCompat", "getSVGDrawable a invalid resource!!! %s", new Object[] { Integer.valueOf(paramInt) });
      com.tencent.mm.svg.b.c.e("MicroMsg.SVGCompat", "Why no log??", new Object[0]);
      paramResources = new Throwable().getStackTrace();
      if ((paramResources == null) || (paramResources.length < 4)) {}
      for (paramResources = "";; paramResources = ((StringBuilder)localObject).toString())
      {
        com.tencent.mm.svg.b.c.e("MicroMsg.SVGCompat", "The stack : %s", new Object[] { paramResources });
        paramResources = new c(new Picture(), paramInt);
        GMTrace.o(3486171267072L, 25974);
        return paramResources;
        localObject = new StringBuilder();
        int i = 3;
        while (i < paramResources.length)
        {
          if ((paramResources[i].getClassName().contains("com.tencent.mm")) && (!paramResources[i].getClassName().contains("sdk.platformtools.Log")))
          {
            ((StringBuilder)localObject).append("[");
            ((StringBuilder)localObject).append(paramResources[i].getClassName().substring(15));
            ((StringBuilder)localObject).append(":");
            ((StringBuilder)localObject).append(paramResources[i].getMethodName());
            ((StringBuilder)localObject).append("(" + paramResources[i].getLineNumber() + ")]");
          }
          i += 1;
        }
      }
    }
    if (b.bVx())
    {
      paramResources = c(paramResources, paramInt, paramFloat);
      GMTrace.o(3486171267072L, 25974);
      return paramResources;
    }
    String str1 = vEu + vEs;
    float f2 = paramResources.getDisplayMetrics().density;
    float f1;
    Picture localPicture;
    if (paramFloat > 0.0F)
    {
      f1 = paramFloat;
      if (paramFloat <= 0.0F) {
        break label430;
      }
      String str2 = paramInt + "_scale_" + paramFloat;
      localPicture = (Picture)vEx.get(str2);
      localObject = localPicture;
      if (localPicture == null)
      {
        localObject = a(f2, a(paramResources, paramInt, str1), f1);
        vEx.put(str2, localObject);
      }
    }
    for (paramResources = new c((Picture)localObject, paramInt);; paramResources = new c((Picture)localObject, paramInt))
    {
      GMTrace.o(3486171267072L, 25974);
      return paramResources;
      f1 = 1.0F;
      break;
      label430:
      localPicture = (Picture)vEw.get(Integer.valueOf(paramInt));
      localObject = localPicture;
      if (localPicture == null)
      {
        localObject = a(f2, a(paramResources, paramInt, str1), f1);
        vEw.put(Integer.valueOf(paramInt), localObject);
      }
    }
  }
  
  private static com.tencent.mm.svg.c a(Resources paramResources, int paramInt, String paramString)
  {
    GMTrace.i(3487110791168L, 25981);
    String str = "";
    Object localObject1 = str;
    Object localObject2 = str;
    Object localObject3 = str;
    for (;;)
    {
      try
      {
        if (vEv.containsKey(Integer.valueOf(paramInt)))
        {
          localObject1 = str;
          localObject2 = str;
          localObject3 = str;
          paramResources = (com.tencent.mm.svg.c)vEv.get(Integer.valueOf(paramInt));
          GMTrace.o(3487110791168L, 25981);
          return paramResources;
        }
        localObject1 = str;
        localObject2 = str;
        localObject3 = str;
        paramResources = paramResources.getResourceName(paramInt);
        if (paramResources == null)
        {
          localObject1 = str;
          localObject2 = str;
          localObject3 = str;
          com.tencent.mm.svg.b.c.e("MicroMsg.SVGCompat", "Get SVGCodeDrawable failed. Reason : resource not found", new Object[0]);
          GMTrace.o(3487110791168L, 25981);
          return null;
        }
        localObject1 = str;
        localObject2 = str;
        localObject3 = str;
        int i = paramResources.indexOf("/");
        if (i <= 0) {
          continue;
        }
        localObject1 = str;
        localObject2 = str;
        localObject3 = str;
        paramResources = paramString + "." + paramResources.substring(i + 1);
      }
      catch (ClassNotFoundException paramResources)
      {
        w.printErrStackTrace("MicroMsg.SVGCompat", paramResources, "", new Object[0]);
        com.tencent.mm.svg.b.c.e("MicroMsg.SVGCompat", "Get SVGCodeDrawable failed. Reason : ClassNotFoundException %s", new Object[] { localObject1 });
        GMTrace.o(3487110791168L, 25981);
        return null;
        localObject1 = str;
        localObject2 = str;
        localObject3 = str;
        paramResources = paramString + "." + paramResources;
        continue;
      }
      catch (InstantiationException paramResources)
      {
        com.tencent.mm.svg.b.c.e("MicroMsg.SVGCompat", "Get SVGCodeDrawable failed. Reason : InstantiationException %s", new Object[] { localObject2 });
        w.printErrStackTrace("MicroMsg.SVGCompat", paramResources, "", new Object[0]);
        GMTrace.o(3487110791168L, 25981);
        return null;
      }
      catch (IllegalAccessException paramResources)
      {
        com.tencent.mm.svg.b.c.e("MicroMsg.SVGCompat", "Get SVGCodeDrawable failed. Reason : IllegalAccessException %s", new Object[] { localObject3 });
        w.printErrStackTrace("MicroMsg.SVGCompat", paramResources, "", new Object[0]);
        GMTrace.o(3487110791168L, 25981);
      }
      localObject1 = paramResources;
      localObject2 = paramResources;
      localObject3 = paramResources;
      paramString = (com.tencent.mm.svg.c)Class.forName(paramResources).newInstance();
      localObject1 = paramResources;
      localObject2 = paramResources;
      localObject3 = paramResources;
      vEv.put(Integer.valueOf(paramInt), paramString);
      paramResources = paramString;
    }
    return null;
  }
  
  public static Bitmap b(Resources paramResources, int paramInt, float paramFloat)
  {
    GMTrace.i(3486305484800L, 25975);
    paramResources = a(paramResources, paramInt, paramFloat);
    if (paramResources == null)
    {
      GMTrace.o(3486305484800L, 25975);
      return null;
    }
    Bitmap localBitmap = Bitmap.createBitmap(paramResources.getIntrinsicWidth(), paramResources.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
    paramResources.draw(new Canvas(localBitmap));
    GMTrace.o(3486305484800L, 25975);
    return localBitmap;
  }
  
  protected static boolean b(View paramView, Paint paramPaint)
  {
    GMTrace.i(3486708137984L, 25978);
    if (Build.VERSION.SDK_INT > 10)
    {
      if (paramView != null)
      {
        if (paramView.getLayerType() != 1) {
          paramView.setLayerType(1, paramPaint);
        }
        if (paramView.willNotCacheDrawing())
        {
          paramView.setWillNotCacheDrawing(false);
          if (paramView.getWindowToken() != null) {
            paramView.buildLayer();
          }
        }
        GMTrace.o(3486708137984L, 25978);
        return true;
      }
      GMTrace.o(3486708137984L, 25978);
      return false;
    }
    GMTrace.o(3486708137984L, 25978);
    return false;
  }
  
  public static void bE(String paramString)
  {
    GMTrace.i(3485902831616L, 25972);
    vEu = paramString;
    GMTrace.o(3485902831616L, 25972);
  }
  
  public static Map<Integer, com.tencent.mm.svg.c> bVq()
  {
    GMTrace.i(3486573920256L, 25977);
    Map localMap = vEv;
    GMTrace.o(3486573920256L, 25977);
    return localMap;
  }
  
  public static Drawable c(Resources paramResources, int paramInt)
  {
    GMTrace.i(3486037049344L, 25973);
    paramResources = a(paramResources, paramInt, 0.0F);
    GMTrace.o(3486037049344L, 25973);
    return paramResources;
  }
  
  private static Drawable c(Resources paramResources, int paramInt, float paramFloat)
  {
    GMTrace.i(3486976573440L, 25980);
    com.tencent.mm.svg.b.c.d("MicroMsg.SVGCompat", "Using wechat svg library.", new Object[0]);
    InputStream localInputStream = paramResources.openRawResource(paramInt);
    try
    {
      byte[] arrayOfByte = new byte[localInputStream.available()];
      localInputStream.read(arrayOfByte);
      if (localInputStream != null) {}
      long l;
      try
      {
        localInputStream.close();
        l = WeChatSVG.parse(EncodingUtils.getString(arrayOfByte, "UTF-8").toString());
        if (l == 0L)
        {
          com.tencent.mm.svg.b.c.e("MicroMsg.SVGCompat", "Parse SVG failed.", new Object[0]);
          GMTrace.o(3486976573440L, 25980);
          return null;
        }
      }
      catch (IOException localIOException1)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.SVGCompat", localIOException1, "", new Object[0]);
        }
      }
      float[] arrayOfFloat;
      float f2;
      float f3;
      float f1;
      int i;
      label369:
      label374:
      return paramResources;
    }
    catch (IOException paramResources)
    {
      w.printErrStackTrace("MicroMsg.SVGCompat", paramResources, "", new Object[0]);
      com.tencent.mm.svg.b.c.e("MicroMsg.SVGCompat", "Get SVGPictureDrawable failed. Reason : IOException", new Object[0]);
      if (localIOException1 != null) {}
      try
      {
        localIOException1.close();
        GMTrace.o(3486976573440L, 25980);
        return null;
      }
      catch (IOException paramResources)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.SVGCompat", paramResources, "", new Object[0]);
        }
      }
    }
    finally
    {
      if (localIOException1 != null) {}
      try
      {
        localIOException1.close();
        throw paramResources;
      }
      catch (IOException localIOException2)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.SVGCompat", localIOException2, "", new Object[0]);
        }
      }
      arrayOfFloat = WeChatSVG.getViewPort(l);
      f2 = paramResources.getDisplayMetrics().density;
      f3 = arrayOfFloat[0] / vEt;
      if (paramFloat > 0.0F)
      {
        f1 = paramFloat;
        f1 *= f3 * f2;
        f3 = arrayOfFloat[1] / vEt;
        if (paramFloat <= 0.0F) {
          break label369;
        }
      }
      for (;;)
      {
        paramFloat = f3 * f2 * paramFloat;
        paramResources = new Picture();
        i = WeChatSVG.renderViewPort(l, paramResources.beginRecording((int)f1, (int)paramFloat), (int)f1, (int)paramFloat);
        paramResources.endRecording();
        WeChatSVG.release(l);
        paramResources = new c(paramResources, paramInt);
        if (i >= 0) {
          break label374;
        }
        com.tencent.mm.svg.b.c.e("MicroMsg.SVGCompat", "Render SVG failed. Reason : %s", new Object[] { Integer.valueOf(i) });
        GMTrace.o(3486976573440L, 25980);
        return null;
        f1 = 1.0F;
        break;
        paramFloat = 1.0F;
      }
      GMTrace.o(3486976573440L, 25980);
    }
  }
  
  protected static View u(Drawable paramDrawable)
  {
    GMTrace.i(3486842355712L, 25979);
    for (;;)
    {
      paramDrawable = paramDrawable.getCallback();
      if (paramDrawable == null) {
        break;
      }
      if ((paramDrawable instanceof View))
      {
        paramDrawable = (View)paramDrawable;
        GMTrace.o(3486842355712L, 25979);
        return paramDrawable;
      }
      if (!(paramDrawable instanceof Drawable)) {
        break;
      }
      paramDrawable = (Drawable)paramDrawable;
    }
    GMTrace.o(3486842355712L, 25979);
    return null;
  }
  
  /* Error */
  public final boolean d(Resources paramResources, int paramInt)
  {
    // Byte code:
    //   0: ldc2_w 437
    //   3: sipush 25976
    //   6: invokestatic 32	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_1
    //   10: iload_2
    //   11: invokevirtual 441	android/content/res/Resources:getResourceTypeName	(I)Ljava/lang/String;
    //   14: astore_3
    //   15: aload_3
    //   16: ldc_w 443
    //   19: invokevirtual 446	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   22: ifeq +111 -> 133
    //   25: aload_0
    //   26: getfield 67	com/tencent/mm/svg/a/a:vEr	[B
    //   29: astore 5
    //   31: aload 5
    //   33: monitorenter
    //   34: aload_0
    //   35: getfield 65	com/tencent/mm/svg/a/a:vEq	Landroid/util/TypedValue;
    //   38: astore 4
    //   40: aload 4
    //   42: astore_3
    //   43: aload 4
    //   45: ifnonnull +16 -> 61
    //   48: new 62	android/util/TypedValue
    //   51: dup
    //   52: invokespecial 63	android/util/TypedValue:<init>	()V
    //   55: astore_3
    //   56: aload_0
    //   57: aload_3
    //   58: putfield 65	com/tencent/mm/svg/a/a:vEq	Landroid/util/TypedValue;
    //   61: aload_1
    //   62: iload_2
    //   63: aload_3
    //   64: iconst_1
    //   65: invokevirtual 450	android/content/res/Resources:getValue	(ILandroid/util/TypedValue;Z)V
    //   68: aload_3
    //   69: getfield 454	android/util/TypedValue:string	Ljava/lang/CharSequence;
    //   72: invokeinterface 457 1 0
    //   77: astore_1
    //   78: aload 5
    //   80: monitorexit
    //   81: aload_1
    //   82: ldc_w 459
    //   85: invokevirtual 463	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   88: ifeq +45 -> 133
    //   91: ldc2_w 437
    //   94: sipush 25976
    //   97: invokestatic 56	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   100: iconst_1
    //   101: ireturn
    //   102: astore_1
    //   103: ldc 76
    //   105: aload_1
    //   106: ldc_w 465
    //   109: iconst_0
    //   110: anewarray 4	java/lang/Object
    //   113: invokestatic 466	com/tencent/mm/svg/b/c:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   116: ldc2_w 437
    //   119: sipush 25976
    //   122: invokestatic 56	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   125: iconst_0
    //   126: ireturn
    //   127: astore_1
    //   128: aload 5
    //   130: monitorexit
    //   131: aload_1
    //   132: athrow
    //   133: ldc2_w 437
    //   136: sipush 25976
    //   139: invokestatic 56	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   142: iconst_0
    //   143: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	144	0	this	a
    //   0	144	1	paramResources	Resources
    //   0	144	2	paramInt	int
    //   14	55	3	localObject	Object
    //   38	6	4	localTypedValue	TypedValue
    // Exception table:
    //   from	to	target	type
    //   9	15	102	android/content/res/Resources$NotFoundException
    //   34	40	127	finally
    //   48	61	127	finally
    //   61	81	127	finally
    //   128	131	127	finally
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\svg\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */