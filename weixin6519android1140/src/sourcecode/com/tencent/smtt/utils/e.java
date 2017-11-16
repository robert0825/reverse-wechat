package com.tencent.smtt.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.smtt.sdk.WebView;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public final class e
{
  private static DexClassLoader xYi = null;
  public static Looper xYj = null;
  private static e xYk = null;
  public String xYh = "";
  
  private e(Context paramContext)
  {
    this.xYh = (paramContext.getDir("debugtbs", 0).getAbsolutePath() + File.separator + "plugin");
  }
  
  public static e ht(Context paramContext)
  {
    if (xYk == null) {
      xYk = new e(paramContext);
    }
    return xYk;
  }
  
  @SuppressLint({"NewApi"})
  public final void a(final String paramString, final WebView paramWebView, final Context paramContext, final Looper paramLooper)
  {
    TbsLog.i("debugtbs", "showPluginView -- url: " + paramString + "; webview: " + paramWebView + "; context: " + paramContext);
    final Object localObject1 = this.xYh + File.separator + "DebugPlugin.tbs";
    Object localObject2 = this.xYh + File.separator + "DebugPlugin.apk";
    Object localObject3 = new File((String)localObject1);
    localObject1 = new File((String)localObject2);
    xYj = paramLooper;
    if (((File)localObject3).exists())
    {
      ((File)localObject1).delete();
      ((File)localObject3).renameTo((File)localObject1);
    }
    if (!((File)localObject1).exists())
    {
      TbsLog.i("debugtbs", "showPluginView - going to download plugin...");
      paramLooper = new RelativeLayout(paramContext);
      localObject1 = new TextView(paramContext);
      localObject2 = new RelativeLayout.LayoutParams(-2, -2);
      ((RelativeLayout.LayoutParams)localObject2).addRule(13);
      ((TextView)localObject1).setText("加载中，请稍后...");
      paramLooper.addView((View)localObject1, (ViewGroup.LayoutParams)localObject2);
      paramWebView.addView(paramLooper, new FrameLayout.LayoutParams(-1, -1));
      localObject2 = this.xYh + File.separator + "DebugPlugin.tbs";
      f.O(new File((String)localObject2));
      new Thread()
      {
        public final void cpc()
        {
          paramWebView.post(new Runnable()
          {
            public final void run()
            {
              Toast.makeText(e.1.this.val$context, "下载成功", 0).show();
              e.1.this.xYm.setVisibility(4);
              e.this.a(e.1.this.val$url, e.1.this.xYl, e.1.this.val$context, e.xYj);
            }
          });
        }
        
        public final void cpd()
        {
          paramWebView.post(new Runnable()
          {
            public final void run()
            {
              Toast.makeText(e.1.this.val$context, "下载失败，请检查网络", 0).show();
            }
          });
        }
        
        public final void jC(final int paramAnonymousInt)
        {
          paramWebView.post(new Runnable()
          {
            public final void run()
            {
              e.1.this.xYn.setText("已下载" + paramAnonymousInt + "%");
            }
          });
        }
      }
      {
        /* Error */
        public final void run()
        {
          // Byte code:
          //   0: aconst_null
          //   1: astore 6
          //   3: aconst_null
          //   4: astore 5
          //   6: new 25	java/net/URL
          //   9: dup
          //   10: ldc 27
          //   12: invokespecial 30	java/net/URL:<init>	(Ljava/lang/String;)V
          //   15: invokevirtual 34	java/net/URL:openConnection	()Ljava/net/URLConnection;
          //   18: checkcast 36	java/net/HttpURLConnection
          //   21: astore 4
          //   23: aload 4
          //   25: invokevirtual 40	java/net/HttpURLConnection:getContentLength	()I
          //   28: istore_2
          //   29: aload 4
          //   31: sipush 5000
          //   34: invokevirtual 44	java/net/HttpURLConnection:setConnectTimeout	(I)V
          //   37: aload 4
          //   39: invokevirtual 47	java/net/HttpURLConnection:connect	()V
          //   42: aload 4
          //   44: invokevirtual 51	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
          //   47: astore 4
          //   49: new 53	java/io/File
          //   52: dup
          //   53: aload_0
          //   54: getfield 14	com/tencent/smtt/utils/e$2:fMt	Ljava/lang/String;
          //   57: invokespecial 54	java/io/File:<init>	(Ljava/lang/String;)V
          //   60: invokestatic 60	com/tencent/smtt/utils/f:Q	(Ljava/io/File;)Ljava/io/FileOutputStream;
          //   63: astore 5
          //   65: aload 5
          //   67: astore 6
          //   69: sipush 8192
          //   72: newarray <illegal type>
          //   74: astore 5
          //   76: iconst_0
          //   77: istore_1
          //   78: aload 4
          //   80: aload 5
          //   82: invokevirtual 66	java/io/InputStream:read	([B)I
          //   85: istore_3
          //   86: iload_3
          //   87: ifle +66 -> 153
          //   90: iload_1
          //   91: iload_3
          //   92: iadd
          //   93: istore_1
          //   94: aload 6
          //   96: aload 5
          //   98: iconst_0
          //   99: iload_3
          //   100: invokevirtual 72	java/io/OutputStream:write	([BII)V
          //   103: iload_1
          //   104: bipush 100
          //   106: imul
          //   107: iload_2
          //   108: idiv
          //   109: istore_3
          //   110: aload_0
          //   111: getfield 16	com/tencent/smtt/utils/e$2:xYr	Lcom/tencent/smtt/utils/e$a;
          //   114: iload_3
          //   115: invokeinterface 77 2 0
          //   120: goto -42 -> 78
          //   123: astore 5
          //   125: aload 4
          //   127: astore 5
          //   129: aload 6
          //   131: astore 4
          //   133: aload_0
          //   134: getfield 16	com/tencent/smtt/utils/e$2:xYr	Lcom/tencent/smtt/utils/e$a;
          //   137: invokeinterface 80 1 0
          //   142: aload 5
          //   144: invokevirtual 83	java/io/InputStream:close	()V
          //   147: aload 4
          //   149: invokevirtual 84	java/io/OutputStream:close	()V
          //   152: return
          //   153: aload_0
          //   154: getfield 16	com/tencent/smtt/utils/e$2:xYr	Lcom/tencent/smtt/utils/e$a;
          //   157: invokeinterface 87 1 0
          //   162: aload 4
          //   164: invokevirtual 83	java/io/InputStream:close	()V
          //   167: aload 6
          //   169: invokevirtual 84	java/io/OutputStream:close	()V
          //   172: return
          //   173: astore 4
          //   175: return
          //   176: astore 5
          //   178: aconst_null
          //   179: astore 4
          //   181: aload 4
          //   183: invokevirtual 83	java/io/InputStream:close	()V
          //   186: aload 6
          //   188: invokevirtual 84	java/io/OutputStream:close	()V
          //   191: aload 5
          //   193: athrow
          //   194: astore 4
          //   196: goto -29 -> 167
          //   199: astore 5
          //   201: goto -54 -> 147
          //   204: astore 4
          //   206: return
          //   207: astore 4
          //   209: goto -23 -> 186
          //   212: astore 4
          //   214: goto -23 -> 191
          //   217: astore 5
          //   219: goto -38 -> 181
          //   222: astore 5
          //   224: goto -43 -> 181
          //   227: astore 6
          //   229: aload 5
          //   231: astore 7
          //   233: aload 6
          //   235: astore 5
          //   237: aload 4
          //   239: astore 6
          //   241: aload 7
          //   243: astore 4
          //   245: goto -64 -> 181
          //   248: astore 4
          //   250: aconst_null
          //   251: astore 4
          //   253: goto -120 -> 133
          //   256: astore 5
          //   258: aconst_null
          //   259: astore 6
          //   261: aload 4
          //   263: astore 5
          //   265: aload 6
          //   267: astore 4
          //   269: goto -136 -> 133
          // Local variable table:
          //   start	length	slot	name	signature
          //   0	272	0	this	2
          //   77	30	1	i	int
          //   28	81	2	j	int
          //   85	30	3	k	int
          //   21	142	4	localObject1	Object
          //   173	1	4	localException1	Exception
          //   179	3	4	localObject2	Object
          //   194	1	4	localException2	Exception
          //   204	1	4	localException3	Exception
          //   207	1	4	localException4	Exception
          //   212	26	4	localException5	Exception
          //   243	1	4	localObject3	Object
          //   248	1	4	localException6	Exception
          //   251	17	4	localObject4	Object
          //   4	93	5	localObject5	Object
          //   123	1	5	localException7	Exception
          //   127	16	5	localObject6	Object
          //   176	16	5	localObject7	Object
          //   199	1	5	localException8	Exception
          //   217	1	5	localObject8	Object
          //   222	8	5	localObject9	Object
          //   235	1	5	localObject10	Object
          //   256	1	5	localException9	Exception
          //   263	1	5	localObject11	Object
          //   1	186	6	localObject12	Object
          //   227	7	6	localObject13	Object
          //   239	27	6	localObject14	Object
          //   231	11	7	localObject15	Object
          // Exception table:
          //   from	to	target	type
          //   69	76	123	java/lang/Exception
          //   78	86	123	java/lang/Exception
          //   94	120	123	java/lang/Exception
          //   153	162	123	java/lang/Exception
          //   167	172	173	java/lang/Exception
          //   6	49	176	finally
          //   162	167	194	java/lang/Exception
          //   142	147	199	java/lang/Exception
          //   147	152	204	java/lang/Exception
          //   181	186	207	java/lang/Exception
          //   186	191	212	java/lang/Exception
          //   49	65	217	finally
          //   69	76	222	finally
          //   78	86	222	finally
          //   94	120	222	finally
          //   153	162	222	finally
          //   133	142	227	finally
          //   6	49	248	java/lang/Exception
          //   49	65	256	java/lang/Exception
        }
      }.start();
      return;
    }
    try
    {
      localObject4 = c.d(paramContext, new File((String)localObject2));
      if (!"308203773082025fa003020102020448bb959d300d06092a864886f70d01010b0500306b310b300906035504061302636e31123010060355040813094775616e67646f6e673111300f060355040713085368656e7a68656e3110300e060355040a130754656e63656e74310c300a060355040b13034d4947311530130603550403130c4d696e676875204875616e673020170d3136303532313039353730335a180f32303731303232323039353730335a306b310b300906035504061302636e31123010060355040813094775616e67646f6e673111300f060355040713085368656e7a68656e3110300e060355040a130754656e63656e74310c300a060355040b13034d4947311530130603550403130c4d696e676875204875616e6730820122300d06092a864886f70d01010105000382010f003082010a02820101008c58deabefe95f699c6322f9a75620873b490d26520c7267eb8382a91da625a5876b2bd617116eb40b371c4f88c988c1ba73052caaa9964873c94b7755c3429fca47a6677229fb2e72908d3b17df82f1ebe70447b94c1e5b0a763dad8948312180322657325306f01e423e0409ef3a59e5c0e0b9c765a2322699a2dec2d4dbe58ec15f41752516192169d9596169f5bf08eaf8aab9893240ad679e82fc92b97d2ae98b28021dc5a752f0a69437ea603c541e6753cea52dbc8e8043fe21fd5da46066c92e0714905dfad3116f35aca52b13871c57481459aa4ca255a6482ba972bd17af90d0d2c21a57ef65376bbd4ce7078e6047060640669f3867fdc69fbb750203010001a321301f301d0603551d0e0416041450fb9b6362e829797b1b29ca55e6d5e082e93ff3300d06092a864886f70d01010b050003820101004952ffbfba7c00ee9b84f44b05ec62bc2400dc769fb2e83f80395e3fbb54e44d56e16527413d144f42bf8f21fa443bc42a7a732de9d5124df906c6d728e75ca94eefc918080876bd3ce6cb5f7f2d9cc8d8e708033afc1295c7f347fb2d2098be2e4a79220e9552171d5b5f8f59cff4c6478cc41dce24cbe942305757488d37659d3265838ee54ebe44fccbd1bec93d809f950034f5ef292f20179554d22f5856c03b4d44997fcb9b3579e16a49218fce0e2e6bfe1fd4aa0ab39f548344c244c171c203baff1a730883aaf4506b6865a45c3c9aba40c6326d4152b6ce09cc058864bec1d6422e83dad9496b83fb252b4bfb30d3a6badf996099793e11f9af618d".equals(localObject4))
      {
        TbsLog.e("debugtbs", "verifyPlugin apk: " + (String)localObject2 + " signature failed - sig: " + (String)localObject4);
        Toast.makeText(paramContext, "插件校验失败，请重试", 0).show();
        ((File)localObject3).delete();
        ((File)localObject1).delete();
        return;
      }
    }
    catch (Exception paramString)
    {
      f.O((File)localObject1);
      return;
    }
    localObject3 = this.xYh + File.separator + "opt";
    Object localObject4 = new File((String)localObject3);
    if (!((File)localObject4).exists()) {
      ((File)localObject4).mkdirs();
    }
    if (xYi == null) {
      xYi = new DexClassLoader((String)localObject2, (String)localObject3, null, paramContext.getClassLoader());
    }
    localObject2 = new HashMap();
    ((Map)localObject2).put("url", paramString);
    ((Map)localObject2).put("tbs_version", WebView.getTbsSDKVersion(paramContext));
    ((Map)localObject2).put("tbs_core_version", WebView.getTbsCoreVersion(paramContext));
    if (xYj != null) {
      ((Map)localObject2).put("looper", paramLooper);
    }
    paramString = xYi.loadClass("com.tencent.tbs.debug.plugin.DebugView").getConstructor(new Class[] { Context.class, Map.class }).newInstance(new Object[] { paramContext, localObject2 });
    if ((paramString instanceof FrameLayout))
    {
      paramString = (FrameLayout)paramString;
      paramWebView.addView(paramString, new FrameLayout.LayoutParams(-1, -1));
      TbsLog.i("debugtbs", "show " + paramString + " successful in " + paramWebView);
      return;
    }
    TbsLog.e("debugtbs", "get debugview failure: " + paramString);
  }
  
  public static abstract interface a
  {
    public abstract void cpc();
    
    public abstract void cpd();
    
    public abstract void jC(int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\smtt\utils\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */