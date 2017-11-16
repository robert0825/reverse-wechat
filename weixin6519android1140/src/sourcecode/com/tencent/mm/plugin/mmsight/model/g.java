package com.tencent.mm.plugin.mmsight.model;

import android.graphics.Point;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.Size;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.mmsight.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public final class g
{
  private static Point a(ArrayList<Camera.Size> paramArrayList, Point paramPoint, boolean paramBoolean, int paramInt)
  {
    GMTrace.i(7374861500416L, 54947);
    int i = paramPoint.x;
    int j = paramPoint.y;
    if (j * paramInt % i != 0)
    {
      GMTrace.o(7374861500416L, 54947);
      return null;
    }
    j = j * paramInt / i;
    int k;
    if (paramBoolean)
    {
      k = paramInt ^ j;
      j = k ^ j;
      i = j;
      k ^= j;
      j = i;
    }
    for (i = k;; i = paramInt)
    {
      paramArrayList = paramArrayList.iterator();
      while (paramArrayList.hasNext())
      {
        paramPoint = (Camera.Size)paramArrayList.next();
        if ((paramPoint.width == i) && (paramPoint.height == j))
        {
          w.i("MicroMsg.MMSightCameraInfo", "findEqualsPrewViewSize FindBestSize %d %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
          paramArrayList = new Point(i, j);
          GMTrace.o(7374861500416L, 54947);
          return paramArrayList;
        }
        if (Math.min(paramPoint.width, paramPoint.height) < paramInt)
        {
          GMTrace.o(7374861500416L, 54947);
          return null;
        }
      }
      GMTrace.o(7374861500416L, 54947);
      return null;
    }
  }
  
  public static b a(Camera.Parameters paramParameters, Point paramPoint, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(20191849218048L, 150441);
    paramParameters = b(paramParameters, paramPoint, paramInt, paramBoolean);
    GMTrace.o(20191849218048L, 150441);
    return paramParameters;
  }
  
  public static b b(Camera.Parameters paramParameters, Point paramPoint, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(20191983435776L, 150442);
    Object localObject1 = new ArrayList(paramParameters.getSupportedPreviewSizes());
    Collections.sort((List)localObject1, new a());
    new ArrayList(paramParameters.getSupportedPictureSizes());
    w.i("MicroMsg.MMSightCameraInfo", "supportedPreviewSizes: %s", new Object[] { d.aW((List)localObject1) });
    float f = paramPoint.x / paramPoint.y;
    w.i("MicroMsg.MMSightCameraInfo", "screen.x: %d, screen.y: %d, ratio: %f, upperBoundPrewView: %s lowerBoundPreView: %s", new Object[] { Integer.valueOf(paramPoint.x), Integer.valueOf(paramPoint.y), Float.valueOf(f), Integer.valueOf(paramInt), Integer.valueOf(0) });
    w.d("MicroMsg.MMSightCameraInfo", "systemAvailableMemInMB: %d", new Object[] { Long.valueOf(bg.eD(ab.getContext())) });
    paramParameters = new b();
    paramParameters.mYQ = a((ArrayList)localObject1, paramPoint, paramBoolean, paramInt);
    if (paramParameters.mYQ != null)
    {
      paramParameters.mYR = d.a(paramPoint, paramParameters.mYQ, paramBoolean);
      paramParameters.mYS = d.a(paramPoint, paramParameters.mYQ, paramBoolean, true);
      paramInt = 0;
    }
    for (;;)
    {
      w.i("MicroMsg.MMSightCameraInfo", "final tryFindBestSize prewViewSize %s cropSize %s findcount %d", new Object[] { paramParameters.mYQ, paramParameters.mYR, Integer.valueOf(paramInt) });
      GMTrace.o(20191983435776L, 150442);
      return paramParameters;
      Point localPoint = new Point();
      localObject1 = ((ArrayList)localObject1).iterator();
      for (;;)
      {
        if (((Iterator)localObject1).hasNext())
        {
          Object localObject2 = (Camera.Size)((Iterator)localObject1).next();
          localPoint.x = ((Camera.Size)localObject2).width;
          localPoint.y = ((Camera.Size)localObject2).height;
          if (localPoint.x == localPoint.y)
          {
            w.i("MicroMsg.MMSightCameraInfo", "exclude square curSize: %s", new Object[] { localPoint });
          }
          else
          {
            localObject2 = d.a(paramPoint, localPoint, paramBoolean);
            if (localObject2 == null)
            {
              w.i("MicroMsg.MMSightCameraInfo", "curSize: %s, can not find crop size", new Object[] { localPoint });
            }
            else
            {
              w.i("MicroMsg.MMSightCameraInfo", "preViewPoint: %s --> bestSize %s ", new Object[] { localPoint, localObject2 });
              paramParameters.mYU = new Point(((Point)localObject2).x, ((Point)localObject2).y);
              paramParameters.mYT = new Point(localPoint.x, localPoint.y);
              paramParameters.mYV = d.a(paramPoint, localPoint, paramBoolean, true);
              if (Math.min(((Point)localObject2).x, ((Point)localObject2).y) <= paramInt)
              {
                if (Math.min(((Point)localObject2).x, ((Point)localObject2).y) < 0)
                {
                  GMTrace.o(20191983435776L, 150442);
                  return null;
                }
                localPoint = new Point(localPoint.x, localPoint.y);
                paramParameters.mYQ = localPoint;
                paramParameters.mYR = ((Point)localObject2);
                paramParameters.mYS = d.a(paramPoint, paramParameters.mYQ, paramBoolean, true);
                w.i("MicroMsg.MMSightCameraInfo", "find bestPreviewSize  %s -> %s findcount %d", new Object[] { localPoint, localObject2, Integer.valueOf(1) });
                paramInt = 1;
                break;
              }
            }
          }
        }
      }
      paramInt = 0;
    }
  }
  
  public static b c(Camera.Parameters paramParameters, Point paramPoint, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(20192117653504L, 150443);
    Object localObject1 = new ArrayList(paramParameters.getSupportedPreviewSizes());
    Collections.sort((List)localObject1, new a());
    new ArrayList(paramParameters.getSupportedPictureSizes());
    w.i("MicroMsg.MMSightCameraInfo", "supportedPreviewSizes: %s", new Object[] { d.aW((List)localObject1) });
    float f = paramPoint.x / paramPoint.y;
    w.i("MicroMsg.MMSightCameraInfo", "screen.x: %d, screen.y: %d, ratio: %f, upperBoundPrewView: %s lowerBoundPreView: %s", new Object[] { Integer.valueOf(paramPoint.x), Integer.valueOf(paramPoint.y), Float.valueOf(f), Integer.valueOf(paramInt), Integer.valueOf(0) });
    w.d("MicroMsg.MMSightCameraInfo", "systemAvailableMemInMB: %d", new Object[] { Long.valueOf(bg.eD(ab.getContext())) });
    paramParameters = new b();
    paramParameters.mYQ = a((ArrayList)localObject1, paramPoint, paramBoolean, paramInt);
    if (paramParameters.mYQ != null)
    {
      paramParameters.mYR = d.b(paramPoint, paramParameters.mYQ, paramBoolean);
      paramParameters.mYS = d.b(paramPoint, paramParameters.mYQ, paramBoolean, true);
      paramInt = 0;
    }
    for (;;)
    {
      w.i("MicroMsg.MMSightCameraInfo", "final tryFindBestSize prewViewSize %s cropSize %s findcount %d with crop width", new Object[] { paramParameters.mYQ, paramParameters.mYR, Integer.valueOf(paramInt) });
      GMTrace.o(20192117653504L, 150443);
      return paramParameters;
      Point localPoint = new Point();
      Math.min(paramPoint.x, paramPoint.y);
      Math.max(paramPoint.x, paramPoint.y);
      localObject1 = ((ArrayList)localObject1).iterator();
      for (;;)
      {
        if (((Iterator)localObject1).hasNext())
        {
          Object localObject2 = (Camera.Size)((Iterator)localObject1).next();
          localPoint.x = ((Camera.Size)localObject2).width;
          localPoint.y = ((Camera.Size)localObject2).height;
          if ((localPoint.x != localPoint.y) && (Math.min(localPoint.x, localPoint.y) <= paramInt) && (Math.max(localPoint.x, localPoint.y) <= 2000))
          {
            localObject2 = d.b(paramPoint, localPoint, paramBoolean);
            if (localObject2 != null)
            {
              w.i("MicroMsg.MMSightCameraInfo", "preViewPoint: %s --> bestSize %s ", new Object[] { localPoint, localObject2 });
              paramParameters.mYU = new Point(((Point)localObject2).x, ((Point)localObject2).y);
              paramParameters.mYT = new Point(localPoint.x, localPoint.y);
              paramParameters.mYV = d.b(paramPoint, localPoint, paramBoolean, true);
              if (Math.min(((Point)localObject2).x, ((Point)localObject2).y) <= paramInt)
              {
                if (Math.min(((Point)localObject2).x, ((Point)localObject2).y) < 0)
                {
                  GMTrace.o(20192117653504L, 150443);
                  return null;
                }
                localPoint = new Point(localPoint.x, localPoint.y);
                paramParameters.mYQ = localPoint;
                paramParameters.mYR = ((Point)localObject2);
                paramParameters.mYS = d.b(paramPoint, paramParameters.mYQ, paramBoolean, true);
                w.i("MicroMsg.MMSightCameraInfo", "find bestPreviewSize  %s -> %s findcount %d", new Object[] { localPoint, localObject2, Integer.valueOf(1) });
                paramInt = 1;
                break;
              }
            }
          }
        }
      }
      paramInt = 0;
    }
  }
  
  public static b d(Camera.Parameters paramParameters, Point paramPoint, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(20192251871232L, 150444);
    Object localObject = new ArrayList(paramParameters.getSupportedPreviewSizes());
    Collections.sort((List)localObject, new a());
    new ArrayList(paramParameters.getSupportedPictureSizes());
    w.i("MicroMsg.MMSightCameraInfo", "supportedPreviewSizes: %s", new Object[] { d.aW((List)localObject) });
    float f = paramPoint.x / paramPoint.y;
    w.i("MicroMsg.MMSightCameraInfo", "screen.x: %d, screen.y: %d, ratio: %f, upperBoundPrewView: %s", new Object[] { Integer.valueOf(paramPoint.x), Integer.valueOf(paramPoint.y), Float.valueOf(f), Integer.valueOf(paramInt) });
    w.d("MicroMsg.MMSightCameraInfo", "systemAvailableMemInMB: %d", new Object[] { Long.valueOf(bg.eD(ab.getContext())) });
    paramParameters = new b();
    paramParameters.mYQ = a((ArrayList)localObject, paramPoint, paramBoolean, paramInt);
    if (paramParameters.mYQ != null)
    {
      paramParameters.mYR = d.b(paramPoint, paramParameters.mYQ, paramBoolean);
      paramParameters.mYS = d.b(paramPoint, paramParameters.mYQ, paramBoolean, true);
    }
    for (;;)
    {
      w.i("MicroMsg.MMSightCameraInfo", "final tryFindBestSize prewViewSize %s cropSize %s findcount %d with any way", new Object[] { paramParameters.mYQ, paramParameters.mYR, Integer.valueOf(0) });
      GMTrace.o(20192251871232L, 150444);
      return paramParameters;
      Point localPoint = new Point();
      Math.min(paramPoint.x, paramPoint.y);
      Math.max(paramPoint.x, paramPoint.y);
      localObject = ((ArrayList)localObject).iterator();
      if (((Iterator)localObject).hasNext())
      {
        Camera.Size localSize = (Camera.Size)((Iterator)localObject).next();
        localPoint.x = localSize.width;
        localPoint.y = localSize.height;
        if ((localPoint.x == localPoint.y) || (Math.min(localPoint.x, localPoint.y) > paramInt) || (Math.max(localPoint.x, localPoint.y) > 2000) || (d.b(paramPoint, localPoint, paramBoolean) == null)) {
          break;
        }
        paramParameters.mYQ = null;
      }
    }
  }
  
  private static final class a
    implements Comparator<Camera.Size>
  {
    public a()
    {
      GMTrace.i(7324395634688L, 54571);
      GMTrace.o(7324395634688L, 54571);
    }
  }
  
  public static final class b
  {
    public Point mYQ;
    public Point mYR;
    public Point mYS;
    public Point mYT;
    public Point mYU;
    public Point mYV;
    
    public b()
    {
      GMTrace.i(7323456110592L, 54564);
      GMTrace.o(7323456110592L, 54564);
    }
    
    public final String toString()
    {
      GMTrace.i(7323590328320L, 54565);
      Object localObject = new StringBuffer();
      if (this.mYQ != null) {
        ((StringBuffer)localObject).append(this.mYQ.toString() + ",");
      }
      if (this.mYR != null) {
        ((StringBuffer)localObject).append(this.mYR.toString() + ",");
      }
      if (this.mYS != null) {
        ((StringBuffer)localObject).append(this.mYS.toString() + ",");
      }
      if (this.mYT != null) {
        ((StringBuffer)localObject).append(this.mYT.toString() + ",");
      }
      if (this.mYU != null) {
        ((StringBuffer)localObject).append(this.mYU.toString() + ",");
      }
      if (this.mYV != null) {
        ((StringBuffer)localObject).append(this.mYV.toString() + ",");
      }
      localObject = ((StringBuffer)localObject).toString();
      GMTrace.o(7323590328320L, 54565);
      return (String)localObject;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\model\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */