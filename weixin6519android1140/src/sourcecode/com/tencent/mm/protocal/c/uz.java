package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class uz
  extends com.tencent.mm.bm.a
{
  public String lPg;
  public String tRP;
  public int und;
  public String une;
  public String unm;
  
  public uz()
  {
    GMTrace.i(3699711672320L, 27565);
    GMTrace.o(3699711672320L, 27565);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3699845890048L, 27566);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lPg == null) {
        throw new b("Not all required fields were included: AppID");
      }
      if (this.unm == null) {
        throw new b("Not all required fields were included: RecommendKey");
      }
      if (this.lPg != null) {
        paramVarArgs.e(1, this.lPg);
      }
      if (this.unm != null) {
        paramVarArgs.e(2, this.unm);
      }
      if (this.tRP != null) {
        paramVarArgs.e(3, this.tRP);
      }
      paramVarArgs.fk(4, this.und);
      if (this.une != null) {
        paramVarArgs.e(5, this.une);
      }
      GMTrace.o(3699845890048L, 27566);
      return 0;
    }
    if (paramInt == 1) {
      if (this.lPg == null) {
        break label550;
      }
    }
    label550:
    for (int i = b.a.a.b.b.a.f(1, this.lPg) + 0;; i = 0)
    {
      paramInt = i;
      if (this.unm != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.unm);
      }
      i = paramInt;
      if (this.tRP != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tRP);
      }
      i += b.a.a.a.fh(4, this.und);
      paramInt = i;
      if (this.une != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.une);
      }
      GMTrace.o(3699845890048L, 27566);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.lPg == null) {
          throw new b("Not all required fields were included: AppID");
        }
        if (this.unm == null) {
          throw new b("Not all required fields were included: RecommendKey");
        }
        GMTrace.o(3699845890048L, 27566);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        uz localuz = (uz)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3699845890048L, 27566);
          return -1;
        case 1: 
          localuz.lPg = locala.yqV.readString();
          GMTrace.o(3699845890048L, 27566);
          return 0;
        case 2: 
          localuz.unm = locala.yqV.readString();
          GMTrace.o(3699845890048L, 27566);
          return 0;
        case 3: 
          localuz.tRP = locala.yqV.readString();
          GMTrace.o(3699845890048L, 27566);
          return 0;
        case 4: 
          localuz.und = locala.yqV.nj();
          GMTrace.o(3699845890048L, 27566);
          return 0;
        }
        localuz.une = locala.yqV.readString();
        GMTrace.o(3699845890048L, 27566);
        return 0;
      }
      GMTrace.o(3699845890048L, 27566);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\uz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */