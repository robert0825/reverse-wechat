package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bhm
  extends com.tencent.mm.bm.a
{
  public int jhZ;
  public int uTr;
  public int uTs;
  public int uTt;
  public int uTu;
  public int uTv;
  public int uTw;
  public int uhM;
  
  public bhm()
  {
    GMTrace.i(3992037883904L, 29743);
    GMTrace.o(3992037883904L, 29743);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3992172101632L, 29744);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.jhZ);
      paramVarArgs.fk(2, this.uhM);
      paramVarArgs.fk(3, this.uTr);
      paramVarArgs.fk(4, this.uTs);
      paramVarArgs.fk(5, this.uTt);
      paramVarArgs.fk(6, this.uTu);
      paramVarArgs.fk(7, this.uTv);
      paramVarArgs.fk(8, this.uTw);
      GMTrace.o(3992172101632L, 29744);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.jhZ);
      int i = b.a.a.a.fh(2, this.uhM);
      int j = b.a.a.a.fh(3, this.uTr);
      int k = b.a.a.a.fh(4, this.uTs);
      int m = b.a.a.a.fh(5, this.uTt);
      int n = b.a.a.a.fh(6, this.uTu);
      int i1 = b.a.a.a.fh(7, this.uTv);
      int i2 = b.a.a.a.fh(8, this.uTw);
      GMTrace.o(3992172101632L, 29744);
      return paramInt + 0 + i + j + k + m + n + i1 + i2;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3992172101632L, 29744);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bhm localbhm = (bhm)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3992172101632L, 29744);
        return -1;
      case 1: 
        localbhm.jhZ = locala.yqV.nj();
        GMTrace.o(3992172101632L, 29744);
        return 0;
      case 2: 
        localbhm.uhM = locala.yqV.nj();
        GMTrace.o(3992172101632L, 29744);
        return 0;
      case 3: 
        localbhm.uTr = locala.yqV.nj();
        GMTrace.o(3992172101632L, 29744);
        return 0;
      case 4: 
        localbhm.uTs = locala.yqV.nj();
        GMTrace.o(3992172101632L, 29744);
        return 0;
      case 5: 
        localbhm.uTt = locala.yqV.nj();
        GMTrace.o(3992172101632L, 29744);
        return 0;
      case 6: 
        localbhm.uTu = locala.yqV.nj();
        GMTrace.o(3992172101632L, 29744);
        return 0;
      case 7: 
        localbhm.uTv = locala.yqV.nj();
        GMTrace.o(3992172101632L, 29744);
        return 0;
      }
      localbhm.uTw = locala.yqV.nj();
      GMTrace.o(3992172101632L, 29744);
      return 0;
    }
    GMTrace.o(3992172101632L, 29744);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bhm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */