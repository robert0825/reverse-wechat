package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bpp
  extends ayx
{
  public int uKq;
  public int uZL;
  public int uZM;
  public LinkedList<bps> uZN;
  public int uZO;
  public int uhU;
  public long uhV;
  
  public bpp()
  {
    GMTrace.i(4040758919168L, 30106);
    this.uZN = new LinkedList();
    GMTrace.o(4040758919168L, 30106);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4040893136896L, 30107);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.uhU);
      paramVarArgs.T(3, this.uhV);
      paramVarArgs.fk(4, this.uKq);
      paramVarArgs.fk(5, this.uZL);
      paramVarArgs.fk(6, this.uZM);
      paramVarArgs.d(7, 8, this.uZN);
      paramVarArgs.fk(8, this.uZO);
      GMTrace.o(4040893136896L, 30107);
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
      int j = b.a.a.a.S(3, this.uhV);
      int k = b.a.a.a.fh(4, this.uKq);
      int m = b.a.a.a.fh(5, this.uZL);
      int n = b.a.a.a.fh(6, this.uZM);
      int i1 = b.a.a.a.c(7, 8, this.uZN);
      int i2 = b.a.a.a.fh(8, this.uZO);
      GMTrace.o(4040893136896L, 30107);
      return paramInt + i + j + k + m + n + i1 + i2;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uZN.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(4040893136896L, 30107);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bpp localbpp = (bpp)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(4040893136896L, 30107);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbpp.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4040893136896L, 30107);
        return 0;
      case 2: 
        localbpp.uhU = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4040893136896L, 30107);
        return 0;
      case 3: 
        localbpp.uhV = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(4040893136896L, 30107);
        return 0;
      case 4: 
        localbpp.uKq = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4040893136896L, 30107);
        return 0;
      case 5: 
        localbpp.uZL = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4040893136896L, 30107);
        return 0;
      case 6: 
        localbpp.uZM = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4040893136896L, 30107);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bps();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bps)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbpp.uZN.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(4040893136896L, 30107);
        return 0;
      }
      localbpp.uZO = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(4040893136896L, 30107);
      return 0;
    }
    GMTrace.o(4040893136896L, 30107);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bpp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */