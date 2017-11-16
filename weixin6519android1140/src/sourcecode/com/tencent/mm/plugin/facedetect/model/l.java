package com.tencent.mm.plugin.facedetect.model;

import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Camera.Size;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.c.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public final class l
{
  private Context context;
  public Camera fPj;
  public boolean kTD;
  public Point kTE;
  public Point kTF;
  private Point kTG;
  private boolean kTH;
  public int kTI;
  private boolean kTJ;
  private boolean kTK;
  public boolean kTL;
  public Point kTM;
  
  public l(Context paramContext)
  {
    GMTrace.i(5870146551808L, 43736);
    this.kTD = false;
    this.kTE = null;
    this.kTF = null;
    this.kTG = null;
    this.kTJ = false;
    this.kTK = true;
    this.kTL = false;
    this.kTM = null;
    this.context = paramContext;
    GMTrace.o(5870146551808L, 43736);
  }
  
  private static Point a(Camera.Parameters paramParameters, Point paramPoint, boolean paramBoolean)
  {
    GMTrace.i(5870817640448L, 43741);
    Object localObject = new ArrayList(paramParameters.getSupportedPreviewSizes());
    Collections.sort((List)localObject, new a());
    Point localPoint = null;
    float f3 = paramPoint.x / paramPoint.y;
    w.d("MicroMsg.FaceScanCamera", "screen.x: %d, screen.y: %d, ratio: %f", new Object[] { Integer.valueOf(paramPoint.x), Integer.valueOf(paramPoint.y), Float.valueOf(f3) });
    long l = bg.eD(ab.getContext());
    w.d("MicroMsg.FaceScanCamera", "systemAvailableMemInMB: %d", new Object[] { Long.valueOf(l) });
    int i = paramPoint.x;
    i = paramPoint.y;
    float f1 = Float.POSITIVE_INFINITY;
    localObject = ((List)localObject).iterator();
    int j;
    label242:
    label357:
    label364:
    label371:
    float f2;
    while (((Iterator)localObject).hasNext())
    {
      Camera.Size localSize = (Camera.Size)((Iterator)localObject).next();
      i = localSize.width;
      j = localSize.height;
      w.i("MicroMsg.FaceScanCamera", "realWidth: %d, realHeight: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
      int k = i * j;
      if ((k >= 150400) && (k <= 983040))
      {
        if (i > j)
        {
          m = 1;
          if (m == 0) {
            break label357;
          }
          k = j;
          if (m == 0) {
            break label364;
          }
        }
        for (int m = i;; m = j)
        {
          w.d("MicroMsg.FaceScanCamera", "maybeFlippedWidth: %d, maybeFlippedHeight: %d", new Object[] { Integer.valueOf(k), Integer.valueOf(m) });
          if ((k != paramPoint.x) || (m != paramPoint.y) || (!d(k, m, l))) {
            break label371;
          }
          paramParameters = new Point(i, j);
          w.i("MicroMsg.FaceScanCamera", "Found preview size exactly matching screen size: " + paramParameters);
          GMTrace.o(5870817640448L, 43741);
          return paramParameters;
          m = 0;
          break;
          k = i;
          break label242;
        }
        f2 = Math.abs(k / m - f3);
        if ((f2 >= f1) || (!d(i, j, l))) {
          break label564;
        }
        localPoint = new Point(i, j);
        f1 = f2;
      }
    }
    label551:
    label564:
    for (;;)
    {
      w.i("MicroMsg.FaceScanCamera", "diff:[%s] newdiff:[%s] w:[%s] h:[%s]", new Object[] { Float.valueOf(f1), Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(j) });
      break;
      paramPoint = localPoint;
      if (localPoint == null)
      {
        paramParameters = paramParameters.getPreviewSize();
        if (paramParameters == null) {
          break label551;
        }
        paramPoint = new Point(paramParameters.width, paramParameters.height);
        w.i("MicroMsg.FaceScanCamera", "No suitable preview sizes, using default: " + paramPoint);
      }
      for (;;)
      {
        w.i("MicroMsg.FaceScanCamera", "Found best approximate preview size: " + paramPoint);
        GMTrace.o(5870817640448L, 43741);
        return paramPoint;
        w.e("MicroMsg.FaceScanCamera", "hy: can not find default size!!");
        paramPoint = localPoint;
      }
    }
  }
  
  private static boolean d(int paramInt1, int paramInt2, long paramLong)
  {
    GMTrace.i(5870951858176L, 43742);
    double d = paramInt1 * paramInt2 * 3.0D / 2.0D / 1024.0D / 1024.0D;
    w.d("MicroMsg.FaceScanCamera", "dataSizeInMB: %f, availableMemInMb: %d", new Object[] { Double.valueOf(d), Long.valueOf(paramLong) });
    if (paramLong / d >= 5.0D)
    {
      GMTrace.o(5870951858176L, 43742);
      return true;
    }
    GMTrace.o(5870951858176L, 43742);
    return false;
  }
  
  public final void b(SurfaceTexture paramSurfaceTexture)
  {
    GMTrace.i(5870280769536L, 43737);
    if (this.kTD)
    {
      w.w("MicroMsg.FaceScanCamera", "in open(), previewing");
      release();
    }
    this.kTK = true;
    int j = Camera.getNumberOfCameras();
    int i = 0;
    Object localObject;
    if (i < j)
    {
      localObject = new Camera.CameraInfo();
      Camera.getCameraInfo(i, (Camera.CameraInfo)localObject);
      if ((((Camera.CameraInfo)localObject).facing == 1) && (this.kTK)) {
        w.d("MicroMsg.FaceScanCamera", "hy: front Camera found");
      }
    }
    for (;;)
    {
      long l = bg.Pw();
      localObject = com.tencent.mm.compatible.d.c.o(this.context, i);
      if (localObject == null)
      {
        w.e("MicroMsg.FaceScanCamera", "in open(), openCameraRes == null");
        throw new IOException();
        if ((((Camera.CameraInfo)localObject).facing == 0) && (!this.kTK))
        {
          w.d("MicroMsg.FaceScanCamera", "hy: front Camera found");
          continue;
        }
        i += 1;
        break;
      }
      this.kTL = true;
      w.d("MicroMsg.FaceScanCamera", "openCamera done, cameraId=[%s] costTime=[%s]", new Object[] { Integer.valueOf(i), Long.valueOf(bg.aI(l)) });
      this.kTI = ((c.a.a)localObject).eSp;
      if (((c.a.a)localObject).eSp % 180 != 0) {}
      for (boolean bool = true;; bool = false)
      {
        this.kTH = bool;
        this.fPj = ((c.a.a)localObject).fPj;
        if (this.fPj != null) {
          break;
        }
        w.e("MicroMsg.FaceScanCamera", "in open(), camera == null, bNeedRotate=[%s]", new Object[] { Boolean.valueOf(this.kTH) });
        throw new IOException();
      }
      this.fPj.setPreviewTexture(paramSurfaceTexture);
      Camera.Parameters localParameters = this.fPj.getParameters();
      Point localPoint2 = this.kTF;
      Point localPoint1 = this.kTG;
      localObject = localParameters.get("preview-size-values");
      if (localObject == null) {
        localObject = localParameters.get("preview-size-value");
      }
      for (;;)
      {
        paramSurfaceTexture = null;
        if (localObject != null)
        {
          w.d("MicroMsg.FaceScanCamera", "preview-size-values parameter: " + (String)localObject);
          paramSurfaceTexture = a(localParameters, localPoint2, false);
        }
        localObject = paramSurfaceTexture;
        if (paramSurfaceTexture == null) {
          localObject = new Point(localPoint1.x >> 3 << 3, localPoint1.y >> 3 << 3);
        }
        this.kTE = ((Point)localObject);
        this.kTM = new Point(this.kTE);
        w.d("MicroMsg.FaceScanCamera", "getCameraResolution: " + this.kTF + " camera:" + this.kTE + "bestVideoEncodeSize: " + this.kTM);
        localParameters.setPreviewSize(this.kTE.x, this.kTE.y);
        localParameters.setZoom(0);
        localParameters.setSceneMode("auto");
        try
        {
          if ((localParameters.getSupportedFocusModes() != null) && (localParameters.getSupportedFocusModes().contains("auto")))
          {
            w.i("MicroMsg.FaceScanCamera", "set FocusMode to FOCUS_MODE_AUTO");
            localParameters.setFocusMode("auto");
          }
          for (;;)
          {
            paramSurfaceTexture = localParameters.getSupportedPreviewFormats();
            localObject = paramSurfaceTexture.iterator();
            i = 0;
            if (!((Iterator)localObject).hasNext()) {
              break label766;
            }
            j = ((Integer)((Iterator)localObject).next()).intValue();
            w.d("MicroMsg.FaceScanCamera", "supportedPreviewFormat: " + j);
            if (j != 17) {
              break;
            }
            j = 1;
            label609:
            if (j == 0) {
              break label700;
            }
            localParameters.setPreviewFormat(17);
            label620:
            if (this.kTH) {
              localParameters.setRotation(this.kTI);
            }
            this.fPj.setParameters(localParameters);
            GMTrace.o(5870280769536L, 43737);
            return;
            w.i("MicroMsg.FaceScanCamera", "camera not support FOCUS_MODE_AUTO");
          }
        }
        catch (Exception paramSurfaceTexture)
        {
          for (;;)
          {
            w.e("MicroMsg.FaceScanCamera", "set focus mode error: %s", new Object[] { paramSurfaceTexture.getMessage() });
          }
          if (j == 842094169) {
            i = 1;
          }
          for (;;)
          {
            break;
            label700:
            if (i != 0)
            {
              w.e("MicroMsg.FaceScanCamera", "Preview not support PixelFormat.YCbCr_420_SP, but hasYU12");
              localParameters.setPreviewFormat(842094169);
              break label620;
            }
            w.e("MicroMsg.FaceScanCamera", "Preview not support PixelFormat.YCbCr_420_SP. Use format: %s", new Object[] { paramSurfaceTexture.get(0) });
            localParameters.setPreviewFormat(((Integer)paramSurfaceTexture.get(0)).intValue());
            break label620;
            label766:
            j = 0;
            break label609;
          }
        }
      }
      i = -1;
    }
  }
  
  public final int getPreviewHeight()
  {
    GMTrace.i(5870683422720L, 43740);
    w.v("MicroMsg.FaceScanCamera", "hy: preview height: %d", new Object[] { Integer.valueOf(this.kTE.y) });
    int i = this.kTE.y;
    GMTrace.o(5870683422720L, 43740);
    return i;
  }
  
  public final int getPreviewWidth()
  {
    GMTrace.i(5870549204992L, 43739);
    w.v("MicroMsg.FaceScanCamera", "hy: preview width: %d", new Object[] { Integer.valueOf(this.kTE.x) });
    int i = this.kTE.x;
    GMTrace.o(5870549204992L, 43739);
    return i;
  }
  
  public final void release()
  {
    GMTrace.i(5870414987264L, 43738);
    w.d("MicroMsg.FaceScanCamera", "release(), previewing = [%s]", new Object[] { Boolean.valueOf(this.kTD) });
    if (this.fPj != null)
    {
      long l = bg.Pw();
      if (this.kTD)
      {
        this.fPj.setPreviewCallback(null);
        this.fPj.stopPreview();
        this.kTD = false;
        w.d("MicroMsg.FaceScanCamera", "stopPreview costTime=[%s]", new Object[] { Long.valueOf(bg.aI(l)) });
      }
      l = bg.Pw();
      this.fPj.release();
      this.fPj = null;
      this.kTL = false;
      w.d("MicroMsg.FaceScanCamera", "camera.release() costTime=[%s]", new Object[] { Long.valueOf(bg.aI(l)) });
    }
    this.kTJ = false;
    GMTrace.o(5870414987264L, 43738);
  }
  
  public final void setPreviewCallback(final Camera.PreviewCallback paramPreviewCallback)
  {
    GMTrace.i(5871086075904L, 43743);
    if (this.fPj == null)
    {
      w.w("MicroMsg.FaceScanCamera", "hy: camera is null. setPreviewCallback failed");
      GMTrace.o(5871086075904L, 43743);
      return;
    }
    int i = getPreviewWidth() * getPreviewHeight() * ImageFormat.getBitsPerPixel(this.fPj.getParameters().getPreviewFormat()) / 8;
    byte[] arrayOfByte = c.kSA.h(Integer.valueOf(i));
    this.fPj.addCallbackBuffer(arrayOfByte);
    this.fPj.setPreviewCallbackWithBuffer(new Camera.PreviewCallback()
    {
      public final void onPreviewFrame(byte[] paramAnonymousArrayOfByte, Camera paramAnonymousCamera)
      {
        GMTrace.i(5862227705856L, 43677);
        if (paramPreviewCallback != null) {
          paramPreviewCallback.onPreviewFrame(paramAnonymousArrayOfByte, paramAnonymousCamera);
        }
        paramAnonymousCamera.addCallbackBuffer(paramAnonymousArrayOfByte);
        GMTrace.o(5862227705856L, 43677);
      }
    });
    GMTrace.o(5871086075904L, 43743);
  }
  
  private static final class a
    implements Comparator<Camera.Size>
  {
    public a()
    {
      GMTrace.i(5859140698112L, 43654);
      GMTrace.o(5859140698112L, 43654);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\facedetect\model\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */