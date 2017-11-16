package com.tencent.mm.plugin.appbrand.jsapi.g;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ipcinvoker.i;
import com.tencent.mm.ipcinvoker.type.IPCString;
import com.tencent.mm.ipcinvoker.type.IPCVoid;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.sdk.f.e;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

public final class b
  extends a
{
  private static final int CTRL_INDEX = 280;
  private static final String NAME = "getRegionData";
  public static final AtomicReference<String> ijK;
  
  static
  {
    GMTrace.i(17391530541056L, 129577);
    ijK = new AtomicReference();
    GMTrace.o(17391530541056L, 129577);
  }
  
  public b()
  {
    GMTrace.i(17391262105600L, 129575);
    GMTrace.o(17391262105600L, 129575);
  }
  
  public final void a(AppBrandPageView paramAppBrandPageView, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(17391396323328L, 129576);
    e.post(new Runnable()
    {
      /* Error */
      public final void run()
      {
        // Byte code:
        //   0: aconst_null
        //   1: astore_3
        //   2: ldc2_w 45
        //   5: ldc 47
        //   7: invokestatic 37	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   10: getstatic 51	com/tencent/mm/plugin/appbrand/jsapi/g/b:ijK	Ljava/util/concurrent/atomic/AtomicReference;
        //   13: invokevirtual 57	java/util/concurrent/atomic/AtomicReference:get	()Ljava/lang/Object;
        //   16: checkcast 59	java/lang/String
        //   19: astore_2
        //   20: aload_2
        //   21: invokestatic 65	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
        //   24: ifeq +219 -> 243
        //   27: invokestatic 71	com/tencent/mm/sdk/platformtools/ab:bQc	()Z
        //   30: ifeq +162 -> 192
        //   33: ldc 73
        //   35: getstatic 79	com/tencent/mm/ipcinvoker/type/IPCVoid:fVT	Lcom/tencent/mm/ipcinvoker/type/IPCVoid;
        //   38: ldc 81
        //   40: invokestatic 86	com/tencent/mm/ipcinvoker/extension/XIPCInvoker:a	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
        //   43: checkcast 88	com/tencent/mm/ipcinvoker/type/IPCString
        //   46: getfield 92	com/tencent/mm/ipcinvoker/type/IPCString:value	Ljava/lang/String;
        //   49: astore_1
        //   50: aload_1
        //   51: invokestatic 65	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
        //   54: ifne +184 -> 238
        //   57: aload_1
        //   58: invokestatic 98	com/tencent/mm/a/e:be	(Ljava/lang/String;)Ljava/lang/String;
        //   61: astore_2
        //   62: aload_2
        //   63: astore_1
        //   64: aload_1
        //   65: astore_2
        //   66: aload_1
        //   67: invokestatic 65	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
        //   70: ifeq +18 -> 88
        //   73: invokestatic 102	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
        //   76: invokevirtual 108	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
        //   79: ldc 110
        //   81: invokevirtual 116	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
        //   84: invokestatic 120	com/tencent/mm/sdk/platformtools/bg:convertStreamToString	(Ljava/io/InputStream;)Ljava/lang/String;
        //   87: astore_2
        //   88: aload_2
        //   89: astore_1
        //   90: aload_2
        //   91: invokestatic 65	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
        //   94: ifne +12 -> 106
        //   97: getstatic 51	com/tencent/mm/plugin/appbrand/jsapi/g/b:ijK	Ljava/util/concurrent/atomic/AtomicReference;
        //   100: aload_2
        //   101: invokevirtual 124	java/util/concurrent/atomic/AtomicReference:set	(Ljava/lang/Object;)V
        //   104: aload_2
        //   105: astore_1
        //   106: aload_0
        //   107: getfield 23	com/tencent/mm/plugin/appbrand/jsapi/g/b$1:ieJ	Ljava/lang/ref/WeakReference;
        //   110: invokevirtual 127	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
        //   113: checkcast 129	com/tencent/mm/plugin/appbrand/page/AppBrandPageView
        //   116: astore_2
        //   117: aload_2
        //   118: ifnull +47 -> 165
        //   121: aload_2
        //   122: getfield 133	com/tencent/mm/plugin/appbrand/page/AppBrandPageView:mRunning	Z
        //   125: ifeq +40 -> 165
        //   128: new 135	java/util/HashMap
        //   131: dup
        //   132: iconst_1
        //   133: invokespecial 138	java/util/HashMap:<init>	(I)V
        //   136: astore_3
        //   137: aload_3
        //   138: ldc -116
        //   140: aload_1
        //   141: invokeinterface 146 3 0
        //   146: pop
        //   147: aload_2
        //   148: aload_0
        //   149: getfield 25	com/tencent/mm/plugin/appbrand/jsapi/g/b$1:fXx	I
        //   152: aload_0
        //   153: getfield 21	com/tencent/mm/plugin/appbrand/jsapi/g/b$1:ijL	Lcom/tencent/mm/plugin/appbrand/jsapi/g/b;
        //   156: ldc -108
        //   158: aload_3
        //   159: invokevirtual 152	com/tencent/mm/plugin/appbrand/jsapi/g/b:d	(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
        //   162: invokevirtual 156	com/tencent/mm/plugin/appbrand/page/AppBrandPageView:v	(ILjava/lang/String;)V
        //   165: ldc2_w 45
        //   168: ldc 47
        //   170: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   173: return
        //   174: astore_1
        //   175: ldc -98
        //   177: aload_1
        //   178: ldc -96
        //   180: iconst_0
        //   181: anewarray 4	java/lang/Object
        //   184: invokestatic 166	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
        //   187: aconst_null
        //   188: astore_1
        //   189: goto -139 -> 50
        //   192: ldc -88
        //   194: astore_1
        //   195: goto -145 -> 50
        //   198: astore_2
        //   199: ldc -98
        //   201: aload_2
        //   202: ldc -86
        //   204: iconst_1
        //   205: anewarray 4	java/lang/Object
        //   208: dup
        //   209: iconst_0
        //   210: aload_1
        //   211: aastore
        //   212: invokestatic 166	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
        //   215: aload_3
        //   216: astore_1
        //   217: goto -153 -> 64
        //   220: astore_2
        //   221: ldc -98
        //   223: aload_2
        //   224: ldc -84
        //   226: iconst_0
        //   227: anewarray 4	java/lang/Object
        //   230: invokestatic 166	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
        //   233: aload_1
        //   234: astore_2
        //   235: goto -147 -> 88
        //   238: aload_2
        //   239: astore_1
        //   240: goto -176 -> 64
        //   243: aload_2
        //   244: astore_1
        //   245: goto -139 -> 106
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	248	0	this	1
        //   49	92	1	localObject1	Object
        //   174	4	1	localException1	Exception
        //   188	57	1	localObject2	Object
        //   19	129	2	localObject3	Object
        //   198	4	2	localException2	Exception
        //   220	4	2	localException3	Exception
        //   234	10	2	localObject4	Object
        //   1	215	3	localHashMap	java.util.HashMap
        // Exception table:
        //   from	to	target	type
        //   33	50	174	java/lang/Exception
        //   57	62	198	java/lang/Exception
        //   73	88	220	java/lang/Exception
      }
    }, "AppBrandJsApiGetRegionData");
    GMTrace.o(17391396323328L, 129576);
  }
  
  private static final class a
    implements i<IPCVoid, IPCString>
  {
    private a()
    {
      GMTrace.i(18203413577728L, 135626);
      GMTrace.o(18203413577728L, 135626);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\g\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */