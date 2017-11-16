package com.tencent.mm.ui.widget.celltextview.a;

import android.graphics.Paint;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ui.widget.celltextview.c.d;
import com.tencent.mm.ui.widget.celltextview.c.e;
import java.util.ArrayList;
import java.util.Iterator;

public final class a
{
  private static Paint xtp;
  public String iJz;
  public float mej;
  public ArrayList<e> xth;
  public ArrayList<d> xtn;
  public float xto;
  
  static
  {
    GMTrace.i(18744982110208L, 139661);
    xtp = new Paint();
    GMTrace.o(18744982110208L, 139661);
  }
  
  public a(String paramString, float paramFloat1, float paramFloat2)
  {
    GMTrace.i(18744311021568L, 139656);
    this.iJz = paramString;
    this.mej = paramFloat1;
    this.xto = paramFloat2;
    GMTrace.o(18744311021568L, 139656);
  }
  
  public final void am(ArrayList<e> paramArrayList)
  {
    GMTrace.i(18744445239296L, 139657);
    if (paramArrayList == null)
    {
      GMTrace.o(18744445239296L, 139657);
      return;
    }
    if (this.xth == null) {
      this.xth = new ArrayList(paramArrayList.size());
    }
    this.xth.addAll(paramArrayList);
    GMTrace.o(18744445239296L, 139657);
  }
  
  public final boolean equals(Object paramObject)
  {
    GMTrace.i(18744713674752L, 139659);
    if (this == paramObject)
    {
      GMTrace.o(18744713674752L, 139659);
      return true;
    }
    if (getClass() == paramObject.getClass())
    {
      paramObject = (a)paramObject;
      xtp.setTextSize(this.mej);
      if ((this.xto == ((a)paramObject).xto) && (this.mej == ((a)paramObject).mej) && (this.iJz.equals(((a)paramObject).iJz)) && ((int)xtp.measureText(this.iJz) == (int)xtp.measureText(((a)paramObject).iJz)))
      {
        GMTrace.o(18744713674752L, 139659);
        return true;
      }
      GMTrace.o(18744713674752L, 139659);
      return false;
    }
    GMTrace.o(18744713674752L, 139659);
    return false;
  }
  
  public final int hashCode()
  {
    GMTrace.i(18744579457024L, 139658);
    Iterator localIterator = this.xth.iterator();
    for (int i = 0; localIterator.hasNext(); i = ((e)localIterator.next()).cjD() + i) {}
    GMTrace.o(18744579457024L, 139658);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\widget\celltextview\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */