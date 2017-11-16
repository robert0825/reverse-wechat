package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ajw
  extends com.tencent.mm.bm.a
{
  public String scope;
  public int uyE;
  public String uyF;
  public LinkedList<String> uyG;
  
  public ajw()
  {
    GMTrace.i(4010291494912L, 29879);
    this.uyG = new LinkedList();
    GMTrace.o(4010291494912L, 29879);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4010425712640L, 29880);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.scope != null) {
        paramVarArgs.e(1, this.scope);
      }
      paramVarArgs.fk(2, this.uyE);
      if (this.uyF != null) {
        paramVarArgs.e(3, this.uyF);
      }
      paramVarArgs.d(4, 1, this.uyG);
      GMTrace.o(4010425712640L, 29880);
      return 0;
    }
    if (paramInt == 1) {
      if (this.scope == null) {
        break label418;
      }
    }
    label418:
    for (paramInt = b.a.a.b.b.a.f(1, this.scope) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.fh(2, this.uyE);
      paramInt = i;
      if (this.uyF != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.uyF);
      }
      i = b.a.a.a.c(4, 1, this.uyG);
      GMTrace.o(4010425712640L, 29880);
      return paramInt + i;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.uyG.clear();
        paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(4010425712640L, 29880);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ajw localajw = (ajw)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(4010425712640L, 29880);
          return -1;
        case 1: 
          localajw.scope = locala.yqV.readString();
          GMTrace.o(4010425712640L, 29880);
          return 0;
        case 2: 
          localajw.uyE = locala.yqV.nj();
          GMTrace.o(4010425712640L, 29880);
          return 0;
        case 3: 
          localajw.uyF = locala.yqV.readString();
          GMTrace.o(4010425712640L, 29880);
          return 0;
        }
        localajw.uyG.add(locala.yqV.readString());
        GMTrace.o(4010425712640L, 29880);
        return 0;
      }
      GMTrace.o(4010425712640L, 29880);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ajw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */