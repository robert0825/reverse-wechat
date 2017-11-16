package com.tencent.mm.plugin.mmsight.ui.cameraglview;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.mmsight.model.f;
import com.tencent.mm.sdk.platformtools.w;

public final class a
{
  public f njD;
  public MMSightCameraGLSurfaceView njE;
  
  public a(MMSightCameraGLSurfaceView paramMMSightCameraGLSurfaceView)
  {
    GMTrace.i(7393651982336L, 55087);
    this.njD = new f()
    {
      public final boolean L(byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(7393383546880L, 55085);
        if (a.this.njE != null)
        {
          MMSightCameraGLSurfaceView localMMSightCameraGLSurfaceView = a.this.njE;
          if ((paramAnonymousArrayOfByte == null) || (localMMSightCameraGLSurfaceView.njG == null) || (localMMSightCameraGLSurfaceView.njG.hwV)) {
            break label82;
          }
          localMMSightCameraGLSurfaceView.njG.a(paramAnonymousArrayOfByte, localMMSightCameraGLSurfaceView.hwX, localMMSightCameraGLSurfaceView.hwY, localMMSightCameraGLSurfaceView.hxr, false);
          localMMSightCameraGLSurfaceView.requestRender();
        }
        for (;;)
        {
          GMTrace.o(7393383546880L, 55085);
          return false;
          label82:
          w.v("MicroMsg.MMSightCameraGLSurfaceView", "passing draw");
        }
      }
    };
    this.njE = paramMMSightCameraGLSurfaceView;
    GMTrace.o(7393651982336L, 55087);
  }
  
  public final void I(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(7393786200064L, 55088);
    if (this.njE != null) {
      if ((paramInt3 != 0) && (paramInt3 != 180)) {
        break label114;
      }
    }
    label114:
    for (int i = paramInt1;; i = paramInt2)
    {
      if ((paramInt3 == 0) || (paramInt3 == 180)) {
        paramInt1 = paramInt2;
      }
      MMSightCameraGLSurfaceView localMMSightCameraGLSurfaceView = this.njE;
      w.i("MicroMsg.MMSightCameraGLSurfaceView", "setFrameInfo, width: %s, height: %s, rotate: %s this: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt1), Integer.valueOf(paramInt3), localMMSightCameraGLSurfaceView });
      localMMSightCameraGLSurfaceView.hwX = i;
      localMMSightCameraGLSurfaceView.hwY = paramInt1;
      localMMSightCameraGLSurfaceView.hxr = paramInt3;
      GMTrace.o(7393786200064L, 55088);
      return;
    }
  }
  
  public final void a(byte[] paramArrayOfByte, boolean paramBoolean, int paramInt)
  {
    GMTrace.i(7393517764608L, 55086);
    if (this.njE != null)
    {
      MMSightCameraGLSurfaceView localMMSightCameraGLSurfaceView = this.njE;
      if ((paramArrayOfByte != null) && (localMMSightCameraGLSurfaceView.njG != null) && (!localMMSightCameraGLSurfaceView.njG.hwV))
      {
        localMMSightCameraGLSurfaceView.njG.a(paramArrayOfByte, localMMSightCameraGLSurfaceView.hwX, localMMSightCameraGLSurfaceView.hwY, paramInt, paramBoolean);
        localMMSightCameraGLSurfaceView.requestRender();
        GMTrace.o(7393517764608L, 55086);
        return;
      }
      w.v("MicroMsg.MMSightCameraGLSurfaceView", "passing draw");
    }
    GMTrace.o(7393517764608L, 55086);
  }
  
  public final void aQI()
  {
    GMTrace.i(7393920417792L, 55089);
    if (this.njE != null)
    {
      MMSightCameraGLSurfaceView localMMSightCameraGLSurfaceView = this.njE;
      if (localMMSightCameraGLSurfaceView.njG != null)
      {
        localMMSightCameraGLSurfaceView.njG.hxm = true;
        localMMSightCameraGLSurfaceView.requestRender();
      }
    }
    GMTrace.o(7393920417792L, 55089);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\ui\cameraglview\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */