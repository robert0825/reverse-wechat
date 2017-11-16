package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class rp
  extends com.tencent.mm.bm.a
{
  public String gjg;
  public int ojr;
  public String ojs;
  public String ojt;
  public int oju;
  
  public rp()
  {
    GMTrace.i(20862535204864L, 155438);
    GMTrace.o(20862535204864L, 155438);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20862669422592L, 155439);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.ojr);
      if (this.ojs != null) {
        paramVarArgs.e(2, this.ojs);
      }
      if (this.ojt != null) {
        paramVarArgs.e(3, this.ojt);
      }
      paramVarArgs.fk(4, this.oju);
      if (this.gjg != null) {
        paramVarArgs.e(5, this.gjg);
      }
      GMTrace.o(20862669422592L, 155439);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.ojr) + 0;
      paramInt = i;
      if (this.ojs != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.ojs);
      }
      i = paramInt;
      if (this.ojt != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.ojt);
      }
      i += b.a.a.a.fh(4, this.oju);
      paramInt = i;
      if (this.gjg != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.gjg);
      }
      GMTrace.o(20862669422592L, 155439);
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
      GMTrace.o(20862669422592L, 155439);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      rp localrp = (rp)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(20862669422592L, 155439);
        return -1;
      case 1: 
        localrp.ojr = locala.yqV.nj();
        GMTrace.o(20862669422592L, 155439);
        return 0;
      case 2: 
        localrp.ojs = locala.yqV.readString();
        GMTrace.o(20862669422592L, 155439);
        return 0;
      case 3: 
        localrp.ojt = locala.yqV.readString();
        GMTrace.o(20862669422592L, 155439);
        return 0;
      case 4: 
        localrp.oju = locala.yqV.nj();
        GMTrace.o(20862669422592L, 155439);
        return 0;
      }
      localrp.gjg = locala.yqV.readString();
      GMTrace.o(20862669422592L, 155439);
      return 0;
    }
    GMTrace.o(20862669422592L, 155439);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\rp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */