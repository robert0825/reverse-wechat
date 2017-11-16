package com.tencent.mm.plugin.voiceprint.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;

public class VoicePrintVolumeMeter
  extends View
{
  static int mBM;
  private static float qDA;
  private static float qDB;
  private static float qDC;
  private static float qDD;
  private static int qDr;
  private static int qDs;
  private static int qDt;
  View mBA;
  private Context mContext;
  boolean mIsPlaying;
  private Paint mPaint;
  float qDE;
  boolean qDF;
  private int qDn;
  private int qDo;
  af qDp;
  aj qDq;
  private float qDu;
  private float qDv;
  private float qDw;
  private float qDx;
  private float qDy;
  private float qDz;
  
  static
  {
    GMTrace.i(12515803136000L, 93250);
    qDr = Color.rgb(240, 250, 235);
    qDs = Color.rgb(210, 240, 200);
    qDt = 100;
    mBM = 20;
    qDA = 1.5F;
    qDB = 2.0F;
    qDC = 0.1F;
    qDD = 0.05F;
    GMTrace.o(12515803136000L, 93250);
  }
  
  public VoicePrintVolumeMeter(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12514595176448L, 93241);
    this.qDn = -1;
    this.qDo = -1;
    this.qDp = null;
    this.qDq = null;
    this.qDu = 0.0F;
    this.qDv = 0.0F;
    this.qDw = 0.0F;
    this.qDx = 0.0F;
    this.qDy = 0.0F;
    this.qDz = 0.0F;
    this.qDE = -1.0F;
    this.qDF = true;
    this.mIsPlaying = false;
    init(paramContext);
    GMTrace.o(12514595176448L, 93241);
  }
  
  public VoicePrintVolumeMeter(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(12514729394176L, 93242);
    this.qDn = -1;
    this.qDo = -1;
    this.qDp = null;
    this.qDq = null;
    this.qDu = 0.0F;
    this.qDv = 0.0F;
    this.qDw = 0.0F;
    this.qDx = 0.0F;
    this.qDy = 0.0F;
    this.qDz = 0.0F;
    this.qDE = -1.0F;
    this.qDF = true;
    this.mIsPlaying = false;
    init(paramContext);
    GMTrace.o(12514729394176L, 93242);
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(12514863611904L, 93243);
    this.mContext = paramContext;
    this.mPaint = new Paint();
    this.qDp = new af("VoicePrintVolumeMeter");
    this.qDq = new aj(this.qDp.ngv.getLooper(), new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(12512716128256L, 93227);
        VoicePrintVolumeMeter.a(VoicePrintVolumeMeter.this);
        boolean bool = VoicePrintVolumeMeter.b(VoicePrintVolumeMeter.this);
        GMTrace.o(12512716128256L, 93227);
        return bool;
      }
    }, true);
    GMTrace.o(12514863611904L, 93243);
  }
  
  final void btq()
  {
    GMTrace.i(12514997829632L, 93244);
    if ((this.mBA == null) || (this.mBA.getVisibility() == 8))
    {
      GMTrace.o(12514997829632L, 93244);
      return;
    }
    int[] arrayOfInt = new int[2];
    this.mBA.getLocationOnScreen(arrayOfInt);
    if ((arrayOfInt[0] == 0) || (arrayOfInt[1] == 0))
    {
      w.d("MicroMsg.VoicePrintVolumeMeter", "setCenterLocation, cannot get archView location");
      GMTrace.o(12514997829632L, 93244);
      return;
    }
    int i = this.mBA.getWidth();
    int j = this.mBA.getHeight();
    if ((j == 0) || (i == 0))
    {
      w.d("MicroMsg.VoicePrintVolumeMeter", "setCenterLocation, cannot get archView size");
      GMTrace.o(12514997829632L, 93244);
      return;
    }
    this.qDn = (arrayOfInt[0] + i / 2);
    this.qDo = (arrayOfInt[1] + j / 2 - a.fromDPToPix(this.mContext, 25));
    w.d("MicroMsg.VoicePrintVolumeMeter", "setCenterLocation, mCenterX:%d, mCenterY:%d", new Object[] { Integer.valueOf(this.qDn), Integer.valueOf(this.qDo) });
    this.qDu = (i / 2.0F);
    this.qDv = (this.qDu * qDA);
    this.qDw = (this.qDu * qDB);
    this.qDx = (this.qDv * qDB);
    this.qDz = this.qDv;
    this.qDy = this.qDu;
    GMTrace.o(12514997829632L, 93244);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(12515132047360L, 93245);
    super.onDraw(paramCanvas);
    if (!this.mIsPlaying)
    {
      GMTrace.o(12515132047360L, 93245);
      return;
    }
    if ((this.qDn == -1) || (this.qDo == -1)) {
      btq();
    }
    this.mPaint.setAlpha(qDt);
    if (this.qDz > this.qDx) {
      this.qDz = this.qDx;
    }
    if (this.qDz < this.qDv) {
      this.qDz = this.qDv;
    }
    this.mPaint.setColor(qDr);
    paramCanvas.drawCircle(this.qDn, this.qDo, this.qDz, this.mPaint);
    if (this.qDy > this.qDw) {
      this.qDy = this.qDw;
    }
    if (this.qDy < this.qDu) {
      this.qDy = this.qDu;
    }
    this.mPaint.setColor(qDs);
    paramCanvas.drawCircle(this.qDn, this.qDo, this.qDy, this.mPaint);
    GMTrace.o(12515132047360L, 93245);
  }
  
  public final void reset()
  {
    GMTrace.i(12515400482816L, 93247);
    this.qDF = false;
    this.qDE = -1.0F;
    this.mIsPlaying = false;
    this.qDy = 0.0F;
    this.qDz = 0.0F;
    postInvalidate();
    GMTrace.o(12515400482816L, 93247);
  }
  
  public final void stop()
  {
    GMTrace.i(12515266265088L, 93246);
    reset();
    this.mIsPlaying = false;
    this.qDq.stopTimer();
    postInvalidate();
    GMTrace.o(12515266265088L, 93246);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\voiceprint\ui\VoicePrintVolumeMeter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */