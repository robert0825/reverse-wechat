package com.tencent.mm.plugin.talkroom.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;

public class TalkRoomVolumeMeter
  extends FrameLayout
{
  a qyW;
  private ImageView qyX;
  private ImageView qyY;
  private ImageView qyZ;
  private FrameLayout qza;
  
  public TalkRoomVolumeMeter(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(5181072736256L, 38602);
    MP();
    GMTrace.o(5181072736256L, 38602);
  }
  
  public TalkRoomVolumeMeter(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(5180938518528L, 38601);
    MP();
    GMTrace.o(5180938518528L, 38601);
  }
  
  private void MP()
  {
    GMTrace.i(5181206953984L, 38603);
    this.qyW = new a(getContext());
    this.qyX = new ImageView(getContext());
    this.qyX.setScaleType(ImageView.ScaleType.FIT_XY);
    this.qyX.setImageResource(R.g.bba);
    this.qyX.setVisibility(0);
    this.qyY = new ImageView(getContext());
    this.qyY.setScaleType(ImageView.ScaleType.FIT_CENTER);
    this.qyY.setImageResource(R.g.baZ);
    this.qyY.setVisibility(8);
    this.qyZ = new ImageView(getContext());
    this.qyZ.setScaleType(ImageView.ScaleType.FIT_CENTER);
    this.qyZ.setImageResource(R.g.baW);
    this.qyZ.setVisibility(8);
    this.qza = new FrameLayout(getContext());
    this.qza.addView(this.qyW);
    this.qza.addView(this.qyY);
    this.qza.setVisibility(8);
    addView(this.qza);
    addView(this.qyZ);
    addView(this.qyX);
    setBackgroundColor(-16777216);
    bringChildToFront(this.qyX);
    GMTrace.o(5181206953984L, 38603);
  }
  
  public final void io(boolean paramBoolean)
  {
    GMTrace.i(5181341171712L, 38604);
    Object localObject = this.qza;
    if (paramBoolean) {}
    for (int i = 0;; i = 8)
    {
      ((FrameLayout)localObject).setVisibility(i);
      if (!paramBoolean) {
        break;
      }
      localObject = this.qyW;
      if (!((a)localObject).started)
      {
        ((a)localObject).started = true;
        ((a)localObject).qzk.z(100L, 100L);
      }
      GMTrace.o(5181341171712L, 38604);
      return;
    }
    a locala = this.qyW;
    if (locala.started)
    {
      locala.started = false;
      if ((locala.qzn >= locala.qzb) && (locala.qzn <= locala.qzc)) {
        break label138;
      }
    }
    label138:
    Canvas localCanvas;
    do
    {
      do
      {
        locala.qzk.stopTimer();
        GMTrace.o(5181341171712L, 38604);
        return;
      } while ((locala.qzf == null) || (locala.qze == null));
      localCanvas = locala.qzd.lockCanvas();
    } while ((localCanvas == null) || (locala.qzh == null));
    localCanvas.setDrawFilter(locala.qzo);
    locala.qzh.set(0, 0, locala.qzj, locala.qzi + 0);
    if (locala.qzp) {}
    for (localObject = locala.qzf;; localObject = locala.qze)
    {
      localCanvas.drawBitmap((Bitmap)localObject, null, locala.qzh, locala.jrC);
      locala.qzd.unlockCanvasAndPost(localCanvas);
      break;
    }
  }
  
  private final class a
    extends SurfaceView
    implements SurfaceHolder.Callback
  {
    Paint jrC;
    int max;
    float qzb;
    float qzc;
    SurfaceHolder qzd;
    Bitmap qze;
    Bitmap qzf;
    private Bitmap qzg;
    Rect qzh;
    int qzi;
    int qzj;
    aj qzk;
    private boolean qzl;
    private float qzm;
    float qzn;
    PaintFlagsDrawFilter qzo;
    boolean qzp;
    private float[] qzq;
    boolean started;
    int value;
    
    public a(Context paramContext)
    {
      super();
      GMTrace.i(5178791034880L, 38585);
      this.max = 100;
      this.value = 0;
      this.qzb = 0.0F;
      this.qzc = 0.0F;
      this.qzl = false;
      this.qzm = this.qzc;
      this.qzn = this.qzc;
      this.qzp = false;
      this.started = false;
      this.qzd = getHolder();
      this.qzd.addCallback(this);
      this.jrC = new Paint();
      this.jrC.setAntiAlias(true);
      this.qzo = new PaintFlagsDrawFilter(0, 3);
      this.qzk = new aj(new aj.a()
      {
        public final boolean pM()
        {
          GMTrace.i(5181878042624L, 38608);
          TalkRoomVolumeMeter.a.a(TalkRoomVolumeMeter.a.this);
          boolean bool = TalkRoomVolumeMeter.a.b(TalkRoomVolumeMeter.a.this);
          GMTrace.o(5181878042624L, 38608);
          return bool;
        }
      }, true);
      GMTrace.o(5178791034880L, 38585);
    }
    
    private int bsK()
    {
      GMTrace.i(5179059470336L, 38587);
      if (this.qze == null)
      {
        GMTrace.o(5179059470336L, 38587);
        return 190;
      }
      int i = this.qze.getHeight();
      GMTrace.o(5179059470336L, 38587);
      return i;
    }
    
    public final void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
    {
      GMTrace.i(5179193688064L, 38588);
      w.v("MicroMsg.TalkRoomVoiceMeter", "surfaceChanged, width = " + paramInt2 + " height = " + paramInt3);
      this.qzc = 0.0F;
      this.qzb = (paramInt3 - bsK());
      this.qzm = this.qzc;
      this.qzn = this.qzc;
      this.qzj = paramInt2;
      this.qzi = bsK();
      this.qzh = new Rect(0, (int)this.qzm, this.qzj, (int)this.qzm + this.qzi);
      this.qzl = true;
      GMTrace.o(5179193688064L, 38588);
    }
    
    public final void surfaceCreated(SurfaceHolder paramSurfaceHolder)
    {
      GMTrace.i(5178925252608L, 38586);
      w.v("MicroMsg.TalkRoomVoiceMeter", "surfaceCreated");
      this.qze = BitmapFactory.decodeResource(getResources(), R.g.baX);
      this.qzg = BitmapFactory.decodeResource(getResources(), R.g.baW);
      this.qzf = BitmapFactory.decodeResource(getResources(), R.g.baY);
      GMTrace.o(5178925252608L, 38586);
    }
    
    public final void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
    {
      GMTrace.i(5179327905792L, 38589);
      w.v("MicroMsg.TalkRoomVoiceMeter", "surfaceDestroyed");
      this.qzl = false;
      this.qzk.stopTimer();
      if (this.qze != null)
      {
        this.qze.recycle();
        this.qze = null;
      }
      if (this.qzg != null)
      {
        this.qzg.recycle();
        this.qzg = null;
      }
      if (this.qzf != null)
      {
        this.qzf.recycle();
        this.qzf = null;
      }
      GMTrace.o(5179327905792L, 38589);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\talkroom\ui\TalkRoomVolumeMeter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */