package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class btb
  extends com.tencent.mm.bm.a
{
  public String vbS;
  public String vbT;
  public String vbU;
  
  public btb()
  {
    GMTrace.i(3814467829760L, 28420);
    GMTrace.o(3814467829760L, 28420);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3814602047488L, 28421);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.vbS == null) {
        throw new b("Not all required fields were included: Plugin");
      }
      if (this.vbT == null) {
        throw new b("Not all required fields were included: ActivityPath");
      }
      if (this.vbS != null) {
        paramVarArgs.e(1, this.vbS);
      }
      if (this.vbT != null) {
        paramVarArgs.e(2, this.vbT);
      }
      if (this.vbU != null) {
        paramVarArgs.e(3, this.vbU);
      }
      GMTrace.o(3814602047488L, 28421);
      return 0;
    }
    if (paramInt == 1) {
      if (this.vbS == null) {
        break label438;
      }
    }
    label438:
    for (int i = b.a.a.b.b.a.f(1, this.vbS) + 0;; i = 0)
    {
      paramInt = i;
      if (this.vbT != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.vbT);
      }
      i = paramInt;
      if (this.vbU != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.vbU);
      }
      GMTrace.o(3814602047488L, 28421);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.vbS == null) {
          throw new b("Not all required fields were included: Plugin");
        }
        if (this.vbT == null) {
          throw new b("Not all required fields were included: ActivityPath");
        }
        GMTrace.o(3814602047488L, 28421);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        btb localbtb = (btb)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3814602047488L, 28421);
          return -1;
        case 1: 
          localbtb.vbS = locala.yqV.readString();
          GMTrace.o(3814602047488L, 28421);
          return 0;
        case 2: 
          localbtb.vbT = locala.yqV.readString();
          GMTrace.o(3814602047488L, 28421);
          return 0;
        }
        localbtb.vbU = locala.yqV.readString();
        GMTrace.o(3814602047488L, 28421);
        return 0;
      }
      GMTrace.o(3814602047488L, 28421);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\btb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */