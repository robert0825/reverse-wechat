package com.tencent.mm.plugin.scanner.util;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.Camera.Area;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Camera.Size;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.j;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ba;
import com.tencent.mm.ui.ad;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public final class h
{
  private static final Pattern oAN;
  public Activity eNu;
  public Camera fPj;
  public Rect kNW;
  public boolean kTD;
  public Point kTE;
  public Point kTF;
  public Point kTG;
  public boolean kTH;
  public int kTI;
  public boolean kTJ;
  public boolean mYm;
  public int oAO;
  public boolean oAP;
  public Rect oAQ;
  public Rect oAR;
  public int oAS;
  private String oAT;
  private int oAU;
  private int oAV;
  private int oAW;
  
  static
  {
    GMTrace.i(6165828206592L, 45939);
    oAN = Pattern.compile(",");
    GMTrace.o(6165828206592L, 45939);
  }
  
  public h(Activity paramActivity, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(6163680722944L, 45923);
    this.kTD = false;
    this.oAO = 0;
    this.kTE = null;
    this.kTF = null;
    this.kTG = null;
    this.kTJ = false;
    this.mYm = false;
    this.oAS = -1;
    this.oAT = "";
    this.eNu = paramActivity;
    if (Build.MANUFACTURER.equalsIgnoreCase("meizu")) {
      paramActivity = ((WindowManager)paramActivity.getSystemService("window")).getDefaultDisplay();
    }
    for (paramActivity = new Point(paramActivity.getWidth(), paramActivity.getHeight());; paramActivity = ad.ff(paramActivity))
    {
      this.kTF = paramActivity;
      this.oAP = paramBoolean;
      this.oAO = paramInt;
      GMTrace.o(6163680722944L, 45923);
      return;
    }
  }
  
  public static Point a(Camera.Parameters paramParameters, Point paramPoint1, Point paramPoint2, boolean paramBoolean)
  {
    GMTrace.i(6164888682496L, 45932);
    String str = paramParameters.get("preview-size-values");
    if (str == null) {
      str = paramParameters.get("preview-size-value");
    }
    for (;;)
    {
      Point localPoint = null;
      if (str != null)
      {
        w.d("MicroMsg.scanner.ScanCamera", "preview-size-values parameter: " + str);
        localPoint = a(paramParameters, paramPoint1, paramBoolean);
      }
      paramParameters = localPoint;
      if (localPoint == null) {
        paramParameters = new Point(paramPoint2.x >> 3 << 3, paramPoint2.y >> 3 << 3);
      }
      GMTrace.o(6164888682496L, 45932);
      return paramParameters;
    }
  }
  
  private static Point a(Camera.Parameters paramParameters, Point paramPoint, boolean paramBoolean)
  {
    GMTrace.i(6165022900224L, 45933);
    Object localObject = new ArrayList(paramParameters.getSupportedPreviewSizes());
    Collections.sort((List)localObject, new a());
    ((List)localObject).remove(0);
    Point localPoint = null;
    float f3 = paramPoint.x / paramPoint.y;
    w.d("MicroMsg.scanner.ScanCamera", "screen.x: %d, screen.y: %d, ratio: %f", new Object[] { Integer.valueOf(paramPoint.x), Integer.valueOf(paramPoint.y), Float.valueOf(f3) });
    int n = paramPoint.x * paramPoint.y;
    w.i("MicroMsg.scanner.ScanCamera", "SCREEN_PIXELS: %s, MAX_PREVIEW_PIXELS_USE_BIGGER: %s", new Object[] { Integer.valueOf(n), Integer.valueOf(2073600) });
    float f1 = Float.POSITIVE_INFINITY;
    localObject = ((List)localObject).iterator();
    int i;
    int j;
    label280:
    label389:
    label396:
    label403:
    float f2;
    while (((Iterator)localObject).hasNext())
    {
      Camera.Size localSize = (Camera.Size)((Iterator)localObject).next();
      i = localSize.width;
      j = localSize.height;
      w.i("MicroMsg.scanner.ScanCamera", "realWidth: %d, realHeight: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
      int k = i * j;
      if ((k >= 150400) && (k <= 2073600) && ((k <= n) || (Math.min(paramPoint.x, paramPoint.y) < 720)))
      {
        if (i > j)
        {
          m = 1;
          if ((m == 0) || (paramBoolean)) {
            break label389;
          }
          k = j;
          if ((m == 0) || (paramBoolean)) {
            break label396;
          }
        }
        for (int m = i;; m = j)
        {
          w.d("MicroMsg.scanner.ScanCamera", "maybeFlippedWidth: %d, maybeFlippedHeight: %d", new Object[] { Integer.valueOf(k), Integer.valueOf(m) });
          if ((k != paramPoint.x) || (m != paramPoint.y)) {
            break label403;
          }
          paramParameters = new Point(i, j);
          w.i("MicroMsg.scanner.ScanCamera", "Found preview size exactly matching screen size: " + paramParameters);
          GMTrace.o(6165022900224L, 45933);
          return paramParameters;
          m = 0;
          break;
          k = i;
          break label280;
        }
        f2 = Math.abs(k / m - f3);
        if (f2 >= f1) {
          break label570;
        }
        localPoint = new Point(i, j);
        f1 = f2;
      }
    }
    label570:
    for (;;)
    {
      w.i("MicroMsg.scanner.ScanCamera", "diff:[%s] newdiff:[%s] w:[%s] h:[%s]", new Object[] { Float.valueOf(f1), Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(j) });
      break;
      paramPoint = localPoint;
      if (localPoint == null)
      {
        paramParameters = paramParameters.getPreviewSize();
        paramPoint = new Point(paramParameters.width, paramParameters.height);
        w.i("MicroMsg.scanner.ScanCamera", "No suitable preview sizes, using default: " + paramPoint);
      }
      w.i("MicroMsg.scanner.ScanCamera", "Found best approximate preview size: " + paramPoint);
      GMTrace.o(6165022900224L, 45933);
      return paramPoint;
    }
  }
  
  public final void a(Camera.PreviewCallback paramPreviewCallback)
  {
    GMTrace.i(6163949158400L, 45925);
    if ((this.fPj != null) && (this.kTD)) {
      try
      {
        this.fPj.setOneShotPreviewCallback(paramPreviewCallback);
        GMTrace.o(6163949158400L, 45925);
        return;
      }
      catch (RuntimeException paramPreviewCallback)
      {
        w.w("MicroMsg.scanner.ScanCamera", "takeOneShot() " + paramPreviewCallback.getMessage());
      }
    }
    GMTrace.o(6163949158400L, 45925);
  }
  
  public final void aPb()
  {
    GMTrace.i(6165693988864L, 45938);
    w.i("MicroMsg.scanner.ScanCamera", "closeFlash, camera: %s, isPreviewing: %s", new Object[] { this.fPj, Boolean.valueOf(this.kTD) });
    if ((this.fPj != null) && (this.kTD)) {
      try
      {
        this.mYm = false;
        Camera.Parameters localParameters = this.fPj.getParameters();
        if ((!bg.cc(localParameters.getSupportedFlashModes())) && (localParameters.getSupportedFlashModes().contains("off")))
        {
          localParameters.setFlashMode("off");
          this.fPj.setParameters(localParameters);
          w.i("MicroMsg.scanner.ScanCamera", "close flash");
          GMTrace.o(6165693988864L, 45938);
          return;
        }
        w.i("MicroMsg.scanner.ScanCamera", "camera not support close flash!!");
        GMTrace.o(6165693988864L, 45938);
        return;
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.scanner.ScanCamera", localException, "closeFlash error: %s", new Object[] { localException.getMessage() });
      }
    }
    GMTrace.o(6165693988864L, 45938);
  }
  
  public final float bds()
  {
    GMTrace.i(6164486029312L, 45929);
    if ((this.kTH) && (!this.oAP))
    {
      f = this.kTG.x / this.kTE.y;
      GMTrace.o(6164486029312L, 45929);
      return f;
    }
    float f = this.kTG.x / this.kTE.x;
    GMTrace.o(6164486029312L, 45929);
    return f;
  }
  
  public final float bdt()
  {
    GMTrace.i(6164620247040L, 45930);
    if ((this.kTH) && (!this.oAP))
    {
      f = this.kTG.y / this.kTE.x;
      GMTrace.o(6164620247040L, 45930);
      return f;
    }
    float f = this.kTG.y / this.kTE.y;
    GMTrace.o(6164620247040L, 45930);
    return f;
  }
  
  public final void bdu()
  {
    GMTrace.i(6165157117952L, 45934);
    Object localObject;
    boolean bool;
    if (this.fPj != null)
    {
      localObject = this.fPj.getParameters();
      String str = ((Camera.Parameters)localObject).get("zoom-supported");
      if ((bg.nm(str)) || (!Boolean.parseBoolean(str)))
      {
        w.i("MicroMsg.scanner.ScanCamera", "not support zoom");
        GMTrace.o(6165157117952L, 45934);
        return;
      }
      localObject = ((Camera.Parameters)localObject).getZoomRatios();
      if ((localObject == null) || (((List)localObject).size() <= 0))
      {
        GMTrace.o(6165157117952L, 45934);
        return;
      }
      at.AR();
      p.dO(c.xi().bUq());
      if (p.fQL.fPL != 1) {
        break label386;
      }
      bool = true;
      w.i("MicroMsg.scanner.ScanCamera", "needZoom: %s, qrCodeZoom: %s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(p.fQL.fPL) });
      if ((!bool) || (this.kTF.x < 720) || ((this.oAO != 1) && (this.oAO != 8) && (this.oAO != 4))) {
        break label391;
      }
      this.oAV = (((List)localObject).size() / 5);
      if (this.oAV > 150) {
        this.oAV = 150;
      }
      label229:
      double d = 1.5D;
      if (p.fQL.fPM != -1.0D) {
        d = p.fQL.fPM;
      }
      this.oAW = ((int)(((List)localObject).size() / d));
      w.d("MicroMsg.scanner.ScanCamera", "divideRatio: %f,max zoom: %d", new Object[] { Double.valueOf(d), Integer.valueOf(this.oAW) });
      if (this.oAW >= this.oAV) {
        break label399;
      }
      this.oAW = this.oAV;
    }
    for (;;)
    {
      w.i("MicroMsg.scanner.ScanCamera", "default zoom:%d,default ratio:%d,max zoom:%d,max ratio:%d", new Object[] { Integer.valueOf(this.oAV), ((List)localObject).get(this.oAV), Integer.valueOf(this.oAW), ((List)localObject).get(this.oAW) });
      GMTrace.o(6165157117952L, 45934);
      return;
      label386:
      bool = false;
      break;
      label391:
      this.oAV = 0;
      break label229;
      label399:
      if (this.oAW > 400) {
        this.oAW = 400;
      }
    }
  }
  
  public final int bdv()
  {
    GMTrace.i(18911546310656L, 140902);
    if ((this.fPj != null) && (this.fPj.getParameters() != null) && (this.fPj.getParameters().getZoomRatios() != null) && (this.fPj.getParameters().getZoomRatios().size() > 0))
    {
      int i = ((Integer)this.fPj.getParameters().getZoomRatios().get(this.oAU)).intValue();
      GMTrace.o(18911546310656L, 140902);
      return i;
    }
    GMTrace.o(18911546310656L, 140902);
    return 100;
  }
  
  public final boolean bdw()
  {
    GMTrace.i(6165559771136L, 45937);
    if ((this.fPj != null) && (this.kTD)) {}
    try
    {
      Camera.Parameters localParameters = this.fPj.getParameters();
      if (!bg.cc(localParameters.getSupportedFlashModes()))
      {
        boolean bool = localParameters.getSupportedFlashModes().contains("torch");
        if (bool)
        {
          GMTrace.o(6165559771136L, 45937);
          return true;
        }
      }
      w.i("MicroMsg.scanner.ScanCamera", "camera not support flash!!");
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.scanner.ScanCamera", localException, "isFlashSupported error: %s", new Object[] { localException.getMessage() });
      }
    }
    GMTrace.o(6165559771136L, 45937);
    return false;
  }
  
  public final void c(SurfaceTexture paramSurfaceTexture)
  {
    GMTrace.i(6163814940672L, 45924);
    long l = bg.Pw();
    if ((this.fPj != null) && (!this.kTD))
    {
      if (paramSurfaceTexture != null) {
        this.fPj.setPreviewTexture(paramSurfaceTexture);
      }
      this.fPj.startPreview();
      this.kTD = true;
      w.d("MicroMsg.scanner.ScanCamera", "startPreview done costTime=[%s]", new Object[] { Long.valueOf(bg.aI(l)) });
    }
    GMTrace.o(6163814940672L, 45924);
  }
  
  public final boolean isOpen()
  {
    GMTrace.i(6164083376128L, 45926);
    if (this.fPj != null)
    {
      GMTrace.o(6164083376128L, 45926);
      return true;
    }
    GMTrace.o(6164083376128L, 45926);
    return false;
  }
  
  public final void j(Rect paramRect)
  {
    GMTrace.i(6164754464768L, 45931);
    if ((this.fPj == null) || (this.kTJ))
    {
      GMTrace.o(6164754464768L, 45931);
      return;
    }
    for (;;)
    {
      try
      {
        Camera.Parameters localParameters = this.fPj.getParameters();
        Rect localRect = this.oAR;
        if (localRect == null)
        {
          if (paramRect == null)
          {
            GMTrace.o(6164754464768L, 45931);
            return;
          }
          this.oAR = new Rect();
          this.oAR.left = ((int)(paramRect.left / this.kTG.x * 2000.0F) - 1000);
          this.oAR.right = ((int)(paramRect.right / this.kTG.x * 2000.0F) - 1000);
          this.oAR.top = ((int)(paramRect.top / this.kTG.y * 2000.0F) - 1000);
          this.oAR.bottom = ((int)(paramRect.bottom / this.kTG.y * 2000.0F) - 1000);
        }
        w.i("MicroMsg.scanner.ScanCamera", "setFocusAndMeteringArea, area: %s, scanDisplayRect: %s, visibleResolution: %s", new Object[] { this.oAR, paramRect, this.kTG });
        if (localParameters.getMaxNumMeteringAreas() > 0)
        {
          paramRect = new ArrayList();
          paramRect.add(new Camera.Area(this.oAR, 1000));
          localParameters.setMeteringAreas(paramRect);
          if (localParameters.getMaxNumFocusAreas() > 0)
          {
            paramRect = new ArrayList();
            paramRect.add(new Camera.Area(this.oAR, 1000));
            localParameters.setFocusAreas(paramRect);
            this.fPj.setParameters(localParameters);
            GMTrace.o(6164754464768L, 45931);
          }
        }
        else
        {
          w.i("MicroMsg.scanner.ScanCamera", "setFocusAndMeteringArea, camera not support set metering area");
          continue;
        }
        w.i("MicroMsg.scanner.ScanCamera", "setFocusAndMeteringArea, camera not support area focus");
      }
      catch (Exception paramRect)
      {
        w.e("MicroMsg.scanner.ScanCamera", "setFocusAndMeteringArea error: %s", new Object[] { paramRect.getMessage() });
        GMTrace.o(6164754464768L, 45931);
        return;
      }
    }
  }
  
  public final void release()
  {
    GMTrace.i(6164351811584L, 45928);
    w.d("MicroMsg.scanner.ScanCamera", "release(), previewing = [%s]", new Object[] { Boolean.valueOf(this.kTD) });
    if (this.fPj != null)
    {
      long l = bg.Pw();
      if (this.kTD)
      {
        this.fPj.setPreviewCallback(null);
        this.fPj.stopPreview();
        this.kTD = false;
        w.d("MicroMsg.scanner.ScanCamera", "stopPreview costTime=[%s]", new Object[] { Long.valueOf(bg.aI(l)) });
      }
      l = bg.Pw();
      this.fPj.release();
      this.fPj = null;
      w.d("MicroMsg.scanner.ScanCamera", "camera.release() costTime=[%s]", new Object[] { Long.valueOf(bg.aI(l)) });
    }
    this.mYm = false;
    this.kTJ = false;
    this.oAS = -1;
    this.oAO = 0;
    GMTrace.o(6164351811584L, 45928);
  }
  
  public final void tB(int paramInt)
  {
    GMTrace.i(6164217593856L, 45927);
    this.oAO = paramInt;
    this.oAQ = null;
    this.kNW = null;
    GMTrace.o(6164217593856L, 45927);
  }
  
  public final void tC(int paramInt)
  {
    GMTrace.i(6165291335680L, 45935);
    if ((this.fPj != null) && (this.kTD) && (paramInt > 0)) {}
    label561:
    label566:
    for (;;)
    {
      try
      {
        Camera.Parameters localParameters = this.fPj.getParameters();
        List localList = localParameters.getZoomRatios();
        if (localList != null)
        {
          i = localList.size();
          if (i > 0) {}
        }
        else
        {
          GMTrace.o(6165291335680L, 45935);
          return;
        }
        double d = paramInt / 100.0D;
        int j = (int)(((Integer)localList.get(this.oAU)).intValue() * d);
        w.d("MicroMsg.scanner.ScanCamera", "scale:%d,to ratio:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(j) });
        if ((j >= ((Integer)localList.get(this.oAV)).intValue()) && (j <= ((Integer)localList.get(this.oAW)).intValue()))
        {
          if ((localList == null) || (localList.size() <= 0)) {
            break label561;
          }
          w.i("MicroMsg.scanner.ScanCamera", "zoomRatios: %s,size: %d", new Object[] { localList, Integer.valueOf(localList.size()) });
          paramInt = Collections.binarySearch(localList, Integer.valueOf(j));
          w.i("MicroMsg.scanner.ScanCamera", "insert index:%d", new Object[] { Integer.valueOf(paramInt) });
          if (paramInt >= 0)
          {
            w.i("MicroMsg.scanner.ScanCamera", "zoom:%d,ratio:%d", new Object[] { Integer.valueOf(paramInt), localList.get(paramInt) });
            this.oAU = paramInt;
            localParameters.setZoom(paramInt);
            this.fPj.setParameters(localParameters);
            GMTrace.o(6165291335680L, 45935);
            return;
          }
          paramInt = -(paramInt + 1);
          i = paramInt - 1;
          if ((paramInt >= 0) && (paramInt <= localList.size() - 1) && (i >= 0) && (i <= localList.size() - 1))
          {
            if (((Integer)localList.get(paramInt)).intValue() - j <= j - ((Integer)localList.get(i)).intValue()) {
              break label566;
            }
            paramInt = i;
            continue;
          }
          if ((paramInt >= 0) && (paramInt <= localList.size() - 1)) {
            continue;
          }
          if ((i < 0) || (i > localList.size() - 1)) {
            break label561;
          }
          paramInt = i;
          continue;
        }
        if (j < ((Integer)localList.get(this.oAV)).intValue())
        {
          paramInt = this.oAV;
          continue;
        }
        w.i("MicroMsg.scanner.ScanCamera", "exceed max zoom");
        int i = this.oAU + (this.oAW - this.oAU) / 5;
        paramInt = i;
        if (i <= this.oAW) {
          continue;
        }
        paramInt = this.oAW;
        continue;
        GMTrace.o(6165291335680L, 45935);
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.scanner.ScanCamera", "zoom scale exception:" + localException.getMessage());
      }
      return;
      paramInt = 0;
    }
  }
  
  public final void tD(int paramInt)
  {
    GMTrace.i(6165425553408L, 45936);
    if ((this.fPj != null) && (this.kTD)) {}
    for (;;)
    {
      int i;
      try
      {
        Camera.Parameters localParameters = this.fPj.getParameters();
        List localList = localParameters.getZoomRatios();
        if (localList != null)
        {
          i = localList.size();
          if (i > 0) {}
        }
        else
        {
          GMTrace.o(6165425553408L, 45936);
          return;
        }
        w.i("MicroMsg.scanner.ScanCamera", "zoom action:%d,beforeZoom:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(localParameters.getZoom()) });
        switch (paramInt)
        {
        case 0: 
          localParameters.setZoom(this.oAU);
          this.fPj.setParameters(localParameters);
          w.i("MicroMsg.scanner.ScanCamera", "zoom action:%d,afterZoom:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(localParameters.getZoom()) });
          GMTrace.o(6165425553408L, 45936);
          return;
        }
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.scanner.ScanCamera", "zoom action exception:" + localException.getMessage());
      }
      this.oAU = 0;
      continue;
      GMTrace.o(6165425553408L, 45936);
      return;
      this.oAU = this.oAV;
      continue;
      if (this.oAU < this.oAW)
      {
        this.oAU += 1;
        if (this.oAU > this.oAW) {}
        for (i = this.oAW;; i = this.oAU)
        {
          this.oAU = i;
          break;
        }
        if (this.oAU > this.oAV)
        {
          this.oAU -= 1;
          if (this.oAU < this.oAV) {}
          for (i = this.oAV;; i = this.oAU)
          {
            this.oAU = i;
            break;
          }
          this.oAU = this.oAW;
          continue;
          if (this.oAU != this.oAV) {
            this.oAU = this.oAV;
          } else {
            this.oAU = this.oAW;
          }
        }
      }
    }
  }
  
  private static final class a
    implements Comparator<Camera.Size>
  {
    public a()
    {
      GMTrace.i(6176834060288L, 46021);
      GMTrace.o(6176834060288L, 46021);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\util\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */