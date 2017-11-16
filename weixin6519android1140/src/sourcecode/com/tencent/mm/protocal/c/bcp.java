package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bcp
  extends ayx
{
  public String tVU;
  public int uPc;
  public int uPd;
  
  public bcp()
  {
    GMTrace.i(3845203689472L, 28649);
    GMTrace.o(3845203689472L, 28649);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3845337907200L, 28650);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tVU == null) {
        throw new b("Not all required fields were included: brand_user_name");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.tVU != null) {
        paramVarArgs.e(2, this.tVU);
      }
      paramVarArgs.fk(3, this.uPc);
      paramVarArgs.fk(4, this.uPd);
      GMTrace.o(3845337907200L, 28650);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt;
      if (this.tVU != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.tVU);
      }
      paramInt = b.a.a.a.fh(3, this.uPc);
      int j = b.a.a.a.fh(4, this.uPd);
      GMTrace.o(3845337907200L, 28650);
      return i + paramInt + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.tVU == null) {
        throw new b("Not all required fields were included: brand_user_name");
      }
      GMTrace.o(3845337907200L, 28650);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bcp localbcp = (bcp)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3845337907200L, 28650);
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
          localbcp.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3845337907200L, 28650);
        return 0;
      case 2: 
        localbcp.tVU = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3845337907200L, 28650);
        return 0;
      case 3: 
        localbcp.uPc = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3845337907200L, 28650);
        return 0;
      }
      localbcp.uPd = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3845337907200L, 28650);
      return 0;
    }
    GMTrace.o(3845337907200L, 28650);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bcp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */