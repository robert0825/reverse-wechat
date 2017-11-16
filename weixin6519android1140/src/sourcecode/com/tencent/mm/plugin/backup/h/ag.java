package com.tencent.mm.plugin.backup.h;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ag
  extends com.tencent.mm.bm.a
{
  public String jha;
  public LinkedList<Long> jiw;
  public LinkedList<String> jix;
  public LinkedList<String> jiy;
  
  public ag()
  {
    GMTrace.i(14833072209920L, 110515);
    this.jiw = new LinkedList();
    this.jix = new LinkedList();
    this.jiy = new LinkedList();
    GMTrace.o(14833072209920L, 110515);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14833206427648L, 110516);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.jha == null) {
        throw new b("Not all required fields were included: BakChatName");
      }
      paramVarArgs.d(1, 3, this.jiw);
      paramVarArgs.d(2, 1, this.jix);
      paramVarArgs.d(3, 1, this.jiy);
      if (this.jha != null) {
        paramVarArgs.e(4, this.jha);
      }
      GMTrace.o(14833206427648L, 110516);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.c(1, 3, this.jiw) + 0 + b.a.a.a.c(2, 1, this.jix) + b.a.a.a.c(3, 1, this.jiy);
      paramInt = i;
      if (this.jha != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.jha);
      }
      GMTrace.o(14833206427648L, 110516);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.jiw.clear();
      this.jix.clear();
      this.jiy.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.jha == null) {
        throw new b("Not all required fields were included: BakChatName");
      }
      GMTrace.o(14833206427648L, 110516);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      ag localag = (ag)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(14833206427648L, 110516);
        return -1;
      case 1: 
        localag.jiw.add(Long.valueOf(locala.yqV.nk()));
        GMTrace.o(14833206427648L, 110516);
        return 0;
      case 2: 
        localag.jix.add(locala.yqV.readString());
        GMTrace.o(14833206427648L, 110516);
        return 0;
      case 3: 
        localag.jiy.add(locala.yqV.readString());
        GMTrace.o(14833206427648L, 110516);
        return 0;
      }
      localag.jha = locala.yqV.readString();
      GMTrace.o(14833206427648L, 110516);
      return 0;
    }
    GMTrace.o(14833206427648L, 110516);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\h\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */