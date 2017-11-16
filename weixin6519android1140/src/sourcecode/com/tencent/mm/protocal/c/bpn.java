package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bpn
  extends com.tencent.mm.bm.a
{
  public int jib;
  public int uZF;
  public int uZG;
  public int uZH;
  
  public bpn()
  {
    GMTrace.i(4043711709184L, 30128);
    GMTrace.o(4043711709184L, 30128);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4043845926912L, 30129);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.jib);
      paramVarArgs.fk(2, this.uZF);
      paramVarArgs.fk(3, this.uZG);
      paramVarArgs.fk(4, this.uZH);
      GMTrace.o(4043845926912L, 30129);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.jib);
      int i = b.a.a.a.fh(2, this.uZF);
      int j = b.a.a.a.fh(3, this.uZG);
      int k = b.a.a.a.fh(4, this.uZH);
      GMTrace.o(4043845926912L, 30129);
      return paramInt + 0 + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(4043845926912L, 30129);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bpn localbpn = (bpn)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(4043845926912L, 30129);
        return -1;
      case 1: 
        localbpn.jib = locala.yqV.nj();
        GMTrace.o(4043845926912L, 30129);
        return 0;
      case 2: 
        localbpn.uZF = locala.yqV.nj();
        GMTrace.o(4043845926912L, 30129);
        return 0;
      case 3: 
        localbpn.uZG = locala.yqV.nj();
        GMTrace.o(4043845926912L, 30129);
        return 0;
      }
      localbpn.uZH = locala.yqV.nj();
      GMTrace.o(4043845926912L, 30129);
      return 0;
    }
    GMTrace.o(4043845926912L, 30129);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bpn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */