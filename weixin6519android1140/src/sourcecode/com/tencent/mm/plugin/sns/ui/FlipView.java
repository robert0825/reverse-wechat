package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.WindowManager;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.a.ak;
import com.tencent.mm.g.a.al;
import com.tencent.mm.g.a.bz;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.g.a.dh;
import com.tencent.mm.g.a.dh.b;
import com.tencent.mm.g.a.kb;
import com.tencent.mm.g.a.mk;
import com.tencent.mm.g.a.mm;
import com.tencent.mm.g.a.ph;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ai;
import com.tencent.mm.plugin.sns.model.am;
import com.tencent.mm.plugin.sns.model.b.b;
import com.tencent.mm.plugin.sns.storage.u;
import com.tencent.mm.pluginsdk.ui.tools.k;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.an;
import com.tencent.mm.ui.base.g;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.widget.f;
import com.tencent.mm.ui.widget.f.a;
import com.tencent.mm.y.q;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class FlipView
  extends LinearLayout
  implements View.OnTouchListener, b.b
{
  Context context;
  private int eDg;
  private int eDh;
  private long goZ;
  protected com.tencent.mm.sdk.platformtools.ae handler;
  protected int infoType;
  float lYe;
  float lYf;
  boolean lYg;
  float lYh;
  private c leg;
  private double pSa;
  private double pSb;
  protected v pSc;
  protected t.a pSd;
  protected int pSe;
  protected int pSf;
  private boolean pSg;
  private long pSh;
  boolean pSi;
  private f pSj;
  private String pSk;
  private String pSl;
  private String pSm;
  private String pSn;
  private boolean pSo;
  private a pSp;
  private c pSq;
  
  public FlipView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(8415585763328L, 62701);
    this.infoType = -1;
    this.pSa = 0.0D;
    this.pSb = 0.0D;
    this.goZ = 0L;
    this.pSg = false;
    this.pSh = 0L;
    this.pSi = false;
    this.pSo = false;
    this.pSp = new a();
    this.lYe = 0.0F;
    this.lYf = 0.0F;
    this.lYg = false;
    this.lYh = 1.0F;
    this.leg = new c() {};
    this.pSq = new c() {};
    init(paramContext);
    GMTrace.o(8415585763328L, 62701);
  }
  
  public FlipView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8415451545600L, 62700);
    this.infoType = -1;
    this.pSa = 0.0D;
    this.pSb = 0.0D;
    this.goZ = 0L;
    this.pSg = false;
    this.pSh = 0L;
    this.pSi = false;
    this.pSo = false;
    this.pSp = new a();
    this.lYe = 0.0F;
    this.lYf = 0.0F;
    this.lYg = false;
    this.lYh = 1.0F;
    this.leg = new c() {};
    this.pSq = new c() {};
    init(paramContext);
    GMTrace.o(8415451545600L, 62700);
  }
  
  /* Error */
  public static String f(String paramString, Context paramContext)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: ldc2_w 228
    //   5: ldc -26
    //   7: invokestatic 77	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: aload_0
    //   11: ifnull +356 -> 367
    //   14: aload_0
    //   15: ldc -24
    //   17: invokevirtual 238	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   20: ifne +347 -> 367
    //   23: new 240	java/lang/StringBuilder
    //   26: dup
    //   27: invokespecial 241	java/lang/StringBuilder:<init>	()V
    //   30: getstatic 246	com/tencent/mm/compatible/util/e:fRZ	Ljava/lang/String;
    //   33: invokevirtual 250	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   36: ldc -4
    //   38: iconst_3
    //   39: anewarray 254	java/lang/Object
    //   42: dup
    //   43: iconst_0
    //   44: ldc_w 256
    //   47: aastore
    //   48: dup
    //   49: iconst_1
    //   50: aload_0
    //   51: invokevirtual 260	java/lang/String:hashCode	()I
    //   54: invokestatic 266	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   57: aastore
    //   58: dup
    //   59: iconst_2
    //   60: ldc_w 268
    //   63: aastore
    //   64: invokestatic 272	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   67: invokevirtual 250	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   70: invokevirtual 276	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   73: astore 7
    //   75: new 278	java/io/File
    //   78: dup
    //   79: invokestatic 284	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   82: invokevirtual 290	android/content/Context:getCacheDir	()Ljava/io/File;
    //   85: new 240	java/lang/StringBuilder
    //   88: dup
    //   89: ldc_w 292
    //   92: invokespecial 294	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   95: invokestatic 300	java/lang/System:currentTimeMillis	()J
    //   98: invokevirtual 303	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   101: invokevirtual 276	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   104: invokespecial 306	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   107: invokevirtual 309	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   110: astore 6
    //   112: aload_0
    //   113: aload 6
    //   115: invokestatic 314	com/tencent/mm/modelsfs/FileOp:o	(Ljava/lang/String;Ljava/lang/String;)J
    //   118: lconst_0
    //   119: lcmp
    //   120: ifge +13 -> 133
    //   123: ldc2_w 228
    //   126: ldc -26
    //   128: invokestatic 118	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   131: aconst_null
    //   132: areturn
    //   133: aload 6
    //   135: invokestatic 320	com/tencent/mm/sdk/platformtools/MMNativeJpeg:isProgressive	(Ljava/lang/String;)Z
    //   138: ifeq +277 -> 415
    //   141: aload 6
    //   143: invokestatic 324	com/tencent/mm/sdk/platformtools/MMNativeJpeg:decodeAsBitmap	(Ljava/lang/String;)Landroid/graphics/Bitmap;
    //   146: astore 5
    //   148: aload 5
    //   150: ifnull +257 -> 407
    //   153: getstatic 330	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   156: astore 8
    //   158: new 332	java/io/FileOutputStream
    //   161: dup
    //   162: aload 7
    //   164: invokespecial 333	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   167: astore 4
    //   169: aload 4
    //   171: astore_3
    //   172: aload 5
    //   174: aload 8
    //   176: bipush 80
    //   178: aload 4
    //   180: invokevirtual 339	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   183: pop
    //   184: aload 4
    //   186: ifnull +8 -> 194
    //   189: aload 4
    //   191: invokevirtual 342	java/io/FileOutputStream:close	()V
    //   194: aload 6
    //   196: invokestatic 345	com/tencent/mm/modelsfs/FileOp:deleteFile	(Ljava/lang/String;)Z
    //   199: pop
    //   200: iload_2
    //   201: ifne +129 -> 330
    //   204: aload_0
    //   205: aload 7
    //   207: invokestatic 314	com/tencent/mm/modelsfs/FileOp:o	(Ljava/lang/String;Ljava/lang/String;)J
    //   210: lconst_0
    //   211: lcmp
    //   212: ifge +118 -> 330
    //   215: ldc2_w 228
    //   218: ldc -26
    //   220: invokestatic 118	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   223: aconst_null
    //   224: areturn
    //   225: astore 5
    //   227: aconst_null
    //   228: astore 4
    //   230: aload 4
    //   232: astore_3
    //   233: ldc_w 347
    //   236: aload 5
    //   238: ldc -24
    //   240: iconst_0
    //   241: anewarray 254	java/lang/Object
    //   244: invokestatic 353	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   247: aload 4
    //   249: ifnull +8 -> 257
    //   252: aload 4
    //   254: invokevirtual 342	java/io/FileOutputStream:close	()V
    //   257: aload 6
    //   259: invokestatic 345	com/tencent/mm/modelsfs/FileOp:deleteFile	(Ljava/lang/String;)Z
    //   262: pop
    //   263: iconst_0
    //   264: istore_2
    //   265: goto -65 -> 200
    //   268: astore 5
    //   270: aconst_null
    //   271: astore 4
    //   273: aload 4
    //   275: astore_3
    //   276: ldc_w 347
    //   279: aload 5
    //   281: ldc -24
    //   283: iconst_0
    //   284: anewarray 254	java/lang/Object
    //   287: invokestatic 353	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   290: aload 4
    //   292: ifnull +8 -> 300
    //   295: aload 4
    //   297: invokevirtual 342	java/io/FileOutputStream:close	()V
    //   300: aload 6
    //   302: invokestatic 345	com/tencent/mm/modelsfs/FileOp:deleteFile	(Ljava/lang/String;)Z
    //   305: pop
    //   306: iconst_0
    //   307: istore_2
    //   308: goto -108 -> 200
    //   311: astore_0
    //   312: aconst_null
    //   313: astore_3
    //   314: aload_3
    //   315: ifnull +7 -> 322
    //   318: aload_3
    //   319: invokevirtual 342	java/io/FileOutputStream:close	()V
    //   322: aload 6
    //   324: invokestatic 345	com/tencent/mm/modelsfs/FileOp:deleteFile	(Ljava/lang/String;)Z
    //   327: pop
    //   328: aload_0
    //   329: athrow
    //   330: aload_1
    //   331: new 355	android/content/Intent
    //   334: dup
    //   335: ldc_w 357
    //   338: new 278	java/io/File
    //   341: dup
    //   342: aload 7
    //   344: invokespecial 358	java/io/File:<init>	(Ljava/lang/String;)V
    //   347: invokestatic 364	android/net/Uri:fromFile	(Ljava/io/File;)Landroid/net/Uri;
    //   350: invokespecial 367	android/content/Intent:<init>	(Ljava/lang/String;Landroid/net/Uri;)V
    //   353: invokevirtual 371	android/content/Context:sendBroadcast	(Landroid/content/Intent;)V
    //   356: ldc2_w 228
    //   359: ldc -26
    //   361: invokestatic 118	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   364: aload 7
    //   366: areturn
    //   367: ldc2_w 228
    //   370: ldc -26
    //   372: invokestatic 118	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   375: aconst_null
    //   376: areturn
    //   377: astore_3
    //   378: goto -184 -> 194
    //   381: astore_3
    //   382: goto -125 -> 257
    //   385: astore_3
    //   386: goto -86 -> 300
    //   389: astore_1
    //   390: goto -68 -> 322
    //   393: astore_0
    //   394: goto -80 -> 314
    //   397: astore 5
    //   399: goto -126 -> 273
    //   402: astore 5
    //   404: goto -174 -> 230
    //   407: aconst_null
    //   408: astore 4
    //   410: iconst_0
    //   411: istore_2
    //   412: goto -228 -> 184
    //   415: iconst_0
    //   416: istore_2
    //   417: goto -217 -> 200
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	420	0	paramString	String
    //   0	420	1	paramContext	Context
    //   1	416	2	i	int
    //   171	148	3	localFileOutputStream1	java.io.FileOutputStream
    //   377	1	3	localException1	Exception
    //   381	1	3	localException2	Exception
    //   385	1	3	localException3	Exception
    //   167	242	4	localFileOutputStream2	java.io.FileOutputStream
    //   146	27	5	localBitmap	android.graphics.Bitmap
    //   225	12	5	localFileNotFoundException1	java.io.FileNotFoundException
    //   268	12	5	localOutOfMemoryError1	OutOfMemoryError
    //   397	1	5	localOutOfMemoryError2	OutOfMemoryError
    //   402	1	5	localFileNotFoundException2	java.io.FileNotFoundException
    //   110	213	6	str1	String
    //   73	292	7	str2	String
    //   156	19	8	localCompressFormat	android.graphics.Bitmap.CompressFormat
    // Exception table:
    //   from	to	target	type
    //   141	148	225	java/io/FileNotFoundException
    //   153	169	225	java/io/FileNotFoundException
    //   141	148	268	java/lang/OutOfMemoryError
    //   153	169	268	java/lang/OutOfMemoryError
    //   141	148	311	finally
    //   153	169	311	finally
    //   189	194	377	java/lang/Exception
    //   252	257	381	java/lang/Exception
    //   295	300	385	java/lang/Exception
    //   318	322	389	java/lang/Exception
    //   172	184	393	finally
    //   233	247	393	finally
    //   276	290	393	finally
    //   172	184	397	java/lang/OutOfMemoryError
    //   172	184	402	java/io/FileNotFoundException
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(8415719981056L, 62702);
    this.context = paramContext;
    this.handler = new com.tencent.mm.sdk.platformtools.ae();
    paramContext = new DisplayMetrics();
    ((Activity)this.context).getWindowManager().getDefaultDisplay().getMetrics(paramContext);
    this.pSe = paramContext.widthPixels;
    this.pSf = paramContext.heightPixels;
    com.tencent.mm.sdk.b.a.vgX.b(this.leg);
    com.tencent.mm.sdk.b.a.vgX.b(this.pSq);
    GMTrace.o(8415719981056L, 62702);
  }
  
  public final void Hd(String paramString)
  {
    GMTrace.i(8416525287424L, 62708);
    GMTrace.o(8416525287424L, 62708);
  }
  
  public final void IS(String paramString)
  {
    GMTrace.i(16633737248768L, 123931);
    if (FileOp.aZ(paramString))
    {
      Intent localIntent = new Intent();
      w.i("MicroMsg.FlipView", "edit image path:%s", new Object[] { paramString });
      localIntent.putExtra("before_photo_edit", paramString);
      localIntent.putExtra("from_scene", 293);
      localIntent.putExtra("after_photo_edit", "");
      localIntent.putExtra("Retr_Compress_Type", 0);
      localIntent.putExtra("Retr_Msg_Type", 0);
      localIntent.putExtra("Retr_FromMainTimeline", bnt());
      d.b(this.context, "photoedit", ".ui.MMNewPhotoEditUI", localIntent);
    }
    GMTrace.o(16633737248768L, 123931);
  }
  
  public void av(String paramString, boolean paramBoolean)
  {
    GMTrace.i(8416659505152L, 62709);
    GMTrace.o(8416659505152L, 62709);
  }
  
  public void aw(String paramString, boolean paramBoolean)
  {
    GMTrace.i(8416927940608L, 62711);
    GMTrace.o(8416927940608L, 62711);
  }
  
  public final void bhV()
  {
    GMTrace.i(8416793722880L, 62710);
    GMTrace.o(8416793722880L, 62710);
  }
  
  public abstract long bns();
  
  public abstract boolean bnt();
  
  public anu bnu()
  {
    GMTrace.i(8417733246976L, 62717);
    GMTrace.o(8417733246976L, 62717);
    return null;
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(8416256851968L, 62706);
    if (paramMotionEvent.getAction() == 0)
    {
      w.d("MicroMsg.FlipView", "onTouchEvent down");
      this.pSa = paramMotionEvent.getX();
      this.pSb = paramMotionEvent.getY();
      this.goZ = System.currentTimeMillis();
      if (g.H(paramMotionEvent) == 1) {
        this.pSg = false;
      }
    }
    if (g.H(paramMotionEvent) > 1) {
      this.pSg = true;
    }
    if ((paramMotionEvent.getAction() == 1) && (!this.pSg))
    {
      w.d("MicroMsg.FlipView", "onTouchEvent up " + (System.currentTimeMillis() - this.goZ));
      long l = bg.Pw();
      w.d("MicroMsg.FlipView", "deltTime: " + (l - this.pSh));
      if (l - this.pSh < 300L)
      {
        this.handler.removeCallbacks(this.pSp);
        this.handler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(8672478494720L, 64615);
            GMTrace.o(8672478494720L, 64615);
          }
        });
        bool = super.dispatchTouchEvent(paramMotionEvent);
        GMTrace.o(8416256851968L, 62706);
        return bool;
      }
      this.pSh = l;
      if ((System.currentTimeMillis() - this.goZ < 500L) && (Math.abs(paramMotionEvent.getX() - this.pSa) <= 10.0D) && (Math.abs(paramMotionEvent.getY() - this.pSb) <= 10.0D) && (paramMotionEvent.getY() > 110.0F) && (paramMotionEvent.getY() < this.pSf - 100))
      {
        a locala = this.pSp;
        float f1 = paramMotionEvent.getX();
        float f2 = paramMotionEvent.getY();
        locala.x = f1;
        locala.y = f2;
        this.handler.postDelayed(this.pSp, 10L);
      }
    }
    boolean bool = super.dispatchTouchEvent(paramMotionEvent);
    GMTrace.o(8416256851968L, 62706);
    return bool;
  }
  
  protected final void e(final String paramString1, final String paramString2, final String paramString3, boolean paramBoolean)
  {
    GMTrace.i(8417196376064L, 62713);
    final ArrayList localArrayList1 = new ArrayList();
    final ArrayList localArrayList2 = new ArrayList();
    Object localObject = com.tencent.mm.plugin.sns.model.ae.bjd().Is(paramString2);
    if (localObject == null)
    {
      w.e("MicroMsg.FlipView", "error!!show long click Alert snsInfo is null!!");
      GMTrace.o(8417196376064L, 62713);
      return;
    }
    if (((com.tencent.mm.plugin.sns.storage.m)localObject).field_type == 21)
    {
      if (!((com.tencent.mm.plugin.sns.storage.m)localObject).field_userName.equals(q.zE()))
      {
        localArrayList1.add(this.context.getString(i.j.pjg));
        localArrayList2.add(Integer.valueOf(3));
      }
      if ((this.pSj == null) || (!this.pSo)) {
        break label674;
      }
      this.pSo = false;
    }
    for (;;)
    {
      this.pSj.qik = new p.c()
      {
        public final void a(com.tencent.mm.ui.base.n paramAnonymousn)
        {
          GMTrace.i(8573157376000L, 63875);
          paramAnonymousn.clear();
          int i = 0;
          while (i < localArrayList1.size())
          {
            paramAnonymousn.e(((Integer)localArrayList2.get(i)).intValue(), (CharSequence)localArrayList1.get(i));
            i += 1;
          }
          GMTrace.o(8573157376000L, 63875);
        }
      };
      this.pSj.xqc = new f.a()
      {
        public final void onDismiss()
        {
          GMTrace.i(14707981287424L, 109583);
          al localal = new al();
          localal.eBC.filePath = FlipView.a(FlipView.this);
          com.tencent.mm.sdk.b.a.vgX.m(localal);
          FlipView.b(FlipView.this);
          FlipView.c(FlipView.this);
          FlipView.a(FlipView.this, "");
          FlipView.d(FlipView.this);
          FlipView.b(FlipView.this, null);
          FlipView.a(FlipView.this, FlipView.b(FlipView.this, 0));
          GMTrace.o(14707981287424L, 109583);
        }
      };
      this.pSj.qil = new p.d()
      {
        public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
        {
          GMTrace.i(8319083216896L, 61982);
          Object localObject1 = com.tencent.mm.plugin.sns.model.ae.bjd().Is(paramString2);
          if (localObject1 == null)
          {
            w.i("MicroMsg.FlipView", "error beacause info null");
            GMTrace.o(8319083216896L, 61982);
            return;
          }
          switch (paramAnonymousMenuItem.getItemId())
          {
          }
          for (;;)
          {
            GMTrace.o(8319083216896L, 61982);
            return;
            if (((com.tencent.mm.plugin.sns.storage.m)localObject1).field_type != 15)
            {
              k.h(paramString1, FlipView.e(FlipView.this));
              GMTrace.o(8319083216896L, 61982);
              return;
            }
            FlipView.IT(paramString2);
            GMTrace.o(8319083216896L, 61982);
            return;
            if (((com.tencent.mm.plugin.sns.storage.m)localObject1).field_type != 15)
            {
              paramAnonymousMenuItem = new Intent();
              paramAnonymousMenuItem.putExtra("Retr_File_Name", paramString1);
              paramAnonymousMenuItem.putExtra("Retr_Compress_Type", 0);
              paramAnonymousMenuItem.putExtra("Retr_Msg_Type", 0);
              if (localObject1 != null)
              {
                paramAnonymousMenuItem.putExtra("Retr_FromMainTimeline", FlipView.this.bnt());
                paramAnonymousMenuItem.putExtra("Retr_KSnsId", i.g((com.tencent.mm.plugin.sns.storage.m)localObject1));
              }
              com.tencent.mm.plugin.sns.c.a.hnH.l(paramAnonymousMenuItem, FlipView.e(FlipView.this));
              GMTrace.o(8319083216896L, 61982);
              return;
            }
            new StringBuilder().append(am.dE(com.tencent.mm.plugin.sns.model.ae.getAccSnsPath(), paramString3)).append(i.e((anu)((com.tencent.mm.plugin.sns.storage.m)localObject1).blD().uUc.ueW.get(0)));
            FlipView.IU(paramString2);
            GMTrace.o(8319083216896L, 61982);
            return;
            Object localObject2;
            if (((com.tencent.mm.plugin.sns.storage.m)localObject1).field_type != 15)
            {
              paramAnonymousMenuItem = new cf();
              Object localObject3 = paramString2;
              localObject2 = paramString3;
              if ((localObject2 == null) || (bg.nm((String)localObject3)))
              {
                w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or snsId error or position errro");
                paramAnonymousMenuItem.eDv.eDB = i.j.dtu;
              }
              for (;;)
              {
                paramAnonymousMenuItem.eDv.eDC = 13;
                paramAnonymousMenuItem.eDv.activity = ((Activity)FlipView.e(FlipView.this));
                com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousMenuItem);
                if (FlipView.this.bnt())
                {
                  paramAnonymousMenuItem = new ph();
                  paramAnonymousMenuItem.eUh.eUg = i.g((com.tencent.mm.plugin.sns.storage.m)localObject1);
                  paramAnonymousMenuItem.eUh.eEM = ((com.tencent.mm.plugin.sns.storage.m)localObject1).blY();
                  com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousMenuItem);
                }
                GMTrace.o(8319083216896L, 61982);
                return;
                if (com.tencent.mm.plugin.sns.model.ae.biM())
                {
                  w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, sns core is invalid");
                  paramAnonymousMenuItem.eDv.eDB = i.j.phR;
                }
                else
                {
                  localObject3 = com.tencent.mm.plugin.sns.model.ae.bjd().Is((String)localObject3);
                  if (localObject3 == null)
                  {
                    w.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, snsInfo is null");
                    paramAnonymousMenuItem.eDv.eDB = i.j.dtv;
                  }
                  else
                  {
                    com.tencent.mm.plugin.sns.i.a.a(paramAnonymousMenuItem, (com.tencent.mm.plugin.sns.storage.m)localObject3, (String)localObject2);
                  }
                }
              }
            }
            if (localObject1 == null)
            {
              GMTrace.o(8319083216896L, 61982);
              return;
            }
            if (!((com.tencent.mm.plugin.sns.storage.m)localObject1).uX(32)) {
              FlipView.j(FlipView.this.bnt(), ((com.tencent.mm.plugin.sns.storage.m)localObject1).blY());
            }
            for (;;)
            {
              if (FlipView.this.bnt())
              {
                paramAnonymousMenuItem = new ph();
                paramAnonymousMenuItem.eUh.eUg = i.g((com.tencent.mm.plugin.sns.storage.m)localObject1);
                paramAnonymousMenuItem.eUh.eEM = ((com.tencent.mm.plugin.sns.storage.m)localObject1).blY();
                com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousMenuItem);
              }
              GMTrace.o(8319083216896L, 61982);
              return;
              paramAnonymousMenuItem = new cf();
              com.tencent.mm.plugin.sns.i.a.a(paramAnonymousMenuItem, (com.tencent.mm.plugin.sns.storage.m)localObject1);
              paramAnonymousMenuItem.eDv.eDC = 14;
              paramAnonymousMenuItem.eDv.activity = ((Activity)FlipView.e(FlipView.this));
              com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousMenuItem);
            }
            localObject1 = new Intent();
            ((Intent)localObject1).putExtra("k_expose_msg_id", FlipView.this.bns());
            paramAnonymousMenuItem = com.tencent.mm.plugin.sns.model.ae.bjd().dU(FlipView.this.bns());
            if (paramAnonymousMenuItem == null) {}
            for (paramAnonymousMenuItem = "";; paramAnonymousMenuItem = paramAnonymousMenuItem.field_userName)
            {
              ((Intent)localObject1).putExtra("k_username", paramAnonymousMenuItem);
              ((Intent)localObject1).putExtra("showShare", false);
              ((Intent)localObject1).putExtra("rawUrl", "https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d#wechat_redirect33");
              ((Intent)localObject1).putExtra("rawUrl", String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d#wechat_redirect", new Object[] { Integer.valueOf(33) }));
              d.b(FlipView.e(FlipView.this), "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
              GMTrace.o(8319083216896L, 61982);
              return;
            }
            w.i("MicroMsg.FlipView", "request deal QBAR string");
            paramAnonymousMenuItem = new bz();
            paramAnonymousMenuItem.eDf.activity = ((Activity)FlipView.e(FlipView.this));
            paramAnonymousMenuItem.eDf.eBB = FlipView.f(FlipView.this);
            paramAnonymousMenuItem.eDf.eDg = FlipView.g(FlipView.this);
            paramAnonymousMenuItem.eDf.eDh = FlipView.h(FlipView.this);
            localObject1 = ai.a((com.tencent.mm.plugin.sns.storage.m)localObject1, paramString3);
            if (localObject1 != null)
            {
              paramAnonymousMenuItem.eDf.imagePath = ((anu)localObject1).lPM;
              paramAnonymousMenuItem.eDf.eDl = ((anu)localObject1).uDf;
            }
            paramAnonymousMenuItem.eDf.scene = 38;
            if ((FlipView.e(FlipView.this) instanceof Activity)) {
              paramAnonymousMenuItem.eDf.eDm = ((Activity)FlipView.e(FlipView.this)).getIntent().getBundleExtra("_stat_obj");
            }
            if ((FlipView.this instanceof SnsInfoFlip))
            {
              localObject1 = (SnsInfoFlip)FlipView.this;
              localObject2 = ((SnsInfoFlip)localObject1).ppi;
              w.d("MicroMsg.FlipView", "from Scene: %s", new Object[] { ((an)localObject2).tag });
              if ((!((an)localObject2).tag.equals(an.vBa.tag)) && (!((an)localObject2).tag.equals(an.vBb.tag)) && (!((an)localObject2).tag.equals(an.vBc.tag))) {
                break label1151;
              }
              paramAnonymousMenuItem.eDf.eDi = 5;
              if (bg.nm(((SnsInfoFlip)localObject1).username))
              {
                w.i("MicroMsg.FlipView", "empty username");
                ((SnsInfoFlip)localObject1).username = "";
              }
              paramAnonymousMenuItem.eDf.aEe = ((SnsInfoFlip)localObject1).username;
            }
            for (;;)
            {
              com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousMenuItem);
              GMTrace.o(8319083216896L, 61982);
              return;
              label1151:
              if (((an)localObject2).tag.equals(an.vAZ.tag)) {
                paramAnonymousMenuItem.eDf.eDi = 3;
              } else {
                w.i("MicroMsg.FlipView", "other scene_from: %s", new Object[] { ((an)localObject2).tag });
              }
            }
            if (((com.tencent.mm.plugin.sns.storage.m)localObject1).blD().uUc.ueW.size() == 0)
            {
              GMTrace.o(8319083216896L, 61982);
              return;
            }
            paramAnonymousMenuItem = new Intent();
            if (((com.tencent.mm.plugin.sns.storage.m)localObject1).field_type == 1)
            {
              paramAnonymousInt = FlipView.this.getPosition();
              int i = ((com.tencent.mm.plugin.sns.storage.m)localObject1).blD().uUc.ueW.size();
              if ((i > 1) && (paramAnonymousInt > 1) && (paramAnonymousInt <= i)) {
                paramAnonymousInt -= 1;
              }
              for (;;)
              {
                localObject1 = FlipView.f(paramString1, FlipView.e(FlipView.this));
                if (localObject1 != null) {
                  break;
                }
                GMTrace.o(8319083216896L, 61982);
                return;
                paramAnonymousInt = 0;
              }
              paramAnonymousMenuItem.putExtra("sns_send_data_ui_image_path", (String)localObject1);
              paramAnonymousMenuItem.putExtra("sns_send_data_ui_image_position", paramAnonymousInt);
            }
            paramAnonymousMenuItem.putExtra("sns_send_data_ui_activity", true);
            paramAnonymousMenuItem.putExtra("sns_local_id", paramString2);
            d.a(FlipView.e(FlipView.this), ".ui.chatting.ChattingSendDataToDeviceUI", paramAnonymousMenuItem);
            GMTrace.o(8319083216896L, 61982);
            return;
            FlipView.this.IS(paramString1);
          }
        }
      };
      this.pSj.bFk();
      if ((this.pSi) && (true == paramBoolean))
      {
        h.xz();
        if (h.xx().fYr.DN() != 0)
        {
          this.pSk = paramString1;
          this.pSl = paramString2;
          this.pSm = paramString3;
          paramString2 = new mk();
          paramString2.eRq.filePath = paramString1;
          com.tencent.mm.sdk.b.a.vgX.m(paramString2);
        }
      }
      GMTrace.o(8417196376064L, 62713);
      return;
      if (!u.IL(paramString2))
      {
        localArrayList1.add(this.context.getString(i.j.edp));
        localArrayList2.add(Integer.valueOf(1));
      }
      if (d.LL("favorite"))
      {
        localArrayList1.add(this.context.getString(i.j.dNH));
        localArrayList2.add(Integer.valueOf(2));
      }
      if (!u.IL(paramString2))
      {
        if ((((com.tencent.mm.plugin.sns.storage.m)localObject).field_type == 15) || (((com.tencent.mm.plugin.sns.storage.m)localObject).field_type == 5))
        {
          localArrayList1.add(this.context.getString(i.j.dUN));
          localArrayList2.add(Integer.valueOf(0));
        }
      }
      else
      {
        label402:
        dh localdh = new dh();
        localdh.eEV.eEM = paramString2;
        com.tencent.mm.sdk.b.a.vgX.m(localdh);
        if (localdh.eEW.eEu)
        {
          localArrayList1.add(this.context.getString(i.j.phO));
          localArrayList2.add(Integer.valueOf(5));
        }
        if ((d.LL("photoedit")) && (!u.IL(paramString2)) && (((com.tencent.mm.plugin.sns.storage.m)localObject).field_type == 1))
        {
          localArrayList1.add(this.context.getString(i.j.dfG));
          localArrayList2.add(Integer.valueOf(6));
        }
        if (this.pSn == null) {
          break;
        }
        if (!com.tencent.mm.plugin.scanner.a.an(this.eDg, this.pSn)) {
          break label659;
        }
      }
      label659:
      for (localObject = this.context.getString(i.j.pkx);; localObject = this.context.getString(i.j.pkw))
      {
        localArrayList1.add(localObject);
        localArrayList2.add(Integer.valueOf(4));
        break;
        if (((com.tencent.mm.plugin.sns.storage.m)localObject).field_type == 1)
        {
          localArrayList1.add(this.context.getString(i.j.dUK));
          localArrayList2.add(Integer.valueOf(0));
          break label402;
        }
        localArrayList1.add(this.context.getString(i.j.pkv));
        localArrayList2.add(Integer.valueOf(0));
        break label402;
      }
      label674:
      this.pSj = new f(this.context, f.xpQ, false);
    }
  }
  
  public abstract int getPosition();
  
  protected final void onDestroy()
  {
    GMTrace.i(8417599029248L, 62716);
    com.tencent.mm.sdk.b.a.vgX.c(this.leg);
    com.tencent.mm.sdk.b.a.vgX.c(this.pSq);
    GMTrace.o(8417599029248L, 62716);
  }
  
  protected void onPause()
  {
    GMTrace.i(8417464811520L, 62715);
    this.pSk = null;
    this.pSl = "";
    this.pSm = null;
    if (this.pSn != null)
    {
      ak localak = new ak();
      localak.eBA.activity = ((Activity)this.context);
      localak.eBA.eBB = this.pSn;
      com.tencent.mm.sdk.b.a.vgX.m(localak);
      this.pSn = null;
      this.eDh = 0;
      this.eDg = 0;
    }
    GMTrace.o(8417464811520L, 62715);
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    GMTrace.i(8416391069696L, 62707);
    if (!g.bZs())
    {
      GMTrace.o(8416391069696L, 62707);
      return false;
    }
    GMTrace.o(8416391069696L, 62707);
    return false;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(8417062158336L, 62712);
    GMTrace.o(8417062158336L, 62712);
    return true;
  }
  
  final class a
    implements Runnable
  {
    float x;
    float y;
    
    a()
    {
      GMTrace.i(8540408250368L, 63631);
      GMTrace.o(8540408250368L, 63631);
    }
    
    public final void run()
    {
      GMTrace.i(8540542468096L, 63632);
      GMTrace.o(8540542468096L, 63632);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\FlipView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */