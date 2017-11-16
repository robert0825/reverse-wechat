package com.tencent.mm.bj;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.app.Fragment;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.pluginsdk.d.c;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.y.aq;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public final class d
{
  private static final Map<String, String> tIR;
  private static HashMap<String, c> tIS;
  private static final HashSet<String> tIT;
  
  static
  {
    GMTrace.i(1407407095808L, 10486);
    HashMap localHashMap = new HashMap();
    tIR = localHashMap;
    localHashMap.put("location", "talkroom");
    tIR.put("talkroom", "voip");
    tIS = new HashMap();
    tIT = new HashSet() {};
    GMTrace.o(1407407095808L, 10486);
  }
  
  /* Error */
  public static boolean LL(String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc2_w 76
    //   6: sipush 10480
    //   9: invokestatic 45	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   12: getstatic 66	com/tencent/mm/bj/d:tIS	Ljava/util/HashMap;
    //   15: aload_0
    //   16: invokevirtual 81	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   19: ifnull +19 -> 38
    //   22: iconst_1
    //   23: istore_1
    //   24: ldc2_w 76
    //   27: sipush 10480
    //   30: invokestatic 72	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   33: ldc 2
    //   35: monitorexit
    //   36: iload_1
    //   37: ireturn
    //   38: iconst_0
    //   39: istore_1
    //   40: ldc2_w 76
    //   43: sipush 10480
    //   46: invokestatic 72	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   49: goto -16 -> 33
    //   52: astore_0
    //   53: ldc 2
    //   55: monitorexit
    //   56: aload_0
    //   57: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	58	0	paramString	String
    //   23	17	1	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   3	22	52	finally
    //   24	33	52	finally
    //   40	49	52	finally
  }
  
  public static com.tencent.mm.pluginsdk.d.a N(Context paramContext, String paramString)
  {
    GMTrace.i(1406199136256L, 10477);
    paramContext = y(paramContext, paramString, null);
    GMTrace.o(1406199136256L, 10477);
    return paramContext;
  }
  
  /* Error */
  private static c PV(String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc2_w 98
    //   6: sipush 10481
    //   9: invokestatic 45	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   12: aload_0
    //   13: invokestatic 102	com/tencent/mm/bj/d:PW	(Ljava/lang/String;)Lcom/tencent/mm/pluginsdk/d/c;
    //   16: astore_1
    //   17: aload_1
    //   18: astore_0
    //   19: ldc2_w 98
    //   22: sipush 10481
    //   25: invokestatic 72	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   28: ldc 2
    //   30: monitorexit
    //   31: aload_0
    //   32: areturn
    //   33: astore_1
    //   34: ldc 104
    //   36: ldc 106
    //   38: iconst_2
    //   39: anewarray 4	java/lang/Object
    //   42: dup
    //   43: iconst_0
    //   44: aload_0
    //   45: aastore
    //   46: dup
    //   47: iconst_1
    //   48: aload_1
    //   49: invokevirtual 110	java/lang/ClassNotFoundException:toString	()Ljava/lang/String;
    //   52: aastore
    //   53: invokestatic 116	com/tencent/mm/sdk/platformtools/w:f	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   56: aconst_null
    //   57: astore_0
    //   58: ldc2_w 98
    //   61: sipush 10481
    //   64: invokestatic 72	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   67: goto -39 -> 28
    //   70: astore_0
    //   71: ldc 2
    //   73: monitorexit
    //   74: aload_0
    //   75: athrow
    //   76: astore_1
    //   77: ldc 104
    //   79: ldc 118
    //   81: iconst_2
    //   82: anewarray 4	java/lang/Object
    //   85: dup
    //   86: iconst_0
    //   87: aload_0
    //   88: aastore
    //   89: dup
    //   90: iconst_1
    //   91: aload_1
    //   92: invokevirtual 119	java/lang/InstantiationException:toString	()Ljava/lang/String;
    //   95: aastore
    //   96: invokestatic 116	com/tencent/mm/sdk/platformtools/w:f	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   99: goto -43 -> 56
    //   102: astore_1
    //   103: ldc 104
    //   105: ldc 121
    //   107: iconst_2
    //   108: anewarray 4	java/lang/Object
    //   111: dup
    //   112: iconst_0
    //   113: aload_0
    //   114: aastore
    //   115: dup
    //   116: iconst_1
    //   117: aload_1
    //   118: invokevirtual 122	java/lang/IllegalAccessException:toString	()Ljava/lang/String;
    //   121: aastore
    //   122: invokestatic 116	com/tencent/mm/sdk/platformtools/w:f	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   125: goto -69 -> 56
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	128	0	paramString	String
    //   16	2	1	localc	c
    //   33	16	1	localClassNotFoundException	ClassNotFoundException
    //   76	16	1	localInstantiationException	InstantiationException
    //   102	16	1	localIllegalAccessException	IllegalAccessException
    // Exception table:
    //   from	to	target	type
    //   12	17	33	java/lang/ClassNotFoundException
    //   3	12	70	finally
    //   12	17	70	finally
    //   19	28	70	finally
    //   34	56	70	finally
    //   58	67	70	finally
    //   77	99	70	finally
    //   103	125	70	finally
    //   12	17	76	java/lang/InstantiationException
    //   12	17	102	java/lang/IllegalAccessException
  }
  
  private static c PW(String paramString)
  {
    GMTrace.i(1407004442624L, 10483);
    c localc = (c)tIS.get(paramString);
    if (localc != null)
    {
      GMTrace.o(1407004442624L, 10483);
      return localc;
    }
    localc = (c)ab.getContext().getClassLoader().loadClass(ab.bPT() + ".plugin." + paramString + ".Plugin").newInstance();
    tIS.put(paramString, localc);
    GMTrace.o(1407004442624L, 10483);
    return localc;
  }
  
  /* Error */
  public static boolean PX(String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc2_w 168
    //   6: sipush 10485
    //   9: invokestatic 45	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   12: aload_0
    //   13: invokestatic 171	com/tencent/mm/bj/d:PV	(Ljava/lang/String;)Lcom/tencent/mm/pluginsdk/d/c;
    //   16: ifnull +19 -> 35
    //   19: iconst_1
    //   20: istore_1
    //   21: ldc2_w 168
    //   24: sipush 10485
    //   27: invokestatic 72	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   30: ldc 2
    //   32: monitorexit
    //   33: iload_1
    //   34: ireturn
    //   35: iconst_0
    //   36: istore_1
    //   37: ldc2_w 168
    //   40: sipush 10485
    //   43: invokestatic 72	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   46: goto -16 -> 30
    //   49: astore_0
    //   50: ldc 2
    //   52: monitorexit
    //   53: aload_0
    //   54: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	55	0	paramString	String
    //   20	17	1	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   3	19	49	finally
    //   21	30	49	finally
    //   37	46	49	finally
  }
  
  public static c a(String paramString, a parama, b paramb)
  {
    for (;;)
    {
      try
      {
        GMTrace.i(1406870224896L, 10482);
        localObject = (String)tIR.get(paramString);
        if (localObject != null) {
          w.d("MicroMsg.PluginHelper", "load plugin with mapping %s -> %s", new Object[] { paramString, localObject });
        }
        localObject = (c)tIS.get(paramString);
        if (localObject == null) {
          continue;
        }
        parama.onDone();
        GMTrace.o(1406870224896L, 10482);
        paramString = (String)localObject;
      }
      finally
      {
        try
        {
          Object localObject = PW(paramString);
          if (localObject != null) {
            parama.onDone();
          }
          GMTrace.o(1406870224896L, 10482);
          paramString = (String)localObject;
        }
        catch (Exception localException) {}
        paramString = finally;
      }
      return paramString;
      try
      {
        c localc = PW(paramString);
        if (localc != null) {
          parama.onDone();
        }
        GMTrace.o(1406870224896L, 10482);
        paramString = localc;
      }
      catch (ClassNotFoundException parama)
      {
        w.f("MicroMsg.PluginHelper", "plugin load failed ClassNotFoundException , plugin=%s ,e:%s", new Object[] { paramString, parama.toString() });
        w.f("MicroMsg.PluginHelper", "plugin load failed, plugin=%s", new Object[] { paramString });
        paramb.b(new IllegalArgumentException("Load Plugin Faild"));
        paramString = null;
        GMTrace.o(1406870224896L, 10482);
      }
      catch (InstantiationException parama)
      {
        for (;;)
        {
          w.f("MicroMsg.PluginHelper", "plugin load failed InstantiationException , plugin=%s, e:%s", new Object[] { paramString, parama.toString() });
        }
      }
      catch (IllegalAccessException parama)
      {
        for (;;)
        {
          w.f("MicroMsg.PluginHelper", "plugin load failed IllegalAccessException , plugin=%s, e:%s", new Object[] { paramString, parama.toString() });
        }
      }
    }
  }
  
  public static void a(Context paramContext, String paramString, Intent paramIntent)
  {
    GMTrace.i(1404722741248L, 10466);
    Intent localIntent = paramIntent;
    if (paramIntent == null) {
      localIntent = new Intent();
    }
    String str = ab.bPT();
    paramIntent = paramString;
    if (paramString.startsWith(".")) {
      paramIntent = str + paramString;
    }
    localIntent.setClassName(ab.getPackageName(), paramIntent);
    if ((paramContext instanceof Activity))
    {
      paramContext.startActivity(localIntent);
      GMTrace.o(1404722741248L, 10466);
      return;
    }
    localIntent.addFlags(268435456);
    paramContext.startActivity(localIntent);
    GMTrace.o(1404722741248L, 10466);
  }
  
  public static void a(Context paramContext, String paramString, Intent paramIntent, int paramInt)
  {
    GMTrace.i(1405528047616L, 10472);
    String str = ab.bPT();
    if (paramString.startsWith(".")) {}
    for (str = str + paramString;; str = paramString)
    {
      paramIntent.setClassName(ab.getPackageName(), str);
      if (!(paramContext instanceof Activity)) {
        break;
      }
      ((Activity)paramContext).startActivityForResult(paramIntent, paramInt);
      b(paramContext, paramString, paramIntent);
      GMTrace.o(1405528047616L, 10472);
      return;
    }
    w.f("MicroMsg.PluginHelper", "context not activity, skipped");
    GMTrace.o(1405528047616L, 10472);
  }
  
  public static void a(final Context paramContext, final String paramString1, final String paramString2, Intent paramIntent)
  {
    GMTrace.i(1404051652608L, 10461);
    a(paramString1, new a()new b
    {
      public final void onDone()
      {
        GMTrace.i(1403648999424L, 10458);
        Intent localIntent;
        if (this.val$intent == null)
        {
          localIntent = new Intent();
          str = ab.bPT() + ".plugin." + paramString1;
          if (!paramString2.startsWith(".")) {
            break label122;
          }
        }
        label122:
        for (String str = str + paramString2;; str = paramString2)
        {
          localIntent.setClassName(ab.getPackageName(), str);
          MMWizardActivity.A(paramContext, localIntent);
          GMTrace.o(1403648999424L, 10458);
          return;
          localIntent = this.val$intent;
          break;
        }
      }
    }, new b()
    {
      public final void b(Exception paramAnonymousException)
      {
        GMTrace.i(1408078184448L, 10491);
        w.e("MicroMsg.PluginHelper", "start wizard activity failed, plugin(%s) not loaded", new Object[] { this.tIU });
        w.e("MicroMsg.PluginHelper", "start wizard activity with exception:%s", new Object[] { paramAnonymousException });
        GMTrace.o(1408078184448L, 10491);
      }
    });
    GMTrace.o(1404051652608L, 10461);
  }
  
  public static void a(final Context paramContext, final String paramString1, final String paramString2, Intent paramIntent, final int paramInt, boolean paramBoolean)
  {
    GMTrace.i(1405125394432L, 10469);
    w.d("MicroMsg.PluginHelper", "start activity for result, need try load plugin[%B]", new Object[] { Boolean.valueOf(paramBoolean) });
    a(paramString1, new a()new b
    {
      public final void onDone()
      {
        GMTrace.i(1409554579456L, 10502);
        Intent localIntent;
        if (this.val$intent == null)
        {
          localIntent = new Intent();
          str = ab.bPT() + ".plugin." + paramString1;
          if (!paramString2.startsWith(".")) {
            break label151;
          }
        }
        label151:
        for (String str = str + paramString2;; str = paramString2)
        {
          localIntent.setClassName(ab.getPackageName(), str);
          if (!(paramContext instanceof Activity)) {
            break label159;
          }
          ((Activity)paramContext).startActivityForResult(localIntent, paramInt);
          d.b(paramContext, paramString2, localIntent);
          GMTrace.o(1409554579456L, 10502);
          return;
          localIntent = this.val$intent;
          break;
        }
        label159:
        w.f("MicroMsg.PluginHelper", "context not activity, skipped");
        GMTrace.o(1409554579456L, 10502);
      }
    }, new b()
    {
      public final void b(Exception paramAnonymousException)
      {
        GMTrace.i(1409286144000L, 10500);
        w.f("MicroMsg.PluginHelper", "start activity failed, plugin(%s) not loaded", new Object[] { this.tIU });
        w.e("MicroMsg.PluginHelper", "start activity failed,%s", new Object[] { paramAnonymousException });
        GMTrace.o(1409286144000L, 10500);
      }
    });
    GMTrace.o(1405125394432L, 10469);
  }
  
  public static void a(final Context paramContext, final String paramString1, final String paramString2, Intent paramIntent1, final Intent paramIntent2)
  {
    GMTrace.i(1404185870336L, 10462);
    a(paramString1, new a()new b
    {
      public final void onDone()
      {
        GMTrace.i(1403917434880L, 10460);
        Intent localIntent;
        if (this.val$intent == null)
        {
          localIntent = new Intent();
          str = ab.bPT() + ".plugin." + paramString1;
          if (!paramString2.startsWith(".")) {
            break label126;
          }
        }
        label126:
        for (String str = str + paramString2;; str = paramString2)
        {
          localIntent.setClassName(ab.getPackageName(), str);
          MMWizardActivity.b(paramContext, localIntent, paramIntent2);
          GMTrace.o(1403917434880L, 10460);
          return;
          localIntent = this.val$intent;
          break;
        }
      }
    }, new b()
    {
      public final void b(Exception paramAnonymousException)
      {
        GMTrace.i(1408883490816L, 10497);
        w.e("MicroMsg.PluginHelper", "start wizard activity failed, plugin(%s) not loaded", new Object[] { this.tIU });
        w.e("MicroMsg.PluginHelper", "start wizard activity with exception:%s", new Object[] { paramAnonymousException });
        GMTrace.o(1408883490816L, 10497);
      }
    });
    GMTrace.o(1404185870336L, 10462);
  }
  
  public static void a(final Context paramContext, String paramString1, final String paramString2, final Intent paramIntent, boolean paramBoolean)
  {
    GMTrace.i(1404588523520L, 10465);
    w.d("MicroMsg.PluginHelper", "start activity, need try load plugin[%B]", new Object[] { Boolean.valueOf(paramBoolean) });
    paramContext = new a()
    {
      public final void onDone()
      {
        GMTrace.i(1408346619904L, 10493);
        w.d("MicroMsg.PluginHelper", "[DEBUG] onDone Load %s", new Object[] { this.tIU });
        try
        {
          Intent localIntent;
          if (paramIntent == null)
          {
            localIntent = new Intent();
            str = ab.bPT() + ".plugin." + this.tIU;
            if (!paramString2.startsWith(".")) {
              break label163;
            }
          }
          label163:
          for (String str = str + paramString2;; str = paramString2)
          {
            localIntent.setClassName(ab.getPackageName(), str);
            Class.forName(str, false, paramContext.getClassLoader());
            if (!(paramContext instanceof Activity)) {
              break label171;
            }
            paramContext.startActivity(localIntent);
            GMTrace.o(1408346619904L, 10493);
            return;
            localIntent = paramIntent;
            break;
          }
          label171:
          localIntent.addFlags(268435456);
          paramContext.startActivity(localIntent);
          GMTrace.o(1408346619904L, 10493);
          return;
        }
        catch (ClassNotFoundException localClassNotFoundException)
        {
          w.e("MicroMsg.PluginHelper", "Class Not Found when startActivity %s", new Object[] { localClassNotFoundException });
          GMTrace.o(1408346619904L, 10493);
        }
      }
    };
    paramString2 = new b()
    {
      public final void b(Exception paramAnonymousException)
      {
        GMTrace.i(1408615055360L, 10495);
        w.f("MicroMsg.PluginHelper", "start activity failed, plugin(%s) not loaded", new Object[] { this.tIU });
        w.e("MicroMsg.PluginHelper", "start activity failed,%s", new Object[] { paramAnonymousException });
        GMTrace.o(1408615055360L, 10495);
      }
    };
    if (paramBoolean)
    {
      a(paramString1, paramContext, paramString2);
      GMTrace.o(1404588523520L, 10465);
      return;
    }
    paramContext.onDone();
    GMTrace.o(1404588523520L, 10465);
  }
  
  public static void a(Fragment paramFragment, String paramString, Intent paramIntent, int paramInt)
  {
    GMTrace.i(1405796483072L, 10474);
    String str = ab.bPT();
    if (paramString.startsWith(".")) {}
    for (str = str + paramString;; str = paramString)
    {
      paramIntent.setClassName(ab.getPackageName(), str);
      if (!(paramFragment instanceof Fragment)) {
        break;
      }
      paramFragment.startActivityForResult(paramIntent, paramInt);
      b(paramFragment.aG(), paramString, paramIntent);
      GMTrace.o(1405796483072L, 10474);
      return;
    }
    w.f("MicroMsg.PluginHelper", "fragment not Fragment, skipped");
    GMTrace.o(1405796483072L, 10474);
  }
  
  public static void a(final Fragment paramFragment, final String paramString1, final String paramString2, Intent paramIntent, final int paramInt)
  {
    GMTrace.i(1405259612160L, 10470);
    w.d("MicroMsg.PluginHelper", "start activity for result, need try load plugin[%B]", new Object[] { Boolean.valueOf(true) });
    a(paramString1, new a()new b
    {
      public final void onDone()
      {
        GMTrace.i(1409957232640L, 10505);
        Intent localIntent;
        if (this.val$intent == null)
        {
          localIntent = new Intent();
          str = ab.bPT() + ".plugin." + paramString1;
          if (!paramString2.startsWith(".")) {
            break label144;
          }
        }
        label144:
        for (String str = str + paramString2;; str = paramString2)
        {
          localIntent.setClassName(ab.getPackageName(), str);
          paramFragment.startActivityForResult(localIntent, paramInt);
          d.b(paramFragment.aG(), paramString2, this.val$intent);
          GMTrace.o(1409957232640L, 10505);
          return;
          localIntent = this.val$intent;
          break;
        }
      }
    }, new b()
    {
      public final void b(Exception paramAnonymousException)
      {
        GMTrace.i(1407675531264L, 10488);
        w.f("MicroMsg.PluginHelper", "start activity failed, plugin(%s) not loaded", new Object[] { this.tIU });
        w.e("MicroMsg.PluginHelper", "start activity failed,%s", new Object[] { paramAnonymousException });
        GMTrace.o(1407675531264L, 10488);
      }
    });
    GMTrace.o(1405259612160L, 10470);
  }
  
  public static void a(MMActivity paramMMActivity, String paramString, Intent paramIntent, int paramInt, MMActivity.a parama)
  {
    GMTrace.i(1405662265344L, 10473);
    String str = ab.bPT();
    if (paramString.startsWith(".")) {}
    for (str = str + paramString;; str = paramString)
    {
      paramIntent.setClassName(ab.getPackageName(), str);
      paramMMActivity.a(parama, paramIntent, paramInt);
      b(paramMMActivity, paramString, paramIntent);
      GMTrace.o(1405662265344L, 10473);
      return;
    }
  }
  
  public static void a(String paramString, m paramm, l paraml)
  {
    GMTrace.i(1406064918528L, 10476);
    w.d("MicroMsg.PluginHelper", "--> registerApplication: %s", new Object[] { paramString });
    Object localObject = PV(paramString);
    if (localObject == null)
    {
      w.f("MicroMsg.PluginHelper", "register application failed, plugin=%s", new Object[] { paramString });
      GMTrace.o(1406064918528L, 10476);
      return;
    }
    localObject = ((c)localObject).createApplication();
    if (localObject == null)
    {
      w.w("MicroMsg.PluginHelper", "register application failed, plugin=%s", new Object[] { paramString });
      GMTrace.o(1406064918528L, 10476);
      return;
    }
    ((o)localObject).a(paraml);
    ((o)localObject).a(paramm);
    w.d("MicroMsg.PluginHelper", "<-- registerApplication successfully: %s %s %s", new Object[] { paramString, paramm, paraml });
    GMTrace.o(1406064918528L, 10476);
  }
  
  public static void b(Context paramContext, String paramString, Intent paramIntent)
  {
    GMTrace.i(1405393829888L, 10471);
    if ((paramIntent != null) && (tIT.contains(paramString)))
    {
      paramIntent.putExtra("animation_pop_in", true);
      com.tencent.mm.ui.base.b.B(paramContext, paramIntent);
    }
    GMTrace.o(1405393829888L, 10471);
  }
  
  public static void b(Context paramContext, String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(1404856958976L, 10467);
    a(paramContext, paramString1, paramString2, null, paramInt, true);
    GMTrace.o(1404856958976L, 10467);
  }
  
  public static void b(Context paramContext, String paramString1, String paramString2, Intent paramIntent)
  {
    GMTrace.i(1404454305792L, 10464);
    if (!f.eu(21)) {}
    try
    {
      if ((paramContext.getSharedPreferences(ab.bPU(), 0).getBoolean("settings_multi_webview", false)) && (".ui.tools.WebViewUI".endsWith(paramString2)))
      {
        w.i("MicroMsg.PluginHelper", "start multi webview!!!!!!!!!");
        paramIntent.addFlags(134217728);
        paramIntent.addFlags(524288);
      }
      a(paramContext, paramString1, paramString2, paramIntent, true);
      GMTrace.o(1404454305792L, 10464);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.PluginHelper", "%s", new Object[] { localException.getMessage() });
      }
    }
  }
  
  public static void b(Context paramContext, String paramString1, String paramString2, Intent paramIntent, int paramInt)
  {
    GMTrace.i(1404991176704L, 10468);
    a(paramContext, paramString1, paramString2, paramIntent, paramInt, true);
    GMTrace.o(1404991176704L, 10468);
  }
  
  public static boolean bNA()
  {
    GMTrace.i(1406467571712L, 10479);
    GMTrace.o(1406467571712L, 10479);
    return false;
  }
  
  public static Class<?> eM(String paramString1, String paramString2)
  {
    for (;;)
    {
      try
      {
        GMTrace.i(1407138660352L, 10484);
        str1 = (String)tIR.get(paramString1);
        if (str1 != null) {
          w.d("MicroMsg.PluginHelper", "load plugin with mapping %s -> %s", new Object[] { paramString1, str1 });
        }
        if (PX(paramString1)) {
          continue;
        }
        w.f("MicroMsg.PluginHelper", "plugin load failed, plugin=%s", new Object[] { paramString1 });
        GMTrace.o(1407138660352L, 10484);
        paramString1 = null;
      }
      finally
      {
        try
        {
          String str1;
          String str2;
          paramString2 = ab.getContext().getClassLoader().loadClass(str1);
          paramString1 = paramString2;
          GMTrace.o(1407138660352L, 10484);
        }
        catch (Exception paramString2)
        {
          w.f("MicroMsg.PluginHelper", "plugin load failed, plugin=%s", new Object[] { paramString1 });
          GMTrace.o(1407138660352L, 10484);
          paramString1 = null;
        }
        paramString1 = finally;
      }
      return paramString1;
      str2 = ab.bPT() + ".plugin." + paramString1;
      str1 = paramString2;
      if (paramString2.startsWith(".")) {
        str1 = str2 + paramString2;
      }
    }
  }
  
  public static void p(String paramString, Map<String, aq> paramMap)
  {
    GMTrace.i(1405930700800L, 10475);
    w.d("MicroMsg.PluginHelper", "-->createSubCore: %s", new Object[] { paramString });
    Object localObject = PV(paramString);
    if (localObject == null)
    {
      w.f("MicroMsg.PluginHelper", "register subcore failed, plugin=%s", new Object[] { paramString });
      GMTrace.o(1405930700800L, 10475);
      return;
    }
    localObject = ((c)localObject).createSubCore();
    if (localObject == null)
    {
      w.w("MicroMsg.PluginHelper", "create sub core failed, plugin=%s", new Object[] { paramString });
      GMTrace.o(1405930700800L, 10475);
      return;
    }
    if (paramMap != null) {
      paramMap.put("plugin." + paramString, localObject);
    }
    w.d("MicroMsg.PluginHelper", "<--createSubCore successfully: %s", new Object[] { paramString });
    GMTrace.o(1405930700800L, 10475);
  }
  
  public static void x(Context paramContext, String paramString1, String paramString2)
  {
    GMTrace.i(1404320088064L, 10463);
    a(paramContext, paramString1, paramString2, null, true);
    GMTrace.o(1404320088064L, 10463);
  }
  
  public static com.tencent.mm.pluginsdk.d.a y(Context paramContext, String paramString1, String paramString2)
  {
    GMTrace.i(1406333353984L, 10478);
    Object localObject = PV(paramString1);
    if (localObject == null)
    {
      w.f("MicroMsg.PluginHelper", "create contact widget failed, plugin=%s, type=%s", new Object[] { paramString1, paramString2 });
      GMTrace.o(1406333353984L, 10478);
      return null;
    }
    localObject = ((c)localObject).getContactWidgetFactory();
    if (localObject == null)
    {
      w.f("MicroMsg.PluginHelper", "create contact widget factory failed, plugin=%s, type=%s", new Object[] { paramString1, paramString2 });
      GMTrace.o(1406333353984L, 10478);
      return null;
    }
    paramContext = ((com.tencent.mm.pluginsdk.d.b)localObject).N(paramContext, paramString2);
    GMTrace.o(1406333353984L, 10478);
    return paramContext;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bj\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */