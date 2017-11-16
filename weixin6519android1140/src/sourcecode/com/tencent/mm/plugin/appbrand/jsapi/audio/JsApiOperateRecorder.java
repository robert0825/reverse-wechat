package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.a.a;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.lf;
import com.tencent.mm.plugin.appbrand.c.b;
import com.tencent.mm.plugin.appbrand.c.c;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.media.b;
import com.tencent.mm.plugin.appbrand.media.d.6;
import com.tencent.mm.plugin.appbrand.media.d.7;
import com.tencent.mm.plugin.appbrand.media.d.8;
import com.tencent.mm.plugin.appbrand.media.g;
import com.tencent.mm.plugin.appbrand.media.record.RecordParam;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONException;
import org.json.JSONObject;

public final class JsApiOperateRecorder
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 295;
  public static final String NAME = "operateRecorder";
  private int iaA;
  public OperateRecordTask iay;
  private AppBrandPageView iaz;
  
  public JsApiOperateRecorder()
  {
    GMTrace.i(19727455879168L, 146981);
    GMTrace.o(19727455879168L, 146981);
  }
  
  public final void a(final j paramj, final JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(19727590096896L, 146982);
    com.tencent.mm.plugin.appbrand.a.a(paramj.hyD, new a.a()
    {
      public final void onRequestPermissionsResult(int paramAnonymousInt, String[] paramAnonymousArrayOfString, int[] paramAnonymousArrayOfInt)
      {
        GMTrace.i(19732421935104L, 147018);
        if (paramAnonymousInt != 116)
        {
          GMTrace.o(19732421935104L, 147018);
          return;
        }
        if (paramAnonymousArrayOfInt[0] == 0)
        {
          w.i("MicroMsg.JsApiOperateRecorder", "PERMISSION_GRANTED, do invoke again");
          JsApiOperateRecorder.this.a(paramj, paramJSONObject, paramInt);
          GMTrace.o(19732421935104L, 147018);
          return;
        }
        w.e("MicroMsg.JsApiOperateRecorder", "operateRecorder, SYS_PERM_DENIED");
        paramj.v(paramInt, JsApiOperateRecorder.this.d("fail:system permission denied", null));
        GMTrace.o(19732421935104L, 147018);
      }
    });
    final Object localObject = a(paramj);
    int i;
    if (localObject == null)
    {
      w.e("MicroMsg.JsApiOperateRecorder", "operateRecorder, pageContext is null");
      paramj.v(paramInt, d("fail", null));
      i = 0;
    }
    while (i == 0)
    {
      w.e("MicroMsg.JsApiOperateRecorder", "operateRecorder, requestPermission fail");
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(19727590096896L, 146982);
      return;
      boolean bool = com.tencent.mm.pluginsdk.h.a.a((Activity)localObject, "android.permission.RECORD_AUDIO", 116, "", "");
      i = bool;
      if (bool)
      {
        com.tencent.mm.plugin.appbrand.a.nJ(paramj.hyD);
        i = bool;
      }
    }
    this.iaz = b(paramj);
    if (this.iaz == null)
    {
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(19727590096896L, 146982);
      return;
    }
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiOperateRecorder", "operateRecorder, data is null");
      paramj.v(paramInt, d("fail:data is null", null));
      GMTrace.o(19727590096896L, 146982);
      return;
    }
    localObject = paramj.hyD;
    w.i("MicroMsg.JsApiOperateRecorder", "operateRecorder appId:%s, data:%s", new Object[] { localObject, paramJSONObject.toString() });
    if (this.iay == null) {
      this.iay = new OperateRecordTask(this, paramj, paramInt);
    }
    this.iay.hYL = paramInt;
    this.iay.appId = ((String)localObject);
    this.iay.iaE = paramJSONObject.toString();
    paramj = new c.b()
    {
      public final void a(c.c paramAnonymousc)
      {
        GMTrace.i(19714839412736L, 146887);
        w.i("MicroMsg.JsApiOperateRecorder", "onPause, appId:%s", new Object[] { localObject });
        paramAnonymousc = new JSONObject();
        try
        {
          paramAnonymousc.put("operationType", "pause");
          if (JsApiOperateRecorder.this.iay == null) {
            JsApiOperateRecorder.this.iay = new JsApiOperateRecorder.OperateRecordTask(JsApiOperateRecorder.this, paramj, paramInt);
          }
          JsApiOperateRecorder.this.iay.iaE = paramAnonymousc.toString();
          JsApiOperateRecorder.this.iay.appId = localObject;
          JsApiOperateRecorder.this.iay.action = -1;
          AppBrandMainProcessService.a(JsApiOperateRecorder.this.iay);
          GMTrace.o(19714839412736L, 146887);
          return;
        }
        catch (JSONException localJSONException)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.JsApiOperateRecorder", localJSONException, "", new Object[0]);
          }
        }
      }
      
      public final void onDestroy()
      {
        GMTrace.i(19714973630464L, 146888);
        w.i("MicroMsg.JsApiOperateRecorder", "onDestroy, appId:%s", new Object[] { localObject });
        JSONObject localJSONObject = new JSONObject();
        try
        {
          localJSONObject.put("operationType", "stop");
          if (JsApiOperateRecorder.this.iay == null) {
            JsApiOperateRecorder.this.iay = new JsApiOperateRecorder.OperateRecordTask(JsApiOperateRecorder.this, paramj, paramInt);
          }
          JsApiOperateRecorder.this.iay.iaE = localJSONObject.toString();
          JsApiOperateRecorder.this.iay.appId = localObject;
          JsApiOperateRecorder.this.iay.action = -1;
          AppBrandMainProcessService.b(JsApiOperateRecorder.this.iay);
          com.tencent.mm.plugin.appbrand.c.b(localObject, this);
          GMTrace.o(19714973630464L, 146888);
          return;
        }
        catch (JSONException localJSONException)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.JsApiOperateRecorder", localJSONException, "", new Object[0]);
          }
        }
      }
    };
    this.iay.ial = paramj;
    AppBrandMainProcessService.a(this.iay);
    GMTrace.o(19727590096896L, 146982);
  }
  
  public final void cd(final boolean paramBoolean)
  {
    GMTrace.i(19727724314624L, 146983);
    if (!af.isMainThread())
    {
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19725039960064L, 146963);
          JsApiOperateRecorder.this.cd(paramBoolean);
          GMTrace.o(19725039960064L, 146963);
        }
      });
      GMTrace.o(19727724314624L, 146983);
      return;
    }
    if ((this.iaz == null) || (this.iaz.hzM == null))
    {
      GMTrace.o(19727724314624L, 146983);
      return;
    }
    if (paramBoolean)
    {
      this.iaA = com.tencent.mm.plugin.appbrand.page.a.j(this.iaz.hzM).je(o.i.hFo);
      GMTrace.o(19727724314624L, 146983);
      return;
    }
    com.tencent.mm.plugin.appbrand.page.a.j(this.iaz.hzM).jf(this.iaA);
    GMTrace.o(19727724314624L, 146983);
  }
  
  private static class OperateRecordTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<OperateRecordTask> CREATOR;
    public int action;
    public String appId;
    public int duration;
    public byte[] ePy;
    public boolean ePz;
    public String filePath;
    public int fileSize;
    public j hYK;
    public int hYL;
    public String hZP;
    public boolean hZR;
    private JsApiOperateRecorder iaD;
    public String iaE;
    private String iaF;
    String iaG;
    public int iaH;
    private final com.tencent.mm.sdk.b.c<lf> iaI;
    public String iae;
    c.b ial;
    public String state;
    
    static
    {
      GMTrace.i(19744769966080L, 147110);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19744769966080L, 147110);
    }
    
    public OperateRecordTask(Parcel paramParcel)
    {
      GMTrace.i(19743964659712L, 147104);
      this.hZR = false;
      this.hZP = "";
      this.filePath = "";
      this.fileSize = 0;
      this.duration = 0;
      this.state = "";
      this.iaF = "";
      this.iaI = new com.tencent.mm.sdk.b.c()
      {
        /* Error */
        private boolean a(lf paramAnonymouslf)
        {
          // Byte code:
          //   0: ldc2_w 57
          //   3: ldc 59
          //   5: invokestatic 28	com/tencent/gmtrace/GMTrace:i	(JI)V
          //   8: ldc 61
          //   10: ldc 63
          //   12: iconst_1
          //   13: anewarray 65	java/lang/Object
          //   16: dup
          //   17: iconst_0
          //   18: aload_1
          //   19: getfield 69	com/tencent/mm/g/a/lf:ePx	Lcom/tencent/mm/g/a/lf$a;
          //   22: getfield 74	com/tencent/mm/g/a/lf$a:action	I
          //   25: invokestatic 80	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
          //   28: aastore
          //   29: invokestatic 85	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
          //   32: new 87	java/util/HashMap
          //   35: dup
          //   36: invokespecial 88	java/util/HashMap:<init>	()V
          //   39: astore 9
          //   41: aload 9
          //   43: ldc 90
          //   45: aload_1
          //   46: getfield 69	com/tencent/mm/g/a/lf:ePx	Lcom/tencent/mm/g/a/lf$a;
          //   49: getfield 93	com/tencent/mm/g/a/lf$a:state	Ljava/lang/String;
          //   52: invokeinterface 99 3 0
          //   57: pop
          //   58: aload_0
          //   59: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iaJ	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   62: aload_1
          //   63: getfield 69	com/tencent/mm/g/a/lf:ePx	Lcom/tencent/mm/g/a/lf$a;
          //   66: getfield 93	com/tencent/mm/g/a/lf$a:state	Ljava/lang/String;
          //   69: putfield 100	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:state	Ljava/lang/String;
          //   72: aload_1
          //   73: getfield 69	com/tencent/mm/g/a/lf:ePx	Lcom/tencent/mm/g/a/lf$a;
          //   76: getfield 74	com/tencent/mm/g/a/lf$a:action	I
          //   79: iconst_2
          //   80: if_icmpne +55 -> 135
          //   83: aload_0
          //   84: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iaJ	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   87: aload_1
          //   88: getfield 69	com/tencent/mm/g/a/lf:ePx	Lcom/tencent/mm/g/a/lf$a;
          //   91: getfield 103	com/tencent/mm/g/a/lf$a:filePath	Ljava/lang/String;
          //   94: putfield 104	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:filePath	Ljava/lang/String;
          //   97: aload_0
          //   98: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iaJ	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   101: aload_1
          //   102: getfield 69	com/tencent/mm/g/a/lf:ePx	Lcom/tencent/mm/g/a/lf$a;
          //   105: getfield 107	com/tencent/mm/g/a/lf$a:duration	I
          //   108: putfield 108	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:duration	I
          //   111: aload_0
          //   112: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iaJ	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   115: aload_1
          //   116: getfield 69	com/tencent/mm/g/a/lf:ePx	Lcom/tencent/mm/g/a/lf$a;
          //   119: getfield 111	com/tencent/mm/g/a/lf$a:fileSize	I
          //   122: putfield 112	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:fileSize	I
          //   125: aload_0
          //   126: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iaJ	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   129: getfield 115	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:appId	Ljava/lang/String;
          //   132: invokestatic 121	com/tencent/mm/plugin/appbrand/media/b:re	(Ljava/lang/String;)V
          //   135: aload_1
          //   136: getfield 69	com/tencent/mm/g/a/lf:ePx	Lcom/tencent/mm/g/a/lf$a;
          //   139: getfield 74	com/tencent/mm/g/a/lf$a:action	I
          //   142: iconst_4
          //   143: if_icmpne +61 -> 204
          //   146: aload 9
          //   148: ldc 123
          //   150: aload_1
          //   151: getfield 69	com/tencent/mm/g/a/lf:ePx	Lcom/tencent/mm/g/a/lf$a;
          //   154: getfield 125	com/tencent/mm/g/a/lf$a:errCode	I
          //   157: invokestatic 80	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
          //   160: invokeinterface 99 3 0
          //   165: pop
          //   166: ldc 127
          //   168: astore 5
          //   170: aload_1
          //   171: getfield 69	com/tencent/mm/g/a/lf:ePx	Lcom/tencent/mm/g/a/lf$a;
          //   174: getfield 130	com/tencent/mm/g/a/lf$a:eAR	Ljava/lang/String;
          //   177: invokestatic 136	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
          //   180: ifne +12 -> 192
          //   183: aload_1
          //   184: getfield 69	com/tencent/mm/g/a/lf:ePx	Lcom/tencent/mm/g/a/lf$a;
          //   187: getfield 130	com/tencent/mm/g/a/lf$a:eAR	Ljava/lang/String;
          //   190: astore 5
          //   192: aload 9
          //   194: ldc -118
          //   196: aload 5
          //   198: invokeinterface 99 3 0
          //   203: pop
          //   204: aload_1
          //   205: getfield 69	com/tencent/mm/g/a/lf:ePx	Lcom/tencent/mm/g/a/lf$a;
          //   208: getfield 74	com/tencent/mm/g/a/lf$a:action	I
          //   211: iconst_5
          //   212: if_icmpne +236 -> 448
          //   215: aload_1
          //   216: getfield 69	com/tencent/mm/g/a/lf:ePx	Lcom/tencent/mm/g/a/lf$a;
          //   219: getfield 142	com/tencent/mm/g/a/lf$a:ePy	[B
          //   222: ifnull +438 -> 660
          //   225: aload_1
          //   226: getfield 69	com/tencent/mm/g/a/lf:ePx	Lcom/tencent/mm/g/a/lf$a;
          //   229: getfield 142	com/tencent/mm/g/a/lf$a:ePy	[B
          //   232: arraylength
          //   233: ldc -113
          //   235: if_icmple +425 -> 660
          //   238: aload_0
          //   239: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iaJ	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   242: astore 10
          //   244: invokestatic 149	java/lang/System:nanoTime	()J
          //   247: lstore_3
          //   248: aconst_null
          //   249: astore 8
          //   251: aconst_null
          //   252: astore 6
          //   254: aconst_null
          //   255: astore 7
          //   257: aload 6
          //   259: astore 5
          //   261: new 151	java/io/File
          //   264: dup
          //   265: aload 10
          //   267: getfield 154	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iaG	Ljava/lang/String;
          //   270: invokespecial 156	java/io/File:<init>	(Ljava/lang/String;)V
          //   273: astore 11
          //   275: aload 6
          //   277: astore 5
          //   279: ldc 61
          //   281: ldc -98
          //   283: iconst_1
          //   284: anewarray 65	java/lang/Object
          //   287: dup
          //   288: iconst_0
          //   289: aload 10
          //   291: getfield 154	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iaG	Ljava/lang/String;
          //   294: aastore
          //   295: invokestatic 161	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
          //   298: aload 6
          //   300: astore 5
          //   302: aload 11
          //   304: invokevirtual 165	java/io/File:exists	()Z
          //   307: ifne +13 -> 320
          //   310: aload 6
          //   312: astore 5
          //   314: aload 11
          //   316: invokevirtual 168	java/io/File:createNewFile	()Z
          //   319: pop
          //   320: aload 6
          //   322: astore 5
          //   324: new 170	java/io/FileOutputStream
          //   327: dup
          //   328: aload 11
          //   330: invokespecial 173	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
          //   333: astore 6
          //   335: aload 6
          //   337: aload_1
          //   338: getfield 69	com/tencent/mm/g/a/lf:ePx	Lcom/tencent/mm/g/a/lf$a;
          //   341: getfield 142	com/tencent/mm/g/a/lf$a:ePy	[B
          //   344: invokevirtual 177	java/io/FileOutputStream:write	([B)V
          //   347: aload 6
          //   349: invokevirtual 180	java/io/FileOutputStream:close	()V
          //   352: aload 6
          //   354: invokevirtual 180	java/io/FileOutputStream:close	()V
          //   357: ldc 61
          //   359: ldc -74
          //   361: iconst_1
          //   362: anewarray 65	java/lang/Object
          //   365: dup
          //   366: iconst_0
          //   367: invokestatic 149	java/lang/System:nanoTime	()J
          //   370: lload_3
          //   371: lsub
          //   372: invokestatic 187	java/lang/Long:valueOf	(J)Ljava/lang/Long;
          //   375: aastore
          //   376: invokestatic 161	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
          //   379: aload_0
          //   380: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iaJ	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   383: astore 5
          //   385: aload_1
          //   386: getfield 69	com/tencent/mm/g/a/lf:ePx	Lcom/tencent/mm/g/a/lf$a;
          //   389: getfield 142	com/tencent/mm/g/a/lf$a:ePy	[B
          //   392: ifnull +285 -> 677
          //   395: aload_1
          //   396: getfield 69	com/tencent/mm/g/a/lf:ePx	Lcom/tencent/mm/g/a/lf$a;
          //   399: getfield 142	com/tencent/mm/g/a/lf$a:ePy	[B
          //   402: arraylength
          //   403: istore_2
          //   404: aload 5
          //   406: iload_2
          //   407: putfield 190	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iaH	I
          //   410: aload_0
          //   411: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iaJ	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   414: aload_1
          //   415: getfield 69	com/tencent/mm/g/a/lf:ePx	Lcom/tencent/mm/g/a/lf$a;
          //   418: getfield 194	com/tencent/mm/g/a/lf$a:ePz	Z
          //   421: putfield 195	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:ePz	Z
          //   424: ldc 61
          //   426: ldc -59
          //   428: iconst_1
          //   429: anewarray 65	java/lang/Object
          //   432: dup
          //   433: iconst_0
          //   434: aload_0
          //   435: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iaJ	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   438: getfield 190	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iaH	I
          //   441: invokestatic 80	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
          //   444: aastore
          //   445: invokestatic 85	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
          //   448: aload_0
          //   449: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iaJ	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   452: new 199	org/json/JSONObject
          //   455: dup
          //   456: aload 9
          //   458: invokespecial 202	org/json/JSONObject:<init>	(Ljava/util/Map;)V
          //   461: invokevirtual 205	org/json/JSONObject:toString	()Ljava/lang/String;
          //   464: putfield 208	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iae	Ljava/lang/String;
          //   467: aload_0
          //   468: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iaJ	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   471: aload_1
          //   472: getfield 69	com/tencent/mm/g/a/lf:ePx	Lcom/tencent/mm/g/a/lf$a;
          //   475: getfield 74	com/tencent/mm/g/a/lf$a:action	I
          //   478: putfield 209	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:action	I
          //   481: aload_0
          //   482: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iaJ	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   485: invokestatic 212	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:a	(Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;)Z
          //   488: pop
          //   489: ldc2_w 57
          //   492: ldc 59
          //   494: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
          //   497: iconst_1
          //   498: ireturn
          //   499: astore 5
          //   501: ldc 61
          //   503: aload 5
          //   505: ldc 127
          //   507: iconst_0
          //   508: anewarray 65	java/lang/Object
          //   511: invokestatic 216	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
          //   514: goto -157 -> 357
          //   517: astore 5
          //   519: aload 7
          //   521: astore 6
          //   523: aload 5
          //   525: astore 7
          //   527: aload 6
          //   529: astore 5
          //   531: ldc 61
          //   533: aload 7
          //   535: ldc 127
          //   537: iconst_0
          //   538: anewarray 65	java/lang/Object
          //   541: invokestatic 216	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
          //   544: aload 6
          //   546: ifnull -189 -> 357
          //   549: aload 6
          //   551: invokevirtual 180	java/io/FileOutputStream:close	()V
          //   554: goto -197 -> 357
          //   557: astore 5
          //   559: ldc 61
          //   561: aload 5
          //   563: ldc 127
          //   565: iconst_0
          //   566: anewarray 65	java/lang/Object
          //   569: invokestatic 216	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
          //   572: goto -215 -> 357
          //   575: astore 7
          //   577: aload 8
          //   579: astore 6
          //   581: aload 6
          //   583: astore 5
          //   585: ldc 61
          //   587: aload 7
          //   589: ldc 127
          //   591: iconst_0
          //   592: anewarray 65	java/lang/Object
          //   595: invokestatic 216	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
          //   598: aload 6
          //   600: ifnull -243 -> 357
          //   603: aload 6
          //   605: invokevirtual 180	java/io/FileOutputStream:close	()V
          //   608: goto -251 -> 357
          //   611: astore 5
          //   613: ldc 61
          //   615: aload 5
          //   617: ldc 127
          //   619: iconst_0
          //   620: anewarray 65	java/lang/Object
          //   623: invokestatic 216	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
          //   626: goto -269 -> 357
          //   629: astore_1
          //   630: aload 5
          //   632: ifnull +8 -> 640
          //   635: aload 5
          //   637: invokevirtual 180	java/io/FileOutputStream:close	()V
          //   640: aload_1
          //   641: athrow
          //   642: astore 5
          //   644: ldc 61
          //   646: aload 5
          //   648: ldc 127
          //   650: iconst_0
          //   651: anewarray 65	java/lang/Object
          //   654: invokestatic 216	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
          //   657: goto -17 -> 640
          //   660: aload_0
          //   661: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iaJ	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   664: aload_1
          //   665: getfield 69	com/tencent/mm/g/a/lf:ePx	Lcom/tencent/mm/g/a/lf$a;
          //   668: getfield 142	com/tencent/mm/g/a/lf$a:ePy	[B
          //   671: putfield 217	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:ePy	[B
          //   674: goto -295 -> 379
          //   677: iconst_0
          //   678: istore_2
          //   679: goto -275 -> 404
          //   682: astore_1
          //   683: aload 6
          //   685: astore 5
          //   687: goto -57 -> 630
          //   690: astore 7
          //   692: goto -111 -> 581
          //   695: astore 7
          //   697: goto -170 -> 527
          // Local variable table:
          //   start	length	slot	name	signature
          //   0	700	0	this	1
          //   0	700	1	paramAnonymouslf	lf
          //   403	276	2	i	int
          //   247	124	3	l	long
          //   168	237	5	localObject1	Object
          //   499	5	5	localIOException1	java.io.IOException
          //   517	7	5	localFileNotFoundException1	java.io.FileNotFoundException
          //   529	1	5	localObject2	Object
          //   557	5	5	localIOException2	java.io.IOException
          //   583	1	5	localObject3	Object
          //   611	25	5	localIOException3	java.io.IOException
          //   642	5	5	localIOException4	java.io.IOException
          //   685	1	5	localObject4	Object
          //   252	432	6	localObject5	Object
          //   255	279	7	localFileNotFoundException2	java.io.FileNotFoundException
          //   575	13	7	localIOException5	java.io.IOException
          //   690	1	7	localIOException6	java.io.IOException
          //   695	1	7	localFileNotFoundException3	java.io.FileNotFoundException
          //   249	329	8	localObject6	Object
          //   39	418	9	localHashMap	java.util.HashMap
          //   242	48	10	localOperateRecordTask	JsApiOperateRecorder.OperateRecordTask
          //   273	56	11	localFile	java.io.File
          // Exception table:
          //   from	to	target	type
          //   352	357	499	java/io/IOException
          //   261	275	517	java/io/FileNotFoundException
          //   279	298	517	java/io/FileNotFoundException
          //   302	310	517	java/io/FileNotFoundException
          //   314	320	517	java/io/FileNotFoundException
          //   324	335	517	java/io/FileNotFoundException
          //   549	554	557	java/io/IOException
          //   261	275	575	java/io/IOException
          //   279	298	575	java/io/IOException
          //   302	310	575	java/io/IOException
          //   314	320	575	java/io/IOException
          //   324	335	575	java/io/IOException
          //   603	608	611	java/io/IOException
          //   261	275	629	finally
          //   279	298	629	finally
          //   302	310	629	finally
          //   314	320	629	finally
          //   324	335	629	finally
          //   531	544	629	finally
          //   585	598	629	finally
          //   635	640	642	java/io/IOException
          //   335	352	682	finally
          //   335	352	690	java/io/IOException
          //   335	352	695	java/io/FileNotFoundException
        }
      };
      f(paramParcel);
      GMTrace.o(19743964659712L, 147104);
    }
    
    public OperateRecordTask(JsApiOperateRecorder paramJsApiOperateRecorder, j paramj, int paramInt)
    {
      GMTrace.i(19743830441984L, 147103);
      this.hZR = false;
      this.hZP = "";
      this.filePath = "";
      this.fileSize = 0;
      this.duration = 0;
      this.state = "";
      this.iaF = "";
      this.iaI = new com.tencent.mm.sdk.b.c()
      {
        /* Error */
        private boolean a(lf paramAnonymouslf)
        {
          // Byte code:
          //   0: ldc2_w 57
          //   3: ldc 59
          //   5: invokestatic 28	com/tencent/gmtrace/GMTrace:i	(JI)V
          //   8: ldc 61
          //   10: ldc 63
          //   12: iconst_1
          //   13: anewarray 65	java/lang/Object
          //   16: dup
          //   17: iconst_0
          //   18: aload_1
          //   19: getfield 69	com/tencent/mm/g/a/lf:ePx	Lcom/tencent/mm/g/a/lf$a;
          //   22: getfield 74	com/tencent/mm/g/a/lf$a:action	I
          //   25: invokestatic 80	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
          //   28: aastore
          //   29: invokestatic 85	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
          //   32: new 87	java/util/HashMap
          //   35: dup
          //   36: invokespecial 88	java/util/HashMap:<init>	()V
          //   39: astore 9
          //   41: aload 9
          //   43: ldc 90
          //   45: aload_1
          //   46: getfield 69	com/tencent/mm/g/a/lf:ePx	Lcom/tencent/mm/g/a/lf$a;
          //   49: getfield 93	com/tencent/mm/g/a/lf$a:state	Ljava/lang/String;
          //   52: invokeinterface 99 3 0
          //   57: pop
          //   58: aload_0
          //   59: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iaJ	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   62: aload_1
          //   63: getfield 69	com/tencent/mm/g/a/lf:ePx	Lcom/tencent/mm/g/a/lf$a;
          //   66: getfield 93	com/tencent/mm/g/a/lf$a:state	Ljava/lang/String;
          //   69: putfield 100	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:state	Ljava/lang/String;
          //   72: aload_1
          //   73: getfield 69	com/tencent/mm/g/a/lf:ePx	Lcom/tencent/mm/g/a/lf$a;
          //   76: getfield 74	com/tencent/mm/g/a/lf$a:action	I
          //   79: iconst_2
          //   80: if_icmpne +55 -> 135
          //   83: aload_0
          //   84: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iaJ	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   87: aload_1
          //   88: getfield 69	com/tencent/mm/g/a/lf:ePx	Lcom/tencent/mm/g/a/lf$a;
          //   91: getfield 103	com/tencent/mm/g/a/lf$a:filePath	Ljava/lang/String;
          //   94: putfield 104	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:filePath	Ljava/lang/String;
          //   97: aload_0
          //   98: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iaJ	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   101: aload_1
          //   102: getfield 69	com/tencent/mm/g/a/lf:ePx	Lcom/tencent/mm/g/a/lf$a;
          //   105: getfield 107	com/tencent/mm/g/a/lf$a:duration	I
          //   108: putfield 108	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:duration	I
          //   111: aload_0
          //   112: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iaJ	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   115: aload_1
          //   116: getfield 69	com/tencent/mm/g/a/lf:ePx	Lcom/tencent/mm/g/a/lf$a;
          //   119: getfield 111	com/tencent/mm/g/a/lf$a:fileSize	I
          //   122: putfield 112	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:fileSize	I
          //   125: aload_0
          //   126: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iaJ	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   129: getfield 115	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:appId	Ljava/lang/String;
          //   132: invokestatic 121	com/tencent/mm/plugin/appbrand/media/b:re	(Ljava/lang/String;)V
          //   135: aload_1
          //   136: getfield 69	com/tencent/mm/g/a/lf:ePx	Lcom/tencent/mm/g/a/lf$a;
          //   139: getfield 74	com/tencent/mm/g/a/lf$a:action	I
          //   142: iconst_4
          //   143: if_icmpne +61 -> 204
          //   146: aload 9
          //   148: ldc 123
          //   150: aload_1
          //   151: getfield 69	com/tencent/mm/g/a/lf:ePx	Lcom/tencent/mm/g/a/lf$a;
          //   154: getfield 125	com/tencent/mm/g/a/lf$a:errCode	I
          //   157: invokestatic 80	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
          //   160: invokeinterface 99 3 0
          //   165: pop
          //   166: ldc 127
          //   168: astore 5
          //   170: aload_1
          //   171: getfield 69	com/tencent/mm/g/a/lf:ePx	Lcom/tencent/mm/g/a/lf$a;
          //   174: getfield 130	com/tencent/mm/g/a/lf$a:eAR	Ljava/lang/String;
          //   177: invokestatic 136	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
          //   180: ifne +12 -> 192
          //   183: aload_1
          //   184: getfield 69	com/tencent/mm/g/a/lf:ePx	Lcom/tencent/mm/g/a/lf$a;
          //   187: getfield 130	com/tencent/mm/g/a/lf$a:eAR	Ljava/lang/String;
          //   190: astore 5
          //   192: aload 9
          //   194: ldc -118
          //   196: aload 5
          //   198: invokeinterface 99 3 0
          //   203: pop
          //   204: aload_1
          //   205: getfield 69	com/tencent/mm/g/a/lf:ePx	Lcom/tencent/mm/g/a/lf$a;
          //   208: getfield 74	com/tencent/mm/g/a/lf$a:action	I
          //   211: iconst_5
          //   212: if_icmpne +236 -> 448
          //   215: aload_1
          //   216: getfield 69	com/tencent/mm/g/a/lf:ePx	Lcom/tencent/mm/g/a/lf$a;
          //   219: getfield 142	com/tencent/mm/g/a/lf$a:ePy	[B
          //   222: ifnull +438 -> 660
          //   225: aload_1
          //   226: getfield 69	com/tencent/mm/g/a/lf:ePx	Lcom/tencent/mm/g/a/lf$a;
          //   229: getfield 142	com/tencent/mm/g/a/lf$a:ePy	[B
          //   232: arraylength
          //   233: ldc -113
          //   235: if_icmple +425 -> 660
          //   238: aload_0
          //   239: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iaJ	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   242: astore 10
          //   244: invokestatic 149	java/lang/System:nanoTime	()J
          //   247: lstore_3
          //   248: aconst_null
          //   249: astore 8
          //   251: aconst_null
          //   252: astore 6
          //   254: aconst_null
          //   255: astore 7
          //   257: aload 6
          //   259: astore 5
          //   261: new 151	java/io/File
          //   264: dup
          //   265: aload 10
          //   267: getfield 154	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iaG	Ljava/lang/String;
          //   270: invokespecial 156	java/io/File:<init>	(Ljava/lang/String;)V
          //   273: astore 11
          //   275: aload 6
          //   277: astore 5
          //   279: ldc 61
          //   281: ldc -98
          //   283: iconst_1
          //   284: anewarray 65	java/lang/Object
          //   287: dup
          //   288: iconst_0
          //   289: aload 10
          //   291: getfield 154	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iaG	Ljava/lang/String;
          //   294: aastore
          //   295: invokestatic 161	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
          //   298: aload 6
          //   300: astore 5
          //   302: aload 11
          //   304: invokevirtual 165	java/io/File:exists	()Z
          //   307: ifne +13 -> 320
          //   310: aload 6
          //   312: astore 5
          //   314: aload 11
          //   316: invokevirtual 168	java/io/File:createNewFile	()Z
          //   319: pop
          //   320: aload 6
          //   322: astore 5
          //   324: new 170	java/io/FileOutputStream
          //   327: dup
          //   328: aload 11
          //   330: invokespecial 173	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
          //   333: astore 6
          //   335: aload 6
          //   337: aload_1
          //   338: getfield 69	com/tencent/mm/g/a/lf:ePx	Lcom/tencent/mm/g/a/lf$a;
          //   341: getfield 142	com/tencent/mm/g/a/lf$a:ePy	[B
          //   344: invokevirtual 177	java/io/FileOutputStream:write	([B)V
          //   347: aload 6
          //   349: invokevirtual 180	java/io/FileOutputStream:close	()V
          //   352: aload 6
          //   354: invokevirtual 180	java/io/FileOutputStream:close	()V
          //   357: ldc 61
          //   359: ldc -74
          //   361: iconst_1
          //   362: anewarray 65	java/lang/Object
          //   365: dup
          //   366: iconst_0
          //   367: invokestatic 149	java/lang/System:nanoTime	()J
          //   370: lload_3
          //   371: lsub
          //   372: invokestatic 187	java/lang/Long:valueOf	(J)Ljava/lang/Long;
          //   375: aastore
          //   376: invokestatic 161	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
          //   379: aload_0
          //   380: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iaJ	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   383: astore 5
          //   385: aload_1
          //   386: getfield 69	com/tencent/mm/g/a/lf:ePx	Lcom/tencent/mm/g/a/lf$a;
          //   389: getfield 142	com/tencent/mm/g/a/lf$a:ePy	[B
          //   392: ifnull +285 -> 677
          //   395: aload_1
          //   396: getfield 69	com/tencent/mm/g/a/lf:ePx	Lcom/tencent/mm/g/a/lf$a;
          //   399: getfield 142	com/tencent/mm/g/a/lf$a:ePy	[B
          //   402: arraylength
          //   403: istore_2
          //   404: aload 5
          //   406: iload_2
          //   407: putfield 190	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iaH	I
          //   410: aload_0
          //   411: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iaJ	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   414: aload_1
          //   415: getfield 69	com/tencent/mm/g/a/lf:ePx	Lcom/tencent/mm/g/a/lf$a;
          //   418: getfield 194	com/tencent/mm/g/a/lf$a:ePz	Z
          //   421: putfield 195	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:ePz	Z
          //   424: ldc 61
          //   426: ldc -59
          //   428: iconst_1
          //   429: anewarray 65	java/lang/Object
          //   432: dup
          //   433: iconst_0
          //   434: aload_0
          //   435: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iaJ	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   438: getfield 190	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iaH	I
          //   441: invokestatic 80	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
          //   444: aastore
          //   445: invokestatic 85	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
          //   448: aload_0
          //   449: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iaJ	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   452: new 199	org/json/JSONObject
          //   455: dup
          //   456: aload 9
          //   458: invokespecial 202	org/json/JSONObject:<init>	(Ljava/util/Map;)V
          //   461: invokevirtual 205	org/json/JSONObject:toString	()Ljava/lang/String;
          //   464: putfield 208	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iae	Ljava/lang/String;
          //   467: aload_0
          //   468: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iaJ	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   471: aload_1
          //   472: getfield 69	com/tencent/mm/g/a/lf:ePx	Lcom/tencent/mm/g/a/lf$a;
          //   475: getfield 74	com/tencent/mm/g/a/lf$a:action	I
          //   478: putfield 209	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:action	I
          //   481: aload_0
          //   482: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iaJ	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   485: invokestatic 212	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:a	(Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;)Z
          //   488: pop
          //   489: ldc2_w 57
          //   492: ldc 59
          //   494: invokestatic 49	com/tencent/gmtrace/GMTrace:o	(JI)V
          //   497: iconst_1
          //   498: ireturn
          //   499: astore 5
          //   501: ldc 61
          //   503: aload 5
          //   505: ldc 127
          //   507: iconst_0
          //   508: anewarray 65	java/lang/Object
          //   511: invokestatic 216	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
          //   514: goto -157 -> 357
          //   517: astore 5
          //   519: aload 7
          //   521: astore 6
          //   523: aload 5
          //   525: astore 7
          //   527: aload 6
          //   529: astore 5
          //   531: ldc 61
          //   533: aload 7
          //   535: ldc 127
          //   537: iconst_0
          //   538: anewarray 65	java/lang/Object
          //   541: invokestatic 216	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
          //   544: aload 6
          //   546: ifnull -189 -> 357
          //   549: aload 6
          //   551: invokevirtual 180	java/io/FileOutputStream:close	()V
          //   554: goto -197 -> 357
          //   557: astore 5
          //   559: ldc 61
          //   561: aload 5
          //   563: ldc 127
          //   565: iconst_0
          //   566: anewarray 65	java/lang/Object
          //   569: invokestatic 216	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
          //   572: goto -215 -> 357
          //   575: astore 7
          //   577: aload 8
          //   579: astore 6
          //   581: aload 6
          //   583: astore 5
          //   585: ldc 61
          //   587: aload 7
          //   589: ldc 127
          //   591: iconst_0
          //   592: anewarray 65	java/lang/Object
          //   595: invokestatic 216	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
          //   598: aload 6
          //   600: ifnull -243 -> 357
          //   603: aload 6
          //   605: invokevirtual 180	java/io/FileOutputStream:close	()V
          //   608: goto -251 -> 357
          //   611: astore 5
          //   613: ldc 61
          //   615: aload 5
          //   617: ldc 127
          //   619: iconst_0
          //   620: anewarray 65	java/lang/Object
          //   623: invokestatic 216	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
          //   626: goto -269 -> 357
          //   629: astore_1
          //   630: aload 5
          //   632: ifnull +8 -> 640
          //   635: aload 5
          //   637: invokevirtual 180	java/io/FileOutputStream:close	()V
          //   640: aload_1
          //   641: athrow
          //   642: astore 5
          //   644: ldc 61
          //   646: aload 5
          //   648: ldc 127
          //   650: iconst_0
          //   651: anewarray 65	java/lang/Object
          //   654: invokestatic 216	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
          //   657: goto -17 -> 640
          //   660: aload_0
          //   661: getfield 16	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask$1:iaJ	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask;
          //   664: aload_1
          //   665: getfield 69	com/tencent/mm/g/a/lf:ePx	Lcom/tencent/mm/g/a/lf$a;
          //   668: getfield 142	com/tencent/mm/g/a/lf$a:ePy	[B
          //   671: putfield 217	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:ePy	[B
          //   674: goto -295 -> 379
          //   677: iconst_0
          //   678: istore_2
          //   679: goto -275 -> 404
          //   682: astore_1
          //   683: aload 6
          //   685: astore 5
          //   687: goto -57 -> 630
          //   690: astore 7
          //   692: goto -111 -> 581
          //   695: astore 7
          //   697: goto -170 -> 527
          // Local variable table:
          //   start	length	slot	name	signature
          //   0	700	0	this	1
          //   0	700	1	paramAnonymouslf	lf
          //   403	276	2	i	int
          //   247	124	3	l	long
          //   168	237	5	localObject1	Object
          //   499	5	5	localIOException1	java.io.IOException
          //   517	7	5	localFileNotFoundException1	java.io.FileNotFoundException
          //   529	1	5	localObject2	Object
          //   557	5	5	localIOException2	java.io.IOException
          //   583	1	5	localObject3	Object
          //   611	25	5	localIOException3	java.io.IOException
          //   642	5	5	localIOException4	java.io.IOException
          //   685	1	5	localObject4	Object
          //   252	432	6	localObject5	Object
          //   255	279	7	localFileNotFoundException2	java.io.FileNotFoundException
          //   575	13	7	localIOException5	java.io.IOException
          //   690	1	7	localIOException6	java.io.IOException
          //   695	1	7	localFileNotFoundException3	java.io.FileNotFoundException
          //   249	329	8	localObject6	Object
          //   39	418	9	localHashMap	java.util.HashMap
          //   242	48	10	localOperateRecordTask	JsApiOperateRecorder.OperateRecordTask
          //   273	56	11	localFile	java.io.File
          // Exception table:
          //   from	to	target	type
          //   352	357	499	java/io/IOException
          //   261	275	517	java/io/FileNotFoundException
          //   279	298	517	java/io/FileNotFoundException
          //   302	310	517	java/io/FileNotFoundException
          //   314	320	517	java/io/FileNotFoundException
          //   324	335	517	java/io/FileNotFoundException
          //   549	554	557	java/io/IOException
          //   261	275	575	java/io/IOException
          //   279	298	575	java/io/IOException
          //   302	310	575	java/io/IOException
          //   314	320	575	java/io/IOException
          //   324	335	575	java/io/IOException
          //   603	608	611	java/io/IOException
          //   261	275	629	finally
          //   279	298	629	finally
          //   302	310	629	finally
          //   314	320	629	finally
          //   324	335	629	finally
          //   531	544	629	finally
          //   585	598	629	finally
          //   635	640	642	java/io/IOException
          //   335	352	682	finally
          //   335	352	690	java/io/IOException
          //   335	352	695	java/io/FileNotFoundException
        }
      };
      this.iaD = paramJsApiOperateRecorder;
      this.hYK = paramj;
      this.hYL = paramInt;
      this.iaG = com.tencent.mm.plugin.appbrand.appstorage.c.aE(paramj.hyD, "frameBuffer");
      GMTrace.o(19743830441984L, 147103);
    }
    
    public final void RY()
    {
      int i = 0;
      int j = 0;
      GMTrace.i(19744098877440L, 147105);
      Object localObject2;
      try
      {
        JSONObject localJSONObject = new JSONObject(this.iaE);
        localObject2 = localJSONObject.optString("operationType");
        if (TextUtils.isEmpty((CharSequence)localObject2))
        {
          w.e("MicroMsg.JsApiOperateRecorder", "operationType is null");
          this.hZR = true;
          this.action = -1;
          this.hZP = "operationType is null";
          VL();
          GMTrace.o(19744098877440L, 147105);
          return;
        }
      }
      catch (JSONException localJSONException)
      {
        w.e("MicroMsg.JsApiOperateRecorder", "new json exists exception, data is invalid, dataStr:%s", new Object[] { this.iaE });
        this.hZR = true;
        this.action = -1;
        this.hZP = "parser data fail, data is invalid";
        w.e("MicroMsg.JsApiOperateRecorder", "exception:%s" + localJSONException.getMessage());
        VL();
        GMTrace.o(19744098877440L, 147105);
        return;
      }
      w.i("MicroMsg.JsApiOperateRecorder", "operationType;%s", new Object[] { localObject2 });
      this.hZR = false;
      this.action = -1;
      Object localObject1;
      if (((String)localObject2).equals("start"))
      {
        i = localJSONException.optInt("duration", 60000);
        int k = localJSONException.optInt("sampleRate", 44100);
        int m = localJSONException.optInt("numberOfChannels", 2);
        int n = localJSONException.optInt("encodeBitRate", 128000);
        localObject2 = localJSONException.optString("format");
        int i1 = localJSONException.optInt("frameSize", 0);
        b.a(this.appId, this.iaI);
        localObject1 = new RecordParam();
        ((RecordParam)localObject1).duration = i;
        ((RecordParam)localObject1).sampleRate = k;
        ((RecordParam)localObject1).isa = m;
        ((RecordParam)localObject1).isb = n;
        ((RecordParam)localObject1).iaF = ((String)localObject2);
        ((RecordParam)localObject1).scene = 8;
        ((RecordParam)localObject1).isc = i1;
        ((RecordParam)localObject1).fRL = System.currentTimeMillis();
        this.iaF = ((String)localObject2);
        localObject2 = com.tencent.mm.plugin.appbrand.app.e.Sp();
        w.i("MicroMsg.AudioRecordMgr", "startRecord");
        if (((com.tencent.mm.plugin.appbrand.media.d)localObject2).mIsRecording)
        {
          w.e("MicroMsg.AudioRecordMgr", "startRecord fail, is recording");
          i = j;
          if (i == 0) {
            break label822;
          }
          w.i("MicroMsg.JsApiOperateRecorder", "star record ok");
          this.action = -1;
        }
      }
      for (;;)
      {
        if (this.hZR) {
          w.e("MicroMsg.JsApiOperateRecorder", this.hZP);
        }
        VL();
        GMTrace.o(19744098877440L, 147105);
        return;
        if (((com.tencent.mm.plugin.appbrand.media.d)localObject2).isPause())
        {
          w.e("MicroMsg.AudioRecordMgr", "startRecord fail, is pause");
          i = j;
          break;
        }
        if ((TextUtils.isEmpty(((RecordParam)localObject1).iaF)) || (((RecordParam)localObject1).duration < 0) || (((RecordParam)localObject1).isb <= 0) || (((RecordParam)localObject1).sampleRate <= 0) || (((RecordParam)localObject1).isa <= 0)) {}
        for (i = 0;; i = 1)
        {
          if (i != 0) {
            break label519;
          }
          w.e("MicroMsg.AudioRecordMgr", "startRecord fail, param is invalid");
          g.iZ(15);
          i = j;
          break;
        }
        label519:
        if (!com.tencent.mm.plugin.appbrand.media.e.ri(((RecordParam)localObject1).iaF))
        {
          w.e("MicroMsg.AudioRecordMgr", "startRecord fail, encode format %s is not support!", new Object[] { ((RecordParam)localObject1).iaF });
          g.iZ(16);
          i = j;
          break;
        }
        if (TextUtils.isEmpty(((RecordParam)localObject1).fRL)) {
          ((RecordParam)localObject1).fRL = System.currentTimeMillis();
        }
        g.YN();
        w.i("MicroMsg.RecordParamCompatibility", "recordParam duration:%d, numberOfChannels:%d, sampleRate:%d, encodeBitRate:%d", new Object[] { Integer.valueOf(((RecordParam)localObject1).duration), Integer.valueOf(((RecordParam)localObject1).isa), Integer.valueOf(((RecordParam)localObject1).sampleRate), Integer.valueOf(((RecordParam)localObject1).isb) });
        if (((RecordParam)localObject1).duration <= 0)
        {
          ((RecordParam)localObject1).duration = 60000;
          label668:
          if ((((RecordParam)localObject1).isa <= 0) && (((RecordParam)localObject1).isa > 2)) {
            ((RecordParam)localObject1).isa = 2;
          }
          if (((RecordParam)localObject1).sampleRate <= 48000) {
            break label778;
          }
          ((RecordParam)localObject1).sampleRate = 48000;
          label710:
          if (((RecordParam)localObject1).isb <= 320000) {
            break label800;
          }
          ((RecordParam)localObject1).isb = 320000;
        }
        for (;;)
        {
          ((com.tencent.mm.plugin.appbrand.media.d)localObject2).irs = ((RecordParam)localObject1);
          com.tencent.mm.sdk.f.e.post(new d.6((com.tencent.mm.plugin.appbrand.media.d)localObject2), "app_brand_start_record");
          i = 1;
          break;
          if (((RecordParam)localObject1).duration < 600000) {
            break label668;
          }
          ((RecordParam)localObject1).duration = 600000;
          break label668;
          label778:
          if (((RecordParam)localObject1).sampleRate >= 8000) {
            break label710;
          }
          ((RecordParam)localObject1).sampleRate = 8000;
          break label710;
          label800:
          if (((RecordParam)localObject1).isb < 16000) {
            ((RecordParam)localObject1).isb = 16000;
          }
        }
        label822:
        if (com.tencent.mm.plugin.appbrand.app.e.Sp().mIsRecording)
        {
          this.hZR = true;
          this.hZP = "audio is recording, don't start record again";
        }
        else
        {
          this.hZR = true;
          this.hZP = "start record fail";
          continue;
          if (((String)localObject2).equals("resume"))
          {
            localObject1 = com.tencent.mm.plugin.appbrand.app.e.Sp();
            if (((com.tencent.mm.plugin.appbrand.media.d)localObject1).mIsRecording) {
              w.e("MicroMsg.AudioRecordMgr", "resumeRecord fail, is recording");
            }
            for (;;)
            {
              if (i == 0) {
                break label957;
              }
              this.action = -1;
              w.i("MicroMsg.JsApiOperateRecorder", "resume record ok");
              break;
              if (((com.tencent.mm.plugin.appbrand.media.d)localObject1).irs == null)
              {
                w.e("MicroMsg.AudioRecordMgr", "resumeRecord fail, mRecordParam is null");
              }
              else
              {
                g.YN();
                com.tencent.mm.sdk.f.e.post(new d.7((com.tencent.mm.plugin.appbrand.media.d)localObject1), "app_brand_resume_record");
                i = 1;
              }
            }
            label957:
            if (com.tencent.mm.plugin.appbrand.app.e.Sp().mIsRecording)
            {
              this.hZR = true;
              this.hZP = "audio is recording, don't resume record again";
            }
            else
            {
              this.hZR = true;
              this.hZP = "resume record fail";
            }
          }
          else if (((String)localObject2).equals("pause"))
          {
            localObject1 = com.tencent.mm.plugin.appbrand.app.e.Sp();
            w.i("MicroMsg.AudioRecordMgr", "pauseRecord");
            if (((com.tencent.mm.plugin.appbrand.media.d)localObject1).irq == null)
            {
              w.e("MicroMsg.AudioRecordMgr", "mRecord is null");
              i = 0;
            }
            for (;;)
            {
              if (i == 0) {
                break label1102;
              }
              this.action = -1;
              w.i("MicroMsg.JsApiOperateRecorder", "pause record ok");
              break;
              if (((com.tencent.mm.plugin.appbrand.media.d)localObject1).isPause())
              {
                w.e("MicroMsg.AudioRecordMgr", "is paused, don't pause again");
                i = 1;
              }
              else
              {
                com.tencent.mm.sdk.f.e.post(new d.8((com.tencent.mm.plugin.appbrand.media.d)localObject1), "app_brand_pause_record");
                i = 1;
              }
            }
            label1102:
            if (com.tencent.mm.plugin.appbrand.app.e.Sp().isPause())
            {
              this.hZR = true;
              this.hZP = "audio is pause, don't pause record again";
            }
            else
            {
              this.hZR = true;
              this.hZP = "pause record fail";
            }
          }
          else if (((String)localObject2).equals("stop"))
          {
            if (com.tencent.mm.plugin.appbrand.app.e.Sp().qn())
            {
              this.action = -1;
              w.i("MicroMsg.JsApiOperateRecorder", "stop record ok");
            }
            else if (com.tencent.mm.plugin.appbrand.app.e.Sp().bwb())
            {
              this.hZR = true;
              this.hZP = "audio is stop, don't stop record again";
            }
            else
            {
              this.hZR = true;
              this.hZP = "stop record fail";
            }
          }
          else
          {
            w.e("MicroMsg.JsApiOperateRecorder", "operationType is invalid");
            this.hZR = true;
            this.hZP = "operationType is invalid";
          }
        }
      }
    }
    
    /* Error */
    public final void VK()
    {
      // Byte code:
      //   0: ldc2_w 398
      //   3: ldc_w 400
      //   6: invokestatic 54	com/tencent/gmtrace/GMTrace:i	(JI)V
      //   9: aload_0
      //   10: getfield 100	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:hYK	Lcom/tencent/mm/plugin/appbrand/j;
      //   13: ifnonnull +21 -> 34
      //   16: ldc -103
      //   18: ldc_w 402
      //   21: invokestatic 161	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   24: ldc2_w 398
      //   27: ldc_w 400
      //   30: invokestatic 62	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   33: return
      //   34: aload_0
      //   35: getfield 163	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:action	I
      //   38: iconst_m1
      //   39: if_icmpne +118 -> 157
      //   42: aload_0
      //   43: getfield 70	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:hZR	Z
      //   46: ifne +43 -> 89
      //   49: ldc -103
      //   51: ldc_w 404
      //   54: invokestatic 269	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
      //   57: aload_0
      //   58: getfield 100	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:hYK	Lcom/tencent/mm/plugin/appbrand/j;
      //   61: aload_0
      //   62: getfield 102	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:hYL	I
      //   65: aload_0
      //   66: getfield 98	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iaD	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder;
      //   69: ldc_w 406
      //   72: aconst_null
      //   73: invokevirtual 412	com/tencent/mm/plugin/appbrand/jsapi/d:d	(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
      //   76: invokevirtual 416	com/tencent/mm/plugin/appbrand/j:v	(ILjava/lang/String;)V
      //   79: ldc2_w 398
      //   82: ldc_w 400
      //   85: invokestatic 62	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   88: return
      //   89: ldc -103
      //   91: ldc_w 418
      //   94: iconst_1
      //   95: anewarray 167	java/lang/Object
      //   98: dup
      //   99: iconst_0
      //   100: aload_0
      //   101: getfield 74	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:hZP	Ljava/lang/String;
      //   104: aastore
      //   105: invokestatic 170	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   108: aload_0
      //   109: getfield 100	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:hYK	Lcom/tencent/mm/plugin/appbrand/j;
      //   112: aload_0
      //   113: getfield 102	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:hYL	I
      //   116: aload_0
      //   117: getfield 98	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iaD	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder;
      //   120: new 174	java/lang/StringBuilder
      //   123: dup
      //   124: ldc_w 420
      //   127: invokespecial 177	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   130: aload_0
      //   131: getfield 74	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:hZP	Ljava/lang/String;
      //   134: invokevirtual 185	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   137: invokevirtual 188	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   140: aconst_null
      //   141: invokevirtual 412	com/tencent/mm/plugin/appbrand/jsapi/d:d	(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
      //   144: invokevirtual 416	com/tencent/mm/plugin/appbrand/j:v	(ILjava/lang/String;)V
      //   147: ldc2_w 398
      //   150: ldc_w 400
      //   153: invokestatic 62	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   156: return
      //   157: new 422	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$a
      //   160: dup
      //   161: invokespecial 423	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$a:<init>	()V
      //   164: astore 8
      //   166: aload_0
      //   167: getfield 163	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:action	I
      //   170: tableswitch	default:+34->204, 0:+510->680, 1:+510->680, 2:+532->702, 3:+532->702, 4:+532->702
      //   204: aload_0
      //   205: getfield 163	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:action	I
      //   208: iconst_2
      //   209: if_icmpne +174 -> 383
      //   212: new 425	java/util/HashMap
      //   215: dup
      //   216: invokespecial 426	java/util/HashMap:<init>	()V
      //   219: astore 4
      //   221: aload 4
      //   223: ldc_w 427
      //   226: aload_0
      //   227: getfield 82	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:state	Ljava/lang/String;
      //   230: invokeinterface 433 3 0
      //   235: pop
      //   236: ldc -103
      //   238: ldc_w 435
      //   241: iconst_2
      //   242: anewarray 167	java/lang/Object
      //   245: dup
      //   246: iconst_0
      //   247: aload_0
      //   248: getfield 76	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:filePath	Ljava/lang/String;
      //   251: aastore
      //   252: dup
      //   253: iconst_1
      //   254: aload_0
      //   255: getfield 84	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iaF	Ljava/lang/String;
      //   258: aastore
      //   259: invokestatic 192	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   262: aload_0
      //   263: getfield 100	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:hYK	Lcom/tencent/mm/plugin/appbrand/j;
      //   266: getfield 107	com/tencent/mm/plugin/appbrand/j:hyD	Ljava/lang/String;
      //   269: astore 5
      //   271: aload_0
      //   272: getfield 76	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:filePath	Ljava/lang/String;
      //   275: astore 6
      //   277: aload_0
      //   278: getfield 84	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iaF	Ljava/lang/String;
      //   281: astore_3
      //   282: aload_3
      //   283: invokestatic 151	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
      //   286: ifne +488 -> 774
      //   289: ldc_w 437
      //   292: aload_3
      //   293: invokevirtual 440	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
      //   296: ifeq +444 -> 740
      //   299: ldc_w 442
      //   302: astore_3
      //   303: aload 5
      //   305: aload 6
      //   307: aload_3
      //   308: iconst_0
      //   309: invokestatic 446	com/tencent/mm/plugin/appbrand/appstorage/c:b	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/tencent/mm/plugin/appbrand/appstorage/AppBrandLocalMediaObject;
      //   312: astore_3
      //   313: aload_3
      //   314: ifnull +466 -> 780
      //   317: aload 4
      //   319: ldc_w 448
      //   322: aload_3
      //   323: getfield 453	com/tencent/mm/plugin/appbrand/appstorage/AppBrandLocalMediaObject:eHy	Ljava/lang/String;
      //   326: invokeinterface 433 3 0
      //   331: pop
      //   332: aload 4
      //   334: ldc -55
      //   336: aload_0
      //   337: getfield 80	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:duration	I
      //   340: invokestatic 312	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   343: invokeinterface 433 3 0
      //   348: pop
      //   349: aload 4
      //   351: ldc_w 454
      //   354: aload_0
      //   355: getfield 78	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:fileSize	I
      //   358: invokestatic 312	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   361: invokeinterface 433 3 0
      //   366: pop
      //   367: aload_0
      //   368: new 134	org/json/JSONObject
      //   371: dup
      //   372: aload 4
      //   374: invokespecial 457	org/json/JSONObject:<init>	(Ljava/util/Map;)V
      //   377: invokevirtual 458	org/json/JSONObject:toString	()Ljava/lang/String;
      //   380: putfield 460	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iae	Ljava/lang/String;
      //   383: aload_0
      //   384: getfield 163	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:action	I
      //   387: iconst_5
      //   388: if_icmpne +230 -> 618
      //   391: new 425	java/util/HashMap
      //   394: dup
      //   395: invokespecial 426	java/util/HashMap:<init>	()V
      //   398: astore 9
      //   400: aload 9
      //   402: ldc_w 427
      //   405: aload_0
      //   406: getfield 82	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:state	Ljava/lang/String;
      //   409: invokeinterface 433 3 0
      //   414: pop
      //   415: aload 9
      //   417: ldc_w 462
      //   420: aload_0
      //   421: getfield 464	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:ePz	Z
      //   424: invokestatic 469	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
      //   427: invokeinterface 433 3 0
      //   432: pop
      //   433: aload_0
      //   434: getfield 471	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iaH	I
      //   437: ldc_w 472
      //   440: if_icmple +124 -> 564
      //   443: invokestatic 475	java/lang/System:nanoTime	()J
      //   446: lstore_1
      //   447: aconst_null
      //   448: astore 5
      //   450: aconst_null
      //   451: astore 4
      //   453: aconst_null
      //   454: astore 7
      //   456: new 477	java/io/File
      //   459: dup
      //   460: aload_0
      //   461: getfield 117	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iaG	Ljava/lang/String;
      //   464: invokespecial 478	java/io/File:<init>	(Ljava/lang/String;)V
      //   467: astore_3
      //   468: aload 4
      //   470: astore 5
      //   472: aload_3
      //   473: astore 6
      //   475: aload_3
      //   476: invokevirtual 481	java/io/File:exists	()Z
      //   479: ifeq +325 -> 804
      //   482: aload 4
      //   484: astore 5
      //   486: aload_3
      //   487: astore 6
      //   489: new 483	java/io/FileInputStream
      //   492: dup
      //   493: aload_3
      //   494: invokespecial 486	java/io/FileInputStream:<init>	(Ljava/io/File;)V
      //   497: astore 4
      //   499: aload_0
      //   500: aload_0
      //   501: getfield 471	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iaH	I
      //   504: newarray <illegal type>
      //   506: putfield 488	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:ePy	[B
      //   509: aload 4
      //   511: aload_0
      //   512: getfield 488	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:ePy	[B
      //   515: invokevirtual 492	java/io/FileInputStream:read	([B)I
      //   518: pop
      //   519: aload 4
      //   521: invokevirtual 495	java/io/FileInputStream:close	()V
      //   524: aload 4
      //   526: invokevirtual 495	java/io/FileInputStream:close	()V
      //   529: aload_3
      //   530: invokevirtual 481	java/io/File:exists	()Z
      //   533: ifeq +330 -> 863
      //   536: aload_3
      //   537: invokevirtual 498	java/io/File:delete	()Z
      //   540: pop
      //   541: ldc -103
      //   543: ldc_w 500
      //   546: iconst_1
      //   547: anewarray 167	java/lang/Object
      //   550: dup
      //   551: iconst_0
      //   552: invokestatic 475	java/lang/System:nanoTime	()J
      //   555: lload_1
      //   556: lsub
      //   557: invokestatic 505	java/lang/Long:valueOf	(J)Ljava/lang/Long;
      //   560: aastore
      //   561: invokestatic 507	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   564: aload_0
      //   565: getfield 488	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:ePy	[B
      //   568: ifnull +527 -> 1095
      //   571: aload 9
      //   573: ldc 109
      //   575: aload_0
      //   576: getfield 488	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:ePy	[B
      //   579: invokestatic 513	java/nio/ByteBuffer:wrap	([B)Ljava/nio/ByteBuffer;
      //   582: invokeinterface 433 3 0
      //   587: pop
      //   588: aload_0
      //   589: getfield 100	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:hYK	Lcom/tencent/mm/plugin/appbrand/j;
      //   592: aload 9
      //   594: aload 8
      //   596: invokestatic 518	com/tencent/mm/plugin/appbrand/o/l:a	(Lcom/tencent/mm/plugin/appbrand/j;Ljava/util/Map;Lcom/tencent/mm/plugin/appbrand/jsapi/b;)Z
      //   599: ifeq +19 -> 618
      //   602: aload_0
      //   603: new 134	org/json/JSONObject
      //   606: dup
      //   607: aload 9
      //   609: invokespecial 457	org/json/JSONObject:<init>	(Ljava/util/Map;)V
      //   612: invokevirtual 458	org/json/JSONObject:toString	()Ljava/lang/String;
      //   615: putfield 460	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iae	Ljava/lang/String;
      //   618: ldc -103
      //   620: ldc_w 520
      //   623: iconst_2
      //   624: anewarray 167	java/lang/Object
      //   627: dup
      //   628: iconst_0
      //   629: aload_0
      //   630: getfield 163	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:action	I
      //   633: invokestatic 312	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
      //   636: aastore
      //   637: dup
      //   638: iconst_1
      //   639: aload_0
      //   640: getfield 460	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iae	Ljava/lang/String;
      //   643: aastore
      //   644: invokestatic 192	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
      //   647: aload 8
      //   649: aload_0
      //   650: getfield 100	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:hYK	Lcom/tencent/mm/plugin/appbrand/j;
      //   653: invokevirtual 523	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$a:a	(Lcom/tencent/mm/plugin/appbrand/jsapi/c;)Lcom/tencent/mm/plugin/appbrand/jsapi/e;
      //   656: astore_3
      //   657: aload_3
      //   658: aload_0
      //   659: getfield 460	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iae	Ljava/lang/String;
      //   662: putfield 528	com/tencent/mm/plugin/appbrand/jsapi/e:mData	Ljava/lang/String;
      //   665: aload_3
      //   666: invokevirtual 531	com/tencent/mm/plugin/appbrand/jsapi/e:VR	()Z
      //   669: pop
      //   670: ldc2_w 398
      //   673: ldc_w 400
      //   676: invokestatic 62	com/tencent/gmtrace/GMTrace:o	(JI)V
      //   679: return
      //   680: aload_0
      //   681: getfield 98	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iaD	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder;
      //   684: iconst_1
      //   685: invokevirtual 535	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder:cd	(Z)V
      //   688: aload_0
      //   689: getfield 220	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:appId	Ljava/lang/String;
      //   692: aload_0
      //   693: getfield 537	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:ial	Lcom/tencent/mm/plugin/appbrand/c$b;
      //   696: invokestatic 542	com/tencent/mm/plugin/appbrand/c:a	(Ljava/lang/String;Lcom/tencent/mm/plugin/appbrand/c$b;)V
      //   699: goto -495 -> 204
      //   702: aload_0
      //   703: getfield 98	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:iaD	Lcom/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder;
      //   706: iconst_0
      //   707: invokevirtual 535	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder:cd	(Z)V
      //   710: aload_0
      //   711: getfield 163	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:action	I
      //   714: iconst_2
      //   715: if_icmpeq +11 -> 726
      //   718: aload_0
      //   719: getfield 163	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:action	I
      //   722: iconst_4
      //   723: if_icmpne -519 -> 204
      //   726: aload_0
      //   727: getfield 220	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:appId	Ljava/lang/String;
      //   730: aload_0
      //   731: getfield 537	com/tencent/mm/plugin/appbrand/jsapi/audio/JsApiOperateRecorder$OperateRecordTask:ial	Lcom/tencent/mm/plugin/appbrand/c$b;
      //   734: invokestatic 544	com/tencent/mm/plugin/appbrand/c:b	(Ljava/lang/String;Lcom/tencent/mm/plugin/appbrand/c$b;)V
      //   737: goto -533 -> 204
      //   740: ldc_w 546
      //   743: aload_3
      //   744: invokevirtual 440	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
      //   747: ifeq +10 -> 757
      //   750: ldc_w 546
      //   753: astore_3
      //   754: goto -451 -> 303
      //   757: ldc_w 548
      //   760: aload_3
      //   761: invokevirtual 440	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
      //   764: ifeq +10 -> 774
      //   767: ldc_w 548
      //   770: astore_3
      //   771: goto -468 -> 303
      //   774: ldc 72
      //   776: astore_3
      //   777: goto -474 -> 303
      //   780: ldc -103
      //   782: ldc_w 550
      //   785: invokestatic 161	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   788: aload 4
      //   790: ldc_w 448
      //   793: ldc 72
      //   795: invokeinterface 433 3 0
      //   800: pop
      //   801: goto -469 -> 332
      //   804: aload 4
      //   806: astore 5
      //   808: aload_3
      //   809: astore 6
      //   811: ldc -103
      //   813: ldc_w 552
      //   816: invokestatic 161	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   819: aload_3
      //   820: invokevirtual 481	java/io/File:exists	()Z
      //   823: ifeq +11 -> 834
      //   826: aload_3
      //   827: invokevirtual 498	java/io/File:delete	()Z
      //   830: pop
      //   831: goto -267 -> 564
      //   834: ldc -103
      //   836: ldc_w 554
      //   839: invokestatic 161	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   842: goto -278 -> 564
      //   845: astore 4
      //   847: ldc -103
      //   849: aload 4
      //   851: ldc 72
      //   853: iconst_0
      //   854: anewarray 167	java/lang/Object
      //   857: invokestatic 558	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   860: goto -331 -> 529
      //   863: ldc -103
      //   865: ldc_w 554
      //   868: invokestatic 161	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   871: goto -330 -> 541
      //   874: astore 5
      //   876: aconst_null
      //   877: astore 4
      //   879: aconst_null
      //   880: astore_3
      //   881: ldc -103
      //   883: aload 5
      //   885: ldc 72
      //   887: iconst_0
      //   888: anewarray 167	java/lang/Object
      //   891: invokestatic 558	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   894: aload_3
      //   895: ifnull +7 -> 902
      //   898: aload_3
      //   899: invokevirtual 495	java/io/FileInputStream:close	()V
      //   902: aload 4
      //   904: ifnull +36 -> 940
      //   907: aload 4
      //   909: invokevirtual 481	java/io/File:exists	()Z
      //   912: ifeq +28 -> 940
      //   915: aload 4
      //   917: invokevirtual 498	java/io/File:delete	()Z
      //   920: pop
      //   921: goto -380 -> 541
      //   924: astore_3
      //   925: ldc -103
      //   927: aload_3
      //   928: ldc 72
      //   930: iconst_0
      //   931: anewarray 167	java/lang/Object
      //   934: invokestatic 558	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   937: goto -35 -> 902
      //   940: ldc -103
      //   942: ldc_w 554
      //   945: invokestatic 161	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   948: goto -407 -> 541
      //   951: astore 4
      //   953: aconst_null
      //   954: astore_3
      //   955: aload 7
      //   957: astore 5
      //   959: aload_3
      //   960: astore 6
      //   962: ldc -103
      //   964: aload 4
      //   966: ldc 72
      //   968: iconst_0
      //   969: anewarray 167	java/lang/Object
      //   972: invokestatic 558	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   975: aload 7
      //   977: ifnull +8 -> 985
      //   980: aload 7
      //   982: invokevirtual 495	java/io/FileInputStream:close	()V
      //   985: aload_3
      //   986: ifnull +36 -> 1022
      //   989: aload_3
      //   990: invokevirtual 481	java/io/File:exists	()Z
      //   993: ifeq +29 -> 1022
      //   996: aload_3
      //   997: invokevirtual 498	java/io/File:delete	()Z
      //   1000: pop
      //   1001: goto -460 -> 541
      //   1004: astore 4
      //   1006: ldc -103
      //   1008: aload 4
      //   1010: ldc 72
      //   1012: iconst_0
      //   1013: anewarray 167	java/lang/Object
      //   1016: invokestatic 558	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   1019: goto -34 -> 985
      //   1022: ldc -103
      //   1024: ldc_w 554
      //   1027: invokestatic 161	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   1030: goto -489 -> 541
      //   1033: astore 4
      //   1035: aconst_null
      //   1036: astore_3
      //   1037: aload 5
      //   1039: ifnull +8 -> 1047
      //   1042: aload 5
      //   1044: invokevirtual 495	java/io/FileInputStream:close	()V
      //   1047: aload_3
      //   1048: ifnull +36 -> 1084
      //   1051: aload_3
      //   1052: invokevirtual 481	java/io/File:exists	()Z
      //   1055: ifeq +29 -> 1084
      //   1058: aload_3
      //   1059: invokevirtual 498	java/io/File:delete	()Z
      //   1062: pop
      //   1063: aload 4
      //   1065: athrow
      //   1066: astore 5
      //   1068: ldc -103
      //   1070: aload 5
      //   1072: ldc 72
      //   1074: iconst_0
      //   1075: anewarray 167	java/lang/Object
      //   1078: invokestatic 558	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   1081: goto -34 -> 1047
      //   1084: ldc -103
      //   1086: ldc_w 554
      //   1089: invokestatic 161	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   1092: goto -29 -> 1063
      //   1095: ldc -103
      //   1097: ldc_w 560
      //   1100: invokestatic 161	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
      //   1103: goto -515 -> 588
      //   1106: astore 4
      //   1108: aload 6
      //   1110: astore_3
      //   1111: goto -74 -> 1037
      //   1114: astore 6
      //   1116: aload 4
      //   1118: astore 5
      //   1120: aload 6
      //   1122: astore 4
      //   1124: goto -87 -> 1037
      //   1127: astore 5
      //   1129: aload 4
      //   1131: astore 6
      //   1133: aload 5
      //   1135: astore 4
      //   1137: aload_3
      //   1138: astore 5
      //   1140: aload 6
      //   1142: astore_3
      //   1143: goto -106 -> 1037
      //   1146: astore 4
      //   1148: goto -193 -> 955
      //   1151: astore 5
      //   1153: aload 4
      //   1155: astore 7
      //   1157: aload 5
      //   1159: astore 4
      //   1161: goto -206 -> 955
      //   1164: astore 5
      //   1166: aconst_null
      //   1167: astore 6
      //   1169: aload_3
      //   1170: astore 4
      //   1172: aload 6
      //   1174: astore_3
      //   1175: goto -294 -> 881
      //   1178: astore 5
      //   1180: aload_3
      //   1181: astore 6
      //   1183: aload 4
      //   1185: astore_3
      //   1186: aload 6
      //   1188: astore 4
      //   1190: goto -309 -> 881
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	1193	0	this	OperateRecordTask
      //   446	110	1	l	long
      //   281	618	3	localObject1	Object
      //   924	4	3	localIOException1	java.io.IOException
      //   954	232	3	localObject2	Object
      //   219	586	4	localObject3	Object
      //   845	5	4	localIOException2	java.io.IOException
      //   877	39	4	localObject4	Object
      //   951	14	4	localIOException3	java.io.IOException
      //   1004	5	4	localIOException4	java.io.IOException
      //   1033	31	4	localObject5	Object
      //   1106	11	4	localObject6	Object
      //   1122	14	4	localObject7	Object
      //   1146	8	4	localIOException5	java.io.IOException
      //   1159	30	4	localObject8	Object
      //   269	538	5	localObject9	Object
      //   874	10	5	localFileNotFoundException1	java.io.FileNotFoundException
      //   957	86	5	localObject10	Object
      //   1066	5	5	localIOException6	java.io.IOException
      //   1118	1	5	localObject11	Object
      //   1127	7	5	localObject12	Object
      //   1138	1	5	localObject13	Object
      //   1151	7	5	localIOException7	java.io.IOException
      //   1164	1	5	localFileNotFoundException2	java.io.FileNotFoundException
      //   1178	1	5	localFileNotFoundException3	java.io.FileNotFoundException
      //   275	834	6	localObject14	Object
      //   1114	7	6	localObject15	Object
      //   1131	56	6	localObject16	Object
      //   454	702	7	localIOException8	java.io.IOException
      //   164	484	8	locala	JsApiOperateRecorder.a
      //   398	210	9	localHashMap	java.util.HashMap
      // Exception table:
      //   from	to	target	type
      //   524	529	845	java/io/IOException
      //   456	468	874	java/io/FileNotFoundException
      //   898	902	924	java/io/IOException
      //   456	468	951	java/io/IOException
      //   980	985	1004	java/io/IOException
      //   456	468	1033	finally
      //   1042	1047	1066	java/io/IOException
      //   475	482	1106	finally
      //   489	499	1106	finally
      //   811	819	1106	finally
      //   962	975	1106	finally
      //   499	524	1114	finally
      //   881	894	1127	finally
      //   475	482	1146	java/io/IOException
      //   489	499	1146	java/io/IOException
      //   811	819	1146	java/io/IOException
      //   499	524	1151	java/io/IOException
      //   475	482	1164	java/io/FileNotFoundException
      //   489	499	1164	java/io/FileNotFoundException
      //   811	819	1164	java/io/FileNotFoundException
      //   499	524	1178	java/io/FileNotFoundException
    }
    
    public final void f(Parcel paramParcel)
    {
      boolean bool2 = true;
      GMTrace.i(19744367312896L, 147107);
      this.appId = paramParcel.readString();
      this.iaE = paramParcel.readString();
      if (paramParcel.readInt() == 1)
      {
        bool1 = true;
        this.hZR = bool1;
        this.hZP = paramParcel.readString();
        this.iae = paramParcel.readString();
        this.action = paramParcel.readInt();
        this.filePath = paramParcel.readString();
        this.fileSize = paramParcel.readInt();
        this.duration = paramParcel.readInt();
        this.state = paramParcel.readString();
        this.iaF = paramParcel.readString();
        this.ePy = paramParcel.createByteArray();
        this.iaH = paramParcel.readInt();
        if (paramParcel.readByte() != 1) {
          break label160;
        }
      }
      label160:
      for (boolean bool1 = bool2;; bool1 = false)
      {
        this.ePz = bool1;
        this.iaG = paramParcel.readString();
        GMTrace.o(19744367312896L, 147107);
        return;
        bool1 = false;
        break;
      }
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      int i = 1;
      GMTrace.i(19744501530624L, 147108);
      paramParcel.writeString(this.appId);
      paramParcel.writeString(this.iaE);
      if (this.hZR)
      {
        paramInt = 1;
        paramParcel.writeInt(paramInt);
        paramParcel.writeString(this.hZP);
        paramParcel.writeString(this.iae);
        paramParcel.writeInt(this.action);
        paramParcel.writeString(this.filePath);
        paramParcel.writeInt(this.fileSize);
        paramParcel.writeInt(this.duration);
        paramParcel.writeString(this.state);
        paramParcel.writeString(this.iaF);
        paramParcel.writeByteArray(this.ePy);
        paramParcel.writeInt(this.iaH);
        if (!this.ePz) {
          break label159;
        }
      }
      label159:
      for (paramInt = i;; paramInt = 0)
      {
        paramParcel.writeByte((byte)paramInt);
        paramParcel.writeString(this.iaG);
        GMTrace.o(19744501530624L, 147108);
        return;
        paramInt = 0;
        break;
      }
    }
  }
  
  public static final class a
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    private static final int CTRL_INDEX = 296;
    private static final String NAME = "onRecorderStateChange";
    
    public a()
    {
      GMTrace.i(19731482411008L, 147011);
      GMTrace.o(19731482411008L, 147011);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\audio\JsApiOperateRecorder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */