package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class azc
  extends com.tencent.mm.bm.a
{
  public int uNv;
  public String uNw;
  
  public azc()
  {
    GMTrace.i(3941169364992L, 29364);
    GMTrace.o(3941169364992L, 29364);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3941303582720L, 29365);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNw == null) {
        throw new b("Not all required fields were included: ResKey");
      }
      paramVarArgs.fk(1, this.uNv);
      if (this.uNw != null) {
        paramVarArgs.e(2, this.uNw);
      }
      GMTrace.o(3941303582720L, 29365);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.uNv) + 0;
      paramInt = i;
      if (this.uNw != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.uNw);
      }
      GMTrace.o(3941303582720L, 29365);
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
      if (this.uNw == null) {
        throw new b("Not all required fields were included: ResKey");
      }
      GMTrace.o(3941303582720L, 29365);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      azc localazc = (azc)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3941303582720L, 29365);
        return -1;
      case 1: 
        localazc.uNv = locala.yqV.nj();
        GMTrace.o(3941303582720L, 29365);
        return 0;
      }
      localazc.uNw = locala.yqV.readString();
      GMTrace.o(3941303582720L, 29365);
      return 0;
    }
    GMTrace.o(3941303582720L, 29365);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\azc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */