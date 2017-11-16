package com.tencent.mm.plugin.appbrand.widget.picker;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.widget.input.l;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Constructor;

public abstract class b
{
  public a iRs;
  
  public b()
  {
    GMTrace.i(10120821997568L, 75406);
    GMTrace.o(10120821997568L, 75406);
  }
  
  public abstract View Xe();
  
  public final a cU(boolean paramBoolean)
  {
    GMTrace.i(17285632753664L, 128788);
    if (this.iRs != null)
    {
      localObject = this.iRs;
      GMTrace.o(17285632753664L, 128788);
      return (a)localObject;
    }
    if (Xe() == null)
    {
      GMTrace.o(17285632753664L, 128788);
      return null;
    }
    l locall = l.bQ(Xe());
    if (locall == null)
    {
      GMTrace.o(17285632753664L, 128788);
      return null;
    }
    a locala = a.cc(locall);
    Object localObject = locala;
    if (locala == null)
    {
      localObject = locala;
      if (paramBoolean)
      {
        localObject = new a(Xe().getContext());
        locall.g((View)localObject, true);
      }
    }
    GMTrace.o(17285632753664L, 128788);
    return (a)localObject;
  }
  
  public final <T extends i> T r(Class<T> paramClass)
  {
    GMTrace.i(17285498535936L, 128787);
    a locala = cU(true);
    this.iRs = locala;
    if (locala == null)
    {
      GMTrace.o(17285498535936L, 128787);
      return null;
    }
    if (!paramClass.isInstance(locala.iRQ)) {}
    try
    {
      Object localObject = (i)paramClass.getDeclaredConstructor(new Class[] { Context.class }).newInstance(new Object[] { locala.getContext() });
      if ((locala.iRQ == null) || (localObject == null) || (localObject.getClass() != locala.iRQ.getClass()))
      {
        if (locala.iRQ != null) {
          locala.iRQ.adI();
        }
        locala.iRQ = ((i)localObject);
        if (locala.iRQ != null) {
          locala.iRQ.b(locala);
        }
        if ((locala.iRR != null) && (locala.iRQ != null))
        {
          localObject = locala.iRQ.getView();
          if (localObject != null) {
            break label181;
          }
        }
      }
      for (;;)
      {
        paramClass = locala.iRQ;
        GMTrace.o(17285498535936L, 128787);
        return paramClass;
        label181:
        locala.iRR.removeAllViews();
        locala.adM();
        localObject = new FrameLayout.LayoutParams(-1, -2);
        ((FrameLayout.LayoutParams)localObject).gravity = 17;
        locala.iRR.addView(locala.iRQ.getView(), (ViewGroup.LayoutParams)localObject);
      }
      return null;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.AppBrandBottomPickerInvokeHandler", "newInstance class[%s], exp[%s]", new Object[] { paramClass.getSimpleName(), localException });
      GMTrace.o(17285498535936L, 128787);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\picker\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */