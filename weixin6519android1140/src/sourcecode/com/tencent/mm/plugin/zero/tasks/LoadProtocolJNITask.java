package com.tencent.mm.plugin.zero.tasks;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.xlog.Xlog;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.kernel.a.c;
import com.tencent.mm.kernel.b.e;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.protocal.d;

public class LoadProtocolJNITask
  extends c
{
  public LoadProtocolJNITask()
  {
    GMTrace.i(13629139189760L, 101545);
    GMTrace.o(13629139189760L, 101545);
  }
  
  public void execute(e parame)
  {
    GMTrace.i(13629273407488L, 101546);
    k.b("MMProtocalJni", getClass().getClassLoader());
    MMProtocalJni.setClientPackVersion(d.tJC);
    MMProtocalJni.setProtocalJniLogLevel(new Xlog().getLogLevel());
    MMProtocalJni.setIsLite(false);
    GMTrace.o(13629273407488L, 101546);
  }
  
  public String name()
  {
    GMTrace.i(13629407625216L, 101547);
    GMTrace.o(13629407625216L, 101547);
    return "boot-load-MMProtocalJni-library";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\zero\tasks\LoadProtocolJNITask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */