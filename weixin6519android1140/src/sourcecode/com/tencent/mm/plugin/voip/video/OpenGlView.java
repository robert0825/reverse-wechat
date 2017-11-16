package com.tencent.mm.plugin.voip.video;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.ref.WeakReference;

public class OpenGlView
  extends GLSurfaceView
{
  private static String TAG;
  public boolean pEm;
  public boolean qPI;
  public boolean qPJ;
  public int qPK;
  WeakReference<OpenGlRender> qPL;
  
  static
  {
    GMTrace.i(5392868311040L, 40180);
    TAG = "OpenGlView";
    GMTrace.o(5392868311040L, 40180);
  }
  
  public OpenGlView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(5391794569216L, 40172);
    this.qPI = false;
    this.qPJ = true;
    this.pEm = false;
    this.qPK = 1;
    this.qPK = OpenGlRender.bvY();
    getHolder().addCallback(this);
    try
    {
      getHolder().setType(2);
      if (this.qPK == 2)
      {
        setEGLContextFactory(new c());
        setEGLConfigChooser(new b());
      }
      GMTrace.o(5391794569216L, 40172);
      return;
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        try
        {
          getHolder().setType(1);
        }
        catch (Exception paramContext)
        {
          try
          {
            getHolder().setType(0);
          }
          catch (Exception paramContext) {}
        }
      }
    }
  }
  
  public final void a(OpenGlRender paramOpenGlRender)
  {
    GMTrace.i(5391928786944L, 40173);
    this.qPL = new WeakReference(paramOpenGlRender);
    super.setRenderer(paramOpenGlRender);
    GMTrace.o(5391928786944L, 40173);
  }
  
  public void ds(int paramInt1, int paramInt2)
  {
    GMTrace.i(5391660351488L, 40171);
    setLayoutParams(new RelativeLayout.LayoutParams(paramInt1, paramInt2));
    GMTrace.o(5391660351488L, 40171);
  }
  
  public void dt(int paramInt1, int paramInt2)
  {
    GMTrace.i(5392734093312L, 40179);
    GMTrace.o(5392734093312L, 40179);
  }
  
  public void onPause()
  {
    GMTrace.i(5392465657856L, 40177);
    super.onPause();
    GMTrace.o(5392465657856L, 40177);
  }
  
  public void onResume()
  {
    GMTrace.i(5392599875584L, 40178);
    super.onResume();
    GMTrace.o(5392599875584L, 40178);
  }
  
  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(5392331440128L, 40176);
    w.i(TAG, "surfaceChanged, format: %s, w: %s, h: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    super.surfaceChanged(paramSurfaceHolder, paramInt1, paramInt2, paramInt3);
    GMTrace.o(5392331440128L, 40176);
  }
  
  public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    GMTrace.i(5392063004672L, 40174);
    w.i(TAG, "surfaceCreated");
    super.surfaceCreated(paramSurfaceHolder);
    paramSurfaceHolder = (OpenGlRender)this.qPL.get();
    w.i(OpenGlRender.TAG, "surfaceCreated");
    paramSurfaceHolder.Init(OpenGlRender.bvY(), new WeakReference(paramSurfaceHolder), paramSurfaceHolder.mRenderMode);
    paramSurfaceHolder.setParam(paramSurfaceHolder.qOW, paramSurfaceHolder.qOX, paramSurfaceHolder.qOY, paramSurfaceHolder.mRenderMode);
    paramSurfaceHolder.setMode(((OpenGlView)paramSurfaceHolder.qPg.get()).getWidth(), ((OpenGlView)paramSurfaceHolder.qPg.get()).getHeight(), 0, paramSurfaceHolder.mRenderMode);
    paramSurfaceHolder.qPd = true;
    paramSurfaceHolder.qOZ = true;
    paramSurfaceHolder.requestRender();
    GMTrace.o(5392063004672L, 40174);
  }
  
  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    GMTrace.i(5392197222400L, 40175);
    w.i(TAG, "surfaceDestroyed");
    OpenGlRender localOpenGlRender = (OpenGlRender)this.qPL.get();
    w.i(OpenGlRender.TAG, "onSurfaceDestroyed");
    localOpenGlRender.qOZ = false;
    localOpenGlRender.Uninit(localOpenGlRender.mRenderMode);
    w.i(OpenGlRender.TAG, "steve: after Uninit in onSurfaceDestroyed");
    localOpenGlRender.qOU = 0;
    localOpenGlRender.qPe = 0;
    localOpenGlRender.qPf = 0;
    super.surfaceDestroyed(paramSurfaceHolder);
    GMTrace.o(5392197222400L, 40175);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\video\OpenGlView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */