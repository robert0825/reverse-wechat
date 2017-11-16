package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class bsn
  extends com.tencent.mm.bm.a
{
  public int vbH;
  public String vbv;
  
  public bsn()
  {
    GMTrace.i(3710180655104L, 27643);
    GMTrace.o(3710180655104L, 27643);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3710314872832L, 27644);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.vbv == null) {
        throw new b("Not all required fields were included: Talker");
      }
      if (this.vbv != null) {
        paramVarArgs.e(1, this.vbv);
      }
      paramVarArgs.fk(2, this.vbH);
      GMTrace.o(3710314872832L, 27644);
      return 0;
    }
    if (paramInt == 1) {
      if (this.vbv == null) {
        break label326;
      }
    }
    label326:
    for (paramInt = b.a.a.b.b.a.f(1, this.vbv) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.fh(2, this.vbH);
      GMTrace.o(3710314872832L, 27644);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.vbv == null) {
          throw new b("Not all required fields were included: Talker");
        }
        GMTrace.o(3710314872832L, 27644);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bsn localbsn = (bsn)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3710314872832L, 27644);
          return -1;
        case 1: 
          localbsn.vbv = locala.yqV.readString();
          GMTrace.o(3710314872832L, 27644);
          return 0;
        }
        localbsn.vbH = locala.yqV.nj();
        GMTrace.o(3710314872832L, 27644);
        return 0;
      }
      GMTrace.o(3710314872832L, 27644);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bsn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */