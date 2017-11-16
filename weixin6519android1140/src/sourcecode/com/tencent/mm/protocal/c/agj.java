package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class agj
  extends com.tencent.mm.bm.a
{
  public String uvZ;
  public int uwa;
  public int uwb;
  
  public agj()
  {
    GMTrace.i(13339497332736L, 99387);
    GMTrace.o(13339497332736L, 99387);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13339631550464L, 99388);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uvZ != null) {
        paramVarArgs.e(1, this.uvZ);
      }
      paramVarArgs.fk(2, this.uwa);
      paramVarArgs.fk(3, this.uwb);
      GMTrace.o(13339631550464L, 99388);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uvZ == null) {
        break label333;
      }
    }
    label333:
    for (paramInt = b.a.a.b.b.a.f(1, this.uvZ) + 0;; paramInt = 0)
    {
      int i = b.a.a.a.fh(2, this.uwa);
      int j = b.a.a.a.fh(3, this.uwb);
      GMTrace.o(13339631550464L, 99388);
      return paramInt + i + j;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(13339631550464L, 99388);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        agj localagj = (agj)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(13339631550464L, 99388);
          return -1;
        case 1: 
          localagj.uvZ = locala.yqV.readString();
          GMTrace.o(13339631550464L, 99388);
          return 0;
        case 2: 
          localagj.uwa = locala.yqV.nj();
          GMTrace.o(13339631550464L, 99388);
          return 0;
        }
        localagj.uwb = locala.yqV.nj();
        GMTrace.o(13339631550464L, 99388);
        return 0;
      }
      GMTrace.o(13339631550464L, 99388);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\agj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */