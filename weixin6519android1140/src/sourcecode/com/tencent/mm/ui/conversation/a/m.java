package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.kernel.e;
import com.tencent.mm.pluginsdk.ui.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.lang.ref.WeakReference;

public final class m
  extends b
  implements View.OnClickListener
{
  private static int chp()
  {
    GMTrace.i(19156225228800L, 142725);
    if (Build.VERSION.SDK_INT < 23)
    {
      GMTrace.o(19156225228800L, 142725);
      return 1;
    }
    PowerManager localPowerManager = (PowerManager)ab.getContext().getSystemService("power");
    for (;;)
    {
      try
      {
        boolean bool = localPowerManager.isIgnoringBatteryOptimizations(ab.getContext().getPackageName());
        w.i("MicroMsg.MsgDelayTipsBanner", "[oneliang]app is ignore:" + bool);
        w.i("MicroMsg.MsgDelayTipsBanner", "[oneliang]is device idle mode:" + localPowerManager.isDeviceIdleMode());
        if (bool) {
          continue;
        }
        i = 2;
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.MsgDelayTipsBanner", "[oneliang]ignoring battery optimizations check failure.use another way.");
        int i = 3;
        continue;
      }
      GMTrace.o(19156225228800L, 142725);
      return i;
      i = 3;
    }
  }
  
  public static void fA(Context paramContext)
  {
    GMTrace.i(19156359446528L, 142726);
    if (paramContext == null)
    {
      GMTrace.o(19156359446528L, 142726);
      return;
    }
    switch (chp())
    {
    }
    for (;;)
    {
      GMTrace.o(19156359446528L, 142726);
      return;
      Object localObject = Build.BRAND;
      int i;
      if (localObject != null) {
        if (((String)localObject).toLowerCase().startsWith("samsung")) {
          i = R.l.dJm;
        }
      }
      while (i > 0)
      {
        com.tencent.mm.ui.base.h.a(paramContext, paramContext.getString(i), "", new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(19157298970624L, 142733);
            w.i("MicroMsg.MsgDelayTipsBanner", "[oneliang]yes");
            if (paramAnonymousDialogInterface != null) {
              paramAnonymousDialogInterface.dismiss();
            }
            GMTrace.o(19157298970624L, 142733);
          }
        });
        GMTrace.o(19156359446528L, 142726);
        return;
        if (((String)localObject).toLowerCase().equalsIgnoreCase("huawei"))
        {
          if ((Build.VERSION.SDK_INT == 21) || (Build.VERSION.SDK_INT == 22) || (Build.VERSION.SDK_INT == 23))
          {
            i = R.l.dJj;
            continue;
          }
          if (Build.VERSION.SDK_INT == 24) {
            i = R.l.dJk;
          }
        }
        else
        {
          i = R.l.dJl;
          continue;
        }
        i = R.l.dJl;
      }
      w.e("MicroMsg.MsgDelayTipsBanner", "[oneliang]impossible......");
      GMTrace.o(19156359446528L, 142726);
      return;
      w.i("MicroMsg.MsgDelayTipsBanner", "[oneliang]need to add ignore");
      localObject = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS").setData(Uri.parse("package:" + ab.getContext().getPackageName()));
      ((Intent)localObject).setFlags(268435456);
      paramContext.startActivity((Intent)localObject);
    }
  }
  
  /* Error */
  public static void fB(Context paramContext)
  {
    // Byte code:
    //   0: ldc2_w 182
    //   3: ldc -72
    //   5: invokestatic 23	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: getstatic 187	com/tencent/mm/R$l:cUG	I
    //   12: invokevirtual 122	android/content/Context:getString	(I)Ljava/lang/String;
    //   15: pop
    //   16: aload_0
    //   17: aload_0
    //   18: getstatic 190	com/tencent/mm/R$l:cUV	I
    //   21: invokevirtual 122	android/content/Context:getString	(I)Ljava/lang/String;
    //   24: iconst_1
    //   25: new 10	com/tencent/mm/ui/conversation/a/m$2
    //   28: dup
    //   29: invokespecial 191	com/tencent/mm/ui/conversation/a/m$2:<init>	()V
    //   32: invokestatic 194	com/tencent/mm/ui/base/h:a	(Landroid/content/Context;Ljava/lang/String;ZLandroid/content/DialogInterface$OnCancelListener;)Lcom/tencent/mm/ui/base/r;
    //   35: astore 4
    //   37: invokestatic 200	com/tencent/mm/ai/a:GG	()Ljava/util/List;
    //   40: astore 5
    //   42: new 60	java/lang/StringBuilder
    //   45: dup
    //   46: invokespecial 201	java/lang/StringBuilder:<init>	()V
    //   49: astore_3
    //   50: aload 5
    //   52: ifnull +57 -> 109
    //   55: aload 5
    //   57: invokeinterface 207 1 0
    //   62: astore 5
    //   64: aload 5
    //   66: invokeinterface 212 1 0
    //   71: ifeq +38 -> 109
    //   74: aload 5
    //   76: invokeinterface 216 1 0
    //   81: checkcast 218	com/tencent/mm/ai/a$a
    //   84: astore 6
    //   86: aload_3
    //   87: aload 6
    //   89: invokevirtual 219	com/tencent/mm/ai/a$a:toString	()Ljava/lang/String;
    //   92: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   95: pop
    //   96: ldc 58
    //   98: aload 6
    //   100: invokevirtual 219	com/tencent/mm/ai/a$a:toString	()Ljava/lang/String;
    //   103: invokestatic 78	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   106: goto -42 -> 64
    //   109: aload 4
    //   111: ifnull +8 -> 119
    //   114: aload 4
    //   116: invokevirtual 224	android/app/Dialog:dismiss	()V
    //   119: new 60	java/lang/StringBuilder
    //   122: dup
    //   123: invokespecial 201	java/lang/StringBuilder:<init>	()V
    //   126: astore 4
    //   128: invokestatic 230	com/tencent/mm/y/at:AR	()Lcom/tencent/mm/y/c;
    //   131: pop
    //   132: aload 4
    //   134: invokestatic 235	com/tencent/mm/y/c:yD	()Ljava/lang/String;
    //   137: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   140: ldc -19
    //   142: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   145: invokevirtual 73	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   148: astore 4
    //   150: iconst_1
    //   151: anewarray 105	java/lang/String
    //   154: dup
    //   155: iconst_0
    //   156: aload 4
    //   158: aastore
    //   159: invokestatic 243	com/tencent/mm/a/e:c	([Ljava/lang/String;)V
    //   162: new 245	java/io/File
    //   165: dup
    //   166: aload 4
    //   168: ldc -9
    //   170: invokespecial 249	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   173: astore 6
    //   175: aload_3
    //   176: invokevirtual 73	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   179: astore 5
    //   181: aload 6
    //   183: invokevirtual 252	java/io/File:exists	()Z
    //   186: ifne +9 -> 195
    //   189: aload 6
    //   191: invokevirtual 255	java/io/File:createNewFile	()Z
    //   194: pop
    //   195: new 257	java/io/FileOutputStream
    //   198: dup
    //   199: aload 6
    //   201: iconst_0
    //   202: invokespecial 260	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   205: astore 4
    //   207: aload 4
    //   209: astore_3
    //   210: aload 4
    //   212: new 60	java/lang/StringBuilder
    //   215: dup
    //   216: invokespecial 201	java/lang/StringBuilder:<init>	()V
    //   219: aload 5
    //   221: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   224: ldc_w 262
    //   227: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   230: invokevirtual 73	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   233: ldc_w 264
    //   236: invokevirtual 268	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   239: invokevirtual 274	java/io/OutputStream:write	([B)V
    //   242: aload 4
    //   244: astore_3
    //   245: aload 4
    //   247: invokevirtual 277	java/io/OutputStream:flush	()V
    //   250: aload 4
    //   252: invokevirtual 280	java/io/OutputStream:close	()V
    //   255: aload_0
    //   256: aload 6
    //   258: invokevirtual 283	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   261: iconst_1
    //   262: invokestatic 289	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   265: invokevirtual 292	android/widget/Toast:show	()V
    //   268: aload 6
    //   270: invokevirtual 283	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   273: astore_0
    //   274: new 294	com/tencent/mm/storage/au
    //   277: dup
    //   278: invokespecial 295	com/tencent/mm/storage/au:<init>	()V
    //   281: astore_3
    //   282: aload_3
    //   283: ldc_w 297
    //   286: invokevirtual 300	com/tencent/mm/storage/au:db	(Ljava/lang/String;)V
    //   289: aload_3
    //   290: aload_0
    //   291: invokevirtual 303	com/tencent/mm/storage/au:setContent	(Ljava/lang/String;)V
    //   294: aload_3
    //   295: iconst_1
    //   296: invokevirtual 307	com/tencent/mm/storage/au:setType	(I)V
    //   299: aload_3
    //   300: iconst_0
    //   301: invokevirtual 310	com/tencent/mm/storage/au:dC	(I)V
    //   304: aload_3
    //   305: getfield 315	com/tencent/mm/g/b/ce:field_isSend	I
    //   308: iconst_1
    //   309: if_icmpne +228 -> 537
    //   312: aload_3
    //   313: iconst_4
    //   314: invokevirtual 318	com/tencent/mm/storage/au:dB	(I)V
    //   317: invokestatic 324	java/lang/System:currentTimeMillis	()J
    //   320: lstore_1
    //   321: aload_3
    //   322: lload_1
    //   323: invokevirtual 328	com/tencent/mm/storage/au:D	(J)V
    //   326: aload_3
    //   327: lload_1
    //   328: invokevirtual 331	com/tencent/mm/storage/au:E	(J)V
    //   331: ldc_w 333
    //   334: invokestatic 339	com/tencent/mm/kernel/h:h	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   337: checkcast 333	com/tencent/mm/plugin/messenger/foundation/a/h
    //   340: invokeinterface 343 1 0
    //   345: aload_3
    //   346: invokeinterface 349 2 0
    //   351: pop2
    //   352: ldc2_w 182
    //   355: ldc -72
    //   357: invokestatic 32	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   360: return
    //   361: astore_3
    //   362: ldc 58
    //   364: new 60	java/lang/StringBuilder
    //   367: dup
    //   368: ldc_w 351
    //   371: invokespecial 66	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   374: aload_3
    //   375: invokevirtual 354	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   378: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   381: invokevirtual 73	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   384: invokestatic 78	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   387: goto -192 -> 195
    //   390: astore_3
    //   391: ldc 58
    //   393: new 60	java/lang/StringBuilder
    //   396: dup
    //   397: ldc_w 356
    //   400: invokespecial 66	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   403: aload_3
    //   404: invokevirtual 354	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   407: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   410: invokevirtual 73	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   413: invokestatic 78	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   416: goto -161 -> 255
    //   419: astore 5
    //   421: aconst_null
    //   422: astore 4
    //   424: aload 4
    //   426: astore_3
    //   427: ldc 58
    //   429: new 60	java/lang/StringBuilder
    //   432: dup
    //   433: ldc_w 358
    //   436: invokespecial 66	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   439: aload 5
    //   441: invokevirtual 354	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   444: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   447: invokevirtual 73	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   450: invokestatic 78	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   453: aload 4
    //   455: ifnull -200 -> 255
    //   458: aload 4
    //   460: invokevirtual 280	java/io/OutputStream:close	()V
    //   463: goto -208 -> 255
    //   466: astore_3
    //   467: ldc 58
    //   469: new 60	java/lang/StringBuilder
    //   472: dup
    //   473: ldc_w 356
    //   476: invokespecial 66	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   479: aload_3
    //   480: invokevirtual 354	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   483: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   486: invokevirtual 73	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   489: invokestatic 78	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   492: goto -237 -> 255
    //   495: astore_0
    //   496: aconst_null
    //   497: astore_3
    //   498: aload_3
    //   499: ifnull +7 -> 506
    //   502: aload_3
    //   503: invokevirtual 280	java/io/OutputStream:close	()V
    //   506: aload_0
    //   507: athrow
    //   508: astore_3
    //   509: ldc 58
    //   511: new 60	java/lang/StringBuilder
    //   514: dup
    //   515: ldc_w 356
    //   518: invokespecial 66	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   521: aload_3
    //   522: invokevirtual 354	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   525: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   528: invokevirtual 73	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   531: invokestatic 78	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   534: goto -28 -> 506
    //   537: aload_3
    //   538: iconst_3
    //   539: invokevirtual 318	com/tencent/mm/storage/au:dB	(I)V
    //   542: goto -225 -> 317
    //   545: astore_0
    //   546: goto -48 -> 498
    //   549: astore 5
    //   551: goto -127 -> 424
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	554	0	paramContext	Context
    //   320	8	1	l	long
    //   49	297	3	localObject1	Object
    //   361	14	3	localException1	Exception
    //   390	14	3	localException2	Exception
    //   426	1	3	localObject2	Object
    //   466	14	3	localException3	Exception
    //   497	6	3	localObject3	Object
    //   508	30	3	localException4	Exception
    //   35	424	4	localObject4	Object
    //   40	180	5	localObject5	Object
    //   419	21	5	localException5	Exception
    //   549	1	5	localException6	Exception
    //   84	185	6	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   189	195	361	java/lang/Exception
    //   250	255	390	java/lang/Exception
    //   195	207	419	java/lang/Exception
    //   458	463	466	java/lang/Exception
    //   195	207	495	finally
    //   502	506	508	java/lang/Exception
    //   210	242	545	finally
    //   245	250	545	finally
    //   427	453	545	finally
    //   210	242	549	java/lang/Exception
    //   245	250	549	java/lang/Exception
  }
  
  public final boolean abd()
  {
    GMTrace.i(19156627881984L, 142728);
    w.i("MicroMsg.MsgDelayTipsBanner", "refresh banner.");
    com.tencent.mm.kernel.h.xz();
    boolean bool = com.tencent.mm.kernel.h.xy().xh().getBoolean(w.a.vzJ, false);
    w.i("MicroMsg.MsgDelayTipsBanner", "[oneliang]need to show banner:%s", new Object[] { Boolean.valueOf(bool) });
    if (bool) {
      if (this.view != null) {
        this.view.setVisibility(0);
      }
    }
    for (;;)
    {
      bool = super.abd();
      GMTrace.o(19156627881984L, 142728);
      return bool;
      if (this.view != null) {
        this.view.setVisibility(8);
      }
    }
  }
  
  public final void destroy()
  {
    GMTrace.i(19156762099712L, 142729);
    GMTrace.o(19156762099712L, 142729);
  }
  
  public final int getLayoutId()
  {
    GMTrace.i(19155956793344L, 142723);
    int i = R.i.cBf;
    GMTrace.o(19155956793344L, 142723);
    return i;
  }
  
  public final void onClick(View paramView)
  {
    GMTrace.i(19156091011072L, 142724);
    fA((Context)this.tyb.get());
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xy().xh().a(w.a.vzJ, Boolean.valueOf(false));
    if (this.view != null) {
      this.view.setVisibility(8);
    }
    GMTrace.o(19156091011072L, 142724);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\conversation\a\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */