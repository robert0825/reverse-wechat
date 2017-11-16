package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class auq
  extends com.tencent.mm.bm.a
{
  public String eLQ;
  public String uKc;
  public String url;
  
  public auq()
  {
    GMTrace.i(3882247782400L, 28925);
    GMTrace.o(3882247782400L, 28925);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3882382000128L, 28926);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.eLQ != null) {
        paramVarArgs.e(1, this.eLQ);
      }
      if (this.url != null) {
        paramVarArgs.e(2, this.url);
      }
      if (this.uKc != null) {
        paramVarArgs.e(3, this.uKc);
      }
      GMTrace.o(3882382000128L, 28926);
      return 0;
    }
    if (paramInt == 1) {
      if (this.eLQ == null) {
        break label370;
      }
    }
    label370:
    for (int i = b.a.a.b.b.a.f(1, this.eLQ) + 0;; i = 0)
    {
      paramInt = i;
      if (this.url != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.url);
      }
      i = paramInt;
      if (this.uKc != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.uKc);
      }
      GMTrace.o(3882382000128L, 28926);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3882382000128L, 28926);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        auq localauq = (auq)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3882382000128L, 28926);
          return -1;
        case 1: 
          localauq.eLQ = locala.yqV.readString();
          GMTrace.o(3882382000128L, 28926);
          return 0;
        case 2: 
          localauq.url = locala.yqV.readString();
          GMTrace.o(3882382000128L, 28926);
          return 0;
        }
        localauq.uKc = locala.yqV.readString();
        GMTrace.o(3882382000128L, 28926);
        return 0;
      }
      GMTrace.o(3882382000128L, 28926);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\auq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */