package com.tencent.mm.plugin.voip.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.Camera.Area;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Camera.Size;
import android.view.Display;
import android.view.SurfaceHolder;
import android.view.WindowManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.d.b.a;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.compatible.util.l;
import com.tencent.mm.g.a.lm;
import com.tencent.mm.plugin.video.ObservableSurfaceView;
import com.tencent.mm.plugin.video.ObservableTextureView;
import com.tencent.mm.plugin.voip.model.e;
import com.tencent.mm.plugin.voip.model.m;
import com.tencent.mm.plugin.voip.model.n;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.plugin.voip_cs.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public final class a
  implements com.tencent.mm.plugin.video.a, com.tencent.mm.plugin.video.b
{
  private static final Pattern oAN;
  private static int qNS;
  private static int qNT;
  protected Camera mCamera;
  protected int mHeight;
  protected int mWidth;
  protected boolean qNU;
  protected boolean qNV;
  protected boolean qNW;
  protected boolean qNX;
  protected boolean qNY;
  protected long qNZ;
  protected long qOa;
  protected int qOb;
  protected Camera.Parameters qOc;
  protected Camera.Size qOd;
  protected int qOe;
  protected boolean qOf;
  protected boolean qOg;
  protected boolean qOh;
  protected ObservableSurfaceView qOi;
  protected ObservableTextureView qOj;
  protected f qOk;
  protected boolean qOl;
  protected boolean qOm;
  protected byte[] qOn;
  protected int[] qOo;
  protected List<byte[]> qOp;
  protected boolean qOq;
  protected int qOr;
  protected int qOs;
  protected int qOt;
  protected int qOu;
  Camera.PreviewCallback qOv;
  
  static
  {
    GMTrace.i(5396760625152L, 40209);
    oAN = Pattern.compile(",");
    qNS = 20;
    qNT = 70;
    GMTrace.o(5396760625152L, 40209);
  }
  
  public a(int paramInt1, int paramInt2)
  {
    GMTrace.i(5393539399680L, 40185);
    this.qNU = false;
    this.qNV = false;
    this.qNW = false;
    this.qNX = false;
    this.qNY = false;
    this.qNZ = 0L;
    this.qOa = 30000L;
    this.qOb = 0;
    this.qOf = false;
    this.qOg = false;
    this.qOh = false;
    this.qOi = null;
    this.qOl = false;
    this.qOm = false;
    this.qOn = null;
    this.qOo = null;
    this.mWidth = 320;
    this.mHeight = 240;
    this.qOq = true;
    this.qOs = 0;
    this.qOt = 0;
    this.qOu = 0;
    this.qOv = new Camera.PreviewCallback()
    {
      public final void onPreviewFrame(byte[] paramAnonymousArrayOfByte, Camera paramAnonymousCamera)
      {
        GMTrace.i(5386291642368L, 40131);
        if ((paramAnonymousArrayOfByte == null) || (paramAnonymousArrayOfByte.length <= 0))
        {
          com.tencent.mm.plugin.report.service.g.ork.a(159L, 0L, 1L, false);
          com.tencent.mm.plugin.report.service.g.ork.a(159L, 3L, 1L, false);
          if (a.this.qOk != null) {
            a.this.qOk.aRZ();
          }
          GMTrace.o(5386291642368L, 40131);
          return;
        }
        if (a.this.qOd == null)
        {
          w.e("MicroMsg.Voip.CaptureRender", "onPreviewFrame mSize is null");
          GMTrace.o(5386291642368L, 40131);
          return;
        }
        int m;
        int j;
        int i;
        int k;
        if (a.this.qOk != null)
        {
          m = 1;
          if (!a.this.qNU) {
            break label465;
          }
          j = i.qQb;
          i = j;
          if (!p.fQC.fOF) {
            break label582;
          }
          i = j;
          if (p.fQC.fOE.eSp == 0) {
            break label582;
          }
          i = p.fQC.fOE.fPh;
          m = 1;
          k = j;
          j = m;
        }
        for (;;)
        {
          label185:
          boolean bool;
          if (k > 0)
          {
            m = 32;
            paramAnonymousCamera = a.this;
            if ((j != 0) || (k <= 0)) {
              break label527;
            }
            bool = true;
            label203:
            paramAnonymousCamera.qNV = bool;
            k = a.this.qOd.width;
            int n = a.this.qOd.height;
            if (j == 0) {
              break label533;
            }
            if (a.this.qOn == null)
            {
              j = k * n * 3 / 2;
              a.this.qOn = new byte[j];
              a.this.qOn[0] = 90;
            }
            Object localObject = com.tencent.mm.plugin.voip.model.d.btG();
            j = paramAnonymousArrayOfByte.length;
            int i1 = a.this.qOe;
            paramAnonymousCamera = a.this.qOn;
            int i2 = a.this.qOn.length;
            localObject = ((m)localObject).qIe.qDX.qFt;
            if ((((com.tencent.mm.plugin.voip.model.g)localObject).qFN != com.tencent.mm.plugin.voip.model.g.qFM) && (((com.tencent.mm.plugin.voip.model.g)localObject).qDX.qFr.ndo) && (((com.tencent.mm.plugin.voip.model.g)localObject).qDX.btS())) {
              ((com.tencent.mm.plugin.voip.model.g)localObject).qDX.qFr.videoRorate90D(paramAnonymousArrayOfByte, j, k, n, i1, paramAnonymousCamera, i2, k, n, i);
            }
            a.this.qOk.a(a.this.qOn, a.this.qOn.length, k, n, a.this.qOe + m);
          }
          for (;;)
          {
            if (com.tencent.mm.plugin.voip.b.d.bvK() >= 8) {
              a.this.mCamera.addCallbackBuffer(paramAnonymousArrayOfByte);
            }
            GMTrace.o(5386291642368L, 40131);
            return;
            label465:
            j = i.qQc;
            i = j;
            if (!p.fQC.fOH) {
              break label582;
            }
            i = j;
            if (p.fQC.fOG.eSp == 0) {
              break label582;
            }
            i = p.fQC.fOG.fPh;
            m = 1;
            k = j;
            j = m;
            break;
            m = 0;
            break label185;
            label527:
            bool = false;
            break label203;
            label533:
            a.this.qOk.a(paramAnonymousArrayOfByte, paramAnonymousArrayOfByte.length, a.this.qOd.width, a.this.qOd.height, a.this.qOe + m);
          }
          label582:
          j = 0;
          k = i;
          i = m;
        }
      }
    };
    this.mWidth = paramInt1;
    this.mHeight = paramInt2;
    i.jdMethod_do(ab.getContext().getApplicationContext());
    w.d("MicroMsg.Voip.CaptureRender", "width: %d, height: %d", new Object[] { Integer.valueOf(this.mWidth), Integer.valueOf(this.mHeight) });
    GMTrace.o(5393539399680L, 40185);
  }
  
  private static Point a(CharSequence paramCharSequence, Point paramPoint)
  {
    GMTrace.i(5395015794688L, 40196);
    paramCharSequence = oAN.split(paramCharSequence);
    int i3 = paramCharSequence.length;
    int m = 0;
    int j = 0;
    int i = 0;
    int n = Integer.MAX_VALUE;
    String str;
    int k;
    for (;;)
    {
      if (m >= i3) {
        break label278;
      }
      str = paramCharSequence[m].trim();
      k = str.indexOf('x');
      if (k >= 0) {
        break;
      }
      w.w("MicroMsg.Voip.CaptureRender", "Bad preview-size: " + str);
      k = j;
      j = i;
      i = k;
      m += 1;
      k = j;
      j = i;
      i = k;
    }
    for (;;)
    {
      int i2;
      try
      {
        i1 = Integer.parseInt(str.substring(0, k));
        k = Integer.parseInt(str.substring(k + 1));
        i2 = Math.abs(i1 - paramPoint.x) + Math.abs(k - paramPoint.y);
        if (i2 != 0) {
          break label230;
        }
        if ((i1 <= 0) || (k <= 0)) {
          break label257;
        }
        paramCharSequence = new Point(i1, k);
        GMTrace.o(5395015794688L, 40196);
        return paramCharSequence;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        w.w("MicroMsg.Voip.CaptureRender", "Bad preview-size: " + str);
        k = i;
        i = j;
        j = k;
      }
      break;
      label230:
      if ((i2 < n) && (i1 != k))
      {
        n = i2;
        j = i1;
        i = k;
        break;
        label257:
        GMTrace.o(5395015794688L, 40196);
        return null;
      }
      k = i;
      i = j;
      j = k;
      break;
      label278:
      k = j;
      int i1 = i;
    }
  }
  
  private static boolean a(Camera paramCamera, int paramInt1, int paramInt2)
  {
    GMTrace.i(5394747359232L, 40194);
    if (paramCamera == null)
    {
      GMTrace.o(5394747359232L, 40194);
      return false;
    }
    try
    {
      Camera.Parameters localParameters = paramCamera.getParameters();
      if ((paramInt1 > 0) && (paramInt2 > 0)) {
        localParameters.setPreviewSize(paramInt1, paramInt2);
      }
      paramCamera.setParameters(localParameters);
      GMTrace.o(5394747359232L, 40194);
      return true;
    }
    catch (Exception paramCamera)
    {
      com.tencent.mm.plugin.report.service.g.ork.a(159L, 0L, 1L, false);
      w.e("MicroMsg.Voip.CaptureRender", "TryPreviewSize fail:" + paramCamera.toString());
      GMTrace.o(5394747359232L, 40194);
    }
    return false;
  }
  
  private void bvQ()
  {
    GMTrace.i(5394344706048L, 40191);
    if ((this.qOd != null) && (this.qOd.height > 0) && (this.qOd.width > 0))
    {
      int j = this.qOd.height * this.qOd.width * 3 / 2;
      if (this.qOp == null)
      {
        this.qOp = new ArrayList(3);
        i = 0;
        while (i < 3)
        {
          this.qOp.add(new byte[j]);
          i += 1;
        }
      }
      int i = 0;
      while (i < this.qOp.size())
      {
        this.mCamera.addCallbackBuffer((byte[])this.qOp.get(i));
        i += 1;
      }
      this.mCamera.setPreviewCallbackWithBuffer(this.qOv);
      GMTrace.o(5394344706048L, 40191);
      return;
    }
    this.mCamera.setPreviewCallback(this.qOv);
    GMTrace.o(5394344706048L, 40191);
  }
  
  public static void bvS()
  {
    GMTrace.i(5395686883328L, 40201);
    GMTrace.o(5395686883328L, 40201);
  }
  
  private int d(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    GMTrace.i(5395150012416L, 40197);
    w.i("MicroMsg.Voip.CaptureRender", "try open camera, face: " + paramBoolean);
    this.qOg = false;
    int j = 1;
    int i = j;
    if (this.mCamera != null)
    {
      if (this.qNU == paramBoolean) {
        break label126;
      }
      this.mCamera.setPreviewCallback(null);
      this.mCamera.stopPreview();
      this.mCamera.release();
      this.mCamera = null;
    }
    label126:
    for (i = j; i != 0; i = 0)
    {
      this.mCamera = iF(paramBoolean);
      if (this.mCamera != null) {
        break;
      }
      this.qOf = false;
      GMTrace.o(5395150012416L, 40197);
      return -1;
    }
    Object localObject3;
    try
    {
      if (this.mCamera != null) {
        this.mCamera.getParameters();
      }
      this.qOf = true;
      localObject1 = this.mCamera;
      i = i.qPY.qOF;
      if (localObject1 == null) {}
    }
    catch (Exception localException1)
    {
      try
      {
        label208:
        label251:
        label259:
        localCamera = this.mCamera;
        localObject1 = localCamera.getParameters();
        localPoint = new Point(paramInt1, paramInt2);
        localObject4 = ((Camera.Parameters)localObject1).get("preview-size-values");
        if (localObject4 != null) {
          break label1357;
        }
        localObject4 = ((Camera.Parameters)localObject1).get("preview-size-value");
        label388:
        localObject1 = null;
        if (localObject4 != null)
        {
          w.i("MicroMsg.Voip.CaptureRender", "preview-size-values parameter: " + (String)localObject4);
          localObject1 = a((CharSequence)localObject4, localPoint);
        }
        localObject4 = localObject1;
        if (localObject1 == null) {
          localObject4 = new Point(localPoint.x >> 3 << 3, localPoint.y >> 3 << 3);
        }
        localCamera.getClass();
        localObject1 = new Camera.Size(localCamera, ((Point)localObject4).x, ((Point)localObject4).y);
      }
      catch (Exception localException5)
      {
        Object localObject1;
        Object localObject5;
        localObject2 = localObject5;
      }
      try
      {
        w.i("MicroMsg.Voip.CaptureRender", "getCameraResolution:" + ((Camera.Size)localObject1).width + "," + ((Camera.Size)localObject1).height);
        if (i == 0) {
          break label861;
        }
        paramBoolean = a(this.mCamera, ((Camera.Size)localObject3).width, ((Camera.Size)localObject3).height);
        w.i("MicroMsg.Voip.CaptureRender", "1.try config size first! w" + ((Camera.Size)localObject3).width + ",h" + ((Camera.Size)localObject3).height);
        if ((paramBoolean) || (localObject1 == null)) {
          break label985;
        }
        w.e("MicroMsg.Voip.CaptureRender", "1.try config size failed!,try support size: w" + ((Camera.Size)localObject1).width + ",h" + ((Camera.Size)localObject1).height);
        if (a(this.mCamera, ((Camera.Size)localObject1).width, ((Camera.Size)localObject1).height)) {
          break label985;
        }
        w.e("MicroMsg.Voip.CaptureRender", "1.try support size fail: w" + ((Camera.Size)localObject1).width + ",h" + ((Camera.Size)localObject1).height);
        GMTrace.o(5395150012416L, 40197);
        return -1;
      }
      catch (Exception localException6)
      {
        for (;;) {}
      }
      localException1 = localException1;
      com.tencent.mm.plugin.report.service.g.ork.a(159L, 0L, 1L, false);
      w.e("MicroMsg.Voip.CaptureRender", "Camera open failed, error:%s", new Object[] { localException1.getMessage() });
      if (this.qOk != null) {
        this.qOk.aRZ();
      }
      GMTrace.o(5395150012416L, 40197);
      return -1;
    }
    try
    {
      localObject3 = ((Camera)localObject1).getParameters();
      if (!l.rG()) {
        break label774;
      }
      ((Camera.Parameters)localObject3).setPreviewFpsRange(i * 1000, i * 1000);
      ((Camera)localObject1).setParameters((Camera.Parameters)localObject3);
    }
    catch (Exception localException2)
    {
      w.e("MicroMsg.Voip.CaptureRender", "SafeSetFps error:" + localException2.toString());
      break label208;
      localObject2 = i.qPY.qOL;
      break label251;
      i = 0;
      break label259;
    }
    w.i("MicroMsg.Voip.CaptureRender", "Camera Open Success, try set size: w,h:" + paramInt1 + "," + paramInt2);
    if (paramBoolean)
    {
      localObject1 = i.qPY.qOK;
      if (localObject1 == null) {
        break label826;
      }
      i = 1;
      localObject5 = null;
      if (localObject1 == null) {
        break label1360;
      }
      localObject3 = this.mCamera;
      localObject3.getClass();
      localObject3 = new Camera.Size((Camera)localObject3, ((Point)localObject1).x, ((Point)localObject1).y);
      w.i("MicroMsg.Voip.CaptureRender", "getCameraSize from table:" + ((Camera.Size)localObject3).width + "," + ((Camera.Size)localObject3).height);
    }
    label774:
    Object localObject2;
    for (;;)
    {
      Camera localCamera;
      Point localPoint;
      Object localObject4;
      ((Camera.Parameters)localObject3).setPreviewFrameRate(i);
      break;
      label826:
      w.e("MicroMsg.Voip.CaptureRender", "getCameraResolution failed: %s", new Object[] { localException5.getMessage() });
    }
    label861:
    w.i("MicroMsg.Voip.CaptureRender", "2.no config size!");
    if (localObject2 != null)
    {
      w.i("MicroMsg.Voip.CaptureRender", "2.try support size alternatively! w" + ((Camera.Size)localObject2).width + ",h" + ((Camera.Size)localObject2).height);
      if (!a(this.mCamera, ((Camera.Size)localObject2).width, ((Camera.Size)localObject2).height))
      {
        w.e("MicroMsg.Voip.CaptureRender", "2.try support size fail: w" + ((Camera.Size)localObject2).width + ",h" + ((Camera.Size)localObject2).height);
        GMTrace.o(5395150012416L, 40197);
        return -1;
      }
    }
    label985:
    g(this.mCamera);
    for (;;)
    {
      try
      {
        this.qOc = this.mCamera.getParameters();
        this.qOd = this.qOc.getPreviewSize();
        paramInt2 = this.qOc.getPreviewFrameRate();
        this.qOe = i.qQd;
        if (this.qOe <= 0) {
          this.qOe = 7;
        }
      }
      catch (Exception localException3)
      {
        com.tencent.mm.plugin.report.service.g.ork.a(159L, 0L, 1L, false);
        w.e("MicroMsg.Voip.CaptureRender", "try getParameters and getPreviewSize fail, error:%s", new Object[] { localException3.getMessage() });
        GMTrace.o(5395150012416L, 40197);
        return -1;
      }
      try
      {
        localObject2 = this.mCamera;
        localObject3 = new Camera.CameraInfo();
        if (!this.qNU) {
          break label1301;
        }
        paramInt1 = i.qPZ;
        Camera.getCameraInfo(paramInt1, (Camera.CameraInfo)localObject3);
        i = ((WindowManager)ab.getContext().getSystemService("window")).getDefaultDisplay().getRotation();
        paramInt1 = 0;
        switch (i)
        {
        default: 
          if (!this.qNU) {
            break label1308;
          }
          paramInt1 = (360 - (paramInt1 + ((Camera.CameraInfo)localObject3).orientation) % 360) % 360;
          ((Camera)localObject2).setDisplayOrientation(paramInt1);
          this.qOr = paramInt1;
        }
      }
      catch (Exception localException4)
      {
        w.e("MicroMsg.Voip.CaptureRender", "setDisplayOrientation failed: %s", new Object[] { localException4.getMessage() });
        continue;
      }
      w.i("MicroMsg.Voip.CaptureRender", "Camera ok, fps: %d, mSize.width: %d, mSize.height: %d, format: %d, IsRotate180: %d, displayOrientation: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(this.qOd.width), Integer.valueOf(this.qOd.height), Integer.valueOf(this.qOe), Integer.valueOf(i.qQb), Integer.valueOf(this.qOr) });
      GMTrace.o(5395150012416L, 40197);
      return 1;
      label1301:
      paramInt1 = i.qQa;
      continue;
      label1308:
      paramInt1 = (((Camera.CameraInfo)localObject3).orientation - paramInt1 + 360) % 360;
      continue;
      label1357:
      break label388;
      label1360:
      localObject3 = null;
      break;
      continue;
      paramInt1 = 0;
      continue;
      paramInt1 = 90;
      continue;
      paramInt1 = 180;
      continue;
      paramInt1 = 270;
    }
  }
  
  private boolean g(Camera paramCamera)
  {
    GMTrace.i(5394881576960L, 40195);
    if (paramCamera == null)
    {
      GMTrace.o(5394881576960L, 40195);
      return false;
    }
    Camera.Parameters localParameters;
    List localList;
    try
    {
      localParameters = paramCamera.getParameters();
      localList = localParameters.getSupportedFocusModes();
      if (localList == null) {
        break label216;
      }
      w.d("MicroMsg.Voip.CaptureRender", "supported focus modes size = " + localList.size());
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        w.d("MicroMsg.Voip.CaptureRender", "supported focus modes : " + str);
      }
      if (p.fQC.fPe != 0) {
        break label262;
      }
    }
    catch (Exception paramCamera)
    {
      com.tencent.mm.plugin.report.service.g.ork.a(159L, 0L, 1L, false);
      w.e("MicroMsg.Voip.CaptureRender", "TrySetAutoFocus fail:" + paramCamera.toString());
      GMTrace.o(5394881576960L, 40195);
      return false;
    }
    if (localList.contains("auto"))
    {
      w.d("MicroMsg.Voip.CaptureRender", "camera support auto focus");
      localParameters.setFocusMode("auto");
      this.qOg = false;
    }
    for (;;)
    {
      paramCamera.setParameters(localParameters);
      label216:
      GMTrace.o(5394881576960L, 40195);
      return true;
      if (localList.contains("continuous-video"))
      {
        w.d("MicroMsg.Voip.CaptureRender", "camera support continuous video focus");
        localParameters.setFocusMode("continuous-video");
        this.qOg = true;
        continue;
        label262:
        if (p.fQC.fPe == 1) {
          if (localList.contains("continuous-video"))
          {
            w.d("MicroMsg.Voip.CaptureRender", "camera support continuous video focus");
            localParameters.setFocusMode("continuous-video");
            this.qOg = true;
          }
          else if (localList.contains("auto"))
          {
            w.d("MicroMsg.Voip.CaptureRender", "camera support auto focus");
            localParameters.setFocusMode("auto");
            this.qOg = false;
          }
        }
      }
    }
  }
  
  private int h(Camera paramCamera)
  {
    GMTrace.i(5395955318784L, 40203);
    if (paramCamera == null)
    {
      GMTrace.o(5395955318784L, 40203);
      return 0;
    }
    try
    {
      localObject = paramCamera.getParameters().getSupportedPreviewSizes();
      if ((localObject == null) || (((List)localObject).size() == 0)) {
        break label299;
      }
      localObject = ((List)localObject).iterator();
      j = 0;
    }
    catch (Exception paramCamera)
    {
      for (;;)
      {
        Object localObject;
        int j;
        int k;
        int i = 0;
        continue;
        j += 1;
        continue;
        i = 0;
      }
    }
    i = j;
    k = j;
    try
    {
      if (((Iterator)localObject).hasNext())
      {
        k = j;
        Camera.Size localSize = (Camera.Size)((Iterator)localObject).next();
        k = j;
        w.d("MicroMsg.Voip.CaptureRender", "support Size:" + localSize.width + "," + localSize.height);
        if (j == 0)
        {
          k = j;
          this.qOs = localSize.width;
          k = j;
          this.qOt = localSize.height;
        }
      }
      else
      {
        k = i;
        paramCamera = paramCamera.getParameters().getSupportedPreviewFormats();
        if (paramCamera != null)
        {
          k = i;
          if (paramCamera.size() != 0)
          {
            k = i;
            paramCamera = paramCamera.iterator();
            for (;;)
            {
              k = i;
              if (!paramCamera.hasNext()) {
                break;
              }
              k = i;
              j = ((Integer)paramCamera.next()).intValue();
              k = i;
              w.i("MicroMsg.Voip.CaptureRender", "support Format:" + j);
            }
          }
        }
        for (;;) {}
      }
    }
    catch (Exception paramCamera)
    {
      i = k;
      w.printErrStackTrace("MicroMsg.Voip.CaptureRender", paramCamera, "", new Object[0]);
      GMTrace.o(5395955318784L, 40203);
      return i;
    }
  }
  
  private static void i(Camera paramCamera)
  {
    GMTrace.i(5396089536512L, 40204);
    try
    {
      localList = paramCamera.getParameters().getSupportedPreviewFrameRates();
      if (localList != null)
      {
        paramCamera = "supportFps:";
        int i = 0;
        for (;;)
        {
          localObject = paramCamera;
          if (i >= localList.size()) {
            break;
          }
          int j = ((Integer)localList.get(i)).intValue();
          paramCamera = paramCamera + j + ",";
          i += 1;
        }
      }
    }
    catch (Exception paramCamera)
    {
      for (;;)
      {
        w.d("MicroMsg.Voip.CaptureRender", "getSupportedPreviewFrameRates:error:" + paramCamera.toString());
        List localList = null;
      }
      Object localObject = "supportFps:";
      w.i("MicroMsg.Voip.CaptureRender", (String)localObject);
      GMTrace.o(5396089536512L, 40204);
    }
  }
  
  private static Camera iE(boolean paramBoolean)
  {
    Object localObject = null;
    GMTrace.i(5394478923776L, 40192);
    if (i.qPY.fOy <= 0)
    {
      GMTrace.o(5394478923776L, 40192);
      return null;
    }
    if (!i.qQe)
    {
      GMTrace.o(5394478923776L, 40192);
      return null;
    }
    if (paramBoolean == true) {}
    for (;;)
    {
      try
      {
        localCamera = Camera.open(i.qPZ);
        localObject = localCamera;
        w.i("Camera", "Use front");
        localObject = localCamera;
      }
      catch (Exception localException)
      {
        Camera localCamera;
        com.tencent.mm.plugin.report.service.g.ork.a(159L, 0L, 1L, false);
        com.tencent.mm.plugin.report.service.g.ork.a(159L, 1L, 1L, false);
        w.e("MicroMsg.Voip.CaptureRender", "openCameraByHighApiLvl:error:" + localException.toString());
        continue;
      }
      GMTrace.o(5394478923776L, 40192);
      return (Camera)localObject;
      localCamera = Camera.open(i.qQa);
      localObject = localCamera;
      w.i("Camera", "Use back");
      localObject = localCamera;
    }
  }
  
  private Camera iF(boolean paramBoolean)
  {
    GMTrace.i(5394613141504L, 40193);
    Object localObject2 = iE(paramBoolean);
    Object localObject1 = localObject2;
    if (localObject2 == null) {}
    for (;;)
    {
      try
      {
        localObject1 = Camera.open();
      }
      catch (Exception localException1)
      {
        w.e("MicroMsg.Voip.CaptureRender", "OpenCameraError:" + localException1.toString());
        com.tencent.mm.plugin.report.service.g.ork.a(159L, 0L, 1L, false);
        com.tencent.mm.plugin.report.service.g.ork.a(159L, 1L, 1L, false);
        if (this.qOk != null) {
          this.qOk.aRZ();
        }
        GMTrace.o(5394613141504L, 40193);
        return null;
      }
      try
      {
        localObject2 = ((Camera)localObject1).getParameters();
        if (!paramBoolean) {
          break label157;
        }
        i = 2;
        ((Camera.Parameters)localObject2).set("camera-id", i);
        ((Camera)localObject1).setParameters((Camera.Parameters)localObject2);
      }
      catch (Exception localException2)
      {
        com.tencent.mm.plugin.report.service.g.ork.a(159L, 0L, 1L, false);
        w.e("MicroMsg.Voip.CaptureRender", "set camera-id error:" + localException2.toString());
        continue;
      }
      this.qNU = paramBoolean;
      i((Camera)localObject1);
      h((Camera)localObject1);
      GMTrace.o(5394613141504L, 40193);
      return (Camera)localObject1;
      label157:
      int i = 1;
    }
  }
  
  public final int a(f paramf, boolean paramBoolean)
  {
    GMTrace.i(5394210488320L, 40190);
    if (i.qPY.fOy <= 0)
    {
      this.qOb = 1;
      GMTrace.o(5394210488320L, 40190);
      return -1;
    }
    if (paramBoolean) {
      if (!i.qPY.qOG) {
        paramBoolean = false;
      }
    }
    for (;;)
    {
      this.qOk = paramf;
      if (d(paramBoolean, this.mWidth, this.mHeight) > 0) {
        break;
      }
      int i = d(paramBoolean, 0, 0);
      if (i > 0) {
        break;
      }
      this.qOb = 1;
      GMTrace.o(5394210488320L, 40190);
      return i;
      if (!i.qPY.qOH) {
        paramBoolean = true;
      }
    }
    bvQ();
    this.qOb = 0;
    GMTrace.o(5394210488320L, 40190);
    return 1;
  }
  
  public final void a(SurfaceTexture paramSurfaceTexture)
  {
    boolean bool1 = false;
    GMTrace.i(5394076270592L, 40189);
    w.d("MicroMsg.Voip.CaptureRender", "onSurfaceTextureAvailable");
    if ((!this.qOf) || (paramSurfaceTexture == null))
    {
      boolean bool2 = this.qOf;
      if (paramSurfaceTexture == null) {
        bool1 = true;
      }
      w.e("MicroMsg.Voip.CaptureRender", "onSurfaceTextureAvailable failed, CameraOpen: %b, surface: %b", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
      GMTrace.o(5394076270592L, 40189);
      return;
    }
    try
    {
      this.mCamera.setPreviewCallback(null);
      this.mCamera.stopPreview();
      this.mCamera.setPreviewTexture(paramSurfaceTexture);
      bvQ();
      this.mCamera.startPreview();
      if (this.qOm)
      {
        startCapture();
        this.qOm = false;
      }
      com.tencent.mm.plugin.voip.model.d.btG().wr(this.qOb);
      GMTrace.o(5394076270592L, 40189);
      return;
    }
    catch (Exception paramSurfaceTexture)
    {
      for (;;)
      {
        com.tencent.mm.plugin.report.service.g.ork.a(159L, 0L, 1L, false);
        com.tencent.mm.plugin.report.service.g.ork.a(159L, 2L, 1L, false);
        w.e("MicroMsg.Voip.CaptureRender", "surfaceChange failed" + paramSurfaceTexture.getMessage());
        this.qOb = 1;
      }
    }
  }
  
  public final void a(SurfaceHolder paramSurfaceHolder)
  {
    boolean bool1 = false;
    GMTrace.i(5393942052864L, 40188);
    w.d("MicroMsg.Voip.CaptureRender", "surfaceChange");
    if ((!this.qOf) || (paramSurfaceHolder.getSurface() == null))
    {
      boolean bool2 = this.qOf;
      if (paramSurfaceHolder.getSurface() == null) {
        bool1 = true;
      }
      w.e("MicroMsg.Voip.CaptureRender", "surfaceChange failed, CameraOpen: %b, surface: %b", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
      GMTrace.o(5393942052864L, 40188);
      return;
    }
    try
    {
      this.mCamera.setPreviewCallback(null);
      this.mCamera.stopPreview();
      this.mCamera.setPreviewDisplay(paramSurfaceHolder);
      bvQ();
      this.mCamera.startPreview();
      if (this.qOm)
      {
        startCapture();
        this.qOm = false;
      }
      com.tencent.mm.plugin.voip.model.d.btG().wr(this.qOb);
      GMTrace.o(5393942052864L, 40188);
      return;
    }
    catch (Exception paramSurfaceHolder)
    {
      for (;;)
      {
        com.tencent.mm.plugin.report.service.g.ork.a(159L, 0L, 1L, false);
        com.tencent.mm.plugin.report.service.g.ork.a(159L, 2L, 1L, false);
        w.e("MicroMsg.Voip.CaptureRender", "surfaceChange failed" + paramSurfaceHolder.getMessage());
        this.qOb = 1;
      }
    }
  }
  
  public final void a(ObservableSurfaceView paramObservableSurfaceView)
  {
    GMTrace.i(5393673617408L, 40186);
    if (paramObservableSurfaceView == null)
    {
      GMTrace.o(5393673617408L, 40186);
      return;
    }
    this.qOi = paramObservableSurfaceView;
    this.qOi.a(this);
    this.qOh = true;
    GMTrace.o(5393673617408L, 40186);
  }
  
  public final void a(ObservableTextureView paramObservableTextureView)
  {
    GMTrace.i(5393807835136L, 40187);
    w.d("MicroMsg.Voip.CaptureRender", "bindTextureView");
    if (paramObservableTextureView == null)
    {
      GMTrace.o(5393807835136L, 40187);
      return;
    }
    this.qOj = paramObservableTextureView;
    this.qOj.a(this);
    this.qOh = false;
    GMTrace.o(5393807835136L, 40187);
  }
  
  public final void bvR()
  {
    GMTrace.i(5395284230144L, 40198);
    if (i.qPY.fOy < 2)
    {
      w.e("MicroMsg.Voip.CaptureRender", "ExchangeCapture...gCameraNum= " + i.qPY.fOy);
      GMTrace.o(5395284230144L, 40198);
      return;
    }
    w.i("MicroMsg.Voip.CaptureRender", "ExchangeCapture start, gCameraNum= " + i.qPY.fOy);
    stopCapture();
    f localf = this.qOk;
    if (!this.qNU) {}
    for (boolean bool = true;; bool = false)
    {
      a(localf, bool);
      startCapture();
      com.tencent.mm.plugin.voip.model.d.btG().wr(this.qOb);
      this.qOq = true;
      GMTrace.o(5395284230144L, 40198);
      return;
    }
  }
  
  public final boolean bvT()
  {
    GMTrace.i(5396223754240L, 40205);
    boolean bool = this.qNU;
    GMTrace.o(5396223754240L, 40205);
    return bool;
  }
  
  public final boolean bvU()
  {
    GMTrace.i(5396357971968L, 40206);
    boolean bool = this.qNV;
    GMTrace.o(5396357971968L, 40206);
    return bool;
  }
  
  public final int bvV()
  {
    GMTrace.i(5396492189696L, 40207);
    int i = this.qOb;
    GMTrace.o(5396492189696L, 40207);
    return i;
  }
  
  public final void bvW()
  {
    GMTrace.i(5396626407424L, 40208);
    try
    {
      Camera.Size localSize;
      c localc;
      if (this.qOc != null)
      {
        localSize = this.qOc.getPreviewSize();
        localc = com.tencent.mm.plugin.voip_cs.b.b.bwq();
        if (!this.qOf) {
          break label122;
        }
      }
      label122:
      for (int i = 1;; i = 0)
      {
        this.qOc.getPreviewFrameRate();
        int j = this.qOs;
        int k = this.qOt;
        int m = localSize.width;
        int n = localSize.height;
        w.d("MicroMsg.VoipCSReportHelper", "setCameraInfo");
        localc.qRl = i;
        localc.qRh = j;
        localc.qRi = k;
        localc.qRj = m;
        localc.qRk = n;
        GMTrace.o(5396626407424L, 40208);
        return;
      }
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.Voip.CaptureRender", "getCameraDataForVoipCS failed" + localException.getMessage());
      GMTrace.o(5396626407424L, 40208);
    }
  }
  
  @TargetApi(14)
  public final void m(int[] paramArrayOfInt)
  {
    boolean bool3 = true;
    GMTrace.i(5395821101056L, 40202);
    if ((p.fQC.fPe == 1) && (this.qOg))
    {
      GMTrace.o(5395821101056L, 40202);
      return;
    }
    if (p.fQC.fPd > 2000) {
      this.qOa = p.fQC.fPd;
    }
    if (paramArrayOfInt == null)
    {
      w.e("MicroMsg.Voip.CaptureRender", "focusOnFace error, faceLocation is null");
      boolean bool2;
      if (System.currentTimeMillis() - this.qNZ > this.qOa)
      {
        bool1 = true;
        if ((this.qNW) && (!bool1) && (this.qNX == this.qNU)) {
          break label345;
        }
        paramArrayOfInt = new StringBuilder("now i need autoFocus! and !mIsCameraNoParamAutoFocus: ");
        if (this.qNW) {
          break label307;
        }
        bool2 = true;
        label137:
        paramArrayOfInt = paramArrayOfInt.append(bool2).append(",isAutoFocusTimeout: ").append(bool1).append(",mAutoFocusTimeOut:").append(this.qOa).append(",mIsLastAutoFocusFaceCamera != mIsCurrentFaceCamera :");
        if (this.qNX == this.qNU) {
          break label313;
        }
      }
      label307:
      label313:
      for (boolean bool1 = bool3;; bool1 = false)
      {
        w.i("MicroMsg.Voip.CaptureRender", bool1 + ",isClickScreen :false");
        try
        {
          if ((this.mCamera != null) && (this.mCamera.getParameters() != null) && (this.mCamera.getParameters().getFocusMode() != null) && (this.mCamera.getParameters().getFocusMode().equals("auto")))
          {
            this.mCamera.autoFocus(null);
            this.qOo = null;
            this.qNZ = System.currentTimeMillis();
            this.qNW = true;
            this.qNX = this.qNU;
          }
          GMTrace.o(5395821101056L, 40202);
          return;
        }
        catch (Exception paramArrayOfInt)
        {
          w.e("MicroMsg.Voip.CaptureRender", "mCamera.getParameters() or autoFocus fail!" + paramArrayOfInt.toString());
        }
        bool1 = false;
        break;
        bool2 = false;
        break label137;
      }
      label345:
      GMTrace.o(5395821101056L, 40202);
      return;
    }
    int i;
    Object localObject;
    int j;
    int k;
    int m;
    label499:
    int n;
    int i1;
    if (this.qOo == null)
    {
      this.qOo = paramArrayOfInt;
      i = 1;
      localObject = this.qOo;
      j = Math.abs(localObject[0] - paramArrayOfInt[0]);
      k = Math.abs(localObject[1] - paramArrayOfInt[1]);
      m = Math.abs(localObject[2] - paramArrayOfInt[2]);
      k = Math.abs(localObject[3] - paramArrayOfInt[3]) + (j + k + m);
      w.d("MicroMsg.Voip.CaptureRender", "face location diff:%d", new Object[] { Integer.valueOf(k) });
      if (k <= qNT)
      {
        j = i;
        if (k <= qNS) {}
      }
      else
      {
        this.qOo = paramArrayOfInt;
        if (k > qNT) {
          i = 1;
        }
        j = i;
        if (k > qNS)
        {
          j = 1;
          if ((i != 0) || (j != 0))
          {
            k = this.qOo[0];
            m = this.qOo[1];
            n = this.qOo[2];
            i1 = this.qOo[3];
          }
        }
      }
    }
    for (;;)
    {
      try
      {
        paramArrayOfInt = new Rect(k, m, n, i1);
        localObject = this.mCamera.getParameters();
        k = j;
        ArrayList localArrayList;
        if (j != 0)
        {
          if ((com.tencent.mm.compatible.util.d.et(14)) && (((Camera.Parameters)localObject).getMaxNumMeteringAreas() > 0))
          {
            localArrayList = new ArrayList();
            localArrayList.add(new Camera.Area(paramArrayOfInt, 1000));
            ((Camera.Parameters)localObject).setMeteringAreas(localArrayList);
            k = j;
          }
        }
        else
        {
          j = i;
          if (i == 0) {
            break label833;
          }
          if ((!com.tencent.mm.compatible.util.d.et(14)) || (((Camera.Parameters)localObject).getMaxNumFocusAreas() <= 0)) {
            continue;
          }
          localArrayList = new ArrayList();
          localArrayList.add(new Camera.Area(paramArrayOfInt, 1000));
          ((Camera.Parameters)localObject).setFocusAreas(localArrayList);
          j = i;
          break label833;
          this.mCamera.setParameters((Camera.Parameters)localObject);
          if (j != 0)
          {
            w.d("MicroMsg.Voip.CaptureRender", "refocus, mIsFocusOnFace:%b", new Object[] { Boolean.valueOf(this.qOq) });
            if (this.qOq)
            {
              this.qNW = false;
              this.qOq = false;
              this.mCamera.autoFocus(new Camera.AutoFocusCallback()
              {
                public final void onAutoFocus(boolean paramAnonymousBoolean, Camera paramAnonymousCamera)
                {
                  GMTrace.i(5391257698304L, 40168);
                  w.d("MicroMsg.Voip.CaptureRender", "onAutoFocus, success:%b", new Object[] { Boolean.valueOf(paramAnonymousBoolean) });
                  a.this.qOq = true;
                  GMTrace.o(5391257698304L, 40168);
                }
              });
            }
          }
          GMTrace.o(5395821101056L, 40202);
          return;
        }
        w.d("MicroMsg.Voip.CaptureRender", "camera not support metering area");
        k = 0;
        continue;
        w.d("MicroMsg.Voip.CaptureRender", "camera not support area focus");
        j = 0;
      }
      catch (Exception paramArrayOfInt)
      {
        w.e("MicroMsg.Voip.CaptureRender", "focusOnFace exception:%s", new Object[] { paramArrayOfInt.getMessage() });
      }
      GMTrace.o(5395821101056L, 40202);
      return;
      k = 0;
      i = j;
      j = k;
      break label499;
      i = 0;
      break;
      label833:
      if (j == 0) {
        if (k == 0) {}
      }
    }
  }
  
  /* Error */
  public final int startCapture()
  {
    // Byte code:
    //   0: ldc2_w 884
    //   3: ldc_w 886
    //   6: invokestatic 72	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: getfield 117	com/tencent/mm/plugin/voip/video/a:qOf	Z
    //   13: ifne +27 -> 40
    //   16: ldc -89
    //   18: ldc_w 888
    //   21: invokestatic 285	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   24: aload_0
    //   25: iconst_1
    //   26: putfield 115	com/tencent/mm/plugin/voip/video/a:qOb	I
    //   29: ldc2_w 884
    //   32: ldc_w 886
    //   35: invokestatic 89	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   38: iconst_m1
    //   39: ireturn
    //   40: aload_0
    //   41: getfield 125	com/tencent/mm/plugin/voip/video/a:qOl	Z
    //   44: ifeq +22 -> 66
    //   47: ldc -89
    //   49: ldc_w 890
    //   52: invokestatic 285	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   55: ldc2_w 884
    //   58: ldc_w 886
    //   61: invokestatic 89	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   64: iconst_m1
    //   65: ireturn
    //   66: aload_0
    //   67: getfield 123	com/tencent/mm/plugin/voip/video/a:qOi	Lcom/tencent/mm/plugin/video/ObservableSurfaceView;
    //   70: ifnull +37 -> 107
    //   73: aload_0
    //   74: getfield 123	com/tencent/mm/plugin/voip/video/a:qOi	Lcom/tencent/mm/plugin/video/ObservableSurfaceView;
    //   77: invokevirtual 893	com/tencent/mm/plugin/video/ObservableSurfaceView:bta	()Z
    //   80: ifne +27 -> 107
    //   83: ldc -89
    //   85: ldc_w 895
    //   88: invokestatic 526	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   91: aload_0
    //   92: iconst_1
    //   93: putfield 127	com/tencent/mm/plugin/voip/video/a:qOm	Z
    //   96: ldc2_w 884
    //   99: ldc_w 886
    //   102: invokestatic 89	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   105: iconst_0
    //   106: ireturn
    //   107: ldc -89
    //   109: ldc_w 897
    //   112: iconst_1
    //   113: anewarray 4	java/lang/Object
    //   116: dup
    //   117: iconst_0
    //   118: aload_0
    //   119: getfield 121	com/tencent/mm/plugin/voip/video/a:qOh	Z
    //   122: invokestatic 675	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   125: aastore
    //   126: invokestatic 181	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   129: aload_0
    //   130: getfield 123	com/tencent/mm/plugin/voip/video/a:qOi	Lcom/tencent/mm/plugin/video/ObservableSurfaceView;
    //   133: ifnull +107 -> 240
    //   136: aload_0
    //   137: getfield 121	com/tencent/mm/plugin/voip/video/a:qOh	Z
    //   140: ifeq +100 -> 240
    //   143: aload_0
    //   144: getfield 318	com/tencent/mm/plugin/voip/video/a:mCamera	Landroid/hardware/Camera;
    //   147: aload_0
    //   148: getfield 123	com/tencent/mm/plugin/voip/video/a:qOi	Lcom/tencent/mm/plugin/video/ObservableSurfaceView;
    //   151: invokevirtual 901	com/tencent/mm/plugin/video/ObservableSurfaceView:getSurfaceHolder	()Landroid/view/SurfaceHolder;
    //   154: invokevirtual 716	android/hardware/Camera:setPreviewDisplay	(Landroid/view/SurfaceHolder;)V
    //   157: aload_0
    //   158: getfield 318	com/tencent/mm/plugin/voip/video/a:mCamera	Landroid/hardware/Camera;
    //   161: invokevirtual 681	android/hardware/Camera:startPreview	()V
    //   164: aload_0
    //   165: iconst_1
    //   166: putfield 125	com/tencent/mm/plugin/voip/video/a:qOl	Z
    //   169: ldc2_w 884
    //   172: ldc_w 886
    //   175: invokestatic 89	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   178: iconst_1
    //   179: ireturn
    //   180: astore_1
    //   181: getstatic 274	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   184: ldc2_w 275
    //   187: lconst_0
    //   188: lconst_1
    //   189: iconst_0
    //   190: invokevirtual 279	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   193: getstatic 274	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   196: ldc2_w 275
    //   199: ldc2_w 696
    //   202: lconst_1
    //   203: iconst_0
    //   204: invokevirtual 279	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   207: aload_0
    //   208: iconst_1
    //   209: putfield 115	com/tencent/mm/plugin/voip/video/a:qOb	I
    //   212: ldc -89
    //   214: new 205	java/lang/StringBuilder
    //   217: dup
    //   218: ldc_w 903
    //   221: invokespecial 210	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   224: aload_1
    //   225: invokevirtual 282	java/lang/Exception:toString	()Ljava/lang/String;
    //   228: invokevirtual 214	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   231: invokevirtual 217	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   234: invokestatic 285	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   237: goto -80 -> 157
    //   240: aload_0
    //   241: getfield 733	com/tencent/mm/plugin/voip/video/a:qOj	Lcom/tencent/mm/plugin/video/ObservableTextureView;
    //   244: ifnull -87 -> 157
    //   247: aload_0
    //   248: getfield 121	com/tencent/mm/plugin/voip/video/a:qOh	Z
    //   251: ifne -94 -> 157
    //   254: aload_0
    //   255: getfield 318	com/tencent/mm/plugin/voip/video/a:mCamera	Landroid/hardware/Camera;
    //   258: aload_0
    //   259: getfield 733	com/tencent/mm/plugin/voip/video/a:qOj	Lcom/tencent/mm/plugin/video/ObservableTextureView;
    //   262: invokevirtual 907	com/tencent/mm/plugin/video/ObservableTextureView:getSurfaceTexture	()Landroid/graphics/SurfaceTexture;
    //   265: invokevirtual 678	android/hardware/Camera:setPreviewTexture	(Landroid/graphics/SurfaceTexture;)V
    //   268: goto -111 -> 157
    //   271: astore_1
    //   272: getstatic 274	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   275: ldc2_w 275
    //   278: lconst_0
    //   279: lconst_1
    //   280: iconst_0
    //   281: invokevirtual 279	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   284: getstatic 274	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   287: ldc2_w 275
    //   290: ldc2_w 696
    //   293: lconst_1
    //   294: iconst_0
    //   295: invokevirtual 279	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   298: aload_0
    //   299: iconst_1
    //   300: putfield 115	com/tencent/mm/plugin/voip/video/a:qOb	I
    //   303: ldc -89
    //   305: new 205	java/lang/StringBuilder
    //   308: dup
    //   309: ldc_w 903
    //   312: invokespecial 210	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   315: aload_1
    //   316: invokevirtual 282	java/lang/Exception:toString	()Ljava/lang/String;
    //   319: invokevirtual 214	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   322: invokevirtual 217	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   325: invokestatic 285	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   328: goto -171 -> 157
    //   331: astore_1
    //   332: getstatic 274	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   335: ldc2_w 275
    //   338: lconst_0
    //   339: lconst_1
    //   340: iconst_0
    //   341: invokevirtual 279	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   344: getstatic 274	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   347: ldc2_w 275
    //   350: ldc2_w 696
    //   353: lconst_1
    //   354: iconst_0
    //   355: invokevirtual 279	com/tencent/mm/plugin/report/service/g:a	(JJJZ)V
    //   358: aload_0
    //   359: iconst_1
    //   360: putfield 115	com/tencent/mm/plugin/voip/video/a:qOb	I
    //   363: aload_0
    //   364: getfield 427	com/tencent/mm/plugin/voip/video/a:qOk	Lcom/tencent/mm/plugin/voip/video/f;
    //   367: ifnull +12 -> 379
    //   370: aload_0
    //   371: getfield 427	com/tencent/mm/plugin/voip/video/a:qOk	Lcom/tencent/mm/plugin/voip/video/f;
    //   374: invokeinterface 432 1 0
    //   379: ldc -89
    //   381: new 205	java/lang/StringBuilder
    //   384: dup
    //   385: ldc_w 909
    //   388: invokespecial 210	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   391: aload_1
    //   392: invokevirtual 282	java/lang/Exception:toString	()Ljava/lang/String;
    //   395: invokevirtual 214	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   398: invokevirtual 217	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   401: invokestatic 285	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   404: goto -240 -> 164
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	407	0	this	a
    //   180	45	1	localException1	Exception
    //   271	45	1	localException2	Exception
    //   331	61	1	localException3	Exception
    // Exception table:
    //   from	to	target	type
    //   143	157	180	java/lang/Exception
    //   254	268	271	java/lang/Exception
    //   157	164	331	java/lang/Exception
  }
  
  public final void stopCapture()
  {
    GMTrace.i(5395552665600L, 40200);
    w.d("MicroMsg.Voip.CaptureRender", "StopCapture....mIsInCapture = " + this.qOl);
    if (this.qOl)
    {
      this.qOm = false;
      this.mCamera.setPreviewCallback(null);
    }
    try
    {
      this.mCamera.stopPreview();
      this.qOl = false;
      if (1 == this.qOb)
      {
        lm locallm = new lm();
        locallm.ePT.type = 2;
        com.tencent.mm.sdk.b.a.vgX.m(locallm);
      }
      w.d("MicroMsg.Voip.CaptureRender", "UnInitCapture....mCameraOpen = " + this.qOf);
      if (this.qOf)
      {
        this.qOb = 0;
        this.qOm = false;
        this.mCamera.setPreviewCallback(null);
        this.mCamera.release();
        this.mCamera = null;
        this.qOf = false;
        this.qOn = null;
        if (this.qOp != null) {
          this.qOp.clear();
        }
        this.qOp = null;
        this.qOg = false;
        GMTrace.o(5395552665600L, 40200);
        return;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.Voip.CaptureRender", "stopPreview:error" + localException.toString());
        continue;
        if (this.mCamera != null)
        {
          this.mCamera.release();
          this.mCamera = null;
          this.qOf = false;
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\voip\video\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */