package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;
import java.util.LinkedList;

public final class bpx
  extends ayx
{
  public int uSE;
  public int uSF;
  public int uSG;
  public int uSH;
  public int uSI;
  public LinkedList<Integer> uSJ;
  public int uSK;
  public int uSL;
  public LinkedList<Integer> uSM;
  public int uSN;
  public int uSO;
  public int udE;
  public int uhU;
  
  public bpx()
  {
    GMTrace.i(3914862690304L, 29168);
    this.uSJ = new LinkedList();
    this.uSM = new LinkedList();
    GMTrace.o(3914862690304L, 29168);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3914996908032L, 29169);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.uhU);
      paramVarArgs.fk(3, this.uSE);
      paramVarArgs.fk(4, this.udE);
      paramVarArgs.fk(5, this.uSF);
      paramVarArgs.fk(6, this.uSG);
      paramVarArgs.fk(7, this.uSH);
      paramVarArgs.fk(8, this.uSI);
      paramVarArgs.c(9, this.uSJ);
      paramVarArgs.fk(10, this.uSK);
      paramVarArgs.fk(11, this.uSL);
      paramVarArgs.c(12, this.uSM);
      paramVarArgs.fk(13, this.uSN);
      paramVarArgs.fk(14, this.uSO);
      GMTrace.o(3914996908032L, 29169);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = b.a.a.a.fh(2, this.uhU);
      int j = b.a.a.a.fh(3, this.uSE);
      int k = b.a.a.a.fh(4, this.udE);
      int m = b.a.a.a.fh(5, this.uSF);
      int n = b.a.a.a.fh(6, this.uSG);
      int i1 = b.a.a.a.fh(7, this.uSH);
      int i2 = b.a.a.a.fh(8, this.uSI);
      int i3 = b.a.a.a.b(9, this.uSJ);
      int i4 = b.a.a.a.fh(10, this.uSK);
      int i5 = b.a.a.a.fh(11, this.uSL);
      int i6 = b.a.a.a.b(12, this.uSM);
      int i7 = b.a.a.a.fh(13, this.uSN);
      int i8 = b.a.a.a.fh(14, this.uSO);
      GMTrace.o(3914996908032L, 29169);
      return paramInt + i + j + k + m + n + i1 + i2 + i3 + i4 + i5 + i6 + i7 + i8;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uSJ.clear();
      this.uSM.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3914996908032L, 29169);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bpx localbpx = (bpx)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3914996908032L, 29169);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbpx.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3914996908032L, 29169);
        return 0;
      case 2: 
        localbpx.uhU = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3914996908032L, 29169);
        return 0;
      case 3: 
        localbpx.uSE = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3914996908032L, 29169);
        return 0;
      case 4: 
        localbpx.udE = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3914996908032L, 29169);
        return 0;
      case 5: 
        localbpx.uSF = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3914996908032L, 29169);
        return 0;
      case 6: 
        localbpx.uSG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3914996908032L, 29169);
        return 0;
      case 7: 
        localbpx.uSH = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3914996908032L, 29169);
        return 0;
      case 8: 
        localbpx.uSI = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3914996908032L, 29169);
        return 0;
      case 9: 
        localbpx.uSJ = new b.a.a.a.a(((b.a.a.a.a)localObject1).csV().tJp, unknownTagHandler).csS();
        GMTrace.o(3914996908032L, 29169);
        return 0;
      case 10: 
        localbpx.uSK = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3914996908032L, 29169);
        return 0;
      case 11: 
        localbpx.uSL = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3914996908032L, 29169);
        return 0;
      case 12: 
        localbpx.uSM = new b.a.a.a.a(((b.a.a.a.a)localObject1).csV().tJp, unknownTagHandler).csS();
        GMTrace.o(3914996908032L, 29169);
        return 0;
      case 13: 
        localbpx.uSN = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3914996908032L, 29169);
        return 0;
      }
      localbpx.uSO = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3914996908032L, 29169);
      return 0;
    }
    GMTrace.o(3914996908032L, 29169);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bpx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */