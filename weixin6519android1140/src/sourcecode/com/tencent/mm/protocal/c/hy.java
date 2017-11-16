package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;

public final class hy
  extends com.tencent.mm.bm.a
{
  public int port;
  public b tWV;
  public b tWW;
  public int type;
  
  public hy()
  {
    GMTrace.i(13579478630400L, 101175);
    GMTrace.o(13579478630400L, 101175);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13579612848128L, 101176);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.type);
      paramVarArgs.fk(2, this.port);
      if (this.tWV != null) {
        paramVarArgs.b(3, this.tWV);
      }
      if (this.tWW != null) {
        paramVarArgs.b(4, this.tWW);
      }
      GMTrace.o(13579612848128L, 101176);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.type) + 0 + b.a.a.a.fh(2, this.port);
      paramInt = i;
      if (this.tWV != null) {
        paramInt = i + b.a.a.a.a(3, this.tWV);
      }
      i = paramInt;
      if (this.tWW != null) {
        i = paramInt + b.a.a.a.a(4, this.tWW);
      }
      GMTrace.o(13579612848128L, 101176);
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
      GMTrace.o(13579612848128L, 101176);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      hy localhy = (hy)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(13579612848128L, 101176);
        return -1;
      case 1: 
        localhy.type = locala.yqV.nj();
        GMTrace.o(13579612848128L, 101176);
        return 0;
      case 2: 
        localhy.port = locala.yqV.nj();
        GMTrace.o(13579612848128L, 101176);
        return 0;
      case 3: 
        localhy.tWV = locala.csV();
        GMTrace.o(13579612848128L, 101176);
        return 0;
      }
      localhy.tWW = locala.csV();
      GMTrace.o(13579612848128L, 101176);
      return 0;
    }
    GMTrace.o(13579612848128L, 101176);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\hy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */