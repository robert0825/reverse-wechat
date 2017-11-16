package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class avk
  extends com.tencent.mm.bm.a
{
  public String eDW;
  public boolean uKH;
  public int uKI;
  public String url;
  public int version;
  
  public avk()
  {
    GMTrace.i(15351555293184L, 114378);
    GMTrace.o(15351555293184L, 114378);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15351689510912L, 114379);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.ah(1, this.uKH);
      if (this.url != null) {
        paramVarArgs.e(2, this.url);
      }
      if (this.eDW != null) {
        paramVarArgs.e(3, this.eDW);
      }
      paramVarArgs.fk(4, this.version);
      paramVarArgs.fk(5, this.uKI);
      GMTrace.o(15351689510912L, 114379);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.b.b.a.cK(1) + 1 + 0;
      paramInt = i;
      if (this.url != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.url);
      }
      i = paramInt;
      if (this.eDW != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.eDW);
      }
      paramInt = b.a.a.a.fh(4, this.version);
      int j = b.a.a.a.fh(5, this.uKI);
      GMTrace.o(15351689510912L, 114379);
      return i + paramInt + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(15351689510912L, 114379);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      avk localavk = (avk)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(15351689510912L, 114379);
        return -1;
      case 1: 
        localavk.uKH = locala.csU();
        GMTrace.o(15351689510912L, 114379);
        return 0;
      case 2: 
        localavk.url = locala.yqV.readString();
        GMTrace.o(15351689510912L, 114379);
        return 0;
      case 3: 
        localavk.eDW = locala.yqV.readString();
        GMTrace.o(15351689510912L, 114379);
        return 0;
      case 4: 
        localavk.version = locala.yqV.nj();
        GMTrace.o(15351689510912L, 114379);
        return 0;
      }
      localavk.uKI = locala.yqV.nj();
      GMTrace.o(15351689510912L, 114379);
      return 0;
    }
    GMTrace.o(15351689510912L, 114379);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\avk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */