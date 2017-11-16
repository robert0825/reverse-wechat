package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class bq
  extends com.tencent.mm.bm.a
{
  public int lSq;
  public String lSr;
  public String lSs;
  public boolean lSt;
  
  public bq()
  {
    GMTrace.i(12648007598080L, 94235);
    GMTrace.o(12648007598080L, 94235);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12648141815808L, 94236);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lSs == null) {
        throw new b("Not all required fields were included: MediaURL");
      }
      paramVarArgs.fk(1, this.lSq);
      if (this.lSr != null) {
        paramVarArgs.e(2, this.lSr);
      }
      if (this.lSs != null) {
        paramVarArgs.e(3, this.lSs);
      }
      paramVarArgs.ah(4, this.lSt);
      GMTrace.o(12648141815808L, 94236);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.lSq) + 0;
      paramInt = i;
      if (this.lSr != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lSr);
      }
      i = paramInt;
      if (this.lSs != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.lSs);
      }
      paramInt = b.a.a.b.b.a.cK(4);
      GMTrace.o(12648141815808L, 94236);
      return i + (paramInt + 1);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.lSs == null) {
        throw new b("Not all required fields were included: MediaURL");
      }
      GMTrace.o(12648141815808L, 94236);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bq localbq = (bq)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(12648141815808L, 94236);
        return -1;
      case 1: 
        localbq.lSq = locala.yqV.nj();
        GMTrace.o(12648141815808L, 94236);
        return 0;
      case 2: 
        localbq.lSr = locala.yqV.readString();
        GMTrace.o(12648141815808L, 94236);
        return 0;
      case 3: 
        localbq.lSs = locala.yqV.readString();
        GMTrace.o(12648141815808L, 94236);
        return 0;
      }
      localbq.lSt = locala.csU();
      GMTrace.o(12648141815808L, 94236);
      return 0;
    }
    GMTrace.o(12648141815808L, 94236);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\bq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */