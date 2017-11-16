package com.tencent.mm.plugin.voip.video;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.graphics.Bitmap;
import android.opengl.GLSurfaceView.Renderer;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public final class OpenGlRender
  implements GLSurfaceView.Renderer
{
  static String TAG;
  public static int qPE;
  static boolean qPG;
  public static int qPh;
  public static int qPi;
  public static int qPj;
  public static int qPk;
  public static int qPl;
  public static int qPm;
  public static int qPn;
  public static int qPo;
  public static int qPp;
  public static int qPq;
  public static int qPr;
  public static int qPs;
  public static int qPt;
  public static int qPu;
  int mRenderMode;
  boolean qOQ;
  int qOR;
  long qOS;
  long qOT;
  int qOU;
  a qOV;
  public float qOW;
  public float qOX;
  public float qOY;
  boolean qOZ;
  private int[] qPA;
  private int qPB;
  private int qPC;
  private int qPD;
  WeakReference<Object> qPF;
  public boolean qPa;
  boolean qPb;
  boolean qPc;
  boolean qPd;
  int qPe;
  int qPf;
  WeakReference<OpenGlView> qPg;
  public boolean qPv;
  public Bitmap qPw;
  private int qPx;
  private int qPy;
  private byte[] qPz;
  
  static
  {
    GMTrace.i(5390452391936L, 40162);
    TAG = "OpenGlRender";
    qPh = 0;
    qPi = 1;
    qPj = 2;
    qPk = 0;
    qPl = 1;
    qPm = 0;
    qPn = 1;
    qPo = 2;
    qPp = 3;
    qPq = 4;
    qPr = 12;
    qPs = 16;
    qPt = 0;
    qPu = 1;
    qPE = 0;
    qPG = false;
    GMTrace.o(5390452391936L, 40162);
  }
  
  public OpenGlRender(OpenGlView paramOpenGlView, int paramInt)
  {
    GMTrace.i(5388439126016L, 40147);
    this.qOQ = false;
    this.qOR = 0;
    this.qOS = 0L;
    this.qOT = 0L;
    this.qOU = 0;
    this.qOW = 1.2F;
    this.qOX = 1.93F;
    this.qOY = 1.05F;
    this.qOZ = false;
    this.qPa = false;
    this.qPb = false;
    this.qPc = false;
    this.qPd = false;
    this.qPe = 0;
    this.qPf = 0;
    this.mRenderMode = qPt;
    this.qPv = false;
    this.qPw = null;
    this.qPx = 0;
    this.qPy = 0;
    this.qPz = null;
    this.qPA = null;
    if (!qPG)
    {
      k.b("mm_gl_disp", OpenGlRender.class.getClassLoader());
      qPG = true;
    }
    this.mRenderMode = paramInt;
    this.qPg = new WeakReference(paramOpenGlView);
    paramOpenGlView = Looper.myLooper();
    if (paramOpenGlView != null) {
      this.qOV = new a(paramOpenGlView);
    }
    for (;;)
    {
      this.qPF = null;
      GMTrace.o(5388439126016L, 40147);
      return;
      paramOpenGlView = Looper.getMainLooper();
      if (paramOpenGlView != null) {
        this.qOV = new a(paramOpenGlView);
      } else {
        this.qOV = null;
      }
    }
  }
  
  public static int bvY()
  {
    GMTrace.i(5388304908288L, 40146);
    if (qPE == 0) {
      if (((ActivityManager)ab.getContext().getSystemService("activity")).getDeviceConfigurationInfo().reqGlEsVersion != 131072) {
        break label71;
      }
    }
    label71:
    for (int i = 2;; i = 1)
    {
      qPE = i;
      if (Build.MODEL.equals("Nexus 6")) {
        qPE = 2;
      }
      i = qPE;
      GMTrace.o(5388304908288L, 40146);
      return i;
    }
  }
  
  private native void render32(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  private native void render8(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  final native void Init(int paramInt1, Object paramObject, int paramInt2);
  
  final native void Uninit(int paramInt);
  
  public final void a(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(5388841779200L, 40150);
    if ((this.qOZ) && (this.qPA == null))
    {
      this.qPB = paramInt1;
      this.qPC = paramInt2;
      this.qPD = paramInt3;
      this.qPA = paramArrayOfInt;
      requestRender();
    }
    GMTrace.o(5388841779200L, 40150);
  }
  
  public final void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(5388707561472L, 40149);
    if ((this.qOZ) && (this.qPz == null))
    {
      this.qPB = paramInt1;
      this.qPC = paramInt2;
      this.qPD = paramInt3;
      this.qPz = paramArrayOfByte;
      requestRender();
    }
    GMTrace.o(5388707561472L, 40149);
  }
  
  public final void bvZ()
  {
    GMTrace.i(5389244432384L, 40153);
    this.qPa = false;
    this.qPd = false;
    GMTrace.o(5389244432384L, 40153);
  }
  
  public final void bwa()
  {
    GMTrace.i(5390183956480L, 40160);
    w.i(TAG, "steve: try to reset GLRender mode=%d, inited:%b, started:%b", new Object[] { Integer.valueOf(this.mRenderMode), Boolean.valueOf(this.qOZ), Boolean.valueOf(this.qPa) });
    if ((this.qOZ) && (this.qPa))
    {
      w.i(TAG, "steve: Reset GLRender first! mode=%d", new Object[] { Integer.valueOf(this.mRenderMode) });
      this.qOZ = false;
      this.qPa = false;
      Uninit(this.mRenderMode);
    }
    GMTrace.o(5390183956480L, 40160);
  }
  
  public final void onDrawFrame(GL10 paramGL10)
  {
    GMTrace.i(5388573343744L, 40148);
    if ((!this.qPa) || (!this.qOZ) || (this.qPg.get() == null))
    {
      this.qPz = null;
      this.qPA = null;
      GMTrace.o(5388573343744L, 40148);
      return;
    }
    if (this.qPz != null)
    {
      render8(this.qPz, this.qPB, this.qPC, this.qPD, this.mRenderMode);
      this.qPz = null;
    }
    if (this.qPA != null)
    {
      render32(this.qPA, this.qPB, this.qPC, this.qPD, this.mRenderMode);
      this.qPA = null;
    }
    GMTrace.o(5388573343744L, 40148);
  }
  
  public final void onSurfaceChanged(GL10 paramGL10, int paramInt1, int paramInt2)
  {
    GMTrace.i(5388975996928L, 40151);
    w.i(TAG, "onSurfaceChanged, width: %s, height: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((this.qPe != paramInt1) || (this.qPf != paramInt2))
    {
      paramGL10.glViewport(0, 0, paramInt1, paramInt2);
      this.qPe = paramInt1;
      this.qPf = paramInt2;
      if (Build.VERSION.SDK_INT >= 23) {
        setMode(this.qPe, this.qPf, 1, this.mRenderMode);
      }
    }
    GMTrace.o(5388975996928L, 40151);
  }
  
  public final void onSurfaceCreated(GL10 paramGL10, EGLConfig paramEGLConfig)
  {
    GMTrace.i(5389110214656L, 40152);
    GMTrace.o(5389110214656L, 40152);
  }
  
  public final void requestRender()
  {
    GMTrace.i(5390318174208L, 40161);
    if (!this.qOZ)
    {
      GMTrace.o(5390318174208L, 40161);
      return;
    }
    if (!this.qPd)
    {
      setMode(((OpenGlView)this.qPg.get()).getWidth(), ((OpenGlView)this.qPg.get()).getHeight(), 0, this.mRenderMode);
      this.qPd = true;
    }
    if (this.qPg.get() != null)
    {
      OpenGlView localOpenGlView = (OpenGlView)this.qPg.get();
      localOpenGlView.qPI = true;
      localOpenGlView.requestRender();
    }
    GMTrace.o(5390318174208L, 40161);
  }
  
  final native void setMode(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  final native void setParam(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt);
  
  private final class a
    extends ae
  {
    public a(Looper paramLooper)
    {
      super();
      GMTrace.i(5385888989184L, 40128);
      GMTrace.o(5385888989184L, 40128);
    }
    
    public final void handleMessage(Message paramMessage)
    {
      GMTrace.i(5386023206912L, 40129);
      OpenGlRender.this.requestRender();
      GMTrace.o(5386023206912L, 40129);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\video\OpenGlRender.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */