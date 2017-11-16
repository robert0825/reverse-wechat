package com.tencent.mm.plugin.appbrand.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.d;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.appbrand.m;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
import com.tencent.mm.ui.ad;

public final class AppBrandNearbyWebViewUI
  extends WebViewUI
{
  private static Boolean iBf;
  
  static
  {
    GMTrace.i(19505191321600L, 145325);
    iBf = null;
    GMTrace.o(19505191321600L, 145325);
  }
  
  public AppBrandNearbyWebViewUI()
  {
    GMTrace.i(10522938310656L, 78402);
    GMTrace.o(10522938310656L, 78402);
  }
  
  /* Error */
  public static boolean aaI()
  {
    // Byte code:
    //   0: ldc2_w 34
    //   3: ldc 36
    //   5: invokestatic 17	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: getstatic 19	com/tencent/mm/plugin/appbrand/ui/AppBrandNearbyWebViewUI:iBf	Ljava/lang/Boolean;
    //   11: ifnonnull +67 -> 78
    //   14: aconst_null
    //   15: astore_1
    //   16: new 38	java/io/FileInputStream
    //   19: dup
    //   20: new 40	java/io/File
    //   23: dup
    //   24: invokestatic 46	android/os/Environment:getRootDirectory	()Ljava/io/File;
    //   27: ldc 48
    //   29: invokespecial 51	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   32: invokespecial 54	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   35: astore_2
    //   36: aload_2
    //   37: astore_1
    //   38: new 56	java/util/Properties
    //   41: dup
    //   42: invokespecial 57	java/util/Properties:<init>	()V
    //   45: astore_3
    //   46: aload_2
    //   47: astore_1
    //   48: aload_3
    //   49: aload_2
    //   50: invokevirtual 61	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   53: aload_2
    //   54: astore_1
    //   55: aload_3
    //   56: ldc 63
    //   58: ldc 65
    //   60: invokevirtual 69	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   63: ldc 71
    //   65: invokevirtual 77	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   68: invokestatic 83	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   71: putstatic 19	com/tencent/mm/plugin/appbrand/ui/AppBrandNearbyWebViewUI:iBf	Ljava/lang/Boolean;
    //   74: aload_2
    //   75: invokevirtual 86	java/io/FileInputStream:close	()V
    //   78: getstatic 19	com/tencent/mm/plugin/appbrand/ui/AppBrandNearbyWebViewUI:iBf	Ljava/lang/Boolean;
    //   81: invokevirtual 89	java/lang/Boolean:booleanValue	()Z
    //   84: istore_0
    //   85: ldc2_w 34
    //   88: ldc 36
    //   90: invokestatic 22	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   93: iload_0
    //   94: ireturn
    //   95: astore_1
    //   96: aconst_null
    //   97: astore_2
    //   98: aload_2
    //   99: astore_1
    //   100: iconst_0
    //   101: invokestatic 83	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   104: putstatic 19	com/tencent/mm/plugin/appbrand/ui/AppBrandNearbyWebViewUI:iBf	Ljava/lang/Boolean;
    //   107: aload_2
    //   108: ifnull -30 -> 78
    //   111: aload_2
    //   112: invokevirtual 86	java/io/FileInputStream:close	()V
    //   115: goto -37 -> 78
    //   118: astore_1
    //   119: goto -41 -> 78
    //   122: astore_3
    //   123: aload_1
    //   124: astore_2
    //   125: aload_3
    //   126: astore_1
    //   127: aload_2
    //   128: ifnull +7 -> 135
    //   131: aload_2
    //   132: invokevirtual 86	java/io/FileInputStream:close	()V
    //   135: aload_1
    //   136: athrow
    //   137: astore_1
    //   138: goto -60 -> 78
    //   141: astore_2
    //   142: goto -7 -> 135
    //   145: astore_3
    //   146: aload_1
    //   147: astore_2
    //   148: aload_3
    //   149: astore_1
    //   150: goto -23 -> 127
    //   153: astore_1
    //   154: goto -56 -> 98
    // Local variable table:
    //   start	length	slot	name	signature
    //   84	10	0	bool	boolean
    //   15	40	1	localObject1	Object
    //   95	1	1	localException1	Exception
    //   99	1	1	localObject2	Object
    //   118	6	1	localException2	Exception
    //   126	10	1	localObject3	Object
    //   137	10	1	localException3	Exception
    //   149	1	1	localObject4	Object
    //   153	1	1	localException4	Exception
    //   35	97	2	localObject5	Object
    //   141	1	2	localException5	Exception
    //   147	1	2	localException6	Exception
    //   45	11	3	localProperties	java.util.Properties
    //   122	4	3	localObject6	Object
    //   145	4	3	localObject7	Object
    // Exception table:
    //   from	to	target	type
    //   16	36	95	java/lang/Exception
    //   111	115	118	java/lang/Exception
    //   16	36	122	finally
    //   74	78	137	java/lang/Exception
    //   131	135	141	java/lang/Exception
    //   38	46	145	finally
    //   48	53	145	finally
    //   55	74	145	finally
    //   100	107	145	finally
    //   38	46	153	java/lang/Exception
    //   48	53	153	java/lang/Exception
    //   55	74	153	java/lang/Exception
  }
  
  protected final void MP()
  {
    GMTrace.i(10523340963840L, 78405);
    super.MP();
    if (cN().cO() != null)
    {
      AV(-16777216);
      bXp();
      xU(-16777216);
      cN().cO().getCustomView().setBackgroundColor(-1052684);
      h.a(this);
    }
    GMTrace.o(10523340963840L, 78405);
  }
  
  protected final int aaH()
  {
    GMTrace.i(10523475181568L, 78406);
    if ((Build.VERSION.SDK_INT >= 23) && ((!com.tencent.mm.compatible.util.h.tE()) || (!aaI())))
    {
      ad.f(getWindow());
      GMTrace.o(10523475181568L, 78406);
      return -1052684;
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      i = m.hzU;
      GMTrace.o(10523475181568L, 78406);
      return i;
    }
    int i = super.aaH();
    GMTrace.o(10523475181568L, 78406);
    return i;
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    GMTrace.i(10523072528384L, 78403);
    if (getIntent() != null)
    {
      getIntent().putExtra("forceHideShare", true);
      getIntent().putExtra("disable_bounce_scroll", true);
      getIntent().putExtra("geta8key_scene", 41);
      getIntent().putExtra("title", getBaseContext().getString(R.l.cRX));
      getIntent().putExtra("show_long_click_popup_menu", false);
      getIntent().putExtra("key_load_js_without_delay", true);
    }
    super.onCreate(paramBundle);
    setResult(-1);
    GMTrace.o(10523072528384L, 78403);
  }
  
  public final void sq(String paramString)
  {
    GMTrace.i(10523206746112L, 78404);
    super.sq(paramString);
    AV(-16777216);
    GMTrace.o(10523206746112L, 78404);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\ui\AppBrandNearbyWebViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */