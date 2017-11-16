package com.tencent.mm.plugin.backup.h;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class k
  extends com.tencent.mm.bm.a
{
  public int jhg;
  public int jhh;
  public String jhi;
  
  public k()
  {
    GMTrace.i(14830924726272L, 110499);
    GMTrace.o(14830924726272L, 110499);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(14831058944000L, 110500);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.jhi == null) {
        throw new b("Not all required fields were included: UserName");
      }
      paramVarArgs.fk(1, this.jhg);
      paramVarArgs.fk(2, this.jhh);
      if (this.jhi != null) {
        paramVarArgs.e(3, this.jhi);
      }
      GMTrace.o(14831058944000L, 110500);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.jhg) + 0 + b.a.a.a.fh(2, this.jhh);
      paramInt = i;
      if (this.jhi != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.jhi);
      }
      GMTrace.o(14831058944000L, 110500);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.jhi == null) {
        throw new b("Not all required fields were included: UserName");
      }
      GMTrace.o(14831058944000L, 110500);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      k localk = (k)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(14831058944000L, 110500);
        return -1;
      case 1: 
        localk.jhg = locala.yqV.nj();
        GMTrace.o(14831058944000L, 110500);
        return 0;
      case 2: 
        localk.jhh = locala.yqV.nj();
        GMTrace.o(14831058944000L, 110500);
        return 0;
      }
      localk.jhi = locala.yqV.readString();
      GMTrace.o(14831058944000L, 110500);
      return 0;
    }
    GMTrace.o(14831058944000L, 110500);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\backup\h\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */