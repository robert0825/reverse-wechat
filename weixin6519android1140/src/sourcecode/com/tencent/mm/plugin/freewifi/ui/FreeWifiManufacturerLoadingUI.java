package com.tencent.mm.plugin.freewifi.ui;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.plugin.freewifi.b;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.c;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import java.util.List;

public class FreeWifiManufacturerLoadingUI
  extends MMActivity
{
  private String bssid;
  private aj euU;
  private ImageView ltO;
  private TextView ltP;
  private Button ltQ;
  private final int ltR;
  private final int ltS;
  private final int ltT;
  private int[] ltU;
  ae ltV;
  ae ltW;
  private String ssid;
  
  public FreeWifiManufacturerLoadingUI()
  {
    GMTrace.i(7157831434240L, 53330);
    this.ltR = 1;
    this.ltS = 2;
    this.ltT = 3;
    this.ltU = new int[] { R.g.aWA, R.g.aWB, R.g.aWC, R.g.aWD, R.g.aWE };
    this.ltV = new ae()
    {
      int i;
      
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(7217558323200L, 53775);
        if (paramAnonymousMessage.what == 1)
        {
          if (this.i >= FreeWifiManufacturerLoadingUI.a(FreeWifiManufacturerLoadingUI.this).length) {
            this.i = 0;
          }
          FreeWifiManufacturerLoadingUI.b(FreeWifiManufacturerLoadingUI.this).setImageResource(FreeWifiManufacturerLoadingUI.a(FreeWifiManufacturerLoadingUI.this)[this.i]);
          this.i += 1;
        }
        for (;;)
        {
          super.handleMessage(paramAnonymousMessage);
          GMTrace.o(7217558323200L, 53775);
          return;
          if (paramAnonymousMessage.what == 2) {
            FreeWifiManufacturerLoadingUI.b(FreeWifiManufacturerLoadingUI.this).setImageResource(FreeWifiManufacturerLoadingUI.a(FreeWifiManufacturerLoadingUI.this)[(FreeWifiManufacturerLoadingUI.a(FreeWifiManufacturerLoadingUI.this).length - 1)]);
          } else if ((paramAnonymousMessage.what == 3) && (paramAnonymousMessage.obj != null) && ((paramAnonymousMessage.obj instanceof String))) {
            FreeWifiManufacturerLoadingUI.c(FreeWifiManufacturerLoadingUI.this).setText(paramAnonymousMessage.obj.toString());
          }
        }
      }
    };
    this.ltW = new ae();
    GMTrace.o(7157831434240L, 53330);
  }
  
  private void Y(int paramInt, String paramString)
  {
    GMTrace.i(7158636740608L, 53336);
    w.i("MicroMsg.FreeWifi.FreeWifiManufacturerLoadingUI", "errcode=%d, errmsg=%s", new Object[] { Integer.valueOf(paramInt), paramString });
    if (paramInt != 0)
    {
      aBV();
      if (paramInt == 1154)
      {
        yK(getString(R.l.dxU) + "(031" + k.b.lpg.lpi + "-" + Math.abs(paramInt) + ")");
        GMTrace.o(7158636740608L, 53336);
        return;
      }
      yK(getString(R.l.dxT) + "(031" + k.b.lpg.lpi + "-" + Math.abs(paramInt) + ")");
      this.ltW.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7214337097728L, 53751);
          FreeWifiManufacturerLoadingUI.d(FreeWifiManufacturerLoadingUI.this).setVisibility(0);
          GMTrace.o(7214337097728L, 53751);
        }
      }, 0L);
    }
    GMTrace.o(7158636740608L, 53336);
  }
  
  private void aBV()
  {
    GMTrace.i(7157965651968L, 53331);
    if (this.euU != null) {
      this.euU.stopTimer();
    }
    this.ltV.sendEmptyMessage(2);
    GMTrace.o(7157965651968L, 53331);
  }
  
  private static String bs(Context paramContext)
  {
    GMTrace.i(7158905176064L, 53338);
    try
    {
      paramContext = ((ActivityManager.RunningTaskInfo)((ActivityManager)paramContext.getSystemService("activity")).getRunningTasks(1).get(0)).topActivity.getClassName();
      w.i("MicroMsg.FreeWifi.FreeWifiManufacturerLoadingUI", "top activity name =" + paramContext);
      GMTrace.o(7158905176064L, 53338);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      w.printErrStackTrace("MicroMsg.FreeWifi.FreeWifiManufacturerLoadingUI", paramContext, "", new Object[0]);
      GMTrace.o(7158905176064L, 53338);
    }
    return "(null)";
  }
  
  private void yK(String paramString)
  {
    GMTrace.i(7158770958336L, 53337);
    Message localMessage = Message.obtain();
    localMessage.what = 3;
    localMessage.obj = paramString;
    this.ltV.sendMessage(localMessage);
    GMTrace.o(7158770958336L, 53337);
  }
  
  public final void aBW()
  {
    GMTrace.i(7158502522880L, 53335);
    this.ltV.sendEmptyMessage(1);
    if (this.euU != null) {
      this.euU.stopTimer();
    }
    this.euU = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(7175816609792L, 53464);
        FreeWifiManufacturerLoadingUI.this.ltV.sendEmptyMessage(1);
        GMTrace.o(7175816609792L, 53464);
        return true;
      }
    }, true);
    this.euU.z(200L, 200L);
    final String str = this.ssid;
    j.aBh().aAR().post(new Runnable()
    {
      private int ltZ;
      private final int lua;
      
      private void aBX()
      {
        GMTrace.i(7169105723392L, 53414);
        w.i("MicroMsg.FreeWifi.FreeWifiManufacturerLoadingUI", "_httpRequestForPortalUrl retry.");
        this.ltZ += 1;
        try
        {
          Thread.sleep(2000L);
          aBY();
          GMTrace.o(7169105723392L, 53414);
          return;
        }
        catch (InterruptedException localInterruptedException)
        {
          for (;;)
          {
            w.e("MicroMsg.FreeWifi.FreeWifiManufacturerLoadingUI", "sleep exception. " + localInterruptedException.getMessage());
          }
        }
      }
      
      /* Error */
      private void aBY()
      {
        // Byte code:
        //   0: ldc2_w 91
        //   3: ldc 93
        //   5: invokestatic 33	com/tencent/gmtrace/GMTrace:i	(JI)V
        //   8: getstatic 99	com/tencent/mm/plugin/freewifi/h$b:lop	Lcom/tencent/mm/plugin/freewifi/h;
        //   11: invokevirtual 104	com/tencent/mm/plugin/freewifi/h:aAA	()Ljava/lang/String;
        //   14: astore 4
        //   16: ldc 49
        //   18: new 69	java/lang/StringBuilder
        //   21: dup
        //   22: ldc 106
        //   24: invokespecial 74	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
        //   27: aload 4
        //   29: invokevirtual 82	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   32: invokevirtual 85	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   35: invokestatic 56	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
        //   38: aload_0
        //   39: getfield 19	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI$5:ltX	Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;
        //   42: aload_0
        //   43: getfield 19	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI$5:ltX	Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;
        //   46: getstatic 111	com/tencent/mm/R$l:dxS	I
        //   49: invokevirtual 115	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI:getString	(I)Ljava/lang/String;
        //   52: invokestatic 118	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI:a	(Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;Ljava/lang/String;)V
        //   55: aconst_null
        //   56: astore_2
        //   57: aconst_null
        //   58: astore 5
        //   60: new 120	java/net/URL
        //   63: dup
        //   64: aload 4
        //   66: invokespecial 121	java/net/URL:<init>	(Ljava/lang/String;)V
        //   69: invokevirtual 125	java/net/URL:openConnection	()Ljava/net/URLConnection;
        //   72: checkcast 127	java/net/HttpURLConnection
        //   75: astore_3
        //   76: aload_3
        //   77: ifnull +506 -> 583
        //   80: aload_3
        //   81: sipush 5000
        //   84: invokevirtual 131	java/net/HttpURLConnection:setConnectTimeout	(I)V
        //   87: aload_3
        //   88: sipush 5000
        //   91: invokevirtual 134	java/net/HttpURLConnection:setReadTimeout	(I)V
        //   94: aload_3
        //   95: iconst_0
        //   96: invokevirtual 138	java/net/HttpURLConnection:setInstanceFollowRedirects	(Z)V
        //   99: aload_3
        //   100: iconst_0
        //   101: invokevirtual 141	java/net/HttpURLConnection:setUseCaches	(Z)V
        //   104: aload_3
        //   105: ldc -113
        //   107: ldc -111
        //   109: invokevirtual 148	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
        //   112: aload_3
        //   113: ldc -106
        //   115: ldc -111
        //   117: invokevirtual 148	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
        //   120: aload_3
        //   121: invokevirtual 154	java/net/HttpURLConnection:getResponseCode	()I
        //   124: istore_1
        //   125: ldc 49
        //   127: new 69	java/lang/StringBuilder
        //   130: dup
        //   131: ldc -100
        //   133: invokespecial 74	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
        //   136: iload_1
        //   137: invokevirtual 159	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
        //   140: invokevirtual 85	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   143: invokestatic 56	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
        //   146: sipush 200
        //   149: iload_1
        //   150: if_icmpne +308 -> 458
        //   153: ldc 49
        //   155: invokestatic 165	com/tencent/mm/plugin/freewifi/m:ys	(Ljava/lang/String;)Ljava/lang/String;
        //   158: aload_0
        //   159: getfield 21	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI$5:lpz	Ljava/lang/String;
        //   162: invokevirtual 171	java/lang/String:equals	(Ljava/lang/Object;)Z
        //   165: ifne +32 -> 197
        //   168: aload_0
        //   169: getfield 19	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI$5:ltX	Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;
        //   172: sipush 1150
        //   175: ldc -83
        //   177: invokestatic 176	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI:a	(Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;ILjava/lang/String;)V
        //   180: aload_3
        //   181: ifnull +7 -> 188
        //   184: aload_3
        //   185: invokevirtual 179	java/net/HttpURLConnection:disconnect	()V
        //   188: ldc2_w 91
        //   191: ldc 93
        //   193: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   196: return
        //   197: aload_3
        //   198: invokevirtual 183	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
        //   201: invokestatic 187	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI:k	(Ljava/io/InputStream;)Ljava/lang/String;
        //   204: astore_2
        //   205: ldc 49
        //   207: new 69	java/lang/StringBuilder
        //   210: dup
        //   211: ldc -67
        //   213: invokespecial 74	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
        //   216: aload_2
        //   217: invokevirtual 82	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   220: invokevirtual 85	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   223: invokestatic 56	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
        //   226: aload_2
        //   227: ldc -65
        //   229: invokevirtual 195	java/lang/String:indexOf	(Ljava/lang/String;)I
        //   232: iconst_m1
        //   233: if_icmpne +29 -> 262
        //   236: aload_0
        //   237: getfield 19	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI$5:ltX	Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;
        //   240: aload 4
        //   242: invokestatic 198	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI:b	(Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;Ljava/lang/String;)V
        //   245: aload_3
        //   246: ifnull +7 -> 253
        //   249: aload_3
        //   250: invokevirtual 179	java/net/HttpURLConnection:disconnect	()V
        //   253: ldc2_w 91
        //   256: ldc 93
        //   258: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   261: return
        //   262: aload_0
        //   263: getfield 19	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI$5:ltX	Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;
        //   266: iconst_0
        //   267: ldc -56
        //   269: invokestatic 176	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI:a	(Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;ILjava/lang/String;)V
        //   272: ldc 49
        //   274: ldc -54
        //   276: invokestatic 56	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
        //   279: aload_0
        //   280: getfield 19	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI$5:ltX	Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;
        //   283: iconst_0
        //   284: ldc -56
        //   286: invokestatic 176	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI:a	(Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;ILjava/lang/String;)V
        //   289: aload_0
        //   290: getfield 19	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI$5:ltX	Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;
        //   293: aload_0
        //   294: getfield 19	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI$5:ltX	Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;
        //   297: getstatic 205	com/tencent/mm/R$l:dxR	I
        //   300: invokevirtual 115	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI:getString	(I)Ljava/lang/String;
        //   303: invokestatic 118	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI:a	(Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;Ljava/lang/String;)V
        //   306: aload_0
        //   307: getfield 19	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI$5:ltX	Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;
        //   310: invokestatic 208	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI:e	(Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;)V
        //   313: aload_0
        //   314: getfield 19	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI$5:ltX	Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;
        //   317: invokestatic 211	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI:f	(Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;)V
        //   320: goto -140 -> 180
        //   323: astore 4
        //   325: aload_3
        //   326: astore_2
        //   327: new 213	java/io/StringWriter
        //   330: dup
        //   331: invokespecial 214	java/io/StringWriter:<init>	()V
        //   334: astore 5
        //   336: aload_3
        //   337: astore_2
        //   338: aload 4
        //   340: new 216	java/io/PrintWriter
        //   343: dup
        //   344: aload 5
        //   346: invokespecial 219	java/io/PrintWriter:<init>	(Ljava/io/Writer;)V
        //   349: invokevirtual 223	java/lang/Exception:printStackTrace	(Ljava/io/PrintWriter;)V
        //   352: aload_3
        //   353: astore_2
        //   354: aload 5
        //   356: invokevirtual 224	java/io/StringWriter:toString	()Ljava/lang/String;
        //   359: astore 5
        //   361: aload_3
        //   362: astore_2
        //   363: ldc 49
        //   365: new 69	java/lang/StringBuilder
        //   368: dup
        //   369: ldc -30
        //   371: invokespecial 74	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
        //   374: aload 5
        //   376: invokevirtual 82	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   379: invokevirtual 85	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   382: invokestatic 56	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
        //   385: aload_3
        //   386: astore_2
        //   387: aload 4
        //   389: instanceof 228
        //   392: ifeq +279 -> 671
        //   395: aload_3
        //   396: astore_2
        //   397: ldc 49
        //   399: ldc -26
        //   401: iconst_2
        //   402: anewarray 4	java/lang/Object
        //   405: dup
        //   406: iconst_0
        //   407: aload_0
        //   408: getfield 35	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI$5:ltZ	I
        //   411: invokestatic 236	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   414: aastore
        //   415: dup
        //   416: iconst_1
        //   417: iconst_5
        //   418: invokestatic 236	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   421: aastore
        //   422: invokestatic 239	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   425: aload_3
        //   426: astore_2
        //   427: aload_0
        //   428: getfield 35	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI$5:ltZ	I
        //   431: iconst_5
        //   432: if_icmpge +239 -> 671
        //   435: aload_3
        //   436: astore_2
        //   437: aload_0
        //   438: invokespecial 241	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI$5:aBX	()V
        //   441: aload_3
        //   442: ifnull +7 -> 449
        //   445: aload_3
        //   446: invokevirtual 179	java/net/HttpURLConnection:disconnect	()V
        //   449: ldc2_w 91
        //   452: ldc 93
        //   454: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   457: return
        //   458: sipush 302
        //   461: iload_1
        //   462: if_icmpne +91 -> 553
        //   465: ldc 49
        //   467: ldc -13
        //   469: iconst_1
        //   470: anewarray 4	java/lang/Object
        //   473: dup
        //   474: iconst_0
        //   475: aload_3
        //   476: ldc -11
        //   478: invokevirtual 248	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
        //   481: aastore
        //   482: invokestatic 239	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   485: aload_3
        //   486: ldc -11
        //   488: invokevirtual 248	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
        //   491: astore_2
        //   492: aload_2
        //   493: invokestatic 252	com/tencent/mm/plugin/freewifi/m:yp	(Ljava/lang/String;)Z
        //   496: ifne +28 -> 524
        //   499: aload_0
        //   500: getfield 19	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI$5:ltX	Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;
        //   503: aload_2
        //   504: invokestatic 198	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI:b	(Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;Ljava/lang/String;)V
        //   507: aload_3
        //   508: ifnull +7 -> 515
        //   511: aload_3
        //   512: invokevirtual 179	java/net/HttpURLConnection:disconnect	()V
        //   515: ldc2_w 91
        //   518: ldc 93
        //   520: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   523: return
        //   524: aload_0
        //   525: getfield 19	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI$5:ltX	Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;
        //   528: sipush 1146
        //   531: ldc -2
        //   533: invokestatic 176	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI:a	(Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;ILjava/lang/String;)V
        //   536: aload_3
        //   537: ifnull +7 -> 544
        //   540: aload_3
        //   541: invokevirtual 179	java/net/HttpURLConnection:disconnect	()V
        //   544: ldc2_w 91
        //   547: ldc 93
        //   549: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   552: return
        //   553: aload_0
        //   554: getfield 19	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI$5:ltX	Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;
        //   557: sipush 1149
        //   560: ldc_w 256
        //   563: invokestatic 176	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI:a	(Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;ILjava/lang/String;)V
        //   566: aload_3
        //   567: ifnull +7 -> 574
        //   570: aload_3
        //   571: invokevirtual 179	java/net/HttpURLConnection:disconnect	()V
        //   574: ldc2_w 91
        //   577: ldc 93
        //   579: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   582: return
        //   583: ldc 49
        //   585: ldc_w 258
        //   588: iconst_2
        //   589: anewarray 4	java/lang/Object
        //   592: dup
        //   593: iconst_0
        //   594: aload_0
        //   595: getfield 35	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI$5:ltZ	I
        //   598: invokestatic 236	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   601: aastore
        //   602: dup
        //   603: iconst_1
        //   604: iconst_5
        //   605: invokestatic 236	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   608: aastore
        //   609: invokestatic 239	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   612: aload_0
        //   613: getfield 35	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI$5:ltZ	I
        //   616: iconst_5
        //   617: if_icmpge +24 -> 641
        //   620: aload_0
        //   621: invokespecial 241	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI$5:aBX	()V
        //   624: aload_3
        //   625: ifnull +7 -> 632
        //   628: aload_3
        //   629: invokevirtual 179	java/net/HttpURLConnection:disconnect	()V
        //   632: ldc2_w 91
        //   635: ldc 93
        //   637: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   640: return
        //   641: aload_0
        //   642: getfield 19	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI$5:ltX	Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;
        //   645: sipush 1148
        //   648: ldc_w 260
        //   651: invokestatic 176	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI:a	(Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;ILjava/lang/String;)V
        //   654: aload_3
        //   655: ifnull +7 -> 662
        //   658: aload_3
        //   659: invokevirtual 179	java/net/HttpURLConnection:disconnect	()V
        //   662: ldc2_w 91
        //   665: ldc 93
        //   667: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   670: return
        //   671: aload_3
        //   672: astore_2
        //   673: aload_0
        //   674: getfield 19	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI$5:ltX	Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;
        //   677: sipush 1153
        //   680: ldc_w 260
        //   683: invokestatic 176	com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI:a	(Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI;ILjava/lang/String;)V
        //   686: aload_3
        //   687: ifnull +7 -> 694
        //   690: aload_3
        //   691: invokevirtual 179	java/net/HttpURLConnection:disconnect	()V
        //   694: ldc2_w 91
        //   697: ldc 93
        //   699: invokestatic 40	com/tencent/gmtrace/GMTrace:o	(JI)V
        //   702: return
        //   703: astore 4
        //   705: aload_2
        //   706: astore_3
        //   707: aload 4
        //   709: astore_2
        //   710: aload_3
        //   711: ifnull +7 -> 718
        //   714: aload_3
        //   715: invokevirtual 179	java/net/HttpURLConnection:disconnect	()V
        //   718: aload_2
        //   719: athrow
        //   720: astore_2
        //   721: goto -11 -> 710
        //   724: astore 4
        //   726: aload 5
        //   728: astore_3
        //   729: goto -404 -> 325
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	732	0	this	5
        //   124	339	1	i	int
        //   56	663	2	localObject1	Object
        //   720	1	2	localObject2	Object
        //   75	654	3	localObject3	Object
        //   14	227	4	str	String
        //   323	65	4	localException1	Exception
        //   703	5	4	localObject4	Object
        //   724	1	4	localException2	Exception
        //   58	669	5	localObject5	Object
        // Exception table:
        //   from	to	target	type
        //   80	146	323	java/lang/Exception
        //   153	180	323	java/lang/Exception
        //   197	245	323	java/lang/Exception
        //   262	320	323	java/lang/Exception
        //   465	507	323	java/lang/Exception
        //   524	536	323	java/lang/Exception
        //   553	566	323	java/lang/Exception
        //   583	624	323	java/lang/Exception
        //   641	654	323	java/lang/Exception
        //   60	76	703	finally
        //   327	336	703	finally
        //   338	352	703	finally
        //   354	361	703	finally
        //   363	385	703	finally
        //   387	395	703	finally
        //   397	425	703	finally
        //   427	435	703	finally
        //   437	441	703	finally
        //   673	686	703	finally
        //   80	146	720	finally
        //   153	180	720	finally
        //   197	245	720	finally
        //   262	320	720	finally
        //   465	507	720	finally
        //   524	536	720	finally
        //   553	566	720	finally
        //   583	624	720	finally
        //   641	654	720	finally
        //   60	76	724	java/lang/Exception
      }
      
      public final void run()
      {
        GMTrace.i(7168971505664L, 53413);
        Context localContext = ab.getContext();
        if (localContext == null)
        {
          FreeWifiManufacturerLoadingUI.a(FreeWifiManufacturerLoadingUI.this, 1151, "Wechat hasn't started completely. Wait 5 seconds and retry.");
          GMTrace.o(7168971505664L, 53413);
          return;
        }
        if ((!m.aAI()) || (!m.ys("MicroMsg.FreeWifi.FreeWifiManufacturerLoadingUI").equals(str)))
        {
          w.i("MicroMsg.FreeWifi.FreeWifiManufacturerLoadingUI", "It starts to connect portal ssid " + str);
          FreeWifiManufacturerLoadingUI.a(FreeWifiManufacturerLoadingUI.this, FreeWifiManufacturerLoadingUI.this.getString(R.l.dxW));
          int i = new b(str, localContext).aAs();
          w.i("MicroMsg.FreeWifi.FreeWifiManufacturerLoadingUI", "connectRet=" + i);
          if (i != 0)
          {
            FreeWifiManufacturerLoadingUI.a(FreeWifiManufacturerLoadingUI.this, i, "An attempt to switch to special portal ap failed. connectRet=" + i);
            GMTrace.o(7168971505664L, 53413);
            return;
          }
        }
        aBY();
        GMTrace.o(7168971505664L, 53413);
      }
    });
    GMTrace.o(7158502522880L, 53335);
  }
  
  public void finish()
  {
    GMTrace.i(7158234087424L, 53333);
    aBV();
    super.finish();
    GMTrace.o(7158234087424L, 53333);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7158099869696L, 53332);
    int i = R.i.cxu;
    GMTrace.o(7158099869696L, 53332);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7158368305152L, 53334);
    super.onCreate(paramBundle);
    oM(R.l.dyb);
    this.ssid = getIntent().getStringExtra("ConstantsFreeWifi.FreeWifiManufacturerConnectWifiHelper_Ssid");
    this.bssid = getIntent().getStringExtra("ConstantsFreeWifi.FreeWifiManufacturerConnectWifiHelper_Bssid");
    this.ltO = ((ImageView)findViewById(R.h.bBz));
    this.ltP = ((TextView)findViewById(R.h.bBA));
    this.ltQ = ((Button)findViewById(R.h.bBB));
    this.ltQ.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7194070220800L, 53600);
        FreeWifiManufacturerLoadingUI.this.ltW.postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(7181453754368L, 53506);
            FreeWifiManufacturerLoadingUI.d(FreeWifiManufacturerLoadingUI.this).setVisibility(4);
            GMTrace.o(7181453754368L, 53506);
          }
        }, 0L);
        FreeWifiManufacturerLoadingUI.this.aBW();
        GMTrace.o(7194070220800L, 53600);
      }
    });
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7209102606336L, 53712);
        FreeWifiManufacturerLoadingUI.this.finish();
        GMTrace.o(7209102606336L, 53712);
        return true;
      }
    });
    aBW();
    GMTrace.o(7158368305152L, 53334);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\freewifi\ui\FreeWifiManufacturerLoadingUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */