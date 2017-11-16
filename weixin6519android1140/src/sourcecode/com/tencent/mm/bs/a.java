package com.tencent.mm.bs;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Picture;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

public final class a
  extends Resources
{
  private static Method veo;
  private static Method vep;
  private Resources mResources;
  private e vel;
  private c vem;
  private boolean ven;
  
  static
  {
    GMTrace.i(367622356992L, 2739);
    veo = null;
    vep = null;
    GMTrace.o(367622356992L, 2739);
  }
  
  /* Error */
  private a(Resources paramResources, e parame, c paramc)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual 52	android/content/res/Resources:getAssets	()Landroid/content/res/AssetManager;
    //   5: aload_1
    //   6: invokevirtual 56	android/content/res/Resources:getDisplayMetrics	()Landroid/util/DisplayMetrics;
    //   9: aload_1
    //   10: invokevirtual 60	android/content/res/Resources:getConfiguration	()Landroid/content/res/Configuration;
    //   13: invokespecial 63	android/content/res/Resources:<init>	(Landroid/content/res/AssetManager;Landroid/util/DisplayMetrics;Landroid/content/res/Configuration;)V
    //   16: ldc2_w 64
    //   19: sipush 2720
    //   22: invokestatic 28	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   25: aload_0
    //   26: aload_2
    //   27: putfield 67	com/tencent/mm/bs/a:vel	Lcom/tencent/mm/bs/e;
    //   30: aload_0
    //   31: aload_1
    //   32: putfield 69	com/tencent/mm/bs/a:mResources	Landroid/content/res/Resources;
    //   35: aload_0
    //   36: aload_3
    //   37: putfield 71	com/tencent/mm/bs/a:vem	Lcom/tencent/mm/bs/c;
    //   40: ldc 73
    //   42: invokestatic 79	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   45: astore_3
    //   46: aload_3
    //   47: ifnull +95 -> 142
    //   50: ldc 81
    //   52: ldc 83
    //   54: invokestatic 88	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   57: aload_3
    //   58: ldc 90
    //   60: invokevirtual 94	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   63: astore_2
    //   64: aload_2
    //   65: astore_1
    //   66: aload_2
    //   67: ifnull +77 -> 144
    //   70: aload_2
    //   71: iconst_1
    //   72: invokevirtual 100	java/lang/reflect/Field:setAccessible	(Z)V
    //   75: aload_2
    //   76: aconst_null
    //   77: iconst_0
    //   78: invokestatic 106	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   81: invokevirtual 110	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   84: new 112	com/tencent/mm/compatible/loader/c
    //   87: dup
    //   88: aload_0
    //   89: invokevirtual 113	com/tencent/mm/bs/a:getAssets	()Landroid/content/res/AssetManager;
    //   92: ldc 115
    //   94: aconst_null
    //   95: invokespecial 118	com/tencent/mm/compatible/loader/c:<init>	(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V
    //   98: astore_1
    //   99: aload_1
    //   100: invokevirtual 122	com/tencent/mm/compatible/loader/c:tr	()Z
    //   103: ifeq +14 -> 117
    //   106: aload_1
    //   107: new 6	com/tencent/mm/bs/a$a
    //   110: dup
    //   111: invokespecial 124	com/tencent/mm/bs/a$a:<init>	()V
    //   114: invokevirtual 127	com/tencent/mm/compatible/loader/c:set	(Ljava/lang/Object;)V
    //   117: aload_0
    //   118: invokestatic 133	com/tencent/mm/sdk/platformtools/ab:bPV	()Landroid/content/SharedPreferences;
    //   121: ldc -121
    //   123: iconst_0
    //   124: invokeinterface 141 3 0
    //   129: putfield 143	com/tencent/mm/bs/a:ven	Z
    //   132: ldc2_w 64
    //   135: sipush 2720
    //   138: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   141: return
    //   142: aconst_null
    //   143: astore_1
    //   144: ldc 81
    //   146: ldc -111
    //   148: iconst_2
    //   149: anewarray 147	java/lang/Object
    //   152: dup
    //   153: iconst_0
    //   154: aload_3
    //   155: aastore
    //   156: dup
    //   157: iconst_1
    //   158: aload_1
    //   159: aastore
    //   160: invokestatic 151	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   163: goto -79 -> 84
    //   166: astore_1
    //   167: ldc 81
    //   169: ldc -103
    //   171: invokestatic 88	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   174: goto -90 -> 84
    //   177: astore_1
    //   178: ldc 81
    //   180: ldc -101
    //   182: invokestatic 88	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   185: goto -101 -> 84
    //   188: astore_1
    //   189: ldc 81
    //   191: ldc -99
    //   193: invokestatic 88	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   196: goto -112 -> 84
    //   199: astore_1
    //   200: ldc 81
    //   202: ldc -97
    //   204: invokestatic 88	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   207: goto -123 -> 84
    //   210: astore_1
    //   211: ldc 81
    //   213: aload_1
    //   214: ldc -95
    //   216: iconst_0
    //   217: anewarray 147	java/lang/Object
    //   220: invokestatic 165	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   223: goto -106 -> 117
    //   226: astore_1
    //   227: ldc 81
    //   229: aload_1
    //   230: ldc -95
    //   232: iconst_0
    //   233: anewarray 147	java/lang/Object
    //   236: invokestatic 165	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   239: goto -122 -> 117
    //   242: astore_1
    //   243: ldc 81
    //   245: aload_1
    //   246: ldc -95
    //   248: iconst_0
    //   249: anewarray 147	java/lang/Object
    //   252: invokestatic 165	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   255: goto -138 -> 117
    //   258: astore_1
    //   259: ldc 81
    //   261: aload_1
    //   262: invokevirtual 169	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   265: invokestatic 171	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   268: ldc2_w 64
    //   271: sipush 2720
    //   274: invokestatic 35	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   277: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	278	0	this	a
    //   0	278	1	paramResources	Resources
    //   0	278	2	parame	e
    //   0	278	3	paramc	c
    // Exception table:
    //   from	to	target	type
    //   40	46	166	java/lang/ClassNotFoundException
    //   50	64	166	java/lang/ClassNotFoundException
    //   70	84	166	java/lang/ClassNotFoundException
    //   144	163	166	java/lang/ClassNotFoundException
    //   40	46	177	java/lang/NoSuchFieldException
    //   50	64	177	java/lang/NoSuchFieldException
    //   70	84	177	java/lang/NoSuchFieldException
    //   144	163	177	java/lang/NoSuchFieldException
    //   40	46	188	java/lang/IllegalAccessException
    //   50	64	188	java/lang/IllegalAccessException
    //   70	84	188	java/lang/IllegalAccessException
    //   144	163	188	java/lang/IllegalAccessException
    //   40	46	199	java/lang/IllegalArgumentException
    //   50	64	199	java/lang/IllegalArgumentException
    //   70	84	199	java/lang/IllegalArgumentException
    //   144	163	199	java/lang/IllegalArgumentException
    //   99	117	210	java/lang/NoSuchFieldException
    //   99	117	226	java/lang/IllegalAccessException
    //   99	117	242	java/lang/IllegalArgumentException
    //   117	132	258	java/lang/Exception
  }
  
  public static Resources a(Resources paramResources, Context paramContext)
  {
    GMTrace.i(365340655616L, 2722);
    paramResources = new a(paramResources, e.eh(paramContext), new c());
    GMTrace.o(365340655616L, 2722);
    return paramResources;
  }
  
  public static Drawable b(Resources paramResources, int paramInt)
  {
    int i = 1;
    GMTrace.i(367488139264L, 2738);
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
            break label358;
          }
          if (((TypedValue)localObject3).string != null) {
            break label278;
          }
          throw new Resources.NotFoundException("Resource is not a Drawable (color or path): " + localObject3);
        }
        catch (NoSuchMethodException paramResources)
        {
          w.printErrStackTrace("MicroMsg.MMResources", paramResources, "", new Object[0]);
          w.printErrStackTrace("MicroMsg.MMResources", paramResources, "", new Object[0]);
          GMTrace.o(367488139264L, 2738);
          return null;
        }
        paramResources = paramResources;
        w.printErrStackTrace("MicroMsg.MMResources", paramResources, "", new Object[0]);
        w.printErrStackTrace("MicroMsg.MMResources", paramResources, "", new Object[0]);
        GMTrace.o(367488139264L, 2738);
        return null;
      }
      label278:
      if (((String)localObject1).endsWith(".xml")) {}
      for (;;)
      {
        try
        {
          localObject3 = (XmlResourceParser)veo.invoke(paramResources, new Object[] { localObject1, Integer.valueOf(paramInt), Integer.valueOf(((TypedValue)localObject3).assetCookie), "drawable" });
          localObject2 = Drawable.createFromXml(paramResources, (XmlPullParser)localObject3);
          ((XmlResourceParser)localObject3).close();
          label358:
          GMTrace.o(367488139264L, 2738);
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
  
  private boolean bOC()
  {
    GMTrace.i(365474873344L, 2723);
    if ((this.vel != null) && (e.bOC()))
    {
      GMTrace.o(365474873344L, 2723);
      return true;
    }
    GMTrace.o(365474873344L, 2723);
    return false;
  }
  
  private Drawable d(Drawable paramDrawable, int paramInt)
  {
    GMTrace.i(367353921536L, 2737);
    Object localObject = paramDrawable;
    if (paramDrawable == null) {
      w.k("MicroMsg.MMResources", "Notice!!! drawable == null!!!", new Object[0]);
    }
    try
    {
      if (this.vem.vev.d(this, paramInt)) {
        w.e("MicroMsg.MMResources", "resources name = %s, this resource %s", new Object[] { getResourceName(paramInt), this });
      }
      localObject = new com.tencent.mm.svg.a.c(new Picture(), 0);
      GMTrace.o(367353921536L, 2737);
      return (Drawable)localObject;
    }
    catch (Exception paramDrawable)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.MMResources", paramDrawable, "WTF", new Object[0]);
      }
    }
  }
  
  public final void bOB()
  {
    GMTrace.i(365206437888L, 2721);
    updateConfiguration(this.mResources.getConfiguration(), this.mResources.getDisplayMetrics());
    GMTrace.o(365206437888L, 2721);
  }
  
  public final Drawable getDrawable(int paramInt)
  {
    GMTrace.i(366817050624L, 2733);
    if (paramInt != 0)
    {
      localDrawable = this.vem.c(this.mResources, paramInt);
      if (localDrawable != null)
      {
        GMTrace.o(366817050624L, 2733);
        return localDrawable;
      }
    }
    Drawable localDrawable = d(super.getDrawable(paramInt), paramInt);
    GMTrace.o(366817050624L, 2733);
    return localDrawable;
  }
  
  @TargetApi(21)
  public final Drawable getDrawable(int paramInt, Resources.Theme paramTheme)
  {
    GMTrace.i(366951268352L, 2734);
    if (paramInt != 0)
    {
      Drawable localDrawable = this.vem.c(this.mResources, paramInt);
      if (localDrawable != null)
      {
        GMTrace.o(366951268352L, 2734);
        return localDrawable;
      }
    }
    paramTheme = d(super.getDrawable(paramInt, paramTheme), paramInt);
    GMTrace.o(366951268352L, 2734);
    return paramTheme;
  }
  
  public final Drawable getDrawableForDensity(int paramInt1, int paramInt2)
  {
    GMTrace.i(367085486080L, 2735);
    if (paramInt1 != 0)
    {
      localDrawable = this.vem.c(this.mResources, paramInt1);
      if (localDrawable != null)
      {
        GMTrace.o(367085486080L, 2735);
        return localDrawable;
      }
    }
    Drawable localDrawable = d(super.getDrawableForDensity(paramInt1, paramInt2), paramInt1);
    GMTrace.o(367085486080L, 2735);
    return localDrawable;
  }
  
  @TargetApi(22)
  public final Drawable getDrawableForDensity(int paramInt1, int paramInt2, Resources.Theme paramTheme)
  {
    GMTrace.i(367219703808L, 2736);
    if (paramInt1 != 0)
    {
      Drawable localDrawable = this.vem.c(this.mResources, paramInt1);
      if (localDrawable != null)
      {
        GMTrace.o(367219703808L, 2736);
        return localDrawable;
      }
    }
    paramTheme = d(super.getDrawableForDensity(paramInt1, paramInt2, paramTheme), paramInt1);
    GMTrace.o(367219703808L, 2736);
    return paramTheme;
  }
  
  public final String getQuantityString(int paramInt1, int paramInt2)
  {
    GMTrace.i(366011744256L, 2727);
    if (this.ven)
    {
      str = this.mResources.getResourceEntryName(paramInt1);
      GMTrace.o(366011744256L, 2727);
      return str;
    }
    if (bOC())
    {
      str = e.getQuantityString(paramInt1, paramInt2);
      if (str != null)
      {
        str = str.toString();
        GMTrace.o(366011744256L, 2727);
        return str;
      }
    }
    String str = this.mResources.getQuantityString(paramInt1, paramInt2);
    GMTrace.o(366011744256L, 2727);
    return str;
  }
  
  public final String getQuantityString(int paramInt1, int paramInt2, Object... paramVarArgs)
  {
    GMTrace.i(366145961984L, 2728);
    if (this.ven)
    {
      paramVarArgs = this.mResources.getResourceEntryName(paramInt1);
      GMTrace.o(366145961984L, 2728);
      return paramVarArgs;
    }
    if (bOC())
    {
      String str = e.getQuantityString(paramInt1, paramInt2, paramVarArgs);
      if (str != null)
      {
        paramVarArgs = str.toString();
        GMTrace.o(366145961984L, 2728);
        return paramVarArgs;
      }
    }
    paramVarArgs = this.mResources.getQuantityString(paramInt1, paramInt2, paramVarArgs);
    GMTrace.o(366145961984L, 2728);
    return paramVarArgs;
  }
  
  public final CharSequence getQuantityText(int paramInt1, int paramInt2)
  {
    GMTrace.i(366280179712L, 2729);
    if (this.ven)
    {
      str = this.mResources.getResourceEntryName(paramInt1);
      GMTrace.o(366280179712L, 2729);
      return str;
    }
    if (bOC())
    {
      str = e.getQuantityString(paramInt1, paramInt2);
      if (str != null)
      {
        str = str.toString();
        GMTrace.o(366280179712L, 2729);
        return str;
      }
    }
    String str = this.mResources.getQuantityString(paramInt1, paramInt2);
    GMTrace.o(366280179712L, 2729);
    return str;
  }
  
  public final String getString(int paramInt)
  {
    GMTrace.i(365877526528L, 2726);
    Object localObject;
    if (this.ven)
    {
      localObject = this.mResources.getResourceEntryName(paramInt);
      GMTrace.o(365877526528L, 2726);
      return (String)localObject;
    }
    if (bOC())
    {
      localObject = e.getString(paramInt);
      if (localObject != null)
      {
        localObject = e.d(paramInt, ((CharSequence)localObject).toString()).toString();
        GMTrace.o(365877526528L, 2726);
        return (String)localObject;
      }
    }
    try
    {
      localObject = e.d(paramInt, this.mResources.getString(paramInt));
      if (localObject != null)
      {
        localObject = ((CharSequence)localObject).toString();
        GMTrace.o(365877526528L, 2726);
        return (String)localObject;
      }
      localObject = this.mResources.getString(paramInt);
      GMTrace.o(365877526528L, 2726);
      return (String)localObject;
    }
    catch (Exception localException)
    {
      GMTrace.o(365877526528L, 2726);
    }
    return "";
  }
  
  public final String[] getStringArray(int paramInt)
  {
    GMTrace.i(366414397440L, 2730);
    if (bOC())
    {
      arrayOfString = e.getStringArray(paramInt);
      if (arrayOfString != null)
      {
        GMTrace.o(366414397440L, 2730);
        return arrayOfString;
      }
    }
    String[] arrayOfString = super.getStringArray(paramInt);
    GMTrace.o(366414397440L, 2730);
    return arrayOfString;
  }
  
  public final CharSequence getText(int paramInt)
  {
    GMTrace.i(365609091072L, 2724);
    if (this.ven)
    {
      localObject = this.mResources.getResourceEntryName(paramInt);
      GMTrace.o(365609091072L, 2724);
      return (CharSequence)localObject;
    }
    if (bOC())
    {
      localObject = e.d(paramInt, e.getString(paramInt));
      if (localObject != null)
      {
        GMTrace.o(365609091072L, 2724);
        return (CharSequence)localObject;
      }
    }
    Object localObject = e.d(paramInt, this.mResources.getString(paramInt));
    if (localObject != null)
    {
      localObject = ((CharSequence)localObject).toString();
      GMTrace.o(365609091072L, 2724);
      return (CharSequence)localObject;
    }
    localObject = this.mResources.getString(paramInt);
    GMTrace.o(365609091072L, 2724);
    return (CharSequence)localObject;
  }
  
  public final CharSequence getText(int paramInt, CharSequence paramCharSequence)
  {
    GMTrace.i(365743308800L, 2725);
    if (this.ven)
    {
      paramCharSequence = this.mResources.getResourceEntryName(paramInt);
      GMTrace.o(365743308800L, 2725);
      return paramCharSequence;
    }
    if (bOC())
    {
      paramCharSequence = e.d(paramInt, e.getString(paramInt));
      if (paramCharSequence != null)
      {
        GMTrace.o(365743308800L, 2725);
        return paramCharSequence;
      }
    }
    paramCharSequence = e.d(paramInt, this.mResources.getString(paramInt));
    if (paramCharSequence != null)
    {
      paramCharSequence = paramCharSequence.toString();
      GMTrace.o(365743308800L, 2725);
      return paramCharSequence;
    }
    paramCharSequence = this.mResources.getString(paramInt);
    GMTrace.o(365743308800L, 2725);
    return paramCharSequence;
  }
  
  public final CharSequence[] getTextArray(int paramInt)
  {
    GMTrace.i(366548615168L, 2731);
    Object localObject = getStringArray(paramInt);
    if (localObject != null)
    {
      GMTrace.o(366548615168L, 2731);
      return (CharSequence[])localObject;
    }
    localObject = super.getTextArray(paramInt);
    GMTrace.o(366548615168L, 2731);
    return (CharSequence[])localObject;
  }
  
  public final TypedArray obtainTypedArray(int paramInt)
  {
    GMTrace.i(366682832896L, 2732);
    TypedArray localTypedArray = this.mResources.obtainTypedArray(paramInt);
    GMTrace.o(366682832896L, 2732);
    return localTypedArray;
  }
  
  public static final class a<E>
    extends ArrayList<E>
  {
    public a()
    {
      GMTrace.i(368830316544L, 2748);
      GMTrace.o(368830316544L, 2748);
    }
    
    public final void add(int paramInt, E paramE)
    {
      GMTrace.i(369098752000L, 2750);
      w.i("InterceptArrayList", "InterceptArrayList.add index object");
      GMTrace.o(369098752000L, 2750);
    }
    
    public final boolean add(E paramE)
    {
      GMTrace.i(368964534272L, 2749);
      w.i("InterceptArrayList", "InterceptArrayList.add");
      GMTrace.o(368964534272L, 2749);
      return true;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bs\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */