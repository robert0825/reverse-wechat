package com.tencent.mm.plugin.appbrand.ui;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.plugin.appbrand.o.g;
import com.tencent.mm.plugin.appbrand.o.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ad;
import com.tencent.mm.ui.base.k;
import com.tencent.mm.ui.base.u;
import java.lang.reflect.Method;

public enum g
{
  private static Boolean iBf;
  private static final Method iDe;
  
  static
  {
    GMTrace.i(10515153682432L, 78344);
    iDf = new g[0];
    Method localMethod;
    if (Build.VERSION.SDK_INT < 24) {
      localMethod = null;
    }
    for (;;)
    {
      iDe = localMethod;
      iBf = null;
      GMTrace.o(10515153682432L, 78344);
      return;
      try
      {
        localMethod = Activity.class.getMethod("isInMultiWindowMode", new Class[0]);
      }
      catch (Exception localException)
      {
        Object localObject = null;
      }
    }
  }
  
  public static void a(Window paramWindow)
  {
    GMTrace.i(10514214158336L, 78337);
    ad.a(paramWindow);
    GMTrace.o(10514214158336L, 78337);
  }
  
  public static boolean a(Window paramWindow, boolean paramBoolean)
  {
    GMTrace.i(19700478115840L, 146780);
    if ((paramWindow == null) || (paramWindow.getDecorView() == null))
    {
      GMTrace.o(19700478115840L, 146780);
      return false;
    }
    if ((Build.VERSION.SDK_INT >= 23) && ((!h.tE()) || (!aaI())))
    {
      paramWindow = paramWindow.getDecorView();
      int i = paramWindow.getSystemUiVisibility();
      if (paramBoolean) {
        i |= 0x2000;
      }
      for (;;)
      {
        paramWindow.setSystemUiVisibility(i);
        GMTrace.o(19700478115840L, 146780);
        return true;
        i &= 0xDFFF;
      }
    }
    GMTrace.o(19700478115840L, 146780);
    return false;
  }
  
  /* Error */
  private static boolean aaI()
  {
    // Byte code:
    //   0: ldc2_w 91
    //   3: ldc 93
    //   5: invokestatic 26	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: getstatic 38	com/tencent/mm/plugin/appbrand/ui/g:iBf	Ljava/lang/Boolean;
    //   11: ifnonnull +65 -> 76
    //   14: new 95	java/io/FileInputStream
    //   17: dup
    //   18: new 97	java/io/File
    //   21: dup
    //   22: invokestatic 103	android/os/Environment:getRootDirectory	()Ljava/io/File;
    //   25: ldc 105
    //   27: invokespecial 109	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   30: invokespecial 112	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   33: astore_2
    //   34: aload_2
    //   35: astore_1
    //   36: new 114	java/util/Properties
    //   39: dup
    //   40: invokespecial 116	java/util/Properties:<init>	()V
    //   43: astore_3
    //   44: aload_2
    //   45: astore_1
    //   46: aload_3
    //   47: aload_2
    //   48: invokevirtual 120	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   51: aload_2
    //   52: astore_1
    //   53: aload_3
    //   54: ldc 122
    //   56: ldc 124
    //   58: invokevirtual 128	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   61: ldc -126
    //   63: invokevirtual 136	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   66: invokestatic 142	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   69: putstatic 38	com/tencent/mm/plugin/appbrand/ui/g:iBf	Ljava/lang/Boolean;
    //   72: aload_2
    //   73: invokevirtual 145	java/io/FileInputStream:close	()V
    //   76: getstatic 38	com/tencent/mm/plugin/appbrand/ui/g:iBf	Ljava/lang/Boolean;
    //   79: invokevirtual 148	java/lang/Boolean:booleanValue	()Z
    //   82: istore_0
    //   83: ldc2_w 91
    //   86: ldc 93
    //   88: invokestatic 41	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   91: iload_0
    //   92: ireturn
    //   93: astore_3
    //   94: aconst_null
    //   95: astore_2
    //   96: aload_2
    //   97: astore_1
    //   98: ldc -106
    //   100: aload_3
    //   101: ldc -104
    //   103: iconst_0
    //   104: anewarray 154	java/lang/Object
    //   107: invokestatic 160	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   110: aload_2
    //   111: astore_1
    //   112: iconst_0
    //   113: invokestatic 142	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   116: putstatic 38	com/tencent/mm/plugin/appbrand/ui/g:iBf	Ljava/lang/Boolean;
    //   119: aload_2
    //   120: ifnull -44 -> 76
    //   123: aload_2
    //   124: invokevirtual 145	java/io/FileInputStream:close	()V
    //   127: goto -51 -> 76
    //   130: astore_1
    //   131: goto -55 -> 76
    //   134: astore_2
    //   135: aconst_null
    //   136: astore_1
    //   137: aload_1
    //   138: ifnull +7 -> 145
    //   141: aload_1
    //   142: invokevirtual 145	java/io/FileInputStream:close	()V
    //   145: aload_2
    //   146: athrow
    //   147: astore_1
    //   148: goto -72 -> 76
    //   151: astore_1
    //   152: goto -7 -> 145
    //   155: astore_2
    //   156: goto -19 -> 137
    //   159: astore_3
    //   160: goto -64 -> 96
    // Local variable table:
    //   start	length	slot	name	signature
    //   82	10	0	bool	boolean
    //   35	77	1	localFileInputStream1	java.io.FileInputStream
    //   130	1	1	localException1	Exception
    //   136	6	1	localObject1	Object
    //   147	1	1	localException2	Exception
    //   151	1	1	localException3	Exception
    //   33	91	2	localFileInputStream2	java.io.FileInputStream
    //   134	12	2	localObject2	Object
    //   155	1	2	localObject3	Object
    //   43	11	3	localProperties	java.util.Properties
    //   93	8	3	localException4	Exception
    //   159	1	3	localException5	Exception
    // Exception table:
    //   from	to	target	type
    //   14	34	93	java/lang/Exception
    //   123	127	130	java/lang/Exception
    //   14	34	134	finally
    //   72	76	147	java/lang/Exception
    //   141	145	151	java/lang/Exception
    //   36	44	155	finally
    //   46	51	155	finally
    //   53	72	155	finally
    //   98	110	155	finally
    //   112	119	155	finally
    //   36	44	159	java/lang/Exception
    //   46	51	159	java/lang/Exception
    //   53	72	159	java/lang/Exception
  }
  
  public static int aaN()
  {
    GMTrace.i(10514885246976L, 78342);
    int i = u.ad(ab.getContext(), com.tencent.mm.br.a.fromDPToPix(ab.getContext(), 25));
    GMTrace.o(10514885246976L, 78342);
    return i;
  }
  
  public static int[] aaW()
  {
    GMTrace.i(14342640631808L, 106861);
    Display localDisplay = ((WindowManager)ab.getContext().getSystemService("window")).getDefaultDisplay();
    int i = localDisplay.getWidth();
    int j = localDisplay.getHeight();
    GMTrace.o(14342640631808L, 106861);
    return new int[] { i, j };
  }
  
  public static int at(String paramString, int paramInt)
  {
    GMTrace.i(19700746551296L, 146782);
    paramInt = (int)q(paramString, Long.valueOf(paramInt).longValue());
    GMTrace.o(19700746551296L, 146782);
    return paramInt;
  }
  
  public static boolean b(Window paramWindow)
  {
    GMTrace.i(19700343898112L, 146779);
    boolean bool = a(paramWindow, true);
    GMTrace.o(19700343898112L, 146779);
    return bool;
  }
  
  public static boolean bI(View paramView)
  {
    GMTrace.i(10514751029248L, 78341);
    if (Build.VERSION.SDK_INT < 24)
    {
      GMTrace.o(10514751029248L, 78341);
      return false;
    }
    if (paramView == null)
    {
      GMTrace.o(10514751029248L, 78341);
      return false;
    }
    Context localContext = paramView.getContext();
    paramView = localContext;
    if ((localContext instanceof ContextWrapper))
    {
      paramView = localContext;
      if (!(localContext instanceof Activity)) {
        paramView = ((ContextWrapper)localContext).getBaseContext();
      }
    }
    if (((paramView instanceof Activity)) && (i((Activity)paramView)))
    {
      GMTrace.o(10514751029248L, 78341);
      return true;
    }
    GMTrace.o(10514751029248L, 78341);
    return false;
  }
  
  public static k bQ(Context paramContext)
  {
    GMTrace.i(10513945722880L, 78335);
    View localView = View.inflate(paramContext, o.g.hDr, null);
    final k localk = new k(paramContext, o.j.hGX);
    localk.setContentView(localView);
    localk.setCancelable(true);
    localk.setCanceledOnTouchOutside(false);
    localk.setOnCancelListener(new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(15508858470400L, 115550);
        if ((this.val$context instanceof MMActivity)) {
          ((MMActivity)this.val$context).finish();
        }
        localk.setOnCancelListener(null);
        GMTrace.o(15508858470400L, 115550);
      }
    });
    GMTrace.o(10513945722880L, 78335);
    return localk;
  }
  
  public static Activity bR(Context paramContext)
  {
    GMTrace.i(16283697414144L, 121323);
    if ((paramContext != null) && ((paramContext instanceof ContextWrapper)) && (!(paramContext instanceof Activity))) {
      paramContext = ((ContextWrapper)paramContext).getBaseContext();
    }
    for (;;)
    {
      if ((paramContext instanceof Activity))
      {
        paramContext = (Activity)paramContext;
        GMTrace.o(16283697414144L, 121323);
        return paramContext;
      }
      GMTrace.o(16283697414144L, 121323);
      return null;
    }
  }
  
  public static Drawable c(Context paramContext, int paramInt1, int paramInt2)
  {
    GMTrace.i(17660905521152L, 131584);
    Bitmap localBitmap = com.tencent.mm.compatible.f.a.decodeResource(paramContext.getResources(), paramInt1);
    if (localBitmap != null)
    {
      paramContext = new BitmapDrawable(paramContext.getResources(), localBitmap);
      paramContext.setColorFilter(paramInt2, PorterDuff.Mode.SRC_ATOP);
      GMTrace.o(17660905521152L, 131584);
      return paramContext;
    }
    GMTrace.o(17660905521152L, 131584);
    return null;
  }
  
  public static boolean c(Window paramWindow)
  {
    GMTrace.i(10514482593792L, 78339);
    if ((paramWindow == null) || (paramWindow.getDecorView() == null))
    {
      GMTrace.o(10514482593792L, 78339);
      return false;
    }
    if ((Build.VERSION.SDK_INT >= 23) && ((paramWindow.getDecorView().getSystemUiVisibility() & 0x2000) != 0))
    {
      GMTrace.o(10514482593792L, 78339);
      return true;
    }
    GMTrace.o(10514482593792L, 78339);
    return false;
  }
  
  private static boolean i(Activity paramActivity)
  {
    GMTrace.i(10514616811520L, 78340);
    try
    {
      Method localMethod = iDe;
      if (localMethod != null)
      {
        localMethod.setAccessible(true);
        boolean bool = ((Boolean)localMethod.invoke(paramActivity, new Object[0])).booleanValue();
        GMTrace.o(10514616811520L, 78340);
        return bool;
      }
      w.d("MicroMsg.AppBrandUIUtil", "isInMultiWindowMode method null");
    }
    catch (Exception paramActivity)
    {
      for (;;)
      {
        w.d("MicroMsg.AppBrandUIUtil", "isInMultiWindowMode, exp %s", new Object[] { paramActivity });
      }
    }
    GMTrace.o(10514616811520L, 78340);
    return false;
  }
  
  public static int jE(int paramInt)
  {
    GMTrace.i(19700209680384L, 146778);
    paramInt = ad.d(paramInt, -16777216, 0.78F);
    GMTrace.o(19700209680384L, 146778);
    return paramInt;
  }
  
  private static long q(String paramString, long paramLong)
  {
    GMTrace.i(19700880769024L, 146783);
    if (bg.nm(paramString))
    {
      GMTrace.o(19700880769024L, 146783);
      return paramLong;
    }
    Object localObject = paramString;
    if (paramString.startsWith("#"))
    {
      localObject = paramString;
      if (paramString.length() == 4)
      {
        localObject = new StringBuilder(paramString);
        ((StringBuilder)localObject).insert(2, paramString.charAt(1));
        ((StringBuilder)localObject).insert(4, paramString.charAt(2));
        ((StringBuilder)localObject).insert(6, paramString.charAt(3));
        localObject = ((StringBuilder)localObject).toString();
      }
    }
    try
    {
      int i = Color.parseColor((String)localObject);
      paramLong = i;
      GMTrace.o(19700880769024L, 146783);
      return 0xFFFFFFFF & paramLong;
    }
    catch (Exception paramString)
    {
      w.e("MicroMsg.AppBrandUIUtil", "Failed to parse color: %s", new Object[] { localObject });
      GMTrace.o(19700880769024L, 146783);
    }
    return paramLong;
  }
  
  public static void s(View paramView, int paramInt)
  {
    GMTrace.i(16342753214464L, 121763);
    if ((paramView != null) && (paramView.getVisibility() != paramInt)) {
      paramView.setVisibility(paramInt);
    }
    GMTrace.o(16342753214464L, 121763);
  }
  
  public static long sr(String paramString)
  {
    GMTrace.i(19700612333568L, 146781);
    long l = q(paramString, -1L);
    GMTrace.o(19700612333568L, 146781);
    return l;
  }
  
  public static boolean tE()
  {
    GMTrace.i(20366063828992L, 151739);
    boolean bool = h.tE();
    GMTrace.o(20366063828992L, 151739);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\ui\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */