package com.tencent.mm.p;

import android.content.Context;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.jl;
import com.tencent.mm.g.a.jl.b;
import com.tencent.mm.g.a.sh;
import com.tencent.mm.g.a.sh.a;
import com.tencent.mm.plugin.comm.a.h;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.ac;

public final class a
{
  private static ac ett;
  
  public static boolean aP(Context paramContext)
  {
    GMTrace.i(18720822919168L, 139481);
    if (vq())
    {
      w.i("MicroMsg.DeviceOccupy", "isMultiTalking");
      Toast.makeText(paramContext, a.h.kcL, 0).show();
      GMTrace.o(18720822919168L, 139481);
      return true;
    }
    GMTrace.o(18720822919168L, 139481);
    return false;
  }
  
  public static boolean aQ(Context paramContext)
  {
    GMTrace.i(18721091354624L, 139483);
    sh localsh = new sh();
    com.tencent.mm.sdk.b.a.vgX.m(localsh);
    if (localsh.eXb.eXd)
    {
      w.i("MicroMsg.DeviceOccupy", "isCameraUsing");
      Toast.makeText(paramContext, c(paramContext, localsh.eXb.eXc), 0).show();
    }
    boolean bool = localsh.eXb.eXd;
    GMTrace.o(18721091354624L, 139483);
    return bool;
  }
  
  public static boolean aR(Context paramContext)
  {
    GMTrace.i(18721225572352L, 139484);
    sh localsh = new sh();
    com.tencent.mm.sdk.b.a.vgX.m(localsh);
    if (localsh.eXb.eXe)
    {
      w.i("MicroMsg.DeviceOccupy", "isVoiceUsing");
      Toast.makeText(paramContext, c(paramContext, localsh.eXb.eXc), 0).show();
    }
    boolean bool = localsh.eXb.eXe;
    GMTrace.o(18721225572352L, 139484);
    return bool;
  }
  
  private static String c(Context paramContext, boolean paramBoolean)
  {
    GMTrace.i(18721359790080L, 139485);
    if (paramBoolean)
    {
      paramContext = paramContext.getString(a.h.kbW);
      GMTrace.o(18721359790080L, 139485);
      return paramContext;
    }
    paramContext = paramContext.getString(a.h.kbX);
    GMTrace.o(18721359790080L, 139485);
    return paramContext;
  }
  
  public static ac pD()
  {
    GMTrace.i(18721494007808L, 139486);
    if (ett == null) {
      ett = com.tencent.mm.booter.a.rg();
    }
    ac localac = ett;
    GMTrace.o(18721494007808L, 139486);
    return localac;
  }
  
  public static boolean vq()
  {
    GMTrace.i(18720957136896L, 139482);
    jl localjl = new jl();
    localjl.eNh.action = 1;
    com.tencent.mm.sdk.b.a.vgX.m(localjl);
    boolean bool = localjl.eNi.isStart;
    GMTrace.o(18720957136896L, 139482);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\p\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */