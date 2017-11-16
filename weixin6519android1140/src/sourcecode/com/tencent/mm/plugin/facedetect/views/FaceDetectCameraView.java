package com.tencent.mm.plugin.facedetect.views;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.Camera.PreviewCallback;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.TextureView.SurfaceTextureListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.memory.a;
import com.tencent.mm.plugin.facedetect.model.FaceCharacteristicsResult;
import com.tencent.mm.plugin.facedetect.model.FaceDetectReporter;
import com.tencent.mm.plugin.facedetect.model.d;
import com.tencent.mm.plugin.facedetect.model.d.a;
import com.tencent.mm.plugin.facedetect.model.d.b;
import com.tencent.mm.plugin.facedetect.model.f;
import com.tencent.mm.plugin.facedetect.model.l;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.MMTextureView;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

public class FaceDetectCameraView
  extends MMTextureView
  implements TextureView.SurfaceTextureListener
{
  private static a kYw;
  private int height;
  private boolean jkq;
  private long kSK;
  private long kYA;
  b kYg;
  private ActivityManager kYh;
  private long kYi;
  private long kYj;
  private int kYk;
  private boolean kYl;
  private boolean kYm;
  private boolean kYn;
  private final Object kYo;
  private boolean kYp;
  private boolean kYq;
  private final Object kYr;
  private final Object kYs;
  private Rect kYt;
  private c kYu;
  private boolean kYv;
  public b kYx;
  private byte[] kYy;
  private boolean kYz;
  private SurfaceTexture mSurfaceTexture;
  private int width;
  
  static
  {
    GMTrace.i(5930276093952L, 44184);
    kYw = null;
    GMTrace.o(5930276093952L, 44184);
  }
  
  public FaceDetectCameraView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(5925041602560L, 44145);
    GMTrace.o(5925041602560L, 44145);
  }
  
  public FaceDetectCameraView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(5925175820288L, 44146);
    this.kYg = null;
    this.mSurfaceTexture = null;
    this.kYi = FaceDetectView.kZh;
    this.kYj = -1L;
    this.kSK = -1L;
    this.kYk = 1;
    this.kYl = false;
    this.kYm = false;
    this.kYn = false;
    this.kYo = new Object();
    this.kYp = false;
    this.kYq = false;
    this.jkq = false;
    this.kYr = new Object();
    this.kYs = new Object();
    this.kYt = null;
    this.width = 324;
    this.height = 576;
    this.kYu = null;
    this.kYv = false;
    this.kYx = null;
    this.kYy = null;
    this.kYz = false;
    this.kYA = -1L;
    this.kYh = ((ActivityManager)getContext().getSystemService("activity"));
    w.i("MicroMsg.FaceDetectCameraView", "hy: face vedio debug: %b", new Object[] { Boolean.valueOf(this.kYv) });
    this.kYx = new c();
    kYw = new a(this);
    setOpaque(false);
    setSurfaceTextureListener(this);
    GMTrace.o(5925175820288L, 44146);
  }
  
  private static void axg()
  {
    GMTrace.i(5925578473472L, 44149);
    w.i("MicroMsg.FaceDetectCameraView", "hy: request clear queue");
    f.awi();
    GMTrace.o(5925578473472L, 44149);
  }
  
  /* Error */
  private void axi()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 296
    //   5: ldc_w 298
    //   8: invokestatic 84	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: ldc -77
    //   13: ldc_w 300
    //   16: invokestatic 289	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   19: getstatic 304	com/tencent/mm/plugin/facedetect/model/f:kSM	Lcom/tencent/mm/plugin/facedetect/model/f;
    //   22: invokevirtual 308	com/tencent/mm/plugin/facedetect/model/f:awm	()I
    //   25: pop
    //   26: getstatic 304	com/tencent/mm/plugin/facedetect/model/f:kSM	Lcom/tencent/mm/plugin/facedetect/model/f;
    //   29: getfield 312	com/tencent/mm/plugin/facedetect/model/f:kSN	Lcom/tencent/mm/plugin/facedetect/service/FaceDetectProcessService;
    //   32: getfield 318	com/tencent/mm/plugin/facedetect/service/FaceDetectProcessService:kUR	Lcom/tencent/mm/plugin/facedetect/model/g;
    //   35: astore 4
    //   37: aload 4
    //   39: getfield 324	com/tencent/mm/plugin/facedetect/model/g:kSQ	Lcom/tencent/mm/plugin/facedetect/FaceProNative;
    //   42: ifnonnull +62 -> 104
    //   45: ldc_w 326
    //   48: ldc_w 328
    //   51: invokestatic 331	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   54: getstatic 304	com/tencent/mm/plugin/facedetect/model/f:kSM	Lcom/tencent/mm/plugin/facedetect/model/f;
    //   57: invokevirtual 334	com/tencent/mm/plugin/facedetect/model/f:awn	()I
    //   60: istore_1
    //   61: invokestatic 340	java/lang/System:currentTimeMillis	()J
    //   64: lstore_2
    //   65: ldc -77
    //   67: ldc_w 342
    //   70: iconst_1
    //   71: anewarray 129	java/lang/Object
    //   74: dup
    //   75: iconst_0
    //   76: lload_2
    //   77: invokestatic 347	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   80: aastore
    //   81: invokestatic 192	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   84: invokestatic 353	com/tencent/mm/plugin/facedetect/model/FaceDetectReporter:aws	()Lcom/tencent/mm/plugin/facedetect/model/FaceDetectReporter;
    //   87: iload_1
    //   88: lload_2
    //   89: invokevirtual 357	com/tencent/mm/plugin/facedetect/model/FaceDetectReporter:q	(IJ)V
    //   92: ldc2_w 296
    //   95: ldc_w 298
    //   98: invokestatic 89	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   101: aload_0
    //   102: monitorexit
    //   103: return
    //   104: ldc_w 326
    //   107: ldc_w 359
    //   110: invokestatic 289	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   113: aload 4
    //   115: getfield 324	com/tencent/mm/plugin/facedetect/model/g:kSQ	Lcom/tencent/mm/plugin/facedetect/FaceProNative;
    //   118: invokevirtual 364	com/tencent/mm/plugin/facedetect/FaceProNative:engineGetCurrMotion	()I
    //   121: pop
    //   122: goto -68 -> 54
    //   125: astore 4
    //   127: aload_0
    //   128: monitorexit
    //   129: aload 4
    //   131: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	132	0	this	FaceDetectCameraView
    //   60	28	1	i	int
    //   64	25	2	l	long
    //   35	79	4	localg	com.tencent.mm.plugin.facedetect.model.g
    //   125	5	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	54	125	finally
    //   54	101	125	finally
    //   104	122	125	finally
  }
  
  public final void a(Rect paramRect, long paramLong)
  {
    try
    {
      GMTrace.i(5925444255744L, 44148);
      axg();
      this.kYt = paramRect;
      axi();
      this.kYx.ca(paramLong);
      GMTrace.o(5925444255744L, 44148);
      return;
    }
    finally
    {
      paramRect = finally;
      throw paramRect;
    }
  }
  
  public final void a(c paramc)
  {
    GMTrace.i(5925310038016L, 44147);
    this.kYx.a(paramc);
    this.kSK = -1L;
    GMTrace.o(5925310038016L, 44147);
  }
  
  public final void axh()
  {
    GMTrace.i(5925846908928L, 44151);
    this.jkq = false;
    this.kYx.axl();
    axg();
    int i = f.kSM.awn();
    long l = System.currentTimeMillis();
    w.i("MicroMsg.FaceDetectCameraView", "alvinluo pause motion time: %d", new Object[] { Long.valueOf(l) });
    FaceDetectReporter.aws().r(i, l);
    GMTrace.o(5925846908928L, 44151);
  }
  
  /* Error */
  final com.tencent.mm.plugin.facedetect.FaceProNative.FaceResult axj()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 613
    //   5: ldc_w 615
    //   8: invokestatic 84	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   11: invokestatic 294	com/tencent/mm/plugin/facedetect/model/f:awi	()V
    //   14: getstatic 304	com/tencent/mm/plugin/facedetect/model/f:kSM	Lcom/tencent/mm/plugin/facedetect/model/f;
    //   17: invokevirtual 308	com/tencent/mm/plugin/facedetect/model/f:awm	()I
    //   20: istore_2
    //   21: getstatic 304	com/tencent/mm/plugin/facedetect/model/f:kSM	Lcom/tencent/mm/plugin/facedetect/model/f;
    //   24: getfield 312	com/tencent/mm/plugin/facedetect/model/f:kSN	Lcom/tencent/mm/plugin/facedetect/service/FaceDetectProcessService;
    //   27: getfield 318	com/tencent/mm/plugin/facedetect/service/FaceDetectProcessService:kUR	Lcom/tencent/mm/plugin/facedetect/model/g;
    //   30: invokevirtual 618	com/tencent/mm/plugin/facedetect/model/g:awp	()Lcom/tencent/mm/plugin/facedetect/FaceProNative$FaceResult;
    //   33: astore_3
    //   34: aload_3
    //   35: ifnull +47 -> 82
    //   38: aload_3
    //   39: getfield 621	com/tencent/mm/plugin/facedetect/FaceProNative$FaceResult:result	I
    //   42: istore_1
    //   43: ldc -77
    //   45: ldc_w 623
    //   48: iconst_2
    //   49: anewarray 129	java/lang/Object
    //   52: dup
    //   53: iconst_0
    //   54: iload_2
    //   55: invokestatic 245	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   58: aastore
    //   59: dup
    //   60: iconst_1
    //   61: iload_1
    //   62: invokestatic 245	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   65: aastore
    //   66: invokestatic 192	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   69: ldc2_w 613
    //   72: ldc_w 615
    //   75: invokestatic 89	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   78: aload_0
    //   79: monitorexit
    //   80: aload_3
    //   81: areturn
    //   82: sipush 55536
    //   85: istore_1
    //   86: goto -43 -> 43
    //   89: astore_3
    //   90: aload_0
    //   91: monitorexit
    //   92: aload_3
    //   93: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	94	0	this	FaceDetectCameraView
    //   42	44	1	i	int
    //   20	35	2	j	int
    //   33	48	3	localFaceResult	com.tencent.mm.plugin.facedetect.FaceProNative.FaceResult
    //   89	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	34	89	finally
    //   38	43	89	finally
    //   43	78	89	finally
  }
  
  protected void onAttachedToWindow()
  {
    GMTrace.i(5926517997568L, 44156);
    super.onAttachedToWindow();
    w.i("MicroMsg.FaceDetectCameraView", "hy: attached");
    GMTrace.o(5926517997568L, 44156);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(5926786433024L, 44158);
    super.onMeasure(paramInt1, paramInt2);
    this.width = getMeasuredWidth();
    this.height = getMeasuredHeight();
    w.i("MicroMsg.FaceDetectCameraView", "hy: camera view on measure to %d, %d", new Object[] { Integer.valueOf(this.width), Integer.valueOf(this.height) });
    GMTrace.o(5926786433024L, 44158);
  }
  
  public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    GMTrace.i(5925712691200L, 44150);
    w.i("MicroMsg.FaceDetectCameraView", "hy: onSurfaceTextureAvailable");
    cau();
    this.kYl = true;
    this.mSurfaceTexture = paramSurfaceTexture;
    if (this.kYq) {
      a(this.kYu);
    }
    GMTrace.o(5925712691200L, 44150);
  }
  
  public boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    GMTrace.i(5926249562112L, 44154);
    w.i("MicroMsg.FaceDetectCameraView", "hy: onSurfaceTextureDestroyed");
    this.kYl = false;
    GMTrace.o(5926249562112L, 44154);
    return false;
  }
  
  public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    GMTrace.i(5926115344384L, 44153);
    w.i("MicroMsg.FaceDetectCameraView", "hy: onSurfaceTextureSizeChanged");
    this.mSurfaceTexture = paramSurfaceTexture;
    GMTrace.o(5926115344384L, 44153);
  }
  
  public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
  {
    GMTrace.i(5926383779840L, 44155);
    GMTrace.o(5926383779840L, 44155);
  }
  
  private static final class a
    extends ae
  {
    private WeakReference<FaceDetectCameraView> yK;
    
    public a(FaceDetectCameraView paramFaceDetectCameraView)
    {
      super();
      GMTrace.i(5930410311680L, 44185);
      this.yK = new WeakReference(paramFaceDetectCameraView);
      GMTrace.o(5930410311680L, 44185);
    }
    
    public final void handleMessage(Message paramMessage)
    {
      GMTrace.i(5930544529408L, 44186);
      super.handleMessage(paramMessage);
      if ((this.yK == null) || (this.yK.get() == null))
      {
        w.e("MicroMsg.FaceDetectCameraView", "hy: no referenced view. exit");
        GMTrace.o(5930544529408L, 44186);
        return;
      }
      if (paramMessage.what == 1)
      {
        paramMessage = (FaceCharacteristicsResult)paramMessage.obj;
        if (FaceCharacteristicsResult.no(paramMessage.errCode))
        {
          if (FaceDetectCameraView.a((FaceDetectCameraView)this.yK.get()) != null)
          {
            FaceDetectCameraView.a((FaceDetectCameraView)this.yK.get()).d(paramMessage);
            GMTrace.o(5930544529408L, 44186);
          }
        }
        else if (FaceCharacteristicsResult.nn(paramMessage.errCode))
        {
          if (FaceDetectCameraView.a((FaceDetectCameraView)this.yK.get()) != null)
          {
            FaceDetectCameraView.a((FaceDetectCameraView)this.yK.get()).b(paramMessage.errCode, paramMessage.eAR);
            GMTrace.o(5930544529408L, 44186);
          }
        }
        else if (FaceDetectCameraView.a((FaceDetectCameraView)this.yK.get()) != null) {
          FaceDetectCameraView.a((FaceDetectCameraView)this.yK.get()).c(paramMessage);
        }
      }
      GMTrace.o(5930544529408L, 44186);
    }
  }
  
  private static abstract interface b
  {
    public abstract void a(c paramc);
    
    public abstract void axk();
    
    public abstract void axl();
    
    public abstract Point axm();
    
    public abstract void ca(long paramLong);
    
    public abstract int getPreviewHeight();
    
    public abstract int getPreviewWidth();
    
    public abstract int getRotation();
    
    public abstract void stopPreview();
  }
  
  private final class c
    implements FaceDetectCameraView.b
  {
    public l kYF;
    public Camera.PreviewCallback kYG;
    private d.b kYH;
    
    public c()
    {
      GMTrace.i(5919807111168L, 44106);
      this.kYF = null;
      this.kYG = new Camera.PreviewCallback()
      {
        public final void onPreviewFrame(byte[] paramAnonymousArrayOfByte, Camera arg2)
        {
          GMTrace.i(5917793845248L, 44091);
          w.v("MicroMsg.FaceDetectCameraView", "hy: on preview callback");
          Object localObject = d.avZ();
          synchronized (d.mLock)
          {
            w.v("MicroMsg.FaceCameraDataCallbackHolder", "hy: publish");
            if ((((d)localObject).kSD == null) || (((d)localObject).kSD.size() == 0))
            {
              w.w("MicroMsg.FaceCameraDataCallbackHolder", "hy: nothing's listening to preview data");
              GMTrace.o(5917793845248L, 44091);
              return;
            }
            if ((paramAnonymousArrayOfByte == null) || (paramAnonymousArrayOfByte.length == 0))
            {
              w.w("MicroMsg.FaceCameraDataCallbackHolder", "hy: null camera data got");
              GMTrace.o(5917793845248L, 44091);
              return;
            }
            localObject = ((d)localObject).kSD.iterator();
            if (((Iterator)localObject).hasNext())
            {
              d.a locala = (d.a)((Iterator)localObject).next();
              int i = paramAnonymousArrayOfByte.length;
              locala.data = ((byte[])locala.kSE.awa().b(Integer.valueOf(i)));
              System.arraycopy(paramAnonymousArrayOfByte, 0, locala.data, 0, i);
              locala.kSE.aq(locala.data);
            }
          }
          GMTrace.o(5917793845248L, 44091);
        }
      };
      this.kYH = new d.b()
      {
        public final void aq(byte[] paramAnonymousArrayOfByte)
        {
          GMTrace.i(5924773167104L, 44143);
          if (!FaceDetectCameraView.n(FaceDetectCameraView.this))
          {
            if (FaceDetectCameraView.o(FaceDetectCameraView.this) == null) {
              FaceDetectCameraView.a(FaceDetectCameraView.this, com.tencent.mm.plugin.facedetect.model.c.kSA.h(Integer.valueOf(paramAnonymousArrayOfByte.length)));
            }
            System.arraycopy(paramAnonymousArrayOfByte, 0, FaceDetectCameraView.o(FaceDetectCameraView.this), 0, paramAnonymousArrayOfByte.length);
            FaceDetectCameraView.a(FaceDetectCameraView.this, paramAnonymousArrayOfByte);
          }
          com.tencent.mm.plugin.facedetect.model.c.kSA.x(paramAnonymousArrayOfByte);
          f.awj().post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(5924370513920L, 44140);
              w.v("MicroMsg.FaceDetectCameraView", "hy: on get preview");
              long l1 = bg.Pw();
              long l2 = l1 - FaceDetectCameraView.p(FaceDetectCameraView.this);
              if (FaceDetectCameraView.p(FaceDetectCameraView.this) >= 0L) {
                w.v("MicroMsg.FaceDetectCameraView", "hy: tweenMillis: %d", new Object[] { Long.valueOf(l2) });
              }
              if ((FaceDetectCameraView.p(FaceDetectCameraView.this) < 0L) || (l2 > FaceDetectCameraView.c(FaceDetectCameraView.this)))
              {
                FaceDetectCameraView.a(FaceDetectCameraView.this, l1);
                FaceDetectCameraView.b(FaceDetectCameraView.this, FaceDetectCameraView.o(FaceDetectCameraView.this));
              }
              GMTrace.o(5924370513920L, 44140);
            }
          });
          GMTrace.o(5924773167104L, 44143);
        }
        
        public final a<byte[]> awa()
        {
          GMTrace.i(5924907384832L, 44144);
          com.tencent.mm.plugin.facedetect.model.c localc = com.tencent.mm.plugin.facedetect.model.c.kSA;
          GMTrace.o(5924907384832L, 44144);
          return localc;
        }
      };
      this.kYF = new l(FaceDetectCameraView.this.getContext());
      FaceDetectCameraView.a(FaceDetectCameraView.this, -1L);
      FaceDetectCameraView.d(FaceDetectCameraView.this);
      GMTrace.o(5919807111168L, 44106);
    }
    
    public final void a(c arg1)
    {
      GMTrace.i(5919941328896L, 44107);
      FaceDetectCameraView.a(FaceDetectCameraView.this, ???);
      synchronized (FaceDetectCameraView.e(FaceDetectCameraView.this))
      {
        if (this.kYF == null)
        {
          w.w("MicroMsg.FaceDetectCameraView", "hy: camera is null. return");
          GMTrace.o(5919941328896L, 44107);
          return;
        }
        if (this.kYF.kTD)
        {
          w.w("MicroMsg.FaceDetectCameraView", "hy: already previewed. return");
          FaceDetectCameraView.f(FaceDetectCameraView.this);
          GMTrace.o(5919941328896L, 44107);
          return;
        }
        FaceDetectCameraView.g(FaceDetectCameraView.this);
        if (FaceDetectCameraView.h(FaceDetectCameraView.this)) {
          break label182;
        }
        if (FaceDetectCameraView.this.isAvailable())
        {
          w.i("MicroMsg.FaceDetectCameraView", "hy: already available. manually call available");
          FaceDetectCameraView.this.onSurfaceTextureAvailable(FaceDetectCameraView.this.getSurfaceTexture(), FaceDetectCameraView.this.getWidth(), FaceDetectCameraView.this.getHeight());
          GMTrace.o(5919941328896L, 44107);
          return;
        }
      }
      w.w("MicroMsg.FaceDetectCameraView", "hy: not initialized yet. do after init");
      GMTrace.o(5919941328896L, 44107);
      return;
      label182:
      e.post(new Runnable()
      {
        public final void run()
        {
          int i = 1;
          GMTrace.i(5931484053504L, 44193);
          synchronized (FaceDetectCameraView.e(FaceDetectCameraView.this))
          {
            w.i("MicroMsg.FaceDetectCameraView", "hy: enter worker thread. using %d ms", new Object[] { Long.valueOf(bg.aI(this.kYI)) });
            long l1 = bg.Pw();
            if (FaceDetectCameraView.c.this.kYF == null)
            {
              w.e("MicroMsg.FaceDetectCameraView", "hy: already released");
              if (FaceDetectCameraView.i(FaceDetectCameraView.this) != null) {
                af.t(new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(5921417723904L, 44118);
                    FaceDetectCameraView.i(FaceDetectCameraView.this).ny(1);
                    GMTrace.o(5921417723904L, 44118);
                  }
                });
              }
              GMTrace.o(5931484053504L, 44193);
              return;
            }
            try
            {
              FaceDetectCameraView.c.this.kYF.kTF = new Point(FaceDetectCameraView.j(FaceDetectCameraView.this), FaceDetectCameraView.k(FaceDetectCameraView.this));
              Object localObject2 = FaceDetectCameraView.c.this.kYF;
              if ((((l)localObject2).fPj != null) && (((l)localObject2).kTL)) {}
              for (;;)
              {
                if (i == 0) {
                  FaceDetectCameraView.c.this.kYF.b(FaceDetectCameraView.l(FaceDetectCameraView.this));
                }
                localObject2 = FaceDetectCameraView.c.this.kYF.kTE;
                FaceDetectCameraView.a(FaceDetectCameraView.this, (Point)localObject2);
                localObject2 = FaceDetectCameraView.c.this.kYF;
                SurfaceTexture localSurfaceTexture = FaceDetectCameraView.l(FaceDetectCameraView.this);
                long l2 = bg.Pw();
                if ((((l)localObject2).fPj != null) && (!((l)localObject2).kTD))
                {
                  if (localSurfaceTexture != null)
                  {
                    w.i("MicroMsg.FaceScanCamera", "hy: SurfaceTexture is not null");
                    ((l)localObject2).fPj.setPreviewTexture(localSurfaceTexture);
                  }
                  com.tencent.mm.plugin.facedetect.model.c.bZ(((l)localObject2).getPreviewWidth(), ((l)localObject2).getPreviewHeight());
                  ((l)localObject2).fPj.startPreview();
                  ((l)localObject2).kTD = true;
                  w.d("MicroMsg.FaceScanCamera", "startPreview done costTime=[%s]", new Object[] { Long.valueOf(bg.aI(l2)) });
                }
                FaceDetectCameraView.c.this.kYF.setPreviewCallback(FaceDetectCameraView.c.this.kYG);
                if (FaceDetectCameraView.i(FaceDetectCameraView.this) != null) {
                  af.t(new Runnable()
                  {
                    public final void run()
                    {
                      GMTrace.i(5924102078464L, 44138);
                      FaceDetectCameraView.i(FaceDetectCameraView.this).ny(0);
                      GMTrace.o(5924102078464L, 44138);
                    }
                  });
                }
                w.i("MicroMsg.FaceDetectCameraView", "hy: opened and start preview. use: %d ms", new Object[] { Long.valueOf(bg.aI(l1)) });
                FaceDetectCameraView.f(FaceDetectCameraView.this);
                GMTrace.o(5931484053504L, 44193);
                return;
                i = 0;
              }
              localObject3 = finally;
            }
            catch (IOException localIOException)
            {
              w.printErrStackTrace("MicroMsg.FaceDetectCameraView", localIOException, "hy: exception caused", new Object[0]);
              if (FaceDetectCameraView.i(FaceDetectCameraView.this) != null) {
                af.t(new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(5921686159360L, 44120);
                    FaceDetectCameraView.i(FaceDetectCameraView.this).ny(2);
                    GMTrace.o(5921686159360L, 44120);
                  }
                });
              }
              GMTrace.o(5931484053504L, 44193);
              return;
            }
          }
        }
      }, "FaceDetectCameraView_Camera");
      GMTrace.o(5919941328896L, 44107);
    }
    
    public final void axk()
    {
      GMTrace.i(5920209764352L, 44109);
      if (!FaceDetectCameraView.m(FaceDetectCameraView.this))
      {
        FaceDetectCameraView.b(FaceDetectCameraView.this, true);
        e.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(5913767313408L, 44061);
            synchronized (FaceDetectCameraView.e(FaceDetectCameraView.this))
            {
              if (FaceDetectCameraView.c.this.kYF == null)
              {
                GMTrace.o(5913767313408L, 44061);
                return;
              }
              w.d("MicroMsg.FaceDetectCameraView", "hy: closeCamera");
              FaceDetectCameraView.c.this.kYF.setPreviewCallback(null);
              d locald = d.avZ();
              synchronized (d.mLock)
              {
                if (locald.kSD != null) {
                  locald.kSD.clear();
                }
                if (FaceDetectCameraView.l(FaceDetectCameraView.this) != null) {
                  FaceDetectCameraView.l(FaceDetectCameraView.this).release();
                }
                FaceDetectCameraView.c.this.kYF.release();
                FaceDetectCameraView.c.this.kYF = null;
                w.d("MicroMsg.FaceDetectCameraView", "hy: scanCamera.release() done");
                FaceDetectCameraView.b(FaceDetectCameraView.this, false);
                GMTrace.o(5913767313408L, 44061);
                return;
              }
            }
          }
        }, "FaceDetectCameraView_Camera");
      }
      GMTrace.o(5920209764352L, 44109);
    }
    
    public final void axl()
    {
      GMTrace.i(5920880852992L, 44114);
      synchronized (FaceDetectCameraView.e(FaceDetectCameraView.this))
      {
        if ((this.kYF != null) && (this.kYF.kTD))
        {
          d.avZ().b(this.kYH);
          if (!FaceDetectCameraView.n(FaceDetectCameraView.this)) {
            FaceDetectCameraView.a(FaceDetectCameraView.this, null);
          }
        }
        GMTrace.o(5920880852992L, 44114);
        return;
      }
    }
    
    public final Point axm()
    {
      GMTrace.i(5921015070720L, 44115);
      synchronized (FaceDetectCameraView.e(FaceDetectCameraView.this))
      {
        Point localPoint = this.kYF.kTM;
        GMTrace.o(5921015070720L, 44115);
        return localPoint;
      }
    }
    
    public final void ca(long paramLong)
    {
      GMTrace.i(5920746635264L, 44113);
      for (;;)
      {
        synchronized (FaceDetectCameraView.e(FaceDetectCameraView.this))
        {
          if (this.kYF == null)
          {
            w.w("MicroMsg.FaceDetectCameraView", "hy: camera is null. return");
            GMTrace.o(5920746635264L, 44113);
            return;
          }
          w.i("MicroMsg.FaceDetectCameraView", "hy: start capturing. tween: %d", new Object[] { Long.valueOf(paramLong) });
          FaceDetectCameraView.b(FaceDetectCameraView.this, paramLong);
          if (!FaceDetectCameraView.q(FaceDetectCameraView.this))
          {
            if ((this.kYF != null) && (this.kYF.kTD))
            {
              w.i("MicroMsg.FaceDetectCameraView", "hy: is previewing. directly start capture");
              FaceDetectCameraView.a(FaceDetectCameraView.this, false);
              d.avZ().a(this.kYH);
              FaceDetectCameraView.r(FaceDetectCameraView.this);
              GMTrace.o(5920746635264L, 44113);
              return;
            }
            w.i("MicroMsg.FaceDetectCameraView", "hy: not previewed yet. wait");
            FaceDetectCameraView.a(FaceDetectCameraView.this, true);
          }
        }
        w.w("MicroMsg.FaceDetectCameraView", "hy: already scanning");
      }
    }
    
    public final int getPreviewHeight()
    {
      GMTrace.i(5920478199808L, 44111);
      synchronized (FaceDetectCameraView.e(FaceDetectCameraView.this))
      {
        int i = this.kYF.getPreviewHeight();
        GMTrace.o(5920478199808L, 44111);
        return i;
      }
    }
    
    public final int getPreviewWidth()
    {
      GMTrace.i(5920343982080L, 44110);
      synchronized (FaceDetectCameraView.e(FaceDetectCameraView.this))
      {
        int i = this.kYF.getPreviewWidth();
        GMTrace.o(5920343982080L, 44110);
        return i;
      }
    }
    
    public final int getRotation()
    {
      GMTrace.i(5920612417536L, 44112);
      synchronized (FaceDetectCameraView.e(FaceDetectCameraView.this))
      {
        int i = this.kYF.kTI;
        GMTrace.o(5920612417536L, 44112);
        return i;
      }
    }
    
    public final void stopPreview()
    {
      GMTrace.i(5920075546624L, 44108);
      synchronized (FaceDetectCameraView.e(FaceDetectCameraView.this))
      {
        if ((this.kYF != null) && (this.kYF.kTD))
        {
          l locall = this.kYF;
          if (locall.fPj != null)
          {
            locall.fPj.stopPreview();
            locall.kTD = false;
            com.tencent.mm.plugin.facedetect.model.c.kSA.ye();
          }
        }
        GMTrace.o(5920075546624L, 44108);
        return;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\views\FaceDetectCameraView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */