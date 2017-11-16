package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bp
  extends com.tencent.mm.bm.a
{
  public int jib;
  public int tPL;
  public int tPM;
  public int tPN;
  public int tPO;
  
  public bp()
  {
    GMTrace.i(3686558334976L, 27467);
    GMTrace.o(3686558334976L, 27467);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3686692552704L, 27468);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tPL);
      paramVarArgs.fk(2, this.jib);
      paramVarArgs.fk(3, this.tPM);
      paramVarArgs.fk(4, this.tPN);
      paramVarArgs.fk(5, this.tPO);
      GMTrace.o(3686692552704L, 27468);
      return 0;
    }
    if (paramInt == 1)
    {
      paramInt = b.a.a.a.fh(1, this.tPL);
      int i = b.a.a.a.fh(2, this.jib);
      int j = b.a.a.a.fh(3, this.tPM);
      int k = b.a.a.a.fh(4, this.tPN);
      int m = b.a.a.a.fh(5, this.tPO);
      GMTrace.o(3686692552704L, 27468);
      return paramInt + 0 + i + j + k + m;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3686692552704L, 27468);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bp localbp = (bp)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3686692552704L, 27468);
        return -1;
      case 1: 
        localbp.tPL = locala.yqV.nj();
        GMTrace.o(3686692552704L, 27468);
        return 0;
      case 2: 
        localbp.jib = locala.yqV.nj();
        GMTrace.o(3686692552704L, 27468);
        return 0;
      case 3: 
        localbp.tPM = locala.yqV.nj();
        GMTrace.o(3686692552704L, 27468);
        return 0;
      case 4: 
        localbp.tPN = locala.yqV.nj();
        GMTrace.o(3686692552704L, 27468);
        return 0;
      }
      localbp.tPO = locala.yqV.nj();
      GMTrace.o(3686692552704L, 27468);
      return 0;
    }
    GMTrace.o(3686692552704L, 27468);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */