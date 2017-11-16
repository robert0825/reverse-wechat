package com.tencent.mm.compatible.f;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import com.tencent.gmtrace.GMTrace;

public final class a
  extends BitmapFactory
{
  private static a fRK;
  
  static
  {
    GMTrace.i(13776778690560L, 102645);
    fRK = null;
    GMTrace.o(13776778690560L, 102645);
  }
  
  /* Error */
  private static Bitmap a(Resources paramResources, int paramInt, BitmapFactory.Options paramOptions)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore 5
    //   5: aconst_null
    //   6: astore 4
    //   8: ldc2_w 32
    //   11: ldc 34
    //   13: invokestatic 20	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   16: aload_2
    //   17: invokestatic 40	com/tencent/mm/sdk/platformtools/d:b	(Landroid/graphics/BitmapFactory$Options;)V
    //   20: new 42	android/util/TypedValue
    //   23: dup
    //   24: invokespecial 45	android/util/TypedValue:<init>	()V
    //   27: astore 7
    //   29: aload_0
    //   30: iload_1
    //   31: aload 7
    //   33: invokevirtual 51	android/content/res/Resources:openRawResource	(ILandroid/util/TypedValue;)Ljava/io/InputStream;
    //   36: astore 6
    //   38: aload 6
    //   40: astore_3
    //   41: aload_0
    //   42: aload 7
    //   44: aload_3
    //   45: aconst_null
    //   46: aload_2
    //   47: invokestatic 55	com/tencent/mm/compatible/f/a:decodeResourceStream	(Landroid/content/res/Resources;Landroid/util/TypedValue;Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   50: astore_0
    //   51: aload_0
    //   52: astore 4
    //   54: aload_0
    //   55: ifnonnull +9 -> 64
    //   58: aload_3
    //   59: invokestatic 59	com/tencent/mm/compatible/f/a:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   62: astore 4
    //   64: aload 4
    //   66: astore 5
    //   68: aload_3
    //   69: ifnull +11 -> 80
    //   72: aload_3
    //   73: invokevirtual 64	java/io/InputStream:close	()V
    //   76: aload 4
    //   78: astore 5
    //   80: aload 5
    //   82: ifnonnull +64 -> 146
    //   85: aload_2
    //   86: ifnull +60 -> 146
    //   89: new 66	java/lang/IllegalArgumentException
    //   92: dup
    //   93: ldc 68
    //   95: invokespecial 71	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   98: athrow
    //   99: astore_0
    //   100: aconst_null
    //   101: astore 4
    //   103: aload_3
    //   104: astore_0
    //   105: aload 4
    //   107: astore_3
    //   108: aload_0
    //   109: astore 5
    //   111: aload_3
    //   112: ifnull -32 -> 80
    //   115: aload_3
    //   116: invokevirtual 64	java/io/InputStream:close	()V
    //   119: aload_0
    //   120: astore 5
    //   122: goto -42 -> 80
    //   125: astore_3
    //   126: aload_0
    //   127: astore 5
    //   129: goto -49 -> 80
    //   132: astore_0
    //   133: aload 5
    //   135: astore_3
    //   136: aload_3
    //   137: ifnull +7 -> 144
    //   140: aload_3
    //   141: invokevirtual 64	java/io/InputStream:close	()V
    //   144: aload_0
    //   145: athrow
    //   146: ldc2_w 32
    //   149: ldc 34
    //   151: invokestatic 25	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   154: aload 5
    //   156: areturn
    //   157: astore_0
    //   158: aload 4
    //   160: astore_0
    //   161: goto -110 -> 51
    //   164: astore_0
    //   165: aload 4
    //   167: astore 5
    //   169: goto -89 -> 80
    //   172: astore_2
    //   173: goto -29 -> 144
    //   176: astore_0
    //   177: goto -41 -> 136
    //   180: astore 4
    //   182: goto -74 -> 108
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	185	0	paramResources	Resources
    //   0	185	1	paramInt	int
    //   0	185	2	paramOptions	BitmapFactory.Options
    //   1	115	3	localObject1	Object
    //   125	1	3	localIOException	java.io.IOException
    //   135	6	3	localObject2	Object
    //   6	160	4	localObject3	Object
    //   180	1	4	localException	Exception
    //   3	165	5	localObject4	Object
    //   36	3	6	localInputStream	java.io.InputStream
    //   27	16	7	localTypedValue	android.util.TypedValue
    // Exception table:
    //   from	to	target	type
    //   20	38	99	java/lang/Exception
    //   115	119	125	java/io/IOException
    //   20	38	132	finally
    //   41	51	157	java/lang/Exception
    //   72	76	164	java/io/IOException
    //   140	144	172	java/io/IOException
    //   41	51	176	finally
    //   58	64	176	finally
    //   58	64	180	java/lang/Exception
  }
  
  public static void a(a parama)
  {
    GMTrace.i(13776241819648L, 102641);
    fRK = parama;
    GMTrace.o(13776241819648L, 102641);
  }
  
  public static Bitmap decodeResource(Resources paramResources, int paramInt)
  {
    GMTrace.i(13776376037376L, 102642);
    paramResources = decodeResource(paramResources, paramInt, null);
    GMTrace.o(13776376037376L, 102642);
    return paramResources;
  }
  
  public static Bitmap decodeResource(Resources paramResources, int paramInt, BitmapFactory.Options paramOptions)
  {
    GMTrace.i(13776510255104L, 102643);
    if (fRK != null)
    {
      Bitmap localBitmap = fRK.decodeResource(paramResources, paramInt, paramOptions);
      if (localBitmap != null)
      {
        GMTrace.o(13776510255104L, 102643);
        return localBitmap;
      }
    }
    paramResources = a(paramResources, paramInt, paramOptions);
    GMTrace.o(13776510255104L, 102643);
    return paramResources;
  }
  
  public static abstract interface a
  {
    public abstract Bitmap decodeResource(Resources paramResources, int paramInt, BitmapFactory.Options paramOptions);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\compatible\f\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */