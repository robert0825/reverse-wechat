package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class uh
  extends com.tencent.mm.bm.a
{
  public int jhV;
  public String umC;
  public long umD;
  public String umE;
  
  public uh()
  {
    GMTrace.i(3776752648192L, 28139);
    GMTrace.o(3776752648192L, 28139);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3776886865920L, 28140);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.umC == null) {
        throw new b("Not all required fields were included: Rid");
      }
      if (this.umE == null) {
        throw new b("Not all required fields were included: MimeType");
      }
      if (this.umC != null) {
        paramVarArgs.e(1, this.umC);
      }
      paramVarArgs.T(2, this.umD);
      paramVarArgs.fk(3, this.jhV);
      if (this.umE != null) {
        paramVarArgs.e(4, this.umE);
      }
      GMTrace.o(3776886865920L, 28140);
      return 0;
    }
    if (paramInt == 1) {
      if (this.umC == null) {
        break label470;
      }
    }
    label470:
    for (paramInt = b.a.a.b.b.a.f(1, this.umC) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.S(2, this.umD) + b.a.a.a.fh(3, this.jhV);
      paramInt = i;
      if (this.umE != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.umE);
      }
      GMTrace.o(3776886865920L, 28140);
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.umC == null) {
          throw new b("Not all required fields were included: Rid");
        }
        if (this.umE == null) {
          throw new b("Not all required fields were included: MimeType");
        }
        GMTrace.o(3776886865920L, 28140);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        uh localuh = (uh)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3776886865920L, 28140);
          return -1;
        case 1: 
          localuh.umC = locala.yqV.readString();
          GMTrace.o(3776886865920L, 28140);
          return 0;
        case 2: 
          localuh.umD = locala.yqV.nk();
          GMTrace.o(3776886865920L, 28140);
          return 0;
        case 3: 
          localuh.jhV = locala.yqV.nj();
          GMTrace.o(3776886865920L, 28140);
          return 0;
        }
        localuh.umE = locala.yqV.readString();
        GMTrace.o(3776886865920L, 28140);
        return 0;
      }
      GMTrace.o(3776886865920L, 28140);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\uh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */