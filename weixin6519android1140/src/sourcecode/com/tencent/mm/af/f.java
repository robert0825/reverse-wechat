package com.tencent.mm.af;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.af;
import com.tencent.mm.l.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.e.a;
import com.tencent.mm.protocal.c.aol;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.bc.5;
import java.util.List;

public final class f
{
  public static boolean Fm()
  {
    GMTrace.i(4554812817408L, 33936);
    if (x.FG().fQ(1) > 0)
    {
      GMTrace.o(4554812817408L, 33936);
      return true;
    }
    GMTrace.o(4554812817408L, 33936);
    return false;
  }
  
  public static List<String> Fn()
  {
    GMTrace.i(4554947035136L, 33937);
    List localList = x.FG().fP(2);
    GMTrace.o(4554947035136L, 33937);
    return localList;
  }
  
  public static boolean Fo()
  {
    GMTrace.i(4555081252864L, 33938);
    if (x.FG().fQ(4) > 0)
    {
      GMTrace.o(4555081252864L, 33938);
      return true;
    }
    GMTrace.o(4555081252864L, 33938);
    return false;
  }
  
  public static boolean Fp()
  {
    GMTrace.i(4555215470592L, 33939);
    if (x.FG().fQ(8) > 0)
    {
      GMTrace.o(4555215470592L, 33939);
      return true;
    }
    GMTrace.o(4555215470592L, 33939);
    return false;
  }
  
  public static List<String> Fq()
  {
    GMTrace.i(4555349688320L, 33940);
    List localList = x.FG().fP(16);
    GMTrace.o(4555349688320L, 33940);
    return localList;
  }
  
  public static boolean Fr()
  {
    GMTrace.i(4555483906048L, 33941);
    if (x.FG().fQ(16) > 0)
    {
      GMTrace.o(4555483906048L, 33941);
      return true;
    }
    GMTrace.o(4555483906048L, 33941);
    return false;
  }
  
  public static List<String> Fs()
  {
    GMTrace.i(4555618123776L, 33942);
    List localList = x.FG().fP(32);
    GMTrace.o(4555618123776L, 33942);
    return localList;
  }
  
  public static boolean Ft()
  {
    GMTrace.i(4555752341504L, 33943);
    if (x.FG().fQ(64) > 0)
    {
      GMTrace.o(4555752341504L, 33943);
      return true;
    }
    GMTrace.o(4555752341504L, 33943);
    return false;
  }
  
  public static List<String> Fu()
  {
    GMTrace.i(4555886559232L, 33944);
    List localList = x.FG().fP(128);
    GMTrace.o(4555886559232L, 33944);
    return localList;
  }
  
  public static boolean Fv()
  {
    GMTrace.i(4556020776960L, 33945);
    if (x.FG().fQ(128) > 0)
    {
      GMTrace.o(4556020776960L, 33945);
      return true;
    }
    GMTrace.o(4556020776960L, 33945);
    return false;
  }
  
  public static boolean Fw()
  {
    GMTrace.i(4556154994688L, 33946);
    if (x.FG().fQ(256) > 0)
    {
      GMTrace.o(4556154994688L, 33946);
      return true;
    }
    GMTrace.o(4556154994688L, 33946);
    return false;
  }
  
  public static boolean Fx()
  {
    GMTrace.i(4556289212416L, 33947);
    if (x.FG().fQ(512) > 0)
    {
      GMTrace.o(4556289212416L, 33947);
      return true;
    }
    GMTrace.o(4556289212416L, 33947);
    return false;
  }
  
  public static boolean dL(String paramString)
  {
    GMTrace.i(4554141728768L, 33931);
    paramString = iK(paramString);
    if (paramString == null)
    {
      GMTrace.o(4554141728768L, 33931);
      return false;
    }
    if (paramString.EH())
    {
      GMTrace.o(4554141728768L, 33931);
      return true;
    }
    GMTrace.o(4554141728768L, 33931);
    return false;
  }
  
  public static void f(d paramd)
  {
    GMTrace.i(4554544381952L, 33934);
    if (paramd == null)
    {
      w.e("MicroMsg.BizInfoStorageLogic", "updateBrandFlagForTempSession bizInfo is Null");
      GMTrace.o(4554544381952L, 33934);
      return;
    }
    aol localaol = new aol();
    localaol.gCL = paramd.field_brandFlag;
    localaol.jhi = paramd.field_username;
    com.tencent.mm.storage.x localx = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TD(paramd.field_username);
    if ((localx != null) && (a.eE(localx.field_type))) {
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yJ().b(new e.a(47, localaol));
    }
    for (;;)
    {
      w.i("MicroMsg.BizInfoStorageLogic", "updateBrandFlagForTempSession ret = %b, BrandFlag = %b", new Object[] { Boolean.valueOf(x.FG().c(paramd, new String[0])), Integer.valueOf(paramd.field_brandFlag) });
      GMTrace.o(4554544381952L, 33934);
      return;
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yJ().b(new e.a(58, localaol));
    }
  }
  
  public static void g(d paramd)
  {
    GMTrace.i(4554678599680L, 33935);
    if (paramd != null)
    {
      aol localaol = new aol();
      localaol.gCL = paramd.field_brandFlag;
      localaol.jhi = paramd.field_username;
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yJ().b(new e.a(47, localaol));
      x.FG().c(paramd, new String[0]);
    }
    GMTrace.o(4554678599680L, 33935);
  }
  
  public static d iK(String paramString)
  {
    GMTrace.i(4553336422400L, 33925);
    paramString = x.FG().iC(paramString);
    if (paramString.field_updateTime > 0L)
    {
      GMTrace.o(4553336422400L, 33925);
      return paramString;
    }
    GMTrace.o(4553336422400L, 33925);
    return null;
  }
  
  public static boolean iL(String paramString)
  {
    GMTrace.i(4553470640128L, 33926);
    paramString = iK(paramString);
    if (paramString == null)
    {
      GMTrace.o(4553470640128L, 33926);
      return false;
    }
    if (paramString.EC())
    {
      GMTrace.o(4553470640128L, 33926);
      return true;
    }
    GMTrace.o(4553470640128L, 33926);
    return false;
  }
  
  public static boolean iM(String paramString)
  {
    GMTrace.i(4553604857856L, 33927);
    paramString = iK(paramString);
    if (paramString == null)
    {
      GMTrace.o(4553604857856L, 33927);
      return false;
    }
    boolean bool = paramString.ED();
    GMTrace.o(4553604857856L, 33927);
    return bool;
  }
  
  public static boolean iN(String paramString)
  {
    GMTrace.i(4553739075584L, 33928);
    paramString = iK(paramString);
    if (paramString == null)
    {
      GMTrace.o(4553739075584L, 33928);
      return false;
    }
    if (paramString.EE())
    {
      GMTrace.o(4553739075584L, 33928);
      return true;
    }
    GMTrace.o(4553739075584L, 33928);
    return false;
  }
  
  public static boolean iO(String paramString)
  {
    GMTrace.i(4553873293312L, 33929);
    paramString = iK(paramString);
    if (paramString == null)
    {
      GMTrace.o(4553873293312L, 33929);
      return false;
    }
    if (paramString.EG())
    {
      GMTrace.o(4553873293312L, 33929);
      return true;
    }
    GMTrace.o(4553873293312L, 33929);
    return false;
  }
  
  public static boolean iP(String paramString)
  {
    GMTrace.i(4554007511040L, 33930);
    if (paramString == null)
    {
      GMTrace.o(4554007511040L, 33930);
      return false;
    }
    paramString = iK(paramString);
    if (paramString == null)
    {
      GMTrace.o(4554007511040L, 33930);
      return false;
    }
    if (paramString.EF())
    {
      GMTrace.o(4554007511040L, 33930);
      return true;
    }
    GMTrace.o(4554007511040L, 33930);
    return false;
  }
  
  public static boolean iQ(String paramString)
  {
    GMTrace.i(4554275946496L, 33932);
    paramString = iK(paramString);
    if (paramString == null)
    {
      GMTrace.o(4554275946496L, 33932);
      return false;
    }
    if (paramString.EI())
    {
      GMTrace.o(4554275946496L, 33932);
      return true;
    }
    GMTrace.o(4554275946496L, 33932);
    return false;
  }
  
  public static boolean iR(String paramString)
  {
    GMTrace.i(4554410164224L, 33933);
    paramString = iK(paramString);
    if (paramString == null)
    {
      GMTrace.o(4554410164224L, 33933);
      return false;
    }
    boolean bool = paramString.Ex();
    GMTrace.o(4554410164224L, 33933);
    return bool;
  }
  
  public static void iS(String paramString)
  {
    int i = 0;
    GMTrace.i(4556423430144L, 33948);
    bc.a(paramString, null);
    ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().TN(paramString);
    d locald = iK(paramString);
    if (locald == null)
    {
      x.FN().hB(paramString);
      GMTrace.o(4556423430144L, 33948);
      return;
    }
    if (locald.EF())
    {
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().Ud(paramString);
      x.FG();
      List localList = e.iF(paramString);
      if ((localList == null) || (localList.size() <= 0)) {
        w.d("MicroMsg.MsgInfoStorageLogic", "deleteMsgByTalkers, empty talkers");
      }
      while (i < localList.size())
      {
        String str = (String)localList.get(i);
        if (dL(str)) {
          com.tencent.mm.af.a.e.w(str, true);
        }
        x.FG().iD(str);
        i += 1;
        continue;
        w.i("MicroMsg.MsgInfoStorageLogic", "summerdel deleteMsgByTalkers stack[%s]", new Object[] { bg.bQW() });
        com.tencent.mm.sdk.f.e.post(new bc.5(localList), "deleteMsgByTalkers");
      }
    }
    if (locald.EH()) {
      com.tencent.mm.af.a.e.w(paramString, true);
    }
    x.FG().c(locald);
    x.FN().hB(paramString);
    GMTrace.o(4556423430144L, 33948);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\af\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */