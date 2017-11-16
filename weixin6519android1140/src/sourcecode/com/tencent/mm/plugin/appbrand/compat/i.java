package com.tencent.mm.plugin.appbrand.compat;

import android.graphics.Bitmap;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mapsdk.raster.model.BitmapDescriptor;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.PolylineOptions;
import com.tencent.mm.plugin.appbrand.compat.a.b.f;
import com.tencent.mm.plugin.appbrand.compat.a.b.p;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class i
  implements b.p
{
  final PolylineOptions hPg;
  
  i()
  {
    GMTrace.i(19499285741568L, 145281);
    this.hPg = new PolylineOptions();
    GMTrace.o(19499285741568L, 145281);
  }
  
  public final void a(Iterable<b.f> paramIterable)
  {
    GMTrace.i(19499419959296L, 145282);
    LinkedList localLinkedList = new LinkedList();
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext())
    {
      b.f localf = (b.f)paramIterable.next();
      if ((localf instanceof f)) {
        localLinkedList.add(((f)localf).hPc);
      } else {
        localLinkedList.add(new LatLng(localf.Uh(), localf.Ui()));
      }
    }
    this.hPg.addAll(localLinkedList);
    GMTrace.o(19499419959296L, 145282);
  }
  
  public final void in(int paramInt)
  {
    GMTrace.i(19499554177024L, 145283);
    this.hPg.color(paramInt);
    GMTrace.o(19499554177024L, 145283);
  }
  
  public final void io(int paramInt)
  {
    GMTrace.i(19499688394752L, 145284);
    this.hPg.width(paramInt);
    GMTrace.o(19499688394752L, 145284);
  }
  
  public final void ip(int paramInt)
  {
    GMTrace.i(19499956830208L, 145286);
    this.hPg.edgeColor(paramInt);
    GMTrace.o(19499956830208L, 145286);
  }
  
  public final void iq(int paramInt)
  {
    GMTrace.i(19500091047936L, 145287);
    this.hPg.edgeWidth(paramInt);
    GMTrace.o(19500091047936L, 145287);
  }
  
  public final void q(Bitmap paramBitmap)
  {
    GMTrace.i(19500225265664L, 145288);
    this.hPg.arrowTexture(new BitmapDescriptor(paramBitmap));
    GMTrace.o(19500225265664L, 145288);
  }
  
  public final void setDottedLine(boolean paramBoolean)
  {
    GMTrace.i(19499822612480L, 145285);
    this.hPg.setDottedLine(paramBoolean);
    GMTrace.o(19499822612480L, 145285);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\appbrand\compat\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */