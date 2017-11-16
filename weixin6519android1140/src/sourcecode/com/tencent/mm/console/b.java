package com.tencent.mm.console;

import android.app.Activity;
import android.app.ProgressDialog;
import android.bluetooth.BluetoothAdapter;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Looper;
import android.text.ClipboardManager;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.app.WorkerProfile;
import com.tencent.mm.g.a.bd;
import com.tencent.mm.g.a.bj;
import com.tencent.mm.g.a.bl;
import com.tencent.mm.g.a.cc;
import com.tencent.mm.g.a.ch;
import com.tencent.mm.g.a.ci;
import com.tencent.mm.g.a.cj;
import com.tencent.mm.g.a.ck;
import com.tencent.mm.g.a.fm;
import com.tencent.mm.g.a.lx;
import com.tencent.mm.g.a.pf;
import com.tencent.mm.g.a.pi;
import com.tencent.mm.g.a.pt;
import com.tencent.mm.g.a.py;
import com.tencent.mm.g.a.tl;
import com.tencent.mm.g.a.tn;
import com.tencent.mm.g.a.z;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelsimple.u;
import com.tencent.mm.modelstat.WatchDogPushReceiver;
import com.tencent.mm.platformtools.SpellMap;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.ao;
import com.tencent.mm.pluginsdk.p.a;
import com.tencent.mm.pluginsdk.p.e;
import com.tencent.mm.pluginsdk.p.i;
import com.tencent.mm.pluginsdk.p.j;
import com.tencent.mm.pluginsdk.p.u;
import com.tencent.mm.pluginsdk.p.x;
import com.tencent.mm.pluginsdk.p.y;
import com.tencent.mm.protocal.ac;
import com.tencent.mm.protocal.c.apq;
import com.tencent.mm.protocal.c.apr;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.al.a;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.av;
import com.tencent.mm.sdk.platformtools.av.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.MMAppMgr;
import com.tencent.mm.ui.chatting.En_5b8fbb1e.a;
import com.tencent.mm.ui.chatting.ag;
import com.tencent.mm.ui.chatting.b.o;
import com.tencent.mm.ui.e.g;
import com.tencent.mm.y.ah;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.b;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bb;
import com.tencent.mm.y.be;
import com.tencent.mm.y.bf;
import com.tencent.mm.y.bf.a;
import com.tencent.mm.y.bj.a;
import com.tencent.mm.y.bt;
import com.tencent.mm.y.c.a.a;
import com.tencent.xweb.WebView;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;

public final class b
{
  static
  {
    GMTrace.i(424799109120L, 3165);
    com.tencent.mm.console.a.b.init();
    com.tencent.mm.console.a.g.init();
    com.tencent.mm.console.a.h.init();
    com.tencent.mm.console.a.e.init();
    com.tencent.mm.console.a.c.init();
    com.tencent.mm.console.a.d.init();
    com.tencent.mm.console.a.a.init();
    com.tencent.mm.console.a.j.init();
    com.tencent.mm.console.a.f.init();
    com.tencent.mm.console.a.i.init();
    com.tencent.mm.console.a.k.init();
    GMTrace.o(424799109120L, 3165);
  }
  
  /* Error */
  private static StringBuilder eA(int paramInt)
  {
    // Byte code:
    //   0: ldc2_w 112
    //   3: sipush 3162
    //   6: invokestatic 68	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: new 115	java/util/Date
    //   12: dup
    //   13: invokestatic 121	com/tencent/mm/sdk/platformtools/bg:Pv	()J
    //   16: iload_0
    //   17: i2l
    //   18: ldc2_w 122
    //   21: lmul
    //   22: lsub
    //   23: invokespecial 127	java/util/Date:<init>	(J)V
    //   26: astore_1
    //   27: new 129	java/text/SimpleDateFormat
    //   30: dup
    //   31: ldc -125
    //   33: invokestatic 137	java/util/Locale:getDefault	()Ljava/util/Locale;
    //   36: invokespecial 140	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;Ljava/util/Locale;)V
    //   39: astore_2
    //   40: new 142	java/lang/StringBuilder
    //   43: dup
    //   44: invokespecial 144	java/lang/StringBuilder:<init>	()V
    //   47: getstatic 150	com/tencent/mm/compatible/util/e:ghA	Ljava/lang/String;
    //   50: invokevirtual 154	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   53: ldc -100
    //   55: invokevirtual 154	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   58: aload_2
    //   59: aload_1
    //   60: invokevirtual 160	java/text/SimpleDateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   63: invokevirtual 154	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   66: ldc -94
    //   68: invokevirtual 154	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: invokevirtual 166	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   74: astore_1
    //   75: new 142	java/lang/StringBuilder
    //   78: dup
    //   79: invokespecial 144	java/lang/StringBuilder:<init>	()V
    //   82: astore 4
    //   84: new 168	java/io/File
    //   87: dup
    //   88: aload_1
    //   89: invokespecial 171	java/io/File:<init>	(Ljava/lang/String;)V
    //   92: invokevirtual 175	java/io/File:exists	()Z
    //   95: ifne +43 -> 138
    //   98: new 142	java/lang/StringBuilder
    //   101: dup
    //   102: new 142	java/lang/StringBuilder
    //   105: dup
    //   106: ldc -79
    //   108: invokespecial 178	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   111: iload_0
    //   112: invokevirtual 180	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   115: ldc -74
    //   117: invokevirtual 154	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   120: invokevirtual 166	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   123: invokespecial 178	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   126: astore_1
    //   127: ldc2_w 112
    //   130: sipush 3162
    //   133: invokestatic 106	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   136: aload_1
    //   137: areturn
    //   138: new 184	java/io/BufferedReader
    //   141: dup
    //   142: new 186	java/io/InputStreamReader
    //   145: dup
    //   146: new 188	java/io/FileInputStream
    //   149: dup
    //   150: aload_1
    //   151: invokespecial 189	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   154: invokespecial 192	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   157: invokespecial 195	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   160: astore_2
    //   161: aload_2
    //   162: astore_1
    //   163: aload_2
    //   164: invokevirtual 198	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   167: invokestatic 202	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   170: ifeq +55 -> 225
    //   173: aload_2
    //   174: astore_1
    //   175: aload_2
    //   176: invokevirtual 205	java/io/BufferedReader:close	()V
    //   179: aload_2
    //   180: astore_1
    //   181: new 142	java/lang/StringBuilder
    //   184: dup
    //   185: new 142	java/lang/StringBuilder
    //   188: dup
    //   189: ldc -49
    //   191: invokespecial 178	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   194: iload_0
    //   195: invokevirtual 180	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   198: ldc -47
    //   200: invokevirtual 154	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   203: invokevirtual 166	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   206: invokespecial 178	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   209: astore_3
    //   210: aload_2
    //   211: invokevirtual 205	java/io/BufferedReader:close	()V
    //   214: ldc2_w 112
    //   217: sipush 3162
    //   220: invokestatic 106	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   223: aload_3
    //   224: areturn
    //   225: aload_2
    //   226: astore_1
    //   227: aload_2
    //   228: invokevirtual 198	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   231: astore_3
    //   232: aload_3
    //   233: ifnull +85 -> 318
    //   236: aload_2
    //   237: astore_1
    //   238: aload 4
    //   240: new 211	java/lang/String
    //   243: dup
    //   244: aload_3
    //   245: ldc -43
    //   247: invokevirtual 217	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   250: iconst_1
    //   251: aaload
    //   252: iconst_0
    //   253: invokestatic 223	android/util/Base64:decode	(Ljava/lang/String;I)[B
    //   256: invokespecial 226	java/lang/String:<init>	([B)V
    //   259: ldc -28
    //   261: invokevirtual 217	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   264: iconst_1
    //   265: aaload
    //   266: invokevirtual 154	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   269: pop
    //   270: aload_2
    //   271: astore_1
    //   272: aload 4
    //   274: ldc -26
    //   276: invokevirtual 154	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   279: pop
    //   280: goto -55 -> 225
    //   283: astore_3
    //   284: aload_2
    //   285: astore_1
    //   286: ldc -24
    //   288: aload_3
    //   289: ldc -22
    //   291: iconst_0
    //   292: anewarray 4	java/lang/Object
    //   295: invokestatic 240	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   298: aload_2
    //   299: ifnull +7 -> 306
    //   302: aload_2
    //   303: invokevirtual 205	java/io/BufferedReader:close	()V
    //   306: ldc2_w 112
    //   309: sipush 3162
    //   312: invokestatic 106	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   315: aload 4
    //   317: areturn
    //   318: aload_2
    //   319: invokevirtual 205	java/io/BufferedReader:close	()V
    //   322: goto -16 -> 306
    //   325: astore_1
    //   326: goto -20 -> 306
    //   329: astore_2
    //   330: aconst_null
    //   331: astore_1
    //   332: aload_1
    //   333: ifnull +7 -> 340
    //   336: aload_1
    //   337: invokevirtual 205	java/io/BufferedReader:close	()V
    //   340: aload_2
    //   341: athrow
    //   342: astore_1
    //   343: goto -129 -> 214
    //   346: astore_1
    //   347: goto -41 -> 306
    //   350: astore_1
    //   351: goto -11 -> 340
    //   354: astore_2
    //   355: goto -23 -> 332
    //   358: astore_3
    //   359: aconst_null
    //   360: astore_2
    //   361: goto -77 -> 284
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	364	0	paramInt	int
    //   26	260	1	localObject1	Object
    //   325	1	1	localException1	Exception
    //   331	6	1	localObject2	Object
    //   342	1	1	localException2	Exception
    //   346	1	1	localException3	Exception
    //   350	1	1	localException4	Exception
    //   39	280	2	localObject3	Object
    //   329	12	2	localObject4	Object
    //   354	1	2	localObject5	Object
    //   360	1	2	localObject6	Object
    //   209	36	3	localObject7	Object
    //   283	6	3	localException5	Exception
    //   358	1	3	localException6	Exception
    //   82	234	4	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   163	173	283	java/lang/Exception
    //   175	179	283	java/lang/Exception
    //   181	210	283	java/lang/Exception
    //   227	232	283	java/lang/Exception
    //   238	270	283	java/lang/Exception
    //   272	280	283	java/lang/Exception
    //   318	322	325	java/lang/Exception
    //   138	161	329	finally
    //   210	214	342	java/lang/Exception
    //   302	306	346	java/lang/Exception
    //   336	340	350	java/lang/Exception
    //   163	173	354	finally
    //   175	179	354	finally
    //   181	210	354	finally
    //   227	232	354	finally
    //   238	270	354	finally
    //   272	280	354	finally
    //   286	298	354	finally
    //   138	161	358	java/lang/Exception
  }
  
  private static void eB(int paramInt)
  {
    GMTrace.i(424530673664L, 3163);
    SharedPreferences localSharedPreferences = al.ba(ab.getContext(), "sp_sns_dynswitch_stg");
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException("Bad op parameter: " + paramInt);
    case -1: 
      localSharedPreferences.edit().remove("st_sw_use_vcodec_img").commit();
      GMTrace.o(424530673664L, 3163);
      return;
    case 0: 
      localSharedPreferences.edit().putBoolean("st_sw_use_vcodec_img", false).commit();
      GMTrace.o(424530673664L, 3163);
      return;
    }
    localSharedPreferences.edit().putBoolean("st_sw_use_vcodec_img", true).commit();
    GMTrace.o(424530673664L, 3163);
  }
  
  private static void eC(int paramInt)
  {
    GMTrace.i(424664891392L, 3164);
    SharedPreferences localSharedPreferences = al.ba(ab.getContext(), "sp_sns_dynswitch_stg");
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException("Bad op parameter: " + paramInt);
    case -1: 
      localSharedPreferences.edit().remove("st_sw_use_wxpc_img").commit();
      GMTrace.o(424664891392L, 3164);
      return;
    case 0: 
      localSharedPreferences.edit().putBoolean("st_sw_use_wxpc_img", false).commit();
      GMTrace.o(424664891392L, 3164);
      return;
    }
    localSharedPreferences.edit().putBoolean("st_sw_use_wxpc_img", true).commit();
    GMTrace.o(424664891392L, 3164);
  }
  
  private static int ee(String paramString)
  {
    GMTrace.i(423993802752L, 3159);
    if ((!paramString.startsWith("//")) || (paramString.length() <= 2))
    {
      GMTrace.o(423993802752L, 3159);
      return 0;
    }
    int j = paramString.indexOf(" ");
    int i = j;
    if (j == -1) {
      i = paramString.length();
    }
    try
    {
      i = bg.getInt(paramString.substring(2, i), 0);
      j = com.tencent.mm.protocal.d.tJC % 256;
      if ((j == 0) || (i < j) || (i % j != 0))
      {
        GMTrace.o(423993802752L, 3159);
        return 0;
      }
    }
    catch (Exception paramString)
    {
      GMTrace.o(423993802752L, 3159);
      return 0;
    }
    i /= j;
    GMTrace.o(423993802752L, 3159);
    return i;
  }
  
  private static String ef(String paramString)
  {
    GMTrace.i(424128020480L, 3160);
    int i = paramString.indexOf(" ");
    if (i < 0)
    {
      GMTrace.o(424128020480L, 3160);
      return "";
    }
    paramString = paramString.substring(i).trim();
    GMTrace.o(424128020480L, 3160);
    return paramString;
  }
  
  public static boolean v(final Context paramContext, final String paramString)
  {
    GMTrace.i(424262238208L, 3161);
    if (!paramString.startsWith("//"))
    {
      GMTrace.o(424262238208L, 3161);
      return false;
    }
    if (com.tencent.mm.pluginsdk.b.b.aN(paramContext, paramString))
    {
      GMTrace.o(424262238208L, 3161);
      return true;
    }
    if (paramString.startsWith("//clearWXSNSDB"))
    {
      paramContext = new pf();
      com.tencent.mm.sdk.b.a.vgX.m(paramContext);
      GMTrace.o(424262238208L, 3161);
      return true;
    }
    if (paramString.startsWith("//verifytokenerror"))
    {
      com.tencent.mm.platformtools.r.hld = true;
      GMTrace.o(424262238208L, 3161);
      return true;
    }
    if (paramString.startsWith("//resetbackupdata"))
    {
      at.AR().zx().bSj();
      at.AR();
      com.tencent.mm.y.c.xh().a(w.a.vvQ, Boolean.valueOf(false));
      at.AR();
      com.tencent.mm.y.c.xh().a(w.a.vvR, Boolean.valueOf(false));
      at.AR();
      com.tencent.mm.y.c.xh().a(w.a.vvS, Boolean.valueOf(false));
      at.AR();
      com.tencent.mm.y.c.xh().a(w.a.vvT, Boolean.valueOf(false));
      at.AR();
      com.tencent.mm.y.c.xh().a(w.a.vvU, Boolean.valueOf(false));
      at.AR();
      com.tencent.mm.y.c.xh().a(w.a.vvV, Boolean.valueOf(false));
      GMTrace.o(424262238208L, 3161);
      return true;
    }
    if (paramString.equalsIgnoreCase("//ftsmsbiz"))
    {
      localObject1 = com.tencent.mm.az.g.KB();
      paramString = new StringBuilder();
      localObject1 = ((apr)localObject1).jhd.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject4 = (apq)((Iterator)localObject1).next();
        paramString.append(String.format("%s | %.2f | %s", new Object[] { com.tencent.mm.y.r.fs(((apq)localObject4).tRz), Double.valueOf(((apq)localObject4).uFo), com.tencent.mm.pluginsdk.i.n.ac("yyyy-MM-dd HH:mm", ((apq)localObject4).uFp / 1000L) }));
        paramString.append("\n");
      }
      localObject1 = new TextView(paramContext);
      ((TextView)localObject1).setText(paramString.toString());
      ((TextView)localObject1).setGravity(19);
      ((TextView)localObject1).setTextSize(1, 10.0F);
      ((TextView)localObject1).setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
      ((TextView)localObject1).setTextColor(-16711936);
      ((TextView)localObject1).setTypeface(Typeface.MONOSPACE);
      i = paramContext.getResources().getDimensionPixelSize(R.f.aQq);
      ((TextView)localObject1).setPadding(i, i, i, i);
      com.tencent.mm.ui.base.h.a(paramContext, null, (View)localObject1, null);
      GMTrace.o(424262238208L, 3161);
      return true;
    }
    if (com.tencent.mm.sdk.a.b.bPq())
    {
      if (paramString.startsWith("//launchapp clear"))
      {
        com.tencent.mm.kernel.h.xy().xh().a(w.a.vwy, "");
        GMTrace.o(424262238208L, 3161);
        return true;
      }
      if (paramString.startsWith("//setsupportwxcode"))
      {
        com.tencent.mm.kernel.h.xy().xh().a(w.a.vxL, Boolean.valueOf(true));
        GMTrace.o(424262238208L, 3161);
        return true;
      }
      if (paramString.startsWith("//setnotsupportwxcode"))
      {
        com.tencent.mm.kernel.h.xy().xh().a(w.a.vxL, Boolean.valueOf(false));
        GMTrace.o(424262238208L, 3161);
        return true;
      }
      if (paramString.startsWith("//resetsupportwxcode"))
      {
        com.tencent.mm.kernel.h.xy().xh().a(w.a.vxL, null);
        GMTrace.o(424262238208L, 3161);
        return true;
      }
    }
    if (paramString.startsWith("//testsightwidget"))
    {
      paramString = new Intent();
      paramString.putExtra("KSightPath", "/mnt/sdcard/tencent/tempvideo4.mp4");
      paramString.putExtra("KSightThumbPath", "");
      paramString.putExtra("sight_md5", com.tencent.mm.a.g.bg("/mnt/sdcard/tencent/tempvideo4.mp4"));
      paramString.putExtra("KSnsPostManu", true);
      paramString.putExtra("KTouchCameraTime", bg.Pu());
      paramString.putExtra("Ksnsupload_type", 14);
      com.tencent.mm.bj.d.b(paramContext, "sns", ".ui.En_c4f742e5", paramString);
      GMTrace.o(424262238208L, 3161);
      return true;
    }
    if (paramString.startsWith("//openremitbank"))
    {
      com.tencent.mm.kernel.h.xy().xh().a(w.a.vzV, Integer.valueOf(1));
      GMTrace.o(424262238208L, 3161);
      return true;
    }
    if (paramString.startsWith("//closeremitbank"))
    {
      com.tencent.mm.kernel.h.xy().xh().a(w.a.vzV, Integer.valueOf(0));
      GMTrace.o(424262238208L, 3161);
      return true;
    }
    if (paramString.startsWith("//ftstemplatetest"))
    {
      localObject1 = new bd();
      ((bd)localObject1).eCr.eCs = 27;
      ((bd)localObject1).eCr.eCs = 1;
      ((bd)localObject1).eCr.filePath = "/sdcard/fts_template.zip";
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
    }
    if (paramString.startsWith("//sightforward"))
    {
      paramString = new Intent();
      paramString.setClassName(paramContext, "com.tencent.mm.ui.transmit.SightForwardUI");
      paramContext.startActivity(paramString);
      GMTrace.o(424262238208L, 3161);
      return true;
    }
    if (paramString.startsWith("//remit"))
    {
      com.tencent.mm.bj.d.b(paramContext, "remittance", ".ui.RemittanceBusiUI", new Intent());
      GMTrace.o(424262238208L, 3161);
      return true;
    }
    if (paramString.startsWith("//uplog"))
    {
      localObject1 = "weixin";
      if (at.AU()) {
        localObject1 = com.tencent.mm.y.q.zE();
      }
      localObject4 = paramString.split(" ");
      j = 0;
      i = 0;
      paramString = (String)localObject1;
      if (localObject4 != null)
      {
        if (localObject4.length > 1) {
          i = bg.getInt(localObject4[1], 0);
        }
        paramString = (String)localObject1;
        j = i;
        if (localObject4.length > 2)
        {
          paramString = localObject4[2];
          j = i;
        }
      }
      at.wS().d(new bf(new bf.a()
      {
        public final void a(com.tencent.mm.network.e paramAnonymouse)
        {
          GMTrace.i(415806521344L, 3098);
          at.wS().a(1, "", 0, false);
          com.tencent.mm.sdk.platformtools.w.bPM();
          at.wS().a(2, this.fSP, j, at.AU());
          GMTrace.o(415806521344L, 3098);
        }
      }));
      paramContext.getString(R.l.cUG);
      at.a(new ah()
      {
        public final void eD(int paramAnonymousInt)
        {
          GMTrace.i(425604415488L, 3171);
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "ipxx progress:%d", new Object[] { Integer.valueOf(paramAnonymousInt) });
          if (paramAnonymousInt < 0)
          {
            at.a(null);
            this.fTe.dismiss();
            com.tencent.mm.ui.base.h.h(paramContext, R.l.efu, R.l.cUG);
            GMTrace.o(425604415488L, 3171);
            return;
          }
          if (paramAnonymousInt >= 100)
          {
            at.a(null);
            this.fTe.dismiss();
            com.tencent.mm.ui.base.h.h(paramContext, R.l.efy, R.l.cUG);
            GMTrace.o(425604415488L, 3171);
            return;
          }
          this.fTe.setMessage(paramContext.getString(R.l.efv) + paramAnonymousInt + "%");
          GMTrace.o(425604415488L, 3171);
        }
      });
      GMTrace.o(424262238208L, 3161);
      return true;
    }
    if (paramString.startsWith("//upcrash"))
    {
      paramContext = "weixin";
      if (at.AU()) {
        paramContext = com.tencent.mm.y.q.zE();
      }
      localObject1 = paramString.split(" ");
      j = 0;
      i = 0;
      paramString = paramContext;
      if (localObject1 != null)
      {
        if (localObject1.length > 1) {
          i = bg.getInt(localObject1[1], 0);
        }
        paramString = paramContext;
        j = i;
        if (localObject1.length > 2)
        {
          paramString = localObject1[2];
          j = i;
        }
      }
      at.wS().d(new bf(new bf.a()
      {
        public final void a(com.tencent.mm.network.e paramAnonymouse)
        {
          GMTrace.i(422517407744L, 3148);
          at.wS().a(3, this.fSP, j, at.AU());
          GMTrace.o(422517407744L, 3148);
        }
      }));
      GMTrace.o(424262238208L, 3161);
      return true;
    }
    if (paramString.startsWith("//switchnotificationstatus"))
    {
      if (!com.tencent.mm.k.f.tJ()) {}
      for (bool1 = true;; bool1 = false)
      {
        com.tencent.mm.k.f.aT(bool1);
        GMTrace.o(424262238208L, 3161);
        return true;
      }
    }
    if (paramString.startsWith("//fixError0831"))
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "fixError0831");
      com.tencent.mm.sdk.b.a.vgX.m(new bj());
      GMTrace.o(424262238208L, 3161);
      return true;
    }
    if (paramString.startsWith("//resetbankremit"))
    {
      com.tencent.mm.kernel.h.xy().xh().a(w.a.vzW, Integer.valueOf(0));
      GMTrace.o(424262238208L, 3161);
      return true;
    }
    if (paramString.startsWith("//busiluck "))
    {
      paramString = paramString.replace("//busiluck ", "");
      paramString = "weixin://openNativeUrl/weixinHB/startreceivebizhbrequest?sendid=" + paramString;
      localObject1 = new Intent();
      ((Intent)localObject1).putExtra("key_way", 5);
      ((Intent)localObject1).putExtra("key_native_url", paramString);
      com.tencent.mm.bj.d.b(paramContext, "luckymoney", ".ui.LuckyMoneyBusiReceiveUI", (Intent)localObject1);
      GMTrace.o(424262238208L, 3161);
      return true;
    }
    if (paramString.startsWith("//testsoter"))
    {
      paramString = new Intent();
      paramString.setClassName(ab.getPackageName(), "com.tencent.mm.plugin.soter.ui.SoterTestUI");
      paramContext.startActivity(paramString);
      GMTrace.o(424262238208L, 3161);
      return true;
    }
    if (paramString.startsWith("//facevideo"))
    {
      paramContext = paramString.split(" ");
      if (paramContext.length == 3)
      {
        com.tencent.mm.y.as.gnb.M("imgType", paramContext[1]);
        com.tencent.mm.y.as.gnb.M("depth", paramContext[2]);
      }
      GMTrace.o(424262238208L, 3161);
      return true;
    }
    if (paramString.startsWith("//alpha"))
    {
      paramContext = paramString.split(" ");
      if (paramContext.length == 2) {
        com.tencent.mm.y.as.gnb.M("alpha_duration", paramContext[1]);
      }
      GMTrace.o(424262238208L, 3161);
      return true;
    }
    if (paramString.startsWith("//rectwidth"))
    {
      paramContext = paramString.split(" ");
      if (paramContext.length == 2) {
        com.tencent.mm.y.as.gnb.M("rect_width", paramContext[1]);
      }
      GMTrace.o(424262238208L, 3161);
      return true;
    }
    if (paramString.startsWith("//newyearsw "))
    {
      at.AR();
      i = ((Integer)com.tencent.mm.y.c.xh().get(w.a.vqw, Integer.valueOf(0))).intValue();
      at.AR();
      com.tencent.mm.y.c.xh().a(w.a.vqw, Integer.valueOf(i ^ 0x1));
      GMTrace.o(424262238208L, 3161);
      return true;
    }
    if (paramString.startsWith("//commitxlog"))
    {
      at.wS().a(1, "", 0, false);
      com.tencent.mm.sdk.platformtools.w.bPM();
      GMTrace.o(424262238208L, 3161);
      return true;
    }
    if (paramString.startsWith("//open celltextview"))
    {
      com.tencent.mm.kernel.h.xy().xh().a(w.a.yvE, Boolean.valueOf(true));
      com.tencent.mm.ui.widget.MMCellTextView.yvN = true;
      GMTrace.o(424262238208L, 3161);
      return true;
    }
    if (paramString.startsWith("//close celltextview"))
    {
      com.tencent.mm.kernel.h.xy().xh().a(w.a.yvE, Boolean.valueOf(false));
      com.tencent.mm.ui.widget.MMCellTextView.yvN = false;
      GMTrace.o(424262238208L, 3161);
      return true;
    }
    if (paramString.startsWith("//netstatus"))
    {
      paramString = am.et(ab.getContext());
      com.tencent.mm.ui.base.h.a(paramContext, paramString, "netstatus", paramContext.getString(R.l.eiB), paramContext.getString(R.l.dis), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(414195908608L, 3086);
          ((ClipboardManager)this.fSR.getSystemService("clipboard")).setText(paramString);
          GMTrace.o(414195908608L, 3086);
        }
      }, null);
      GMTrace.o(424262238208L, 3161);
      return true;
    }
    if (paramString.startsWith("//scaninterval "))
    {
      localObject1 = paramString.split(" ");
      l1 = -1L;
    }
    try
    {
      l2 = bg.getLong(localObject1[1], -1L);
      l1 = l2;
    }
    catch (Exception localException3)
    {
      for (;;)
      {
        long l2;
        continue;
        paramString = null;
        continue;
        paramString = null;
        continue;
        Object localObject3 = null;
        paramString = null;
        continue;
        localObject4 = null;
        localObject3 = null;
        paramString = null;
      }
    }
    if (l1 > 0L)
    {
      at.AR();
      com.tencent.mm.y.c.xh().a(w.a.vvJ, Long.valueOf(l1));
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "summerclean reset scaninterval[%d]", new Object[] { Long.valueOf(l1) });
      GMTrace.o(424262238208L, 3161);
      return true;
    }
    if (paramString.startsWith("//scanwait "))
    {
      localObject1 = paramString.split(" ");
      l1 = -1L;
    }
    try
    {
      l2 = bg.getLong(localObject1[1], -1L);
      l1 = l2;
    }
    catch (Exception localException2)
    {
      boolean bool3;
      boolean bool2;
      boolean bool4;
      for (;;) {}
    }
    if (l1 > 0L)
    {
      at.AR();
      com.tencent.mm.y.c.xh().a(w.a.vvK, Long.valueOf(l1));
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "summerclean reset scanwait[%d]", new Object[] { Long.valueOf(l1) });
      GMTrace.o(424262238208L, 3161);
      return true;
    }
    if (paramString.equalsIgnoreCase("//delayquery"))
    {
      if (!com.tencent.mm.platformtools.r.hlg) {}
      for (bool1 = true;; bool1 = false)
      {
        com.tencent.mm.platformtools.r.hlg = bool1;
        GMTrace.o(424262238208L, 3161);
        return true;
      }
    }
    if (paramString.startsWith("//newinit -hard"))
    {
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xy().xh().set(15, Integer.valueOf(0));
      GMTrace.o(424262238208L, 3161);
      return true;
    }
    if (paramString.equalsIgnoreCase("//swipe"))
    {
      paramContext = ab.bPV();
      bool1 = paramContext.getBoolean("settings_support_swipe", true);
      paramContext = paramContext.edit();
      if (!bool1) {}
      for (bool1 = true;; bool1 = false)
      {
        paramContext.putBoolean("settings_support_swipe", bool1).commit();
        GMTrace.o(424262238208L, 3161);
        return true;
      }
    }
    if (paramString.equalsIgnoreCase("//multiwebview"))
    {
      paramContext = LauncherUI.bXe().getSharedPreferences(ab.bPU(), 0);
      bool1 = paramContext.getBoolean("settings_multi_webview", false);
      if (bool1)
      {
        paramContext = paramContext.edit();
        if (bool1) {
          break label2286;
        }
      }
      label2286:
      for (bool1 = true;; bool1 = false)
      {
        paramContext.putBoolean("settings_multi_webview", bool1).commit();
        GMTrace.o(424262238208L, 3161);
        return true;
      }
    }
    if (paramString.equalsIgnoreCase("//sightinfo"))
    {
      at.AR();
      bool1 = ((Boolean)com.tencent.mm.y.c.xh().get(344065, Boolean.valueOf(false))).booleanValue();
      at.AR();
      paramContext = com.tencent.mm.y.c.xh();
      if (!bool1) {}
      for (bool1 = true;; bool1 = false)
      {
        paramContext.set(344065, Boolean.valueOf(bool1));
        at.AR();
        com.tencent.mm.y.c.xh().kL(true);
        GMTrace.o(424262238208L, 3161);
        return true;
      }
    }
    if (paramString.startsWith("//sighttest"))
    {
      i = bg.Sy(paramString.replace("//sighttest ", ""));
      at.AR();
      com.tencent.mm.y.c.xh().set(344066, Integer.valueOf(i));
      at.AR();
      com.tencent.mm.y.c.xh().kL(true);
      GMTrace.o(424262238208L, 3161);
      return true;
    }
    if (paramString.startsWith("//wxcamera"))
    {
      i = bg.Sy(paramString.replace("//wxcamera ", ""));
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "set param %d", new Object[] { Integer.valueOf(i) });
      at.AR();
      com.tencent.mm.y.c.xh().a(w.a.vvy, Integer.valueOf(i));
      GMTrace.o(424262238208L, 3161);
      return true;
    }
    if (paramString.startsWith("//printcrash"))
    {
      paramString = paramString.replace("//printcrash ", "");
      localObject1 = new TextView(paramContext);
      ((TextView)localObject1).setText(eA(bg.getInt(paramString, 0)));
      ((TextView)localObject1).setGravity(19);
      ((TextView)localObject1).setTextSize(1, 8.0F);
      ((TextView)localObject1).setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
      ((TextView)localObject1).setTextColor(-16711936);
      ((TextView)localObject1).setTypeface(Typeface.MONOSPACE);
      i = paramContext.getResources().getDimensionPixelSize(R.f.aQQ);
      ((TextView)localObject1).setPadding(i, i, i, i);
      ((TextView)localObject1).setMovementMethod(ScrollingMovementMethod.getInstance());
      com.tencent.mm.ui.base.h.a(paramContext, null, (View)localObject1, null);
      GMTrace.o(424262238208L, 3161);
      return true;
    }
    if (paramString.startsWith("//printleak"))
    {
      paramString = new TextView(paramContext);
      paramString.setText(com.tencent.mm.compatible.b.e.sv());
      paramString.setGravity(19);
      paramString.setTextSize(1, 8.0F);
      paramString.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
      paramString.setTextColor(-16711936);
      paramString.setTypeface(Typeface.MONOSPACE);
      i = paramContext.getResources().getDimensionPixelSize(R.f.aQQ);
      paramString.setPadding(i, i, i, i);
      paramString.setMovementMethod(ScrollingMovementMethod.getInstance());
      com.tencent.mm.ui.base.h.a(paramContext, null, paramString, null);
      GMTrace.o(424262238208L, 3161);
      return true;
    }
    if (paramString.startsWith("//resetmapcnt"))
    {
      at.AR();
      com.tencent.mm.y.c.xh().a(w.a.vxM, Integer.valueOf(0));
      GMTrace.o(424262238208L, 3161);
      return true;
    }
    if (paramString.equals("//testrsa"))
    {
      ac.G("010001", "E338E5DAD46B331E3071FAFD4C0F84C7C7965DBBE64C6F8CC0F7CF04DC640C1F84A2014431A48D65F2B2F172BA9BE6F5A049BF52C78C14B0965E20F0D80D85A9180EBABB913D49821D28BFD9601DF52A4F3230AECAD96D23415F5E94D51A87CAA7630C5F3CB70345BAF572A4F61A134A2265AFD8FADDFE0222BD9ABF7DBEB7444D031454E8F21820BBC725E6857F765660E987FADEBCF6B3A15355C4CD3752A7B544D1D7E037AF4F9725BE37681A84C9E1DC431B3065294EAD53E913BAF16D46714B013EA077191E6CA08ABA6D70E9CA792D898D692E3168D6341369976657CD5E1504B9E2458F107225176734D11621AD36D7FFA26C573D6612455B09105C41", 106);
      GMTrace.o(424262238208L, 3161);
      return true;
    }
    if (paramString.equals("//testrsabad"))
    {
      ac.G("010001", "F338E5DAD46B331E3071FAFD4C0F84C7C7965DBBE64C6F8CC0F7CF04DC640C1F84A2014431A48D65F2B2F172BA9BE6F5A049BF52C78C14B0965E20F0D80D85A9180EBABB913D49821D28BFD9601DF52A4F3230AECAD96D23415F5E94D51A87CAA7630C5F3CB70345BAF572A4F61A134A2265AFD8FADDFE0222BD9ABF7DBEB7444D031454E8F21820BBC725E6857F765660E987FADEBCF6B3A15355C4CD3752A7B544D1D7E037AF4F9725BE37681A84C9E1DC431B3065294EAD53E913BAF16D46714B013EA077191E6CA08ABA6D70E9CA792D898D692E3168D6341369976657CD5E1504B9E2458F107225176734D11621AD36D7FFA26C573D6612455B09105C41", 106);
      GMTrace.o(424262238208L, 3161);
      return true;
    }
    if (paramString.equals("//walletofflinetest"))
    {
      at.AR();
      com.tencent.mm.y.c.xh().a(w.a.vvd, Boolean.valueOf(false));
      GMTrace.o(424262238208L, 3161);
      return false;
    }
    if (paramString.startsWith("//makemsgdata "))
    {
      i = bg.getInt(paramString.split(" ")[1], 0);
      at.AR();
      com.tencent.mm.y.c.yM().A(En_5b8fbb1e.a.wCB, i);
      GMTrace.o(424262238208L, 3161);
      return true;
    }
    if (paramString.startsWith("//pullappservice"))
    {
      ao.bJL().dP(ab.getContext());
      GMTrace.o(424262238208L, 3161);
      return true;
    }
    if (paramString.startsWith("//boundaryconfig"))
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "boundaryconfig SessionTextMsg:%d", new Object[] { Integer.valueOf(bg.getInt(com.tencent.mm.k.g.ut().getValue("InputLimitSessionTextMsg"), 0)) });
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "boundaryconfig SNSObjectText:%d", new Object[] { Integer.valueOf(bg.getInt(com.tencent.mm.k.g.ut().getValue("InputLimitSNSObjectText"), 0)) });
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "boundaryconfig SnsCommentMaxSize:%d", new Object[] { Integer.valueOf(bg.getInt(com.tencent.mm.k.g.ut().getValue("SnsCommentMaxSize"), 0)) });
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "boundaryconfig FavText:%d", new Object[] { Integer.valueOf(bg.getInt(com.tencent.mm.k.g.ut().getValue("InputLimitFavText"), 0)) });
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "boundaryconfig EmotionBufSize:%d", new Object[] { Integer.valueOf(bg.getInt(com.tencent.mm.k.g.ut().getValue("InputLimitSendEmotionBufSize"), 0)) });
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "boundaryconfig EmotionWidth:%d", new Object[] { Integer.valueOf(bg.getInt(com.tencent.mm.k.g.ut().getValue("InputLimitSendEmotionWidth"), 0)) });
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "boundaryconfig FavImageSize:%d", new Object[] { Integer.valueOf(bg.getInt(com.tencent.mm.k.g.ut().getValue("InputLimitFavImageSize"), 0)) });
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "boundaryconfig FavVoiceLength:%d", new Object[] { Integer.valueOf(bg.getInt(com.tencent.mm.k.g.ut().getValue("InputLimitFavVoiceLength"), 0)) });
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "boundaryconfig ShortVideoAutoDownloadBufSize:%d", new Object[] { Integer.valueOf(bg.getInt(com.tencent.mm.k.g.ut().getValue("InputLimitSessionShortVideoBufSize"), 0)) });
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "boundaryconfig VideoSize:%d", new Object[] { Integer.valueOf(bg.getInt(com.tencent.mm.k.g.ut().getValue("InputLimitVideoSize"), 0)) });
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "boundaryconfig FileSize:%d", new Object[] { Integer.valueOf(bg.getInt(com.tencent.mm.k.g.ut().getValue("InputLimitFileSize"), 0)) });
      GMTrace.o(424262238208L, 3161);
      return true;
    }
    if (paramString.startsWith("//whatsnew"))
    {
      MMAppMgr.V((Activity)paramContext);
      GMTrace.o(424262238208L, 3161);
      return true;
    }
    if (paramString.startsWith("//profile "))
    {
      at.AR();
      paramString = com.tencent.mm.y.c.yK().TE(paramString.replace("//profile ", "").trim());
      if ((paramString != null) && (paramString.vi() != 0))
      {
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("Contact_User", paramString.getUsername());
        com.tencent.mm.bj.d.b(paramContext, "profile", ".ui.ContactInfoUI", (Intent)localObject1);
      }
      GMTrace.o(424262238208L, 3161);
      return true;
    }
    if (paramString.startsWith("//cs"))
    {
      paramContext = new Intent();
      paramContext.putExtra("voipCSBizId", "gh_b35727b00b78");
      paramContext.putExtra("voipCSAppId", "wx6e7147e8d764e85d");
      com.tencent.mm.bj.d.b(ab.getContext(), "voip_cs", ".ui.VoipCSMainUI", paramContext);
      GMTrace.o(424262238208L, 3161);
      return true;
    }
    if (paramString.startsWith("//acs"))
    {
      paramContext = new Intent();
      paramContext.putExtra("voipCSBizId", "gh_e8b085bb67e0");
      paramContext.putExtra("voipCSAppId", "wx1224160e0adcefd6");
      com.tencent.mm.bj.d.b(ab.getContext(), "voip_cs", ".ui.VoipCSMainUI", paramContext);
      GMTrace.o(424262238208L, 3161);
      return true;
    }
    if (paramString.startsWith("//wifiset"))
    {
      paramContext = new Intent();
      paramContext.putExtra("free_wifi_ssid", "Xiaomi_WENDY");
      paramContext.putExtra("free_wifi_passowrd", "WX12345789");
      com.tencent.mm.bj.d.b(ab.getContext(), "freewifi", ".ui.FreeWifiCopyPwdUI", paramContext);
      GMTrace.o(424262238208L, 3161);
      return true;
    }
    if (paramString.startsWith("//bcs"))
    {
      paramContext = new Intent();
      paramContext.putExtra("voipCSBizId", "gh_e8b085bb67e0");
      paramContext.putExtra("voipCSAppId", "wx1224160e0adcefd6");
      paramContext.putExtra("voipCSAllowBackCamera", "1");
      paramContext.putExtra("voipCSShowOther", "1");
      paramContext.putExtra("voipCSAvatarUrl", "https://ss2.baidu.com/6ONYsjip0QIZ8tyhnq/it/u=28737416,3249768666&fm=58");
      paramContext.putExtra("voipCSContext", "test");
      com.tencent.mm.bj.d.b(ab.getContext(), "voip_cs", ".ui.VoipCSMainUI", paramContext);
      GMTrace.o(424262238208L, 3161);
      return true;
    }
    if (paramString.startsWith("//getfpkey"))
    {
      paramString = com.tencent.mm.storage.ba.bUs();
      com.tencent.mm.ui.base.h.a(paramContext, paramString, "Fingerprint Key", paramContext.getString(R.l.eiB), paramContext.getString(R.l.dis), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(422248972288L, 3146);
          ((ClipboardManager)this.fSR.getSystemService("clipboard")).setText(paramString);
          Toast.makeText(this.fSR, R.l.eiC, 0).show();
          GMTrace.o(422248972288L, 3146);
        }
      }, null);
      GMTrace.o(424262238208L, 3161);
      return true;
    }
    if (paramString.startsWith("//commitwd"))
    {
      WatchDogPushReceiver.Mv();
      GMTrace.o(424262238208L, 3161);
      return true;
    }
    if (paramString.startsWith("//setsnstestenv"))
    {
      paramString = paramString.split(" +");
      if (paramString.length <= 1) {
        break label15521;
      }
      localObject4 = paramString[1];
      if ((!com.tencent.mm.sdk.platformtools.p.isIPv4Address((String)localObject4)) && (!com.tencent.mm.sdk.platformtools.p.isIPv6Address((String)localObject4))) {
        break label15521;
      }
      if (paramString.length <= 2) {
        break label15513;
      }
      localObject1 = paramString[2];
      if ((!com.tencent.mm.sdk.platformtools.p.isIPv4Address((String)localObject1)) && (!com.tencent.mm.sdk.platformtools.p.isIPv6Address((String)localObject1))) {
        break label15513;
      }
      if (paramString.length > 3)
      {
        paramString = paramString[3];
        if (localObject4 != null) {}
        for (bool1 = true;; bool1 = false)
        {
          com.tencent.mm.platformtools.r.hkC = bool1;
          com.tencent.mm.platformtools.r.hkt = (String)localObject4;
          com.tencent.mm.platformtools.r.hkX = (String)localObject1;
          com.tencent.mm.platformtools.r.hkY = paramString;
          com.tencent.mm.modelcdntran.g.Gh().Gm();
          Toast.makeText(paramContext, String.format("%s %s %s", new Object[] { com.tencent.mm.platformtools.r.hkt, com.tencent.mm.platformtools.r.hkX, com.tencent.mm.platformtools.r.hkY }), 1).show();
          GMTrace.o(424262238208L, 3161);
          return true;
        }
      }
    }
    else
    {
      if (paramString.startsWith("//snsvcodec"))
      {
        paramContext = paramString.split(" +");
        if (paramContext.length > 1)
        {
          paramContext = paramContext[1];
          if ("on".equalsIgnoreCase(paramContext))
          {
            eB(1);
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "snsvcodec val: 1");
          }
        }
        for (;;)
        {
          GMTrace.o(424262238208L, 3161);
          return true;
          if ("off".equalsIgnoreCase(paramContext))
          {
            eB(0);
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "snsvcodec val: 0");
            continue;
            eB(-1);
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "snsvcodec val: -1");
          }
        }
      }
      if (paramString.startsWith("//snswxpc"))
      {
        paramContext = paramString.split(" +");
        if (paramContext.length > 1)
        {
          paramContext = paramContext[1];
          if ("on".equalsIgnoreCase(paramContext))
          {
            eC(1);
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "snswxpc val: 1");
          }
        }
        for (;;)
        {
          GMTrace.o(424262238208L, 3161);
          return true;
          if ("off".equalsIgnoreCase(paramContext))
          {
            eC(0);
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "snswxpc val: 0");
            continue;
            eC(-1);
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "snswxpc val: -1");
          }
        }
      }
      if (paramString.startsWith("//mmdumpsys"))
      {
        at.xB().A(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(427886116864L, 3188);
            new com.tencent.mm.sdk.platformtools.aj(new aj.a()
            {
              /* Error */
              public final boolean pM()
              {
                // Byte code:
                //   0: ldc2_w 36
                //   3: sipush 3144
                //   6: invokestatic 27	com/tencent/gmtrace/GMTrace:i	(JI)V
                //   9: bipush 23
                //   11: invokestatic 43	com/tencent/mm/compatible/util/d:et	(I)Z
                //   14: ifeq +282 -> 296
                //   17: ldc 45
                //   19: ldc 47
                //   21: iconst_1
                //   22: anewarray 4	java/lang/Object
                //   25: dup
                //   26: iconst_0
                //   27: invokestatic 53	android/os/Debug:getRuntimeStats	()Ljava/util/Map;
                //   30: aastore
                //   31: invokestatic 58	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
                //   34: invokestatic 62	android/os/Debug:getPss	()J
                //   37: lstore_1
                //   38: new 64	android/os/Debug$MemoryInfo
                //   41: dup
                //   42: invokespecial 65	android/os/Debug$MemoryInfo:<init>	()V
                //   45: astore_3
                //   46: aload_3
                //   47: invokestatic 69	android/os/Debug:getMemoryInfo	(Landroid/os/Debug$MemoryInfo;)V
                //   50: bipush 23
                //   52: invokestatic 43	com/tencent/mm/compatible/util/d:et	(I)Z
                //   55: ifeq +273 -> 328
                //   58: ldc 45
                //   60: ldc 71
                //   62: iconst_2
                //   63: anewarray 4	java/lang/Object
                //   66: dup
                //   67: iconst_0
                //   68: lload_1
                //   69: invokestatic 77	java/lang/Long:valueOf	(J)Ljava/lang/Long;
                //   72: aastore
                //   73: dup
                //   74: iconst_1
                //   75: aload_3
                //   76: invokevirtual 80	android/os/Debug$MemoryInfo:getMemoryStats	()Ljava/util/Map;
                //   79: aastore
                //   80: invokestatic 58	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
                //   83: invokestatic 86	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
                //   86: ldc 88
                //   88: invokevirtual 92	java/lang/Runtime:exec	(Ljava/lang/String;)Ljava/lang/Process;
                //   91: astore 5
                //   93: new 94	java/io/LineNumberReader
                //   96: dup
                //   97: new 96	java/io/InputStreamReader
                //   100: dup
                //   101: aload 5
                //   103: invokevirtual 102	java/lang/Process:getInputStream	()Ljava/io/InputStream;
                //   106: invokespecial 105	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
                //   109: invokespecial 108	java/io/LineNumberReader:<init>	(Ljava/io/Reader;)V
                //   112: astore 4
                //   114: aload 4
                //   116: astore_3
                //   117: aload 4
                //   119: invokevirtual 112	java/io/LineNumberReader:readLine	()Ljava/lang/String;
                //   122: astore 6
                //   124: aload 6
                //   126: ifnull +233 -> 359
                //   129: aload 4
                //   131: astore_3
                //   132: aload 6
                //   134: invokevirtual 118	java/lang/String:length	()I
                //   137: ifle -23 -> 114
                //   140: aload 4
                //   142: astore_3
                //   143: ldc 45
                //   145: aload 6
                //   147: invokestatic 121	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
                //   150: goto -36 -> 114
                //   153: astore 5
                //   155: aload 4
                //   157: astore_3
                //   158: ldc 45
                //   160: ldc 123
                //   162: iconst_1
                //   163: anewarray 4	java/lang/Object
                //   166: dup
                //   167: iconst_0
                //   168: aload 5
                //   170: invokevirtual 126	java/lang/Exception:getMessage	()Ljava/lang/String;
                //   173: aastore
                //   174: invokestatic 129	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
                //   177: aload 4
                //   179: ifnull +8 -> 187
                //   182: aload 4
                //   184: invokevirtual 132	java/io/LineNumberReader:close	()V
                //   187: ldc 45
                //   189: ldc -122
                //   191: iconst_1
                //   192: anewarray 4	java/lang/Object
                //   195: dup
                //   196: iconst_0
                //   197: invokestatic 139	java/lang/Thread:activeCount	()I
                //   200: invokestatic 144	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
                //   203: aastore
                //   204: invokestatic 58	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
                //   207: invokestatic 147	java/lang/Thread:getAllStackTraces	()Ljava/util/Map;
                //   210: astore_3
                //   211: aload_3
                //   212: invokeinterface 153 1 0
                //   217: invokeinterface 159 1 0
                //   222: astore 4
                //   224: aload 4
                //   226: invokeinterface 164 1 0
                //   231: ifeq +234 -> 465
                //   234: aload 4
                //   236: invokeinterface 168 1 0
                //   241: checkcast 136	java/lang/Thread
                //   244: astore 5
                //   246: aload 5
                //   248: invokevirtual 172	java/lang/Thread:getState	()Ljava/lang/Thread$State;
                //   251: getstatic 178	java/lang/Thread$State:RUNNABLE	Ljava/lang/Thread$State;
                //   254: if_acmpne -30 -> 224
                //   257: ldc 45
                //   259: ldc -76
                //   261: iconst_2
                //   262: anewarray 4	java/lang/Object
                //   265: dup
                //   266: iconst_0
                //   267: aload 5
                //   269: invokevirtual 183	java/lang/Thread:getName	()Ljava/lang/String;
                //   272: aastore
                //   273: dup
                //   274: iconst_1
                //   275: aload_3
                //   276: aload 5
                //   278: invokeinterface 187 2 0
                //   283: checkcast 189	[Ljava/lang/StackTraceElement;
                //   286: invokestatic 195	com/tencent/mm/sdk/platformtools/ah:b	([Ljava/lang/StackTraceElement;)Ljava/lang/String;
                //   289: aastore
                //   290: invokestatic 58	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
                //   293: goto -69 -> 224
                //   296: ldc 45
                //   298: ldc -59
                //   300: iconst_2
                //   301: anewarray 4	java/lang/Object
                //   304: dup
                //   305: iconst_0
                //   306: invokestatic 200	android/os/Debug:getGlobalGcInvocationCount	()I
                //   309: invokestatic 144	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
                //   312: aastore
                //   313: dup
                //   314: iconst_1
                //   315: invokestatic 203	android/os/Debug:getThreadGcInvocationCount	()I
                //   318: invokestatic 144	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
                //   321: aastore
                //   322: invokestatic 58	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
                //   325: goto -291 -> 34
                //   328: ldc 45
                //   330: ldc -51
                //   332: iconst_2
                //   333: anewarray 4	java/lang/Object
                //   336: dup
                //   337: iconst_0
                //   338: lload_1
                //   339: invokestatic 77	java/lang/Long:valueOf	(J)Ljava/lang/Long;
                //   342: aastore
                //   343: dup
                //   344: iconst_1
                //   345: aload_3
                //   346: getfield 209	android/os/Debug$MemoryInfo:nativePss	I
                //   349: invokestatic 144	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
                //   352: aastore
                //   353: invokestatic 58	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
                //   356: goto -273 -> 83
                //   359: aload 4
                //   361: astore_3
                //   362: aload 5
                //   364: invokevirtual 212	java/lang/Process:waitFor	()I
                //   367: pop
                //   368: aload 4
                //   370: astore_3
                //   371: aload 5
                //   373: invokevirtual 215	java/lang/Process:destroy	()V
                //   376: aload 4
                //   378: invokevirtual 132	java/io/LineNumberReader:close	()V
                //   381: goto -194 -> 187
                //   384: astore_3
                //   385: ldc 45
                //   387: ldc -39
                //   389: iconst_1
                //   390: anewarray 4	java/lang/Object
                //   393: dup
                //   394: iconst_0
                //   395: aload_3
                //   396: invokevirtual 126	java/lang/Exception:getMessage	()Ljava/lang/String;
                //   399: aastore
                //   400: invokestatic 129	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
                //   403: goto -216 -> 187
                //   406: astore_3
                //   407: ldc 45
                //   409: ldc -39
                //   411: iconst_1
                //   412: anewarray 4	java/lang/Object
                //   415: dup
                //   416: iconst_0
                //   417: aload_3
                //   418: invokevirtual 126	java/lang/Exception:getMessage	()Ljava/lang/String;
                //   421: aastore
                //   422: invokestatic 129	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
                //   425: goto -238 -> 187
                //   428: astore 4
                //   430: aconst_null
                //   431: astore_3
                //   432: aload_3
                //   433: ifnull +7 -> 440
                //   436: aload_3
                //   437: invokevirtual 132	java/io/LineNumberReader:close	()V
                //   440: aload 4
                //   442: athrow
                //   443: astore_3
                //   444: ldc 45
                //   446: ldc -39
                //   448: iconst_1
                //   449: anewarray 4	java/lang/Object
                //   452: dup
                //   453: iconst_0
                //   454: aload_3
                //   455: invokevirtual 126	java/lang/Exception:getMessage	()Ljava/lang/String;
                //   458: aastore
                //   459: invokestatic 129	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
                //   462: goto -22 -> 440
                //   465: ldc2_w 36
                //   468: sipush 3144
                //   471: invokestatic 30	com/tencent/gmtrace/GMTrace:o	(JI)V
                //   474: iconst_1
                //   475: ireturn
                //   476: astore 4
                //   478: goto -46 -> 432
                //   481: astore 5
                //   483: aconst_null
                //   484: astore 4
                //   486: goto -331 -> 155
                // Local variable table:
                //   start	length	slot	name	signature
                //   0	489	0	this	1
                //   37	302	1	l	long
                //   45	326	3	localObject1	Object
                //   384	12	3	localException1	Exception
                //   406	12	3	localException2	Exception
                //   431	6	3	localObject2	Object
                //   443	12	3	localException3	Exception
                //   112	265	4	localObject3	Object
                //   428	13	4	localObject4	Object
                //   476	1	4	localObject5	Object
                //   484	1	4	localObject6	Object
                //   91	11	5	localProcess	Process
                //   153	16	5	localException4	Exception
                //   244	128	5	localThread	Thread
                //   481	1	5	localException5	Exception
                //   122	24	6	str	String
                // Exception table:
                //   from	to	target	type
                //   117	124	153	java/lang/Exception
                //   132	140	153	java/lang/Exception
                //   143	150	153	java/lang/Exception
                //   362	368	153	java/lang/Exception
                //   371	376	153	java/lang/Exception
                //   376	381	384	java/lang/Exception
                //   182	187	406	java/lang/Exception
                //   83	114	428	finally
                //   436	440	443	java/lang/Exception
                //   117	124	476	finally
                //   132	140	476	finally
                //   143	150	476	finally
                //   158	177	476	finally
                //   362	368	476	finally
                //   371	376	476	finally
                //   83	114	481	java/lang/Exception
              }
            }, true).z(10000L, 10000L);
            GMTrace.o(427886116864L, 3188);
          }
        });
        GMTrace.o(424262238208L, 3161);
        return true;
      }
      if (paramString.startsWith("//remittance reset"))
      {
        at.AR();
        com.tencent.mm.y.c.xh().set(327729, "0");
        GMTrace.o(424262238208L, 3161);
        return true;
      }
      if (paramString.startsWith("//wv "))
      {
        paramString = paramString.replace("//wv ", "");
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("rawUrl", paramString);
        com.tencent.mm.bj.d.b(paramContext, "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
        GMTrace.o(424262238208L, 3161);
        return true;
      }
      if (paramString.startsWith("//wvjsapi "))
      {
        paramString = paramString.replace("//wvjsapi ", "");
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("rawUrl", paramString);
        com.tencent.mm.bj.d.b(paramContext, "webview", ".ui.tools.WebViewTestUI", (Intent)localObject1);
        GMTrace.o(424262238208L, 3161);
        return true;
      }
      if (paramString.startsWith("//setibeacontabuinopen"))
      {
        if (at.AU())
        {
          at.AR();
          com.tencent.mm.y.c.xh().a(w.a.vta, Integer.valueOf(1));
          GMTrace.o(424262238208L, 3161);
          return true;
        }
        GMTrace.o(424262238208L, 3161);
        return false;
      }
      if (paramString.startsWith("//setibeacontabuinclose"))
      {
        if (at.AU())
        {
          at.AR();
          com.tencent.mm.y.c.xh().a(w.a.vta, Integer.valueOf(0));
          GMTrace.o(424262238208L, 3161);
          return true;
        }
        GMTrace.o(424262238208L, 3161);
        return false;
      }
      if (paramString.startsWith("//setibeaconpushopen"))
      {
        if (at.AU())
        {
          at.AR();
          com.tencent.mm.y.c.xh().a(w.a.vsV, Boolean.valueOf(true));
          GMTrace.o(424262238208L, 3161);
          return true;
        }
        GMTrace.o(424262238208L, 3161);
        return false;
      }
      if (paramString.startsWith("//setibeaconpushclose"))
      {
        if (at.AU())
        {
          at.AR();
          com.tencent.mm.y.c.xh().a(w.a.vsV, Boolean.valueOf(false));
          GMTrace.o(424262238208L, 3161);
          return true;
        }
        GMTrace.o(424262238208L, 3161);
        return false;
      }
      if (paramString.startsWith("//ibeacon"))
      {
        bool1 = false;
        bool3 = false;
        if (Build.VERSION.SDK_INT >= 18) {
          bool1 = true;
        }
        paramString = BluetoothAdapter.getDefaultAdapter();
        bool2 = bool3;
        if (paramString != null)
        {
          bool2 = bool3;
          if (paramString.getState() == 12) {
            bool2 = true;
          }
        }
        bool4 = paramContext.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
        if ((bool1) && (bool2) && (bool4)) {}
        for (bool3 = true;; bool3 = false)
        {
          paramString = "isNowSupportedIbeacon:" + bool3 + "\n\nisSystemSupported:" + bool1 + "\nisBlueStateOn:" + bool2 + "\nisSupportedBLE:" + bool4 + "\nSDK:" + Build.VERSION.SDK_INT + "\nModel:" + Build.BRAND + "-" + com.tencent.mm.compatible.d.p.te() + "\noperatingSystemInfo:" + com.tencent.mm.compatible.d.p.ti();
          com.tencent.mm.ui.base.h.a(paramContext, paramString, "TestResult", paramContext.getString(R.l.dfg), paramContext.getString(R.l.dis), new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(414732779520L, 3090);
              ((ClipboardManager)this.fSR.getSystemService("clipboard")).setText(paramString);
              GMTrace.o(414732779520L, 3090);
            }
          }, null);
          GMTrace.o(424262238208L, 3161);
          return true;
        }
      }
      if (paramString.startsWith("//gettbs"))
      {
        bool1 = com.tencent.mm.compatible.d.p.fQF.fRr;
        paramString = paramContext.getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4);
        localObject1 = paramString.getString("tbs_download", null);
        localObject4 = paramString.getString("tbs_webview_disable", null);
        bool2 = paramString.getBoolean("x5_jscore_enabled", false);
        i = WebView.getTbsCoreVersion(paramContext);
        j = WebView.getTbsSDKVersion(paramContext);
        Toast.makeText(paramContext, String.format("forceSys:%b\ntbs_download:%s\ntbs_disable:%s\ntbs_disable_min_sdk_version:%s\ntbs_disable_max_sdk_version:%s\ntbsCoreVersion:%d\ntbsSdkVersion:%d\nx5JsCoreEnabled:%b", new Object[] { Boolean.valueOf(bool1), localObject1, localObject4, paramString.getString("tbs_webview_min_sdk_version", null), paramString.getString("tbs_webview_max_sdk_version", null), Integer.valueOf(i), Integer.valueOf(j), Boolean.valueOf(bool2) }), 1).show();
        GMTrace.o(424262238208L, 3161);
        return true;
      }
      if (paramString.startsWith("//deletetbs"))
      {
        paramString = new Intent();
        paramString.setComponent(new ComponentName(ab.getPackageName(), "com.tencent.mm.booter.MMReceivers$SandBoxProcessReceiver"));
        paramContext.sendBroadcast(paramString);
        paramContext = paramContext.getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4).edit();
        paramContext.putLong("last_check_ts", 0L);
        paramContext.apply();
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vtX, Boolean.valueOf(false));
        GMTrace.o(424262238208L, 3161);
        return true;
      }
      if (paramString.startsWith("//tbsDisableOverScroll"))
      {
        localObject1 = paramContext.getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4).edit();
        try
        {
          paramContext = paramString.substring(paramString.indexOf(":") + 1);
          ((SharedPreferences.Editor)localObject1).putBoolean("tbs_disable_over_scroll", Boolean.parseBoolean(paramContext));
          ((SharedPreferences.Editor)localObject1).apply();
          GMTrace.o(424262238208L, 3161);
          return true;
        }
        catch (IndexOutOfBoundsException paramContext)
        {
          for (;;)
          {
            paramContext = "";
          }
        }
      }
      if (paramString.startsWith("//enabletbs"))
      {
        localObject1 = paramContext.getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4).edit();
        paramString = paramString.replace("//enabletbs ", "");
        if ("1".equals(paramString)) {}
        for (paramContext = "0";; paramContext = "1")
        {
          ((SharedPreferences.Editor)localObject1).putString("tbs_webview_disable", paramContext);
          if ("0".equals(paramString))
          {
            ((SharedPreferences.Editor)localObject1).putString("tbs_webview_min_sdk_version", "0");
            ((SharedPreferences.Editor)localObject1).putString("tbs_webview_max_sdk_version", "0");
          }
          ((SharedPreferences.Editor)localObject1).apply();
          GMTrace.o(424262238208L, 3161);
          return true;
        }
      }
      if (paramString.startsWith("//wvsha1"))
      {
        localObject1 = paramContext.getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4).edit();
        try
        {
          paramContext = paramString.substring(paramString.indexOf(":") + 1);
          ((SharedPreferences.Editor)localObject1).putBoolean("wvsha1", Boolean.parseBoolean(paramContext));
          ((SharedPreferences.Editor)localObject1).apply();
          GMTrace.o(424262238208L, 3161);
          return true;
        }
        catch (IndexOutOfBoundsException paramContext)
        {
          for (;;)
          {
            paramContext = "";
          }
        }
      }
      if (paramString.startsWith("//channelId")) {
        com.tencent.mm.ui.base.h.A(paramContext, com.tencent.mm.sdk.platformtools.f.eqV, "channelId");
      }
      if (paramString.startsWith("//traceroute"))
      {
        com.tencent.mm.bj.d.x(paramContext, "traceroute", ".ui.NetworkDiagnoseIntroUI");
        GMTrace.o(424262238208L, 3161);
        return true;
      }
      if (paramString.startsWith("//qzone "))
      {
        localObject1 = paramString.replace("//qzone ", "");
        new com.tencent.mm.pluginsdk.ui.applet.s(paramContext).Pn((String)localObject1);
      }
      if (paramString.startsWith("//dumpcrash"))
      {
        com.tencent.mm.sdk.platformtools.j.r(com.tencent.mm.compatible.util.e.ghv + "crash/", com.tencent.mm.compatible.util.e.ghA, false);
        GMTrace.o(424262238208L, 3161);
        return true;
      }
      if (paramString.startsWith("//dumpanr"))
      {
        com.tencent.mm.sdk.platformtools.j.r("/data/anr/", com.tencent.mm.compatible.util.e.ghA, false);
        GMTrace.o(424262238208L, 3161);
        return true;
      }
      if (paramString.startsWith("//testanr")) {
        try
        {
          Thread.sleep(10000L);
          GMTrace.o(424262238208L, 3161);
          return true;
        }
        catch (InterruptedException paramContext)
        {
          for (;;)
          {
            com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.CommandProcessor", paramContext, "", new Object[0]);
          }
        }
      }
      if (paramString.startsWith("//opensnsadRightbar"))
      {
        com.tencent.mm.platformtools.r.hks = true;
        GMTrace.o(424262238208L, 3161);
        return true;
      }
      if (paramString.startsWith("//setlocation "))
      {
        paramContext = paramString.split(" ");
        if ((paramContext != null) && (com.tencent.mm.sdk.a.b.bPq()))
        {
          com.tencent.mm.platformtools.r.hjI = true;
          if (paramContext.length > 0) {
            com.tencent.mm.platformtools.r.lat = bg.getDouble(paramContext[1], 0.0D);
          }
          if (paramContext.length > 1) {
            com.tencent.mm.platformtools.r.lng = bg.getDouble(paramContext[2], 0.0D);
          }
          GMTrace.o(424262238208L, 3161);
          return true;
        }
        GMTrace.o(424262238208L, 3161);
        return false;
      }
      if (paramString.startsWith("//switchsdcard"))
      {
        paramString = av.bQz();
        j = paramString.size();
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "switchsdcard sdcard size = " + j);
        if ((j > 0) && (paramString.get(0) != null) && (!bg.nm(((av.a)paramString.get(0)).vkG)))
        {
          i = 0;
          while (i < j)
          {
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "switchsdcard list i = " + i + " StatMountParse: " + paramString.get(i));
            i += 1;
          }
        }
        i = 0;
        for (;;)
        {
          if (i >= j) {
            break label15503;
          }
          if (!((av.a)paramString.get(i)).vkG.equals(com.tencent.mm.compatible.util.e.ghx))
          {
            paramString = ((av.a)paramString.get(i)).vkG;
            localObject1 = (Activity)paramContext;
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "switchsdcard newSdcard: " + paramString);
            if (!bg.nm(paramString)) {
              break;
            }
            com.tencent.mm.ui.base.h.bk(paramContext, paramContext.getString(R.l.edE));
            GMTrace.o(424262238208L, 3161);
            return true;
          }
          i += 1;
        }
        com.tencent.mm.ui.base.h.a(paramContext, paramContext.getString(R.l.edF), "", paramContext.getString(R.l.cTM), paramContext.getString(R.l.cSk), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(415001214976L, 3092);
            paramAnonymousDialogInterface = new com.tencent.mm.storage.s(com.tencent.mm.storage.w.ghv + "SdcardInfo.cfg");
            paramAnonymousDialogInterface.set(1, this.fTh);
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "switchsdcard reset to sdcard root: " + paramAnonymousDialogInterface.get(1));
            ad.RT("welcome_page_show");
            com.tencent.mm.kernel.k.d(paramContext, true);
            paramAnonymousDialogInterface = new z();
            paramAnonymousDialogInterface.eAW.eAX = false;
            com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousDialogInterface);
            WorkerProfile.pz().etG.pu();
            at.getNotification().ry();
            paramAnonymousDialogInterface = new Intent();
            paramAnonymousDialogInterface.setComponent(new ComponentName(e.g.vGK, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
            paramAnonymousDialogInterface.putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_KILL_TOOLS_PROCESS");
            ab.getContext().sendBroadcast(paramAnonymousDialogInterface);
            if (p.a.tlX != null) {
              p.a.tlX.am(localObject1);
            }
            localObject1.finish();
            GMTrace.o(415001214976L, 3092);
          }
        }, null);
        GMTrace.o(424262238208L, 3161);
        return true;
      }
      if (paramString.startsWith("//getip"))
      {
        at.wS().d(new bf(new bf.a()
        {
          public final void a(com.tencent.mm.network.e paramAnonymouse)
          {
            GMTrace.i(420638359552L, 3134);
            if (paramAnonymouse == null)
            {
              GMTrace.o(420638359552L, 3134);
              return;
            }
            String[] arrayOfString = paramAnonymouse.getIPsString(true);
            int i = 0;
            while (i < arrayOfString.length)
            {
              com.tencent.mm.sdk.platformtools.w.d("MicroMsg.CommandProcessor", "dkip long:%d  %s", new Object[] { Integer.valueOf(i), arrayOfString[i] });
              com.tencent.mm.sdk.platformtools.w.d("MicroMsg.CommandProcessor", "dkip long:%d %s", new Object[] { Integer.valueOf(i), com.tencent.mm.network.a.c.mZ(arrayOfString[i]).toString() });
              i += 1;
            }
            paramAnonymouse = paramAnonymouse.getIPsString(false);
            i = 0;
            while (i < paramAnonymouse.length)
            {
              com.tencent.mm.sdk.platformtools.w.d("MicroMsg.CommandProcessor", "dkip short:%d %s", new Object[] { Integer.valueOf(i), paramAnonymouse[i] });
              com.tencent.mm.sdk.platformtools.w.d("MicroMsg.CommandProcessor", "dkip long:%d %s", new Object[] { Integer.valueOf(i), com.tencent.mm.network.a.c.mZ(paramAnonymouse[i]).toString() });
              i += 1;
            }
            GMTrace.o(420638359552L, 3134);
          }
        }));
        GMTrace.o(424262238208L, 3161);
        return true;
      }
      if (paramString.startsWith("//localjsapi"))
      {
        paramString = "file://" + com.tencent.mm.compatible.util.e.ghz + "test_jsapi.html";
        com.tencent.mm.sdk.platformtools.w.v("MicroMsg.CommandProcessor", "alvinluo path: %s", new Object[] { paramString });
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("rawUrl", paramString);
        com.tencent.mm.bj.d.b(paramContext, "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
        GMTrace.o(424262238208L, 3161);
        return true;
      }
      if (paramString.startsWith("//getlocalkey"))
      {
        paramString = com.tencent.mm.storage.ba.bUr();
        com.tencent.mm.ui.base.h.a(paramContext, paramString, "Fingerprint Key", paramContext.getString(R.l.eiB), paramContext.getString(R.l.dis), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(423859585024L, 3158);
            ((ClipboardManager)this.fSR.getSystemService("clipboard")).setText(paramString);
            Toast.makeText(this.fSR, R.l.eiC, 0).show();
            GMTrace.o(423859585024L, 3158);
          }
        }, null);
        GMTrace.o(424262238208L, 3161);
        return true;
      }
      if (paramString.startsWith("//getdevid"))
      {
        paramString = com.tencent.mm.compatible.d.p.ta();
        com.tencent.mm.ui.base.h.a(paramContext, paramString, "devid", paramContext.getString(R.l.dfg), paramContext.getString(R.l.dis), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(425335980032L, 3169);
            ((ClipboardManager)this.fSR.getSystemService("clipboard")).setText(paramString);
            GMTrace.o(425335980032L, 3169);
          }
        }, null);
        GMTrace.o(424262238208L, 3161);
        return true;
      }
      if (paramString.startsWith("//testhtml"))
      {
        paramString = new Intent();
        paramString.putExtra("rawUrl", "file:///android_asset/jsapi/reader_test1.html");
        com.tencent.mm.bj.d.b(paramContext, "webview", ".ui.tools.WebViewUI", paramString);
        GMTrace.o(424262238208L, 3161);
        return true;
      }
      if (paramString.startsWith("//testlocalhtml "))
      {
        paramString = paramString.replace("//testlocalhtml ", "");
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("rawUrl", "file://" + paramString);
        ((Intent)localObject1).putExtra("neverGetA8Key", true);
        com.tencent.mm.bj.d.b(paramContext, "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
        GMTrace.o(424262238208L, 3161);
        return true;
      }
      if (paramString.startsWith("//setkey"))
      {
        if (com.tencent.mm.storage.ba.UA(paramString.replace("//setkey", ""))) {
          Toast.makeText(paramContext, R.l.ehI, 0).show();
        }
        GMTrace.o(424262238208L, 3161);
        return true;
      }
      if (paramString.startsWith("//checkspell"))
      {
        paramString = paramString.replace("//checkspell ", "");
        if (bg.nm(paramString))
        {
          GMTrace.o(424262238208L, 3161);
          return true;
        }
        localObject1 = new StringBuilder();
        i = 0;
        while (i < paramString.length())
        {
          ((StringBuilder)localObject1).append("[" + paramString.charAt(i) + ":" + SpellMap.f(paramString.charAt(i)) + "]");
          i += 1;
        }
        com.tencent.mm.ui.base.h.A(paramContext, ((StringBuilder)localObject1).toString(), "Check Spell");
        GMTrace.o(424262238208L, 3161);
        return true;
      }
      if (paramString.startsWith("//gallery "))
      {
        paramString = paramString.replace("//gallery ", "");
        if (bg.nm(paramString))
        {
          GMTrace.o(424262238208L, 3161);
          return true;
        }
        paramContext.getSharedPreferences(ab.bPU(), 0).edit().putString("gallery", paramString).commit();
        GMTrace.o(424262238208L, 3161);
        return true;
      }
      if (paramString.startsWith("//svgtag"))
      {
        paramContext = paramString.replace("//svgtag ", "");
        if (paramContext.equals("on")) {
          com.tencent.mm.bs.c.ky(true);
        }
        for (;;)
        {
          GMTrace.o(424262238208L, 3161);
          return true;
          if (paramContext.equals("off")) {
            com.tencent.mm.bs.c.ky(false);
          }
        }
      }
      if (paramString.startsWith("//svgcode")) {}
      try
      {
        paramContext = paramString.replace("//svgcode ", "");
        if (!paramContext.equals("on")) {
          paramContext.equals("off");
        }
        paramContext = Class.forName("com.tencent.mm.BuildConfig");
        paramString = paramContext.getDeclaredField("SVGCode");
        paramString.setAccessible(true);
        bool1 = paramString.getBoolean(paramContext);
      }
      catch (ClassNotFoundException paramContext)
      {
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.CommandProcessor", paramContext, "", new Object[0]);
          bool1 = false;
        }
      }
      catch (NoSuchFieldException paramContext)
      {
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.CommandProcessor", paramContext, "", new Object[0]);
          bool1 = false;
        }
      }
      catch (IllegalAccessException paramContext)
      {
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.CommandProcessor", paramContext, "", new Object[0]);
          bool1 = false;
        }
      }
      catch (IllegalArgumentException paramContext)
      {
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.CommandProcessor", paramContext, "", new Object[0]);
          bool1 = false;
        }
        if (!paramString.startsWith("//testMbanner")) {
          break label7025;
        }
        try
        {
          paramContext = paramString.replace("//testMbanner ", "").split(",");
          if (paramContext.length < 2) {
            break label7014;
          }
          bb.Bc().a(new com.tencent.mm.y.ba(Integer.valueOf(paramContext[0]).intValue(), Integer.valueOf(paramContext[1]).intValue(), null));
          GMTrace.o(424262238208L, 3161);
          return true;
          if (!paramString.startsWith("//testrsa")) {
            break label7046;
          }
          ac.G("010001", "E338E5DAD46B331E3071FAFD4C0F84C7C7965DBBE64C6F8CC0F7CF04DC640C1F84A2014431A48D65F2B2F172BA9BE6F5A049BF52C78C14B0965E20F0D80D85A9180EBABB913D49821D28BFD9601DF52A4F3230AECAD96D23415F5E94D51A87CAA7630C5F3CB70345BAF572A4F61A134A2265AFD8FADDFE0222BD9ABF7DBEB7444D031454E8F21820BBC725E6857F765660E987FADEBCF6B3A15355C4CD3752A7B544D1D7E037AF4F9725BE37681A84C9E1DC431B3065294EAD53E913BAF16D46714B013EA077191E6CA08ABA6D70E9CA792D898D692E3168D6341369976657CD5E1504B9E2458F107225176734D11621AD36D7FFA26C573D6612455B09105C41", 106);
          if (!paramString.startsWith("//recomT")) {
            break label7089;
          }
          try
          {
            paramContext = paramString.replace("//recomT ", "");
            at.AR().zr().a(paramContext, true, null);
            GMTrace.o(424262238208L, 3161);
            return true;
            if (!paramString.startsWith("//recomF")) {
              break label7132;
            }
            try
            {
              paramContext = paramString.replace("//recomF ", "");
              at.AR().zr().a(paramContext, false, null);
              GMTrace.o(424262238208L, 3161);
              return true;
              if (!paramString.startsWith("//testgetreg")) {
                break label7222;
              }
              try
              {
                paramContext = paramString.replace("//testgetreg ", "").split(",");
                if (paramContext.length <= 2) {
                  break label7211;
                }
                new bj.a().fB(Integer.valueOf(paramContext[0]).intValue()).fD(Integer.valueOf(paramContext[1]).intValue()).fC(Integer.valueOf(paramContext[2]).intValue()).commit();
                GMTrace.o(424262238208L, 3161);
                return true;
                if (!paramString.startsWith("//ffmpeg")) {
                  break label7359;
                }
                try
                {
                  i = paramString.indexOf("-r ");
                  j = paramString.indexOf("-b ");
                  paramContext = paramString.substring(i + 3, j);
                  paramString = paramString.substring(j + 3);
                  float f = bg.getFloat(paramContext.trim(), 0.0F);
                  i = bg.getInt(paramString.trim(), 0);
                  com.tencent.mm.plugin.sight.base.b.oRE = i;
                  com.tencent.mm.plugin.sight.base.b.oRF = f;
                  Toast.makeText(ab.getContext(), "set C2C video encode frame rate " + f + " bitrate " + i, 0).show();
                  GMTrace.o(424262238208L, 3161);
                  return true;
                }
                catch (Exception paramContext)
                {
                  for (;;)
                  {
                    Toast.makeText(ab.getContext(), "set C2C video frame rate fail, please ensure your command.", 1).show();
                  }
                }
                if (!paramString.startsWith("//onlinevideo")) {
                  break label7466;
                }
                for (;;)
                {
                  try
                  {
                    i = bg.getInt(paramString.replace("//onlinevideo ", ""), 0);
                    at.AR();
                    com.tencent.mm.y.c.xh().a(w.a.vvc, Integer.valueOf(i));
                    if (i <= 0) {
                      continue;
                    }
                    paramContext = "online video";
                    Toast.makeText(ab.getContext(), paramContext, 0).show();
                  }
                  catch (Exception paramContext)
                  {
                    com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.CommandProcessor", paramContext, "", new Object[0]);
                    Toast.makeText(ab.getContext(), "set online video fail, please ensure your command.", 1).show();
                    continue;
                  }
                  GMTrace.o(424262238208L, 3161);
                  return true;
                  paramContext = "offline video";
                }
                if (!paramString.startsWith("//hevcinfo")) {
                  break label7542;
                }
                paramContext = com.tencent.mm.plugin.s.e.aOA();
                paramString = En_5b8fbb1e.a.wCB;
                localObject1 = new au();
                ((au)localObject1).db(paramString);
                ((au)localObject1).dC(2);
                ((au)localObject1).setType(1);
                ((au)localObject1).E(System.currentTimeMillis());
                ((au)localObject1).setContent(paramContext);
                com.tencent.mm.y.bc.i((au)localObject1);
                GMTrace.o(424262238208L, 3161);
                return true;
                if (!paramString.startsWith("//presns")) {
                  break label7593;
                }
                com.tencent.mm.kernel.h.xB().h(new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(16873181675520L, 125715);
                    com.tencent.mm.sdk.b.a.vgX.m(new pt());
                    GMTrace.o(16873181675520L, 125715);
                  }
                }, 3000L);
                Toast.makeText(ab.getContext(), "preload sns", 0).show();
                GMTrace.o(424262238208L, 3161);
                return true;
                if (!paramString.startsWith("//calcwxdata")) {
                  break label7644;
                }
                at.AR();
                com.tencent.mm.y.c.xh().a(w.a.vxT, Long.valueOf(0L));
                Toast.makeText(ab.getContext(), "calc wx data success", 0).show();
                GMTrace.o(424262238208L, 3161);
                return true;
                if (!paramString.startsWith("//checkspace")) {
                  break label7759;
                }
                try
                {
                  i = bg.getInt(paramString.replace("//checkspace ", ""), 0);
                  paramContext = new com.tencent.mm.g.a.bc();
                  paramContext.eCp.eCq = i;
                  com.tencent.mm.sdk.b.a.vgX.m(paramContext);
                  Toast.makeText(ab.getContext(), "check space code " + i, 0).show();
                  GMTrace.o(424262238208L, 3161);
                  return true;
                }
                catch (Exception paramContext)
                {
                  for (;;)
                  {
                    com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.CommandProcessor", paramContext, "", new Object[0]);
                    Toast.makeText(ab.getContext(), "check space code fail, please ensure your command.", 1).show();
                  }
                }
                if (!paramString.startsWith("//upfacemodel")) {
                  break label7796;
                }
                at.wS().d(new com.tencent.mm.pluginsdk.j.a.b.m(42));
                GMTrace.o(424262238208L, 3161);
                return true;
                if (!paramString.startsWith("//facett")) {
                  break label7834;
                }
                at.AR();
                com.tencent.mm.y.c.xh().a(w.a.vwB, Boolean.valueOf(false));
                GMTrace.o(424262238208L, 3161);
                return true;
                if (!paramString.startsWith("//switchpaytype")) {
                  break label7929;
                }
                paramContext = paramString.split(" ");
                if ((paramContext == null) || (paramContext.length < 2)) {
                  break label7918;
                }
                try
                {
                  i = bg.getInt(paramContext[1], 0);
                  at.AR();
                  com.tencent.mm.y.c.xh().set(339975, Integer.valueOf(i));
                  GMTrace.o(424262238208L, 3161);
                  return true;
                }
                catch (Exception paramContext)
                {
                  com.tencent.mm.sdk.platformtools.w.e("MicroMsg.CommandProcessor", "hy: switch wallet type error");
                  GMTrace.o(424262238208L, 3161);
                  return false;
                }
                GMTrace.o(424262238208L, 3161);
                return false;
                if (!paramString.startsWith("//setNfcOpenUrl ")) {
                  break label7987;
                }
                paramContext = paramString.replace("//setNfcOpenUrl ", "");
                paramString = ab.bPW().edit();
                paramString.putString("nfc_open_url", paramContext);
                paramString.commit();
                GMTrace.o(424262238208L, 3161);
                return true;
                if (!paramString.startsWith("//snskvtest ")) {
                  break label8052;
                }
                paramContext = paramString.replace("//snskvtest", "").trim();
                if (!paramContext.equals("0")) {
                  break label8035;
                }
                com.tencent.mm.platformtools.r.hkO = false;
                for (;;)
                {
                  GMTrace.o(424262238208L, 3161);
                  return true;
                  if (paramContext.equals("1")) {
                    com.tencent.mm.platformtools.r.hkO = true;
                  }
                }
                if (!paramString.startsWith("//emoji ")) {
                  break label8103;
                }
                paramContext = paramString.replace("//emoji ", "");
                ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vY(paramContext);
                GMTrace.o(424262238208L, 3161);
                return true;
                if (!paramString.startsWith("//share ")) {
                  break label8157;
                }
                i = Integer.valueOf(paramString.replace("//share ", "")).intValue();
                at.AR();
                com.tencent.mm.y.c.xh().set(229635, Integer.valueOf(i));
                GMTrace.o(424262238208L, 3161);
                return true;
                if (!paramString.startsWith("//dumpappinfoblob ")) {
                  break label8246;
                }
                paramString = paramString.replace("//dumpappinfoblob ", "");
                paramString = an.aWy().Ox(paramString);
                com.tencent.mm.ui.base.h.A(paramContext, paramString.qN() + "\n" + paramString.qO() + "\n" + paramString.qP(), "");
                GMTrace.o(424262238208L, 3161);
                return true;
                if (!paramString.startsWith("//googleauth ")) {
                  break label8363;
                }
                paramString = paramString.replace("//googleauth ", "");
                if (TextUtils.isEmpty(paramString)) {
                  break label8311;
                }
                if (!"webview".equals(paramString)) {
                  break label8322;
                }
                paramContext.getSharedPreferences(ab.bPU(), 0).edit().putBoolean("googleauth", true).commit();
                for (;;)
                {
                  GMTrace.o(424262238208L, 3161);
                  return true;
                  if ("local".equals(paramString)) {
                    paramContext.getSharedPreferences(ab.bPU(), 0).edit().putBoolean("googleauth", false).commit();
                  }
                }
                if (!paramString.startsWith("//clrgamecache")) {
                  break label8399;
                }
                paramString = p.a.bIR();
                if (paramString == null) {
                  break label8388;
                }
                paramString.cC(paramContext);
                GMTrace.o(424262238208L, 3161);
                return true;
                if (!paramString.startsWith("//clearwepkg")) {
                  break label8483;
                }
                paramContext = new tn();
                paramContext.eZp.eCx = 6;
                paramString = paramString.replace("//clearwepkg ", "").trim();
                if ((bg.nm(paramString)) || (paramString.equals("//clearwepkg"))) {
                  break label8464;
                }
                paramContext.eZp.eZq = paramString;
                com.tencent.mm.sdk.b.a.vgX.m(paramContext);
                GMTrace.o(424262238208L, 3161);
                return true;
                if (!paramString.startsWith("//googlemap")) {
                  break label8508;
                }
                com.tencent.mm.platformtools.r.hkr = true;
                GMTrace.o(424262238208L, 3161);
                return true;
                if (!paramString.startsWith("//sosomap")) {
                  break label8533;
                }
                com.tencent.mm.platformtools.r.hkr = false;
                GMTrace.o(424262238208L, 3161);
                return true;
                if (!paramString.startsWith("//opentrace")) {
                  break label8568;
                }
                new com.tencent.mm.ui.applet.d();
                com.tencent.mm.ui.applet.d.fi(ab.getContext());
                GMTrace.o(424262238208L, 3161);
                return true;
                if (!paramString.startsWith("//updateConversation")) {
                  break label8675;
                }
                com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "update all conversation start");
                at.AR();
                paramContext = com.tencent.mm.y.c.yP().bTd().iterator();
                while (paramContext.hasNext())
                {
                  paramString = (String)paramContext.next();
                  at.AR();
                  paramString = com.tencent.mm.y.c.yM().cS(paramString, " and not ( type = 10000 and isSend != 2 ) ");
                  at.AR();
                  com.tencent.mm.y.c.yP().ac(paramString);
                }
                com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "update all conversation end");
                GMTrace.o(424262238208L, 3161);
                return true;
                if (!paramString.startsWith("//setshakecarddata")) {
                  break label8704;
                }
                p.a.bIQ().bfg();
                GMTrace.o(424262238208L, 3161);
                return true;
                if (!paramString.startsWith("//clearshakecarddata")) {
                  break label8733;
                }
                p.a.bIQ().bfh();
                GMTrace.o(424262238208L, 3161);
                return true;
                if (!paramString.startsWith("//pageSize")) {
                  break label8794;
                }
                paramContext = ab.getContext();
                paramString = new StringBuilder("pageSize is ");
                at.AR();
                Toast.makeText(paramContext, com.tencent.mm.y.c.yH().getPageSize(), 1).show();
                GMTrace.o(424262238208L, 3161);
                return true;
                if (!paramString.startsWith("//resetDBStatus")) {
                  break label8980;
                }
                at.AR();
                paramContext = new File(com.tencent.mm.y.c.xf());
                try
                {
                  paramString = new StringBuilder();
                  at.AR();
                  paramString = com.tencent.mm.y.c.zn() + paramContext.getName().replace(".db", ".db.backup");
                  com.tencent.mm.ui.tools.e.f(new File(paramString), paramContext);
                  com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "backupPath db path is %s", new Object[] { paramString });
                  com.tencent.mm.a.e.b(paramContext, new File(paramContext.getAbsolutePath() + "err" + System.currentTimeMillis()));
                  Toast.makeText(ab.getContext(), "db状态已重置,请重启微信", 1).show();
                  GMTrace.o(424262238208L, 3161);
                  return true;
                }
                catch (Exception paramContext)
                {
                  for (;;)
                  {
                    com.tencent.mm.sdk.platformtools.w.w("MicroMsg.CommandProcessor", "delete failed: " + paramContext.getMessage());
                  }
                }
                if (!paramString.startsWith("//makesnsdata ")) {
                  break label9025;
                }
                i = bg.getInt(paramString.replace("//makesnsdata ", ""), 0);
                p.y.bIW().dp(i);
                GMTrace.o(424262238208L, 3161);
                return true;
                if (!paramString.startsWith("//setsnsupload ")) {
                  break label9062;
                }
                com.tencent.mm.platformtools.r.hkB = bg.getInt(paramString.replace("//setsnsupload ", ""), 0);
                GMTrace.o(424262238208L, 3161);
                return true;
                if (!paramString.startsWith("//logsnstable")) {
                  break label9099;
                }
                paramContext = new cj();
                com.tencent.mm.sdk.b.a.vgX.m(paramContext);
                GMTrace.o(424262238208L, 3161);
                return true;
                if (!paramString.startsWith("//fpsreset ")) {
                  break label9165;
                }
                paramContext = new fm();
                if (!paramString.equalsIgnoreCase("//fpsreset on")) {
                  break label9154;
                }
                for (paramContext.eHS.eCx = 1;; paramContext.eHS.eCx = 0)
                {
                  com.tencent.mm.sdk.b.a.vgX.m(paramContext);
                  GMTrace.o(424262238208L, 3161);
                  return true;
                }
                if (!paramString.startsWith("//resetsnstip")) {
                  break label9203;
                }
                at.AR();
                com.tencent.mm.y.c.xh().set(327776, Integer.valueOf(0));
                GMTrace.o(424262238208L, 3161);
                return true;
                if (!paramString.startsWith("//checkcount")) {
                  break label9293;
                }
                at.AR();
                i = com.tencent.mm.y.c.yM().Cr(En_5b8fbb1e.a.wCB);
                at.AR();
                j = com.tencent.mm.y.c.yM().Cp(En_5b8fbb1e.a.wCB);
                Toast.makeText(paramContext, "current count :" + i + " countAuto :" + j, 1).show();
                GMTrace.o(424262238208L, 3161);
                return true;
                if (!paramString.startsWith("//changeframe ")) {
                  break label9360;
                }
                paramContext = paramString.replace("//changeframe ", "");
                ab.getContext().getSharedPreferences("preferences_animation", 0).edit().putFloat("frameInterval", Float.valueOf(paramContext).floatValue()).commit();
                GMTrace.o(424262238208L, 3161);
                return true;
                if (!paramString.startsWith("//opendumpview")) {
                  break label9395;
                }
                new com.tencent.mm.ui.applet.c();
                com.tencent.mm.ui.applet.c.fh(ab.getContext());
                GMTrace.o(424262238208L, 3161);
                return true;
                if (!paramString.startsWith("//dumpmemory")) {
                  break label9425;
                }
                System.gc();
                System.gc();
                com.tencent.mm.bw.b.bVE();
                GMTrace.o(424262238208L, 3161);
                return true;
                if (!paramString.startsWith("//dumpsnsfile")) {
                  break label9462;
                }
                paramContext = new pi();
                com.tencent.mm.sdk.b.a.vgX.m(paramContext);
                GMTrace.o(424262238208L, 3161);
                return true;
                if (!paramString.startsWith("//coverage")) {
                  break label9496;
                }
                com.tencent.mm.plugin.report.b.f.FI(paramString.trim().substring(10));
                GMTrace.o(424262238208L, 3161);
                return true;
                if (!paramString.startsWith("//dumpthreadpool")) {
                  break label9520;
                }
                com.tencent.mm.sdk.f.e.bRs();
                GMTrace.o(424262238208L, 3161);
                return true;
                if (!paramString.startsWith("//testverifypsw ")) {
                  break label9610;
                }
                paramContext = paramString.replace("//testverifypsw ", "").trim();
                if (!paramContext.equals("0")) {
                  break label9593;
                }
                com.tencent.mm.platformtools.r.hkQ = false;
                for (;;)
                {
                  com.tencent.mm.sdk.platformtools.w.d("MicroMsg.CommandProcessor", "summerdktext testverifypsw msg[%s], testVerifyPsw[%b]", new Object[] { paramString, Boolean.valueOf(com.tencent.mm.platformtools.r.hkQ) });
                  GMTrace.o(424262238208L, 3161);
                  return true;
                  if (paramContext.equals("1")) {
                    com.tencent.mm.platformtools.r.hkQ = true;
                  }
                }
                if (!paramString.startsWith("//pickpoi")) {
                  break label9660;
                }
                paramString = new Intent();
                paramString.putExtra("map_view_type", 8);
                com.tencent.mm.bj.d.b(paramContext, "location", ".ui.RedirectUI", paramString);
                GMTrace.o(424262238208L, 3161);
                return true;
                if (!paramString.startsWith("//configlist")) {
                  break label9967;
                }
                if (!paramString.matches("^//configlist set ([\\S]*)=([\\S]*)$")) {
                  break label9759;
                }
                paramString = com.tencent.mm.platformtools.t.ar(paramString, "^//configlist set ([\\S]*)=([\\S]*)$");
                if ((paramString == null) || (paramString.size() != 2)) {
                  break label9748;
                }
                paramContext = (String)paramString.get(0);
                paramString = (String)paramString.get(1);
                com.tencent.mm.k.g.ut().put(paramContext, paramString);
                paramContext = new ck();
                com.tencent.mm.sdk.b.a.vgX.m(paramContext);
                for (;;)
                {
                  GMTrace.o(424262238208L, 3161);
                  return true;
                  if (paramString.matches("^//configlist get ([\\S]*)$"))
                  {
                    paramString = com.tencent.mm.platformtools.t.ar(paramString, "^//configlist get ([\\S]*)$");
                    if ((paramString != null) && (paramString.size() == 1))
                    {
                      paramString = (String)paramString.get(0);
                      localObject1 = com.tencent.mm.k.g.ut().getValue(paramString);
                      Toast.makeText(paramContext, paramString + "=" + (String)localObject1, 0).show();
                    }
                  }
                  else
                  {
                    at.AR();
                    paramString = (String)com.tencent.mm.y.c.xh().get(278530, "");
                    at.AR();
                    localObject1 = (String)com.tencent.mm.y.c.xh().get(278529, "");
                    localObject4 = com.tencent.mm.compatible.util.e.ghz + "dynacfg.xml";
                    bg.q((String)localObject4, (paramString + (String)localObject1).getBytes());
                    Toast.makeText(paramContext, "output dynacfg xml to " + (String)localObject4, 0).show();
                  }
                }
                if (!paramString.startsWith("//security")) {
                  break label10010;
                }
                try
                {
                  paramContext = paramString.replace("//security ", "");
                  at.AR().zs().a(paramContext, true, null);
                  GMTrace.o(424262238208L, 3161);
                  return true;
                  if (!paramString.startsWith("//updatepackage")) {
                    break label10063;
                  }
                  try
                  {
                    paramContext = new com.tencent.mm.aw.k(bg.getInt(paramString.replace("//updatepackage ", "").trim(), 0));
                    at.wS().d(paramContext);
                    GMTrace.o(424262238208L, 3161);
                    return true;
                    if (!paramString.startsWith("//copypackage")) {
                      break label10187;
                    }
                    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "summercmd copypackage msg:%s", new Object[] { paramString });
                    paramString = av.bQz();
                    i = paramString.size();
                    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "summercmd copypackage size:%d", new Object[] { Integer.valueOf(i) });
                    if (i >= 2) {
                      break label10145;
                    }
                    com.tencent.mm.ui.base.h.bk(paramContext, paramContext.getString(R.l.dlV));
                    for (;;)
                    {
                      GMTrace.o(424262238208L, 3161);
                      return true;
                      com.tencent.mm.ui.base.h.a(paramContext, paramContext.getString(R.l.dlX), "", paramContext.getString(R.l.cTM), paramContext.getString(R.l.cSk), new DialogInterface.OnClickListener()
                      {
                        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                        {
                          GMTrace.i(427080810496L, 3182);
                          com.tencent.mm.sdk.f.e.post(new Runnable()
                          {
                            public final void run()
                            {
                              GMTrace.i(427349245952L, 3184);
                              try
                              {
                                String str1 = com.tencent.mm.compatible.util.e.ghx;
                                at.AR();
                                String str2 = com.tencent.mm.y.c.ze();
                                at.AR();
                                Object localObject = com.tencent.mm.y.c.yD();
                                String str3 = str2.substring(str1.length());
                                com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "summercmd copypackage size:%d, root:%s, pkgFullPath:%s, sysPath:%s, pkgPath:%s", new Object[] { Integer.valueOf(b.5.this.fSU), str1, str2, localObject, str3 });
                                int i = 0;
                                while (i < b.5.this.fSU)
                                {
                                  localObject = ((av.a)b.5.this.val$list.get(i)).vkG;
                                  if ((!bg.nm((String)localObject)) && (!str1.contains((CharSequence)localObject)))
                                  {
                                    localObject = new File((String)localObject + str3);
                                    if ((((File)localObject).exists()) && (((File)localObject).isDirectory()))
                                    {
                                      boolean bool = com.tencent.mm.sdk.platformtools.j.r(((File)localObject).getAbsolutePath(), str2, false);
                                      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "summercmd copypackage done pkgFullPath:%s, old:%s, ret:%b", new Object[] { str2, ((File)localObject).getAbsolutePath(), Boolean.valueOf(bool) });
                                      if (bool)
                                      {
                                        new com.tencent.mm.sdk.platformtools.ae(Looper.getMainLooper()).post(new Runnable()
                                        {
                                          public final void run()
                                          {
                                            GMTrace.i(423591149568L, 3156);
                                            com.tencent.mm.ui.base.h.bm(b.5.this.val$context, b.5.this.val$context.getString(R.l.dlW));
                                            GMTrace.o(423591149568L, 3156);
                                          }
                                        });
                                        GMTrace.o(427349245952L, 3184);
                                        return;
                                      }
                                    }
                                  }
                                  i += 1;
                                }
                                new com.tencent.mm.sdk.platformtools.ae(Looper.getMainLooper()).post(new Runnable()
                                {
                                  public final void run()
                                  {
                                    GMTrace.i(421712101376L, 3142);
                                    com.tencent.mm.ui.base.h.bm(b.5.this.val$context, b.5.this.val$context.getString(R.l.dlV));
                                    GMTrace.o(421712101376L, 3142);
                                  }
                                });
                                GMTrace.o(427349245952L, 3184);
                                return;
                              }
                              catch (Exception localException)
                              {
                                com.tencent.mm.sdk.platformtools.w.w("MicroMsg.CommandProcessor", "summercmd copypackage e:%s", new Object[] { localException.getMessage() });
                                GMTrace.o(427349245952L, 3184);
                              }
                            }
                          }, "copypackage");
                          GMTrace.o(427080810496L, 3182);
                        }
                      }, null);
                    }
                    if (!paramString.startsWith("//copy -n ")) {
                      break label10315;
                    }
                    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "summercmd copy -n msg:%s ", new Object[] { paramString });
                    localObject1 = av.bQz();
                    i = ((ArrayList)localObject1).size();
                    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "summercmd copy -n size:%d", new Object[] { Integer.valueOf(i) });
                    if (i >= 2) {
                      break label10271;
                    }
                    com.tencent.mm.ui.base.h.bk(paramContext, paramContext.getString(R.l.dlV));
                    for (;;)
                    {
                      GMTrace.o(424262238208L, 3161);
                      return true;
                      com.tencent.mm.ui.base.h.a(paramContext, paramContext.getString(R.l.dlX), "", paramContext.getString(R.l.cTM), paramContext.getString(R.l.cSk), new DialogInterface.OnClickListener()
                      {
                        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                        {
                          GMTrace.i(16873718546432L, 125719);
                          com.tencent.mm.sdk.f.e.post(new Runnable()
                          {
                            public final void run()
                            {
                              GMTrace.i(16873986981888L, 125721);
                              try
                              {
                                Object localObject1 = b.6.this.val$msg.substring(10);
                                String str1 = com.tencent.mm.compatible.util.e.ghx;
                                at.AR();
                                Object localObject2 = com.tencent.mm.y.c.zo();
                                String str2 = (String)localObject2 + (String)localObject1;
                                String str3 = str2.substring(str1.length());
                                com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "summercmd copy -n subDir:%s, root:%s, accPath:%s destPath:%s, subPath:%s", new Object[] { localObject1, str1, localObject2, str2, str3 });
                                int i = 0;
                                while (i < b.6.this.fSU)
                                {
                                  localObject1 = ((av.a)b.6.this.val$list.get(i)).vkG;
                                  if ((!bg.nm((String)localObject1)) && (!str1.contains((CharSequence)localObject1)))
                                  {
                                    localObject1 = new File((String)localObject1 + str3);
                                    if ((((File)localObject1).exists()) && (((File)localObject1).isDirectory()))
                                    {
                                      localObject2 = new File(str2);
                                      if (!((File)localObject2).exists()) {
                                        ((File)localObject2).mkdir();
                                      }
                                      boolean bool = com.tencent.mm.sdk.platformtools.j.r(((File)localObject1).getAbsolutePath(), ((File)localObject2).getAbsolutePath(), false);
                                      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "summercmd copy -n done new:%s, old:%s, ret:%b", new Object[] { ((File)localObject2).getAbsolutePath(), ((File)localObject1).getAbsolutePath(), Boolean.valueOf(bool) });
                                      if (bool)
                                      {
                                        new com.tencent.mm.sdk.platformtools.ae(Looper.getMainLooper()).post(new Runnable()
                                        {
                                          public final void run()
                                          {
                                            GMTrace.i(16874926505984L, 125728);
                                            com.tencent.mm.ui.base.h.bm(b.6.this.val$context, b.6.this.val$context.getString(R.l.dlW));
                                            GMTrace.o(16874926505984L, 125728);
                                          }
                                        });
                                        GMTrace.o(16873986981888L, 125721);
                                        return;
                                      }
                                    }
                                  }
                                  i += 1;
                                }
                                new com.tencent.mm.sdk.platformtools.ae(Looper.getMainLooper()).post(new Runnable()
                                {
                                  public final void run()
                                  {
                                    GMTrace.i(16874389635072L, 125724);
                                    com.tencent.mm.ui.base.h.bm(b.6.this.val$context, b.6.this.val$context.getString(R.l.dlV));
                                    GMTrace.o(16874389635072L, 125724);
                                  }
                                });
                                GMTrace.o(16873986981888L, 125721);
                                return;
                              }
                              catch (Exception localException)
                              {
                                com.tencent.mm.sdk.platformtools.w.w("MicroMsg.CommandProcessor", "summercmd copy -n e:%s", new Object[] { localException.getMessage() });
                                GMTrace.o(16873986981888L, 125721);
                              }
                            }
                          }, "copy -n");
                          GMTrace.o(16873718546432L, 125719);
                        }
                      }, null);
                    }
                    if (!paramString.startsWith("//deletepackage")) {
                      break label10374;
                    }
                    try
                    {
                      paramContext = paramString.replace("//deletepackage ", "");
                      paramString = new cc();
                      paramString.eDt.eDu = bg.getInt(paramContext, 0);
                      com.tencent.mm.sdk.b.a.vgX.m(paramString);
                      GMTrace.o(424262238208L, 3161);
                      return true;
                      if (!paramString.startsWith("//audiowritetofile")) {
                        break label10402;
                      }
                      com.tencent.mm.compatible.d.p.fQD.fNT = true;
                      GMTrace.o(424262238208L, 3161);
                      return true;
                      if (!paramString.startsWith("//bankcard")) {
                        break label10480;
                      }
                      paramString = new Intent();
                      paramString.putExtra("BaseScanUI_select_scan_mode", 7);
                      paramString.putExtra("bank_card_owner", "test");
                      if ((com.tencent.mm.modelvideo.y.aQ(paramContext)) || (com.tencent.mm.as.a.aP(paramContext))) {
                        break label10469;
                      }
                      com.tencent.mm.bj.d.b((Activity)paramContext, "scanner", ".ui.BaseScanUI", paramString);
                      GMTrace.o(424262238208L, 3161);
                      return true;
                      if (!paramString.startsWith("//banner")) {
                        break label10561;
                      }
                      localObject1 = bh.q("<sysmsg type=\"banner\"><mainframebanner type=\"11\"><showtype>1</showtype></mainframebanner></sysmsg>", "sysmsg");
                      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.CommandProcessor", "type:%s showType:%s data:%s", new Object[] { (String)((Map)localObject1).get(".sysmsg.mainframebanner.$type"), (String)((Map)localObject1).get(".sysmsg.mainframebanner.showtype"), (String)((Map)localObject1).get(".sysmsg.mainframebanner.data") });
                      if (!paramString.startsWith("//gamemsg")) {
                        break label10606;
                      }
                      paramContext = new lx();
                      paramContext.eQz.content = paramString;
                      com.tencent.mm.sdk.b.a.vgX.m(paramContext);
                      GMTrace.o(424262238208L, 3161);
                      return true;
                      if (!paramString.startsWith("//shortcut#")) {
                        break label10651;
                      }
                      paramContext = new tl();
                      paramContext.eYY.eYZ = paramString;
                      com.tencent.mm.sdk.b.a.vgX.m(paramContext);
                      GMTrace.o(424262238208L, 3161);
                      return true;
                      if (!paramString.startsWith("//gallerytype")) {
                        break label10692;
                      }
                      if (ag.wvb) {
                        break label10686;
                      }
                      for (bool1 = true;; bool1 = false)
                      {
                        ag.wvb = bool1;
                        GMTrace.o(424262238208L, 3161);
                        return true;
                      }
                      paramContext.getString(R.l.ejr);
                      if (!paramString.startsWith("//fullexit")) {
                        break label10750;
                      }
                      ad.RT("show_whatsnew");
                      com.tencent.mm.kernel.k.d(paramContext, true);
                      MMAppMgr.am(paramContext);
                      at.hold();
                      com.tencent.mm.kernel.h.xz().eP("");
                      MMAppMgr.Vn();
                      GMTrace.o(424262238208L, 3161);
                      return true;
                      if (!paramString.startsWith("//cleardldb")) {
                        break label10782;
                      }
                      at.AR();
                      com.tencent.mm.y.c.yQ().apP();
                      GMTrace.o(424262238208L, 3161);
                      return true;
                      if (!paramString.startsWith("//setcardlayouttestdata")) {
                        break label10827;
                      }
                      paramContext = paramString.replace("//setcardlayouttestdata ", "");
                      at.AR();
                      com.tencent.mm.y.c.xh().a(w.a.vqY, paramContext);
                      GMTrace.o(424262238208L, 3161);
                      return true;
                      if (!paramString.startsWith("//delchatroomsysmsg")) {
                        break label10967;
                      }
                      paramString = paramString.replace("//delchatroomsysmsg ", "");
                      i = paramString.indexOf(" ");
                      paramContext = paramString.substring(0, i);
                      paramString = paramString.substring(i);
                      if (!bg.nm(paramContext)) {
                        break label10886;
                      }
                      GMTrace.o(424262238208L, 3161);
                      return false;
                      if (!paramString.startsWith("<")) {
                        break label10956;
                      }
                      localObject1 = new au();
                      ((au)localObject1).E(System.currentTimeMillis());
                      ((au)localObject1).setType(10002);
                      ((au)localObject1).setContent(paramString);
                      ((au)localObject1).dC(0);
                      ((au)localObject1).db(paramContext);
                      com.tencent.mm.y.bc.i((au)localObject1);
                      GMTrace.o(424262238208L, 3161);
                      return true;
                      GMTrace.o(424262238208L, 3161);
                      return false;
                      if (!paramString.startsWith("//resetcrseq")) {
                        break label11310;
                      }
                      localObject1 = paramString.split(" ");
                      try
                      {
                        l1 = bg.getLong(localObject1[1], -1L);
                        l2 = bg.getLong(localObject1[2], -1L);
                        long l3 = bg.getLong(localObject1[3], -1L);
                        i = bg.getInt(localObject1[4], -1);
                        if (l1 > 0L)
                        {
                          localObject1 = l1 + "@chatroom";
                          at.AR();
                          localObject1 = com.tencent.mm.y.c.yP().TO((String)localObject1);
                          if (localObject1 != null)
                          {
                            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "summerbadcr resetcrseq [%s] before [%d, %d, %d] [%d, %d, %d]", new Object[] { ((com.tencent.mm.storage.ae)localObject1).getUsername(), Long.valueOf(((com.tencent.mm.storage.ae)localObject1).qW()), Long.valueOf(((com.tencent.mm.storage.ae)localObject1).qU()), Integer.valueOf(((com.tencent.mm.storage.ae)localObject1).qV()), Long.valueOf(l2), Long.valueOf(l3), Integer.valueOf(i) });
                            if (l2 > -1L) {
                              ((com.tencent.mm.storage.ae)localObject1).A(l2);
                            }
                            if (l3 > -1L) {
                              ((com.tencent.mm.storage.ae)localObject1).z(l3);
                            }
                            if (i >= 0) {
                              ((com.tencent.mm.storage.ae)localObject1).dH(i);
                            }
                            at.AR();
                            i = com.tencent.mm.y.c.yP().a((com.tencent.mm.storage.ae)localObject1, ((com.tencent.mm.storage.ae)localObject1).getUsername(), false);
                            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "summerbadcr resetcrseq [%s] done [%d, %d, %d] ret:%d", new Object[] { ((com.tencent.mm.storage.ae)localObject1).getUsername(), Long.valueOf(((com.tencent.mm.storage.ae)localObject1).qW()), Long.valueOf(((com.tencent.mm.storage.ae)localObject1).qU()), Integer.valueOf(((com.tencent.mm.storage.ae)localObject1).qV()), Integer.valueOf(i) });
                            GMTrace.o(424262238208L, 3161);
                            return true;
                          }
                        }
                      }
                      catch (Exception localException1)
                      {
                        com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.CommandProcessor", localException1, "summerbadcr resetcrseq", new Object[0]);
                      }
                      if (!paramString.startsWith("//printchatroominfo")) {
                        break label11418;
                      }
                      paramContext = En_5b8fbb1e.a.wCB;
                      if (com.tencent.mm.y.s.eb(paramContext)) {
                        break label11342;
                      }
                      GMTrace.o(424262238208L, 3161);
                      return false;
                      at.AR();
                      Object localObject2 = com.tencent.mm.y.c.yT().gC(paramContext);
                      if (localObject2 != null) {
                        break label11389;
                      }
                      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.CommandProcessor", "summercrinfo chatroomId[%s], member is null", new Object[] { paramContext });
                      GMTrace.o(424262238208L, 3161);
                      return false;
                      at.xB().A(new Runnable()
                      {
                        public final void run()
                        {
                          GMTrace.i(16875194941440L, 125730);
                          i = this.fSZ.bSo();
                          j = this.fSZ.field_chatroomdataflag;
                          int k = this.fSZ.bSr();
                          Object localObject1 = this.fSZ;
                          if (((com.tencent.mm.storage.q)localObject1).b(((com.tencent.mm.storage.q)localObject1).vpr)) {
                            ((com.tencent.mm.storage.q)localObject1).bSn();
                          }
                          int m = ((com.tencent.mm.storage.q)localObject1).vpr.status;
                          int n = this.fSZ.bSs();
                          localObject1 = this.fSZ;
                          if (((com.tencent.mm.storage.q)localObject1).b(((com.tencent.mm.storage.q)localObject1).vpr)) {
                            ((com.tencent.mm.storage.q)localObject1).bSn();
                          }
                          Object localObject3 = ((com.tencent.mm.storage.q)localObject1).vpr.fMx;
                          localObject1 = this.fSZ.FT();
                          at.AR();
                          Object localObject2 = com.tencent.mm.y.c.yM().cS(paramContext, " and flag != 0 and msgSeq != 0");
                          boolean bool;
                          if ((localObject2 != null) && (((ce)localObject2).field_msgId > 0L))
                          {
                            bool = true;
                            at.AR();
                            int i1 = com.tencent.mm.y.c.yM().Cp(paramContext);
                            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "summercrinfo chatroomId[%s], version[%d], flag[%d], type[%d], status[%d], get[%b], msgCount[%d], maxCount[%d], upgrader[%s], membersize[%d]", new Object[] { paramContext, Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Boolean.valueOf(bool), Integer.valueOf(i1), Integer.valueOf(n), localObject3, Integer.valueOf(((List)localObject1).size()) });
                            localObject2 = new StringBuilder();
                            ((StringBuilder)localObject2).append("---chatroominfo---\nid:").append(paramContext).append("\nver:").append(i).append("\nflag:").append(j).append("\ntype:").append(k).append("\nstatus:").append(m).append("\nget:").append(bool).append("\nmsgCount:").append(i1).append("\nmaxCount:").append(n).append("\nupgrader:").append((String)localObject3).append("\nmembersize:").append(((List)localObject1).size());
                            localObject3 = paramString.split(" ");
                            i = -1;
                          }
                          try
                          {
                            j = bg.getInt(localObject3[1], 0);
                            i = j;
                          }
                          catch (Exception localException)
                          {
                            for (;;)
                            {
                              continue;
                              i = j;
                            }
                          }
                          if (i != -1) {}
                          for (;;)
                          {
                            j = i;
                            if (i > ((List)localObject1).size()) {
                              j = ((List)localObject1).size();
                            }
                            if (j <= 10) {
                              break label576;
                            }
                            i = 10;
                            if (i > 0) {
                              ((StringBuilder)localObject2).append("\nmember:");
                            }
                            j = 0;
                            while (j < i)
                            {
                              ((StringBuilder)localObject2).append("\n").append((String)((List)localObject1).get(j));
                              j += 1;
                            }
                            bool = false;
                            break;
                            i = ((List)localObject1).size();
                          }
                          localObject1 = new au();
                          ((au)localObject1).db(paramContext);
                          ((au)localObject1).dC(2);
                          ((au)localObject1).setType(1);
                          ((au)localObject1).E(System.currentTimeMillis());
                          ((au)localObject1).setContent(((StringBuilder)localObject2).toString());
                          com.tencent.mm.y.bc.i((au)localObject1);
                          GMTrace.o(16875194941440L, 125730);
                        }
                      });
                      GMTrace.o(424262238208L, 3161);
                      return true;
                      if (!paramString.equals("//testupdate")) {
                        break label11518;
                      }
                      paramString = "";
                      try
                      {
                        paramContext = bg.convertStreamToString(paramContext.getAssets().open("aplha_update_info.xml"));
                        at.AR();
                        com.tencent.mm.y.c.xh().set(352273, paramContext);
                        at.AR();
                        com.tencent.mm.y.c.xh().set(352274, Long.valueOf(System.currentTimeMillis()));
                        new com.tencent.mm.pluginsdk.model.app.a(paramContext).bJr();
                        GMTrace.o(424262238208L, 3161);
                        return true;
                      }
                      catch (IOException paramContext)
                      {
                        for (;;)
                        {
                          com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.CommandProcessor", paramContext, "", new Object[0]);
                          paramContext = paramString;
                        }
                      }
                      if ((!paramString.equals("//checkUpdate0")) && (!paramString.equals("//checkUpdate1"))) {
                        break label11568;
                      }
                      p.x.bIV().gY(paramString.equals("//checkUpdate1"));
                      p.x.tmi = true;
                      GMTrace.o(424262238208L, 3161);
                      return true;
                      if (!paramString.equals("//debugsnstimelinestat")) {
                        break label11638;
                      }
                      if (com.tencent.mm.platformtools.r.hkJ) {
                        break label11632;
                      }
                      for (bool1 = true;; bool1 = false)
                      {
                        com.tencent.mm.platformtools.r.hkJ = bool1;
                        Toast.makeText(ab.getContext(), "debugSnsTimelineStat: " + com.tencent.mm.platformtools.r.hkJ, 0).show();
                        GMTrace.o(424262238208L, 3161);
                        return true;
                      }
                      if ((!paramString.startsWith("//abtestmsg")) || (!com.tencent.mm.sdk.a.b.bPq())) {
                        break label11700;
                      }
                      paramContext = com.tencent.mm.y.c.a.hj(paramString.replace("//abtestmsg", ""));
                      com.tencent.mm.y.c.c.Ct().j(paramContext.gpU, 0);
                      com.tencent.mm.y.c.c.Cu().j(paramContext.gpV, 1);
                      GMTrace.o(424262238208L, 3161);
                      return true;
                      if (!paramString.startsWith("//triggergetabtest")) {
                        break label11738;
                      }
                      at.AR();
                      com.tencent.mm.y.c.xh().a(w.a.vrG, Long.valueOf(1L));
                      GMTrace.o(424262238208L, 3161);
                      return true;
                      if (!paramString.startsWith("//vad")) {
                        break label12003;
                      }
                      localObject2 = ab.bPV();
                      if (localObject2 != null) {
                        break label11769;
                      }
                      GMTrace.o(424262238208L, 3161);
                      return false;
                      if (!paramString.startsWith("//vad get")) {
                        break label11803;
                      }
                      com.tencent.mm.ui.base.h.A(paramContext, com.tencent.mm.bd.a.c.Oj(), "VAD PARAMS").show();
                      GMTrace.o(424262238208L, 3161);
                      return true;
                      paramContext = ((SharedPreferences)localObject2).edit();
                      if (!paramString.startsWith("//vad sd")) {
                        break label11846;
                      }
                      paramContext.putInt("s_delay_time", Integer.valueOf(paramString.substring(9).trim()).intValue());
                      if (!paramString.startsWith("//vad st")) {
                        break label11881;
                      }
                      paramContext.putInt("sil_time", Integer.valueOf(paramString.substring(9).trim()).intValue());
                      if (!paramString.startsWith("//vad snr")) {
                        break label11916;
                      }
                      paramContext.putFloat("s_n_ration", Float.valueOf(paramString.substring(10).trim()).floatValue());
                      if (!paramString.startsWith("//vad sw")) {
                        break label11951;
                      }
                      paramContext.putInt("s_window", Integer.valueOf(paramString.substring(9).trim()).intValue());
                      if (!paramString.startsWith("//vad sl")) {
                        break label11986;
                      }
                      paramContext.putInt("s_length", Integer.valueOf(paramString.substring(9).trim()).intValue());
                      paramContext.apply();
                      GMTrace.o(424262238208L, 3161);
                      return true;
                      if (!paramString.startsWith("//dumpabtestrecords")) {
                        break label12174;
                      }
                      if (2 >= com.tencent.mm.sdk.platformtools.w.getLogLevel()) {
                        break label12031;
                      }
                      GMTrace.o(424262238208L, 3161);
                      return false;
                      if (!paramString.contains("info")) {
                        break label12164;
                      }
                      for (paramString = com.tencent.mm.y.c.c.Cu().bSf();; paramString = com.tencent.mm.y.c.c.Ct().bSf())
                      {
                        localObject2 = new TextView(paramContext);
                        ((TextView)localObject2).setText(paramString);
                        ((TextView)localObject2).setGravity(8388627);
                        ((TextView)localObject2).setTextSize(1, 10.0F);
                        ((TextView)localObject2).setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        ((TextView)localObject2).setTextColor(-16744704);
                        ((TextView)localObject2).setTypeface(Typeface.MONOSPACE);
                        ((TextView)localObject2).setMovementMethod(new ScrollingMovementMethod());
                        i = paramContext.getResources().getDimensionPixelSize(R.f.aQq);
                        ((TextView)localObject2).setPadding(i, i, i, i);
                        com.tencent.mm.ui.base.h.a(paramContext, null, (View)localObject2, null);
                        GMTrace.o(424262238208L, 3161);
                        return true;
                      }
                      if (!paramString.startsWith("//triggerWebViewCookiesCleanup")) {
                        break label12212;
                      }
                      at.AR();
                      com.tencent.mm.y.c.xh().a(w.a.vsN, Long.valueOf(0L));
                      GMTrace.o(424262238208L, 3161);
                      return true;
                      if (!paramString.startsWith("//cleanwebcache")) {
                        break label12249;
                      }
                      paramContext = new bl();
                      com.tencent.mm.sdk.b.a.vgX.m(paramContext);
                      GMTrace.o(424262238208L, 3161);
                      return true;
                      if (!paramString.startsWith("//triggerWebViewCacheCleanup")) {
                        break label12312;
                      }
                      paramString = new Intent();
                      paramString.setComponent(new ComponentName(e.g.vGK, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
                      paramString.putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_CLEAR_WEBVIEW_CACHE");
                      paramContext.sendBroadcast(paramString);
                      GMTrace.o(424262238208L, 3161);
                      return true;
                      if (!paramString.startsWith("//dumpsnsabtest")) {
                        break label12349;
                      }
                      paramContext = new ch();
                      com.tencent.mm.sdk.b.a.vgX.m(paramContext);
                      GMTrace.o(424262238208L, 3161);
                      return true;
                      if (!paramString.startsWith("//dumpsilkvoicefile")) {
                        break label12374;
                      }
                      com.tencent.mm.platformtools.r.hkN = true;
                      GMTrace.o(424262238208L, 3161);
                      return true;
                      if (!paramString.startsWith("//fucktit")) {
                        break label12412;
                      }
                      at.AR();
                      com.tencent.mm.y.c.xh().a(w.a.vsA, Boolean.valueOf(true));
                      GMTrace.o(424262238208L, 3161);
                      return true;
                      if (!paramString.startsWith("//clog ")) {
                        break label12466;
                      }
                      paramContext = paramString.substring(7);
                      com.tencent.mm.plugin.report.service.g.ork.du(paramContext, "test cLog " + System.currentTimeMillis());
                      GMTrace.o(424262238208L, 3161);
                      return true;
                      if ((!paramString.startsWith("//testformsg")) || (!com.tencent.mm.sdk.a.b.bPq())) {
                        break label12570;
                      }
                      paramContext = paramString.substring(12).trim();
                      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "MMCore.getSysCmdMsgExtension() " + at.getSysCmdMsgExtension());
                      paramString = new bu();
                      paramString.tPY = com.tencent.mm.platformtools.n.ni(paramContext);
                      paramString.lQc = 10002;
                      paramContext = new d.a(paramString, false, false, false);
                      at.getSysCmdMsgExtension().b(paramContext);
                      GMTrace.o(424262238208L, 3161);
                      return true;
                      if (!paramString.startsWith("//canwebviewcachedownload")) {
                        break label12637;
                      }
                      if (bg.getInt(bg.nl(paramString.substring(25)).trim(), 1) <= 0) {
                        break label12631;
                      }
                      for (bool1 = true;; bool1 = false)
                      {
                        at.AR();
                        com.tencent.mm.y.c.xh().a(w.a.vtk, Boolean.valueOf(bool1));
                        GMTrace.o(424262238208L, 3161);
                        return true;
                      }
                      if (!paramString.startsWith("//canwebviewcacheprepushdownload")) {
                        break label12704;
                      }
                      if (bg.getInt(bg.nl(paramString.substring(32)).trim(), 1) <= 0) {
                        break label12698;
                      }
                      for (bool1 = true;; bool1 = false)
                      {
                        at.AR();
                        com.tencent.mm.y.c.xh().a(w.a.vtl, Boolean.valueOf(bool1));
                        GMTrace.o(424262238208L, 3161);
                        return true;
                      }
                      if (!paramString.startsWith("//resetsnslukcy")) {
                        break label12792;
                      }
                      at.AR();
                      com.tencent.mm.y.c.xh().a(w.a.vtz, Boolean.valueOf(false));
                      at.AR();
                      com.tencent.mm.y.c.xh().a(w.a.vtA, Integer.valueOf(0));
                      at.AR();
                      com.tencent.mm.y.c.xh().a(w.a.vtB, Integer.valueOf(0));
                      paramContext = new py();
                      com.tencent.mm.sdk.b.a.vgX.m(paramContext);
                      GMTrace.o(424262238208L, 3161);
                      return true;
                      if (!paramString.startsWith("//mmimgdec ")) {
                        break label12873;
                      }
                      paramString = paramString.substring(11);
                      if (!"on".equalsIgnoreCase(paramString)) {
                        break label12845;
                      }
                      MMBitmapFactory.setUseMMBitmapFactory(true);
                      Toast.makeText(paramContext, "内置图片(png)解析库开启", 0).show();
                      for (;;)
                      {
                        GMTrace.o(424262238208L, 3161);
                        return true;
                        if ("off".equalsIgnoreCase(paramString))
                        {
                          MMBitmapFactory.setUseMMBitmapFactory(false);
                          Toast.makeText(paramContext, "内置图片(png)解析库关闭", 0).show();
                        }
                      }
                      if (!paramString.startsWith("//enablempsp")) {
                        break label12909;
                      }
                      al.a.kF(false);
                      Toast.makeText(paramContext, "设置成功，请重启微信！", 0).show();
                      GMTrace.o(424262238208L, 3161);
                      return true;
                      if (!paramString.startsWith("//disablempsp")) {
                        break label12945;
                      }
                      al.a.kF(true);
                      Toast.makeText(paramContext, "设置成功，请重启微信！", 0).show();
                      GMTrace.o(424262238208L, 3161);
                      return true;
                      if (!paramString.startsWith("//soterpay")) {
                        break label12976;
                      }
                      com.tencent.mm.bj.d.x(paramContext, "fingerprint", ".ui.SoterPayTestUI");
                      GMTrace.o(424262238208L, 3161);
                      return true;
                      if (!paramString.startsWith(paramContext.getString(R.l.eio))) {
                        break label13050;
                      }
                      if (com.tencent.mm.platformtools.r.hkW) {
                        break label13044;
                      }
                      for (bool1 = true;; bool1 = false)
                      {
                        com.tencent.mm.platformtools.r.hkW = bool1;
                        Toast.makeText(ab.getContext(), String.format("showVoipDebugLog:%b", new Object[] { Boolean.valueOf(com.tencent.mm.platformtools.r.hkW) }), 0).show();
                        GMTrace.o(424262238208L, 3161);
                        return true;
                      }
                      if (!paramString.startsWith("//getdltaskinfo")) {
                        break label13219;
                      }
                      paramContext = paramString.replace("//getdltaskinfo ", "");
                      for (;;)
                      {
                        try
                        {
                          paramString = com.tencent.mm.plugin.downloader.model.e.bm(bg.getLong(paramContext, 0L));
                          if (paramString == null) {
                            continue;
                          }
                          com.tencent.mm.sdk.platformtools.w.i("getdltaskinfo", "%d, %s, %s, %s", new Object[] { Long.valueOf(paramString.field_downloadId), paramString.field_downloadUrl, paramString.field_filePath, paramString.field_md5 });
                        }
                        catch (Exception paramString)
                        {
                          paramContext = com.tencent.mm.plugin.downloader.model.e.vu(paramContext);
                          if (paramContext == null) {
                            continue;
                          }
                          com.tencent.mm.sdk.platformtools.w.i("getdltaskinfo", "%d, %s, %s, %s", new Object[] { Long.valueOf(paramContext.field_downloadId), paramContext.field_downloadUrl, paramContext.field_filePath, paramContext.field_md5 });
                          continue;
                          com.tencent.mm.sdk.platformtools.w.i("getdltaskinfo", "infoURL null");
                          continue;
                        }
                        GMTrace.o(424262238208L, 3161);
                        return true;
                        com.tencent.mm.sdk.platformtools.w.i("getdltaskinfo", "infoID null");
                      }
                      if (!paramString.startsWith("//testscan ")) {
                        break label13283;
                      }
                      if (com.tencent.mm.platformtools.r.hkS) {
                        break label13277;
                      }
                      for (bool1 = true;; bool1 = false)
                      {
                        com.tencent.mm.platformtools.r.hkS = bool1;
                        com.tencent.mm.platformtools.r.hkU = bg.getInt(paramString.replace("//testscan", "").trim(), 0);
                        com.tencent.mm.platformtools.r.hkV = 0;
                        GMTrace.o(424262238208L, 3161);
                        return true;
                      }
                      if (!paramString.startsWith("//switchrecordmode")) {
                        break label13390;
                      }
                      paramContext = ab.bPV();
                      bool2 = paramContext.getBoolean("settings_voicerecorder_mode", false);
                      if (bool2) {
                        break label13368;
                      }
                      bool1 = true;
                      paramContext.edit().putBoolean("settings_voicerecorder_mode", bool1).commit();
                      if (!bool2) {
                        break label13374;
                      }
                      Toast.makeText(ab.getContext(), "Turn off silk record", 1).show();
                      for (;;)
                      {
                        GMTrace.o(424262238208L, 3161);
                        return true;
                        bool1 = false;
                        break;
                        Toast.makeText(ab.getContext(), "Turn on silk record", 1).show();
                      }
                      if (!paramString.startsWith("//indoorsensorconfig ")) {
                        break label13427;
                      }
                      com.tencent.mm.modelstat.e.Mk().lE(paramString.replace("//indoorsensorconfig ", ""));
                      GMTrace.o(424262238208L, 3161);
                      return true;
                      if (!paramString.startsWith("//testindoorsensor ")) {
                        break label13499;
                      }
                      paramContext = paramString.replace("//testindoorsensor ", "").split(",");
                      com.tencent.mm.modelstat.e.Mk().a(12345, false, paramContext[0].equals("1"), bg.getFloat(paramContext[1], 0.0F), bg.getFloat(paramContext[2], 0.0F), 12);
                      GMTrace.o(424262238208L, 3161);
                      return true;
                      if (!paramString.startsWith("//facedebug")) {
                        break label13520;
                      }
                      GMTrace.o(424262238208L, 3161);
                      return true;
                      if (!paramString.startsWith("//rstfacett")) {
                        break label13541;
                      }
                      GMTrace.o(424262238208L, 3161);
                      return true;
                      if (!paramString.startsWith("//switchjsc")) {
                        break label13678;
                      }
                      paramContext = paramString.replace("//switchjsc ", "");
                      paramString = ab.getContext().getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4);
                      if (!"clear".equals(paramContext)) {
                        break label13612;
                      }
                      paramString.edit().remove("switch_x5_jscore").apply();
                      for (;;)
                      {
                        GMTrace.o(424262238208L, 3161);
                        return true;
                        if ("true".equals(paramContext)) {
                          paramString.edit().putBoolean("switch_x5_jscore", true).apply();
                        } else if ("false".equals(paramContext)) {
                          paramString.edit().putBoolean("switch_x5_jscore", false).apply();
                        }
                      }
                      if (!paramString.startsWith("//rfcdn")) {
                        break label13731;
                      }
                      try
                      {
                        com.tencent.mm.modelcdntran.g.Gl().keep_OnRequestDoGetCdnDnsInfo(888);
                        GMTrace.o(424262238208L, 3161);
                        return true;
                      }
                      catch (Exception paramContext)
                      {
                        for (;;)
                        {
                          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.CommandProcessor", "rfcdn :%s", new Object[] { bg.f(paramContext) });
                        }
                      }
                      if (!paramString.startsWith("//testcrscroll ")) {
                        break label13805;
                      }
                      localObject2 = paramString.split(" ");
                      if ((localObject2 == null) || (localObject2.length <= 1)) {
                        break label13805;
                      }
                      o.wJh = bg.getInt(localObject2[1], 0);
                      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "summerbadcr testscroll new BADCR_SCROLL_DELAY[%d]", new Object[] { Integer.valueOf(o.wJh) });
                      GMTrace.o(424262238208L, 3161);
                      return true;
                      if (!paramString.startsWith("//switchx5jscore")) {
                        break label13879;
                      }
                      paramContext = ab.bPV();
                      bool1 = paramContext.getBoolean("switch_x5_jscore", true);
                      paramContext = paramContext.edit();
                      if (bool1) {
                        break label13873;
                      }
                      for (bool1 = true;; bool1 = false)
                      {
                        paramContext.putBoolean("switch_x5_jscore", bool1).apply();
                        GMTrace.o(424262238208L, 3161);
                        return true;
                      }
                      if (!paramString.startsWith("//removeaudioplayer")) {
                        break label13950;
                      }
                      paramContext = paramString.split(" ");
                      if (paramContext.length < 2) {
                        break label13939;
                      }
                      i = bg.getInt(paramContext[1], 3);
                      if ((i < 2) || (i > 9)) {
                        break label13939;
                      }
                      at.AR();
                      com.tencent.mm.y.c.xh().a(w.a.vxi, Integer.valueOf(i));
                      GMTrace.o(424262238208L, 3161);
                      return true;
                      if (!paramString.startsWith("//switchmusicplayer")) {
                        break label14352;
                      }
                      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "msg:%s", new Object[] { paramString });
                      paramContext = paramString.split(" ");
                      if (paramContext.length <= 2) {
                        break label14075;
                      }
                      if (bg.getInt(paramContext[1], 0) != 0) {
                        break label14086;
                      }
                      i = 0;
                      int k = bg.getInt(paramContext[2], -1);
                      at.AR();
                      j = ((Integer)com.tencent.mm.y.c.xh().get(w.a.vxg, Integer.valueOf(0))).intValue();
                      if (k != -1) {
                        break label14099;
                      }
                      if (i == 0) {
                        break label14091;
                      }
                      i = 255;
                      j = 1;
                      for (;;)
                      {
                        if (j != 0)
                        {
                          at.AR();
                          com.tencent.mm.y.c.xh().a(w.a.vxg, Integer.valueOf(i));
                        }
                        GMTrace.o(424262238208L, 3161);
                        return true;
                        i = 1;
                        break;
                        i = 0;
                        j = 1;
                        continue;
                        if (k == 0)
                        {
                          if (i != 0)
                          {
                            i = j | 0x1;
                            j = 1;
                          }
                          else
                          {
                            i = j & 0xFFFFFFFE;
                            j = 1;
                          }
                        }
                        else if (k == 1)
                        {
                          if (i != 0)
                          {
                            i = j | 0x2;
                            j = 1;
                          }
                          else
                          {
                            i = j & 0xFFFFFFFD;
                            j = 1;
                          }
                        }
                        else if (k == 4)
                        {
                          if (i != 0)
                          {
                            i = j | 0x4;
                            j = 1;
                          }
                          else
                          {
                            i = j & 0xFFFFFFFB;
                            j = 1;
                          }
                        }
                        else if (k == 6)
                        {
                          if (i != 0)
                          {
                            i = j | 0x10;
                            j = 1;
                          }
                          else
                          {
                            i = j & 0xFFFFFFEF;
                            j = 1;
                          }
                        }
                        else if (k == 7)
                        {
                          if (i != 0)
                          {
                            i = j | 0x20;
                            j = 1;
                          }
                          else
                          {
                            i = j & 0xFFFFFFDF;
                            j = 1;
                          }
                        }
                        else if (k == 8)
                        {
                          if (i != 0)
                          {
                            i = j | 0x40;
                            j = 1;
                          }
                          else
                          {
                            i = j & 0xFFFFFFBF;
                            j = 1;
                          }
                        }
                        else if (k == 9)
                        {
                          if (i != 0)
                          {
                            i = j | 0x80;
                            j = 1;
                          }
                          else
                          {
                            i = j & 0xFF7F;
                            j = 1;
                          }
                        }
                        else
                        {
                          k = 0;
                          i = j;
                          j = k;
                        }
                      }
                      if (!paramString.startsWith("//testdefaultrsa")) {
                        break label14456;
                      }
                      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "summercert testdefaultrsa");
                      paramString = paramString.split(" ");
                      if ((paramString == null) || (paramString.length <= 1)) {
                        break label14450;
                      }
                      for (bool1 = true;; bool1 = false)
                      {
                        ac.G("", "", 0);
                        new u("", "", "", 0).Lt().a(com.tencent.mm.kernel.h.xx().wS().wW(), new com.tencent.mm.ad.e()
                        {
                          public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.k paramAnonymousk)
                          {
                            GMTrace.i(16876000247808L, 125736);
                            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "summercert testdefaultrsa NetSceneManualAuth onSceneEnd [%d, %d, %s]", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
                            if ((paramAnonymousInt1 == 4) && (paramAnonymousInt2 != -102) && (!this.fTb))
                            {
                              af.t(new Runnable()
                              {
                                public final void run()
                                {
                                  GMTrace.i(16873450110976L, 125717);
                                  b.w(b.8.this.val$context, "RSA(req) fatal err, must recheck!!!");
                                  GMTrace.o(16873450110976L, 125717);
                                }
                              });
                              GMTrace.o(16876000247808L, 125736);
                              return;
                            }
                            new com.tencent.mm.modelsimple.m().a(com.tencent.mm.kernel.h.xx().fYr.gus, new com.tencent.mm.ad.e()
                            {
                              public final void a(int paramAnonymous2Int1, int paramAnonymous2Int2, String paramAnonymous2String, com.tencent.mm.ad.k paramAnonymous2k)
                              {
                                GMTrace.i(16875731812352L, 125734);
                                com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "summercert testdefaultrsa  NetSceneGetCert onSceneEnd [%d, %d, %s]", new Object[] { Integer.valueOf(paramAnonymous2Int1), Integer.valueOf(paramAnonymous2Int2), paramAnonymous2String });
                                if ((paramAnonymous2Int1 == 4) && (paramAnonymous2Int2 == -102))
                                {
                                  af.t(new Runnable()
                                  {
                                    public final void run()
                                    {
                                      GMTrace.i(16874658070528L, 125726);
                                      b.w(b.8.this.val$context, "RSA(base) fatal err, must recheck!!!");
                                      GMTrace.o(16874658070528L, 125726);
                                    }
                                  });
                                  GMTrace.o(16875731812352L, 125734);
                                  return;
                                }
                                Toast.makeText(b.8.this.val$context, "DefaultRSA check pass", 0).show();
                                b.w(b.8.this.val$context, "");
                                GMTrace.o(16875731812352L, 125734);
                              }
                            });
                            GMTrace.o(16876000247808L, 125736);
                          }
                        });
                        GMTrace.o(424262238208L, 3161);
                        return true;
                      }
                      if (!paramString.startsWith("//dumpdefaultrsa")) {
                        break label14486;
                      }
                      bool1 = w(paramContext, "");
                      GMTrace.o(424262238208L, 3161);
                      return bool1;
                      if (!paramString.startsWith("//hardwareinfo")) {
                        break label14522;
                      }
                      ((com.tencent.mm.plugin.hardwareopt.a.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.hardwareopt.a.a.a.class)).fe(true);
                      GMTrace.o(424262238208L, 3161);
                      return true;
                      if (!paramString.startsWith("//showStringName")) {
                        break label14597;
                      }
                      paramContext = ab.bPV();
                      bool1 = paramContext.getBoolean("ShowStringName", false);
                      paramContext = paramContext.edit();
                      if (bool1) {
                        break label14591;
                      }
                      for (bool1 = true;; bool1 = false)
                      {
                        paramContext.putBoolean("ShowStringName", bool1).commit();
                        GMTrace.o(424262238208L, 3161);
                        return true;
                      }
                      if (!paramString.startsWith("//mmphotoedit")) {
                        break label14635;
                      }
                      com.tencent.mm.bj.d.b(paramContext, "mmsight", ".ui.TestVideoEditUI", new Intent());
                      GMTrace.o(424262238208L, 3161);
                      return true;
                      if (!paramString.startsWith("//msgDelay")) {
                        break label14660;
                      }
                      com.tencent.mm.ui.conversation.a.m.fA(paramContext);
                      GMTrace.o(424262238208L, 3161);
                      return true;
                      if (!paramString.startsWith("//cpDelayedMsg")) {
                        break label14685;
                      }
                      com.tencent.mm.ui.conversation.a.m.fB(paramContext);
                      GMTrace.o(424262238208L, 3161);
                      return true;
                      if (!paramString.startsWith("//testhce")) {
                        break label14716;
                      }
                      com.tencent.mm.bj.d.x(paramContext, "nfc", ".ui.HceTestUI");
                      GMTrace.o(424262238208L, 3161);
                      return true;
                      i = ee(paramString);
                      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.CommandProcessor", "processed : in ret:[%d]", new Object[] { Integer.valueOf(i) });
                      switch (i)
                      {
                      default: 
                        GMTrace.o(424262238208L, 3161);
                        return false;
                      case 0: 
                        GMTrace.o(424262238208L, 3161);
                        return false;
                      case 568: 
                        Assert.assertTrue("test errlog", false);
                        GMTrace.o(424262238208L, 3161);
                        return true;
                      case 569: 
                        at.AR().zp();
                        GMTrace.o(424262238208L, 3161);
                        return true;
                      case 570: 
                        if (com.tencent.mm.storage.ba.UA(ef(paramString))) {
                          Toast.makeText(paramContext, R.l.ehI, 0).show();
                        }
                        GMTrace.o(424262238208L, 3161);
                        return true;
                      case 571: 
                        paramContext = ef(paramString);
                        at.AR();
                        com.tencent.mm.y.c.xh().set(8195, paramContext);
                        GMTrace.o(424262238208L, 3161);
                        return true;
                      case 572: 
                        com.tencent.mm.sdk.platformtools.f.eqX = Integer.valueOf(ef(paramString)).intValue();
                        GMTrace.o(424262238208L, 3161);
                        return true;
                      case 574: 
                        paramString = new StringBuilder().append(com.tencent.mm.compatible.d.p.sZ());
                        at.AR();
                        com.tencent.mm.ui.base.h.A(paramContext, com.tencent.mm.a.g.n(com.tencent.mm.y.c.ww().getBytes()), "md5");
                        GMTrace.o(424262238208L, 3161);
                        return true;
                      case 579: 
                        paramContext = ef(paramString);
                        ak.a.AB().K(paramContext, "");
                        GMTrace.o(424262238208L, 3161);
                        return true;
                      case 580: 
                        at.wS().d(new bf(new bf.a()
                        {
                          public final void a(com.tencent.mm.network.e paramAnonymouse)
                          {
                            GMTrace.i(16875463376896L, 125732);
                            if (paramAnonymouse == null)
                            {
                              GMTrace.o(16875463376896L, 125732);
                              return;
                            }
                            paramAnonymouse = paramAnonymouse.DY();
                            at.AR();
                            int i = com.tencent.mm.y.c.ww();
                            paramAnonymouse.i(new byte[0], i);
                            GMTrace.o(16875463376896L, 125732);
                          }
                        }));
                        GMTrace.o(424262238208L, 3161);
                        return true;
                      case 581: 
                        paramContext = ef(paramString);
                        an.aWx().Ov(paramContext);
                        GMTrace.o(424262238208L, 3161);
                        return true;
                      case 582: 
                        paramContext = ef(paramString);
                        at.AR();
                        paramContext = com.tencent.mm.y.c.yK().TE(paramContext);
                        if ((paramContext == null) || (paramContext.vi() == 0))
                        {
                          GMTrace.o(424262238208L, 3161);
                          return false;
                        }
                        paramContext.uA();
                        com.tencent.mm.y.s.t(paramContext);
                        GMTrace.o(424262238208L, 3161);
                        return true;
                      case 583: 
                        at.AR();
                        com.tencent.mm.y.c.zq();
                        GMTrace.o(424262238208L, 3161);
                        return true;
                      case 584: 
                      case 585: 
                        be.gW(ef(paramString));
                        GMTrace.o(424262238208L, 3161);
                        return true;
                      case 586: 
                        paramContext = paramString.split(" ");
                        if ((paramContext != null) && (paramContext.length == 3)) {
                          com.tencent.mm.modelmulti.t.aQ(bg.getInt(paramContext[1], 0), bg.getInt(paramContext[2], 0));
                        }
                        GMTrace.o(424262238208L, 3161);
                        return true;
                      case 587: 
                        paramContext = new ci();
                        com.tencent.mm.sdk.b.a.vgX.m(paramContext);
                        GMTrace.o(424262238208L, 3161);
                        return true;
                      case 588: 
                        com.tencent.mm.a.e.bd("/sdcard/tencent/MicroMsg/back");
                        at.AR();
                        com.tencent.mm.sdk.platformtools.j.r(com.tencent.mm.y.c.zn(), "/sdcard/tencent/MicroMsg/back", false);
                        GMTrace.o(424262238208L, 3161);
                        return true;
                      case 590: 
                        GMTrace.o(424262238208L, 3161);
                        return true;
                      }
                      try
                      {
                        paramContext = paramString.split(" ");
                        if ((paramContext != null) && (paramContext.length > 1))
                        {
                          paramContext = bh.q(paramContext[0], "sysmsg");
                          at.AR().zt().l(paramContext);
                        }
                      }
                      catch (Exception paramContext)
                      {
                        for (;;)
                        {
                          com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.CommandProcessor", paramContext, "hy: error occured in commandProcessor", new Object[0]);
                        }
                      }
                      GMTrace.o(424262238208L, 3161);
                      return true;
                    }
                    catch (Exception paramContext)
                    {
                      for (;;) {}
                    }
                  }
                  catch (Exception paramContext)
                  {
                    for (;;) {}
                  }
                }
                catch (Exception paramContext)
                {
                  for (;;) {}
                }
              }
              catch (Exception paramContext)
              {
                for (;;) {}
              }
            }
            catch (Exception paramContext)
            {
              for (;;) {}
            }
          }
          catch (Exception paramContext)
          {
            for (;;) {}
          }
        }
        catch (Exception paramContext)
        {
          for (;;) {}
        }
      }
      catch (Exception paramContext)
      {
        for (;;) {}
      }
      Toast.makeText(ab.getContext(), "Using SVG Code : " + bool1 + " " + com.tencent.mm.svg.b.b.bVx(), 1).show();
      GMTrace.o(424262238208L, 3161);
      return true;
    }
  }
  
  public static boolean w(Context paramContext, String paramString)
  {
    GMTrace.i(14453772910592L, 107689);
    StringBuffer localStringBuffer = new StringBuffer();
    if (!bg.nm(paramString)) {
      localStringBuffer.append(paramString + "\n\n");
    }
    localStringBuffer.append("Default RSA Info:\n");
    localStringBuffer.append("ClientVersion: " + com.tencent.mm.sdk.platformtools.e.CLIENT_VERSION + "\n");
    localStringBuffer.append("BASE_RSA_PUBLIC_VERSION = 165\n");
    localStringBuffer.append("BASE_RSA_PUBLIC_KEYN = C2EA58BA28EC5441D75A7BCAC454294012FD826EFC8A80637B472B796E21BAF82874971341C88364947AA1DDF686838906E5E625CEA6868135E304EF2D1CE750E7AF7F738FA61B67168E3A3A467B65BD270FE0FC2B06D0517620434552D006233E3ED20050B519AA9A4DCDC2A9CFDB043A41990F89E4A1631DF9BF9C3828B13CFB55E740A761BA1226FDF1F5A6EE4AD92F2266536CE9148D82919AEB1F38A9EAB171C4A36A258721A3D8090AA935202364A206D3802CAC808C2B88D4918981722A1A26382832F817C81BAF2FE8B461921E48B91B18F9F192B753AD557C95FC6086BE6E1C6BE18DA48BEEE52511BBC29176204DE653A75DB2BAD75CF9306590AD len(512" + ")\n");
    localStringBuffer.append("BASE_RSA_PUBLIC_KEYE = 010001\n\n");
    localStringBuffer.append("REQ_RSA_PUBLIC_VERSION = 166\n");
    localStringBuffer.append("REQ_RSA_PUBLIC_KEYN = DCCDFF9CCE13416F44F11E773DBAFAE2A5A580E29CFA1B7AB62A8C61DC31C37F1F1DFCFA0CBE44AF83E862A3B6864AB4595BDA4B5C26CAD223BECB43A1E15162D9C9A2F53C0E3E08F0F5366D0572F58AAA8C842BB697203B2895475E8C4A0EA0FC2615790F229D13F289F0A90E5EC9EF2AD7F9DD6EE6721E21851BA0975C549CA3D1179BD22F30F685492C3DD5CFFF97A7458C6EA89FEB58888CCAD3E1820FC75C47445692804C61EB9531A8053229E1B1B600724913857757A5E5E187604DA5617AC1215364D273913E32F1237819B2B8A0195595412F44A3C19C345953CDCA146A60C4F817AAA6E87377B6E9405D29F7F21AB70A73A41875DC2BD076ACA7D5 len(512" + ")\n");
    localStringBuffer.append("REQ_RSA_PUBLIC_KEYE = 010001\n");
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CommandProcessor", "summercert dumpdefaultrsa " + localStringBuffer.toString());
    if (!com.tencent.mm.sdk.a.b.bPq())
    {
      GMTrace.o(14453772910592L, 107689);
      return false;
    }
    paramString = new TextView(paramContext);
    paramString.setText(localStringBuffer.toString());
    paramString.setGravity(19);
    paramString.setTextSize(1, 10.0F);
    paramString.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    paramString.setTextColor(-16711936);
    paramString.setTypeface(Typeface.MONOSPACE);
    int i = paramContext.getResources().getDimensionPixelSize(R.f.aQQ);
    paramString.setPadding(i, i, i, i);
    paramString.setMovementMethod(ScrollingMovementMethod.getInstance());
    com.tencent.mm.ui.base.h.a(paramContext, null, paramString, null);
    if (ac.bOs()) {
      Toast.makeText(paramContext, "dump file:" + com.tencent.mm.compatible.util.e.ghz + "DefaultRSA.java", 1).show();
    }
    GMTrace.o(14453772910592L, 107689);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\console\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */