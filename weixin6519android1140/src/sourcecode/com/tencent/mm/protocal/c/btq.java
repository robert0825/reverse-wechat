package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class btq
  extends com.tencent.mm.bm.a
{
  public String vcq;
  public boolean vcr;
  public int vcs;
  public int vct;
  
  public btq()
  {
    GMTrace.i(3915936432128L, 29176);
    GMTrace.o(3915936432128L, 29176);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3916070649856L, 29177);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.vcq != null) {
        paramVarArgs.e(1, this.vcq);
      }
      paramVarArgs.ah(2, this.vcr);
      paramVarArgs.fk(3, this.vcs);
      paramVarArgs.fk(4, this.vct);
      GMTrace.o(3916070649856L, 29177);
      return 0;
    }
    if (paramInt == 1) {
      if (this.vcq == null) {
        break label387;
      }
    }
    label387:
    for (paramInt = b.a.a.b.b.a.f(1, this.vcq) + 0;; paramInt = 0)
    {
      int i = b.a.a.b.b.a.cK(2);
      int j = b.a.a.a.fh(3, this.vcs);
      int k = b.a.a.a.fh(4, this.vct);
      GMTrace.o(3916070649856L, 29177);
      return paramInt + (i + 1) + j + k;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3916070649856L, 29177);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        btq localbtq = (btq)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3916070649856L, 29177);
          return -1;
        case 1: 
          localbtq.vcq = locala.yqV.readString();
          GMTrace.o(3916070649856L, 29177);
          return 0;
        case 2: 
          localbtq.vcr = locala.csU();
          GMTrace.o(3916070649856L, 29177);
          return 0;
        case 3: 
          localbtq.vcs = locala.yqV.nj();
          GMTrace.o(3916070649856L, 29177);
          return 0;
        }
        localbtq.vct = locala.yqV.nj();
        GMTrace.o(3916070649856L, 29177);
        return 0;
      }
      GMTrace.o(3916070649856L, 29177);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\btq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */