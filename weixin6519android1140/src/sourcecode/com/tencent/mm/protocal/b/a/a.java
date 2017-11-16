package com.tencent.mm.protocal.b.a;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class a
  extends com.tencent.mm.bm.a
{
  public int actionType;
  public int id;
  public String tLT;
  public String tLU;
  
  public a()
  {
    GMTrace.i(4080084713472L, 30399);
    GMTrace.o(4080084713472L, 30399);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4080218931200L, 30400);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tLT == null) {
        throw new b("Not all required fields were included: btnStr");
      }
      paramVarArgs.fk(1, this.id);
      paramVarArgs.fk(2, this.actionType);
      if (this.tLT != null) {
        paramVarArgs.e(3, this.tLT);
      }
      if (this.tLU != null) {
        paramVarArgs.e(4, this.tLU);
      }
      GMTrace.o(4080218931200L, 30400);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.id) + 0 + b.a.a.a.fh(2, this.actionType);
      paramInt = i;
      if (this.tLT != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.tLT);
      }
      i = paramInt;
      if (this.tLU != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.tLU);
      }
      GMTrace.o(4080218931200L, 30400);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.tLT == null) {
        throw new b("Not all required fields were included: btnStr");
      }
      GMTrace.o(4080218931200L, 30400);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      a locala1 = (a)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(4080218931200L, 30400);
        return -1;
      case 1: 
        locala1.id = locala.yqV.nj();
        GMTrace.o(4080218931200L, 30400);
        return 0;
      case 2: 
        locala1.actionType = locala.yqV.nj();
        GMTrace.o(4080218931200L, 30400);
        return 0;
      case 3: 
        locala1.tLT = locala.yqV.readString();
        GMTrace.o(4080218931200L, 30400);
        return 0;
      }
      locala1.tLU = locala.yqV.readString();
      GMTrace.o(4080218931200L, 30400);
      return 0;
    }
    GMTrace.o(4080218931200L, 30400);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\b\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */