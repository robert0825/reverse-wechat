package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class tq
  extends com.tencent.mm.bm.a
{
  public int jhA;
  public int tPL;
  public int tPM;
  public int tPN;
  public int tPO;
  public String tPS;
  
  public tq()
  {
    GMTrace.i(3931505688576L, 29292);
    GMTrace.o(3931505688576L, 29292);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3931639906304L, 29293);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tPL);
      paramVarArgs.fk(2, this.jhA);
      if (this.tPS != null) {
        paramVarArgs.e(3, this.tPS);
      }
      paramVarArgs.fk(4, this.tPM);
      paramVarArgs.fk(5, this.tPN);
      paramVarArgs.fk(6, this.tPO);
      GMTrace.o(3931639906304L, 29293);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.tPL) + 0 + b.a.a.a.fh(2, this.jhA);
      paramInt = i;
      if (this.tPS != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.tPS);
      }
      i = b.a.a.a.fh(4, this.tPM);
      int j = b.a.a.a.fh(5, this.tPN);
      int k = b.a.a.a.fh(6, this.tPO);
      GMTrace.o(3931639906304L, 29293);
      return paramInt + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3931639906304L, 29293);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      tq localtq = (tq)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3931639906304L, 29293);
        return -1;
      case 1: 
        localtq.tPL = locala.yqV.nj();
        GMTrace.o(3931639906304L, 29293);
        return 0;
      case 2: 
        localtq.jhA = locala.yqV.nj();
        GMTrace.o(3931639906304L, 29293);
        return 0;
      case 3: 
        localtq.tPS = locala.yqV.readString();
        GMTrace.o(3931639906304L, 29293);
        return 0;
      case 4: 
        localtq.tPM = locala.yqV.nj();
        GMTrace.o(3931639906304L, 29293);
        return 0;
      case 5: 
        localtq.tPN = locala.yqV.nj();
        GMTrace.o(3931639906304L, 29293);
        return 0;
      }
      localtq.tPO = locala.yqV.nj();
      GMTrace.o(3931639906304L, 29293);
      return 0;
    }
    GMTrace.o(3931639906304L, 29293);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\tq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */